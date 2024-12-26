package android.support.v4.app;

import a.b.g.g.n;
import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.c;
import android.arch.lifecycle.j;
import android.arch.lifecycle.p;
import android.arch.lifecycle.q;
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

public class f implements ComponentCallbacks, View.OnCreateContextMenuListener, android.arch.lifecycle.e, q {
    private static final n<String, Class<?>> Y = new n<>();
    static final Object Z = new Object();
    int A;
    String B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H = true;
    boolean I;
    ViewGroup J;
    View K;
    View L;
    boolean M;
    boolean N = true;
    d O;
    boolean P;
    boolean Q;
    float R;
    LayoutInflater S;
    boolean T;
    android.arch.lifecycle.f U = new android.arch.lifecycle.f(this);
    android.arch.lifecycle.f V;
    android.arch.lifecycle.e W;
    j<android.arch.lifecycle.e> X = new j<>();

    /* renamed from: c  reason: collision with root package name */
    int f۱۰۷۰c = 0;

    /* renamed from: d  reason: collision with root package name */
    Bundle f۱۰۷۱d;

    /* renamed from: e  reason: collision with root package name */
    SparseArray<Parcelable> f۱۰۷۲e;

    /* renamed from: f  reason: collision with root package name */
    Boolean f۱۰۷۳f;

    /* renamed from: g  reason: collision with root package name */
    int f۱۰۷۴g = -1;

    /* renamed from: h  reason: collision with root package name */
    String f۱۰۷۵h;
    Bundle i;
    f j;
    int k = -1;
    int l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    l t;
    j u;
    l v;
    m w;
    p x;
    f y;
    int z;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.f$f  reason: collision with other inner class name */
    public interface AbstractC۰۰۲۵f {
        void a();

        void b();
    }

