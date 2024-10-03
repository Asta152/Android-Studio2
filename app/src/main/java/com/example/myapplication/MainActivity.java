package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText number1;
    private EditText number2;
    private Button sigma;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        sigma = findViewById(R.id.button2);
        sigma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number1.getText().toString());
                float num2 = Float.parseFloat(number2.getText().toString());
                float res = num1 + num2;
                String res2 = "Hello World";
                result.setText(String.valueOf(res2));
            }
        });
}
    }
