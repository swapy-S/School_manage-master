package com.example.scm.DBHelper;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

import com.example.scm.Bean.Bean_Profile;



import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;
import static com.example.scm.Constants.Constant.studentclass;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_Profile extends SQLiteAssetHelper {



    public DBHelper_Profile(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_Profile> getTitle() {
        ArrayList<Bean_Profile> arrbp = new ArrayList<Bean_Profile>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select S.StudentId,S.StudentPhoto,S.StudentName,S.FatherName, S.FatherContact,S.MotherName,S.MotherContact,S.StudentAddress,S.StudentClass,S.DateOfBirth,T.TeacherName from Student S inner join Teacher T where S.TeacherId=T.TeacherId and S.StudentId="+""+idofthestudent;
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_Profile bp = new Bean_Profile();
                bp.setSID(cursor.getInt(cursor.getColumnIndex("StudentId")));
                bp.setStudentdisp(cursor.getBlob(cursor.getColumnIndex("StudentPhoto")));
                bp.setSNAME(cursor.getString(cursor.getColumnIndex("StudentName")));
                bp.setFNAME(cursor.getString(cursor.getColumnIndex("FatherName")));
                bp.setFCONTACT(cursor.getString(cursor.getColumnIndex("FatherContact")));
                bp.setMNAME(cursor.getString(cursor.getColumnIndex("MotherName")));
                bp.setMCONTACT(cursor.getString(cursor.getColumnIndex("MotherContact")));
                bp.setADD(cursor.getString(cursor.getColumnIndex("StudentAddress")));
                bp.setCLASS(cursor.getString(cursor.getColumnIndex("StudentClass")));
                bp.setTNAME(cursor.getString(cursor.getColumnIndex("TeacherName")));
                bp.setDOB(cursor.getString(cursor.getColumnIndex("DateOfBirth")));
                studentclass = cursor.getString(cursor.getColumnIndex("StudentClass"));
                arrbp.add(bp);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrbp;

    }

}

