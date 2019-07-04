package com.example.scm.DBHelper;


import com.example.scm.Bean.Bean_Attendence;

import com.example.scm.Constants.Constant;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;




import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_Attendence extends SQLiteAssetHelper {



    public DBHelper_Attendence(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_Attendence> getAttendence() {
        ArrayList<Bean_Attendence> arrba = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();


        int ta=0;
        int tp=0;
        int th=0;
        int tl=0;
        double total;
        String[] arr = new String[9];
        String strQuery="select * from Attendence where StudentId="+""+idofthestudent;
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_Attendence bl = new Bean_Attendence();
                //bl.setSID(cursor.getInt(cursor.getColumnIndex("StudentId")));
                bl.setD10_06_2019 (cursor.getString(cursor.getColumnIndex( "10/06/2019")));
                bl.setD09_06_2019  (cursor.getString(cursor.getColumnIndex("09/06/2019")));
                bl.setD08_06_2019 (cursor.getString(cursor.getColumnIndex( "08/06/2019")));
                bl.setD07_06_2019(cursor.getString(cursor.getColumnIndex(  "07/06/2019")));
                bl.setD06_06_2019 (cursor.getString(cursor.getColumnIndex( "06/06/2019")));
                bl.setD05_06_2019  (cursor.getString(cursor.getColumnIndex("05/06/2019")));
                bl.setD04_06_2019 (cursor.getString(cursor.getColumnIndex( "04/06/2019")));
                bl.setD03_06_2019(cursor.getString(cursor.getColumnIndex(  "03/06/2019")));

                for (int i=1;i<=8;i++)
                {
                    arr[i]=cursor.getString(i);
                }
                for (int i=1;i<=8;i++)
                {
                    if(arr[i].equals("H")){th++;}
                    if(arr[i].equals("L")){tl++;}
                    if(arr[i].equals("A")){ta++;}
                    if(arr[i].equals("P")){tp++;}
                }
                total = ((double)tp/(double)(tp+ta))*100;

                bl.setTotala(ta);
                bl.setTotalh(th);
                bl.setTotall(tl);
                bl.setTotalp(tp);
                bl.setTotalatt(total);
                arrba.add(bl);


            }
            while (cursor.moveToNext());

        }

        db.close();
        cursor.close();
        return arrba;

    }

}

