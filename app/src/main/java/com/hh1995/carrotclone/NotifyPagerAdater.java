package com.hh1995.carrotclone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class NotifyPagerAdater extends FragmentPagerAdapter {

    Fragment[] fragments=new Fragment[2];
    String[] tabTitles=new String[]{"활동알림","키워드알림"};


    public NotifyPagerAdater(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0]=new NotifyActive();
        fragments[1]=new NotifyKeyword();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
