package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.g0  reason: invalid class name */
class Cg0 extends Cf0 {

    /* renamed from: i  reason: contains not printable characters */
    private static Method f۸۵۴۱i;

    /* renamed from: j  reason: contains not printable characters */
    private static boolean f۸۵۴۲j;

    Cg0() {
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۶۵a(View v, int left, int top, int right, int bottom) {
        m۱۰۲۶۴a();
        Method method = f۸۵۴۱i;
        if (method != null) {
            try {
                method.invoke(v, Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom));
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۲۶۴a() {
        if (!f۸۵۴۲j) {
            try {
                f۸۵۴۱i = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f۸۵۴۱i.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f۸۵۴۲j = true;
        }
    }
}
