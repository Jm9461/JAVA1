package android.support.p۰۴۷v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.widget.DrawerLayout;
import android.support.p۰۴۷v7.app.Cc;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

/* renamed from: android.support.v7.app.b  reason: invalid class name */
public class Cb implements DrawerLayout.AbstractCd {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCb f۱۰۹۵۴a;

    /* renamed from: b  reason: contains not printable characters */
    private final DrawerLayout f۱۰۹۵۵b;

    /* renamed from: c  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cd f۱۰۹۵۶c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۰۹۵۷d;

    /* renamed from: e  reason: contains not printable characters */
    boolean f۱۰۹۵۸e;

    /* renamed from: f  reason: contains not printable characters */
    private final int f۱۰۹۵۹f;

    /* renamed from: g  reason: contains not printable characters */
    private final int f۱۰۹۶۰g;

    /* renamed from: h  reason: contains not printable characters */
    View.OnClickListener f۱۰۹۶۱h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۰۹۶۲i;

    /* renamed from: android.support.v7.app.b$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        Context m۱۳۴۴۹a();

        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۴۵۰a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۴۵۱a(Drawable drawable, int i);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۳۴۵۲b();

        /* renamed from: c  reason: contains not printable characters */
        Drawable m۱۳۴۵۳c();
    }

    /* renamed from: android.support.v7.app.b$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: d  reason: contains not printable characters */
        AbstractCb m۱۳۴۵۴d();
    }

    public Cb(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        this(activity, toolbar, drawerLayout, null, openDrawerContentDescRes, closeDrawerContentDescRes);
    }

    Cb(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cd slider, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        this.f۱۰۹۵۷d = true;
        this.f۱۰۹۵۸e = true;
        this.f۱۰۹۶۲i = false;
        if (toolbar != null) {
            this.f۱۰۹۵۴a = new Ce(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        } else if (activity instanceof AbstractCc) {
            this.f۱۰۹۵۴a = ((AbstractCc) activity).m۱۳۴۵۴d();
        } else {
            this.f۱۰۹۵۴a = new Cd(activity);
        }
        this.f۱۰۹۵۵b = drawerLayout;
        this.f۱۰۹۵۹f = openDrawerContentDescRes;
        this.f۱۰۹۶۰g = closeDrawerContentDescRes;
        if (slider == null) {
            this.f۱۰۹۵۶c = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cd(this.f۱۰۹۵۴a.m۱۳۴۴۹a());
        } else {
            this.f۱۰۹۵۶c = slider;
        }
        m۱۳۴۴۰a();
    }

    /* renamed from: android.support.v7.app.b$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            Cb bVar = Cb.this;
            if (bVar.f۱۰۹۵۸e) {
                bVar.m۱۳۴۴۸c();
                return;
            }
            View.OnClickListener onClickListener = bVar.f۱۰۹۶۱h;
            if (onClickListener != null) {
                onClickListener.onClick(v);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۴۵b() {
        if (this.f۱۰۹۵۵b.m۱۳۱۰۹e(8388611)) {
            m۱۳۴۳۹a(1.0f);
        } else {
            m۱۳۴۳۹a(0.0f);
        }
        if (this.f۱۰۹۵۸e) {
            m۱۳۴۴۲a(this.f۱۰۹۵۶c, this.f۱۰۹۵۵b.m۱۳۱۰۹e(8388611) ? this.f۱۰۹۶۰g : this.f۱۰۹۵۹f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۴۴۸c() {
        int drawerLockMode = this.f۱۰۹۵۵b.m۱۳۱۰۱c(8388611);
        if (this.f۱۰۹۵۵b.m۱۳۱۱۱f(8388611) && drawerLockMode != 2) {
            this.f۱۰۹۵۵b.m۱۳۰۸۳a(8388611);
        } else if (drawerLockMode != 1) {
            this.f۱۰۹۵۵b.m۱۳۱۱۲g(8388611);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.DrawerLayout.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۴۴a(View drawerView, float slideOffset) {
        if (this.f۱۰۹۵۷d) {
            m۱۳۴۳۹a(Math.min(1.0f, Math.max(0.0f, slideOffset)));
        } else {
            m۱۳۴۳۹a(0.0f);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.DrawerLayout.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۴۳a(View drawerView) {
        m۱۳۴۳۹a(1.0f);
        if (this.f۱۰۹۵۸e) {
            m۱۳۴۴۶b(this.f۱۰۹۶۰g);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.DrawerLayout.AbstractCd
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۴۷b(View drawerView) {
        m۱۳۴۳۹a(0.0f);
        if (this.f۱۰۹۵۸e) {
            m۱۳۴۴۶b(this.f۱۰۹۵۹f);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.DrawerLayout.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۴۱a(int newState) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۴۲a(Drawable upDrawable, int contentDescRes) {
        if (!this.f۱۰۹۶۲i && !this.f۱۰۹۵۴a.m۱۳۴۵۲b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f۱۰۹۶۲i = true;
        }
        this.f۱۰۹۵۴a.m۱۳۴۵۱a(upDrawable, contentDescRes);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۴۶b(int contentDescRes) {
        this.f۱۰۹۵۴a.m۱۳۴۵۰a(contentDescRes);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Drawable m۱۳۴۴۰a() {
        return this.f۱۰۹۵۴a.m۱۳۴۵۳c();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۴۳۹a(float position) {
        if (position == 1.0f) {
            this.f۱۰۹۵۶c.m۱۰۷۵۴b(true);
        } else if (position == 0.0f) {
            this.f۱۰۹۵۶c.m۱۰۷۵۴b(false);
        }
        this.f۱۰۹۵۶c.m۱۰۷۵۵c(position);
    }

    /* renamed from: android.support.v7.app.b$d  reason: invalid class name */
    private static class Cd implements AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        private final Activity f۱۰۹۶۴a;

        /* renamed from: b  reason: contains not printable characters */
        private Cc.Ca f۱۰۹۶۵b;

        Cd(Activity activity) {
            this.f۱۰۹۶۴a = activity;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public Drawable m۱۳۴۵۹c() {
            if (Build.VERSION.SDK_INT < 18) {
                return Cc.m۱۳۴۶۵a(this.f۱۰۹۶۴a);
            }
            TypedArray a = m۱۳۴۵۵a().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable result = a.getDrawable(0);
            a.recycle();
            return result;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public Context m۱۳۴۵۵a() {
            ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f۱۰۹۶۴a;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۴۵۸b() {
            ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۵۷a(Drawable themeImage, int contentDescRes) {
            ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(themeImage);
                actionBar.setHomeActionContentDescription(contentDescRes);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f۱۰۹۶۵b = Cc.m۱۳۴۶۷a(this.f۱۰۹۶۵b, this.f۱۰۹۶۴a, themeImage, contentDescRes);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۵۶a(int contentDescRes) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f۱۰۹۶۴a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(contentDescRes);
                    return;
                }
                return;
            }
            this.f۱۰۹۶۵b = Cc.m۱۳۴۶۶a(this.f۱۰۹۶۵b, this.f۱۰۹۶۴a, contentDescRes);
        }
    }

    /* renamed from: android.support.v7.app.b$e  reason: invalid class name */
    static class Ce implements AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        final Toolbar f۱۰۹۶۶a;

        /* renamed from: b  reason: contains not printable characters */
        final Drawable f۱۰۹۶۷b;

        /* renamed from: c  reason: contains not printable characters */
        final CharSequence f۱۰۹۶۸c;

        Ce(Toolbar toolbar) {
            this.f۱۰۹۶۶a = toolbar;
            this.f۱۰۹۶۷b = toolbar.getNavigationIcon();
            this.f۱۰۹۶۸c = toolbar.getNavigationContentDescription();
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۶۲a(Drawable upDrawable, int contentDescRes) {
            this.f۱۰۹۶۶a.setNavigationIcon(upDrawable);
            m۱۳۴۶۱a(contentDescRes);
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۶۱a(int contentDescRes) {
            if (contentDescRes == 0) {
                this.f۱۰۹۶۶a.setNavigationContentDescription(this.f۱۰۹۶۸c);
            } else {
                this.f۱۰۹۶۶a.setNavigationContentDescription(contentDescRes);
            }
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public Drawable m۱۳۴۶۴c() {
            return this.f۱۰۹۶۷b;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public Context m۱۳۴۶۰a() {
            return this.f۱۰۹۶۶a.getContext();
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۴۶۳b() {
            return true;
        }
    }
}
