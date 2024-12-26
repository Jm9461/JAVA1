package a.b.h.f;

import a.b.h.a.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f۴۶۴a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f۴۶۵b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f۴۶۶c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f۴۶۷d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f۴۶۸e;

    public d() {
        super(null);
    }

    public d(Context base, int themeResId) {
        super(base);
        this.f۴۶۴a = themeResId;
    }

    public d(Context base, Resources.Theme theme) {
        super(base);
        this.f۴۶۵b = theme;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    public Resources getResources() {
        return b();
    }

    private Resources b() {
        if (this.f۴۶۸e == null) {
            Configuration configuration = this.f۴۶۷d;
            if (configuration == null) {
                this.f۴۶۸e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f۴۶۸e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f۴۶۸e;
    }

    public void setTheme(int resid) {
        if (this.f۴۶۴a != resid) {
            this.f۴۶۴a = resid;
            c();
        }
    }

    public int a() {
        return this.f۴۶۴a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f۴۶۵b;
        if (theme != null) {
            return theme;
        }
        if (this.f۴۶۴a == 0) {
            this.f۴۶۴a = i.Theme_AppCompat_Light;
        }
        c();
        return this.f۴۶۵b;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.f۴۶۶c == null) {
            this.f۴۶۶c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f۴۶۶c;
    }

    /* access modifiers changed from: protected */
    public void a(Resources.Theme theme, int resid, boolean first) {
        theme.applyStyle(resid, true);
    }

    private void c() {
        boolean first = this.f۴۶۵b == null;
        if (first) {
            this.f۴۶۵b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f۴۶۵b.setTo(theme);
            }
        }
        a(this.f۴۶۵b, this.f۴۶۴a, first);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
