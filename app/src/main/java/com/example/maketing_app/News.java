package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getSupportActionBar().setTitle("News");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}