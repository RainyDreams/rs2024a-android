package com.chiziingiin.originsynq;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取WebView实例
        webView = findViewById(R.id.webView);

        // 配置WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // 启用JavaScript
        webView.setWebViewClient(new WebViewClient()); // 确保在WebView中打开链接

        // 加载网址
        webView.loadUrl("https://lb.chiziingiin.top");
    }
}