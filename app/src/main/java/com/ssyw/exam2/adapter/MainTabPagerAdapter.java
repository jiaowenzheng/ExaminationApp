/*
 *  http://www.appcodes.cn APP精品源码下载站声明：
 * 1、本站源码为网上搜集或网友提供，如果涉及或侵害到您的版 权，请立即通知我们。
 * 2、 本站提供免费代码只可供研究学习使用，切勿用于商业用途 由此引起一切后果与本站无关。
 * 3、 商业源码请在源码授权范围内进行使用。
 * 4、更多APP精品源码下载请访问:http://www.appcodes.cn。
 * 5、如有疑问请发信息至appcodes@qq.com。
 */
package com.ssyw.exam2.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ssyw.exam2.ClassicsListFragment;
import com.ssyw.exam2.ExamFragment;
import com.ssyw.exam2.MoreListFragment;
import com.ssyw.exam2.widget.IconPagerAdapter;

public class MainTabPagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
	private List<String> titles;
	private List<Integer> icons; 
	private static final int PAGE_EXAM=0;
	private static final int PAGE_CLASSICS=1;
	private static final int PAGE_MORE=2;
	public MainTabPagerAdapter(List<String> titles, List<Integer> icons,
			FragmentManager fm) {
		super(fm);
		this.titles = titles;
		this.icons = icons;	
	}

	public List<String> getTitles() {
		return titles;
	}
	
	public List<Integer> getIcons() {
		return icons;
	}

	@Override
	public int getIconResId(int index) {
		// TODO Auto-generated method stub
		return icons.get(index % icons.size());
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return titles.size();
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		Fragment fragment=null;
		switch(position){
		case PAGE_EXAM:
			fragment=new ExamFragment();
			break;
		case PAGE_CLASSICS:
			fragment=new ClassicsListFragment();
			break;
		case PAGE_MORE:
			fragment=new MoreListFragment();
			break;
		default:
			break;
		}
		return fragment;
	}
}
