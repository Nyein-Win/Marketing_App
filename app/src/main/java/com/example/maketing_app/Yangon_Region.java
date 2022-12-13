package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Yangon_Region extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView headoff,insein,hlegu,dala,taikkyi,thowngwa,hlaingthayar,headofficetxt,hlegutxt,inseiontxt,
            dalatxt,taikkyitxt,thowngwatxt,hlaingthayatxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yangon_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        headoff=findViewById(R.id.headoffice);
        insein=findViewById(R.id.insein);
        hlegu=findViewById(R.id.hlegu);
        dala=findViewById(R.id.dala);
        taikkyi=findViewById(R.id.typegyi);
        thowngwa=findViewById(R.id.thongwa);
        hlaingthayar=findViewById(R.id.hlaingthayar);

        headofficetxt=findViewById(R.id.headofficetxt);
        inseiontxt=findViewById(R.id.inseintxt);
        hlegutxt=findViewById(R.id.hlegutxt1);
        dalatxt=findViewById(R.id.dalatxt);
        taikkyitxt=findViewById(R.id.typegyitxt);
        thowngwatxt=findViewById(R.id.thongwatxt);
        hlaingthayatxt=findViewById(R.id.hlaingthayartxt);



        if (LocaleHelper.getLanguage(Yangon_Region.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Yangon_Region.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            headoff.setText(resources.getString(R.string.headoffice));
            headofficetxt.setText(resources.getString(R.string.headofficetxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.yan));
            setString();


        } else if (LocaleHelper.getLanguage(Yangon_Region.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Yangon_Region.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            headoff.setText("မြန်မာ");
            setTitle(resources.getString(R.string.yan));
            setString();
        }


    }
    void setString() {
        headoff.setText(resources.getString(R.string.headoffice));
        insein.setText(resources.getString(R.string.insein));
        hlegu.setText(resources.getString(R.string.hlegu));
        dala.setText(resources.getString(R.string.dala));
        taikkyi.setText(resources.getString(R.string.taikkyi));
        thowngwa.setText(resources.getString(R.string.thongwa));
        hlaingthayar.setText(resources.getString(R.string.hlainthaya));

        headofficetxt.setText(resources.getString(R.string.headofficetxt));
        inseiontxt.setText(resources.getString(R.string.inseintxt));
       hlegutxt.setText((resources.getString(R.string.hlegutxt)));
        dalatxt.setText(resources.getString(R.string.dalatxt));
        taikkyitxt.setText(resources.getString(R.string.taikkyitxt));
        thowngwatxt.setText(resources.getString(R.string.thongwatxt));
        hlaingthayatxt.setText(resources.getString(R.string.hlaingthyatxt));
    }
}