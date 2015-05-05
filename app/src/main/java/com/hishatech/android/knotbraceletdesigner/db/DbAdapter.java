package com.hishatech.android.knotbraceletdesigner.db;


import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbAdapter {

    //region ** DbAdapter Main Code **
    private final Context mCtx;
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;

    // Inner private class. Database Helper class for creating and updating
    // database
    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, DbConstants.DATABASE_NAME, null,
                    DbConstants.DATABASE_VERSION);
        }

        // onCreate method is called for the 1st time when database doesn't
        // exist
        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i(DbConstants.TAG, "Creating Database: " + DbConstants
                    .DATABASE_NAME);
            db.execSQL(DbConstants.BRACELET_TABLE_CREATE_STRING);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion,
                              int newVersion) {
            Log.w(DbConstants.TAG, "Upgrading " + DbConstants.DATABASE_NAME
                    + " from version "
                    + oldVersion + " to " + newVersion);
            db.execSQL("DROP TABLE IF EXISTS '" + DbConstants
                    .TABLE_BRACELET + "'");
            onCreate(db);
        }
    }

    /**
     * Constructor - takes the context to allow the database to be
     * opened/created
     *
     * @param ctx the Context within which to work
     */
    public DbAdapter(Context ctx) {
        this.mCtx = ctx;
    }

    /**
     * This method is used for creating/opening connection
     *
     * @return instance of DatabaseUtil
     * @throws SQLException
     */
    public DbAdapter open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
        mDb = mDbHelper.getWritableDatabase();
        return this;
    }

    /**
     * This method is used for closing the connection.
     */
    public void close() {
        mDbHelper.close();
    }
    //endregion

}
