package com.project.first.database;

import android.provider.BaseColumns;

public class DbContract {
	
	public DbContract(){}
	
	public static abstract class FitBit implements BaseColumns {
        public static final String TABLE_NAME = "Heartrate";
        public static final String COLUMN_NAME_RATE_ID = "rateid";
        public static final String COLUMN_NAME_TRACKER = "tracker";
        public static final String COLUMN_NAME_HEART_RATE = "heartrate";
        public static final String COLUMN_NAME_DATE = "date";

}
	public static abstract class FitBit_One implements BaseColumns {
        public static final String TABLE_NAME = "Activity";
        public static final String COLUMN_NAME_ACTIVITY_ID = "activityid";
        public static final String COLUMN_NAME_ACTIVITY = "activity";
        public static final String COLUMN_NAME_DISTANCE = "distance";
        public static final String COLUMN_NAME_DATE = "date";

}
}