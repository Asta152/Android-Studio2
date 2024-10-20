package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.google.android.material.internal.NavigationMenu;

public class MyDatabase extends SQLiteOpenHelper{

    private Context context;
    private static final String DATABASE_NAME = "BookLibrary.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "User";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_GROUP = "_group";
    private static final String COLUMN_SURNAME = "surname";

    public MyDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                        " (" +
                        COLUMN_SURNAME + "TEXT, " +
                        COLUMN_NAME + "TEXT, " +
                        COLUMN_GROUP + "TEXT) ;";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    void LogIN(String name, String surname, String group){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_SURNAME,surname);
        cv.put(COLUMN_GROUP,group);
    }
}
