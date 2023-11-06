package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    double num1;
    double result;
    String currentDisplay="";
    String allOperator="";
    String currentOperator;
    String Tag="hi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button test=findViewById(R.id.test);
        test.setOnClickListener(view ->{

        });
        TextView screen = findViewById(R.id.screen);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        Button buttonOn = findViewById(R.id.buttonOn);
        Button buttonOff = findViewById(R.id.buttonOff);
        Button buttonNegative=findViewById(R.id.buttonNegative);
        Button buttonDel = findViewById(R.id.buttonDel);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonSub = findViewById(R.id.buttonSub);
        Button buttonMul = findViewById(R.id.buttonMul);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonEquals = findViewById(R.id.buttonEquals);
        Button buttonDouble = findViewById(R.id.buttonDouble);

        buttonOff.setOnClickListener(view -> screen.setVisibility(View.GONE));
        buttonOn.setOnClickListener(view -> {
            screen.setVisibility(View.VISIBLE);
            screen.setText("0");
            currentOperator="";
            num1=0;
            currentDisplay="";
        });

        ArrayList<Button> nums = new ArrayList<>();
        nums.add(button0);
        nums.add(button1);
        nums.add(button2);
        nums.add(button3);
        nums.add(button4);
        nums.add(button5);
        nums.add(button6);
        nums.add(button7);
        nums.add(button8);
        nums.add(button9);

        for (Button button : nums) {
            button.setOnClickListener(view -> {
                if (!screen.getText().toString().equals("0")) {
                    currentDisplay=screen.getText().toString();
                    currentDisplay+=button.getText().toString();
                    screen.setText(currentDisplay);
                } else {
                    currentDisplay="";
                    currentDisplay+=button.getText().toString();
                    screen.setText(currentDisplay);
                }
            });
        }
        ArrayList<Button> operator = new ArrayList<>();
        operator.add(buttonPlus);
        operator.add(buttonSub);
        operator.add(buttonMul);
        operator.add(buttonDivide);
        for (Button button : operator) {
            button.setOnClickListener(view -> {
                num1 = Double.parseDouble(screen.getText().toString());
                currentOperator = button.getText().toString();
                screen.setText("0");
                allOperator+=button.getText().toString();
                String nowOperator= String.valueOf(allOperator.charAt(allOperator.length()-1));
                switch (nowOperator){
                    case "/":
                    case "x":
                    case "-":
                    case "+":
                }
            });
        }

        //buttonAC
        buttonNegative.setOnClickListener(view ->{
            screen.setText("-"+screen.getText().toString());
        });

        //Xoas 1 phaafn tuw
        buttonDel.setOnClickListener(view -> {
            String num = screen.getText().toString();
            if (num.length() > 1) {
                screen.setText(num.substring(0, num.length() - 1));
            } else if (num.length() == 1 && !num.equals("0")) {
                screen.setText(currentOperator);
            }
        });

        //buttonDouble
        buttonDouble.setOnClickListener(view -> {
            if (!screen.getText().toString().contains(".")) {
                screen.setText(screen.getText().toString()+".");
            }else{
                return;
            }
        });

        //buttonEquals
        buttonEquals.setOnClickListener(view -> {
            double num2 = Double.parseDouble(screen.getText().toString());
            switch (currentOperator) {
                case "/":
                    result = num1 / num2;
                    break;
                case "x":
                    result = num1 * num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                default:
                    result = num1 + num2;
                    break;
            }
            screen.setText(String.valueOf(result));
            num1=result;
            Toast.makeText(getApplicationContext(),allOperator,Toast.LENGTH_LONG).show();
        });
    }
}