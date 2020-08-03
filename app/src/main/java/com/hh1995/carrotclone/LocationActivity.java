package com.hh1995.carrotclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }

    public void clickBtn(View view) {
        Intent intent=new Intent(LocationActivity.this,LocationSearchActivity.class);
        startActivity(intent);
        finish();
    }
}
