package com.example.lesson6_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;


public class DBhelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Value.db";


    // Static Values for the table
    public static final String TABLE_NAME = "value_table";
    public static final String COLUMN_NAME_VALUE_TITLE = "value_title";
    public static final String COLUMN_NAME_VALUE_CONTENT = "value_content";

    public DBhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    // this one only run when the db is created
    @Override
    public void onCreate(SQLiteDatabase db) {


        // Create the table
        String createQuery = "CREATE TABLE "
                + TABLE_NAME +
                " (value_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_NAME_VALUE_TITLE + " TEXT, "
                + COLUMN_NAME_VALUE_CONTENT + " TEXT);";

        db.execSQL(createQuery);
    }

    // called when the Version number is updated
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    // add into method
    public boolean addValue(String intoTitle, String intoContent) {


        SQLiteDatabase db = this.getWritableDatabase(); // this class that has the SQLiteOpenHelper


        // kinda an Intent for databases
        ContentValues contentValues = new ContentValues();

        // add the data
        contentValues.put(COLUMN_NAME_VALUE_TITLE, intoTitle);
        contentValues.put(COLUMN_NAME_VALUE_CONTENT, intoContent);

        // .insert returns the PK for the new row
        long value_id = db.insert(TABLE_NAME, null, contentValues);

        if (value_id == -1) {
            Log.d("SET", "addValue: Something didnt work");
            return false;
        } else {
            Log.d("SET", "addValue: All is well");
            return true;
        }


    }

    public ArrayList<ValueBean> getValue(ArrayList<ValueBean> valueBeans) {

        SQLiteDatabase db = this.getWritableDatabase(); // this class that has the SQLiteOpenHelper


        String selectAll = "SELECT " + COLUMN_NAME_VALUE_TITLE + ", " + COLUMN_NAME_VALUE_CONTENT + " FROM " + TABLE_NAME;

        Cursor cursor = db.rawQuery(selectAll, null);

        if (cursor.moveToFirst()) {


            while (cursor.moveToNext()) {

             //   int value_id = cursor.getInt(0);
                String value_title = cursor.getString(0);
                String value_content = cursor.getString(1);
                Log.d("SET", "wholeTable: title:" + value_title + " content:" + value_content);

                ValueBean localBean = new ValueBean();
                localBean.setValueTitle(value_title);
                localBean.setValueContent(value_content);
                valueBeans.add(localBean);


            }

            // dont forget to close them
            cursor.close();
            db.close();

        }


        return valueBeans;
    }

    // get the whole table
    public void wholeTable() {

        SQLiteDatabase db = this.getWritableDatabase(); // this class that has the SQLiteOpenHelper


        String selectAll = "SELECT * FROM " + TABLE_NAME;

        Cursor cursor = db.rawQuery(selectAll, null);

        if (cursor.moveToFirst()) {


            while (cursor.moveToNext()) {

                int value_id = cursor.getInt(0);
                String value_title = cursor.getString(1);
                String value_content = cursor.getString(2);
                Log.d("SET", "wholeTable: id:" + value_id + " title:" + value_title + " content:" + value_content);


            }

            // dont forget to close them
            cursor.close();
            db.close();


        }


    }


}
