package io.naotou.jx3helper.util;


import io.naotou.jx3helper.base.ExApplication;

public class DensityUtil {

	public static int dip2px(float dpValue) {
		final float scale = ExApplication.getContext().getResources()
				.getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	public static int px2dip(float pxValue) {
		final float scale = ExApplication.getContext().getResources()
				.getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}

}
