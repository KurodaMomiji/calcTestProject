package com.ibrahim.myfirstappcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numA;
    EditText numB;
    Button addnum;
    Button subnum;
    Button mulnum;
    Button divnum;
    TextView dispResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numA = (EditText)findViewById(R.id.num1);
        numB = (EditText)findViewById(R.id.num2);
        addnum = (Button)findViewById(R.id.addButton);
        subnum = (Button)findViewById(R.id.subButton);
        mulnum = (Button)findViewById(R.id.mulButton);
        divnum = (Button)findViewById(R.id.divButton);
        dispResult = (TextView)findViewById(R.id.result);
    }

    /** called for addition */
    public void addNum(View view) {
        // Addition
        dispResult.setText(Integer.toString(getA()+getB()));
    }

    /** called for subtraction */
    public void subNum(View view) {
        // Subtraction
        dispResult.setText(Integer.toString(getA()-getB()));
    }

    /** called for multiplication */
    public void mulNum(View view) {
        // Multiplication
        dispResult.setText(Integer.toString(getA()*getB()));
    }

    /** called for division */
    public void divNum(View view) {
        // Division
        dispResult.setText(Integer.toString(getA()/getB()));
    }


    /** get value from first textbox and return it when this function is called */
    public Integer getA(){
        try {
            return Integer.parseInt(numA.getText().toString());
        } catch(NumberFormatException ex){
            return 0;
        }
    }

    /** get value from second textbox and return it when this function is called */
    public Integer getB(){
        try {
            return Integer.parseInt(numB.getText().toString());
        } catch(NumberFormatException ex){
            return 0;
        }
    }

}
