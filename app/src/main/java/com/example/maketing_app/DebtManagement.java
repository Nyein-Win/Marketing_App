package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class DebtManagement extends AppCompatActivity {
    Context context;
    Resources resources;
    int lang_selected;
    TextView txt1,txt2,txt3,txt4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debt_management);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.D_txt1);
        txt2=findViewById(R.id.D_txt2);
        txt3=findViewById(R.id.D_txt3);
        txt4=findViewById(R.id.D_txt4);


        if (LocaleHelper.getLanguage(DebtManagement.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(DebtManagement.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.F_DM));
            lang_selected=0;
            setString();

        } else if (LocaleHelper.getLanguage(DebtManagement.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(DebtManagement.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.F_DM));
            lang_selected=1;
            setString();
        }
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.D_text1));
        txt2.setText(resources.getString(R.string.D_text2));
        txt3.setText(resources.getString(R.string.D_text3));
        txt4.setText(resources.getString(R.string.D_text4));


    }
}