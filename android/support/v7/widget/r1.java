package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.u;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class r1 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۲۲۴۳a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f۲۲۴۳a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!f۲۲۴۳a.isAccessible()) {
                    f۲۲۴۳a.setAccessible(true);
                }
            } catch (NoSuchMethodException e2) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static boolean a(View view) {
        return u.k(view) == 1;
    }

    public static void a(View view, Rect inoutInsets, Rect outLocalInsets) {
        Method method = f۲۲۴۳a;
        if (method != null) {
            try {
                method.invoke(view, inoutInsets, outLocalInsets);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e2) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e3) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
            } catch (IllegalAccessException e4) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
            }
        }
    }
}
