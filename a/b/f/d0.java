package a.b.f;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.u;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h0 f۱۹۴a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f۱۹۵b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f۱۹۶c;

    /* renamed from: d  reason: collision with root package name */
    static final Property<View, Float> f۱۹۷d = new a(Float.class, "translationAlpha");

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            f۱۹۴a = new g0();
        } else if (i >= 21) {
            f۱۹۴a = new f0();
        } else if (i >= 19) {
            f۱۹۴a = new e0();
        } else {
            f۱۹۴a = new h0();
        }
        new b(Rect.class, "clipBounds");
    }

    static class a extends Property<View, Float> {
        a(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(d0.c(view));
        }

        /* renamed from: a */
        public void set(View view, Float alpha) {
            d0.a(view, alpha.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return u.e(view);
        }

        /* renamed from: a */
        public void set(View view, Rect clipBounds) {
            u.a(view, clipBounds);
        }
    }

    static c0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new b0(view);
        }
        return a0.c(view);
    }

    static l0 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new k0(view);
        }
        return new j0(view.getWindowToken());
    }

    static void a(View view, float alpha) {
        f۱۹۴a.a(view, alpha);
    }

    static float c(View view) {
        return f۱۹۴a.b(view);
    }

    static void e(View view) {
        f۱۹۴a.c(view);
    }

    static void a(View view) {
        f۱۹۴a.a(view);
    }

    static void a(View view, int visibility) {
        a();
        Field field = f۱۹۵b;
        if (field != null) {
            try {
                f۱۹۵b.setInt(view, (field.getInt(view) & -13) | visibility);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    static void a(View view, Matrix matrix) {
        f۱۹۴a.a(view, matrix);
    }

    static void b(View view, Matrix matrix) {
        f۱۹۴a.b(view, matrix);
    }

    static void a(View v, int left, int top, int right, int bottom) {
        f۱۹۴a.a(v, left, top, right, bottom);
    }

    private static void a() {
        if (!f۱۹۶c) {
            try {
                f۱۹۵b = View.class.getDeclaredField("mViewFlags");
                f۱۹۵b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f۱۹۶c = true;
        }
    }
}
