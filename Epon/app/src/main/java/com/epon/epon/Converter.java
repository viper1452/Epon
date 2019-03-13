package com.epon.epon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Converter extends AppCompatActivity implements View.OnClickListener {
    TextView tvResult, tvDollars, tvEuro, tvYen, tvWon;
    Button btnDollars, btnEuro, btnYen, btnWon;
    double dollars, resultD, euro, resultE, yen, resultY, won, resultW, amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        tvResult = findViewById(R.id.tvResult);
        tvDollars = findViewById(R.id.tvDollars);
        tvEuro = findViewById(R.id.tvEuro);
        tvYen = findViewById(R.id.tvYen);
        tvWon = findViewById(R.id.tvWon);
        btnDollars = findViewById(R.id.btnDollars);
        btnEuro = findViewById(R.id.btnEuro);
        btnYen = findViewById(R.id.btnYen);
        btnWon = findViewById(R.id.btnWon);

        btnDollars.setOnClickListener(this);
        btnEuro.setOnClickListener(this);
        btnYen.setOnClickListener(this);
        btnWon.setOnClickListener(this);

        Intent intent = getIntent();
        amount = intent.getDoubleExtra("amount", 0);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDollars:
                dollars = 52.76;
                resultD = amount*dollars;

                tvResult.setText("Result ="+resultD);
        }
    }
}
