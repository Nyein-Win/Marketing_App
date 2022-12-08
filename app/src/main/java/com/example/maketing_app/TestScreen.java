package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class TestScreen extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen);
         t1=findViewById(R.id.test_1);

    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.top_menu,menu);
//        MenuItem itemswitch=menu.findItem(R.id.switch_action_bar);
//        itemswitch.setActionView(R.layout.use_switch);
//        final Switch sw=(Switch) menu.findItem(R.id.switch_action_bar).getActionView().findViewById(R.id.switch2);
//        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    setString();
//                    Toast.makeText(TestScreen.this, "Switch is working", Toast.LENGTH_SHORT).show();
//                }else{
//                   postString();
//                }
//            }
//        });
//        return true;
//    }
//
//    private void postString() {
//
//        t1.setText("ငြိမ်းဝင်းသည်အကောင်းဆုံးဖြစ်သည်။");
//    }
//
//    private void setString() {
//        t1.setText("Nyein is the best person.");
//    }


}