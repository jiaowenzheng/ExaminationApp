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
/**
 * 
 * @author sxenon
 * 按照目前的写法，貌似说get方法没都没什么用，其他也就add时有用，待观察吧
 */
public class QuestionBankEntry implements Serializable {
	private int _id; //主键 自增 1
	private int type;
	private int classId;
	private int subClassId;
	private int difficult;
	private String question="";
	private String opt1="";
	private String opt2="";
	private String opt3="";
	private String opt4="";
	private String answer="";
	private String explain="";
	private int answeredTime;
	private int rightTime;
	private int wrongTime;
	private int collectedFlag;
	private int inWrongFlag;
	public int get_id() {
		return _id;
	}

	public int getType() {
		return type;
	}
	
	public int getClassId() {
		return classId;
	}
	
	public int getSubClassId() {
		return subClassId;
	}
	
	public int getDifficult() {
		return difficult;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getOpt1() {
		return opt1;
	}
	
	public String getOpt2() {
		return opt2;
	}
	
	public String getOpt3() {
		return opt3;
	}
	
	public String getOpt4() {
		return opt4;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getExplain() {
		return explain;
	}
	
	public int getAnsweredTime() {
		return answeredTime;
	}
	
	public int getRightTime() {
		return rightTime;
	}
	
	public int getWrongTime() {
		return wrongTime;
	}
	
	public int getCollectedFlag() {
		return collectedFlag;
	}
	
	
	public void set_id(int _id) {
		this._id = _id;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public void setSubClassId(int subClassId) {
		this.subClassId = subClassId;
	}

	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public void setAnsweredTime(int answeredTime) {
		this.answeredTime = answeredTime;
	}

	public void setRightTime(int rightTime) {
		this.rightTime = rightTime;
	}

	public void setWrongTime(int wrongTime) {
		this.wrongTime = wrongTime;
	}

	public void setCollectedFlag(int collectedFlag) {
		this.collectedFlag = collectedFlag;
	}

	
	public int getInWrongFlag() {
		return inWrongFlag;
	}

	public void setInWrongFlag(int inWrongFlag) {
		this.inWrongFlag = inWrongFlag;
	}

	public QuestionBankEntry(int type, int classId, int subClassId,
			int difficult, String question, String opt1, String opt2,
			String opt3, String opt4, String answer, String explain,
			int answeredTime, int rightTime, int wrongTime, int collectedFlag,
			int inWrongFlag) {
		super();
		this.type = type;
		this.classId = classId;
		this.subClassId = subClassId;
		this.difficult = difficult;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.answer = answer;
		this.explain = explain;
		this.answeredTime = answeredTime;
		this.rightTime = rightTime;
		this.wrongTime = wrongTime;
		this.collectedFlag = collectedFlag;
		this.inWrongFlag = inWrongFlag;
	}

	public QuestionBankEntry() {
		
	}
	
	public ContentValues getContentValuesByEntry(){
		ContentValues values=new ContentValues();
		//values.put("_id", _id);
		values.put("type", type);
		values.put("classId", classId);
		values.put("subClassId", subClassId);
		values.put("difficult", difficult);
		values.put("question", question);
		values.put("opt1", opt1);
		values.put("opt2", opt2);
		values.put("opt3", opt3);
		values.put("opt4", opt4);
		values.put("answer", answer);
		values.put("explain", explain);
		values.put("answeredTime", answeredTime);
		values.put("rightTime", rightTime);
		values.put("wrongTime", wrongTime);
		values.put("collectedFlag", collectedFlag);
		values.put("inWrongFlag", inWrongFlag);
		return values;
	}
}
