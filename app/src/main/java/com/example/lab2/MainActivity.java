package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;
    private LinearLayout editTextNumber, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=(Spinner)findViewById(R.id.spinner1);
        String[] km=new String[]{"на 10км","на 100км","на 200км"};
        ArrayAdapter<CharSequence> adapter1=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,km);
        spinner1.setAdapter(adapter1);
    }

    public void onClickStart(View v) {
        EditText MinusFuel=(EditText)findViewById(R.id.editTextNumber);
        EditText S=(EditText)findViewById(R.id.editTextNumber2);
        EditText fuelCost=(EditText)findViewById(R.id.editTextNumber3);
        TextView result1=(TextView) findViewById(R.id.editTextNumber4);
        TextView result2=(TextView) findViewById(R.id.editTextNumber5);

        float el1=Float.parseFloat(MinusFuel.getText().toString());
        float el2=Float.parseFloat(S.getText().toString());
        float result=el1/el2*100;
        result1.setText(Float.toString(result));
        float el3=Float.parseFloat(fuelCost.getText().toString());
        float resMoney=el1/el2*el3;
        result2.setText(Float.toString(resMoney));
    }






    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}