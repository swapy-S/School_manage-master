package com.example.scm;



import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scm.Adapter.Adapter_Remarks;
import com.example.scm.Adapter.Adapter_Results;
import com.example.scm.Bean.Bean_Remarks;
import com.example.scm.Bean.Bean_Results;
import com.example.scm.DBHelper.DBHelper_Remarks;
import com.example.scm.DBHelper.DBHelper_Results;

import java.util.ArrayList;



public class Results_MainActivity extends AppCompatActivity {


    DBHelper_Results dbr;
    ArrayList<Bean_Results> arrbr;
    ListView lst;

    void init(){
        dbr  = new DBHelper_Results(this);
        lst = (ListView) findViewById(R.id.Results_list);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results__main);
        init();
        //Toast.makeText(getApplicationContext(),"Record found="+dbp.getTitle(),Toast.LENGTH_LONG).show();
        arrbr= dbr.getResult();
        lst.setAdapter(new Adapter_Results(this, arrbr));



    }




}

