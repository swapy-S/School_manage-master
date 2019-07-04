package com.example.scm.DBHelper;


import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;


import com.example.scm.Bean.Bean_Achievement;
import com.example.scm.Bean.Bean_Calender;
import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;



import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_Calender extends SQLiteAssetHelper{



    public DBHelper_Calender(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_Calender> getCal() {
        ArrayList<Bean_Calender> arrbcal = new ArrayList<Bean_Calender>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select * from Calender";
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_Calender ba = new Bean_Calender();
                ba.setCaldate(cursor.getString(cursor.getColumnIndex("Date")));
                ba.setDescription(cursor.getString(cursor.getColumnIndex("Description")));

//                System.out.println(cursor.getString(cursor.getColumnIndex("Adate")));


                arrbcal.add(ba);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrbcal;

    }

}

