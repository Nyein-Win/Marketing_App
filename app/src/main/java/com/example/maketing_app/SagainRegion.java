package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class SagainRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView monywa,shwebo,sagaing,chaungu,yeu,monywatxt,shwebotxt,sagaingtxt,chaungutxt,yeutxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sagain_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        monywa=findViewById(R.id.monywa);
        shwebo=findViewById(R.id.shwebo);
        sagaing=findViewById(R.id.sagaing);
        chaungu=findViewById(R.id.chaungu);
        yeu=findViewById(R.id.yeu);

        monywatxt=findViewById(R.id.monywatxt);
        shwebotxt=findViewById(R.id.shwebotxt);
        sagaingtxt=findViewById(R.id.sagaingtxt);
        chaungutxt=findViewById(R.id.chaungutxt);
        yeutxt=findViewById(R.id.yeutxt);

        if (LocaleHelper.getLanguage(SagainRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(SagainRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            monywa.setText(resources.getString(R.string.monywa));
            monywatxt.setText(resources.getString(R.string.monywatxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.saga));
            setString();


        } else if (LocaleHelper.getLanguage(SagainRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(SagainRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            monywa.setText("မြန်မာ");
            setTitle(resources.getString(R.string.saga));
            setString();
        }


    }
    void setString() {
        monywa.setText(resources.getString(R.string.monywa));
        shwebo.setText(resources.getString(R.string.shwebo));
        sagaing.setText(resources.getString(R.string.sagaing));
        chaungu.setText(resources.getString(R.string.chaungu));
        yeu.setText(resources.getString(R.string.yeu));

        monywatxt.setText(resources.getString(R.string.monywatxt));
        shwebotxt.setText(resources.getString(R.string.shwebotxt));
        sagaingtxt.setText(resources.getString(R.string.sagaingtxt));
        chaungutxt.setText(resources.getString(R.string.chaungutxt));
        yeutxt.setText(resources.getString(R.string.yeutxt));
    }
}