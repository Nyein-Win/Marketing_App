package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class NaypyitawRegion extends AppCompatActivity {

    int lang_selected;

    Context context;
    Resources resources;

    TextView naypyitaw,lewe,tatkon,naypyitawtxt,lewetxt,tatkontxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naypyitaw_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        naypyitaw=findViewById(R.id.naypyitaw);
        lewe=findViewById(R.id.lewe);
        tatkon=findViewById(R.id.tatkon);

        naypyitawtxt=findViewById(R.id.naypyitawtxt);
        lewetxt=findViewById(R.id.lewetxt);
        tatkontxt=findViewById(R.id.tatkontxt);


        if (LocaleHelper.getLanguage(NaypyitawRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(NaypyitawRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            naypyitaw.setText(resources.getString(R.string.naypyitaw));
            naypyitawtxt.setText(resources.getString(R.string.naypyitawtxt));
            setTitle(resources.getString(R.string.nay));
            setString();


        } else if (LocaleHelper.getLanguage(NaypyitawRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(NaypyitawRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            naypyitaw.setText("မြန်မာ");
            setTitle(resources.getString(R.string.nay));
            setString();
        }


    }
    void setString() {
        naypyitaw.setText(resources.getString(R.string.naypyitaw));
        lewe.setText(resources.getString(R.string.lewe));
        tatkon.setText(resources.getString(R.string.tatkon));

        naypyitawtxt.setText(resources.getString(R.string.naypyitawtxt));
        lewetxt.setText(resources.getString(R.string.lewetxt));
        tatkontxt.setText(resources.getString(R.string.tatkontxt));
    }
}