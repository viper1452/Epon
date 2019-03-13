package com.epon.epon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText etAmount, etMonth;
    TextView tvResult;
    double amount, month, result1, result, days;
    Button btnCompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etAmount = findViewById(R.id.etAmount);
        etMonth = findViewById(R.id.etMonth);
        tvResult = findViewById(R.id.tvResult);
        btnCompute = findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                amount = Double.parseDouble(etAmount.getText().toString());
                month = Double.parseDouble(etMonth.getText().toString());
                days = 30.0;
                result1 = days*month;
                result = result1*amount;

                tvResult.setText(" ₱ "+ result);


            }
        });
        Intent intent = new Intent(this, Converter.class);
        intent.putExtra("amount",result);
        startActivity(intent);
    }
}
