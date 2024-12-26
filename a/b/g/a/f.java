package a.b.g.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.content.e.c;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f extends d {

    /* renamed from: a  reason: collision with root package name */
    protected final Class f۲۹۲a;

    /* renamed from: b  reason: collision with root package name */
    protected final Constructor f۲۹۳b;

    /* renamed from: c  reason: collision with root package name */
    protected final Method f۲۹۴c;

    /* renamed from: d  reason: collision with root package name */
    protected final Method f۲۹۵d;

    /* renamed from: e  reason: collision with root package name */
    protected final Method f۲۹۶e;

    /* renamed from: f  reason: collision with root package name */
    protected final Method f۲۹۷f;

    /* renamed from: g  reason: collision with root package name */
    protected final Method f۲۹۸g;

    public f() {
        Method abortCreation;
        Method freeze;
        Method addFontFromBuffer;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Constructor fontFamilyCtor;
        Class fontFamily;
        try {
            fontFamily = a();
            fontFamilyCtor = e(fontFamily);
            addFontFromAssetManager2 = b(fontFamily);
            addFontFromAssetManager = c(fontFamily);
            addFontFromBuffer = f(fontFamily);
            freeze = a(fontFamily);
            abortCreation = d(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            abortCreation = null;
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager2 = null;
            addFontFromAssetManager = null;
            addFontFromBuffer = null;
            freeze = null;
        }
        this.f۲۹۲a = fontFamily;
        this.f۲۹۳b = fontFamilyCtor;
        this.f۲۹۴c = addFontFromAssetManager2;
        this.f۲۹۵d = addFontFromAssetManager;
        this.f۲۹۶e = addFontFromBuffer;
        this.f۲۹۷f = freeze;
        this.f۲۹۸g = abortCreation;
    }

    private boolean b() {
        if (this.f۲۹۴c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f۲۹۴c != null;
    }

    private Object c() {
        try {
            return this.f۲۹۳b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean a(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            return ((Boolean) this.f۲۹۴c.invoke(family, context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean a(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            return ((Boolean) this.f۲۹۵d.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f۲۹۲a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f۲۹۸g.invoke(null, familyArray, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean c(Object family) {
        try {
            return ((Boolean) this.f۲۹۶e.invoke(family, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void b(Object family) {
        try {
            this.f۲۹۷f.invoke(family, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.b.g.a.h
    public Typeface a(Context context, c.b entry, Resources resources, int style) {
        if (!b()) {
            return super.a(context, entry, resources, style);
        }
        Object fontFamily = c();
        c.C۰۰۲۸c[] a2 = entry.a();
        for (c.C۰۰۲۸c fontFile : a2) {
            if (!a(context, fontFamily, fontFile.a(), fontFile.c(), fontFile.e(), fontFile.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFile.d()))) {
                b(fontFamily);
                return null;
            }
        }
        if (!c(fontFamily)) {
            return null;
        }
        return a(fontFamily);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00aa */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r0 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        throw r0;
     */
    @Override // a.b.g.a.d, a.b.g.a.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r20, android.os.CancellationSignal r21, a.b.g.e.b.f[] r22, int r23) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.a.f.a(android.content.Context, android.os.CancellationSignal, a.b.g.e.b$f[], int):android.graphics.Typeface");
    }

    @Override // a.b.g.a.h
    public Typeface a(Context context, Resources resources, int id, String path, int style) {
        if (!b()) {
            return super.a(context, resources, id, path, style);
        }
        Object fontFamily = c();
        if (!a(context, fontFamily, path, 0, -1, -1, null)) {
            b(fontFamily);
            return null;
        } else if (!c(fontFamily)) {
            return null;
        } else {
            return a(fontFamily);
        }
    }

    /* access modifiers changed from: protected */
    public Class a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor e(Class fontFamily) {
        return fontFamily.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method b(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls, cls, cls, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    public Method c(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromBuffer", ByteBuffer.class, cls, FontVariationAxis[].class, cls, cls);
    }

    /* access modifiers changed from: protected */
    public Method f(Class fontFamily) {
        return fontFamily.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method a(Class fontFamily) {
        return fontFamily.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method d(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), cls, cls);
        m.setAccessible(true);
        return m;
    }
}
