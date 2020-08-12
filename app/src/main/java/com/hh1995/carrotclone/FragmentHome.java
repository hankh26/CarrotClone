package com.hh1995.carrotclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    Spinner spinner;
    ArrayAdapter spinnerAdapter;

    TabLayout tabLayout;
    ViewPager viewPager;
    HomeFragmentAdapter homeFragmentAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        Toolbar toolbar=view.findViewById(R.id.toolbar);
        AppCompatActivity appCompatActivity=(AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbar);
        appCompatActivity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        setHasOptionsMenu(true);

        spinner=view.findViewById(R.id.spinner);
        spinnerAdapter= ArrayAdapter.createFromResource(getContext(), R.array.location,R.layout.spinner_selected);
        spinner.setAdapter(spinnerAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        break;
                    case 1:
//                        Intent intent=new Intent(getContext(),AddLocationActivity.class);
//                        startActivity(intent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        viewPager=view.findViewById(R.id.viewPager);
        homeFragmentAdapter=new HomeFragmentAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(homeFragmentAdapter);

        tabLayout=view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);



        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        getActivity().getMenuInflater().inflate(R.menu.menu_option_home,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_search:
                Intent intent=new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.menu_fav:
                Intent intent2=new Intent(getContext(), OptionActivity.class);
                startActivity(intent2);
                break;
            case R.id.menu_noti:
                Intent intent3=new Intent(getContext(), NotifyActivity.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
