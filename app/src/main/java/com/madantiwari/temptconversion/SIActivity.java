package com.madantiwari.temptconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SIActivity extends AppCompatActivity {

    private EditText etPrinciple, etTime, etRate;
    private Button btnCalculate;
    int Principle, Time, Rate, SimpleInterest;
    //TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si);
        //binding

        etPrinciple = findViewById(R.id.etP);
        etTime = findViewById(R.id.etT);
        etRate = findViewById(R.id.etR);
        btnCalculate =findViewById(R.id.btnCal);
        // result = findViewById(R.id.view_result);

        //listener

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Principle = Integer.parseInt(etPrinciple.getText().toString());
                Time = Integer.parseInt(etTime.getText().toString());
                Rate = Integer.parseInt(etRate.getText().toString());
                SimpleInterest = (Principle*Time*Rate)/100;
//output

                Toast.makeText(SIActivity.this, "SimpleInterest is "+SimpleInterest, Toast.LENGTH_LONG).show();

                // result.setText(Integer.toString(Integer.parseInt("Simple Interest is" + SimpleInterest)));

            }
        });

    }
}
