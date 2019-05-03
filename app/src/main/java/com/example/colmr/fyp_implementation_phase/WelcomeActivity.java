package com.example.colmr.fyp_implementation_phase;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                continueToMenu(null);
            }
        },SPLASH_TIME_OUT);

    }
    public void continueToMenu(View v){
        Intent welcomeIntent = new Intent(WelcomeActivity.this, MenuActivity.class);
        startActivity(welcomeIntent);
        finish();
    }
}
