package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class MandalayRegion extends AppCompatActivity {
    int lang_selected;

    Context context;
    Resources resources;

    TextView mandalay,kyaukse,meiktila,myingyan,pyawbwe,pyinoolwin,tadaoo,madaya,kume,nyaungoo,thazi
            ,mandalay2,kyaukpadaung,natogyi,mandalaytxt,kyauksetxt,meiktilatxt,myingyantxt,pyawbwetxt,pyinoolwintxt,tadaootxt,madayatxt,kumetxt,nyaungootxt,thazitxt
            ,mandalay2txt,kyaukpadaungtxt,natogyitxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandalay_region);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mandalay=findViewById(R.id.mandalay);
        kyaukse=findViewById(R.id.kyaukse);
        meiktila=findViewById(R.id.meiktila);
        myingyan=findViewById(R.id.myingyan);
        pyawbwe=findViewById(R.id.pyawbwe);
        pyinoolwin=findViewById(R.id.pyinoolwin);
        tadaoo=findViewById(R.id.tadau);
        madaya=findViewById(R.id.madaya);
        kume=findViewById(R.id.kuumal);
        nyaungoo=findViewById(R.id.nyaungu);
        thazi=findViewById(R.id.thazi);
        mandalay2=findViewById(R.id.mandalay2);
        kyaukpadaung=findViewById(R.id.kyaukpadaung);
        natogyi=findViewById(R.id.natogyi);

        mandalaytxt=findViewById(R.id.mandalaytxt);
        kyauksetxt=findViewById(R.id.kyauksetxt);
        meiktilatxt=findViewById(R.id.mektilatxt);
        myingyantxt=findViewById(R.id.myingyantxt);
        pyawbwetxt=findViewById(R.id.pyawbwetxt);
        pyinoolwintxt=findViewById(R.id.pyinoolwintxt);
        tadaootxt=findViewById(R.id.tadautxt);
        madayatxt=findViewById(R.id.madayatxt);
        kumetxt=findViewById(R.id.kuumaltxt);
        nyaungootxt=findViewById(R.id.nyaungutxt);
        thazitxt=findViewById(R.id.tharsetxt);
        mandalay2txt=findViewById(R.id.mandalay2txt);
        kyaukpadaungtxt=findViewById(R.id.kyaukpadaungtxt);
        natogyitxt=findViewById(R.id.natogyitxt);

        if (LocaleHelper.getLanguage(MandalayRegion.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(MandalayRegion.this, "en");
            resources = context.getResources();
            lang_selected = 0;
            mandalay.setText(resources.getString(R.string.mandalay));
            mandalaytxt.setText(resources.getString(R.string.mandalaytxt));
//            mandalaybtn.setText(resources.getString(R.string.man));
            setTitle(resources.getString(R.string.man));
            setString();


        } else if (LocaleHelper.getLanguage(MandalayRegion.this).equalsIgnoreCase("my")) {
            context = LocaleHelper.setLocale(MandalayRegion.this, "my");
            resources = context.getResources();
            lang_selected = 1;
            mandalay.setText("မြန်မာ");
            setTitle(resources.getString(R.string.man));
            setString();
        }


    }
    void setString() {
        mandalay.setText(resources.getString(R.string.mandalay));
        kyaukse.setText(resources.getString(R.string.kyaukse));
        meiktila.setText(resources.getString(R.string.meiktila));
        myingyan.setText(resources.getString(R.string.myingyan));
        pyawbwe.setText(resources.getString(R.string.pyawbwe));
        pyinoolwin.setText(resources.getString(R.string.pyinoolwin));
        tadaoo.setText(resources.getString(R.string.tadau));
        madaya.setText(resources.getString(R.string.madaya));
        kume.setText(resources.getString(R.string.kuumal));
        nyaungoo.setText(resources.getString(R.string.nyaungu));
        thazi.setText(resources.getString(R.string.thazi));
        mandalay2.setText(resources.getString(R.string.mandalay2));
        kyaukpadaung.setText(resources.getString(R.string.kyaukpadaung));
        natogyi.setText(resources.getString(R.string.natogyi));

        mandalaytxt.setText(resources.getString(R.string.mandalaytxt));
        kyauksetxt.setText(resources.getString(R.string.kyauksetxt));
        meiktilatxt.setText(resources.getString(R.string.meiktilatxt));
        myingyantxt.setText(resources.getString(R.string.myingyantxt));
        pyawbwetxt.setText(resources.getString(R.string.pyawbwetxt));
        pyinoolwintxt.setText(resources.getString(R.string.pyinoolwintxt));
        tadaootxt.setText(resources.getString(R.string.tadautxt));
        madayatxt.setText(resources.getString(R.string.madayatxt));
        kumetxt.setText(resources.getString(R.string.kumetxt));
        nyaungootxt.setText(resources.getString(R.string.nyaungutxt));
        thazitxt.setText(resources.getString(R.string.thazitxt));
        mandalay2txt.setText(resources.getString(R.string.mandalay2txt));
        kyaukpadaungtxt.setText(resources.getString(R.string.kyaukpadaungtxt));
        natogyitxt.setText(resources.getString(R.string.natogyitxt));
    }
}