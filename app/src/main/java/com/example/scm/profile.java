package com.example.scm;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    //Button b1,b2;
    //    LinearLayout papaLay, momLay;

    TextView papa_txt,mom_txt,add_txt,mcontact,fcontact;
    ImageView papa_img,mom_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        b1 = (Button) findViewById(R.id.button5);
//        b2 = (Button) findViewById(R.id.button6);
//        papaLay = (LinearLayout) findViewById(R.id.papa_name);
//        momLay = (LinearLayout) findViewById(R.id.mom_name);

        add_txt =  findViewById(R.id.add_txt);
        papa_img = (ImageView) findViewById(R.id.papa_img);
        papa_txt = (TextView) findViewById(R.id.fnm);
        mom_img = (ImageView) findViewById(R.id.mom_img);
        mom_txt = (TextView) findViewById(R.id.mnm);
        fcontact = findViewById(R.id.fc);
        mcontact = findViewById(R.id.mc);




    }



//    public void parent(View v){
////        papaLay.setVisibility(View.VISIBLE);
////        momLay.setVisibility(View.VISIBLE);
//        papa_img.setVisibility(v.VISIBLE);
//        papa_txt.setVisibility(v.VISIBLE);
//        mom_img.setVisibility(v.VISIBLE);
//        mom_txt.setVisibility(v.VISIBLE);
//        fcontact.setVisibility(v.VISIBLE);
//        mcontact.setVisibility(v.VISIBLE);
//        add_txt.setVisibility(v.GONE);
//        b1.setBackgroundColor(Color.parseColor("#0041D5"));
//        b2.setBackgroundColor(Color.parseColor("#D6D7D7"));
//    }
//    public void add(View w){
////        papaLay.setVisibility(View.GONE);
////        momLay.setVisibility(View.GONE);
//        papa_img.setVisibility(w.GONE);
//        papa_txt.setVisibility(w.GONE);
//        mom_txt.setVisibility(w.GONE);
//        mom_img.setVisibility(w.GONE);
//        mcontact.setVisibility(w.GONE);
//        fcontact.setVisibility(w.GONE);
//        add_txt.setVisibility(w.VISIBLE);
//        b1.setBackgroundColor(Color.parseColor("#D6D7D7"));
//        b2.setBackgroundColor(Color.parseColor("#0041D5"));
//
//    }
}