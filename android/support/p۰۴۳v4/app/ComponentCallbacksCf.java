package android.support.p۰۴۳v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.AbstractCe;
import android.arch.lifecycle.AbstractCq;
import android.arch.lifecycle.Cf;
import android.arch.lifecycle.Cj;
import android.arch.lifecycle.Cp;
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
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: android.support.v4.app.f  reason: invalid class name */
public class ComponentCallbacksCf implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractCe, AbstractCq {

    /* renamed from: Y  reason: contains not printable characters */
    private static final Cn<String, Class<?>> f۱۰۱۳۰Y = new Cn<>();

    /* renamed from: Z  reason: contains not printable characters */
    static final Object f۱۰۱۳۱Z = new Object();

    /* renamed from: A  reason: contains not printable characters */
    int f۱۰۱۳۲A;

    /* renamed from: B  reason: contains not printable characters */
    String f۱۰۱۳۳B;

    /* renamed from: C  reason: contains not printable characters */
    boolean f۱۰۱۳۴C;

    /* renamed from: D  reason: contains not printable characters */
    boolean f۱۰۱۳۵D;

    /* renamed from: E  reason: contains not printable characters */
    boolean f۱۰۱۳۶E;

    /* renamed from: F  reason: contains not printable characters */
    boolean f۱۰۱۳۷F;

    /* renamed from: G  reason: contains not printable characters */
    boolean f۱۰۱۳۸G;

    /* renamed from: H  reason: contains not printable characters */
    boolean f۱۰۱۳۹H = true;

    /* renamed from: I  reason: contains not printable characters */
    boolean f۱۰۱۴۰I;

    /* renamed from: J  reason: contains not printable characters */
    ViewGroup f۱۰۱۴۱J;

    /* renamed from: K  reason: contains not printable characters */
    View f۱۰۱۴۲K;

    /* renamed from: L  reason: contains not printable characters */
    View f۱۰۱۴۳L;

    /* renamed from: M  reason: contains not printable characters */
    boolean f۱۰۱۴۴M;

    /* renamed from: N  reason: contains not printable characters */
    boolean f۱۰۱۴۵N = true;

    /* renamed from: O  reason: contains not printable characters */
    Cd f۱۰۱۴۶O;

    /* renamed from: P  reason: contains not printable characters */
    boolean f۱۰۱۴۷P;

    /* renamed from: Q  reason: contains not printable characters */
    boolean f۱۰۱۴۸Q;

    /* renamed from: R  reason: contains not printable characters */
    float f۱۰۱۴۹R;

    /* renamed from: S  reason: contains not printable characters */
    LayoutInflater f۱۰۱۵۰S;

    /* renamed from: T  reason: contains not printable characters */
    boolean f۱۰۱۵۱T;

    /* renamed from: U  reason: contains not printable characters */
    Cf f۱۰۱۵۲U = new Cf(this);

    /* renamed from: V  reason: contains not printable characters */
    Cf f۱۰۱۵۳V;

    /* renamed from: W  reason: contains not printable characters */
    AbstractCe f۱۰۱۵۴W;

    /* renamed from: X  reason: contains not printable characters */
    Cj<AbstractCe> f۱۰۱۵۵X = new Cj<>();

    /* renamed from: c  reason: contains not printable characters */
    int f۱۰۱۵۶c = 0;

    /* renamed from: d  reason: contains not printable characters */
    Bundle f۱۰۱۵۷d;

    /* renamed from: e  reason: contains not printable characters */
    SparseArray<Parcelable> f۱۰۱۵۸e;

    /* renamed from: f  reason: contains not printable characters */
    Boolean f۱۰۱۵۹f;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۰۱۶۰g = -1;

    /* renamed from: h  reason: contains not printable characters */
    String f۱۰۱۶۱h;

    /* renamed from: i  reason: contains not printable characters */
    Bundle f۱۰۱۶۲i;

    /* renamed from: j  reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۱۶۳j;

    /* renamed from: k  reason: contains not printable characters */
    int f۱۰۱۶۴k = -1;

    /* renamed from: l  reason: contains not printable characters */
    int f۱۰۱۶۵l;

    /* renamed from: m  reason: contains not printable characters */
    boolean f۱۰۱۶۶m;

    /* renamed from: n  reason: contains not printable characters */
    boolean f۱۰۱۶۷n;

    /* renamed from: o  reason: contains not printable characters */
    boolean f۱۰۱۶۸o;

