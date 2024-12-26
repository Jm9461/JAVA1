package android.support.v4.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static Field f۱۳۵۸a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۳۵۹b;

    private static void a(LayoutInflater inflater, LayoutInflater.Factory2 factory) {
        if (!f۱۳۵۹b) {
            try {
                f۱۳۵۸a = LayoutInflater.class.getDeclaredField("mFactory2");
                f۱۳۵۸a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e2);
            }
            f۱۳۵۹b = true;
        }
        Field field = f۱۳۵۸a;
        if (field != null) {
            try {
                field.set(inflater, factory);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + inflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    public static void b(LayoutInflater inflater, LayoutInflater.Factory2 factory) {
        inflater.setFactory2(factory);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory f2 = inflater.getFactory();
            if (f2 instanceof LayoutInflater.Factory2) {
                a(inflater, (LayoutInflater.Factory2) f2);
            } else {
                a(inflater, factory);
            }
        }
    }
}
