package com.example.dejesus_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText YEStext,NOtext;
    Button Plus,Minus,Divide,Multiply,Equals;
    TextView Result;
    double YES,NO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Plus=findViewById(R.id.Plus);
        Minus=findViewById(R.id.Minus);
        Divide=findViewById(R.id.Divide);
        Multiply=findViewById(R.id.Multiply);
        Equals=findViewById(R.id.Equals);

        Result=findViewById(R.id.Answer);

        Plus.setOnClickListener(this);
        Minus.setOnClickListener(this);
        Divide.setOnClickListener(this);
        Multiply.setOnClickListener(this);
        Equals.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        YEStext=findViewById(R.id.DEC);
        NOtext=findViewById(R.id.DEC2);

        YES=Double.parseDouble(YEStext.getText().toString());
        NO=Double.parseDouble(NOtext.getText().toString());

        switch (view.getId()){
            case R.id.Plus:
                Result.setText(Double.toString(YES+NO));
                break;
            case  R.id.Minus:
                Result.setText(Double.toString(YES-NO));
                break;
            case  R.id.Divide:
                Result.setText(Double.toString(YES/NO));
                break;
            case R.id.Multiply:
                Result.setText(Double.toString(YES*NO));
                break;
            case R.id.Equals:
                Result.setText(Double.toString(YES=NO));
                break;

        }
    }
}