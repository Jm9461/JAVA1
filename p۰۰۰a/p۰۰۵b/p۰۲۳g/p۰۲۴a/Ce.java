package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cc;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: a.b.g.a.e  reason: invalid class name */
class Ce extends Ch {

    /* renamed from: a  reason: contains not printable characters */
    private static final Class f۸۶۵۱a;

    /* renamed from: b  reason: contains not printable characters */
    private static final Constructor f۸۶۵۲b;

    /* renamed from: c  reason: contains not printable characters */
    private static final Method f۸۶۵۳c;

    /* renamed from: d  reason: contains not printable characters */
    private static final Method f۸۶۵۴d;

    Ce() {
    }

    static {
        Method addFontMethod;
        Constructor fontFamilyCtor;
        Method createFromFamiliesWithDefaultMethod;
        Class fontFamilyClass;
        ReflectiveOperationException e;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            try {
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
                try {
                    addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
                    try {
                        createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamilyClass, 1).getClass());
                    } catch (ClassNotFoundException | NoSuchMethodException e2) {
                        e = e2;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException e3) {
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
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
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
        }
        f۸۶۵۲b = fontFamilyCtor;
        f۸۶۵۱a = fontFamilyClass;
        f۸۶۵۳c = addFontMethod;
        f۸۶۵۴d = createFromFamiliesWithDefaultMethod;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۰۴۴۴a() {
        if (f۸۶۵۳c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f۸۶۵۳c != null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static Object m۱۰۴۴۶b() {
        try {
            return f۸۶۵۲b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۰۴۴۵a(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            return ((Boolean) f۸۶۵۳c.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Typeface m۱۰۴۴۳a(Object family) {
        try {
            Object familyArray = Array.newInstance(f۸۶۵۱a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f۸۶۵۴d.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۴۷a(Context context, CancellationSignal cancellationSignal, Cb.Cf[] fonts, int style) {
        Object family = m۱۰۴۴۶b();
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new Cn<>();
        for (Cb.Cf font : fonts) {
            Uri uri = font.m۱۰۵۲۲c();
            ByteBuffer buffer = (ByteBuffer) bufferCache.get(uri);
            if (buffer == null) {
                buffer = Ci.m۱۰۴۸۷a(context, cancellationSignal, uri);
                bufferCache.put(uri, buffer);
            }
            if (!m۱۰۴۴۵a(family, buffer, font.m۱۰۵۲۱b(), font.m۱۰۵۲۳d(), font.m۱۰۵۲۴e())) {
                return null;
            }
        }
        return Typeface.create(m۱۰۴۴۳a(family), style);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۴۸a(Context context, Cc.Cb entry, Resources resources, int style) {
        Object family = m۱۰۴۴۶b();
        Cc.Cc[] a = entry.m۱۲۶۶۴a();
        for (Cc.Cc e : a) {
            ByteBuffer buffer = Ci.m۱۰۴۸۶a(context, resources, e.m۱۲۶۶۶b());
            if (buffer == null || !m۱۰۴۴۵a(family, buffer, e.m۱۲۶۶۷c(), e.m۱۲۶۶۹e(), e.m۱۲۶۷۰f())) {
                return null;
            }
        }
        return m۱۰۴۴۳a(family);
    }
}
