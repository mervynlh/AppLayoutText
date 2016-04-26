package com.it.lili.applayouttext;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.it.lili.applayouttext.fragment.FragmentOne;
import com.it.lili.applayouttext.fragment.FragmentThree;
import com.it.lili.applayouttext.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitleTextColor(Color.WHITE);//设置toolbar标题颜色
        setSupportActionBar(mToolbar);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        MyViewPagerAdapter mViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        mViewPagerAdapter.addFragment(FragmentOne.newInstance(),"TabOne");//给viewPagerAdapter添加Fragment
        mViewPagerAdapter.addFragment(FragmentTwo.newInstance(),"TabTwo");
        mViewPagerAdapter.addFragment(FragmentThree.newInstance(),"TabThree");
        mViewPager.setAdapter(mViewPagerAdapter);

        TabLayout mTablayout = (TabLayout) findViewById(R.id.tabLayout);
        mTablayout.addTab(mTablayout.newTab().setText("TabOne"));//给TabLayout添加Tab
        mTablayout.addTab(mTablayout.newTab().setText("TabTwo"));//给TabLayout添加Tab
        mTablayout.addTab(mTablayout.newTab().setText("TabThree"));//给TabLayout添加Tab
        mTablayout.setupWithViewPager(mViewPager);
    }

}

