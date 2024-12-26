package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Ca0;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cy;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ch;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.widget.k1  reason: invalid class name */
public class Ck1 implements AbstractCf0 {

    /* renamed from: a  reason: contains not printable characters */
    Toolbar f۱۲۱۵۸a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۲۱۵۹b;

    /* renamed from: c  reason: contains not printable characters */
    private View f۱۲۱۶۰c;

    /* renamed from: d  reason: contains not printable characters */
    private View f۱۲۱۶۱d;

    /* renamed from: e  reason: contains not printable characters */
    private Drawable f۱۲۱۶۲e;

    /* renamed from: f  reason: contains not printable characters */
    private Drawable f۱۲۱۶۳f;

    /* renamed from: g  reason: contains not printable characters */
    private Drawable f۱۲۱۶۴g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۲۱۶۵h;

    /* renamed from: i  reason: contains not printable characters */
    CharSequence f۱۲۱۶۶i;

    /* renamed from: j  reason: contains not printable characters */
    private CharSequence f۱۲۱۶۷j;

    /* renamed from: k  reason: contains not printable characters */
    private CharSequence f۱۲۱۶۸k;

    /* renamed from: l  reason: contains not printable characters */
    Window.Callback f۱۲۱۶۹l;

    /* renamed from: m  reason: contains not printable characters */
    boolean f۱۲۱۷۰m;

    /* renamed from: n  reason: contains not printable characters */
    private Cc f۱۲۱۷۱n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۲۱۷۲o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۲۱۷۳p;

    /* renamed from: q  reason: contains not printable characters */
    private Drawable f۱۲۱۷۴q;

    public Ck1(Toolbar toolbar, boolean style) {
        this(toolbar, style, Ch.abc_action_bar_up_description, Ce.abc_ic_ab_back_material);
    }

