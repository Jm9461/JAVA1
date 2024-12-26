package a.b.g.f;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۳۴۵a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f۳۴۶b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f۳۴۶b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            try {
                Class<?> clazz = Class.forName("libcore.icu.ICU");
                if (clazz != null) {
                    f۳۴۵a = clazz.getMethod("getScript", String.class);
                    f۳۴۶b = clazz.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception e3) {
                f۳۴۵a = null;
                f۳۴۶b = null;
                Log.w("ICUCompat", e3);
            }
        }
    }

    public static String b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f۳۴۶b.invoke(null, locale)).getScript();
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            } catch (IllegalAccessException e3) {
                Log.w("ICUCompat", e3);
                return locale.getScript();
            }
        } else {
            String localeWithSubtags = a(locale);
            if (localeWithSubtags != null) {
                return a(localeWithSubtags);
            }
            return null;
        }
    }

    private static String a(String localeStr) {
        try {
            if (f۳۴۵a != null) {
                return (String) f۳۴۵a.invoke(null, localeStr);
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return null;
    }

    private static String a(Locale locale) {
        String localeStr = locale.toString();
        try {
            if (f۳۴۶b != null) {
                return (String) f۳۴۶b.invoke(null, localeStr);
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return localeStr;
    }
}
