package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoanSavingService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_saving_service);
        getSupportActionBar().setTitle("Loan,Saving,Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}