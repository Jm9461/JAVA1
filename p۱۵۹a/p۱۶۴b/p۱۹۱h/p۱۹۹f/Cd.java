package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ci;

/* renamed from: a.b.h.f.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd extends ContextWrapper {

    /* renamed from: a, reason: contains not printable characters */
    private int f۸۸۸۱a;

    /* renamed from: b, reason: contains not printable characters */
    private Resources.Theme f۸۸۸۲b;

    /* renamed from: c, reason: contains not printable characters */
    private LayoutInflater f۸۸۸۳c;

    /* renamed from: d, reason: contains not printable characters */
    private Configuration f۸۸۸۴d;

    /* renamed from: e, reason: contains not printable characters */
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

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m۸۷۲۶b();
    }

    /* renamed from: b, reason: contains not printable characters */
    private Resources m۸۷۲۶b() {
        if (this.f۸۸۸۵e == null) {
            Configuration configuration = this.f۸۸۸۴d;
            if (configuration == null) {
                this.f۸۸۸۵e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                Context resContext = createConfigurationContext(configuration);
                this.f۸۸۸۵e = resContext.getResources();
            }
        }
        return this.f۸۸۸۵e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int resid) {
        if (this.f۸۸۸۱a != resid) {
            this.f۸۸۸۱a = resid;
            m۸۷۲۷c();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۸۷۲۸a() {
        return this.f۸۸۸۱a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f۸۸۸۲b;
        if (theme != null) {
            return theme;
        }
        if (this.f۸۸۸۱a == 0) {
            this.f۸۸۸۱a = Ci.Theme_AppCompat_Light;
        }
        m۸۷۲۷c();
        return this.f۸۸۸۲b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        if ("layout_inflater".equals(name)) {
            if (this.f۸۸۸۳c == null) {
                this.f۸۸۸۳c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f۸۸۸۳c;
        }
        return getBaseContext().getSystemService(name);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۸۷۲۹a(Resources.Theme theme, int resid, boolean first) {
        theme.applyStyle(resid, true);
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۷۲۷c() {
        boolean first = this.f۸۸۸۲b == null;
        if (first) {
            this.f۸۸۸۲b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f۸۸۸۲b.setTo(theme);
            }
        }
        m۸۷۲۹a(this.f۸۸۸۲b, this.f۸۸۸۱a, first);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
