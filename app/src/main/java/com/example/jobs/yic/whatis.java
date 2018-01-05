package com.example.jobs.yic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class whatis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatisyic);

        ImageView image=(ImageView) findViewById(R.id.imageView4);
        ImageView image1=(ImageView) findViewById(R.id.imageView2);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        image.startAnimation(animation);
        image1.startAnimation(animation);
    }
}
