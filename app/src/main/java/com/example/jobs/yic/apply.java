package com.example.jobs.yic;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class apply extends AppCompatActivity {


    WebView apply;
    ProgressBar pbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);


        apply = (WebView) findViewById(R.id.apply);


        apply.setWebViewClient(new WebViewClient());
        apply.loadUrl("https://docs.google.com/forms/d/15YzORdPhGtylDdfx4vNcFaLTjLrMoGVi5S6NMI6FJfc/");



        ConnectivityManager ConnectionManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=ConnectionManager.getActiveNetworkInfo();
        if((networkInfo != null) && networkInfo.isConnected())
        {
            Toast.makeText(this, "Loading...", Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this, "Sorry! No Internet Connection", Toast.LENGTH_LONG).show();
            startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS
            ), 0);

        }







    }




}




