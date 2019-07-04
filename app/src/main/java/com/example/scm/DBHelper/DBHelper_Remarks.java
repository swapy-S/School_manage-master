package com.example.scm.DBHelper;


import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;


import com.example.scm.Bean.Bean_Remarks;
import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;



import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_Remarks extends SQLiteAssetHelper{



    public DBHelper_Remarks(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_Remarks> getRemarks() {
        ArrayList<Bean_Remarks> arrbl = new ArrayList<Bean_Remarks>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select * from Remark where StudentId="+""+idofthestudent;
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_Remarks bl = new Bean_Remarks();
                bl.setSid(cursor.getInt(cursor.getColumnIndex("StudentId")));
                bl.setRedate(cursor.getString(cursor.getColumnIndex("RemarkDate")));
                bl.setBehave(cursor.getString(cursor.getColumnIndex("Behaviour")));
                bl.setNote(cursor.getString(cursor.getColumnIndex("Note")));



                arrbl.add(bl);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrbl;

    }

}

