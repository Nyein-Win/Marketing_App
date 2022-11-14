package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DigitalWallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_wallet);
        getSupportActionBar().setTitle("Digital Wallet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}