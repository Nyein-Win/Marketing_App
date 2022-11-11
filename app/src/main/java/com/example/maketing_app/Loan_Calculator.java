package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Loan_Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);
        getSupportActionBar().setTitle("Loan Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}