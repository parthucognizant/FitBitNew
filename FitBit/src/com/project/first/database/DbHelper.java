package com.project.first.database;


import com.project.first.database.DbContract.FitBit;
import com.project.first.database.DbContract.FitBit_One;
import com.project.first.util.Constants;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * this class helps me create a DB and its table
 * @author FitBit
 *
 */
public class DbHelper extends SQLiteOpenHelper {
	
	public static final String DATABASE_NAME = "FitBit.db";
	public static final int DATABASE_VERSION = 1;
	private static final String TAG = "DbHelper";
	
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	private static final String SQL_CREATE_ENTRIES =
	    "CREATE TABLE " + FitBit.TABLE_NAME + " (" +
	    FitBit.COLUMN_NAME_RATE_ID + " INTEGER PRIMARY KEY," +
	    FitBit.COLUMN_NAME_TRACKER + TEXT_TYPE +COMMA_SEP +
	    FitBit.COLUMN_NAME_HEART_RATE + TEXT_TYPE +COMMA_SEP +
	    FitBit.COLUMN_NAME_DATE + TEXT_TYPE +
	     // Any other options for the CREATE command
	    " )";
	
	private static final String SQL_CREATE_ENTRIES_ONE =
		    "CREATE TABLE " + FitBit_One.TABLE_NAME + " (" +
		    FitBit_One.COLUMN_NAME_ACTIVITY_ID + " INTEGER PRIMARY KEY," +
		    FitBit_One.COLUMN_NAME_ACTIVITY + TEXT_TYPE +COMMA_SEP +
		    FitBit_One.COLUMN_NAME_DISTANCE + TEXT_TYPE +COMMA_SEP +
		    FitBit_One.COLUMN_NAME_DATE + TEXT_TYPE +
		     // Any other options for the CREATE command
		    " )";

	public DbHelper(Context context) {
		super(context, DATABASE_NAME,null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		Log.i(TAG, Constants.log_info.onCreate);
		db.execSQL(SQL_CREATE_ENTRIES);
		db.execSQL(SQL_CREATE_ENTRIES_ONE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.i(TAG, Constants.log_info.onUpgrade);
		
	}
	
	
	
}