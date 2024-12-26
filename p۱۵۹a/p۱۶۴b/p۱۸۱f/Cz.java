package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.z, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cz {

    /* renamed from: a, reason: contains not printable characters */
    private static Method f۸۶۴۳a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۸۶۴۴b;

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۳۵۱a(ViewGroup group, boolean suppress) {
        m۸۳۵۰a();
        Method method = f۸۶۴۳a;
        if (method != null) {
            try {
                method.invoke(group, Boolean.valueOf(suppress));
            } catch (IllegalAccessException e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (InvocationTargetException e3) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e3);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۳۵۰a() {
        if (!f۸۶۴۴b) {
            try {
                f۸۶۴۳a = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f۸۶۴۳a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            f۸۶۴۴b = true;
        }
    }
}
