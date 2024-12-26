package a.b.f;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۲۸۰a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۲۸۱b;

    static void a(ViewGroup group, boolean suppress) {
        a();
        Method method = f۲۸۰a;
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

    private static void a() {
        if (!f۲۸۱b) {
            try {
                f۲۸۰a = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f۲۸۰a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            f۲۸۱b = true;
        }
    }
}
