package com.example.maketing_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Social_Welfare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_welfare);
        WebView webView=findViewById(R.id.social_welfare_webview);
        webView.loadUrl("file:///android_asset/social.html");
    }
}