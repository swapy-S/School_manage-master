package com.example.scm.DBHelper;
import com.example.scm.Bean.Bean_Library;
import com.example.scm.Constants.Constant;
import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;



import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_Library extends SQLiteAssetHelper {



    public DBHelper_Library(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_Library> getBook() {
        ArrayList<Bean_Library> arrbl = new ArrayList<Bean_Library>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select * from Library where StudentId="+""+idofthestudent;
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_Library bl = new Bean_Library();
                //bl.setSID(cursor.getInt(cursor.getColumnIndex("StudentId")));
                bl.setBOOK(cursor.getString(cursor.getColumnIndex("BookName")));
                bl.setISSUE(cursor.getString(cursor.getColumnIndex("IssueDate")));
                bl.setDUE(cursor.getString(cursor.getColumnIndex("DueDate")));
                bl.setSUBMIT(cursor.getString(cursor.getColumnIndex("Submit")));


                arrbl.add(bl);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrbl;

    }

}

