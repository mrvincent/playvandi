package com.metarobotics.playvandi;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Check","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread loadThread = new Thread() {
          @Override
          public void run() {
              try {
                  // Simulate network access.
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  return;
              }

              Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
              startActivity(intent);
              finish();
          }
        };

        loadThread.start();
    }
}
