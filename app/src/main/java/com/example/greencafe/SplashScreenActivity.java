package com.example.greencafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen4);

        getSupportActionBar().setTitle("Mom's CookBook");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        Thread td = new Thread(){
            public void run(){
                try {
                    sleep(2000);

                }catch (Exception excep){
                    excep.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

        };td.start();

    }
}