    /* renamed from: p  reason: contains not printable characters */
    boolean f۱۰۱۶۹p;

    /* renamed from: q  reason: contains not printable characters */
    boolean f۱۰۱۷۰q;

    /* renamed from: r  reason: contains not printable characters */
    boolean f۱۰۱۷۱r;

    /* renamed from: s  reason: contains not printable characters */
    int f۱۰۱۷۲s;

    /* renamed from: t  reason: contains not printable characters */
    LayoutInflater$Factory2Cl f۱۰۱۷۳t;

    /* renamed from: u  reason: contains not printable characters */
    AbstractCj f۱۰۱۷۴u;

    /* renamed from: v  reason: contains not printable characters */
    LayoutInflater$Factory2Cl f۱۰۱۷۵v;

    /* renamed from: w  reason: contains not printable characters */
    Cm f۱۰۱۷۶w;

    /* renamed from: x  reason: contains not printable characters */
    Cp f۱۰۱۷۷x;

    /* renamed from: y  reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۱۷۸y;

    /* renamed from: z  reason: contains not printable characters */
    int f۱۰۱۷۹z;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.f$f  reason: invalid class name */
    public interface AbstractCf {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۲۴۲a();

        /* renamed from: b  reason: contains not printable characters */
        void m۱۲۲۴۳b();
    }

