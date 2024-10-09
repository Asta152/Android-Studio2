package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ImageButton VinLand_Saga, Berserk;
    private MediaPlayer ThorfinRoar, GutsRoar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VinLand_Saga = findViewById(R.id.imageButton);
        Berserk = findViewById(R.id.imageButton12);
        ThorfinRoar = MediaPlayer.create(this, R.raw.);
        GutsRoar = MediaPlayer.create(this, R.raw.);

        VinLand_Saga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(ThorfinRoar);
            }
        });
        Berserk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(GutsRoar);
            }
        });
    }


    private void soundPlay(MediaPlayer sound) {

            sound.start();
            if(sound.isPlaying()){
                sound.stop();
            }
            sound.start();

    }

}
