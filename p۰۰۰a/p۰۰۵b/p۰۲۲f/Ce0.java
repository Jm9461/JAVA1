package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.e0  reason: invalid class name */
class Ce0 extends Ch0 {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۸۵۳۳a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۸۵۳۴b;

    /* renamed from: c  reason: contains not printable characters */
    private static Method f۸۵۳۵c;

    /* renamed from: d  reason: contains not printable characters */
    private static boolean f۸۵۳۶d;

    Ce0() {
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۵۵a(View view, float alpha) {
        m۱۰۲۵۳b();
        Method method = f۸۵۳۳a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(alpha));
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            view.setAlpha(alpha);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۰۲۵۶b(View view) {
        m۱۰۲۵۲a();
        Method method = f۸۵۳۵c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.m۱۰۲۷۱b(view);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۲۵۷c(View view) {
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ch0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۵۴a(View view) {
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۲۵۳b() {
        if (!f۸۵۳۴b) {
            try {
                f۸۵۳۳a = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f۸۵۳۳a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f۸۵۳۴b = true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۲۵۲a() {
        if (!f۸۵۳۶d) {
            try {
                f۸۵۳۵c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f۸۵۳۵c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f۸۵۳۶d = true;
        }
    }
}
