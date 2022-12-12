package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class WaveMoneyMethod extends AppCompatActivity {
    TextView wave_Text;
    Context context;
    Resources resources;
    int lang_selected;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_money_method);
        wave_Text=findViewById(R.id.Wa_Text);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (LocaleHelper.getLanguage(WaveMoneyMethod.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(WaveMoneyMethod.this, "en");
            resources = context.getResources();
            setTitle(resources.getString(R.string.wave));
            lang_selected=0;
            setString();



        } else if (LocaleHelper.getLanguage(WaveMoneyMethod.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(WaveMoneyMethod.this, "my");
            resources = context.getResources();
            setTitle(resources.getString(R.string.wave));
            lang_selected=1;
            setString();


        }
    }

    private void setString() {
        wave_Text.setText(resources.getString(R.string.wave_re));
    }
}