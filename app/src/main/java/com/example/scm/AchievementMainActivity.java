package com.example.scm;



import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.scm.Adapter.Adapter_Achievement;
import com.example.scm.Bean.Bean_Achievement;
import com.example.scm.DBHelper.DBHelper_Achievement;

import java.util.ArrayList;



public class AchievementMainActivity extends AppCompatActivity {


    DBHelper_Achievement dba;
    ArrayList<Bean_Achievement> arrba;
    ListView lst;

    void init(){
        dba  = new DBHelper_Achievement(this);
        lst = (ListView) findViewById(R.id.Achievement_list);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement_main);
        init();
        //Toast.makeText(getApplicationContext(),"Record found="+dbp.getTitle(),Toast.LENGTH_LONG).show();
        arrba= dba.getAchievement();
        lst.setAdapter(new Adapter_Achievement(this, arrba));



    }




}

