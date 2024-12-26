package android.support.p۰۴۳v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.view.v  reason: invalid class name */
public final class Cv {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۱۰۶۳۷a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f۱۰۶۳۷a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static float m۱۳۰۴۰b(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return config.getScaledHorizontalScrollFactor();
        }
        return m۱۳۰۳۸a(config, context);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static float m۱۳۰۴۱c(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return config.getScaledVerticalScrollFactor();
        }
        return m۱۳۰۳۸a(config, context);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static float m۱۳۰۳۸a(ViewConfiguration config, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f۱۰۶۳۷a) != null) {
            try {
                return (float) ((Integer) method.invoke(config, new Object[0])).intValue();
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
            return outValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۳۰۳۹a(ViewConfiguration config) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.getScaledHoverSlop();
        }
        return config.getScaledTouchSlop() / 2;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static boolean m۱۳۰۴۲d(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources res = context.getResources();
        int platformResId = res.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return platformResId != 0 && res.getBoolean(platformResId);
    }
}
