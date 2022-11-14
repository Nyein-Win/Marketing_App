package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VacanciesCurrent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancies_current);
        getSupportActionBar().setTitle("Current Vacancies");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}