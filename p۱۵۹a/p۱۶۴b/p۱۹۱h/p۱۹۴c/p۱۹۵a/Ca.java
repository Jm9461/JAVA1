package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Cj;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.b.h.c.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {

    /* renamed from: a, reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f۸۷۹۳a = new ThreadLocal<>();

    /* renamed from: b, reason: contains not printable characters */
    private static final WeakHashMap<Context, SparseArray<a>> f۸۷۹۴b = new WeakHashMap<>(0);

    /* renamed from: c, reason: contains not printable characters */
    private static final Object f۸۷۹۵c = new Object();

    /* renamed from: b, reason: contains not printable characters */
    public static ColorStateList m۸۶۰۳b(Context context, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(resId);
        }
        ColorStateList csl = m۸۶۰۰a(context, resId);
        if (csl != null) {
            return csl;
        }
        ColorStateList csl2 = m۸۶۰۵d(context, resId);
        if (csl2 != null) {
            m۸۶۰۲a(context, resId, csl2);
            return csl2;
        }
        return android.support.v4.content.Ca.m۱۰۵۵۴b(context, resId);
    }

    /* renamed from: c, reason: contains not printable characters */
    public static Drawable m۸۶۰۴c(Context context, int resId) {
        return Cj.m۱۳۲۱۷a().m۱۳۲۳۶a(context, resId);
    }

    /* renamed from: d, reason: contains not printable characters */
    private static ColorStateList m۸۶۰۵d(Context context, int resId) {
        if (m۸۶۰۶e(context, resId)) {
            return null;
        }
        Resources r = context.getResources();
        XmlPullParser xml = r.getXml(resId);
        try {
            return android.support.v4.content.p۲۰۲e.Ca.m۱۰۵۷۰a(r, xml, context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static ColorStateList m۸۶۰۰a(Context context, int resId) {
        a entry;
        synchronized (f۸۷۹۵c) {
            SparseArray<a> sparseArray = f۸۷۹۴b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (entry = sparseArray.get(resId)) != null) {
                if (entry.f۸۷۹۷b.equals(context.getResources().getConfiguration())) {
                    return entry.f۸۷۹۶a;
                }
                sparseArray.remove(resId);
            }
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۶۰۲a(Context context, int resId, ColorStateList value) {
        synchronized (f۸۷۹۵c) {
            SparseArray<a> sparseArray = f۸۷۹۴b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f۸۷۹۴b.put(context, sparseArray);
            }
            sparseArray.append(resId, new a(value, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private static boolean m۸۶۰۶e(Context context, int resId) {
        Resources r = context.getResources();
        TypedValue value = m۸۶۰۱a();
        r.getValue(resId, value, true);
        int i = value.type;
        return i >= 28 && i <= 31;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static TypedValue m۸۶۰۱a() {
        TypedValue tv = f۸۷۹۳a.get();
        if (tv == null) {
            TypedValue tv2 = new TypedValue();
            f۸۷۹۳a.set(tv2);
            return tv2;
        }
        return tv;
    }

    /* renamed from: a.b.h.c.a.a$a */
    private static class a {

        /* renamed from: a, reason: contains not printable characters */
        final ColorStateList f۸۷۹۶a;

        /* renamed from: b, reason: contains not printable characters */
        final Configuration f۸۷۹۷b;

        a(ColorStateList value, Configuration configuration) {
            this.f۸۷۹۶a = value;
            this.f۸۷۹۷b = configuration;
        }
    }
}
