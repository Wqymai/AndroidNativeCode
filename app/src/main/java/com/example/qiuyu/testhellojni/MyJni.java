package com.example.qiuyu.testhellojni;

import android.util.Log;

/**
 * Created by qiuyu on 16/12/6.
 */
public class MyJni {

    static {
        System.loadLibrary("myjni");
    }

    public MyJni() {
        Log.d("123", "Load MyJni nativeSetup");
        nativeSetup();
    }

    public native void nativeSetup();
    public native void nativeExec(int value);
    public static native void nativeStaitcExec(int value);

    private static void getvalue1(int value) {
        Log.d("123", "" + value);
    }

    private void getvalue2(int value) {
        Log.d("123", "" + value);
    }


}
