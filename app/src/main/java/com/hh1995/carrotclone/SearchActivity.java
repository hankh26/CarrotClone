package com.hh1995.carrotclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class SearchActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    SeachFragmentAdapter seachFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        viewPager=findViewById(R.id.searchViewPager);
        tabLayout=findViewById(R.id.searchTablayout);
        seachFragmentAdapter=new SeachFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(seachFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
