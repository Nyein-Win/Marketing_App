package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OnGoMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_go_method);
        getSupportActionBar().setTitle("Ongo မှပြန်လည်ပေးဆပ်ခြင်း");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}