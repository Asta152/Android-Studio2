package com.example.myapplication;

import static android.app.ProgressDialog.show;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
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

        TextView mainText = findViewById(R.id.mainText);
        Button btnSecond = findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                    showInfo(mainText.getText().toString(), btnSecond);
                    showInfoAlert("you want to close appliction?");
            }
        });

        }
        public void btnClick(View v){
            showInfo(((Button)v).getText().toString(),((Button)v) );
        }
        private void showInfoAlert(String text){

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Big alert")
                    .setMessage(text)
                    .setCancelable(false)
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("no", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            AlertDialog dialo = builder.create();
            dialo.show();

        }

        private void showInfo(String text, Button btn){
            btn.setText("Already done");
            btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
}
