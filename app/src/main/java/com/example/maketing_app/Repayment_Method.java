package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Repayment_Method extends AppCompatActivity {

    Context context;
    Resources resources;
    int lang_selected;
    TextView R_text0,R_text1,ongo,wavemoney;
    Button branches;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repayment_method);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        R_text0=findViewById(R.id.R_text0);
        R_text1=findViewById(R.id.R_text1);
        branches=findViewById(R.id.branches);
         ongo=(TextView)findViewById(R.id.ongo);
         wavemoney=(TextView) findViewById(R.id.wavemoney);

        if (LocaleHelper.getLanguage(Repayment_Method.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Repayment_Method.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.repayment_method));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(Repayment_Method.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Repayment_Method.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.repayment_method));
            lang_selected=1;
            setString();
        }

        branches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Repayment_Method.this,Second_Branches.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Repayment_Method.this);
            }
        });
        ongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Repayment_Method.this,OnGoMethod.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Repayment_Method.this);
            }
        });
        wavemoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Repayment_Method.this,WaveMoneyMethod.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Repayment_Method.this);
            }
        });
    }

    private void setString() {
        R_text0.setText(resources.getString(R.string.R_Pay));
        R_text1.setText(resources.getString(R.string.R_Pay0));
        branches.setText(resources.getString(R.string.brand_Address));
        ongo.setText(resources.getString(R.string.hyperlink1));
        wavemoney.setText(resources.getString(R.string.hyperlink2));

    }
}