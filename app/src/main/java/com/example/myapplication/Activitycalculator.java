package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activitycalculator extends AppCompatActivity implements View.OnClickListener {
    EditText no1;
    EditText no2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String oper = "";
        num1 = Float.parseFloat(no1.getText().toString());
        num2 = Float.parseFloat(no2.getText().toString());

        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);

    }
}