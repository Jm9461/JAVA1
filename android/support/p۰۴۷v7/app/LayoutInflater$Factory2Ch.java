package android.support.p۰۴۷v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.Cv;
import android.support.p۰۴۳v4.view.AbstractCp;
import android.support.p۰۴۳v4.view.AbstractCz;
import android.support.p۰۴۳v4.view.Ca0;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Ce;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cy;
import android.support.p۰۴۷v7.app.Cb;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.AbstractCe0;
import android.support.p۰۴۷v7.widget.AbstractCk0;
import android.support.p۰۴۷v7.widget.ActionBarContextView;
import android.support.p۰۴۷v7.widget.Cj1;
import android.support.p۰۴۷v7.widget.Co1;
import android.support.p۰۴۷v7.widget.ContentFrameLayout;
import android.support.p۰۴۷v7.widget.Cr1;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.support.p۰۴۷v7.widget.ViewStubCompat;
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
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.h  reason: invalid class name */
public class LayoutInflater$Factory2Ch extends AbstractCg implements Ch.AbstractCa, LayoutInflater.Factory2 {

    /* renamed from: U  reason: contains not printable characters */
    private static final boolean f۱۰۹۸۰U = (Build.VERSION.SDK_INT < 21);

    /* renamed from: V  reason: contains not printable characters */
    private static final int[] f۱۰۹۸۱V = {16842836};

    /* renamed from: W  reason: contains not printable characters */
    private static boolean f۱۰۹۸۲W = true;

    /* renamed from: A  reason: contains not printable characters */
    boolean f۱۰۹۸۳A;

    /* renamed from: B  reason: contains not printable characters */
    boolean f۱۰۹۸۴B;

    /* renamed from: C  reason: contains not printable characters */
    boolean f۱۰۹۸۵C;

    /* renamed from: D  reason: contains not printable characters */
    boolean f۱۰۹۸۶D;

    /* renamed from: E  reason: contains not printable characters */
    boolean f۱۰۹۸۷E;

    /* renamed from: F  reason: contains not printable characters */
    private boolean f۱۰۹۸۸F;

    /* renamed from: G  reason: contains not printable characters */
    private Cn[] f۱۰۹۸۹G;

    /* renamed from: H  reason: contains not printable characters */
    private Cn f۱۰۹۹۰H;

    /* renamed from: I  reason: contains not printable characters */
    private boolean f۱۰۹۹۱I;

    /* renamed from: J  reason: contains not printable characters */
    boolean f۱۰۹۹۲J;

    /* renamed from: K  reason: contains not printable characters */
    private int f۱۰۹۹۳K = -100;

    /* renamed from: L  reason: contains not printable characters */
    private boolean f۱۰۹۹۴L;

    /* renamed from: M  reason: contains not printable characters */
    private Cl f۱۰۹۹۵M;

    /* renamed from: N  reason: contains not printable characters */
    boolean f۱۰۹۹۶N;

    /* renamed from: O  reason: contains not printable characters */
    int f۱۰۹۹۷O;

    /* renamed from: P  reason: contains not printable characters */
    private final Runnable f۱۰۹۹۸P = new RunnableCb();

    /* renamed from: Q  reason: contains not printable characters */
    private boolean f۱۰۹۹۹Q;

    /* renamed from: R  reason: contains not printable characters */
    private Rect f۱۱۰۰۰R;

    /* renamed from: S  reason: contains not printable characters */
    private Rect f۱۱۰۰۱S;

    /* renamed from: T  reason: contains not printable characters */
    private AppCompatViewInflater f۱۱۰۰۲T;

    /* renamed from: d  reason: contains not printable characters */
    final Context f۱۱۰۰۳d;

    /* renamed from: e  reason: contains not printable characters */
    final Window f۱۱۰۰۴e;

    /* renamed from: f  reason: contains not printable characters */
    final Window.Callback f۱۱۰۰۵f;

    /* renamed from: g  reason: contains not printable characters */
    final Window.Callback f۱۱۰۰۶g;

    /* renamed from: h  reason: contains not printable characters */
    final AbstractCf f۱۱۰۰۷h;

    /* renamed from: i  reason: contains not printable characters */
    AbstractCa f۱۱۰۰۸i;

    /* renamed from: j  reason: contains not printable characters */
    MenuInflater f۱۱۰۰۹j;

    /* renamed from: k  reason: contains not printable characters */
    private CharSequence f۱۱۰۱۰k;

    /* renamed from: l  reason: contains not printable characters */
    private AbstractCe0 f۱۱۰۱۱l;

    /* renamed from: m  reason: contains not printable characters */
    private Ci f۱۱۰۱۲m;

    /* renamed from: n  reason: contains not printable characters */
    private Co f۱۱۰۱۳n;

    /* renamed from: o  reason: contains not printable characters */
    AbstractCb f۱۱۰۱۴o;

    /* renamed from: p  reason: contains not printable characters */
    ActionBarContextView f۱۱۰۱۵p;

    /* renamed from: q  reason: contains not printable characters */
    PopupWindow f۱۱۰۱۶q;

    /* renamed from: r  reason: contains not printable characters */
    Runnable f۱۱۰۱۷r;

    /* renamed from: s  reason: contains not printable characters */
    Cy f۱۱۰۱۸s = null;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۰۱۹t = true;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۱۰۲۰u;

    /* renamed from: v  reason: contains not printable characters */
    private ViewGroup f۱۱۰۲۱v;

    /* renamed from: w  reason: contains not printable characters */
    private TextView f۱۱۰۲۲w;

    /* renamed from: x  reason: contains not printable characters */
    private View f۱۱۰۲۳x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۱۰۲۴y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۱۰۲۵z;

