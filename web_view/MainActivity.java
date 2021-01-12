package com.example.week5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebview = (WebView) findViewById(R.id.webView);
        String data = "<html><body><h1>WELCOME TO WEBVIEW</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8");

    }
}
