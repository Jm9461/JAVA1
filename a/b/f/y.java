package a.b.f;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private static LayoutTransition f۲۷۵a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f۲۷۶b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f۲۷۷c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f۲۷۸d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f۲۷۹e;

    /* access modifiers changed from: package-private */
    public static class a extends LayoutTransition {
        a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    static void a(ViewGroup group, boolean suppress) {
        if (f۲۷۵a == null) {
            f۲۷۵a = new a();
            f۲۷۵a.setAnimator(2, null);
            f۲۷۵a.setAnimator(0, null);
            f۲۷۵a.setAnimator(1, null);
            f۲۷۵a.setAnimator(3, null);
            f۲۷۵a.setAnimator(4, null);
        }
        if (suppress) {
            LayoutTransition layoutTransition = group.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f۲۷۵a) {
                    group.setTag(j.transition_layout_save, layoutTransition);
                }
            }
            group.setLayoutTransition(f۲۷۵a);
            return;
        }
        group.setLayoutTransition(null);
        if (!f۲۷۷c) {
            try {
                f۲۷۶b = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f۲۷۶b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            f۲۷۷c = true;
        }
        boolean layoutSuppressed = false;
        Field field = f۲۷۶b;
        if (field != null) {
            try {
                layoutSuppressed = field.getBoolean(group);
                if (layoutSuppressed) {
                    f۲۷۶b.setBoolean(group, false);
                }
            } catch (IllegalAccessException e3) {
                Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
            }
        }
        if (layoutSuppressed) {
            group.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) group.getTag(j.transition_layout_save);
        if (layoutTransition2 != null) {
            group.setTag(j.transition_layout_save, null);
            group.setLayoutTransition(layoutTransition2);
        }
    }

    private static void a(LayoutTransition t) {
        if (!f۲۷۹e) {
            try {
                f۲۷۸d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f۲۷۸d.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f۲۷۹e = true;
        }
        Method method = f۲۷۸d;
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
