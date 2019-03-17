/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.adapter;

import java.util.ArrayList;
import java.util.Map;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ssyw.exam2.TopicFragment;
import com.ssyw.exam2.controller.TopicController;

public class TopicPagerAdapter extends FragmentPagerAdapter {
	private ArrayList<Map<String, Object>> dataList;

	public TopicPagerAdapter(FragmentManager fm,
			TopicController topicController,
			TopicFragmentCallBacks topicFragmentCallBacks) {
		super(fm);
		TopicFragment.setController(topicController);
		dataList = topicController.getTopicList();
		TopicFragment.setCallBack(topicFragmentCallBacks);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dataList.size();
	}

	@Override
	public Fragment getItem(int position) {
		return new TopicFragment(position);
	}
}
