package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Learning_Development extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_development);

        getSupportActionBar().setTitle("Learning & Development");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}