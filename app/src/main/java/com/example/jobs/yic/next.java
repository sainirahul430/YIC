package com.example.jobs.yic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);}

    public void click(View v) {


        if (v.equals(findViewById(R.id.button2))) {

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
