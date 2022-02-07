package com.example.indichat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.StatusBarManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final int SPLASH_DISPLAY_LENGTH = 4000;

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splash.this, PhoneNumberActivity.class);
                Bundle b = ActivityOptions.makeSceneTransitionAnimation(splash.this).toBundle();
                splash.this.startActivity(mainIntent, b);
                splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}