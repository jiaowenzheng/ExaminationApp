/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2;

import com.ssyw.exam2.controller.StatisticsController;

import com.ssyw.exam2.widget.PieChartView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StatisticsTestTab extends Activity {
	private float[] data;
	private StatisticsController statisticsController = new StatisticsController();
	private PieChartView pcv_statistics;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tap_statistics);

		pcv_statistics = (PieChartView) findViewById(R.id.pcv_statistics);
		if(statisticsController.getTestTimes(this)>0){
			pcv_statistics.setDataCount(6);
			pcv_statistics.setColor(new int[] { Color.YELLOW, Color.BLUE,
					Color.GRAY, Color.MAGENTA, Color.RED, Color.CYAN });
			data = new float[6];
			data[0] = statisticsController.getBestScoreTimes(this);
			data[1] = statisticsController.getBetterScoreTimes(this);
			data[2] = statisticsController.getJustSoSoScoreTimes(this);
			data[3] = statisticsController.getBadScoreTimes(this);
			data[4] = statisticsController.getWorseScoreTimes(this);
			data[5] = statisticsController.getWorstScoreTimes(this);
			pcv_statistics.setData(data);
			pcv_statistics.setDataTitle(getResources().getStringArray(
					R.array.statistics_test_rate));
			
			pcv_statistics.setPadding(15, 0, 15, 0);
		}else{
			TextView tvZeroTest=new TextView(this);
			tvZeroTest.setText(R.string.statistics_zero_test);
			tvZeroTest.setTextSize(20);
			LinearLayout ll_statistics=(LinearLayout) findViewById(R.id.ll_statistics);
			ll_statistics.removeAllViews();
			ll_statistics.addView(tvZeroTest);
		}
		
	}
}
