/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;

import android.view.Display;
import android.view.View;
import android.view.Window;

@SuppressLint({ "NewApi", "SdCardPath" })
@SuppressWarnings("deprecation")
public class WindowUtil {

	private Activity mActivity;
	public WindowUtil(Activity mActivity) {
		super();
		this.mActivity = mActivity;	
	}
	
	public Point getDefaultDisplaySize(){
		Display display = mActivity.getWindowManager().getDefaultDisplay();
		Point size = new Point();
		size.y=display.getHeight();
		size.x=display.getWidth();
		return size;
	}
	
	public View getWindowDecorView(){
		return mActivity.getWindow().getDecorView();
	}
	
	public Rect getWindowDecorViewVisibleDisplayFrame(){
		Rect frames = new Rect();
		getWindowDecorView().getWindowVisibleDisplayFrame(frames);
		return frames;
	}
	
	public int getStatusBarHeight(){
		Rect frame = new Rect();  
		mActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);  
		return frame.top; 
	}
	
	public int getTitleBarHeight(){
		int contentTop = mActivity.getWindow().findViewById(Window.ID_ANDROID_CONTENT).getTop();
		return contentTop - getStatusBarHeight(); 
	}
}
