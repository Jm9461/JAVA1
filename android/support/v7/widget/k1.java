package android.support.v7.widget;

import a.b.h.a.e;
import a.b.h.a.f;
import a.b.h.a.h;
import a.b.h.a.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.a0;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.p;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class k1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f۲۱۳۲a;

    /* renamed from: b  reason: collision with root package name */
    private int f۲۱۳۳b;

    /* renamed from: c  reason: collision with root package name */
    private View f۲۱۳۴c;

    /* renamed from: d  reason: collision with root package name */
    private View f۲۱۳۵d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f۲۱۳۶e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f۲۱۳۷f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f۲۱۳۸g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۱۳۹h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    public k1(Toolbar toolbar, boolean style) {
        this(toolbar, style, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    public k1(Toolbar toolbar, boolean style, int defaultNavigationContentDescription, int defaultNavigationIcon) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f۲۱۳۲a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.f۲۱۳۹h = this.i != null;
        this.f۲۱۳۸g = toolbar.getNavigationIcon();
        j1 a2 = j1.a(toolbar.getContext(), null, j.ActionBar, a.b.h.a.a.actionBarStyle, 0);
        this.q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (style) {
            CharSequence title = a2.e(j.ActionBar_title);
            if (!TextUtils.isEmpty(title)) {
                setTitle(title);
            }
            CharSequence subtitle = a2.e(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(subtitle)) {
                b(subtitle);
            }
            Drawable logo = a2.b(j.ActionBar_logo);
            if (logo != null) {
                c(logo);
            }
            Drawable icon = a2.b(j.ActionBar_icon);
            if (icon != null) {
                setIcon(icon);
            }
            if (this.f۲۱۳۸g == null && (drawable = this.q) != null) {
                b(drawable);
            }
            d(a2.d(j.ActionBar_displayOptions, 0));
            int customNavId = a2.g(j.ActionBar_customNavigationLayout, 0);
            if (customNavId != 0) {
                a(LayoutInflater.from(this.f۲۱۳۲a.getContext()).inflate(customNavId, (ViewGroup) this.f۲۱۳۲a, false));
                d(this.f۲۱۳۳b | 16);
            }
            int height = a2.f(j.ActionBar_height, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f۲۱۳۲a.getLayoutParams();
                lp.height = height;
                this.f۲۱۳۲a.setLayoutParams(lp);
            }
            int contentInsetStart = a2.b(j.ActionBar_contentInsetStart, -1);
            int contentInsetEnd = a2.b(j.ActionBar_contentInsetEnd, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f۲۱۳۲a.b(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a2.g(j.ActionBar_titleTextStyle, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f۲۱۳۲a;
                toolbar2.b(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a2.g(j.ActionBar_subtitleTextStyle, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f۲۱۳۲a;
                toolbar3.a(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a2.g(j.ActionBar_popupTheme, 0);
            if (popupTheme != 0) {
                this.f۲۱۳۲a.setPopupTheme(popupTheme);
            }
        } else {
            this.f۲۱۳۳b = p();
        }
        a2.a();
        e(defaultNavigationContentDescription);
        this.k = this.f۲۱۳۲a.getNavigationContentDescription();
        this.f۲۱۳۲a.setNavigationOnClickListener(new a());
    }

    class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        final android.support.v7.view.menu.a f۲۱۴۰c = new android.support.v7.view.menu.a(k1.this.f۲۱۳۲a.getContext(), 0, 16908332, 0, 0, k1.this.i);

        a() {
        }

        public void onClick(View v) {
            k1 k1Var = k1.this;
            Window.Callback callback = k1Var.l;
            if (callback != null && k1Var.m) {
                callback.onMenuItemSelected(0, this.f۲۱۴۰c);
            }
        }
    }

    public void e(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription != this.p) {
            this.p = defaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.f۲۱۳۲a.getNavigationContentDescription())) {
                c(this.p);
            }
        }
    }

    private int p() {
        if (this.f۲۱۳۲a.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.q = this.f۲۱۳۲a.getNavigationIcon();
        return opts;
    }

    @Override // android.support.v7.widget.f0
    public ViewGroup j() {
        return this.f۲۱۳۲a;
    }

    @Override // android.support.v7.widget.f0
    public Context k() {
        return this.f۲۱۳۲a.getContext();
    }

    @Override // android.support.v7.widget.f0
    public boolean n() {
        return this.f۲۱۳۲a.f();
    }

    @Override // android.support.v7.widget.f0
    public void collapseActionView() {
        this.f۲۱۳۲a.c();
    }

    @Override // android.support.v7.widget.f0
    public void setWindowCallback(Window.Callback cb) {
        this.l = cb;
    }

    @Override // android.support.v7.widget.f0
    public void setWindowTitle(CharSequence title) {
        if (!this.f۲۱۳۹h) {
            c(title);
        }
    }

    @Override // android.support.v7.widget.f0
    public CharSequence getTitle() {
        return this.f۲۱۳۲a.getTitle();
    }

    @Override // android.support.v7.widget.f0
    public void setTitle(CharSequence title) {
        this.f۲۱۳۹h = true;
        c(title);
    }

    private void c(CharSequence title) {
        this.i = title;
        if ((this.f۲۱۳۳b & 8) != 0) {
            this.f۲۱۳۲a.setTitle(title);
        }
    }

    public void b(CharSequence subtitle) {
        this.j = subtitle;
        if ((this.f۲۱۳۳b & 8) != 0) {
            this.f۲۱۳۲a.setSubtitle(subtitle);
        }
    }

    @Override // android.support.v7.widget.f0
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.f0
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.f0
    public void setIcon(int resId) {
        setIcon(resId != 0 ? a.b.h.c.a.a.c(k(), resId) : null);
    }

    @Override // android.support.v7.widget.f0
    public void setIcon(Drawable d2) {
        this.f۲۱۳۶e = d2;
        s();
    }

    @Override // android.support.v7.widget.f0
    public void b(int resId) {
        c(resId != 0 ? a.b.h.c.a.a.c(k(), resId) : null);
    }

    public void c(Drawable d2) {
        this.f۲۱۳۷f = d2;
        s();
    }

    private void s() {
        Drawable logo = null;
        int i2 = this.f۲۱۳۳b;
        if ((i2 & 2) != 0) {
            if ((i2 & 1) != 0) {
                Drawable drawable = this.f۲۱۳۷f;
                if (drawable == null) {
                    drawable = this.f۲۱۳۶e;
                }
                logo = drawable;
            } else {
                logo = this.f۲۱۳۶e;
            }
        }
        this.f۲۱۳۲a.setLogo(logo);
    }

    @Override // android.support.v7.widget.f0
    public boolean f() {
        return this.f۲۱۳۲a.b();
    }

    @Override // android.support.v7.widget.f0
    public boolean b() {
        return this.f۲۱۳۲a.i();
    }

    @Override // android.support.v7.widget.f0
    public boolean a() {
        return this.f۲۱۳۲a.h();
    }

    @Override // android.support.v7.widget.f0
    public boolean d() {
        return this.f۲۱۳۲a.k();
    }

    @Override // android.support.v7.widget.f0
    public boolean c() {
        return this.f۲۱۳۲a.g();
    }

    @Override // android.support.v7.widget.f0
    public void e() {
        this.m = true;
    }

    @Override // android.support.v7.widget.f0
    public void a(Menu menu, p.a cb) {
        if (this.n == null) {
            this.n = new c(this.f۲۱۳۲a.getContext());
            this.n.a(f.action_menu_presenter);
        }
        this.n.a(cb);
        this.f۲۱۳۲a.a((android.support.v7.view.menu.h) menu, this.n);
    }

    @Override // android.support.v7.widget.f0
    public void g() {
        this.f۲۱۳۲a.d();
    }

    @Override // android.support.v7.widget.f0
    public int h() {
        return this.f۲۱۳۳b;
    }

    @Override // android.support.v7.widget.f0
    public void d(int newOpts) {
        View view;
        int changed = this.f۲۱۳۳b ^ newOpts;
        this.f۲۱۳۳b = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    q();
                }
                r();
            }
            if ((changed & 3) != 0) {
                s();
            }
            if ((changed & 8) != 0) {
                if ((newOpts & 8) != 0) {
                    this.f۲۱۳۲a.setTitle(this.i);
                    this.f۲۱۳۲a.setSubtitle(this.j);
                } else {
                    this.f۲۱۳۲a.setTitle((CharSequence) null);
                    this.f۲۱۳۲a.setSubtitle((CharSequence) null);
                }
            }
            if ((changed & 16) != 0 && (view = this.f۲۱۳۵d) != null) {
                if ((newOpts & 16) != 0) {
                    this.f۲۱۳۲a.addView(view);
                } else {
                    this.f۲۱۳۲a.removeView(view);
                }
            }
        }
    }

    @Override // android.support.v7.widget.f0
    public void a(b1 tabView) {
        Toolbar toolbar;
        View view = this.f۲۱۳۴c;
        if (view != null && view.getParent() == (toolbar = this.f۲۱۳۲a)) {
            toolbar.removeView(this.f۲۱۳۴c);
        }
        this.f۲۱۳۴c = tabView;
        if (tabView != null && this.o == 2) {
            this.f۲۱۳۲a.addView(this.f۲۱۳۴c, 0);
            Toolbar.e lp = (Toolbar.e) this.f۲۱۳۴c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) lp).width = -2;
            ((ViewGroup.MarginLayoutParams) lp).height = -2;
            lp.f۱۵۳۰a = 8388691;
            tabView.setAllowCollapse(true);
        }
    }

    @Override // android.support.v7.widget.f0
    public void b(boolean collapsible) {
        this.f۲۱۳۲a.setCollapsible(collapsible);
    }

    @Override // android.support.v7.widget.f0
    public void a(boolean enable) {
    }

    @Override // android.support.v7.widget.f0
    public int l() {
        return this.o;
    }

    public void a(View view) {
        View view2 = this.f۲۱۳۵d;
        if (!(view2 == null || (this.f۲۱۳۳b & 16) == 0)) {
            this.f۲۱۳۲a.removeView(view2);
        }
        this.f۲۱۳۵d = view;
        if (view != null && (this.f۲۱۳۳b & 16) != 0) {
            this.f۲۱۳۲a.addView(this.f۲۱۳۵d);
        }
    }

    @Override // android.support.v7.widget.f0
    public y a(int visibility, long duration) {
        y a2 = u.a(this.f۲۱۳۲a);
        a2.a(visibility == 0 ? 1.0f : 0.0f);
        a2.a(duration);
        a2.a(new b(visibility));
        return a2;
    }

    class b extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۲۱۴۲a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f۲۱۴۳b;

        b(int i) {
            this.f۲۱۴۳b = i;
        }

        @Override // android.support.v4.view.a0, android.support.v4.view.z
        public void b(View view) {
            k1.this.f۲۱۳۲a.setVisibility(0);
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            if (!this.f۲۱۴۲a) {
                k1.this.f۲۱۳۲a.setVisibility(this.f۲۱۴۳b);
            }
        }

        @Override // android.support.v4.view.a0, android.support.v4.view.z
        public void c(View view) {
            this.f۲۱۴۲a = true;
        }
    }

    @Override // android.support.v7.widget.f0
    public void b(Drawable icon) {
        this.f۲۱۳۸g = icon;
        r();
    }

    private void r() {
        if ((this.f۲۱۳۳b & 4) != 0) {
            Toolbar toolbar = this.f۲۱۳۲a;
            Drawable drawable = this.f۲۱۳۸g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f۲۱۳۲a.setNavigationIcon((Drawable) null);
    }

    public void a(CharSequence description) {
        this.k = description;
        q();
    }

    @Override // android.support.v7.widget.f0
    public void c(int resId) {
        a(resId == 0 ? null : k().getString(resId));
    }

    private void q() {
        if ((this.f۲۱۳۳b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f۲۱۳۲a.setNavigationContentDescription(this.p);
        } else {
            this.f۲۱۳۲a.setNavigationContentDescription(this.k);
        }
    }

    @Override // android.support.v7.widget.f0
    public void a(Drawable d2) {
        u.a(this.f۲۱۳۲a, d2);
    }

    @Override // android.support.v7.widget.f0
    public void a(int visible) {
        this.f۲۱۳۲a.setVisibility(visible);
    }

    @Override // android.support.v7.widget.f0
    public void a(p.a actionMenuPresenterCallback, h.a menuBuilderCallback) {
        this.f۲۱۳۲a.a(actionMenuPresenterCallback, menuBuilderCallback);
    }

    @Override // android.support.v7.widget.f0
    public Menu i() {
        return this.f۲۱۳۲a.getMenu();
    }
}
