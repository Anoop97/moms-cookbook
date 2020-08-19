package com.example.greencafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class food_Activity extends AppCompatActivity {

    Button chicken , prawn , dosa , roll , pizza , thali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_);

        getSupportActionBar().setTitle("Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chicken = findViewById(R.id.btnchicken);
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(food_Activity.this , Chicken_Activity.class);
                startActivity(intent);
            }
        });

        prawn = findViewById(R.id.btnprawn);
        prawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(food_Activity.this , Prawn_Activity.class);
                startActivity(intent);
            }
        });

        dosa = findViewById(R.id.btndosa);
        dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(food_Activity.this , Dosa_Activity.class);
                startActivity(intent);
            }
        });

        roll = findViewById(R.id.btnroll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(food_Activity.this , Roll_Activity.class);
                startActivity(intent);
            }
        });
        pizza = findViewById(R.id.btnpizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(food_Activity.this , Pizza_Activity.class);
                startActivity(intent);
            }
        });
        thali = findViewById(R.id.btnthali);
        thali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(food_Activity.this , Thali_Activity.class);
                startActivity(intent);
            }
        });


    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
