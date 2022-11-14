package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MonRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_region);
        getSupportActionBar().setTitle(" မွန်ပြည်နယ်");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}