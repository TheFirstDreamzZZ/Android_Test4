package com.fjnu.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.net.Uri;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri data = intent.getData();
        URL url = null;
        try {
            url = new URL(data.getScheme(),data.getHost(),data.getPath());
        }catch(Exception e){
            e.printStackTrace();
        }
        startBrowser(url);
    }
    private void startBrowser(URL url){
        WebView webView = findViewById(R.id.wbvw);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url.toString());
        //让浏览器支持javascript
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView wv,String url){
                wv.loadUrl(url);
                return true;
            }
        });
    }
}
