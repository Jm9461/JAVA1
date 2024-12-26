package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.Ca0;
import android.support.v4.view.Cu;
import android.support.v4.view.Cy;
import android.support.v4.view.InterfaceCb0;
import android.support.v4.view.InterfaceCz;
import android.support.v7.app.AbstractCa;
import android.support.v7.view.menu.Ch;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Cb1;
import android.support.v7.widget.InterfaceCf0;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cf;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Cg;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Ch;

/* renamed from: android.support.v7.app.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cn extends AbstractCa implements ActionBarOverlayLayout.InterfaceCd {

    /* renamed from: B, reason: contains not printable characters */
    private static final Interpolator f۱۱۱۰۶B = new AccelerateInterpolator();

    /* renamed from: C, reason: contains not printable characters */
    private static final Interpolator f۱۱۱۰۷C = new DecelerateInterpolator();

    /* renamed from: A, reason: contains not printable characters */
    final InterfaceCb0 f۱۱۱۰۸A;

    /* renamed from: a, reason: contains not printable characters */
    Context f۱۱۱۰۹a;

    /* renamed from: b, reason: contains not printable characters */
    private Context f۱۱۱۱۰b;

    /* renamed from: c, reason: contains not printable characters */
    ActionBarOverlayLayout f۱۱۱۱۱c;

    /* renamed from: d, reason: contains not printable characters */
    ActionBarContainer f۱۱۱۱۲d;

    /* renamed from: e, reason: contains not printable characters */
    InterfaceCf0 f۱۱۱۱۳e;

    /* renamed from: f, reason: contains not printable characters */
    ActionBarContextView f۱۱۱۱۴f;

    /* renamed from: g, reason: contains not printable characters */
    View f۱۱۱۱۵g;

    /* renamed from: h, reason: contains not printable characters */
    Cb1 f۱۱۱۱۶h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۱۱۱۱۷i;

    /* renamed from: j, reason: contains not printable characters */
    d f۱۱۱۱۸j;

    /* renamed from: k, reason: contains not printable characters */
    AbstractCb f۱۱۱۱۹k;

    /* renamed from: l, reason: contains not printable characters */
    AbstractCb.a f۱۱۱۲۰l;

    /* renamed from: m, reason: contains not printable characters */
    private boolean f۱۱۱۲۱m;

    /* renamed from: n, reason: contains not printable characters */
    private ArrayList<AbstractCa.b> f۱۱۱۲۲n;

    /* renamed from: o, reason: contains not printable characters */
    private boolean f۱۱۱۲۳o;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۱۱۲۴p;

    /* renamed from: q, reason: contains not printable characters */
    boolean f۱۱۱۲۵q;

    /* renamed from: r, reason: contains not printable characters */
    boolean f۱۱۱۲۶r;

    /* renamed from: s, reason: contains not printable characters */
    boolean f۱۱۱۲۷s;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۱۱۲۸t;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۱۱۱۲۹u;

    /* renamed from: v, reason: contains not printable characters */
    Ch f۱۱۱۳۰v;

    /* renamed from: w, reason: contains not printable characters */
    private boolean f۱۱۱۳۱w;

    /* renamed from: x, reason: contains not printable characters */
    boolean f۱۱۱۳۲x;

    /* renamed from: y, reason: contains not printable characters */
    final InterfaceCz f۱۱۱۳۳y;

    /* renamed from: z, reason: contains not printable characters */
    final InterfaceCz f۱۱۱۳۴z;

    /* renamed from: android.support.v7.app.n$a */
    class a extends Ca0 {
        a() {
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            View view2;
            Cn cn = Cn.this;
            if (cn.f۱۱۱۲۵q && (view2 = cn.f۱۱۱۱۵g) != null) {
                view2.setTranslationY(0.0f);
                Cn.this.f۱۱۱۱۲d.setTranslationY(0.0f);
            }
            Cn.this.f۱۱۱۱۲d.setVisibility(8);
            Cn.this.f۱۱۱۱۲d.setTransitioning(false);
            Cn cn2 = Cn.this;
            cn2.f۱۱۱۳۰v = null;
            cn2.m۱۱۶۴۳l();
            ActionBarOverlayLayout actionBarOverlayLayout = Cn.this.f۱۱۱۱۱c;
            if (actionBarOverlayLayout != null) {
                Cu.m۱۰۹۰۱C(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: android.support.v7.app.n$b */
    class b extends Ca0 {
        b() {
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            Cn cn = Cn.this;
            cn.f۱۱۱۳۰v = null;
            cn.f۱۱۱۱۲d.requestLayout();
        }
    }

    /* renamed from: android.support.v7.app.n$c */
    class c implements InterfaceCb0 {
        c() {
        }

        @Override // android.support.v4.view.InterfaceCb0
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۴۷۴۹a(View view) {
            ((View) Cn.this.f۱۱۱۱۲d.getParent()).invalidate();
        }
    }

    public Cn(Activity activity, boolean overlayMode) {
        new ArrayList();
        this.f۱۱۱۲۲n = new ArrayList<>();
        this.f۱۱۱۲۴p = 0;
        this.f۱۱۱۲۵q = true;
        this.f۱۱۱۲۹u = true;
        this.f۱۱۱۳۳y = new a();
        this.f۱۱۱۳۴z = new b();
        this.f۱۱۱۰۸A = new c();
        Window window = activity.getWindow();
        View decor = window.getDecorView();
        m۱۱۶۰۸b(decor);
        if (!overlayMode) {
            this.f۱۱۱۱۵g = decor.findViewById(R.id.content);
        }
    }

    public Cn(Dialog dialog) {
        new ArrayList();
        this.f۱۱۱۲۲n = new ArrayList<>();
        this.f۱۱۱۲۴p = 0;
        this.f۱۱۱۲۵q = true;
        this.f۱۱۱۲۹u = true;
        this.f۱۱۱۳۳y = new a();
        this.f۱۱۱۳۴z = new b();
        this.f۱۱۱۰۸A = new c();
        m۱۱۶۰۸b(dialog.getWindow().getDecorView());
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۱۶۰۸b(View decor) {
        this.f۱۱۱۱۱c = (ActionBarOverlayLayout) decor.findViewById(Cf.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f۱۱۱۱۳e = m۱۱۶۰۶a(decor.findViewById(Cf.action_bar));
        this.f۱۱۱۱۴f = (ActionBarContextView) decor.findViewById(Cf.action_context_bar);
        this.f۱۱۱۱۲d = (ActionBarContainer) decor.findViewById(Cf.action_bar_container);
        InterfaceCf0 interfaceCf0 = this.f۱۱۱۱۳e;
        if (interfaceCf0 == null || this.f۱۱۱۱۴f == null || this.f۱۱۱۱۲d == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f۱۱۱۰۹a = interfaceCf0.mo۱۳۳۲۸k();
        int current = this.f۱۱۱۱۳e.mo۱۳۳۲۵h();
        boolean homeAsUp = (current & 4) != 0;
        if (homeAsUp) {
            this.f۱۱۱۱۷i = true;
        }
        Ca abp = Ca.m۸۶۹۵a(this.f۱۱۱۰۹a);
        mo۱۱۶۳۴f(abp.m۸۶۹۶a() || homeAsUp);
        m۱۱۶۰۹l(abp.m۸۷۰۱f());
        TypedArray a2 = this.f۱۱۱۰۹a.obtainStyledAttributes(null, Cj.ActionBar, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.actionBarStyle, 0);
        if (a2.getBoolean(Cj.ActionBar_hideOnContentScroll, false)) {
            m۱۱۶۴۲k(true);
        }
        int elevation = a2.getDimensionPixelSize(Cj.ActionBar_elevation, 0);
        if (elevation != 0) {
            mo۱۱۶۱۶a(elevation);
        }
        a2.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    private InterfaceCf0 m۱۱۶۰۶a(View view) {
        if (view instanceof InterfaceCf0) {
            return (InterfaceCf0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۱۶a(float elevation) {
        Cu.m۱۰۹۰۷a(this.f۱۱۱۱۲d, elevation);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۱۹a(Configuration newConfig) {
        m۱۱۶۰۹l(Ca.m۸۶۹۵a(this.f۱۱۱۰۹a).m۸۷۰۱f());
    }

    /* renamed from: l, reason: contains not printable characters */
    private void m۱۱۶۰۹l(boolean hasEmbeddedTabs) {
        this.f۱۱۱۲۳o = hasEmbeddedTabs;
        if (!this.f۱۱۱۲۳o) {
            this.f۱۱۱۱۳e.mo۱۳۳۰۵a((Cb1) null);
            this.f۱۱۱۱۲d.setTabContainer(this.f۱۱۱۱۶h);
        } else {
            this.f۱۱۱۱۲d.setTabContainer(null);
            this.f۱۱۱۱۳e.mo۱۳۳۰۵a(this.f۱۱۱۱۶h);
        }
        boolean isInTabMode = m۱۱۶۴۴m() == 2;
        Cb1 cb1 = this.f۱۱۱۱۶h;
        if (cb1 != null) {
            if (isInTabMode) {
                cb1.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
                if (actionBarOverlayLayout != null) {
                    Cu.m۱۰۹۰۱C(actionBarOverlayLayout);
                }
            } else {
                cb1.setVisibility(8);
            }
        }
        this.f۱۱۱۱۳e.mo۱۳۳۱۴b(!this.f۱۱۱۲۳o && isInTabMode);
        this.f۱۱۱۱۱c.setHasNonEmbeddedTabs(!this.f۱۱۱۲۳o && isInTabMode);
    }

    /* renamed from: l, reason: contains not printable characters */
    void m۱۱۶۴۳l() {
        AbstractCb.a aVar = this.f۱۱۱۲۰l;
        if (aVar != null) {
            aVar.mo۱۱۵۳۸a(this.f۱۱۱۱۹k);
            this.f۱۱۱۱۹k = null;
            this.f۱۱۱۲۰l = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۷۷a(int visibility) {
        this.f۱۱۱۲۴p = visibility;
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: g, reason: contains not printable characters */
    public void mo۱۱۶۳۷g(boolean enabled) {
        Ch ch;
        this.f۱۱۱۳۱w = enabled;
        if (!enabled && (ch = this.f۱۱۱۳۰v) != null) {
            ch.m۸۷۶۹a();
        }
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۸b(boolean isVisible) {
        if (isVisible == this.f۱۱۱۲۱m) {
            return;
        }
        this.f۱۱۱۲۱m = isVisible;
        int count = this.f۱۱۱۲۲n.size();
        for (int i = 0; i < count; i++) {
            this.f۱۱۱۲۲n.get(i).m۱۱۳۶۳a(isVisible);
        }
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۱۶۳۲d(boolean showHomeAsUp) {
        m۱۱۶۱۸a(showHomeAsUp ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۱۶۳۳e(boolean showTitle) {
        m۱۱۶۱۸a(showTitle ? 8 : 0, 8);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: f, reason: contains not printable characters */
    public void mo۱۱۶۳۴f(boolean enable) {
        this.f۱۱۱۱۳e.mo۱۳۳۰۹a(enable);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۲۱a(CharSequence title) {
        this.f۱۱۱۱۳e.setTitle(title);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۷b(CharSequence title) {
        this.f۱۱۱۱۳e.setWindowTitle(title);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۶۱۸a(int options, int mask) {
        int current = this.f۱۱۱۱۳e.mo۱۳۳۲۵h();
        if ((mask & 4) != 0) {
            this.f۱۱۱۱۷i = true;
        }
        this.f۱۱۱۱۳e.mo۱۳۳۱۹d((options & mask) | ((mask ^ (-1)) & current));
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۲۰a(Drawable d2) {
        this.f۱۱۱۱۲d.setPrimaryBackground(d2);
    }

    /* renamed from: m, reason: contains not printable characters */
    public int m۱۱۶۴۴m() {
        return this.f۱۱۱۱۳e.mo۱۳۳۲۹l();
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: g, reason: contains not printable characters */
    public int mo۱۱۶۳۶g() {
        return this.f۱۱۱۱۳e.mo۱۳۳۲۵h();
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb mo۱۱۶۱۴a(AbstractCb.a callback) {
        d dVar = this.f۱۱۱۱۸j;
        if (dVar != null) {
            dVar.mo۱۱۶۴۸a();
        }
        this.f۱۱۱۱۱c.setHideOnContentScrollEnabled(false);
        this.f۱۱۱۱۴f.m۱۱۹۵۴c();
        d mode = new d(this.f۱۱۱۱۴f.getContext(), callback);
        if (mode.m۱۱۶۶۴k()) {
            this.f۱۱۱۱۸j = mode;
            mode.mo۱۱۶۶۲i();
            this.f۱۱۱۱۴f.m۱۱۹۵۲a(mode);
            m۱۱۶۳۹h(true);
            this.f۱۱۱۱۴f.sendAccessibilityEvent(32);
            return mode;
        }
        return null;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۷۸a(boolean enabled) {
        this.f۱۱۱۲۵q = enabled;
    }

    /* renamed from: p, reason: contains not printable characters */
    private void m۱۱۶۱۳p() {
        if (!this.f۱۱۱۲۸t) {
            this.f۱۱۱۲۸t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m۱۱۶۱۰m(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۷۶a() {
        if (this.f۱۱۱۲۷s) {
            this.f۱۱۱۲۷s = false;
            m۱۱۶۱۰m(true);
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    private void m۱۱۶۱۱n() {
        if (this.f۱۱۱۲۸t) {
            this.f۱۱۱۲۸t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m۱۱۶۱۰m(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceCd
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۹۸۰c() {
        if (!this.f۱۱۱۲۷s) {
            this.f۱۱۱۲۷s = true;
            m۱۱۶۱۰m(true);
        }
    }

    /* renamed from: k, reason: contains not printable characters */
    public void m۱۱۶۴۲k(boolean hideOnContentScroll) {
        if (hideOnContentScroll && !this.f۱۱۱۱۱c.m۱۱۹۷۴i()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f۱۱۱۳۲x = hideOnContentScroll;
        this.f۱۱۱۱۱c.setHideOnContentScrollEnabled(hideOnContentScroll);
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۱۶۰۷a(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (!hiddenByApp && !hiddenBySystem) {
            return true;
        }
        return false;
    }

    /* renamed from: m, reason: contains not printable characters */
    private void m۱۱۶۱۰m(boolean fromSystem) {
        boolean shown = m۱۱۶۰۷a(this.f۱۱۱۲۶r, this.f۱۱۱۲۷s, this.f۱۱۱۲۸t);
        if (shown) {
            if (!this.f۱۱۱۲۹u) {
                this.f۱۱۱۲۹u = true;
                m۱۱۶۴۱j(fromSystem);
                return;
            }
            return;
        }
        if (this.f۱۱۱۲۹u) {
            this.f۱۱۱۲۹u = false;
            m۱۱۶۴۰i(fromSystem);
        }
    }

    /* renamed from: j, reason: contains not printable characters */
    public void m۱۱۶۴۱j(boolean fromSystem) {
        View view;
        View view2;
        Ch ch = this.f۱۱۱۳۰v;
        if (ch != null) {
            ch.m۸۷۶۹a();
        }
        this.f۱۱۱۱۲d.setVisibility(0);
        if (this.f۱۱۱۲۴p == 0 && (this.f۱۱۱۳۱w || fromSystem)) {
            this.f۱۱۱۱۲d.setTranslationY(0.0f);
            float startingY = -this.f۱۱۱۱۲d.getHeight();
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f۱۱۱۱۲d.getLocationInWindow(topLeft);
                startingY -= topLeft[1];
            }
            this.f۱۱۱۱۲d.setTranslationY(startingY);
            Ch anim = new Ch();
            Cy a2 = Cu.m۱۰۹۰۶a(this.f۱۱۱۱۲d).m۱۰۹۹۰b(0.0f);
            a2.m۱۰۹۸۵a(this.f۱۱۱۰۸A);
            anim.m۸۷۶۵a(a2);
            if (this.f۱۱۱۲۵q && (view2 = this.f۱۱۱۱۵g) != null) {
                view2.setTranslationY(startingY);
                Cy cy = Cu.m۱۰۹۰۶a(this.f۱۱۱۱۵g);
                cy.m۱۰۹۹۰b(0.0f);
                anim.m۸۷۶۵a(cy);
            }
            anim.m۸۷۶۸a(f۱۱۱۰۷C);
            anim.m۸۷۶۴a(250L);
            anim.m۸۷۶۷a(this.f۱۱۱۳۴z);
            this.f۱۱۱۳۰v = anim;
            anim.m۸۷۷۱c();
        } else {
            this.f۱۱۱۱۲d.setAlpha(1.0f);
            this.f۱۱۱۱۲d.setTranslationY(0.0f);
            if (this.f۱۱۱۲۵q && (view = this.f۱۱۱۱۵g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f۱۱۱۳۴z.mo۱۵۷۹۵a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
        if (actionBarOverlayLayout != null) {
            Cu.m۱۰۹۰۱C(actionBarOverlayLayout);
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۱۶۴۰i(boolean fromSystem) {
        View view;
        Ch ch = this.f۱۱۱۳۰v;
        if (ch != null) {
            ch.m۸۷۶۹a();
        }
        if (this.f۱۱۱۲۴p == 0 && (this.f۱۱۱۳۱w || fromSystem)) {
            this.f۱۱۱۱۲d.setAlpha(1.0f);
            this.f۱۱۱۱۲d.setTransitioning(true);
            Ch anim = new Ch();
            float endingY = -this.f۱۱۱۱۲d.getHeight();
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f۱۱۱۱۲d.getLocationInWindow(topLeft);
                endingY -= topLeft[1];
            }
            Cy a2 = Cu.m۱۰۹۰۶a(this.f۱۱۱۱۲d).m۱۰۹۹۰b(endingY);
            a2.m۱۰۹۸۵a(this.f۱۱۱۰۸A);
            anim.m۸۷۶۵a(a2);
            if (this.f۱۱۱۲۵q && (view = this.f۱۱۱۱۵g) != null) {
                Cy cy = Cu.m۱۰۹۰۶a(view);
                cy.m۱۰۹۹۰b(endingY);
                anim.m۸۷۶۵a(cy);
            }
            anim.m۸۷۶۸a(f۱۱۱۰۶B);
            anim.m۸۷۶۴a(250L);
            anim.m۸۷۶۷a(this.f۱۱۱۳۳y);
            this.f۱۱۱۳۰v = anim;
            anim.m۸۷۷۱c();
            return;
        }
        this.f۱۱۱۳۳y.mo۱۵۷۹۵a(null);
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۱۶۳۹h(boolean toActionMode) {
        Cy fadeIn;
        Cy fadeOut;
        if (toActionMode) {
            m۱۱۶۱۳p();
        } else {
            m۱۱۶۱۱n();
        }
        if (m۱۱۶۱۲o()) {
            if (toActionMode) {
                fadeOut = this.f۱۱۱۱۳e.mo۱۳۳۰۱a(4, 100L);
                fadeIn = this.f۱۱۱۱۴f.m۱۲۸۹۵a(0, 200L);
            } else {
                fadeIn = this.f۱۱۱۱۳e.mo۱۳۳۰۱a(0, 200L);
                fadeOut = this.f۱۱۱۱۴f.m۱۲۸۹۵a(8, 100L);
            }
            Ch set = new Ch();
            set.m۸۷۶۶a(fadeOut, fadeIn);
            set.m۸۷۷۱c();
            return;
        }
        if (toActionMode) {
            this.f۱۱۱۱۳e.mo۱۳۳۰۲a(4);
            this.f۱۱۱۱۴f.setVisibility(0);
        } else {
            this.f۱۱۱۱۳e.mo۱۳۳۰۲a(0);
            this.f۱۱۱۱۴f.setVisibility(8);
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    private boolean m۱۱۶۱۲o() {
        return Cu.m۱۰۹۵۸y(this.f۱۱۱۱۲d);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: h, reason: contains not printable characters */
    public Context mo۱۱۶۳۸h() {
        if (this.f۱۱۱۱۰b == null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme currentTheme = this.f۱۱۱۰۹a.getTheme();
            currentTheme.resolveAttribute(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f۱۱۱۱۰b = new ContextThemeWrapper(this.f۱۱۱۰۹a, targetThemeRes);
            } else {
                this.f۱۱۱۱۰b = this.f۱۱۱۰۹a;
            }
        }
        return this.f۱۱۱۱۰b;
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۶b(Drawable indicator) {
        this.f۱۱۱۱۳e.mo۱۳۳۱۲b(indicator);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۵b(int resId) {
        this.f۱۱۱۱۳e.mo۱۳۳۱۶c(resId);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceCd
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۹۷۹b() {
        Ch ch = this.f۱۱۱۳۰v;
        if (ch != null) {
            ch.m۸۷۶۹a();
            this.f۱۱۱۳۰v = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceCd
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۱۹۸۱d() {
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: f, reason: contains not printable characters */
    public boolean mo۱۱۶۳۵f() {
        InterfaceCf0 interfaceCf0 = this.f۱۱۱۱۳e;
        if (interfaceCf0 != null && interfaceCf0.mo۱۳۳۳۱n()) {
            this.f۱۱۱۱۳e.collapseActionView();
            return true;
        }
        return false;
    }

    /* renamed from: android.support.v7.app.n$d */
    public class d extends AbstractCb implements Ch.a {

        /* renamed from: e, reason: contains not printable characters */
        private final Context f۱۱۱۳۸e;

        /* renamed from: f, reason: contains not printable characters */
        private final android.support.v7.view.menu.Ch f۱۱۱۳۹f;

        /* renamed from: g, reason: contains not printable characters */
        private AbstractCb.a f۱۱۱۴۰g;

        /* renamed from: h, reason: contains not printable characters */
        private WeakReference<View> f۱۱۱۴۱h;

        public d(Context context, AbstractCb.a callback) {
            this.f۱۱۱۳۸e = context;
            this.f۱۱۱۴۰g = callback;
            android.support.v7.view.menu.Ch ch = new android.support.v7.view.menu.Ch(context);
            ch.m۱۱۷۹۳c(1);
            this.f۱۱۱۳۹f = ch;
            this.f۱۱۱۳۹f.mo۱۱۹۳۷a(this);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: d, reason: contains not printable characters */
        public MenuInflater mo۱۱۶۵۹d() {
            return new Cg(this.f۱۱۱۳۸e);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: c, reason: contains not printable characters */
        public Menu mo۱۱۶۵۸c() {
            return this.f۱۱۱۳۹f;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۶۴۸a() {
            Cn cn = Cn.this;
            if (cn.f۱۱۱۱۸j != this) {
                return;
            }
            if (!Cn.m۱۱۶۰۷a(cn.f۱۱۱۲۶r, cn.f۱۱۱۲۷s, false)) {
                Cn cn2 = Cn.this;
                cn2.f۱۱۱۱۹k = this;
                cn2.f۱۱۱۲۰l = this.f۱۱۱۴۰g;
            } else {
                this.f۱۱۱۴۰g.mo۱۱۵۳۸a(this);
            }
            this.f۱۱۱۴۰g = null;
            Cn.this.m۱۱۶۳۹h(false);
            Cn.this.f۱۱۱۱۴f.m۱۱۹۵۱a();
            Cn.this.f۱۱۱۱۳e.mo۱۳۳۲۷j().sendAccessibilityEvent(32);
            Cn cn3 = Cn.this;
            cn3.f۱۱۱۱۱c.setHideOnContentScrollEnabled(cn3.f۱۱۱۳۲x);
            Cn.this.f۱۱۱۱۸j = null;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: i, reason: contains not printable characters */
        public void mo۱۱۶۶۲i() {
            if (Cn.this.f۱۱۱۱۸j != this) {
                return;
            }
            this.f۱۱۱۳۹f.m۱۱۸۱۷s();
            try {
                this.f۱۱۱۴۰g.mo۱۱۵۴۱b(this, this.f۱۱۱۳۹f);
            } finally {
                this.f۱۱۱۳۹f.m۱۱۸۱۶r();
            }
        }

        /* renamed from: k, reason: contains not printable characters */
        public boolean m۱۱۶۶۴k() {
            this.f۱۱۱۳۹f.m۱۱۸۱۷s();
            try {
                return this.f۱۱۱۴۰g.mo۱۱۵۳۹a(this, this.f۱۱۱۳۹f);
            } finally {
                this.f۱۱۱۳۹f.m۱۱۸۱۶r();
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۶۵۱a(View view) {
            Cn.this.f۱۱۱۱۴f.setCustomView(view);
            this.f۱۱۱۴۱h = new WeakReference<>(view);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۶۵۲a(CharSequence subtitle) {
            Cn.this.f۱۱۱۱۴f.setSubtitle(subtitle);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۱۶۵۷b(CharSequence title) {
            Cn.this.f۱۱۱۱۴f.setTitle(title);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۱۶۵۶b(int resId) {
            mo۱۱۶۵۷b(Cn.this.f۱۱۱۰۹a.getResources().getString(resId));
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۶۴۹a(int resId) {
            mo۱۱۶۵۲a((CharSequence) Cn.this.f۱۱۱۰۹a.getResources().getString(resId));
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: g, reason: contains not printable characters */
        public CharSequence mo۱۱۶۶۱g() {
            return Cn.this.f۱۱۱۱۴f.getTitle();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: e, reason: contains not printable characters */
        public CharSequence mo۱۱۶۶۰e() {
            return Cn.this.f۱۱۱۱۴f.getSubtitle();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۶۵۳a(boolean titleOptional) {
            super.mo۱۱۶۵۳a(titleOptional);
            Cn.this.f۱۱۱۱۴f.setTitleOptional(titleOptional);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: j, reason: contains not printable characters */
        public boolean mo۱۱۶۶۳j() {
            return Cn.this.f۱۱۱۱۴f.m۱۱۹۵۳b();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
        /* renamed from: b, reason: contains not printable characters */
        public View mo۱۱۶۵۵b() {
            WeakReference<View> weakReference = this.f۱۱۱۴۱h;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // android.support.v7.view.menu.Ch.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۳۵۶۶a(android.support.v7.view.menu.Ch menu, MenuItem item) {
            AbstractCb.a aVar = this.f۱۱۱۴۰g;
            if (aVar != null) {
                return aVar.mo۱۱۵۴۰a(this, item);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.Ch.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۶۵a(android.support.v7.view.menu.Ch menu) {
            if (this.f۱۱۱۴۰g == null) {
                return;
            }
            mo۱۱۶۶۲i();
            Cn.this.f۱۱۱۱۴f.m۱۱۹۵۵d();
        }
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۶۳۰c(boolean enable) {
        if (!this.f۱۱۱۱۷i) {
            mo۱۱۶۳۲d(enable);
        }
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۶۲۳a(int keyCode, KeyEvent event) {
        Menu menu;
        d dVar = this.f۱۱۱۱۸j;
        if (dVar == null || (menu = dVar.mo۱۱۶۵۸c()) == null) {
            return false;
        }
        KeyCharacterMap kmap = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1);
        menu.setQwertyMode(kmap.getKeyboardType() != 1);
        return menu.performShortcut(keyCode, event, 0);
    }
}
