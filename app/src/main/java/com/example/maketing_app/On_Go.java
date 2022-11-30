package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class On_Go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_go);
        getSupportActionBar().setTitle("Ongo မှပြန်လည်ပေးဆပ်ခြင်း");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}