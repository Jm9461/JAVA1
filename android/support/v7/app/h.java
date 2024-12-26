package android.support.v7.app;

import a.b.h.f.b;
import a.b.h.f.f;
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
import android.support.v4.app.v;
import android.support.v4.view.a0;
import android.support.v4.view.c0;
import android.support.v4.view.e;
import android.support.v4.view.p;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.app.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.e0;
import android.support.v7.widget.j1;
import android.support.v7.widget.k0;
import android.support.v7.widget.o1;
import android.support.v7.widget.r1;
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

/* access modifiers changed from: package-private */
public class h extends g implements h.a, LayoutInflater.Factory2 {
    private static final boolean U = (Build.VERSION.SDK_INT < 21);
    private static final int[] V = {16842836};
    private static boolean W = true;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private n[] G;
    private n H;
    private boolean I;
    boolean J;
    private int K = -100;
    private boolean L;
    private l M;
    boolean N;
    int O;
    private final Runnable P = new b();
    private boolean Q;
    private Rect R;
    private Rect S;
    private AppCompatViewInflater T;

    /* renamed from: d  reason: collision with root package name */
    final Context f۱۵۵۳d;

    /* renamed from: e  reason: collision with root package name */
    final Window f۱۵۵۴e;

    /* renamed from: f  reason: collision with root package name */
    final Window.Callback f۱۵۵۵f;

    /* renamed from: g  reason: collision with root package name */
    final Window.Callback f۱۵۵۶g;

    /* renamed from: h  reason: collision with root package name */
    final f f۱۵۵۷h;
    a i;
    MenuInflater j;
    private CharSequence k;
    private e0 l;
    private i m;
    private o n;
    a.b.h.f.b o;
    ActionBarContextView p;
    PopupWindow q;
    Runnable r;
    y s = null;
    private boolean t = true;
    private boolean u;
    private ViewGroup v;
    private TextView w;
    private View x;
    private boolean y;
    private boolean z;

