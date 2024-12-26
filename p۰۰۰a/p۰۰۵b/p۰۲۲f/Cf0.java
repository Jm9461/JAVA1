package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.f0  reason: invalid class name */
class Cf0 extends Ce0 {

    /* renamed from: e  reason: contains not printable characters */
    private static Method f۸۵۳۷e;

    /* renamed from: f  reason: contains not printable characters */
    private static boolean f۸۵۳۸f;

    /* renamed from: g  reason: contains not printable characters */
    private static Method f۸۵۳۹g;

    /* renamed from: h  reason: contains not printable characters */
    private static boolean f۸۵۴۰h;

    Cf0() {
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۶۱a(View view, Matrix matrix) {
        m۱۰۲۵۹a();
        Method method = f۸۵۳۷e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۲۶۲b(View view, Matrix matrix) {
        m۱۰۲۶۰b();
        Method method = f۸۵۳۹g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۲۵۹a() {
        if (!f۸۵۳۸f) {
            try {
                f۸۵۳۷e = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f۸۵۳۷e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f۸۵۳۸f = true;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۲۶۰b() {
        if (!f۸۵۴۰h) {
            try {
                f۸۵۳۹g = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f۸۵۳۹g.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f۸۵۴۰h = true;
        }
    }
}
