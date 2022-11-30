package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WaveMoneyMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_money_method);

        getSupportActionBar().setTitle("Wave Money မှပြန်လည်ပေးဆပ်ခြင်း");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}