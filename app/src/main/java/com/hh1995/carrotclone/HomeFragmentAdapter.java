package com.hh1995.carrotclone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentAdapter extends FragmentPagerAdapter {

    Fragment[] fragments=new Fragment[2];
    String[] tabTitles=new String[]{"중고거래", "동네생활"};

    public HomeFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0]=new HomeFragmentSecondhand();
        fragments[1]=new HomeFragmentVillage();
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
