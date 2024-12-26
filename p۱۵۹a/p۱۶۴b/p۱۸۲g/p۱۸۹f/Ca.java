package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: a.b.g.f.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {

    /* renamed from: a, reason: contains not printable characters */
    private static Method f۸۷۰۸a;

    /* renamed from: b, reason: contains not printable characters */
    private static Method f۸۷۰۹b;

    static {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> clazz = Class.forName("libcore.icu.ICU");
                if (clazz != null) {
                    f۸۷۰۸a = clazz.getMethod("getScript", String.class);
                    f۸۷۰۹b = clazz.getMethod("addLikelySubtags", String.class);
                    return;
                }
                return;
            } catch (Exception e2) {
                f۸۷۰۸a = null;
                f۸۷۰۹b = null;
                Log.w("ICUCompat", e2);
                return;
            }
        }
        try {
            f۸۷۰۹b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static String m۸۴۶۲b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Object[] args = {locale};
                return ((Locale) f۸۷۰۹b.invoke(null, args)).getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            } catch (InvocationTargetException e3) {
                Log.w("ICUCompat", e3);
                return locale.getScript();
            }
        }
        String localeWithSubtags = m۸۴۶۱a(locale);
        if (localeWithSubtags != null) {
            return m۸۴۶۰a(localeWithSubtags);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۸۴۶۰a(String localeStr) {
        try {
            if (f۸۷۰۸a != null) {
                Object[] args = {localeStr};
                return (String) f۸۷۰۸a.invoke(null, args);
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۸۴۶۱a(Locale locale) {
        String localeStr = locale.toString();
        try {
            if (f۸۷۰۹b != null) {
                Object[] args = {localeStr};
                return (String) f۸۷۰۹b.invoke(null, args);
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return localeStr;
    }
}
