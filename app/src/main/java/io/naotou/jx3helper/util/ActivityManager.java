package io.naotou.jx3helper.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fqzw2 on 2015/8/9.
 * Activity管理器.想在任何页面关闭应用都可以.
 */
public class ActivityManager {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }


    /**
     * 在应用程序向关闭整个程序的时候调用.
     */
    public static void finishAll() {
        for (Activity a : activities) {
            if (!a.isFinishing()) {
                a.finish();
            }
        }
    }

}
