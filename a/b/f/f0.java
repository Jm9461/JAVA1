package a.b.f;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class f0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    private static Method f۲۱۱e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f۲۱۲f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f۲۱۳g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f۲۱۴h;

    f0() {
    }

    @Override // a.b.f.h0
    public void a(View view, Matrix matrix) {
        a();
        Method method = f۲۱۱e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // a.b.f.h0
    public void b(View view, Matrix matrix) {
        b();
        Method method = f۲۱۳g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    private void a() {
        if (!f۲۱۲f) {
            try {
                f۲۱۱e = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f۲۱۱e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f۲۱۲f = true;
        }
    }

    private void b() {
        if (!f۲۱۴h) {
            try {
                f۲۱۳g = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f۲۱۳g.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            f۲۱۴h = true;
        }
    }
}
