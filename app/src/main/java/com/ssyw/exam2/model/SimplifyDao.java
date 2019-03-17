/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.model;

import java.util.ArrayList;
import java.util.Map;

import com.sj.dbtemplate.BaseDao;

import android.content.Context;

/**
 * BaseDao Simplified
 * 
 * @author sxenon
 */
public class SimplifyDao extends BaseDao {

	// EntryList Simplify
	protected ArrayList<Map<String, Object>> getMapList(Context context,
			String table) {
		return getMapList(context, table, null, false, null, null, null, null);
	}

	protected ArrayList<Map<String, Object>> getMapList(Context context,
			String table, String whereClause, String limit) {
		return getMapList(context, table, whereClause, false, null, null, null,
				limit);
	}

	protected ArrayList<Map<String, Object>> getMapList(Context context,
			String table, String whereClause) {
		return getMapList(context, table, whereClause, false, null, null, null,
				null);
	}

	// Map,List Simplify
	protected ArrayList<Integer> getIntegerList(Context context, String table,
			String showColumn) {
		return getIntegerList(context, table, showColumn, false, null, null,
				null, null, null);
	}

	protected ArrayList<Integer> getIntegerList(Context context, String table,
			String showColumn, String whereClause) {
		return getIntegerList(context, table, showColumn, false, whereClause,
				null, null, null, null);
	}

	protected ArrayList<Float> getFloatList(Context context, String table,
			String showColumn) {
		return getFloatList(context, table, showColumn, false, null, null,
				null, null, null);
	}

	protected ArrayList<Float> getFloatList(Context context, String table,
			String showColumn, String whereClause) {
		return getFloatList(context, table, showColumn, false, whereClause,
				null, null, null, null);
	}

	protected ArrayList<String> getStringList(Context context, String table,
			String showColumn) {
		return getStringList(context, table, showColumn, false, null, null,
				null, null, null);
	}

	protected ArrayList<String> getStringList(Context context, String table,
			String showColumn, String whereClause) {
		return getStringList(context, table, showColumn, false, whereClause,
				null, null, null, null);
	}

	protected ArrayList<byte[]> getBlobList(Context context, String table,
			String showColumn) {
		return getBlobList(context, table, showColumn, false, null, null, null,
				null, null);
	}

	protected ArrayList<byte[]> getBlobList(Context context, String table,
			String showColumn, String whereClause) {
		return getBlobList(context, table, showColumn, false, whereClause,
				null, null, null, null);
	}

	protected Map<String, Object> getMap(Context context, String table,
			String whereClause) {
		return getMap(context, table, whereClause, false, null, null, null,
				null);
	}
	protected Map<String, Object> getMap(Context context, String table,
			String whereClause,String orderBy,String limit) {
		return getMap(context, table, whereClause, false, null, null, orderBy, limit);
	}
}