    static {
        if (U && !W) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f۱۵۵۸a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f۱۵۵۸a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable thowable) {
            if (a(thowable)) {
                Throwable wrapped = new Resources.NotFoundException(thowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                wrapped.initCause(thowable.getCause());
                wrapped.setStackTrace(thowable.getStackTrace());
                this.f۱۵۵۸a.uncaughtException(thread, wrapped);
                return;
            }
            this.f۱۵۵۸a.uncaughtException(thread, thowable);
        }

        private boolean a(Throwable throwable) {
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

    class b implements Runnable {
        b() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.O & 1) != 0) {
                hVar.e(0);
            }
            h hVar2 = h.this;
            if ((hVar2.O & 4096) != 0) {
                hVar2.e(108);
            }
            h hVar3 = h.this;
            hVar3.N = false;
            hVar3.O = 0;
        }
    }

    h(Context context, Window window, f callback) {
        this.f۱۵۵۳d = context;
        this.f۱۵۵۴e = window;
        this.f۱۵۵۷h = callback;
        this.f۱۵۵۵f = this.f۱۵۵۴e.getCallback();
        Window.Callback callback2 = this.f۱۵۵۵f;
        if (!(callback2 instanceof k)) {
            this.f۱۵۵۶g = new k(callback2);
            this.f۱۵۵۴e.setCallback(this.f۱۵۵۶g);
            j1 a2 = j1.a(context, (AttributeSet) null, V);
            Drawable winBg = a2.c(0);
            if (winBg != null) {
                this.f۱۵۵۴e.setBackgroundDrawable(winBg);
            }
            a2.a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // android.support.v7.app.g
    public void a(Bundle savedInstanceState) {
        Window.Callback callback = this.f۱۵۵۵f;
        if (callback instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = v.b((Activity) callback);
            } catch (IllegalArgumentException e2) {
            }
            if (parentActivityName != null) {
                a ab = s();
                if (ab == null) {
                    this.Q = true;
                } else {
                    ab.c(true);
                }
            }
        }
        if (savedInstanceState != null && this.K == -100) {
            this.K = savedInstanceState.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // android.support.v7.app.g
    public void b(Bundle savedInstanceState) {
        x();
    }

    @Override // android.support.v7.app.g
    public a d() {
        z();
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final a s() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback p() {
        return this.f۱۵۵۴e.getCallback();
    }

    private void z() {
        x();
        if (this.A && this.i == null) {
            Window.Callback callback = this.f۱۵۵۵f;
            if (callback instanceof Activity) {
                this.i = new n((Activity) callback, this.B);
            } else if (callback instanceof Dialog) {
                this.i = new n((Dialog) callback);
            }
            a aVar = this.i;
            if (aVar != null) {
                aVar.c(this.Q);
            }
        }
    }

    @Override // android.support.v7.app.g
    public void a(Toolbar toolbar) {
        if (this.f۱۵۵۵f instanceof Activity) {
            a ab = d();
            if (!(ab instanceof n)) {
                this.j = null;
                if (ab != null) {
                    ab.j();
                }
                if (toolbar != null) {
                    k tbab = new k(toolbar, ((Activity) this.f۱۵۵۵f).getTitle(), this.f۱۵۵۶g);
                    this.i = tbab;
                    this.f۱۵۵۴e.setCallback(tbab.l());
                } else {
                    this.i = null;
                    this.f۱۵۵۴e.setCallback(this.f۱۵۵۶g);
                }
                f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context n() {
        Context context = null;
        a ab = d();
        if (ab != null) {
            context = ab.h();
        }
        if (context == null) {
            return this.f۱۵۵۳d;
        }
        return context;
    }

    @Override // android.support.v7.app.g
    public MenuInflater c() {
        if (this.j == null) {
            z();
            a aVar = this.i;
            this.j = new a.b.h.f.g(aVar != null ? aVar.h() : this.f۱۵۵۳d);
        }
        return this.j;
    }

    @Override // android.support.v7.app.g
    public <T extends View> T a(int id) {
        x();
        return (T) this.f۱۵۵۴e.findViewById(id);
    }

    @Override // android.support.v7.app.g
    public void a(Configuration newConfig) {
        a ab;
        if (this.A && this.u && (ab = d()) != null) {
            ab.a(newConfig);
        }
        android.support.v7.widget.j.a().a(this.f۱۵۵۳d);
        a();
    }

    @Override // android.support.v7.app.g
    public void i() {
        a();
    }

    @Override // android.support.v7.app.g
    public void j() {
        a ab = d();
        if (ab != null) {
            ab.g(false);
        }
        l lVar = this.M;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.support.v7.app.g
    public void h() {
        a ab = d();
        if (ab != null) {
            ab.g(true);
        }
    }

    @Override // android.support.v7.app.g
    public void a(View v2) {
        x();
        ViewGroup contentParent = (ViewGroup) this.v.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v2);
        this.f۱۵۵۵f.onContentChanged();
    }

    @Override // android.support.v7.app.g
    public void c(int resId) {
        x();
        ViewGroup contentParent = (ViewGroup) this.v.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f۱۵۵۳d).inflate(resId, contentParent);
        this.f۱۵۵۵f.onContentChanged();
    }

    @Override // android.support.v7.app.g
    public void b(View v2, ViewGroup.LayoutParams lp) {
        x();
        ViewGroup contentParent = (ViewGroup) this.v.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v2, lp);
        this.f۱۵۵۵f.onContentChanged();
    }

    @Override // android.support.v7.app.g
    public void a(View v2, ViewGroup.LayoutParams lp) {
        x();
        ((ViewGroup) this.v.findViewById(16908290)).addView(v2, lp);
        this.f۱۵۵۵f.onContentChanged();
    }

    @Override // android.support.v7.app.g
    public void c(Bundle outState) {
        int i2 = this.K;
        if (i2 != -100) {
            outState.putInt("appcompat:local_night_mode", i2);
        }
    }

    @Override // android.support.v7.app.g
    public void g() {
        if (this.N) {
            this.f۱۵۵۴e.getDecorView().removeCallbacks(this.P);
        }
        this.J = true;
        a aVar = this.i;
        if (aVar != null) {
            aVar.j();
        }
        l lVar = this.M;
        if (lVar != null) {
            lVar.a();
        }
    }

    private void x() {
        if (!this.u) {
            this.v = v();
            CharSequence title = o();
            if (!TextUtils.isEmpty(title)) {
                e0 e0Var = this.l;
                if (e0Var != null) {
                    e0Var.setWindowTitle(title);
                } else if (s() != null) {
                    s().b(title);
                } else {
                    TextView textView = this.w;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            u();
            a(this.v);
            this.u = true;
            n st = a(0, false);
            if (this.J) {
                return;
            }
            if (st == null || st.j == null) {
                j(108);
            }
        }
    }

    private ViewGroup v() {
        Context themedContext;
        TypedArray a2 = this.f۱۵۵۳d.obtainStyledAttributes(a.b.h.a.j.AppCompatTheme);
        if (a2.hasValue(a.b.h.a.j.AppCompatTheme_windowActionBar)) {
            if (a2.getBoolean(a.b.h.a.j.AppCompatTheme_windowNoTitle, false)) {
                b(1);
            } else if (a2.getBoolean(a.b.h.a.j.AppCompatTheme_windowActionBar, false)) {
                b(108);
            }
            if (a2.getBoolean(a.b.h.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
                b(109);
            }
            if (a2.getBoolean(a.b.h.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
                b(10);
            }
            this.D = a2.getBoolean(a.b.h.a.j.AppCompatTheme_android_windowIsFloating, false);
            a2.recycle();
            this.f۱۵۵۴e.getDecorView();
            LayoutInflater inflater = LayoutInflater.from(this.f۱۵۵۳d);
            ViewGroup subDecor = null;
            if (this.E) {
                if (this.C) {
                    subDecor = (ViewGroup) inflater.inflate(a.b.h.a.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    subDecor = (ViewGroup) inflater.inflate(a.b.h.a.g.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    u.a(subDecor, new c());
                } else {
                    ((k0) subDecor).setOnFitSystemWindowsListener(new d());
                }
            } else if (this.D) {
                subDecor = (ViewGroup) inflater.inflate(a.b.h.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.B = false;
                this.A = false;
            } else if (this.A) {
                TypedValue outValue = new TypedValue();
                this.f۱۵۵۳d.getTheme().resolveAttribute(a.b.h.a.a.actionBarTheme, outValue, true);
                int i2 = outValue.resourceId;
                if (i2 != 0) {
                    themedContext = new a.b.h.f.d(this.f۱۵۵۳d, i2);
                } else {
                    themedContext = this.f۱۵۵۳d;
                }
                subDecor = (ViewGroup) LayoutInflater.from(themedContext).inflate(a.b.h.a.g.abc_screen_toolbar, (ViewGroup) null);
                this.l = (e0) subDecor.findViewById(a.b.h.a.f.decor_content_parent);
                this.l.setWindowCallback(p());
                if (this.B) {
                    this.l.a(109);
                }
                if (this.y) {
                    this.l.a(2);
                }
                if (this.z) {
                    this.l.a(5);
                }
            }
            if (subDecor != null) {
                if (this.l == null) {
                    this.w = (TextView) subDecor.findViewById(a.b.h.a.f.title);
                }
                r1.b(subDecor);
                ContentFrameLayout contentView = (ContentFrameLayout) subDecor.findViewById(a.b.h.a.f.action_bar_activity_content);
                ViewGroup windowContentView = (ViewGroup) this.f۱۵۵۴e.findViewById(16908290);
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
                this.f۱۵۵۴e.setContentView(subDecor);
                contentView.setAttachListener(new e());
                return subDecor;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        a2.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* access modifiers changed from: package-private */
    public class c implements p {
        c() {
        }

        @Override // android.support.v4.view.p
        public c0 a(View v, c0 insets) {
            int top = insets.e();
            int newTop = h.this.i(top);
            if (top != newTop) {
                insets = insets.a(insets.c(), newTop, insets.d(), insets.b());
            }
            return u.b(v, insets);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements k0.a {
        d() {
        }

        @Override // android.support.v7.widget.k0.a
        public void a(Rect insets) {
            insets.top = h.this.i(insets.top);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.l();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup subDecor) {
    }

    private void u() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.v.findViewById(16908290);
        View windowDecor = this.f۱۵۵۴e.getDecorView();
        cfl.a(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a2 = this.f۱۵۵۳d.obtainStyledAttributes(a.b.h.a.j.AppCompatTheme);
        a2.getValue(a.b.h.a.j.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a2.getValue(a.b.h.a.j.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a2.hasValue(a.b.h.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            a2.getValue(a.b.h.a.j.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a2.hasValue(a.b.h.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            a2.getValue(a.b.h.a.j.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a2.hasValue(a.b.h.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            a2.getValue(a.b.h.a.j.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a2.hasValue(a.b.h.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            a2.getValue(a.b.h.a.j.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a2.recycle();
        cfl.requestLayout();
    }

    @Override // android.support.v7.app.g
    public boolean b(int featureId) {
        int featureId2 = k(featureId);
        if (this.E && featureId2 == 108) {
            return false;
        }
        if (this.A && featureId2 == 1) {
            this.A = false;
        }
        if (featureId2 == 1) {
            B();
            this.E = true;
            return true;
        } else if (featureId2 == 2) {
            B();
            this.y = true;
            return true;
        } else if (featureId2 == 5) {
            B();
            this.z = true;
            return true;
        } else if (featureId2 == 10) {
            B();
            this.C = true;
            return true;
        } else if (featureId2 == 108) {
            B();
            this.A = true;
            return true;
        } else if (featureId2 != 109) {
            return this.f۱۵۵۴e.requestFeature(featureId2);
        } else {
            B();
            this.B = true;
            return true;
        }
    }

    @Override // android.support.v7.app.g
    public final void a(CharSequence title) {
        this.k = title;
        e0 e0Var = this.l;
        if (e0Var != null) {
            e0Var.setWindowTitle(title);
        } else if (s() != null) {
            s().b(title);
        } else {
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(title);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence o() {
        Window.Callback callback = this.f۱۵۵۵f;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void h(int featureId) {
        if (featureId == 108) {
            a ab = d();
            if (ab != null) {
                ab.b(false);
            }
        } else if (featureId == 0) {
            n st = a(featureId, true);
            if (st.o) {
                a(st, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(int featureId) {
        a ab;
        if (featureId == 108 && (ab = d()) != null) {
            ab.b(true);
        }
    }

    @Override // android.support.v7.view.menu.h.a
    public boolean a(android.support.v7.view.menu.h menu, MenuItem item) {
        n panel;
        Window.Callback cb = p();
        if (cb == null || this.J || (panel = a((Menu) menu.m())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.f۱۵۷۸a, item);
    }

    @Override // android.support.v7.view.menu.h.a
    public void a(android.support.v7.view.menu.h menu) {
        a(menu, true);
    }

    public a.b.h.f.b a(b.a callback) {
        f fVar;
        if (callback != null) {
            a.b.h.f.b bVar = this.o;
            if (bVar != null) {
                bVar.a();
            }
            b.a wrappedCallback = new j(callback);
            a ab = d();
            if (ab != null) {
                this.o = ab.a(wrappedCallback);
                a.b.h.f.b bVar2 = this.o;
                if (!(bVar2 == null || (fVar = this.f۱۵۵۷h) == null)) {
                    fVar.b(bVar2);
                }
            }
            if (this.o == null) {
                this.o = b(wrappedCallback);
            }
            return this.o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // android.support.v7.app.g
    public void f() {
        a ab = d();
        if (ab == null || !ab.i()) {
            j(0);
        }
    }

    /* access modifiers changed from: package-private */
    public a.b.h.f.b b(b.a callback) {
        f fVar;
        Context actionBarContext;
        m();
        a.b.h.f.b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        if (!(callback instanceof j)) {
            callback = new j(callback);
        }
        a.b.h.f.b mode = null;
        f fVar2 = this.f۱۵۵۷h;
        if (fVar2 != null && !this.J) {
            try {
                mode = fVar2.a(callback);
            } catch (AbstractMethodError e2) {
            }
        }
        if (mode != null) {
            this.o = mode;
        } else {
            boolean z2 = true;
            if (this.p == null) {
                if (this.D) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f۱۵۵۳d.getTheme();
                    baseTheme.resolveAttribute(a.b.h.a.a.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f۱۵۵۳d.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        a.b.h.f.d dVar = new a.b.h.f.d(this.f۱۵۵۳d, 0);
                        dVar.getTheme().setTo(actionBarTheme);
                        actionBarContext = dVar;
                    } else {
                        actionBarContext = this.f۱۵۵۳d;
                    }
                    this.p = new ActionBarContextView(actionBarContext);
                    this.q = new PopupWindow(actionBarContext, (AttributeSet) null, a.b.h.a.a.actionModePopupWindowStyle);
                    android.support.v4.widget.n.a(this.q, 2);
                    this.q.setContentView(this.p);
                    this.q.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(a.b.h.a.a.actionBarSize, outValue, true);
                    this.p.setContentHeight(TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics()));
                    this.q.setHeight(-2);
                    this.r = new f();
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.v.findViewById(a.b.h.a.f.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(n()));
                        this.p = (ActionBarContextView) stub.a();
                    }
                }
            }
            if (this.p != null) {
                m();
                this.p.c();
                Context context = this.p.getContext();
                ActionBarContextView actionBarContextView = this.p;
                if (this.q != null) {
                    z2 = false;
                }
                a.b.h.f.e eVar = new a.b.h.f.e(context, actionBarContextView, callback, z2);
                if (callback.a(eVar, eVar.c())) {
                    eVar.i();
                    this.p.a(eVar);
                    this.o = eVar;
                    if (t()) {
                        this.p.setAlpha(0.0f);
                        y a2 = u.a(this.p);
                        a2.a(1.0f);
                        this.s = a2;
                        this.s.a(new g());
                    } else {
                        this.p.setAlpha(1.0f);
                        this.p.setVisibility(0);
                        this.p.sendAccessibilityEvent(32);
                        if (this.p.getParent() instanceof View) {
                            u.C((View) this.p.getParent());
                        }
                    }
                    if (this.q != null) {
                        this.f۱۵۵۴e.getDecorView().post(this.r);
                    }
                } else {
                    this.o = null;
                }
            }
        }
        a.b.h.f.b bVar2 = this.o;
        if (!(bVar2 == null || (fVar = this.f۱۵۵۷h) == null)) {
            fVar.b(bVar2);
        }
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public class f implements Runnable {
        f() {
        }

        public void run() {
            h hVar = h.this;
            hVar.q.showAtLocation(hVar.p, 55, 0, 0);
            h.this.m();
            if (h.this.t()) {
                h.this.p.setAlpha(0.0f);
                h hVar2 = h.this;
                y a2 = u.a(hVar2.p);
                a2.a(1.0f);
                hVar2.s = a2;
                h.this.s.a(new a());
                return;
            }
            h.this.p.setAlpha(1.0f);
            h.this.p.setVisibility(0);
        }

        class a extends a0 {
            a() {
            }

            @Override // android.support.v4.view.a0, android.support.v4.view.z
            public void b(View view) {
                h.this.p.setVisibility(0);
            }

            @Override // android.support.v4.view.z
            public void a(View view) {
                h.this.p.setAlpha(1.0f);
                h.this.s.a((z) null);
                h.this.s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends a0 {
        g() {
        }

        @Override // android.support.v4.view.a0, android.support.v4.view.z
        public void b(View view) {
            h.this.p.setVisibility(0);
            h.this.p.sendAccessibilityEvent(32);
            if (h.this.p.getParent() instanceof View) {
                u.C((View) h.this.p.getParent());
            }
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            h.this.p.setAlpha(1.0f);
            h.this.s.a((z) null);
            h.this.s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean t() {
        ViewGroup viewGroup;
        return this.u && (viewGroup = this.v) != null && u.y(viewGroup);
    }

    public boolean q() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        y yVar = this.s;
        if (yVar != null) {
            yVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        a.b.h.f.b bVar = this.o;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        a ab = d();
        if (ab == null || !ab.f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b(int keyCode, KeyEvent ev) {
        a ab = d();
        if (ab != null && ab.a(keyCode, ev)) {
            return true;
        }
        n nVar = this.H;
        if (nVar == null || !a(nVar, ev.getKeyCode(), ev, 1)) {
            if (this.H == null) {
                n st = a(0, true);
                b(st, ev);
                boolean handled = a(st, ev.getKeyCode(), ev, 1);
                st.m = false;
                if (handled) {
                    return true;
                }
            }
            return false;
        }
        n nVar2 = this.H;
        if (nVar2 != null) {
            nVar2.n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent event) {
        View root;
        Window.Callback callback = this.f۱۵۵۵f;
        boolean isDown = true;
        if (((callback instanceof e.a) || (callback instanceof i)) && (root = this.f۱۵۵۴e.getDecorView()) != null && android.support.v4.view.e.a(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.f۱۵۵۵f.dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        if (event.getAction() != 0) {
            isDown = false;
        }
        return isDown ? a(keyCode, event) : c(keyCode, event);
    }

    /* access modifiers changed from: package-private */
    public boolean c(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            boolean wasLongPressBackDown = this.I;
            this.I = false;
            n st = a(0, false);
            if (st != null && st.o) {
                if (!wasLongPressBackDown) {
                    a(st, true);
                }
                return true;
            } else if (r()) {
                return true;
            }
        } else if (keyCode == 82) {
            e(0, event);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(int keyCode, KeyEvent event) {
        boolean z2 = true;
        if (keyCode == 4) {
            if ((event.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.I = z2;
        } else if (keyCode == 82) {
            d(0, event);
            return true;
        }
        return false;
    }

    public View a(View parent, String name, Context context, AttributeSet attrs) {
        boolean z2 = false;
        if (this.T == null) {
            String viewInflaterClassName = this.f۱۵۵۳d.obtainStyledAttributes(a.b.h.a.j.AppCompatTheme).getString(a.b.h.a.j.AppCompatTheme_viewInflaterClass);
            if (viewInflaterClassName == null || AppCompatViewInflater.class.getName().equals(viewInflaterClassName)) {
                this.T = new AppCompatViewInflater();
            } else {
                try {
                    this.T = (AppCompatViewInflater) Class.forName(viewInflaterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t2);
                    this.T = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        if (U) {
            if (!(attrs instanceof XmlPullParser)) {
                z2 = a((ViewParent) parent);
            } else if (((XmlPullParser) attrs).getDepth() > 1) {
                z2 = true;
            }
            inheritContext = z2;
        }
        return this.T.createView(parent, name, context, attrs, inheritContext, U, true, o1.b());
    }

    private boolean a(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.f۱۵۵۴e.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || u.x((View) parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    @Override // android.support.v7.app.g
    public void e() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f۱۵۵۳d);
        if (layoutInflater.getFactory() == null) {
            android.support.v4.view.f.b(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return a(parent, name, context, attrs);
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    private void a(n st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        if (!st.o && !this.J) {
            if (st.f۱۵۷۸a == 0) {
                if ((this.f۱۵۵۳d.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback cb = p();
            if (cb == null || cb.onMenuOpened(st.f۱۵۷۸a, st.j)) {
                WindowManager wm = (WindowManager) this.f۱۵۵۳d.getSystemService("window");
                if (wm != null && b(st, event)) {
                    int width = -2;
                    if (st.f۱۵۸۴g == null || st.q) {
                        ViewGroup viewGroup = st.f۱۵۸۴g;
                        if (viewGroup == null) {
                            if (!b(st) || st.f۱۵۸۴g == null) {
                                return;
                            }
                        } else if (st.q && viewGroup.getChildCount() > 0) {
                            st.f۱۵۸۴g.removeAllViews();
                        }
                        if (a(st) && st.a()) {
                            ViewGroup.LayoutParams lp2 = st.f۱۵۸۵h.getLayoutParams();
                            if (lp2 == null) {
                                lp2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            st.f۱۵۸۴g.setBackgroundResource(st.f۱۵۷۹b);
                            ViewParent shownPanelParent = st.f۱۵۸۵h.getParent();
                            if (shownPanelParent != null && (shownPanelParent instanceof ViewGroup)) {
                                ((ViewGroup) shownPanelParent).removeView(st.f۱۵۸۵h);
                            }
                            st.f۱۵۸۴g.addView(st.f۱۵۸۵h, lp2);
                            if (!st.f۱۵۸۵h.hasFocus()) {
                                st.f۱۵۸۵h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = st.i;
                        if (!(view == null || (lp = view.getLayoutParams()) == null || lp.width != -1)) {
                            width = -1;
                        }
                    }
                    st.n = false;
                    WindowManager.LayoutParams lp3 = new WindowManager.LayoutParams(width, -2, st.f۱۵۸۱d, st.f۱۵۸۲e, 1002, 8519680, -3);
                    lp3.gravity = st.f۱۵۸۰c;
                    lp3.windowAnimations = st.f۱۵۸۳f;
                    wm.addView(st.f۱۵۸۴g, lp3);
                    st.o = true;
                    return;
                }
                return;
            }
            a(st, true);
        }
    }

    private boolean b(n st) {
        st.a(n());
        st.f۱۵۸۴g = new m(st.l);
        st.f۱۵۸۰c = 81;
        return true;
    }

    private void a(android.support.v7.view.menu.h menu, boolean toggleMenuMode) {
        e0 e0Var = this.l;
        if (e0Var == null || !e0Var.f() || (ViewConfiguration.get(this.f۱۵۵۳d).hasPermanentMenuKey() && !this.l.a())) {
            n st = a(0, true);
            st.q = true;
            a(st, false);
            a(st, (KeyEvent) null);
            return;
        }
        Window.Callback cb = p();
        if (this.l.b() && toggleMenuMode) {
            this.l.c();
            if (!this.J) {
                cb.onPanelClosed(108, a(0, true).j);
            }
        } else if (cb != null && !this.J) {
            if (this.N && (this.O & 1) != 0) {
                this.f۱۵۵۴e.getDecorView().removeCallbacks(this.P);
                this.P.run();
            }
            n st2 = a(0, true);
            android.support.v7.view.menu.h hVar = st2.j;
            if (hVar != null && !st2.r && cb.onPreparePanel(0, st2.i, hVar)) {
                cb.onMenuOpened(108, st2.j);
                this.l.d();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0053 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.b.h.f.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(android.support.v7.app.h.n r8) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.h.c(android.support.v7.app.h$n):boolean");
    }

    private boolean a(n st) {
        View view = st.i;
        if (view != null) {
            st.f۱۵۸۵h = view;
            return true;
        } else if (st.j == null) {
            return false;
        } else {
            if (this.n == null) {
                this.n = new o();
            }
            st.f۱۵۸۵h = (View) st.a(this.n);
            if (st.f۱۵۸۵h != null) {
                return true;
            }
            return false;
        }
    }

    private boolean b(n st, KeyEvent event) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        if (this.J) {
            return false;
        }
        if (st.m) {
            return true;
        }
        n nVar = this.H;
        if (!(nVar == null || nVar == st)) {
            a(nVar, false);
        }
        Window.Callback cb = p();
        if (cb != null) {
            st.i = cb.onCreatePanelView(st.f۱۵۷۸a);
        }
        int i2 = st.f۱۵۷۸a;
        boolean isActionBarMenu = i2 == 0 || i2 == 108;
        if (isActionBarMenu && (e0Var3 = this.l) != null) {
            e0Var3.e();
        }
        if (st.i == null && (!isActionBarMenu || !(s() instanceof k))) {
            if (st.j == null || st.r) {
                if (st.j == null && (!c(st) || st.j == null)) {
                    return false;
                }
                if (isActionBarMenu && this.l != null) {
                    if (this.m == null) {
                        this.m = new i();
                    }
                    this.l.a(st.j, this.m);
                }
                st.j.s();
                if (!cb.onCreatePanelMenu(st.f۱۵۷۸a, st.j)) {
                    st.a((android.support.v7.view.menu.h) null);
                    if (isActionBarMenu && (e0Var2 = this.l) != null) {
                        e0Var2.a(null, this.m);
                    }
                    return false;
                }
                st.r = false;
            }
            st.j.s();
            Bundle bundle = st.s;
            if (bundle != null) {
                st.j.a(bundle);
                st.s = null;
            }
            if (!cb.onPreparePanel(0, st.i, st.j)) {
                if (isActionBarMenu && (e0Var = this.l) != null) {
                    e0Var.a(null, this.m);
                }
                st.j.r();
                return false;
            }
            st.p = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() != 1;
            st.j.setQwertyMode(st.p);
            st.j.r();
        }
        st.m = true;
        st.n = false;
        this.H = st;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(android.support.v7.view.menu.h menu) {
        if (!this.F) {
            this.F = true;
            this.l.g();
            Window.Callback cb = p();
            if (cb != null && !this.J) {
                cb.onPanelClosed(108, menu);
            }
            this.F = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(int featureId) {
        a(a(featureId, true), true);
    }

    /* access modifiers changed from: package-private */
    public void a(n st, boolean doCallback) {
        ViewGroup viewGroup;
        e0 e0Var;
        if (!doCallback || st.f۱۵۷۸a != 0 || (e0Var = this.l) == null || !e0Var.b()) {
            WindowManager wm = (WindowManager) this.f۱۵۵۳d.getSystemService("window");
            if (!(wm == null || !st.o || (viewGroup = st.f۱۵۸۴g) == null)) {
                wm.removeView(viewGroup);
                if (doCallback) {
                    a(st.f۱۵۷۸a, st, null);
                }
            }
            st.m = false;
            st.n = false;
            st.o = false;
            st.f۱۵۸۵h = null;
            st.q = true;
            if (this.H == st) {
                this.H = null;
                return;
            }
            return;
        }
        b(st.j);
    }

    private boolean d(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        n st = a(featureId, true);
        if (!st.o) {
            return b(st, event);
        }
        return false;
    }

    private boolean e(int featureId, KeyEvent event) {
        e0 e0Var;
        if (this.o != null) {
            return false;
        }
        boolean handled = false;
        n st = a(featureId, true);
        if (featureId != 0 || (e0Var = this.l) == null || !e0Var.f() || ViewConfiguration.get(this.f۱۵۵۳d).hasPermanentMenuKey()) {
            if (st.o || st.n) {
                handled = st.o;
                a(st, true);
            } else if (st.m) {
                boolean show = true;
                if (st.r) {
                    st.m = false;
                    show = b(st, event);
                }
                if (show) {
                    a(st, event);
                    handled = true;
                }
            }
        } else if (this.l.b()) {
            handled = this.l.c();
        } else if (!this.J && b(st, event)) {
            handled = this.l.d();
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.f۱۵۵۳d.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    /* access modifiers changed from: package-private */
    public void a(int featureId, n panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                n[] nVarArr = this.G;
                if (featureId < nVarArr.length) {
                    panel = nVarArr[featureId];
                }
            }
            if (panel != null) {
                menu = panel.j;
            }
        }
        if ((panel == null || panel.o) && !this.J) {
            this.f۱۵۵۵f.onPanelClosed(featureId, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public n a(Menu menu) {
        n[] panels = this.G;
        int N2 = panels != null ? panels.length : 0;
        for (int i2 = 0; i2 < N2; i2++) {
            n panel = panels[i2];
            if (panel != null && panel.j == menu) {
                return panel;
            }
        }
        return null;
    }

    /* JADX INFO: Multiple debug info for r0v1 android.support.v7.app.h$n: [D('nar' android.support.v7.app.h$n[]), D('st' android.support.v7.app.h$n)] */
    /* access modifiers changed from: protected */
    public n a(int featureId, boolean required) {
        n[] nVarArr = this.G;
        n[] ar = nVarArr;
        if (nVarArr == null || ar.length <= featureId) {
            n[] nar = new n[(featureId + 1)];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.G = nar;
        }
        n st = ar[featureId];
        if (st != null) {
            return st;
        }
        n st2 = new n(featureId);
        ar[featureId] = st2;
        return st2;
    }

    private boolean a(n st, int keyCode, KeyEvent event, int flags) {
        android.support.v7.view.menu.h hVar;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.m || b(st, event)) && (hVar = st.j) != null) {
            handled = hVar.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.l == null) {
            a(st, true);
        }
        return handled;
    }

    private void j(int featureId) {
        this.O |= 1 << featureId;
        if (!this.N) {
            u.a(this.f۱۵۵۴e.getDecorView(), this.P);
            this.N = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int featureId) {
        n st;
        n st2 = a(featureId, true);
        if (st2.j != null) {
            Bundle savedActionViewStates = new Bundle();
            st2.j.c(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st2.s = savedActionViewStates;
            }
            st2.j.s();
            st2.j.clear();
        }
        st2.r = true;
        st2.q = true;
        if ((featureId == 108 || featureId == 0) && this.l != null && (st = a(0, false)) != null) {
            st.m = false;
            b(st, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public int i(int insetTop) {
        boolean showStatusGuard = false;
        ActionBarContextView actionBarContextView = this.p;
        int i2 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean mlpChanged = false;
            if (this.p.isShown()) {
                if (this.R == null) {
                    this.R = new Rect();
                    this.S = new Rect();
                }
                Rect insets = this.R;
                Rect localInsets = this.S;
                insets.set(0, insetTop, 0, 0);
                r1.a(this.v, insets, localInsets);
                if (mlp.topMargin != (localInsets.top == 0 ? insetTop : 0)) {
                    mlpChanged = true;
                    mlp.topMargin = insetTop;
                    View view = this.x;
                    if (view == null) {
                        this.x = new View(this.f۱۵۵۳d);
                        this.x.setBackgroundColor(this.f۱۵۵۳d.getResources().getColor(a.b.h.a.c.abc_input_method_navigation_guard));
                        this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, insetTop));
                    } else {
                        ViewGroup.LayoutParams lp = view.getLayoutParams();
                        if (lp.height != insetTop) {
                            lp.height = insetTop;
                            this.x.setLayoutParams(lp);
                        }
                    }
                }
                showStatusGuard = this.x != null;
                if (!this.C && showStatusGuard) {
                    insetTop = 0;
                }
            } else if (mlp.topMargin != 0) {
                mlpChanged = true;
                mlp.topMargin = 0;
            }
            if (mlpChanged) {
                this.p.setLayoutParams(mlp);
            }
        }
        View view2 = this.x;
        if (view2 != null) {
            if (!showStatusGuard) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return insetTop;
    }

    private void B() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int k(int featureId) {
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
    public void l() {
        android.support.v7.view.menu.h hVar;
        e0 e0Var = this.l;
        if (e0Var != null) {
            e0Var.g();
        }
        if (this.q != null) {
            this.f۱۵۵۴e.getDecorView().removeCallbacks(this.r);
            if (this.q.isShowing()) {
                try {
                    this.q.dismiss();
                } catch (IllegalArgumentException e2) {
                }
            }
            this.q = null;
        }
        m();
        n st = a(0, false);
        if (st != null && (hVar = st.j) != null) {
            hVar.close();
        }
    }

    @Override // android.support.v7.app.g
    public boolean a() {
        boolean applied = false;
        int nightMode = y();
        int modeToApply = f(nightMode);
        if (modeToApply != -1) {
            applied = l(modeToApply);
        }
        if (nightMode == 0) {
            w();
            this.M.d();
        }
        this.L = true;
        return applied;
    }

    /* access modifiers changed from: package-private */
    public int f(int mode) {
        if (mode == -100) {
            return -1;
        }
        if (mode != 0) {
            return mode;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f۱۵۵۳d.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        w();
        return this.M.c();
    }

    private int y() {
        int i2 = this.K;
        return i2 != -100 ? i2 : g.k();
    }

    private boolean l(int mode) {
        Resources res = this.f۱۵۵۳d.getResources();
        Configuration conf = res.getConfiguration();
        int currentNightMode = conf.uiMode & 48;
        int newNightMode = mode == 2 ? 32 : 16;
        if (currentNightMode == newNightMode) {
            return false;
        }
        if (A()) {
            ((Activity) this.f۱۵۵۳d).recreate();
            return true;
        }
        Configuration config = new Configuration(conf);
        DisplayMetrics metrics = res.getDisplayMetrics();
        config.uiMode = (config.uiMode & -49) | newNightMode;
        res.updateConfiguration(config, metrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        j.a(res);
        return true;
    }

    private void w() {
        if (this.M == null) {
            this.M = new l(m.a(this.f۱۵۵۳d));
        }
    }

    private boolean A() {
        if (this.L) {
            Context context = this.f۱۵۵۳d;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f۱۵۵۳d, this.f۱۵۵۳d.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class j implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f۱۵۶۸a;

        public j(b.a wrapped) {
            this.f۱۵۶۸a = wrapped;
        }

        @Override // a.b.h.f.b.a
        public boolean a(a.b.h.f.b mode, Menu menu) {
            return this.f۱۵۶۸a.a(mode, menu);
        }

        @Override // a.b.h.f.b.a
        public boolean b(a.b.h.f.b mode, Menu menu) {
            return this.f۱۵۶۸a.b(mode, menu);
        }

        @Override // a.b.h.f.b.a
        public boolean a(a.b.h.f.b mode, MenuItem item) {
            return this.f۱۵۶۸a.a(mode, item);
        }

        @Override // a.b.h.f.b.a
        public void a(a.b.h.f.b mode) {
            this.f۱۵۶۸a.a(mode);
            h hVar = h.this;
            if (hVar.q != null) {
                hVar.f۱۵۵۴e.getDecorView().removeCallbacks(h.this.r);
            }
            h hVar2 = h.this;
            if (hVar2.p != null) {
                hVar2.m();
                h hVar3 = h.this;
                y a2 = u.a(hVar3.p);
                a2.a(0.0f);
                hVar3.s = a2;
                h.this.s.a(new a());
            }
            h hVar4 = h.this;
            f fVar = hVar4.f۱۵۵۷h;
            if (fVar != null) {
                fVar.a(hVar4.o);
            }
            h.this.o = null;
        }

        class a extends a0 {
            a() {
            }

            @Override // android.support.v4.view.z
            public void a(View view) {
                h.this.p.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.p.getParent() instanceof View) {
                    u.C((View) h.this.p.getParent());
                }
                h.this.p.removeAllViews();
                h.this.s.a((z) null);
                h.this.s = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final class o implements p.a {
        o() {
        }

        @Override // android.support.v7.view.menu.p.a
        public void a(android.support.v7.view.menu.h menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.m();
            boolean isSubMenu = parentMenu != menu;
            n panel = h.this.a(isSubMenu ? parentMenu : menu);
            if (panel == null) {
                return;
            }
            if (isSubMenu) {
                h.this.a(panel.f۱۵۷۸a, panel, parentMenu);
                h.this.a(panel, true);
                return;
            }
            h.this.a(panel, allMenusAreClosing);
        }

        @Override // android.support.v7.view.menu.p.a
        public boolean a(android.support.v7.view.menu.h subMenu) {
            Window.Callback cb;
            if (subMenu != null) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.A || (cb = hVar.p()) == null || h.this.J) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final class i implements p.a {
        i() {
        }

        @Override // android.support.v7.view.menu.p.a
        public boolean a(android.support.v7.view.menu.h subMenu) {
            Window.Callback cb = h.this.p();
            if (cb == null) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }

        @Override // android.support.v7.view.menu.p.a
        public void a(android.support.v7.view.menu.h menu, boolean allMenusAreClosing) {
            h.this.b(menu);
        }
    }

    /* access modifiers changed from: protected */
    public static final class n {

        /* renamed from: a  reason: collision with root package name */
        int f۱۵۷۸a;

        /* renamed from: b  reason: collision with root package name */
        int f۱۵۷۹b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۵۸۰c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۵۸۱d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۵۸۲e;

        /* renamed from: f  reason: collision with root package name */
        int f۱۵۸۳f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f۱۵۸۴g;

        /* renamed from: h  reason: collision with root package name */
        View f۱۵۸۵h;
        View i;
        android.support.v7.view.menu.h j;
        android.support.v7.view.menu.f k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        n(int featureId) {
            this.f۱۵۷۸a = featureId;
        }

        public boolean a() {
            if (this.f۱۵۸۵h == null) {
                return false;
            }
            if (this.i == null && this.k.d().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void a(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(a.b.h.a.a.actionBarPopupTheme, outValue, true);
            int i2 = outValue.resourceId;
            if (i2 != 0) {
                widgetTheme.applyStyle(i2, true);
            }
            widgetTheme.resolveAttribute(a.b.h.a.a.panelMenuListTheme, outValue, true);
            int i3 = outValue.resourceId;
            if (i3 != 0) {
                widgetTheme.applyStyle(i3, true);
            } else {
                widgetTheme.applyStyle(a.b.h.a.i.Theme_AppCompat_CompactMenu, true);
            }
            a.b.h.f.d dVar = new a.b.h.f.d(context, 0);
            dVar.getTheme().setTo(widgetTheme);
            this.l = dVar;
            TypedArray a2 = dVar.obtainStyledAttributes(a.b.h.a.j.AppCompatTheme);
            this.f۱۵۷۹b = a2.getResourceId(a.b.h.a.j.AppCompatTheme_panelBackground, 0);
            this.f۱۵۸۳f = a2.getResourceId(a.b.h.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            a2.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(android.support.v7.view.menu.h menu) {
            android.support.v7.view.menu.f fVar;
            android.support.v7.view.menu.h hVar = this.j;
            if (menu != hVar) {
                if (hVar != null) {
                    hVar.b(this.k);
                }
                this.j = menu;
                if (menu != null && (fVar = this.k) != null) {
                    menu.a(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public q a(p.a cb) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new android.support.v7.view.menu.f(this.l, a.b.h.a.g.abc_list_menu_item_layout);
                this.k.a(cb);
                this.j.a(this.k);
            }
            return this.k.a(this.f۱۵۸۴g);
        }
    }

    /* access modifiers changed from: private */
    public class m extends ContentFrameLayout {
        public m(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return h.this.a(event) || super.dispatchKeyEvent(event);
        }

        public boolean onInterceptTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 || !a((int) event.getX(), (int) event.getY())) {
                return super.onInterceptTouchEvent(event);
            }
            h.this.d(0);
            return true;
        }

        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(a.b.h.c.a.a.c(getContext(), resid));
        }

        private boolean a(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    class k extends a.b.h.f.i {
        k(Window.Callback callback) {
            super(callback);
        }

        @Override // a.b.h.f.i
        public boolean dispatchKeyEvent(KeyEvent event) {
            return h.this.a(event) || super.dispatchKeyEvent(event);
        }

        @Override // a.b.h.f.i
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || h.this.b(event.getKeyCode(), event);
        }

        @Override // a.b.h.f.i
        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId != 0 || (menu instanceof android.support.v7.view.menu.h)) {
                return super.onCreatePanelMenu(featureId, menu);
            }
            return false;
        }

        @Override // a.b.h.f.i
        public void onContentChanged() {
        }

        @Override // a.b.h.f.i
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            android.support.v7.view.menu.h mb = menu instanceof android.support.v7.view.menu.h ? (android.support.v7.view.menu.h) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.c(true);
            }
            boolean handled = super.onPreparePanel(featureId, view, menu);
            if (mb != null) {
                mb.c(false);
            }
            return handled;
        }

        @Override // a.b.h.f.i
        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            h.this.g(featureId);
            return true;
        }

        @Override // a.b.h.f.i
        public void onPanelClosed(int featureId, Menu menu) {
            super.onPanelClosed(featureId, menu);
            h.this.h(featureId);
        }

        @Override // a.b.h.f.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (h.this.q()) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a callbackWrapper = new f.a(h.this.f۱۵۵۳d, callback);
            a.b.h.f.b supportActionMode = h.this.a(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.b(supportActionMode);
            }
            return null;
        }

        @Override // a.b.h.f.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (!h.this.q() || type != 0) {
                return super.onWindowStartingActionMode(callback, type);
            }
            return a(callback);
        }

        @Override // a.b.h.f.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            android.support.v7.view.menu.h hVar;
            n panel = h.this.a(0, true);
            if (panel == null || (hVar = panel.j) == null) {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, hVar, deviceId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class l {

        /* renamed from: a  reason: collision with root package name */
        private m f۱۵۷۲a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f۱۵۷۳b;

        /* renamed from: c  reason: collision with root package name */
        private BroadcastReceiver f۱۵۷۴c;

        /* renamed from: d  reason: collision with root package name */
        private IntentFilter f۱۵۷۵d;

        l(m twilightManager) {
            this.f۱۵۷۲a = twilightManager;
            this.f۱۵۷۳b = twilightManager.a();
        }

        /* access modifiers changed from: package-private */
        public int c() {
            this.f۱۵۷۳b = this.f۱۵۷۲a.a();
            return this.f۱۵۷۳b ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            boolean isNight = this.f۱۵۷۲a.a();
            if (isNight != this.f۱۵۷۳b) {
                this.f۱۵۷۳b = isNight;
                h.this.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            a();
            if (this.f۱۵۷۴c == null) {
                this.f۱۵۷۴c = new a();
            }
            if (this.f۱۵۷۵d == null) {
                this.f۱۵۷۵d = new IntentFilter();
                this.f۱۵۷۵d.addAction("android.intent.action.TIME_SET");
                this.f۱۵۷۵d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f۱۵۷۵d.addAction("android.intent.action.TIME_TICK");
            }
            h.this.f۱۵۵۳d.registerReceiver(this.f۱۵۷۴c, this.f۱۵۷۵d);
        }

        /* access modifiers changed from: package-private */
        public class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                l.this.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f۱۵۷۴c;
            if (broadcastReceiver != null) {
                h.this.f۱۵۵۳d.unregisterReceiver(broadcastReceiver);
                this.f۱۵۷۴c = null;
            }
        }
    }

    @Override // android.support.v7.app.g
    public final b.AbstractC۰۰۳۵b b() {
        return new C۰۰۳۶h();
    }

    /* renamed from: android.support.v7.app.h$h  reason: collision with other inner class name */
    private class C۰۰۳۶h implements b.AbstractC۰۰۳۵b {
        C۰۰۳۶h() {
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public Drawable c() {
            j1 a2 = j1.a(a(), (AttributeSet) null, new int[]{a.b.h.a.a.homeAsUpIndicator});
            Drawable result = a2.b(0);
            a2.a();
            return result;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public Context a() {
            return h.this.n();
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public boolean b() {
            a ab = h.this.d();
            return (ab == null || (ab.g() & 4) == 0) ? false : true;
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public void a(Drawable upDrawable, int contentDescRes) {
            a ab = h.this.d();
            if (ab != null) {
                ab.b(upDrawable);
                ab.b(contentDescRes);
            }
        }

        @Override // android.support.v7.app.b.AbstractC۰۰۳۵b
        public void a(int contentDescRes) {
            a ab = h.this.d();
            if (ab != null) {
                ab.b(contentDescRes);
            }
        }
    }
}
