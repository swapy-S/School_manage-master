package com.example.scm;
import com.example.scm.Adapter.Adapter_Fees;
import com.example.scm.DBHelper.DBHelper_Fees;
import com.example.scm.Bean.Bean_Fees;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;



public class FeesActivity extends AppCompatActivity {


    DBHelper_Fees dbf;
    ArrayList<Bean_Fees> arrbf;
    ListView lst;

    void init(){
        dbf  = new DBHelper_Fees(this);
        lst = (ListView) findViewById(R.id.fee_list);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fees);
        init();
        //Toast.makeText(getApplicationContext(),"Record found="+dbp.getTitle(),Toast.LENGTH_LONG).show();
        arrbf= dbf.getFee();
        lst.setAdapter(new Adapter_Fees(this, arrbf));



    }




}

