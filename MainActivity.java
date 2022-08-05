package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void buttonClick(View v){
        //getting the GUI id of RadioGroup
        RadioGroup radioGroupId = (RadioGroup) findViewById(R.id.radioGroup);

        //getting the selected RadioButton form RadioGroup
        int selectedID = radioGroupId.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedID);

        //Creating intent to go to SecondActivity and output the selected RadioButton
        Intent myIntent = new Intent(this, SecondActivity.class);
        myIntent.putExtra("Radio", radioButton.getText());
        startActivity(myIntent);
    }

    public void otherButtonClick(View v){
        System.out.println("Hi");
    }

}