    @Override // android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return this.U;
    }

    @Override // android.arch.lifecycle.q
    public p b() {
        if (k() != null) {
            if (this.x == null) {
                this.x = new p();
            }
            return this.x;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final Bundle f۱۰۸۷c;

        g(Bundle state) {
            this.f۱۰۸۷c = state;
        }

        g(Parcel in, ClassLoader loader) {
            Bundle bundle;
            this.f۱۰۸۷c = in.readBundle();
            if (loader != null && (bundle = this.f۱۰۸۷c) != null) {
                bundle.setClassLoader(loader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeBundle(this.f۱۰۸۷c);
        }

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel in) {
                return new g(in, null);
            }

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

    public static class e extends RuntimeException {
        public e(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    public static f a(Context context, String fname, Bundle args) {
        try {
            Class<?> clazz = Y.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                Y.put(fname, clazz);
            }
            f f2 = (f) clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f2.getClass().getClassLoader());
                f2.m(args);
            }
            return f2;
        } catch (ClassNotFoundException e2) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new e("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new e("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e6);
        }
    }

    static boolean a(Context context, String fname) {
        try {
            Class<?> clazz = Y.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                Y.put(fname, clazz);
            }
            return f.class.isAssignableFrom(clazz);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void l(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.f۱۰۷۲e;
        if (sparseArray != null) {
            this.L.restoreHierarchyState(sparseArray);
            this.f۱۰۷۲e = null;
        }
        this.I = false;
        f(savedInstanceState);
        if (!this.I) {
            throw new d0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.K != null) {
            this.V.a(c.a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int index, f parent) {
        this.f۱۰۷۴g = index;
        if (parent != null) {
            this.f۱۰۷۵h = parent.f۱۰۷۵h + ":" + this.f۱۰۷۴g;
            return;
        }
        this.f۱۰۷۵h = "android:fragment:" + this.f۱۰۷۴g;
    }

    /* access modifiers changed from: package-private */
    public final boolean G() {
        return this.s > 0;
    }

    public final boolean equals(Object o2) {
        return super.equals(o2);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.b.g.g.d.a(this, sb);
        if (this.f۱۰۷۴g >= 0) {
            sb.append(" #");
            sb.append(this.f۱۰۷۴g);
        }
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public void m(Bundle args) {
        if (this.f۱۰۷۴g < 0 || !I()) {
            this.i = args;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public final Bundle i() {
        return this.i;
    }

    public final boolean I() {
        l lVar = this.t;
        if (lVar == null) {
            return false;
        }
        return lVar.c();
    }

    public void a(g state) {
        Bundle bundle;
        if (this.f۱۰۷۴g < 0) {
            if (state == null || (bundle = state.f۱۰۸۷c) == null) {
                bundle = null;
            }
            this.f۱۰۷۱d = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public Context k() {
        j jVar = this.u;
        if (jVar == null) {
            return null;
        }
        return jVar.c();
    }

    public final Context b0() {
        Context context = k();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final g d() {
        j jVar = this.u;
        if (jVar == null) {
            return null;
        }
        return (g) jVar.b();
    }

    public final Resources v() {
        return b0().getResources();
    }

    public final k p() {
        return this.t;
    }

    public final k j() {
        if (this.v == null) {
            C();
            int i2 = this.f۱۰۷۰c;
            if (i2 >= 4) {
                this.v.k();
            } else if (i2 >= 3) {
                this.v.l();
            } else if (i2 >= 2) {
                this.v.e();
            } else if (i2 >= 1) {
                this.v.f();
            }
        }
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public k S() {
        return this.v;
    }

    public final f t() {
        return this.y;
    }

    public final boolean D() {
        return this.u != null && this.m;
    }

    public final boolean E() {
        return this.C;
    }

    public void a(boolean hidden) {
    }

    public void g(boolean menuVisible) {
        if (this.H != menuVisible) {
            this.H = menuVisible;
            if (this.G && D() && !E()) {
                this.u.i();
            }
        }
    }

    public void h(boolean isVisibleToUser) {
        if (!this.N && isVisibleToUser && this.f۱۰۷۰c < 3 && this.t != null && D() && this.T) {
            this.t.k(this);
        }
        this.N = isVisibleToUser;
        this.M = this.f۱۰۷۰c < 3 && !isVisibleToUser;
        if (this.f۱۰۷۱d != null) {
            this.f۱۰۷۳f = Boolean.valueOf(isVisibleToUser);
        }
    }

    public void a(Intent intent) {
        a(intent, (Bundle) null);
    }

    public void a(Intent intent, Bundle options) {
        j jVar = this.u;
        if (jVar != null) {
            jVar.a(this, intent, -1, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void a(Intent intent, int requestCode) {
        a(intent, requestCode, (Bundle) null);
    }

    public void a(Intent intent, int requestCode, Bundle options) {
        j jVar = this.u;
        if (jVar != null) {
            jVar.a(this, intent, requestCode, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void a(int requestCode, int resultCode, Intent data) {
    }

    public void a(int requestCode, String[] permissions, int[] grantResults) {
    }

    public LayoutInflater d(Bundle savedInstanceState) {
        return a(savedInstanceState);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater i(Bundle savedInstanceState) {
        this.S = d(savedInstanceState);
        return this.S;
    }

    @Deprecated
    public LayoutInflater a(Bundle savedFragmentState) {
        j jVar = this.u;
        if (jVar != null) {
            LayoutInflater result = jVar.f();
            j();
            l lVar = this.v;
            lVar.p();
            android.support.v4.view.f.b(result, lVar);
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void a(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.I = true;
        j jVar = this.u;
        Activity hostActivity = jVar == null ? null : jVar.b();
        if (hostActivity != null) {
            this.I = false;
            a(hostActivity, attrs, savedInstanceState);
        }
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.I = true;
    }

    public void a(f childFragment) {
    }

    public void a(Context context) {
        this.I = true;
        j jVar = this.u;
        Activity hostActivity = jVar == null ? null : jVar.b();
        if (hostActivity != null) {
            this.I = false;
            a(hostActivity);
        }
    }

    @Deprecated
    public void a(Activity activity) {
        this.I = true;
    }

    public Animation a(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public Animator b(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public void c(Bundle savedInstanceState) {
        this.I = true;
        k(savedInstanceState);
        l lVar = this.v;
        if (lVar != null && !lVar.c(1)) {
            this.v.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle savedInstanceState) {
        Parcelable p2;
        if (savedInstanceState != null && (p2 = savedInstanceState.getParcelable("android:support:fragments")) != null) {
            if (this.v == null) {
                C();
            }
            this.v.a(p2, this.w);
            this.w = null;
            this.v.f();
        }
    }

    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    public void a(View view, Bundle savedInstanceState) {
    }

    public View A() {
        return this.K;
    }

    public void b(Bundle savedInstanceState) {
        this.I = true;
    }

    public void f(Bundle savedInstanceState) {
        this.I = true;
    }

    public void Q() {
        this.I = true;
    }

    public void P() {
        this.I = true;
    }

    public void e(Bundle outState) {
    }

    public void b(boolean isInMultiWindowMode) {
    }

    public void c(boolean isInPictureInPictureMode) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        this.I = true;
    }

    public void O() {
        this.I = true;
    }

    public void R() {
        this.I = true;
    }

    public void onLowMemory() {
        this.I = true;
    }

    public void M() {
        this.I = true;
    }

    public void K() {
        boolean isChangingConfigurations = true;
        this.I = true;
        g activity = d();
        if (activity == null || !activity.isChangingConfigurations()) {
            isChangingConfigurations = false;
        }
        p pVar = this.x;
        if (pVar != null && !isChangingConfigurations) {
            pVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        this.f۱۰۷۴g = -1;
        this.f۱۰۷۵h = null;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = null;
        this.u = null;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
        this.F = false;
    }

    public void N() {
        this.I = true;
    }

    public void a(Menu menu, MenuInflater inflater) {
    }

    public void b(Menu menu) {
    }

    public void L() {
    }

    public boolean b(MenuItem item) {
        return false;
    }

    public void a(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu menu, View v2, ContextMenu.ContextMenuInfo menuInfo) {
        d().onCreateContextMenu(menu, v2, menuInfo);
    }

    public boolean a(MenuItem item) {
        return false;
    }

    public Object l() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۸۵g;
    }

    public Object w() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f۱۰۸۶h;
        return obj == Z ? l() : obj;
    }

    public Object n() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public Object u() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == Z ? n() : obj;
    }

    public Object x() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public Object y() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == Z ? x() : obj;
    }

    public boolean e() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean f() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void c0() {
        l lVar = this.t;
        if (lVar == null || lVar.o == null) {
            d0().q = false;
        } else if (Looper.myLooper() != this.t.o.e().getLooper()) {
            this.t.o.e().postAtFrontOfQueue(new a());
        } else {
            c();
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            f.this.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        AbstractC۰۰۲۵f listener;
        d dVar = this.O;
        if (dVar == null) {
            listener = null;
        } else {
            dVar.q = false;
            AbstractC۰۰۲۵f listener2 = dVar.r;
            dVar.r = null;
            listener = listener2;
        }
        if (listener != null) {
            listener.a();
        }
    }

    public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.z));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.A));
        writer.print(" mTag=");
        writer.println(this.B);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.f۱۰۷۰c);
        writer.print(" mIndex=");
        writer.print(this.f۱۰۷۴g);
        writer.print(" mWho=");
        writer.print(this.f۱۰۷۵h);
        writer.print(" mBackStackNesting=");
        writer.println(this.s);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.m);
        writer.print(" mRemoving=");
        writer.print(this.n);
        writer.print(" mFromLayout=");
        writer.print(this.o);
        writer.print(" mInLayout=");
        writer.println(this.p);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.C);
        writer.print(" mDetached=");
        writer.print(this.D);
        writer.print(" mMenuVisible=");
        writer.print(this.H);
        writer.print(" mHasMenu=");
        writer.println(this.G);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.E);
        writer.print(" mRetaining=");
        writer.print(this.F);
        writer.print(" mUserVisibleHint=");
        writer.println(this.N);
        if (this.t != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.t);
        }
        if (this.u != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.u);
        }
        if (this.y != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.y);
        }
        if (this.i != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.i);
        }
        if (this.f۱۰۷۱d != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.f۱۰۷۱d);
        }
        if (this.f۱۰۷۲e != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.f۱۰۷۲e);
        }
        if (this.j != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(this.j);
            writer.print(" mTargetRequestCode=");
            writer.println(this.l);
        }
        if (q() != 0) {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(q());
        }
        if (this.J != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.J);
        }
        if (this.K != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.K);
        }
        if (this.L != null) {
            writer.print(prefix);
            writer.print("mInnerView=");
            writer.println(this.K);
        }
        if (g() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(g());
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(z());
        }
        if (k() != null) {
            u.a(this).a(prefix, fd, writer, args);
        }
        if (this.v != null) {
            writer.print(prefix);
            writer.println("Child " + this.v + ":");
            l lVar = this.v;
            lVar.a(prefix + "  ", fd, writer, args);
        }
    }

    /* access modifiers changed from: package-private */
    public f a(String who) {
        if (who.equals(this.f۱۰۷۵h)) {
            return this;
        }
        l lVar = this.v;
        if (lVar != null) {
            return lVar.b(who);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        if (this.u != null) {
            this.v = new l();
            this.v.a(this.u, new b(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public class b extends h {
        b() {
        }

        @Override // android.support.v4.app.h
        public View a(int id) {
            View view = f.this.K;
            if (view != null) {
                return view.findViewById(id);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // android.support.v4.app.h
        public boolean a() {
            return f.this.K != null;
        }

        @Override // android.support.v4.app.h
        public f a(Context context, String className, Bundle arguments) {
            return f.this.u.a(context, className, arguments);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Bundle savedInstanceState) {
        l lVar = this.v;
        if (lVar != null) {
            lVar.r();
        }
        this.f۱۰۷۰c = 1;
        this.I = false;
        c(savedInstanceState);
        this.T = true;
        if (this.I) {
            this.U.a(c.a.ON_CREATE);
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void b(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        l lVar = this.v;
        if (lVar != null) {
            lVar.r();
        }
        this.r = true;
        this.W = new c();
        this.V = null;
        this.K = a(inflater, container, savedInstanceState);
        if (this.K != null) {
            this.W.a();
            this.X.a(this.W);
        } else if (this.V == null) {
            this.W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    class c implements android.arch.lifecycle.e {
        c() {
        }

        @Override // android.arch.lifecycle.e
        public android.arch.lifecycle.c a() {
            f fVar = f.this;
            if (fVar.V == null) {
                fVar.V = new android.arch.lifecycle.f(fVar.W);
            }
            return f.this.V;
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle savedInstanceState) {
        l lVar = this.v;
        if (lVar != null) {
            lVar.r();
        }
        this.f۱۰۷۰c = 2;
        this.I = false;
        b(savedInstanceState);
        if (this.I) {
            l lVar2 = this.v;
            if (lVar2 != null) {
                lVar2.e();
                return;
            }
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        l lVar = this.v;
        if (lVar != null) {
            lVar.r();
            this.v.o();
        }
        this.f۱۰۷۰c = 3;
        this.I = false;
        Q();
        if (this.I) {
            l lVar2 = this.v;
            if (lVar2 != null) {
                lVar2.l();
            }
            this.U.a(c.a.ON_START);
            if (this.K != null) {
                this.V.a(c.a.ON_START);
                return;
            }
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        l lVar = this.v;
        if (lVar != null) {
            lVar.r();
            this.v.o();
        }
        this.f۱۰۷۰c = 4;
        this.I = false;
        P();
        if (this.I) {
            l lVar2 = this.v;
            if (lVar2 != null) {
                lVar2.k();
                this.v.o();
            }
            this.U.a(c.a.ON_RESUME);
            if (this.K != null) {
                this.V.a(c.a.ON_RESUME);
                return;
            }
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void J() {
        l lVar = this.v;
        if (lVar != null) {
            lVar.r();
        }
    }

    /* access modifiers changed from: package-private */
    public void d(boolean isInMultiWindowMode) {
        b(isInMultiWindowMode);
        l lVar = this.v;
        if (lVar != null) {
            lVar.a(isInMultiWindowMode);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(boolean isInPictureInPictureMode) {
        c(isInPictureInPictureMode);
        l lVar = this.v;
        if (lVar != null) {
            lVar.b(isInPictureInPictureMode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        l lVar = this.v;
        if (lVar != null) {
            lVar.a(newConfig);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        onLowMemory();
        l lVar = this.v;
        if (lVar != null) {
            lVar.i();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            show = true;
            a(menu, inflater);
        }
        l lVar = this.v;
        if (lVar != null) {
            return show | lVar.a(menu, inflater);
        }
        return show;
    }

    /* access modifiers changed from: package-private */
    public boolean d(Menu menu) {
        boolean show = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            show = true;
            b(menu);
        }
        l lVar = this.v;
        if (lVar != null) {
            return show | lVar.b(menu);
        }
        return show;
    }

    /* access modifiers changed from: package-private */
    public boolean d(MenuItem item) {
        if (this.C) {
            return false;
        }
        if (this.G && this.H && b(item)) {
            return true;
        }
        l lVar = this.v;
        if (lVar == null || !lVar.b(item)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c(MenuItem item) {
        if (this.C) {
            return false;
        }
        if (a(item)) {
            return true;
        }
        l lVar = this.v;
        if (lVar == null || !lVar.a(item)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c(Menu menu) {
        if (!this.C) {
            if (this.G && this.H) {
                a(menu);
            }
            l lVar = this.v;
            if (lVar != null) {
                lVar.a(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Bundle outState) {
        Parcelable p2;
        e(outState);
        l lVar = this.v;
        if (lVar != null && (p2 = lVar.u()) != null) {
            outState.putParcelable("android:support:fragments", p2);
        }
    }

    /* access modifiers changed from: package-private */
    public void X() {
        if (this.K != null) {
            this.V.a(c.a.ON_PAUSE);
        }
        this.U.a(c.a.ON_PAUSE);
        l lVar = this.v;
        if (lVar != null) {
            lVar.j();
        }
        this.f۱۰۷۰c = 3;
        this.I = false;
        O();
        if (!this.I) {
            throw new d0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        if (this.K != null) {
            this.V.a(c.a.ON_STOP);
        }
        this.U.a(c.a.ON_STOP);
        l lVar = this.v;
        if (lVar != null) {
            lVar.m();
        }
        this.f۱۰۷۰c = 2;
        this.I = false;
        R();
        if (!this.I) {
            throw new d0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        if (this.K != null) {
            this.V.a(c.a.ON_DESTROY);
        }
        l lVar = this.v;
        if (lVar != null) {
            lVar.h();
        }
        this.f۱۰۷۰c = 1;
        this.I = false;
        M();
        if (this.I) {
            u.a(this).a();
            this.r = false;
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.U.a(c.a.ON_DESTROY);
        l lVar = this.v;
        if (lVar != null) {
            lVar.g();
        }
        this.f۱۰۷۰c = 0;
        this.I = false;
        this.T = false;
        K();
        if (this.I) {
            this.v = null;
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.I = false;
        N();
        this.S = null;
        if (this.I) {
            l lVar = this.v;
            if (lVar == null) {
                return;
            }
            if (this.F) {
                lVar.g();
                this.v = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new d0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    public void a(AbstractC۰۰۲۵f listener) {
        d0();
        AbstractC۰۰۲۵f fVar = this.O.r;
        if (listener != fVar) {
            if (listener == null || fVar == null) {
                d dVar = this.O;
                if (dVar.q) {
                    dVar.r = listener;
                }
                if (listener != null) {
                    listener.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    private d d0() {
        if (this.O == null) {
            this.O = new d();
        }
        return this.O;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۸۲d;
    }

    /* access modifiers changed from: package-private */
    public void c(int animResourceId) {
        if (this.O != null || animResourceId != 0) {
            d0().f۱۰۸۲d = animResourceId;
        }
    }

    /* access modifiers changed from: package-private */
    public int r() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۸۳e;
    }

    /* access modifiers changed from: package-private */
    public void a(int nextTransition, int nextTransitionStyle) {
        if (this.O != null || nextTransition != 0 || nextTransitionStyle != 0) {
            d0();
            d dVar = this.O;
            dVar.f۱۰۸۳e = nextTransition;
            dVar.f۱۰۸۴f = nextTransitionStyle;
        }
    }

    /* access modifiers changed from: package-private */
    public int s() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۸۴f;
    }

    /* access modifiers changed from: package-private */
    public c0 m() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    /* access modifiers changed from: package-private */
    public c0 o() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    /* access modifiers changed from: package-private */
    public View g() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۷۹a;
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        d0().f۱۰۷۹a = view;
    }

    /* access modifiers changed from: package-private */
    public void a(Animator animator) {
        d0().f۱۰۸۰b = animator;
    }

    /* access modifiers changed from: package-private */
    public Animator h() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f۱۰۸۰b;
    }

    /* access modifiers changed from: package-private */
    public int z() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f۱۰۸۱c;
    }

    /* access modifiers changed from: package-private */
    public void d(int state) {
        d0().f۱۰۸۱c = state;
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    /* access modifiers changed from: package-private */
    public void f(boolean replaced) {
        d0().s = replaced;
    }

    /* access modifiers changed from: package-private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f۱۰۷۹a;

        /* renamed from: b  reason: collision with root package name */
        Animator f۱۰۸۰b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۰۸۱c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۰۸۲d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۰۸۳e;

        /* renamed from: f  reason: collision with root package name */
        int f۱۰۸۴f;

        /* renamed from: g  reason: collision with root package name */
        Object f۱۰۸۵g = null;

        /* renamed from: h  reason: collision with root package name */
        Object f۱۰۸۶h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        c0 o;
        c0 p;
        boolean q;
        AbstractC۰۰۲۵f r;
        boolean s;

        d() {
            Object obj = f.Z;
            this.f۱۰۸۶h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }
}
