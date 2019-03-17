/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesUtil {

	public static void write(Context context, String name,
			String key, String value) {
		SharedPreferences setting = context.getSharedPreferences(name,
				Context.MODE_APPEND);
		SharedPreferences.Editor ed = setting.edit();
		ed.putString(key, value);
		ed.commit();
	}

	public static String read(Context context, String name,
			String key, String defvalue) {
		SharedPreferences setting = context.getSharedPreferences(name,
				Context.MODE_APPEND);
		return setting.getString(key, defvalue);
	}
	
	public static void write(Context context, String name,
			String key, int value) {
		SharedPreferences setting = context.getSharedPreferences(name,
				Context.MODE_APPEND);
		SharedPreferences.Editor ed = setting.edit();
		ed.putInt(key, value);
		ed.commit();
	}

	public static int read(Context context, String name,
			String key, int defvalue) {
		SharedPreferences setting = context.getSharedPreferences(name,
				Context.MODE_APPEND);
		return setting.getInt(key, defvalue);
	}
}
