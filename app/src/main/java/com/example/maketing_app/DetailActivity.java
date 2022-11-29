package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
 TextView title,detail;
 ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_detail);
        title=(TextView) findViewById(R.id.detail_title);
        detail=(TextView) findViewById(R.id.detail_txt);
        img=(ImageView) findViewById(R.id.detail_img);

        title.setText(getIntent().getExtras().getString("title"));
        int picture=getIntent().getIntExtra("img",0);
        img.setImageResource(picture);
        detail.setText(getIntent().getExtras().getString("detail"));



    }
}