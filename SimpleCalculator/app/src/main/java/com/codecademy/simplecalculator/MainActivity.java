package com.codecademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.number1);
        EditText secondNumber = findViewById(R.id.number2);
        RadioGroup operators = findViewById(R.id.operators);
        RadioButton addition = findViewById(R.id.add);
        RadioButton subtraction = findViewById(R.id.subtract);
        Button equals = findViewById(R.id.equals);
        TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                int operatorButtonId = operators.getCheckedRadioButtonId();
                Integer answer;

                if (operatorButtonId == addition.getId()) {
                    answer = firstNumberValue + secondNumberValue;
                } else {
                    answer = firstNumberValue - secondNumberValue;
                }

                result.setText(answer.toString());
            }
        });
    }
}