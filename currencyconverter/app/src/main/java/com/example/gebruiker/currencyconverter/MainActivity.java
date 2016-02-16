package com.example.gebruiker.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)(findViewById(R.id.input));
        output = (TextView)(findViewById(R.id.output));
    }
    public void e2d(View view){
        try {
            double inputVal = Double.parseDouble(input.getText().toString());
            output.setText(String.format("$ %.2f", inputVal * 1.1282));
        }  catch (NumberFormatException e) {

        }
    }
    public void d2e(View view){
        try {
        double inputVal =  Double.parseDouble(input.getText().toString());
        output.setText(String.format("$ %.2f",inputVal/1.1282));
        }  catch (NumberFormatException e) {

        }
    }
}
