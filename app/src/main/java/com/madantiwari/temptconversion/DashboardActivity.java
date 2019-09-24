package com.madantiwari.temptconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    Button btncalc, btntemp, btnsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btncalc=findViewById(R.id.btnCalc);
        btntemp=findViewById(R.id.btnTemp);
        btnsi=findViewById(R.id.btnSI);

        btncalc.setOnClickListener(this);
        btntemp.setOnClickListener(this);
        btnsi.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnCalc){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnTemp){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.btnTemp){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);

        }

    }
}
