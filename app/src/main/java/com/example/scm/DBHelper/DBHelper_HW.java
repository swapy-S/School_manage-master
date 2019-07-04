package com.example.scm.DBHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

import com.example.scm.Bean.Bean_HW;
import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


import java.util.ArrayList;

import static com.example.scm.Constants.Constant.studentclass;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_HW extends SQLiteAssetHelper{



    public DBHelper_HW(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_HW> getHW() {
        ArrayList<Bean_HW> arrbh = new ArrayList<Bean_HW>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select hw.HWDate,hw.ClassHW, t.TeacherName from HW hw inner join Teacher t where hw.ClassTeacher= t.TeacherId" ;
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_HW bh = new Bean_HW();
                // bh.setSclass(cursor.getString(cursor.getColumnIndex("Class")));
                bh.setHW(cursor.getString(cursor.getColumnIndex("hw.ClassHW")));
                bh.setHWdate(cursor.getString(cursor.getColumnIndex("hw.HWDate")));

                bh.setCteacher(cursor.getString(cursor.getColumnIndex("t.TeacherName")));

                arrbh.add(bh);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrbh;

    }

}

