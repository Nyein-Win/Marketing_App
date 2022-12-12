package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Compensate_Benefits extends AppCompatActivity {
    TextView txt1;
    Context context;
    Resources resources;
    int lang_selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compensate_benefits);
        txt1=findViewById(R.id.CB_txt1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (LocaleHelper.getLanguage(Compensate_Benefits.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Compensate_Benefits.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text5));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(Compensate_Benefits.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Compensate_Benefits.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text5));
            lang_selected=1;
            setString();

        }
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.CB_text1));
    }
}