package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class DigitalWallet extends AppCompatActivity {
    Context context;
    Resources resources;
    int lang_selected;
    TextView txt1,txt2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_wallet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.DW_txt1);
        txt2=findViewById(R.id.DW_txt2);
        if (LocaleHelper.getLanguage(DigitalWallet.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(DigitalWallet.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.F_DW));
            lang_selected=0;
            setString();

        } else if (LocaleHelper.getLanguage(DigitalWallet.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(DigitalWallet.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.F_DW));
            lang_selected=1;
            setString();
        }
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.DW_text1));
        txt2.setText(resources.getString(R.string.DW_text2));
    }
}