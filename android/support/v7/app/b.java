package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.c;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class b implements DrawerLayout.d {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC۰۰۳۵b f۱۵۳۱a;

    /* renamed from: b  reason: collision with root package name */
    private final DrawerLayout f۱۵۳۲b;

    /* renamed from: c  reason: collision with root package name */
    private a.b.h.d.a.d f۱۵۳۳c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۱۵۳۴d;

    /* renamed from: e  reason: collision with root package name */
    boolean f۱۵۳۵e;

    /* renamed from: f  reason: collision with root package name */
    private final int f۱۵۳۶f;

    /* renamed from: g  reason: collision with root package name */
    private final int f۱۵۳۷g;

    /* renamed from: h  reason: collision with root package name */
    View.OnClickListener f۱۵۳۸h;
    private boolean i;

    /* renamed from: android.support.v7.app.b$b  reason: collision with other inner class name */
    public interface AbstractC۰۰۳۵b {
        Context a();

        void a(int i);

        void a(Drawable drawable, int i);

        boolean b();

        Drawable c();
    }

    public interface c {
        AbstractC۰۰۳۵b d();
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        this(activity, toolbar, drawerLayout, null, openDrawerContentDescRes, closeDrawerContentDescRes);
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, a.b.h.d.a.d slider, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        this.f۱۵۳۴d = true;
        this.f۱۵۳۵e = true;
        this.i = false;
        if (toolbar != null) {
            this.f۱۵۳۱a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f۱۵۳۱a = ((c) activity).d();
        } else {
            this.f۱۵۳۱a = new d(activity);
        }
        this.f۱۵۳۲b = drawerLayout;
        this.f۱۵۳۶f = openDrawerContentDescRes;
        this.f۱۵۳۷g = closeDrawerContentDescRes;
        if (slider == null) {
            this.f۱۵۳۳c = new a.b.h.d.a.d(this.f۱۵۳۱a.a());
        } else {
            this.f۱۵۳۳c = slider;
        }
        a();
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View v) {
            b bVar = b.this;
            if (bVar.f۱۵۳۵e) {
                bVar.c();
                return;
            }
            View.OnClickListener onClickListener = bVar.f۱۵۳۸h;
            if (onClickListener != null) {
                onClickListener.onClick(v);
            }
        }
    }

    public void b() {
        if (this.f۱۵۳۲b.e(8388611)) {
            a(1.0f);
        } else {
            a(0.0f);
        }
        if (this.f۱۵۳۵e) {
            a(this.f۱۵۳۳c, this.f۱۵۳۲b.e(8388611) ? this.f۱۵۳۷g : this.f۱۵۳۶f);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int drawerLockMode = this.f۱۵۳۲b.c(8388611);
        if (this.f۱۵۳۲b.f(8388611) && drawerLockMode != 2) {
            this.f۱۵۳۲b.a(8388611);
        } else if (drawerLockMode != 1) {
            this.f۱۵۳۲b.g(8388611);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.d
    public void a(View drawerView, float slideOffset) {
        if (this.f۱۵۳۴d) {
            a(Math.min(1.0f, Math.max(0.0f, slideOffset)));
        } else {
            a(0.0f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.d
    public void a(View drawerView) {
        a(1.0f);
        if (this.f۱۵۳۵e) {
            b(this.f۱۵۳۷g);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.d
    public void b(View drawerView) {
        a(0.0f);
        if (this.f۱۵۳۵e) {
            b(this.f۱۵۳۶f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.d
    public void a(int newState) {
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable upDrawable, int contentDescRes) {
        if (!this.i && !this.f۱۵۳۱a.b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.i = true;
        }
        this.f۱۵۳۱a.a(upDrawable, contentDescRes);
    }

    /* access modifiers changed from: package-private */
    public void b(int contentDescRes) {
        this.f۱۵۳۱a.a(contentDescRes);
    }

    /* access modifiers changed from: package-private */
    public Drawable a() {
        return this.f۱۵۳۱a.c();
    }

    private void a(float position) {
        if (position == 1.0f) {
            this.f۱۵۳۳c.b(true);
        } else if (position == 0.0f) {
            this.f۱۵۳۳c.b(false);
        }
        this.f۱۵۳۳c.c(position);
    }

    private static class d implements AbstractC۰۰۳۵b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f۱۵۴۰a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f۱۵۴۱b;

        d(Activity activity) {
            this.f۱۵۴۰a = activity;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public Drawable c() {
            if (Build.VERSION.SDK_INT < 18) {
                return c.a(this.f۱۵۴۰a);
            }
            TypedArray a2 = a().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable result = a2.getDrawable(0);
            a2.recycle();
            return result;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public Context a() {
            ActionBar actionBar = this.f۱۵۴۰a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f۱۵۴۰a;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public boolean b() {
            ActionBar actionBar = this.f۱۵۴۰a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public void a(Drawable themeImage, int contentDescRes) {
            ActionBar actionBar = this.f۱۵۴۰a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(themeImage);
                actionBar.setHomeActionContentDescription(contentDescRes);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f۱۵۴۱b = c.a(this.f۱۵۴۱b, this.f۱۵۴۰a, themeImage, contentDescRes);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public void a(int contentDescRes) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f۱۵۴۰a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(contentDescRes);
                    return;
                }
                return;
            }
            this.f۱۵۴۱b = c.a(this.f۱۵۴۱b, this.f۱۵۴۰a, contentDescRes);
        }
    }

    static class e implements AbstractC۰۰۳۵b {

        /* renamed from: a  reason: collision with root package name */
        final Toolbar f۱۵۴۲a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f۱۵۴۳b;

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f۱۵۴۴c;

        e(Toolbar toolbar) {
            this.f۱۵۴۲a = toolbar;
            this.f۱۵۴۳b = toolbar.getNavigationIcon();
            this.f۱۵۴۴c = toolbar.getNavigationContentDescription();
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public void a(Drawable upDrawable, int contentDescRes) {
            this.f۱۵۴۲a.setNavigationIcon(upDrawable);
            a(contentDescRes);
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public void a(int contentDescRes) {
            if (contentDescRes == 0) {
                this.f۱۵۴۲a.setNavigationContentDescription(this.f۱۵۴۴c);
            } else {
                this.f۱۵۴۲a.setNavigationContentDescription(contentDescRes);
            }
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public Drawable c() {
            return this.f۱۵۴۳b;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public Context a() {
            return this.f۱۵۴۲a.getContext();
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public boolean b() {
            return true;
        }
    }
}