    public Ck1(Toolbar toolbar, boolean style, int defaultNavigationContentDescription, int defaultNavigationIcon) {
        Drawable drawable;
        this.f۱۲۱۷۲o = 0;
        this.f۱۲۱۷۳p = 0;
        this.f۱۲۱۵۸a = toolbar;
        this.f۱۲۱۶۶i = toolbar.getTitle();
        this.f۱۲۱۶۷j = toolbar.getSubtitle();
        this.f۱۲۱۶۵h = this.f۱۲۱۶۶i != null;
        this.f۱۲۱۶۴g = toolbar.getNavigationIcon();
        Cj1 a = Cj1.m۱۵۳۴۵a(toolbar.getContext(), null, Cj.ActionBar, Ca.actionBarStyle, 0);
        this.f۱۲۱۷۴q = a.m۱۵۳۵۴b(Cj.ActionBar_homeAsUpIndicator);
        if (style) {
            CharSequence title = a.m۱۵۳۶۰e(Cj.ActionBar_title);
            if (!TextUtils.isEmpty(title)) {
                setTitle(title);
            }
            CharSequence subtitle = a.m۱۵۳۶۰e(Cj.ActionBar_subtitle);
            if (!TextUtils.isEmpty(subtitle)) {
                m۱۵۳۸۳b(subtitle);
            }
            Drawable logo = a.m۱۵۳۵۴b(Cj.ActionBar_logo);
            if (logo != null) {
                m۱۵۳۸۷c(logo);
            }
            Drawable icon = a.m۱۵۳۵۴b(Cj.ActionBar_icon);
            if (icon != null) {
                setIcon(icon);
            }
            if (this.f۱۲۱۶۴g == null && (drawable = this.f۱۲۱۷۴q) != null) {
                m۱۵۳۸۲b(drawable);
            }
            m۱۵۳۸۹d(a.m۱۵۳۵۷d(Cj.ActionBar_displayOptions, 0));
            int customNavId = a.m۱۵۳۶۳g(Cj.ActionBar_customNavigationLayout, 0);
            if (customNavId != 0) {
                m۱۵۳۷۷a(LayoutInflater.from(this.f۱۲۱۵۸a.getContext()).inflate(customNavId, (ViewGroup) this.f۱۲۱۵۸a, false));
                m۱۵۳۸۹d(this.f۱۲۱۵۹b | 16);
            }
            int height = a.m۱۵۳۶۱f(Cj.ActionBar_height, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f۱۲۱۵۸a.getLayoutParams();
                lp.height = height;
                this.f۱۲۱۵۸a.setLayoutParams(lp);
            }
            int contentInsetStart = a.m۱۵۳۵۳b(Cj.ActionBar_contentInsetStart, -1);
            int contentInsetEnd = a.m۱۵۳۵۳b(Cj.ActionBar_contentInsetEnd, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f۱۲۱۵۸a.m۱۴۹۳۵b(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a.m۱۵۳۶۳g(Cj.ActionBar_titleTextStyle, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f۱۲۱۵۸a;
                toolbar2.m۱۴۹۳۶b(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a.m۱۵۳۶۳g(Cj.ActionBar_subtitleTextStyle, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f۱۲۱۵۸a;
                toolbar3.m۱۴۹۳۲a(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a.m۱۵۳۶۳g(Cj.ActionBar_popupTheme, 0);
            if (popupTheme != 0) {
                this.f۱۲۱۵۸a.setPopupTheme(popupTheme);
            }
        } else {
            this.f۱۲۱۵۹b = m۱۵۳۶۷p();
        }
        a.m۱۵۳۵۰a();
        m۱۵۳۹۲e(defaultNavigationContentDescription);
        this.f۱۲۱۶۸k = this.f۱۲۱۵۸a.getNavigationContentDescription();
        this.f۱۲۱۵۸a.setNavigationOnClickListener(new View$OnClickListenerCa());
    }

    /* renamed from: android.support.v7.widget.k1$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final android.support.p۰۴۷v7.view.menu.Ca f۱۲۱۷۵c = new android.support.p۰۴۷v7.view.menu.Ca(Ck1.this.f۱۲۱۵۸a.getContext(), 0, 16908332, 0, 0, Ck1.this.f۱۲۱۶۶i);

        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            Ck1 k1Var = Ck1.this;
            Window.Callback callback = k1Var.f۱۲۱۶۹l;
            if (callback != null && k1Var.f۱۲۱۷۰m) {
                callback.onMenuItemSelected(0, this.f۱۲۱۷۵c);
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۵۳۹۲e(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription != this.f۱۲۱۷۳p) {
            this.f۱۲۱۷۳p = defaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.f۱۲۱۵۸a.getNavigationContentDescription())) {
                m۱۵۳۸۶c(this.f۱۲۱۷۳p);
            }
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    private int m۱۵۳۶۷p() {
        if (this.f۱۲۱۵۸a.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.f۱۲۱۷۴q = this.f۱۲۱۵۸a.getNavigationIcon();
        return opts;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: j  reason: contains not printable characters */
    public ViewGroup m۱۵۳۹۷j() {
        return this.f۱۲۱۵۸a;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: k  reason: contains not printable characters */
    public Context m۱۵۳۹۸k() {
        return this.f۱۲۱۵۸a.getContext();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: n  reason: contains not printable characters */
    public boolean m۱۵۴۰۱n() {
        return this.f۱۲۱۵۸a.m۱۴۹۴۱f();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public void collapseActionView() {
        this.f۱۲۱۵۸a.m۱۴۹۳۸c();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public void setWindowCallback(Window.Callback cb) {
        this.f۱۲۱۶۹l = cb;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public void setWindowTitle(CharSequence title) {
        if (!this.f۱۲۱۶۵h) {
            m۱۵۳۶۶c(title);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public CharSequence getTitle() {
        return this.f۱۲۱۵۸a.getTitle();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public void setTitle(CharSequence title) {
        this.f۱۲۱۶۵h = true;
        m۱۵۳۶۶c(title);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۳۶۶c(CharSequence title) {
        this.f۱۲۱۶۶i = title;
        if ((this.f۱۲۱۵۹b & 8) != 0) {
            this.f۱۲۱۵۸a.setTitle(title);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۸۳b(CharSequence subtitle) {
        this.f۱۲۱۶۷j = subtitle;
        if ((this.f۱۲۱۵۹b & 8) != 0) {
            this.f۱۲۱۵۸a.setSubtitle(subtitle);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: m  reason: contains not printable characters */
    public void m۱۵۴۰۰m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: o  reason: contains not printable characters */
    public void m۱۵۴۰۲o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public void setIcon(int resId) {
        setIcon(resId != 0 ? p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(m۱۵۳۹۸k(), resId) : null);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    public void setIcon(Drawable d) {
        this.f۱۲۱۶۲e = d;
        m۱۵۳۷۰s();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۸۱b(int resId) {
        m۱۵۳۸۷c(resId != 0 ? p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(m۱۵۳۹۸k(), resId) : null);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۳۸۷c(Drawable d) {
        this.f۱۲۱۶۳f = d;
        m۱۵۳۷۰s();
    }

    /* renamed from: s  reason: contains not printable characters */
    private void m۱۵۳۷۰s() {
        Drawable logo = null;
        int i = this.f۱۲۱۵۹b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                Drawable drawable = this.f۱۲۱۶۳f;
                if (drawable == null) {
                    drawable = this.f۱۲۱۶۲e;
                }
                logo = drawable;
            } else {
                logo = this.f۱۲۱۶۲e;
            }
        }
        this.f۱۲۱۵۸a.setLogo(logo);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۵۳۹۳f() {
        return this.f۱۲۱۵۸a.m۱۴۹۳۷b();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۳۸۵b() {
        return this.f۱۲۱۵۸a.m۱۴۹۴۴i();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۳۸۰a() {
        return this.f۱۲۱۵۸a.m۱۴۹۴۳h();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۵۳۹۰d() {
        return this.f۱۲۱۵۸a.m۱۴۹۴۶k();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۳۸۸c() {
        return this.f۱۲۱۵۸a.m۱۴۹۴۲g();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۵۳۹۱e() {
        this.f۱۲۱۷۰m = true;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۶a(Menu menu, AbstractCp.AbstractCa cb) {
        if (this.f۱۲۱۷۱n == null) {
            this.f۱۲۱۷۱n = new Cc(this.f۱۲۱۵۸a.getContext());
            this.f۱۲۱۷۱n.m۱۳۷۶۱a(Cf.action_menu_presenter);
        }
        this.f۱۲۱۷۱n.m۱۳۷۶۵a(cb);
        this.f۱۲۱۵۸a.m۱۴۹۳۳a((android.support.p۰۴۷v7.view.menu.Ch) menu, this.f۱۲۱۷۱n);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۵۳۹۴g() {
        this.f۱۲۱۵۸a.m۱۴۹۳۹d();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: h  reason: contains not printable characters */
    public int m۱۵۳۹۵h() {
        return this.f۱۲۱۵۹b;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۳۸۹d(int newOpts) {
        View view;
        int changed = this.f۱۲۱۵۹b ^ newOpts;
        this.f۱۲۱۵۹b = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    m۱۵۳۶۸q();
                }
                m۱۵۳۶۹r();
            }
            if ((changed & 3) != 0) {
                m۱۵۳۷۰s();
            }
            if ((changed & 8) != 0) {
                if ((newOpts & 8) != 0) {
                    this.f۱۲۱۵۸a.setTitle(this.f۱۲۱۶۶i);
                    this.f۱۲۱۵۸a.setSubtitle(this.f۱۲۱۶۷j);
                } else {
                    this.f۱۲۱۵۸a.setTitle((CharSequence) null);
                    this.f۱۲۱۵۸a.setSubtitle((CharSequence) null);
                }
            }
            if ((changed & 16) != 0 && (view = this.f۱۲۱۶۱d) != null) {
                if ((newOpts & 16) != 0) {
                    this.f۱۲۱۵۸a.addView(view);
                } else {
                    this.f۱۲۱۵۸a.removeView(view);
                }
            }
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۵a(Cb1 tabView) {
        Toolbar toolbar;
        View view = this.f۱۲۱۶۰c;
        if (view != null && view.getParent() == (toolbar = this.f۱۲۱۵۸a)) {
            toolbar.removeView(this.f۱۲۱۶۰c);
        }
        this.f۱۲۱۶۰c = tabView;
        if (tabView != null && this.f۱۲۱۷۲o == 2) {
            this.f۱۲۱۵۸a.addView(this.f۱۲۱۶۰c, 0);
            Toolbar.Ce lp = (Toolbar.Ce) this.f۱۲۱۶۰c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) lp).width = -2;
            ((ViewGroup.MarginLayoutParams) lp).height = -2;
            lp.f۱۰۹۵۳a = 8388691;
            tabView.setAllowCollapse(true);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۸۴b(boolean collapsible) {
        this.f۱۲۱۵۸a.setCollapsible(collapsible);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۹a(boolean enable) {
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: l  reason: contains not printable characters */
    public int m۱۵۳۹۹l() {
        return this.f۱۲۱۷۲o;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۷a(View view) {
        View view2 = this.f۱۲۱۶۱d;
        if (!(view2 == null || (this.f۱۲۱۵۹b & 16) == 0)) {
            this.f۱۲۱۵۸a.removeView(view2);
        }
        this.f۱۲۱۶۱d = view;
        if (view != null && (this.f۱۲۱۵۹b & 16) != 0) {
            this.f۱۲۱۵۸a.addView(this.f۱۲۱۶۱d);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۵۳۷۱a(int visibility, long duration) {
        Cy a = Cu.m۱۲۹۷۶a(this.f۱۲۱۵۸a);
        a.m۱۳۰۵۳a(visibility == 0 ? 1.0f : 0.0f);
        a.m۱۳۰۵۴a(duration);
        a.m۱۳۰۵۶a(new Cb(visibility));
        return a;
    }

    /* renamed from: android.support.v7.widget.k1$b  reason: invalid class name */
    class Cb extends Ca0 {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۱۲۱۷۷a = false;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ int f۱۲۱۷۸b;

        Cb(int i) {
            this.f۱۲۱۷۸b = i;
        }

        @Override // android.support.p۰۴۳v4.view.Ca0, android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۵۴۰۴b(View view) {
            Ck1.this.f۱۲۱۵۸a.setVisibility(0);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۴۰۳a(View view) {
            if (!this.f۱۲۱۷۷a) {
                Ck1.this.f۱۲۱۵۸a.setVisibility(this.f۱۲۱۷۸b);
            }
        }

        @Override // android.support.p۰۴۳v4.view.Ca0, android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۵۴۰۵c(View view) {
            this.f۱۲۱۷۷a = true;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۸۲b(Drawable icon) {
        this.f۱۲۱۶۴g = icon;
        m۱۵۳۶۹r();
    }

    /* renamed from: r  reason: contains not printable characters */
    private void m۱۵۳۶۹r() {
        if ((this.f۱۲۱۵۹b & 4) != 0) {
            Toolbar toolbar = this.f۱۲۱۵۸a;
            Drawable drawable = this.f۱۲۱۶۴g;
            if (drawable == null) {
                drawable = this.f۱۲۱۷۴q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f۱۲۱۵۸a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۸a(CharSequence description) {
        this.f۱۲۱۶۸k = description;
        m۱۵۳۶۸q();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۳۸۶c(int resId) {
        m۱۵۳۷۸a(resId == 0 ? null : m۱۵۳۹۸k().getString(resId));
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۵۳۶۸q() {
        if ((this.f۱۲۱۵۹b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f۱۲۱۶۸k)) {
            this.f۱۲۱۵۸a.setNavigationContentDescription(this.f۱۲۱۷۳p);
        } else {
            this.f۱۲۱۵۸a.setNavigationContentDescription(this.f۱۲۱۶۸k);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۳a(Drawable d) {
        Cu.m۱۲۹۸۴a(this.f۱۲۱۵۸a, d);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۲a(int visible) {
        this.f۱۲۱۵۸a.setVisibility(visible);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۷۴a(AbstractCp.AbstractCa actionMenuPresenterCallback, Ch.AbstractCa menuBuilderCallback) {
        this.f۱۲۱۵۸a.m۱۴۹۳۴a(actionMenuPresenterCallback, menuBuilderCallback);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCf0
    /* renamed from: i  reason: contains not printable characters */
    public Menu m۱۵۳۹۶i() {
        return this.f۱۲۱۵۸a.getMenu();
    }
}
