package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.d0  reason: invalid class name */
public class Cd0 {

    /* renamed from: a  reason: contains not printable characters */
    private static final Ch0 f۸۵۲۰a;

    /* renamed from: b  reason: contains not printable characters */
    private static Field f۸۵۲۱b;

    /* renamed from: c  reason: contains not printable characters */
    private static boolean f۸۵۲۲c;

    /* renamed from: d  reason: contains not printable characters */
    static final Property<View, Float> f۸۵۲۳d = new Ca(Float.class, "translationAlpha");

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
        new Cb(Rect.class, "clipBounds");
    }

    /* renamed from: a.b.f.d0$a  reason: invalid class name */
    static class Ca extends Property<View, Float> {
        Ca(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Float get(View view) {
            return Float.valueOf(Cd0.m۱۰۲۲۰c(view));
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(View view, Float alpha) {
            Cd0.m۱۰۲۱۴a(view, alpha.floatValue());
        }
    }

    /* renamed from: a.b.f.d0$b  reason: invalid class name */
    static class Cb extends Property<View, Rect> {
        Cb(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Rect get(View view) {
            return Cu.m۱۳۰۰۴e(view);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(View view, Rect clipBounds) {
            Cu.m۱۲۹۸۳a(view, clipBounds);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    static AbstractCc0 m۱۰۲۱۸b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new Cb0(view);
        }
        return Ca0.m۱۰۱۶۷c(view);
    }

    /* renamed from: d  reason: contains not printable characters */
    static AbstractCl0 m۱۰۲۲۱d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new Ck0(view);
        }
        return new Cj0(view.getWindowToken());
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۲۱۴a(View view, float alpha) {
        f۸۵۲۰a.m۱۰۲۶۸a(view, alpha);
    }

    /* renamed from: c  reason: contains not printable characters */
    static float m۱۰۲۲۰c(View view) {
        return f۸۵۲۰a.m۱۰۲۷۱b(view);
    }

    /* renamed from: e  reason: contains not printable characters */
    static void m۱۰۲۲۲e(View view) {
        f۸۵۲۰a.m۱۰۲۷۳c(view);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۲۱۳a(View view) {
        f۸۵۲۰a.m۱۰۲۶۷a(view);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۲۱۵a(View view, int visibility) {
        m۱۰۲۱۲a();
        Field field = f۸۵۲۱b;
        if (field != null) {
            try {
                f۸۵۲۱b.setInt(view, (field.getInt(view) & -13) | visibility);
            } catch (IllegalAccessException e) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۲۱۷a(View view, Matrix matrix) {
        f۸۵۲۰a.m۱۰۲۷۰a(view, matrix);
    }

    /* renamed from: b  reason: contains not printable characters */
    static void m۱۰۲۱۹b(View view, Matrix matrix) {
        f۸۵۲۰a.m۱۰۲۷۲b(view, matrix);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۲۱۶a(View v, int left, int top, int right, int bottom) {
        f۸۵۲۰a.m۱۰۲۶۹a(v, left, top, right, bottom);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۲۱۲a() {
        if (!f۸۵۲۲c) {
            try {
                f۸۵۲۱b = View.class.getDeclaredField("mViewFlags");
                f۸۵۲۱b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f۸۵۲۲c = true;
        }
    }
}
