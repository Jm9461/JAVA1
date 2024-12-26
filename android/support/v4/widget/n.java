package android.support.v4.widget;

import android.os.Build;
import android.support.v4.view.d;
import android.support.v4.view.u;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۱۴۵۹a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۴۶۰b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f۱۴۶۱c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f۱۴۶۲d;

    public static void a(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        if (Build.VERSION.SDK_INT >= 19) {
            popup.showAsDropDown(anchor, xoff, yoff, gravity);
            return;
        }
        int xoff1 = xoff;
        if ((d.a(gravity, u.k(anchor)) & 7) == 5) {
            xoff1 -= popup.getWidth() - anchor.getWidth();
        }
        popup.showAsDropDown(anchor, xoff1, yoff);
    }

    public static void a(PopupWindow popupWindow, boolean overlapAnchor) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(overlapAnchor);
        } else if (i >= 21) {
            if (!f۱۴۶۲d) {
                try {
                    f۱۴۶۱c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f۱۴۶۱c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f۱۴۶۲d = true;
            }
            Field field = f۱۴۶۱c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(overlapAnchor));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static void a(PopupWindow popupWindow, int layoutType) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(layoutType);
            return;
        }
        if (!f۱۴۶۰b) {
            try {
                f۱۴۵۹a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f۱۴۵۹a.setAccessible(true);
            } catch (Exception e2) {
            }
            f۱۴۶۰b = true;
        }
        Method method = f۱۴۵۹a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(layoutType));
            } catch (Exception e3) {
            }
        }
    }
}
