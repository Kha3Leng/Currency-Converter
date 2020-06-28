package com.example.currencycoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText amount = (EditText) findViewById(R.id.amount);

        if (amount.getText().toString().isEmpty())
            Toast.makeText(this, "Enter amount first", Toast.LENGTH_LONG).show();
        else{
            int kyat = Integer.valueOf(amount.getText().toString());
            int dollar = kyat* 1500;
            Toast.makeText(this, kyat +" K is "+dollar+"$", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}