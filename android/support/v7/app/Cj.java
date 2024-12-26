package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cj {

    /* renamed from: a, reason: contains not printable characters */
    private static Field f۱۱۰۷۰a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۱۰۷۱b;

    /* renamed from: c, reason: contains not printable characters */
    private static Class f۱۱۰۷۲c;

    /* renamed from: d, reason: contains not printable characters */
    private static boolean f۱۱۰۷۳d;

    /* renamed from: e, reason: contains not printable characters */
    private static Field f۱۱۰۷۴e;

    /* renamed from: f, reason: contains not printable characters */
    private static boolean f۱۱۰۷۵f;

    /* renamed from: g, reason: contains not printable characters */
    private static Field f۱۱۰۷۶g;

    /* renamed from: h, reason: contains not printable characters */
    private static boolean f۱۱۰۷۷h;

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۱۵۶۳a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m۱۱۵۶۷d(resources);
        } else if (i >= 23) {
            m۱۱۵۶۶c(resources);
        } else if (i >= 21) {
            m۱۱۵۶۵b(resources);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private static void m۱۱۵۶۵b(Resources resources) {
        if (!f۱۱۰۷۱b) {
            try {
                f۱۱۰۷۰a = Resources.class.getDeclaredField("mDrawableCache");
                f۱۱۰۷۰a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f۱۱۰۷۱b = true;
        }
        Field field = f۱۱۰۷۰a;
        if (field != null) {
            Map drawableCache = null;
            try {
                drawableCache = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (drawableCache != null) {
                drawableCache.clear();
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private static void m۱۱۵۶۶c(Resources resources) {
        if (!f۱۱۰۷۱b) {
            try {
                f۱۱۰۷۰a = Resources.class.getDeclaredField("mDrawableCache");
                f۱۱۰۷۰a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f۱۱۰۷۱b = true;
        }
        Object drawableCache = null;
        Field field = f۱۱۰۷۰a;
        if (field != null) {
            try {
                drawableCache = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (drawableCache == null) {
            return;
        }
        m۱۱۵۶۴a(drawableCache);
    }

    /* renamed from: d, reason: contains not printable characters */
    private static void m۱۱۵۶۷d(Resources resources) {
        if (!f۱۱۰۷۷h) {
            try {
                f۱۱۰۷۶g = Resources.class.getDeclaredField("mResourcesImpl");
                f۱۱۰۷۶g.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f۱۱۰۷۷h = true;
        }
        Field field = f۱۱۰۷۶g;
        if (field == null) {
            return;
        }
        Object resourcesImpl = null;
        try {
            resourcesImpl = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
        }
        if (resourcesImpl == null) {
            return;
        }
        if (!f۱۱۰۷۱b) {
            try {
                f۱۱۰۷۰a = resourcesImpl.getClass().getDeclaredField("mDrawableCache");
                f۱۱۰۷۰a.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f۱۱۰۷۱b = true;
        }
        Object drawableCache = null;
        Field field2 = f۱۱۰۷۰a;
        if (field2 != null) {
            try {
                drawableCache = field2.get(resourcesImpl);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (drawableCache != null) {
            m۱۱۵۶۴a(drawableCache);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۱۵۶۴a(Object cache) {
        if (!f۱۱۰۷۳d) {
            try {
                f۱۱۰۷۲c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f۱۱۰۷۳d = true;
        }
        Class cls = f۱۱۰۷۲c;
        if (cls == null) {
            return;
        }
        if (!f۱۱۰۷۵f) {
            try {
                f۱۱۰۷۴e = cls.getDeclaredField("mUnthemedEntries");
                f۱۱۰۷۴e.setAccessible(true);
            } catch (NoSuchFieldException ee) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ee);
            }
            f۱۱۰۷۵f = true;
        }
        Field field = f۱۱۰۷۴e;
        if (field == null) {
            return;
        }
        LongSparseArray unthemedEntries = null;
        try {
            unthemedEntries = (LongSparseArray) field.get(cache);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (unthemedEntries != null) {
            unthemedEntries.clear();
        }
    }
}
