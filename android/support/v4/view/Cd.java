package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: android.support.v4.view.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd {
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۷۵۶a(int gravity, int w, int h2, Rect container, Rect outRect, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(gravity, w, h2, container, outRect, layoutDirection);
        } else {
            Gravity.apply(gravity, w, h2, container, outRect);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۰۷۵۵a(int gravity, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(gravity, layoutDirection);
        }
        return (-8388609) & gravity;
    }
}
