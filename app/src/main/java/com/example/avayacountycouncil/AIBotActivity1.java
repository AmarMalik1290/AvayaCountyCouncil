package com.example.avayacountycouncil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AIBotActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i_bot1);


       // String url ="https://app.koopid.io/kpd-client/index.html?send=%7B%22text%22%3A%22Avaya+County+Council%22%2C%22type%22%3A%22hidden%22%7D&provider=299712&autoconfig=true&login-providerId=299712&resize=scale&localstore=customer&home=chatwith%2F299714&target=chatwith%2F299714&username=guest";
      //  WebView view= (WebView) this.findViewById(R.id.WebView1);
      //  view.getSettings().setJavaScriptEnabled(true);
        //view.loadUrl(url);

        WebView webb =(WebView)findViewById(R.id.WebView1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://app.koopid.io/kpd-client/index.html?send=%7B%22text%22%3A%22Avaya+County+Council%22%2C%22type%22%3A%22hidden%22%7D&provider=299712&autoconfig=true&login-providerId=299712&resize=scale&localstore=customer&home=chatwith%2F299714&target=chatwith%2F299714&username=guest");

        //  browser = (WebView)findViewById(R.id.WebView1);
        //String url = "www.google.com";
        // browser.getSettings().getJavaScriptEnabled();
        // browser.loadUrl(url);




    }
}