package com.example.greencafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pizza_Activity extends AppCompatActivity {
    Button Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        getSupportActionBar().setTitle("Pizza");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Timer = findViewById(R.id.btntimer5);
        Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pizza_Activity.this , timer_Activity.class);
                startActivity(intent);
            }
        });

    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
