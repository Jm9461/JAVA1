package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.f0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cf0 extends Ce0 {

    /* renamed from: e, reason: contains not printable characters */
    private static Method f۸۵۳۷e;

    /* renamed from: f, reason: contains not printable characters */
    private static boolean f۸۵۳۸f;

    /* renamed from: g, reason: contains not printable characters */
    private static Method f۸۵۳۹g;

    /* renamed from: h, reason: contains not printable characters */
    private static boolean f۸۵۴۰h;

    Cf0() {
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۳a(View view, Matrix matrix) {
        m۸۱۹۲a();
        Method method = f۸۵۳۷e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۸۲۰۵b(View view, Matrix matrix) {
        m۸۱۹۳b();
        Method method = f۸۵۳۹g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۱۹۲a() {
        if (!f۸۵۳۸f) {
            try {
                f۸۵۳۷e = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f۸۵۳۷e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f۸۵۳۸f = true;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۱۹۳b() {
        if (!f۸۵۴۰h) {
            try {
                f۸۵۳۹g = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f۸۵۳۹g.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            f۸۵۴۰h = true;
        }
    }
}
