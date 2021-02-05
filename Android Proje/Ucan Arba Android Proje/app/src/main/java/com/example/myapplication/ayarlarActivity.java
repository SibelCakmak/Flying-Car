package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ayarlarActivity extends AppCompatActivity {
    MediaPlayer müzik1;
    MediaPlayer müzik2;
    MediaPlayer müzik3;
    MediaPlayer müzik4;
    MediaPlayer müzik5;
    MediaPlayer müzik6;
    MediaPlayer müzik7;
    MediaPlayer müzik8;
    MediaPlayer müzik9;
    MediaPlayer müzik10;
    MediaPlayer müzik11;
    MediaPlayer müzik12;
    MediaPlayer müzik13;




    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;

    Button kapat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b10 = (Button)findViewById(R.id.b10);
        b11 = (Button)findViewById(R.id.b11);
        b12 = (Button)findViewById(R.id.b12);
        b13 = (Button)findViewById(R.id.b13);
        kapat = (Button)findViewById(R.id.kapat);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik1 = MediaPlayer.create(getApplicationContext(),R.raw.uyaha);
                müzik1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik2 = MediaPlayer.create(getApplicationContext(),R.raw.uykularharamoldu);
                müzik2.start();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik3 = MediaPlayer.create(getApplicationContext(),R.raw.ezel);
                müzik3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik4 = MediaPlayer.create(getApplicationContext(),R.raw.bts);
                müzik4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik5 = MediaPlayer.create(getApplicationContext(),R.raw.fonn);
                müzik5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik6 = MediaPlayer.create(getApplicationContext(),R.raw.dhemee);
                müzik6.start();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik7 = MediaPlayer.create(getApplicationContext(),R.raw.reymen);
                müzik7.start();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik8 = MediaPlayer.create(getApplicationContext(),R.raw.ela);
                müzik8.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik9 = MediaPlayer.create(getApplicationContext(),R.raw.blackpink);
                müzik9.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik10 = MediaPlayer.create(getApplicationContext(),R.raw.sanadorgru);
                müzik10.start();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik11 = MediaPlayer.create(getApplicationContext(),R.raw.yalin);
                müzik11.start();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik12 = MediaPlayer.create(getApplicationContext(),R.raw.hareketli);
                müzik12.start();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                müzik13 = MediaPlayer.create(getApplicationContext(),R.raw.ppap);
                müzik13.start();
            }
        });

        kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Müzik kapatıldı",Toast.LENGTH_LONG).show();
                müzik1.pause();
                müzik2.pause();
                müzik3.pause();
                müzik4.pause();
                müzik5.pause();
                müzik6.pause();
                müzik7.pause();
                müzik8.pause();
                müzik9.pause();
                müzik10.pause();
                müzik11.pause();
                müzik12.pause();
                müzik13.pause();

            }
        });

    }
}

