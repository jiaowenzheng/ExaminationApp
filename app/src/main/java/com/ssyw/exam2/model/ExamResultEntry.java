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

/**
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class ExamResultEntry implements Serializable {

	private int _id;
	private int totalScore;
	private int rightCount;
	private int wrongCount;
	private int totalCount;
	private String dateTime;
	private String useTime;

	public ContentValues getContentValueByEntry() {
		ContentValues values = new ContentValues();
		// values.put("_id", _id);
		values.put("totalScore", totalScore);
		values.put("rightCount", rightCount);
		values.put("wrongCount", wrongCount);
		values.put("totalCount", totalCount);
		values.put("dateTime", dateTime);
		values.put("useTime", useTime);
		return values;
	}

	public ExamResultEntry(int totalScore, int rightCount, int wrongCount,
			int totalCount, String dateTime, String useTime) {
		super();
		// TODO Auto-generated constructor stub
		this.totalScore = totalScore;
		this.rightCount = rightCount;
		this.wrongCount = wrongCount;
		this.totalCount = totalCount;
		this.dateTime = dateTime;
		this.useTime = useTime;
	}

	public ExamResultEntry(int _id, int totalScore, int rightCount,
			int wrongCount, int totalCount, String dateTime, String useTime) {
		super();
		// TODO Auto-generated constructor stub
		this._id = _id;
		this.totalScore = totalScore;
		this.rightCount = rightCount;
		this.wrongCount = wrongCount;
		this.totalCount = totalCount;
		this.dateTime = dateTime;
		this.useTime = useTime;
	}

	public ExamResultEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getRightCount() {
		return rightCount;
	}

	public void setRightCount(int rightCount) {
		this.rightCount = rightCount;
	}

	public int getWrongCount() {
		return wrongCount;
	}

	public void setWrongCount(int wrongCount) {
		this.wrongCount = wrongCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

}
