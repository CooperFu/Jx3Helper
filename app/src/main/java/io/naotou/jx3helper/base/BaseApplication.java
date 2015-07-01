package io.naotou.jx3helper.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @author Jack Cooper
 * @name Jx3Helper
 * @date 2015/6/30
 * @2015 AngelCrunch 天使汇 http://www.angelcrunch.com/
 */
public class BaseApplication extends Application {

    public static Context mContext;

    public static Context getmContext() {
        return mContext;
    }

    public static Resources getmResources() {

        return mContext.getResources();
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        Fresco.initialize(mContext);
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
