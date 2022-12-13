package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class AyeyarwadiRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView pathein, myaungmya, hinthada, pyapon, maaubin, yegyi, pandanaw, myanaung, patheintxt, myaungmyatxt, hinthadatxt, pyapontxt, maaubintxt, yegyitxt, pandanawtxt, myanaungtxt;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayeyarwadi_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pathein = findViewById(R.id.patain);
        myaungmya = findViewById(R.id.myaungmya);
        hinthada = findViewById(R.id.hinthada);
        pyapon = findViewById(R.id.pharpoon);
        maaubin = findViewById(R.id.maaubin);
        yegyi = findViewById(R.id.yaygi);
        pandanaw = findViewById(R.id.pandanaw);
        myanaung = findViewById(R.id.myanaung);

        patheintxt = findViewById(R.id.pataintxt);
        myaungmyatxt = findViewById(R.id.myaungmyatxt);
        hinthadatxt = findViewById(R.id.hinthadatxt);
        pyapontxt = findViewById(R.id.pharpoontxt);
        maaubintxt = findViewById(R.id.maaubintxt);
        yegyitxt = findViewById(R.id.yaygitxt);
        pandanawtxt = findViewById(R.id.pandanawtxt);
        myanaungtxt = findViewById(R.id.myanaungtxt);


        if (LocaleHelper.getLanguage(AyeyarwadiRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(AyeyarwadiRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            pathein.setText(resources.getString(R.string.pathein));
            patheintxt.setText(resources.getString(R.string.patheintxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.aya));
            setString();


        } else if (LocaleHelper.getLanguage(AyeyarwadiRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(AyeyarwadiRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            pathein.setText("မြန်မာ");
            setTitle(resources.getString(R.string.aya));
            setString();
        }


    }
    void setString() {
        pathein.setText(resources.getString(R.string.pathein));
        myaungmya.setText(resources.getString(R.string.myaungmya));
        hinthada.setText(resources.getString(R.string.hinthada));
        pyapon.setText(resources.getString(R.string.pyapon));
        maaubin.setText(resources.getString(R.string.maubin));
        yegyi.setText(resources.getString(R.string.yegyi));
        pandanaw.setText(resources.getString(R.string.pandanaw));
        myanaung.setText(resources.getString(R.string.myanaung));

        patheintxt.setText(resources.getString(R.string.patheintxt));
        myaungmyatxt.setText(resources.getString(R.string.myaungmyatxt));
        hinthadatxt.setText(resources.getString(R.string.hinthadatxt));
        pyapontxt.setText(resources.getString(R.string.pyapontxt));
        maaubintxt.setText(resources.getString(R.string.maubintxt));
        yegyitxt.setText(resources.getString(R.string.yegyitxt));
        pandanawtxt.setText(resources.getString(R.string.pandanawtxt));
        myanaungtxt.setText(resources.getString(R.string.myanaungtxt));

    }
}