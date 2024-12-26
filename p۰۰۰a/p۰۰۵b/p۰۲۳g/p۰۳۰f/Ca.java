package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: a.b.g.f.a  reason: invalid class name */
public final class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۸۷۰۸a;

    /* renamed from: b  reason: contains not printable characters */
    private static Method f۸۷۰۹b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f۸۷۰۹b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class<?> clazz = Class.forName("libcore.icu.ICU");
                if (clazz != null) {
                    f۸۷۰۸a = clazz.getMethod("getScript", String.class);
                    f۸۷۰۹b = clazz.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception e2) {
                f۸۷۰۸a = null;
                f۸۷۰۹b = null;
                Log.w("ICUCompat", e2);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static String m۱۰۵۳۳b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f۸۷۰۹b.invoke(null, locale)).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String localeWithSubtags = m۱۰۵۳۲a(locale);
            if (localeWithSubtags != null) {
                return m۱۰۵۳۱a(localeWithSubtags);
            }
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۰۵۳۱a(String localeStr) {
        try {
            if (f۸۷۰۸a != null) {
                return (String) f۸۷۰۸a.invoke(null, localeStr);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۰۵۳۲a(Locale locale) {
        String localeStr = locale.toString();
        try {
            if (f۸۷۰۹b != null) {
                return (String) f۸۷۰۹b.invoke(null, localeStr);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return localeStr;
    }
}
