package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.content.p۲۰۲e.Cc;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: a.b.g.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends Ch {

    /* renamed from: a, reason: contains not printable characters */
    private static final Class f۸۶۵۱a;

    /* renamed from: b, reason: contains not printable characters */
    private static final Constructor f۸۶۵۲b;

    /* renamed from: c, reason: contains not printable characters */
    private static final Method f۸۶۵۳c;

    /* renamed from: d, reason: contains not printable characters */
    private static final Method f۸۶۵۴d;

    Ce() {
    }

    static {
        Class fontFamilyClass;
        Constructor fontFamilyCtor;
        Method addFontMethod;
        Method createFromFamiliesWithDefaultMethod;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            try {
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
            } catch (ClassNotFoundException e2) {
                e = e2;
                Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
                f۸۶۵۲b = fontFamilyCtor;
                f۸۶۵۱a = fontFamilyClass;
                f۸۶۵۳c = addFontMethod;
                f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
            } catch (NoSuchMethodException e3) {
                e = e3;
                Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
                f۸۶۵۲b = fontFamilyCtor;
                f۸۶۵۱a = fontFamilyClass;
                f۸۶۵۳c = addFontMethod;
                f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            e = e4;
        }
        try {
            addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
        } catch (ClassNotFoundException e5) {
            e = e5;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            fontFamilyClass = null;
            fontFamilyCtor = null;
            addFontMethod = null;
            createFromFamiliesWithDefaultMethod = null;
            f۸۶۵۲b = fontFamilyCtor;
            f۸۶۵۱a = fontFamilyClass;
            f۸۶۵۳c = addFontMethod;
            f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            fontFamilyClass = null;
            fontFamilyCtor = null;
            addFontMethod = null;
            createFromFamiliesWithDefaultMethod = null;
            f۸۶۵۲b = fontFamilyCtor;
            f۸۶۵۱a = fontFamilyClass;
            f۸۶۵۳c = addFontMethod;
            f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
        }
        try {
            Object familyArray = Array.newInstance((Class<?>) fontFamilyClass, 1);
            createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", familyArray.getClass());
        } catch (ClassNotFoundException e7) {
            e = e7;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            fontFamilyClass = null;
            fontFamilyCtor = null;
            addFontMethod = null;
            createFromFamiliesWithDefaultMethod = null;
            f۸۶۵۲b = fontFamilyCtor;
            f۸۶۵۱a = fontFamilyClass;
            f۸۶۵۳c = addFontMethod;
            f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
        } catch (NoSuchMethodException e8) {
            e = e8;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            fontFamilyClass = null;
            fontFamilyCtor = null;
            addFontMethod = null;
            createFromFamiliesWithDefaultMethod = null;
            f۸۶۵۲b = fontFamilyCtor;
            f۸۶۵۱a = fontFamilyClass;
            f۸۶۵۳c = addFontMethod;
            f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
        }
        f۸۶۵۲b = fontFamilyCtor;
        f۸۶۵۱a = fontFamilyClass;
        f۸۶۵۳c = addFontMethod;
        f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۸۳۷۹a() {
        if (f۸۶۵۳c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f۸۶۵۳c != null;
    }

    /* renamed from: b, reason: contains not printable characters */
    private static Object m۸۳۸۱b() {
        try {
            return f۸۶۵۲b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۸۳۸۰a(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            Boolean result = (Boolean) f۸۶۵۳c.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style));
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Typeface m۸۳۷۸a(Object family) {
        try {
            Object familyArray = Array.newInstance((Class<?>) f۸۶۵۱a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f۸۶۵۴d.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<android.net.Uri, java.nio.ByteBuffer> */
    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۷a(Context context, CancellationSignal cancellationSignal, Cb.f[] fonts, int style) {
        Object family = m۸۳۸۱b();
        Cn cn = new Cn();
        for (Cb.f font : fonts) {
            Uri uri = font.m۸۴۵۱c();
            ByteBuffer buffer = (ByteBuffer) cn.get(uri);
            if (buffer == null) {
                buffer = Ci.m۸۴۱۸a(context, cancellationSignal, uri);
                cn.put(uri, buffer);
            }
            if (!m۸۳۸۰a(family, buffer, font.m۸۴۵۰b(), font.m۸۴۵۲d(), font.m۸۴۵۳e())) {
                return null;
            }
        }
        Typeface typeface = m۸۳۷۸a(family);
        return Typeface.create(typeface, style);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۸a(Context context, Cc.b entry, Resources resources, int style) {
        Object family = m۸۳۸۱b();
        for (Cc.c e2 : entry.m۱۰۵۹۴a()) {
            ByteBuffer buffer = Ci.m۸۴۱۷a(context, resources, e2.m۱۰۵۹۶b());
            if (buffer == null || !m۸۳۸۰a(family, buffer, e2.m۱۰۵۹۷c(), e2.m۱۰۵۹۹e(), e2.m۱۰۶۰۰f())) {
                return null;
            }
        }
        return m۸۳۷۸a(family);
    }
}
