package com.testandroid.testandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnToCalc;
    private Button btnToRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToCalc = findViewById(R.id.btnToCalc);
        btnToRandom = findViewById(R.id.btnToRandom);

        btnToCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calcV.class);
                startActivity(intent);
            }
        });

        btnToRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, randomNumber.class);
                startActivity(intent);
            }
        });

    }
}