/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.ssyw.exam2.R;
import com.ssyw.exam2.model.ExamResultEntry;
import com.ssyw.exam2.model.ExamResultService;

public class DetailsRecordActivity extends BaseActivity {
	TextView tv_title;
	TextView detail_date;// 日期
	TextView detail_usetime;// 用时
	TextView detail_sum_answer_right;// 答对题目数量
	TextView detail_sum_anserquestion;// 答题数量
	TextView detail_sum_answer_error;// 答错题目数量
	TextView detail_accuracy;// 正确率
	TextView detail_score;// 成绩
	ExamResultEntry entry;
	ExamResultService examResultService;

	// 删除按钮
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
		examResultService = new ExamResultService();
		setContentView(R.layout.activity_detail_record);

		switch (this.getIntent().getExtras().getInt("MODE")) {
		case 1: {
			entry = examResultService.getThisTestScore(DetailsRecordActivity.this);
			break;
		}
		case 2: {
			entry = (ExamResultEntry) getIntent().getSerializableExtra(
					"examResult");
			break;
		}
		}
		tv_title = (TextView) findViewById(R.id.tv_title);
		detail_date = (TextView) findViewById(R.id.detail_date);
		detail_usetime = (TextView) findViewById(R.id.detail_usetime);
		detail_sum_answer_right = (TextView) findViewById(R.id.detail_sum_answer_right);
		detail_sum_answer_error = (TextView) findViewById(R.id.detail_sum_answer_error);
		detail_sum_anserquestion = (TextView) findViewById(R.id.detail_sum_anserquestion);
		detail_accuracy = (TextView) findViewById(R.id.detail_accuracy);
		detail_score = (TextView) findViewById(R.id.detail_score);
		if (this.getIntent().getExtras().getInt("MODE") == 1) {
			tv_title.setText(getResources()
					.getString(R.string.detail_this_exam));
		} else {
			tv_title.setText(getResources().getString(
					R.string.detail_this_record));
		}
		detail_date.setText(entry.getDateTime());
		detail_usetime.setText(entry.getUseTime());
		detail_sum_answer_right.setText(getResources().getString(
				R.string.detail_total)
				+ entry.getRightCount()
				+ getResources().getString(R.string.detail_answer));
		detail_sum_answer_error.setText(getResources().getString(
				R.string.detail_total)
				+ entry.getWrongCount()
				+ getResources().getString(R.string.detail_answer));
		detail_sum_anserquestion.setText(getResources().getString(
				R.string.detail_total)
				+ entry.getTotalCount()
				+ getResources().getString(R.string.detail_answer));
		detail_accuracy.setText(""
				+ (int) (100 * (float) entry.getRightCount() / (float) entry
						.getTotalCount())
				+ getResources().getString(R.string.detail_qw));
		detail_score.setText(entry.getTotalScore()
				+ getResources().getString(R.string.detail_point));
	}

	public void deleteRecord(View view) {
		Intent intent = null;
		examResultService
		.delete(DetailsRecordActivity.this, entry.get_id());
		switch (this.getIntent().getExtras().getInt("MODE")) {
		case 1: {
			intent = new Intent(DetailsRecordActivity.this,
					MainTabActivity.class);
			break;
		}
		case 2: {
			intent = new Intent(DetailsRecordActivity.this,
					RecordActivity.class);
			break;
		}
		default:
			break;
		}
		startActivity(intent);
		finish();
	}
}
