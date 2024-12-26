package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.Ca0;
import android.support.v4.view.Cu;
import android.support.v4.view.Cy;
import android.support.v7.view.menu.Ch;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ce;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cf;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ch;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.k1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck1 implements InterfaceCf0 {

    /* renamed from: a, reason: contains not printable characters */
    Toolbar f۱۲۱۵۸a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۲۱۵۹b;

    /* renamed from: c, reason: contains not printable characters */
    private View f۱۲۱۶۰c;

    /* renamed from: d, reason: contains not printable characters */
    private View f۱۲۱۶۱d;

    /* renamed from: e, reason: contains not printable characters */
    private Drawable f۱۲۱۶۲e;

    /* renamed from: f, reason: contains not printable characters */
    private Drawable f۱۲۱۶۳f;

    /* renamed from: g, reason: contains not printable characters */
    private Drawable f۱۲۱۶۴g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۲۱۶۵h;

    /* renamed from: i, reason: contains not printable characters */
    CharSequence f۱۲۱۶۶i;

    /* renamed from: j, reason: contains not printable characters */
    private CharSequence f۱۲۱۶۷j;

    /* renamed from: k, reason: contains not printable characters */
    private CharSequence f۱۲۱۶۸k;

    /* renamed from: l, reason: contains not printable characters */
    Window.Callback f۱۲۱۶۹l;

    /* renamed from: m, reason: contains not printable characters */
    boolean f۱۲۱۷۰m;

    /* renamed from: n, reason: contains not printable characters */
    private Cc f۱۲۱۷۱n;

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۲۱۷۲o;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۲۱۷۳p;

    /* renamed from: q, reason: contains not printable characters */
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
        Cj1 a2 = Cj1.m۱۳۲۷۵a(toolbar.getContext(), null, Cj.ActionBar, Ca.actionBarStyle, 0);
        this.f۱۲۱۷۴q = a2.m۱۳۲۸۴b(Cj.ActionBar_homeAsUpIndicator);
        if (!style) {
            this.f۱۲۱۵۹b = m۱۳۲۹۷p();
        } else {
            CharSequence title = a2.m۱۳۲۹۰e(Cj.ActionBar_title);
            if (!TextUtils.isEmpty(title)) {
                setTitle(title);
            }
            CharSequence subtitle = a2.m۱۳۲۹۰e(Cj.ActionBar_subtitle);
            if (!TextUtils.isEmpty(subtitle)) {
                m۱۳۳۱۳b(subtitle);
            }
            Drawable logo = a2.m۱۳۲۸۴b(Cj.ActionBar_logo);
            if (logo != null) {
                m۱۳۳۱۷c(logo);
            }
            Drawable icon = a2.m۱۳۲۸۴b(Cj.ActionBar_icon);
            if (icon != null) {
                setIcon(icon);
            }
            if (this.f۱۲۱۶۴g == null && (drawable = this.f۱۲۱۷۴q) != null) {
                mo۱۳۳۱۲b(drawable);
            }
            mo۱۳۳۱۹d(a2.m۱۳۲۸۷d(Cj.ActionBar_displayOptions, 0));
            int customNavId = a2.m۱۳۲۹۳g(Cj.ActionBar_customNavigationLayout, 0);
            if (customNavId != 0) {
                m۱۳۳۰۷a(LayoutInflater.from(this.f۱۲۱۵۸a.getContext()).inflate(customNavId, (ViewGroup) this.f۱۲۱۵۸a, false));
                mo۱۳۳۱۹d(this.f۱۲۱۵۹b | 16);
            }
            int height = a2.m۱۳۲۹۱f(Cj.ActionBar_height, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f۱۲۱۵۸a.getLayoutParams();
                lp.height = height;
                this.f۱۲۱۵۸a.setLayoutParams(lp);
            }
            int contentInsetStart = a2.m۱۳۲۸۳b(Cj.ActionBar_contentInsetStart, -1);
            int contentInsetEnd = a2.m۱۳۲۸۳b(Cj.ActionBar_contentInsetEnd, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f۱۲۱۵۸a.m۱۲۸۶۵b(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a2.m۱۳۲۹۳g(Cj.ActionBar_titleTextStyle, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f۱۲۱۵۸a;
                toolbar2.m۱۲۸۶۶b(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a2.m۱۳۲۹۳g(Cj.ActionBar_subtitleTextStyle, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f۱۲۱۵۸a;
                toolbar3.m۱۲۸۶۲a(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a2.m۱۳۲۹۳g(Cj.ActionBar_popupTheme, 0);
            if (popupTheme != 0) {
                this.f۱۲۱۵۸a.setPopupTheme(popupTheme);
            }
        }
        a2.m۱۳۲۸۰a();
        m۱۳۳۲۲e(defaultNavigationContentDescription);
        this.f۱۲۱۶۸k = this.f۱۲۱۵۸a.getNavigationContentDescription();
        this.f۱۲۱۵۸a.setNavigationOnClickListener(new a());
    }

    /* renamed from: android.support.v7.widget.k1$a */
    class a implements View.OnClickListener {

        /* renamed from: c, reason: contains not printable characters */
        final android.support.v7.view.menu.Ca f۱۲۱۷۵c;

        a() {
            this.f۱۲۱۷۵c = new android.support.v7.view.menu.Ca(Ck1.this.f۱۲۱۵۸a.getContext(), 0, R.id.home, 0, 0, Ck1.this.f۱۲۱۶۶i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Ck1 ck1 = Ck1.this;
            Window.Callback callback = ck1.f۱۲۱۶۹l;
            if (callback != null && ck1.f۱۲۱۷۰m) {
                callback.onMenuItemSelected(0, this.f۱۲۱۷۵c);
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۳۳۲۲e(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription == this.f۱۲۱۷۳p) {
            return;
        }
        this.f۱۲۱۷۳p = defaultNavigationContentDescription;
        if (TextUtils.isEmpty(this.f۱۲۱۵۸a.getNavigationContentDescription())) {
            mo۱۳۳۱۶c(this.f۱۲۱۷۳p);
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    private int m۱۳۲۹۷p() {
        if (this.f۱۲۱۵۸a.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.f۱۲۱۷۴q = this.f۱۲۱۵۸a.getNavigationIcon();
        return opts;
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: j, reason: contains not printable characters */
    public ViewGroup mo۱۳۳۲۷j() {
        return this.f۱۲۱۵۸a;
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: k, reason: contains not printable characters */
    public Context mo۱۳۳۲۸k() {
        return this.f۱۲۱۵۸a.getContext();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: n, reason: contains not printable characters */
    public boolean mo۱۳۳۳۱n() {
        return this.f۱۲۱۵۸a.m۱۲۸۷۱f();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public void collapseActionView() {
        this.f۱۲۱۵۸a.m۱۲۸۶۸c();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public void setWindowCallback(Window.Callback cb) {
        this.f۱۲۱۶۹l = cb;
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public void setWindowTitle(CharSequence title) {
        if (!this.f۱۲۱۶۵h) {
            m۱۳۲۹۶c(title);
        }
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public CharSequence getTitle() {
        return this.f۱۲۱۵۸a.getTitle();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public void setTitle(CharSequence title) {
        this.f۱۲۱۶۵h = true;
        m۱۳۲۹۶c(title);
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۲۹۶c(CharSequence title) {
        this.f۱۲۱۶۶i = title;
        if ((this.f۱۲۱۵۹b & 8) != 0) {
            this.f۱۲۱۵۸a.setTitle(title);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۳۳۱۳b(CharSequence subtitle) {
        this.f۱۲۱۶۷j = subtitle;
        if ((this.f۱۲۱۵۹b & 8) != 0) {
            this.f۱۲۱۵۸a.setSubtitle(subtitle);
        }
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: m, reason: contains not printable characters */
    public void mo۱۳۳۳۰m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: o, reason: contains not printable characters */
    public void mo۱۳۳۳۲o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public void setIcon(int resId) {
        setIcon(resId != 0 ? p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(mo۱۳۳۲۸k(), resId) : null);
    }

    @Override // android.support.v7.widget.InterfaceCf0
    public void setIcon(Drawable d2) {
        this.f۱۲۱۶۲e = d2;
        m۱۳۳۰۰s();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۳۱۱b(int resId) {
        m۱۳۳۱۷c(resId != 0 ? p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(mo۱۳۳۲۸k(), resId) : null);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۳۱۷c(Drawable d2) {
        this.f۱۲۱۶۳f = d2;
        m۱۳۳۰۰s();
    }

    /* renamed from: s, reason: contains not printable characters */
    private void m۱۳۳۰۰s() {
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

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: f, reason: contains not printable characters */
    public boolean mo۱۳۳۲۳f() {
        return this.f۱۲۱۵۸a.m۱۲۸۶۷b();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۳۳۱۵b() {
        return this.f۱۲۱۵۸a.m۱۲۸۷۴i();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۳۱۰a() {
        return this.f۱۲۱۵۸a.m۱۲۸۷۳h();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: d, reason: contains not printable characters */
    public boolean mo۱۳۳۲۰d() {
        return this.f۱۲۱۵۸a.m۱۲۸۷۶k();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: c, reason: contains not printable characters */
    public boolean mo۱۳۳۱۸c() {
        return this.f۱۲۱۵۸a.m۱۲۸۷۲g();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۳۳۲۱e() {
        this.f۱۲۱۷۰m = true;
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۳۰۶a(Menu menu, InterfaceCp.a cb) {
        if (this.f۱۲۱۷۱n == null) {
            this.f۱۲۱۷۱n = new Cc(this.f۱۲۱۵۸a.getContext());
            this.f۱۲۱۷۱n.m۱۱۶۹۱a(Cf.action_menu_presenter);
        }
        this.f۱۲۱۷۱n.mo۱۱۹۲۳a(cb);
        this.f۱۲۱۵۸a.m۱۲۸۶۳a((android.support.v7.view.menu.Ch) menu, this.f۱۲۱۷۱n);
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: g, reason: contains not printable characters */
    public void mo۱۳۳۲۴g() {
        this.f۱۲۱۵۸a.m۱۲۸۶۹d();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: h, reason: contains not printable characters */
    public int mo۱۳۳۲۵h() {
        return this.f۱۲۱۵۹b;
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۳۳۱۹d(int newOpts) {
        View view;
        int oldOpts = this.f۱۲۱۵۹b;
        int changed = oldOpts ^ newOpts;
        this.f۱۲۱۵۹b = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    m۱۳۲۹۸q();
                }
                m۱۳۲۹۹r();
            }
            if ((changed & 3) != 0) {
                m۱۳۳۰۰s();
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

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۳۰۵a(Cb1 tabView) {
        View view = this.f۱۲۱۶۰c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f۱۲۱۵۸a;
            if (parent == toolbar) {
                toolbar.removeView(this.f۱۲۱۶۰c);
            }
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

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۳۱۴b(boolean collapsible) {
        this.f۱۲۱۵۸a.setCollapsible(collapsible);
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۳۰۹a(boolean enable) {
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: l, reason: contains not printable characters */
    public int mo۱۳۳۲۹l() {
        return this.f۱۲۱۷۲o;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۳۰۷a(View view) {
        View view2 = this.f۱۲۱۶۱d;
        if (view2 != null && (this.f۱۲۱۵۹b & 16) != 0) {
            this.f۱۲۱۵۸a.removeView(view2);
        }
        this.f۱۲۱۶۱d = view;
        if (view != null && (this.f۱۲۱۵۹b & 16) != 0) {
            this.f۱۲۱۵۸a.addView(this.f۱۲۱۶۱d);
        }
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public Cy mo۱۳۳۰۱a(int visibility, long duration) {
        Cy cy = Cu.m۱۰۹۰۶a(this.f۱۲۱۵۸a);
        cy.m۱۰۹۸۳a(visibility == 0 ? 1.0f : 0.0f);
        cy.m۱۰۹۸۴a(duration);
        cy.m۱۰۹۸۶a(new b(visibility));
        return cy;
    }

    /* renamed from: android.support.v7.widget.k1$b */
    class b extends Ca0 {

        /* renamed from: a, reason: contains not printable characters */
        private boolean f۱۲۱۷۷a = false;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ int f۱۲۱۷۸b;

        b(int i) {
            this.f۱۲۱۷۸b = i;
        }

        @Override // android.support.v4.view.Ca0, android.support.v4.view.InterfaceCz
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۵۷۹۶b(View view) {
            Ck1.this.f۱۲۱۵۸a.setVisibility(0);
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            if (!this.f۱۲۱۷۷a) {
                Ck1.this.f۱۲۱۵۸a.setVisibility(this.f۱۲۱۷۸b);
            }
        }

        @Override // android.support.v4.view.Ca0, android.support.v4.view.InterfaceCz
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۵۷۹۷c(View view) {
            this.f۱۲۱۷۷a = true;
        }
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۳۱۲b(Drawable icon) {
        this.f۱۲۱۶۴g = icon;
        m۱۳۲۹۹r();
    }

    /* renamed from: r, reason: contains not printable characters */
    private void m۱۳۲۹۹r() {
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

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۳۰۸a(CharSequence description) {
        this.f۱۲۱۶۸k = description;
        m۱۳۲۹۸q();
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۳۱۶c(int resId) {
        m۱۳۳۰۸a(resId == 0 ? null : mo۱۳۳۲۸k().getString(resId));
    }

    /* renamed from: q, reason: contains not printable characters */
    private void m۱۳۲۹۸q() {
        if ((this.f۱۲۱۵۹b & 4) != 0) {
            if (TextUtils.isEmpty(this.f۱۲۱۶۸k)) {
                this.f۱۲۱۵۸a.setNavigationContentDescription(this.f۱۲۱۷۳p);
            } else {
                this.f۱۲۱۵۸a.setNavigationContentDescription(this.f۱۲۱۶۸k);
            }
        }
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۳۰۳a(Drawable d2) {
        Cu.m۱۰۹۱۴a(this.f۱۲۱۵۸a, d2);
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۳۰۲a(int visible) {
        this.f۱۲۱۵۸a.setVisibility(visible);
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۳۰۴a(InterfaceCp.a actionMenuPresenterCallback, Ch.a menuBuilderCallback) {
        this.f۱۲۱۵۸a.m۱۲۸۶۴a(actionMenuPresenterCallback, menuBuilderCallback);
    }

    @Override // android.support.v7.widget.InterfaceCf0
    /* renamed from: i, reason: contains not printable characters */
    public Menu mo۱۳۳۲۶i() {
        return this.f۱۲۱۵۸a.getMenu();
    }
}
