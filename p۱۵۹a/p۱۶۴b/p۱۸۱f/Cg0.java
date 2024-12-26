package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.g0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cg0 extends Cf0 {

    /* renamed from: i, reason: contains not printable characters */
    private static Method f۸۵۴۱i;

    /* renamed from: j, reason: contains not printable characters */
    private static boolean f۸۵۴۲j;

    Cg0() {
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۲a(View v, int left, int top, int right, int bottom) {
        m۸۱۹۷a();
        Method method = f۸۵۴۱i;
        if (method != null) {
            try {
                method.invoke(v, Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۱۹۷a() {
        if (!f۸۵۴۲j) {
            try {
                f۸۵۴۱i = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f۸۵۴۱i.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e2);
            }
            f۸۵۴۲j = true;
        }
    }
}
