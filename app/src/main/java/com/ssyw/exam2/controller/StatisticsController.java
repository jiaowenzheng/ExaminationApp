/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.controller;

import com.ssyw.exam2.model.ExamResultService;
import com.ssyw.exam2.model.QuestionBankService;

import android.content.Context;


public class StatisticsController {
	private QuestionBankService questionBankService=new QuestionBankService();
	private ExamResultService examResultService=new ExamResultService();
	public int getUndoQuestionNum(Context context){
		return questionBankService.getUndoQuestionNum(context);
	}
	
	public int getRightAlwaysQuestionNum(Context context){
		return questionBankService.getRightAlwaysQuestionNum(context);
	}
	
	public int getWrongAlwaysQuestionNum(Context context){
		return questionBankService.getWrongAlwaysQuestionNum(context);
	}
	
	public int getWrongOftenQuestionNum(Context context){
		return questionBankService.getWrongOftenQuestionNum(context);
	}
	
	public int getRightOftenQuestionNum(Context context){
		return questionBankService.getRightOftenQuestionNum(context);
	}
	
	public int getBestScoreTimes(Context context){
		return examResultService.getBestScoreTimes(context);
	}
	
	public int getBetterScoreTimes(Context context){
		return examResultService.getBetterScoreTimes(context);
	}
	
	public int getJustSoSoScoreTimes(Context context){
		return examResultService.getJustSoSoScoreTimes(context);
	}
	
	public int getBadScoreTimes(Context context){
		return examResultService.getBadScoreTimes(context);
	}
	
	public int getWorseScoreTimes(Context context){
		return examResultService.getWorseScoreTimes(context);
	}
	
	public int getWorstScoreTimes(Context context){
		return examResultService.getWorstScoreTimes(context);
	}
	
	public int getTestTimes(Context context){
		return examResultService.getTestTimes(context);
	}
}
