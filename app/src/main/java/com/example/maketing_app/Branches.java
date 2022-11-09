package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Branches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button yangonbtn=findViewById(R.id.yangobtn);

        yangonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Branches.this,Yangon_Region.class);
                startActivity(intent);
                finish();
            }
        });
    }
}