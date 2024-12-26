package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.d0.c;
import android.support.v7.widget.d;
import android.support.v7.widget.d0;
import android.support.v7.widget.m0;
import android.support.v7.widget.p1;
import android.support.v7.widget.q1;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements android.support.v4.view.s, android.support.v4.view.j {
    private static final int[] B0 = {16843830};
    private static final int[] C0 = {16842987};
    static final boolean D0;
    static final boolean E0 = (Build.VERSION.SDK_INT >= 23);
    static final boolean F0 = (Build.VERSION.SDK_INT >= 16);
    static final boolean G0 = (Build.VERSION.SDK_INT >= 21);
    private static final boolean H0 = (Build.VERSION.SDK_INT <= 15);
    private static final boolean I0 = (Build.VERSION.SDK_INT <= 15);
    private static final Class<?>[] J0;
    static final Interpolator K0 = new c();
    private boolean A;
    private final q1.b A0;
    private int B;
    boolean C;
    private final AccessibilityManager D;
    private List<q> E;
    boolean F;
    boolean G;
    private int H;
    private int I;
    private k J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    private EdgeEffect N;
    l O;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private r a0;
    private final int b0;

    /* renamed from: c  reason: collision with root package name */
    private final x f۱۸۱۸c;
    private final int c0;

    /* renamed from: d  reason: collision with root package name */
    final v f۱۸۱۹d;
    private float d0;

    /* renamed from: e  reason: collision with root package name */
    private y f۱۸۲۰e;
    private float e0;

    /* renamed from: f  reason: collision with root package name */
    d f۱۸۲۱f;
    private boolean f0;

    /* renamed from: g  reason: collision with root package name */
    d0 f۱۸۲۲g;
    final c0 g0;

    /* renamed from: h  reason: collision with root package name */
    final q1 f۱۸۲۳h;
    m0 h0;
    boolean i;
    m0.b i0;
    final Runnable j;
    final a0 j0;
    final Rect k;
    private t k0;
    private final Rect l;
    private List<t> l0;
    final RectF m;
    boolean m0;
    g n;
    boolean n0;
    o o;
    private l.b o0;
    w p;
    boolean p0;
    final ArrayList<n> q;
    v0 q0;
    private final ArrayList<s> r;
    private j r0;
    private s s;
    private final int[] s0;
    boolean t;
    private android.support.v4.view.l t0;
    boolean u;
    private final int[] u0;
    boolean v;
    final int[] v0;
    boolean w;
    private final int[] w0;
    private int x;
    final int[] x0;
    boolean y;
    final List<d0> y0;
    boolean z;
    private Runnable z0;

    public static abstract class b0 {
        public abstract View a(v vVar, int i, int i2);
    }

    public interface j {
        int a(int i, int i2);
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        void a(boolean z);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public interface w {
        void a(d0 d0Var);
    }

    public static abstract class z {

        public interface a {
        }

        public abstract int a();

        public abstract void a(int i);

        /* access modifiers changed from: package-private */
        public abstract void a(int i, int i2);

        /* access modifiers changed from: protected */
        public abstract void a(View view);

        public abstract boolean b();

        public abstract boolean c();

        /* access modifiers changed from: protected */
        public final void d() {
            throw null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        D0 = i2 == 18 || i2 == 19 || i2 == 20;
        Class<?> cls = Integer.TYPE;
        J0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.z) {
                    recyclerView2.y = true;
                } else {
                    recyclerView2.b();
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.O;
            if (lVar != null) {
                lVar.i();
            }
            RecyclerView.this.p0 = false;
        }
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    class d implements q1.b {
        d() {
        }

        @Override // android.support.v7.widget.q1.b
        public void c(d0 viewHolder, l.c info2, l.c postInfo) {
            RecyclerView.this.f۱۸۱۹d.c(viewHolder);
            RecyclerView.this.b(viewHolder, info2, postInfo);
        }

        @Override // android.support.v7.widget.q1.b
        public void a(d0 viewHolder, l.c preInfo, l.c info2) {
            RecyclerView.this.a(viewHolder, preInfo, info2);
        }

        @Override // android.support.v7.widget.q1.b
        public void b(d0 viewHolder, l.c preInfo, l.c postInfo) {
            viewHolder.a(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.F) {
                if (recyclerView.O.a(viewHolder, viewHolder, preInfo, postInfo)) {
                    RecyclerView.this.s();
                }
            } else if (recyclerView.O.c(viewHolder, preInfo, postInfo)) {
                RecyclerView.this.s();
            }
        }

        @Override // android.support.v7.widget.q1.b
        public void a(d0 viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.o.a(viewHolder.f۱۸۴۱c, recyclerView.f۱۸۱۹d);
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۸۱۸c = new x();
        this.f۱۸۱۹d = new v();
        this.f۱۸۲۳h = new q1();
        this.j = new a();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new RectF();
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.x = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = new k();
        this.O = new g0();
        this.P = 0;
        this.Q = -1;
        this.d0 = Float.MIN_VALUE;
        this.e0 = Float.MIN_VALUE;
        this.f0 = true;
        this.g0 = new c0();
        this.i0 = G0 ? new m0.b() : null;
        this.j0 = new a0();
        this.m0 = false;
        this.n0 = false;
        this.o0 = new m();
        this.p0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new ArrayList();
        this.z0 = new b();
        this.A0 = new d();
        if (attrs != null) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, C0, defStyle, 0);
            this.i = a2.getBoolean(0, true);
            a2.recycle();
        } else {
            this.i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration vc = ViewConfiguration.get(context);
        this.W = vc.getScaledTouchSlop();
        this.d0 = android.support.v4.view.v.b(vc, context);
        this.e0 = android.support.v4.view.v.c(vc, context);
        this.b0 = vc.getScaledMinimumFlingVelocity();
        this.c0 = vc.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.a(this.o0);
        k();
        G();
        F();
        if (android.support.v4.view.u.i(this) == 0) {
            android.support.v4.view.u.f(this, 1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new v0(this));
        boolean nestedScrollingEnabled = true;
        if (attrs != null) {
            TypedArray a3 = context.obtainStyledAttributes(attrs, a.b.h.e.b.RecyclerView, defStyle, 0);
            String layoutManagerName = a3.getString(a.b.h.e.b.RecyclerView_layoutManager);
            if (a3.getInt(a.b.h.e.b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.v = a3.getBoolean(a.b.h.e.b.RecyclerView_fastScrollEnabled, false);
            if (this.v) {
                a((StateListDrawable) a3.getDrawable(a.b.h.e.b.RecyclerView_fastScrollVerticalThumbDrawable), a3.getDrawable(a.b.h.e.b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) a3.getDrawable(a.b.h.e.b.RecyclerView_fastScrollHorizontalThumbDrawable), a3.getDrawable(a.b.h.e.b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            a3.recycle();
            a(context, layoutManagerName, attrs, defStyle, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray a4 = context.obtainStyledAttributes(attrs, B0, defStyle, 0);
                boolean nestedScrollingEnabled2 = a4.getBoolean(0, true);
                a4.recycle();
                nestedScrollingEnabled = nestedScrollingEnabled2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(nestedScrollingEnabled);
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return " " + super.toString() + ", adapter:" + this.n + ", layout:" + this.o + ", context:" + getContext();
    }

    @SuppressLint({"InlinedApi"})
    private void F() {
        if (android.support.v4.view.u.j(this) == 0) {
            android.support.v4.view.u.g(this, 8);
        }
    }

    public v0 getCompatAccessibilityDelegate() {
        return this.q0;
    }

    public void setAccessibilityDelegateCompat(v0 accessibilityDelegate) {
        this.q0 = accessibilityDelegate;
        android.support.v4.view.u.a(this, this.q0);
    }

    private void a(Context context, String className, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        ClassLoader classLoader;
        Constructor<? extends LayoutManager> constructor;
        if (className != null) {
            String className2 = className.trim();
            if (!className2.isEmpty()) {
                String className3 = a(context, className2);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends LayoutManager> layoutManagerClass = classLoader.loadClass(className3).asSubclass(o.class);
                    Object[] constructorArgs = null;
                    try {
                        Constructor<? extends LayoutManager> constructor2 = layoutManagerClass.getConstructor(J0);
                        constructorArgs = new Object[]{context, attrs, Integer.valueOf(defStyleAttr), Integer.valueOf(defStyleRes)};
                        constructor = constructor2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = layoutManagerClass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e1) {
                            e1.initCause(e2);
                            throw new IllegalStateException(attrs.getPositionDescription() + ": Error creating LayoutManager " + className3, e1);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(constructorArgs));
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Unable to find LayoutManager " + className3, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Cannot access non-public constructor " + className3, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Class is not a LayoutManager " + className3, e7);
                }
            }
        }
    }

    private String a(Context context, String className) {
        if (className.charAt(0) == '.') {
            return context.getPackageName() + className;
        } else if (className.contains(".")) {
            return className;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + className;
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements d0.b {
        e() {
        }

        @Override // android.support.v7.widget.d0.b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // android.support.v7.widget.d0.b
        public void a(View child, int index) {
            RecyclerView.this.addView(child, index);
            RecyclerView.this.a(child);
        }

        @Override // android.support.v7.widget.d0.b
        public int d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // android.support.v7.widget.d0.b
        public void b(int index) {
            View child = RecyclerView.this.getChildAt(index);
            if (child != null) {
                RecyclerView.this.b(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeViewAt(index);
        }

        @Override // android.support.v7.widget.d0.b
        public View a(int offset) {
            return RecyclerView.this.getChildAt(offset);
        }

        @Override // android.support.v7.widget.d0.b
        public void a() {
            int count = b();
            for (int i = 0; i < count; i++) {
                View child = a(i);
                RecyclerView.this.b(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // android.support.v7.widget.d0.b
        public d0 b(View view) {
            return RecyclerView.k(view);
        }

        @Override // android.support.v7.widget.d0.b
        public void a(View child, int index, ViewGroup.LayoutParams layoutParams) {
            d0 vh = RecyclerView.k(child);
            if (vh != null) {
                if (vh.r() || vh.x()) {
                    vh.d();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + vh + RecyclerView.this.i());
                }
            }
            RecyclerView.this.attachViewToParent(child, index, layoutParams);
        }

        @Override // android.support.v7.widget.d0.b
        public void c(int offset) {
            d0 vh;
            View view = a(offset);
            if (!(view == null || (vh = RecyclerView.k(view)) == null)) {
                if (!vh.r() || vh.x()) {
                    vh.a(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + vh + RecyclerView.this.i());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) offset);
        }

        @Override // android.support.v7.widget.d0.b
        public void a(View child) {
            d0 vh = RecyclerView.k(child);
            if (vh != null) {
                vh.a(RecyclerView.this);
            }
        }

        @Override // android.support.v7.widget.d0.b
        public void c(View child) {
            d0 vh = RecyclerView.k(child);
            if (vh != null) {
                vh.b(RecyclerView.this);
            }
        }
    }

    private void G() {
        this.f۱۸۲۲g = new d0(new e());
    }

    /* access modifiers changed from: package-private */
    public class f implements d.a {
        f() {
        }

        @Override // android.support.v7.widget.d.a
        public d0 a(int position) {
            d0 vh = RecyclerView.this.a(position, true);
            if (vh != null && !RecyclerView.this.f۱۸۲۲g.c(vh.f۱۸۴۱c)) {
                return vh;
            }
            return null;
        }

        @Override // android.support.v7.widget.d.a
        public void b(int start, int count) {
            RecyclerView.this.a(start, count, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m0 = true;
            recyclerView.j0.f۱۸۲۸d += count;
        }

        @Override // android.support.v7.widget.d.a
        public void c(int positionStart, int itemCount) {
            RecyclerView.this.a(positionStart, itemCount, false);
            RecyclerView.this.m0 = true;
        }

        @Override // android.support.v7.widget.d.a
        public void a(int positionStart, int itemCount, Object payload) {
            RecyclerView.this.a(positionStart, itemCount, payload);
            RecyclerView.this.n0 = true;
        }

        @Override // android.support.v7.widget.d.a
        public void a(d.b op) {
            c(op);
        }

        /* access modifiers changed from: package-private */
        public void c(d.b op) {
            int i = op.f۲۰۰۹a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.o.a(recyclerView, op.f۲۰۱۰b, op.f۲۰۱۲d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.o.b(recyclerView2, op.f۲۰۱۰b, op.f۲۰۱۲d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.o.a(recyclerView3, op.f۲۰۱۰b, op.f۲۰۱۲d, op.f۲۰۱۱c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.o.a(recyclerView4, op.f۲۰۱۰b, op.f۲۰۱۲d, 1);
            }
        }

        @Override // android.support.v7.widget.d.a
        public void b(d.b op) {
            c(op);
        }

        @Override // android.support.v7.widget.d.a
        public void d(int positionStart, int itemCount) {
            RecyclerView.this.f(positionStart, itemCount);
            RecyclerView.this.m0 = true;
        }

        @Override // android.support.v7.widget.d.a
        public void a(int from, int to) {
            RecyclerView.this.g(from, to);
            RecyclerView.this.m0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f۱۸۲۱f = new d(new f());
    }

    public void setHasFixedSize(boolean hasFixedSize) {
        this.u = hasFixedSize;
    }

    public void setClipToPadding(boolean clipToPadding) {
        if (clipToPadding != this.i) {
            l();
        }
        this.i = clipToPadding;
        super.setClipToPadding(clipToPadding);
        if (this.w) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.i;
    }

    public void setScrollingTouchSlop(int slopConstant) {
        ViewConfiguration vc = ViewConfiguration.get(getContext());
        if (slopConstant != 0) {
            if (slopConstant != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + slopConstant + "; using default value");
            } else {
                this.W = vc.getScaledPagingTouchSlop();
                return;
            }
        }
        this.W = vc.getScaledTouchSlop();
    }

    public void setAdapter(g adapter) {
        setLayoutFrozen(false);
        a(adapter, false, true);
        b(false);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        l lVar = this.O;
        if (lVar != null) {
            lVar.b();
        }
        o oVar = this.o;
        if (oVar != null) {
            oVar.b(this.f۱۸۱۹d);
            this.o.c(this.f۱۸۱۹d);
        }
        this.f۱۸۱۹d.a();
    }

    private void a(g adapter, boolean compatibleWithPrevious, boolean removeAndRecycleViews) {
        g gVar = this.n;
        if (gVar != null) {
            gVar.b(this.f۱۸۱۸c);
            this.n.b(this);
        }
        if (!compatibleWithPrevious || removeAndRecycleViews) {
            t();
        }
        this.f۱۸۲۱f.f();
        g oldAdapter = this.n;
        this.n = adapter;
        if (adapter != null) {
            adapter.a(this.f۱۸۱۸c);
            adapter.a(this);
        }
        o oVar = this.o;
        if (oVar != null) {
            oVar.a(oldAdapter, this.n);
        }
        this.f۱۸۱۹d.a(oldAdapter, this.n, compatibleWithPrevious);
        this.j0.f۱۸۳۱g = true;
    }

    public g getAdapter() {
        return this.n;
    }

    public void setRecyclerListener(w listener) {
        this.p = listener;
    }

    public int getBaseline() {
        o oVar = this.o;
        if (oVar != null) {
            return oVar.d();
        }
        return super.getBaseline();
    }

    public void setLayoutManager(o layout) {
        if (layout != this.o) {
            x();
            if (this.o != null) {
                l lVar = this.O;
                if (lVar != null) {
                    lVar.b();
                }
                this.o.b(this.f۱۸۱۹d);
                this.o.c(this.f۱۸۱۹d);
                this.f۱۸۱۹d.a();
                if (this.t) {
                    this.o.a(this, this.f۱۸۱۹d);
                }
                this.o.f((RecyclerView) null);
                this.o = null;
            } else {
                this.f۱۸۱۹d.a();
            }
            this.f۱۸۲۲g.c();
            this.o = layout;
            if (layout != null) {
                if (layout.f۱۸۶۱b == null) {
                    this.o.f(this);
                    if (this.t) {
                        this.o.a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layout + " is already attached to a RecyclerView:" + layout.f۱۸۶۱b.i());
                }
            }
            this.f۱۸۱۹d.j();
            requestLayout();
        }
    }

    public void setOnFlingListener(r onFlingListener) {
        this.a0 = onFlingListener;
    }

    public r getOnFlingListener() {
        return this.a0;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        y state = new y(super.onSaveInstanceState());
        y yVar = this.f۱۸۲۰e;
        if (yVar != null) {
            state.a(yVar);
        } else {
            o oVar = this.o;
            if (oVar != null) {
                state.f۱۸۹۳e = oVar.x();
            } else {
                state.f۱۸۹۳e = null;
            }
        }
        return state;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable parcelable;
        if (!(state instanceof y)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.f۱۸۲۰e = (y) state;
        super.onRestoreInstanceState(this.f۱۸۲۰e.a());
        o oVar = this.o;
        if (oVar != null && (parcelable = this.f۱۸۲۰e.f۱۸۹۳e) != null) {
            oVar.a(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    private void d(d0 viewHolder) {
        View view = viewHolder.f۱۸۴۱c;
        boolean alreadyParented = view.getParent() == this;
        this.f۱۸۱۹d.c(e(view));
        if (viewHolder.r()) {
            this.f۱۸۲۲g.a(view, -1, view.getLayoutParams(), true);
        } else if (!alreadyParented) {
            this.f۱۸۲۲g.a(view, true);
        } else {
            this.f۱۸۲۲g.a(view);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i(View view) {
        w();
        boolean removed = this.f۱۸۲۲g.e(view);
        if (removed) {
            d0 viewHolder = k(view);
            this.f۱۸۱۹d.c(viewHolder);
            this.f۱۸۱۹d.b(viewHolder);
        }
        c(!removed);
        return removed;
    }

    public o getLayoutManager() {
        return this.o;
    }

    public u getRecycledViewPool() {
        return this.f۱۸۱۹d.d();
    }

    public void setRecycledViewPool(u pool) {
        this.f۱۸۱۹d.a(pool);
    }

    public void setViewCacheExtension(b0 extension) {
        this.f۱۸۱۹d.a(extension);
    }

    public void setItemViewCacheSize(int size) {
        this.f۱۸۱۹d.f(size);
    }

    public int getScrollState() {
        return this.P;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int state) {
        if (state != this.P) {
            this.P = state;
            if (state != 2) {
                O();
            }
            b(state);
        }
    }

    public void a(n decor, int index) {
        o oVar = this.o;
        if (oVar != null) {
            oVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (index < 0) {
            this.q.add(decor);
        } else {
            this.q.add(index, decor);
        }
        o();
        requestLayout();
    }

    public void a(n decor) {
        a(decor, -1);
    }

    public int getItemDecorationCount() {
        return this.q.size();
    }

    public void b(n decor) {
        o oVar = this.o;
        if (oVar != null) {
            oVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(decor);
        if (this.q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        o();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j childDrawingOrderCallback) {
        if (childDrawingOrderCallback != this.r0) {
            this.r0 = childDrawingOrderCallback;
            setChildrenDrawingOrderEnabled(this.r0 != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(t listener) {
        this.k0 = listener;
    }

    public void a(t listener) {
        if (this.l0 == null) {
            this.l0 = new ArrayList();
        }
        this.l0.add(listener);
    }

    public void b(t listener) {
        List<t> list = this.l0;
        if (list != null) {
            list.remove(listener);
        }
    }

    public void h(int position) {
        if (!this.z) {
            x();
            o oVar = this.o;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.h(position);
            awakenScrollBars();
        }
    }

    public void scrollTo(int x2, int y2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int x2, int y2) {
        o oVar = this.o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            boolean canScrollHorizontal = oVar.a();
            boolean canScrollVertical = this.o.b();
            if (canScrollHorizontal || canScrollVertical) {
                int i2 = 0;
                int i3 = canScrollHorizontal ? x2 : 0;
                if (canScrollVertical) {
                    i2 = y2;
                }
                a(i3, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int dx, int dy, int[] consumed) {
        w();
        q();
        a.b.g.d.a.a("RV Scroll");
        a(this.j0);
        int consumedX = 0;
        int consumedY = 0;
        if (dx != 0) {
            consumedX = this.o.a(dx, this.f۱۸۱۹d, this.j0);
        }
        if (dy != 0) {
            consumedY = this.o.b(dy, this.f۱۸۱۹d, this.j0);
        }
        a.b.g.d.a.a();
        u();
        r();
        c(false);
        if (consumed != null) {
            consumed[0] = consumedX;
            consumed[1] = consumedY;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.w || this.F) {
            a.b.g.d.a.a("RV FullInvalidate");
            c();
            a.b.g.d.a.a();
        } else if (this.f۱۸۲۱f.c()) {
            if (this.f۱۸۲۱f.c(4) && !this.f۱۸۲۱f.c(11)) {
                a.b.g.d.a.a("RV PartialInvalidate");
                w();
                q();
                this.f۱۸۲۱f.e();
                if (!this.y) {
                    if (E()) {
                        c();
                    } else {
                        this.f۱۸۲۱f.a();
                    }
                }
                c(true);
                r();
                a.b.g.d.a.a();
            } else if (this.f۱۸۲۱f.c()) {
                a.b.g.d.a.a("RV FullInvalidate");
                c();
                a.b.g.d.a.a();
            }
        }
    }

    private boolean E() {
        int childCount = this.f۱۸۲۲g.a();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.c(i2));
            if (!(holder == null || holder.x() || !holder.s())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r3 != 0) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r19, int r20, android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean");
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.o;
        if (oVar != null && oVar.a()) {
            return this.o.b(this.j0);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.o;
        if (oVar != null && oVar.a()) {
            return this.o.a(this.j0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.o;
        if (oVar != null && oVar.a()) {
            return this.o.c(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.o;
        if (oVar != null && oVar.b()) {
            return this.o.e(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.o;
        if (oVar != null && oVar.b()) {
            return this.o.d(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.o;
        if (oVar != null && oVar.b()) {
            return this.o.f(this.j0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.x++;
        if (this.x == 1 && !this.z) {
            this.y = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean performLayoutChildren) {
        if (this.x < 1) {
            this.x = 1;
        }
        if (!performLayoutChildren && !this.z) {
            this.y = false;
        }
        if (this.x == 1) {
            if (performLayoutChildren && this.y && !this.z && this.o != null && this.n != null) {
                c();
            }
            if (!this.z) {
                this.y = false;
            }
        }
        this.x--;
    }

    public void setLayoutFrozen(boolean frozen) {
        if (frozen != this.z) {
            a("Do not setLayoutFrozen in layout or scroll");
            if (!frozen) {
                this.z = false;
                if (!(!this.y || this.o == null || this.n == null)) {
                    requestLayout();
                }
                this.y = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            this.z = true;
            this.A = true;
            x();
        }
    }

    public void i(int dx, int dy) {
        a(dx, dy, (Interpolator) null);
    }

    public void a(int dx, int dy, Interpolator interpolator) {
        o oVar = this.o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            if (!oVar.a()) {
                dx = 0;
            }
            if (!this.o.b()) {
                dy = 0;
            }
            if (dx != 0 || dy != 0) {
                this.g0.a(dx, dy, interpolator);
            }
        }
    }

    public boolean e(int velocityX, int velocityY) {
        o oVar = this.o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.z) {
            return false;
        } else {
            boolean canScrollHorizontal = oVar.a();
            boolean canScrollVertical = this.o.b();
            if (!canScrollHorizontal || Math.abs(velocityX) < this.b0) {
                velocityX = 0;
            }
            if (!canScrollVertical || Math.abs(velocityY) < this.b0) {
                velocityY = 0;
            }
            if (!(velocityX == 0 && velocityY == 0) && !dispatchNestedPreFling((float) velocityX, (float) velocityY)) {
                boolean canScroll = canScrollHorizontal || canScrollVertical;
                dispatchNestedFling((float) velocityX, (float) velocityY, canScroll);
                r rVar = this.a0;
                if (rVar != null && rVar.a(velocityX, velocityY)) {
                    return true;
                }
                if (canScroll) {
                    int nestedScrollAxis = 0;
                    if (canScrollHorizontal) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (canScrollVertical) {
                        nestedScrollAxis |= 2;
                    }
                    j(nestedScrollAxis, 1);
                    int i2 = this.c0;
                    int velocityX2 = Math.max(-i2, Math.min(velocityX, i2));
                    int i3 = this.c0;
                    this.g0.a(velocityX2, Math.max(-i3, Math.min(velocityY, i3)));
                    return true;
                }
            }
            return false;
        }
    }

    public void x() {
        setScrollState(0);
        O();
    }

    private void O() {
        this.g0.b();
        o oVar = this.o;
        if (oVar != null) {
            oVar.B();
        }
    }

    public int getMinFlingVelocity() {
        return this.b0;
    }

    public int getMaxFlingVelocity() {
        return this.c0;
    }

    private void a(float x2, float overscrollX, float y2, float overscrollY) {
        boolean invalidate = false;
        if (overscrollX < 0.0f) {
            f();
            android.support.v4.widget.g.a(this.K, (-overscrollX) / ((float) getWidth()), 1.0f - (y2 / ((float) getHeight())));
            invalidate = true;
        } else if (overscrollX > 0.0f) {
            g();
            android.support.v4.widget.g.a(this.M, overscrollX / ((float) getWidth()), y2 / ((float) getHeight()));
            invalidate = true;
        }
        if (overscrollY < 0.0f) {
            h();
            android.support.v4.widget.g.a(this.L, (-overscrollY) / ((float) getHeight()), x2 / ((float) getWidth()));
            invalidate = true;
        } else if (overscrollY > 0.0f) {
            e();
            android.support.v4.widget.g.a(this.N, overscrollY / ((float) getHeight()), 1.0f - (x2 / ((float) getWidth())));
            invalidate = true;
        }
        if (invalidate || overscrollX != 0.0f || overscrollY != 0.0f) {
            android.support.v4.view.u.B(this);
        }
    }

    private void K() {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            needsInvalidate = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            needsInvalidate |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            needsInvalidate |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            needsInvalidate |= this.N.isFinished();
        }
        if (needsInvalidate) {
            android.support.v4.view.u.B(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int dx, int dy) {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null && !edgeEffect.isFinished() && dx > 0) {
            this.K.onRelease();
            needsInvalidate = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && dx < 0) {
            this.M.onRelease();
            needsInvalidate |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && dy > 0) {
            this.L.onRelease();
            needsInvalidate |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && dy < 0) {
            this.N.onRelease();
            needsInvalidate |= this.N.isFinished();
        }
        if (needsInvalidate) {
            android.support.v4.view.u.B(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int velocityX, int velocityY) {
        if (velocityX < 0) {
            f();
            this.K.onAbsorb(-velocityX);
        } else if (velocityX > 0) {
            g();
            this.M.onAbsorb(velocityX);
        }
        if (velocityY < 0) {
            h();
            this.L.onAbsorb(-velocityY);
        } else if (velocityY > 0) {
            e();
            this.N.onAbsorb(velocityY);
        }
        if (velocityX != 0 || velocityY != 0) {
            android.support.v4.view.u.B(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.K == null) {
            this.K = this.J.a(this, 0);
            if (this.i) {
                this.K.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.K.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.M == null) {
            this.M = this.J.a(this, 2);
            if (this.i) {
                this.M.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.M.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (this.L == null) {
            this.L = this.J.a(this, 1);
            if (this.i) {
                this.L.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.L.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.N == null) {
            this.N = this.J.a(this, 3);
            if (this.i) {
                this.N.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.N.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void setEdgeEffectFactory(k edgeEffectFactory) {
        a.b.g.g.m.a(edgeEffectFactory);
        this.J = edgeEffectFactory;
        l();
    }

    public k getEdgeEffectFactory() {
        return this.J;
    }

    public View focusSearch(View focused, int direction) {
        View result;
        View result2 = this.o.d(focused, direction);
        if (result2 != null) {
            return result2;
        }
        boolean z2 = true;
        boolean canRunFocusFailure = this.n != null && this.o != null && !n() && !this.z;
        FocusFinder ff = FocusFinder.getInstance();
        if (!canRunFocusFailure || !(direction == 2 || direction == 1)) {
            result = ff.findNextFocus(this, focused, direction);
            if (result == null && canRunFocusFailure) {
                b();
                if (c(focused) == null) {
                    return null;
                }
                w();
                result = this.o.a(focused, direction, this.f۱۸۱۹d, this.j0);
                c(false);
            }
        } else {
            boolean needsFocusFailureLayout = false;
            if (this.o.b()) {
                int absDir = direction == 2 ? 130 : 33;
                needsFocusFailureLayout = ff.findNextFocus(this, focused, absDir) == null;
                if (H0) {
                    direction = absDir;
                }
            }
            if (!needsFocusFailureLayout && this.o.a()) {
                int absDir2 = (direction == 2) ^ (this.o.j() == 1) ? 66 : 17;
                if (ff.findNextFocus(this, focused, absDir2) != null) {
                    z2 = false;
                }
                needsFocusFailureLayout = z2;
                if (H0) {
                    direction = absDir2;
                }
            }
            if (needsFocusFailureLayout) {
                b();
                if (c(focused) == null) {
                    return null;
                }
                w();
                this.o.a(focused, direction, this.f۱۸۱۹d, this.j0);
                c(false);
            }
            result = ff.findNextFocus(this, focused, direction);
        }
        if (result == null || result.hasFocusable()) {
            return a(focused, result, direction) ? result : super.focusSearch(focused, direction);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(focused, direction);
        }
        a(result, (View) null);
        return focused;
    }

    private boolean a(View focused, View next, int direction) {
        if (next == null || next == this || c(next) == null) {
            return false;
        }
        if (focused == null || c(focused) == null) {
            return true;
        }
        this.k.set(0, 0, focused.getWidth(), focused.getHeight());
        this.l.set(0, 0, next.getWidth(), next.getHeight());
        offsetDescendantRectToMyCoords(focused, this.k);
        offsetDescendantRectToMyCoords(next, this.l);
        int rtl = this.o.j() == 1 ? -1 : 1;
        int rightness = 0;
        Rect rect = this.k;
        int i2 = rect.left;
        int i3 = this.l.left;
        if ((i2 < i3 || rect.right <= i3) && this.k.right < this.l.right) {
            rightness = 1;
        } else {
            Rect rect2 = this.k;
            int i4 = rect2.right;
            int i5 = this.l.right;
            if ((i4 > i5 || rect2.left >= i5) && this.k.left > this.l.left) {
                rightness = -1;
            }
        }
        int downness = 0;
        Rect rect3 = this.k;
        int i6 = rect3.top;
        int i7 = this.l.top;
        if ((i6 < i7 || rect3.bottom <= i7) && this.k.bottom < this.l.bottom) {
            downness = 1;
        } else {
            Rect rect4 = this.k;
            int i8 = rect4.bottom;
            int i9 = this.l.bottom;
            if ((i8 > i9 || rect4.top >= i9) && this.k.top > this.l.top) {
                downness = -1;
            }
        }
        if (direction != 1) {
            if (direction != 2) {
                if (direction != 17) {
                    if (direction != 33) {
                        if (direction != 66) {
                            if (direction != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + direction + i());
                            } else if (downness > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (rightness > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (downness < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rightness < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (downness > 0 || (downness == 0 && rightness * rtl >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (downness < 0 || (downness == 0 && rightness * rtl <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.o.a(this, this.j0, child, focused) && focused != null) {
            a(child, focused);
        }
        super.requestChildFocus(child, focused);
    }

    private void a(View child, View focused) {
        View rectView = focused != null ? focused : child;
        this.k.set(0, 0, rectView.getWidth(), rectView.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = rectView.getLayoutParams();
        if (focusedLayoutParams instanceof p) {
            p lp = (p) focusedLayoutParams;
            if (!lp.f۱۸۷۶c) {
                Rect insets = lp.f۱۸۷۵b;
                Rect rect = this.k;
                rect.left -= insets.left;
                rect.right += insets.right;
                rect.top -= insets.top;
                rect.bottom += insets.bottom;
            }
        }
        if (focused != null) {
            offsetDescendantRectToMyCoords(focused, this.k);
            offsetRectIntoDescendantCoords(child, this.k);
        }
        this.o.a(this, child, this.k, !this.w, focused == null);
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
        return this.o.a(this, child, rect, immediate);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        o oVar = this.o;
        if (oVar == null || !oVar.a(this, views, direction, focusableMode)) {
            super.addFocusables(views, direction, focusableMode);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = 0;
        boolean z2 = true;
        this.t = true;
        if (!this.w || isLayoutRequested()) {
            z2 = false;
        }
        this.w = z2;
        o oVar = this.o;
        if (oVar != null) {
            oVar.a(this);
        }
        this.p0 = false;
        if (G0) {
            this.h0 = m0.f۲۱۵۵g.get();
            if (this.h0 == null) {
                this.h0 = new m0();
                Display display = android.support.v4.view.u.f(this);
                float refreshRate = 60.0f;
                if (!isInEditMode() && display != null) {
                    float displayRefreshRate = display.getRefreshRate();
                    if (displayRefreshRate >= 30.0f) {
                        refreshRate = displayRefreshRate;
                    }
                }
                m0 m0Var = this.h0;
                m0Var.f۲۱۵۹e = (long) (1.0E9f / refreshRate);
                m0.f۲۱۵۵g.set(m0Var);
            }
            this.h0.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m0 m0Var;
        super.onDetachedFromWindow();
        l lVar = this.O;
        if (lVar != null) {
            lVar.b();
        }
        x();
        this.t = false;
        o oVar = this.o;
        if (oVar != null) {
            oVar.a(this, this.f۱۸۱۹d);
        }
        this.y0.clear();
        removeCallbacks(this.z0);
        this.f۱۸۲۳h.b();
        if (G0 && (m0Var = this.h0) != null) {
            m0Var.b(this);
            this.h0 = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void a(String message) {
        if (n()) {
            if (message == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + i());
            }
            throw new IllegalStateException(message);
        } else if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + i()));
        }
    }

    public void a(s listener) {
        this.r.add(listener);
    }

    public void b(s listener) {
        this.r.remove(listener);
        if (this.s == listener) {
            this.s = null;
        }
    }

    private boolean b(MotionEvent e2) {
        int action = e2.getAction();
        if (action == 3 || action == 0) {
            this.s = null;
        }
        int listenerCount = this.r.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            s listener = this.r.get(i2);
            if (listener.b(this, e2) && action != 3) {
                this.s = listener;
                return true;
            }
        }
        return false;
    }

    private boolean a(MotionEvent e2) {
        int action = e2.getAction();
        s sVar = this.s;
        if (sVar != null) {
            if (action == 0) {
                this.s = null;
            } else {
                sVar.a(this, e2);
                if (action == 3 || action == 1) {
                    this.s = null;
                }
                return true;
            }
        }
        if (action == 0) {
            return false;
        }
        int listenerCount = this.r.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            s listener = this.r.get(i2);
            if (listener.b(this, e2)) {
                this.s = listener;
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent e2) {
        if (this.z) {
            return false;
        }
        if (b(e2)) {
            y();
            return true;
        }
        o oVar = this.o;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.a();
        boolean canScrollVertically = this.o.b();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(e2);
        int action = e2.getActionMasked();
        int actionIndex = e2.getActionIndex();
        if (action == 0) {
            if (this.A) {
                this.A = false;
            }
            this.Q = e2.getPointerId(0);
            int x2 = (int) (e2.getX() + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (e2.getY() + 0.5f);
            this.V = y2;
            this.T = y2;
            if (this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.w0;
            iArr[1] = 0;
            iArr[0] = 0;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            j(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.R.clear();
            a(0);
        } else if (action == 2) {
            int index = e2.findPointerIndex(this.Q);
            if (index < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (e2.getX(index) + 0.5f);
            int y3 = (int) (e2.getY(index) + 0.5f);
            if (this.P != 1) {
                int dx = x3 - this.S;
                int dy = y3 - this.T;
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx) > this.W) {
                    this.U = x3;
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy) > this.W) {
                    this.V = y3;
                    startScroll = true;
                }
                if (startScroll) {
                    setScrollState(1);
                }
            }
        } else if (action == 3) {
            y();
        } else if (action == 5) {
            this.Q = e2.getPointerId(actionIndex);
            int x4 = (int) (e2.getX(actionIndex) + 0.5f);
            this.U = x4;
            this.S = x4;
            int y4 = (int) (e2.getY(actionIndex) + 0.5f);
            this.V = y4;
            this.T = y4;
        } else if (action == 6) {
            c(e2);
        }
        if (this.P == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        int listenerCount = this.r.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            this.r.get(i2).a(disallowIntercept);
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onTouchEvent(MotionEvent e2) {
        int dy;
        int dx;
        int i2;
        int i3;
        int i4 = 0;
        if (this.z || this.A) {
            return false;
        }
        if (a(e2)) {
            y();
            return true;
        }
        o oVar = this.o;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.a();
        boolean canScrollVertically = this.o.b();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        boolean eventAddedToVelocityTracker = false;
        MotionEvent vtev = MotionEvent.obtain(e2);
        int action = e2.getActionMasked();
        int actionIndex = e2.getActionIndex();
        if (action == 0) {
            int[] iArr = this.w0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.w0;
        vtev.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (action == 0) {
            this.Q = e2.getPointerId(0);
            int x2 = (int) (e2.getX() + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (e2.getY() + 0.5f);
            this.V = y2;
            this.T = y2;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            j(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.R.addMovement(vtev);
            eventAddedToVelocityTracker = true;
            this.R.computeCurrentVelocity(1000, (float) this.c0);
            float xvel = canScrollHorizontally ? -this.R.getXVelocity(this.Q) : 0.0f;
            float yvel = canScrollVertically ? -this.R.getYVelocity(this.Q) : 0.0f;
            if ((xvel == 0.0f && yvel == 0.0f) || !e((int) xvel, (int) yvel)) {
                setScrollState(0);
            }
            M();
        } else if (action == 2) {
            int index = e2.findPointerIndex(this.Q);
            if (index < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (e2.getX(index) + 0.5f);
            int y3 = (int) (e2.getY(index) + 0.5f);
            int dx2 = this.U - x3;
            int dy2 = this.V - y3;
            if (a(dx2, dy2, this.v0, this.u0, 0)) {
                int[] iArr3 = this.v0;
                dx2 -= iArr3[0];
                dy2 -= iArr3[1];
                int[] iArr4 = this.u0;
                vtev.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.w0;
                int i5 = iArr5[0];
                int[] iArr6 = this.u0;
                iArr5[0] = i5 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.P != 1) {
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx2) > (i3 = this.W)) {
                    if (dx2 > 0) {
                        dx2 -= i3;
                    } else {
                        dx2 += i3;
                    }
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy2) > (i2 = this.W)) {
                    if (dy2 > 0) {
                        dy2 -= i2;
                    } else {
                        dy2 += i2;
                    }
                    startScroll = true;
                }
                if (startScroll) {
                    setScrollState(1);
                }
                dx = dx2;
                dy = dy2;
            } else {
                dx = dx2;
                dy = dy2;
            }
            if (this.P == 1) {
                int[] iArr7 = this.u0;
                this.U = x3 - iArr7[0];
                this.V = y3 - iArr7[1];
                int i6 = canScrollHorizontally ? dx : 0;
                if (canScrollVertically) {
                    i4 = dy;
                }
                if (a(i6, i4, vtev)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.h0 == null || (dx == 0 && dy == 0))) {
                    this.h0.a(this, dx, dy);
                }
            }
        } else if (action == 3) {
            y();
        } else if (action == 5) {
            this.Q = e2.getPointerId(actionIndex);
            int x4 = (int) (e2.getX(actionIndex) + 0.5f);
            this.U = x4;
            this.S = x4;
            int y4 = (int) (e2.getY(actionIndex) + 0.5f);
            this.V = y4;
            this.T = y4;
        } else if (action == 6) {
            c(e2);
        }
        if (!eventAddedToVelocityTracker) {
            this.R.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    private void M() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        K();
    }

    private void y() {
        M();
        setScrollState(0);
    }

    private void c(MotionEvent e2) {
        int actionIndex = e2.getActionIndex();
        if (e2.getPointerId(actionIndex) == this.Q) {
            int newIndex = actionIndex == 0 ? 1 : 0;
            this.Q = e2.getPointerId(newIndex);
            int x2 = (int) (e2.getX(newIndex) + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (e2.getY(newIndex) + 0.5f);
            this.V = y2;
            this.T = y2;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        float hScroll;
        float vScroll;
        if (this.o != null && !this.z && event.getAction() == 8) {
            if ((event.getSource() & 2) != 0) {
                if (this.o.b()) {
                    vScroll = -event.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.o.a()) {
                    hScroll = event.getAxisValue(10);
                } else {
                    hScroll = 0.0f;
                }
            } else if ((event.getSource() & 4194304) != 0) {
                float axisScroll = event.getAxisValue(26);
                if (this.o.b()) {
                    vScroll = -axisScroll;
                    hScroll = 0.0f;
                } else if (this.o.a()) {
                    vScroll = 0.0f;
                    hScroll = axisScroll;
                } else {
                    hScroll = 0.0f;
                    vScroll = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                hScroll = 0.0f;
            }
            if (!(vScroll == 0.0f && hScroll == 0.0f)) {
                a((int) (this.d0 * hScroll), (int) (this.e0 * vScroll), event);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthSpec, int heightSpec) {
        o oVar = this.o;
        if (oVar == null) {
            c(widthSpec, heightSpec);
            return;
        }
        boolean measureSpecModeIsExactly = false;
        if (oVar.u()) {
            int widthMode = View.MeasureSpec.getMode(widthSpec);
            int heightMode = View.MeasureSpec.getMode(heightSpec);
            this.o.a(this.f۱۸۱۹d, this.j0, widthSpec, heightSpec);
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                measureSpecModeIsExactly = true;
            }
            if (!measureSpecModeIsExactly && this.n != null) {
                if (this.j0.f۱۸۲۹e == 1) {
                    A();
                }
                this.o.b(widthSpec, heightSpec);
                this.j0.j = true;
                B();
                this.o.d(widthSpec, heightSpec);
                if (this.o.A()) {
                    this.o.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.j0.j = true;
                    B();
                    this.o.d(widthSpec, heightSpec);
                }
            }
        } else if (this.u) {
            this.o.a(this.f۱۸۱۹d, this.j0, widthSpec, heightSpec);
        } else {
            if (this.C) {
                w();
                q();
                I();
                r();
                a0 a0Var = this.j0;
                if (a0Var.l) {
                    a0Var.f۱۸۳۲h = true;
                } else {
                    this.f۱۸۲۱f.b();
                    this.j0.f۱۸۳۲h = false;
                }
                this.C = false;
                c(false);
            } else if (this.j0.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.n;
            if (gVar != null) {
                this.j0.f۱۸۳۰f = gVar.a();
            } else {
                this.j0.f۱۸۳۰f = 0;
            }
            w();
            this.o.a(this.f۱۸۱۹d, this.j0, widthSpec, heightSpec);
            c(false);
            this.j0.f۱۸۳۲h = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int widthSpec, int heightSpec) {
        setMeasuredDimension(o.a(widthSpec, getPaddingLeft() + getPaddingRight(), android.support.v4.view.u.m(this)), o.a(heightSpec, getPaddingTop() + getPaddingBottom(), android.support.v4.view.u.l(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (w2 != oldw || h2 != oldh) {
            l();
        }
    }

    public void setItemAnimator(l animator) {
        l lVar = this.O;
        if (lVar != null) {
            lVar.b();
            this.O.a((l.b) null);
        }
        this.O = animator;
        l lVar2 = this.O;
        if (lVar2 != null) {
            lVar2.a(this.o0);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.H++;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        a(true);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean enableChangeEvents) {
        this.H--;
        if (this.H < 1) {
            this.H = 0;
            if (enableChangeEvents) {
                z();
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void z() {
        int flags = this.B;
        this.B = 0;
        if (flags != 0 && m()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            android.support.v4.view.d0.a.a(event, flags);
            sendAccessibilityEventUnchecked(event);
        }
    }

    public boolean n() {
        return this.H > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean a(AccessibilityEvent event) {
        if (!n()) {
            return false;
        }
        int type = 0;
        if (event != null) {
            type = android.support.v4.view.d0.a.a(event);
        }
        if (type == 0) {
            type = 0;
        }
        this.B |= type;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        if (!a(event)) {
            super.sendAccessibilityEventUnchecked(event);
        }
    }

    public l getItemAnimator() {
        return this.O;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (!this.p0 && this.t) {
            android.support.v4.view.u.a(this, this.z0);
            this.p0 = true;
        }
    }

    private boolean H() {
        return this.O != null && this.o.C();
    }

    private void I() {
        if (this.F) {
            this.f۱۸۲۱f.f();
            if (this.G) {
                this.o.d(this);
            }
        }
        if (H()) {
            this.f۱۸۲۱f.e();
        } else {
            this.f۱۸۲۱f.b();
        }
        boolean z2 = false;
        boolean animationTypeSupported = this.m0 || this.n0;
        this.j0.k = this.w && this.O != null && (this.F || animationTypeSupported || this.o.f۱۸۶۷h) && (!this.F || this.n.c());
        a0 a0Var = this.j0;
        if (a0Var.k && animationTypeSupported && !this.F && H()) {
            z2 = true;
        }
        a0Var.l = z2;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.n == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.o == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            a0 a0Var = this.j0;
            a0Var.j = false;
            if (a0Var.f۱۸۲۹e == 1) {
                A();
                this.o.e(this);
                B();
            } else if (!this.f۱۸۲۱f.d() && this.o.q() == getWidth() && this.o.h() == getHeight()) {
                this.o.e(this);
            } else {
                this.o.e(this);
                B();
            }
            C();
        }
    }

    private void N() {
        int i2;
        View child = null;
        if (this.f0 && hasFocus() && this.n != null) {
            child = getFocusedChild();
        }
        d0 focusedVh = child == null ? null : d(child);
        if (focusedVh == null) {
            L();
            return;
        }
        this.j0.n = this.n.c() ? focusedVh.g() : -1;
        a0 a0Var = this.j0;
        if (this.F) {
            i2 = -1;
        } else if (focusedVh.p()) {
            i2 = focusedVh.f۱۸۴۴f;
        } else {
            i2 = focusedVh.f();
        }
        a0Var.m = i2;
        this.j0.o = l(focusedVh.f۱۸۴۱c);
    }

    private void L() {
        a0 a0Var = this.j0;
        a0Var.n = -1;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    private View D() {
        d0 nextFocus;
        int startFocusSearchIndex = this.j0.m;
        if (startFocusSearchIndex == -1) {
            startFocusSearchIndex = 0;
        }
        int itemCount = this.j0.a();
        for (int i2 = startFocusSearchIndex; i2 < itemCount; i2++) {
            d0 nextFocus2 = c(i2);
            if (nextFocus2 == null) {
                break;
            } else if (nextFocus2.f۱۸۴۱c.hasFocusable()) {
                return nextFocus2.f۱۸۴۱c;
            }
        }
        int i3 = Math.min(itemCount, startFocusSearchIndex) - 1;
        while (i3 >= 0 && (nextFocus = c(i3)) != null) {
            if (nextFocus.f۱۸۴۱c.hasFocusable()) {
                return nextFocus.f۱۸۴۱c;
            }
            i3--;
        }
        return null;
    }

    private void J() {
        View child;
        if (this.f0 && this.n != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!I0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f۱۸۲۲g.c(focusedChild)) {
                            return;
                        }
                    } else if (this.f۱۸۲۲g.a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                d0 focusTarget = null;
                if (this.j0.n != -1 && this.n.c()) {
                    focusTarget = a(this.j0.n);
                }
                View viewToFocus = null;
                if (focusTarget != null && !this.f۱۸۲۲g.c(focusTarget.f۱۸۴۱c) && focusTarget.f۱۸۴۱c.hasFocusable()) {
                    viewToFocus = focusTarget.f۱۸۴۱c;
                } else if (this.f۱۸۲۲g.a() > 0) {
                    viewToFocus = D();
                }
                if (viewToFocus != null) {
                    int i2 = this.j0.o;
                    if (!(((long) i2) == -1 || (child = viewToFocus.findViewById(i2)) == null || !child.isFocusable())) {
                        viewToFocus = child;
                    }
                    viewToFocus.requestFocus();
                }
            }
        }
    }

    private int l(View view) {
        int lastKnownId = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                lastKnownId = view.getId();
            }
        }
        return lastKnownId;
    }

    /* access modifiers changed from: package-private */
    public final void a(a0 state) {
        if (getScrollState() == 2) {
            OverScroller scroller = this.g0.f۱۸۳۶e;
            state.p = scroller.getFinalX() - scroller.getCurrX();
            state.q = scroller.getFinalY() - scroller.getCurrY();
            return;
        }
        state.p = 0;
        state.q = 0;
    }

    private void A() {
        boolean z2 = true;
        this.j0.a(1);
        a(this.j0);
        this.j0.j = false;
        w();
        this.f۱۸۲۳h.a();
        q();
        I();
        N();
        a0 a0Var = this.j0;
        if (!a0Var.k || !this.n0) {
            z2 = false;
        }
        a0Var.i = z2;
        this.n0 = false;
        this.m0 = false;
        a0 a0Var2 = this.j0;
        a0Var2.f۱۸۳۲h = a0Var2.l;
        a0Var2.f۱۸۳۰f = this.n.a();
        a(this.s0);
        if (this.j0.k) {
            int count = this.f۱۸۲۲g.a();
            for (int i2 = 0; i2 < count; i2++) {
                d0 holder = k(this.f۱۸۲۲g.c(i2));
                if (!holder.x() && (!holder.n() || this.n.c())) {
                    this.f۱۸۲۳h.c(holder, this.O.a(this.j0, holder, l.e(holder), holder.k()));
                    if (this.j0.i && holder.s() && !holder.p() && !holder.x() && !holder.n()) {
                        this.f۱۸۲۳h.a(c(holder), holder);
                    }
                }
            }
        }
        if (this.j0.l) {
            v();
            a0 a0Var3 = this.j0;
            boolean didStructureChange = a0Var3.f۱۸۳۱g;
            a0Var3.f۱۸۳۱g = false;
            this.o.e(this.f۱۸۱۹d, a0Var3);
            this.j0.f۱۸۳۱g = didStructureChange;
            for (int i3 = 0; i3 < this.f۱۸۲۲g.a(); i3++) {
                d0 viewHolder = k(this.f۱۸۲۲g.c(i3));
                if (!viewHolder.x() && !this.f۱۸۲۳h.c(viewHolder)) {
                    int flags = l.e(viewHolder);
                    boolean wasHidden = viewHolder.b(8192);
                    if (!wasHidden) {
                        flags |= 4096;
                    }
                    l.c animationInfo = this.O.a(this.j0, viewHolder, flags, viewHolder.k());
                    if (wasHidden) {
                        a(viewHolder, animationInfo);
                    } else {
                        this.f۱۸۲۳h.a(viewHolder, animationInfo);
                    }
                }
            }
            a();
        } else {
            a();
        }
        r();
        c(false);
        this.j0.f۱۸۲۹e = 2;
    }

    private void B() {
        w();
        q();
        this.j0.a(6);
        this.f۱۸۲۱f.b();
        this.j0.f۱۸۳۰f = this.n.a();
        a0 a0Var = this.j0;
        a0Var.f۱۸۲۸d = 0;
        a0Var.f۱۸۳۲h = false;
        this.o.e(this.f۱۸۱۹d, a0Var);
        a0 a0Var2 = this.j0;
        a0Var2.f۱۸۳۱g = false;
        this.f۱۸۲۰e = null;
        a0Var2.k = a0Var2.k && this.O != null;
        this.j0.f۱۸۲۹e = 4;
        r();
        c(false);
    }

    private void C() {
        this.j0.a(4);
        w();
        q();
        a0 a0Var = this.j0;
        a0Var.f۱۸۲۹e = 1;
        if (a0Var.k) {
            for (int i2 = this.f۱۸۲۲g.a() - 1; i2 >= 0; i2--) {
                d0 holder = k(this.f۱۸۲۲g.c(i2));
                if (!holder.x()) {
                    long key = c(holder);
                    l.c animationInfo = this.O.a(this.j0, holder);
                    d0 oldChangeViewHolder = this.f۱۸۲۳h.a(key);
                    if (oldChangeViewHolder == null || oldChangeViewHolder.x()) {
                        this.f۱۸۲۳h.b(holder, animationInfo);
                    } else {
                        boolean oldDisappearing = this.f۱۸۲۳h.b(oldChangeViewHolder);
                        boolean newDisappearing = this.f۱۸۲۳h.b(holder);
                        if (!oldDisappearing || oldChangeViewHolder != holder) {
                            l.c preInfo = this.f۱۸۲۳h.f(oldChangeViewHolder);
                            this.f۱۸۲۳h.b(holder, animationInfo);
                            l.c postInfo = this.f۱۸۲۳h.e(holder);
                            if (preInfo == null) {
                                a(key, holder, oldChangeViewHolder);
                            } else {
                                a(oldChangeViewHolder, holder, preInfo, postInfo, oldDisappearing, newDisappearing);
                            }
                        } else {
                            this.f۱۸۲۳h.b(holder, animationInfo);
                        }
                    }
                }
            }
            this.f۱۸۲۳h.a(this.A0);
        }
        this.o.c(this.f۱۸۱۹d);
        a0 a0Var2 = this.j0;
        a0Var2.f۱۸۲۷c = a0Var2.f۱۸۳۰f;
        this.F = false;
        this.G = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.o.f۱۸۶۷h = false;
        ArrayList<d0> arrayList = this.f۱۸۱۹d.f۱۸۸۵b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.o;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.f۱۸۱۹d.j();
        }
        this.o.g(this.j0);
        r();
        c(false);
        this.f۱۸۲۳h.a();
        int[] iArr = this.s0;
        if (k(iArr[0], iArr[1])) {
            d(0, 0);
        }
        J();
        L();
    }

    private void a(long key, d0 holder, d0 oldChangeViewHolder) {
        int childCount = this.f۱۸۲۲g.a();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 other = k(this.f۱۸۲۲g.c(i2));
            if (other != holder && c(other) == key) {
                g gVar = this.n;
                if (gVar == null || !gVar.c()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + i());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + i());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oldChangeViewHolder + " cannot be found but it is necessary for " + holder + i());
    }

    /* access modifiers changed from: package-private */
    public void a(d0 viewHolder, l.c animationInfo) {
        viewHolder.a(0, 8192);
        if (this.j0.i && viewHolder.s() && !viewHolder.p() && !viewHolder.x()) {
            this.f۱۸۲۳h.a(c(viewHolder), viewHolder);
        }
        this.f۱۸۲۳h.c(viewHolder, animationInfo);
    }

    private void a(int[] into) {
        int count = this.f۱۸۲۲g.a();
        if (count == 0) {
            into[0] = -1;
            into[1] = -1;
            return;
        }
        int minPositionPreLayout = Integer.MAX_VALUE;
        int maxPositionPreLayout = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < count; i2++) {
            d0 holder = k(this.f۱۸۲۲g.c(i2));
            if (!holder.x()) {
                int pos = holder.i();
                if (pos < minPositionPreLayout) {
                    minPositionPreLayout = pos;
                }
                if (pos > maxPositionPreLayout) {
                    maxPositionPreLayout = pos;
                }
            }
        }
        into[0] = minPositionPreLayout;
        into[1] = maxPositionPreLayout;
    }

    private boolean k(int minPositionPreLayout, int maxPositionPreLayout) {
        a(this.s0);
        int[] iArr = this.s0;
        return (iArr[0] == minPositionPreLayout && iArr[1] == maxPositionPreLayout) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View child, boolean animate) {
        d0 vh = k(child);
        if (vh != null) {
            if (vh.r()) {
                vh.d();
            } else if (!vh.x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + vh + i());
            }
        }
        child.clearAnimation();
        b(child);
        super.removeDetachedView(child, animate);
    }

    /* access modifiers changed from: package-private */
    public long c(d0 holder) {
        return this.n.c() ? holder.g() : (long) holder.f۱۸۴۳e;
    }

    /* access modifiers changed from: package-private */
    public void a(d0 itemHolder, l.c preLayoutInfo, l.c postLayoutInfo) {
        itemHolder.a(false);
        if (this.O.a(itemHolder, preLayoutInfo, postLayoutInfo)) {
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(d0 holder, l.c preLayoutInfo, l.c postLayoutInfo) {
        d(holder);
        holder.a(false);
        if (this.O.b(holder, preLayoutInfo, postLayoutInfo)) {
            s();
        }
    }

    private void a(d0 oldHolder, d0 newHolder, l.c preInfo, l.c postInfo, boolean oldHolderDisappearing, boolean newHolderDisappearing) {
        oldHolder.a(false);
        if (oldHolderDisappearing) {
            d(oldHolder);
        }
        if (oldHolder != newHolder) {
            if (newHolderDisappearing) {
                d(newHolder);
            }
            oldHolder.j = newHolder;
            d(oldHolder);
            this.f۱۸۱۹d.c(oldHolder);
            newHolder.a(false);
            newHolder.k = oldHolder;
        }
        if (this.O.a(oldHolder, newHolder, preInfo, postInfo)) {
            s();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        a.b.g.d.a.a("RV OnLayout");
        c();
        a.b.g.d.a.a();
        this.w = true;
    }

    public void requestLayout() {
        if (this.x != 0 || this.z) {
            this.y = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        int childCount = this.f۱۸۲۲g.b();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((p) this.f۱۸۲۲g.d(i2).getLayoutParams()).f۱۸۷۶c = true;
        }
        this.f۱۸۱۹d.g();
    }

    public void draw(Canvas c2) {
        super.draw(c2);
        int count = this.q.size();
        for (int i2 = 0; i2 < count; i2++) {
            this.q.get(i2).b(c2, this, this.j0);
        }
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.K;
        boolean z2 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = c2.save();
            int padding = this.i ? getPaddingBottom() : 0;
            c2.rotate(270.0f);
            c2.translate((float) ((-getHeight()) + padding), 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            needsInvalidate = edgeEffect2 != null && edgeEffect2.draw(c2);
            c2.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = c2.save();
            if (this.i) {
                c2.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            needsInvalidate |= edgeEffect4 != null && edgeEffect4.draw(c2);
            c2.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int restore3 = c2.save();
            int width = getWidth();
            int padding2 = this.i ? getPaddingTop() : 0;
            c2.rotate(90.0f);
            c2.translate((float) (-padding2), (float) (-width));
            EdgeEffect edgeEffect6 = this.M;
            needsInvalidate |= edgeEffect6 != null && edgeEffect6.draw(c2);
            c2.restoreToCount(restore3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int restore4 = c2.save();
            c2.rotate(180.0f);
            if (this.i) {
                c2.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                c2.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 == null || !edgeEffect8.draw(c2)) {
                z2 = false;
            }
            needsInvalidate |= z2;
            c2.restoreToCount(restore4);
        }
        if (!needsInvalidate && this.O != null && this.q.size() > 0 && this.O.g()) {
            needsInvalidate = true;
        }
        if (needsInvalidate) {
            android.support.v4.view.u.B(this);
        }
    }

    public void onDraw(Canvas c2) {
        super.onDraw(c2);
        int count = this.q.size();
        for (int i2 = 0; i2 < count; i2++) {
            this.q.get(i2).a(c2, this, this.j0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof p) && this.o.a((p) p2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.o;
        if (oVar != null) {
            return oVar.c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o oVar = this.o;
        if (oVar != null) {
            return oVar.a(getContext(), attrs);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        o oVar = this.o;
        if (oVar != null) {
            return oVar.a(p2);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    /* access modifiers changed from: package-private */
    public void v() {
        int childCount = this.f۱۸۲۲g.b();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (!holder.x()) {
                holder.v();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int childCount = this.f۱۸۲۲g.b();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (!holder.x()) {
                holder.a();
            }
        }
        this.f۱۸۱۹d.b();
    }

    /* access modifiers changed from: package-private */
    public void g(int from, int to) {
        int inBetweenOffset;
        int end;
        int start;
        int i2;
        int childCount = this.f۱۸۲۲g.b();
        if (from < to) {
            start = from;
            end = to;
            inBetweenOffset = -1;
        } else {
            start = to;
            end = from;
            inBetweenOffset = 1;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            d0 holder = k(this.f۱۸۲۲g.d(i3));
            if (holder != null && (i2 = holder.f۱۸۴۳e) >= start && i2 <= end) {
                if (i2 == from) {
                    holder.a(to - from, false);
                } else {
                    holder.a(inBetweenOffset, false);
                }
                this.j0.f۱۸۳۱g = true;
            }
        }
        this.f۱۸۱۹d.b(from, to);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void f(int positionStart, int itemCount) {
        int childCount = this.f۱۸۲۲g.b();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (holder != null && !holder.x() && holder.f۱۸۴۳e >= positionStart) {
                holder.a(itemCount, false);
                this.j0.f۱۸۳۱g = true;
            }
        }
        this.f۱۸۱۹d.a(positionStart, itemCount);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(int positionStart, int itemCount, boolean applyToPreLayout) {
        int positionEnd = positionStart + itemCount;
        int childCount = this.f۱۸۲۲g.b();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (holder != null && !holder.x()) {
                int i3 = holder.f۱۸۴۳e;
                if (i3 >= positionEnd) {
                    holder.a(-itemCount, applyToPreLayout);
                    this.j0.f۱۸۳۱g = true;
                } else if (i3 >= positionStart) {
                    holder.a(positionStart - 1, -itemCount, applyToPreLayout);
                    this.j0.f۱۸۳۱g = true;
                }
            }
        }
        this.f۱۸۱۹d.a(positionStart, itemCount, applyToPreLayout);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(int positionStart, int itemCount, Object payload) {
        int i2;
        int childCount = this.f۱۸۲۲g.b();
        int positionEnd = positionStart + itemCount;
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = this.f۱۸۲۲g.d(i3);
            d0 holder = k(child);
            if (holder != null && !holder.x() && (i2 = holder.f۱۸۴۳e) >= positionStart && i2 < positionEnd) {
                holder.a(2);
                holder.a(payload);
                ((p) child.getLayoutParams()).f۱۸۷۶c = true;
            }
        }
        this.f۱۸۱۹d.c(positionStart, itemCount);
    }

    /* access modifiers changed from: package-private */
    public boolean a(d0 viewHolder) {
        l lVar = this.O;
        return lVar == null || lVar.a(viewHolder, viewHolder.k());
    }

    /* access modifiers changed from: package-private */
    public void b(boolean dispatchItemsChanged) {
        this.G |= dispatchItemsChanged;
        this.F = true;
        p();
    }

    /* access modifiers changed from: package-private */
    public void p() {
        int childCount = this.f۱۸۲۲g.b();
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (holder != null && !holder.x()) {
                holder.a(6);
            }
        }
        o();
        this.f۱۸۱۹d.h();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f0;
    }

    public void setPreserveFocusAfterLayout(boolean preserveFocusAfterLayout) {
        this.f0 = preserveFocusAfterLayout;
    }

    public d0 e(View child) {
        ViewParent parent = child.getParent();
        if (parent == null || parent == this) {
            return k(child);
        }
        throw new IllegalArgumentException("View " + child + " is not a direct child of " + this);
    }

    public View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public d0 d(View view) {
        View itemView = c(view);
        if (itemView == null) {
            return null;
        }
        return e(itemView);
    }

    static d0 k(View child) {
        if (child == null) {
            return null;
        }
        return ((p) child.getLayoutParams()).f۱۸۷۴a;
    }

    public d0 c(int position) {
        if (this.F) {
            return null;
        }
        int childCount = this.f۱۸۲۲g.b();
        d0 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (holder != null && !holder.p() && b(holder) == position) {
                if (!this.f۱۸۲۲g.c(holder.f۱۸۴۱c)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    /* access modifiers changed from: package-private */
    public d0 a(int position, boolean checkNewPosition) {
        int childCount = this.f۱۸۲۲g.b();
        d0 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (holder != null && !holder.p()) {
                if (checkNewPosition) {
                    if (holder.f۱۸۴۳e != position) {
                        continue;
                    }
                } else if (holder.i() != position) {
                    continue;
                }
                if (!this.f۱۸۲۲g.c(holder.f۱۸۴۱c)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public d0 a(long id) {
        g gVar = this.n;
        if (gVar == null || !gVar.c()) {
            return null;
        }
        int childCount = this.f۱۸۲۲g.b();
        d0 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            d0 holder = k(this.f۱۸۲۲g.d(i2));
            if (holder != null && !holder.p() && holder.g() == id) {
                if (!this.f۱۸۲۲g.c(holder.f۱۸۴۱c)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        return super.drawChild(canvas, child, drawingTime);
    }

    public void f(int dy) {
        int childCount = this.f۱۸۲۲g.a();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f۱۸۲۲g.c(i2).offsetTopAndBottom(dy);
        }
    }

    public void g(View child) {
    }

    public void h(View child) {
    }

    public void e(int dx) {
        int childCount = this.f۱۸۲۲g.a();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f۱۸۲۲g.c(i2).offsetLeftAndRight(dx);
        }
    }

    static void a(View view, Rect outBounds) {
        p lp = (p) view.getLayoutParams();
        Rect insets = lp.f۱۸۷۵b;
        outBounds.set((view.getLeft() - insets.left) - ((ViewGroup.MarginLayoutParams) lp).leftMargin, (view.getTop() - insets.top) - ((ViewGroup.MarginLayoutParams) lp).topMargin, view.getRight() + insets.right + ((ViewGroup.MarginLayoutParams) lp).rightMargin, view.getBottom() + insets.bottom + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
    }

    /* access modifiers changed from: package-private */
    public Rect f(View child) {
        p lp = (p) child.getLayoutParams();
        if (!lp.f۱۸۷۶c) {
            return lp.f۱۸۷۵b;
        }
        if (this.j0.d() && (lp.b() || lp.d())) {
            return lp.f۱۸۷۵b;
        }
        Rect insets = lp.f۱۸۷۵b;
        insets.set(0, 0, 0, 0);
        int decorCount = this.q.size();
        for (int i2 = 0; i2 < decorCount; i2++) {
            this.k.set(0, 0, 0, 0);
            this.q.get(i2).a(this.k, child, this, this.j0);
            int i3 = insets.left;
            Rect rect = this.k;
            insets.left = i3 + rect.left;
            insets.top += rect.top;
            insets.right += rect.right;
            insets.bottom += rect.bottom;
        }
        lp.f۱۸۷۶c = false;
        return insets;
    }

    public void h(int dx, int dy) {
    }

    /* access modifiers changed from: package-private */
    public void d(int hresult, int vresult) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        h(hresult, vresult);
        t tVar = this.k0;
        if (tVar != null) {
            tVar.a(this, hresult, vresult);
        }
        List<t> list = this.l0;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.l0.get(i2).a(this, hresult, vresult);
            }
        }
        this.I--;
    }

    public void g(int state) {
    }

    /* access modifiers changed from: package-private */
    public void b(int state) {
        o oVar = this.o;
        if (oVar != null) {
            oVar.f(state);
        }
        g(state);
        t tVar = this.k0;
        if (tVar != null) {
            tVar.a(this, state);
        }
        List<t> list = this.l0;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.l0.get(i2).a(this, state);
            }
        }
    }

    public boolean j() {
        return !this.w || this.F || this.f۱۸۲۱f.c();
    }

    /* access modifiers changed from: package-private */
    public class c0 implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private int f۱۸۳۴c;

        /* renamed from: d  reason: collision with root package name */
        private int f۱۸۳۵d;

        /* renamed from: e  reason: collision with root package name */
        OverScroller f۱۸۳۶e;

        /* renamed from: f  reason: collision with root package name */
        Interpolator f۱۸۳۷f = RecyclerView.K0;

        /* renamed from: g  reason: collision with root package name */
        private boolean f۱۸۳۸g = false;

        /* renamed from: h  reason: collision with root package name */
        private boolean f۱۸۳۹h = false;

        c0() {
            this.f۱۸۳۶e = new OverScroller(RecyclerView.this.getContext(), RecyclerView.K0);
        }

        public void run() {
            int overscrollY;
            int overscrollX;
            int adapterSize;
            int velX;
            int velY;
            if (RecyclerView.this.o == null) {
                b();
                return;
            }
            c();
            RecyclerView.this.b();
            OverScroller scroller = this.f۱۸۳۶e;
            z smoothScroller = RecyclerView.this.o.f۱۸۶۶g;
            if (scroller.computeScrollOffset()) {
                int[] scrollConsumed = RecyclerView.this.v0;
                int x = scroller.getCurrX();
                int y = scroller.getCurrY();
                int dx = x - this.f۱۸۳۴c;
                int dy = y - this.f۱۸۳۵d;
                int hresult = 0;
                this.f۱۸۳۴c = x;
                this.f۱۸۳۵d = y;
                if (RecyclerView.this.a(dx, dy, scrollConsumed, (int[]) null, 1)) {
                    dx -= scrollConsumed[0];
                    dy -= scrollConsumed[1];
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.n != null) {
                    recyclerView.a(dx, dy, recyclerView.x0);
                    int[] iArr = RecyclerView.this.x0;
                    hresult = iArr[0];
                    int vresult = iArr[1];
                    int overscrollX2 = dx - hresult;
                    int overscrollY2 = dy - vresult;
                    if (smoothScroller != null && !smoothScroller.b() && smoothScroller.c()) {
                        int adapterSize2 = RecyclerView.this.j0.a();
                        if (adapterSize2 == 0) {
                            smoothScroller.d();
                        } else if (smoothScroller.a() >= adapterSize2) {
                            smoothScroller.a(adapterSize2 - 1);
                            smoothScroller.a(dx - overscrollX2, dy - overscrollY2);
                        } else {
                            smoothScroller.a(dx - overscrollX2, dy - overscrollY2);
                        }
                    }
                    adapterSize = vresult;
                    overscrollX = overscrollX2;
                    overscrollY = overscrollY2;
                } else {
                    adapterSize = 0;
                    overscrollX = 0;
                    overscrollY = 0;
                }
                if (!RecyclerView.this.q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.b(dx, dy);
                }
                if (!RecyclerView.this.a(hresult, adapterSize, overscrollX, overscrollY, (int[]) null, 1)) {
                    if (overscrollX != 0 || overscrollY != 0) {
                        int vel = (int) scroller.getCurrVelocity();
                        if (overscrollX != x) {
                            velX = overscrollX < 0 ? -vel : overscrollX > 0 ? vel : 0;
                        } else {
                            velX = 0;
                        }
                        if (overscrollY != y) {
                            velY = overscrollY < 0 ? -vel : overscrollY > 0 ? vel : 0;
                        } else {
                            velY = 0;
                        }
                        if (RecyclerView.this.getOverScrollMode() != 2) {
                            RecyclerView.this.a(velX, velY);
                        }
                        if ((velX != 0 || overscrollX == x || scroller.getFinalX() == 0) && (velY != 0 || overscrollY == y || scroller.getFinalY() == 0)) {
                            scroller.abortAnimation();
                        }
                    }
                }
                if (!(hresult == 0 && adapterSize == 0)) {
                    RecyclerView.this.d(hresult, adapterSize);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean fullyConsumedAny = (dx == 0 && dy == 0) || (dx != 0 && RecyclerView.this.o.a() && hresult == dx) || (dy != 0 && RecyclerView.this.o.b() && adapterSize == dy);
                if (scroller.isFinished() || (!fullyConsumedAny && !RecyclerView.this.d(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.G0) {
                        RecyclerView.this.i0.a();
                    }
                    RecyclerView.this.a(1);
                } else {
                    a();
                    RecyclerView recyclerView2 = RecyclerView.this;
                    m0 m0Var = recyclerView2.h0;
                    if (m0Var != null) {
                        m0Var.a(recyclerView2, dx, dy);
                    }
                }
            }
            if (smoothScroller != null) {
                if (smoothScroller.b()) {
                    smoothScroller.a(0, 0);
                }
                if (!this.f۱۸۳۹h) {
                    smoothScroller.d();
                }
            }
            d();
        }

        private void c() {
            this.f۱۸۳۹h = false;
            this.f۱۸۳۸g = true;
        }

        private void d() {
            this.f۱۸۳۸g = false;
            if (this.f۱۸۳۹h) {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.f۱۸۳۸g) {
                this.f۱۸۳۹h = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            android.support.v4.view.u.a(RecyclerView.this, this);
        }

        public void a(int velocityX, int velocityY) {
            RecyclerView.this.setScrollState(2);
            this.f۱۸۳۵d = 0;
            this.f۱۸۳۴c = 0;
            this.f۱۸۳۶e.fling(0, 0, velocityX, velocityY, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            a();
        }

        private float a(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private int a(int dx, int dy, int vx, int vy) {
            int duration;
            int absDx = Math.abs(dx);
            int absDy = Math.abs(dy);
            boolean horizontal = absDx > absDy;
            int velocity = (int) Math.sqrt((double) ((vx * vx) + (vy * vy)));
            int delta = (int) Math.sqrt((double) ((dx * dx) + (dy * dy)));
            RecyclerView recyclerView = RecyclerView.this;
            int containerSize = horizontal ? recyclerView.getWidth() : recyclerView.getHeight();
            int halfContainerSize = containerSize / 2;
            float distance = ((float) halfContainerSize) + (((float) halfContainerSize) * a(Math.min(1.0f, (((float) delta) * 1.0f) / ((float) containerSize))));
            if (velocity > 0) {
                duration = Math.round(Math.abs(distance / ((float) velocity)) * 1000.0f) * 4;
            } else {
                duration = (int) (((((float) (horizontal ? absDx : absDy)) / ((float) containerSize)) + 1.0f) * 300.0f);
            }
            return Math.min(duration, 2000);
        }

        public void a(int dx, int dy, Interpolator interpolator) {
            a(dx, dy, a(dx, dy, 0, 0), interpolator == null ? RecyclerView.K0 : interpolator);
        }

        public void a(int dx, int dy, int duration, Interpolator interpolator) {
            if (this.f۱۸۳۷f != interpolator) {
                this.f۱۸۳۷f = interpolator;
                this.f۱۸۳۶e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f۱۸۳۵d = 0;
            this.f۱۸۳۴c = 0;
            this.f۱۸۳۶e.startScroll(0, 0, dx, dy, duration);
            if (Build.VERSION.SDK_INT < 23) {
                this.f۱۸۳۶e.computeScrollOffset();
            }
            a();
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.f۱۸۳۶e.abortAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        d0 d0Var;
        int count = this.f۱۸۲۲g.a();
        for (int i2 = 0; i2 < count; i2++) {
            View view = this.f۱۸۲۲g.c(i2);
            d0 holder = e(view);
            if (!(holder == null || (d0Var = holder.k) == null)) {
                View shadowingView = d0Var.f۱۸۴۱c;
                int left = view.getLeft();
                int top = view.getTop();
                if (left != shadowingView.getLeft() || top != shadowingView.getTop()) {
                    shadowingView.layout(left, top, shadowingView.getWidth() + left, shadowingView.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class x extends i {
        x() {
        }

        @Override // android.support.v7.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j0.f۱۸۳۱g = true;
            recyclerView.b(true);
            if (!RecyclerView.this.f۱۸۲۱f.c()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.i
        public void a(int positionStart, int itemCount, Object payload) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.f۱۸۲۱f.a(positionStart, itemCount, payload)) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (RecyclerView.F0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.u && recyclerView.t) {
                    android.support.v4.view.u.a(recyclerView, recyclerView.j);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.C = true;
            recyclerView2.requestLayout();
        }
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView view, int direction) {
            return new EdgeEffect(view.getContext());
        }
    }

    public static class u {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f۱۸۷۸a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f۱۸۷۹b = 0;

        /* access modifiers changed from: package-private */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<d0> f۱۸۸۰a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f۱۸۸۱b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f۱۸۸۲c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f۱۸۸۳d = 0;

            a() {
            }
        }

        public void b() {
            for (int i = 0; i < this.f۱۸۷۸a.size(); i++) {
                this.f۱۸۷۸a.valueAt(i).f۱۸۸۰a.clear();
            }
        }

        public d0 a(int viewType) {
            a scrapData = this.f۱۸۷۸a.get(viewType);
            if (scrapData == null || scrapData.f۱۸۸۰a.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> scrapHeap = scrapData.f۱۸۸۰a;
            return (d0) scrapHeap.remove(scrapHeap.size() - 1);
        }

        public void a(d0 scrap) {
            int viewType = scrap.h();
            ArrayList<ViewHolder> scrapHeap = b(viewType).f۱۸۸۰a;
            if (this.f۱۸۷۸a.get(viewType).f۱۸۸۱b > scrapHeap.size()) {
                scrap.u();
                scrapHeap.add(scrap);
            }
        }

        /* access modifiers changed from: package-private */
        public long a(long oldAverage, long newValue) {
            if (oldAverage == 0) {
                return newValue;
            }
            return ((oldAverage / 4) * 3) + (newValue / 4);
        }

        /* access modifiers changed from: package-private */
        public void b(int viewType, long createTimeNs) {
            a scrapData = b(viewType);
            scrapData.f۱۸۸۲c = a(scrapData.f۱۸۸۲c, createTimeNs);
        }

        /* access modifiers changed from: package-private */
        public void a(int viewType, long bindTimeNs) {
            a scrapData = b(viewType);
            scrapData.f۱۸۸۳d = a(scrapData.f۱۸۸۳d, bindTimeNs);
        }

        /* access modifiers changed from: package-private */
        public boolean b(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = b(viewType).f۱۸۸۲c;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = b(viewType).f۱۸۸۳d;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f۱۸۷۹b++;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f۱۸۷۹b--;
        }

        /* access modifiers changed from: package-private */
        public void a(g oldAdapter, g newAdapter, boolean compatibleWithPrevious) {
            if (oldAdapter != null) {
                c();
            }
            if (!compatibleWithPrevious && this.f۱۸۷۹b == 0) {
                b();
            }
            if (newAdapter != null) {
                a();
            }
        }

        private a b(int viewType) {
            a scrapData = this.f۱۸۷۸a.get(viewType);
            if (scrapData != null) {
                return scrapData;
            }
            a scrapData2 = new a();
            this.f۱۸۷۸a.put(viewType, scrapData2);
            return scrapData2;
        }
    }

    static RecyclerView j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup parent = (ViewGroup) view;
        int count = parent.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            RecyclerView descendant = j(parent.getChildAt(i2));
            if (descendant != null) {
                return descendant;
            }
        }
        return null;
    }

    static void e(d0 holder) {
        WeakReference<RecyclerView> weakReference = holder.f۱۸۴۲d;
        if (weakReference != null) {
            RecyclerView item = weakReference.get();
            while (item != null) {
                if (item != holder.f۱۸۴۱c) {
                    ViewParent parent = item.getParent();
                    if (parent instanceof View) {
                        item = (View) parent;
                    } else {
                        item = null;
                    }
                } else {
                    return;
                }
            }
            holder.f۱۸۴۲d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (G0) {
            return System.nanoTime();
        }
        return 0;
    }

    public final class v {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d0> f۱۸۸۴a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<d0> f۱۸۸۵b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<d0> f۱۸۸۶c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<d0> f۱۸۸۷d = Collections.unmodifiableList(this.f۱۸۸۴a);

        /* renamed from: e  reason: collision with root package name */
        private int f۱۸۸۸e = 2;

        /* renamed from: f  reason: collision with root package name */
        int f۱۸۸۹f = 2;

        /* renamed from: g  reason: collision with root package name */
        u f۱۸۹۰g;

        /* renamed from: h  reason: collision with root package name */
        private b0 f۱۸۹۱h;

        public v() {
        }

        public void a() {
            this.f۱۸۸۴a.clear();
            i();
        }

        public void f(int viewCount) {
            this.f۱۸۸۸e = viewCount;
            j();
        }

        /* access modifiers changed from: package-private */
        public void j() {
            o oVar = RecyclerView.this.o;
            this.f۱۸۸۹f = this.f۱۸۸۸e + (oVar != null ? oVar.m : 0);
            for (int i2 = this.f۱۸۸۶c.size() - 1; i2 >= 0 && this.f۱۸۸۶c.size() > this.f۱۸۸۹f; i2--) {
                e(i2);
            }
        }

        public List<d0> f() {
            return this.f۱۸۸۷d;
        }

        /* access modifiers changed from: package-private */
        public boolean d(d0 holder) {
            if (holder.p()) {
                return RecyclerView.this.j0.d();
            }
            int i2 = holder.f۱۸۴۳e;
            if (i2 < 0 || i2 >= RecyclerView.this.n.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + holder + RecyclerView.this.i());
            } else if (!RecyclerView.this.j0.d() && RecyclerView.this.n.b(holder.f۱۸۴۳e) != holder.h()) {
                return false;
            } else {
                if (!RecyclerView.this.n.c() || holder.g() == RecyclerView.this.n.a(holder.f۱۸۴۳e)) {
                    return true;
                }
                return false;
            }
        }

        private boolean a(d0 holder, int offsetPosition, int position, long deadlineNs) {
            holder.t = RecyclerView.this;
            int viewType = holder.h();
            long startBindNs = RecyclerView.this.getNanoTime();
            if (deadlineNs != Long.MAX_VALUE && !this.f۱۸۹۰g.a(viewType, startBindNs, deadlineNs)) {
                return false;
            }
            RecyclerView.this.n.a(holder, offsetPosition);
            this.f۱۸۹۰g.a(holder.h(), RecyclerView.this.getNanoTime() - startBindNs);
            e(holder);
            if (!RecyclerView.this.j0.d()) {
                return true;
            }
            holder.i = position;
            return true;
        }

        public int a(int position) {
            if (position < 0 || position >= RecyclerView.this.j0.a()) {
                throw new IndexOutOfBoundsException("invalid position " + position + ". State " + "item count is " + RecyclerView.this.j0.a() + RecyclerView.this.i());
            } else if (!RecyclerView.this.j0.d()) {
                return position;
            } else {
                return RecyclerView.this.f۱۸۲۱f.b(position);
            }
        }

        public View d(int position) {
            return b(position, false);
        }

        /* access modifiers changed from: package-private */
        public View b(int position, boolean dryRun) {
            return a(position, dryRun, Long.MAX_VALUE).f۱۸۴۱c;
        }

        /* access modifiers changed from: package-private */
        public d0 a(int position, boolean dryRun, long deadlineNs) {
            d0 holder;
            boolean fromScrapOrHiddenOrCache;
            p rvLayoutParams;
            RecyclerView innerView;
            b0 b0Var;
            View view;
            if (position < 0 || position >= RecyclerView.this.j0.a()) {
                throw new IndexOutOfBoundsException("Invalid item position " + position + "(" + position + "). Item count:" + RecyclerView.this.j0.a() + RecyclerView.this.i());
            }
            boolean fromScrapOrHiddenOrCache2 = false;
            d0 holder2 = null;
            boolean z = true;
            if (RecyclerView.this.j0.d()) {
                holder2 = b(position);
                fromScrapOrHiddenOrCache2 = holder2 != null;
            }
            if (holder2 == null && (holder2 = a(position, dryRun)) != null) {
                if (!d(holder2)) {
                    if (!dryRun) {
                        holder2.a(4);
                        if (holder2.q()) {
                            RecyclerView.this.removeDetachedView(holder2.f۱۸۴۱c, false);
                            holder2.y();
                        } else if (holder2.z()) {
                            holder2.c();
                        }
                        b(holder2);
                    }
                    holder2 = null;
                } else {
                    fromScrapOrHiddenOrCache2 = true;
                }
            }
            if (holder2 == null) {
                int offsetPosition = RecyclerView.this.f۱۸۲۱f.b(position);
                if (offsetPosition < 0 || offsetPosition >= RecyclerView.this.n.a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + position + "(offset:" + offsetPosition + ")." + "state:" + RecyclerView.this.j0.a() + RecyclerView.this.i());
                }
                int type = RecyclerView.this.n.b(offsetPosition);
                if (RecyclerView.this.n.c() && (holder2 = a(RecyclerView.this.n.a(offsetPosition), type, dryRun)) != null) {
                    holder2.f۱۸۴۳e = offsetPosition;
                    fromScrapOrHiddenOrCache2 = true;
                }
                if (!(holder2 != null || (b0Var = this.f۱۸۹۱h) == null || (view = b0Var.a(this, position, type)) == null)) {
                    holder2 = RecyclerView.this.e(view);
                    if (holder2 == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.i());
                    } else if (holder2.x()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.i());
                    }
                }
                if (holder2 == null && (holder2 = d().a(type)) != null) {
                    holder2.u();
                    if (RecyclerView.D0) {
                        f(holder2);
                    }
                }
                if (holder2 == null) {
                    long start = RecyclerView.this.getNanoTime();
                    if (deadlineNs != Long.MAX_VALUE && !this.f۱۸۹۰g.b(type, start, deadlineNs)) {
                        return null;
                    }
                    RecyclerView recyclerView = RecyclerView.this;
                    d0 holder3 = recyclerView.n.a(recyclerView, type);
                    if (RecyclerView.G0 && (innerView = RecyclerView.j(holder3.f۱۸۴۱c)) != null) {
                        holder3.f۱۸۴۲d = new WeakReference<>(innerView);
                    }
                    this.f۱۸۹۰g.b(type, RecyclerView.this.getNanoTime() - start);
                    fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                    holder = holder3;
                } else {
                    fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                    holder = holder2;
                }
            } else {
                fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                holder = holder2;
            }
            if (fromScrapOrHiddenOrCache && !RecyclerView.this.j0.d() && holder.b(8192)) {
                holder.a(0, 8192);
                if (RecyclerView.this.j0.k) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    RecyclerView.this.a(holder, recyclerView2.O.a(recyclerView2.j0, holder, l.e(holder) | 4096, holder.k()));
                }
            }
            boolean bound = false;
            if (RecyclerView.this.j0.d() && holder.m()) {
                holder.i = position;
            } else if (!holder.m() || holder.t() || holder.n()) {
                bound = a(holder, RecyclerView.this.f۱۸۲۱f.b(position), position, deadlineNs);
            }
            ViewGroup.LayoutParams lp = holder.f۱۸۴۱c.getLayoutParams();
            if (lp == null) {
                rvLayoutParams = (p) RecyclerView.this.generateDefaultLayoutParams();
                holder.f۱۸۴۱c.setLayoutParams(rvLayoutParams);
            } else if (!RecyclerView.this.checkLayoutParams(lp)) {
                rvLayoutParams = (p) RecyclerView.this.generateLayoutParams(lp);
                holder.f۱۸۴۱c.setLayoutParams(rvLayoutParams);
            } else {
                rvLayoutParams = (p) lp;
            }
            rvLayoutParams.f۱۸۷۴a = holder;
            if (!fromScrapOrHiddenOrCache || !bound) {
                z = false;
            }
            rvLayoutParams.f۱۸۷۷d = z;
            return holder;
        }

        private void e(d0 holder) {
            if (RecyclerView.this.m()) {
                View itemView = holder.f۱۸۴۱c;
                if (android.support.v4.view.u.i(itemView) == 0) {
                    android.support.v4.view.u.f(itemView, 1);
                }
                if (!android.support.v4.view.u.t(itemView)) {
                    holder.a(16384);
                    android.support.v4.view.u.a(itemView, RecyclerView.this.q0.b());
                }
            }
        }

        private void f(d0 holder) {
            View view = holder.f۱۸۴۱c;
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, false);
            }
        }

        private void a(ViewGroup viewGroup, boolean invalidateThis) {
            for (int i2 = viewGroup.getChildCount() - 1; i2 >= 0; i2--) {
                View view = viewGroup.getChildAt(i2);
                if (view instanceof ViewGroup) {
                    a((ViewGroup) view, true);
                }
            }
            if (invalidateThis) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void b(View view) {
            d0 holder = RecyclerView.k(view);
            if (holder.r()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (holder.q()) {
                holder.y();
            } else if (holder.z()) {
                holder.c();
            }
            b(holder);
        }

        /* access modifiers changed from: package-private */
        public void i() {
            for (int i2 = this.f۱۸۸۶c.size() - 1; i2 >= 0; i2--) {
                e(i2);
            }
            this.f۱۸۸۶c.clear();
            if (RecyclerView.G0) {
                RecyclerView.this.i0.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int cachedViewIndex) {
            a(this.f۱۸۸۶c.get(cachedViewIndex), true);
            this.f۱۸۸۶c.remove(cachedViewIndex);
        }

        /* access modifiers changed from: package-private */
        public void b(d0 holder) {
            boolean z = false;
            if (holder.q() || holder.f۱۸۴۱c.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(holder.q());
                sb.append(" isAttached:");
                if (holder.f۱۸۴۱c.getParent() != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb.toString());
            } else if (holder.r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + holder + RecyclerView.this.i());
            } else if (!holder.x()) {
                boolean transientStatePreventsRecycling = holder.e();
                g gVar = RecyclerView.this.n;
                boolean cached = false;
                boolean recycled = false;
                if ((gVar != null && transientStatePreventsRecycling && gVar.a(holder)) || holder.o()) {
                    if (this.f۱۸۸۹f > 0 && !holder.b(526)) {
                        int cachedViewSize = this.f۱۸۸۶c.size();
                        if (cachedViewSize >= this.f۱۸۸۹f && cachedViewSize > 0) {
                            e(0);
                            cachedViewSize--;
                        }
                        int targetCacheIndex = cachedViewSize;
                        if (RecyclerView.G0 && cachedViewSize > 0 && !RecyclerView.this.i0.a(holder.f۱۸۴۳e)) {
                            int cacheIndex = cachedViewSize - 1;
                            while (cacheIndex >= 0) {
                                if (!RecyclerView.this.i0.a(this.f۱۸۸۶c.get(cacheIndex).f۱۸۴۳e)) {
                                    break;
                                }
                                cacheIndex--;
                            }
                            targetCacheIndex = cacheIndex + 1;
                        }
                        this.f۱۸۸۶c.add(targetCacheIndex, holder);
                        cached = true;
                    }
                    if (!cached) {
                        a(holder, true);
                        recycled = true;
                    }
                }
                RecyclerView.this.f۱۸۲۳h.h(holder);
                if (!cached && !recycled && transientStatePreventsRecycling) {
                    holder.t = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.i());
            }
        }

        /* access modifiers changed from: package-private */
        public void a(d0 holder, boolean dispatchRecycled) {
            RecyclerView.e(holder);
            if (holder.b(16384)) {
                holder.a(0, 16384);
                android.support.v4.view.u.a(holder.f۱۸۴۱c, (android.support.v4.view.b) null);
            }
            if (dispatchRecycled) {
                a(holder);
            }
            holder.t = null;
            d().a(holder);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            d0 holder = RecyclerView.k(view);
            holder.p = null;
            holder.q = false;
            holder.c();
            b(holder);
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            d0 holder = RecyclerView.k(view);
            if (!holder.b(12) && holder.s() && !RecyclerView.this.a(holder)) {
                if (this.f۱۸۸۵b == null) {
                    this.f۱۸۸۵b = new ArrayList<>();
                }
                holder.a(this, true);
                this.f۱۸۸۵b.add(holder);
            } else if (!holder.n() || holder.p() || RecyclerView.this.n.c()) {
                holder.a(this, false);
                this.f۱۸۸۴a.add(holder);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.i());
            }
        }

        /* access modifiers changed from: package-private */
        public void c(d0 holder) {
            if (holder.q) {
                this.f۱۸۸۵b.remove(holder);
            } else {
                this.f۱۸۸۴a.remove(holder);
            }
            holder.p = null;
            holder.q = false;
            holder.c();
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f۱۸۸۴a.size();
        }

        /* access modifiers changed from: package-private */
        public View c(int index) {
            return this.f۱۸۸۴a.get(index).f۱۸۴۱c;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f۱۸۸۴a.clear();
            ArrayList<d0> arrayList = this.f۱۸۸۵b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public d0 b(int position) {
            int changedScrapSize;
            int offsetPosition;
            ArrayList<d0> arrayList = this.f۱۸۸۵b;
            if (arrayList == null || (changedScrapSize = arrayList.size()) == 0) {
                return null;
            }
            for (int i2 = 0; i2 < changedScrapSize; i2++) {
                d0 holder = this.f۱۸۸۵b.get(i2);
                if (!holder.z() && holder.i() == position) {
                    holder.a(32);
                    return holder;
                }
            }
            if (RecyclerView.this.n.c() && (offsetPosition = RecyclerView.this.f۱۸۲۱f.b(position)) > 0 && offsetPosition < RecyclerView.this.n.a()) {
                long id = RecyclerView.this.n.a(offsetPosition);
                for (int i3 = 0; i3 < changedScrapSize; i3++) {
                    d0 holder2 = this.f۱۸۸۵b.get(i3);
                    if (!holder2.z() && holder2.g() == id) {
                        holder2.a(32);
                        return holder2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public d0 a(int position, boolean dryRun) {
            View view;
            int scrapCount = this.f۱۸۸۴a.size();
            for (int i2 = 0; i2 < scrapCount; i2++) {
                d0 holder = this.f۱۸۸۴a.get(i2);
                if (!holder.z() && holder.i() == position && !holder.n() && (RecyclerView.this.j0.f۱۸۳۲h || !holder.p())) {
                    holder.a(32);
                    return holder;
                }
            }
            if (dryRun || (view = RecyclerView.this.f۱۸۲۲g.b(position)) == null) {
                int cacheSize = this.f۱۸۸۶c.size();
                for (int i3 = 0; i3 < cacheSize; i3++) {
                    d0 holder2 = this.f۱۸۸۶c.get(i3);
                    if (!holder2.n() && holder2.i() == position) {
                        if (!dryRun) {
                            this.f۱۸۸۶c.remove(i3);
                        }
                        return holder2;
                    }
                }
                return null;
            }
            d0 vh = RecyclerView.k(view);
            RecyclerView.this.f۱۸۲۲g.f(view);
            int layoutIndex = RecyclerView.this.f۱۸۲۲g.b(view);
            if (layoutIndex != -1) {
                RecyclerView.this.f۱۸۲۲g.a(layoutIndex);
                c(view);
                vh.a(8224);
                return vh;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + vh + RecyclerView.this.i());
        }

        /* access modifiers changed from: package-private */
        public d0 a(long id, int type, boolean dryRun) {
            for (int i2 = this.f۱۸۸۴a.size() - 1; i2 >= 0; i2--) {
                d0 holder = this.f۱۸۸۴a.get(i2);
                if (holder.g() == id && !holder.z()) {
                    if (type == holder.h()) {
                        holder.a(32);
                        if (holder.p() && !RecyclerView.this.j0.d()) {
                            holder.a(2, 14);
                        }
                        return holder;
                    } else if (!dryRun) {
                        this.f۱۸۸۴a.remove(i2);
                        RecyclerView.this.removeDetachedView(holder.f۱۸۴۱c, false);
                        a(holder.f۱۸۴۱c);
                    }
                }
            }
            for (int i3 = this.f۱۸۸۶c.size() - 1; i3 >= 0; i3--) {
                d0 holder2 = this.f۱۸۸۶c.get(i3);
                if (holder2.g() == id) {
                    if (type == holder2.h()) {
                        if (!dryRun) {
                            this.f۱۸۸۶c.remove(i3);
                        }
                        return holder2;
                    } else if (!dryRun) {
                        e(i3);
                        return null;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a(d0 holder) {
            w wVar = RecyclerView.this.p;
            if (wVar != null) {
                wVar.a(holder);
            }
            g gVar = RecyclerView.this.n;
            if (gVar != null) {
                gVar.d(holder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.j0 != null) {
                recyclerView.f۱۸۲۳h.h(holder);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g oldAdapter, g newAdapter, boolean compatibleWithPrevious) {
            a();
            d().a(oldAdapter, newAdapter, compatibleWithPrevious);
        }

        /* access modifiers changed from: package-private */
        public void b(int from, int to) {
            int inBetweenOffset;
            int end;
            int start;
            int i2;
            if (from < to) {
                start = from;
                end = to;
                inBetweenOffset = -1;
            } else {
                start = to;
                end = from;
                inBetweenOffset = 1;
            }
            int cachedCount = this.f۱۸۸۶c.size();
            for (int i3 = 0; i3 < cachedCount; i3++) {
                d0 holder = this.f۱۸۸۶c.get(i3);
                if (holder != null && (i2 = holder.f۱۸۴۳e) >= start && i2 <= end) {
                    if (i2 == from) {
                        holder.a(to - from, false);
                    } else {
                        holder.a(inBetweenOffset, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int insertedAt, int count) {
            int cachedCount = this.f۱۸۸۶c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                d0 holder = this.f۱۸۸۶c.get(i2);
                if (holder != null && holder.f۱۸۴۳e >= insertedAt) {
                    holder.a(count, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int removedFrom, int count, boolean applyToPreLayout) {
            int removedEnd = removedFrom + count;
            for (int i2 = this.f۱۸۸۶c.size() - 1; i2 >= 0; i2--) {
                d0 holder = this.f۱۸۸۶c.get(i2);
                if (holder != null) {
                    int i3 = holder.f۱۸۴۳e;
                    if (i3 >= removedEnd) {
                        holder.a(-count, applyToPreLayout);
                    } else if (i3 >= removedFrom) {
                        holder.a(8);
                        e(i2);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(b0 extension) {
            this.f۱۸۹۱h = extension;
        }

        /* access modifiers changed from: package-private */
        public void a(u pool) {
            u uVar = this.f۱۸۹۰g;
            if (uVar != null) {
                uVar.c();
            }
            this.f۱۸۹۰g = pool;
            if (this.f۱۸۹۰g != null && RecyclerView.this.getAdapter() != null) {
                this.f۱۸۹۰g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public u d() {
            if (this.f۱۸۹۰g == null) {
                this.f۱۸۹۰g = new u();
            }
            return this.f۱۸۹۰g;
        }

        /* access modifiers changed from: package-private */
        public void c(int positionStart, int itemCount) {
            int pos;
            int positionEnd = positionStart + itemCount;
            for (int i2 = this.f۱۸۸۶c.size() - 1; i2 >= 0; i2--) {
                d0 holder = this.f۱۸۸۶c.get(i2);
                if (holder != null && (pos = holder.f۱۸۴۳e) >= positionStart && pos < positionEnd) {
                    holder.a(2);
                    e(i2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int cachedCount = this.f۱۸۸۶c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                d0 holder = this.f۱۸۸۶c.get(i2);
                if (holder != null) {
                    holder.a(6);
                    holder.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.n;
            if (gVar == null || !gVar.c()) {
                i();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int cachedCount = this.f۱۸۸۶c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                this.f۱۸۸۶c.get(i2).a();
            }
            int scrapCount = this.f۱۸۸۴a.size();
            for (int i3 = 0; i3 < scrapCount; i3++) {
                this.f۱۸۸۴a.get(i3).a();
            }
            ArrayList<d0> arrayList = this.f۱۸۸۵b;
            if (arrayList != null) {
                int changedScrapCount = arrayList.size();
                for (int i4 = 0; i4 < changedScrapCount; i4++) {
                    this.f۱۸۸۵b.get(i4).a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            int cachedCount = this.f۱۸۸۶c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                p layoutParams = (p) this.f۱۸۸۶c.get(i2).f۱۸۴۱c.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f۱۸۷۶c = true;
                }
            }
        }
    }

    public static abstract class g<VH extends d0> {

        /* renamed from: a  reason: collision with root package name */
        private final h f۱۸۴۹a = new h();

        /* renamed from: b  reason: collision with root package name */
        private boolean f۱۸۵۰b = false;

        public abstract int a();

        public abstract VH b(ViewGroup viewGroup, int i);

        public abstract void b(VH vh, int i);

        public void a(VH holder, int position, List<Object> list) {
            b(holder, position);
        }

        public final VH a(ViewGroup parent, int viewType) {
            try {
                a.b.g.d.a.a("RV CreateView");
                VH holder = b(parent, viewType);
                if (holder.f۱۸۴۱c.getParent() == null) {
                    holder.f۱۸۴۶h = viewType;
                    return holder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                a.b.g.d.a.a();
            }
        }

        public final void a(VH holder, int position) {
            holder.f۱۸۴۳e = position;
            if (c()) {
                holder.f۱۸۴۵g = a(position);
            }
            holder.a(1, 519);
            a.b.g.d.a.a("RV OnBindView");
            a(holder, position, holder.k());
            holder.b();
            ViewGroup.LayoutParams layoutParams = holder.f۱۸۴۱c.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f۱۸۷۶c = true;
            }
            a.b.g.d.a.a();
        }

        public int b(int position) {
            return 0;
        }

        public void a(boolean hasStableIds) {
            if (!b()) {
                this.f۱۸۵۰b = hasStableIds;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public long a(int position) {
            return -1;
        }

        public final boolean c() {
            return this.f۱۸۵۰b;
        }

        public void d(VH vh) {
        }

        public boolean a(VH vh) {
            return false;
        }

        public void b(VH vh) {
        }

        public void c(VH vh) {
        }

        public final boolean b() {
            return this.f۱۸۴۹a.a();
        }

        public void a(i observer) {
            this.f۱۸۴۹a.registerObserver(observer);
        }

        public void b(i observer) {
            this.f۱۸۴۹a.unregisterObserver(observer);
        }

        public void a(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView) {
        }

        public final void d() {
            this.f۱۸۴۹a.b();
        }

        public final void c(int position) {
            this.f۱۸۴۹a.a(position, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View child) {
        d0 viewHolder = k(child);
        h(child);
        g gVar = this.n;
        if (!(gVar == null || viewHolder == null)) {
            gVar.c(viewHolder);
        }
        List<q> list = this.E;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.E.get(i2).b(child);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View child) {
        d0 viewHolder = k(child);
        g(child);
        g gVar = this.n;
        if (!(gVar == null || viewHolder == null)) {
            gVar.b(viewHolder);
        }
        List<q> list = this.E;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.E.get(i2).a(child);
            }
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        d0 f۱۸۶۰a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f۱۸۶۱b;

        /* renamed from: c  reason: collision with root package name */
        private final p1.b f۱۸۶۲c = new a();

        /* renamed from: d  reason: collision with root package name */
        private final p1.b f۱۸۶۳d = new b();

        /* renamed from: e  reason: collision with root package name */
        p1 f۱۸۶۴e = new p1(this.f۱۸۶۲c);

        /* renamed from: f  reason: collision with root package name */
        p1 f۱۸۶۵f = new p1(this.f۱۸۶۳d);

        /* renamed from: g  reason: collision with root package name */
        z f۱۸۶۶g;

        /* renamed from: h  reason: collision with root package name */
        boolean f۱۸۶۷h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        public interface c {
            void a(int i, int i2);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f۱۸۷۰a;

            /* renamed from: b  reason: collision with root package name */
            public int f۱۸۷۱b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f۱۸۷۲c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f۱۸۷۳d;
        }

        public abstract p c();

        class a implements p1.b {
            a() {
            }

            @Override // android.support.v7.widget.p1.b
            public View a(int index) {
                return o.this.c(index);
            }

            @Override // android.support.v7.widget.p1.b
            public int b() {
                return o.this.n();
            }

            @Override // android.support.v7.widget.p1.b
            public int a() {
                return o.this.q() - o.this.o();
            }

            @Override // android.support.v7.widget.p1.b
            public int b(View view) {
                return o.this.f(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // android.support.v7.widget.p1.b
            public int a(View view) {
                return o.this.i(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements p1.b {
            b() {
            }

            @Override // android.support.v7.widget.p1.b
            public View a(int index) {
                return o.this.c(index);
            }

            @Override // android.support.v7.widget.p1.b
            public int b() {
                return o.this.p();
            }

            @Override // android.support.v7.widget.p1.b
            public int a() {
                return o.this.h() - o.this.m();
            }

            @Override // android.support.v7.widget.p1.b
            public int b(View view) {
                return o.this.j(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // android.support.v7.widget.p1.b
            public int a(View view) {
                return o.this.e(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f۱۸۶۱b = null;
                this.f۱۸۶۰a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.f۱۸۶۱b = recyclerView;
                this.f۱۸۶۰a = recyclerView.f۱۸۲۲g;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        /* access modifiers changed from: package-private */
        public void b(int wSpec, int hSpec) {
            this.q = View.MeasureSpec.getSize(wSpec);
            this.o = View.MeasureSpec.getMode(wSpec);
            if (this.o == 0 && !RecyclerView.E0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(hSpec);
            this.p = View.MeasureSpec.getMode(hSpec);
            if (this.p == 0 && !RecyclerView.E0) {
                this.r = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(int widthSpec, int heightSpec) {
            int count = e();
            if (count == 0) {
                this.f۱۸۶۱b.c(widthSpec, heightSpec);
                return;
            }
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for (int i2 = 0; i2 < count; i2++) {
                View child = c(i2);
                Rect bounds = this.f۱۸۶۱b.k;
                b(child, bounds);
                if (bounds.left < minX) {
                    minX = bounds.left;
                }
                if (bounds.right > maxX) {
                    maxX = bounds.right;
                }
                if (bounds.top < minY) {
                    minY = bounds.top;
                }
                if (bounds.bottom > maxY) {
                    maxY = bounds.bottom;
                }
            }
            this.f۱۸۶۱b.k.set(minX, minY, maxX, maxY);
            a(this.f۱۸۶۱b.k, widthSpec, heightSpec);
        }

        public void a(Rect childrenBounds, int wSpec, int hSpec) {
            c(a(wSpec, childrenBounds.width() + n() + o(), l()), a(hSpec, childrenBounds.height() + p() + m(), k()));
        }

        public void y() {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public static int a(int spec, int desired, int min) {
            int mode = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(desired, min));
            }
            if (mode != 1073741824) {
                return Math.max(desired, min);
            }
            return size;
        }

        public void a(String message) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                recyclerView.a(message);
            }
        }

        public boolean u() {
            return this.j;
        }

        public boolean C() {
            return false;
        }

        public final boolean v() {
            return this.l;
        }

        public void a(int dx, int dy, a0 state, c layoutPrefetchRegistry) {
        }

        public void a(int adapterItemCount, c layoutPrefetchRegistry) {
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView view) {
            this.i = true;
            b(view);
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView view, v recycler) {
            this.i = false;
            b(view, recycler);
        }

        public boolean t() {
            return this.i;
        }

        public boolean a(Runnable action) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(action);
            }
            return false;
        }

        public void b(RecyclerView view) {
        }

        @Deprecated
        public void c(RecyclerView view) {
        }

        public void b(RecyclerView view, v recycler) {
            c(view);
        }

        public boolean f() {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            return recyclerView != null && recyclerView.i;
        }

        public void e(v recycler, a0 state) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void g(a0 state) {
        }

        public boolean a(p lp) {
            return lp != null;
        }

        public p a(ViewGroup.LayoutParams lp) {
            if (lp instanceof p) {
                return new p((p) lp);
            }
            if (lp instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) lp);
            }
            return new p(lp);
        }

        public p a(Context c2, AttributeSet attrs) {
            return new p(c2, attrs);
        }

        public int a(int dx, v recycler, a0 state) {
            return 0;
        }

        public int b(int dy, v recycler, a0 state) {
            return 0;
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public void h(int position) {
        }

        public boolean w() {
            z zVar = this.f۱۸۶۶g;
            return zVar != null && zVar.c();
        }

        public int j() {
            return android.support.v4.view.u.k(this.f۱۸۶۱b);
        }

        public void a(View child) {
            a(child, -1);
        }

        public void a(View child, int index) {
            a(child, index, true);
        }

        public void b(View child) {
            b(child, -1);
        }

        public void b(View child, int index) {
            a(child, index, false);
        }

        private void a(View child, int index, boolean disappearing) {
            d0 holder = RecyclerView.k(child);
            if (disappearing || holder.p()) {
                this.f۱۸۶۱b.f۱۸۲۳h.a(holder);
            } else {
                this.f۱۸۶۱b.f۱۸۲۳h.g(holder);
            }
            p lp = (p) child.getLayoutParams();
            if (holder.z() || holder.q()) {
                if (holder.q()) {
                    holder.y();
                } else {
                    holder.c();
                }
                this.f۱۸۶۰a.a(child, index, child.getLayoutParams(), false);
            } else if (child.getParent() == this.f۱۸۶۱b) {
                int currentIndex = this.f۱۸۶۰a.b(child);
                if (index == -1) {
                    index = this.f۱۸۶۰a.a();
                }
                if (currentIndex == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f۱۸۶۱b.indexOfChild(child) + this.f۱۸۶۱b.i());
                } else if (currentIndex != index) {
                    this.f۱۸۶۱b.o.a(currentIndex, index);
                }
            } else {
                this.f۱۸۶۰a.a(child, index, false);
                lp.f۱۸۷۶c = true;
                z zVar = this.f۱۸۶۶g;
                if (zVar != null && zVar.c()) {
                    this.f۱۸۶۶g.a(child);
                }
            }
            if (lp.f۱۸۷۷d) {
                holder.f۱۸۴۱c.invalidate();
                lp.f۱۸۷۷d = false;
            }
        }

        public void o(View child) {
            this.f۱۸۶۰a.d(child);
        }

        public void g(int index) {
            if (c(index) != null) {
                this.f۱۸۶۰a.e(index);
            }
        }

        public int d() {
            return -1;
        }

        public int l(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public View c(View view) {
            View found;
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView == null || (found = recyclerView.c(view)) == null || this.f۱۸۶۰a.c(found)) {
                return null;
            }
            return found;
        }

        public View b(int position) {
            int childCount = e();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = c(i2);
                d0 vh = RecyclerView.k(child);
                if (vh != null && vh.i() == position && !vh.x() && (this.f۱۸۶۱b.j0.d() || !vh.p())) {
                    return child;
                }
            }
            return null;
        }

        public void a(int index) {
            a(index, c(index));
        }

        private void a(int index, View view) {
            this.f۱۸۶۰a.a(index);
        }

        public void a(View child, int index, p lp) {
            d0 vh = RecyclerView.k(child);
            if (vh.p()) {
                this.f۱۸۶۱b.f۱۸۲۳h.a(vh);
            } else {
                this.f۱۸۶۱b.f۱۸۲۳h.g(vh);
            }
            this.f۱۸۶۰a.a(child, index, lp, vh.p());
        }

        public void c(View child, int index) {
            a(child, index, (p) child.getLayoutParams());
        }

        public void a(int fromIndex, int toIndex) {
            View view = c(fromIndex);
            if (view != null) {
                a(fromIndex);
                c(view, toIndex);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + fromIndex + this.f۱۸۶۱b.toString());
        }

        public void a(View child, v recycler) {
            o(child);
            recycler.b(child);
        }

        public void a(int index, v recycler) {
            View view = c(index);
            g(index);
            recycler.b(view);
        }

        public int e() {
            d0 d0Var = this.f۱۸۶۰a;
            if (d0Var != null) {
                return d0Var.a();
            }
            return 0;
        }

        public View c(int index) {
            d0 d0Var = this.f۱۸۶۰a;
            if (d0Var != null) {
                return d0Var.c(index);
            }
            return null;
        }

        public int r() {
            return this.o;
        }

        public int i() {
            return this.p;
        }

        public int q() {
            return this.q;
        }

        public int h() {
            return this.r;
        }

        public int n() {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int p() {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int o() {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int m() {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public View g() {
            View focused;
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView == null || (focused = recyclerView.getFocusedChild()) == null || this.f۱۸۶۰a.c(focused)) {
                return null;
            }
            return focused;
        }

        public void d(int dx) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                recyclerView.e(dx);
            }
        }

        public void e(int dy) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null) {
                recyclerView.f(dy);
            }
        }

        public void a(v recycler) {
            for (int i2 = e() - 1; i2 >= 0; i2--) {
                a(recycler, i2, c(i2));
            }
        }

        private void a(v recycler, int index, View view) {
            d0 viewHolder = RecyclerView.k(view);
            if (!viewHolder.x()) {
                if (!viewHolder.n() || viewHolder.p() || this.f۱۸۶۱b.n.c()) {
                    a(index);
                    recycler.c(view);
                    this.f۱۸۶۱b.f۱۸۲۳h.d(viewHolder);
                    return;
                }
                g(index);
                recycler.b(viewHolder);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(v recycler) {
            int scrapCount = recycler.e();
            for (int i2 = scrapCount - 1; i2 >= 0; i2--) {
                View scrap = recycler.c(i2);
                d0 vh = RecyclerView.k(scrap);
                if (!vh.x()) {
                    vh.a(false);
                    if (vh.r()) {
                        this.f۱۸۶۱b.removeDetachedView(scrap, false);
                    }
                    l lVar = this.f۱۸۶۱b.O;
                    if (lVar != null) {
                        lVar.c(vh);
                    }
                    vh.a(true);
                    recycler.a(scrap);
                }
            }
            recycler.c();
            if (scrapCount > 0) {
                this.f۱۸۶۱b.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View child, int widthSpec, int heightSpec, p lp) {
            return !this.k || !b(child.getMeasuredWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !b(child.getMeasuredHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View child, int widthSpec, int heightSpec, p lp) {
            return child.isLayoutRequested() || !this.k || !b(child.getWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !b(child.getHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
        }

        private static boolean b(int childSize, int spec, int dimension) {
            int specMode = View.MeasureSpec.getMode(spec);
            int specSize = View.MeasureSpec.getSize(spec);
            if (dimension > 0 && childSize != dimension) {
                return false;
            }
            if (specMode != Integer.MIN_VALUE) {
                if (specMode == 0) {
                    return true;
                }
                if (specMode == 1073741824 && specSize == childSize) {
                    return true;
                }
                return false;
            } else if (specSize >= childSize) {
                return true;
            } else {
                return false;
            }
        }

        public void a(View child, int widthUsed, int heightUsed) {
            p lp = (p) child.getLayoutParams();
            Rect insets = this.f۱۸۶۱b.f(child);
            int widthUsed2 = widthUsed + insets.left + insets.right;
            int heightUsed2 = heightUsed + insets.top + insets.bottom;
            int widthSpec = a(q(), r(), n() + o() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin + widthUsed2, ((ViewGroup.MarginLayoutParams) lp).width, a());
            int heightSpec = a(h(), i(), p() + m() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + heightUsed2, ((ViewGroup.MarginLayoutParams) lp).height, b());
            if (a(child, widthSpec, heightSpec, lp)) {
                child.measure(widthSpec, heightSpec);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r8 != 1073741824) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r7, int r8, int r9, int r10, boolean r11) {
            /*
                int r0 = r7 - r9
                r1 = 0
                int r0 = java.lang.Math.max(r1, r0)
                r1 = 0
                r2 = 0
                r3 = 1073741824(0x40000000, float:2.0)
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = -2
                r6 = -1
                if (r11 == 0) goto L_0x002c
                if (r10 < 0) goto L_0x0017
                r1 = r10
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0043
            L_0x0017:
                if (r10 != r6) goto L_0x0027
                if (r8 == r4) goto L_0x0023
                if (r8 == 0) goto L_0x0020
                if (r8 == r3) goto L_0x0023
                goto L_0x0026
            L_0x0020:
                r1 = 0
                r2 = 0
                goto L_0x0026
            L_0x0023:
                r1 = r0
                r2 = r8
            L_0x0026:
                goto L_0x0043
            L_0x0027:
                if (r10 != r5) goto L_0x0043
                r1 = 0
                r2 = 0
                goto L_0x0043
            L_0x002c:
                if (r10 < 0) goto L_0x0032
                r1 = r10
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0043
            L_0x0032:
                if (r10 != r6) goto L_0x0037
                r1 = r0
                r2 = r8
                goto L_0x0043
            L_0x0037:
                if (r10 != r5) goto L_0x0043
                r1 = r0
                if (r8 == r4) goto L_0x0041
                if (r8 != r3) goto L_0x003f
                goto L_0x0041
            L_0x003f:
                r2 = 0
                goto L_0x0043
            L_0x0041:
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0043:
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o.a(int, int, int, int, boolean):int");
        }

        public int h(View child) {
            Rect insets = ((p) child.getLayoutParams()).f۱۸۷۵b;
            return child.getMeasuredWidth() + insets.left + insets.right;
        }

        public int g(View child) {
            Rect insets = ((p) child.getLayoutParams()).f۱۸۷۵b;
            return child.getMeasuredHeight() + insets.top + insets.bottom;
        }

        public void a(View child, int left, int top, int right, int bottom) {
            p lp = (p) child.getLayoutParams();
            Rect insets = lp.f۱۸۷۵b;
            child.layout(insets.left + left + ((ViewGroup.MarginLayoutParams) lp).leftMargin, insets.top + top + ((ViewGroup.MarginLayoutParams) lp).topMargin, (right - insets.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (bottom - insets.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        }

        public void a(View child, boolean includeDecorInsets, Rect out) {
            Matrix childMatrix;
            if (includeDecorInsets) {
                Rect insets = ((p) child.getLayoutParams()).f۱۸۷۵b;
                out.set(-insets.left, -insets.top, child.getWidth() + insets.right, child.getHeight() + insets.bottom);
            } else {
                out.set(0, 0, child.getWidth(), child.getHeight());
            }
            if (!(this.f۱۸۶۱b == null || (childMatrix = child.getMatrix()) == null || childMatrix.isIdentity())) {
                RectF tempRectF = this.f۱۸۶۱b.m;
                tempRectF.set(out);
                childMatrix.mapRect(tempRectF);
                out.set((int) Math.floor((double) tempRectF.left), (int) Math.floor((double) tempRectF.top), (int) Math.ceil((double) tempRectF.right), (int) Math.ceil((double) tempRectF.bottom));
            }
            out.offset(child.getLeft(), child.getTop());
        }

        public void b(View view, Rect outBounds) {
            RecyclerView.a(view, outBounds);
        }

        public int f(View child) {
            return child.getLeft() - k(child);
        }

        public int j(View child) {
            return child.getTop() - n(child);
        }

        public int i(View child) {
            return child.getRight() + m(child);
        }

        public int e(View child) {
            return child.getBottom() + d(child);
        }

        public void a(View child, Rect outRect) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView == null) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(recyclerView.f(child));
            }
        }

        public int n(View child) {
            return ((p) child.getLayoutParams()).f۱۸۷۵b.top;
        }

        public int d(View child) {
            return ((p) child.getLayoutParams()).f۱۸۷۵b.bottom;
        }

        public int k(View child) {
            return ((p) child.getLayoutParams()).f۱۸۷۵b.left;
        }

        public int m(View child) {
            return ((p) child.getLayoutParams()).f۱۸۷۵b.right;
        }

        public View a(View focused, int direction, v recycler, a0 state) {
            return null;
        }

        public View d(View focused, int direction) {
            return null;
        }

        private int[] b(RecyclerView parent, View child, Rect rect, boolean immediate) {
            int dx;
            int dy;
            int[] out = new int[2];
            int parentLeft = n();
            int parentTop = p();
            int parentRight = q() - o();
            int parentBottom = h() - m();
            int childLeft = (child.getLeft() + rect.left) - child.getScrollX();
            int childTop = (child.getTop() + rect.top) - child.getScrollY();
            int childRight = rect.width() + childLeft;
            int offScreenLeft = Math.min(0, childLeft - parentLeft);
            int offScreenTop = Math.min(0, childTop - parentTop);
            int offScreenRight = Math.max(0, childRight - parentRight);
            int offScreenBottom = Math.max(0, (rect.height() + childTop) - parentBottom);
            if (j() == 1) {
                if (offScreenRight != 0) {
                    dx = offScreenRight;
                } else {
                    dx = Math.max(offScreenLeft, childRight - parentRight);
                }
            } else if (offScreenLeft != 0) {
                dx = offScreenLeft;
            } else {
                dx = Math.min(childLeft - parentLeft, offScreenRight);
            }
            if (offScreenTop != 0) {
                dy = offScreenTop;
            } else {
                dy = Math.min(childTop - parentTop, offScreenBottom);
            }
            out[0] = dx;
            out[1] = dy;
            return out;
        }

        public boolean a(RecyclerView parent, View child, Rect rect, boolean immediate) {
            return a(parent, child, rect, immediate, false);
        }

        public boolean a(RecyclerView parent, View child, Rect rect, boolean immediate, boolean focusedChildVisible) {
            int[] scrollAmount = b(parent, child, rect, immediate);
            int dx = scrollAmount[0];
            int dy = scrollAmount[1];
            if ((focusedChildVisible && !d(parent, dx, dy)) || (dx == 0 && dy == 0)) {
                return false;
            }
            if (immediate) {
                parent.scrollBy(dx, dy);
            } else {
                parent.i(dx, dy);
            }
            return true;
        }

        public boolean a(View child, boolean completelyVisible, boolean acceptEndPointInclusion) {
            boolean isViewFullyVisible = this.f۱۸۶۴e.a(child, 24579) && this.f۱۸۶۵f.a(child, 24579);
            if (completelyVisible) {
                return isViewFullyVisible;
            }
            if (!isViewFullyVisible) {
                return true;
            }
            return false;
        }

        private boolean d(RecyclerView parent, int dx, int dy) {
            View focusedChild = parent.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int parentLeft = n();
            int parentTop = p();
            int parentRight = q() - o();
            int parentBottom = h() - m();
            Rect bounds = this.f۱۸۶۱b.k;
            b(focusedChild, bounds);
            if (bounds.left - dx >= parentRight || bounds.right - dx <= parentLeft || bounds.top - dy >= parentBottom || bounds.bottom - dy <= parentTop) {
                return false;
            }
            return true;
        }

        @Deprecated
        public boolean a(RecyclerView parent, View child, View focused) {
            return w() || parent.n();
        }

        public boolean a(RecyclerView parent, a0 state, View child, View focused) {
            return a(parent, child, focused);
        }

        public void a(g oldAdapter, g newAdapter) {
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int direction, int focusableMode) {
            return false;
        }

        public void d(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        public void b(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        public void c(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        public void a(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
            c(recyclerView, positionStart, itemCount);
        }

        public void a(RecyclerView recyclerView, int from, int to, int itemCount) {
        }

        public int a(a0 state) {
            return 0;
        }

        public int b(a0 state) {
            return 0;
        }

        public int c(a0 state) {
            return 0;
        }

        public int d(a0 state) {
            return 0;
        }

        public int e(a0 state) {
            return 0;
        }

        public int f(a0 state) {
            return 0;
        }

        public void a(v recycler, a0 state, int widthSpec, int heightSpec) {
            this.f۱۸۶۱b.c(widthSpec, heightSpec);
        }

        public void c(int widthSize, int heightSize) {
            this.f۱۸۶۱b.setMeasuredDimension(widthSize, heightSize);
        }

        public int l() {
            return android.support.v4.view.u.m(this.f۱۸۶۱b);
        }

        public int k() {
            return android.support.v4.view.u.l(this.f۱۸۶۱b);
        }

        public Parcelable x() {
            return null;
        }

        public void a(Parcelable state) {
        }

        /* access modifiers changed from: package-private */
        public void B() {
            z zVar = this.f۱۸۶۶g;
            if (zVar != null) {
                zVar.d();
            }
        }

        public void f(int state) {
        }

        public void b(v recycler) {
            for (int i2 = e() - 1; i2 >= 0; i2--) {
                if (!RecyclerView.k(c(i2)).x()) {
                    a(i2, recycler);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(android.support.v4.view.d0.c info2) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            a(recyclerView.f۱۸۱۹d, recyclerView.j0, info2);
        }

        public void a(v recycler, a0 state, android.support.v4.view.d0.c info2) {
            if (this.f۱۸۶۱b.canScrollVertically(-1) || this.f۱۸۶۱b.canScrollHorizontally(-1)) {
                info2.a(8192);
                info2.k(true);
            }
            if (this.f۱۸۶۱b.canScrollVertically(1) || this.f۱۸۶۱b.canScrollHorizontally(1)) {
                info2.a(4096);
                info2.k(true);
            }
            info2.a(c.b.a(b(recycler, state), a(recycler, state), d(recycler, state), c(recycler, state)));
        }

        public void a(AccessibilityEvent event) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            a(recyclerView.f۱۸۱۹d, recyclerView.j0, event);
        }

        public void a(v recycler, a0 state, AccessibilityEvent event) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView != null && event != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f۱۸۶۱b.canScrollVertically(-1) && !this.f۱۸۶۱b.canScrollHorizontally(-1) && !this.f۱۸۶۱b.canScrollHorizontally(1)) {
                    z = false;
                }
                event.setScrollable(z);
                g gVar = this.f۱۸۶۱b.n;
                if (gVar != null) {
                    event.setItemCount(gVar.a());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View host, android.support.v4.view.d0.c info2) {
            d0 vh = RecyclerView.k(host);
            if (vh != null && !vh.p() && !this.f۱۸۶۰a.c(vh.f۱۸۴۱c)) {
                RecyclerView recyclerView = this.f۱۸۶۱b;
                a(recyclerView.f۱۸۱۹d, recyclerView.j0, host, info2);
            }
        }

        public void a(v recycler, a0 state, View host, android.support.v4.view.d0.c info2) {
            info2.b(c.C۰۰۳۲c.a(b() ? l(host) : 0, 1, a() ? l(host) : 0, 1, false, false));
        }

        public void z() {
            this.f۱۸۶۷h = true;
        }

        public int c(v recycler, a0 state) {
            return 0;
        }

        public int b(v recycler, a0 state) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView == null || recyclerView.n == null || !b()) {
                return 1;
            }
            return this.f۱۸۶۱b.n.a();
        }

        public int a(v recycler, a0 state) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView == null || recyclerView.n == null || !a()) {
                return 1;
            }
            return this.f۱۸۶۱b.n.a();
        }

        public boolean d(v recycler, a0 state) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int action, Bundle args) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            return a(recyclerView.f۱۸۱۹d, recyclerView.j0, action, args);
        }

        public boolean a(v recycler, a0 state, int action, Bundle args) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            if (recyclerView == null) {
                return false;
            }
            int vScroll = 0;
            int hScroll = 0;
            if (action == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    vScroll = (h() - p()) - m();
                }
                if (this.f۱۸۶۱b.canScrollHorizontally(1)) {
                    hScroll = (q() - n()) - o();
                }
            } else if (action == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    vScroll = -((h() - p()) - m());
                }
                if (this.f۱۸۶۱b.canScrollHorizontally(-1)) {
                    hScroll = -((q() - n()) - o());
                }
            }
            if (vScroll == 0 && hScroll == 0) {
                return false;
            }
            this.f۱۸۶۱b.i(hScroll, vScroll);
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int action, Bundle args) {
            RecyclerView recyclerView = this.f۱۸۶۱b;
            return a(recyclerView.f۱۸۱۹d, recyclerView.j0, view, action, args);
        }

        public boolean a(v recycler, a0 state, View view, int action, Bundle args) {
            return false;
        }

        public static d a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            d properties = new d();
            TypedArray a2 = context.obtainStyledAttributes(attrs, a.b.h.e.b.RecyclerView, defStyleAttr, defStyleRes);
            properties.f۱۸۷۰a = a2.getInt(a.b.h.e.b.RecyclerView_android_orientation, 1);
            properties.f۱۸۷۱b = a2.getInt(a.b.h.e.b.RecyclerView_spanCount, 1);
            properties.f۱۸۷۲c = a2.getBoolean(a.b.h.e.b.RecyclerView_reverseLayout, false);
            properties.f۱۸۷۳d = a2.getBoolean(a.b.h.e.b.RecyclerView_stackFromEnd, false);
            a2.recycle();
            return properties;
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView recyclerView) {
            b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            int childCount = e();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewGroup.LayoutParams lp = c(i2).getLayoutParams();
                if (lp.width < 0 && lp.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class n {
        public void a(Canvas c2, RecyclerView parent, a0 state) {
            a(c2, parent);
        }

        @Deprecated
        public void a(Canvas c2, RecyclerView parent) {
        }

        public void b(Canvas c2, RecyclerView parent, a0 state) {
            b(c2, parent);
        }

        @Deprecated
        public void b(Canvas c2, RecyclerView parent) {
        }

        @Deprecated
        public void a(Rect outRect, int itemPosition, RecyclerView parent) {
            outRect.set(0, 0, 0, 0);
        }

        public void a(Rect outRect, View view, RecyclerView parent, a0 state) {
            a(outRect, ((p) view.getLayoutParams()).a(), parent);
        }
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int newState) {
        }

        public void a(RecyclerView recyclerView, int dx, int dy) {
        }
    }

    public static abstract class d0 {
        private static final List<Object> u = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public final View f۱۸۴۱c;

        /* renamed from: d  reason: collision with root package name */
        WeakReference<RecyclerView> f۱۸۴۲d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۸۴۳e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f۱۸۴۴f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f۱۸۴۵g = -1;

        /* renamed from: h  reason: collision with root package name */
        int f۱۸۴۶h = -1;
        int i = -1;
        d0 j = null;
        d0 k = null;
        int l;
        List<Object> m = null;
        List<Object> n = null;
        private int o = 0;
        v p = null;
        boolean q = false;
        private int r = 0;
        int s = -1;
        RecyclerView t;

        public d0(View itemView) {
            if (itemView != null) {
                this.f۱۸۴۱c = itemView;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        public void a(int mNewPosition, int offset, boolean applyToPreLayout) {
            a(8);
            a(offset, applyToPreLayout);
            this.f۱۸۴۳e = mNewPosition;
        }

        /* access modifiers changed from: package-private */
        public void a(int offset, boolean applyToPreLayout) {
            if (this.f۱۸۴۴f == -1) {
                this.f۱۸۴۴f = this.f۱۸۴۳e;
            }
            if (this.i == -1) {
                this.i = this.f۱۸۴۳e;
            }
            if (applyToPreLayout) {
                this.i += offset;
            }
            this.f۱۸۴۳e += offset;
            if (this.f۱۸۴۱c.getLayoutParams() != null) {
                ((p) this.f۱۸۴۱c.getLayoutParams()).f۱۸۷۶c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f۱۸۴۴f = -1;
            this.i = -1;
        }

        /* access modifiers changed from: package-private */
        public void v() {
            if (this.f۱۸۴۴f == -1) {
                this.f۱۸۴۴f = this.f۱۸۴۳e;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            return (this.l & 128) != 0;
        }

        public final int i() {
            int i2 = this.i;
            return i2 == -1 ? this.f۱۸۴۳e : i2;
        }

        public final int f() {
            RecyclerView recyclerView = this.t;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b(this);
        }

        public final int j() {
            return this.f۱۸۴۴f;
        }

        public final long g() {
            return this.f۱۸۴۵g;
        }

        public final int h() {
            return this.f۱۸۴۶h;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return this.p != null;
        }

        /* access modifiers changed from: package-private */
        public void y() {
            this.p.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            return (this.l & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.l &= -33;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.l &= -257;
        }

        /* access modifiers changed from: package-private */
        public void a(v recycler, boolean isChangeScrap) {
            this.p = recycler;
            this.q = isChangeScrap;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return (this.l & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return (this.l & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean m() {
            return (this.l & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return (this.l & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int flags) {
            return (this.l & flags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean r() {
            return (this.l & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean l() {
            return (this.l & 512) != 0 || n();
        }

        /* access modifiers changed from: package-private */
        public void a(int flags, int mask) {
            this.l = (this.l & (mask ^ -1)) | (flags & mask);
        }

        /* access modifiers changed from: package-private */
        public void a(int flags) {
            this.l |= flags;
        }

        /* access modifiers changed from: package-private */
        public void a(Object payload) {
            if (payload == null) {
                a(1024);
            } else if ((1024 & this.l) == 0) {
                A();
                this.m.add(payload);
            }
        }

        private void A() {
            if (this.m == null) {
                this.m = new ArrayList();
                this.n = Collections.unmodifiableList(this.m);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            List<Object> list = this.m;
            if (list != null) {
                list.clear();
            }
            this.l &= -1025;
        }

        /* access modifiers changed from: package-private */
        public List<Object> k() {
            if ((this.l & 1024) != 0) {
                return u;
            }
            List<Object> list = this.m;
            if (list == null || list.size() == 0) {
                return u;
            }
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public void u() {
            this.l = 0;
            this.f۱۸۴۳e = -1;
            this.f۱۸۴۴f = -1;
            this.f۱۸۴۵g = -1;
            this.i = -1;
            this.o = 0;
            this.j = null;
            this.k = null;
            b();
            this.r = 0;
            this.s = -1;
            RecyclerView.e(this);
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView parent) {
            int i2 = this.s;
            if (i2 != -1) {
                this.r = i2;
            } else {
                this.r = android.support.v4.view.u.i(this.f۱۸۴۱c);
            }
            parent.a(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView parent) {
            parent.a(this, this.r);
            this.r = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f۱۸۴۳e + " id=" + this.f۱۸۴۵g + ", oldPos=" + this.f۱۸۴۴f + ", pLpos:" + this.i);
            if (q()) {
                sb.append(" scrap ");
                sb.append(this.q ? "[changeScrap]" : "[attachedScrap]");
            }
            if (n()) {
                sb.append(" invalid");
            }
            if (!m()) {
                sb.append(" unbound");
            }
            if (t()) {
                sb.append(" update");
            }
            if (p()) {
                sb.append(" removed");
            }
            if (x()) {
                sb.append(" ignored");
            }
            if (r()) {
                sb.append(" tmpDetached");
            }
            if (!o()) {
                sb.append(" not recyclable(" + this.o + ")");
            }
            if (l()) {
                sb.append(" undefined adapter position");
            }
            if (this.f۱۸۴۱c.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final void a(boolean recyclable) {
            int i2 = this.o;
            this.o = recyclable ? i2 - 1 : i2 + 1;
            int i3 = this.o;
            if (i3 < 0) {
                this.o = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!recyclable && i3 == 1) {
                this.l |= 16;
            } else if (recyclable && this.o == 0) {
                this.l &= -17;
            }
        }

        public final boolean o() {
            return (this.l & 16) == 0 && !android.support.v4.view.u.w(this.f۱۸۴۱c);
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return (this.l & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return (this.l & 16) == 0 && android.support.v4.view.u.w(this.f۱۸۴۱c);
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.l & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(d0 viewHolder, int importantForAccessibility) {
        if (n()) {
            viewHolder.s = importantForAccessibility;
            this.y0.add(viewHolder);
            return false;
        }
        android.support.v4.view.u.f(viewHolder.f۱۸۴۱c, importantForAccessibility);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int state;
        for (int i2 = this.y0.size() - 1; i2 >= 0; i2--) {
            d0 viewHolder = this.y0.get(i2);
            if (viewHolder.f۱۸۴۱c.getParent() == this && !viewHolder.x() && (state = viewHolder.s) != -1) {
                android.support.v4.view.u.f(viewHolder.f۱۸۴۱c, state);
                viewHolder.s = -1;
            }
        }
        this.y0.clear();
    }

    /* access modifiers changed from: package-private */
    public int b(d0 viewHolder) {
        if (viewHolder.b(524) || !viewHolder.m()) {
            return -1;
        }
        return this.f۱۸۲۱f.a(viewHolder.f۱۸۴۳e);
    }

    /* access modifiers changed from: package-private */
    public void a(StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable) {
        if (verticalThumbDrawable == null || verticalTrackDrawable == null || horizontalThumbDrawable == null || horizontalTrackDrawable == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + i());
        }
        Resources resources = getContext().getResources();
        new j0(this, verticalThumbDrawable, verticalTrackDrawable, horizontalThumbDrawable, horizontalTrackDrawable, resources.getDimensionPixelSize(a.b.h.e.a.fastscroll_default_thickness), resources.getDimensionPixelSize(a.b.h.e.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.b.h.e.a.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        getScrollingChildHelper().a(enabled);
    }

    @Override // android.support.v4.view.k
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().b();
    }

    public boolean startNestedScroll(int axes) {
        return getScrollingChildHelper().b(axes);
    }

    public boolean j(int axes, int type) {
        return getScrollingChildHelper().a(axes, type);
    }

    @Override // android.support.v4.view.k
    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    @Override // android.support.v4.view.j
    public void a(int type) {
        getScrollingChildHelper().c(type);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    public boolean d(int type) {
        return getScrollingChildHelper().a(type);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return getScrollingChildHelper().a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public boolean a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return getScrollingChildHelper().a(dx, dy, consumed, offsetInWindow);
    }

    public boolean a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().a(dx, dy, consumed, offsetInWindow, type);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return getScrollingChildHelper().a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return getScrollingChildHelper().a(velocityX, velocityY);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f۱۸۷۴a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f۱۸۷۵b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f۱۸۷۶c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f۱۸۷۷d = false;

        public p(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public p(int width, int height) {
            super(width, height);
        }

        public p(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public p(ViewGroup.LayoutParams source) {
            super(source);
        }

        public p(p source) {
            super((ViewGroup.LayoutParams) source);
        }

        public boolean d() {
            return this.f۱۸۷۴a.n();
        }

        public boolean c() {
            return this.f۱۸۷۴a.p();
        }

        public boolean b() {
            return this.f۱۸۷۴a.s();
        }

        public int a() {
            return this.f۱۸۷۴a.i();
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void a(int positionStart, int itemCount) {
        }

        public void a(int positionStart, int itemCount, Object payload) {
            a(positionStart, itemCount);
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int i = ((Observable) this).mObservers.size() - 1; i >= 0; i--) {
                ((i) ((Observable) this).mObservers.get(i)).a();
            }
        }

        public void a(int positionStart, int itemCount) {
            a(positionStart, itemCount, null);
        }

        public void a(int positionStart, int itemCount, Object payload) {
            for (int i = ((Observable) this).mObservers.size() - 1; i >= 0; i--) {
                ((i) ((Observable) this).mObservers.get(i)).a(positionStart, itemCount, payload);
            }
        }
    }

    public static class y extends android.support.v4.view.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        Parcelable f۱۸۹۳e;

        y(Parcel in, ClassLoader loader) {
            super(in, loader);
            ClassLoader classLoader;
            if (loader != null) {
                classLoader = loader;
            } else {
                classLoader = o.class.getClassLoader();
            }
            this.f۱۸۹۳e = in.readParcelable(classLoader);
        }

        y(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.v4.view.a
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeParcelable(this.f۱۸۹۳e, 0);
        }

        /* access modifiers changed from: package-private */
        public void a(y other) {
            this.f۱۸۹۳e = other.f۱۸۹۳e;
        }

        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public y createFromParcel(Parcel in, ClassLoader loader) {
                return new y(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public y createFromParcel(Parcel in) {
                return new y(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public y[] newArray(int size) {
                return new y[size];
            }
        }
    }

    public static class a0 {

        /* renamed from: a  reason: collision with root package name */
        int f۱۸۲۵a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f۱۸۲۶b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۸۲۷c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f۱۸۲۸d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f۱۸۲۹e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f۱۸۳۰f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f۱۸۳۱g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f۱۸۳۲h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* access modifiers changed from: package-private */
        public void a(int accepted) {
            if ((this.f۱۸۲۹e & accepted) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(accepted) + " but it is " + Integer.toBinaryString(this.f۱۸۲۹e));
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g adapter) {
            this.f۱۸۲۹e = 1;
            this.f۱۸۳۰f = adapter.a();
            this.f۱۸۳۲h = false;
            this.i = false;
            this.j = false;
        }

        public boolean d() {
            return this.f۱۸۳۲h;
        }

        public boolean e() {
            return this.l;
        }

        public int b() {
            return this.f۱۸۲۵a;
        }

        public boolean c() {
            return this.f۱۸۲۵a != -1;
        }

        public int a() {
            return this.f۱۸۳۲h ? this.f۱۸۲۷c - this.f۱۸۲۸d : this.f۱۸۳۰f;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f۱۸۲۵a + ", mData=" + this.f۱۸۲۶b + ", mItemCount=" + this.f۱۸۳۰f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f۱۸۲۷c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f۱۸۲۸d + ", mStructureChanged=" + this.f۱۸۳۱g + ", mInPreLayout=" + this.f۱۸۳۲h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    private class m implements l.b {
        m() {
        }

        @Override // android.support.v7.widget.RecyclerView.l.b
        public void a(d0 item) {
            item.a(true);
            if (item.j != null && item.k == null) {
                item.j = null;
            }
            item.k = null;
            if (!item.w() && !RecyclerView.this.i(item.f۱۸۴۱c) && item.r()) {
                RecyclerView.this.removeDetachedView(item.f۱۸۴۱c, false);
            }
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private b f۱۸۵۱a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f۱۸۵۲b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f۱۸۵۳c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f۱۸۵۴d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f۱۸۵۵e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f۱۸۵۶f = 250;

        public interface a {
            void a();
        }

        /* access modifiers changed from: package-private */
        public interface b {
            void a(d0 d0Var);
        }

        public abstract boolean a(d0 d0Var);

        public abstract boolean a(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract void b();

        public abstract boolean b(d0 d0Var, c cVar, c cVar2);

        public abstract void c(d0 d0Var);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean g();

        public abstract void i();

        public long e() {
            return this.f۱۸۵۵e;
        }

        public long c() {
            return this.f۱۸۵۳c;
        }

        public long f() {
            return this.f۱۸۵۴d;
        }

        public long d() {
            return this.f۱۸۵۶f;
        }

        /* access modifiers changed from: package-private */
        public void a(b listener) {
            this.f۱۸۵۱a = listener;
        }

        public c a(a0 state, d0 viewHolder, int changeFlags, List<Object> list) {
            c h2 = h();
            h2.a(viewHolder);
            return h2;
        }

        public c a(a0 state, d0 viewHolder) {
            c h2 = h();
            h2.a(viewHolder);
            return h2;
        }

        static int e(d0 viewHolder) {
            int flags = viewHolder.l & 14;
            if (viewHolder.n()) {
                return 4;
            }
            if ((flags & 4) != 0) {
                return flags;
            }
            int oldPos = viewHolder.j();
            int pos = viewHolder.f();
            if (oldPos == -1 || pos == -1 || oldPos == pos) {
                return flags;
            }
            return flags | 2048;
        }

        public final void b(d0 viewHolder) {
            d(viewHolder);
            b bVar = this.f۱۸۵۱a;
            if (bVar != null) {
                bVar.a(viewHolder);
            }
        }

        public void d(d0 viewHolder) {
        }

        public boolean a(d0 viewHolder, List<Object> list) {
            return a(viewHolder);
        }

        public final void a() {
            int count = this.f۱۸۵۲b.size();
            for (int i = 0; i < count; i++) {
                this.f۱۸۵۲b.get(i).a();
            }
            this.f۱۸۵۲b.clear();
        }

        public c h() {
            return new c();
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f۱۸۵۷a;

            /* renamed from: b  reason: collision with root package name */
            public int f۱۸۵۸b;

            public c a(d0 holder) {
                a(holder, 0);
                return this;
            }

            public c a(d0 holder, int flags) {
                View view = holder.f۱۸۴۱c;
                this.f۱۸۵۷a = view.getLeft();
                this.f۱۸۵۸b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int childCount, int i2) {
        j jVar = this.r0;
        if (jVar == null) {
            return super.getChildDrawingOrder(childCount, i2);
        }
        return jVar.a(childCount, i2);
    }

    private android.support.v4.view.l getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new android.support.v4.view.l(this);
        }
        return this.t0;
    }
}
