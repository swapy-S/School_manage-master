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
import com.example.scm.Bean.Bean_News;
import com.example.scm.Constants.Constant;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;



import java.util.ArrayList;

import static com.example.scm.Constants.Constant.idofthestudent;

/**
 * Created by jigar on 5/24/2019.
 */

public class DBHelper_News extends SQLiteAssetHelper{



    public DBHelper_News(Context context) {
        super(context, Constant.DBname, null, Constant.DBversion);
    }

    public  ArrayList<Bean_News> getNews() {
        ArrayList<Bean_News> arrbn = new ArrayList<Bean_News>();
        SQLiteDatabase db = getReadableDatabase();
        String strQuery="select * from News ";
        Cursor cursor = db.rawQuery(strQuery,null);
        if (cursor.moveToFirst()) {
            do {
                Bean_News bn = new Bean_News();
                bn.setNewsno(cursor.getInt(cursor.getColumnIndex("NewsNo")));
                bn.setNewsdate(cursor.getString(cursor.getColumnIndex("NewsDate")));
                bn.setNews(cursor.getString(cursor.getColumnIndex("News")));
//                System.out.println(cursor.getString(cursor.getColumnIndex("Adate")));


                arrbn.add(bn);


            }
            while (cursor.moveToNext());

        }

        db.close();
        return arrbn;

    }

}

