package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* access modifiers changed from: package-private */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static Field f۱۵۹۰a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۵۹۱b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f۱۵۹۲c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f۱۵۹۳d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f۱۵۹۴e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f۱۵۹۵f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f۱۵۹۶g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f۱۵۹۷h;

    static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                d(resources);
            } else if (i >= 23) {
                c(resources);
            } else if (i >= 21) {
                b(resources);
            }
        }
    }

    private static void b(Resources resources) {
        if (!f۱۵۹۱b) {
            try {
                f۱۵۹۰a = Resources.class.getDeclaredField("mDrawableCache");
                f۱۵۹۰a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f۱۵۹۱b = true;
        }
        Field field = f۱۵۹۰a;
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

    private static void c(Resources resources) {
        if (!f۱۵۹۱b) {
            try {
                f۱۵۹۰a = Resources.class.getDeclaredField("mDrawableCache");
                f۱۵۹۰a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f۱۵۹۱b = true;
        }
        Object drawableCache = null;
        Field field = f۱۵۹۰a;
        if (field != null) {
            try {
                drawableCache = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (drawableCache != null) {
            a(drawableCache);
        }
    }

    private static void d(Resources resources) {
        if (!f۱۵۹۷h) {
            try {
                f۱۵۹۶g = Resources.class.getDeclaredField("mResourcesImpl");
                f۱۵۹۶g.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f۱۵۹۷h = true;
        }
        Field field = f۱۵۹۶g;
        if (field != null) {
            Object resourcesImpl = null;
            try {
                resourcesImpl = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            }
            if (resourcesImpl != null) {
                if (!f۱۵۹۱b) {
                    try {
                        f۱۵۹۰a = resourcesImpl.getClass().getDeclaredField("mDrawableCache");
                        f۱۵۹۰a.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    f۱۵۹۱b = true;
                }
                Object drawableCache = null;
                Field field2 = f۱۵۹۰a;
                if (field2 != null) {
                    try {
                        drawableCache = field2.get(resourcesImpl);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (drawableCache != null) {
                    a(drawableCache);
                }
            }
        }
    }

    private static void a(Object cache) {
        if (!f۱۵۹۳d) {
            try {
                f۱۵۹۲c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f۱۵۹۳d = true;
        }
        Class cls = f۱۵۹۲c;
        if (cls != null) {
            if (!f۱۵۹۵f) {
                try {
                    f۱۵۹۴e = cls.getDeclaredField("mUnthemedEntries");
                    f۱۵۹۴e.setAccessible(true);
                } catch (NoSuchFieldException ee) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ee);
                }
                f۱۵۹۵f = true;
            }
            Field field = f۱۵۹۴e;
            if (field != null) {
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
    }
}
