package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class MagwayRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView magway,taungdwingyi,chauk,pwintphyu,pakokku,aunglan,magwaytxt,taungdwingyitxt,chauktxt,pwintphyutxt,pakokkutxt,aunglantxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magway_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        magway=findViewById(R.id.magway);
        taungdwingyi=findViewById(R.id.taungdwingyi);
        chauk=findViewById(R.id.chauk);
        pwintphyu=findViewById(R.id.pwintphyu);
        pakokku=findViewById(R.id.pakokku);
        aunglan=findViewById(R.id.aunglan);

        magwaytxt=findViewById(R.id.magwaytxt);
        taungdwingyitxt=findViewById(R.id.taungdwingyitxt);
        chauktxt=findViewById(R.id.chauktxt);
        pwintphyutxt=findViewById(R.id.pwintphyutxt);
        pakokkutxt=findViewById(R.id.pakokkutxt);
        aunglantxt=findViewById(R.id.aunglantxt);


        if (LocaleHelper.getLanguage(MagwayRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(MagwayRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            magway.setText(resources.getString(R.string.magway));
            magwaytxt.setText(resources.getString(R.string.magwaytxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.mag));
            setString();


        } else if (LocaleHelper.getLanguage(MagwayRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(MagwayRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            magway.setText("မြန်မာ");
            setTitle(resources.getString(R.string.mag));
            setString();
        }


    }
    void setString() {
        magway.setText(resources.getString(R.string.magway));
        taungdwingyi.setText(resources.getString(R.string.taungdwingyi));
        chauk.setText(resources.getString(R.string.chauk));
        pwintphyu.setText(resources.getString(R.string.pwintphyu));
        pakokku.setText(resources.getString(R.string.pakokku));
        aunglan.setText(resources.getString(R.string.aunglan));

        magwaytxt.setText(resources.getString(R.string.magwaytxt));
        taungdwingyitxt.setText(resources.getString(R.string.taungdwingyitxt));
        chauktxt.setText(resources.getString(R.string.chauktxt));
        pwintphyutxt.setText(resources.getString(R.string.pwintphyutxt));
        pakokkutxt.setText(resources.getString(R.string.pakokkutxt));
        aunglantxt.setText(resources.getString(R.string.aunglantxt));
    }
}