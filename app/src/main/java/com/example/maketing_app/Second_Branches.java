package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Second_Branches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_branches);

        getSupportActionBar().setTitle("Branches");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button yangonbtn=findViewById(R.id.yangobtn);

        yangonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,Yangon_Region.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button mandalaybtn=findViewById(R.id.mandalaybtn);
        mandalaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,MandalayRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button bagobtn=findViewById(R.id.bagobtn);
        bagobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,BagoRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ayarbtn=findViewById(R.id.ayarbtn);
        ayarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,AyeyarwadiRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button magwaybtn=findViewById(R.id.magwaybtn);
        magwaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,MagwayRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button sagainbtn=findViewById(R.id.sagainbtn);
        sagainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,SagainRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button monbtn=findViewById(R.id.monbtn);
        monbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,MonRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button shanbtn=findViewById(R.id.shanbtn);
        shanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,ShanRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button kayinbtn=findViewById(R.id.kayinbtn);
        kayinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,KayinRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button kayarbtn=findViewById(R.id.kayarbtn);
        kayarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,KayarRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button naypyibtn=findViewById(R.id.naypyitawbtn);
        naypyibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,NaypyitawRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });
    }
}