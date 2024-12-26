package a.b.h.c.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.j;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f۴۲۴a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C۰۰۱۷a>> f۴۲۵b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f۴۲۶c = new Object();

    public static ColorStateList b(Context context, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(resId);
        }
        ColorStateList csl = a(context, resId);
        if (csl != null) {
            return csl;
        }
        ColorStateList csl2 = d(context, resId);
        if (csl2 == null) {
            return android.support.v4.content.a.b(context, resId);
        }
        a(context, resId, csl2);
        return csl2;
    }

    public static Drawable c(Context context, int resId) {
        return j.a().a(context, resId);
    }

    private static ColorStateList d(Context context, int resId) {
        if (e(context, resId)) {
            return null;
        }
        Resources r = context.getResources();
        try {
            return android.support.v4.content.e.a.a(r, r.getXml(resId), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static ColorStateList a(Context context, int resId) {
        C۰۰۱۷a entry;
        synchronized (f۴۲۶c) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f۴۲۵b.get(context);
            if (!(entries == null || entries.size() <= 0 || (entry = (C۰۰۱۷a) entries.get(resId)) == null)) {
                if (entry.f۴۲۸b.equals(context.getResources().getConfiguration())) {
                    return entry.f۴۲۷a;
                }
                entries.remove(resId);
            }
            return null;
        }
    }

    private static void a(Context context, int resId, ColorStateList value) {
        synchronized (f۴۲۶c) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f۴۲۵b.get(context);
            if (entries == null) {
                entries = new SparseArray<>();
                f۴۲۵b.put(context, entries);
            }
            entries.append(resId, new C۰۰۱۷a(value, context.getResources().getConfiguration()));
        }
    }

    private static boolean e(Context context, int resId) {
        Resources r = context.getResources();
        TypedValue value = a();
        r.getValue(resId, value, true);
        int i = value.type;
        if (i < 28 || i > 31) {
            return false;
        }
        return true;
    }

    private static TypedValue a() {
        TypedValue tv = f۴۲۴a.get();
        if (tv != null) {
            return tv;
        }
        TypedValue tv2 = new TypedValue();
        f۴۲۴a.set(tv2);
        return tv2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.c.a.a$a  reason: collision with other inner class name */
    public static class C۰۰۱۷a {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f۴۲۷a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f۴۲۸b;

        C۰۰۱۷a(ColorStateList value, Configuration configuration) {
            this.f۴۲۷a = value;
            this.f۴۲۸b = configuration;
        }
    }
}
