package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FinancialManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_management);
        getSupportActionBar().setTitle("Financial Management");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}