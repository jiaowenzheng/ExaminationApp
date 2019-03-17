/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2;


import com.ssyw.exam2.controller.WelcomeController;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;

import android.content.Intent;
import android.view.WindowManager;
import android.widget.ImageView;


public class WelcomeActivity extends BaseActivity {
	private WelcomeController wc=new WelcomeController();
	private Handler mHandler = new Handler();
	private ImageView iv_welcome;
	
	private int alpha = 255;
	private int b = 0;
	@SuppressLint("HandlerLeak")
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//FullScreen
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_welcome);
		
		wc.init(this);
		iv_welcome=(ImageView) findViewById(R.id.iv_welcome);
		iv_welcome.setAlpha(alpha);
		new Thread(new Runnable() {
			public void run() {
				while (b < 2) {
					try {
						if (b == 0) {
							Thread.sleep(500);
							b = 1;
						} else {
							Thread.sleep(100);
						}

						updateApp();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();

		mHandler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				iv_welcome.setAlpha(alpha);
				iv_welcome.invalidate();
			}
		};

	}

	public void updateApp() {
		alpha -= 11;
		//避免出现白屏
		if (alpha <= 30) {
			b = 2;
			Intent intent = new Intent(WelcomeActivity.this,MainTabActivity.class);
			startActivity(intent);
			this.finish();
			//查询需要很多内存开销，提前回收一些
			System.gc(); 
		}

		mHandler.sendMessage(mHandler.obtainMessage());
	}

	
}
