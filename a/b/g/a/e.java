package a.b.g.a;

import a.b.g.e.b;
import a.b.g.g.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.content.e.c;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class e extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f۲۸۸a;

    /* renamed from: b  reason: collision with root package name */
    private static final Constructor f۲۸۹b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f۲۹۰c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f۲۹۱d;

    e() {
    }

    static {
        Method addFontMethod;
        Constructor fontFamilyCtor;
        Method createFromFamiliesWithDefaultMethod;
        Class fontFamilyClass;
        ReflectiveOperationException e2;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            try {
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
                try {
                    addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
                    try {
                        createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamilyClass, 1).getClass());
                    } catch (ClassNotFoundException | NoSuchMethodException e3) {
                        e2 = e3;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException e4) {
                    e2 = e4;
                    Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
                    fontFamilyClass = null;
                    fontFamilyCtor = null;
                    addFontMethod = null;
                    createFromFamiliesWithDefaultMethod = null;
                    f۲۸۹b = fontFamilyCtor;
                    f۲۸۸a = fontFamilyClass;
                    f۲۹۰c = addFontMethod;
                    f۲۹۱d = createFromFamiliesWithDefaultMethod;
                }
            } catch (ClassNotFoundException | NoSuchMethodException e5) {
                e2 = e5;
                Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
                f۲۸۹b = fontFamilyCtor;
                f۲۸۸a = fontFamilyClass;
                f۲۹۰c = addFontMethod;
                f۲۹۱d = createFromFamiliesWithDefaultMethod;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            e2 = e6;
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            fontFamilyClass = null;
            fontFamilyCtor = null;
            addFontMethod = null;
            createFromFamiliesWithDefaultMethod = null;
            f۲۸۹b = fontFamilyCtor;
            f۲۸۸a = fontFamilyClass;
            f۲۹۰c = addFontMethod;
            f۲۹۱d = createFromFamiliesWithDefaultMethod;
        }
        f۲۸۹b = fontFamilyCtor;
        f۲۸۸a = fontFamilyClass;
        f۲۹۰c = addFontMethod;
        f۲۹۱d = createFromFamiliesWithDefaultMethod;
    }

    public static boolean a() {
        if (f۲۹۰c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f۲۹۰c != null;
    }

    private static Object b() {
        try {
            return f۲۸۹b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static boolean a(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            return ((Boolean) f۲۹۰c.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface a(Object family) {
        try {
            Object familyArray = Array.newInstance(f۲۸۸a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f۲۹۱d.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.b.g.a.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        Object family = b();
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new n<>();
        for (b.f font : fonts) {
            Uri uri = font.c();
            ByteBuffer buffer = (ByteBuffer) bufferCache.get(uri);
            if (buffer == null) {
                buffer = i.a(context, cancellationSignal, uri);
                bufferCache.put(uri, buffer);
            }
            if (!a(family, buffer, font.b(), font.d(), font.e())) {
                return null;
            }
        }
        return Typeface.create(a(family), style);
    }

    @Override // a.b.g.a.h
    public Typeface a(Context context, c.b entry, Resources resources, int style) {
        Object family = b();
        c.C۰۰۲۸c[] a2 = entry.a();
        for (c.C۰۰۲۸c e2 : a2) {
            ByteBuffer buffer = i.a(context, resources, e2.b());
            if (buffer == null || !a(family, buffer, e2.c(), e2.e(), e2.f())) {
                return null;
            }
        }
        return a(family);
    }
}
