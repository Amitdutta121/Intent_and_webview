package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webview);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");


        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/search?q="+data);
    }
}
