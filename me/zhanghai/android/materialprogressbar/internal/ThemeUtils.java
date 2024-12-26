package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int attrRes, int defaultValue, Context context) {
        TypedArray a2 = context.obtainStyledAttributes(new int[]{attrRes});
        try {
            return a2.getColor(0, defaultValue);
        } finally {
            a2.recycle();
        }
    }

    public static float getFloatFromAttrRes(int attrRes, float defaultValue, Context context) {
        TypedArray a2 = context.obtainStyledAttributes(new int[]{attrRes});
        try {
            return a2.getFloat(0, defaultValue);
        } finally {
            a2.recycle();
        }
    }
}
