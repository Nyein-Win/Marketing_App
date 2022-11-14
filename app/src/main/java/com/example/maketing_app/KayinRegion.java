package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KayinRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayin_region);
        getSupportActionBar().setTitle(" ကရင်ပြည်နယ်");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}