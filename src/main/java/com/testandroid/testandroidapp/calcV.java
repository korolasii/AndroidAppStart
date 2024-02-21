package com.testandroid.testandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class calcV extends AppCompatActivity {

    private Button buttonBracketLeft;
    private Button buttonBracketRight;
    private Button buttonDegree;
    private Button button0;
    private Button button9;
    private Button button8;
    private Button button7;
    private Button button6;
    private Button button5;
    private Button button4;
    private Button button3;
    private Button button2;
    private Button button1;
    private Button buttonDel;
    private Button buttonBack;
    private Button buttonEquals;
    private Button buttonPlus;
    private Button buttonDifference;
    private Button buttonMultiplication;
    private Button buttonDivision;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonBack = findViewById(R.id.buttonBack);
        buttonBracketLeft = findViewById(R.id.buttonBracketLeft);
        buttonBracketRight = findViewById(R.id.buttonBracketRight);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonDegree = findViewById(R.id.buttonDegree);
        buttonDel = findViewById(R.id.buttonDel);
        buttonDifference = findViewById(R.id.buttonDifference);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonPlus = findViewById(R.id.buttonPlus);
        textView = findViewById(R.id.textView);

        button0.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        buttonBack.setOnClickListener(onBackClickListener);
        buttonBracketLeft.setOnClickListener(onClickListener);
        buttonBracketRight.setOnClickListener(onClickListener);
        buttonMultiplication.setOnClickListener(onClickListener);
        buttonDegree.setOnClickListener(onClickListener);
        buttonDel.setOnClickListener(onDelClickListener);
        buttonDifference.setOnClickListener(onClickListener);
        buttonDivision.setOnClickListener(onClickListener);
        buttonEquals.setOnClickListener(onEqualsClickListener);
        buttonPlus.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button) v;
            String buttonText = button.getText().toString();
            textView.append(buttonText);
        }
    };

    private View.OnClickListener onBackClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String currentText = textView.getText().toString();
            if (!currentText.isEmpty()) {
                textView.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    };

    private View.OnClickListener onDelClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView.setText("");
        }
    };

    private View.OnClickListener onEqualsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String result = CalculatorModel.evaluateExpression(textView.getText().toString());
            textView.setText(result);

        }
    };
}


