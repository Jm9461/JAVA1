package android.support.p۰۴۷v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.AbstractCb0;
import android.support.p۰۴۳v4.view.AbstractCz;
import android.support.p۰۴۳v4.view.Ca0;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cy;
import android.support.p۰۴۷v7.app.AbstractCa;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.AbstractCf0;
import android.support.p۰۴۷v7.widget.ActionBarContainer;
import android.support.p۰۴۷v7.widget.ActionBarContextView;
import android.support.p۰۴۷v7.widget.ActionBarOverlayLayout;
import android.support.p۰۴۷v7.widget.Cb1;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cg;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ch;

/* renamed from: android.support.v7.app.n  reason: invalid class name */
public class Cn extends AbstractCa implements ActionBarOverlayLayout.AbstractCd {

    /* renamed from: B  reason: contains not printable characters */
    private static final Interpolator f۱۱۱۰۶B = new AccelerateInterpolator();

    /* renamed from: C  reason: contains not printable characters */
    private static final Interpolator f۱۱۱۰۷C = new DecelerateInterpolator();

    /* renamed from: A  reason: contains not printable characters */
    final AbstractCb0 f۱۱۱۰۸A = new Cc();

    /* renamed from: a  reason: contains not printable characters */
    Context f۱۱۱۰۹a;

    /* renamed from: b  reason: contains not printable characters */
    private Context f۱۱۱۱۰b;

    /* renamed from: c  reason: contains not printable characters */
    ActionBarOverlayLayout f۱۱۱۱۱c;

    /* renamed from: d  reason: contains not printable characters */
    ActionBarContainer f۱۱۱۱۲d;

    /* renamed from: e  reason: contains not printable characters */
    AbstractCf0 f۱۱۱۱۳e;

    /* renamed from: f  reason: contains not printable characters */
    ActionBarContextView f۱۱۱۱۴f;

    /* renamed from: g  reason: contains not printable characters */
    View f۱۱۱۱۵g;

    /* renamed from: h  reason: contains not printable characters */
    Cb1 f۱۱۱۱۶h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۱۱۱۷i;

    /* renamed from: j  reason: contains not printable characters */
    Cd f۱۱۱۱۸j;

    /* renamed from: k  reason: contains not printable characters */
    AbstractCb f۱۱۱۱۹k;

    /* renamed from: l  reason: contains not printable characters */
    AbstractCb.AbstractCa f۱۱۱۲۰l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۱۱۲۱m;

    /* renamed from: n  reason: contains not printable characters */
    private ArrayList<AbstractCa.AbstractCb> f۱۱۱۲۲n = new ArrayList<>();

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۱۱۲۳o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۱۱۲۴p = 0;

    /* renamed from: q  reason: contains not printable characters */
    boolean f۱۱۱۲۵q = true;

    /* renamed from: r  reason: contains not printable characters */
    boolean f۱۱۱۲۶r;

    /* renamed from: s  reason: contains not printable characters */
    boolean f۱۱۱۲۷s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۱۲۸t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۱۱۲۹u = true;

    /* renamed from: v  reason: contains not printable characters */
    Ch f۱۱۱۳۰v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۱۱۳۱w;

    /* renamed from: x  reason: contains not printable characters */
    boolean f۱۱۱۳۲x;

    /* renamed from: y  reason: contains not printable characters */
    final AbstractCz f۱۱۱۳۳y = new Ca();

    /* renamed from: z  reason: contains not printable characters */
    final AbstractCz f۱۱۱۳۴z = new Cb();

