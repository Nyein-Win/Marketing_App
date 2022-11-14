package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MandalayRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandalay_region);
        getSupportActionBar().setTitle("မန္တလေးတိုင်းဒေသကြီး");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}