package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class KayinRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView phaan,phaantxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayin_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        phaan=findViewById(R.id.phaan);
        phaantxt=findViewById(R.id.phaantxt);

        if (LocaleHelper.getLanguage(KayinRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(KayinRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            phaan.setText(resources.getString(R.string.phaan));
            phaantxt.setText(resources.getString(R.string.phaantxt));
            setTitle(resources.getString(R.string.kayin));
            setString();


        } else if (LocaleHelper.getLanguage(KayinRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(KayinRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            phaan.setText("မြန်မာ");
            setTitle(resources.getString(R.string.kayin));
            setString();
        }


    }
    void setString() {
        phaan.setText(resources.getString(R.string.phaan));
        phaantxt.setText(resources.getString(R.string.phaantxt));
    }
}