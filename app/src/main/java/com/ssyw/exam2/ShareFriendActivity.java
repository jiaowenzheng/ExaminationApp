/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2;

import com.ssyw.exam2.util.FileUtil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

public class ShareFriendActivity extends BaseActivity {
	private ImageView iv_share_shot;	
	private FileUtil fu;
	private TextView tv_title;
	Bitmap bm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_share_friend);

		tv_title=(TextView) findViewById(R.id.tv_title);
		tv_title.setText(getResources().getString(R.string.share_friend));
		
		iv_share_shot = (ImageView) findViewById(R.id.iv_share_shot);

		/*
		 * 如果截屏产生的图片太大，则无法通过Intent传递，会产生FAILED BINDER TRANSACTION 
		 */
		fu=new FileUtil(this);
		String pic_path=fu.getPic_path();
		BitmapFactory.Options options = new BitmapFactory.Options();   
		options.inSampleSize = 2;
		bm = BitmapFactory.decodeFile(pic_path, options);
		iv_share_shot.setImageBitmap(bm);
		
	}
	
	@Override
	protected void onDestroy() {
		if(!bm.isRecycled()){
			bm.recycle();
		}	
		super.onDestroy();
	}
	
	
	
}
