package a.b.f;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e0 extends h0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۲۰۷a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۲۰۸b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f۲۰۹c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f۲۱۰d;

    e0() {
    }

    @Override // a.b.f.h0
    public void a(View view, float alpha) {
        b();
        Method method = f۲۰۷a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(alpha));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        } else {
            view.setAlpha(alpha);
        }
    }

    @Override // a.b.f.h0
    public float b(View view) {
        a();
        Method method = f۲۰۹c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.b(view);
    }

    @Override // a.b.f.h0
    public void c(View view) {
    }

    @Override // a.b.f.h0
    public void a(View view) {
    }

    private void b() {
        if (!f۲۰۸b) {
            try {
                f۲۰۷a = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f۲۰۷a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f۲۰۸b = true;
        }
    }

    private void a() {
        if (!f۲۱۰d) {
            try {
                f۲۰۹c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f۲۰۹c.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f۲۱۰d = true;
        }
    }
}
