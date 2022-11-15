package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecruitmentPolicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruitment_policity);
        getSupportActionBar().setTitle("Recruitment Policy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}