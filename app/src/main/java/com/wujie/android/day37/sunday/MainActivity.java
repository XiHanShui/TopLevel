package com.wujie.android.day37.sunday;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.wujie.android.day37.sunday.adapter.FragmentAdapter;
import com.wujie.android.day37.sunday.fragment.Fragment1;
import com.wujie.android.day37.sunday.fragment.Fragment2;
import com.wujie.android.day37.sunday.fragment.Fragment3;
import com.wujie.android.day37.sunday.fragment.Fragment4;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private TabLayout tabLayout;
    private List<Fragment> list=new LinkedList<>();
    private FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        initAdapter();
        bindAdapter();
        initListener();

    }

    private void initListener() {
        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void bindAdapter() {
        vp.setAdapter(adapter);
    }

    private void initAdapter() {
        adapter=new FragmentAdapter(getSupportFragmentManager(),list);

    }

    private void initData() {
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());
        list.add(new Fragment4());
    }

    private void initView() {
         vp= (ViewPager) findViewById(R.id.vp);
        tabLayout= (TabLayout) findViewById(R.id.tl_title);
        tabLayout.addTab(tabLayout.newTab().setText("one"));
        tabLayout.addTab(tabLayout.newTab().setText("two"));
        tabLayout.addTab(tabLayout.newTab().setText("three"));
        tabLayout.addTab(tabLayout.newTab().setText("four"));
    }
}
