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

import java.io.InputStream;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;

public class DBUtil {
	private Context context;
	private final int BUFFER_SIZE = 1024;
	// 保存的数据库文件名 与 DBHelper 统一
	private static final String DB_NAME ="data.db"; 
	private final String PACKAGE_NAME;// 包名
	private final String DB_PATH; // 在手机里存放数据库的位置

	public DBUtil(Context context) {
		this.context = context;
		PACKAGE_NAME = PackageUtil.getAppInfo(context).getAsString(
				"packageName");
		DB_PATH = "/data" + Environment.getDataDirectory().getAbsolutePath()
				+ "/" + PACKAGE_NAME + "/databases/"; // 在手机里存放数据库的位置
	}

	public void openDatabase() {
		File dir = new File(DB_PATH);
		if (!dir.exists()) {
			dir.mkdir();
		}
		File db_file = new File(DB_PATH, DB_NAME);
		if (!db_file.exists()) {
			AssetManager am = context.getAssets();
			try {
				InputStream is = am.open(DB_NAME);
				FileOutputStream fos = new FileOutputStream(db_file);
				byte[] buffer = new byte[BUFFER_SIZE];
				int count = 0;
				while ((count = is.read(buffer)) > 0) {
					fos.write(buffer, 0, count);
				}
				fos.close();
				is.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 欲导入的数据库
		}
	}
}
