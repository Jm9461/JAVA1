package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cc;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: a.b.g.a.f  reason: invalid class name */
public class Cf extends Cd {

    /* renamed from: a  reason: contains not printable characters */
    protected final Class f۸۶۵۵a;

    /* renamed from: b  reason: contains not printable characters */
    protected final Constructor f۸۶۵۶b;

    /* renamed from: c  reason: contains not printable characters */
    protected final Method f۸۶۵۷c;

    /* renamed from: d  reason: contains not printable characters */
    protected final Method f۸۶۵۸d;

    /* renamed from: e  reason: contains not printable characters */
    protected final Method f۸۶۵۹e;

    /* renamed from: f  reason: contains not printable characters */
    protected final Method f۸۶۶۰f;

    /* renamed from: g  reason: contains not printable characters */
    protected final Method f۸۶۶۱g;

    public Cf() {
        Method abortCreation;
        Method freeze;
        Method addFontFromBuffer;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Constructor fontFamilyCtor;
        Class fontFamily;
        try {
            fontFamily = m۱۰۴۵۹a();
            fontFamilyCtor = m۱۰۴۶۴e(fontFamily);
            addFontFromAssetManager2 = m۱۰۴۶۱b(fontFamily);
            addFontFromAssetManager = m۱۰۴۶۲c(fontFamily);
            addFontFromBuffer = m۱۰۴۶۵f(fontFamily);
            freeze = m۱۰۴۶۰a(fontFamily);
            abortCreation = m۱۰۴۶۳d(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            abortCreation = null;
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager2 = null;
            addFontFromAssetManager = null;
            addFontFromBuffer = null;
            freeze = null;
        }
        this.f۸۶۵۵a = fontFamily;
        this.f۸۶۵۶b = fontFamilyCtor;
        this.f۸۶۵۷c = addFontFromAssetManager2;
        this.f۸۶۵۸d = addFontFromAssetManager;
        this.f۸۶۵۹e = addFontFromBuffer;
        this.f۸۶۶۰f = freeze;
        this.f۸۶۶۱g = abortCreation;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۰۴۵۲b() {
        if (this.f۸۶۵۷c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f۸۶۵۷c != null;
    }

    /* renamed from: c  reason: contains not printable characters */
    private Object m۱۰۴۵۳c() {
        try {
            return this.f۸۶۵۶b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۰۴۴۹a(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            return ((Boolean) this.f۸۶۵۷c.invoke(family, context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۰۴۵۰a(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            return ((Boolean) this.f۸۶۵۸d.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۵۸a(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f۸۶۵۵a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f۸۶۶۱g.invoke(null, familyArray, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۰۴۵۴c(Object family) {
        try {
            return ((Boolean) this.f۸۶۵۹e.invoke(family, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۴۵۱b(Object family) {
        try {
            this.f۸۶۶۰f.invoke(family, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۵۷a(Context context, Cc.Cb entry, Resources resources, int style) {
        if (!m۱۰۴۵۲b()) {
            return super.m۱۰۴۷۳a(context, entry, resources, style);
        }
        Object fontFamily = m۱۰۴۵۳c();
        Cc.Cc[] a = entry.m۱۲۶۶۴a();
        for (Cc.Cc fontFile : a) {
            if (!m۱۰۴۴۹a(context, fontFamily, fontFile.m۱۲۶۶۵a(), fontFile.m۱۲۶۶۷c(), fontFile.m۱۲۶۶۹e(), fontFile.m۱۲۶۷۰f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFile.m۱۲۶۶۸d()))) {
                m۱۰۴۵۱b(fontFamily);
                return null;
            }
        }
        if (!m۱۰۴۵۴c(fontFamily)) {
            return null;
        }
        return m۱۰۴۵۸a(fontFamily);
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
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cd, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface m۱۰۴۵۶a(android.content.Context r20, android.os.CancellationSignal r21, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb.Cf[] r22, int r23) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cf.m۱۰۴۵۶a(android.content.Context, android.os.CancellationSignal, a.b.g.e.b$f[], int):android.graphics.Typeface");
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۵۵a(Context context, Resources resources, int id, String path, int style) {
        if (!m۱۰۴۵۲b()) {
            return super.m۱۰۴۷۱a(context, resources, id, path, style);
        }
        Object fontFamily = m۱۰۴۵۳c();
        if (!m۱۰۴۴۹a(context, fontFamily, path, 0, -1, -1, null)) {
            m۱۰۴۵۱b(fontFamily);
            return null;
        } else if (!m۱۰۴۵۴c(fontFamily)) {
            return null;
        } else {
            return m۱۰۴۵۸a(fontFamily);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Class m۱۰۴۵۹a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e  reason: contains not printable characters */
    public Constructor m۱۰۴۶۴e(Class fontFamily) {
        return fontFamily.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public Method m۱۰۴۶۱b(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls, cls, cls, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public Method m۱۰۴۶۲c(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromBuffer", ByteBuffer.class, cls, FontVariationAxis[].class, cls, cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f  reason: contains not printable characters */
    public Method m۱۰۴۶۵f(Class fontFamily) {
        return fontFamily.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Method m۱۰۴۶۰a(Class fontFamily) {
        return fontFamily.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d  reason: contains not printable characters */
    public Method m۱۰۴۶۳d(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), cls, cls);
        m.setAccessible(true);
        return m;
    }
}
