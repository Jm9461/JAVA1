package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.Cu;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: a.b.f.d0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cd0 {

    /* renamed from: a, reason: contains not printable characters */
    private static final Ch0 f۸۵۲۰a;

    /* renamed from: b, reason: contains not printable characters */
    private static Field f۸۵۲۱b;

    /* renamed from: c, reason: contains not printable characters */
    private static boolean f۸۵۲۲c;

    /* renamed from: d, reason: contains not printable characters */
    static final Property<View, Float> f۸۵۲۳d;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            f۸۵۲۰a = new Cg0();
        } else if (i >= 21) {
            f۸۵۲۰a = new Cf0();
        } else if (i >= 19) {
            f۸۵۲۰a = new Ce0();
        } else {
            f۸۵۲۰a = new Ch0();
        }
        f۸۵۲۳d = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* renamed from: a.b.f.d0$a */
    static class a extends Property<View, Float> {
        a(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(Cd0.m۸۱۵۳c(view));
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Float alpha) {
            Cd0.m۸۱۴۷a(view, alpha.floatValue());
        }
    }

    /* renamed from: a.b.f.d0$b */
    static class b extends Property<View, Rect> {
        b(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return Cu.m۱۰۹۳۴e(view);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Rect clipBounds) {
            Cu.m۱۰۹۱۳a(view, clipBounds);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    static InterfaceCc0 m۸۱۵۱b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new Cb0(view);
        }
        return Ca0.m۸۱۰۰c(view);
    }

    /* renamed from: d, reason: contains not printable characters */
    static InterfaceCl0 m۸۱۵۴d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new Ck0(view);
        }
        return new Cj0(view.getWindowToken());
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۱۴۷a(View view, float alpha) {
        f۸۵۲۰a.mo۸۲۰۱a(view, alpha);
    }

    /* renamed from: c, reason: contains not printable characters */
    static float m۸۱۵۳c(View view) {
        return f۸۵۲۰a.mo۸۲۰۴b(view);
    }

    /* renamed from: e, reason: contains not printable characters */
    static void m۸۱۵۵e(View view) {
        f۸۵۲۰a.mo۸۲۰۶c(view);
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۱۴۶a(View view) {
        f۸۵۲۰a.mo۸۲۰۰a(view);
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۱۴۸a(View view, int visibility) {
        m۸۱۴۵a();
        Field field = f۸۵۲۱b;
        if (field != null) {
            try {
                int viewFlags = field.getInt(view);
                f۸۵۲۱b.setInt(view, (viewFlags & (-13)) | visibility);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۱۵۰a(View view, Matrix matrix) {
        f۸۵۲۰a.mo۸۲۰۳a(view, matrix);
    }

    /* renamed from: b, reason: contains not printable characters */
    static void m۸۱۵۲b(View view, Matrix matrix) {
        f۸۵۲۰a.mo۸۲۰۵b(view, matrix);
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۱۴۹a(View v, int left, int top, int right, int bottom) {
        f۸۵۲۰a.mo۸۲۰۲a(v, left, top, right, bottom);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۱۴۵a() {
        if (!f۸۵۲۲c) {
            try {
                f۸۵۲۱b = View.class.getDeclaredField("mViewFlags");
                f۸۵۲۱b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f۸۵۲۲c = true;
        }
    }
}
