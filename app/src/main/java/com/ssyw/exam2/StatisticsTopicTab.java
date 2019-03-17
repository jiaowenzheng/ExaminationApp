/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.ssyw.exam2.controller.StatisticsController;
import com.ssyw.exam2.widget.PieChartView;

public class StatisticsTopicTab extends Activity {
	private float data[];
	private StatisticsController statisticsController = new StatisticsController();
	private PieChartView pcv_statistics;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tap_statistics);
		
		pcv_statistics=(PieChartView) findViewById(R.id.pcv_statistics);
		pcv_statistics.setDataCount(5);
		pcv_statistics.setColor(new int[] { Color.YELLOW, Color.BLUE, Color.GRAY,
				Color.MAGENTA, Color.RED });
		data = new float[5];
		data[0] = statisticsController.getUndoQuestionNum(this);
		data[1] = statisticsController.getRightAlwaysQuestionNum(this);
		data[2] = statisticsController.getRightOftenQuestionNum(this);
		data[3] = statisticsController.getWrongAlwaysQuestionNum(this);
		data[4] = statisticsController.getWrongOftenQuestionNum(this);
		pcv_statistics.setData(data);
		pcv_statistics.setDataTitle(getResources().getStringArray(
				R.array.statistics_status));
	
		pcv_statistics.setPadding(15, 0, 15, 0);
	}
}
