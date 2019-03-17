/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

public class UiUtil {

	public static void showAlertOnly(Context context, int messageId,
			int textId, int titleId) {
		new AlertDialog.Builder(context).setMessage(messageId)
				.setTitle(titleId).setPositiveButton(textId, null).show();
	}

	public static void showQueryAlert(Context context, int messageId,
			int textPositiveId, int textNegativeId, int titleId,
			OnClickListener onPositiveClickListener,
			OnClickListener onNegativeClickListener) {
		new AlertDialog.Builder(context).setMessage(messageId)
				.setTitle(titleId)
				.setPositiveButton(textPositiveId, onPositiveClickListener)
				.setNegativeButton(textNegativeId, onNegativeClickListener)
				.show();
	}

	public static void showToastLong(Context context, String str) {
		Toast.makeText(context, str, Toast.LENGTH_LONG).show();
	}

	public static void showToastShort(Context context, String str) {
		Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
	}

	public static void showToastLong(Context context, int resId) {
		Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
	}

	public static void showToastShort(Context context, int resId) {
		// TODO Auto-generated method stub
		Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
	}
}
