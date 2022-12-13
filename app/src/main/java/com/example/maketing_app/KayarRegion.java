package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class KayarRegion extends AppCompatActivity {

    int lang_selected;

    Context context;
    Resources resources;

    TextView loikaw,loikawtxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayar_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loikaw=findViewById(R.id.loikaw);
        loikawtxt=findViewById(R.id.loikawtxt);

        if (LocaleHelper.getLanguage(KayarRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(KayarRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            loikaw.setText(resources.getString(R.string.loikaw));
            loikawtxt.setText(resources.getString(R.string.loikawtxt));
            setTitle(resources.getString(R.string.kayah));
            setString();


        } else if (LocaleHelper.getLanguage(KayarRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(KayarRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            loikaw.setText("မြန်မာ");
            setTitle(resources.getString(R.string.kayah));
            setString();
        }


    }
    void setString() {
        loikaw.setText(resources.getString(R.string.loikaw));
        loikawtxt.setText(resources.getString(R.string.loikawtxt));
    }
}