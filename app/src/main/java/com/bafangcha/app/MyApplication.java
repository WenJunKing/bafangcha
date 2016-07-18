package com.bafangcha.app;


import android.app.Application;

import com.bafangcha.app.util.L;
import com.umeng.socialize.PlatformConfig;

/**
 * Author: wenjundu
 * Email:179451678@qq.com
 * Date:2016/1/12
 * Description:Application
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        L.isDebug=true;
        PlatformConfig.setWeixin("wx1596167db4f5cd13", "930dcfcb2007dd9f16e2eece4708a3b6");
        PlatformConfig.setQQZone("1105146713", "7ZT2Qy3jwgJimRdc");
        com.umeng.socialize.utils.Log.LOG = true;

    }

    @Override
    public void onLowMemory() {
        android.os.Process.killProcess(android.os.Process.myPid());
        super.onLowMemory();
    }


}
