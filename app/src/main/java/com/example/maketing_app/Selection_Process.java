package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Selection_Process extends AppCompatActivity {
    Context context;
    Resources resources;
    int lang_selected;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_process);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.sp_txt1);
        txt2=findViewById(R.id.sp_txt2);
        txt3=findViewById(R.id.sp_txt3);
        txt4=findViewById(R.id.sp_txt4);
        txt5=findViewById(R.id.sp_txt5);
        txt6=findViewById(R.id.sp_txt6);
        if (LocaleHelper.getLanguage(Selection_Process.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Selection_Process.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text3));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(Selection_Process.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Selection_Process.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text3));
            lang_selected=1;
            setString();

        }

    }

    private void setString() {
        txt1.setText(resources.getString(R.string.SP_text1));
        txt2.setText(resources.getString(R.string.SP_text2));
        txt3.setText(resources.getString(R.string.SP_text3));
        txt4.setText(resources.getString(R.string.SP_text4));
        txt5.setText(resources.getString(R.string.SP_text5));
        txt6.setText(resources.getString(R.string.SP_text6));
    }
}