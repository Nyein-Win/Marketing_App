package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KayarRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayar_region);
        getSupportActionBar().setTitle(" ကယားပြည်နယ်");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}