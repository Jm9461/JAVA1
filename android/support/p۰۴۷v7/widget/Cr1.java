package android.support.p۰۴۷v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.r1  reason: invalid class name */
public class Cr1 {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۱۲۳۳۰a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f۱۲۳۳۰a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!f۱۲۳۳۰a.isAccessible()) {
                    f۱۲۳۳۰a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۵۵۶۷a(View view) {
        return Cu.m۱۳۰۱۴k(view) == 1;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۵۶۶a(View view, Rect inoutInsets, Rect outLocalInsets) {
        Method method = f۱۲۳۳۰a;
        if (method != null) {
            try {
                method.invoke(view, inoutInsets, outLocalInsets);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۵۵۶۸b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (IllegalAccessException e3) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
            }
        }
    }
}
