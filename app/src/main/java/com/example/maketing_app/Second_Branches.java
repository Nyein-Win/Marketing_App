package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Second_Branches extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    Button yangonbtn,mandalaybtn,bagobtn,ayeyarbtn,mawaybtn,sagainbtn,monbtn,shanbtn,kayinbtn,kayahbtn,
            naypyitawbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        yangonbtn=findViewById(R.id.yangobtn);
        mandalaybtn=findViewById(R.id.mandalaybtn);
        bagobtn=findViewById(R.id.bagobtn);
        ayeyarbtn=findViewById(R.id.ayarbtn);
        mawaybtn=findViewById(R.id.magwaybtn);
        sagainbtn=findViewById(R.id.sagainbtn);
        monbtn=findViewById(R.id.monbtn);
        shanbtn=findViewById(R.id.shanbtn);
        kayinbtn=findViewById(R.id.kayinbtn);
        kayahbtn=findViewById(R.id.kayarbtn);
        naypyitawbtn=findViewById(R.id.naypyitawbtn);



        if (LocaleHelper.getLanguage(Second_Branches.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(Second_Branches.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            yangonbtn.setText(resources.getString(R.string.yan));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.branches));
            setString();


        } else if (LocaleHelper.getLanguage(Second_Branches.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(Second_Branches.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            yangonbtn.setText("မြန်မာ");
            setTitle(resources.getString(R.string.branches));
            setString();
        }


        yangonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,Yangon_Region.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });



        mandalaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,MandalayRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        bagobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,BagoRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        ayeyarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,AyeyarwadiRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        mawaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,MagwayRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });

        sagainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,SagainRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        monbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,MonRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        shanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,ShanRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        kayinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,KayinRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        kayahbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,KayarRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });


        naypyitawbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Branches.this,NaypyitawRegion.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Second_Branches.this);
            }
        });
    }
    void setString() {
        yangonbtn.setText(resources.getString(R.string.yan));
        mandalaybtn.setText(resources.getString(R.string.man));
        bagobtn.setText(resources.getString(R.string.bago));
        ayeyarbtn.setText(resources.getString(R.string.aya));
        mawaybtn.setText(resources.getString(R.string.mag));
        sagainbtn.setText(resources.getString(R.string.saga));
        monbtn.setText(resources.getString(R.string.mo));
        shanbtn.setText(resources.getString(R.string.han));
        kayinbtn.setText(resources.getString(R.string.kayin));
        kayahbtn.setText(resources.getString(R.string.kayah));
        naypyitawbtn.setText(resources.getString(R.string.nay));
    }
}