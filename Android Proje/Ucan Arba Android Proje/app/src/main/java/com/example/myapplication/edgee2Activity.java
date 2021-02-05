package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class edgee2Activity extends AppCompatActivity {
    ConstraintLayout ekran;
    ImageView ucanaraba;
    ImageView ates;
    ImageView benzin;
    ImageView tas;
    TextView text;
    ImageView dur;
    int ucanarabax;
    int ucanarabay;
    int ucanarabawidth;
    int ucanarabaheight;
    int ekranwidth;
    int ekranheight;
    int atesx;
    int atesy;
    int benzinx;
    int benziny;
    int tasx;
    int tasy;
    int ucanarabahiz;
    int ateshiz;
    int benzinhiz;
    int tashiz;
    int skor =0;
    Timer t = new Timer();
    Handler h = new Handler();



    boolean hızlanma = false;
    boolean kontrol = false;

     public void onClickImage(){}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edgee2);
        ekran = (ConstraintLayout)findViewById(R.id.cl);
        ucanaraba = (ImageView)findViewById(R.id.imageView);
        ates = (ImageView)findViewById(R.id.imageView4);
        benzin = (ImageView)findViewById(R.id.imageView3);
        tas = (ImageView)findViewById(R.id.imageView11);
        text = (TextView)findViewById(R.id.textView2);



        ates.setX(-180);
        ates.setY(-180);
        benzin.setX(-180);
        benzin.setY(-180);
        tas.setX(-180);
        tas.setY(-180);


        ekran.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(kontrol){
                    if(event.getAction()==MotionEvent.ACTION_DOWN){
                        System.out.println("basıldı");
                        hızlanma = true;
                    }
                    else if(event.getAction()==MotionEvent.ACTION_UP){
                        System.out.println("cekildi");
                        hızlanma = false;
                    }
                }
                else{
                    kontrol = true;
                    ucanarabax = (int)ucanaraba.getX();
                    ucanarabay = (int)ucanaraba.getY();
                    ucanarabawidth = ucanaraba.getWidth();
                    ucanarabaheight = ucanaraba.getHeight();
                    ekranwidth = ekran.getWidth();
                    ekranheight = ekran.getHeight();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.post(new Runnable() {
                                @Override
                                public void run() {
                                    ucanarabahareketleri();
                                    cisimler();
                                    carpisma();
                                }
                            });
                        }
                    },0,20);

                }
                return true;
            }

        });

    }
    public void ucanarabahareketleri(){
        ucanarabahiz = Math.round(ekranheight/60);
        if(hızlanma){
            ucanarabay -= 20;
        }
        else{
            ucanarabay += 20;
        }
        if(ucanarabay<=0){
            ucanarabay=0;
        }
        if(ucanarabay>=ekranheight-ucanarabaheight){
            ucanarabay=ekranheight-ucanarabaheight;
        }
        if(ucanarabax>=ekranwidth-ucanarabawidth){
            t.cancel();
            t = null;
            Intent intentt = new Intent(edgee2Activity.this,yedekEkranActivity.class);
            startActivity(intentt);
        }

        ucanaraba.setY(ucanarabay);
    }

    public  void cisimler(){
        ateshiz = Math.round(ekranwidth/60);
        benzinhiz = Math.round(ekranwidth/60);
        tashiz = Math.round(ekranwidth/60);
        atesx += 20;
        if(atesx<0){
            atesy = (int)Math.floor(Math.random()*ekranheight);
            atesx = ekranwidth-20;
        }
        ates.setX(atesx);
        ates.setY(atesy);

        benzinx -= 20;
        if(benzinx<0){
            benzinx = ekranwidth + 20;
            benziny = (int)Math.floor(Math.random()*ekranheight);
        }
        benzin.setX(benzinx);
        benzin.setY(benziny);

        tasx -= 20;
        if(tasx<0){
            tasx = ekranwidth + 20;
            tasy = (int)Math.floor(Math.random()*ekranheight);
        }
        tas.setX(tasx);
        tas.setY(tasy);
    }

    public void carpisma(){
        int atesmerkezx = atesx + ates.getWidth()/2;
        int atesmerkezy = atesy + ates.getHeight()/2;
        int benzinmerkezx = benzinx + benzin.getWidth()/2;
        int benzinmerkezy = benziny + benzin.getHeight()/2;
        int tasmerkezx = tasx + tas.getWidth()/2;
        int tasmerkezy = tasy + tas.getHeight()/2;
        if(0<=benzinmerkezx && benzinmerkezx<=ucanarabawidth && ucanarabay<= benzinmerkezy && benzinmerkezy<=ucanarabay+ucanarabaheight){
            benzinx = -10;
            skor += 50;
            ucanarabax += 500;
            ucanaraba.setX(ucanarabax);
        }
        if(0<=tasmerkezx && tasmerkezx<=ucanarabawidth && ucanarabay<= tasmerkezy && tasmerkezy<=ucanarabay+ucanarabaheight){
            tasx = -10;
            skor += 100;
        }
        if(0<=atesmerkezx && atesmerkezx<=ucanarabawidth && ucanarabay<= atesmerkezy && atesmerkezy<=ucanarabay+ucanarabaheight){
            atesx = -10;


        }
        text.setText(String.valueOf(skor));
    }
}
