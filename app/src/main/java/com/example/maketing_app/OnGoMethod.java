package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class OnGoMethod extends AppCompatActivity {
    TextView on_text;
    Context context;
    Resources resources;
    int lang_selected;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_go_method);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        on_text=findViewById(R.id.On_text);
        if (LocaleHelper.getLanguage(OnGoMethod.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(OnGoMethod.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.ongo));
            lang_selected=0;
            setString();



        } else if (LocaleHelper.getLanguage(OnGoMethod.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(OnGoMethod.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.ongo));
            lang_selected=1;
            setString();


        }
    }

    private void setString() {
        on_text.setText(resources.getString(R.string.On_Re));
    }
}