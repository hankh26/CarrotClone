package com.hh1995.carrotclone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SeachFragmentAdapter extends FragmentPagerAdapter {

    Fragment[] fragments=new Fragment[3];
    String[] tabTitles=new String[]{"중고거래","동네정보","사람"};

    public SeachFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0]=new SearchFragmentSecond();
        fragments[1]=new SearchFragmentVillage();
        fragments[2]=new SearchFragmentPerson();
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
