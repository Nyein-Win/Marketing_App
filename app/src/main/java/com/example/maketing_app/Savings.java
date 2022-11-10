package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Savings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);
        getSupportActionBar().setTitle("Savings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView webView=findViewById(R.id.saving_webview);
        webView.loadUrl("file:///android_asset/saving.html");
    }
}