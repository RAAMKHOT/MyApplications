package com.sqllitedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBoperation extends SQLiteOpenHelper 
{
	String createtbelequry="CREATE TABLE List1(Pid INTEGER Primary key AUTOINCREMENT,Name Text)";
	public DBoperation(Context context) 
	{
		super(context, "DB1", null,1);
		Log.d("DEBUG","DB cretad");
	}
	@Override
	public void onCreate(SQLiteDatabase sqldb) 
	{
		sqldb.execSQL(createtbelequry);
		Log.d("DEBUG","Table cretaed");
	}
	
	public void insertdata(String inputdata,DBoperation db)
	{
		SQLiteDatabase sqldb=db.getWritableDatabase();
		ContentValues value=new ContentValues();
		value.put("Name", inputdata);
		value.put("qty", 2);
		
		sqldb.insert("List1", "n/a", value);
	}
	
	public Cursor retriveinfo(DBoperation db)
	{
		SQLiteDatabase sqldb=db.getReadableDatabase();
		String[] columns={"Nmae"};
		Cursor cursor=sqldb.query("List", columns, null, null, null, null, null);
		return cursor;
	}
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) 
	{

	}
}
