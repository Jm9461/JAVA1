package android.support.v4.widget;

import android.os.Build;
import android.support.v4.view.Cd;
import android.support.v4.view.Cu;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cn {

    /* renamed from: a, reason: contains not printable characters */
    private static Method f۱۰۷۹۴a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۰۷۹۵b;

    /* renamed from: c, reason: contains not printable characters */
    private static Field f۱۰۷۹۶c;

    /* renamed from: d, reason: contains not printable characters */
    private static boolean f۱۰۷۹۷d;

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۲۴a(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        if (Build.VERSION.SDK_INT >= 19) {
            popup.showAsDropDown(anchor, xoff, yoff, gravity);
            return;
        }
        int xoff1 = xoff;
        int hgrav = Cd.m۱۰۷۵۵a(gravity, Cu.m۱۰۹۴۴k(anchor)) & 7;
        if (hgrav == 5) {
            xoff1 -= popup.getWidth() - anchor.getWidth();
        }
        popup.showAsDropDown(anchor, xoff1, yoff);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۲۵a(PopupWindow popupWindow, boolean overlapAnchor) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(overlapAnchor);
            return;
        }
        if (i >= 21) {
            if (!f۱۰۷۹۷d) {
                try {
                    f۱۰۷۹۶c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f۱۰۷۹۶c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f۱۰۷۹۷d = true;
            }
            Field field = f۱۰۷۹۶c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(overlapAnchor));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۲۳a(PopupWindow popupWindow, int layoutType) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(layoutType);
            return;
        }
        if (!f۱۰۷۹۵b) {
            try {
                f۱۰۷۹۴a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f۱۰۷۹۴a.setAccessible(true);
            } catch (Exception e2) {
            }
            f۱۰۷۹۵b = true;
        }
        Method method = f۱۰۷۹۴a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(layoutType));
            } catch (Exception e3) {
            }
        }
    }
}
