package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MagwayRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magway_region);
        getSupportActionBar().setTitle(" မကွေးတိုင်းဒေသကြီး");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}