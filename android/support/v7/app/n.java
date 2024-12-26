package android.support.v7.app;

import a.b.h.a.f;
import a.b.h.a.j;
import a.b.h.f.b;
import a.b.h.f.g;
import a.b.h.f.h;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.a0;
import android.support.v4.view.b0;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.app.a;
import android.support.v7.view.menu.h;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.b1;
import android.support.v7.widget.f0;
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

public class n extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final b0 A = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f۱۶۲۶a;

    /* renamed from: b  reason: collision with root package name */
    private Context f۱۶۲۷b;

    /* renamed from: c  reason: collision with root package name */
    ActionBarOverlayLayout f۱۶۲۸c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f۱۶۲۹d;

    /* renamed from: e  reason: collision with root package name */
    f0 f۱۶۳۰e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f۱۶۳۱f;

    /* renamed from: g  reason: collision with root package name */
    View f۱۶۳۲g;

    /* renamed from: h  reason: collision with root package name */
    b1 f۱۶۳۳h;
    private boolean i;
    d j;
    a.b.h.f.b k;
    b.a l;
    private boolean m;
    private ArrayList<a.b> n = new ArrayList<>();
    private boolean o;
    private int p = 0;
    boolean q = true;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u = true;
    h v;
    private boolean w;
    boolean x;
    final z y = new a();
    final z z = new b();

    class a extends a0 {
        a() {
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.q && (view2 = nVar.f۱۶۳۲g) != null) {
                view2.setTranslationY(0.0f);
                n.this.f۱۶۲۹d.setTranslationY(0.0f);
            }
            n.this.f۱۶۲۹d.setVisibility(8);
            n.this.f۱۶۲۹d.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.v = null;
            nVar2.l();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f۱۶۲۸c;
            if (actionBarOverlayLayout != null) {
                u.C(actionBarOverlayLayout);
            }
        }
    }

    class b extends a0 {
        b() {
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            n nVar = n.this;
            nVar.v = null;
            nVar.f۱۶۲۹d.requestLayout();
        }
    }

    class c implements b0 {
        c() {
        }

        @Override // android.support.v4.view.b0
        public void a(View view) {
            ((View) n.this.f۱۶۲۹d.getParent()).invalidate();
        }
    }

    public n(Activity activity, boolean overlayMode) {
        new ArrayList();
        View decor = activity.getWindow().getDecorView();
        b(decor);
        if (!overlayMode) {
            this.f۱۶۳۲g = decor.findViewById(16908290);
        }
    }

    public n(Dialog dialog) {
        new ArrayList();
        b(dialog.getWindow().getDecorView());
    }

    private void b(View decor) {
        this.f۱۶۲۸c = (ActionBarOverlayLayout) decor.findViewById(f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۶۲۸c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f۱۶۳۰e = a(decor.findViewById(f.action_bar));
        this.f۱۶۳۱f = (ActionBarContextView) decor.findViewById(f.action_context_bar);
        this.f۱۶۲۹d = (ActionBarContainer) decor.findViewById(f.action_bar_container);
        f0 f0Var = this.f۱۶۳۰e;
        if (f0Var == null || this.f۱۶۳۱f == null || this.f۱۶۲۹d == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f۱۶۲۶a = f0Var.k();
        boolean homeAsUp = (this.f۱۶۳۰e.h() & 4) != 0;
        if (homeAsUp) {
            this.i = true;
        }
        a.b.h.f.a abp = a.b.h.f.a.a(this.f۱۶۲۶a);
        f(abp.a() || homeAsUp);
        l(abp.f());
        TypedArray a2 = this.f۱۶۲۶a.obtainStyledAttributes(null, j.ActionBar, a.b.h.a.a.actionBarStyle, 0);
        if (a2.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            k(true);
        }
        int elevation = a2.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (elevation != 0) {
            a((float) elevation);
        }
        a2.recycle();
    }

    private f0 a(View view) {
        if (view instanceof f0) {
            return (f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.support.v7.app.a
    public void a(float elevation) {
        u.a(this.f۱۶۲۹d, elevation);
    }

    @Override // android.support.v7.app.a
    public void a(Configuration newConfig) {
        l(a.b.h.f.a.a(this.f۱۶۲۶a).f());
    }

    private void l(boolean hasEmbeddedTabs) {
        this.o = hasEmbeddedTabs;
        if (!this.o) {
            this.f۱۶۳۰e.a((b1) null);
            this.f۱۶۲۹d.setTabContainer(this.f۱۶۳۳h);
        } else {
            this.f۱۶۲۹d.setTabContainer(null);
            this.f۱۶۳۰e.a(this.f۱۶۳۳h);
        }
        boolean z2 = true;
        boolean isInTabMode = m() == 2;
        b1 b1Var = this.f۱۶۳۳h;
        if (b1Var != null) {
            if (isInTabMode) {
                b1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۶۲۸c;
                if (actionBarOverlayLayout != null) {
                    u.C(actionBarOverlayLayout);
                }
            } else {
                b1Var.setVisibility(8);
            }
        }
        this.f۱۶۳۰e.b(!this.o && isInTabMode);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f۱۶۲۸c;
        if (this.o || !isInTabMode) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.k);
            this.k = null;
            this.l = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(int visibility) {
        this.p = visibility;
    }

    @Override // android.support.v7.app.a
    public void g(boolean enabled) {
        h hVar;
        this.w = enabled;
        if (!enabled && (hVar = this.v) != null) {
            hVar.a();
        }
    }

    @Override // android.support.v7.app.a
    public void b(boolean isVisible) {
        if (isVisible != this.m) {
            this.m = isVisible;
            int count = this.n.size();
            for (int i2 = 0; i2 < count; i2++) {
                this.n.get(i2).a(isVisible);
            }
        }
    }

    @Override // android.support.v7.app.a
    public void d(boolean showHomeAsUp) {
        a(showHomeAsUp ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.a
    public void e(boolean showTitle) {
        a(showTitle ? 8 : 0, 8);
    }

    @Override // android.support.v7.app.a
    public void f(boolean enable) {
        this.f۱۶۳۰e.a(enable);
    }

    @Override // android.support.v7.app.a
    public void a(CharSequence title) {
        this.f۱۶۳۰e.setTitle(title);
    }

    @Override // android.support.v7.app.a
    public void b(CharSequence title) {
        this.f۱۶۳۰e.setWindowTitle(title);
    }

    public void a(int options, int mask) {
        int current = this.f۱۶۳۰e.h();
        if ((mask & 4) != 0) {
            this.i = true;
        }
        this.f۱۶۳۰e.d((options & mask) | ((mask ^ -1) & current));
    }

    @Override // android.support.v7.app.a
    public void a(Drawable d2) {
        this.f۱۶۲۹d.setPrimaryBackground(d2);
    }

    public int m() {
        return this.f۱۶۳۰e.l();
    }

    @Override // android.support.v7.app.a
    public int g() {
        return this.f۱۶۳۰e.h();
    }

    @Override // android.support.v7.app.a
    public a.b.h.f.b a(b.a callback) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.f۱۶۲۸c.setHideOnContentScrollEnabled(false);
        this.f۱۶۳۱f.c();
        d mode = new d(this.f۱۶۳۱f.getContext(), callback);
        if (!mode.k()) {
            return null;
        }
        this.j = mode;
        mode.i();
        this.f۱۶۳۱f.a(mode);
        h(true);
        this.f۱۶۳۱f.sendAccessibilityEvent(32);
        return mode;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(boolean enabled) {
        this.q = enabled;
    }

    private void p() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۶۲۸c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.s) {
            this.s = false;
            m(true);
        }
    }

    private void n() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۶۲۸c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void c() {
        if (!this.s) {
            this.s = true;
            m(true);
        }
    }

    public void k(boolean hideOnContentScroll) {
        if (!hideOnContentScroll || this.f۱۶۲۸c.i()) {
            this.x = hideOnContentScroll;
            this.f۱۶۲۸c.setHideOnContentScrollEnabled(hideOnContentScroll);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    static boolean a(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (hiddenByApp || hiddenBySystem) {
            return false;
        }
        return true;
    }

    private void m(boolean fromSystem) {
        if (a(this.r, this.s, this.t)) {
            if (!this.u) {
                this.u = true;
                j(fromSystem);
            }
        } else if (this.u) {
            this.u = false;
            i(fromSystem);
        }
    }

    public void j(boolean fromSystem) {
        View view;
        View view2;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f۱۶۲۹d.setVisibility(0);
        if (this.p != 0 || (!this.w && !fromSystem)) {
            this.f۱۶۲۹d.setAlpha(1.0f);
            this.f۱۶۲۹d.setTranslationY(0.0f);
            if (this.q && (view = this.f۱۶۳۲g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        } else {
            this.f۱۶۲۹d.setTranslationY(0.0f);
            float startingY = (float) (-this.f۱۶۲۹d.getHeight());
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f۱۶۲۹d.getLocationInWindow(topLeft);
                startingY -= (float) topLeft[1];
            }
            this.f۱۶۲۹d.setTranslationY(startingY);
            h anim = new h();
            y a2 = u.a(this.f۱۶۲۹d).b(0.0f);
            a2.a(this.A);
            anim.a(a2);
            if (this.q && (view2 = this.f۱۶۳۲g) != null) {
                view2.setTranslationY(startingY);
                y a3 = u.a(this.f۱۶۳۲g);
                a3.b(0.0f);
                anim.a(a3);
            }
            anim.a(C);
            anim.a(250);
            anim.a(this.z);
            this.v = anim;
            anim.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f۱۶۲۸c;
        if (actionBarOverlayLayout != null) {
            u.C(actionBarOverlayLayout);
        }
    }

    public void i(boolean fromSystem) {
        View view;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !fromSystem)) {
            this.y.a(null);
            return;
        }
        this.f۱۶۲۹d.setAlpha(1.0f);
        this.f۱۶۲۹d.setTransitioning(true);
        h anim = new h();
        float endingY = (float) (-this.f۱۶۲۹d.getHeight());
        if (fromSystem) {
            int[] topLeft = {0, 0};
            this.f۱۶۲۹d.getLocationInWindow(topLeft);
            endingY -= (float) topLeft[1];
        }
        y a2 = u.a(this.f۱۶۲۹d).b(endingY);
        a2.a(this.A);
        anim.a(a2);
        if (this.q && (view = this.f۱۶۳۲g) != null) {
            y a3 = u.a(view);
            a3.b(endingY);
            anim.a(a3);
        }
        anim.a(B);
        anim.a(250);
        anim.a(this.y);
        this.v = anim;
        anim.c();
    }

    public void h(boolean toActionMode) {
        y fadeIn;
        y fadeOut;
        if (toActionMode) {
            p();
        } else {
            n();
        }
        if (o()) {
            if (toActionMode) {
                fadeOut = this.f۱۶۳۰e.a(4, 100);
                fadeIn = this.f۱۶۳۱f.a(0, 200);
            } else {
                fadeIn = this.f۱۶۳۰e.a(0, 200);
                fadeOut = this.f۱۶۳۱f.a(8, 100);
            }
            h set = new h();
            set.a(fadeOut, fadeIn);
            set.c();
        } else if (toActionMode) {
            this.f۱۶۳۰e.a(4);
            this.f۱۶۳۱f.setVisibility(0);
        } else {
            this.f۱۶۳۰e.a(0);
            this.f۱۶۳۱f.setVisibility(8);
        }
    }

    private boolean o() {
        return u.y(this.f۱۶۲۹d);
    }

    @Override // android.support.v7.app.a
    public Context h() {
        if (this.f۱۶۲۷b == null) {
            TypedValue outValue = new TypedValue();
            this.f۱۶۲۶a.getTheme().resolveAttribute(a.b.h.a.a.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f۱۶۲۷b = new ContextThemeWrapper(this.f۱۶۲۶a, targetThemeRes);
            } else {
                this.f۱۶۲۷b = this.f۱۶۲۶a;
            }
        }
        return this.f۱۶۲۷b;
    }

    @Override // android.support.v7.app.a
    public void b(Drawable indicator) {
        this.f۱۶۳۰e.b(indicator);
    }

    @Override // android.support.v7.app.a
    public void b(int resId) {
        this.f۱۶۳۰e.c(resId);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void b() {
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // android.support.v7.app.a
    public boolean f() {
        f0 f0Var = this.f۱۶۳۰e;
        if (f0Var == null || !f0Var.n()) {
            return false;
        }
        this.f۱۶۳۰e.collapseActionView();
        return true;
    }

    public class d extends a.b.h.f.b implements h.a {

        /* renamed from: e  reason: collision with root package name */
        private final Context f۱۶۳۷e;

        /* renamed from: f  reason: collision with root package name */
        private final android.support.v7.view.menu.h f۱۶۳۸f;

        /* renamed from: g  reason: collision with root package name */
        private b.a f۱۶۳۹g;

        /* renamed from: h  reason: collision with root package name */
        private WeakReference<View> f۱۶۴۰h;

        public d(Context context, b.a callback) {
            this.f۱۶۳۷e = context;
            this.f۱۶۳۹g = callback;
            android.support.v7.view.menu.h hVar = new android.support.v7.view.menu.h(context);
            hVar.c(1);
            this.f۱۶۳۸f = hVar;
            this.f۱۶۳۸f.a(this);
        }

        @Override // a.b.h.f.b
        public MenuInflater d() {
            return new g(this.f۱۶۳۷e);
        }

        @Override // a.b.h.f.b
        public Menu c() {
            return this.f۱۶۳۸f;
        }

        @Override // a.b.h.f.b
        public void a() {
            n nVar = n.this;
            if (nVar.j == this) {
                if (!n.a(nVar.r, nVar.s, false)) {
                    n nVar2 = n.this;
                    nVar2.k = this;
                    nVar2.l = this.f۱۶۳۹g;
                } else {
                    this.f۱۶۳۹g.a(this);
                }
                this.f۱۶۳۹g = null;
                n.this.h(false);
                n.this.f۱۶۳۱f.a();
                n.this.f۱۶۳۰e.j().sendAccessibilityEvent(32);
                n nVar3 = n.this;
                nVar3.f۱۶۲۸c.setHideOnContentScrollEnabled(nVar3.x);
                n.this.j = null;
            }
        }

        @Override // a.b.h.f.b
        public void i() {
            if (n.this.j == this) {
                this.f۱۶۳۸f.s();
                try {
                    this.f۱۶۳۹g.b(this, this.f۱۶۳۸f);
                } finally {
                    this.f۱۶۳۸f.r();
                }
            }
        }

        public boolean k() {
            this.f۱۶۳۸f.s();
            try {
                return this.f۱۶۳۹g.a(this, this.f۱۶۳۸f);
            } finally {
                this.f۱۶۳۸f.r();
            }
        }

        @Override // a.b.h.f.b
        public void a(View view) {
            n.this.f۱۶۳۱f.setCustomView(view);
            this.f۱۶۴۰h = new WeakReference<>(view);
        }

        @Override // a.b.h.f.b
        public void a(CharSequence subtitle) {
            n.this.f۱۶۳۱f.setSubtitle(subtitle);
        }

        @Override // a.b.h.f.b
        public void b(CharSequence title) {
            n.this.f۱۶۳۱f.setTitle(title);
        }

        @Override // a.b.h.f.b
        public void b(int resId) {
            b(n.this.f۱۶۲۶a.getResources().getString(resId));
        }

        @Override // a.b.h.f.b
        public void a(int resId) {
            a((CharSequence) n.this.f۱۶۲۶a.getResources().getString(resId));
        }

        @Override // a.b.h.f.b
        public CharSequence g() {
            return n.this.f۱۶۳۱f.getTitle();
        }

        @Override // a.b.h.f.b
        public CharSequence e() {
            return n.this.f۱۶۳۱f.getSubtitle();
        }

        @Override // a.b.h.f.b
        public void a(boolean titleOptional) {
            super.a(titleOptional);
            n.this.f۱۶۳۱f.setTitleOptional(titleOptional);
        }

        @Override // a.b.h.f.b
        public boolean j() {
            return n.this.f۱۶۳۱f.b();
        }

        @Override // a.b.h.f.b
        public View b() {
            WeakReference<View> weakReference = this.f۱۶۴۰h;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(android.support.v7.view.menu.h menu, MenuItem item) {
            b.a aVar = this.f۱۶۳۹g;
            if (aVar != null) {
                return aVar.a(this, item);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(android.support.v7.view.menu.h menu) {
            if (this.f۱۶۳۹g != null) {
                i();
                n.this.f۱۶۳۱f.d();
            }
        }
    }

    @Override // android.support.v7.app.a
    public void c(boolean enable) {
        if (!this.i) {
            d(enable);
        }
    }

    @Override // android.support.v7.app.a
    public boolean a(int keyCode, KeyEvent event) {
        Menu menu;
        d dVar = this.j;
        if (dVar == null || (menu = dVar.c()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        menu.setQwertyMode(z2);
        return menu.performShortcut(keyCode, event, 0);
    }
}
