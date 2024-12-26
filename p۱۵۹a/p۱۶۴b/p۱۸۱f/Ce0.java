package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.e0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce0 extends Ch0 {

    /* renamed from: a, reason: contains not printable characters */
    private static Method f۸۵۳۳a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۸۵۳۴b;

    /* renamed from: c, reason: contains not printable characters */
    private static Method f۸۵۳۵c;

    /* renamed from: d, reason: contains not printable characters */
    private static boolean f۸۵۳۶d;

    Ce0() {
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۱a(View view, float alpha) {
        m۸۱۸۶b();
        Method method = f۸۵۳۳a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(alpha));
                return;
            } catch (IllegalAccessException e2) {
                return;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        view.setAlpha(alpha);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: b, reason: contains not printable characters */
    public float mo۸۲۰۴b(View view) {
        m۸۱۸۵a();
        Method method = f۸۵۳۵c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.mo۸۲۰۴b(view);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۲۰۶c(View view) {
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Ch0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۰a(View view) {
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۱۸۶b() {
        if (!f۸۵۳۴b) {
            try {
                f۸۵۳۳a = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f۸۵۳۳a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f۸۵۳۴b = true;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۱۸۵a() {
        if (!f۸۵۳۶d) {
            try {
                f۸۵۳۵c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f۸۵۳۵c.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f۸۵۳۶d = true;
        }
    }
}
