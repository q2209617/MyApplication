package com.tdx.mylibrary;

import android.util.Log;

/**
 * @author yj on 2019/5/15 0015 11:49
 */
public class LogTest {
    private static final String TAG = "TAG";

    public static void showLog(String msg){
        Log.e(TAG,msg);
    }
}
