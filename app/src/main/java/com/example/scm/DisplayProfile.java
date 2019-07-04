package com.example.scm;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scm.Adapter.Adapter_Circular;
import com.example.scm.Adapter.Adapter_profile;
import com.example.scm.Bean.Bean_Profile;
import com.example.scm.DBHelper.DBHelper_Profile;
import com.example.scm.R;
import java.util.ArrayList;



public class DisplayProfile extends AppCompatActivity {


    DBHelper_Profile dbp;
    ArrayList<Bean_Profile> arrbp;
    ListView lst;

    void init(){
        dbp  = new DBHelper_Profile(this);
        lst = (ListView) findViewById(R.id.List_profile);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        init();
        //Toast.makeText(getApplicationContext(),"Record found="+dbp.getTitle(),Toast.LENGTH_LONG).show();
        arrbp= dbp.getTitle();
        final Adapter_profile a=new Adapter_profile(this, arrbp);
        lst.setAdapter(a);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                byte[] img =a.getImg((int)id);
                Intent intent= new Intent(getApplicationContext(),IW.class);
                intent.putExtra("img",img);
                startActivity(intent);
            }
        });



    }




}
