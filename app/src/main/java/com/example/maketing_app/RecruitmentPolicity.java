package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class RecruitmentPolicity extends AppCompatActivity {
    TextView txt1;
    Context context;
    Resources resources;
    int lang_selected;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruitment_policity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=(TextView) findViewById(R.id.RP_txt1);
        if (LocaleHelper.getLanguage(RecruitmentPolicity.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(RecruitmentPolicity.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text1));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(RecruitmentPolicity.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(RecruitmentPolicity.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text1));
            lang_selected=1;
            setString();

        }
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.RP_text1));
    }
}