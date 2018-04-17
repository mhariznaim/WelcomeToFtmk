package com.ftmk.mhariznaim.welcometoftmk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class WebFTMKActivity extends AppCompatActivity {

    TextView textViewNick;
    WebView webViewFTMK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_ftmk);

        textViewNick = (TextView)findViewById(R.id.helloNickname);
        Intent intent = getIntent();
        textViewNick.setText("Greetings and Welcome "+intent.getStringExtra("strNickname")+"!");

        webViewFTMK = (WebView)findViewById(R.id.webviewftmk);
        webViewFTMK.loadUrl("http://www.utem.edu.my/list-of-programmes-2.html");
        webViewFTMK.getSettings().setJavaScriptEnabled(true);
        webViewFTMK.setWebViewClient(new WebViewClient(){
            @Override

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        webViewFTMK.setWebChromeClient(new WebChromeClient());
    }
}
