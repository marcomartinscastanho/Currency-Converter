package com.martinscastanho.marco.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        Double conversionRate = 1.14370208;
        EditText amountTextView = findViewById(R.id.amountTextView);
        Double amountInPounds = Double.parseDouble(amountTextView.getText().toString());
        Double amountInEuros = amountInPounds * conversionRate;
        DecimalFormat df = new DecimalFormat("#.##");
        Toast.makeText(this, "£" + df.format(amountInPounds) + " is €" + df.format(amountInEuros), Toast.LENGTH_LONG).show();
    }
}
