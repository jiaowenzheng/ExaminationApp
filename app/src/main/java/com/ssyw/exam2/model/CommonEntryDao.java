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

import android.content.ContentValues;
import android.content.Context;
/**
 * @author sxenon
 * Entry类的通用Dao方法 
 * 目前所有Entry类的Dao层代码出了表名之外都是一样的，所以干脆统一一下
 * 不可以直接使用,由Service类继承它
 */
public abstract class CommonEntryDao extends SimplifyDao {
	private static final String SUFFIX="Service";
	private final String tableName =getTableName();

	// EntryList
	public ArrayList<Map<String, Object>> getEntryList(Context context) {
		
		return super.getMapList(context, tableName);
	}

	public ArrayList<Map<String, Object>> getEntryList(Context context,
			String whereClause) {
		return super.getMapList(context, tableName, whereClause);
	}

	public ArrayList<Map<String, Object>> getEntryList(Context context,
			String whereClause, String limit) {
		return super.getMapList(context, tableName, whereClause, limit);
	}

	// List(String,Integer,Blob,Float)
	protected ArrayList<Integer> getIntegerList(Context context,
			String showColumn) {
		return super.getIntegerList(context, tableName, showColumn);
	}

	protected ArrayList<Integer> getIntegerList(Context context,
			String showColumn, String whereClause) {
		return super.getIntegerList(context, tableName, showColumn, whereClause);
	}

	protected ArrayList<Float> getFloatList(Context context, String showColumn,
			String whereClause) {
		return super.getFloatList(context, tableName, showColumn, whereClause);
	}

	protected ArrayList<Float> getFloatList(Context context, String showColumn) {
		return super.getFloatList(context, tableName, showColumn);
	}

	protected ArrayList<String> getStringList(Context context, String showColumn) {
		return super.getStringList(context, tableName, showColumn);
	}

	protected ArrayList<String> getStringList(Context context,
			String showColumn, String whereClause) {
		return super.getStringList(context, tableName, showColumn, whereClause);
	}

	// Entry
	protected Map<String, Object> getEntry(Context context, String whereValues) {
		return super.getMap(context, tableName, whereValues);
	}

	// add,update,delete
	public boolean add(Context context, ContentValues values) {
		return super.add(context, tableName, values);
	}

	public boolean update(Context context, ContentValues setValues,
			String whereClause) {
		return super.update(context, tableName, setValues, whereClause);
	}

	public boolean delete(Context context, String whereClause) {
		return super.delete(context, tableName, whereClause);
	}
	
	private String getTableName(){
		String className=getClass().getSimpleName();
		int indexOfSuffix=className.indexOf(SUFFIX);
		return className.substring(0, indexOfSuffix);
	}
}
