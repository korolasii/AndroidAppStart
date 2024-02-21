package com.testandroid.testandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class randomNumber extends AppCompatActivity {

    private Button buttonRandom;
    private EditText textmin;
    private EditText textmax;
    private TextView textRandomNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_number);

        buttonRandom = findViewById(R.id.buttonRandom);
        textmin = findViewById(R.id.textmin);
        textmax = findViewById(R.id.textmax);
        textRandomNumber = findViewById(R.id.textRandomNumber);

        buttonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int minNumber = Integer.parseInt(textmin.getText().toString());
                int maxNumber = Integer.parseInt(textmax.getText().toString());


                int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
                textRandomNumber.setText(String.valueOf(randomNumber));
            }
        });
    }
}
