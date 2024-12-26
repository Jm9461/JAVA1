package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class g1 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f۲۰۸۱c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<g1>> f۲۰۸۲d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f۲۰۸۳a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f۲۰۸۴b;

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f۲۰۸۱c) {
            if (f۲۰۸۲d == null) {
                f۲۰۸۲d = new ArrayList<>();
            } else {
                for (int i = f۲۰۸۲d.size() - 1; i >= 0; i--) {
                    WeakReference<TintContextWrapper> ref = f۲۰۸۲d.get(i);
                    if (ref == null || ref.get() == null) {
                        f۲۰۸۲d.remove(i);
                    }
                }
                for (int i2 = f۲۰۸۲d.size() - 1; i2 >= 0; i2--) {
                    WeakReference<TintContextWrapper> ref2 = f۲۰۸۲d.get(i2);
                    g1 wrapper = ref2 != null ? (g1) ref2.get() : null;
                    if (wrapper != null && wrapper.getBaseContext() == context) {
                        return wrapper;
                    }
                }
            }
            g1 wrapper2 = new g1(context);
            f۲۰۸۲d.add(new WeakReference<>(wrapper2));
            return wrapper2;
        }
    }

    private static boolean a(Context context) {
        if ((context instanceof g1) || (context.getResources() instanceof i1) || (context.getResources() instanceof o1)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || o1.b()) {
            return true;
        }
        return false;
    }

    private g1(Context base) {
        super(base);
        if (o1.b()) {
            this.f۲۰۸۳a = new o1(this, base.getResources());
            this.f۲۰۸۴b = this.f۲۰۸۳a.newTheme();
            this.f۲۰۸۴b.setTo(base.getTheme());
            return;
        }
        this.f۲۰۸۳a = new i1(this, base.getResources());
        this.f۲۰۸۴b = null;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f۲۰۸۴b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int resid) {
        Resources.Theme theme = this.f۲۰۸۴b;
        if (theme == null) {
            super.setTheme(resid);
        } else {
            theme.applyStyle(resid, true);
        }
    }

    public Resources getResources() {
        return this.f۲۰۸۳a;
    }

    public AssetManager getAssets() {
        return this.f۲۰۸۳a.getAssets();
    }
}