    /* renamed from: android.support.v7.app.n$a  reason: invalid class name */
    class Ca extends Ca0 {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۱۵a(View view) {
            View view2;
            Cn nVar = Cn.this;
            if (nVar.f۱۱۱۲۵q && (view2 = nVar.f۱۱۱۱۵g) != null) {
                view2.setTranslationY(0.0f);
                Cn.this.f۱۱۱۱۲d.setTranslationY(0.0f);
            }
            Cn.this.f۱۱۱۱۲d.setVisibility(8);
            Cn.this.f۱۱۱۱۲d.setTransitioning(false);
            Cn nVar2 = Cn.this;
            nVar2.f۱۱۱۳۰v = null;
            nVar2.m۱۳۷۱۳l();
            ActionBarOverlayLayout actionBarOverlayLayout = Cn.this.f۱۱۱۱۱c;
            if (actionBarOverlayLayout != null) {
                Cu.m۱۲۹۷۱C(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: android.support.v7.app.n$b  reason: invalid class name */
    class Cb extends Ca0 {
        Cb() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۱۶a(View view) {
            Cn nVar = Cn.this;
            nVar.f۱۱۱۳۰v = null;
            nVar.f۱۱۱۱۲d.requestLayout();
        }
    }

    /* renamed from: android.support.v7.app.n$c  reason: invalid class name */
    class Cc implements AbstractCb0 {
        Cc() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCb0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۱۷a(View view) {
            ((View) Cn.this.f۱۱۱۱۲d.getParent()).invalidate();
        }
    }

    public Cn(Activity activity, boolean overlayMode) {
        new ArrayList();
        View decor = activity.getWindow().getDecorView();
        m۱۳۶۷۸b(decor);
        if (!overlayMode) {
            this.f۱۱۱۱۵g = decor.findViewById(16908290);
        }
    }

    public Cn(Dialog dialog) {
        new ArrayList();
        m۱۳۶۷۸b(dialog.getWindow().getDecorView());
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۶۷۸b(View decor) {
        this.f۱۱۱۱۱c = (ActionBarOverlayLayout) decor.findViewById(Cf.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f۱۱۱۱۳e = m۱۳۶۷۶a(decor.findViewById(Cf.action_bar));
        this.f۱۱۱۱۴f = (ActionBarContextView) decor.findViewById(Cf.action_context_bar);
        this.f۱۱۱۱۲d = (ActionBarContainer) decor.findViewById(Cf.action_bar_container);
        AbstractCf0 f0Var = this.f۱۱۱۱۳e;
        if (f0Var == null || this.f۱۱۱۱۴f == null || this.f۱۱۱۱۲d == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f۱۱۱۰۹a = f0Var.m۱۵۲۲۸k();
        boolean homeAsUp = (this.f۱۱۱۱۳e.m۱۵۲۲۵h() & 4) != 0;
        if (homeAsUp) {
            this.f۱۱۱۱۷i = true;
        }
        p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca abp = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca.m۱۰۷۶۴a(this.f۱۱۱۰۹a);
        m۱۳۷۰۴f(abp.m۱۰۷۶۵a() || homeAsUp);
        m۱۳۶۷۹l(abp.m۱۰۷۷۰f());
        TypedArray a = this.f۱۱۱۰۹a.obtainStyledAttributes(null, Cj.ActionBar, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarStyle, 0);
        if (a.getBoolean(Cj.ActionBar_hideOnContentScroll, false)) {
            m۱۳۷۱۲k(true);
        }
        int elevation = a.getDimensionPixelSize(Cj.ActionBar_elevation, 0);
        if (elevation != 0) {
            m۱۳۶۸۶a((float) elevation);
        }
        a.recycle();
    }

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCf0 m۱۳۶۷۶a(View view) {
        if (view instanceof AbstractCf0) {
            return (AbstractCf0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۸۶a(float elevation) {
        Cu.m۱۲۹۷۷a(this.f۱۱۱۱۲d, elevation);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۸۹a(Configuration newConfig) {
        m۱۳۶۷۹l(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca.m۱۰۷۶۴a(this.f۱۱۱۰۹a).m۱۰۷۷۰f());
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۳۶۷۹l(boolean hasEmbeddedTabs) {
        this.f۱۱۱۲۳o = hasEmbeddedTabs;
        if (!this.f۱۱۱۲۳o) {
            this.f۱۱۱۱۳e.m۱۵۲۱۰a((Cb1) null);
            this.f۱۱۱۱۲d.setTabContainer(this.f۱۱۱۱۶h);
        } else {
            this.f۱۱۱۱۲d.setTabContainer(null);
            this.f۱۱۱۱۳e.m۱۵۲۱۰a(this.f۱۱۱۱۶h);
        }
        boolean z = true;
        boolean isInTabMode = m۱۳۷۱۴m() == 2;
        Cb1 b1Var = this.f۱۱۱۱۶h;
        if (b1Var != null) {
            if (isInTabMode) {
                b1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
                if (actionBarOverlayLayout != null) {
                    Cu.m۱۲۹۷۱C(actionBarOverlayLayout);
                }
            } else {
                b1Var.setVisibility(8);
            }
        }
        this.f۱۱۱۱۳e.m۱۵۲۱۶b(!this.f۱۱۱۲۳o && isInTabMode);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f۱۱۱۱۱c;
        if (this.f۱۱۱۲۳o || !isInTabMode) {
            z = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public void m۱۳۷۱۳l() {
        AbstractCb.AbstractCa aVar = this.f۱۱۱۲۰l;
        if (aVar != null) {
            aVar.m۱۰۷۸۹a(this.f۱۱۱۱۹k);
            this.f۱۱۱۱۹k = null;
            this.f۱۱۱۲۰l = null;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.ActionBarOverlayLayout.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۸۷a(int visibility) {
        this.f۱۱۱۲۴p = visibility;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۳۷۰۷g(boolean enabled) {
        Ch hVar;
        this.f۱۱۱۳۱w = enabled;
        if (!enabled && (hVar = this.f۱۱۱۳۰v) != null) {
            hVar.m۱۰۸۳۸a();
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۹۸b(boolean isVisible) {
        if (isVisible != this.f۱۱۱۲۱m) {
            this.f۱۱۱۲۱m = isVisible;
            int count = this.f۱۱۱۲۲n.size();
            for (int i = 0; i < count; i++) {
                this.f۱۱۱۲۲n.get(i).m۱۳۴۳۳a(isVisible);
            }
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۷۰۲d(boolean showHomeAsUp) {
        m۱۳۶۸۸a(showHomeAsUp ? 4 : 0, 4);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۳۷۰۳e(boolean showTitle) {
        m۱۳۶۸۸a(showTitle ? 8 : 0, 8);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۳۷۰۴f(boolean enable) {
        this.f۱۱۱۱۳e.m۱۵۲۱۲a(enable);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۹۱a(CharSequence title) {
        this.f۱۱۱۱۳e.setTitle(title);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۹۷b(CharSequence title) {
        this.f۱۱۱۱۳e.setWindowTitle(title);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۸۸a(int options, int mask) {
        int current = this.f۱۱۱۱۳e.m۱۵۲۲۵h();
        if ((mask & 4) != 0) {
            this.f۱۱۱۱۷i = true;
        }
        this.f۱۱۱۱۳e.m۱۵۲۲۰d((options & mask) | ((mask ^ -1) & current));
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۹۰a(Drawable d) {
        this.f۱۱۱۱۲d.setPrimaryBackground(d);
    }

    /* renamed from: m  reason: contains not printable characters */
    public int m۱۳۷۱۴m() {
        return this.f۱۱۱۱۳e.m۱۵۲۲۹l();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: g  reason: contains not printable characters */
    public int m۱۳۷۰۶g() {
        return this.f۱۱۱۱۳e.m۱۵۲۲۵h();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb m۱۳۶۸۴a(AbstractCb.AbstractCa callback) {
        Cd dVar = this.f۱۱۱۱۸j;
        if (dVar != null) {
            dVar.m۱۳۷۱۸a();
        }
        this.f۱۱۱۱۱c.setHideOnContentScrollEnabled(false);
        this.f۱۱۱۱۴f.m۱۴۰۲۴c();
        Cd mode = new Cd(this.f۱۱۱۱۴f.getContext(), callback);
        if (!mode.m۱۳۷۳۴k()) {
            return null;
        }
        this.f۱۱۱۱۸j = mode;
        mode.m۱۳۷۳۲i();
        this.f۱۱۱۱۴f.m۱۴۰۲۲a(mode);
        m۱۳۷۰۹h(true);
        this.f۱۱۱۱۴f.sendAccessibilityEvent(32);
        return mode;
    }

    @Override // android.support.p۰۴۷v7.widget.ActionBarOverlayLayout.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۹۲a(boolean enabled) {
        this.f۱۱۱۲۵q = enabled;
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۳۶۸۳p() {
        if (!this.f۱۱۱۲۸t) {
            this.f۱۱۱۲۸t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m۱۳۶۸۰m(false);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.ActionBarOverlayLayout.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۸۵a() {
        if (this.f۱۱۱۲۷s) {
            this.f۱۱۱۲۷s = false;
            m۱۳۶۸۰m(true);
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    private void m۱۳۶۸۱n() {
        if (this.f۱۱۱۲۸t) {
            this.f۱۱۱۲۸t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m۱۳۶۸۰m(false);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.ActionBarOverlayLayout.AbstractCd
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۶۹۹c() {
        if (!this.f۱۱۱۲۷s) {
            this.f۱۱۱۲۷s = true;
            m۱۳۶۸۰m(true);
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۳۷۱۲k(boolean hideOnContentScroll) {
        if (!hideOnContentScroll || this.f۱۱۱۱۱c.m۱۴۰۴۴i()) {
            this.f۱۱۱۳۲x = hideOnContentScroll;
            this.f۱۱۱۱۱c.setHideOnContentScrollEnabled(hideOnContentScroll);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۳۶۷۷a(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (hiddenByApp || hiddenBySystem) {
            return false;
        }
        return true;
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۳۶۸۰m(boolean fromSystem) {
        if (m۱۳۶۷۷a(this.f۱۱۱۲۶r, this.f۱۱۱۲۷s, this.f۱۱۱۲۸t)) {
            if (!this.f۱۱۱۲۹u) {
                this.f۱۱۱۲۹u = true;
                m۱۳۷۱۱j(fromSystem);
            }
        } else if (this.f۱۱۱۲۹u) {
            this.f۱۱۱۲۹u = false;
            m۱۳۷۱۰i(fromSystem);
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۳۷۱۱j(boolean fromSystem) {
        View view;
        View view2;
        Ch hVar = this.f۱۱۱۳۰v;
        if (hVar != null) {
            hVar.m۱۰۸۳۸a();
        }
        this.f۱۱۱۱۲d.setVisibility(0);
        if (this.f۱۱۱۲۴p != 0 || (!this.f۱۱۱۳۱w && !fromSystem)) {
            this.f۱۱۱۱۲d.setAlpha(1.0f);
            this.f۱۱۱۱۲d.setTranslationY(0.0f);
            if (this.f۱۱۱۲۵q && (view = this.f۱۱۱۱۵g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f۱۱۱۳۴z.m۱۳۰۶۶a(null);
        } else {
            this.f۱۱۱۱۲d.setTranslationY(0.0f);
            float startingY = (float) (-this.f۱۱۱۱۲d.getHeight());
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f۱۱۱۱۲d.getLocationInWindow(topLeft);
                startingY -= (float) topLeft[1];
            }
            this.f۱۱۱۱۲d.setTranslationY(startingY);
            Ch anim = new Ch();
            Cy a = Cu.m۱۲۹۷۶a(this.f۱۱۱۱۲d).m۱۳۰۶۰b(0.0f);
            a.m۱۳۰۵۵a(this.f۱۱۱۰۸A);
            anim.m۱۰۸۳۴a(a);
            if (this.f۱۱۱۲۵q && (view2 = this.f۱۱۱۱۵g) != null) {
                view2.setTranslationY(startingY);
                Cy a2 = Cu.m۱۲۹۷۶a(this.f۱۱۱۱۵g);
                a2.m۱۳۰۶۰b(0.0f);
                anim.m۱۰۸۳۴a(a2);
            }
            anim.m۱۰۸۳۷a(f۱۱۱۰۷C);
            anim.m۱۰۸۳۳a(250);
            anim.m۱۰۸۳۶a(this.f۱۱۱۳۴z);
            this.f۱۱۱۳۰v = anim;
            anim.m۱۰۸۴۰c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۱۱۱۱c;
        if (actionBarOverlayLayout != null) {
            Cu.m۱۲۹۷۱C(actionBarOverlayLayout);
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۳۷۱۰i(boolean fromSystem) {
        View view;
        Ch hVar = this.f۱۱۱۳۰v;
        if (hVar != null) {
            hVar.m۱۰۸۳۸a();
        }
        if (this.f۱۱۱۲۴p != 0 || (!this.f۱۱۱۳۱w && !fromSystem)) {
            this.f۱۱۱۳۳y.m۱۳۰۶۶a(null);
            return;
        }
        this.f۱۱۱۱۲d.setAlpha(1.0f);
        this.f۱۱۱۱۲d.setTransitioning(true);
        Ch anim = new Ch();
        float endingY = (float) (-this.f۱۱۱۱۲d.getHeight());
        if (fromSystem) {
            int[] topLeft = {0, 0};
            this.f۱۱۱۱۲d.getLocationInWindow(topLeft);
            endingY -= (float) topLeft[1];
        }
        Cy a = Cu.m۱۲۹۷۶a(this.f۱۱۱۱۲d).m۱۳۰۶۰b(endingY);
        a.m۱۳۰۵۵a(this.f۱۱۱۰۸A);
        anim.m۱۰۸۳۴a(a);
        if (this.f۱۱۱۲۵q && (view = this.f۱۱۱۱۵g) != null) {
            Cy a2 = Cu.m۱۲۹۷۶a(view);
            a2.m۱۳۰۶۰b(endingY);
            anim.m۱۰۸۳۴a(a2);
        }
        anim.m۱۰۸۳۷a(f۱۱۱۰۶B);
        anim.m۱۰۸۳۳a(250);
        anim.m۱۰۸۳۶a(this.f۱۱۱۳۳y);
        this.f۱۱۱۳۰v = anim;
        anim.m۱۰۸۴۰c();
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۳۷۰۹h(boolean toActionMode) {
        Cy fadeIn;
        Cy fadeOut;
        if (toActionMode) {
            m۱۳۶۸۳p();
        } else {
            m۱۳۶۸۱n();
        }
        if (m۱۳۶۸۲o()) {
            if (toActionMode) {
                fadeOut = this.f۱۱۱۱۳e.m۱۵۲۰۶a(4, 100);
                fadeIn = this.f۱۱۱۱۴f.m۱۴۹۶۵a(0, 200);
            } else {
                fadeIn = this.f۱۱۱۱۳e.m۱۵۲۰۶a(0, 200);
                fadeOut = this.f۱۱۱۱۴f.m۱۴۹۶۵a(8, 100);
            }
            Ch set = new Ch();
            set.m۱۰۸۳۵a(fadeOut, fadeIn);
            set.m۱۰۸۴۰c();
        } else if (toActionMode) {
            this.f۱۱۱۱۳e.m۱۵۲۰۷a(4);
            this.f۱۱۱۱۴f.setVisibility(0);
        } else {
            this.f۱۱۱۱۳e.m۱۵۲۰۷a(0);
            this.f۱۱۱۱۴f.setVisibility(8);
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    private boolean m۱۳۶۸۲o() {
        return Cu.m۱۳۰۲۸y(this.f۱۱۱۱۲d);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: h  reason: contains not printable characters */
    public Context m۱۳۷۰۸h() {
        if (this.f۱۱۱۱۰b == null) {
            TypedValue outValue = new TypedValue();
            this.f۱۱۱۰۹a.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f۱۱۱۱۰b = new ContextThemeWrapper(this.f۱۱۱۰۹a, targetThemeRes);
            } else {
                this.f۱۱۱۱۰b = this.f۱۱۱۰۹a;
            }
        }
        return this.f۱۱۱۱۰b;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۹۶b(Drawable indicator) {
        this.f۱۱۱۱۳e.m۱۵۲۱۵b(indicator);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۹۵b(int resId) {
        this.f۱۱۱۱۳e.m۱۵۲۱۸c(resId);
    }

    @Override // android.support.p۰۴۷v7.widget.ActionBarOverlayLayout.AbstractCd
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۹۴b() {
        Ch hVar = this.f۱۱۱۳۰v;
        if (hVar != null) {
            hVar.m۱۰۸۳۸a();
            this.f۱۱۱۳۰v = null;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.ActionBarOverlayLayout.AbstractCd
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۷۰۱d() {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۳۷۰۵f() {
        AbstractCf0 f0Var = this.f۱۱۱۱۳e;
        if (f0Var == null || !f0Var.m۱۵۲۳۱n()) {
            return false;
        }
        this.f۱۱۱۱۳e.collapseActionView();
        return true;
    }

    /* renamed from: android.support.v7.app.n$d  reason: invalid class name */
    public class Cd extends AbstractCb implements Ch.AbstractCa {

        /* renamed from: e  reason: contains not printable characters */
        private final Context f۱۱۱۳۸e;

        /* renamed from: f  reason: contains not printable characters */
        private final android.support.p۰۴۷v7.view.menu.Ch f۱۱۱۳۹f;

        /* renamed from: g  reason: contains not printable characters */
        private AbstractCb.AbstractCa f۱۱۱۴۰g;

        /* renamed from: h  reason: contains not printable characters */
        private WeakReference<View> f۱۱۱۴۱h;

        public Cd(Context context, AbstractCb.AbstractCa callback) {
            this.f۱۱۱۳۸e = context;
            this.f۱۱۱۴۰g = callback;
            android.support.p۰۴۷v7.view.menu.Ch hVar = new android.support.p۰۴۷v7.view.menu.Ch(context);
            hVar.m۱۳۸۶۳c(1);
            this.f۱۱۱۳۹f = hVar;
            this.f۱۱۱۳۹f.m۱۳۸۴۷a(this);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: d  reason: contains not printable characters */
        public MenuInflater m۱۳۷۲۹d() {
            return new Cg(this.f۱۱۱۳۸e);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public Menu m۱۳۷۲۸c() {
            return this.f۱۱۱۳۹f;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۱۸a() {
            Cn nVar = Cn.this;
            if (nVar.f۱۱۱۱۸j == this) {
                if (!Cn.m۱۳۶۷۷a(nVar.f۱۱۱۲۶r, nVar.f۱۱۱۲۷s, false)) {
                    Cn nVar2 = Cn.this;
                    nVar2.f۱۱۱۱۹k = this;
                    nVar2.f۱۱۱۲۰l = this.f۱۱۱۴۰g;
                } else {
                    this.f۱۱۱۴۰g.m۱۰۷۸۹a(this);
                }
                this.f۱۱۱۴۰g = null;
                Cn.this.m۱۳۷۰۹h(false);
                Cn.this.f۱۱۱۱۴f.m۱۴۰۲۱a();
                Cn.this.f۱۱۱۱۳e.m۱۵۲۲۷j().sendAccessibilityEvent(32);
                Cn nVar3 = Cn.this;
                nVar3.f۱۱۱۱۱c.setHideOnContentScrollEnabled(nVar3.f۱۱۱۳۲x);
                Cn.this.f۱۱۱۱۸j = null;
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: i  reason: contains not printable characters */
        public void m۱۳۷۳۲i() {
            if (Cn.this.f۱۱۱۱۸j == this) {
                this.f۱۱۱۳۹f.m۱۳۸۸۷s();
                try {
                    this.f۱۱۱۴۰g.m۱۰۷۹۲b(this, this.f۱۱۱۳۹f);
                } finally {
                    this.f۱۱۱۳۹f.m۱۳۸۸۶r();
                }
            }
        }

        /* renamed from: k  reason: contains not printable characters */
        public boolean m۱۳۷۳۴k() {
            this.f۱۱۱۳۹f.m۱۳۸۸۷s();
            try {
                return this.f۱۱۱۴۰g.m۱۰۷۹۰a(this, this.f۱۱۱۳۹f);
            } finally {
                this.f۱۱۱۳۹f.m۱۳۸۸۶r();
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۲۱a(View view) {
            Cn.this.f۱۱۱۱۴f.setCustomView(view);
            this.f۱۱۱۴۱h = new WeakReference<>(view);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۲۲a(CharSequence subtitle) {
            Cn.this.f۱۱۱۱۴f.setSubtitle(subtitle);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۷۲۷b(CharSequence title) {
            Cn.this.f۱۱۱۱۴f.setTitle(title);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۷۲۶b(int resId) {
            m۱۳۷۲۷b(Cn.this.f۱۱۱۰۹a.getResources().getString(resId));
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۱۹a(int resId) {
            m۱۳۷۲۲a((CharSequence) Cn.this.f۱۱۱۰۹a.getResources().getString(resId));
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: g  reason: contains not printable characters */
        public CharSequence m۱۳۷۳۱g() {
            return Cn.this.f۱۱۱۱۴f.getTitle();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: e  reason: contains not printable characters */
        public CharSequence m۱۳۷۳۰e() {
            return Cn.this.f۱۱۱۱۴f.getSubtitle();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۲۳a(boolean titleOptional) {
            super.m۱۰۷۷۷a(titleOptional);
            Cn.this.f۱۱۱۱۴f.setTitleOptional(titleOptional);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: j  reason: contains not printable characters */
        public boolean m۱۳۷۳۳j() {
            return Cn.this.f۱۱۱۱۴f.m۱۴۰۲۳b();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public View m۱۳۷۲۵b() {
            WeakReference<View> weakReference = this.f۱۱۱۴۱h;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۷۲۴a(android.support.p۰۴۷v7.view.menu.Ch menu, MenuItem item) {
            AbstractCb.AbstractCa aVar = this.f۱۱۱۴۰g;
            if (aVar != null) {
                return aVar.m۱۰۷۹۱a(this, item);
            }
            return false;
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۷۲۰a(android.support.p۰۴۷v7.view.menu.Ch menu) {
            if (this.f۱۱۱۴۰g != null) {
                m۱۳۷۳۲i();
                Cn.this.f۱۱۱۱۴f.m۱۴۰۲۵d();
            }
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۷۰۰c(boolean enable) {
        if (!this.f۱۱۱۱۷i) {
            m۱۳۷۰۲d(enable);
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۶۹۳a(int keyCode, KeyEvent event) {
        Menu menu;
        Cd dVar = this.f۱۱۱۱۸j;
        if (dVar == null || (menu = dVar.m۱۳۷۲۸c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(keyCode, event, 0);
    }
}
