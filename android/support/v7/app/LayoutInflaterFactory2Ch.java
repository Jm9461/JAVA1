package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Cv;
import android.support.v4.view.Ca0;
import android.support.v4.view.Cc0;
import android.support.v4.view.Ce;
import android.support.v4.view.Cu;
import android.support.v4.view.Cy;
import android.support.v4.view.InterfaceCp;
import android.support.v4.view.InterfaceCz;
import android.support.v4.widget.Cn;
import android.support.v7.app.Cb;
import android.support.v7.view.menu.Ch;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.view.menu.InterfaceCq;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.Cj;
import android.support.v7.widget.Cj1;
import android.support.v7.widget.Co1;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Cr1;
import android.support.v7.widget.InterfaceCe0;
import android.support.v7.widget.InterfaceCk0;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cc;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cf;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ci;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Cd;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Ce;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Cf;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Cg;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi;

/* renamed from: android.support.v7.app.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class LayoutInflaterFactory2Ch extends AbstractCg implements Ch.a, LayoutInflater.Factory2 {

    /* renamed from: U, reason: contains not printable characters */
    private static final boolean f۱۰۹۸۰U;

    /* renamed from: V, reason: contains not printable characters */
    private static final int[] f۱۰۹۸۱V;

    /* renamed from: W, reason: contains not printable characters */
    private static boolean f۱۰۹۸۲W;

    /* renamed from: A, reason: contains not printable characters */
    boolean f۱۰۹۸۳A;

    /* renamed from: B, reason: contains not printable characters */
    boolean f۱۰۹۸۴B;

    /* renamed from: C, reason: contains not printable characters */
    boolean f۱۰۹۸۵C;

    /* renamed from: D, reason: contains not printable characters */
    boolean f۱۰۹۸۶D;

    /* renamed from: E, reason: contains not printable characters */
    boolean f۱۰۹۸۷E;

    /* renamed from: F, reason: contains not printable characters */
    private boolean f۱۰۹۸۸F;

    /* renamed from: G, reason: contains not printable characters */
    private n[] f۱۰۹۸۹G;

    /* renamed from: H, reason: contains not printable characters */
    private n f۱۰۹۹۰H;

    /* renamed from: I, reason: contains not printable characters */
    private boolean f۱۰۹۹۱I;

    /* renamed from: J, reason: contains not printable characters */
    boolean f۱۰۹۹۲J;

    /* renamed from: L, reason: contains not printable characters */
    private boolean f۱۰۹۹۴L;

    /* renamed from: M, reason: contains not printable characters */
    private l f۱۰۹۹۵M;

    /* renamed from: N, reason: contains not printable characters */
    boolean f۱۰۹۹۶N;

    /* renamed from: O, reason: contains not printable characters */
    int f۱۰۹۹۷O;

    /* renamed from: Q, reason: contains not printable characters */
    private boolean f۱۰۹۹۹Q;

    /* renamed from: R, reason: contains not printable characters */
    private Rect f۱۱۰۰۰R;

    /* renamed from: S, reason: contains not printable characters */
    private Rect f۱۱۰۰۱S;

    /* renamed from: T, reason: contains not printable characters */
    private AppCompatViewInflater f۱۱۰۰۲T;

    /* renamed from: d, reason: contains not printable characters */
    final Context f۱۱۰۰۳d;

    /* renamed from: e, reason: contains not printable characters */
    final Window f۱۱۰۰۴e;

    /* renamed from: f, reason: contains not printable characters */
    final Window.Callback f۱۱۰۰۵f;

    /* renamed from: g, reason: contains not printable characters */
    final Window.Callback f۱۱۰۰۶g;

    /* renamed from: h, reason: contains not printable characters */
    final InterfaceCf f۱۱۰۰۷h;

    /* renamed from: i, reason: contains not printable characters */
    AbstractCa f۱۱۰۰۸i;

    /* renamed from: j, reason: contains not printable characters */
    MenuInflater f۱۱۰۰۹j;

    /* renamed from: k, reason: contains not printable characters */
    private CharSequence f۱۱۰۱۰k;

    /* renamed from: l, reason: contains not printable characters */
    private InterfaceCe0 f۱۱۰۱۱l;

    /* renamed from: m, reason: contains not printable characters */
    private i f۱۱۰۱۲m;

    /* renamed from: n, reason: contains not printable characters */
    private o f۱۱۰۱۳n;

    /* renamed from: o, reason: contains not printable characters */
    AbstractCb f۱۱۰۱۴o;

    /* renamed from: p, reason: contains not printable characters */
    ActionBarContextView f۱۱۰۱۵p;

    /* renamed from: q, reason: contains not printable characters */
    PopupWindow f۱۱۰۱۶q;

    /* renamed from: r, reason: contains not printable characters */
    Runnable f۱۱۰۱۷r;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۱۱۰۲۰u;

    /* renamed from: v, reason: contains not printable characters */
    private ViewGroup f۱۱۰۲۱v;

    /* renamed from: w, reason: contains not printable characters */
    private TextView f۱۱۰۲۲w;

    /* renamed from: x, reason: contains not printable characters */
    private View f۱۱۰۲۳x;

    /* renamed from: y, reason: contains not printable characters */
    private boolean f۱۱۰۲۴y;

    /* renamed from: z, reason: contains not printable characters */
    private boolean f۱۱۰۲۵z;

    /* renamed from: s, reason: contains not printable characters */
    Cy f۱۱۰۱۸s = null;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۱۰۱۹t = true;

    /* renamed from: K, reason: contains not printable characters */
    private int f۱۰۹۹۳K = -100;

    /* renamed from: P, reason: contains not printable characters */
    private final Runnable f۱۰۹۹۸P = new b();

    static {
        f۱۰۹۸۰U = Build.VERSION.SDK_INT < 21;
        f۱۰۹۸۱V = new int[]{R.attr.windowBackground};
        if (f۱۰۹۸۰U && !f۱۰۹۸۲W) {
            Thread.UncaughtExceptionHandler defHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new a(defHandler));
            f۱۰۹۸۲W = true;
        }
    }

    /* renamed from: android.support.v7.app.h$a */
    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Thread.UncaughtExceptionHandler f۱۱۰۲۶a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f۱۱۰۲۶a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable thowable) {
            if (m۱۱۵۲۳a(thowable)) {
                Throwable wrapped = new Resources.NotFoundException(thowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                wrapped.initCause(thowable.getCause());
                wrapped.setStackTrace(thowable.getStackTrace());
                this.f۱۱۰۲۶a.uncaughtException(thread, wrapped);
                return;
            }
            this.f۱۱۰۲۶a.uncaughtException(thread, thowable);
        }

        /* renamed from: a, reason: contains not printable characters */
        private boolean m۱۱۵۲۳a(Throwable throwable) {
            String message;
            if (!(throwable instanceof Resources.NotFoundException) || (message = throwable.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }
    }

    /* renamed from: android.support.v7.app.h$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch = LayoutInflaterFactory2Ch.this;
            if ((layoutInflaterFactory2Ch.f۱۰۹۹۷O & 1) != 0) {
                layoutInflaterFactory2Ch.m۱۱۵۰۴e(0);
            }
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch2 = LayoutInflaterFactory2Ch.this;
            if ((layoutInflaterFactory2Ch2.f۱۰۹۹۷O & 4096) != 0) {
                layoutInflaterFactory2Ch2.m۱۱۵۰۴e(108);
            }
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch3 = LayoutInflaterFactory2Ch.this;
            layoutInflaterFactory2Ch3.f۱۰۹۹۶N = false;
            layoutInflaterFactory2Ch3.f۱۰۹۹۷O = 0;
        }
    }

    LayoutInflaterFactory2Ch(Context context, Window window, InterfaceCf callback) {
        this.f۱۱۰۰۳d = context;
        this.f۱۱۰۰۴e = window;
        this.f۱۱۰۰۷h = callback;
        this.f۱۱۰۰۵f = this.f۱۱۰۰۴e.getCallback();
        Window.Callback callback2 = this.f۱۱۰۰۵f;
        if (callback2 instanceof k) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f۱۱۰۰۶g = new k(callback2);
        this.f۱۱۰۰۴e.setCallback(this.f۱۱۰۰۶g);
        Cj1 a2 = Cj1.m۱۳۲۷۴a(context, (AttributeSet) null, f۱۰۹۸۱V);
        Drawable winBg = a2.m۱۳۲۸۶c(0);
        if (winBg != null) {
            this.f۱۱۰۰۴e.setBackgroundDrawable(winBg);
        }
        a2.m۱۳۲۸۰a();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۴۷۸a(Bundle savedInstanceState) {
        Window.Callback callback = this.f۱۱۰۰۵f;
        if (callback instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = Cv.m۱۰۴۹۲b((Activity) callback);
            } catch (IllegalArgumentException e2) {
            }
            if (parentActivityName != null) {
                AbstractCa ab = m۱۱۵۲۱s();
                if (ab == null) {
                    this.f۱۰۹۹۹Q = true;
                } else {
                    ab.mo۱۱۶۳۰c(true);
                }
            }
        }
        if (savedInstanceState != null && this.f۱۰۹۹۳K == -100) {
            this.f۱۰۹۹۳K = savedInstanceState.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۴۹۲b(Bundle savedInstanceState) {
        m۱۱۴۶۸x();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: d, reason: contains not printable characters */
    public AbstractCa mo۱۱۵۰۱d() {
        m۱۱۴۷۰z();
        return this.f۱۱۰۰۸i;
    }

    /* renamed from: s, reason: contains not printable characters */
    final AbstractCa m۱۱۵۲۱s() {
        return this.f۱۱۰۰۸i;
    }

    /* renamed from: p, reason: contains not printable characters */
    final Window.Callback m۱۱۵۱۸p() {
        return this.f۱۱۰۰۴e.getCallback();
    }

    /* renamed from: z, reason: contains not printable characters */
    private void m۱۱۴۷۰z() {
        m۱۱۴۶۸x();
        if (!this.f۱۰۹۸۳A || this.f۱۱۰۰۸i != null) {
            return;
        }
        Window.Callback callback = this.f۱۱۰۰۵f;
        if (callback instanceof Activity) {
            this.f۱۱۰۰۸i = new Cn((Activity) callback, this.f۱۰۹۸۴B);
        } else if (callback instanceof Dialog) {
            this.f۱۱۰۰۸i = new Cn((Dialog) callback);
        }
        AbstractCa abstractCa = this.f۱۱۰۰۸i;
        if (abstractCa != null) {
            abstractCa.mo۱۱۶۳۰c(this.f۱۰۹۹۹Q);
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۴۸۱a(Toolbar toolbar) {
        if (!(this.f۱۱۰۰۵f instanceof Activity)) {
            return;
        }
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab instanceof Cn) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.f۱۱۰۰۹j = null;
        if (ab != null) {
            ab.mo۱۱۵۹۰j();
        }
        if (toolbar != null) {
            Ck tbab = new Ck(toolbar, ((Activity) this.f۱۱۰۰۵f).getTitle(), this.f۱۱۰۰۶g);
            this.f۱۱۰۰۸i = tbab;
            this.f۱۱۰۰۴e.setCallback(tbab.m۱۱۵۹۲l());
        } else {
            this.f۱۱۰۰۸i = null;
            this.f۱۱۰۰۴e.setCallback(this.f۱۱۰۰۶g);
        }
        mo۱۱۵۰۶f();
    }

    /* renamed from: n, reason: contains not printable characters */
    final Context m۱۱۵۱۶n() {
        Context context = null;
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab != null) {
            context = ab.mo۱۱۶۳۸h();
        }
        if (context == null) {
            Context context2 = this.f۱۱۰۰۳d;
            return context2;
        }
        return context;
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: c, reason: contains not printable characters */
    public MenuInflater mo۱۱۴۹۷c() {
        if (this.f۱۱۰۰۹j == null) {
            m۱۱۴۷۰z();
            AbstractCa abstractCa = this.f۱۱۰۰۸i;
            this.f۱۱۰۰۹j = new Cg(abstractCa != null ? abstractCa.mo۱۱۶۳۸h() : this.f۱۱۰۰۳d);
        }
        return this.f۱۱۰۰۹j;
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public <T extends View> T mo۱۱۴۷۴a(int i2) {
        m۱۱۴۶۸x();
        return (T) this.f۱۱۰۰۴e.findViewById(i2);
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۴۷۷a(Configuration newConfig) {
        AbstractCa ab;
        if (this.f۱۰۹۸۳A && this.f۱۱۰۲۰u && (ab = mo۱۱۵۰۱d()) != null) {
            ab.mo۱۱۶۱۹a(newConfig);
        }
        Cj.m۱۳۲۱۷a().m۱۳۲۳۹a(this.f۱۱۰۰۳d);
        mo۱۱۴۸۶a();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: i, reason: contains not printable characters */
    public void mo۱۱۵۱۲i() {
        mo۱۱۴۸۶a();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: j, reason: contains not printable characters */
    public void mo۱۱۵۱۳j() {
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab != null) {
            ab.mo۱۱۶۳۷g(false);
        }
        l lVar = this.f۱۰۹۹۵M;
        if (lVar != null) {
            lVar.m۱۱۵۴۴a();
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: h, reason: contains not printable characters */
    public void mo۱۱۵۰۹h() {
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab != null) {
            ab.mo۱۱۶۳۷g(true);
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۴۸۲a(View v) {
        m۱۱۴۶۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(R.id.content);
        contentParent.removeAllViews();
        contentParent.addView(v);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۴۹۸c(int resId) {
        m۱۱۴۶۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(R.id.content);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f۱۱۰۰۳d).inflate(resId, contentParent);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۴۹۴b(View v, ViewGroup.LayoutParams lp) {
        m۱۱۴۶۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(R.id.content);
        contentParent.removeAllViews();
        contentParent.addView(v, lp);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۴۸۳a(View v, ViewGroup.LayoutParams lp) {
        m۱۱۴۶۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(R.id.content);
        contentParent.addView(v, lp);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۴۹۹c(Bundle outState) {
        int i2 = this.f۱۰۹۹۳K;
        if (i2 != -100) {
            outState.putInt("appcompat:local_night_mode", i2);
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: g, reason: contains not printable characters */
    public void mo۱۱۵۰۷g() {
        if (this.f۱۰۹۹۶N) {
            this.f۱۱۰۰۴e.getDecorView().removeCallbacks(this.f۱۰۹۹۸P);
        }
        this.f۱۰۹۹۲J = true;
        AbstractCa abstractCa = this.f۱۱۰۰۸i;
        if (abstractCa != null) {
            abstractCa.mo۱۱۵۹۰j();
        }
        l lVar = this.f۱۰۹۹۵M;
        if (lVar != null) {
            lVar.m۱۱۵۴۴a();
        }
    }

    /* renamed from: x, reason: contains not printable characters */
    private void m۱۱۴۶۸x() {
        if (!this.f۱۱۰۲۰u) {
            this.f۱۱۰۲۱v = m۱۱۴۶۶v();
            CharSequence title = m۱۱۵۱۷o();
            if (!TextUtils.isEmpty(title)) {
                InterfaceCe0 interfaceCe0 = this.f۱۱۰۱۱l;
                if (interfaceCe0 != null) {
                    interfaceCe0.setWindowTitle(title);
                } else if (m۱۱۵۲۱s() != null) {
                    m۱۱۵۲۱s().mo۱۱۶۲۷b(title);
                } else {
                    TextView textView = this.f۱۱۰۲۲w;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            m۱۱۴۶۵u();
            m۱۱۴۸۴a(this.f۱۱۰۲۱v);
            this.f۱۱۰۲۰u = true;
            n st = m۱۱۴۷۲a(0, false);
            if (this.f۱۰۹۹۲J) {
                return;
            }
            if (st == null || st.f۱۱۰۵۶j == null) {
                m۱۱۴۶۲j(108);
            }
        }
    }

    /* renamed from: v, reason: contains not printable characters */
    private ViewGroup m۱۱۴۶۶v() {
        Context themedContext;
        TypedArray a2 = this.f۱۱۰۰۳d.obtainStyledAttributes(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme);
        if (!a2.hasValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowActionBar)) {
            a2.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (a2.getBoolean(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowNoTitle, false)) {
            mo۱۱۴۹۵b(1);
        } else if (a2.getBoolean(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowActionBar, false)) {
            mo۱۱۴۹۵b(108);
        }
        if (a2.getBoolean(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowActionBarOverlay, false)) {
            mo۱۱۴۹۵b(109);
        }
        if (a2.getBoolean(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowActionModeOverlay, false)) {
            mo۱۱۴۹۵b(10);
        }
        this.f۱۰۹۸۶D = a2.getBoolean(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_android_windowIsFloating, false);
        a2.recycle();
        this.f۱۱۰۰۴e.getDecorView();
        LayoutInflater inflater = LayoutInflater.from(this.f۱۱۰۰۳d);
        ViewGroup subDecor = null;
        if (!this.f۱۰۹۸۷E) {
            if (this.f۱۰۹۸۶D) {
                subDecor = (ViewGroup) inflater.inflate(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg.abc_dialog_title_material, (ViewGroup) null);
                this.f۱۰۹۸۴B = false;
                this.f۱۰۹۸۳A = false;
            } else if (this.f۱۰۹۸۳A) {
                TypedValue outValue = new TypedValue();
                this.f۱۱۰۰۳d.getTheme().resolveAttribute(Ca.actionBarTheme, outValue, true);
                int i2 = outValue.resourceId;
                if (i2 != 0) {
                    themedContext = new Cd(this.f۱۱۰۰۳d, i2);
                } else {
                    themedContext = this.f۱۱۰۰۳d;
                }
                subDecor = (ViewGroup) LayoutInflater.from(themedContext).inflate(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg.abc_screen_toolbar, (ViewGroup) null);
                this.f۱۱۰۱۱l = (InterfaceCe0) subDecor.findViewById(Cf.decor_content_parent);
                this.f۱۱۰۱۱l.setWindowCallback(m۱۱۵۱۸p());
                if (this.f۱۰۹۸۴B) {
                    this.f۱۱۰۱۱l.mo۱۳۱۱۱a(109);
                }
                if (this.f۱۱۰۲۴y) {
                    this.f۱۱۰۱۱l.mo۱۳۱۱۱a(2);
                }
                if (this.f۱۱۰۲۵z) {
                    this.f۱۱۰۱۱l.mo۱۳۱۱۱a(5);
                }
            }
        } else {
            if (this.f۱۰۹۸۵C) {
                subDecor = (ViewGroup) inflater.inflate(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                subDecor = (ViewGroup) inflater.inflate(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Cu.m۱۰۹۱۷a(subDecor, new c());
            } else {
                ((InterfaceCk0) subDecor).setOnFitSystemWindowsListener(new d());
            }
        }
        if (subDecor == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f۱۰۹۸۳A + ", windowActionBarOverlay: " + this.f۱۰۹۸۴B + ", android:windowIsFloating: " + this.f۱۰۹۸۶D + ", windowActionModeOverlay: " + this.f۱۰۹۸۵C + ", windowNoTitle: " + this.f۱۰۹۸۷E + " }");
        }
        if (this.f۱۱۰۱۱l == null) {
            this.f۱۱۰۲۲w = (TextView) subDecor.findViewById(Cf.title);
        }
        Cr1.m۱۳۴۹۸b(subDecor);
        ContentFrameLayout contentView = (ContentFrameLayout) subDecor.findViewById(Cf.action_bar_activity_content);
        ViewGroup windowContentView = (ViewGroup) this.f۱۱۰۰۴e.findViewById(R.id.content);
        if (windowContentView != null) {
            while (windowContentView.getChildCount() > 0) {
                View child = windowContentView.getChildAt(0);
                windowContentView.removeViewAt(0);
                contentView.addView(child);
            }
            windowContentView.setId(-1);
            contentView.setId(R.id.content);
            if (windowContentView instanceof FrameLayout) {
                ((FrameLayout) windowContentView).setForeground(null);
            }
        }
        this.f۱۱۰۰۴e.setContentView(subDecor);
        contentView.setAttachListener(new e());
        return subDecor;
    }

    /* renamed from: android.support.v7.app.h$c */
    class c implements InterfaceCp {
        c() {
        }

        @Override // android.support.v4.view.InterfaceCp
        /* renamed from: a, reason: contains not printable characters */
        public Cc0 mo۱۱۵۲۴a(View v, Cc0 insets) {
            int top = insets.m۱۰۷۵۲e();
            int newTop = LayoutInflaterFactory2Ch.this.m۱۱۵۱۱i(top);
            if (top != newTop) {
                insets = insets.m۱۰۷۴۸a(insets.m۱۰۷۵۰c(), newTop, insets.m۱۰۷۵۱d(), insets.m۱۰۷۴۹b());
            }
            return Cu.m۱۰۹۲۶b(v, insets);
        }
    }

    /* renamed from: android.support.v7.app.h$d */
    class d implements InterfaceCk0.a {
        d() {
        }

        @Override // android.support.v7.widget.InterfaceCk0.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۲۹۵a(Rect insets) {
            insets.top = LayoutInflaterFactory2Ch.this.m۱۱۵۱۱i(insets.top);
        }
    }

    /* renamed from: android.support.v7.app.h$e */
    class e implements ContentFrameLayout.InterfaceCa {
        e() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.InterfaceCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۲۰۲۱a() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.InterfaceCa
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2Ch.this.m۱۱۵۱۴l();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۴۸۴a(ViewGroup subDecor) {
    }

    /* renamed from: u, reason: contains not printable characters */
    private void m۱۱۴۶۵u() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.f۱۱۰۲۱v.findViewById(R.id.content);
        View windowDecor = this.f۱۱۰۰۴e.getDecorView();
        cfl.m۱۲۰۱۹a(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a2 = this.f۱۱۰۰۳d.obtainStyledAttributes(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme);
        a2.getValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a2.getValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a2.hasValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedWidthMajor)) {
            a2.getValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a2.hasValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedWidthMinor)) {
            a2.getValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a2.hasValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedHeightMajor)) {
            a2.getValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a2.hasValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedHeightMinor)) {
            a2.getValue(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a2.recycle();
        cfl.requestLayout();
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۱۴۹۵b(int featureId) {
        int featureId2 = m۱۱۴۶۳k(featureId);
        if (this.f۱۰۹۸۷E && featureId2 == 108) {
            return false;
        }
        if (this.f۱۰۹۸۳A && featureId2 == 1) {
            this.f۱۰۹۸۳A = false;
        }
        if (featureId2 == 1) {
            m۱۱۴۵۱B();
            this.f۱۰۹۸۷E = true;
            return true;
        }
        if (featureId2 == 2) {
            m۱۱۴۵۱B();
            this.f۱۱۰۲۴y = true;
            return true;
        }
        if (featureId2 == 5) {
            m۱۱۴۵۱B();
            this.f۱۱۰۲۵z = true;
            return true;
        }
        if (featureId2 == 10) {
            m۱۱۴۵۱B();
            this.f۱۰۹۸۵C = true;
            return true;
        }
        if (featureId2 == 108) {
            m۱۱۴۵۱B();
            this.f۱۰۹۸۳A = true;
            return true;
        }
        if (featureId2 == 109) {
            m۱۱۴۵۱B();
            this.f۱۰۹۸۴B = true;
            return true;
        }
        return this.f۱۱۰۰۴e.requestFeature(featureId2);
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public final void mo۱۱۴۸۵a(CharSequence title) {
        this.f۱۱۰۱۰k = title;
        InterfaceCe0 interfaceCe0 = this.f۱۱۰۱۱l;
        if (interfaceCe0 != null) {
            interfaceCe0.setWindowTitle(title);
            return;
        }
        if (m۱۱۵۲۱s() != null) {
            m۱۱۵۲۱s().mo۱۱۶۲۷b(title);
            return;
        }
        TextView textView = this.f۱۱۰۲۲w;
        if (textView != null) {
            textView.setText(title);
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    final CharSequence m۱۱۵۱۷o() {
        Window.Callback callback = this.f۱۱۰۰۵f;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.f۱۱۰۱۰k;
    }

    /* renamed from: h, reason: contains not printable characters */
    void m۱۱۵۱۰h(int featureId) {
        if (featureId == 108) {
            AbstractCa ab = mo۱۱۵۰۱d();
            if (ab != null) {
                ab.mo۱۱۶۲۸b(false);
                return;
            }
            return;
        }
        if (featureId == 0) {
            n st = m۱۱۴۷۲a(featureId, true);
            if (st.f۱۱۰۶۱o) {
                m۱۱۴۷۹a(st, false);
            }
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    void m۱۱۵۰۸g(int featureId) {
        AbstractCa ab;
        if (featureId == 108 && (ab = mo۱۱۵۰۱d()) != null) {
            ab.mo۱۱۶۲۸b(true);
        }
    }

    @Override // android.support.v7.view.menu.Ch.a
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۵۶۶a(Ch menu, MenuItem item) {
        n panel;
        Window.Callback cb = m۱۱۵۱۸p();
        if (cb != null && !this.f۱۰۹۹۲J && (panel = m۱۱۴۷۳a((Menu) menu.mo۱۱۹۴۲m())) != null) {
            return cb.onMenuItemSelected(panel.f۱۱۰۴۷a, item);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.Ch.a
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۶۵a(Ch menu) {
        m۱۱۴۵۳a(menu, true);
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb m۱۱۴۷۱a(AbstractCb.a callback) {
        InterfaceCf interfaceCf;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractCb abstractCb = this.f۱۱۰۱۴o;
        if (abstractCb != null) {
            abstractCb.mo۱۱۶۴۸a();
        }
        AbstractCb.a wrappedCallback = new j(callback);
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab != null) {
            this.f۱۱۰۱۴o = ab.mo۱۱۶۱۴a(wrappedCallback);
            AbstractCb abstractCb2 = this.f۱۱۰۱۴o;
            if (abstractCb2 != null && (interfaceCf = this.f۱۱۰۰۷h) != null) {
                interfaceCf.mo۱۱۵۶۱b(abstractCb2);
            }
        }
        if (this.f۱۱۰۱۴o == null) {
            this.f۱۱۰۱۴o = m۱۱۴۹۰b(wrappedCallback);
        }
        return this.f۱۱۰۱۴o;
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: f, reason: contains not printable characters */
    public void mo۱۱۵۰۶f() {
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab == null || !ab.mo۱۱۵۸۹i()) {
            m۱۱۴۶۲j(0);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    AbstractCb m۱۱۴۹۰b(AbstractCb.a callback) {
        Context actionBarContext;
        InterfaceCf interfaceCf;
        m۱۱۵۱۵m();
        AbstractCb abstractCb = this.f۱۱۰۱۴o;
        if (abstractCb != null) {
            abstractCb.mo۱۱۶۴۸a();
        }
        if (!(callback instanceof j)) {
            callback = new j(callback);
        }
        AbstractCb mode = null;
        InterfaceCf interfaceCf2 = this.f۱۱۰۰۷h;
        if (interfaceCf2 != null && !this.f۱۰۹۹۲J) {
            try {
                mode = interfaceCf2.mo۱۱۵۵۶a(callback);
            } catch (AbstractMethodError e2) {
            }
        }
        if (mode != null) {
            this.f۱۱۰۱۴o = mode;
        } else {
            if (this.f۱۱۰۱۵p == null) {
                if (this.f۱۰۹۸۶D) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f۱۱۰۰۳d.getTheme();
                    baseTheme.resolveAttribute(Ca.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f۱۱۰۰۳d.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        actionBarContext = new Cd(this.f۱۱۰۰۳d, 0);
                        actionBarContext.getTheme().setTo(actionBarTheme);
                    } else {
                        actionBarContext = this.f۱۱۰۰۳d;
                    }
                    this.f۱۱۰۱۵p = new ActionBarContextView(actionBarContext);
                    this.f۱۱۰۱۶q = new PopupWindow(actionBarContext, (AttributeSet) null, Ca.actionModePopupWindowStyle);
                    Cn.m۱۱۲۲۳a(this.f۱۱۰۱۶q, 2);
                    this.f۱۱۰۱۶q.setContentView(this.f۱۱۰۱۵p);
                    this.f۱۱۰۱۶q.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(Ca.actionBarSize, outValue, true);
                    int height = TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics());
                    this.f۱۱۰۱۵p.setContentHeight(height);
                    this.f۱۱۰۱۶q.setHeight(-2);
                    this.f۱۱۰۱۷r = new f();
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.f۱۱۰۲۱v.findViewById(Cf.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(m۱۱۵۱۶n()));
                        this.f۱۱۰۱۵p = (ActionBarContextView) stub.m۱۲۸۸۸a();
                    }
                }
            }
            if (this.f۱۱۰۱۵p != null) {
                m۱۱۵۱۵m();
                this.f۱۱۰۱۵p.m۱۱۹۵۴c();
                AbstractCb mode2 = new Ce(this.f۱۱۰۱۵p.getContext(), this.f۱۱۰۱۵p, callback, this.f۱۱۰۱۶q == null);
                if (callback.mo۱۱۵۳۹a(mode2, mode2.mo۱۱۶۵۸c())) {
                    mode2.mo۱۱۶۶۲i();
                    this.f۱۱۰۱۵p.m۱۱۹۵۲a(mode2);
                    this.f۱۱۰۱۴o = mode2;
                    if (m۱۱۵۲۲t()) {
                        this.f۱۱۰۱۵p.setAlpha(0.0f);
                        Cy cy = Cu.m۱۰۹۰۶a(this.f۱۱۰۱۵p);
                        cy.m۱۰۹۸۳a(1.0f);
                        this.f۱۱۰۱۸s = cy;
                        this.f۱۱۰۱۸s.m۱۰۹۸۶a(new g());
                    } else {
                        this.f۱۱۰۱۵p.setAlpha(1.0f);
                        this.f۱۱۰۱۵p.setVisibility(0);
                        this.f۱۱۰۱۵p.sendAccessibilityEvent(32);
                        if (this.f۱۱۰۱۵p.getParent() instanceof View) {
                            Cu.m۱۰۹۰۱C((View) this.f۱۱۰۱۵p.getParent());
                        }
                    }
                    if (this.f۱۱۰۱۶q != null) {
                        this.f۱۱۰۰۴e.getDecorView().post(this.f۱۱۰۱۷r);
                    }
                } else {
                    this.f۱۱۰۱۴o = null;
                }
            }
        }
        AbstractCb abstractCb2 = this.f۱۱۰۱۴o;
        if (abstractCb2 != null && (interfaceCf = this.f۱۱۰۰۷h) != null) {
            interfaceCf.mo۱۱۵۶۱b(abstractCb2);
        }
        return this.f۱۱۰۱۴o;
    }

    /* renamed from: android.support.v7.app.h$f */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch = LayoutInflaterFactory2Ch.this;
            layoutInflaterFactory2Ch.f۱۱۰۱۶q.showAtLocation(layoutInflaterFactory2Ch.f۱۱۰۱۵p, 55, 0, 0);
            LayoutInflaterFactory2Ch.this.m۱۱۵۱۵m();
            if (LayoutInflaterFactory2Ch.this.m۱۱۵۲۲t()) {
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setAlpha(0.0f);
                LayoutInflaterFactory2Ch layoutInflaterFactory2Ch2 = LayoutInflaterFactory2Ch.this;
                Cy cy = Cu.m۱۰۹۰۶a(layoutInflaterFactory2Ch2.f۱۱۰۱۵p);
                cy.m۱۰۹۸۳a(1.0f);
                layoutInflaterFactory2Ch2.f۱۱۰۱۸s = cy;
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s.m۱۰۹۸۶a(new a());
                return;
            }
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setAlpha(1.0f);
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setVisibility(0);
        }

        /* renamed from: android.support.v7.app.h$f$a */
        class a extends Ca0 {
            a() {
            }

            @Override // android.support.v4.view.Ca0, android.support.v4.view.InterfaceCz
            /* renamed from: b, reason: contains not printable characters */
            public void mo۱۵۷۹۶b(View view) {
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setVisibility(0);
            }

            @Override // android.support.v4.view.InterfaceCz
            /* renamed from: a, reason: contains not printable characters */
            public void mo۱۵۷۹۵a(View view) {
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setAlpha(1.0f);
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s.m۱۰۹۸۶a((InterfaceCz) null);
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.h$g */
    class g extends Ca0 {
        g() {
        }

        @Override // android.support.v4.view.Ca0, android.support.v4.view.InterfaceCz
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۵۷۹۶b(View view) {
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setVisibility(0);
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.sendAccessibilityEvent(32);
            if (LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.getParent() instanceof View) {
                Cu.m۱۰۹۰۱C((View) LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.getParent());
            }
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setAlpha(1.0f);
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s.m۱۰۹۸۶a((InterfaceCz) null);
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s = null;
        }
    }

    /* renamed from: t, reason: contains not printable characters */
    final boolean m۱۱۵۲۲t() {
        ViewGroup viewGroup;
        return this.f۱۱۰۲۰u && (viewGroup = this.f۱۱۰۲۱v) != null && Cu.m۱۰۹۵۸y(viewGroup);
    }

    /* renamed from: q, reason: contains not printable characters */
    public boolean m۱۱۵۱۹q() {
        return this.f۱۱۰۱۹t;
    }

    /* renamed from: m, reason: contains not printable characters */
    void m۱۱۵۱۵m() {
        Cy cy = this.f۱۱۰۱۸s;
        if (cy != null) {
            cy.m۱۰۹۸۸a();
        }
    }

    /* renamed from: r, reason: contains not printable characters */
    boolean m۱۱۵۲۰r() {
        AbstractCb abstractCb = this.f۱۱۰۱۴o;
        if (abstractCb != null) {
            abstractCb.mo۱۱۶۴۸a();
            return true;
        }
        AbstractCa ab = mo۱۱۵۰۱d();
        return ab != null && ab.mo۱۱۶۳۵f();
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۱۴۹۶b(int keyCode, KeyEvent ev) {
        AbstractCa ab = mo۱۱۵۰۱d();
        if (ab != null && ab.mo۱۱۶۲۳a(keyCode, ev)) {
            return true;
        }
        n nVar = this.f۱۰۹۹۰H;
        if (nVar != null) {
            boolean handled = m۱۱۴۵۵a(nVar, ev.getKeyCode(), ev, 1);
            if (handled) {
                n nVar2 = this.f۱۰۹۹۰H;
                if (nVar2 != null) {
                    nVar2.f۱۱۰۶۰n = true;
                }
                return true;
            }
        }
        if (this.f۱۰۹۹۰H == null) {
            n st = m۱۱۴۷۲a(0, true);
            m۱۱۴۵۸b(st, ev);
            boolean handled2 = m۱۱۴۵۵a(st, ev.getKeyCode(), ev, 1);
            st.f۱۱۰۵۹m = false;
            if (handled2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۱۴۸۹a(KeyEvent event) {
        View root;
        Window.Callback callback = this.f۱۱۰۰۵f;
        if (((callback instanceof Ce.a) || (callback instanceof DialogCi)) && (root = this.f۱۱۰۰۴e.getDecorView()) != null && android.support.v4.view.Ce.m۱۰۸۳۸a(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.f۱۱۰۰۵f.dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        int action = event.getAction();
        boolean isDown = action == 0;
        return isDown ? m۱۱۴۸۷a(keyCode, event) : m۱۱۵۰۰c(keyCode, event);
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۱۵۰۰c(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            boolean wasLongPressBackDown = this.f۱۰۹۹۱I;
            this.f۱۰۹۹۱I = false;
            n st = m۱۱۴۷۲a(0, false);
            if (st != null && st.f۱۱۰۶۱o) {
                if (!wasLongPressBackDown) {
                    m۱۱۴۷۹a(st, true);
                }
                return true;
            }
            if (m۱۱۵۲۰r()) {
                return true;
            }
        } else if (keyCode == 82) {
            m۱۱۴۶۱e(0, event);
            return true;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۱۴۸۷a(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            this.f۱۰۹۹۱I = (event.getFlags() & 128) != 0;
        } else if (keyCode == 82) {
            m۱۱۴۶۰d(0, event);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public View m۱۱۴۷۵a(View view, String name, Context context, AttributeSet attrs) {
        boolean z = false;
        if (this.f۱۱۰۰۲T == null) {
            TypedArray a2 = this.f۱۱۰۰۳d.obtainStyledAttributes(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme);
            String viewInflaterClassName = a2.getString(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_viewInflaterClass);
            if (viewInflaterClassName == null || AppCompatViewInflater.class.getName().equals(viewInflaterClassName)) {
                this.f۱۱۰۰۲T = new AppCompatViewInflater();
            } else {
                try {
                    Class viewInflaterClass = Class.forName(viewInflaterClassName);
                    this.f۱۱۰۰۲T = (AppCompatViewInflater) viewInflaterClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t);
                    this.f۱۱۰۰۲T = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        if (f۱۰۹۸۰U) {
            if (attrs instanceof XmlPullParser) {
                if (((XmlPullParser) attrs).getDepth() > 1) {
                    z = true;
                }
            } else {
                z = m۱۱۴۵۶a((ViewParent) view);
            }
            inheritContext = z;
        }
        return this.f۱۱۰۰۲T.createView(view, name, context, attrs, inheritContext, f۱۰۹۸۰U, true, Co1.m۱۳۴۰۹b());
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۴۵۶a(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.f۱۱۰۰۴e.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || Cu.m۱۰۹۵۷x((View) parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۱۵۰۳e() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f۱۱۰۰۳d);
        if (layoutInflater.getFactory() == null) {
            android.support.v4.view.Cf.m۱۰۸۴۲b(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof LayoutInflaterFactory2Ch)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return m۱۱۴۷۵a(parent, name, context, attrs);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۴۵۲a(n st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        if (st.f۱۱۰۶۱o || this.f۱۰۹۹۲J) {
            return;
        }
        if (st.f۱۱۰۴۷a == 0) {
            Configuration config = this.f۱۱۰۰۳d.getResources().getConfiguration();
            boolean isXLarge = (config.screenLayout & 15) == 4;
            if (isXLarge) {
                return;
            }
        }
        Window.Callback cb = m۱۱۵۱۸p();
        if (cb != null && !cb.onMenuOpened(st.f۱۱۰۴۷a, st.f۱۱۰۵۶j)) {
            m۱۱۴۷۹a(st, true);
            return;
        }
        WindowManager wm = (WindowManager) this.f۱۱۰۰۳d.getSystemService("window");
        if (wm == null || !m۱۱۴۵۸b(st, event)) {
            return;
        }
        int width = -2;
        if (st.f۱۱۰۵۳g == null || st.f۱۱۰۶۳q) {
            ViewGroup viewGroup = st.f۱۱۰۵۳g;
            if (viewGroup == null) {
                if (!m۱۱۴۵۷b(st) || st.f۱۱۰۵۳g == null) {
                    return;
                }
            } else if (st.f۱۱۰۶۳q && viewGroup.getChildCount() > 0) {
                st.f۱۱۰۵۳g.removeAllViews();
            }
            if (!m۱۱۴۵۴a(st) || !st.m۱۱۵۵۲a()) {
                return;
            }
            ViewGroup.LayoutParams lp2 = st.f۱۱۰۵۴h.getLayoutParams();
            if (lp2 == null) {
                lp2 = new ViewGroup.LayoutParams(-2, -2);
            }
            int backgroundResId = st.f۱۱۰۴۸b;
            st.f۱۱۰۵۳g.setBackgroundResource(backgroundResId);
            ViewParent shownPanelParent = st.f۱۱۰۵۴h.getParent();
            if (shownPanelParent != null && (shownPanelParent instanceof ViewGroup)) {
                ((ViewGroup) shownPanelParent).removeView(st.f۱۱۰۵۴h);
            }
            st.f۱۱۰۵۳g.addView(st.f۱۱۰۵۴h, lp2);
            if (!st.f۱۱۰۵۴h.hasFocus()) {
                st.f۱۱۰۵۴h.requestFocus();
            }
        } else {
            View view = st.f۱۱۰۵۵i;
            if (view != null && (lp = view.getLayoutParams()) != null && lp.width == -1) {
                width = -1;
            }
        }
        st.f۱۱۰۶۰n = false;
        WindowManager.LayoutParams lp3 = new WindowManager.LayoutParams(width, -2, st.f۱۱۰۵۰d, st.f۱۱۰۵۱e, 1002, 8519680, -3);
        lp3.gravity = st.f۱۱۰۴۹c;
        lp3.windowAnimations = st.f۱۱۰۵۲f;
        wm.addView(st.f۱۱۰۵۳g, lp3);
        st.f۱۱۰۶۱o = true;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۱۴۵۷b(n st) {
        st.m۱۱۵۵۰a(m۱۱۵۱۶n());
        st.f۱۱۰۵۳g = new m(st.f۱۱۰۵۸l);
        st.f۱۱۰۴۹c = 81;
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۴۵۳a(Ch menu, boolean toggleMenuMode) {
        InterfaceCe0 interfaceCe0 = this.f۱۱۰۱۱l;
        if (interfaceCe0 != null && interfaceCe0.mo۱۳۱۱۸f() && (!ViewConfiguration.get(this.f۱۱۰۰۳d).hasPermanentMenuKey() || this.f۱۱۰۱۱l.mo۱۳۱۱۳a())) {
            Window.Callback cb = m۱۱۵۱۸p();
            if (!this.f۱۱۰۱۱l.mo۱۳۱۱۴b() || !toggleMenuMode) {
                if (cb != null && !this.f۱۰۹۹۲J) {
                    if (this.f۱۰۹۹۶N && (this.f۱۰۹۹۷O & 1) != 0) {
                        this.f۱۱۰۰۴e.getDecorView().removeCallbacks(this.f۱۰۹۹۸P);
                        this.f۱۰۹۹۸P.run();
                    }
                    n st = m۱۱۴۷۲a(0, true);
                    Ch ch = st.f۱۱۰۵۶j;
                    if (ch != null && !st.f۱۱۰۶۴r && cb.onPreparePanel(0, st.f۱۱۰۵۵i, ch)) {
                        cb.onMenuOpened(108, st.f۱۱۰۵۶j);
                        this.f۱۱۰۱۱l.mo۱۳۱۱۶d();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f۱۱۰۱۱l.mo۱۳۱۱۵c();
            if (!this.f۱۰۹۹۲J) {
                cb.onPanelClosed(108, m۱۱۴۷۲a(0, true).f۱۱۰۵۶j);
                return;
            }
            return;
        }
        n st2 = m۱۱۴۷۲a(0, true);
        st2.f۱۱۰۶۳q = true;
        m۱۱۴۷۹a(st2, false);
        m۱۱۴۵۲a(st2, (KeyEvent) null);
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۱۱۴۵۹c(n st) {
        Context context = this.f۱۱۰۰۳d;
        int i2 = st.f۱۱۰۴۷a;
        if ((i2 == 0 || i2 == 108) && this.f۱۱۰۱۱l != null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme baseTheme = context.getTheme();
            baseTheme.resolveAttribute(Ca.actionBarTheme, outValue, true);
            Resources.Theme widgetTheme = null;
            if (outValue.resourceId != 0) {
                widgetTheme = context.getResources().newTheme();
                widgetTheme.setTo(baseTheme);
                widgetTheme.applyStyle(outValue.resourceId, true);
                widgetTheme.resolveAttribute(Ca.actionBarWidgetTheme, outValue, true);
            } else {
                baseTheme.resolveAttribute(Ca.actionBarWidgetTheme, outValue, true);
            }
            if (outValue.resourceId != 0) {
                if (widgetTheme == null) {
                    widgetTheme = context.getResources().newTheme();
                    widgetTheme.setTo(baseTheme);
                }
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            if (widgetTheme != null) {
                context = new Cd(context, 0);
                context.getTheme().setTo(widgetTheme);
            }
        }
        Ch menu = new Ch(context);
        menu.mo۱۱۹۳۷a(this);
        st.m۱۱۵۵۱a(menu);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۴۵۴a(n st) {
        View view = st.f۱۱۰۵۵i;
        if (view != null) {
            st.f۱۱۰۵۴h = view;
            return true;
        }
        if (st.f۱۱۰۵۶j == null) {
            return false;
        }
        if (this.f۱۱۰۱۳n == null) {
            this.f۱۱۰۱۳n = new o();
        }
        st.f۱۱۰۵۴h = (View) st.m۱۱۵۴۹a(this.f۱۱۰۱۳n);
        return st.f۱۱۰۵۴h != null;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۱۴۵۸b(n st, KeyEvent event) {
        InterfaceCe0 interfaceCe0;
        InterfaceCe0 interfaceCe02;
        InterfaceCe0 interfaceCe03;
        if (this.f۱۰۹۹۲J) {
            return false;
        }
        if (st.f۱۱۰۵۹m) {
            return true;
        }
        n nVar = this.f۱۰۹۹۰H;
        if (nVar != null && nVar != st) {
            m۱۱۴۷۹a(nVar, false);
        }
        Window.Callback cb = m۱۱۵۱۸p();
        if (cb != null) {
            st.f۱۱۰۵۵i = cb.onCreatePanelView(st.f۱۱۰۴۷a);
        }
        int i2 = st.f۱۱۰۴۷a;
        boolean isActionBarMenu = i2 == 0 || i2 == 108;
        if (isActionBarMenu && (interfaceCe03 = this.f۱۱۰۱۱l) != null) {
            interfaceCe03.mo۱۳۱۱۷e();
        }
        if (st.f۱۱۰۵۵i == null && (!isActionBarMenu || !(m۱۱۵۲۱s() instanceof Ck))) {
            if (st.f۱۱۰۵۶j == null || st.f۱۱۰۶۴r) {
                if (st.f۱۱۰۵۶j == null && (!m۱۱۴۵۹c(st) || st.f۱۱۰۵۶j == null)) {
                    return false;
                }
                if (isActionBarMenu && this.f۱۱۰۱۱l != null) {
                    if (this.f۱۱۰۱۲m == null) {
                        this.f۱۱۰۱۲m = new i();
                    }
                    this.f۱۱۰۱۱l.mo۱۳۱۱۲a(st.f۱۱۰۵۶j, this.f۱۱۰۱۲m);
                }
                st.f۱۱۰۵۶j.m۱۱۸۱۷s();
                if (!cb.onCreatePanelMenu(st.f۱۱۰۴۷a, st.f۱۱۰۵۶j)) {
                    st.m۱۱۵۵۱a((Ch) null);
                    if (isActionBarMenu && (interfaceCe0 = this.f۱۱۰۱۱l) != null) {
                        interfaceCe0.mo۱۳۱۱۲a(null, this.f۱۱۰۱۲m);
                    }
                    return false;
                }
                st.f۱۱۰۶۴r = false;
            }
            st.f۱۱۰۵۶j.m۱۱۸۱۷s();
            Bundle bundle = st.f۱۱۰۶۵s;
            if (bundle != null) {
                st.f۱۱۰۵۶j.m۱۱۷۷۶a(bundle);
                st.f۱۱۰۶۵s = null;
            }
            if (!cb.onPreparePanel(0, st.f۱۱۰۵۵i, st.f۱۱۰۵۶j)) {
                if (isActionBarMenu && (interfaceCe02 = this.f۱۱۰۱۱l) != null) {
                    interfaceCe02.mo۱۳۱۱۲a(null, this.f۱۱۰۱۲m);
                }
                st.f۱۱۰۵۶j.m۱۱۸۱۶r();
                return false;
            }
            KeyCharacterMap kmap = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1);
            st.f۱۱۰۶۲p = kmap.getKeyboardType() != 1;
            st.f۱۱۰۵۶j.setQwertyMode(st.f۱۱۰۶۲p);
            st.f۱۱۰۵۶j.m۱۱۸۱۶r();
        }
        st.f۱۱۰۵۹m = true;
        st.f۱۱۰۶۰n = false;
        this.f۱۰۹۹۰H = st;
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۱۴۹۳b(Ch menu) {
        if (this.f۱۰۹۸۸F) {
            return;
        }
        this.f۱۰۹۸۸F = true;
        this.f۱۱۰۱۱l.mo۱۳۱۱۹g();
        Window.Callback cb = m۱۱۵۱۸p();
        if (cb != null && !this.f۱۰۹۹۲J) {
            cb.onPanelClosed(108, menu);
        }
        this.f۱۰۹۸۸F = false;
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۱۵۰۲d(int featureId) {
        m۱۱۴۷۹a(m۱۱۴۷۲a(featureId, true), true);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۴۷۹a(n st, boolean doCallback) {
        ViewGroup viewGroup;
        InterfaceCe0 interfaceCe0;
        if (doCallback && st.f۱۱۰۴۷a == 0 && (interfaceCe0 = this.f۱۱۰۱۱l) != null && interfaceCe0.mo۱۳۱۱۴b()) {
            m۱۱۴۹۳b(st.f۱۱۰۵۶j);
            return;
        }
        WindowManager wm = (WindowManager) this.f۱۱۰۰۳d.getSystemService("window");
        if (wm != null && st.f۱۱۰۶۱o && (viewGroup = st.f۱۱۰۵۳g) != null) {
            wm.removeView(viewGroup);
            if (doCallback) {
                m۱۱۴۷۶a(st.f۱۱۰۴۷a, st, null);
            }
        }
        st.f۱۱۰۵۹m = false;
        st.f۱۱۰۶۰n = false;
        st.f۱۱۰۶۱o = false;
        st.f۱۱۰۵۴h = null;
        st.f۱۱۰۶۳q = true;
        if (this.f۱۰۹۹۰H == st) {
            this.f۱۰۹۹۰H = null;
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۱۱۴۶۰d(int featureId, KeyEvent event) {
        if (event.getRepeatCount() == 0) {
            n st = m۱۱۴۷۲a(featureId, true);
            if (!st.f۱۱۰۶۱o) {
                return m۱۱۴۵۸b(st, event);
            }
            return false;
        }
        return false;
    }

    /* renamed from: e, reason: contains not printable characters */
    private boolean m۱۱۴۶۱e(int featureId, KeyEvent event) {
        InterfaceCe0 interfaceCe0;
        if (this.f۱۱۰۱۴o != null) {
            return false;
        }
        boolean handled = false;
        n st = m۱۱۴۷۲a(featureId, true);
        if (featureId == 0 && (interfaceCe0 = this.f۱۱۰۱۱l) != null && interfaceCe0.mo۱۳۱۱۸f() && !ViewConfiguration.get(this.f۱۱۰۰۳d).hasPermanentMenuKey()) {
            if (!this.f۱۱۰۱۱l.mo۱۳۱۱۴b()) {
                if (!this.f۱۰۹۹۲J && m۱۱۴۵۸b(st, event)) {
                    handled = this.f۱۱۰۱۱l.mo۱۳۱۱۶d();
                }
            } else {
                handled = this.f۱۱۰۱۱l.mo۱۳۱۱۵c();
            }
        } else if (st.f۱۱۰۶۱o || st.f۱۱۰۶۰n) {
            handled = st.f۱۱۰۶۱o;
            m۱۱۴۷۹a(st, true);
        } else if (st.f۱۱۰۵۹m) {
            boolean show = true;
            if (st.f۱۱۰۶۴r) {
                st.f۱۱۰۵۹m = false;
                show = m۱۱۴۵۸b(st, event);
            }
            if (show) {
                m۱۱۴۵۲a(st, event);
                handled = true;
            }
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.f۱۱۰۰۳d.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۴۷۶a(int featureId, n panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                n[] nVarArr = this.f۱۰۹۸۹G;
                if (featureId < nVarArr.length) {
                    panel = nVarArr[featureId];
                }
            }
            if (panel != null) {
                menu = panel.f۱۱۰۵۶j;
            }
        }
        if ((panel == null || panel.f۱۱۰۶۱o) && !this.f۱۰۹۹۲J) {
            this.f۱۱۰۰۵f.onPanelClosed(featureId, menu);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    n m۱۱۴۷۳a(Menu menu) {
        n[] panels = this.f۱۰۹۸۹G;
        int N = panels != null ? panels.length : 0;
        for (int i2 = 0; i2 < N; i2++) {
            n panel = panels[i2];
            if (panel != null && panel.f۱۱۰۵۶j == menu) {
                return panel;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected n m۱۱۴۷۲a(int featureId, boolean required) {
        n[] nVarArr = this.f۱۰۹۸۹G;
        n[] ar = nVarArr;
        if (nVarArr == null || ar.length <= featureId) {
            n[] nar = new n[featureId + 1];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.f۱۰۹۸۹G = nar;
        }
        n st = ar[featureId];
        if (st == null) {
            n st2 = new n(featureId);
            ar[featureId] = st2;
            return st2;
        }
        return st;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۴۵۵a(n st, int keyCode, KeyEvent event, int flags) {
        Ch ch;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.f۱۱۰۵۹m || m۱۱۴۵۸b(st, event)) && (ch = st.f۱۱۰۵۶j) != null) {
            handled = ch.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.f۱۱۰۱۱l == null) {
            m۱۱۴۷۹a(st, true);
        }
        return handled;
    }

    /* renamed from: j, reason: contains not printable characters */
    private void m۱۱۴۶۲j(int featureId) {
        this.f۱۰۹۹۷O |= 1 << featureId;
        if (!this.f۱۰۹۹۶N) {
            Cu.m۱۰۹۱۹a(this.f۱۱۰۰۴e.getDecorView(), this.f۱۰۹۹۸P);
            this.f۱۰۹۹۶N = true;
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۱۵۰۴e(int featureId) {
        n st;
        n st2 = m۱۱۴۷۲a(featureId, true);
        if (st2.f۱۱۰۵۶j != null) {
            Bundle savedActionViewStates = new Bundle();
            st2.f۱۱۰۵۶j.m۱۱۷۹۵c(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st2.f۱۱۰۶۵s = savedActionViewStates;
            }
            st2.f۱۱۰۵۶j.m۱۱۸۱۷s();
            st2.f۱۱۰۵۶j.clear();
        }
        st2.f۱۱۰۶۴r = true;
        st2.f۱۱۰۶۳q = true;
        if ((featureId == 108 || featureId == 0) && this.f۱۱۰۱۱l != null && (st = m۱۱۴۷۲a(0, false)) != null) {
            st.f۱۱۰۵۹m = false;
            m۱۱۴۵۸b(st, (KeyEvent) null);
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    int m۱۱۵۱۱i(int insetTop) {
        boolean showStatusGuard = false;
        ActionBarContextView actionBarContextView = this.f۱۱۰۱۵p;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) this.f۱۱۰۱۵p.getLayoutParams();
            boolean mlpChanged = false;
            if (this.f۱۱۰۱۵p.isShown()) {
                if (this.f۱۱۰۰۰R == null) {
                    this.f۱۱۰۰۰R = new Rect();
                    this.f۱۱۰۰۱S = new Rect();
                }
                Rect insets = this.f۱۱۰۰۰R;
                Rect localInsets = this.f۱۱۰۰۱S;
                insets.set(0, insetTop, 0, 0);
                Cr1.m۱۳۴۹۶a(this.f۱۱۰۲۱v, insets, localInsets);
                int newMargin = localInsets.top == 0 ? insetTop : 0;
                if (mlp.topMargin != newMargin) {
                    mlpChanged = true;
                    mlp.topMargin = insetTop;
                    View view = this.f۱۱۰۲۳x;
                    if (view == null) {
                        this.f۱۱۰۲۳x = new View(this.f۱۱۰۰۳d);
                        this.f۱۱۰۲۳x.setBackgroundColor(this.f۱۱۰۰۳d.getResources().getColor(Cc.abc_input_method_navigation_guard));
                        this.f۱۱۰۲۱v.addView(this.f۱۱۰۲۳x, -1, new ViewGroup.LayoutParams(-1, insetTop));
                    } else {
                        ViewGroup.LayoutParams lp = view.getLayoutParams();
                        if (lp.height != insetTop) {
                            lp.height = insetTop;
                            this.f۱۱۰۲۳x.setLayoutParams(lp);
                        }
                    }
                }
                showStatusGuard = this.f۱۱۰۲۳x != null;
                if (!this.f۱۰۹۸۵C && showStatusGuard) {
                    insetTop = 0;
                }
            } else if (mlp.topMargin != 0) {
                mlpChanged = true;
                mlp.topMargin = 0;
            }
            if (mlpChanged) {
                this.f۱۱۰۱۵p.setLayoutParams(mlp);
            }
        }
        View view2 = this.f۱۱۰۲۳x;
        if (view2 != null) {
            view2.setVisibility(showStatusGuard ? 0 : 8);
        }
        return insetTop;
    }

    /* renamed from: B, reason: contains not printable characters */
    private void m۱۱۴۵۱B() {
        if (this.f۱۱۰۲۰u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: k, reason: contains not printable characters */
    private int m۱۱۴۶۳k(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (featureId == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
        return featureId;
    }

    /* renamed from: l, reason: contains not printable characters */
    void m۱۱۵۱۴l() {
        Ch ch;
        InterfaceCe0 interfaceCe0 = this.f۱۱۰۱۱l;
        if (interfaceCe0 != null) {
            interfaceCe0.mo۱۳۱۱۹g();
        }
        if (this.f۱۱۰۱۶q != null) {
            this.f۱۱۰۰۴e.getDecorView().removeCallbacks(this.f۱۱۰۱۷r);
            if (this.f۱۱۰۱۶q.isShowing()) {
                try {
                    this.f۱۱۰۱۶q.dismiss();
                } catch (IllegalArgumentException e2) {
                }
            }
            this.f۱۱۰۱۶q = null;
        }
        m۱۱۵۱۵m();
        n st = m۱۱۴۷۲a(0, false);
        if (st != null && (ch = st.f۱۱۰۵۶j) != null) {
            ch.close();
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۴۸۶a() {
        boolean applied = false;
        int nightMode = m۱۱۴۶۹y();
        int modeToApply = m۱۱۵۰۵f(nightMode);
        if (modeToApply != -1) {
            applied = m۱۱۴۶۴l(modeToApply);
        }
        if (nightMode == 0) {
            m۱۱۴۶۷w();
            this.f۱۰۹۹۵M.m۱۱۵۴۷d();
        }
        this.f۱۰۹۹۴L = true;
        return applied;
    }

    /* renamed from: f, reason: contains not printable characters */
    int m۱۱۵۰۵f(int mode) {
        if (mode == -100) {
            return -1;
        }
        if (mode == 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                UiModeManager uiModeManager = (UiModeManager) this.f۱۱۰۰۳d.getSystemService(UiModeManager.class);
                if (uiModeManager.getNightMode() == 0) {
                    return -1;
                }
            }
            m۱۱۴۶۷w();
            return this.f۱۰۹۹۵M.m۱۱۵۴۶c();
        }
        return mode;
    }

    /* renamed from: y, reason: contains not printable characters */
    private int m۱۱۴۶۹y() {
        int i2 = this.f۱۰۹۹۳K;
        return i2 != -100 ? i2 : AbstractCg.m۱۱۴۲۷k();
    }

    /* renamed from: l, reason: contains not printable characters */
    private boolean m۱۱۴۶۴l(int mode) {
        Resources res = this.f۱۱۰۰۳d.getResources();
        Configuration conf = res.getConfiguration();
        int currentNightMode = conf.uiMode & 48;
        int newNightMode = mode == 2 ? 32 : 16;
        if (currentNightMode != newNightMode) {
            if (m۱۱۴۵۰A()) {
                Activity activity = (Activity) this.f۱۱۰۰۳d;
                activity.recreate();
                return true;
            }
            Configuration config = new Configuration(conf);
            DisplayMetrics metrics = res.getDisplayMetrics();
            config.uiMode = (config.uiMode & (-49)) | newNightMode;
            res.updateConfiguration(config, metrics);
            if (Build.VERSION.SDK_INT < 26) {
                Cj.m۱۱۵۶۳a(res);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: w, reason: contains not printable characters */
    private void m۱۱۴۶۷w() {
        if (this.f۱۰۹۹۵M == null) {
            this.f۱۰۹۹۵M = new l(Cm.m۱۱۶۰۱a(this.f۱۱۰۰۳d));
        }
    }

    /* renamed from: A, reason: contains not printable characters */
    private boolean m۱۱۴۵۰A() {
        if (this.f۱۰۹۹۴L) {
            Context context = this.f۱۱۰۰۳d;
            if (context instanceof Activity) {
                PackageManager pm = context.getPackageManager();
                try {
                    ActivityInfo info2 = pm.getActivityInfo(new ComponentName(this.f۱۱۰۰۳d, this.f۱۱۰۰۳d.getClass()), 0);
                    return (info2.configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: android.support.v7.app.h$j */
    class j implements AbstractCb.a {

        /* renamed from: a, reason: contains not printable characters */
        private AbstractCb.a f۱۱۰۳۶a;

        public j(AbstractCb.a wrapped) {
            this.f۱۱۰۳۶a = wrapped;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۵۳۹a(AbstractCb mode, Menu menu) {
            return this.f۱۱۰۳۶a.mo۱۱۵۳۹a(mode, menu);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۵۴۱b(AbstractCb mode, Menu menu) {
            return this.f۱۱۰۳۶a.mo۱۱۵۴۱b(mode, menu);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۵۴۰a(AbstractCb mode, MenuItem item) {
            return this.f۱۱۰۳۶a.mo۱۱۵۴۰a(mode, item);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۸a(AbstractCb mode) {
            this.f۱۱۰۳۶a.mo۱۱۵۳۸a(mode);
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch = LayoutInflaterFactory2Ch.this;
            if (layoutInflaterFactory2Ch.f۱۱۰۱۶q != null) {
                layoutInflaterFactory2Ch.f۱۱۰۰۴e.getDecorView().removeCallbacks(LayoutInflaterFactory2Ch.this.f۱۱۰۱۷r);
            }
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch2 = LayoutInflaterFactory2Ch.this;
            if (layoutInflaterFactory2Ch2.f۱۱۰۱۵p != null) {
                layoutInflaterFactory2Ch2.m۱۱۵۱۵m();
                LayoutInflaterFactory2Ch layoutInflaterFactory2Ch3 = LayoutInflaterFactory2Ch.this;
                Cy cy = Cu.m۱۰۹۰۶a(layoutInflaterFactory2Ch3.f۱۱۰۱۵p);
                cy.m۱۰۹۸۳a(0.0f);
                layoutInflaterFactory2Ch3.f۱۱۰۱۸s = cy;
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s.m۱۰۹۸۶a(new a());
            }
            LayoutInflaterFactory2Ch layoutInflaterFactory2Ch4 = LayoutInflaterFactory2Ch.this;
            InterfaceCf interfaceCf = layoutInflaterFactory2Ch4.f۱۱۰۰۷h;
            if (interfaceCf != null) {
                interfaceCf.mo۱۱۵۵۸a(layoutInflaterFactory2Ch4.f۱۱۰۱۴o);
            }
            LayoutInflaterFactory2Ch.this.f۱۱۰۱۴o = null;
        }

        /* renamed from: android.support.v7.app.h$j$a */
        class a extends Ca0 {
            a() {
            }

            @Override // android.support.v4.view.InterfaceCz
            /* renamed from: a, reason: contains not printable characters */
            public void mo۱۵۷۹۵a(View view) {
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.setVisibility(8);
                LayoutInflaterFactory2Ch layoutInflaterFactory2Ch = LayoutInflaterFactory2Ch.this;
                PopupWindow popupWindow = layoutInflaterFactory2Ch.f۱۱۰۱۶q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2Ch.f۱۱۰۱۵p.getParent() instanceof View) {
                    Cu.m۱۰۹۰۱C((View) LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.getParent());
                }
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۵p.removeAllViews();
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s.m۱۰۹۸۶a((InterfaceCz) null);
                LayoutInflaterFactory2Ch.this.f۱۱۰۱۸s = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.h$o */
    private final class o implements InterfaceCp.a {
        o() {
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۲۹۷۶a(Ch menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.mo۱۱۹۴۲m();
            boolean isSubMenu = parentMenu != menu;
            n panel = LayoutInflaterFactory2Ch.this.m۱۱۴۷۳a(isSubMenu ? parentMenu : menu);
            if (panel != null) {
                if (isSubMenu) {
                    LayoutInflaterFactory2Ch.this.m۱۱۴۷۶a(panel.f۱۱۰۴۷a, panel, parentMenu);
                    LayoutInflaterFactory2Ch.this.m۱۱۴۷۹a(panel, true);
                } else {
                    LayoutInflaterFactory2Ch.this.m۱۱۴۷۹a(panel, allMenusAreClosing);
                }
            }
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۲۹۷۷a(Ch subMenu) {
            Window.Callback cb;
            if (subMenu == null) {
                LayoutInflaterFactory2Ch layoutInflaterFactory2Ch = LayoutInflaterFactory2Ch.this;
                if (layoutInflaterFactory2Ch.f۱۰۹۸۳A && (cb = layoutInflaterFactory2Ch.m۱۱۵۱۸p()) != null && !LayoutInflaterFactory2Ch.this.f۱۰۹۹۲J) {
                    cb.onMenuOpened(108, subMenu);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.h$i */
    private final class i implements InterfaceCp.a {
        i() {
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۲۹۷۷a(Ch subMenu) {
            Window.Callback cb = LayoutInflaterFactory2Ch.this.m۱۱۵۱۸p();
            if (cb != null) {
                cb.onMenuOpened(108, subMenu);
                return true;
            }
            return true;
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۲۹۷۶a(Ch menu, boolean allMenusAreClosing) {
            LayoutInflaterFactory2Ch.this.m۱۱۴۹۳b(menu);
        }
    }

    /* renamed from: android.support.v7.app.h$n */
    protected static final class n {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۱۰۴۷a;

        /* renamed from: b, reason: contains not printable characters */
        int f۱۱۰۴۸b;

        /* renamed from: c, reason: contains not printable characters */
        int f۱۱۰۴۹c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۱۰۵۰d;

        /* renamed from: e, reason: contains not printable characters */
        int f۱۱۰۵۱e;

        /* renamed from: f, reason: contains not printable characters */
        int f۱۱۰۵۲f;

        /* renamed from: g, reason: contains not printable characters */
        ViewGroup f۱۱۰۵۳g;

        /* renamed from: h, reason: contains not printable characters */
        View f۱۱۰۵۴h;

        /* renamed from: i, reason: contains not printable characters */
        View f۱۱۰۵۵i;

        /* renamed from: j, reason: contains not printable characters */
        Ch f۱۱۰۵۶j;

        /* renamed from: k, reason: contains not printable characters */
        android.support.v7.view.menu.Cf f۱۱۰۵۷k;

        /* renamed from: l, reason: contains not printable characters */
        Context f۱۱۰۵۸l;

        /* renamed from: m, reason: contains not printable characters */
        boolean f۱۱۰۵۹m;

        /* renamed from: n, reason: contains not printable characters */
        boolean f۱۱۰۶۰n;

        /* renamed from: o, reason: contains not printable characters */
        boolean f۱۱۰۶۱o;

        /* renamed from: p, reason: contains not printable characters */
        public boolean f۱۱۰۶۲p;

        /* renamed from: q, reason: contains not printable characters */
        boolean f۱۱۰۶۳q = false;

        /* renamed from: r, reason: contains not printable characters */
        boolean f۱۱۰۶۴r;

        /* renamed from: s, reason: contains not printable characters */
        Bundle f۱۱۰۶۵s;

        n(int featureId) {
            this.f۱۱۰۴۷a = featureId;
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۱۱۵۵۲a() {
            if (this.f۱۱۰۵۴h == null) {
                return false;
            }
            return this.f۱۱۰۵۵i != null || this.f۱۱۰۵۷k.m۱۱۷۵۳d().getCount() > 0;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۱۵۵۰a(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(Ca.actionBarPopupTheme, outValue, true);
            int i = outValue.resourceId;
            if (i != 0) {
                widgetTheme.applyStyle(i, true);
            }
            widgetTheme.resolveAttribute(Ca.panelMenuListTheme, outValue, true);
            int i2 = outValue.resourceId;
            if (i2 != 0) {
                widgetTheme.applyStyle(i2, true);
            } else {
                widgetTheme.applyStyle(Ci.Theme_AppCompat_CompactMenu, true);
            }
            Context context2 = new Cd(context, 0);
            context2.getTheme().setTo(widgetTheme);
            this.f۱۱۰۵۸l = context2;
            TypedArray a2 = context2.obtainStyledAttributes(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme);
            this.f۱۱۰۴۸b = a2.getResourceId(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_panelBackground, 0);
            this.f۱۱۰۵۲f = a2.getResourceId(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj.AppCompatTheme_android_windowAnimationStyle, 0);
            a2.recycle();
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۱۵۵۱a(Ch menu) {
            android.support.v7.view.menu.Cf cf;
            Ch ch = this.f۱۱۰۵۶j;
            if (menu == ch) {
                return;
            }
            if (ch != null) {
                ch.m۱۱۷۹۰b(this.f۱۱۰۵۷k);
            }
            this.f۱۱۰۵۶j = menu;
            if (menu == null || (cf = this.f۱۱۰۵۷k) == null) {
                return;
            }
            menu.m۱۱۷۷۸a(cf);
        }

        /* renamed from: a, reason: contains not printable characters */
        InterfaceCq m۱۱۵۴۹a(InterfaceCp.a cb) {
            if (this.f۱۱۰۵۶j == null) {
                return null;
            }
            if (this.f۱۱۰۵۷k == null) {
                this.f۱۱۰۵۷k = new android.support.v7.view.menu.Cf(this.f۱۱۰۵۸l, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg.abc_list_menu_item_layout);
                this.f۱۱۰۵۷k.mo۱۱۹۲۳a(cb);
                this.f۱۱۰۵۶j.m۱۱۷۷۸a(this.f۱۱۰۵۷k);
            }
            InterfaceCq result = this.f۱۱۰۵۷k.m۱۱۷۴۰a(this.f۱۱۰۵۳g);
            return result;
        }
    }

    /* renamed from: android.support.v7.app.h$m */
    private class m extends ContentFrameLayout {
        public m(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent event) {
            return LayoutInflaterFactory2Ch.this.m۱۱۴۸۹a(event) || super.dispatchKeyEvent(event);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            int action = event.getAction();
            if (action == 0) {
                int x = (int) event.getX();
                int y = (int) event.getY();
                if (m۱۱۵۴۸a(x, y)) {
                    LayoutInflaterFactory2Ch.this.m۱۱۵۰۲d(0);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(event);
        }

        @Override // android.view.View
        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(getContext(), resid));
        }

        /* renamed from: a, reason: contains not printable characters */
        private boolean m۱۱۵۴۸a(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    /* renamed from: android.support.v7.app.h$k */
    class k extends WindowCallbackCi {
        k(Window.Callback callback) {
            super(callback);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent event) {
            return LayoutInflaterFactory2Ch.this.m۱۱۴۸۹a(event) || super.dispatchKeyEvent(event);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || LayoutInflaterFactory2Ch.this.m۱۱۴۹۶b(event.getKeyCode(), event);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId == 0 && !(menu instanceof Ch)) {
                return false;
            }
            return super.onCreatePanelMenu(featureId, menu);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            Ch mb = menu instanceof Ch ? (Ch) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.m۱۱۷۹۷c(true);
            }
            boolean handled = super.onPreparePanel(featureId, view, menu);
            if (mb != null) {
                mb.m۱۱۷۹۷c(false);
            }
            return handled;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            LayoutInflaterFactory2Ch.this.m۱۱۵۰۸g(featureId);
            return true;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public void onPanelClosed(int featureId, Menu menu) {
            super.onPanelClosed(featureId, menu);
            LayoutInflaterFactory2Ch.this.m۱۱۵۱۰h(featureId);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflaterFactory2Ch.this.m۱۱۵۱۹q()) {
                return m۱۱۵۴۳a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* renamed from: a, reason: contains not printable characters */
        final ActionMode m۱۱۵۴۳a(ActionMode.Callback callback) {
            Cf.a callbackWrapper = new Cf.a(LayoutInflaterFactory2Ch.this.f۱۱۰۰۳d, callback);
            AbstractCb supportActionMode = LayoutInflaterFactory2Ch.this.m۱۱۴۷۱a(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.m۸۷۵۰b(supportActionMode);
            }
            return null;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (LayoutInflaterFactory2Ch.this.m۱۱۵۱۹q() && type == 0) {
                return m۱۱۵۴۳a(callback);
            }
            return super.onWindowStartingActionMode(callback, type);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            Ch ch;
            n panel = LayoutInflaterFactory2Ch.this.m۱۱۴۷۲a(0, true);
            if (panel != null && (ch = panel.f۱۱۰۵۶j) != null) {
                super.onProvideKeyboardShortcuts(data, ch, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            }
        }
    }

    /* renamed from: android.support.v7.app.h$l */
    final class l {

        /* renamed from: a, reason: contains not printable characters */
        private Cm f۱۱۰۴۰a;

        /* renamed from: b, reason: contains not printable characters */
        private boolean f۱۱۰۴۱b;

        /* renamed from: c, reason: contains not printable characters */
        private BroadcastReceiver f۱۱۰۴۲c;

        /* renamed from: d, reason: contains not printable characters */
        private IntentFilter f۱۱۰۴۳d;

        l(Cm twilightManager) {
            this.f۱۱۰۴۰a = twilightManager;
            this.f۱۱۰۴۱b = twilightManager.m۱۱۶۰۵a();
        }

        /* renamed from: c, reason: contains not printable characters */
        int m۱۱۵۴۶c() {
            this.f۱۱۰۴۱b = this.f۱۱۰۴۰a.m۱۱۶۰۵a();
            return this.f۱۱۰۴۱b ? 2 : 1;
        }

        /* renamed from: b, reason: contains not printable characters */
        void m۱۱۵۴۵b() {
            boolean isNight = this.f۱۱۰۴۰a.m۱۱۶۰۵a();
            if (isNight != this.f۱۱۰۴۱b) {
                this.f۱۱۰۴۱b = isNight;
                LayoutInflaterFactory2Ch.this.mo۱۱۴۸۶a();
            }
        }

        /* renamed from: d, reason: contains not printable characters */
        void m۱۱۵۴۷d() {
            m۱۱۵۴۴a();
            if (this.f۱۱۰۴۲c == null) {
                this.f۱۱۰۴۲c = new a();
            }
            if (this.f۱۱۰۴۳d == null) {
                this.f۱۱۰۴۳d = new IntentFilter();
                this.f۱۱۰۴۳d.addAction("android.intent.action.TIME_SET");
                this.f۱۱۰۴۳d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f۱۱۰۴۳d.addAction("android.intent.action.TIME_TICK");
            }
            LayoutInflaterFactory2Ch.this.f۱۱۰۰۳d.registerReceiver(this.f۱۱۰۴۲c, this.f۱۱۰۴۳d);
        }

        /* renamed from: android.support.v7.app.h$l$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.m۱۱۵۴۵b();
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۱۵۴۴a() {
            BroadcastReceiver broadcastReceiver = this.f۱۱۰۴۲c;
            if (broadcastReceiver != null) {
                LayoutInflaterFactory2Ch.this.f۱۱۰۰۳d.unregisterReceiver(broadcastReceiver);
                this.f۱۱۰۴۲c = null;
            }
        }
    }

    @Override // android.support.v7.app.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public final Cb.b mo۱۱۴۹۱b() {
        return new h();
    }

    /* renamed from: android.support.v7.app.h$h */
    private class h implements Cb.b {
        h() {
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: c, reason: contains not printable characters */
        public Drawable mo۱۱۵۳۵c() {
            Cj1 a2 = Cj1.m۱۳۲۷۴a(mo۱۱۵۳۱a(), (AttributeSet) null, new int[]{Ca.homeAsUpIndicator});
            Drawable result = a2.m۱۳۲۸۴b(0);
            a2.m۱۳۲۸۰a();
            return result;
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public Context mo۱۱۵۳۱a() {
            return LayoutInflaterFactory2Ch.this.m۱۱۵۱۶n();
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۵۳۴b() {
            AbstractCa ab = LayoutInflaterFactory2Ch.this.mo۱۱۵۰۱d();
            return (ab == null || (ab.mo۱۱۶۳۶g() & 4) == 0) ? false : true;
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۳a(Drawable upDrawable, int contentDescRes) {
            AbstractCa ab = LayoutInflaterFactory2Ch.this.mo۱۱۵۰۱d();
            if (ab != null) {
                ab.mo۱۱۶۲۶b(upDrawable);
                ab.mo۱۱۶۲۵b(contentDescRes);
            }
        }

        @Override // android.support.v7.app.Cb.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۵۳۲a(int contentDescRes) {
            AbstractCa ab = LayoutInflaterFactory2Ch.this.mo۱۱۵۰۱d();
            if (ab != null) {
                ab.mo۱۱۶۲۵b(contentDescRes);
            }
        }
    }
}
