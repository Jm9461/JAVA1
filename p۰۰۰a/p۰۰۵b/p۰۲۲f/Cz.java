package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.z  reason: invalid class name */
public class Cz {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۸۶۴۳a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۸۶۴۴b;

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۴۱۶a(ViewGroup group, boolean suppress) {
        m۱۰۴۱۵a();
        Method method = f۸۶۴۳a;
        if (method != null) {
            try {
                method.invoke(group, Boolean.valueOf(suppress));
            } catch (IllegalAccessException e) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e);
            } catch (InvocationTargetException e2) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e2);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۴۱۵a() {
        if (!f۸۶۴۴b) {
            try {
                f۸۶۴۳a = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f۸۶۴۳a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f۸۶۴۴b = true;
        }
    }
}
