package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۷v7.widget.Cj;
import android.support.v7.content.res.AppCompatResources;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: a.b.h.c.a.a  reason: invalid class name */
public final class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f۸۷۹۳a = new ThreadLocal<>();

    /* renamed from: b  reason: contains not printable characters */
    private static final WeakHashMap<Context, SparseArray<Ca>> f۸۷۹۴b = new WeakHashMap<>(0);

    /* renamed from: c  reason: contains not printable characters */
    private static final Object f۸۷۹۵c = new Object();

    /* renamed from: b  reason: contains not printable characters */
    public static ColorStateList m۱۰۶۷۲b(Context context, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(resId);
        }
        ColorStateList csl = m۱۰۶۶۹a(context, resId);
        if (csl != null) {
            return csl;
        }
        ColorStateList csl2 = m۱۰۶۷۴d(context, resId);
        if (csl2 == null) {
            return android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۴b(context, resId);
        }
        m۱۰۶۷۱a(context, resId, csl2);
        return csl2;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Drawable m۱۰۶۷۳c(Context context, int resId) {
        return Cj.m۱۵۲۸۷a().m۱۵۳۰۶a(context, resId);
    }

    /* renamed from: d  reason: contains not printable characters */
    private static ColorStateList m۱۰۶۷۴d(Context context, int resId) {
        if (m۱۰۶۷۵e(context, resId)) {
            return null;
        }
        Resources r = context.getResources();
        try {
            return android.support.p۰۴۳v4.content.p۰۴۴e.Ca.m۱۲۶۴۰a(r, r.getXml(resId), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static ColorStateList m۱۰۶۶۹a(Context context, int resId) {
        Ca entry;
        synchronized (f۸۷۹۵c) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f۸۷۹۴b.get(context);
            if (!(entries == null || entries.size() <= 0 || (entry = (Ca) entries.get(resId)) == null)) {
                if (entry.f۸۷۹۷b.equals(context.getResources().getConfiguration())) {
                    return entry.f۸۷۹۶a;
                }
                entries.remove(resId);
            }
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۶۷۱a(Context context, int resId, ColorStateList value) {
        synchronized (f۸۷۹۵c) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f۸۷۹۴b.get(context);
            if (entries == null) {
                entries = new SparseArray<>();
                f۸۷۹۴b.put(context, entries);
            }
            entries.append(resId, new Ca(value, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private static boolean m۱۰۶۷۵e(Context context, int resId) {
        Resources r = context.getResources();
        TypedValue value = m۱۰۶۷۰a();
        r.getValue(resId, value, true);
        int i = value.type;
        if (i < 28 || i > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static TypedValue m۱۰۶۷۰a() {
        TypedValue tv = f۸۷۹۳a.get();
        if (tv != null) {
            return tv;
        }
        TypedValue tv2 = new TypedValue();
        f۸۷۹۳a.set(tv2);
        return tv2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.c.a.a$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        final ColorStateList f۸۷۹۶a;

        /* renamed from: b  reason: contains not printable characters */
        final Configuration f۸۷۹۷b;

        Ca(ColorStateList value, Configuration configuration) {
            this.f۸۷۹۶a = value;
            this.f۸۷۹۷b = configuration;
        }
    }
}
