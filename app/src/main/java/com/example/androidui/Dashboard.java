package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }



    public void vlocitybtn(View view) {
    }


    public void distancebtn(View view) {
    }


    public void aboutbtn(View view) {
        Intent intent = new Intent(Dashboard.this, AboutActivity.class);
        startActivity(intent);
    }

    public void exitbtn(View view) {
    }
}
