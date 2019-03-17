/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class StatisticsActivity extends TabActivity {
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
		setContentView(R.layout.activity_statistics);

		TabHost tabHost = getTabHost();
		
		LayoutInflater.from(this).inflate(R.layout.activity_statistics,
				tabHost.getTabContentView(), true);
		intent=new Intent(StatisticsActivity.this, StatisticsTopicTab.class);
		
		tabHost.addTab(tabHost.newTabSpec("tab1")
				.setIndicator(getString(R.string.statistics_topic))
				.setContent(intent));
		
		intent=new Intent(StatisticsActivity.this, StatisticsTestTab.class);
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator(getString(R.string.statistics_test))
				.setContent(intent));
	}
}
