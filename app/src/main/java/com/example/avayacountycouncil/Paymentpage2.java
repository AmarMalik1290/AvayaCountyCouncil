package com.example.avayacountycouncil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Paymentpage2 extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentpage2);

        webView = (WebView) findViewById(R.id.paymentWebv);
        webView.loadUrl("http://councilusecase.epizy.com/clickamount.php");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}