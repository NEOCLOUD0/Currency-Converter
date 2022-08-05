package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Getting the choice selected from the radio button (MainActivity) and setting it to the
        // second text view on the page (SecondActivity)
        String str = getIntent().getStringExtra("Radio");
        TextView txt = (TextView) findViewById(R.id.textView3);
        txt.setText(str);


        if(str.equals("CAD")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            txt1.setText("1.00");
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            txt2.setText("1.26");

        }else if(str.equals("YEN")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            txt1.setText("1.00");
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            txt2.setText("109.94");

        }else if(str.equals("EUR")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            txt1.setText("1.00");
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            txt2.setText("0.85");

        } else if(str.equals("WON")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            txt1.setText("1.00");
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            txt2.setText("1310.07");
        }
    }



    public void fromUsCurrency(View v){
        //getting the GUI of editText for the second edit text
        //EQUATION: input * exchangeRate

        String str = getIntent().getStringExtra("Radio");
        if(str.equals("CAD")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            double number2 = Double.parseDouble(txt1.getText().toString()); //Have to get text and convert string to double
            double equation = number2 * 1.26;

            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            String s2 = Double.toString(equation);
            txt2.setText(s2);


        }else if(str.equals("YEN")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            double number2 = Double.parseDouble(txt1.getText().toString()); //Have to get text and convert string to double
            double equation = number2 * 109.94;

            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            String s2 = Double.toString(equation);
            txt2.setText(s2);


        }else if(str.equals("EUR")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            double number2 = Double.parseDouble(txt1.getText().toString()); //Have to get text and convert string to double
            double equation = number2 * 0.85;

            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            String s2 = Double.toString(equation);
            txt2.setText(s2);


        }else if(str.equals("WON")){
            EditText txt1 = (EditText) findViewById(R.id.eTND);
            double number2 = Double.parseDouble(txt1.getText().toString()); //Have to get text and convert string to double
            double equation = number2 * 1310.07;

            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            String s2 = Double.toString(equation);
            txt2.setText(s2);

        }


    }

    public void toUsCurrency(View v){
        //getting the GUI of editText for the second edit text
        //EQUATION: input / exchangeRate

        String str = getIntent().getStringExtra("Radio");
        if(str.equals("CAD")){
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            double number2 = Double.parseDouble(txt2.getText().toString()); //Have to get text and convert string to double
            double equation = number2 / 1.26;

            EditText txt1 = (EditText) findViewById(R.id.eTND);
            String s1 = Double.toString(equation);
            txt1.setText(s1);


        }else if(str.equals("YEN")){
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            double number2 = Double.parseDouble(txt2.getText().toString()); //Have to get text and convert string to double
            double equation = number2 / 109.94;

            EditText txt1 = (EditText) findViewById(R.id.eTND);
            String s1 = Double.toString(equation);
            txt1.setText(s1);


        }else if(str.equals("EUR")){
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            double number2 = Double.parseDouble(txt2.getText().toString()); //Have to get text and convert string to double
            double equation = number2 / 0.85;

            EditText txt1 = (EditText) findViewById(R.id.eTND);
            String s1 = Double.toString(equation);
            txt1.setText(s1);

        }else if(str.equals("WON")){
            EditText txt2 = (EditText) findViewById(R.id.eTND2);
            double number2 = Double.parseDouble(txt2.getText().toString()); //Have to get text and convert string to double
            double equation = number2 / 1310.07;

            EditText txt1 = (EditText) findViewById(R.id.eTND);
            String s1 = Double.toString(equation);
            txt1.setText(s1);

        }
    }

    public void onBack(View v){

        finish();
    }

}