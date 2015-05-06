package com.hishatech.android.knotbraceletdesigner.db;


public class DbConstants {

    // TAG for Log entries
    public static final String TAG = "DBAdapter";

    // Database name
    public static final String DATABASE_NAME = "knotbracelet.db";

    // Set the database version for upgrade purposes
    public static final int DATABASE_VERSION = 1;

    // table names used in database
    public static final String TABLE_BRACELET = "bracelet";
    public static final String TABLE_BRACELETDETAILS = "braceletdetails";

    // Bracelet table columns
    public static final String BRACELET_ROWID = "_id";
    public static final String BRACELET_NAME = "name";
    public static final String BRACELET_CREATOR = "creator";
    public static final String BRACELET_FILENAME = "filename";
    public static final String BRACELET_STRINGCOUNT = "stringcount";
    public static final String BRACELET_ROWCOUNT = "rowcount";

    // Bracelet table creation string
    public static final String BRACELET_TABLE_CREATE_STRING = "CREATE " +
            "TABLE "
            + TABLE_BRACELET
            + " ("
            + BRACELET_ROWID
            + " integer primary key, "
            + BRACELET_NAME
            + " text not null, "
            + BRACELET_CREATOR
            + " text not null, "
            + BRACELET_FILENAME
            + " text not null, "
            + BRACELET_STRINGCOUNT
            + " integer not null, "
            + BRACELET_ROWCOUNT
            + " integer not null);";

    // Bracelet Details table columns
    public static final String BRACELETDETAILS_ROWID = "_id";
    public static final String BRACELETDETAILS_BRACELETID = "braceletid";
    public static final String BRACELETDETAILS_STRINGLETTER = "stringletter";
    public static final String BRACELETDETAILS_ROWNUMBER = "rownumber";
    public static final String BRACELETDETAILS_HEXCOLOR = "hexcolor";

    // Bracelet Details table creation string
    public static final String BRACELETDETAILS_TABLE_CREATE_STRING = "CREATE " +
            "TABLE "
            + TABLE_BRACELETDETAILS
            + " ("
            + BRACELETDETAILS_ROWID
            + " integer primary key, "
            + BRACELETDETAILS_BRACELETID
            + " text not null, "
            + BRACELETDETAILS_STRINGLETTER
            + " text not null, "
            + BRACELETDETAILS_ROWNUMBER
            + " integer not null, "
            + BRACELETDETAILS_HEXCOLOR
            + " text not null);";

}
