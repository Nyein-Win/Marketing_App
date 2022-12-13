package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class BagoRegion extends AppCompatActivity {

    int lang_selected;

    Context context;
    Resources resources;

    TextView bago1, daiku, gyobingauld, indagaw, waw, nyaunglebin, bago1txt, daikutxt, gyobingauldtxt, indagawtxt, wawtxt, nyaunglebintxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bago_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        bago1 = findViewById(R.id.bago);
        daiku = findViewById(R.id.daiku);
        gyobingauld = findViewById(R.id.gyobingauk);
        indagaw = findViewById(R.id.indagaw);
        waw = findViewById(R.id.waw);
        nyaunglebin = findViewById(R.id.nyaunglebin);


        bago1txt = findViewById(R.id.bagotxt);
        daikutxt = findViewById(R.id.daikutxt);
        gyobingauldtxt = findViewById(R.id.gyobingauktxt);
        indagawtxt = findViewById(R.id.indagawtxt);
        wawtxt = findViewById(R.id.wawtxt);
        nyaunglebintxt = findViewById(R.id.nyaunglebintxt);


        if (LocaleHelper.getLanguage(BagoRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(BagoRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            bago1.setText(resources.getString(R.string.mandalay));
            bago1txt.setText(resources.getString(R.string.mandalaytxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.bago));
            setString();


        } else if (LocaleHelper.getLanguage(BagoRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(BagoRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            bago1.setText("မြန်မာ");
            setTitle(resources.getString(R.string.bago));
            setString();
        }


    }


    void setString() {
        bago1.setText(resources.getString(R.string.bago1));
        daiku.setText(resources.getString(R.string.daiku));
        gyobingauld.setText(resources.getString(R.string.gyobingauk));
        indagaw.setText(resources.getString(R.string.indagaw));
        waw.setText(resources.getString(R.string.waw));
        nyaunglebin.setText(resources.getString(R.string.nyaunglebin));

        bago1txt.setText(resources.getString(R.string.bago1txt));
        daikutxt.setText(resources.getString(R.string.daikutxt));
        gyobingauldtxt.setText(resources.getString(R.string.gyobingauktxt));
        indagawtxt.setText(resources.getString(R.string.indagawtxt));
        wawtxt.setText(resources.getString(R.string.wawtxt));
        nyaunglebintxt.setText(resources.getString(R.string.nyaunglebintxt));
    }
}