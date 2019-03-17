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
public class ExamBackupsEntry implements Serializable{
	private int temp_id;//主键自增1
	private int question_id;
	private int rightAnswer;
	private int currentAnswer;
	public int getTemp_id() {
		return temp_id;
	}
	public void setTemp_id(int temp_id) {
		this.temp_id = temp_id;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(int rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public int getCurrentAnswer() {
		return currentAnswer;
	}
	public void setCurrentAnswer(int currentAnswer) {
		this.currentAnswer = currentAnswer;
	}
	public ExamBackupsEntry(int temp_id, int question_id, int rightAnswer,
			int currentAnswer) {
		super();
		this.temp_id = temp_id;
		this.question_id = question_id;
		this.rightAnswer = rightAnswer;
		this.currentAnswer = currentAnswer;
	}
	public ExamBackupsEntry() {
		
	}
	
	public ContentValues getContentValuesByEntry(){
		ContentValues values=new ContentValues();
		values.put("question_id", question_id);
		values.put("rightAnswer", rightAnswer);
		values.put("currentAnswer", currentAnswer);
		return values;
	}
}
