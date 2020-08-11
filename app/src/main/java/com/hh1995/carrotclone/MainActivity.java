package com.hh1995.carrotclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    Fragment[] fragments=new Fragment[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        fragments[0]=new FragmentHome();
        fragments[1]=new FragmentCategory();
        fragments[2]=new Fragmentwrite();
        fragments[3]=new Fragmentchat();
        fragments[4]=new FragmentMyCarrot();

        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.fragment,fragments[0]);
        transaction.commit();

        bottomNavigationView=findViewById(R.id.botNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction1=fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){
                    case R.id.menu_home:
                        transaction1.replace(R.id.fragment,fragments[0]);
                        break;
                    case R.id.menu_category:
                        transaction1.replace(R.id.fragment,fragments[1]);
                        break;
                    case R.id.menu_write:
                        transaction1.replace(R.id.fragment,fragments[2]);
                        break;
                    case R.id.menu_chat:
                        transaction1.replace(R.id.fragment,fragments[3]);
                        break;
                    case R.id.menu_myCarrot:
                        transaction1.replace(R.id.fragment,fragments[4]);
                        break;
                }
                transaction1.commit();
                return true;
            }
        });
    }


}
