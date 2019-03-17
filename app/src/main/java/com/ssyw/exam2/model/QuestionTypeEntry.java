/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.model;

import java.io.Serializable;

import android.content.ContentValues;

@SuppressWarnings("serial")
public class QuestionTypeEntry implements Serializable{
	private int _id;
	private String description="";
	public int get_id() {
		return _id;
	}
	public String getDescription() {
		return description;
	}
	

	public void set_id(int _id) {
		this._id = _id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public QuestionTypeEntry(String description) {
		super();
		this.description = description;
	}
	public QuestionTypeEntry() {
	
	}
	
	public ContentValues getContentValuesByEntry(){
		ContentValues values=new ContentValues();
		//values.put("_id", _id);
		values.put("description", description);
		return values;
	}
}
