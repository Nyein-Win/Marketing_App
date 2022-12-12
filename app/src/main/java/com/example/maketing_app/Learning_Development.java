package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class Learning_Development extends AppCompatActivity {
    TextView txt1;
    Context context;
    Resources resources;
    int lang_selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_development);

        txt1=findViewById(R.id.LD_txt1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (LocaleHelper.getLanguage(Learning_Development.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Learning_Development.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text4));
            lang_selected=0;
            setString();
        } else if (LocaleHelper.getLanguage(Learning_Development.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Learning_Development.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.RM_text4));
            lang_selected=1;
            setString();

        }

    }

    private void setString() {
        txt1.setText(resources.getString(R.string.LD_text1));
    }
}