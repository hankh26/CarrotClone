package com.hh1995.carrotclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class LocationSearchActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> datas=new ArrayList<>();
    ArrayAdapter adapter;

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_search);
        listView=findViewById(R.id.LSList);
        adapter=new ArrayAdapter(this,R.layout.loaction_list,datas);

        et=findViewById(R.id.LSEt);
        String address=et.getText().toString();
    }
}