    @Override // android.arch.lifecycle.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۲۱۵۱a() {
        return this.f۱۰۱۵۲U;
    }

    @Override // android.arch.lifecycle.AbstractCq
    /* renamed from: b  reason: contains not printable characters */
    public Cp m۱۲۱۸۲b() {
        if (m۱۲۲۱۹k() != null) {
            if (this.f۱۰۱۷۷x == null) {
                this.f۱۰۱۷۷x = new Cp();
            }
            return this.f۱۰۱۷۷x;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: android.support.v4.app.f$g  reason: invalid class name */
    public static class Cg implements Parcelable {
        public static final Parcelable.Creator<Cg> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        final Bundle f۱۰۲۰۲c;

        Cg(Bundle state) {
            this.f۱۰۲۰۲c = state;
        }

        Cg(Parcel in, ClassLoader loader) {
            Bundle bundle;
            this.f۱۰۲۰۲c = in.readBundle();
            if (loader != null && (bundle = this.f۱۰۲۰۲c) != null) {
                bundle.setClassLoader(loader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeBundle(this.f۱۰۲۰۲c);
        }

        /* renamed from: android.support.v4.app.f$g$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cg> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Cg createFromParcel(Parcel in) {
                return new Cg(in, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cg createFromParcel(Parcel in, ClassLoader loader) {
                return new Cg(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cg[] newArray(int size) {
                return new Cg[size];
            }
        }
    }

    /* renamed from: android.support.v4.app.f$e  reason: invalid class name */
    public static class Ce extends RuntimeException {
        public Ce(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ComponentCallbacksCf m۱۲۱۲۲a(Context context, String fname, Bundle args) {
        try {
            Class<?> clazz = f۱۰۱۳۰Y.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                f۱۰۱۳۰Y.put(fname, clazz);
            }
            ComponentCallbacksCf f = (ComponentCallbacksCf) clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f.getClass().getClassLoader());
                f.m۱۲۲۲۴m(args);
            }
            return f;
        } catch (ClassNotFoundException e) {
            throw new Ce("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new Ce("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new Ce("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new Ce("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new Ce("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۲۱۲۳a(Context context, String fname) {
        try {
            Class<?> clazz = f۱۰۱۳۰Y.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                f۱۰۱۳۰Y.put(fname, clazz);
            }
            return ComponentCallbacksCf.class.isAssignableFrom(clazz);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public final void m۱۲۲۲۲l(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.f۱۰۱۵۸e;
        if (sparseArray != null) {
            this.f۱۰۱۴۳L.restoreHierarchyState(sparseArray);
            this.f۱۰۱۵۸e = null;
        }
        this.f۱۰۱۴۰I = false;
        m۱۲۲۰۶f(savedInstanceState);
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۲۱۵۸a(int index, ComponentCallbacksCf parent) {
        this.f۱۰۱۶۰g = index;
        if (parent != null) {
            this.f۱۰۱۶۱h = parent.f۱۰۱۶۱h + ":" + this.f۱۰۱۶۰g;
            return;
        }
        this.f۱۰۱۶۱h = "android:fragment:" + this.f۱۰۱۶۰g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G  reason: contains not printable characters */
    public final boolean m۱۲۱۳۱G() {
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
        p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cd.m۱۰۵۹۲a(this, sb);
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

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۲۲۲۴m(Bundle args) {
        if (this.f۱۰۱۶۰g < 0 || !m۱۲۱۳۳I()) {
            this.f۱۰۱۶۲i = args;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: i  reason: contains not printable characters */
    public final Bundle m۱۲۲۱۵i() {
        return this.f۱۰۱۶۲i;
    }

    /* renamed from: I  reason: contains not printable characters */
    public final boolean m۱۲۱۳۳I() {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۳t;
        if (lVar == null) {
            return false;
        }
        return lVar.m۱۲۴۱۳c();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۱a(Cg state) {
        Bundle bundle;
        if (this.f۱۰۱۶۰g < 0) {
            if (state == null || (bundle = state.f۱۰۲۰۲c) == null) {
                bundle = null;
            }
            this.f۱۰۱۵۷d = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    /* renamed from: k  reason: contains not printable characters */
    public Context m۱۲۲۱۹k() {
        AbstractCj jVar = this.f۱۰۱۷۴u;
        if (jVar == null) {
            return null;
        }
        return jVar.m۱۲۳۱۰c();
    }

    /* renamed from: b0  reason: contains not printable characters */
    public final Context m۱۲۱۸۹b0() {
        Context context = m۱۲۲۱۹k();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: d  reason: contains not printable characters */
    public final ActivityCg m۱۲۱۹۷d() {
        AbstractCj jVar = this.f۱۰۱۷۴u;
        if (jVar == null) {
            return null;
        }
        return (ActivityCg) jVar.m۱۲۳۰۸b();
    }

    /* renamed from: v  reason: contains not printable characters */
    public final Resources m۱۲۲۳۳v() {
        return m۱۲۱۸۹b0().getResources();
    }

    /* renamed from: p  reason: contains not printable characters */
    public final AbstractCk m۱۲۲۲۷p() {
        return this.f۱۰۱۷۳t;
    }

    /* renamed from: j  reason: contains not printable characters */
    public final AbstractCk m۱۲۲۱۷j() {
        if (this.f۱۰۱۷۵v == null) {
            m۱۲۱۲۷C();
            int i = this.f۱۰۱۵۶c;
            if (i >= 4) {
                this.f۱۰۱۷۵v.m۱۲۴۳۵k();
            } else if (i >= 3) {
                this.f۱۰۱۷۵v.m۱۲۴۳۷l();
            } else if (i >= 2) {
                this.f۱۰۱۷۵v.m۱۲۴۱۹e();
            } else if (i >= 1) {
                this.f۱۰۱۷۵v.m۱۲۴۲۲f();
            }
        }
        return this.f۱۰۱۷۵v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S  reason: contains not printable characters */
    public AbstractCk m۱۲۱۴۳S() {
        return this.f۱۰۱۷۵v;
    }

    /* renamed from: t  reason: contains not printable characters */
    public final ComponentCallbacksCf m۱۲۲۳۱t() {
        return this.f۱۰۱۷۸y;
    }

    /* renamed from: D  reason: contains not printable characters */
    public final boolean m۱۲۱۲۸D() {
        return this.f۱۰۱۷۴u != null && this.f۱۰۱۶۶m;
    }

    /* renamed from: E  reason: contains not printable characters */
    public final boolean m۱۲۱۲۹E() {
        return this.f۱۰۱۳۴C;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۸a(boolean hidden) {
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۲۱۱g(boolean menuVisible) {
        if (this.f۱۰۱۳۹H != menuVisible) {
            this.f۱۰۱۳۹H = menuVisible;
            if (this.f۱۰۱۳۸G && m۱۲۱۲۸D() && !m۱۲۱۲۹E()) {
                this.f۱۰۱۷۴u.m۱۲۳۱۶i();
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۲۱۴h(boolean isVisibleToUser) {
        if (!this.f۱۰۱۴۵N && isVisibleToUser && this.f۱۰۱۵۶c < 3 && this.f۱۰۱۷۳t != null && m۱۲۱۲۸D() && this.f۱۰۱۵۱T) {
            this.f۱۰۱۷۳t.m۱۲۴۳۶k(this);
        }
        this.f۱۰۱۴۵N = isVisibleToUser;
        this.f۱۰۱۴۴M = this.f۱۰۱۵۶c < 3 && !isVisibleToUser;
        if (this.f۱۰۱۵۷d != null) {
            this.f۱۰۱۵۹f = Boolean.valueOf(isVisibleToUser);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۵a(Intent intent) {
        m۱۲۱۶۸a(intent, (Bundle) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۸a(Intent intent, Bundle options) {
        AbstractCj jVar = this.f۱۰۱۷۴u;
        if (jVar != null) {
            jVar.m۱۲۳۰۶a(this, intent, -1, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۶a(Intent intent, int requestCode) {
        m۱۲۱۶۷a(intent, requestCode, (Bundle) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۷a(Intent intent, int requestCode, Bundle options) {
        AbstractCj jVar = this.f۱۰۱۷۴u;
        if (jVar != null) {
            jVar.m۱۲۳۰۶a(this, intent, requestCode, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۵۷a(int requestCode, int resultCode, Intent data) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۵۹a(int requestCode, String[] permissions, int[] grantResults) {
    }

    /* renamed from: d  reason: contains not printable characters */
    public LayoutInflater m۱۲۱۹۸d(Bundle savedInstanceState) {
        return m۱۲۱۵۳a(savedInstanceState);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public LayoutInflater m۱۲۲۱۶i(Bundle savedInstanceState) {
        this.f۱۰۱۵۰S = m۱۲۱۹۸d(savedInstanceState);
        return this.f۱۰۱۵۰S;
    }

    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public LayoutInflater m۱۲۱۵۳a(Bundle savedFragmentState) {
        AbstractCj jVar = this.f۱۰۱۷۴u;
        if (jVar != null) {
            LayoutInflater result = jVar.m۱۲۳۱۳f();
            m۱۲۲۱۷j();
            LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
            lVar.m۱۲۴۴۵p();
            android.support.p۰۴۳v4.view.Cf.m۱۲۹۱۲b(result, lVar);
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۴a(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
        AbstractCj jVar = this.f۱۰۱۷۴u;
        Activity hostActivity = jVar == null ? null : jVar.m۱۲۳۰۸b();
        if (hostActivity != null) {
            this.f۱۰۱۴۰I = false;
            m۱۲۱۶۲a(hostActivity, attrs, savedInstanceState);
        }
    }

    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۲a(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۲a(ComponentCallbacksCf childFragment) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۳a(Context context) {
        this.f۱۰۱۴۰I = true;
        AbstractCj jVar = this.f۱۰۱۷۴u;
        Activity hostActivity = jVar == null ? null : jVar.m۱۲۳۰۸b();
        if (hostActivity != null) {
            this.f۱۰۱۴۰I = false;
            m۱۲۱۶۱a(hostActivity);
        }
    }

    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۱a(Activity activity) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Animation m۱۲۱۵۵a(int transit, boolean enter, int nextAnim) {
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Animator m۱۲۱۸۱b(int transit, boolean enter, int nextAnim) {
        return null;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۱۹۲c(Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
        m۱۲۲۲۰k(savedInstanceState);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null && !lVar.m۱۲۴۱۴c(1)) {
            this.f۱۰۱۷۵v.m۱۲۴۲۲f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public void m۱۲۲۲۰k(Bundle savedInstanceState) {
        Parcelable p;
        if (savedInstanceState != null && (p = savedInstanceState.getParcelable("android:support:fragments")) != null) {
            if (this.f۱۰۱۷۵v == null) {
                m۱۲۱۲۷C();
            }
            this.f۱۰۱۷۵v.m۱۲۳۸۲a(p, this.f۱۰۱۷۶w);
            this.f۱۰۱۷۶w = null;
            this.f۱۰۱۷۵v.m۱۲۴۲۲f();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۲۱۵۴a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۶a(View view, Bundle savedInstanceState) {
    }

    /* renamed from: A  reason: contains not printable characters */
    public View m۱۲۱۲۵A() {
        return this.f۱۰۱۴۲K;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۱۸۳b(Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۲۰۶f(Bundle savedInstanceState) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: Q  reason: contains not printable characters */
    public void m۱۲۱۴۱Q() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: P  reason: contains not printable characters */
    public void m۱۲۱۴۰P() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۲۰۳e(Bundle outState) {
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۱۸۶b(boolean isInMultiWindowMode) {
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۱۹۴c(boolean isInPictureInPictureMode) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: O  reason: contains not printable characters */
    public void m۱۲۱۳۹O() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: R  reason: contains not printable characters */
    public void m۱۲۱۴۲R() {
        this.f۱۰۱۴۰I = true;
    }

    public void onLowMemory() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: M  reason: contains not printable characters */
    public void m۱۲۱۳۷M() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: K  reason: contains not printable characters */
    public void m۱۲۱۳۵K() {
        boolean isChangingConfigurations = true;
        this.f۱۰۱۴۰I = true;
        ActivityCg activity = m۱۲۱۹۷d();
        if (activity == null || !activity.isChangingConfigurations()) {
            isChangingConfigurations = false;
        }
        Cp pVar = this.f۱۰۱۷۷x;
        if (pVar != null && !isChangingConfigurations) {
            pVar.m۱۰۹۳۳a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: contains not printable characters */
    public void m۱۲۱۲۶B() {
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

    /* renamed from: N  reason: contains not printable characters */
    public void m۱۲۱۳۸N() {
        this.f۱۰۱۴۰I = true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۴a(Menu menu, MenuInflater inflater) {
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۱۸۵b(Menu menu) {
    }

    /* renamed from: L  reason: contains not printable characters */
    public void m۱۲۱۳۶L() {
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۱۸۸b(MenuItem item) {
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۳a(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        m۱۲۱۹۷d().onCreateContextMenu(menu, v, menuInfo);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۱۷۹a(MenuItem item) {
        return false;
    }

    /* renamed from: l  reason: contains not printable characters */
    public Object m۱۲۲۲۱l() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۸۹g;
    }

    /* renamed from: w  reason: contains not printable characters */
    public Object m۱۲۲۳۴w() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۱۹۰h;
        return obj == f۱۰۱۳۱Z ? m۱۲۲۲۱l() : obj;
    }

    /* renamed from: n  reason: contains not printable characters */
    public Object m۱۲۲۲۵n() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۱i;
    }

    /* renamed from: u  reason: contains not printable characters */
    public Object m۱۲۲۳۲u() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۱۹۲j;
        return obj == f۱۰۱۳۱Z ? m۱۲۲۲۵n() : obj;
    }

    /* renamed from: x  reason: contains not printable characters */
    public Object m۱۲۲۳۵x() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۳k;
    }

    /* renamed from: y  reason: contains not printable characters */
    public Object m۱۲۲۳۶y() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۱۹۴l;
        return obj == f۱۰۱۳۱Z ? m۱۲۲۳۵x() : obj;
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۲۲۰۵e() {
        Boolean bool;
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null || (bool = dVar.f۱۰۱۹۶n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۲۲۰۸f() {
        Boolean bool;
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null || (bool = dVar.f۱۰۱۹۵m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: c0  reason: contains not printable characters */
    public void m۱۲۱۹۶c0() {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۳t;
        if (lVar == null || lVar.f۱۰۲۴۷o == null) {
            m۱۲۱۲۴d0().f۱۰۱۹۹q = false;
        } else if (Looper.myLooper() != this.f۱۰۱۷۳t.f۱۰۲۴۷o.m۱۲۳۱۲e().getLooper()) {
            this.f۱۰۱۷۳t.f۱۰۲۴۷o.m۱۲۳۱۲e().postAtFrontOfQueue(new RunnableCa());
        } else {
            m۱۲۱۹۰c();
        }
    }

    /* renamed from: android.support.v4.app.f$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            ComponentCallbacksCf.this.m۱۲۱۹۰c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۱۹۰c() {
        AbstractCf listener;
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            listener = null;
        } else {
            dVar.f۱۰۱۹۹q = false;
            AbstractCf listener2 = dVar.f۱۰۲۰۰r;
            dVar.f۱۰۲۰۰r = null;
            listener = listener2;
        }
        if (listener != null) {
            listener.m۱۲۲۴۲a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۷a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
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
        if (m۱۲۲۲۸q() != 0) {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(m۱۲۲۲۸q());
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
        if (m۱۲۲۰۹g() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(m۱۲۲۰۹g());
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(m۱۲۲۳۷z());
        }
        if (m۱۲۲۱۹k() != null) {
            AbstractCu.m۱۲۵۵۶a(this).m۱۲۵۵۸a(prefix, fd, writer, args);
        }
        if (this.f۱۰۱۷۵v != null) {
            writer.print(prefix);
            writer.println("Child " + this.f۱۰۱۷۵v + ":");
            LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
            lVar.m۱۲۳۹۳a(prefix + "  ", fd, writer, args);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۱۵۲a(String who) {
        if (who.equals(this.f۱۰۱۶۱h)) {
            return this;
        }
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            return lVar.m۱۲۳۹۹b(who);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: contains not printable characters */
    public void m۱۲۱۲۷C() {
        if (this.f۱۰۱۷۴u != null) {
            this.f۱۰۱۷۵v = new LayoutInflater$Factory2Cl();
            this.f۱۰۱۷۵v.m۱۲۳۹۰a(this.f۱۰۱۷۴u, new Cb(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.f$b  reason: invalid class name */
    public class Cb extends AbstractCh {
        Cb() {
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۲۲۳۹a(int id) {
            View view = ComponentCallbacksCf.this.f۱۰۱۴۲K;
            if (view != null) {
                return view.findViewById(id);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۲۲۴۰a() {
            return ComponentCallbacksCf.this.f۱۰۱۴۲K != null;
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public ComponentCallbacksCf m۱۲۲۳۸a(Context context, String className, Bundle arguments) {
            return ComponentCallbacksCf.this.f۱۰۱۷۴u.m۱۲۲۷۶a(context, className, arguments);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۲۱۳h(Bundle savedInstanceState) {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۸r();
        }
        this.f۱۰۱۵۶c = 1;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۹۲c(savedInstanceState);
        this.f۱۰۱۵۱T = true;
        if (this.f۱۰۱۴۰I) {
            this.f۱۰۱۵۲U.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_CREATE);
            return;
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۱۸۴b(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۸r();
        }
        this.f۱۰۱۷۱r = true;
        this.f۱۰۱۵۴W = new Cc();
        this.f۱۰۱۵۳V = null;
        this.f۱۰۱۴۲K = m۱۲۱۵۴a(inflater, container, savedInstanceState);
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۴W.m۱۰۸۹۱a();
            this.f۱۰۱۵۵X.m۱۰۹۱۸a(this.f۱۰۱۵۴W);
        } else if (this.f۱۰۱۵۳V == null) {
            this.f۱۰۱۵۴W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: android.support.v4.app.f$c  reason: invalid class name */
    class Cc implements AbstractCe {
        Cc() {
        }

        @Override // android.arch.lifecycle.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCc m۱۲۲۴۱a() {
            ComponentCallbacksCf fVar = ComponentCallbacksCf.this;
            if (fVar.f۱۰۱۵۳V == null) {
                fVar.f۱۰۱۵۳V = new Cf(fVar.f۱۰۱۵۴W);
            }
            return ComponentCallbacksCf.this.f۱۰۱۵۳V;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۲۱۰g(Bundle savedInstanceState) {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۸r();
        }
        this.f۱۰۱۵۶c = 2;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۸۳b(savedInstanceState);
        if (this.f۱۰۱۴۰I) {
            LayoutInflater$Factory2Cl lVar2 = this.f۱۰۱۷۵v;
            if (lVar2 != null) {
                lVar2.m۱۲۴۱۹e();
                return;
            }
            return;
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: contains not printable characters */
    public void m۱۲۱۵۰Z() {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۸r();
            this.f۱۰۱۷۵v.m۱۲۴۴۴o();
        }
        this.f۱۰۱۵۶c = 3;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۴۱Q();
        if (this.f۱۰۱۴۰I) {
            LayoutInflater$Factory2Cl lVar2 = this.f۱۰۱۷۵v;
            if (lVar2 != null) {
                lVar2.m۱۲۴۳۷l();
            }
            this.f۱۰۱۵۲U.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_START);
            if (this.f۱۰۱۴۲K != null) {
                this.f۱۰۱۵۳V.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_START);
                return;
            }
            return;
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y  reason: contains not printable characters */
    public void m۱۲۱۴۹Y() {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۸r();
            this.f۱۰۱۷۵v.m۱۲۴۴۴o();
        }
        this.f۱۰۱۵۶c = 4;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۴۰P();
        if (this.f۱۰۱۴۰I) {
            LayoutInflater$Factory2Cl lVar2 = this.f۱۰۱۷۵v;
            if (lVar2 != null) {
                lVar2.m۱۲۴۳۵k();
                this.f۱۰۱۷۵v.m۱۲۴۴۴o();
            }
            this.f۱۰۱۵۲U.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_RESUME);
            if (this.f۱۰۱۴۲K != null) {
                this.f۱۰۱۵۳V.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_RESUME);
                return;
            }
            return;
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: contains not printable characters */
    public void m۱۲۱۳۴J() {
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۸r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۲۰۰d(boolean isInMultiWindowMode) {
        m۱۲۱۸۶b(isInMultiWindowMode);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۳۹۴a(isInMultiWindowMode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۲۰۴e(boolean isInPictureInPictureMode) {
        m۱۲۱۹۴c(isInPictureInPictureMode);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۰۷b(isInPictureInPictureMode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۹a(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۳۸۰a(newConfig);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W  reason: contains not printable characters */
    public void m۱۲۱۴۷W() {
        onLowMemory();
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۳۱i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۱۸۷b(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.f۱۰۱۳۴C) {
            return false;
        }
        if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H) {
            show = true;
            m۱۲۱۷۴a(menu, inflater);
        }
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            return show | lVar.m۱۲۳۹۵a(menu, inflater);
        }
        return show;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۲۲۰۱d(Menu menu) {
        boolean show = false;
        if (this.f۱۰۱۳۴C) {
            return false;
        }
        if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H) {
            show = true;
            m۱۲۱۸۵b(menu);
        }
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            return show | lVar.m۱۲۴۰۸b(menu);
        }
        return show;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۲۲۰۲d(MenuItem item) {
        if (this.f۱۰۱۳۴C) {
            return false;
        }
        if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H && m۱۲۱۸۸b(item)) {
            return true;
        }
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar == null || !lVar.m۱۲۴۰۹b(item)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۲۱۹۵c(MenuItem item) {
        if (this.f۱۰۱۳۴C) {
            return false;
        }
        if (m۱۲۱۷۹a(item)) {
            return true;
        }
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar == null || !lVar.m۱۲۳۹۶a(item)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۱۹۳c(Menu menu) {
        if (!this.f۱۰۱۳۴C) {
            if (this.f۱۰۱۳۸G && this.f۱۰۱۳۹H) {
                m۱۲۱۷۳a(menu);
            }
            LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
            if (lVar != null) {
                lVar.m۱۲۳۹۲a(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۲۲۱۸j(Bundle outState) {
        Parcelable p;
        m۱۲۲۰۳e(outState);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null && (p = lVar.m۱۲۴۵۱u()) != null) {
            outState.putParcelable("android:support:fragments", p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X  reason: contains not printable characters */
    public void m۱۲۱۴۸X() {
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_PAUSE);
        }
        this.f۱۰۱۵۲U.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_PAUSE);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۳۳j();
        }
        this.f۱۰۱۵۶c = 3;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۳۹O();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0  reason: contains not printable characters */
    public void m۱۲۱۸۰a0() {
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_STOP);
        }
        this.f۱۰۱۵۲U.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_STOP);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۴۰m();
        }
        this.f۱۰۱۵۶c = 2;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۴۲R();
        if (!this.f۱۰۱۴۰I) {
            throw new Cd0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U  reason: contains not printable characters */
    public void m۱۲۱۴۵U() {
        if (this.f۱۰۱۴۲K != null) {
            this.f۱۰۱۵۳V.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_DESTROY);
        }
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۲۸h();
        }
        this.f۱۰۱۵۶c = 1;
        this.f۱۰۱۴۰I = false;
        m۱۲۱۳۷M();
        if (this.f۱۰۱۴۰I) {
            AbstractCu.m۱۲۵۵۶a(this).m۱۲۵۵۷a();
            this.f۱۰۱۷۱r = false;
            return;
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T  reason: contains not printable characters */
    public void m۱۲۱۴۴T() {
        this.f۱۰۱۵۲U.m۱۰۹۰۵a(AbstractCc.EnumCa.ON_DESTROY);
        LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
        if (lVar != null) {
            lVar.m۱۲۴۲۵g();
        }
        this.f۱۰۱۵۶c = 0;
        this.f۱۰۱۴۰I = false;
        this.f۱۰۱۵۱T = false;
        m۱۲۱۳۵K();
        if (this.f۱۰۱۴۰I) {
            this.f۱۰۱۷۵v = null;
            return;
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V  reason: contains not printable characters */
    public void m۱۲۱۴۶V() {
        this.f۱۰۱۴۰I = false;
        m۱۲۱۳۸N();
        this.f۱۰۱۵۰S = null;
        if (this.f۱۰۱۴۰I) {
            LayoutInflater$Factory2Cl lVar = this.f۱۰۱۷۵v;
            if (lVar == null) {
                return;
            }
            if (this.f۱۰۱۳۷F) {
                lVar.m۱۲۴۲۵g();
                this.f۱۰۱۷۵v = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new Cd0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۰a(AbstractCf listener) {
        m۱۲۱۲۴d0();
        AbstractCf fVar = this.f۱۰۱۴۶O.f۱۰۲۰۰r;
        if (listener != fVar) {
            if (listener == null || fVar == null) {
                Cd dVar = this.f۱۰۱۴۶O;
                if (dVar.f۱۰۱۹۹q) {
                    dVar.f۱۰۲۰۰r = listener;
                }
                if (listener != null) {
                    listener.m۱۲۲۴۳b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    private Cd m۱۲۱۲۴d0() {
        if (this.f۱۰۱۴۶O == null) {
            this.f۱۰۱۴۶O = new Cd();
        }
        return this.f۱۰۱۴۶O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q  reason: contains not printable characters */
    public int m۱۲۲۲۸q() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۶d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۱۹۱c(int animResourceId) {
        if (this.f۱۰۱۴۶O != null || animResourceId != 0) {
            m۱۲۱۲۴d0().f۱۰۱۸۶d = animResourceId;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r  reason: contains not printable characters */
    public int m۱۲۲۲۹r() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۷e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۵۶a(int nextTransition, int nextTransitionStyle) {
        if (this.f۱۰۱۴۶O != null || nextTransition != 0 || nextTransitionStyle != 0) {
            m۱۲۱۲۴d0();
            Cd dVar = this.f۱۰۱۴۶O;
            dVar.f۱۰۱۸۷e = nextTransition;
            dVar.f۱۰۱۸۸f = nextTransitionStyle;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s  reason: contains not printable characters */
    public int m۱۲۲۳۰s() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۸f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public AbstractCc0 m۱۲۲۲۳m() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۷o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o  reason: contains not printable characters */
    public AbstractCc0 m۱۲۲۲۶o() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۹۸p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public View m۱۲۲۰۹g() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۸۳a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۷۵a(View view) {
        m۱۲۱۲۴d0().f۱۰۱۸۳a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۶۰a(Animator animator) {
        m۱۲۱۲۴d0().f۱۰۱۸۴b = animator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public Animator m۱۲۲۱۲h() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۱۸۴b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z  reason: contains not printable characters */
    public int m۱۲۲۳۷z() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۱۸۵c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۱۹۹d(int state) {
        m۱۲۱۲۴d0().f۱۰۱۸۵c = state;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H  reason: contains not printable characters */
    public boolean m۱۲۱۳۲H() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return false;
        }
        return dVar.f۱۰۱۹۹q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F  reason: contains not printable characters */
    public boolean m۱۲۱۳۰F() {
        Cd dVar = this.f۱۰۱۴۶O;
        if (dVar == null) {
            return false;
        }
        return dVar.f۱۰۲۰۱s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۲۰۷f(boolean replaced) {
        m۱۲۱۲۴d0().f۱۰۲۰۱s = replaced;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.f$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        View f۱۰۱۸۳a;

        /* renamed from: b  reason: contains not printable characters */
        Animator f۱۰۱۸۴b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۰۱۸۵c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۰۱۸۶d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۰۱۸۷e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۰۱۸۸f;

        /* renamed from: g  reason: contains not printable characters */
        Object f۱۰۱۸۹g = null;

        /* renamed from: h  reason: contains not printable characters */
        Object f۱۰۱۹۰h;

        /* renamed from: i  reason: contains not printable characters */
        Object f۱۰۱۹۱i;

        /* renamed from: j  reason: contains not printable characters */
        Object f۱۰۱۹۲j;

        /* renamed from: k  reason: contains not printable characters */
        Object f۱۰۱۹۳k;

        /* renamed from: l  reason: contains not printable characters */
        Object f۱۰۱۹۴l;

        /* renamed from: m  reason: contains not printable characters */
        Boolean f۱۰۱۹۵m;

        /* renamed from: n  reason: contains not printable characters */
        Boolean f۱۰۱۹۶n;

        /* renamed from: o  reason: contains not printable characters */
        AbstractCc0 f۱۰۱۹۷o;

        /* renamed from: p  reason: contains not printable characters */
        AbstractCc0 f۱۰۱۹۸p;

        /* renamed from: q  reason: contains not printable characters */
        boolean f۱۰۱۹۹q;

        /* renamed from: r  reason: contains not printable characters */
        AbstractCf f۱۰۲۰۰r;

        /* renamed from: s  reason: contains not printable characters */
        boolean f۱۰۲۰۱s;

        Cd() {
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
