package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Selection_Process extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_process);
        getSupportActionBar().setTitle("Selection Process");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}