    static {
        if (f۱۰۹۸۰U && !f۱۰۹۸۲W) {
            Thread.setDefaultUncaughtExceptionHandler(new Ca(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* renamed from: android.support.v7.app.h$a  reason: invalid class name */
    static class Ca implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Thread.UncaughtExceptionHandler f۱۱۰۲۶a;

        Ca(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f۱۱۰۲۶a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable thowable) {
            if (m۱۳۵۹۳a(thowable)) {
                Throwable wrapped = new Resources.NotFoundException(thowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                wrapped.initCause(thowable.getCause());
                wrapped.setStackTrace(thowable.getStackTrace());
                this.f۱۱۰۲۶a.uncaughtException(thread, wrapped);
                return;
            }
            this.f۱۱۰۲۶a.uncaughtException(thread, thowable);
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۳۵۹۳a(Throwable throwable) {
            String message;
            if (!(throwable instanceof Resources.NotFoundException) || (message = throwable.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.app.h$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            LayoutInflater$Factory2Ch hVar = LayoutInflater$Factory2Ch.this;
            if ((hVar.f۱۰۹۹۷O & 1) != 0) {
                hVar.m۱۳۵۷۴e(0);
            }
            LayoutInflater$Factory2Ch hVar2 = LayoutInflater$Factory2Ch.this;
            if ((hVar2.f۱۰۹۹۷O & 4096) != 0) {
                hVar2.m۱۳۵۷۴e(108);
            }
            LayoutInflater$Factory2Ch hVar3 = LayoutInflater$Factory2Ch.this;
            hVar3.f۱۰۹۹۶N = false;
            hVar3.f۱۰۹۹۷O = 0;
        }
    }

    LayoutInflater$Factory2Ch(Context context, Window window, AbstractCf callback) {
        this.f۱۱۰۰۳d = context;
        this.f۱۱۰۰۴e = window;
        this.f۱۱۰۰۷h = callback;
        this.f۱۱۰۰۵f = this.f۱۱۰۰۴e.getCallback();
        Window.Callback callback2 = this.f۱۱۰۰۵f;
        if (!(callback2 instanceof Ck)) {
            this.f۱۱۰۰۶g = new Ck(callback2);
            this.f۱۱۰۰۴e.setCallback(this.f۱۱۰۰۶g);
            Cj1 a = Cj1.m۱۵۳۴۴a(context, (AttributeSet) null, f۱۰۹۸۱V);
            Drawable winBg = a.m۱۵۳۵۶c(0);
            if (winBg != null) {
                this.f۱۱۰۰۴e.setBackgroundDrawable(winBg);
            }
            a.m۱۵۳۵۰a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۴۸a(Bundle savedInstanceState) {
        Window.Callback callback = this.f۱۱۰۰۵f;
        if (callback instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = Cv.m۱۲۵۶۲b((Activity) callback);
            } catch (IllegalArgumentException e) {
            }
            if (parentActivityName != null) {
                AbstractCa ab = m۱۳۵۹۱s();
                if (ab == null) {
                    this.f۱۰۹۹۹Q = true;
                } else {
                    ab.m۱۳۴۲۱c(true);
                }
            }
        }
        if (savedInstanceState != null && this.f۱۰۹۹۳K == -100) {
            this.f۱۰۹۹۳K = savedInstanceState.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۵۶۲b(Bundle savedInstanceState) {
        m۱۳۵۳۸x();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: d  reason: contains not printable characters */
    public AbstractCa m۱۳۵۷۱d() {
        m۱۳۵۴۰z();
        return this.f۱۱۰۰۸i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s  reason: contains not printable characters */
    public final AbstractCa m۱۳۵۹۱s() {
        return this.f۱۱۰۰۸i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public final Window.Callback m۱۳۵۸۸p() {
        return this.f۱۱۰۰۴e.getCallback();
    }

    /* renamed from: z  reason: contains not printable characters */
    private void m۱۳۵۴۰z() {
        m۱۳۵۳۸x();
        if (this.f۱۰۹۸۳A && this.f۱۱۰۰۸i == null) {
            Window.Callback callback = this.f۱۱۰۰۵f;
            if (callback instanceof Activity) {
                this.f۱۱۰۰۸i = new Cn((Activity) callback, this.f۱۰۹۸۴B);
            } else if (callback instanceof Dialog) {
                this.f۱۱۰۰۸i = new Cn((Dialog) callback);
            }
            AbstractCa aVar = this.f۱۱۰۰۸i;
            if (aVar != null) {
                aVar.m۱۳۴۲۱c(this.f۱۰۹۹۹Q);
            }
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۵۱a(Toolbar toolbar) {
        if (this.f۱۱۰۰۵f instanceof Activity) {
            AbstractCa ab = m۱۳۵۷۱d();
            if (!(ab instanceof Cn)) {
                this.f۱۱۰۰۹j = null;
                if (ab != null) {
                    ab.m۱۳۴۳۱j();
                }
                if (toolbar != null) {
                    Ck tbab = new Ck(toolbar, ((Activity) this.f۱۱۰۰۵f).getTitle(), this.f۱۱۰۰۶g);
                    this.f۱۱۰۰۸i = tbab;
                    this.f۱۱۰۰۴e.setCallback(tbab.m۱۳۶۶۲l());
                } else {
                    this.f۱۱۰۰۸i = null;
                    this.f۱۱۰۰۴e.setCallback(this.f۱۱۰۰۶g);
                }
                m۱۳۵۷۶f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n  reason: contains not printable characters */
    public final Context m۱۳۵۸۶n() {
        Context context = null;
        AbstractCa ab = m۱۳۵۷۱d();
        if (ab != null) {
            context = ab.m۱۳۴۲۹h();
        }
        if (context == null) {
            return this.f۱۱۰۰۳d;
        }
        return context;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: c  reason: contains not printable characters */
    public MenuInflater m۱۳۵۶۷c() {
        if (this.f۱۱۰۰۹j == null) {
            m۱۳۵۴۰z();
            AbstractCa aVar = this.f۱۱۰۰۸i;
            this.f۱۱۰۰۹j = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cg(aVar != null ? aVar.m۱۳۴۲۹h() : this.f۱۱۰۰۳d);
        }
        return this.f۱۱۰۰۹j;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public <T extends View> T m۱۳۵۴۴a(int id) {
        m۱۳۵۳۸x();
        return (T) this.f۱۱۰۰۴e.findViewById(id);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۴۷a(Configuration newConfig) {
        AbstractCa ab;
        if (this.f۱۰۹۸۳A && this.f۱۱۰۲۰u && (ab = m۱۳۵۷۱d()) != null) {
            ab.m۱۳۴۱۲a(newConfig);
        }
        android.support.p۰۴۷v7.widget.Cj.m۱۵۲۸۷a().m۱۵۳۰۹a(this.f۱۱۰۰۳d);
        m۱۳۵۵۶a();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۳۵۸۲i() {
        m۱۳۵۵۶a();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۳۵۸۳j() {
        AbstractCa ab = m۱۳۵۷۱d();
        if (ab != null) {
            ab.m۱۳۴۲۸g(false);
        }
        Cl lVar = this.f۱۰۹۹۵M;
        if (lVar != null) {
            lVar.m۱۳۶۱۴a();
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۳۵۷۹h() {
        AbstractCa ab = m۱۳۵۷۱d();
        if (ab != null) {
            ab.m۱۳۴۲۸g(true);
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۵۲a(View v) {
        m۱۳۵۳۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۵۶۸c(int resId) {
        m۱۳۵۳۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f۱۱۰۰۳d).inflate(resId, contentParent);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۵۶۴b(View v, ViewGroup.LayoutParams lp) {
        m۱۳۵۳۸x();
        ViewGroup contentParent = (ViewGroup) this.f۱۱۰۲۱v.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v, lp);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۵۳a(View v, ViewGroup.LayoutParams lp) {
        m۱۳۵۳۸x();
        ((ViewGroup) this.f۱۱۰۲۱v.findViewById(16908290)).addView(v, lp);
        this.f۱۱۰۰۵f.onContentChanged();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۵۶۹c(Bundle outState) {
        int i = this.f۱۰۹۹۳K;
        if (i != -100) {
            outState.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۳۵۷۷g() {
        if (this.f۱۰۹۹۶N) {
            this.f۱۱۰۰۴e.getDecorView().removeCallbacks(this.f۱۰۹۹۸P);
        }
        this.f۱۰۹۹۲J = true;
        AbstractCa aVar = this.f۱۱۰۰۸i;
        if (aVar != null) {
            aVar.m۱۳۴۳۱j();
        }
        Cl lVar = this.f۱۰۹۹۵M;
        if (lVar != null) {
            lVar.m۱۳۶۱۴a();
        }
    }

    /* renamed from: x  reason: contains not printable characters */
    private void m۱۳۵۳۸x() {
        if (!this.f۱۱۰۲۰u) {
            this.f۱۱۰۲۱v = m۱۳۵۳۶v();
            CharSequence title = m۱۳۵۸۷o();
            if (!TextUtils.isEmpty(title)) {
                AbstractCe0 e0Var = this.f۱۱۰۱۱l;
                if (e0Var != null) {
                    e0Var.setWindowTitle(title);
                } else if (m۱۳۵۹۱s() != null) {
                    m۱۳۵۹۱s().m۱۳۴۱۹b(title);
                } else {
                    TextView textView = this.f۱۱۰۲۲w;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            m۱۳۵۳۵u();
            m۱۳۵۵۴a(this.f۱۱۰۲۱v);
            this.f۱۱۰۲۰u = true;
            Cn st = m۱۳۵۴۲a(0, false);
            if (this.f۱۰۹۹۲J) {
                return;
            }
            if (st == null || st.f۱۱۰۵۶j == null) {
                m۱۳۵۳۲j(108);
            }
        }
    }

    /* renamed from: v  reason: contains not printable characters */
    private ViewGroup m۱۳۵۳۶v() {
        Context themedContext;
        TypedArray a = this.f۱۱۰۰۳d.obtainStyledAttributes(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme);
        if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowActionBar)) {
            if (a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowNoTitle, false)) {
                m۱۳۵۶۵b(1);
            } else if (a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowActionBar, false)) {
                m۱۳۵۶۵b(108);
            }
            if (a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowActionBarOverlay, false)) {
                m۱۳۵۶۵b(109);
            }
            if (a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowActionModeOverlay, false)) {
                m۱۳۵۶۵b(10);
            }
            this.f۱۰۹۸۶D = a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_android_windowIsFloating, false);
            a.recycle();
            this.f۱۱۰۰۴e.getDecorView();
            LayoutInflater inflater = LayoutInflater.from(this.f۱۱۰۰۳d);
            ViewGroup subDecor = null;
            if (this.f۱۰۹۸۷E) {
                if (this.f۱۰۹۸۵C) {
                    subDecor = (ViewGroup) inflater.inflate(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    subDecor = (ViewGroup) inflater.inflate(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    Cu.m۱۲۹۸۷a(subDecor, new Cc());
                } else {
                    ((AbstractCk0) subDecor).setOnFitSystemWindowsListener(new Cd());
                }
            } else if (this.f۱۰۹۸۶D) {
                subDecor = (ViewGroup) inflater.inflate(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_dialog_title_material, (ViewGroup) null);
                this.f۱۰۹۸۴B = false;
                this.f۱۰۹۸۳A = false;
            } else if (this.f۱۰۹۸۳A) {
                TypedValue outValue = new TypedValue();
                this.f۱۱۰۰۳d.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarTheme, outValue, true);
                int i = outValue.resourceId;
                if (i != 0) {
                    themedContext = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cd(this.f۱۱۰۰۳d, i);
                } else {
                    themedContext = this.f۱۱۰۰۳d;
                }
                subDecor = (ViewGroup) LayoutInflater.from(themedContext).inflate(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_screen_toolbar, (ViewGroup) null);
                this.f۱۱۰۱۱l = (AbstractCe0) subDecor.findViewById(Cf.decor_content_parent);
                this.f۱۱۰۱۱l.setWindowCallback(m۱۳۵۸۸p());
                if (this.f۱۰۹۸۴B) {
                    this.f۱۱۰۱۱l.m۱۵۱۸۱a(109);
                }
                if (this.f۱۱۰۲۴y) {
                    this.f۱۱۰۱۱l.m۱۵۱۸۱a(2);
                }
                if (this.f۱۱۰۲۵z) {
                    this.f۱۱۰۱۱l.m۱۵۱۸۱a(5);
                }
            }
            if (subDecor != null) {
                if (this.f۱۱۰۱۱l == null) {
                    this.f۱۱۰۲۲w = (TextView) subDecor.findViewById(Cf.title);
                }
                Cr1.m۱۵۵۶۸b(subDecor);
                ContentFrameLayout contentView = (ContentFrameLayout) subDecor.findViewById(Cf.action_bar_activity_content);
                ViewGroup windowContentView = (ViewGroup) this.f۱۱۰۰۴e.findViewById(16908290);
                if (windowContentView != null) {
                    while (windowContentView.getChildCount() > 0) {
                        View child = windowContentView.getChildAt(0);
                        windowContentView.removeViewAt(0);
                        contentView.addView(child);
                    }
                    windowContentView.setId(-1);
                    contentView.setId(16908290);
                    if (windowContentView instanceof FrameLayout) {
                        ((FrameLayout) windowContentView).setForeground(null);
                    }
                }
                this.f۱۱۰۰۴e.setContentView(subDecor);
                contentView.setAttachListener(new Ce());
                return subDecor;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f۱۰۹۸۳A + ", windowActionBarOverlay: " + this.f۱۰۹۸۴B + ", android:windowIsFloating: " + this.f۱۰۹۸۶D + ", windowActionModeOverlay: " + this.f۱۰۹۸۵C + ", windowNoTitle: " + this.f۱۰۹۸۷E + " }");
        }
        a.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$c  reason: invalid class name */
    public class Cc implements AbstractCp {
        Cc() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public Cc0 m۱۳۵۹۴a(View v, Cc0 insets) {
            int top = insets.m۱۲۸۲۲e();
            int newTop = LayoutInflater$Factory2Ch.this.m۱۳۵۸۱i(top);
            if (top != newTop) {
                insets = insets.m۱۲۸۱۸a(insets.m۱۲۸۲۰c(), newTop, insets.m۱۲۸۲۱d(), insets.m۱۲۸۱۹b());
            }
            return Cu.m۱۲۹۹۶b(v, insets);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$d  reason: invalid class name */
    public class Cd implements AbstractCk0.AbstractCa {
        Cd() {
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCk0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۵۹۵a(Rect insets) {
            insets.top = LayoutInflater$Factory2Ch.this.m۱۳۵۸۱i(insets.top);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$e  reason: invalid class name */
    public class Ce implements ContentFrameLayout.AbstractCa {
        Ce() {
        }

        @Override // android.support.p۰۴۷v7.widget.ContentFrameLayout.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۵۹۶a() {
        }

        @Override // android.support.p۰۴۷v7.widget.ContentFrameLayout.AbstractCa
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2Ch.this.m۱۳۵۸۴l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۵۴a(ViewGroup subDecor) {
    }

    /* renamed from: u  reason: contains not printable characters */
    private void m۱۳۵۳۵u() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.f۱۱۰۲۱v.findViewById(16908290);
        View windowDecor = this.f۱۱۰۰۴e.getDecorView();
        cfl.m۱۴۰۸۹a(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a = this.f۱۱۰۰۳d.obtainStyledAttributes(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme);
        a.getValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a.getValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedWidthMajor)) {
            a.getValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedWidthMinor)) {
            a.getValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedHeightMajor)) {
            a.getValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedHeightMinor)) {
            a.getValue(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a.recycle();
        cfl.requestLayout();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۵۶۵b(int featureId) {
        int featureId2 = m۱۳۵۳۳k(featureId);
        if (this.f۱۰۹۸۷E && featureId2 == 108) {
            return false;
        }
        if (this.f۱۰۹۸۳A && featureId2 == 1) {
            this.f۱۰۹۸۳A = false;
        }
        if (featureId2 == 1) {
            m۱۳۵۲۱B();
            this.f۱۰۹۸۷E = true;
            return true;
        } else if (featureId2 == 2) {
            m۱۳۵۲۱B();
            this.f۱۱۰۲۴y = true;
            return true;
        } else if (featureId2 == 5) {
            m۱۳۵۲۱B();
            this.f۱۱۰۲۵z = true;
            return true;
        } else if (featureId2 == 10) {
            m۱۳۵۲۱B();
            this.f۱۰۹۸۵C = true;
            return true;
        } else if (featureId2 == 108) {
            m۱۳۵۲۱B();
            this.f۱۰۹۸۳A = true;
            return true;
        } else if (featureId2 != 109) {
            return this.f۱۱۰۰۴e.requestFeature(featureId2);
        } else {
            m۱۳۵۲۱B();
            this.f۱۰۹۸۴B = true;
            return true;
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۳۵۵۵a(CharSequence title) {
        this.f۱۱۰۱۰k = title;
        AbstractCe0 e0Var = this.f۱۱۰۱۱l;
        if (e0Var != null) {
            e0Var.setWindowTitle(title);
        } else if (m۱۳۵۹۱s() != null) {
            m۱۳۵۹۱s().m۱۳۴۱۹b(title);
        } else {
            TextView textView = this.f۱۱۰۲۲w;
            if (textView != null) {
                textView.setText(title);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o  reason: contains not printable characters */
    public final CharSequence m۱۳۵۸۷o() {
        Window.Callback callback = this.f۱۱۰۰۵f;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.f۱۱۰۱۰k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۳۵۸۰h(int featureId) {
        if (featureId == 108) {
            AbstractCa ab = m۱۳۵۷۱d();
            if (ab != null) {
                ab.m۱۳۴۲۰b(false);
            }
        } else if (featureId == 0) {
            Cn st = m۱۳۵۴۲a(featureId, true);
            if (st.f۱۱۰۶۱o) {
                m۱۳۵۴۹a(st, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۳۵۷۸g(int featureId) {
        AbstractCa ab;
        if (featureId == 108 && (ab = m۱۳۵۷۱d()) != null) {
            ab.m۱۳۴۲۰b(true);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۵۵۸a(android.support.p۰۴۷v7.view.menu.Ch menu, MenuItem item) {
        Cn panel;
        Window.Callback cb = m۱۳۵۸۸p();
        if (cb == null || this.f۱۰۹۹۲J || (panel = m۱۳۵۴۳a((Menu) menu.m۱۳۸۸۱m())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.f۱۱۰۴۷a, item);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۵۰a(android.support.p۰۴۷v7.view.menu.Ch menu) {
        m۱۳۵۲۳a(menu, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb m۱۳۵۴۱a(AbstractCb.AbstractCa callback) {
        AbstractCf fVar;
        if (callback != null) {
            AbstractCb bVar = this.f۱۱۰۱۴o;
            if (bVar != null) {
                bVar.m۱۰۷۷۲a();
            }
            AbstractCb.AbstractCa wrappedCallback = new Cj(callback);
            AbstractCa ab = m۱۳۵۷۱d();
            if (ab != null) {
                this.f۱۱۰۱۴o = ab.m۱۳۴۱۰a(wrappedCallback);
                AbstractCb bVar2 = this.f۱۱۰۱۴o;
                if (!(bVar2 == null || (fVar = this.f۱۱۰۰۷h) == null)) {
                    fVar.m۱۳۴۹۴b(bVar2);
                }
            }
            if (this.f۱۱۰۱۴o == null) {
                this.f۱۱۰۱۴o = m۱۳۵۶۰b(wrappedCallback);
            }
            return this.f۱۱۰۱۴o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۳۵۷۶f() {
        AbstractCa ab = m۱۳۵۷۱d();
        if (ab == null || !ab.m۱۳۴۳۰i()) {
            m۱۳۵۳۲j(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public AbstractCb m۱۳۵۶۰b(AbstractCb.AbstractCa callback) {
        AbstractCf fVar;
        Context actionBarContext;
        m۱۳۵۸۵m();
        AbstractCb bVar = this.f۱۱۰۱۴o;
        if (bVar != null) {
            bVar.m۱۰۷۷۲a();
        }
        if (!(callback instanceof Cj)) {
            callback = new Cj(callback);
        }
        AbstractCb mode = null;
        AbstractCf fVar2 = this.f۱۱۰۰۷h;
        if (fVar2 != null && !this.f۱۰۹۹۲J) {
            try {
                mode = fVar2.m۱۳۴۹۲a(callback);
            } catch (AbstractMethodError e) {
            }
        }
        if (mode != null) {
            this.f۱۱۰۱۴o = mode;
        } else {
            boolean z = true;
            if (this.f۱۱۰۱۵p == null) {
                if (this.f۱۰۹۸۶D) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f۱۱۰۰۳d.getTheme();
                    baseTheme.resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f۱۱۰۰۳d.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cd dVar = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cd(this.f۱۱۰۰۳d, 0);
                        dVar.getTheme().setTo(actionBarTheme);
                        actionBarContext = dVar;
                    } else {
                        actionBarContext = this.f۱۱۰۰۳d;
                    }
                    this.f۱۱۰۱۵p = new ActionBarContextView(actionBarContext);
                    this.f۱۱۰۱۶q = new PopupWindow(actionBarContext, (AttributeSet) null, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionModePopupWindowStyle);
                    android.support.p۰۴۳v4.widget.Cn.m۱۳۲۹۳a(this.f۱۱۰۱۶q, 2);
                    this.f۱۱۰۱۶q.setContentView(this.f۱۱۰۱۵p);
                    this.f۱۱۰۱۶q.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarSize, outValue, true);
                    this.f۱۱۰۱۵p.setContentHeight(TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics()));
                    this.f۱۱۰۱۶q.setHeight(-2);
                    this.f۱۱۰۱۷r = new RunnableCf();
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.f۱۱۰۲۱v.findViewById(Cf.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(m۱۳۵۸۶n()));
                        this.f۱۱۰۱۵p = (ActionBarContextView) stub.m۱۴۹۵۸a();
                    }
                }
            }
            if (this.f۱۱۰۱۵p != null) {
                m۱۳۵۸۵m();
                this.f۱۱۰۱۵p.m۱۴۰۲۴c();
                Context context = this.f۱۱۰۱۵p.getContext();
                ActionBarContextView actionBarContextView = this.f۱۱۰۱۵p;
                if (this.f۱۱۰۱۶q != null) {
                    z = false;
                }
                p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ce eVar = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ce(context, actionBarContextView, callback, z);
                if (callback.m۱۰۷۹۰a(eVar, eVar.m۱۰۸۰۹c())) {
                    eVar.m۱۰۸۱۳i();
                    this.f۱۱۰۱۵p.m۱۴۰۲۲a(eVar);
                    this.f۱۱۰۱۴o = eVar;
                    if (m۱۳۵۹۲t()) {
                        this.f۱۱۰۱۵p.setAlpha(0.0f);
                        Cy a = Cu.m۱۲۹۷۶a(this.f۱۱۰۱۵p);
                        a.m۱۳۰۵۳a(1.0f);
                        this.f۱۱۰۱۸s = a;
                        this.f۱۱۰۱۸s.m۱۳۰۵۶a(new Cg());
                    } else {
                        this.f۱۱۰۱۵p.setAlpha(1.0f);
                        this.f۱۱۰۱۵p.setVisibility(0);
                        this.f۱۱۰۱۵p.sendAccessibilityEvent(32);
                        if (this.f۱۱۰۱۵p.getParent() instanceof View) {
                            Cu.m۱۲۹۷۱C((View) this.f۱۱۰۱۵p.getParent());
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
        AbstractCb bVar2 = this.f۱۱۰۱۴o;
        if (!(bVar2 == null || (fVar = this.f۱۱۰۰۷h) == null)) {
            fVar.m۱۳۴۹۴b(bVar2);
        }
        return this.f۱۱۰۱۴o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$f  reason: invalid class name */
    public class RunnableCf implements Runnable {
        RunnableCf() {
        }

        public void run() {
            LayoutInflater$Factory2Ch hVar = LayoutInflater$Factory2Ch.this;
            hVar.f۱۱۰۱۶q.showAtLocation(hVar.f۱۱۰۱۵p, 55, 0, 0);
            LayoutInflater$Factory2Ch.this.m۱۳۵۸۵m();
            if (LayoutInflater$Factory2Ch.this.m۱۳۵۹۲t()) {
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setAlpha(0.0f);
                LayoutInflater$Factory2Ch hVar2 = LayoutInflater$Factory2Ch.this;
                Cy a = Cu.m۱۲۹۷۶a(hVar2.f۱۱۰۱۵p);
                a.m۱۳۰۵۳a(1.0f);
                hVar2.f۱۱۰۱۸s = a;
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s.m۱۳۰۵۶a(new Ca());
                return;
            }
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setAlpha(1.0f);
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setVisibility(0);
        }

        /* renamed from: android.support.v7.app.h$f$a  reason: invalid class name */
        class Ca extends Ca0 {
            Ca() {
            }

            @Override // android.support.p۰۴۳v4.view.Ca0, android.support.p۰۴۳v4.view.AbstractCz
            /* renamed from: b  reason: contains not printable characters */
            public void m۱۳۵۹۸b(View view) {
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setVisibility(0);
            }

            @Override // android.support.p۰۴۳v4.view.AbstractCz
            /* renamed from: a  reason: contains not printable characters */
            public void m۱۳۵۹۷a(View view) {
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setAlpha(1.0f);
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s.m۱۳۰۵۶a((AbstractCz) null);
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$g  reason: invalid class name */
    public class Cg extends Ca0 {
        Cg() {
        }

        @Override // android.support.p۰۴۳v4.view.Ca0, android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۶۰۰b(View view) {
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setVisibility(0);
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.getParent() instanceof View) {
                Cu.m۱۲۹۷۱C((View) LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.getParent());
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۵۹۹a(View view) {
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setAlpha(1.0f);
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s.m۱۳۰۵۶a((AbstractCz) null);
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t  reason: contains not printable characters */
    public final boolean m۱۳۵۹۲t() {
        ViewGroup viewGroup;
        return this.f۱۱۰۲۰u && (viewGroup = this.f۱۱۰۲۱v) != null && Cu.m۱۳۰۲۸y(viewGroup);
    }

    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۳۵۸۹q() {
        return this.f۱۱۰۱۹t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public void m۱۳۵۸۵m() {
        Cy yVar = this.f۱۱۰۱۸s;
        if (yVar != null) {
            yVar.m۱۳۰۵۸a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r  reason: contains not printable characters */
    public boolean m۱۳۵۹۰r() {
        AbstractCb bVar = this.f۱۱۰۱۴o;
        if (bVar != null) {
            bVar.m۱۰۷۷۲a();
            return true;
        }
        AbstractCa ab = m۱۳۵۷۱d();
        if (ab == null || !ab.m۱۳۴۲۶f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۵۶۶b(int keyCode, KeyEvent ev) {
        AbstractCa ab = m۱۳۵۷۱d();
        if (ab != null && ab.m۱۳۴۱۵a(keyCode, ev)) {
            return true;
        }
        Cn nVar = this.f۱۰۹۹۰H;
        if (nVar == null || !m۱۳۵۲۵a(nVar, ev.getKeyCode(), ev, 1)) {
            if (this.f۱۰۹۹۰H == null) {
                Cn st = m۱۳۵۴۲a(0, true);
                m۱۳۵۲۸b(st, ev);
                boolean handled = m۱۳۵۲۵a(st, ev.getKeyCode(), ev, 1);
                st.f۱۱۰۵۹m = false;
                if (handled) {
                    return true;
                }
            }
            return false;
        }
        Cn nVar2 = this.f۱۰۹۹۰H;
        if (nVar2 != null) {
            nVar2.f۱۱۰۶۰n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۵۵۹a(KeyEvent event) {
        View root;
        Window.Callback callback = this.f۱۱۰۰۵f;
        boolean isDown = true;
        if (((callback instanceof Ce.AbstractCa) || (callback instanceof DialogCi)) && (root = this.f۱۱۰۰۴e.getDecorView()) != null && android.support.p۰۴۳v4.view.Ce.m۱۲۹۰۸a(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.f۱۱۰۰۵f.dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        if (event.getAction() != 0) {
            isDown = false;
        }
        return isDown ? m۱۳۵۵۷a(keyCode, event) : m۱۳۵۷۰c(keyCode, event);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۳۵۷۰c(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            boolean wasLongPressBackDown = this.f۱۰۹۹۱I;
            this.f۱۰۹۹۱I = false;
            Cn st = m۱۳۵۴۲a(0, false);
            if (st != null && st.f۱۱۰۶۱o) {
                if (!wasLongPressBackDown) {
                    m۱۳۵۴۹a(st, true);
                }
                return true;
            } else if (m۱۳۵۹۰r()) {
                return true;
            }
        } else if (keyCode == 82) {
            m۱۳۵۳۱e(0, event);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۵۵۷a(int keyCode, KeyEvent event) {
        boolean z = true;
        if (keyCode == 4) {
            if ((event.getFlags() & 128) == 0) {
                z = false;
            }
            this.f۱۰۹۹۱I = z;
        } else if (keyCode == 82) {
            m۱۳۵۳۰d(0, event);
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۳۵۴۵a(View parent, String name, Context context, AttributeSet attrs) {
        boolean z = false;
        if (this.f۱۱۰۰۲T == null) {
            String viewInflaterClassName = this.f۱۱۰۰۳d.obtainStyledAttributes(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme).getString(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_viewInflaterClass);
            if (viewInflaterClassName == null || AppCompatViewInflater.class.getName().equals(viewInflaterClassName)) {
                this.f۱۱۰۰۲T = new AppCompatViewInflater();
            } else {
                try {
                    this.f۱۱۰۰۲T = (AppCompatViewInflater) Class.forName(viewInflaterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t);
                    this.f۱۱۰۰۲T = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        if (f۱۰۹۸۰U) {
            if (!(attrs instanceof XmlPullParser)) {
                z = m۱۳۵۲۶a((ViewParent) parent);
            } else if (((XmlPullParser) attrs).getDepth() > 1) {
                z = true;
            }
            inheritContext = z;
        }
        return this.f۱۱۰۰۲T.createView(parent, name, context, attrs, inheritContext, f۱۰۹۸۰U, true, Co1.m۱۵۴۷۹b());
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۵۲۶a(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.f۱۱۰۰۴e.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || Cu.m۱۳۰۲۷x((View) parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۳۵۷۳e() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f۱۱۰۰۳d);
        if (layoutInflater.getFactory() == null) {
            android.support.p۰۴۳v4.view.Cf.m۱۲۹۱۲b(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof LayoutInflater$Factory2Ch)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return m۱۳۵۴۵a(parent, name, context, attrs);
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۵۲۲a(Cn st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        if (!st.f۱۱۰۶۱o && !this.f۱۰۹۹۲J) {
            if (st.f۱۱۰۴۷a == 0) {
                if ((this.f۱۱۰۰۳d.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback cb = m۱۳۵۸۸p();
            if (cb == null || cb.onMenuOpened(st.f۱۱۰۴۷a, st.f۱۱۰۵۶j)) {
                WindowManager wm = (WindowManager) this.f۱۱۰۰۳d.getSystemService("window");
                if (wm != null && m۱۳۵۲۸b(st, event)) {
                    int width = -2;
                    if (st.f۱۱۰۵۳g == null || st.f۱۱۰۶۳q) {
                        ViewGroup viewGroup = st.f۱۱۰۵۳g;
                        if (viewGroup == null) {
                            if (!m۱۳۵۲۷b(st) || st.f۱۱۰۵۳g == null) {
                                return;
                            }
                        } else if (st.f۱۱۰۶۳q && viewGroup.getChildCount() > 0) {
                            st.f۱۱۰۵۳g.removeAllViews();
                        }
                        if (m۱۳۵۲۴a(st) && st.m۱۳۶۲۲a()) {
                            ViewGroup.LayoutParams lp2 = st.f۱۱۰۵۴h.getLayoutParams();
                            if (lp2 == null) {
                                lp2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            st.f۱۱۰۵۳g.setBackgroundResource(st.f۱۱۰۴۸b);
                            ViewParent shownPanelParent = st.f۱۱۰۵۴h.getParent();
                            if (shownPanelParent != null && (shownPanelParent instanceof ViewGroup)) {
                                ((ViewGroup) shownPanelParent).removeView(st.f۱۱۰۵۴h);
                            }
                            st.f۱۱۰۵۳g.addView(st.f۱۱۰۵۴h, lp2);
                            if (!st.f۱۱۰۵۴h.hasFocus()) {
                                st.f۱۱۰۵۴h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = st.f۱۱۰۵۵i;
                        if (!(view == null || (lp = view.getLayoutParams()) == null || lp.width != -1)) {
                            width = -1;
                        }
                    }
                    st.f۱۱۰۶۰n = false;
                    WindowManager.LayoutParams lp3 = new WindowManager.LayoutParams(width, -2, st.f۱۱۰۵۰d, st.f۱۱۰۵۱e, 1002, 8519680, -3);
                    lp3.gravity = st.f۱۱۰۴۹c;
                    lp3.windowAnimations = st.f۱۱۰۵۲f;
                    wm.addView(st.f۱۱۰۵۳g, lp3);
                    st.f۱۱۰۶۱o = true;
                    return;
                }
                return;
            }
            m۱۳۵۴۹a(st, true);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۳۵۲۷b(Cn st) {
        st.m۱۳۶۲۰a(m۱۳۵۸۶n());
        st.f۱۱۰۵۳g = new Cm(st.f۱۱۰۵۸l);
        st.f۱۱۰۴۹c = 81;
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۵۲۳a(android.support.p۰۴۷v7.view.menu.Ch menu, boolean toggleMenuMode) {
        AbstractCe0 e0Var = this.f۱۱۰۱۱l;
        if (e0Var == null || !e0Var.m۱۵۱۸۸f() || (ViewConfiguration.get(this.f۱۱۰۰۳d).hasPermanentMenuKey() && !this.f۱۱۰۱۱l.m۱۵۱۸۳a())) {
            Cn st = m۱۳۵۴۲a(0, true);
            st.f۱۱۰۶۳q = true;
            m۱۳۵۴۹a(st, false);
            m۱۳۵۲۲a(st, (KeyEvent) null);
            return;
        }
        Window.Callback cb = m۱۳۵۸۸p();
        if (this.f۱۱۰۱۱l.m۱۵۱۸۴b() && toggleMenuMode) {
            this.f۱۱۰۱۱l.m۱۵۱۸۵c();
            if (!this.f۱۰۹۹۲J) {
                cb.onPanelClosed(108, m۱۳۵۴۲a(0, true).f۱۱۰۵۶j);
            }
        } else if (cb != null && !this.f۱۰۹۹۲J) {
            if (this.f۱۰۹۹۶N && (this.f۱۰۹۹۷O & 1) != 0) {
                this.f۱۱۰۰۴e.getDecorView().removeCallbacks(this.f۱۰۹۹۸P);
                this.f۱۰۹۹۸P.run();
            }
            Cn st2 = m۱۳۵۴۲a(0, true);
            android.support.p۰۴۷v7.view.menu.Ch hVar = st2.f۱۱۰۵۶j;
            if (hVar != null && !st2.f۱۱۰۶۴r && cb.onPreparePanel(0, st2.f۱۱۰۵۵i, hVar)) {
                cb.onMenuOpened(108, st2.f۱۱۰۵۶j);
                this.f۱۱۰۱۱l.m۱۵۱۸۶d();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0053 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.b.h.f.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m۱۳۵۲۹c(android.support.p۰۴۷v7.app.LayoutInflater$Factory2Ch.Cn r8) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.app.LayoutInflater$Factory2Ch.m۱۳۵۲۹c(android.support.v7.app.h$n):boolean");
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۵۲۴a(Cn st) {
        View view = st.f۱۱۰۵۵i;
        if (view != null) {
            st.f۱۱۰۵۴h = view;
            return true;
        } else if (st.f۱۱۰۵۶j == null) {
            return false;
        } else {
            if (this.f۱۱۰۱۳n == null) {
                this.f۱۱۰۱۳n = new Co();
            }
            st.f۱۱۰۵۴h = (View) st.m۱۳۶۱۹a(this.f۱۱۰۱۳n);
            if (st.f۱۱۰۵۴h != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۳۵۲۸b(Cn st, KeyEvent event) {
        AbstractCe0 e0Var;
        AbstractCe0 e0Var2;
        AbstractCe0 e0Var3;
        if (this.f۱۰۹۹۲J) {
            return false;
        }
        if (st.f۱۱۰۵۹m) {
            return true;
        }
        Cn nVar = this.f۱۰۹۹۰H;
        if (!(nVar == null || nVar == st)) {
            m۱۳۵۴۹a(nVar, false);
        }
        Window.Callback cb = m۱۳۵۸۸p();
        if (cb != null) {
            st.f۱۱۰۵۵i = cb.onCreatePanelView(st.f۱۱۰۴۷a);
        }
        int i = st.f۱۱۰۴۷a;
        boolean isActionBarMenu = i == 0 || i == 108;
        if (isActionBarMenu && (e0Var3 = this.f۱۱۰۱۱l) != null) {
            e0Var3.m۱۵۱۸۷e();
        }
        if (st.f۱۱۰۵۵i == null && (!isActionBarMenu || !(m۱۳۵۹۱s() instanceof Ck))) {
            if (st.f۱۱۰۵۶j == null || st.f۱۱۰۶۴r) {
                if (st.f۱۱۰۵۶j == null && (!m۱۳۵۲۹c(st) || st.f۱۱۰۵۶j == null)) {
                    return false;
                }
                if (isActionBarMenu && this.f۱۱۰۱۱l != null) {
                    if (this.f۱۱۰۱۲m == null) {
                        this.f۱۱۰۱۲m = new Ci();
                    }
                    this.f۱۱۰۱۱l.m۱۵۱۸۲a(st.f۱۱۰۵۶j, this.f۱۱۰۱۲m);
                }
                st.f۱۱۰۵۶j.m۱۳۸۸۷s();
                if (!cb.onCreatePanelMenu(st.f۱۱۰۴۷a, st.f۱۱۰۵۶j)) {
                    st.m۱۳۶۲۱a((android.support.p۰۴۷v7.view.menu.Ch) null);
                    if (isActionBarMenu && (e0Var2 = this.f۱۱۰۱۱l) != null) {
                        e0Var2.m۱۵۱۸۲a(null, this.f۱۱۰۱۲m);
                    }
                    return false;
                }
                st.f۱۱۰۶۴r = false;
            }
            st.f۱۱۰۵۶j.m۱۳۸۸۷s();
            Bundle bundle = st.f۱۱۰۶۵s;
            if (bundle != null) {
                st.f۱۱۰۵۶j.m۱۳۸۴۶a(bundle);
                st.f۱۱۰۶۵s = null;
            }
            if (!cb.onPreparePanel(0, st.f۱۱۰۵۵i, st.f۱۱۰۵۶j)) {
                if (isActionBarMenu && (e0Var = this.f۱۱۰۱۱l) != null) {
                    e0Var.m۱۵۱۸۲a(null, this.f۱۱۰۱۲m);
                }
                st.f۱۱۰۵۶j.m۱۳۸۸۶r();
                return false;
            }
            st.f۱۱۰۶۲p = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() != 1;
            st.f۱۱۰۵۶j.setQwertyMode(st.f۱۱۰۶۲p);
            st.f۱۱۰۵۶j.m۱۳۸۸۶r();
        }
        st.f۱۱۰۵۹m = true;
        st.f۱۱۰۶۰n = false;
        this.f۱۰۹۹۰H = st;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۵۶۳b(android.support.p۰۴۷v7.view.menu.Ch menu) {
        if (!this.f۱۰۹۸۸F) {
            this.f۱۰۹۸۸F = true;
            this.f۱۱۰۱۱l.m۱۵۱۸۹g();
            Window.Callback cb = m۱۳۵۸۸p();
            if (cb != null && !this.f۱۰۹۹۲J) {
                cb.onPanelClosed(108, menu);
            }
            this.f۱۰۹۸۸F = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۵۷۲d(int featureId) {
        m۱۳۵۴۹a(m۱۳۵۴۲a(featureId, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۴۹a(Cn st, boolean doCallback) {
        ViewGroup viewGroup;
        AbstractCe0 e0Var;
        if (!doCallback || st.f۱۱۰۴۷a != 0 || (e0Var = this.f۱۱۰۱۱l) == null || !e0Var.m۱۵۱۸۴b()) {
            WindowManager wm = (WindowManager) this.f۱۱۰۰۳d.getSystemService("window");
            if (!(wm == null || !st.f۱۱۰۶۱o || (viewGroup = st.f۱۱۰۵۳g) == null)) {
                wm.removeView(viewGroup);
                if (doCallback) {
                    m۱۳۵۴۶a(st.f۱۱۰۴۷a, st, null);
                }
            }
            st.f۱۱۰۵۹m = false;
            st.f۱۱۰۶۰n = false;
            st.f۱۱۰۶۱o = false;
            st.f۱۱۰۵۴h = null;
            st.f۱۱۰۶۳q = true;
            if (this.f۱۰۹۹۰H == st) {
                this.f۱۰۹۹۰H = null;
                return;
            }
            return;
        }
        m۱۳۵۶۳b(st.f۱۱۰۵۶j);
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۳۵۳۰d(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        Cn st = m۱۳۵۴۲a(featureId, true);
        if (!st.f۱۱۰۶۱o) {
            return m۱۳۵۲۸b(st, event);
        }
        return false;
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۳۵۳۱e(int featureId, KeyEvent event) {
        AbstractCe0 e0Var;
        if (this.f۱۱۰۱۴o != null) {
            return false;
        }
        boolean handled = false;
        Cn st = m۱۳۵۴۲a(featureId, true);
        if (featureId != 0 || (e0Var = this.f۱۱۰۱۱l) == null || !e0Var.m۱۵۱۸۸f() || ViewConfiguration.get(this.f۱۱۰۰۳d).hasPermanentMenuKey()) {
            if (st.f۱۱۰۶۱o || st.f۱۱۰۶۰n) {
                handled = st.f۱۱۰۶۱o;
                m۱۳۵۴۹a(st, true);
            } else if (st.f۱۱۰۵۹m) {
                boolean show = true;
                if (st.f۱۱۰۶۴r) {
                    st.f۱۱۰۵۹m = false;
                    show = m۱۳۵۲۸b(st, event);
                }
                if (show) {
                    m۱۳۵۲۲a(st, event);
                    handled = true;
                }
            }
        } else if (this.f۱۱۰۱۱l.m۱۵۱۸۴b()) {
            handled = this.f۱۱۰۱۱l.m۱۵۱۸۵c();
        } else if (!this.f۱۰۹۹۲J && m۱۳۵۲۸b(st, event)) {
            handled = this.f۱۱۰۱۱l.m۱۵۱۸۶d();
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۵۴۶a(int featureId, Cn panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                Cn[] nVarArr = this.f۱۰۹۸۹G;
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cn m۱۳۵۴۳a(Menu menu) {
        Cn[] panels = this.f۱۰۹۸۹G;
        int N = panels != null ? panels.length : 0;
        for (int i = 0; i < N; i++) {
            Cn panel = panels[i];
            if (panel != null && panel.f۱۱۰۵۶j == menu) {
                return panel;
            }
        }
        return null;
    }

    /* JADX INFO: Multiple debug info for r0v1 android.support.v7.app.h$n: [D('nar' android.support.v7.app.h$n[]), D('st' android.support.v7.app.h$n)] */
    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Cn m۱۳۵۴۲a(int featureId, boolean required) {
        Cn[] nVarArr = this.f۱۰۹۸۹G;
        Cn[] ar = nVarArr;
        if (nVarArr == null || ar.length <= featureId) {
            Cn[] nar = new Cn[(featureId + 1)];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.f۱۰۹۸۹G = nar;
        }
        Cn st = ar[featureId];
        if (st != null) {
            return st;
        }
        Cn st2 = new Cn(featureId);
        ar[featureId] = st2;
        return st2;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۵۲۵a(Cn st, int keyCode, KeyEvent event, int flags) {
        android.support.p۰۴۷v7.view.menu.Ch hVar;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.f۱۱۰۵۹m || m۱۳۵۲۸b(st, event)) && (hVar = st.f۱۱۰۵۶j) != null) {
            handled = hVar.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.f۱۱۰۱۱l == null) {
            m۱۳۵۴۹a(st, true);
        }
        return handled;
    }

    /* renamed from: j  reason: contains not printable characters */
    private void m۱۳۵۳۲j(int featureId) {
        this.f۱۰۹۹۷O |= 1 << featureId;
        if (!this.f۱۰۹۹۶N) {
            Cu.m۱۲۹۸۹a(this.f۱۱۰۰۴e.getDecorView(), this.f۱۰۹۹۸P);
            this.f۱۰۹۹۶N = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۳۵۷۴e(int featureId) {
        Cn st;
        Cn st2 = m۱۳۵۴۲a(featureId, true);
        if (st2.f۱۱۰۵۶j != null) {
            Bundle savedActionViewStates = new Bundle();
            st2.f۱۱۰۵۶j.m۱۳۸۶۵c(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st2.f۱۱۰۶۵s = savedActionViewStates;
            }
            st2.f۱۱۰۵۶j.m۱۳۸۸۷s();
            st2.f۱۱۰۵۶j.clear();
        }
        st2.f۱۱۰۶۴r = true;
        st2.f۱۱۰۶۳q = true;
        if ((featureId == 108 || featureId == 0) && this.f۱۱۰۱۱l != null && (st = m۱۳۵۴۲a(0, false)) != null) {
            st.f۱۱۰۵۹m = false;
            m۱۳۵۲۸b(st, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public int m۱۳۵۸۱i(int insetTop) {
        boolean showStatusGuard = false;
        ActionBarContextView actionBarContextView = this.f۱۱۰۱۵p;
        int i = 0;
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
                Cr1.m۱۵۵۶۶a(this.f۱۱۰۲۱v, insets, localInsets);
                if (mlp.topMargin != (localInsets.top == 0 ? insetTop : 0)) {
                    mlpChanged = true;
                    mlp.topMargin = insetTop;
                    View view = this.f۱۱۰۲۳x;
                    if (view == null) {
                        this.f۱۱۰۲۳x = new View(this.f۱۱۰۰۳d);
                        this.f۱۱۰۲۳x.setBackgroundColor(this.f۱۱۰۰۳d.getResources().getColor(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_input_method_navigation_guard));
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
            if (!showStatusGuard) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        return insetTop;
    }

    /* renamed from: B  reason: contains not printable characters */
    private void m۱۳۵۲۱B() {
        if (this.f۱۱۰۲۰u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    private int m۱۳۵۳۳k(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (featureId != 9) {
            return featureId;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public void m۱۳۵۸۴l() {
        android.support.p۰۴۷v7.view.menu.Ch hVar;
        AbstractCe0 e0Var = this.f۱۱۰۱۱l;
        if (e0Var != null) {
            e0Var.m۱۵۱۸۹g();
        }
        if (this.f۱۱۰۱۶q != null) {
            this.f۱۱۰۰۴e.getDecorView().removeCallbacks(this.f۱۱۰۱۷r);
            if (this.f۱۱۰۱۶q.isShowing()) {
                try {
                    this.f۱۱۰۱۶q.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f۱۱۰۱۶q = null;
        }
        m۱۳۵۸۵m();
        Cn st = m۱۳۵۴۲a(0, false);
        if (st != null && (hVar = st.f۱۱۰۵۶j) != null) {
            hVar.close();
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۵۵۶a() {
        boolean applied = false;
        int nightMode = m۱۳۵۳۹y();
        int modeToApply = m۱۳۵۷۵f(nightMode);
        if (modeToApply != -1) {
            applied = m۱۳۵۳۴l(modeToApply);
        }
        if (nightMode == 0) {
            m۱۳۵۳۷w();
            this.f۱۰۹۹۵M.m۱۳۶۱۷d();
        }
        this.f۱۰۹۹۴L = true;
        return applied;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public int m۱۳۵۷۵f(int mode) {
        if (mode == -100) {
            return -1;
        }
        if (mode != 0) {
            return mode;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f۱۱۰۰۳d.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m۱۳۵۳۷w();
        return this.f۱۰۹۹۵M.m۱۳۶۱۶c();
    }

    /* renamed from: y  reason: contains not printable characters */
    private int m۱۳۵۳۹y() {
        int i = this.f۱۰۹۹۳K;
        return i != -100 ? i : AbstractCg.m۱۳۴۹۷k();
    }

    /* renamed from: l  reason: contains not printable characters */
    private boolean m۱۳۵۳۴l(int mode) {
        Resources res = this.f۱۱۰۰۳d.getResources();
        Configuration conf = res.getConfiguration();
        int currentNightMode = conf.uiMode & 48;
        int newNightMode = mode == 2 ? 32 : 16;
        if (currentNightMode == newNightMode) {
            return false;
        }
        if (m۱۳۵۲۰A()) {
            ((Activity) this.f۱۱۰۰۳d).recreate();
            return true;
        }
        Configuration config = new Configuration(conf);
        DisplayMetrics metrics = res.getDisplayMetrics();
        config.uiMode = (config.uiMode & -49) | newNightMode;
        res.updateConfiguration(config, metrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        Cj.m۱۳۶۳۳a(res);
        return true;
    }

    /* renamed from: w  reason: contains not printable characters */
    private void m۱۳۵۳۷w() {
        if (this.f۱۰۹۹۵M == null) {
            this.f۱۰۹۹۵M = new Cl(Cm.m۱۳۶۷۱a(this.f۱۱۰۰۳d));
        }
    }

    /* renamed from: A  reason: contains not printable characters */
    private boolean m۱۳۵۲۰A() {
        if (this.f۱۰۹۹۴L) {
            Context context = this.f۱۱۰۰۳d;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f۱۱۰۰۳d, this.f۱۱۰۰۳d.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$j  reason: invalid class name */
    public class Cj implements AbstractCb.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        private AbstractCb.AbstractCa f۱۱۰۳۶a;

        public Cj(AbstractCb.AbstractCa wrapped) {
            this.f۱۱۰۳۶a = wrapped;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۰۹a(AbstractCb mode, Menu menu) {
            return this.f۱۱۰۳۶a.m۱۰۷۹۰a(mode, menu);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۶۱۱b(AbstractCb mode, Menu menu) {
            return this.f۱۱۰۳۶a.m۱۰۷۹۲b(mode, menu);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۱۰a(AbstractCb mode, MenuItem item) {
            return this.f۱۱۰۳۶a.m۱۰۷۹۱a(mode, item);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۰۸a(AbstractCb mode) {
            this.f۱۱۰۳۶a.m۱۰۷۸۹a(mode);
            LayoutInflater$Factory2Ch hVar = LayoutInflater$Factory2Ch.this;
            if (hVar.f۱۱۰۱۶q != null) {
                hVar.f۱۱۰۰۴e.getDecorView().removeCallbacks(LayoutInflater$Factory2Ch.this.f۱۱۰۱۷r);
            }
            LayoutInflater$Factory2Ch hVar2 = LayoutInflater$Factory2Ch.this;
            if (hVar2.f۱۱۰۱۵p != null) {
                hVar2.m۱۳۵۸۵m();
                LayoutInflater$Factory2Ch hVar3 = LayoutInflater$Factory2Ch.this;
                Cy a = Cu.m۱۲۹۷۶a(hVar3.f۱۱۰۱۵p);
                a.m۱۳۰۵۳a(0.0f);
                hVar3.f۱۱۰۱۸s = a;
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s.m۱۳۰۵۶a(new Ca());
            }
            LayoutInflater$Factory2Ch hVar4 = LayoutInflater$Factory2Ch.this;
            AbstractCf fVar = hVar4.f۱۱۰۰۷h;
            if (fVar != null) {
                fVar.m۱۳۴۹۳a(hVar4.f۱۱۰۱۴o);
            }
            LayoutInflater$Factory2Ch.this.f۱۱۰۱۴o = null;
        }

        /* renamed from: android.support.v7.app.h$j$a  reason: invalid class name */
        class Ca extends Ca0 {
            Ca() {
            }

            @Override // android.support.p۰۴۳v4.view.AbstractCz
            /* renamed from: a  reason: contains not printable characters */
            public void m۱۳۶۱۲a(View view) {
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.setVisibility(8);
                LayoutInflater$Factory2Ch hVar = LayoutInflater$Factory2Ch.this;
                PopupWindow popupWindow = hVar.f۱۱۰۱۶q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f۱۱۰۱۵p.getParent() instanceof View) {
                    Cu.m۱۲۹۷۱C((View) LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.getParent());
                }
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۵p.removeAllViews();
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s.m۱۳۰۵۶a((AbstractCz) null);
                LayoutInflater$Factory2Ch.this.f۱۱۰۱۸s = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.h$o  reason: invalid class name */
    public final class Co implements AbstractCp.AbstractCa {
        Co() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۲۳a(android.support.p۰۴۷v7.view.menu.Ch menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.m۱۳۸۸۱m();
            boolean isSubMenu = parentMenu != menu;
            Cn panel = LayoutInflater$Factory2Ch.this.m۱۳۵۴۳a(isSubMenu ? parentMenu : menu);
            if (panel == null) {
                return;
            }
            if (isSubMenu) {
                LayoutInflater$Factory2Ch.this.m۱۳۵۴۶a(panel.f۱۱۰۴۷a, panel, parentMenu);
                LayoutInflater$Factory2Ch.this.m۱۳۵۴۹a(panel, true);
                return;
            }
            LayoutInflater$Factory2Ch.this.m۱۳۵۴۹a(panel, allMenusAreClosing);
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۲۴a(android.support.p۰۴۷v7.view.menu.Ch subMenu) {
            Window.Callback cb;
            if (subMenu != null) {
                return true;
            }
            LayoutInflater$Factory2Ch hVar = LayoutInflater$Factory2Ch.this;
            if (!hVar.f۱۰۹۸۳A || (cb = hVar.m۱۳۵۸۸p()) == null || LayoutInflater$Factory2Ch.this.f۱۰۹۹۲J) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.h$i  reason: invalid class name */
    public final class Ci implements AbstractCp.AbstractCa {
        Ci() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۰۷a(android.support.p۰۴۷v7.view.menu.Ch subMenu) {
            Window.Callback cb = LayoutInflater$Factory2Ch.this.m۱۳۵۸۸p();
            if (cb == null) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۰۶a(android.support.p۰۴۷v7.view.menu.Ch menu, boolean allMenusAreClosing) {
            LayoutInflater$Factory2Ch.this.m۱۳۵۶۳b(menu);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.v7.app.h$n  reason: invalid class name */
    public static final class Cn {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۱۰۴۷a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۰۴۸b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۰۴۹c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۰۵۰d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۰۵۱e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۱۰۵۲f;

        /* renamed from: g  reason: contains not printable characters */
        ViewGroup f۱۱۰۵۳g;

        /* renamed from: h  reason: contains not printable characters */
        View f۱۱۰۵۴h;

        /* renamed from: i  reason: contains not printable characters */
        View f۱۱۰۵۵i;

        /* renamed from: j  reason: contains not printable characters */
        android.support.p۰۴۷v7.view.menu.Ch f۱۱۰۵۶j;

        /* renamed from: k  reason: contains not printable characters */
        android.support.p۰۴۷v7.view.menu.Cf f۱۱۰۵۷k;

        /* renamed from: l  reason: contains not printable characters */
        Context f۱۱۰۵۸l;

        /* renamed from: m  reason: contains not printable characters */
        boolean f۱۱۰۵۹m;

        /* renamed from: n  reason: contains not printable characters */
        boolean f۱۱۰۶۰n;

        /* renamed from: o  reason: contains not printable characters */
        boolean f۱۱۰۶۱o;

        /* renamed from: p  reason: contains not printable characters */
        public boolean f۱۱۰۶۲p;

        /* renamed from: q  reason: contains not printable characters */
        boolean f۱۱۰۶۳q = false;

        /* renamed from: r  reason: contains not printable characters */
        boolean f۱۱۰۶۴r;

        /* renamed from: s  reason: contains not printable characters */
        Bundle f۱۱۰۶۵s;

        Cn(int featureId) {
            this.f۱۱۰۴۷a = featureId;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۲۲a() {
            if (this.f۱۱۰۵۴h == null) {
                return false;
            }
            if (this.f۱۱۰۵۵i == null && this.f۱۱۰۵۷k.m۱۳۸۲۳d().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۲۰a(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarPopupTheme, outValue, true);
            int i = outValue.resourceId;
            if (i != 0) {
                widgetTheme.applyStyle(i, true);
            }
            widgetTheme.resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.panelMenuListTheme, outValue, true);
            int i2 = outValue.resourceId;
            if (i2 != 0) {
                widgetTheme.applyStyle(i2, true);
            } else {
                widgetTheme.applyStyle(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ci.Theme_AppCompat_CompactMenu, true);
            }
            p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cd dVar = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cd(context, 0);
            dVar.getTheme().setTo(widgetTheme);
            this.f۱۱۰۵۸l = dVar;
            TypedArray a = dVar.obtainStyledAttributes(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme);
            this.f۱۱۰۴۸b = a.getResourceId(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_panelBackground, 0);
            this.f۱۱۰۵۲f = a.getResourceId(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.AppCompatTheme_android_windowAnimationStyle, 0);
            a.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۲۱a(android.support.p۰۴۷v7.view.menu.Ch menu) {
            android.support.p۰۴۷v7.view.menu.Cf fVar;
            android.support.p۰۴۷v7.view.menu.Ch hVar = this.f۱۱۰۵۶j;
            if (menu != hVar) {
                if (hVar != null) {
                    hVar.m۱۳۸۶۰b(this.f۱۱۰۵۷k);
                }
                this.f۱۱۰۵۶j = menu;
                if (menu != null && (fVar = this.f۱۱۰۵۷k) != null) {
                    menu.m۱۳۸۴۸a(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCq m۱۳۶۱۹a(AbstractCp.AbstractCa cb) {
            if (this.f۱۱۰۵۶j == null) {
                return null;
            }
            if (this.f۱۱۰۵۷k == null) {
                this.f۱۱۰۵۷k = new android.support.p۰۴۷v7.view.menu.Cf(this.f۱۱۰۵۸l, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_list_menu_item_layout);
                this.f۱۱۰۵۷k.m۱۳۸۱۵a(cb);
                this.f۱۱۰۵۶j.m۱۳۸۴۸a(this.f۱۱۰۵۷k);
            }
            return this.f۱۱۰۵۷k.m۱۳۸۱۰a(this.f۱۱۰۵۳g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.h$m  reason: invalid class name */
    public class Cm extends ContentFrameLayout {
        public Cm(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return LayoutInflater$Factory2Ch.this.m۱۳۵۵۹a(event) || super.dispatchKeyEvent(event);
        }

        public boolean onInterceptTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 || !m۱۳۶۱۸a((int) event.getX(), (int) event.getY())) {
                return super.onInterceptTouchEvent(event);
            }
            LayoutInflater$Factory2Ch.this.m۱۳۵۷۲d(0);
            return true;
        }

        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), resid));
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۳۶۱۸a(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    /* renamed from: android.support.v7.app.h$k  reason: invalid class name */
    class Ck extends Window$CallbackCi {
        Ck(Window.Callback callback) {
            super(callback);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public boolean dispatchKeyEvent(KeyEvent event) {
            return LayoutInflater$Factory2Ch.this.m۱۳۵۵۹a(event) || super.dispatchKeyEvent(event);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || LayoutInflater$Factory2Ch.this.m۱۳۵۶۶b(event.getKeyCode(), event);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId != 0 || (menu instanceof android.support.p۰۴۷v7.view.menu.Ch)) {
                return super.onCreatePanelMenu(featureId, menu);
            }
            return false;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public void onContentChanged() {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            android.support.p۰۴۷v7.view.menu.Ch mb = menu instanceof android.support.p۰۴۷v7.view.menu.Ch ? (android.support.p۰۴۷v7.view.menu.Ch) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.m۱۳۸۶۷c(true);
            }
            boolean handled = super.onPreparePanel(featureId, view, menu);
            if (mb != null) {
                mb.m۱۳۸۶۷c(false);
            }
            return handled;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            LayoutInflater$Factory2Ch.this.m۱۳۵۷۸g(featureId);
            return true;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public void onPanelClosed(int featureId, Menu menu) {
            super.onPanelClosed(featureId, menu);
            LayoutInflater$Factory2Ch.this.m۱۳۵۸۰h(featureId);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflater$Factory2Ch.this.m۱۳۵۸۹q()) {
                return m۱۳۶۱۳a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public final ActionMode m۱۳۶۱۳a(ActionMode.Callback callback) {
            Cf.Ca callbackWrapper = new Cf.Ca(LayoutInflater$Factory2Ch.this.f۱۱۰۰۳d, callback);
            AbstractCb supportActionMode = LayoutInflater$Factory2Ch.this.m۱۳۵۴۱a(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.m۱۰۸۱۹b(supportActionMode);
            }
            return null;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (!LayoutInflater$Factory2Ch.this.m۱۳۵۸۹q() || type != 0) {
                return super.onWindowStartingActionMode(callback, type);
            }
            return m۱۳۶۱۳a(callback);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            android.support.p۰۴۷v7.view.menu.Ch hVar;
            Cn panel = LayoutInflater$Factory2Ch.this.m۱۳۵۴۲a(0, true);
            if (panel == null || (hVar = panel.f۱۱۰۵۶j) == null) {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, hVar, deviceId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.h$l  reason: invalid class name */
    public final class Cl {

        /* renamed from: a  reason: contains not printable characters */
        private Cm f۱۱۰۴۰a;

        /* renamed from: b  reason: contains not printable characters */
        private boolean f۱۱۰۴۱b;

        /* renamed from: c  reason: contains not printable characters */
        private BroadcastReceiver f۱۱۰۴۲c;

        /* renamed from: d  reason: contains not printable characters */
        private IntentFilter f۱۱۰۴۳d;

        Cl(Cm twilightManager) {
            this.f۱۱۰۴۰a = twilightManager;
            this.f۱۱۰۴۱b = twilightManager.m۱۳۶۷۵a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۳۶۱۶c() {
            this.f۱۱۰۴۱b = this.f۱۱۰۴۰a.m۱۳۶۷۵a();
            return this.f۱۱۰۴۱b ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۶۱۵b() {
            boolean isNight = this.f۱۱۰۴۰a.m۱۳۶۷۵a();
            if (isNight != this.f۱۱۰۴۱b) {
                this.f۱۱۰۴۱b = isNight;
                LayoutInflater$Factory2Ch.this.m۱۳۵۵۶a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۳۶۱۷d() {
            m۱۳۶۱۴a();
            if (this.f۱۱۰۴۲c == null) {
                this.f۱۱۰۴۲c = new Ca();
            }
            if (this.f۱۱۰۴۳d == null) {
                this.f۱۱۰۴۳d = new IntentFilter();
                this.f۱۱۰۴۳d.addAction("android.intent.action.TIME_SET");
                this.f۱۱۰۴۳d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f۱۱۰۴۳d.addAction("android.intent.action.TIME_TICK");
            }
            LayoutInflater$Factory2Ch.this.f۱۱۰۰۳d.registerReceiver(this.f۱۱۰۴۲c, this.f۱۱۰۴۳d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.h$l$a  reason: invalid class name */
        public class Ca extends BroadcastReceiver {
            Ca() {
            }

            public void onReceive(Context context, Intent intent) {
                Cl.this.m۱۳۶۱۵b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۱۴a() {
            BroadcastReceiver broadcastReceiver = this.f۱۱۰۴۲c;
            if (broadcastReceiver != null) {
                LayoutInflater$Factory2Ch.this.f۱۱۰۰۳d.unregisterReceiver(broadcastReceiver);
                this.f۱۱۰۴۲c = null;
            }
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public final Cb.AbstractCb m۱۳۵۶۱b() {
        return new Ch();
    }

    /* renamed from: android.support.v7.app.h$h  reason: invalid class name */
    private class Ch implements Cb.AbstractCb {
        Ch() {
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public Drawable m۱۳۶۰۵c() {
            Cj1 a = Cj1.m۱۵۳۴۴a(m۱۳۶۰۱a(), (AttributeSet) null, new int[]{p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.homeAsUpIndicator});
            Drawable result = a.m۱۵۳۵۴b(0);
            a.m۱۵۳۵۰a();
            return result;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public Context m۱۳۶۰۱a() {
            return LayoutInflater$Factory2Ch.this.m۱۳۵۸۶n();
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۶۰۴b() {
            AbstractCa ab = LayoutInflater$Factory2Ch.this.m۱۳۵۷۱d();
            return (ab == null || (ab.m۱۳۴۲۷g() & 4) == 0) ? false : true;
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۰۳a(Drawable upDrawable, int contentDescRes) {
            AbstractCa ab = LayoutInflater$Factory2Ch.this.m۱۳۵۷۱d();
            if (ab != null) {
                ab.m۱۳۴۱۸b(upDrawable);
                ab.m۱۳۴۱۷b(contentDescRes);
            }
        }

        @Override // android.support.p۰۴۷v7.app.Cb.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۰۲a(int contentDescRes) {
            AbstractCa ab = LayoutInflater$Factory2Ch.this.m۱۳۵۷۱d();
            if (ab != null) {
                ab.m۱۳۴۱۷b(contentDescRes);
            }
        }
    }
}
