package android.support.v7.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.Cc;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cd;

/* renamed from: android.support.v7.app.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb implements DrawerLayout.InterfaceCd {

    /* renamed from: a, reason: contains not printable characters */
    private final b f۱۰۹۵۴a;

    /* renamed from: b, reason: contains not printable characters */
    private final DrawerLayout f۱۰۹۵۵b;

    /* renamed from: c, reason: contains not printable characters */
    private Cd f۱۰۹۵۶c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۰۹۵۷d;

    /* renamed from: e, reason: contains not printable characters */
    boolean f۱۰۹۵۸e;

    /* renamed from: f, reason: contains not printable characters */
    private final int f۱۰۹۵۹f;

    /* renamed from: g, reason: contains not printable characters */
    private final int f۱۰۹۶۰g;

    /* renamed from: h, reason: contains not printable characters */
    View.OnClickListener f۱۰۹۶۱h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۱۰۹۶۲i;

    /* renamed from: android.support.v7.app.b$b */
    public interface b {
        /* renamed from: a, reason: contains not printable characters */
        Context mo۱۱۵۳۱a();

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۱۵۳۲a(int i);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۱۵۳۳a(Drawable drawable, int i);

        /* renamed from: b, reason: contains not printable characters */
        boolean mo۱۱۵۳۴b();

        /* renamed from: c, reason: contains not printable characters */
        Drawable mo۱۱۵۳۵c();
    }

    /* renamed from: android.support.v7.app.b$c */
    public interface c {
        /* renamed from: d, reason: contains not printable characters */
        b mo۱۱۴۱۶d();
    }

    public Cb(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        this(activity, toolbar, drawerLayout, null, openDrawerContentDescRes, closeDrawerContentDescRes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    Cb(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, Cd slider, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        this.f۱۰۹۵۷d = true;
        this.f۱۰۹۵۸e = true;
        this.f۱۰۹۶۲i = false;
        if (toolbar != null) {
            this.f۱۰۹۵۴a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f۱۰۹۵۴a = ((c) activity).mo۱۱۴۱۶d();
        } else {
            this.f۱۰۹۵۴a = new d(activity);
        }
        this.f۱۰۹۵۵b = drawerLayout;
        this.f۱۰۹۵۹f = openDrawerContentDescRes;
        this.f۱۰۹۶۰g = closeDrawerContentDescRes;
        if (slider == null) {
            this.f۱۰۹۵۶c = new Cd(this.f۱۰۹۵۴a.mo۱۱۵۳۱a());
        } else {
            this.f۱۰۹۵۶c = slider;
        }
        m۱۱۳۷۰a();
    }

    /* renamed from: android.support.v7.app.b$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Cb cb = Cb.this;
            if (cb.f۱۰۹۵۸e) {
                cb.m۱۱۳۷۸c();
                return;
            }
            View.OnClickListener onClickListener = cb.f۱۰۹۶۱h;
            if (onClickListener != null) {
                onClickListener.onClick(v);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۳۷۵b() {
        if (this.f۱۰۹۵۵b.m۱۱۰۳۹e(8388611)) {
            m۱۱۳۶۹a(1.0f);
        } else {
            m۱۱۳۶۹a(0.0f);
        }
        if (this.f۱۰۹۵۸e) {
            m۱۱۳۷۲a(this.f۱۰۹۵۶c, this.f۱۰۹۵۵b.m۱۱۰۳۹e(8388611) ? this.f۱۰۹۶۰g : this.f۱۰۹۵۹f);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۱۳۷۸c() {
        int drawerLockMode = this.f۱۰۹۵۵b.m۱۱۰۳۱c(8388611);
        if (this.f۱۰۹۵۵b.m۱۱۰۴۱f(8388611) && drawerLockMode != 2) {
            this.f۱۰۹۵۵b.m۱۱۰۱۳a(8388611);
        } else if (drawerLockMode != 1) {
            this.f۱۰۹۵۵b.m۱۱۰۴۲g(8388611);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۳۷۴a(View drawerView, float slideOffset) {
        if (this.f۱۰۹۵۷d) {
            m۱۱۳۶۹a(Math.min(1.0f, Math.max(0.0f, slideOffset)));
        } else {
            m۱۱۳۶۹a(0.0f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۳۷۳a(View drawerView) {
        m۱۱۳۶۹a(1.0f);
        if (this.f۱۰۹۵۸e) {
            m۱۱۳۷۶b(this.f۱۰۹۶۰g);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.InterfaceCd
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۳۷۷b(View drawerView) {
        m۱۱۳۶۹a(0.0f);
        if (this.f۱۰۹۵۸e) {
            m۱۱۳۷۶b(this.f۱۰۹۵۹f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۳۷۱a(int newState) {
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۳۷۲a(Drawable upDrawable, int contentDescRes) {
        if (!this.f۱۰۹۶۲i && !this.f۱۰۹۵۴a.mo۱۱۵۳۴b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f۱۰۹۶۲i = true;
        }
        this.f۱۰۹۵۴a.mo۱۱۵۳۳a(upDrawable, contentDescRes);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۱۳۷۶b(int contentDescRes) {
        this.f۱۰۹۵۴a.mo۱۱۵۳۲a(contentDescRes);
    }

    /* renamed from: a, reason: contains not printable characters */
    Drawable m۱۱۳۷۰a() {
        return this.f۱۰۹۵۴a.mo۱۱۵۳۵c();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۳۶۹a(float position) {
        if (position == 1.0f) {
            this.f۱۰۹۵۶c.m۸۶۸۵b(true);
        } else if (position == 0.0f) {
            this.f۱۰۹۵۶c.m۸۶۸۵b(false);
        }
        this.f۱۰۹۵۶c.m۸۶۸۶c(position);
    }

    /* renamed from: android.support.v7.app.b$d */
    private static class d implements b {

        /* renamed from: a, reason: contains not printable characters */
        private final Activity f۱۰۹۶۴a;

        /* renamed from: b, reason: contains not printable characters */
        private Cc.a f۱۰۹۶۵b;

        d(Activity activity) {
            this.f۱۰۹۶۴a = activity;
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: c, reason: contains not printable characters */
        public Drawable mo۱۱۵۳۵c() {
            if (Build.VERSION.SDK_INT >= 18) {
                TypedArray a2 = mo۱۱۵۳۱a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
                Drawable result = a2.getDrawable(0);
                a2.recycle();
                return result;
            }
            return Cc.m۱۱۳۹۵a(this.f۱۰۹۶۴a);
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public Context mo۱۱۵۳۱a() {
            ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f۱۰۹۶۴a;
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۵۳۴b() {
            ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۳a(Drawable themeImage, int contentDescRes) {
            ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
            if (actionBar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(themeImage);
                    actionBar.setHomeActionContentDescription(contentDescRes);
                } else {
                    actionBar.setDisplayShowHomeEnabled(true);
                    this.f۱۰۹۶۵b = Cc.m۱۱۳۹۷a(this.f۱۰۹۶۵b, this.f۱۰۹۶۴a, themeImage, contentDescRes);
                    actionBar.setDisplayShowHomeEnabled(false);
                }
            }
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۲a(int contentDescRes) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(contentDescRes);
                    return;
                }
                return;
            }
            this.f۱۰۹۶۵b = Cc.m۱۱۳۹۶a(this.f۱۰۹۶۵b, this.f۱۰۹۶۴a, contentDescRes);
        }
    }

    /* renamed from: android.support.v7.app.b$e */
    static class e implements b {

        /* renamed from: a, reason: contains not printable characters */
        final Toolbar f۱۰۹۶۶a;

        /* renamed from: b, reason: contains not printable characters */
        final Drawable f۱۰۹۶۷b;

        /* renamed from: c, reason: contains not printable characters */
        final CharSequence f۱۰۹۶۸c;

        e(Toolbar toolbar) {
            this.f۱۰۹۶۶a = toolbar;
            this.f۱۰۹۶۷b = toolbar.getNavigationIcon();
            this.f۱۰۹۶۸c = toolbar.getNavigationContentDescription();
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۳a(Drawable upDrawable, int contentDescRes) {
            this.f۱۰۹۶۶a.setNavigationIcon(upDrawable);
            mo۱۱۵۳۲a(contentDescRes);
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۲a(int contentDescRes) {
            if (contentDescRes == 0) {
                this.f۱۰۹۶۶a.setNavigationContentDescription(this.f۱۰۹۶۸c);
            } else {
                this.f۱۰۹۶۶a.setNavigationContentDescription(contentDescRes);
            }
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: c, reason: contains not printable characters */
        public Drawable mo۱۱۵۳۵c() {
            return this.f۱۰۹۶۷b;
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public Context mo۱۱۵۳۱a() {
            return this.f۱۰۹۶۶a.getContext();
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۵۳۴b() {
            return true;
        }
    }
}
