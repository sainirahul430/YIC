package com.example.jobs.yic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void click(View v) {

        if (v.equals(findViewById(R.id.what))) {

            Intent i = new Intent(this, whatis.class);
            startActivity(i);
        }


        else if(v.equals(findViewById(R.id.why)))
        {
            Intent i=new Intent(this,why.class);
            startActivity(i);
        }
        else if (v.equals(findViewById(R.id.apply)))
        {
            Intent i=new Intent(this,apply.class);
            startActivity(i);
        }


        else if (v.equals(findViewById(R.id.org)))
        {
            Intent i=new Intent(this,humancircle.class);
            startActivity(i);
        }

    }
}
