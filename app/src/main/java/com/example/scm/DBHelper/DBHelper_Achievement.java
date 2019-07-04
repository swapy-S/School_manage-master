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
import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;



import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_Achievement extends SQLiteAssetHelper{



    public DBHelper_Achievement(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_Achievement> getAchievement() {
        ArrayList<Bean_Achievement> arrba = new ArrayList<Bean_Achievement>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select * from Achievement where StudentId="+""+idofthestudent;;
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_Achievement ba = new Bean_Achievement();
                ba.setSid(cursor.getInt(cursor.getColumnIndex("StudentId")));
                ba.setAchieve(cursor.getString(cursor.getColumnIndex("StudentAchievement")));
                ba.setAdate(cursor.getString(cursor.getColumnIndex("AchievementDate")));
//                System.out.println(cursor.getString(cursor.getColumnIndex("Adate")));


                arrba.add(ba);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrba;

    }

}

