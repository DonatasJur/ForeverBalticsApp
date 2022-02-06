package vcs.foreverbalticsapp;


import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1;
        Button btn2;


        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityNews.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityLiterature.class);
                startActivity(intent);
            }
        });
    }

//        // initialising the web view
//        WebView wv = (WebView) findViewById(R.id.webview);
//
//        // add your link here
//        wv.loadUrl("https://foreverliving.box.com/s/v5wjjqion318z6pjiez2ceg2a8kryy5z");
//        wv.setWebViewClient(new Client());
//        WebSettings ws = wv.getSettings();
//
//        // Enabling javascript
//        ws.setJavaScriptEnabled(true);
//        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        wv.clearCache(true);
//        wv.clearHistory();
//
//        // download manager is a service that can be used to handle downloads
//        wv.setDownloadListener(new DownloadListener() {
//            @Override
//            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
//                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url));
//                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                dm.enqueue(req);
//                Toast.makeText(MainActivity.this, "Downloading....", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private class Client extends WebViewClient {
//        // on page started load start loading the url
//        @Override
//        public void onPageStarted(WebView view, String url, Bitmap favicon) {
//            super.onPageStarted(view, url, favicon);
//        }
//
//        // load the url of our drive
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//
//        @Override
//        public void onPageFinished(WebView view, String url) {
//            super.onPageFinished(view, url);
//        }
//
//        public void onReceivedError(WebView webView, int errorCode, String description, String failingUrl) {
//            // if stop loading
//            try {
//                webView.stopLoading();
//            } catch (Exception e) {
//            }
//
//            if (webView.canGoBack()) {
//                webView.goBack();
//            }
//
//            // if loaded blank then show error
//            // to check internet connection using
//            // alert dialog
//            webView.loadUrl("about:blank");
//            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//            alertDialog.setTitle("Error");
//            alertDialog.setMessage("Check your internet connection and Try again.");
//            alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Try Again", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                    startActivity(getIntent());
//                }
//            });
//
//            alertDialog.show();
//            super.onReceivedError(webView, errorCode, description, failingUrl);
//        }
}
