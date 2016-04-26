package com.it.lili.applayouttext;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/26 0026.
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments= new ArrayList<>();//添加fragment的集合
    private List<String> mfragmentTitles = new ArrayList<>();//添加fragment标题的集合


    public MyViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    /**
     * 添加fragment的方法
     * @param fragment
     * @param title
     */
    public void addFragment(Fragment fragment,String title){
        mFragments.add(fragment);
        mfragmentTitles.add(title);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmentTitles.get(position);
    }
}
