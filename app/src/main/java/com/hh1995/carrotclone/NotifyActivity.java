package com.hh1995.carrotclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class NotifyActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    NotifyPagerAdater notifyPagerAdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);

        tabLayout=findViewById(R.id.notifyTablayout);
        viewPager=findViewById(R.id.notifyViewPager);
        notifyPagerAdater=new NotifyPagerAdater(getSupportFragmentManager());
        viewPager.setAdapter(notifyPagerAdater);
        tabLayout.setupWithViewPager(viewPager);

    }
}
