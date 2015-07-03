package io.naotou.jx3helper.util;

import android.widget.Toast;

import io.naotou.jx3helper.base.ExApplication;

/**
 * @author Jack Cooper
 * @name Jx3Helper
 * @date 2015/7/1
 * @2015 AngelCrunch 天使汇 http://www.angelcrunch.com/
 */
public class ToastUtil {
    private static Toast mToast = Toast.makeText(ExApplication.getContext(), "", Toast.LENGTH_SHORT);

    public static void showToast(int rid) {
        mToast.setText(rid);
        mToast.show();
    }

    public static void showToast(String text) {
        mToast.setText(text);
        mToast.show();
    }

    public static void showToast(int rid, Object... args) {

        showToast(ExApplication.getContext().getResources().getString(rid, args));
    }
}