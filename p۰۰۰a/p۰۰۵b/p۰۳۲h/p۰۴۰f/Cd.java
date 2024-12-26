package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ci;

/* renamed from: a.b.h.f.d  reason: invalid class name */
public class Cd extends ContextWrapper {

    /* renamed from: a  reason: contains not printable characters */
    private int f۸۸۸۱a;

    /* renamed from: b  reason: contains not printable characters */
    private Resources.Theme f۸۸۸۲b;

    /* renamed from: c  reason: contains not printable characters */
    private LayoutInflater f۸۸۸۳c;

    /* renamed from: d  reason: contains not printable characters */
    private Configuration f۸۸۸۴d;

    /* renamed from: e  reason: contains not printable characters */
    private Resources f۸۸۸۵e;

    public Cd() {
        super(null);
    }

    public Cd(Context base, int themeResId) {
        super(base);
        this.f۸۸۸۱a = themeResId;
    }

    public Cd(Context base, Resources.Theme theme) {
        super(base);
        this.f۸۸۸۲b = theme;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    public Resources getResources() {
        return m۱۰۷۹۵b();
    }

    /* renamed from: b  reason: contains not printable characters */
    private Resources m۱۰۷۹۵b() {
        if (this.f۸۸۸۵e == null) {
            Configuration configuration = this.f۸۸۸۴d;
            if (configuration == null) {
                this.f۸۸۸۵e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f۸۸۸۵e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f۸۸۸۵e;
    }

    public void setTheme(int resid) {
        if (this.f۸۸۸۱a != resid) {
            this.f۸۸۸۱a = resid;
            m۱۰۷۹۶c();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۷۹۷a() {
        return this.f۸۸۸۱a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f۸۸۸۲b;
        if (theme != null) {
            return theme;
        }
        if (this.f۸۸۸۱a == 0) {
            this.f۸۸۸۱a = Ci.Theme_AppCompat_Light;
        }
        m۱۰۷۹۶c();
        return this.f۸۸۸۲b;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.f۸۸۸۳c == null) {
            this.f۸۸۸۳c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f۸۸۸۳c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۹۸a(Resources.Theme theme, int resid, boolean first) {
        theme.applyStyle(resid, true);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۷۹۶c() {
        boolean first = this.f۸۸۸۲b == null;
        if (first) {
            this.f۸۸۸۲b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f۸۸۸۲b.setTo(theme);
            }
        }
        m۱۰۷۹۸a(this.f۸۸۸۲b, this.f۸۸۸۱a, first);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
