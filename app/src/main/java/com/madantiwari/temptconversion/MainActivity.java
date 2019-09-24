package com.madantiwari.temptconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etCelcius, etFahren;
    private Button btnCtoF, btnFtoC;
    double celcius, fahren, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCelcius = findViewById(R.id.etCelcius);
        etFahren = findViewById(R.id.etFahren);
        btnCtoF = findViewById(R.id.btnCtoF);
        btnFtoC = findViewById(R.id.btnFtoC);

        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celcius=Double.parseDouble(etCelcius.getText().toString());
                result = (celcius*9/5)+32;

                Toast.makeText(MainActivity.this, " It's Fahrenheit value is "+result, Toast.LENGTH_LONG).show();
            }
        });

        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fahren = Double.parseDouble(etFahren.getText().toString());
                result = ((fahren-32)*5)/9;

                Toast.makeText(MainActivity.this, "It's Celcius value is "+result, Toast.LENGTH_LONG).show();
            }
        });
    }
}
