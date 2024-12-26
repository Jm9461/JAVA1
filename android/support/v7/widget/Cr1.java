package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.Cu;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.r1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cr1 {

    /* renamed from: a, reason: contains not printable characters */
    private static Method f۱۲۳۳۰a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f۱۲۳۳۰a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!f۱۲۳۳۰a.isAccessible()) {
                    f۱۲۳۳۰a.setAccessible(true);
                }
            } catch (NoSuchMethodException e2) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۳۴۹۷a(View view) {
        return Cu.m۱۰۹۴۴k(view) == 1;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۴۹۶a(View view, Rect inoutInsets, Rect outLocalInsets) {
        Method method = f۱۲۳۳۰a;
        if (method != null) {
            try {
                method.invoke(view, inoutInsets, outLocalInsets);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۳۴۹۸b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (NoSuchMethodException e3) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e4) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
            }
        }
    }
}
