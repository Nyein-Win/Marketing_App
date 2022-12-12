package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Income extends AppCompatActivity {
    Context context;
    Resources resources;
    int lang_selected;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.I_txt1);
        txt2=findViewById(R.id.I_txt2);
        txt3=findViewById(R.id.I_txt3);
        txt4=findViewById(R.id.I_txt4);
        txt5=findViewById(R.id.I_txt5);
        txt6=findViewById(R.id.I_txt6);

        if (LocaleHelper.getLanguage(Income.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Income.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.F_IEB));
            lang_selected=0;
            setString();

        } else if (LocaleHelper.getLanguage(Income.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Income.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.F_IEB));
            lang_selected=1;
            setString();
        }
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.I_text1));
        txt2.setText(resources.getString(R.string.I_text2));
        txt3.setText(resources.getString(R.string.I_text3));
        txt4.setText(resources.getString(R.string.I_text4));
        txt5.setText(resources.getString(R.string.I_text5));
        txt6.setText(resources.getString(R.string.I_text6));

    }
}