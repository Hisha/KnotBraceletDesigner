package com.hishatech.android.knotbraceletdesigner;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.hishatech.android.knotbraceletdesigner.db.DbConstants;

import java.io.File;

public class Utils {

    public static final String appFileExtention = ".hkbd";

    public static boolean TrueFalseIntToBoolean(int intValue) {
        boolean boolValue = false;
        if (intValue == 1) {
            boolValue = true;
        }
        return boolValue;
    }

    public static int BooleanToTrueFalseInt(boolean boolValue) {
        int intValue = 0;
        if (boolValue) {
            intValue = 1;
        }
        return intValue;
    }

    public static boolean InternetUp(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiInfo = connectivityManager.getNetworkInfo
                (ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileInfo = connectivityManager.getNetworkInfo
                (ConnectivityManager.TYPE_MOBILE);
        if ((wifiInfo != null && wifiInfo.isConnected()) || (mobileInfo !=
                null && mobileInfo.isConnected())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean DatabaseExists(Context context) {
        File database = context.getDatabasePath
                (DbConstants
                        .DATABASE_NAME);
        return database.exists();
    }

}