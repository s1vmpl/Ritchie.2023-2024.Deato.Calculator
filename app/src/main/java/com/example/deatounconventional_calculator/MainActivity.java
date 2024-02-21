package com.example.deatounconventional_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pageTitle;
    TextView result;
    EditText num1;
    EditText num2;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageTitle = (TextView) findViewById(R.id.txtPageTitle);
        result = (TextView) findViewById(R.id.txtResult);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        add = (Button) findViewById(R.id.btnAdd);
        subtract = (Button) findViewById(R.id.btnSub);
        multiply = (Button) findViewById(R.id.btnMul);
        divide = (Button) findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double sum = myNum1 + myNum2;

                result.setText(String.valueOf(sum));
                //result.setText(""+sum);
            }
        });

                 subtract.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {

                         double myNum1 = Double.parseDouble(num1.getText().toString());
                         double myNum2 = Double.parseDouble(num2.getText().toString());
                         double sum = myNum1 - myNum2;

                         result.setText(String.valueOf(sum));
                     }
                 });

                          multiply.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View v) {

                                  double myNum1 = Double.parseDouble(num1.getText().toString());
                                  double myNum2 = Double.parseDouble(num2.getText().toString());
                                  double sum = myNum1 * myNum2;

                                  result.setText(String.valueOf(sum));
                              }
                          });

                                   divide.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           double myNum1 = Double.parseDouble(num1.getText().toString());
                                           double myNum2 = Double.parseDouble(num2.getText().toString());
                                           double sum = myNum1 / myNum2;

                                           result.setText(String.valueOf(sum));
                                       }
                                   });
    }
}