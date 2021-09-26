package com.example.lab2_milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction1(View view) {

        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        goToActivity1(num1, num2);
    }

    private void goToActivity1(int num1, int num2) {
        int add = num1 + num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", add);
        startActivity(intent);
    }
    //-------------------------------------------------------------Above here is addition
    public void clickFunction2(View view) {

        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        goToActivity2(num1, num2);
    }

    private void goToActivity2(int num1, int num2) {
        int sub = num1 - num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", sub);
        startActivity(intent);
    }
    //------------------------------------------------------------Above here is subtraction
    public void clickFunction3(View view) {

    EditText number1 = (EditText) findViewById(R.id.editTextNumber);
    EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

    int num1 = Integer.parseInt(number1.getText().toString());
    int num2 = Integer.parseInt(number2.getText().toString());

    goToActivity3(num1, num2);
    }

    private void goToActivity3(int num1, int num2) {
        int mul = num1 * num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", mul);
        startActivity(intent);
    }
    //------------------------------------------------------------Above here is multiply
    public void clickFunction4(View view) {

    EditText number1 = (EditText) findViewById(R.id.editTextNumber);
    EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

    int num1 = Integer.parseInt(number1.getText().toString());
    int num2 = Integer.parseInt(number2.getText().toString());

    goToActivity4(num1, num2);
    }

    private void goToActivity4(int num1, int num2) {
        int div = num1 / num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", div);
        startActivity(intent);
    }
    //------------------------------------------------------------Above here is divide

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}