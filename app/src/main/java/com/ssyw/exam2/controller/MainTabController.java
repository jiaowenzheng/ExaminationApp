/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.ssyw.exam2.R;
import com.ssyw.exam2.adapter.MainTabPagerAdapter;
import com.ssyw.exam2.model.QuestionBankService;

public class MainTabController {
	private Context context;
	private QuestionBankService questionBankService;
	public MainTabController(Context context) {
		super();
		this.context = context;
		questionBankService=new QuestionBankService();
	}

	public MainTabPagerAdapter getPagerAdapter(FragmentManager fm){
		
		List<Integer> icons=new ArrayList<Integer>();
		List<String> titles=new ArrayList<String>();
		
		icons.add(R.drawable.tab_group_exam);
		icons.add(R.drawable.tab_group_classics);
		icons.add(R.drawable.tab_group_more);
		
		String[] main_title=context.getResources().getStringArray(R.array.main_title);
		for(int i=0;i<main_title.length;i++){
			titles.add(main_title[i]);
		}
		
		return new MainTabPagerAdapter(titles, icons,fm);
	}
	
	public boolean checkWrongDataExist(){
		ArrayList<Map<String, Object>> wrongDataList=questionBankService.getErrorEntryList(context);
		return !wrongDataList.isEmpty();
	}
	
	public boolean checkCollectedDataExist(){
		ArrayList<Map<String, Object>> collectDataList=questionBankService.getCollectedEntryList(context);
		return !collectDataList.isEmpty();
	}
	
	public ArrayList<Map<String,Object>> getClassicsEntryList(){
		return questionBankService.getClassicsEntryList(context);
	}
}
