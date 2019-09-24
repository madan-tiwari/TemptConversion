package com.madantiwari.temptconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    private EditText etFirstnum, etSecondnum, etThirdnum, etFourthnum;
    private Button btnAdd, btnSub;
    int first, seconnd, third, fourth, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //binding
        etFirstnum = findViewById(R.id.etfirst);
        etSecondnum = findViewById(R.id.etsecond);
        etThirdnum = findViewById(R.id.etthird);
        etFourthnum = findViewById(R.id.etfourth);
        btnAdd = findViewById(R.id.btnadd);
        btnSub = findViewById(R.id.btnsub);


        //btn click listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etFirstnum.getText().toString());
                seconnd=Integer.parseInt(etSecondnum.getText().toString());
                third=Integer.parseInt(etThirdnum.getText().toString());
                fourth=Integer.parseInt(etFourthnum.getText().toString());
                result = first + seconnd + third +fourth;

                //output
                Toast.makeText(CalculatorActivity.this, "Addition is "+result, Toast.LENGTH_LONG).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etFirstnum.getText().toString());
                seconnd=Integer.parseInt(etSecondnum.getText().toString());
                third=Integer.parseInt(etThirdnum.getText().toString());
                fourth=Integer.parseInt(etFourthnum.getText().toString());
                result = first - seconnd - third - fourth;

                Toast.makeText(CalculatorActivity.this, "Sub is"+result, Toast.LENGTH_LONG).show();
            }
        });
    }
}
