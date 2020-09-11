package com.example.gadsphaseii;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

import static androidx.core.os.LocaleListCompat.create;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withLogo(R.drawable.gads)
                .withBackgroundColor(Color.parseColor("#1a1b29"));
       View easySplashScreenView= config.create();
       setContentView(easySplashScreenView);

    }
}