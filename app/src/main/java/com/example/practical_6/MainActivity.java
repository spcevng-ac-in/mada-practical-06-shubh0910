package com.example.practical_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG =  MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doAddition(View v){
        EditText e1= findViewById(R.id.ed1);
        EditText e2= findViewById(R.id.ed2);
        TextView t= findViewById(R.id.tv);
        double d1=Double.parseDouble(e1.getText().toString());
        double d2=Double.parseDouble(e2.getText().toString());
        double d3=d1+d2;
        String s= String.valueOf(d3);
        t.setText(s);
    }
    public void doSubtraction(View v){
        EditText e1= findViewById(R.id.ed1);
        EditText e2= findViewById(R.id.ed2);
        TextView t= findViewById(R.id.tv);
        double d1=Double.parseDouble(e1.getText().toString());
        double d2=Double.parseDouble(e2.getText().toString());
        double d3=d1-d2;
        String s= String.valueOf(d3);
        t.setText(s);
    }
    public void doDivision(View v){
        EditText e1= findViewById(R.id.ed1);
        EditText e2= findViewById(R.id.ed2);
        TextView t= findViewById(R.id.tv);
        double d1=Double.parseDouble(e1.getText().toString());
        double d2=Double.parseDouble(e2.getText().toString());
        double d3=d1/d2;
        String s= String.valueOf(d3);
        t.setText(s);
    }
    public void doMultiplication(View v){
        EditText e1= findViewById(R.id.ed1);
        EditText e2= findViewById(R.id.ed2);
        TextView t= findViewById(R.id.tv);
        double d1=Double.parseDouble(e1.getText().toString());
        double d2=Double.parseDouble(e2.getText().toString());
        double d3=d1*d2;
        String s= String.valueOf(d3);
        t.setText(s);
        Log.d(TAG, String.valueOf(d1));
        Log.d(TAG, String.valueOf(d2));


    }
}