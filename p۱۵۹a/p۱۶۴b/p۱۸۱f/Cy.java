package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.f.y, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cy {

    /* renamed from: a, reason: contains not printable characters */
    private static LayoutTransition f۸۶۳۸a;

    /* renamed from: b, reason: contains not printable characters */
    private static Field f۸۶۳۹b;

    /* renamed from: c, reason: contains not printable characters */
    private static boolean f۸۶۴۰c;

    /* renamed from: d, reason: contains not printable characters */
    private static Method f۸۶۴۱d;

    /* renamed from: e, reason: contains not printable characters */
    private static boolean f۸۶۴۲e;

    /* renamed from: a.b.f.y$a */
    static class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۳۴۹a(ViewGroup group, boolean suppress) {
        if (f۸۶۳۸a == null) {
            f۸۶۳۸a = new a();
            f۸۶۳۸a.setAnimator(2, null);
            f۸۶۳۸a.setAnimator(0, null);
            f۸۶۳۸a.setAnimator(1, null);
            f۸۶۳۸a.setAnimator(3, null);
            f۸۶۳۸a.setAnimator(4, null);
        }
        if (suppress) {
            LayoutTransition layoutTransition = group.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m۸۳۴۸a(layoutTransition);
                }
                if (layoutTransition != f۸۶۳۸a) {
                    group.setTag(Cj.transition_layout_save, layoutTransition);
                }
            }
            group.setLayoutTransition(f۸۶۳۸a);
            return;
        }
        group.setLayoutTransition(null);
        if (!f۸۶۴۰c) {
            try {
                f۸۶۳۹b = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f۸۶۳۹b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            f۸۶۴۰c = true;
        }
        boolean layoutSuppressed = false;
        Field field = f۸۶۳۹b;
        if (field != null) {
            try {
                layoutSuppressed = field.getBoolean(group);
                if (layoutSuppressed) {
                    f۸۶۳۹b.setBoolean(group, false);
                }
            } catch (IllegalAccessException e3) {
                Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
            }
        }
        if (layoutSuppressed) {
            group.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) group.getTag(Cj.transition_layout_save);
        if (layoutTransition2 != null) {
            group.setTag(Cj.transition_layout_save, null);
            group.setLayoutTransition(layoutTransition2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۳۴۸a(LayoutTransition t) {
        if (!f۸۶۴۲e) {
            try {
                f۸۶۴۱d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f۸۶۴۱d.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f۸۶۴۲e = true;
        }
        Method method = f۸۶۴۱d;
        if (method != null) {
            try {
                method.invoke(t, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException e4) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }
}
