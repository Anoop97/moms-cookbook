package com.example.greencafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chicken_Activity extends AppCompatActivity {

    Button Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        getSupportActionBar().setTitle("Chicken");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Timer = findViewById(R.id.btntimer1);
        Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Chicken_Activity.this , timer_Activity.class);
                startActivity(intent);
            }
        });

    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }

}



