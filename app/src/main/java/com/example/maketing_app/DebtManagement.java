package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DebtManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debt_management);
        getSupportActionBar().setTitle("Debt Management");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}