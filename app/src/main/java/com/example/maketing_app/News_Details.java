package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class News_Details extends AppCompatActivity {
    TextView title,detail;
    ImageView img;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        getSupportActionBar().setTitle("News Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title=(TextView) findViewById(R.id.detail_title);
        detail=(TextView) findViewById(R.id.detail_txt);
        img=(ImageView) findViewById(R.id.detail_img);

        title.setText(getIntent().getExtras().getString("title"));
        int picture=getIntent().getIntExtra("img",0);
        img.setImageResource(picture);
        detail.setText(getIntent().getExtras().getString("detail"));
    }
}