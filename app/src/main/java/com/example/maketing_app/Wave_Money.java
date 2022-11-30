package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Wave_Money extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_money);
        getSupportActionBar().setTitle("Wave Money မှပြန်လည်ပေးဆပ်ခြင်း");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}