package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.v4.content.p۲۰۲e.Cc;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cb;

/* renamed from: a.b.g.a.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf extends Cd {

    /* renamed from: a, reason: contains not printable characters */
    protected final Class f۸۶۵۵a;

    /* renamed from: b, reason: contains not printable characters */
    protected final Constructor f۸۶۵۶b;

    /* renamed from: c, reason: contains not printable characters */
    protected final Method f۸۶۵۷c;

    /* renamed from: d, reason: contains not printable characters */
    protected final Method f۸۶۵۸d;

    /* renamed from: e, reason: contains not printable characters */
    protected final Method f۸۶۵۹e;

    /* renamed from: f, reason: contains not printable characters */
    protected final Method f۸۶۶۰f;

    /* renamed from: g, reason: contains not printable characters */
    protected final Method f۸۶۶۱g;

    public Cf() {
        Method abortCreation;
        Class fontFamily;
        Constructor fontFamilyCtor;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Method addFontFromBuffer;
        Method freeze;
        try {
            fontFamily = m۸۳۹۴a();
            fontFamilyCtor = m۸۳۹۹e(fontFamily);
            addFontFromAssetManager = m۸۳۹۶b(fontFamily);
            addFontFromAssetManager2 = m۸۳۹۷c(fontFamily);
            addFontFromBuffer = m۸۴۰۰f(fontFamily);
            freeze = m۸۳۹۵a(fontFamily);
            abortCreation = mo۸۴۰۲d(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            abortCreation = null;
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager = null;
            addFontFromAssetManager2 = null;
            addFontFromBuffer = null;
            freeze = null;
        }
        this.f۸۶۵۵a = fontFamily;
        this.f۸۶۵۶b = fontFamilyCtor;
        this.f۸۶۵۷c = addFontFromAssetManager;
        this.f۸۶۵۸d = addFontFromAssetManager2;
        this.f۸۶۵۹e = addFontFromBuffer;
        this.f۸۶۶۰f = freeze;
        this.f۸۶۶۱g = abortCreation;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۸۳۸۷b() {
        if (this.f۸۶۵۷c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f۸۶۵۷c != null;
    }

    /* renamed from: c, reason: contains not printable characters */
    private Object m۸۳۸۸c() {
        try {
            return this.f۸۶۵۶b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۸۳۸۴a(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            Boolean result = (Boolean) this.f۸۶۵۷c.invoke(family, context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes);
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۸۳۸۵a(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            Boolean result = (Boolean) this.f۸۶۵۸d.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style));
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Typeface mo۸۴۰۱a(Object family) {
        try {
            Object familyArray = Array.newInstance((Class<?>) this.f۸۶۵۵a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f۸۶۶۱g.invoke(null, familyArray, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۸۳۸۹c(Object family) {
        try {
            Boolean result = (Boolean) this.f۸۶۵۹e.invoke(family, new Object[0]);
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۳۸۶b(Object family) {
        try {
            this.f۸۶۶۰f.invoke(family, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۸a(Context context, Cc.b bVar, Resources resources, int i) {
        if (!m۸۳۸۷b()) {
            return super.mo۸۴۰۸a(context, bVar, resources, i);
        }
        Object obj = m۸۳۸۸c();
        for (Cc.c cVar : bVar.m۱۰۵۹۴a()) {
            if (!m۸۳۸۴a(context, obj, cVar.m۱۰۵۹۵a(), cVar.m۱۰۵۹۷c(), cVar.m۱۰۵۹۹e(), cVar.m۱۰۶۰۰f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m۱۰۵۹۸d()))) {
                m۸۳۸۶b(obj);
                return null;
            }
        }
        if (m۸۳۸۹c(obj)) {
            return mo۸۴۰۱a(obj);
        }
        return null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cd, p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۷a(Context context, CancellationSignal cancellationSignal, Cb.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (!m۸۳۸۷b()) {
            Cb.f fVar = m۸۴۰۵a(fVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(fVar.m۸۴۵۱c(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    try {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(fVar.m۸۴۵۲d()).setItalic(fVar.m۸۴۵۳e()).build();
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return build;
                    } finally {
                    }
                } else {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
            } catch (IOException e2) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> map = Cb.m۸۴۴۱a(context, fVarArr, cancellationSignal);
            Object obj = m۸۳۸۸c();
            int length = fVarArr.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Cb.f fVar2 = fVarArr[i2];
                ByteBuffer byteBuffer = map.get(fVar2.m۸۴۵۱c());
                if (byteBuffer != null) {
                    if (!m۸۳۸۵a(obj, byteBuffer, fVar2.m۸۴۵۰b(), fVar2.m۸۴۵۲d(), fVar2.m۸۴۵۳e() ? 1 : 0)) {
                        m۸۳۸۶b(obj);
                        return null;
                    }
                    z = true;
                }
                i2++;
                z = z;
            }
            if (!z) {
                m۸۳۸۶b(obj);
                return null;
            }
            if (m۸۳۸۹c(obj)) {
                return Typeface.create(mo۸۴۰۱a(obj), i);
            }
            return null;
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Typeface mo۸۴۰۶a(Context context, Resources resources, int id, String path, int style) {
        if (!m۸۳۸۷b()) {
            return super.mo۸۴۰۶a(context, resources, id, path, style);
        }
        Object fontFamily = m۸۳۸۸c();
        if (!m۸۳۸۴a(context, fontFamily, path, 0, -1, -1, null)) {
            m۸۳۸۶b(fontFamily);
            return null;
        }
        if (m۸۳۸۹c(fontFamily)) {
            return mo۸۴۰۱a(fontFamily);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Class m۸۳۹۴a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: e, reason: contains not printable characters */
    protected Constructor m۸۳۹۹e(Class fontFamily) {
        return fontFamily.getConstructor(new Class[0]);
    }

    /* renamed from: b, reason: contains not printable characters */
    protected Method m۸۳۹۶b(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls, cls, cls, FontVariationAxis[].class);
    }

    /* renamed from: c, reason: contains not printable characters */
    protected Method m۸۳۹۷c(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromBuffer", ByteBuffer.class, cls, FontVariationAxis[].class, cls, cls);
    }

    /* renamed from: f, reason: contains not printable characters */
    protected Method m۸۴۰۰f(Class fontFamily) {
        return fontFamily.getMethod("freeze", new Class[0]);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected Method m۸۳۹۵a(Class fontFamily) {
        return fontFamily.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: d, reason: contains not printable characters */
    protected Method mo۸۴۰۲d(Class fontFamily) {
        Object familyArray = Array.newInstance((Class<?>) fontFamily, 1);
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", familyArray.getClass(), cls, cls);
        m.setAccessible(true);
        return m;
    }
}
