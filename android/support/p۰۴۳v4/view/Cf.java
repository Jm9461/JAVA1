package android.support.p۰۴۳v4.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.f  reason: invalid class name */
public final class Cf {

    /* renamed from: a  reason: contains not printable characters */
    private static Field f۱۰۶۱۲a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۱۰۶۱۳b;

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۹۱۱a(LayoutInflater inflater, LayoutInflater.Factory2 factory) {
        if (!f۱۰۶۱۳b) {
            try {
                f۱۰۶۱۲a = LayoutInflater.class.getDeclaredField("mFactory2");
                f۱۰۶۱۲a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f۱۰۶۱۳b = true;
        }
        Field field = f۱۰۶۱۲a;
        if (field != null) {
            try {
                field.set(inflater, factory);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + inflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۹۱۲b(LayoutInflater inflater, LayoutInflater.Factory2 factory) {
        inflater.setFactory2(factory);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory f = inflater.getFactory();
            if (f instanceof LayoutInflater.Factory2) {
                m۱۲۹۱۱a(inflater, (LayoutInflater.Factory2) f);
            } else {
                m۱۲۹۱۱a(inflater, factory);
            }
        }
    }
}
