package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Resource_Human extends AppCompatActivity {
TextView txt1,txt2,txt3,txt4,txt5;
    Context context;
    Resources resources;
    int lang_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_human);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt1=findViewById(R.id.RM_txt1);
        txt2=findViewById(R.id.RM_txt2);
        txt3=findViewById(R.id.RM_txt3);
        txt4=findViewById(R.id.RM_txt4);
        txt5=findViewById(R.id.RM_txt5);
        if (LocaleHelper.getLanguage(Resource_Human.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Resource_Human.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.human_resources));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(Resource_Human.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Resource_Human.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.human_resources));
            lang_selected=1;
            setString();

        }

        CardView currency=findViewById(R.id.currency);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView recrupolicy=findViewById(R.id.recrupolicy);

        recrupolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,RecruitmentPolicity.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);


            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,VacanciesCurrent.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);


            }
        });
        CardView selection=findViewById(R.id.selection);
        selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Selection_Process.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView learning=findViewById(R.id.learning);
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Learning_Development.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);
            }
        });

        CardView benifit=findViewById(R.id.benefit);
        benifit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resource_Human.this,Compensate_Benefits.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Resource_Human.this);
            }
        });
    }

    private void setString() {
        txt1.setText(resources.getString(R.string.RM_text1));
        txt2.setText(resources.getString(R.string.RM_text2));
        txt3.setText(resources.getString(R.string.RM_text3));
        txt4.setText(resources.getString(R.string.RM_text4));
        txt5.setText(resources.getString(R.string.RM_text5));

    }
}