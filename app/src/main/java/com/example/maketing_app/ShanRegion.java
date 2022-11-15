package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShanRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan_region);
        getSupportActionBar().setTitle("ရှမ်းပြည်နယ်");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}