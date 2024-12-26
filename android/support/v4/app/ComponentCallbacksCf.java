package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.Cf;
import android.arch.lifecycle.Cj;
import android.arch.lifecycle.Cp;
import android.arch.lifecycle.InterfaceCe;
import android.arch.lifecycle.InterfaceCq;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cd;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: android.support.v4.app.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ComponentCallbacksCf implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceCe, InterfaceCq {

    /* renamed from: Y, reason: contains not printable characters */
    private static final Cn<String, Class<?>> f۱۰۱۳۰Y = new Cn<>();

    /* renamed from: Z, reason: contains not printable characters */
    static final Object f۱۰۱۳۱Z = new Object();

    /* renamed from: A, reason: contains not printable characters */
    int f۱۰۱۳۲A;

    /* renamed from: B, reason: contains not printable characters */
    String f۱۰۱۳۳B;

    /* renamed from: C, reason: contains not printable characters */
    boolean f۱۰۱۳۴C;

    /* renamed from: D, reason: contains not printable characters */
    boolean f۱۰۱۳۵D;

    /* renamed from: E, reason: contains not printable characters */
    boolean f۱۰۱۳۶E;

    /* renamed from: F, reason: contains not printable characters */
    boolean f۱۰۱۳۷F;

    /* renamed from: G, reason: contains not printable characters */
    boolean f۱۰۱۳۸G;

    /* renamed from: I, reason: contains not printable characters */
    boolean f۱۰۱۴۰I;

    /* renamed from: J, reason: contains not printable characters */
    ViewGroup f۱۰۱۴۱J;

    /* renamed from: K, reason: contains not printable characters */
    View f۱۰۱۴۲K;

    /* renamed from: L, reason: contains not printable characters */
    View f۱۰۱۴۳L;

    /* renamed from: M, reason: contains not printable characters */
    boolean f۱۰۱۴۴M;

    /* renamed from: O, reason: contains not printable characters */
    d f۱۰۱۴۶O;

    /* renamed from: P, reason: contains not printable characters */
    boolean f۱۰۱۴۷P;

    /* renamed from: Q, reason: contains not printable characters */
    boolean f۱۰۱۴۸Q;

    /* renamed from: R, reason: contains not printable characters */
    float f۱۰۱۴۹R;

    /* renamed from: S, reason: contains not printable characters */
    LayoutInflater f۱۰۱۵۰S;

    /* renamed from: T, reason: contains not printable characters */
    boolean f۱۰۱۵۱T;

    /* renamed from: V, reason: contains not printable characters */
    Cf f۱۰۱۵۳V;

    /* renamed from: W, reason: contains not printable characters */
    InterfaceCe f۱۰۱۵۴W;

    /* renamed from: d, reason: contains not printable characters */
    Bundle f۱۰۱۵۷d;

    /* renamed from: e, reason: contains not printable characters */
    SparseArray<Parcelable> f۱۰۱۵۸e;

    /* renamed from: f, reason: contains not printable characters */
    Boolean f۱۰۱۵۹f;

    /* renamed from: h, reason: contains not printable characters */
    String f۱۰۱۶۱h;

    /* renamed from: i, reason: contains not printable characters */
    Bundle f۱۰۱۶۲i;

    /* renamed from: j, reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۱۶۳j;

    /* renamed from: l, reason: contains not printable characters */
    int f۱۰۱۶۵l;

    /* renamed from: m, reason: contains not printable characters */
    boolean f۱۰۱۶۶m;

    /* renamed from: n, reason: contains not printable characters */
    boolean f۱۰۱۶۷n;

    /* renamed from: o, reason: contains not printable characters */
    boolean f۱۰۱۶۸o;

    /* renamed from: p, reason: contains not printable characters */
    boolean f۱۰۱۶۹p;

    /* renamed from: q, reason: contains not printable characters */
    boolean f۱۰۱۷۰q;

    /* renamed from: r, reason: contains not printable characters */
    boolean f۱۰۱۷۱r;

    /* renamed from: s, reason: contains not printable characters */
    int f۱۰۱۷۲s;

    /* renamed from: t, reason: contains not printable characters */
    LayoutInflaterFactory2Cl f۱۰۱۷۳t;

    /* renamed from: u, reason: contains not printable characters */
    AbstractCj f۱۰۱۷۴u;

    /* renamed from: v, reason: contains not printable characters */
    LayoutInflaterFactory2Cl f۱۰۱۷۵v;

    /* renamed from: w, reason: contains not printable characters */
    Cm f۱۰۱۷۶w;

    /* renamed from: x, reason: contains not printable characters */
    Cp f۱۰۱۷۷x;

    /* renamed from: y, reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۱۷۸y;

    /* renamed from: z, reason: contains not printable characters */
    int f۱۰۱۷۹z;

    /* renamed from: c, reason: contains not printable characters */
    int f۱۰۱۵۶c = 0;

    /* renamed from: g, reason: contains not printable characters */
    int f۱۰۱۶۰g = -1;

    /* renamed from: k, reason: contains not printable characters */
    int f۱۰۱۶۴k = -1;

    /* renamed from: H, reason: contains not printable characters */
    boolean f۱۰۱۳۹H = true;

    /* renamed from: N, reason: contains not printable characters */
    boolean f۱۰۱۴۵N = true;

    /* renamed from: U, reason: contains not printable characters */
    Cf f۱۰۱۵۲U = new Cf(this);

    /* renamed from: X, reason: contains not printable characters */
    Cj<InterfaceCe> f۱۰۱۵۵X = new Cj<>();

    /* renamed from: android.support.v4.app.f$f */
    interface f {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۰۳۸۷a();

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۰۳۸۸b();
    }

    @Override // android.arch.lifecycle.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۰۱۸۵a() {
        return this.f۱۰۱۵۲U;
    }

    @Override // android.arch.lifecycle.InterfaceCq
    /* renamed from: b, reason: contains not printable characters */
    public Cp mo۱۰۱۹۱b() {
        if (m۱۰۱۴۹k() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f۱۰۱۷۷x == null) {
            this.f۱۰۱۷۷x = new Cp();
        }
        return this.f۱۰۱۷۷x;
    }

    /* renamed from: android.support.v4.app.f$g */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: contains not printable characters */
        final Bundle f۱۰۲۰۲c;

        g(Bundle state) {
            this.f۱۰۲۰۲c = state;
        }

        g(Parcel in, ClassLoader loader) {
            Bundle bundle;
            this.f۱۰۲۰۲c = in.readBundle();
            if (loader != null && (bundle = this.f۱۰۲۰۲c) != null) {
                bundle.setClassLoader(loader);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeBundle(this.f۱۰۲۰۲c);
        }

        /* renamed from: android.support.v4.app.f$g$a */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel in) {
                return new g(in, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel in, ClassLoader loader) {
                return new g(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int size) {
                return new g[size];
            }
        }
    }

    /* renamed from: android.support.v4.app.f$e */
    public static class e extends RuntimeException {
        public e(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ComponentCallbacksCf m۱۰۰۵۲a(Context context, String fname, Bundle args) {
        try {
            Class<?> clazz = f۱۰۱۳۰Y.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                f۱۰۱۳۰Y.put(fname, clazz);
            }
            ComponentCallbacksCf f2 = (ComponentCallbacksCf) clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f2.getClass().getClassLoader());
                f2.m۱۰۱۵۴m(args);
            }
            return f2;
        } catch (ClassNotFoundException e2) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new e("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new e("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e6);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۰۰۵۳a(Context context, String fname) {
        try {
            Class<?> clazz = f۱۰۱۳۰Y.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                f۱۰۱۳۰Y.put(fname, clazz);
            }
            return ComponentCallbacksCf.class.isAssignableFrom(clazz);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    /* renamed from: l, reason: contains not printable characters */
    final void m۱۰۱۵۲l(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.f۱۰۱۵۸e;
        if (sparseArray != null) {
            this.f۱۰۱۴۳L.restoreHierarchyState(sparseArray);
            this.f۱۰۱۵۸e = null;
        }
        this.f۱۰۱۴۰I = false;
        m۱۰۱۳۶f(savedInstanceState);
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۸۸۳۶a(AbstractCc.a.ON_CREATE);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    final void m۱۰۰۸۸a(int index, ComponentCallbacksCf parent) {
        this.f۱۰۱۶۰g = index;
        if (parent != null) {
            this.f۱۰۱۶۱h = parent.f۱۰۱۶۱h + ":" + this.f۱۰۱۶۰g;
            return;
        }
        this.f۱۰۱۶۱h = "android:fragment:" + this.f۱۰۱۶۰g;
    }

    /* renamed from: G, reason: contains not printable characters */
    final boolean m۱۰۰۶۱G() {
        return this.f۱۰۱۷۲s > 0;
    }

    public final boolean equals(Object o) {
        return super.equals(o);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        Cd.m۸۵۲۱a(this, sb);
        if (this.f۱۰۱۶۰g >= 0) {
            sb.append(" #");
            sb.append(this.f۱۰۱۶۰g);
        }
        if (this.f۱۰۱۷۹z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f۱۰۱۷۹z));
        }
        if (this.f۱۰۱۳۳B != null) {
            sb.append(" ");
            sb.append(this.f۱۰۱۳۳B);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: m, reason: contains not printable characters */
    public void m۱۰۱۵۴m(Bundle args) {
        if (this.f۱۰۱۶۰g >= 0 && m۱۰۰۶۳I()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f۱۰۱۶۲i = args;
    }

    /* renamed from: i, reason: contains not printable characters */
    public final Bundle m۱۰۱۴۵i() {
        return this.f۱۰۱۶۲i;
    }

    /* renamed from: I, reason: contains not printable characters */
    public final boolean m۱۰۰۶۳I() {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۳t;
        if (layoutInflaterFactory2Cl == null) {
            return false;
        }
        return layoutInflaterFactory2Cl.mo۱۰۳۴۳c();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۰۱a(g state) {
        Bundle bundle;
        if (this.f۱۰۱۶۰g >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        if (state == null || (bundle = state.f۱۰۲۰۲c) == null) {
            bundle = null;
        }
        this.f۱۰۱۵۷d = bundle;
    }

    /* renamed from: k, reason: contains not printable characters */
    public Context m۱۰۱۴۹k() {
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        if (abstractCj == null) {
            return null;
        }
        return abstractCj.m۱۰۲۴۰c();
    }

    /* renamed from: b0, reason: contains not printable characters */
    public final Context m۱۰۱۱۹b0() {
        Context context = m۱۰۱۴۹k();
        if (context == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a context.");
        }
        return context;
    }

    /* renamed from: d, reason: contains not printable characters */
    public final ActivityCg m۱۰۱۲۷d() {
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        if (abstractCj == null) {
            return null;
        }
        return (ActivityCg) abstractCj.m۱۰۲۳۸b();
    }

    /* renamed from: v, reason: contains not printable characters */
    public final Resources m۱۰۱۶۳v() {
        return m۱۰۱۱۹b0().getResources();
    }

    /* renamed from: p, reason: contains not printable characters */
    public final AbstractCk m۱۰۱۵۷p() {
        return this.f۱۰۱۷۳t;
    }

    /* renamed from: j, reason: contains not printable characters */
    public final AbstractCk m۱۰۱۴۷j() {
        if (this.f۱۰۱۷۵v == null) {
            m۱۰۰۵۷C();
            int i = this.f۱۰۱۵۶c;
            if (i >= 4) {
                this.f۱۰۱۷۵v.m۱۰۳۶۵k();
            } else if (i >= 3) {
                this.f۱۰۱۷۵v.m۱۰۳۶۷l();
            } else if (i >= 2) {
                this.f۱۰۱۷۵v.m۱۰۳۴۹e();
            } else if (i >= 1) {
                this.f۱۰۱۷۵v.m۱۰۳۵۲f();
            }
        }
        return this.f۱۰۱۷۵v;
    }

    /* renamed from: S, reason: contains not printable characters */
    AbstractCk m۱۰۰۷۳S() {
        return this.f۱۰۱۷۵v;
    }

    /* renamed from: t, reason: contains not printable characters */
    public final ComponentCallbacksCf m۱۰۱۶۱t() {
        return this.f۱۰۱۷۸y;
    }

    /* renamed from: D, reason: contains not printable characters */
    public final boolean m۱۰۰۵۸D() {
        return this.f۱۰۱۷۴u != null && this.f۱۰۱۶۶m;
    }

    /* renamed from: E, reason: contains not printable characters */
    public final boolean m۱۰۰۵۹E() {
        return this.f۱۰۱۳۴C;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۰۸a(boolean hidden) {
    }

    /* renamed from: g, reason: contains not printable characters */
    public void m۱۰۱۴۱g(boolean menuVisible) {
        if (this.f۱۰۱۳۹H != menuVisible) {
            this.f۱۰۱۳۹H = menuVisible;
            if (this.f۱۰۱۳۸G && m۱۰۰۵۸D() && !m۱۰۰۵۹E()) {
                this.f۱۰۱۷۴u.mo۱۰۲۴۶i();
            }
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۰۱۴۴h(boolean isVisibleToUser) {
        if (!this.f۱۰۱۴۵N && isVisibleToUser && this.f۱۰۱۵۶c < 3 && this.f۱۰۱۷۳t != null && m۱۰۰۵۸D() && this.f۱۰۱۵۱T) {
            this.f۱۰۱۷۳t.m۱۰۳۶۶k(this);
        }
        this.f۱۰۱۴۵N = isVisibleToUser;
        this.f۱۰۱۴۴M = this.f۱۰۱۵۶c < 3 && !isVisibleToUser;
        if (this.f۱۰۱۵۷d != null) {
            this.f۱۰۱۵۹f = Boolean.valueOf(isVisibleToUser);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۵a(Intent intent) {
        m۱۰۰۹۸a(intent, (Bundle) null);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۸a(Intent intent, Bundle options) {
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        if (abstractCj == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        abstractCj.mo۱۰۲۳۶a(this, intent, -1, options);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۶a(Intent intent, int requestCode) {
        m۱۰۰۹۷a(intent, requestCode, (Bundle) null);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۷a(Intent intent, int requestCode, Bundle options) {
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        if (abstractCj == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        abstractCj.mo۱۰۲۳۶a(this, intent, requestCode, options);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۸۹a(int requestCode, String[] permissions, int[] grantResults) {
    }

    /* renamed from: d, reason: contains not printable characters */
    public LayoutInflater mo۱۰۱۲۸d(Bundle savedInstanceState) {
        return m۱۰۰۸۳a(savedInstanceState);
    }

    /* renamed from: i, reason: contains not printable characters */
    LayoutInflater m۱۰۱۴۶i(Bundle savedInstanceState) {
        LayoutInflater layoutInflater = mo۱۰۱۲۸d(savedInstanceState);
        this.f۱۰۱۵۰S = layoutInflater;
        return this.f۱۰۱۵۰S;
    }

    @Deprecated
    /* renamed from: a, reason: contains not printable characters */
    public LayoutInflater m۱۰۰۸۳a(Bundle savedFragmentState) {
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        if (abstractCj == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater result = abstractCj.mo۱۰۲۴۳f();
        m۱۰۱۴۷j();
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        layoutInflaterFactory2Cl.m۱۰۳۷۵p();
        android.support.v4.view.Cf.m۱۰۸۴۲b(result, layoutInflaterFactory2Cl);
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۴a(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        Activity hostActivity = abstractCj == null ? null : abstractCj.m۱۰۲۳۸b();
        if (hostActivity != null) {
            this.f۱۰۱۴۰I = false;
            m۱۰۰۹۲a(hostActivity, attrs, savedInstanceState);
        }
    }

    @Deprecated
    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۲a(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۰۲a(ComponentCallbacksCf childFragment) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۶۴۳a(Context context) {
        this.f۱۰۱۴۰I = true;
        AbstractCj abstractCj = this.f۱۰۱۷۴u;
        Activity hostActivity = abstractCj == null ? null : abstractCj.m۱۰۲۳۸b();
        if (hostActivity != null) {
            this.f۱۰۱۴۰I = false;
            m۱۰۰۹۱a(hostActivity);
        }
    }

    @Deprecated
    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۹۱a(Activity activity) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Animation m۱۰۰۸۵a(int transit, boolean enter, int nextAnim) {
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Animator m۱۰۱۱۱b(int transit, boolean enter, int nextAnim) {
        return null;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۵۵۱۶c(Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
        m۱۰۱۵۰k(savedInstanceState);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null && !layoutInflaterFactory2Cl.m۱۰۳۴۴c(1)) {
            this.f۱۰۱۷۵v.m۱۰۳۵۲f();
        }
    }

    /* renamed from: k, reason: contains not printable characters */
    void m۱۰۱۵۰k(Bundle savedInstanceState) {
        Parcelable p;
        if (savedInstanceState != null && (p = savedInstanceState.getParcelable("android:support:fragments")) != null) {
            if (this.f۱۰۱۷۵v == null) {
                m۱۰۰۵۷C();
            }
            this.f۱۰۱۷۵v.m۱۰۳۱۲a(p, this.f۱۰۱۷۶w);
            this.f۱۰۱۷۶w = null;
            this.f۱۰۱۷۵v.m۱۰۳۵۲f();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
    }

    /* renamed from: A, reason: contains not printable characters */
    public View m۱۰۰۵۵A() {
        return this.f۱۰۱۴۲K;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۱۱۳b(Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۱۳۶f(Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: Q, reason: contains not printable characters */
    public void mo۱۰۰۷۱Q() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: P, reason: contains not printable characters */
    public void m۱۰۰۷۰P() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۴۶۴۴e(Bundle outState) {
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۱۱۶b(boolean isInMultiWindowMode) {
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۱۲۴c(boolean isInPictureInPictureMode) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: O, reason: contains not printable characters */
    public void m۱۰۰۶۹O() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: R, reason: contains not printable characters */
    public void mo۱۰۰۷۲R() {
        this.f۱۰۱۴۰I = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: M, reason: contains not printable characters */
    public void mo۱۰۰۶۷M() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: K, reason: contains not printable characters */
    public void mo۱۷۶۷۵K() {
        this.f۱۰۱۴۰I = true;
        ActivityCg activity = m۱۰۱۲۷d();
        boolean isChangingConfigurations = activity != null && activity.isChangingConfigurations();
        Cp cp = this.f۱۰۱۷۷x;
        if (cp != null && !isChangingConfigurations) {
            cp.m۸۸۶۴a();
        }
    }

    /* renamed from: B, reason: contains not printable characters */
    void m۱۰۰۵۶B() {
        this.f۱۰۱۶۰g = -1;
        this.f۱۰۱۶۱h = null;
        this.f۱۰۱۶۶m = false;
        this.f۱۰۱۶۷n = false;
        this.f۱۰۱۶۸o = false;
        this.f۱۰۱۶۹p = false;
        this.f۱۰۱۷۰q = false;
        this.f۱۰۱۷۲s = 0;
        this.f۱۰۱۷۳t = null;
        this.f۱۰۱۷۵v = null;
        this.f۱۰۱۷۴u = null;
        this.f۱۰۱۷۹z = 0;
        this.f۱۰۱۳۲A = 0;
        this.f۱۰۱۳۳B = null;
        this.f۱۰۱۳۴C = false;
        this.f۱۰۱۳۵D = false;
        this.f۱۰۱۳۷F = false;
    }

    /* renamed from: N, reason: contains not printable characters */
    public void mo۱۰۰۶۸N() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۰۴a(Menu menu, MenuInflater inflater) {
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۱۱۵b(Menu menu) {
    }

    /* renamed from: L, reason: contains not printable characters */
    public void m۱۰۰۶۶L() {
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۱۱۸b(MenuItem item) {
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۰۳a(Menu menu) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        m۱۰۱۲۷d().onCreateContextMenu(menu, v, menuInfo);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۱۰۹a(MenuItem item) {
        return false;
    }

    /* renamed from: l, reason: contains not printable characters */
    public Object m۱۰۱۵۱l() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۸۹g;
    }

    /* renamed from: w, reason: contains not printable characters */
    public Object m۱۰۱۶۴w() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۱۹۰h;
        return obj == f۱۰۱۳۱Z ? m۱۰۱۵۱l() : obj;
    }

    /* renamed from: n, reason: contains not printable characters */
    public Object m۱۰۱۵۵n() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۱i;
    }

    /* renamed from: u, reason: contains not printable characters */
    public Object m۱۰۱۶۲u() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۱۹۲j;
        return obj == f۱۰۱۳۱Z ? m۱۰۱۵۵n() : obj;
    }

    /* renamed from: x, reason: contains not printable characters */
    public Object m۱۰۱۶۵x() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۳k;
    }

    /* renamed from: y, reason: contains not printable characters */
    public Object m۱۰۱۶۶y() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۱۹۴l;
        return obj == f۱۰۱۳۱Z ? m۱۰۱۶۵x() : obj;
    }

    /* renamed from: e, reason: contains not printable characters */
    public boolean m۱۰۱۳۵e() {
        Boolean bool;
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null || (bool = dVar.f۱۰۱۹۶n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: f, reason: contains not printable characters */
    public boolean m۱۰۱۳۸f() {
        Boolean bool;
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null || (bool = dVar.f۱۰۱۹۵m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: c0, reason: contains not printable characters */
    public void m۱۰۱۲۶c0() {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۳t;
        if (layoutInflaterFactory2Cl == null || layoutInflaterFactory2Cl.f۱۰۲۴۷o == null) {
            m۱۰۰۵۴d0().f۱۰۱۹۹q = false;
        } else if (Looper.myLooper() != this.f۱۰۱۷۳t.f۱۰۲۴۷o.m۱۰۲۴۲e().getLooper()) {
            this.f۱۰۱۷۳t.f۱۰۲۴۷o.m۱۰۲۴۲e().postAtFrontOfQueue(new a());
        } else {
            m۱۰۱۲۰c();
        }
    }

    /* renamed from: android.support.v4.app.f$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksCf.this.m۱۰۱۲۰c();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۰۱۲۰c() {
        f listener;
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            listener = null;
        } else {
            dVar.f۱۰۱۹۹q = false;
            f listener2 = dVar.f۱۰۲۰۰r;
            dVar.f۱۰۲۰۰r = null;
            listener = listener2;
        }
        if (listener != null) {
            listener.mo۱۰۳۸۷a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۰۷a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.f۱۰۱۷۹z));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.f۱۰۱۳۲A));
        writer.print(" mTag=");
        writer.println(this.f۱۰۱۳۳B);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.f۱۰۱۵۶c);
        writer.print(" mIndex=");
        writer.print(this.f۱۰۱۶۰g);
        writer.print(" mWho=");
        writer.print(this.f۱۰۱۶۱h);
        writer.print(" mBackStackNesting=");
        writer.println(this.f۱۰۱۷۲s);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.f۱۰۱۶۶m);
        writer.print(" mRemoving=");
        writer.print(this.f۱۰۱۶۷n);
        writer.print(" mFromLayout=");
        writer.print(this.f۱۰۱۶۸o);
        writer.print(" mInLayout=");
        writer.println(this.f۱۰۱۶۹p);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.f۱۰۱۳۴C);
        writer.print(" mDetached=");
        writer.print(this.f۱۰۱۳۵D);
        writer.print(" mMenuVisible=");
        writer.print(this.f۱۰۱۳۹H);
        writer.print(" mHasMenu=");
        writer.println(this.f۱۰۱۳۸G);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.f۱۰۱۳۶E);
        writer.print(" mRetaining=");
        writer.print(this.f۱۰۱۳۷F);
        writer.print(" mUserVisibleHint=");
        writer.println(this.f۱۰۱۴۵N);
        if (this.f۱۰۱۷۳t != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.f۱۰۱۷۳t);
        }
        if (this.f۱۰۱۷۴u != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.f۱۰۱۷۴u);
        }
        if (this.f۱۰۱۷۸y != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.f۱۰۱۷۸y);
        }
        if (this.f۱۰۱۶۲i != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.f۱۰۱۶۲i);
        }
        if (this.f۱۰۱۵۷d != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.f۱۰۱۵۷d);
        }
        if (this.f۱۰۱۵۸e != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.f۱۰۱۵۸e);
        }
        if (this.f۱۰۱۶۳j != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(this.f۱۰۱۶۳j);
            writer.print(" mTargetRequestCode=");
            writer.println(this.f۱۰۱۶۵l);
        }
        if (m۱۰۱۵۸q() != 0) {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(m۱۰۱۵۸q());
        }
        if (this.f۱۰۱۴۱J != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.f۱۰۱۴۱J);
        }
        if (this.f۱۰۱۴۲K != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.f۱۰۱۴۲K);
        }
        if (this.f۱۰۱۴۳L != null) {
            writer.print(prefix);
            writer.print("mInnerView=");
            writer.println(this.f۱۰۱۴۲K);
        }
        if (m۱۰۱۳۹g() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(m۱۰۱۳۹g());
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(m۱۰۱۶۷z());
        }
        if (m۱۰۱۴۹k() != null) {
            AbstractCu.m۱۰۴۸۶a(this).mo۱۰۴۸۸a(prefix, fd, writer, args);
        }
        if (this.f۱۰۱۷۵v != null) {
            writer.print(prefix);
            writer.println("Child " + this.f۱۰۱۷۵v + ":");
            this.f۱۰۱۷۵v.mo۱۰۳۲۳a(prefix + "  ", fd, writer, args);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    ComponentCallbacksCf m۱۰۰۸۲a(String who) {
        if (who.equals(this.f۱۰۱۶۱h)) {
            return this;
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            return layoutInflaterFactory2Cl.m۱۰۳۲۹b(who);
        }
        return null;
    }

    /* renamed from: C, reason: contains not printable characters */
    void m۱۰۰۵۷C() {
        if (this.f۱۰۱۷۴u == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f۱۰۱۷۵v = new LayoutInflaterFactory2Cl();
        this.f۱۰۱۷۵v.m۱۰۳۲۰a(this.f۱۰۱۷۴u, new b(), this);
    }

    /* renamed from: android.support.v4.app.f$b */
    class b extends AbstractCh {
        b() {
        }

        @Override // android.support.v4.app.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        public View mo۱۰۲۰۷a(int id) {
            View view = ComponentCallbacksCf.this.f۱۰۱۴۲K;
            if (view == null) {
                throw new IllegalStateException("Fragment does not have a view");
            }
            return view.findViewById(id);
        }

        @Override // android.support.v4.app.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۰۲۰۸a() {
            return ComponentCallbacksCf.this.f۱۰۱۴۲K != null;
        }

        @Override // android.support.v4.app.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        public ComponentCallbacksCf mo۱۰۲۰۶a(Context context, String className, Bundle arguments) {
            return ComponentCallbacksCf.this.f۱۰۱۷۴u.mo۱۰۲۰۶a(context, className, arguments);
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    void m۱۰۱۴۳h(Bundle savedInstanceState) {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۸r();
        }
        this.f۱۰۱۵۶c = 1;
        this.f۱۰۱۴۰I = false;
        mo۱۵۵۱۶c(savedInstanceState);
        this.f۱۰۱۵۱T = true;
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.f۱۰۱۵۲U.m۸۸۳۶a(AbstractCc.a.ON_CREATE);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۰۱۱۴b(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۸r();
        }
        this.f۱۰۱۷۱r = true;
        this.f۱۰۱۵۴W = new c();
        this.f۱۰۱۵۳V = null;
        this.f۱۰۱۴۲K = mo۱۷۶۷۶a(inflater, container, savedInstanceState);
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۴W.mo۱۰۱۸۵a();
            this.f۱۰۱۵۵X.mo۹۹۸۵a((Cj<InterfaceCe>) this.f۱۰۱۵۴W);
        } else {
            if (this.f۱۰۱۵۳V != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f۱۰۱۵۴W = null;
        }
    }

    /* renamed from: android.support.v4.app.f$c */
    class c implements InterfaceCe {
        c() {
        }

        @Override // android.arch.lifecycle.InterfaceCe
        /* renamed from: a, reason: contains not printable characters */
        public AbstractCc mo۱۰۱۸۵a() {
            ComponentCallbacksCf componentCallbacksCf = ComponentCallbacksCf.this;
            if (componentCallbacksCf.f۱۰۱۵۳V == null) {
                componentCallbacksCf.f۱۰۱۵۳V = new Cf(componentCallbacksCf.f۱۰۱۵۴W);
            }
            return ComponentCallbacksCf.this.f۱۰۱۵۳V;
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    void m۱۰۱۴۰g(Bundle savedInstanceState) {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۸r();
        }
        this.f۱۰۱۵۶c = 2;
        this.f۱۰۱۴۰I = false;
        mo۱۰۱۱۳b(savedInstanceState);
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl2 = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl2 != null) {
            layoutInflaterFactory2Cl2.m۱۰۳۴۹e();
        }
    }

    /* renamed from: Z, reason: contains not printable characters */
    void m۱۰۰۸۰Z() {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۸r();
            this.f۱۰۱۷۵v.m۱۰۳۷۴o();
        }
        this.f۱۰۱۵۶c = 3;
        this.f۱۰۱۴۰I = false;
        mo۱۰۰۷۱Q();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onStart()");
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl2 = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl2 != null) {
            layoutInflaterFactory2Cl2.m۱۰۳۶۷l();
        }
        this.f۱۰۱۵۲U.m۸۸۳۶a(AbstractCc.a.ON_START);
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۸۸۳۶a(AbstractCc.a.ON_START);
        }
    }

    /* renamed from: Y, reason: contains not printable characters */
    void m۱۰۰۷۹Y() {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۸r();
            this.f۱۰۱۷۵v.m۱۰۳۷۴o();
        }
        this.f۱۰۱۵۶c = 4;
        this.f۱۰۱۴۰I = false;
        m۱۰۰۷۰P();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onResume()");
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl2 = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl2 != null) {
            layoutInflaterFactory2Cl2.m۱۰۳۶۵k();
            this.f۱۰۱۷۵v.m۱۰۳۷۴o();
        }
        this.f۱۰۱۵۲U.m۸۸۳۶a(AbstractCc.a.ON_RESUME);
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۸۸۳۶a(AbstractCc.a.ON_RESUME);
        }
    }

    /* renamed from: J, reason: contains not printable characters */
    void m۱۰۰۶۴J() {
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۸r();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۰۱۳۰d(boolean isInMultiWindowMode) {
        m۱۰۱۱۶b(isInMultiWindowMode);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۲۴a(isInMultiWindowMode);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۰۱۳۴e(boolean isInPictureInPictureMode) {
        m۱۰۱۲۴c(isInPictureInPictureMode);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۳۷b(isInPictureInPictureMode);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۰۹۹a(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۱۰a(newConfig);
        }
    }

    /* renamed from: W, reason: contains not printable characters */
    void m۱۰۰۷۷W() {
        onLowMemory();
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۶۱i();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۰۱۱۷b(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.f۱۰۱۳۴C) {
            return false;
        }
        if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H) {
            show = true;
            m۱۰۱۰۴a(menu, inflater);
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            return show | layoutInflaterFactory2Cl.m۱۰۳۲۵a(menu, inflater);
        }
        return show;
    }

    /* renamed from: d, reason: contains not printable characters */
    boolean m۱۰۱۳۱d(Menu menu) {
        boolean show = false;
        if (this.f۱۰۱۳۴C) {
            return false;
        }
        if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H) {
            show = true;
            m۱۰۱۱۵b(menu);
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            return show | layoutInflaterFactory2Cl.m۱۰۳۳۸b(menu);
        }
        return show;
    }

    /* renamed from: d, reason: contains not printable characters */
    boolean m۱۰۱۳۲d(MenuItem item) {
        if (!this.f۱۰۱۳۴C) {
            if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H && m۱۰۱۱۸b(item)) {
                return true;
            }
            LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
            return layoutInflaterFactory2Cl != null && layoutInflaterFactory2Cl.m۱۰۳۳۹b(item);
        }
        return false;
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۰۱۲۵c(MenuItem item) {
        if (!this.f۱۰۱۳۴C) {
            if (m۱۰۱۰۹a(item)) {
                return true;
            }
            LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
            return layoutInflaterFactory2Cl != null && layoutInflaterFactory2Cl.m۱۰۳۲۶a(item);
        }
        return false;
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۰۱۲۳c(Menu menu) {
        if (!this.f۱۰۱۳۴C) {
            if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H) {
                m۱۰۱۰۳a(menu);
            }
            LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
            if (layoutInflaterFactory2Cl != null) {
                layoutInflaterFactory2Cl.m۱۰۳۲۲a(menu);
            }
        }
    }

    /* renamed from: j, reason: contains not printable characters */
    void m۱۰۱۴۸j(Bundle outState) {
        Parcelable p;
        mo۱۴۶۴۴e(outState);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null && (p = layoutInflaterFactory2Cl.m۱۰۳۸۱u()) != null) {
            outState.putParcelable("android:support:fragments", p);
        }
    }

    /* renamed from: X, reason: contains not printable characters */
    void m۱۰۰۷۸X() {
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۸۸۳۶a(AbstractCc.a.ON_PAUSE);
        }
        this.f۱۰۱۵۲U.m۸۸۳۶a(AbstractCc.a.ON_PAUSE);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۶۳j();
        }
        this.f۱۰۱۵۶c = 3;
        this.f۱۰۱۴۰I = false;
        m۱۰۰۶۹O();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: a0, reason: contains not printable characters */
    void m۱۰۱۱۰a0() {
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۸۸۳۶a(AbstractCc.a.ON_STOP);
        }
        this.f۱۰۱۵۲U.m۸۸۳۶a(AbstractCc.a.ON_STOP);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۷۰m();
        }
        this.f۱۰۱۵۶c = 2;
        this.f۱۰۱۴۰I = false;
        mo۱۰۰۷۲R();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: U, reason: contains not printable characters */
    void m۱۰۰۷۵U() {
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۸۸۳۶a(AbstractCc.a.ON_DESTROY);
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۵۸h();
        }
        this.f۱۰۱۵۶c = 1;
        this.f۱۰۱۴۰I = false;
        mo۱۰۰۶۷M();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        AbstractCu.m۱۰۴۸۶a(this).mo۱۰۴۸۷a();
        this.f۱۰۱۷۱r = false;
    }

    /* renamed from: T, reason: contains not printable characters */
    void m۱۰۰۷۴T() {
        this.f۱۰۱۵۲U.m۸۸۳۶a(AbstractCc.a.ON_DESTROY);
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            layoutInflaterFactory2Cl.m۱۰۳۵۵g();
        }
        this.f۱۰۱۵۶c = 0;
        this.f۱۰۱۴۰I = false;
        this.f۱۰۱۵۱T = false;
        mo۱۷۶۷۵K();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onDestroy()");
        }
        this.f۱۰۱۷۵v = null;
    }

    /* renamed from: V, reason: contains not printable characters */
    void m۱۰۰۷۶V() {
        this.f۱۰۱۴۰I = false;
        mo۱۰۰۶۸N();
        this.f۱۰۱۵۰S = null;
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onDetach()");
        }
        LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۱۷۵v;
        if (layoutInflaterFactory2Cl != null) {
            if (!this.f۱۰۱۳۷F) {
                throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
            }
            layoutInflaterFactory2Cl.m۱۰۳۵۵g();
            this.f۱۰۱۷۵v = null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۱۰۰a(f listener) {
        m۱۰۰۵۴d0();
        f fVar = this.f۱۰۱۴۶O.f۱۰۲۰۰r;
        if (listener == fVar) {
            return;
        }
        if (listener != null && fVar != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        d dVar = this.f۱۰۱۴۶O;
        if (dVar.f۱۰۱۹۹q) {
            dVar.f۱۰۲۰۰r = listener;
        }
        if (listener != null) {
            listener.mo۱۰۳۸۸b();
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    private d m۱۰۰۵۴d0() {
        if (this.f۱۰۱۴۶O == null) {
            this.f۱۰۱۴۶O = new d();
        }
        return this.f۱۰۱۴۶O;
    }

    /* renamed from: q, reason: contains not printable characters */
    int m۱۰۱۵۸q() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۶d;
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۰۱۲۱c(int animResourceId) {
        if (this.f۱۰۱۴۶O == null && animResourceId == 0) {
            return;
        }
        m۱۰۰۵۴d0().f۱۰۱۸۶d = animResourceId;
    }

    /* renamed from: r, reason: contains not printable characters */
    int m۱۰۱۵۹r() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۷e;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۰۸۶a(int nextTransition, int nextTransitionStyle) {
        if (this.f۱۰۱۴۶O == null && nextTransition == 0 && nextTransitionStyle == 0) {
            return;
        }
        m۱۰۰۵۴d0();
        d dVar = this.f۱۰۱۴۶O;
        dVar.f۱۰۱۸۷e = nextTransition;
        dVar.f۱۰۱۸۸f = nextTransitionStyle;
    }

    /* renamed from: s, reason: contains not printable characters */
    int m۱۰۱۶۰s() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۸f;
    }

    /* renamed from: m, reason: contains not printable characters */
    AbstractCc0 m۱۰۱۵۳m() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۷o;
    }

    /* renamed from: o, reason: contains not printable characters */
    AbstractCc0 m۱۰۱۵۶o() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۸p;
    }

    /* renamed from: g, reason: contains not printable characters */
    View m۱۰۱۳۹g() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۸۳a;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۱۰۵a(View view) {
        m۱۰۰۵۴d0().f۱۰۱۸۳a = view;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۰۹۰a(Animator animator) {
        m۱۰۰۵۴d0().f۱۰۱۸۴b = animator;
    }

    /* renamed from: h, reason: contains not printable characters */
    Animator m۱۰۱۴۲h() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۸۴b;
    }

    /* renamed from: z, reason: contains not printable characters */
    int m۱۰۱۶۷z() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۵c;
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۰۱۲۹d(int state) {
        m۱۰۰۵۴d0().f۱۰۱۸۵c = state;
    }

    /* renamed from: H, reason: contains not printable characters */
    boolean m۱۰۰۶۲H() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return false;
        }
        return dVar.f۱۰۱۹۹q;
    }

    /* renamed from: F, reason: contains not printable characters */
    boolean m۱۰۰۶۰F() {
        d dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return false;
        }
        return dVar.f۱۰۲۰۱s;
    }

    /* renamed from: f, reason: contains not printable characters */
    void m۱۰۱۳۷f(boolean replaced) {
        m۱۰۰۵۴d0().f۱۰۲۰۱s = replaced;
    }

    /* renamed from: android.support.v4.app.f$d */
    static class d {

        /* renamed from: a, reason: contains not printable characters */
        View f۱۰۱۸۳a;

        /* renamed from: b, reason: contains not printable characters */
        Animator f۱۰۱۸۴b;

        /* renamed from: c, reason: contains not printable characters */
        int f۱۰۱۸۵c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۰۱۸۶d;

        /* renamed from: e, reason: contains not printable characters */
        int f۱۰۱۸۷e;

        /* renamed from: f, reason: contains not printable characters */
        int f۱۰۱۸۸f;

        /* renamed from: g, reason: contains not printable characters */
        Object f۱۰۱۸۹g = null;

        /* renamed from: h, reason: contains not printable characters */
        Object f۱۰۱۹۰h;

        /* renamed from: i, reason: contains not printable characters */
        Object f۱۰۱۹۱i;

        /* renamed from: j, reason: contains not printable characters */
        Object f۱۰۱۹۲j;

        /* renamed from: k, reason: contains not printable characters */
        Object f۱۰۱۹۳k;

        /* renamed from: l, reason: contains not printable characters */
        Object f۱۰۱۹۴l;

        /* renamed from: m, reason: contains not printable characters */
        Boolean f۱۰۱۹۵m;

        /* renamed from: n, reason: contains not printable characters */
        Boolean f۱۰۱۹۶n;

        /* renamed from: o, reason: contains not printable characters */
        AbstractCc0 f۱۰۱۹۷o;

        /* renamed from: p, reason: contains not printable characters */
        AbstractCc0 f۱۰۱۹۸p;

        /* renamed from: q, reason: contains not printable characters */
        boolean f۱۰۱۹۹q;

        /* renamed from: r, reason: contains not printable characters */
        f f۱۰۲۰۰r;

        /* renamed from: s, reason: contains not printable characters */
        boolean f۱۰۲۰۱s;

        d() {
            Object obj = ComponentCallbacksCf.f۱۰۱۳۱Z;
            this.f۱۰۱۹۰h = obj;
            this.f۱۰۱۹۱i = null;
            this.f۱۰۱۹۲j = obj;
            this.f۱۰۱۹۳k = null;
            this.f۱۰۱۹۴l = obj;
            this.f۱۰۱۹۷o = null;
            this.f۱۰۱۹۸p = null;
        }
    }
}
