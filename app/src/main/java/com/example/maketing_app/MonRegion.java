package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class MonRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView mawlamyine,thaton,mudon,kyaikto,chaungzon,yay,mawlamyinetxt,thatontxt,mudontxt,kyaiktotxt,chaungzontxt,yaytxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mawlamyine=findViewById(R.id.mawlamyine);
        thaton=findViewById(R.id.thaton);
        mudon=findViewById(R.id.mudon);
        kyaikto=findViewById(R.id.kyaikto);
        chaungzon=findViewById(R.id.chaungzon);
        yay=findViewById(R.id.yay);

        mawlamyinetxt=findViewById(R.id.mawlamyinetxt);
        thatontxt=findViewById(R.id.thatontxt);
        mudontxt=findViewById(R.id.mudontxt);
        kyaiktotxt=findViewById(R.id.kyaiktotxt);
        chaungzontxt=findViewById(R.id.chaungzontxt);
        yaytxt=findViewById(R.id.yaytxt);


        if (LocaleHelper.getLanguage(MonRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(MonRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            mawlamyine.setText(resources.getString(R.string.mawlamyine));
            mawlamyinetxt.setText(resources.getString(R.string.mawlamyinetxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.mo));
            setString();


        } else if (LocaleHelper.getLanguage(MonRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(MonRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            mawlamyine.setText("မြန်မာ");
            setTitle(resources.getString(R.string.mo));
            setString();
        }


    }
    void setString() {
        mawlamyine.setText(resources.getString(R.string.mawlamyine));
        thaton.setText(resources.getString(R.string.thaton));
        mudon.setText(resources.getString(R.string.mudon));
        kyaikto.setText(resources.getString(R.string.kyaikto));
        chaungzon.setText(resources.getString(R.string.chaungzon));
        yay.setText(resources.getString(R.string.yay));

        mawlamyinetxt.setText(resources.getString(R.string.mawlamyinetxt));
        thatontxt.setText(resources.getString(R.string.thatontxt));
        mudontxt.setText(resources.getString(R.string.mudontxt));
        kyaiktotxt.setText(resources.getString(R.string.kyaiktotxt));
        chaungzontxt.setText(resources.getString(R.string.chaungzontxt));
        yaytxt.setText(resources.getString(R.string.yaytxt));

    }
}