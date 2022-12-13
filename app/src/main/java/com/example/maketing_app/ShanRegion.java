package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class ShanRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView taunggyi,aungpan,phekon,nanhsam,taunggyitxt,aungpantxt,phekontxt,nanhsamtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        taunggyi=findViewById(R.id.taunggyi);
        aungpan=findViewById(R.id.aungban);
        phekon=findViewById(R.id.phekon);
        nanhsam=findViewById(R.id.nanhsam);

        taunggyitxt=findViewById(R.id.taunggyitxt);
        aungpantxt=findViewById(R.id.aungbantxt);
        phekontxt=findViewById(R.id.phekontxt);
        nanhsamtxt=findViewById(R.id.namhsamtxt);

        if (LocaleHelper.getLanguage(ShanRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(ShanRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            taunggyi.setText(resources.getString(R.string.mawlamyine));
            taunggyitxt.setText(resources.getString(R.string.mawlamyinetxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.han));
            setString();


        } else if (LocaleHelper.getLanguage(ShanRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(ShanRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            taunggyi.setText("မြန်မာ");
            setTitle(resources.getString(R.string.han));
            setString();
        }


    }
    void setString() {
        taunggyi.setText(resources.getString(R.string.taunggyi));
        aungpan.setText(resources.getString(R.string.aungban));
        phekon.setText(resources.getString(R.string.phekon));
        nanhsam.setText(resources.getString(R.string.nanhsam));

        taunggyitxt.setText(resources.getString(R.string.taunggyitxt));
        aungpantxt.setText(resources.getString(R.string.aungbantxt));
        phekontxt.setText(resources.getString(R.string.phekontxt));
        nanhsamtxt.setText(resources.getString(R.string.nanhsamtxt));
    }
}