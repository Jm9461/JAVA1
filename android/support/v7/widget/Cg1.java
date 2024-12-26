package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.g1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg1 extends ContextWrapper {

    /* renamed from: c, reason: contains not printable characters */
    private static final Object f۱۲۰۶۹c = new Object();

    /* renamed from: d, reason: contains not printable characters */
    private static ArrayList<WeakReference<Cg1>> f۱۲۰۷۰d;

    /* renamed from: a, reason: contains not printable characters */
    private final Resources f۱۲۰۷۱a;

    /* renamed from: b, reason: contains not printable characters */
    private final Resources.Theme f۱۲۰۷۲b;

    /* renamed from: b, reason: contains not printable characters */
    public static Context m۱۳۱۸۳b(Context context) {
        if (m۱۳۱۸۲a(context)) {
            synchronized (f۱۲۰۶۹c) {
                if (f۱۲۰۷۰d == null) {
                    f۱۲۰۷۰d = new ArrayList<>();
                } else {
                    for (int i = f۱۲۰۷۰d.size() - 1; i >= 0; i--) {
                        WeakReference<Cg1> weakReference = f۱۲۰۷۰d.get(i);
                        if (weakReference == null || weakReference.get() == null) {
                            f۱۲۰۷۰d.remove(i);
                        }
                    }
                    for (int i2 = f۱۲۰۷۰d.size() - 1; i2 >= 0; i2--) {
                        WeakReference<Cg1> weakReference2 = f۱۲۰۷۰d.get(i2);
                        Cg1 wrapper = weakReference2 != null ? weakReference2.get() : null;
                        if (wrapper != null && wrapper.getBaseContext() == context) {
                            return wrapper;
                        }
                    }
                }
                Cg1 wrapper2 = new Cg1(context);
                f۱۲۰۷۰d.add(new WeakReference<>(wrapper2));
                return wrapper2;
            }
        }
        return context;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۳۱۸۲a(Context context) {
        if ((context instanceof Cg1) || (context.getResources() instanceof Ci1) || (context.getResources() instanceof Co1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || Co1.m۱۳۴۰۹b();
    }

    private Cg1(Context base) {
        super(base);
        if (Co1.m۱۳۴۰۹b()) {
            this.f۱۲۰۷۱a = new Co1(this, base.getResources());
            this.f۱۲۰۷۲b = this.f۱۲۰۷۱a.newTheme();
            this.f۱۲۰۷۲b.setTo(base.getTheme());
        } else {
            this.f۱۲۰۷۱a = new Ci1(this, base.getResources());
            this.f۱۲۰۷۲b = null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f۱۲۰۷۲b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int resid) {
        Resources.Theme theme = this.f۱۲۰۷۲b;
        if (theme == null) {
            super.setTheme(resid);
        } else {
            theme.applyStyle(resid, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f۱۲۰۷۱a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f۱۲۰۷۱a.getAssets();
    }
}
