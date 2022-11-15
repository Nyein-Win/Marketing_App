package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BagoRegion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bago_region);
        getSupportActionBar().setTitle("ပဲခူးတိုင်းဒေသကြီး");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}