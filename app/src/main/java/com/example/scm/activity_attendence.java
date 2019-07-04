package com.example.scm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scm.Bean.Bean_Attendence;
import com.example.scm.DBHelper.DBHelper_Attendence;

import java.util.ArrayList;

import static java.lang.Math.round;


public class activity_attendence extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);

        TextView ta= findViewById(R.id.ta);
        TextView tl= findViewById(R.id.tl);
        TextView th= findViewById(R.id.th);
        TextView tp= findViewById(R.id.tp);
        TextView tt= findViewById(R.id.totalattendence);
         final TextView status = findViewById(R.id.status);

         ArrayList<Bean_Attendence> arrba =new ArrayList<>();
        DBHelper_Attendence dbha = new DBHelper_Attendence(this);


//        double x =  round(arrba.get(0).getTotalatt()*100)/100;
        arrba = dbha.getAttendence();
        ta.setText(""+ arrba.get(0).getTotala());
        tl.setText(""+ arrba.get(0).getTotall());
        th.setText(""+ arrba.get(0).getTotalh());
        tp.setText(""+arrba.get(0).getTotalp());
        tt.setText(""+round(arrba.get(0).getTotalatt())+"%");

        final String status3 = arrba.get(0).getD03_06_2019();
        final String status4 = arrba.get(0).getD04_06_2019();
        final String status5 = arrba.get(0).getD05_06_2019();
        final String status6 = arrba.get(0).getD06_06_2019();
        final String status7 = arrba.get(0).getD07_06_2019();
        final String status8 = arrba.get(0).getD08_06_2019();
        final String status9 = arrba.get(0).getD09_06_2019();
        final String status10 = arrba.get(0).getD10_06_2019();
        CalendarView cv = findViewById(R.id.calender);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                String Date = ""+dayOfMonth+"/"+""+(month+1)+"/"+""+year;

                if(Date.equals("3/6/2019")){
                    status.setText(status3);

                }
                else if(Date.equals("4/6/2019")){
                    status.setText(status4);
                }
                else if(Date.equals("5/6/2019")){
                    status.setText(status5);
                }
                else if(Date.equals("6/6/2019")){
                    status.setText(status6);
                }
                else if(Date.equals("7/6/2019")){
                    status.setText(status7);
                }
                else if(Date.equals("8/6/2019")){
                    status.setText(status8);
                }
                else if(Date.equals("9/6/2019")){
                    status.setText(status9);
                }
                else if(Date.equals("10/6/2019")){
                    status.setText(status10);
                }
                else status.setText("Data Not Entered");

            }
        });
    }
}
