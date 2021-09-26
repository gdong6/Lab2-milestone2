package com.example.lab2_milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView resultNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultNum = (TextView) findViewById(R.id.resultText);
        Intent intent = getIntent();
        int num = intent.getIntExtra("result",0);
        resultNum.setText("=" + num);


    }
}