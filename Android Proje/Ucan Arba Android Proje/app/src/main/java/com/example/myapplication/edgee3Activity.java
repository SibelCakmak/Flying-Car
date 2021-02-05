package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class edgee3Activity extends AppCompatActivity {
    TextView sonucc;
    Button buttonn;
    Button buttonn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edgee3);
        sonucc = (TextView)findViewById(R.id.textView3);
        buttonn = (Button)findViewById(R.id.button3);
        buttonn1 = (Button)findViewById(R.id.button4);
        int skor = getIntent().getIntExtra("skor",0);
        sonucc.setText(String.valueOf(skor));
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(edgee3Activity.this,MainActivity.class));
                finish();
            }
        });
        buttonn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(edgee3Activity.this,edgee2Activity.class));
                finish();
            }
        });
    }
}
