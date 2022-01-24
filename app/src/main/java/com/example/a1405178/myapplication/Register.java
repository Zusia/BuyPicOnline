package com.example.a1405178.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Register extends SQLiteOpenHelper {

    public static final String CUSTOMER = "customer.db";
    public static final String CUSTOMERS = "customers";
    public static final String CID = "ID";
    public static final String CName = "Name";
    public static final String ContactNumber = "Contact";
    public static final String DeliveryAddress = "Address";
    public static final String CEmail = "Email";

   /* public static final String ARTIST = "artists.db";
    public static final String ARTISTS= "artist";
    public static final String AName = "Name";
    public static final String ACountry = "Country";

    public static final String ART_OBJECT = "artists.db";
    public static final String ARTISTS= "artist";
    public static final String AName = "Name";
    public static final String ACountry = "Country*/

    public Register(Context context) {
        super(context, CUSTOMER, null, 1);
        }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + CUSTOMERS + "(CID INTEGER PRIMARY KEY AUTOINCREMENT,CName TEXT,ContactNumber INTEGER ,DeliveryAddress TEXT,CEmail TEXT ) ");
      /*  sqLiteDatabase.execSQL("create table" + ARTISTS + " (AName TEXT ,ACountry TEXT) ");
        sqLiteDatabase.execSQL("create table" + ART_OBJECT + " (AID INTEGER PRIMARY KEY AUTOINCREMENT,Year INTEGER,Date DATE) ");
        sqLiteDatabase.execSQL("create table" + ARTISTS + " (AName TEXT ,ACountry TEXT) ");
        sqLiteDatabase.execSQL("create table" + EXHIBITION + " (SDate DATE,EXDate DATE,EndDate DATE) ");
        sqLiteDatabase.execSQL("create table" + SCULPTURES + " (Material TEXT, Height TEXT, Weight TEXT) ");
        sqLiteDatabase.execSQL("create table" + PAINTINGS + " (PaintType TEXT ,PaintStyle TEXT) "); */
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + CUSTOMERS);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String Name, String Address, String Phone, String Email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CName, Name);
        contentValues.put(ContactNumber, Phone);
        contentValues.put(DeliveryAddress, Address);
        contentValues.put(CEmail, Email);
        long result = db.insert(CUSTOMERS, null, contentValues);
        if (result == -1)
            return false;
        else return true;
    }
}
