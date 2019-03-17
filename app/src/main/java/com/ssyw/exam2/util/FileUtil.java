/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.util;

import java.io.File;
import java.io.FileOutputStream;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

@SuppressLint("SdCardPath")
public class FileUtil {
	private String pic_path;
	private Activity mActivity;
	private WindowUtil wu;
	private static final String FILE_PREFERENCES_NAME = "file_path";

	public String getPic_path() {
		return SharedPreferencesUtil.read(mActivity, FILE_PREFERENCES_NAME,
				"Pic_Path", "");
	}

	public void setPic_path() {
		pic_path = "/data/data/"
				+ PackageUtil.getAppInfo(this.mActivity).getAsString(
						"packageName") + "/image.png";
		SharedPreferencesUtil.write(mActivity, FILE_PREFERENCES_NAME,
				"Pic_Path", pic_path);
	}

	public FileUtil(Activity mActivity) {
		this.mActivity = mActivity;

		wu = new WindowUtil(this.mActivity);
	}

	/**
	 * 
	 * @param file_path
	 * @param x
	 *            The x coordinate of the first pixel in source
	 * @param y
	 *            The y coordinate of the first pixel in source
	 * @param width
	 *            The number of pixels in each row
	 * @param height
	 *            The number of rows
	 * @return
	 */
	public Bitmap shotAndSave(String file_path, int x, int y, int width,
			int height) {
		View decorView = wu.getWindowDecorView();
		decorView.buildDrawingCache();
		Bitmap bmp = Bitmap.createBitmap(decorView.getDrawingCache(), x, y,
				width, height);
		File file = new File(file_path);
		try {
			FileOutputStream out = new FileOutputStream(file);
			if (bmp.compress(Bitmap.CompressFormat.PNG, 70, out)) {
				out.flush();
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bmp;
	}

	public Bitmap shotAndSave(String file_path) {
		Rect frames = wu.getWindowDecorViewVisibleDisplayFrame();
		int statusBarHeight = frames.top;
		Point size = wu.getDefaultDisplaySize();
		return this.shotAndSave(file_path, 0, statusBarHeight, size.x, size.y
				- statusBarHeight);

	}
}
