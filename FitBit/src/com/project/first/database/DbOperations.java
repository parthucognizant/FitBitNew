package com.project.first.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.project.first.database.DbContract.FitBit;
import com.project.first.database.DbContract.FitBit_One;
import com.project.first.util.Constants;

/**
 * This class has all DB operations
 * @author Parthasarathi Reddy
 *
 */

public class DbOperations {
	private static final String TAG = "DbOperations";
	SQLiteDatabase database;
	DbHelper dbHelper;

	public DbOperations(Context context){
		dbHelper = new DbHelper(context);
	}
	/**
	 * create a row in table
	 * @param id
	 * @param title
	 * @author Parthasarathi Reddy
	 */
	public void createRow(String tracker, String heartrate,String Date){
		Log.i(TAG, Constants.log_info.createRow);

		ContentValues values = new ContentValues();
		values.put(FitBit.COLUMN_NAME_TRACKER, tracker);
		values.put(FitBit.COLUMN_NAME_HEART_RATE, heartrate);
		values.put(FitBit.COLUMN_NAME_DATE, Date);

		database.insert(FitBit.TABLE_NAME, null, values);
	}
	
	public void createRow_Activity(String activity, String distance,String Date){
		Log.i(TAG, Constants.log_info.createRow);

		ContentValues values = new ContentValues();
		values.put(FitBit_One.COLUMN_NAME_ACTIVITY, activity);
		values.put(FitBit_One.COLUMN_NAME_DISTANCE, distance);
		values.put(FitBit_One.COLUMN_NAME_DATE, Date);

		database.insert(FitBit_One.TABLE_NAME, null, values);
	}

	public void openDb(){
		Log.i(TAG, Constants.log_info.openDb);
		database = dbHelper.getWritableDatabase();
	}
	public void closeDb(){
		Log.i(TAG, Constants.log_info.closeDb);
		database.close();
	}

}