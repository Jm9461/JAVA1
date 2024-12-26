package android.support.p۰۴۷v7.widget;

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
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cl;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۳v4.widget.Cg;
import android.support.p۰۴۷v7.widget.Cd;
import android.support.p۰۴۷v7.widget.Cd0;
import android.support.p۰۴۷v7.widget.Cp1;
import android.support.p۰۴۷v7.widget.Cq1;
import android.support.p۰۴۷v7.widget.RunnableCm0;
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
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Cb;

/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup implements android.support.p۰۴۳v4.view.AbstractCs, android.support.p۰۴۳v4.view.AbstractCj {

    /* renamed from: B0  reason: contains not printable characters */
    private static final int[] f۱۱۵۲۵B0 = {16843830};

    /* renamed from: C0  reason: contains not printable characters */
    private static final int[] f۱۱۵۲۶C0 = {16842987};

    /* renamed from: D0  reason: contains not printable characters */
    static final boolean f۱۱۵۲۷D0;

    /* renamed from: E0  reason: contains not printable characters */
    static final boolean f۱۱۵۲۸E0 = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: F0  reason: contains not printable characters */
    static final boolean f۱۱۵۲۹F0 = (Build.VERSION.SDK_INT >= 16);

    /* renamed from: G0  reason: contains not printable characters */
    static final boolean f۱۱۵۳۰G0 = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: H0  reason: contains not printable characters */
    private static final boolean f۱۱۵۳۱H0 = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: I0  reason: contains not printable characters */
    private static final boolean f۱۱۵۳۲I0 = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: J0  reason: contains not printable characters */
    private static final Class<?>[] f۱۱۵۳۳J0;

    /* renamed from: K0  reason: contains not printable characters */
    static final Interpolator f۱۱۵۳۴K0 = new animationInterpolatorCc();

    /* renamed from: A  reason: contains not printable characters */
    private boolean f۱۱۵۳۵A;

    /* renamed from: A0  reason: contains not printable characters */
    private final Cq1.AbstractCb f۱۱۵۳۶A0;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۱۵۳۷B;

    /* renamed from: C  reason: contains not printable characters */
    boolean f۱۱۵۳۸C;

    /* renamed from: D  reason: contains not printable characters */
    private final AccessibilityManager f۱۱۵۳۹D;

    /* renamed from: E  reason: contains not printable characters */
    private List<AbstractCq> f۱۱۵۴۰E;

    /* renamed from: F  reason: contains not printable characters */
    boolean f۱۱۵۴۱F;

    /* renamed from: G  reason: contains not printable characters */
    boolean f۱۱۵۴۲G;

    /* renamed from: H  reason: contains not printable characters */
    private int f۱۱۵۴۳H;

    /* renamed from: I  reason: contains not printable characters */
    private int f۱۱۵۴۴I;

    /* renamed from: J  reason: contains not printable characters */
    private Ck f۱۱۵۴۵J;

    /* renamed from: K  reason: contains not printable characters */
    private EdgeEffect f۱۱۵۴۶K;

    /* renamed from: L  reason: contains not printable characters */
    private EdgeEffect f۱۱۵۴۷L;

    /* renamed from: M  reason: contains not printable characters */
    private EdgeEffect f۱۱۵۴۸M;

    /* renamed from: N  reason: contains not printable characters */
    private EdgeEffect f۱۱۵۴۹N;

    /* renamed from: O  reason: contains not printable characters */
    AbstractCl f۱۱۵۵۰O;

    /* renamed from: P  reason: contains not printable characters */
    private int f۱۱۵۵۱P;

    /* renamed from: Q  reason: contains not printable characters */
    private int f۱۱۵۵۲Q;

    /* renamed from: R  reason: contains not printable characters */
    private VelocityTracker f۱۱۵۵۳R;

    /* renamed from: S  reason: contains not printable characters */
    private int f۱۱۵۵۴S;

    /* renamed from: T  reason: contains not printable characters */
    private int f۱۱۵۵۵T;

    /* renamed from: U  reason: contains not printable characters */
    private int f۱۱۵۵۶U;

    /* renamed from: V  reason: contains not printable characters */
    private int f۱۱۵۵۷V;

    /* renamed from: W  reason: contains not printable characters */
    private int f۱۱۵۵۸W;

    /* renamed from: a0  reason: contains not printable characters */
    private AbstractCr f۱۱۵۵۹a0;

    /* renamed from: b0  reason: contains not printable characters */
    private final int f۱۱۵۶۰b0;

    /* renamed from: c  reason: contains not printable characters */
    private final Cx f۱۱۵۶۱c;

    /* renamed from: c0  reason: contains not printable characters */
    private final int f۱۱۵۶۲c0;

    /* renamed from: d  reason: contains not printable characters */
    final Cv f۱۱۵۶۳d;

    /* renamed from: d0  reason: contains not printable characters */
    private float f۱۱۵۶۴d0;

    /* renamed from: e  reason: contains not printable characters */
    private Cy f۱۱۵۶۵e;

    /* renamed from: e0  reason: contains not printable characters */
    private float f۱۱۵۶۶e0;

    /* renamed from: f  reason: contains not printable characters */
    Cd f۱۱۵۶۷f;

    /* renamed from: f0  reason: contains not printable characters */
    private boolean f۱۱۵۶۸f0;

    /* renamed from: g  reason: contains not printable characters */
    Cd0 f۱۱۵۶۹g;

    /* renamed from: g0  reason: contains not printable characters */
    final RunnableCc0 f۱۱۵۷۰g0;

    /* renamed from: h  reason: contains not printable characters */
    final Cq1 f۱۱۵۷۱h;

    /* renamed from: h0  reason: contains not printable characters */
    RunnableCm0 f۱۱۵۷۲h0;

    /* renamed from: i  reason: contains not printable characters */
    boolean f۱۱۵۷۳i;

    /* renamed from: i0  reason: contains not printable characters */
    RunnableCm0.Cb f۱۱۵۷۴i0;

    /* renamed from: j  reason: contains not printable characters */
    final Runnable f۱۱۵۷۵j;

    /* renamed from: j0  reason: contains not printable characters */
    final Ca0 f۱۱۵۷۶j0;

    /* renamed from: k  reason: contains not printable characters */
    final Rect f۱۱۵۷۷k;

    /* renamed from: k0  reason: contains not printable characters */
    private AbstractCt f۱۱۵۷۸k0;

    /* renamed from: l  reason: contains not printable characters */
    private final Rect f۱۱۵۷۹l;

    /* renamed from: l0  reason: contains not printable characters */
    private List<AbstractCt> f۱۱۵۸۰l0;

    /* renamed from: m  reason: contains not printable characters */
    final RectF f۱۱۵۸۱m;

    /* renamed from: m0  reason: contains not printable characters */
    boolean f۱۱۵۸۲m0;

    /* renamed from: n  reason: contains not printable characters */
    AbstractCg f۱۱۵۸۳n;

    /* renamed from: n0  reason: contains not printable characters */
    boolean f۱۱۵۸۴n0;

    /* renamed from: o  reason: contains not printable characters */
    AbstractCo f۱۱۵۸۵o;

    /* renamed from: o0  reason: contains not printable characters */
    private AbstractCl.AbstractCb f۱۱۵۸۶o0;

    /* renamed from: p  reason: contains not printable characters */
    AbstractCw f۱۱۵۸۷p;

    /* renamed from: p0  reason: contains not printable characters */
    boolean f۱۱۵۸۸p0;

    /* renamed from: q  reason: contains not printable characters */
    final ArrayList<AbstractCn> f۱۱۵۸۹q;

    /* renamed from: q0  reason: contains not printable characters */
    Cv0 f۱۱۵۹۰q0;

    /* renamed from: r  reason: contains not printable characters */
    private final ArrayList<AbstractCs> f۱۱۵۹۱r;

    /* renamed from: r0  reason: contains not printable characters */
    private AbstractCj f۱۱۵۹۲r0;

    /* renamed from: s  reason: contains not printable characters */
    private AbstractCs f۱۱۵۹۳s;

    /* renamed from: s0  reason: contains not printable characters */
    private final int[] f۱۱۵۹۴s0;

    /* renamed from: t  reason: contains not printable characters */
    boolean f۱۱۵۹۵t;

    /* renamed from: t0  reason: contains not printable characters */
    private Cl f۱۱۵۹۶t0;

    /* renamed from: u  reason: contains not printable characters */
    boolean f۱۱۵۹۷u;

    /* renamed from: u0  reason: contains not printable characters */
    private final int[] f۱۱۵۹۸u0;

    /* renamed from: v  reason: contains not printable characters */
    boolean f۱۱۵۹۹v;

    /* renamed from: v0  reason: contains not printable characters */
    final int[] f۱۱۶۰۰v0;

    /* renamed from: w  reason: contains not printable characters */
    boolean f۱۱۶۰۱w;

    /* renamed from: w0  reason: contains not printable characters */
    private final int[] f۱۱۶۰۲w0;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۱۶۰۳x;

    /* renamed from: x0  reason: contains not printable characters */
    final int[] f۱۱۶۰۴x0;

    /* renamed from: y  reason: contains not printable characters */
    boolean f۱۱۶۰۵y;

    /* renamed from: y0  reason: contains not printable characters */
    final List<AbstractCd0> f۱۱۶۰۶y0;

    /* renamed from: z  reason: contains not printable characters */
    boolean f۱۱۶۰۷z;

    /* renamed from: z0  reason: contains not printable characters */
    private Runnable f۱۱۶۰۸z0;

    /* renamed from: android.support.v7.widget.RecyclerView$b0  reason: invalid class name */
    public static abstract class AbstractCb0 {
        /* renamed from: a  reason: contains not printable characters */
        public abstract View m۱۴۳۶۰a(Cv vVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j  reason: invalid class name */
    public interface AbstractCj {
        /* renamed from: a  reason: contains not printable characters */
        int m۱۴۴۵۹a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q  reason: invalid class name */
    public interface AbstractCq {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۶۴۶a(View view);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۴۶۴۷b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r  reason: invalid class name */
    public static abstract class AbstractCr {
        /* renamed from: a  reason: contains not printable characters */
        public abstract boolean m۱۴۶۴۸a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s  reason: invalid class name */
    public interface AbstractCs {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۶۴۹a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۶۵۰a(boolean z);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۴۶۵۱b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$w  reason: invalid class name */
    public interface AbstractCw {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۷۰۵a(AbstractCd0 d0Var);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$z  reason: invalid class name */
    public static abstract class AbstractCz {

        /* renamed from: android.support.v7.widget.RecyclerView$z$a  reason: invalid class name */
        public interface AbstractCa {
        }

        /* renamed from: a  reason: contains not printable characters */
        public abstract int m۱۴۷۱۰a();

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۴۷۱۱a(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۴۷۱۲a(int i, int i2);

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۴۷۱۳a(View view);

        /* renamed from: b  reason: contains not printable characters */
        public abstract boolean m۱۴۷۱۴b();

        /* renamed from: c  reason: contains not printable characters */
        public abstract boolean m۱۴۷۱۵c();

        /* access modifiers changed from: protected */
        /* renamed from: d  reason: contains not printable characters */
        public final void m۱۴۷۱۶d() {
            throw null;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f۱۱۵۲۷D0 = i == 18 || i == 19 || i == 20;
        Class<?> cls = Integer.TYPE;
        f۱۱۵۳۳J0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f۱۱۶۰۱w && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f۱۱۵۹۵t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f۱۱۶۰۷z) {
                    recyclerView2.f۱۱۶۰۵y = true;
                } else {
                    recyclerView2.m۱۴۲۹۹b();
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            AbstractCl lVar = RecyclerView.this.f۱۱۵۵۰O;
            if (lVar != null) {
                lVar.m۱۴۴۸۲i();
            }
            RecyclerView.this.f۱۱۵۸۸p0 = false;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c  reason: invalid class name */
    static class animationInterpolatorCc implements Interpolator {
        animationInterpolatorCc() {
        }

        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d  reason: invalid class name */
    class Cd implements Cq1.AbstractCb {
        Cd() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cq1.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۳۷۳c(AbstractCd0 viewHolder, AbstractCl.Cc info2, AbstractCl.Cc postInfo) {
            RecyclerView.this.f۱۱۵۶۳d.m۱۴۶۹۲c(viewHolder);
            RecyclerView.this.m۱۴۳۰۲b(viewHolder, info2, postInfo);
        }

        @Override // android.support.p۰۴۷v7.widget.Cq1.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۱a(AbstractCd0 viewHolder, AbstractCl.Cc preInfo, AbstractCl.Cc info2) {
            RecyclerView.this.m۱۴۲۸۴a(viewHolder, preInfo, info2);
        }

        @Override // android.support.p۰۴۷v7.widget.Cq1.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۳۷۲b(AbstractCd0 viewHolder, AbstractCl.Cc preInfo, AbstractCl.Cc postInfo) {
            viewHolder.m۱۴۳۸۳a(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f۱۱۵۴۱F) {
                if (recyclerView.f۱۱۵۵۰O.m۱۴۴۶۷a(viewHolder, viewHolder, preInfo, postInfo)) {
                    RecyclerView.this.m۱۴۳۴۷s();
                }
            } else if (recyclerView.f۱۱۵۵۰O.m۱۴۴۷۵c(viewHolder, preInfo, postInfo)) {
                RecyclerView.this.m۱۴۳۴۷s();
            }
        }

        @Override // android.support.p۰۴۷v7.widget.Cq1.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۰a(AbstractCd0 viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f۱۱۵۸۵o.m۱۴۵۳۸a(viewHolder.f۱۱۶۳۷c, recyclerView.f۱۱۵۶۳d);
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
        this.f۱۱۵۶۱c = new Cx();
        this.f۱۱۵۶۳d = new Cv();
        this.f۱۱۵۷۱h = new Cq1();
        this.f۱۱۵۷۵j = new RunnableCa();
        this.f۱۱۵۷۷k = new Rect();
        this.f۱۱۵۷۹l = new Rect();
        this.f۱۱۵۸۱m = new RectF();
        this.f۱۱۵۸۹q = new ArrayList<>();
        this.f۱۱۵۹۱r = new ArrayList<>();
        this.f۱۱۶۰۳x = 0;
        this.f۱۱۵۴۱F = false;
        this.f۱۱۵۴۲G = false;
        this.f۱۱۵۴۳H = 0;
        this.f۱۱۵۴۴I = 0;
        this.f۱۱۵۴۵J = new Ck();
        this.f۱۱۵۵۰O = new Cg0();
        this.f۱۱۵۵۱P = 0;
        this.f۱۱۵۵۲Q = -1;
        this.f۱۱۵۶۴d0 = Float.MIN_VALUE;
        this.f۱۱۵۶۶e0 = Float.MIN_VALUE;
        this.f۱۱۵۶۸f0 = true;
        this.f۱۱۵۷۰g0 = new RunnableCc0();
        this.f۱۱۵۷۴i0 = f۱۱۵۳۰G0 ? new RunnableCm0.Cb() : null;
        this.f۱۱۵۷۶j0 = new Ca0();
        this.f۱۱۵۸۲m0 = false;
        this.f۱۱۵۸۴n0 = false;
        this.f۱۱۵۸۶o0 = new Cm();
        this.f۱۱۵۸۸p0 = false;
        this.f۱۱۵۹۴s0 = new int[2];
        this.f۱۱۵۹۸u0 = new int[2];
        this.f۱۱۶۰۰v0 = new int[2];
        this.f۱۱۶۰۲w0 = new int[2];
        this.f۱۱۶۰۴x0 = new int[2];
        this.f۱۱۶۰۶y0 = new ArrayList();
        this.f۱۱۶۰۸z0 = new RunnableCb();
        this.f۱۱۵۳۶A0 = new Cd();
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, f۱۱۵۲۶C0, defStyle, 0);
            this.f۱۱۵۷۳i = a.getBoolean(0, true);
            a.recycle();
        } else {
            this.f۱۱۵۷۳i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration vc = ViewConfiguration.get(context);
        this.f۱۱۵۵۸W = vc.getScaledTouchSlop();
        this.f۱۱۵۶۴d0 = android.support.p۰۴۳v4.view.Cv.m۱۳۰۴۰b(vc, context);
        this.f۱۱۵۶۶e0 = android.support.p۰۴۳v4.view.Cv.m۱۳۰۴۱c(vc, context);
        this.f۱۱۵۶۰b0 = vc.getScaledMinimumFlingVelocity();
        this.f۱۱۵۶۲c0 = vc.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f۱۱۵۵۰O.m۱۴۴۶۵a(this.f۱۱۵۸۶o0);
        m۱۴۳۳۹k();
        m۱۴۲۳۸G();
        m۱۴۲۳۷F();
        if (android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۲i(this) == 0) {
            android.support.p۰۴۳v4.view.Cu.m۱۳۰۰۷f(this, 1);
        }
        this.f۱۱۵۳۹D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Cv0(this));
        boolean nestedScrollingEnabled = true;
        if (attrs != null) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, Cb.RecyclerView, defStyle, 0);
            String layoutManagerName = a2.getString(Cb.RecyclerView_layoutManager);
            if (a2.getInt(Cb.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f۱۱۵۹۹v = a2.getBoolean(Cb.RecyclerView_fastScrollEnabled, false);
            if (this.f۱۱۵۹۹v) {
                m۱۴۲۸۱a((StateListDrawable) a2.getDrawable(Cb.RecyclerView_fastScrollVerticalThumbDrawable), a2.getDrawable(Cb.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) a2.getDrawable(Cb.RecyclerView_fastScrollHorizontalThumbDrawable), a2.getDrawable(Cb.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            a2.recycle();
            m۱۴۲۵۰a(context, layoutManagerName, attrs, defStyle, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray a3 = context.obtainStyledAttributes(attrs, f۱۱۵۲۵B0, defStyle, 0);
                boolean nestedScrollingEnabled2 = a3.getBoolean(0, true);
                a3.recycle();
                nestedScrollingEnabled = nestedScrollingEnabled2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(nestedScrollingEnabled);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public String m۱۴۳۳۴i() {
        return " " + super.toString() + ", adapter:" + this.f۱۱۵۸۳n + ", layout:" + this.f۱۱۵۸۵o + ", context:" + getContext();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: F  reason: contains not printable characters */
    private void m۱۴۲۳۷F() {
        if (android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۳j(this) == 0) {
            android.support.p۰۴۳v4.view.Cu.m۱۳۰۰۹g(this, 8);
        }
    }

    public Cv0 getCompatAccessibilityDelegate() {
        return this.f۱۱۵۹۰q0;
    }

    public void setAccessibilityDelegateCompat(Cv0 accessibilityDelegate) {
        this.f۱۱۵۹۰q0 = accessibilityDelegate;
        android.support.p۰۴۳v4.view.Cu.m۱۲۹۸۵a(this, this.f۱۱۵۹۰q0);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۵۰a(Context context, String className, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        ClassLoader classLoader;
        Constructor<? extends LayoutManager> constructor;
        if (className != null) {
            String className2 = className.trim();
            if (!className2.isEmpty()) {
                String className3 = m۱۴۲۴۷a(context, className2);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends LayoutManager> layoutManagerClass = classLoader.loadClass(className3).asSubclass(AbstractCo.class);
                    Object[] constructorArgs = null;
                    try {
                        Constructor<? extends LayoutManager> constructor2 = layoutManagerClass.getConstructor(f۱۱۵۳۳J0);
                        constructorArgs = new Object[]{context, attrs, Integer.valueOf(defStyleAttr), Integer.valueOf(defStyleRes)};
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = layoutManagerClass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e1) {
                            e1.initCause(e);
                            throw new IllegalStateException(attrs.getPositionDescription() + ": Error creating LayoutManager " + className3, e1);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractCo) constructor.newInstance(constructorArgs));
                } catch (ClassNotFoundException e2) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Unable to find LayoutManager " + className3, e2);
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e3);
                } catch (InstantiationException e4) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Cannot access non-public constructor " + className3, e5);
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Class is not a LayoutManager " + className3, e6);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private String m۱۴۲۴۷a(Context context, String className) {
        if (className.charAt(0) == '.') {
            return context.getPackageName() + className;
        } else if (className.contains(".")) {
            return className;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + className;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.RecyclerView$e  reason: invalid class name */
    public class Ce implements Cd0.AbstractCb {
        Ce() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۴۱۶b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۱۴a(View child, int index) {
            RecyclerView.this.addView(child, index);
            RecyclerView.this.m۱۴۲۸۹a(child);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۴۴۲۱d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۱۸b(int index) {
            View child = RecyclerView.this.getChildAt(index);
            if (child != null) {
                RecyclerView.this.m۱۴۳۰۶b(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeViewAt(index);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۴۴۱۱a(int offset) {
            return RecyclerView.this.getChildAt(offset);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۱۲a() {
            int count = m۱۴۴۱۶b();
            for (int i = 0; i < count; i++) {
                View child = m۱۴۴۱۱a(i);
                RecyclerView.this.m۱۴۳۰۶b(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public AbstractCd0 m۱۴۴۱۷b(View view) {
            return RecyclerView.m۱۴۲۶۷k(view);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۱۵a(View child, int index, ViewGroup.LayoutParams layoutParams) {
            AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(child);
            if (vh != null) {
                if (vh.m۱۴۴۰۲r() || vh.m۱۴۴۰۸x()) {
                    vh.m۱۴۳۸۸d();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + vh + RecyclerView.this.m۱۴۳۳۴i());
                }
            }
            RecyclerView.this.attachViewToParent(child, index, layoutParams);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۴۱۹c(int offset) {
            AbstractCd0 vh;
            View view = m۱۴۴۱۱a(offset);
            if (!(view == null || (vh = RecyclerView.m۱۴۲۶۷k(view)) == null)) {
                if (!vh.m۱۴۴۰۲r() || vh.m۱۴۴۰۸x()) {
                    vh.m۱۴۳۷۶a(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + vh + RecyclerView.this.m۱۴۳۳۴i());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) offset);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۱۳a(View child) {
            AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(child);
            if (vh != null) {
                vh.m۱۴۳۸۱a(RecyclerView.this);
            }
        }

        @Override // android.support.p۰۴۷v7.widget.Cd0.AbstractCb
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۴۲۰c(View child) {
            AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(child);
            if (vh != null) {
                vh.m۱۴۳۸۵b(RecyclerView.this);
            }
        }
    }

    /* renamed from: G  reason: contains not printable characters */
    private void m۱۴۲۳۸G() {
        this.f۱۱۵۶۹g = new Cd0(new Ce());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.RecyclerView$f  reason: invalid class name */
    public class Cf implements Cd.AbstractCa {
        Cf() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCd0 m۱۴۴۲۲a(int position) {
            AbstractCd0 vh = RecyclerView.this.m۱۴۲۷۲a(position, true);
            if (vh != null && !RecyclerView.this.f۱۱۵۶۹g.m۱۵۱۳۳c(vh.f۱۱۶۳۷c)) {
                return vh;
            }
            return null;
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۲۶b(int start, int count) {
            RecyclerView.this.m۱۴۲۷۹a(start, count, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f۱۱۵۸۲m0 = true;
            recyclerView.f۱۱۵۷۶j0.f۱۱۶۱۳d += count;
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۴۲۸c(int positionStart, int itemCount) {
            RecyclerView.this.m۱۴۲۷۹a(positionStart, itemCount, false);
            RecyclerView.this.f۱۱۵۸۲m0 = true;
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۲۴a(int positionStart, int itemCount, Object payload) {
            RecyclerView.this.m۱۴۲۷۸a(positionStart, itemCount, payload);
            RecyclerView.this.f۱۱۵۸۴n0 = true;
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۲۵a(Cd.Cb op) {
            m۱۴۴۲۹c(op);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۴۲۹c(Cd.Cb op) {
            int i = op.f۱۱۹۷۲a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f۱۱۵۸۵o.m۱۴۵۲۷a(recyclerView, op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f۱۱۵۸۵o.m۱۴۵۶۳b(recyclerView2, op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f۱۱۵۸۵o.m۱۴۵۲۹a(recyclerView3, op.f۱۱۹۷۳b, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f۱۱۵۸۵o.m۱۴۵۲۸a(recyclerView4, op.f۱۱۹۷۳b, op.f۱۱۹۷۵d, 1);
            }
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۲۷b(Cd.Cb op) {
            m۱۴۴۲۹c(op);
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۴۳۰d(int positionStart, int itemCount) {
            RecyclerView.this.m۱۴۳۲۵f(positionStart, itemCount);
            RecyclerView.this.f۱۱۵۸۲m0 = true;
        }

        @Override // android.support.p۰۴۷v7.widget.Cd.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۲۳a(int from, int to) {
            RecyclerView.this.m۱۴۳۲۸g(from, to);
            RecyclerView.this.f۱۱۵۸۲m0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public void m۱۴۳۳۹k() {
        this.f۱۱۵۶۷f = new Cd(new Cf());
    }

    public void setHasFixedSize(boolean hasFixedSize) {
        this.f۱۱۵۹۷u = hasFixedSize;
    }

    public void setClipToPadding(boolean clipToPadding) {
        if (clipToPadding != this.f۱۱۵۷۳i) {
            m۱۴۳۴۰l();
        }
        this.f۱۱۵۷۳i = clipToPadding;
        super.setClipToPadding(clipToPadding);
        if (this.f۱۱۶۰۱w) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.f۱۱۵۷۳i;
    }

    public void setScrollingTouchSlop(int slopConstant) {
        ViewConfiguration vc = ViewConfiguration.get(getContext());
        if (slopConstant != 0) {
            if (slopConstant != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + slopConstant + "; using default value");
            } else {
                this.f۱۱۵۵۸W = vc.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f۱۱۵۵۸W = vc.getScaledTouchSlop();
    }

    public void setAdapter(AbstractCg adapter) {
        setLayoutFrozen(false);
        m۱۴۲۵۲a(adapter, false, true);
        m۱۴۳۰۷b(false);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t  reason: contains not printable characters */
    public void m۱۴۳۴۸t() {
        AbstractCl lVar = this.f۱۱۵۵۰O;
        if (lVar != null) {
            lVar.m۱۴۴۷۰b();
        }
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۶۱b(this.f۱۱۵۶۳d);
            this.f۱۱۵۸۵o.m۱۴۵۷۶c(this.f۱۱۵۶۳d);
        }
        this.f۱۱۵۶۳d.m۱۴۶۷۴a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۵۲a(AbstractCg adapter, boolean compatibleWithPrevious, boolean removeAndRecycleViews) {
        AbstractCg gVar = this.f۱۱۵۸۳n;
        if (gVar != null) {
            gVar.m۱۴۴۴۴b(this.f۱۱۵۶۱c);
            this.f۱۱۵۸۳n.m۱۴۴۴۵b(this);
        }
        if (!compatibleWithPrevious || removeAndRecycleViews) {
            m۱۴۳۴۸t();
        }
        this.f۱۱۵۶۷f.m۱۵۱۰۹f();
        AbstractCg oldAdapter = this.f۱۱۵۸۳n;
        this.f۱۱۵۸۳n = adapter;
        if (adapter != null) {
            adapter.m۱۴۴۳۶a(this.f۱۱۵۶۱c);
            adapter.m۱۴۴۳۷a(this);
        }
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۲۰a(oldAdapter, this.f۱۱۵۸۳n);
        }
        this.f۱۱۵۶۳d.m۱۴۶۸۰a(oldAdapter, this.f۱۱۵۸۳n, compatibleWithPrevious);
        this.f۱۱۵۷۶j0.f۱۱۶۱۶g = true;
    }

    public AbstractCg getAdapter() {
        return this.f۱۱۵۸۳n;
    }

    public void setRecyclerListener(AbstractCw listener) {
        this.f۱۱۵۸۷p = listener;
    }

    public int getBaseline() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            return oVar.m۱۴۵۸۰d();
        }
        return super.getBaseline();
    }

    public void setLayoutManager(AbstractCo layout) {
        if (layout != this.f۱۱۵۸۵o) {
            m۱۴۳۵۲x();
            if (this.f۱۱۵۸۵o != null) {
                AbstractCl lVar = this.f۱۱۵۵۰O;
                if (lVar != null) {
                    lVar.m۱۴۴۷۰b();
                }
                this.f۱۱۵۸۵o.m۱۴۵۶۱b(this.f۱۱۵۶۳d);
                this.f۱۱۵۸۵o.m۱۴۵۷۶c(this.f۱۱۵۶۳d);
                this.f۱۱۵۶۳d.m۱۴۶۷۴a();
                if (this.f۱۱۵۹۵t) {
                    this.f۱۱۵۸۵o.m۱۴۵۳۰a(this, this.f۱۱۵۶۳d);
                }
                this.f۱۱۵۸۵o.m۱۴۵۹۷f((RecyclerView) null);
                this.f۱۱۵۸۵o = null;
            } else {
                this.f۱۱۵۶۳d.m۱۴۶۷۴a();
            }
            this.f۱۱۵۶۹g.m۱۵۱۳۲c();
            this.f۱۱۵۸۵o = layout;
            if (layout != null) {
                if (layout.f۱۱۶۶۹b == null) {
                    this.f۱۱۵۸۵o.m۱۴۵۹۷f(this);
                    if (this.f۱۱۵۹۵t) {
                        this.f۱۱۵۸۵o.m۱۴۵۲۶a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layout + " is already attached to a RecyclerView:" + layout.f۱۱۶۶۹b.m۱۴۳۳۴i());
                }
            }
            this.f۱۱۵۶۳d.m۱۴۷۰۴j();
            requestLayout();
        }
    }

    public void setOnFlingListener(AbstractCr onFlingListener) {
        this.f۱۱۵۵۹a0 = onFlingListener;
    }

    public AbstractCr getOnFlingListener() {
        return this.f۱۱۵۵۹a0;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Cy state = new Cy(super.onSaveInstanceState());
        Cy yVar = this.f۱۱۵۶۵e;
        if (yVar != null) {
            state.m۱۴۷۰۹a(yVar);
        } else {
            AbstractCo oVar = this.f۱۱۵۸۵o;
            if (oVar != null) {
                state.f۱۱۷۱۲e = oVar.m۱۴۶۲۸x();
            } else {
                state.f۱۱۷۱۲e = null;
            }
        }
        return state;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable parcelable;
        if (!(state instanceof Cy)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.f۱۱۵۶۵e = (Cy) state;
        super.onRestoreInstanceState(this.f۱۱۵۶۵e.m۱۲۷۹۱a());
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && (parcelable = this.f۱۱۵۶۵e.f۱۱۷۱۲e) != null) {
            oVar.m۱۴۵۱۸a(parcelable);
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

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۴۲۶۴d(AbstractCd0 viewHolder) {
        View view = viewHolder.f۱۱۶۳۷c;
        boolean alreadyParented = view.getParent() == this;
        this.f۱۱۵۶۳d.m۱۴۶۹۲c(m۱۴۳۱۸e(view));
        if (viewHolder.m۱۴۴۰۲r()) {
            this.f۱۱۵۶۹g.m۱۵۱۲۵a(view, -1, view.getLayoutParams(), true);
        } else if (!alreadyParented) {
            this.f۱۱۵۶۹g.m۱۵۱۲۷a(view, true);
        } else {
            this.f۱۱۵۶۹g.m۱۵۱۲۴a(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۴۳۳۶i(View view) {
        m۱۴۳۵۱w();
        boolean removed = this.f۱۱۵۶۹g.m۱۵۱۳۷e(view);
        if (removed) {
            AbstractCd0 viewHolder = m۱۴۲۶۷k(view);
            this.f۱۱۵۶۳d.m۱۴۶۹۲c(viewHolder);
            this.f۱۱۵۶۳d.m۱۴۶۸۷b(viewHolder);
        }
        m۱۴۳۱۳c(!removed);
        return removed;
    }

    public AbstractCo getLayoutManager() {
        return this.f۱۱۵۸۵o;
    }

    public Cu getRecycledViewPool() {
        return this.f۱۱۵۶۳d.m۱۴۶۹۴d();
    }

    public void setRecycledViewPool(Cu pool) {
        this.f۱۱۵۶۳d.m۱۴۶۸۱a(pool);
    }

    public void setViewCacheExtension(AbstractCb0 extension) {
        this.f۱۱۵۶۳d.m۱۴۶۷۷a(extension);
    }

    public void setItemViewCacheSize(int size) {
        this.f۱۱۵۶۳d.m۱۴۷۰۰f(size);
    }

    public int getScrollState() {
        return this.f۱۱۵۵۱P;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int state) {
        if (state != this.f۱۱۵۵۱P) {
            this.f۱۱۵۵۱P = state;
            if (state != 2) {
                m۱۴۲۴۶O();
            }
            m۱۴۳۰۰b(state);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۶a(AbstractCn decor, int index) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۴۱a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f۱۱۵۸۹q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (index < 0) {
            this.f۱۱۵۸۹q.add(decor);
        } else {
            this.f۱۱۵۸۹q.add(index, decor);
        }
        m۱۴۳۴۳o();
        requestLayout();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۵a(AbstractCn decor) {
        m۱۴۲۸۶a(decor, -1);
    }

    public int getItemDecorationCount() {
        return this.f۱۱۵۸۹q.size();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۳b(AbstractCn decor) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۴۱a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f۱۱۵۸۹q.remove(decor);
        if (this.f۱۱۵۸۹q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m۱۴۳۴۳o();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AbstractCj childDrawingOrderCallback) {
        if (childDrawingOrderCallback != this.f۱۱۵۹۲r0) {
            this.f۱۱۵۹۲r0 = childDrawingOrderCallback;
            setChildrenDrawingOrderEnabled(this.f۱۱۵۹۲r0 != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(AbstractCt listener) {
        this.f۱۱۵۷۸k0 = listener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۸a(AbstractCt listener) {
        if (this.f۱۱۵۸۰l0 == null) {
            this.f۱۱۵۸۰l0 = new ArrayList();
        }
        this.f۱۱۵۸۰l0.add(listener);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۵b(AbstractCt listener) {
        List<AbstractCt> list = this.f۱۱۵۸۰l0;
        if (list != null) {
            list.remove(listener);
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۳۳۱h(int position) {
        if (!this.f۱۱۶۰۷z) {
            m۱۴۳۵۲x();
            AbstractCo oVar = this.f۱۱۵۸۵o;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.m۱۴۶۰۵h(position);
            awakenScrollBars();
        }
    }

    public void scrollTo(int x, int y) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int x, int y) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f۱۱۶۰۷z) {
            boolean canScrollHorizontal = oVar.m۱۴۵۴۲a();
            boolean canScrollVertical = this.f۱۱۵۸۵o.m۱۴۵۶۸b();
            if (canScrollHorizontal || canScrollVertical) {
                int i = 0;
                int i2 = canScrollHorizontal ? x : 0;
                if (canScrollVertical) {
                    i = y;
                }
                m۱۴۲۹۳a(i2, i, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۰a(int dx, int dy, int[] consumed) {
        m۱۴۳۵۱w();
        m۱۴۳۴۵q();
        Ca.m۱۰۴۹۷a("RV Scroll");
        m۱۴۲۸۲a(this.f۱۱۵۷۶j0);
        int consumedX = 0;
        int consumedY = 0;
        if (dx != 0) {
            consumedX = this.f۱۱۵۸۵o.m۱۴۵۰۶a(dx, this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0);
        }
        if (dy != 0) {
            consumedY = this.f۱۱۵۸۵o.m۱۴۵۵۶b(dy, this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0);
        }
        Ca.m۱۰۴۹۶a();
        m۱۴۳۴۹u();
        m۱۴۳۴۶r();
        m۱۴۳۱۳c(false);
        if (consumed != null) {
            consumed[0] = consumedX;
            consumed[1] = consumedY;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۲۹۹b() {
        if (!this.f۱۱۶۰۱w || this.f۱۱۵۴۱F) {
            Ca.m۱۰۴۹۷a("RV FullInvalidate");
            m۱۴۳۱۱c();
            Ca.m۱۰۴۹۶a();
        } else if (this.f۱۱۵۶۷f.m۱۵۱۰۵c()) {
            if (this.f۱۱۵۶۷f.m۱۵۱۰۶c(4) && !this.f۱۱۵۶۷f.m۱۵۱۰۶c(11)) {
                Ca.m۱۰۴۹۷a("RV PartialInvalidate");
                m۱۴۳۵۱w();
                m۱۴۳۴۵q();
                this.f۱۱۵۶۷f.m۱۵۱۰۸e();
                if (!this.f۱۱۶۰۵y) {
                    if (m۱۴۲۳۶E()) {
                        m۱۴۳۱۱c();
                    } else {
                        this.f۱۱۵۶۷f.m۱۵۰۹۸a();
                    }
                }
                m۱۴۳۱۳c(true);
                m۱۴۳۴۶r();
                Ca.m۱۰۴۹۶a();
            } else if (this.f۱۱۵۶۷f.m۱۵۱۰۵c()) {
                Ca.m۱۰۴۹۷a("RV FullInvalidate");
                m۱۴۳۱۱c();
                Ca.m۱۰۴۹۶a();
            }
        }
    }

    /* renamed from: E  reason: contains not printable characters */
    private boolean m۱۴۲۳۶E() {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۱c(i));
            if (!(holder == null || holder.m۱۴۴۰۸x() || !holder.m۱۴۴۰۳s())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r3 != 0) goto L_0x00a4;
     */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۴۲۹۳a(int r19, int r20, android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.RecyclerView.m۱۴۲۹۳a(int, int, android.view.MotionEvent):boolean");
    }

    public int computeHorizontalScrollOffset() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && oVar.m۱۴۵۴۲a()) {
            return this.f۱۱۵۸۵o.m۱۴۵۵۷b(this.f۱۱۵۷۶j0);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && oVar.m۱۴۵۴۲a()) {
            return this.f۱۱۵۸۵o.m۱۴۵۰۷a(this.f۱۱۵۷۶j0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && oVar.m۱۴۵۴۲a()) {
            return this.f۱۱۵۸۵o.m۱۴۵۷۰c(this.f۱۱۵۷۶j0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && oVar.m۱۴۵۶۸b()) {
            return this.f۱۱۵۸۵o.m۱۴۵۸۹e(this.f۱۱۵۷۶j0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && oVar.m۱۴۵۶۸b()) {
            return this.f۱۱۵۸۵o.m۱۴۵۸۱d(this.f۱۱۵۷۶j0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null && oVar.m۱۴۵۶۸b()) {
            return this.f۱۱۵۸۵o.m۱۴۵۹۴f(this.f۱۱۵۷۶j0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w  reason: contains not printable characters */
    public void m۱۴۳۵۱w() {
        this.f۱۱۶۰۳x++;
        if (this.f۱۱۶۰۳x == 1 && !this.f۱۱۶۰۷z) {
            this.f۱۱۶۰۵y = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۳۱۳c(boolean performLayoutChildren) {
        if (this.f۱۱۶۰۳x < 1) {
            this.f۱۱۶۰۳x = 1;
        }
        if (!performLayoutChildren && !this.f۱۱۶۰۷z) {
            this.f۱۱۶۰۵y = false;
        }
        if (this.f۱۱۶۰۳x == 1) {
            if (performLayoutChildren && this.f۱۱۶۰۵y && !this.f۱۱۶۰۷z && this.f۱۱۵۸۵o != null && this.f۱۱۵۸۳n != null) {
                m۱۴۳۱۱c();
            }
            if (!this.f۱۱۶۰۷z) {
                this.f۱۱۶۰۵y = false;
            }
        }
        this.f۱۱۶۰۳x--;
    }

    public void setLayoutFrozen(boolean frozen) {
        if (frozen != this.f۱۱۶۰۷z) {
            m۱۴۲۹۰a("Do not setLayoutFrozen in layout or scroll");
            if (!frozen) {
                this.f۱۱۶۰۷z = false;
                if (!(!this.f۱۱۶۰۵y || this.f۱۱۵۸۵o == null || this.f۱۱۵۸۳n == null)) {
                    requestLayout();
                }
                this.f۱۱۶۰۵y = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            this.f۱۱۶۰۷z = true;
            this.f۱۱۵۳۵A = true;
            m۱۴۳۵۲x();
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۴۳۳۵i(int dx, int dy) {
        m۱۴۲۷۷a(dx, dy, (Interpolator) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۷۷a(int dx, int dy, Interpolator interpolator) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f۱۱۶۰۷z) {
            if (!oVar.m۱۴۵۴۲a()) {
                dx = 0;
            }
            if (!this.f۱۱۵۸۵o.m۱۴۵۶۸b()) {
                dy = 0;
            }
            if (dx != 0 || dy != 0) {
                this.f۱۱۵۷۰g0.m۱۴۳۶۸a(dx, dy, interpolator);
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۴۳۲۱e(int velocityX, int velocityY) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f۱۱۶۰۷z) {
            return false;
        } else {
            boolean canScrollHorizontal = oVar.m۱۴۵۴۲a();
            boolean canScrollVertical = this.f۱۱۵۸۵o.m۱۴۵۶۸b();
            if (!canScrollHorizontal || Math.abs(velocityX) < this.f۱۱۵۶۰b0) {
                velocityX = 0;
            }
            if (!canScrollVertical || Math.abs(velocityY) < this.f۱۱۵۶۰b0) {
                velocityY = 0;
            }
            if (!(velocityX == 0 && velocityY == 0) && !dispatchNestedPreFling((float) velocityX, (float) velocityY)) {
                boolean canScroll = canScrollHorizontal || canScrollVertical;
                dispatchNestedFling((float) velocityX, (float) velocityY, canScroll);
                AbstractCr rVar = this.f۱۱۵۵۹a0;
                if (rVar != null && rVar.m۱۴۶۴۸a(velocityX, velocityY)) {
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
                    m۱۴۳۳۸j(nestedScrollAxis, 1);
                    int i = this.f۱۱۵۶۲c0;
                    int velocityX2 = Math.max(-i, Math.min(velocityX, i));
                    int i2 = this.f۱۱۵۶۲c0;
                    this.f۱۱۵۷۰g0.m۱۴۳۶۶a(velocityX2, Math.max(-i2, Math.min(velocityY, i2)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: x  reason: contains not printable characters */
    public void m۱۴۳۵۲x() {
        setScrollState(0);
        m۱۴۲۴۶O();
    }

    /* renamed from: O  reason: contains not printable characters */
    private void m۱۴۲۴۶O() {
        this.f۱۱۵۷۰g0.m۱۴۳۶۹b();
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۰۴B();
        }
    }

    public int getMinFlingVelocity() {
        return this.f۱۱۵۶۰b0;
    }

    public int getMaxFlingVelocity() {
        return this.f۱۱۵۶۲c0;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۴۸a(float x, float overscrollX, float y, float overscrollY) {
        boolean invalidate = false;
        if (overscrollX < 0.0f) {
            m۱۴۳۲۳f();
            Cg.m۱۳۲۴۹a(this.f۱۱۵۴۶K, (-overscrollX) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())));
            invalidate = true;
        } else if (overscrollX > 0.0f) {
            m۱۴۳۲۶g();
            Cg.m۱۳۲۴۹a(this.f۱۱۵۴۸M, overscrollX / ((float) getWidth()), y / ((float) getHeight()));
            invalidate = true;
        }
        if (overscrollY < 0.0f) {
            m۱۴۳۳۰h();
            Cg.m۱۳۲۴۹a(this.f۱۱۵۴۷L, (-overscrollY) / ((float) getHeight()), x / ((float) getWidth()));
            invalidate = true;
        } else if (overscrollY > 0.0f) {
            m۱۴۳۱۹e();
            Cg.m۱۳۲۴۹a(this.f۱۱۵۴۹N, overscrollY / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
            invalidate = true;
        }
        if (invalidate || overscrollX != 0.0f || overscrollY != 0.0f) {
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۷۰B(this);
        }
    }

    /* renamed from: K  reason: contains not printable characters */
    private void m۱۴۲۴۲K() {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.f۱۱۵۴۶K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            needsInvalidate = this.f۱۱۵۴۶K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f۱۱۵۴۷L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            needsInvalidate |= this.f۱۱۵۴۷L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f۱۱۵۴۸M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            needsInvalidate |= this.f۱۱۵۴۸M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f۱۱۵۴۹N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            needsInvalidate |= this.f۱۱۵۴۹N.isFinished();
        }
        if (needsInvalidate) {
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۷۰B(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۱b(int dx, int dy) {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.f۱۱۵۴۶K;
        if (edgeEffect != null && !edgeEffect.isFinished() && dx > 0) {
            this.f۱۱۵۴۶K.onRelease();
            needsInvalidate = this.f۱۱۵۴۶K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f۱۱۵۴۸M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && dx < 0) {
            this.f۱۱۵۴۸M.onRelease();
            needsInvalidate |= this.f۱۱۵۴۸M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f۱۱۵۴۷L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && dy > 0) {
            this.f۱۱۵۴۷L.onRelease();
            needsInvalidate |= this.f۱۱۵۴۷L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f۱۱۵۴۹N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && dy < 0) {
            this.f۱۱۵۴۹N.onRelease();
            needsInvalidate |= this.f۱۱۵۴۹N.isFinished();
        }
        if (needsInvalidate) {
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۷۰B(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۷۶a(int velocityX, int velocityY) {
        if (velocityX < 0) {
            m۱۴۳۲۳f();
            this.f۱۱۵۴۶K.onAbsorb(-velocityX);
        } else if (velocityX > 0) {
            m۱۴۳۲۶g();
            this.f۱۱۵۴۸M.onAbsorb(velocityX);
        }
        if (velocityY < 0) {
            m۱۴۳۳۰h();
            this.f۱۱۵۴۷L.onAbsorb(-velocityY);
        } else if (velocityY > 0) {
            m۱۴۳۱۹e();
            this.f۱۱۵۴۹N.onAbsorb(velocityY);
        }
        if (velocityX != 0 || velocityY != 0) {
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۷۰B(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۴۳۲۳f() {
        if (this.f۱۱۵۴۶K == null) {
            this.f۱۱۵۴۶K = this.f۱۱۵۴۵J.m۱۴۴۶۰a(this, 0);
            if (this.f۱۱۵۷۳i) {
                this.f۱۱۵۴۶K.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f۱۱۵۴۶K.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۳۲۶g() {
        if (this.f۱۱۵۴۸M == null) {
            this.f۱۱۵۴۸M = this.f۱۱۵۴۵J.m۱۴۴۶۰a(this, 2);
            if (this.f۱۱۵۷۳i) {
                this.f۱۱۵۴۸M.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f۱۱۵۴۸M.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۳۳۰h() {
        if (this.f۱۱۵۴۷L == null) {
            this.f۱۱۵۴۷L = this.f۱۱۵۴۵J.m۱۴۴۶۰a(this, 1);
            if (this.f۱۱۵۷۳i) {
                this.f۱۱۵۴۷L.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f۱۱۵۴۷L.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۳۱۹e() {
        if (this.f۱۱۵۴۹N == null) {
            this.f۱۱۵۴۹N = this.f۱۱۵۴۵J.m۱۴۴۶۰a(this, 3);
            if (this.f۱۱۵۷۳i) {
                this.f۱۱۵۴۹N.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f۱۱۵۴۹N.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public void m۱۴۳۴۰l() {
        this.f۱۱۵۴۹N = null;
        this.f۱۱۵۴۷L = null;
        this.f۱۱۵۴۸M = null;
        this.f۱۱۵۴۶K = null;
    }

    public void setEdgeEffectFactory(Ck edgeEffectFactory) {
        p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cm.m۱۰۶۴۲a(edgeEffectFactory);
        this.f۱۱۵۴۵J = edgeEffectFactory;
        m۱۴۳۴۰l();
    }

    public Ck getEdgeEffectFactory() {
        return this.f۱۱۵۴۵J;
    }

    public View focusSearch(View focused, int direction) {
        View result;
        View result2 = this.f۱۱۵۸۵o.m۱۴۵۸۳d(focused, direction);
        if (result2 != null) {
            return result2;
        }
        boolean z = true;
        boolean canRunFocusFailure = this.f۱۱۵۸۳n != null && this.f۱۱۵۸۵o != null && !m۱۴۳۴۲n() && !this.f۱۱۶۰۷z;
        FocusFinder ff = FocusFinder.getInstance();
        if (!canRunFocusFailure || !(direction == 2 || direction == 1)) {
            result = ff.findNextFocus(this, focused, direction);
            if (result == null && canRunFocusFailure) {
                m۱۴۲۹۹b();
                if (m۱۴۳۱۰c(focused) == null) {
                    return null;
                }
                m۱۴۳۵۱w();
                result = this.f۱۱۵۸۵o.m۱۴۵۱۱a(focused, direction, this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0);
                m۱۴۳۱۳c(false);
            }
        } else {
            boolean needsFocusFailureLayout = false;
            if (this.f۱۱۵۸۵o.m۱۴۵۶۸b()) {
                int absDir = direction == 2 ? 130 : 33;
                needsFocusFailureLayout = ff.findNextFocus(this, focused, absDir) == null;
                if (f۱۱۵۳۱H0) {
                    direction = absDir;
                }
            }
            if (!needsFocusFailureLayout && this.f۱۱۵۸۵o.m۱۴۵۴۲a()) {
                int absDir2 = (direction == 2) ^ (this.f۱۱۵۸۵o.m۱۴۶۰۸j() == 1) ? 66 : 17;
                if (ff.findNextFocus(this, focused, absDir2) != null) {
                    z = false;
                }
                needsFocusFailureLayout = z;
                if (f۱۱۵۳۱H0) {
                    direction = absDir2;
                }
            }
            if (needsFocusFailureLayout) {
                m۱۴۲۹۹b();
                if (m۱۴۳۱۰c(focused) == null) {
                    return null;
                }
                m۱۴۳۵۱w();
                this.f۱۱۵۸۵o.m۱۴۵۱۱a(focused, direction, this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0);
                m۱۴۳۱۳c(false);
            }
            result = ff.findNextFocus(this, focused, direction);
        }
        if (result == null || result.hasFocusable()) {
            return m۱۴۲۶۱a(focused, result, direction) ? result : super.focusSearch(focused, direction);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(focused, direction);
        }
        m۱۴۲۵۷a(result, (View) null);
        return focused;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۲۶۱a(View focused, View next, int direction) {
        if (next == null || next == this || m۱۴۳۱۰c(next) == null) {
            return false;
        }
        if (focused == null || m۱۴۳۱۰c(focused) == null) {
            return true;
        }
        this.f۱۱۵۷۷k.set(0, 0, focused.getWidth(), focused.getHeight());
        this.f۱۱۵۷۹l.set(0, 0, next.getWidth(), next.getHeight());
        offsetDescendantRectToMyCoords(focused, this.f۱۱۵۷۷k);
        offsetDescendantRectToMyCoords(next, this.f۱۱۵۷۹l);
        int rtl = this.f۱۱۵۸۵o.m۱۴۶۰۸j() == 1 ? -1 : 1;
        int rightness = 0;
        Rect rect = this.f۱۱۵۷۷k;
        int i = rect.left;
        int i2 = this.f۱۱۵۷۹l.left;
        if ((i < i2 || rect.right <= i2) && this.f۱۱۵۷۷k.right < this.f۱۱۵۷۹l.right) {
            rightness = 1;
        } else {
            Rect rect2 = this.f۱۱۵۷۷k;
            int i3 = rect2.right;
            int i4 = this.f۱۱۵۷۹l.right;
            if ((i3 > i4 || rect2.left >= i4) && this.f۱۱۵۷۷k.left > this.f۱۱۵۷۹l.left) {
                rightness = -1;
            }
        }
        int downness = 0;
        Rect rect3 = this.f۱۱۵۷۷k;
        int i5 = rect3.top;
        int i6 = this.f۱۱۵۷۹l.top;
        if ((i5 < i6 || rect3.bottom <= i6) && this.f۱۱۵۷۷k.bottom < this.f۱۱۵۷۹l.bottom) {
            downness = 1;
        } else {
            Rect rect4 = this.f۱۱۵۷۷k;
            int i7 = rect4.bottom;
            int i8 = this.f۱۱۵۷۹l.bottom;
            if ((i7 > i8 || rect4.top >= i8) && this.f۱۱۵۷۷k.top > this.f۱۱۵۷۹l.top) {
                downness = -1;
            }
        }
        if (direction != 1) {
            if (direction != 2) {
                if (direction != 17) {
                    if (direction != 33) {
                        if (direction != 66) {
                            if (direction != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + direction + m۱۴۳۳۴i());
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
        if (!this.f۱۱۵۸۵o.m۱۴۵۴۷a(this, this.f۱۱۵۷۶j0, child, focused) && focused != null) {
            m۱۴۲۵۷a(child, focused);
        }
        super.requestChildFocus(child, focused);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۵۷a(View child, View focused) {
        View rectView = focused != null ? focused : child;
        this.f۱۱۵۷۷k.set(0, 0, rectView.getWidth(), rectView.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = rectView.getLayoutParams();
        if (focusedLayoutParams instanceof Cp) {
            Cp lp = (Cp) focusedLayoutParams;
            if (!lp.f۱۱۶۹۴c) {
                Rect insets = lp.f۱۱۶۹۳b;
                Rect rect = this.f۱۱۵۷۷k;
                rect.left -= insets.left;
                rect.right += insets.right;
                rect.top -= insets.top;
                rect.bottom += insets.bottom;
            }
        }
        if (focused != null) {
            offsetDescendantRectToMyCoords(focused, this.f۱۱۵۷۷k);
            offsetRectIntoDescendantCoords(child, this.f۱۱۵۷۷k);
        }
        this.f۱۱۵۸۵o.m۱۴۵۴۹a(this, child, this.f۱۱۵۷۷k, !this.f۱۱۶۰۱w, focused == null);
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
        return this.f۱۱۵۸۵o.m۱۴۵۴۸a(this, child, rect, immediate);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null || !oVar.m۱۴۵۵۱a(this, views, direction, focusableMode)) {
            super.addFocusables(views, direction, focusableMode);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (m۱۴۳۴۲n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f۱۱۵۴۳H = 0;
        boolean z = true;
        this.f۱۱۵۹۵t = true;
        if (!this.f۱۱۶۰۱w || isLayoutRequested()) {
            z = false;
        }
        this.f۱۱۶۰۱w = z;
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۲۶a(this);
        }
        this.f۱۱۵۸۸p0 = false;
        if (f۱۱۵۳۰G0) {
            this.f۱۱۵۷۲h0 = RunnableCm0.f۱۲۱۹۳g.get();
            if (this.f۱۱۵۷۲h0 == null) {
                this.f۱۱۵۷۲h0 = new RunnableCm0();
                Display display = android.support.p۰۴۳v4.view.Cu.m۱۳۰۰۶f(this);
                float refreshRate = 60.0f;
                if (!isInEditMode() && display != null) {
                    float displayRefreshRate = display.getRefreshRate();
                    if (displayRefreshRate >= 30.0f) {
                        refreshRate = displayRefreshRate;
                    }
                }
                RunnableCm0 m0Var = this.f۱۱۵۷۲h0;
                m0Var.f۱۲۱۹۷e = (long) (1.0E9f / refreshRate);
                RunnableCm0.f۱۲۱۹۳g.set(m0Var);
            }
            this.f۱۱۵۷۲h0.m۱۵۴۲۵a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        RunnableCm0 m0Var;
        super.onDetachedFromWindow();
        AbstractCl lVar = this.f۱۱۵۵۰O;
        if (lVar != null) {
            lVar.m۱۴۴۷۰b();
        }
        m۱۴۳۵۲x();
        this.f۱۱۵۹۵t = false;
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۳۰a(this, this.f۱۱۵۶۳d);
        }
        this.f۱۱۶۰۶y0.clear();
        removeCallbacks(this.f۱۱۶۰۸z0);
        this.f۱۱۵۷۱h.m۱۵۵۳۷b();
        if (f۱۱۵۳۰G0 && (m0Var = this.f۱۱۵۷۲h0) != null) {
            m0Var.m۱۵۴۲۷b(this);
            this.f۱۱۵۷۲h0 = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f۱۱۵۹۵t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۹۰a(String message) {
        if (m۱۴۳۴۲n()) {
            if (message == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m۱۴۳۳۴i());
            }
            throw new IllegalStateException(message);
        } else if (this.f۱۱۵۴۴I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m۱۴۳۳۴i()));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۷a(AbstractCs listener) {
        this.f۱۱۵۹۱r.add(listener);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۴b(AbstractCs listener) {
        this.f۱۱۵۹۱r.remove(listener);
        if (this.f۱۱۵۹۳s == listener) {
            this.f۱۱۵۹۳s = null;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۴۲۶۲b(MotionEvent e) {
        int action = e.getAction();
        if (action == 3 || action == 0) {
            this.f۱۱۵۹۳s = null;
        }
        int listenerCount = this.f۱۱۵۹۱r.size();
        for (int i = 0; i < listenerCount; i++) {
            AbstractCs listener = this.f۱۱۵۹۱r.get(i);
            if (listener.m۱۴۶۵۱b(this, e) && action != 3) {
                this.f۱۱۵۹۳s = listener;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۲۶۰a(MotionEvent e) {
        int action = e.getAction();
        AbstractCs sVar = this.f۱۱۵۹۳s;
        if (sVar != null) {
            if (action == 0) {
                this.f۱۱۵۹۳s = null;
            } else {
                sVar.m۱۴۶۴۹a(this, e);
                if (action == 3 || action == 1) {
                    this.f۱۱۵۹۳s = null;
                }
                return true;
            }
        }
        if (action == 0) {
            return false;
        }
        int listenerCount = this.f۱۱۵۹۱r.size();
        for (int i = 0; i < listenerCount; i++) {
            AbstractCs listener = this.f۱۱۵۹۱r.get(i);
            if (listener.m۱۴۶۵۱b(this, e)) {
                this.f۱۱۵۹۳s = listener;
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent e) {
        if (this.f۱۱۶۰۷z) {
            return false;
        }
        if (m۱۴۲۶۲b(e)) {
            m۱۴۲۷۰y();
            return true;
        }
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.m۱۴۵۴۲a();
        boolean canScrollVertically = this.f۱۱۵۸۵o.m۱۴۵۶۸b();
        if (this.f۱۱۵۵۳R == null) {
            this.f۱۱۵۵۳R = VelocityTracker.obtain();
        }
        this.f۱۱۵۵۳R.addMovement(e);
        int action = e.getActionMasked();
        int actionIndex = e.getActionIndex();
        if (action == 0) {
            if (this.f۱۱۵۳۵A) {
                this.f۱۱۵۳۵A = false;
            }
            this.f۱۱۵۵۲Q = e.getPointerId(0);
            int x = (int) (e.getX() + 0.5f);
            this.f۱۱۵۵۶U = x;
            this.f۱۱۵۵۴S = x;
            int y = (int) (e.getY() + 0.5f);
            this.f۱۱۵۵۷V = y;
            this.f۱۱۵۵۵T = y;
            if (this.f۱۱۵۵۱P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f۱۱۶۰۲w0;
            iArr[1] = 0;
            iArr[0] = 0;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            m۱۴۳۳۸j(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.f۱۱۵۵۳R.clear();
            m۱۴۲۷۵a(0);
        } else if (action == 2) {
            int index = e.findPointerIndex(this.f۱۱۵۵۲Q);
            if (index < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f۱۱۵۵۲Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (e.getX(index) + 0.5f);
            int y2 = (int) (e.getY(index) + 0.5f);
            if (this.f۱۱۵۵۱P != 1) {
                int dx = x2 - this.f۱۱۵۵۴S;
                int dy = y2 - this.f۱۱۵۵۵T;
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx) > this.f۱۱۵۵۸W) {
                    this.f۱۱۵۵۶U = x2;
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy) > this.f۱۱۵۵۸W) {
                    this.f۱۱۵۵۷V = y2;
                    startScroll = true;
                }
                if (startScroll) {
                    setScrollState(1);
                }
            }
        } else if (action == 3) {
            m۱۴۲۷۰y();
        } else if (action == 5) {
            this.f۱۱۵۵۲Q = e.getPointerId(actionIndex);
            int x3 = (int) (e.getX(actionIndex) + 0.5f);
            this.f۱۱۵۵۶U = x3;
            this.f۱۱۵۵۴S = x3;
            int y3 = (int) (e.getY(actionIndex) + 0.5f);
            this.f۱۱۵۵۷V = y3;
            this.f۱۱۵۵۵T = y3;
        } else if (action == 6) {
            m۱۴۲۶۳c(e);
        }
        if (this.f۱۱۵۵۱P == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        int listenerCount = this.f۱۱۵۹۱r.size();
        for (int i = 0; i < listenerCount; i++) {
            this.f۱۱۵۹۱r.get(i).m۱۴۶۵۰a(disallowIntercept);
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onTouchEvent(MotionEvent e) {
        int dy;
        int dx;
        int i;
        int i2;
        int i3 = 0;
        if (this.f۱۱۶۰۷z || this.f۱۱۵۳۵A) {
            return false;
        }
        if (m۱۴۲۶۰a(e)) {
            m۱۴۲۷۰y();
            return true;
        }
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.m۱۴۵۴۲a();
        boolean canScrollVertically = this.f۱۱۵۸۵o.m۱۴۵۶۸b();
        if (this.f۱۱۵۵۳R == null) {
            this.f۱۱۵۵۳R = VelocityTracker.obtain();
        }
        boolean eventAddedToVelocityTracker = false;
        MotionEvent vtev = MotionEvent.obtain(e);
        int action = e.getActionMasked();
        int actionIndex = e.getActionIndex();
        if (action == 0) {
            int[] iArr = this.f۱۱۶۰۲w0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f۱۱۶۰۲w0;
        vtev.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (action == 0) {
            this.f۱۱۵۵۲Q = e.getPointerId(0);
            int x = (int) (e.getX() + 0.5f);
            this.f۱۱۵۵۶U = x;
            this.f۱۱۵۵۴S = x;
            int y = (int) (e.getY() + 0.5f);
            this.f۱۱۵۵۷V = y;
            this.f۱۱۵۵۵T = y;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            m۱۴۳۳۸j(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.f۱۱۵۵۳R.addMovement(vtev);
            eventAddedToVelocityTracker = true;
            this.f۱۱۵۵۳R.computeCurrentVelocity(1000, (float) this.f۱۱۵۶۲c0);
            float xvel = canScrollHorizontally ? -this.f۱۱۵۵۳R.getXVelocity(this.f۱۱۵۵۲Q) : 0.0f;
            float yvel = canScrollVertically ? -this.f۱۱۵۵۳R.getYVelocity(this.f۱۱۵۵۲Q) : 0.0f;
            if ((xvel == 0.0f && yvel == 0.0f) || !m۱۴۳۲۱e((int) xvel, (int) yvel)) {
                setScrollState(0);
            }
            m۱۴۲۴۴M();
        } else if (action == 2) {
            int index = e.findPointerIndex(this.f۱۱۵۵۲Q);
            if (index < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f۱۱۵۵۲Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (e.getX(index) + 0.5f);
            int y2 = (int) (e.getY(index) + 0.5f);
            int dx2 = this.f۱۱۵۵۶U - x2;
            int dy2 = this.f۱۱۵۵۷V - y2;
            if (m۱۴۲۹۴a(dx2, dy2, this.f۱۱۶۰۰v0, this.f۱۱۵۹۸u0, 0)) {
                int[] iArr3 = this.f۱۱۶۰۰v0;
                dx2 -= iArr3[0];
                dy2 -= iArr3[1];
                int[] iArr4 = this.f۱۱۵۹۸u0;
                vtev.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.f۱۱۶۰۲w0;
                int i4 = iArr5[0];
                int[] iArr6 = this.f۱۱۵۹۸u0;
                iArr5[0] = i4 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.f۱۱۵۵۱P != 1) {
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx2) > (i2 = this.f۱۱۵۵۸W)) {
                    if (dx2 > 0) {
                        dx2 -= i2;
                    } else {
                        dx2 += i2;
                    }
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy2) > (i = this.f۱۱۵۵۸W)) {
                    if (dy2 > 0) {
                        dy2 -= i;
                    } else {
                        dy2 += i;
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
            if (this.f۱۱۵۵۱P == 1) {
                int[] iArr7 = this.f۱۱۵۹۸u0;
                this.f۱۱۵۵۶U = x2 - iArr7[0];
                this.f۱۱۵۵۷V = y2 - iArr7[1];
                int i5 = canScrollHorizontally ? dx : 0;
                if (canScrollVertically) {
                    i3 = dy;
                }
                if (m۱۴۲۹۳a(i5, i3, vtev)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.f۱۱۵۷۲h0 == null || (dx == 0 && dy == 0))) {
                    this.f۱۱۵۷۲h0.m۱۵۴۲۶a(this, dx, dy);
                }
            }
        } else if (action == 3) {
            m۱۴۲۷۰y();
        } else if (action == 5) {
            this.f۱۱۵۵۲Q = e.getPointerId(actionIndex);
            int x3 = (int) (e.getX(actionIndex) + 0.5f);
            this.f۱۱۵۵۶U = x3;
            this.f۱۱۵۵۴S = x3;
            int y3 = (int) (e.getY(actionIndex) + 0.5f);
            this.f۱۱۵۵۷V = y3;
            this.f۱۱۵۵۵T = y3;
        } else if (action == 6) {
            m۱۴۲۶۳c(e);
        }
        if (!eventAddedToVelocityTracker) {
            this.f۱۱۵۵۳R.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    /* renamed from: M  reason: contains not printable characters */
    private void m۱۴۲۴۴M() {
        VelocityTracker velocityTracker = this.f۱۱۵۵۳R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m۱۴۲۷۵a(0);
        m۱۴۲۴۲K();
    }

    /* renamed from: y  reason: contains not printable characters */
    private void m۱۴۲۷۰y() {
        m۱۴۲۴۴M();
        setScrollState(0);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۴۲۶۳c(MotionEvent e) {
        int actionIndex = e.getActionIndex();
        if (e.getPointerId(actionIndex) == this.f۱۱۵۵۲Q) {
            int newIndex = actionIndex == 0 ? 1 : 0;
            this.f۱۱۵۵۲Q = e.getPointerId(newIndex);
            int x = (int) (e.getX(newIndex) + 0.5f);
            this.f۱۱۵۵۶U = x;
            this.f۱۱۵۵۴S = x;
            int y = (int) (e.getY(newIndex) + 0.5f);
            this.f۱۱۵۵۷V = y;
            this.f۱۱۵۵۵T = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        float hScroll;
        float vScroll;
        if (this.f۱۱۵۸۵o != null && !this.f۱۱۶۰۷z && event.getAction() == 8) {
            if ((event.getSource() & 2) != 0) {
                if (this.f۱۱۵۸۵o.m۱۴۵۶۸b()) {
                    vScroll = -event.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.f۱۱۵۸۵o.m۱۴۵۴۲a()) {
                    hScroll = event.getAxisValue(10);
                } else {
                    hScroll = 0.0f;
                }
            } else if ((event.getSource() & 4194304) != 0) {
                float axisScroll = event.getAxisValue(26);
                if (this.f۱۱۵۸۵o.m۱۴۵۶۸b()) {
                    vScroll = -axisScroll;
                    hScroll = 0.0f;
                } else if (this.f۱۱۵۸۵o.m۱۴۵۴۲a()) {
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
                m۱۴۲۹۳a((int) (this.f۱۱۵۶۴d0 * hScroll), (int) (this.f۱۱۵۶۶e0 * vScroll), event);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthSpec, int heightSpec) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar == null) {
            m۱۴۳۱۲c(widthSpec, heightSpec);
            return;
        }
        boolean measureSpecModeIsExactly = false;
        if (oVar.m۱۴۶۲۵u()) {
            int widthMode = View.MeasureSpec.getMode(widthSpec);
            int heightMode = View.MeasureSpec.getMode(heightSpec);
            this.f۱۱۵۸۵o.m۱۴۵۲۲a(this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0, widthSpec, heightSpec);
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                measureSpecModeIsExactly = true;
            }
            if (!measureSpecModeIsExactly && this.f۱۱۵۸۳n != null) {
                if (this.f۱۱۵۷۶j0.f۱۱۶۱۴e == 1) {
                    m۱۴۲۳۲A();
                }
                this.f۱۱۵۸۵o.m۱۴۵۶۰b(widthSpec, heightSpec);
                this.f۱۱۵۷۶j0.f۱۱۶۱۹j = true;
                m۱۴۲۳۳B();
                this.f۱۱۵۸۵o.m۱۴۵۸۵d(widthSpec, heightSpec);
                if (this.f۱۱۵۸۵o.m۱۴۵۰۳A()) {
                    this.f۱۱۵۸۵o.m۱۴۵۶۰b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f۱۱۵۷۶j0.f۱۱۶۱۹j = true;
                    m۱۴۲۳۳B();
                    this.f۱۱۵۸۵o.m۱۴۵۸۵d(widthSpec, heightSpec);
                }
            }
        } else if (this.f۱۱۵۹۷u) {
            this.f۱۱۵۸۵o.m۱۴۵۲۲a(this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0, widthSpec, heightSpec);
        } else {
            if (this.f۱۱۵۳۸C) {
                m۱۴۳۵۱w();
                m۱۴۳۴۵q();
                m۱۴۲۴۰I();
                m۱۴۳۴۶r();
                Ca0 a0Var = this.f۱۱۵۷۶j0;
                if (a0Var.f۱۱۶۲۱l) {
                    a0Var.f۱۱۶۱۷h = true;
                } else {
                    this.f۱۱۵۶۷f.m۱۵۱۰۴b();
                    this.f۱۱۵۷۶j0.f۱۱۶۱۷h = false;
                }
                this.f۱۱۵۳۸C = false;
                m۱۴۳۱۳c(false);
            } else if (this.f۱۱۵۷۶j0.f۱۱۶۲۱l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractCg gVar = this.f۱۱۵۸۳n;
            if (gVar != null) {
                this.f۱۱۵۷۶j0.f۱۱۶۱۵f = gVar.m۱۴۴۳۱a();
            } else {
                this.f۱۱۵۷۶j0.f۱۱۶۱۵f = 0;
            }
            m۱۴۳۵۱w();
            this.f۱۱۵۸۵o.m۱۴۵۲۲a(this.f۱۱۵۶۳d, this.f۱۱۵۷۶j0, widthSpec, heightSpec);
            m۱۴۳۱۳c(false);
            this.f۱۱۵۷۶j0.f۱۱۶۱۷h = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۳۱۲c(int widthSpec, int heightSpec) {
        setMeasuredDimension(AbstractCo.m۱۴۴۹۴a(widthSpec, getPaddingLeft() + getPaddingRight(), android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۶m(this)), AbstractCo.m۱۴۴۹۴a(heightSpec, getPaddingTop() + getPaddingBottom(), android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۵l(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w != oldw || h != oldh) {
            m۱۴۳۴۰l();
        }
    }

    public void setItemAnimator(AbstractCl animator) {
        AbstractCl lVar = this.f۱۱۵۵۰O;
        if (lVar != null) {
            lVar.m۱۴۴۷۰b();
            this.f۱۱۵۵۰O.m۱۴۴۶۵a((AbstractCl.AbstractCb) null);
        }
        this.f۱۱۵۵۰O = animator;
        AbstractCl lVar2 = this.f۱۱۵۵۰O;
        if (lVar2 != null) {
            lVar2.m۱۴۴۶۵a(this.f۱۱۵۸۶o0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q  reason: contains not printable characters */
    public void m۱۴۳۴۵q() {
        this.f۱۱۵۴۳H++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r  reason: contains not printable characters */
    public void m۱۴۳۴۶r() {
        m۱۴۲۹۱a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۹۱a(boolean enableChangeEvents) {
        this.f۱۱۵۴۳H--;
        if (this.f۱۱۵۴۳H < 1) {
            this.f۱۱۵۴۳H = 0;
            if (enableChangeEvents) {
                m۱۴۲۷۱z();
                m۱۴۳۱۵d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public boolean m۱۴۳۴۱m() {
        AccessibilityManager accessibilityManager = this.f۱۱۵۳۹D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: z  reason: contains not printable characters */
    private void m۱۴۲۷۱z() {
        int flags = this.f۱۱۵۳۷B;
        this.f۱۱۵۳۷B = 0;
        if (flags != 0 && m۱۴۳۴۱m()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            android.support.p۰۴۳v4.view.p۰۴۵d0.Ca.m۱۲۸۲۸a(event, flags);
            sendAccessibilityEventUnchecked(event);
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public boolean m۱۴۳۴۲n() {
        return this.f۱۱۵۴۳H > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۲۹۷a(AccessibilityEvent event) {
        if (!m۱۴۳۴۲n()) {
            return false;
        }
        int type = 0;
        if (event != null) {
            type = android.support.p۰۴۳v4.view.p۰۴۵d0.Ca.m۱۲۸۲۷a(event);
        }
        if (type == 0) {
            type = 0;
        }
        this.f۱۱۵۳۷B |= type;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        if (!m۱۴۲۹۷a(event)) {
            super.sendAccessibilityEventUnchecked(event);
        }
    }

    public AbstractCl getItemAnimator() {
        return this.f۱۱۵۵۰O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s  reason: contains not printable characters */
    public void m۱۴۳۴۷s() {
        if (!this.f۱۱۵۸۸p0 && this.f۱۱۵۹۵t) {
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۸۹a(this, this.f۱۱۶۰۸z0);
            this.f۱۱۵۸۸p0 = true;
        }
    }

    /* renamed from: H  reason: contains not printable characters */
    private boolean m۱۴۲۳۹H() {
        return this.f۱۱۵۵۰O != null && this.f۱۱۵۸۵o.m۱۴۵۰۵C();
    }

    /* renamed from: I  reason: contains not printable characters */
    private void m۱۴۲۴۰I() {
        if (this.f۱۱۵۴۱F) {
            this.f۱۱۵۶۷f.m۱۵۱۰۹f();
            if (this.f۱۱۵۴۲G) {
                this.f۱۱۵۸۵o.m۱۴۵۸۶d(this);
            }
        }
        if (m۱۴۲۳۹H()) {
            this.f۱۱۵۶۷f.m۱۵۱۰۸e();
        } else {
            this.f۱۱۵۶۷f.m۱۵۱۰۴b();
        }
        boolean z = false;
        boolean animationTypeSupported = this.f۱۱۵۸۲m0 || this.f۱۱۵۸۴n0;
        this.f۱۱۵۷۶j0.f۱۱۶۲۰k = this.f۱۱۶۰۱w && this.f۱۱۵۵۰O != null && (this.f۱۱۵۴۱F || animationTypeSupported || this.f۱۱۵۸۵o.f۱۱۶۷۵h) && (!this.f۱۱۵۴۱F || this.f۱۱۵۸۳n.m۱۴۴۴۹c());
        Ca0 a0Var = this.f۱۱۵۷۶j0;
        if (a0Var.f۱۱۶۲۰k && animationTypeSupported && !this.f۱۱۵۴۱F && m۱۴۲۳۹H()) {
            z = true;
        }
        a0Var.f۱۱۶۲۱l = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۳۱۱c() {
        if (this.f۱۱۵۸۳n == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f۱۱۵۸۵o == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            Ca0 a0Var = this.f۱۱۵۷۶j0;
            a0Var.f۱۱۶۱۹j = false;
            if (a0Var.f۱۱۶۱۴e == 1) {
                m۱۴۲۳۲A();
                this.f۱۱۵۸۵o.m۱۴۵۹۳e(this);
                m۱۴۲۳۳B();
            } else if (!this.f۱۱۵۶۷f.m۱۵۱۰۷d() && this.f۱۱۵۸۵o.m۱۴۶۲۱q() == getWidth() && this.f۱۱۵۸۵o.m۱۴۶۰۳h() == getHeight()) {
                this.f۱۱۵۸۵o.m۱۴۵۹۳e(this);
            } else {
                this.f۱۱۵۸۵o.m۱۴۵۹۳e(this);
                m۱۴۲۳۳B();
            }
            m۱۴۲۳۴C();
        }
    }

    /* renamed from: N  reason: contains not printable characters */
    private void m۱۴۲۴۵N() {
        int i;
        View child = null;
        if (this.f۱۱۵۶۸f0 && hasFocus() && this.f۱۱۵۸۳n != null) {
            child = getFocusedChild();
        }
        AbstractCd0 focusedVh = child == null ? null : m۱۴۳۱۴d(child);
        if (focusedVh == null) {
            m۱۴۲۴۳L();
            return;
        }
        this.f۱۱۵۷۶j0.f۱۱۶۲۳n = this.f۱۱۵۸۳n.m۱۴۴۴۹c() ? focusedVh.m۱۴۳۹۱g() : -1;
        Ca0 a0Var = this.f۱۱۵۷۶j0;
        if (this.f۱۱۵۴۱F) {
            i = -1;
        } else if (focusedVh.m۱۴۴۰۰p()) {
            i = focusedVh.f۱۱۶۴۰f;
        } else {
            i = focusedVh.m۱۴۳۹۰f();
        }
        a0Var.f۱۱۶۲۲m = i;
        this.f۱۱۵۷۶j0.f۱۱۶۲۴o = m۱۴۲۶۹l(focusedVh.f۱۱۶۳۷c);
    }

    /* renamed from: L  reason: contains not printable characters */
    private void m۱۴۲۴۳L() {
        Ca0 a0Var = this.f۱۱۵۷۶j0;
        a0Var.f۱۱۶۲۳n = -1;
        a0Var.f۱۱۶۲۲m = -1;
        a0Var.f۱۱۶۲۴o = -1;
    }

    /* renamed from: D  reason: contains not printable characters */
    private View m۱۴۲۳۵D() {
        AbstractCd0 nextFocus;
        int startFocusSearchIndex = this.f۱۱۵۷۶j0.f۱۱۶۲۲m;
        if (startFocusSearchIndex == -1) {
            startFocusSearchIndex = 0;
        }
        int itemCount = this.f۱۱۵۷۶j0.m۱۴۳۵۳a();
        for (int i = startFocusSearchIndex; i < itemCount; i++) {
            AbstractCd0 nextFocus2 = m۱۴۳۰۹c(i);
            if (nextFocus2 == null) {
                break;
            } else if (nextFocus2.f۱۱۶۳۷c.hasFocusable()) {
                return nextFocus2.f۱۱۶۳۷c;
            }
        }
        int i2 = Math.min(itemCount, startFocusSearchIndex) - 1;
        while (i2 >= 0 && (nextFocus = m۱۴۳۰۹c(i2)) != null) {
            if (nextFocus.f۱۱۶۳۷c.hasFocusable()) {
                return nextFocus.f۱۱۶۳۷c;
            }
            i2--;
        }
        return null;
    }

    /* renamed from: J  reason: contains not printable characters */
    private void m۱۴۲۴۱J() {
        View child;
        if (this.f۱۱۵۶۸f0 && this.f۱۱۵۸۳n != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f۱۱۵۳۲I0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f۱۱۵۶۹g.m۱۵۱۳۳c(focusedChild)) {
                            return;
                        }
                    } else if (this.f۱۱۵۶۹g.m۱۵۱۲۲a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                AbstractCd0 focusTarget = null;
                if (this.f۱۱۵۷۶j0.f۱۱۶۲۳n != -1 && this.f۱۱۵۸۳n.m۱۴۴۴۹c()) {
                    focusTarget = m۱۴۲۷۳a(this.f۱۱۵۷۶j0.f۱۱۶۲۳n);
                }
                View viewToFocus = null;
                if (focusTarget != null && !this.f۱۱۵۶۹g.m۱۵۱۳۳c(focusTarget.f۱۱۶۳۷c) && focusTarget.f۱۱۶۳۷c.hasFocusable()) {
                    viewToFocus = focusTarget.f۱۱۶۳۷c;
                } else if (this.f۱۱۵۶۹g.m۱۵۱۲۲a() > 0) {
                    viewToFocus = m۱۴۲۳۵D();
                }
                if (viewToFocus != null) {
                    int i = this.f۱۱۵۷۶j0.f۱۱۶۲۴o;
                    if (!(((long) i) == -1 || (child = viewToFocus.findViewById(i)) == null || !child.isFocusable())) {
                        viewToFocus = child;
                    }
                    viewToFocus.requestFocus();
                }
            }
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private int m۱۴۲۶۹l(View view) {
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
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۴۲۸۲a(Ca0 state) {
        if (getScrollState() == 2) {
            OverScroller scroller = this.f۱۱۵۷۰g0.f۱۱۶۳۰e;
            state.f۱۱۶۲۵p = scroller.getFinalX() - scroller.getCurrX();
            state.f۱۱۶۲۶q = scroller.getFinalY() - scroller.getCurrY();
            return;
        }
        state.f۱۱۶۲۵p = 0;
        state.f۱۱۶۲۶q = 0;
    }

    /* renamed from: A  reason: contains not printable characters */
    private void m۱۴۲۳۲A() {
        boolean z = true;
        this.f۱۱۵۷۶j0.m۱۴۳۵۴a(1);
        m۱۴۲۸۲a(this.f۱۱۵۷۶j0);
        this.f۱۱۵۷۶j0.f۱۱۶۱۹j = false;
        m۱۴۳۵۱w();
        this.f۱۱۵۷۱h.m۱۵۵۳۲a();
        m۱۴۳۴۵q();
        m۱۴۲۴۰I();
        m۱۴۲۴۵N();
        Ca0 a0Var = this.f۱۱۵۷۶j0;
        if (!a0Var.f۱۱۶۲۰k || !this.f۱۱۵۸۴n0) {
            z = false;
        }
        a0Var.f۱۱۶۱۸i = z;
        this.f۱۱۵۸۴n0 = false;
        this.f۱۱۵۸۲m0 = false;
        Ca0 a0Var2 = this.f۱۱۵۷۶j0;
        a0Var2.f۱۱۶۱۷h = a0Var2.f۱۱۶۲۱l;
        a0Var2.f۱۱۶۱۵f = this.f۱۱۵۸۳n.m۱۴۴۳۱a();
        m۱۴۲۵۸a(this.f۱۱۵۹۴s0);
        if (this.f۱۱۵۷۶j0.f۱۱۶۲۰k) {
            int count = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
            for (int i = 0; i < count; i++) {
                AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۱c(i));
                if (!holder.m۱۴۴۰۸x() && (!holder.m۱۴۳۹۸n() || this.f۱۱۵۸۳n.m۱۴۴۴۹c())) {
                    this.f۱۱۵۷۱h.m۱۵۵۴۰c(holder, this.f۱۱۵۵۰O.m۱۴۴۶۳a(this.f۱۱۵۷۶j0, holder, AbstractCl.m۱۴۴۶۱e(holder), holder.m۱۴۳۹۵k()));
                    if (this.f۱۱۵۷۶j0.f۱۱۶۱۸i && holder.m۱۴۴۰۳s() && !holder.m۱۴۴۰۰p() && !holder.m۱۴۴۰۸x() && !holder.m۱۴۳۹۸n()) {
                        this.f۱۱۵۷۱h.m۱۵۵۳۳a(m۱۴۳۰۸c(holder), holder);
                    }
                }
            }
        }
        if (this.f۱۱۵۷۶j0.f۱۱۶۲۱l) {
            m۱۴۳۵۰v();
            Ca0 a0Var3 = this.f۱۱۵۷۶j0;
            boolean didStructureChange = a0Var3.f۱۱۶۱۶g;
            a0Var3.f۱۱۶۱۶g = false;
            this.f۱۱۵۸۵o.m۱۴۵۹۲e(this.f۱۱۵۶۳d, a0Var3);
            this.f۱۱۵۷۶j0.f۱۱۶۱۶g = didStructureChange;
            for (int i2 = 0; i2 < this.f۱۱۵۶۹g.m۱۵۱۲۲a(); i2++) {
                AbstractCd0 viewHolder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۱c(i2));
                if (!viewHolder.m۱۴۴۰۸x() && !this.f۱۱۵۷۱h.m۱۵۵۴۱c(viewHolder)) {
                    int flags = AbstractCl.m۱۴۴۶۱e(viewHolder);
                    boolean wasHidden = viewHolder.m۱۴۳۸۶b(8192);
                    if (!wasHidden) {
                        flags |= 4096;
                    }
                    AbstractCl.Cc animationInfo = this.f۱۱۵۵۰O.m۱۴۴۶۳a(this.f۱۱۵۷۶j0, viewHolder, flags, viewHolder.m۱۴۳۹۵k());
                    if (wasHidden) {
                        m۱۴۲۸۳a(viewHolder, animationInfo);
                    } else {
                        this.f۱۱۵۷۱h.m۱۵۵۳۵a(viewHolder, animationInfo);
                    }
                }
            }
            m۱۴۲۷۴a();
        } else {
            m۱۴۲۷۴a();
        }
        m۱۴۳۴۶r();
        m۱۴۳۱۳c(false);
        this.f۱۱۵۷۶j0.f۱۱۶۱۴e = 2;
    }

    /* renamed from: B  reason: contains not printable characters */
    private void m۱۴۲۳۳B() {
        m۱۴۳۵۱w();
        m۱۴۳۴۵q();
        this.f۱۱۵۷۶j0.m۱۴۳۵۴a(6);
        this.f۱۱۵۶۷f.m۱۵۱۰۴b();
        this.f۱۱۵۷۶j0.f۱۱۶۱۵f = this.f۱۱۵۸۳n.m۱۴۴۳۱a();
        Ca0 a0Var = this.f۱۱۵۷۶j0;
        a0Var.f۱۱۶۱۳d = 0;
        a0Var.f۱۱۶۱۷h = false;
        this.f۱۱۵۸۵o.m۱۴۵۹۲e(this.f۱۱۵۶۳d, a0Var);
        Ca0 a0Var2 = this.f۱۱۵۷۶j0;
        a0Var2.f۱۱۶۱۶g = false;
        this.f۱۱۵۶۵e = null;
        a0Var2.f۱۱۶۲۰k = a0Var2.f۱۱۶۲۰k && this.f۱۱۵۵۰O != null;
        this.f۱۱۵۷۶j0.f۱۱۶۱۴e = 4;
        m۱۴۳۴۶r();
        m۱۴۳۱۳c(false);
    }

    /* renamed from: C  reason: contains not printable characters */
    private void m۱۴۲۳۴C() {
        this.f۱۱۵۷۶j0.m۱۴۳۵۴a(4);
        m۱۴۳۵۱w();
        m۱۴۳۴۵q();
        Ca0 a0Var = this.f۱۱۵۷۶j0;
        a0Var.f۱۱۶۱۴e = 1;
        if (a0Var.f۱۱۶۲۰k) {
            for (int i = this.f۱۱۵۶۹g.m۱۵۱۲۲a() - 1; i >= 0; i--) {
                AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۱c(i));
                if (!holder.m۱۴۴۰۸x()) {
                    long key = m۱۴۳۰۸c(holder);
                    AbstractCl.Cc animationInfo = this.f۱۱۵۵۰O.m۱۴۴۶۲a(this.f۱۱۵۷۶j0, holder);
                    AbstractCd0 oldChangeViewHolder = this.f۱۱۵۷۱h.m۱۵۵۳۱a(key);
                    if (oldChangeViewHolder == null || oldChangeViewHolder.m۱۴۴۰۸x()) {
                        this.f۱۱۵۷۱h.m۱۵۵۳۸b(holder, animationInfo);
                    } else {
                        boolean oldDisappearing = this.f۱۱۵۷۱h.m۱۵۵۳۹b(oldChangeViewHolder);
                        boolean newDisappearing = this.f۱۱۵۷۱h.m۱۵۵۳۹b(holder);
                        if (!oldDisappearing || oldChangeViewHolder != holder) {
                            AbstractCl.Cc preInfo = this.f۱۱۵۷۱h.m۱۵۵۴۴f(oldChangeViewHolder);
                            this.f۱۱۵۷۱h.m۱۵۵۳۸b(holder, animationInfo);
                            AbstractCl.Cc postInfo = this.f۱۱۵۷۱h.m۱۵۵۴۳e(holder);
                            if (preInfo == null) {
                                m۱۴۲۴۹a(key, holder, oldChangeViewHolder);
                            } else {
                                m۱۴۲۵۱a(oldChangeViewHolder, holder, preInfo, postInfo, oldDisappearing, newDisappearing);
                            }
                        } else {
                            this.f۱۱۵۷۱h.m۱۵۵۳۸b(holder, animationInfo);
                        }
                    }
                }
            }
            this.f۱۱۵۷۱h.m۱۵۵۳۶a(this.f۱۱۵۳۶A0);
        }
        this.f۱۱۵۸۵o.m۱۴۵۷۶c(this.f۱۱۵۶۳d);
        Ca0 a0Var2 = this.f۱۱۵۷۶j0;
        a0Var2.f۱۱۶۱۲c = a0Var2.f۱۱۶۱۵f;
        this.f۱۱۵۴۱F = false;
        this.f۱۱۵۴۲G = false;
        a0Var2.f۱۱۶۲۰k = false;
        a0Var2.f۱۱۶۲۱l = false;
        this.f۱۱۵۸۵o.f۱۱۶۷۵h = false;
        ArrayList<AbstractCd0> arrayList = this.f۱۱۵۶۳d.f۱۱۷۰۳b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar.f۱۱۶۸۱n) {
            oVar.f۱۱۶۸۰m = 0;
            oVar.f۱۱۶۸۱n = false;
            this.f۱۱۵۶۳d.m۱۴۷۰۴j();
        }
        this.f۱۱۵۸۵o.m۱۴۶۰۲g(this.f۱۱۵۷۶j0);
        m۱۴۳۴۶r();
        m۱۴۳۱۳c(false);
        this.f۱۱۵۷۱h.m۱۵۵۳۲a();
        int[] iArr = this.f۱۱۵۹۴s0;
        if (m۱۴۲۶۸k(iArr[0], iArr[1])) {
            m۱۴۳۱۶d(0, 0);
        }
        m۱۴۲۴۱J();
        m۱۴۲۴۳L();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۴۹a(long key, AbstractCd0 holder, AbstractCd0 oldChangeViewHolder) {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 other = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۱c(i));
            if (other != holder && m۱۴۳۰۸c(other) == key) {
                AbstractCg gVar = this.f۱۱۵۸۳n;
                if (gVar == null || !gVar.m۱۴۴۴۹c()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + m۱۴۳۳۴i());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + m۱۴۳۳۴i());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oldChangeViewHolder + " cannot be found but it is necessary for " + holder + m۱۴۳۳۴i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۳a(AbstractCd0 viewHolder, AbstractCl.Cc animationInfo) {
        viewHolder.m۱۴۳۷۷a(0, 8192);
        if (this.f۱۱۵۷۶j0.f۱۱۶۱۸i && viewHolder.m۱۴۴۰۳s() && !viewHolder.m۱۴۴۰۰p() && !viewHolder.m۱۴۴۰۸x()) {
            this.f۱۱۵۷۱h.m۱۵۵۳۳a(m۱۴۳۰۸c(viewHolder), viewHolder);
        }
        this.f۱۱۵۷۱h.m۱۵۵۴۰c(viewHolder, animationInfo);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۵۸a(int[] into) {
        int count = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
        if (count == 0) {
            into[0] = -1;
            into[1] = -1;
            return;
        }
        int minPositionPreLayout = Integer.MAX_VALUE;
        int maxPositionPreLayout = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۱c(i));
            if (!holder.m۱۴۴۰۸x()) {
                int pos = holder.m۱۴۳۹۳i();
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

    /* renamed from: k  reason: contains not printable characters */
    private boolean m۱۴۲۶۸k(int minPositionPreLayout, int maxPositionPreLayout) {
        m۱۴۲۵۸a(this.f۱۱۵۹۴s0);
        int[] iArr = this.f۱۱۵۹۴s0;
        return (iArr[0] == minPositionPreLayout && iArr[1] == maxPositionPreLayout) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View child, boolean animate) {
        AbstractCd0 vh = m۱۴۲۶۷k(child);
        if (vh != null) {
            if (vh.m۱۴۴۰۲r()) {
                vh.m۱۴۳۸۸d();
            } else if (!vh.m۱۴۴۰۸x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + vh + m۱۴۳۳۴i());
            }
        }
        child.clearAnimation();
        m۱۴۳۰۶b(child);
        super.removeDetachedView(child, animate);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public long m۱۴۳۰۸c(AbstractCd0 holder) {
        return this.f۱۱۵۸۳n.m۱۴۴۴۹c() ? holder.m۱۴۳۹۱g() : (long) holder.f۱۱۶۳۹e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۴a(AbstractCd0 itemHolder, AbstractCl.Cc preLayoutInfo, AbstractCl.Cc postLayoutInfo) {
        itemHolder.m۱۴۳۸۳a(false);
        if (this.f۱۱۵۵۰O.m۱۴۴۶۸a(itemHolder, preLayoutInfo, postLayoutInfo)) {
            m۱۴۳۴۷s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۲b(AbstractCd0 holder, AbstractCl.Cc preLayoutInfo, AbstractCl.Cc postLayoutInfo) {
        m۱۴۲۶۴d(holder);
        holder.m۱۴۳۸۳a(false);
        if (this.f۱۱۵۵۰O.m۱۴۴۷۲b(holder, preLayoutInfo, postLayoutInfo)) {
            m۱۴۳۴۷s();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۲۵۱a(AbstractCd0 oldHolder, AbstractCd0 newHolder, AbstractCl.Cc preInfo, AbstractCl.Cc postInfo, boolean oldHolderDisappearing, boolean newHolderDisappearing) {
        oldHolder.m۱۴۳۸۳a(false);
        if (oldHolderDisappearing) {
            m۱۴۲۶۴d(oldHolder);
        }
        if (oldHolder != newHolder) {
            if (newHolderDisappearing) {
                m۱۴۲۶۴d(newHolder);
            }
            oldHolder.f۱۱۶۴۴j = newHolder;
            m۱۴۲۶۴d(oldHolder);
            this.f۱۱۵۶۳d.m۱۴۶۹۲c(oldHolder);
            newHolder.m۱۴۳۸۳a(false);
            newHolder.f۱۱۶۴۵k = oldHolder;
        }
        if (this.f۱۱۵۵۰O.m۱۴۴۶۷a(oldHolder, newHolder, preInfo, postInfo)) {
            m۱۴۳۴۷s();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        Ca.m۱۰۴۹۷a("RV OnLayout");
        m۱۴۳۱۱c();
        Ca.m۱۰۴۹۶a();
        this.f۱۱۶۰۱w = true;
    }

    public void requestLayout() {
        if (this.f۱۱۶۰۳x != 0 || this.f۱۱۶۰۷z) {
            this.f۱۱۶۰۵y = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o  reason: contains not printable characters */
    public void m۱۴۳۴۳o() {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            ((Cp) this.f۱۱۵۶۹g.m۱۵۱۳۴d(i).getLayoutParams()).f۱۱۶۹۴c = true;
        }
        this.f۱۱۵۶۳d.m۱۴۷۰۱g();
    }

    public void draw(Canvas c) {
        super.draw(c);
        int count = this.f۱۱۵۸۹q.size();
        for (int i = 0; i < count; i++) {
            this.f۱۱۵۸۹q.get(i).m۱۴۴۹۳b(c, this, this.f۱۱۵۷۶j0);
        }
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.f۱۱۵۴۶K;
        boolean z = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = c.save();
            int padding = this.f۱۱۵۷۳i ? getPaddingBottom() : 0;
            c.rotate(270.0f);
            c.translate((float) ((-getHeight()) + padding), 0.0f);
            EdgeEffect edgeEffect2 = this.f۱۱۵۴۶K;
            needsInvalidate = edgeEffect2 != null && edgeEffect2.draw(c);
            c.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.f۱۱۵۴۷L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = c.save();
            if (this.f۱۱۵۷۳i) {
                c.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f۱۱۵۴۷L;
            needsInvalidate |= edgeEffect4 != null && edgeEffect4.draw(c);
            c.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.f۱۱۵۴۸M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int restore3 = c.save();
            int width = getWidth();
            int padding2 = this.f۱۱۵۷۳i ? getPaddingTop() : 0;
            c.rotate(90.0f);
            c.translate((float) (-padding2), (float) (-width));
            EdgeEffect edgeEffect6 = this.f۱۱۵۴۸M;
            needsInvalidate |= edgeEffect6 != null && edgeEffect6.draw(c);
            c.restoreToCount(restore3);
        }
        EdgeEffect edgeEffect7 = this.f۱۱۵۴۹N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int restore4 = c.save();
            c.rotate(180.0f);
            if (this.f۱۱۵۷۳i) {
                c.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                c.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f۱۱۵۴۹N;
            if (edgeEffect8 == null || !edgeEffect8.draw(c)) {
                z = false;
            }
            needsInvalidate |= z;
            c.restoreToCount(restore4);
        }
        if (!needsInvalidate && this.f۱۱۵۵۰O != null && this.f۱۱۵۸۹q.size() > 0 && this.f۱۱۵۵۰O.m۱۴۴۸۰g()) {
            needsInvalidate = true;
        }
        if (needsInvalidate) {
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۷۰B(this);
        }
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        int count = this.f۱۱۵۸۹q.size();
        for (int i = 0; i < count; i++) {
            this.f۱۱۵۸۹q.get(i).m۱۴۴۸۹a(c, this, this.f۱۱۵۷۶j0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof Cp) && this.f۱۱۵۸۵o.m۱۴۵۴۴a((Cp) p);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            return oVar.m۱۴۵۷۲c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m۱۴۳۳۴i());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            return oVar.m۱۴۵۰۹a(getContext(), attrs);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m۱۴۳۳۴i());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            return oVar.m۱۴۵۱۰a(p);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m۱۴۳۳۴i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v  reason: contains not printable characters */
    public void m۱۴۳۵۰v() {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (!holder.m۱۴۴۰۸x()) {
                holder.m۱۴۴۰۶v();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۷۴a() {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (!holder.m۱۴۴۰۸x()) {
                holder.m۱۴۳۷۵a();
            }
        }
        this.f۱۱۵۶۳d.m۱۴۶۸۵b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۳۲۸g(int from, int to) {
        int inBetweenOffset;
        int end;
        int start;
        int i;
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        if (from < to) {
            start = from;
            end = to;
            inBetweenOffset = -1;
        } else {
            start = to;
            end = from;
            inBetweenOffset = 1;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i2));
            if (holder != null && (i = holder.f۱۱۶۳۹e) >= start && i <= end) {
                if (i == from) {
                    holder.m۱۴۳۷۹a(to - from, false);
                } else {
                    holder.m۱۴۳۷۹a(inBetweenOffset, false);
                }
                this.f۱۱۵۷۶j0.f۱۱۶۱۶g = true;
            }
        }
        this.f۱۱۵۶۳d.m۱۴۶۸۶b(from, to);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۴۳۲۵f(int positionStart, int itemCount) {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder != null && !holder.m۱۴۴۰۸x() && holder.f۱۱۶۳۹e >= positionStart) {
                holder.m۱۴۳۷۹a(itemCount, false);
                this.f۱۱۵۷۶j0.f۱۱۶۱۶g = true;
            }
        }
        this.f۱۱۵۶۳d.m۱۴۶۷۵a(positionStart, itemCount);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۷۹a(int positionStart, int itemCount, boolean applyToPreLayout) {
        int positionEnd = positionStart + itemCount;
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder != null && !holder.m۱۴۴۰۸x()) {
                int i2 = holder.f۱۱۶۳۹e;
                if (i2 >= positionEnd) {
                    holder.m۱۴۳۷۹a(-itemCount, applyToPreLayout);
                    this.f۱۱۵۷۶j0.f۱۱۶۱۶g = true;
                } else if (i2 >= positionStart) {
                    holder.m۱۴۳۷۸a(positionStart - 1, -itemCount, applyToPreLayout);
                    this.f۱۱۵۷۶j0.f۱۱۶۱۶g = true;
                }
            }
        }
        this.f۱۱۵۶۳d.m۱۴۶۷۶a(positionStart, itemCount, applyToPreLayout);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۷۸a(int positionStart, int itemCount, Object payload) {
        int i;
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        int positionEnd = positionStart + itemCount;
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = this.f۱۱۵۶۹g.m۱۵۱۳۴d(i2);
            AbstractCd0 holder = m۱۴۲۶۷k(child);
            if (holder != null && !holder.m۱۴۴۰۸x() && (i = holder.f۱۱۶۳۹e) >= positionStart && i < positionEnd) {
                holder.m۱۴۳۷۶a(2);
                holder.m۱۴۳۸۲a(payload);
                ((Cp) child.getLayoutParams()).f۱۱۶۹۴c = true;
            }
        }
        this.f۱۱۵۶۳d.m۱۴۶۹۱c(positionStart, itemCount);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۲۹۵a(AbstractCd0 viewHolder) {
        AbstractCl lVar = this.f۱۱۵۵۰O;
        return lVar == null || lVar.m۱۴۴۶۹a(viewHolder, viewHolder.m۱۴۳۹۵k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۷b(boolean dispatchItemsChanged) {
        this.f۱۱۵۴۲G |= dispatchItemsChanged;
        this.f۱۱۵۴۱F = true;
        m۱۴۳۴۴p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public void m۱۴۳۴۴p() {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder != null && !holder.m۱۴۴۰۸x()) {
                holder.m۱۴۳۷۶a(6);
            }
        }
        m۱۴۳۴۳o();
        this.f۱۱۵۶۳d.m۱۴۷۰۲h();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f۱۱۵۶۸f0;
    }

    public void setPreserveFocusAfterLayout(boolean preserveFocusAfterLayout) {
        this.f۱۱۵۶۸f0 = preserveFocusAfterLayout;
    }

    /* renamed from: e  reason: contains not printable characters */
    public AbstractCd0 m۱۴۳۱۸e(View child) {
        ViewParent parent = child.getParent();
        if (parent == null || parent == this) {
            return m۱۴۲۶۷k(child);
        }
        throw new IllegalArgumentException("View " + child + " is not a direct child of " + this);
    }

    /* renamed from: c  reason: contains not printable characters */
    public View m۱۴۳۱۰c(View view) {
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

    /* renamed from: d  reason: contains not printable characters */
    public AbstractCd0 m۱۴۳۱۴d(View view) {
        View itemView = m۱۴۳۱۰c(view);
        if (itemView == null) {
            return null;
        }
        return m۱۴۳۱۸e(itemView);
    }

    /* renamed from: k  reason: contains not printable characters */
    static AbstractCd0 m۱۴۲۶۷k(View child) {
        if (child == null) {
            return null;
        }
        return ((Cp) child.getLayoutParams()).f۱۱۶۹۲a;
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractCd0 m۱۴۳۰۹c(int position) {
        if (this.f۱۱۵۴۱F) {
            return null;
        }
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        AbstractCd0 hidden = null;
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder != null && !holder.m۱۴۴۰۰p() && m۱۴۲۹۸b(holder) == position) {
                if (!this.f۱۱۵۶۹g.m۱۵۱۳۳c(holder.f۱۱۶۳۷c)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCd0 m۱۴۲۷۲a(int position, boolean checkNewPosition) {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        AbstractCd0 hidden = null;
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder != null && !holder.m۱۴۴۰۰p()) {
                if (checkNewPosition) {
                    if (holder.f۱۱۶۳۹e != position) {
                        continue;
                    }
                } else if (holder.m۱۴۳۹۳i() != position) {
                    continue;
                }
                if (!this.f۱۱۵۶۹g.m۱۵۱۳۳c(holder.f۱۱۶۳۷c)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCd0 m۱۴۲۷۳a(long id) {
        AbstractCg gVar = this.f۱۱۵۸۳n;
        if (gVar == null || !gVar.m۱۴۴۴۹c()) {
            return null;
        }
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۸b();
        AbstractCd0 hidden = null;
        for (int i = 0; i < childCount; i++) {
            AbstractCd0 holder = m۱۴۲۶۷k(this.f۱۱۵۶۹g.m۱۵۱۳۴d(i));
            if (holder != null && !holder.m۱۴۴۰۰p() && holder.m۱۴۳۹۱g() == id) {
                if (!this.f۱۱۵۶۹g.m۱۵۱۳۳c(holder.f۱۱۶۳۷c)) {
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

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۴۳۲۴f(int dy) {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
        for (int i = 0; i < childCount; i++) {
            this.f۱۱۵۶۹g.m۱۵۱۳۱c(i).offsetTopAndBottom(dy);
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۳۲۹g(View child) {
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۳۳۳h(View child) {
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۳۲۰e(int dx) {
        int childCount = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
        for (int i = 0; i < childCount; i++) {
            this.f۱۱۵۶۹g.m۱۵۱۳۱c(i).offsetLeftAndRight(dx);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۴۲۵۶a(View view, Rect outBounds) {
        Cp lp = (Cp) view.getLayoutParams();
        Rect insets = lp.f۱۱۶۹۳b;
        outBounds.set((view.getLeft() - insets.left) - ((ViewGroup.MarginLayoutParams) lp).leftMargin, (view.getTop() - insets.top) - ((ViewGroup.MarginLayoutParams) lp).topMargin, view.getRight() + insets.right + ((ViewGroup.MarginLayoutParams) lp).rightMargin, view.getBottom() + insets.bottom + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public Rect m۱۴۳۲۲f(View child) {
        Cp lp = (Cp) child.getLayoutParams();
        if (!lp.f۱۱۶۹۴c) {
            return lp.f۱۱۶۹۳b;
        }
        if (this.f۱۱۵۷۶j0.m۱۴۳۵۸d() && (lp.m۱۴۶۴۳b() || lp.m۱۴۶۴۵d())) {
            return lp.f۱۱۶۹۳b;
        }
        Rect insets = lp.f۱۱۶۹۳b;
        insets.set(0, 0, 0, 0);
        int decorCount = this.f۱۱۵۸۹q.size();
        for (int i = 0; i < decorCount; i++) {
            this.f۱۱۵۷۷k.set(0, 0, 0, 0);
            this.f۱۱۵۸۹q.get(i).m۱۴۴۹۱a(this.f۱۱۵۷۷k, child, this, this.f۱۱۵۷۶j0);
            int i2 = insets.left;
            Rect rect = this.f۱۱۵۷۷k;
            insets.left = i2 + rect.left;
            insets.top += rect.top;
            insets.right += rect.right;
            insets.bottom += rect.bottom;
        }
        lp.f۱۱۶۹۴c = false;
        return insets;
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۳۳۲h(int dx, int dy) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۳۱۶d(int hresult, int vresult) {
        this.f۱۱۵۴۴I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        m۱۴۳۳۲h(hresult, vresult);
        AbstractCt tVar = this.f۱۱۵۷۸k0;
        if (tVar != null) {
            tVar.m۱۴۶۵۳a(this, hresult, vresult);
        }
        List<AbstractCt> list = this.f۱۱۵۸۰l0;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.f۱۱۵۸۰l0.get(i).m۱۴۶۵۳a(this, hresult, vresult);
            }
        }
        this.f۱۱۵۴۴I--;
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۳۲۷g(int state) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۰b(int state) {
        AbstractCo oVar = this.f۱۱۵۸۵o;
        if (oVar != null) {
            oVar.m۱۴۵۹۶f(state);
        }
        m۱۴۳۲۷g(state);
        AbstractCt tVar = this.f۱۱۵۷۸k0;
        if (tVar != null) {
            tVar.m۱۴۶۵۲a(this, state);
        }
        List<AbstractCt> list = this.f۱۱۵۸۰l0;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.f۱۱۵۸۰l0.get(i).m۱۴۶۵۲a(this, state);
            }
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۴۳۳۷j() {
        return !this.f۱۱۶۰۱w || this.f۱۱۵۴۱F || this.f۱۱۵۶۷f.m۱۵۱۰۵c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.RecyclerView$c0  reason: invalid class name */
    public class RunnableCc0 implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۱۶۲۸c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۱۱۶۲۹d;

        /* renamed from: e  reason: contains not printable characters */
        OverScroller f۱۱۶۳۰e;

        /* renamed from: f  reason: contains not printable characters */
        Interpolator f۱۱۶۳۱f = RecyclerView.f۱۱۵۳۴K0;

        /* renamed from: g  reason: contains not printable characters */
        private boolean f۱۱۶۳۲g = false;

        /* renamed from: h  reason: contains not printable characters */
        private boolean f۱۱۶۳۳h = false;

        RunnableCc0() {
            this.f۱۱۶۳۰e = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f۱۱۵۳۴K0);
        }

        public void run() {
            int overscrollY;
            int overscrollX;
            int adapterSize;
            int velX;
            int velY;
            if (RecyclerView.this.f۱۱۵۸۵o == null) {
                m۱۴۳۶۹b();
                return;
            }
            m۱۴۳۶۳c();
            RecyclerView.this.m۱۴۲۹۹b();
            OverScroller scroller = this.f۱۱۶۳۰e;
            AbstractCz smoothScroller = RecyclerView.this.f۱۱۵۸۵o.f۱۱۶۷۴g;
            if (scroller.computeScrollOffset()) {
                int[] scrollConsumed = RecyclerView.this.f۱۱۶۰۰v0;
                int x = scroller.getCurrX();
                int y = scroller.getCurrY();
                int dx = x - this.f۱۱۶۲۸c;
                int dy = y - this.f۱۱۶۲۹d;
                int hresult = 0;
                this.f۱۱۶۲۸c = x;
                this.f۱۱۶۲۹d = y;
                if (RecyclerView.this.m۱۴۲۹۴a(dx, dy, scrollConsumed, (int[]) null, 1)) {
                    dx -= scrollConsumed[0];
                    dy -= scrollConsumed[1];
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f۱۱۵۸۳n != null) {
                    recyclerView.m۱۴۲۸۰a(dx, dy, recyclerView.f۱۱۶۰۴x0);
                    int[] iArr = RecyclerView.this.f۱۱۶۰۴x0;
                    hresult = iArr[0];
                    int vresult = iArr[1];
                    int overscrollX2 = dx - hresult;
                    int overscrollY2 = dy - vresult;
                    if (smoothScroller != null && !smoothScroller.m۱۴۷۱۴b() && smoothScroller.m۱۴۷۱۵c()) {
                        int adapterSize2 = RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۳a();
                        if (adapterSize2 == 0) {
                            smoothScroller.m۱۴۷۱۶d();
                        } else if (smoothScroller.m۱۴۷۱۰a() >= adapterSize2) {
                            smoothScroller.m۱۴۷۱۱a(adapterSize2 - 1);
                            smoothScroller.m۱۴۷۱۲a(dx - overscrollX2, dy - overscrollY2);
                        } else {
                            smoothScroller.m۱۴۷۱۲a(dx - overscrollX2, dy - overscrollY2);
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
                if (!RecyclerView.this.f۱۱۵۸۹q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m۱۴۳۰۱b(dx, dy);
                }
                if (!RecyclerView.this.m۱۴۲۹۲a(hresult, adapterSize, overscrollX, overscrollY, (int[]) null, 1)) {
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
                            RecyclerView.this.m۱۴۲۷۶a(velX, velY);
                        }
                        if ((velX != 0 || overscrollX == x || scroller.getFinalX() == 0) && (velY != 0 || overscrollY == y || scroller.getFinalY() == 0)) {
                            scroller.abortAnimation();
                        }
                    }
                }
                if (!(hresult == 0 && adapterSize == 0)) {
                    RecyclerView.this.m۱۴۳۱۶d(hresult, adapterSize);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean fullyConsumedAny = (dx == 0 && dy == 0) || (dx != 0 && RecyclerView.this.f۱۱۵۸۵o.m۱۴۵۴۲a() && hresult == dx) || (dy != 0 && RecyclerView.this.f۱۱۵۸۵o.m۱۴۵۶۸b() && adapterSize == dy);
                if (scroller.isFinished() || (!fullyConsumedAny && !RecyclerView.this.m۱۴۳۱۷d(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.f۱۱۵۳۰G0) {
                        RecyclerView.this.f۱۱۵۷۴i0.m۱۵۴۲۹a();
                    }
                    RecyclerView.this.m۱۴۲۷۵a(1);
                } else {
                    m۱۴۳۶۵a();
                    RecyclerView recyclerView2 = RecyclerView.this;
                    RunnableCm0 m0Var = recyclerView2.f۱۱۵۷۲h0;
                    if (m0Var != null) {
                        m0Var.m۱۵۴۲۶a(recyclerView2, dx, dy);
                    }
                }
            }
            if (smoothScroller != null) {
                if (smoothScroller.m۱۴۷۱۴b()) {
                    smoothScroller.m۱۴۷۱۲a(0, 0);
                }
                if (!this.f۱۱۶۳۳h) {
                    smoothScroller.m۱۴۷۱۶d();
                }
            }
            m۱۴۳۶۴d();
        }

        /* renamed from: c  reason: contains not printable characters */
        private void m۱۴۳۶۳c() {
            this.f۱۱۶۳۳h = false;
            this.f۱۱۶۳۲g = true;
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۴۳۶۴d() {
            this.f۱۱۶۳۲g = false;
            if (this.f۱۱۶۳۳h) {
                m۱۴۳۶۵a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۶۵a() {
            if (this.f۱۱۶۳۲g) {
                this.f۱۱۶۳۳h = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            android.support.p۰۴۳v4.view.Cu.m۱۲۹۸۹a(RecyclerView.this, this);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۶۶a(int velocityX, int velocityY) {
            RecyclerView.this.setScrollState(2);
            this.f۱۱۶۲۹d = 0;
            this.f۱۱۶۲۸c = 0;
            this.f۱۱۶۳۰e.fling(0, 0, velocityX, velocityY, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m۱۴۳۶۵a();
        }

        /* renamed from: a  reason: contains not printable characters */
        private float m۱۴۳۶۱a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a  reason: contains not printable characters */
        private int m۱۴۳۶۲a(int dx, int dy, int vx, int vy) {
            int duration;
            int absDx = Math.abs(dx);
            int absDy = Math.abs(dy);
            boolean horizontal = absDx > absDy;
            int velocity = (int) Math.sqrt((double) ((vx * vx) + (vy * vy)));
            int delta = (int) Math.sqrt((double) ((dx * dx) + (dy * dy)));
            RecyclerView recyclerView = RecyclerView.this;
            int containerSize = horizontal ? recyclerView.getWidth() : recyclerView.getHeight();
            int halfContainerSize = containerSize / 2;
            float distance = ((float) halfContainerSize) + (((float) halfContainerSize) * m۱۴۳۶۱a(Math.min(1.0f, (((float) delta) * 1.0f) / ((float) containerSize))));
            if (velocity > 0) {
                duration = Math.round(Math.abs(distance / ((float) velocity)) * 1000.0f) * 4;
            } else {
                duration = (int) (((((float) (horizontal ? absDx : absDy)) / ((float) containerSize)) + 1.0f) * 300.0f);
            }
            return Math.min(duration, 2000);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۶۸a(int dx, int dy, Interpolator interpolator) {
            m۱۴۳۶۷a(dx, dy, m۱۴۳۶۲a(dx, dy, 0, 0), interpolator == null ? RecyclerView.f۱۱۵۳۴K0 : interpolator);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۶۷a(int dx, int dy, int duration, Interpolator interpolator) {
            if (this.f۱۱۶۳۱f != interpolator) {
                this.f۱۱۶۳۱f = interpolator;
                this.f۱۱۶۳۰e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f۱۱۶۲۹d = 0;
            this.f۱۱۶۲۸c = 0;
            this.f۱۱۶۳۰e.startScroll(0, 0, dx, dy, duration);
            if (Build.VERSION.SDK_INT < 23) {
                this.f۱۱۶۳۰e.computeScrollOffset();
            }
            m۱۴۳۶۵a();
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۳۶۹b() {
            RecyclerView.this.removeCallbacks(this);
            this.f۱۱۶۳۰e.abortAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u  reason: contains not printable characters */
    public void m۱۴۳۴۹u() {
        AbstractCd0 d0Var;
        int count = this.f۱۱۵۶۹g.m۱۵۱۲۲a();
        for (int i = 0; i < count; i++) {
            View view = this.f۱۱۵۶۹g.m۱۵۱۳۱c(i);
            AbstractCd0 holder = m۱۴۳۱۸e(view);
            if (!(holder == null || (d0Var = holder.f۱۱۶۴۵k) == null)) {
                View shadowingView = d0Var.f۱۱۶۳۷c;
                int left = view.getLeft();
                int top = view.getTop();
                if (left != shadowingView.getLeft() || top != shadowingView.getTop()) {
                    shadowingView.layout(left, top, shadowingView.getWidth() + left, shadowingView.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.RecyclerView$x  reason: invalid class name */
    public class Cx extends AbstractCi {
        Cx() {
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۷۰۶a() {
            RecyclerView.this.m۱۴۲۹۰a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f۱۱۵۷۶j0.f۱۱۶۱۶g = true;
            recyclerView.m۱۴۳۰۷b(true);
            if (!RecyclerView.this.f۱۱۵۶۷f.m۱۵۱۰۵c()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۷۰۷a(int positionStart, int itemCount, Object payload) {
            RecyclerView.this.m۱۴۲۹۰a((String) null);
            if (RecyclerView.this.f۱۱۵۶۷f.m۱۵۱۰۲a(positionStart, itemCount, payload)) {
                m۱۴۷۰۸b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۷۰۸b() {
            if (RecyclerView.f۱۱۵۲۹F0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f۱۱۵۹۷u && recyclerView.f۱۱۵۹۵t) {
                    android.support.p۰۴۳v4.view.Cu.m۱۲۹۸۹a(recyclerView, recyclerView.f۱۱۵۷۵j);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f۱۱۵۳۸C = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k  reason: invalid class name */
    public static class Ck {
        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public EdgeEffect m۱۴۴۶۰a(RecyclerView view, int direction) {
            return new EdgeEffect(view.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u  reason: invalid class name */
    public static class Cu {

        /* renamed from: a  reason: contains not printable characters */
        SparseArray<Ca> f۱۱۶۹۶a = new SparseArray<>();

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۱۶۹۷b = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.RecyclerView$u$a  reason: invalid class name */
        public static class Ca {

            /* renamed from: a  reason: contains not printable characters */
            final ArrayList<AbstractCd0> f۱۱۶۹۸a = new ArrayList<>();

            /* renamed from: b  reason: contains not printable characters */
            int f۱۱۶۹۹b = 5;

            /* renamed from: c  reason: contains not printable characters */
            long f۱۱۷۰۰c = 0;

            /* renamed from: d  reason: contains not printable characters */
            long f۱۱۷۰۱d = 0;

            Ca() {
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۶۶۲b() {
            for (int i = 0; i < this.f۱۱۶۹۶a.size(); i++) {
                this.f۱۱۶۹۶a.valueAt(i).f۱۱۶۹۸a.clear();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public AbstractCd0 m۱۴۶۵۶a(int viewType) {
            Ca scrapData = this.f۱۱۶۹۶a.get(viewType);
            if (scrapData == null || scrapData.f۱۱۶۹۸a.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> scrapHeap = scrapData.f۱۱۶۹۸a;
            return (AbstractCd0) scrapHeap.remove(scrapHeap.size() - 1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۵۹a(AbstractCd0 scrap) {
            int viewType = scrap.m۱۴۳۹۲h();
            ArrayList<ViewHolder> scrapHeap = m۱۴۶۵۴b(viewType).f۱۱۶۹۸a;
            if (this.f۱۱۶۹۶a.get(viewType).f۱۱۶۹۹b > scrapHeap.size()) {
                scrap.m۱۴۴۰۵u();
                scrapHeap.add(scrap);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public long m۱۴۶۵۵a(long oldAverage, long newValue) {
            if (oldAverage == 0) {
                return newValue;
            }
            return ((oldAverage / 4) * 3) + (newValue / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۶۶۳b(int viewType, long createTimeNs) {
            Ca scrapData = m۱۴۶۵۴b(viewType);
            scrapData.f۱۱۷۰۰c = m۱۴۶۵۵a(scrapData.f۱۱۷۰۰c, createTimeNs);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۵۸a(int viewType, long bindTimeNs) {
            Ca scrapData = m۱۴۶۵۴b(viewType);
            scrapData.f۱۱۷۰۱d = m۱۴۶۵۵a(scrapData.f۱۱۷۰۱d, bindTimeNs);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۶۶۴b(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = m۱۴۶۵۴b(viewType).f۱۱۷۰۰c;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۶۶۱a(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = m۱۴۶۵۴b(viewType).f۱۱۷۰۱d;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۵۷a() {
            this.f۱۱۶۹۷b++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۶۶۵c() {
            this.f۱۱۶۹۷b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۶۰a(AbstractCg oldAdapter, AbstractCg newAdapter, boolean compatibleWithPrevious) {
            if (oldAdapter != null) {
                m۱۴۶۶۵c();
            }
            if (!compatibleWithPrevious && this.f۱۱۶۹۷b == 0) {
                m۱۴۶۶۲b();
            }
            if (newAdapter != null) {
                m۱۴۶۵۷a();
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private Ca m۱۴۶۵۴b(int viewType) {
            Ca scrapData = this.f۱۱۶۹۶a.get(viewType);
            if (scrapData != null) {
                return scrapData;
            }
            Ca scrapData2 = new Ca();
            this.f۱۱۶۹۶a.put(viewType, scrapData2);
            return scrapData2;
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    static RecyclerView m۱۴۲۶۶j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup parent = (ViewGroup) view;
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            RecyclerView descendant = m۱۴۲۶۶j(parent.getChildAt(i));
            if (descendant != null) {
                return descendant;
            }
        }
        return null;
    }

    /* renamed from: e  reason: contains not printable characters */
    static void m۱۴۲۶۵e(AbstractCd0 holder) {
        WeakReference<RecyclerView> weakReference = holder.f۱۱۶۳۸d;
        if (weakReference != null) {
            RecyclerView item = weakReference.get();
            while (item != null) {
                if (item != holder.f۱۱۶۳۷c) {
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
            holder.f۱۱۶۳۸d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f۱۱۵۳۰G0) {
            return System.nanoTime();
        }
        return 0;
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v  reason: invalid class name */
    public final class Cv {

        /* renamed from: a  reason: contains not printable characters */
        final ArrayList<AbstractCd0> f۱۱۷۰۲a = new ArrayList<>();

        /* renamed from: b  reason: contains not printable characters */
        ArrayList<AbstractCd0> f۱۱۷۰۳b = null;

        /* renamed from: c  reason: contains not printable characters */
        final ArrayList<AbstractCd0> f۱۱۷۰۴c = new ArrayList<>();

        /* renamed from: d  reason: contains not printable characters */
        private final List<AbstractCd0> f۱۱۷۰۵d = Collections.unmodifiableList(this.f۱۱۷۰۲a);

        /* renamed from: e  reason: contains not printable characters */
        private int f۱۱۷۰۶e = 2;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۱۷۰۷f = 2;

        /* renamed from: g  reason: contains not printable characters */
        Cu f۱۱۷۰۸g;

        /* renamed from: h  reason: contains not printable characters */
        private AbstractCb0 f۱۱۷۰۹h;

        public Cv() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۷۴a() {
            this.f۱۱۷۰۲a.clear();
            m۱۴۷۰۳i();
        }

        /* renamed from: f  reason: contains not printable characters */
        public void m۱۴۷۰۰f(int viewCount) {
            this.f۱۱۷۰۶e = viewCount;
            m۱۴۷۰۴j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j  reason: contains not printable characters */
        public void m۱۴۷۰۴j() {
            AbstractCo oVar = RecyclerView.this.f۱۱۵۸۵o;
            this.f۱۱۷۰۷f = this.f۱۱۷۰۶e + (oVar != null ? oVar.f۱۱۶۸۰m : 0);
            for (int i = this.f۱۱۷۰۴c.size() - 1; i >= 0 && this.f۱۱۷۰۴c.size() > this.f۱۱۷۰۷f; i--) {
                m۱۴۶۹۸e(i);
            }
        }

        /* renamed from: f  reason: contains not printable characters */
        public List<AbstractCd0> m۱۴۶۹۹f() {
            return this.f۱۱۷۰۵d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۴۶۹۶d(AbstractCd0 holder) {
            if (holder.m۱۴۴۰۰p()) {
                return RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d();
            }
            int i = holder.f۱۱۶۳۹e;
            if (i < 0 || i >= RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۱a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + holder + RecyclerView.this.m۱۴۳۳۴i());
            } else if (!RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d() && RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۴۰b(holder.f۱۱۶۳۹e) != holder.m۱۴۳۹۲h()) {
                return false;
            } else {
                if (!RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۴۹c() || holder.m۱۴۳۹۱g() == RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۲a(holder.f۱۱۶۳۹e)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۴۶۶۷a(AbstractCd0 holder, int offsetPosition, int position, long deadlineNs) {
            holder.f۱۱۶۵۴t = RecyclerView.this;
            int viewType = holder.m۱۴۳۹۲h();
            long startBindNs = RecyclerView.this.getNanoTime();
            if (deadlineNs != Long.MAX_VALUE && !this.f۱۱۷۰۸g.m۱۴۶۶۱a(viewType, startBindNs, deadlineNs)) {
                return false;
            }
            RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۴a(holder, offsetPosition);
            this.f۱۱۷۰۸g.m۱۴۶۵۸a(holder.m۱۴۳۹۲h(), RecyclerView.this.getNanoTime() - startBindNs);
            m۱۴۶۶۸e(holder);
            if (!RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d()) {
                return true;
            }
            holder.f۱۱۶۴۳i = position;
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۶۷۰a(int position) {
            if (position < 0 || position >= RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۳a()) {
                throw new IndexOutOfBoundsException("invalid position " + position + ". State " + "item count is " + RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۳a() + RecyclerView.this.m۱۴۳۳۴i());
            } else if (!RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d()) {
                return position;
            } else {
                return RecyclerView.this.f۱۱۵۶۷f.m۱۵۱۰۳b(position);
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        public View m۱۴۶۹۵d(int position) {
            return m۱۴۶۸۴b(position, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public View m۱۴۶۸۴b(int position, boolean dryRun) {
            return m۱۴۶۷۲a(position, dryRun, Long.MAX_VALUE).f۱۱۶۳۷c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCd0 m۱۴۶۷۲a(int position, boolean dryRun, long deadlineNs) {
            AbstractCd0 holder;
            boolean fromScrapOrHiddenOrCache;
            Cp rvLayoutParams;
            RecyclerView innerView;
            AbstractCb0 b0Var;
            View view;
            if (position < 0 || position >= RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۳a()) {
                throw new IndexOutOfBoundsException("Invalid item position " + position + "(" + position + "). Item count:" + RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۳a() + RecyclerView.this.m۱۴۳۳۴i());
            }
            boolean fromScrapOrHiddenOrCache2 = false;
            AbstractCd0 holder2 = null;
            boolean z = true;
            if (RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d()) {
                holder2 = m۱۴۶۸۳b(position);
                fromScrapOrHiddenOrCache2 = holder2 != null;
            }
            if (holder2 == null && (holder2 = m۱۴۶۷۱a(position, dryRun)) != null) {
                if (!m۱۴۶۹۶d(holder2)) {
                    if (!dryRun) {
                        holder2.m۱۴۳۷۶a(4);
                        if (holder2.m۱۴۴۰۱q()) {
                            RecyclerView.this.removeDetachedView(holder2.f۱۱۶۳۷c, false);
                            holder2.m۱۴۴۰۹y();
                        } else if (holder2.m۱۴۴۱۰z()) {
                            holder2.m۱۴۳۸۷c();
                        }
                        m۱۴۶۸۷b(holder2);
                    }
                    holder2 = null;
                } else {
                    fromScrapOrHiddenOrCache2 = true;
                }
            }
            if (holder2 == null) {
                int offsetPosition = RecyclerView.this.f۱۱۵۶۷f.m۱۵۱۰۳b(position);
                if (offsetPosition < 0 || offsetPosition >= RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۱a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + position + "(offset:" + offsetPosition + ")." + "state:" + RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۳a() + RecyclerView.this.m۱۴۳۳۴i());
                }
                int type = RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۴۰b(offsetPosition);
                if (RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۴۹c() && (holder2 = m۱۴۶۷۳a(RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۲a(offsetPosition), type, dryRun)) != null) {
                    holder2.f۱۱۶۳۹e = offsetPosition;
                    fromScrapOrHiddenOrCache2 = true;
                }
                if (!(holder2 != null || (b0Var = this.f۱۱۷۰۹h) == null || (view = b0Var.m۱۴۳۶۰a(this, position, type)) == null)) {
                    holder2 = RecyclerView.this.m۱۴۳۱۸e(view);
                    if (holder2 == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.m۱۴۳۳۴i());
                    } else if (holder2.m۱۴۴۰۸x()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.m۱۴۳۳۴i());
                    }
                }
                if (holder2 == null && (holder2 = m۱۴۶۹۴d().m۱۴۶۵۶a(type)) != null) {
                    holder2.m۱۴۴۰۵u();
                    if (RecyclerView.f۱۱۵۲۷D0) {
                        m۱۴۶۶۹f(holder2);
                    }
                }
                if (holder2 == null) {
                    long start = RecyclerView.this.getNanoTime();
                    if (deadlineNs != Long.MAX_VALUE && !this.f۱۱۷۰۸g.m۱۴۶۶۴b(type, start, deadlineNs)) {
                        return null;
                    }
                    RecyclerView recyclerView = RecyclerView.this;
                    AbstractCd0 holder3 = recyclerView.f۱۱۵۸۳n.m۱۴۴۳۳a(recyclerView, type);
                    if (RecyclerView.f۱۱۵۳۰G0 && (innerView = RecyclerView.m۱۴۲۶۶j(holder3.f۱۱۶۳۷c)) != null) {
                        holder3.f۱۱۶۳۸d = new WeakReference<>(innerView);
                    }
                    this.f۱۱۷۰۸g.m۱۴۶۶۳b(type, RecyclerView.this.getNanoTime() - start);
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
            if (fromScrapOrHiddenOrCache && !RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d() && holder.m۱۴۳۸۶b(8192)) {
                holder.m۱۴۳۷۷a(0, 8192);
                if (RecyclerView.this.f۱۱۵۷۶j0.f۱۱۶۲۰k) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    RecyclerView.this.m۱۴۲۸۳a(holder, recyclerView2.f۱۱۵۵۰O.m۱۴۴۶۳a(recyclerView2.f۱۱۵۷۶j0, holder, AbstractCl.m۱۴۴۶۱e(holder) | 4096, holder.m۱۴۳۹۵k()));
                }
            }
            boolean bound = false;
            if (RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d() && holder.m۱۴۳۹۷m()) {
                holder.f۱۱۶۴۳i = position;
            } else if (!holder.m۱۴۳۹۷m() || holder.m۱۴۴۰۴t() || holder.m۱۴۳۹۸n()) {
                bound = m۱۴۶۶۷a(holder, RecyclerView.this.f۱۱۵۶۷f.m۱۵۱۰۳b(position), position, deadlineNs);
            }
            ViewGroup.LayoutParams lp = holder.f۱۱۶۳۷c.getLayoutParams();
            if (lp == null) {
                rvLayoutParams = (Cp) RecyclerView.this.generateDefaultLayoutParams();
                holder.f۱۱۶۳۷c.setLayoutParams(rvLayoutParams);
            } else if (!RecyclerView.this.checkLayoutParams(lp)) {
                rvLayoutParams = (Cp) RecyclerView.this.generateLayoutParams(lp);
                holder.f۱۱۶۳۷c.setLayoutParams(rvLayoutParams);
            } else {
                rvLayoutParams = (Cp) lp;
            }
            rvLayoutParams.f۱۱۶۹۲a = holder;
            if (!fromScrapOrHiddenOrCache || !bound) {
                z = false;
            }
            rvLayoutParams.f۱۱۶۹۵d = z;
            return holder;
        }

        /* renamed from: e  reason: contains not printable characters */
        private void m۱۴۶۶۸e(AbstractCd0 holder) {
            if (RecyclerView.this.m۱۴۳۴۱m()) {
                View itemView = holder.f۱۱۶۳۷c;
                if (android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۲i(itemView) == 0) {
                    android.support.p۰۴۳v4.view.Cu.m۱۳۰۰۷f(itemView, 1);
                }
                if (!android.support.p۰۴۳v4.view.Cu.m۱۳۰۲۳t(itemView)) {
                    holder.m۱۴۳۷۶a(16384);
                    android.support.p۰۴۳v4.view.Cu.m۱۲۹۸۵a(itemView, RecyclerView.this.f۱۱۵۹۰q0.m۱۵۶۵۰b());
                }
            }
        }

        /* renamed from: f  reason: contains not printable characters */
        private void m۱۴۶۶۹f(AbstractCd0 holder) {
            View view = holder.f۱۱۶۳۷c;
            if (view instanceof ViewGroup) {
                m۱۴۶۶۶a((ViewGroup) view, false);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۴۶۶۶a(ViewGroup viewGroup, boolean invalidateThis) {
            for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
                View view = viewGroup.getChildAt(i);
                if (view instanceof ViewGroup) {
                    m۱۴۶۶۶a((ViewGroup) view, true);
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

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۶۸۸b(View view) {
            AbstractCd0 holder = RecyclerView.m۱۴۲۶۷k(view);
            if (holder.m۱۴۴۰۲r()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (holder.m۱۴۴۰۱q()) {
                holder.m۱۴۴۰۹y();
            } else if (holder.m۱۴۴۱۰z()) {
                holder.m۱۴۳۸۷c();
            }
            m۱۴۶۸۷b(holder);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i  reason: contains not printable characters */
        public void m۱۴۷۰۳i() {
            for (int i = this.f۱۱۷۰۴c.size() - 1; i >= 0; i--) {
                m۱۴۶۹۸e(i);
            }
            this.f۱۱۷۰۴c.clear();
            if (RecyclerView.f۱۱۵۳۰G0) {
                RecyclerView.this.f۱۱۵۷۴i0.m۱۵۴۲۹a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public void m۱۴۶۹۸e(int cachedViewIndex) {
            m۱۴۶۷۹a(this.f۱۱۷۰۴c.get(cachedViewIndex), true);
            this.f۱۱۷۰۴c.remove(cachedViewIndex);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۶۸۷b(AbstractCd0 holder) {
            boolean z = false;
            if (holder.m۱۴۴۰۱q() || holder.f۱۱۶۳۷c.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(holder.m۱۴۴۰۱q());
                sb.append(" isAttached:");
                if (holder.f۱۱۶۳۷c.getParent() != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(RecyclerView.this.m۱۴۳۳۴i());
                throw new IllegalArgumentException(sb.toString());
            } else if (holder.m۱۴۴۰۲r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + holder + RecyclerView.this.m۱۴۳۳۴i());
            } else if (!holder.m۱۴۴۰۸x()) {
                boolean transientStatePreventsRecycling = holder.m۱۴۳۸۹e();
                AbstractCg gVar = RecyclerView.this.f۱۱۵۸۳n;
                boolean cached = false;
                boolean recycled = false;
                if ((gVar != null && transientStatePreventsRecycling && gVar.m۱۴۴۳۹a(holder)) || holder.m۱۴۳۹۹o()) {
                    if (this.f۱۱۷۰۷f > 0 && !holder.m۱۴۳۸۶b(526)) {
                        int cachedViewSize = this.f۱۱۷۰۴c.size();
                        if (cachedViewSize >= this.f۱۱۷۰۷f && cachedViewSize > 0) {
                            m۱۴۶۹۸e(0);
                            cachedViewSize--;
                        }
                        int targetCacheIndex = cachedViewSize;
                        if (RecyclerView.f۱۱۵۳۰G0 && cachedViewSize > 0 && !RecyclerView.this.f۱۱۵۷۴i0.m۱۵۴۳۲a(holder.f۱۱۶۳۹e)) {
                            int cacheIndex = cachedViewSize - 1;
                            while (cacheIndex >= 0) {
                                if (!RecyclerView.this.f۱۱۵۷۴i0.m۱۵۴۳۲a(this.f۱۱۷۰۴c.get(cacheIndex).f۱۱۶۳۹e)) {
                                    break;
                                }
                                cacheIndex--;
                            }
                            targetCacheIndex = cacheIndex + 1;
                        }
                        this.f۱۱۷۰۴c.add(targetCacheIndex, holder);
                        cached = true;
                    }
                    if (!cached) {
                        m۱۴۶۷۹a(holder, true);
                        recycled = true;
                    }
                }
                RecyclerView.this.f۱۱۵۷۱h.m۱۵۵۴۶h(holder);
                if (!cached && !recycled && transientStatePreventsRecycling) {
                    holder.f۱۱۶۵۴t = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m۱۴۳۳۴i());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۷۹a(AbstractCd0 holder, boolean dispatchRecycled) {
            RecyclerView.m۱۴۲۶۵e(holder);
            if (holder.m۱۴۳۸۶b(16384)) {
                holder.m۱۴۳۷۷a(0, 16384);
                android.support.p۰۴۳v4.view.Cu.m۱۲۹۸۵a(holder.f۱۱۶۳۷c, (android.support.p۰۴۳v4.view.Cb) null);
            }
            if (dispatchRecycled) {
                m۱۴۶۷۸a(holder);
            }
            holder.f۱۱۶۵۴t = null;
            m۱۴۶۹۴d().m۱۴۶۵۹a(holder);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۸۲a(View view) {
            AbstractCd0 holder = RecyclerView.m۱۴۲۶۷k(view);
            holder.f۱۱۶۵۰p = null;
            holder.f۱۱۶۵۱q = false;
            holder.m۱۴۳۸۷c();
            m۱۴۶۸۷b(holder);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۶۹۳c(View view) {
            AbstractCd0 holder = RecyclerView.m۱۴۲۶۷k(view);
            if (!holder.m۱۴۳۸۶b(12) && holder.m۱۴۴۰۳s() && !RecyclerView.this.m۱۴۲۹۵a(holder)) {
                if (this.f۱۱۷۰۳b == null) {
                    this.f۱۱۷۰۳b = new ArrayList<>();
                }
                holder.m۱۴۳۸۰a(this, true);
                this.f۱۱۷۰۳b.add(holder);
            } else if (!holder.m۱۴۳۹۸n() || holder.m۱۴۴۰۰p() || RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۴۹c()) {
                holder.m۱۴۳۸۰a(this, false);
                this.f۱۱۷۰۲a.add(holder);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m۱۴۳۳۴i());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۶۹۲c(AbstractCd0 holder) {
            if (holder.f۱۱۶۵۱q) {
                this.f۱۱۷۰۳b.remove(holder);
            } else {
                this.f۱۱۷۰۲a.remove(holder);
            }
            holder.f۱۱۶۵۰p = null;
            holder.f۱۱۶۵۱q = false;
            holder.m۱۴۳۸۷c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۶۹۷e() {
            return this.f۱۱۷۰۲a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public View m۱۴۶۸۹c(int index) {
            return this.f۱۱۷۰۲a.get(index).f۱۱۶۳۷c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۶۹۰c() {
            this.f۱۱۷۰۲a.clear();
            ArrayList<AbstractCd0> arrayList = this.f۱۱۷۰۳b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public AbstractCd0 m۱۴۶۸۳b(int position) {
            int changedScrapSize;
            int offsetPosition;
            ArrayList<AbstractCd0> arrayList = this.f۱۱۷۰۳b;
            if (arrayList == null || (changedScrapSize = arrayList.size()) == 0) {
                return null;
            }
            for (int i = 0; i < changedScrapSize; i++) {
                AbstractCd0 holder = this.f۱۱۷۰۳b.get(i);
                if (!holder.m۱۴۴۱۰z() && holder.m۱۴۳۹۳i() == position) {
                    holder.m۱۴۳۷۶a(32);
                    return holder;
                }
            }
            if (RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۴۹c() && (offsetPosition = RecyclerView.this.f۱۱۵۶۷f.m۱۵۱۰۳b(position)) > 0 && offsetPosition < RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۱a()) {
                long id = RecyclerView.this.f۱۱۵۸۳n.m۱۴۴۳۲a(offsetPosition);
                for (int i2 = 0; i2 < changedScrapSize; i2++) {
                    AbstractCd0 holder2 = this.f۱۱۷۰۳b.get(i2);
                    if (!holder2.m۱۴۴۱۰z() && holder2.m۱۴۳۹۱g() == id) {
                        holder2.m۱۴۳۷۶a(32);
                        return holder2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCd0 m۱۴۶۷۱a(int position, boolean dryRun) {
            View view;
            int scrapCount = this.f۱۱۷۰۲a.size();
            for (int i = 0; i < scrapCount; i++) {
                AbstractCd0 holder = this.f۱۱۷۰۲a.get(i);
                if (!holder.m۱۴۴۱۰z() && holder.m۱۴۳۹۳i() == position && !holder.m۱۴۳۹۸n() && (RecyclerView.this.f۱۱۵۷۶j0.f۱۱۶۱۷h || !holder.m۱۴۴۰۰p())) {
                    holder.m۱۴۳۷۶a(32);
                    return holder;
                }
            }
            if (dryRun || (view = RecyclerView.this.f۱۱۵۶۹g.m۱۵۱۳۰b(position)) == null) {
                int cacheSize = this.f۱۱۷۰۴c.size();
                for (int i2 = 0; i2 < cacheSize; i2++) {
                    AbstractCd0 holder2 = this.f۱۱۷۰۴c.get(i2);
                    if (!holder2.m۱۴۳۹۸n() && holder2.m۱۴۳۹۳i() == position) {
                        if (!dryRun) {
                            this.f۱۱۷۰۴c.remove(i2);
                        }
                        return holder2;
                    }
                }
                return null;
            }
            AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(view);
            RecyclerView.this.f۱۱۵۶۹g.m۱۵۱۳۸f(view);
            int layoutIndex = RecyclerView.this.f۱۱۵۶۹g.m۱۵۱۲۹b(view);
            if (layoutIndex != -1) {
                RecyclerView.this.f۱۱۵۶۹g.m۱۵۱۲۳a(layoutIndex);
                m۱۴۶۹۳c(view);
                vh.m۱۴۳۷۶a(8224);
                return vh;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + vh + RecyclerView.this.m۱۴۳۳۴i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCd0 m۱۴۶۷۳a(long id, int type, boolean dryRun) {
            for (int i = this.f۱۱۷۰۲a.size() - 1; i >= 0; i--) {
                AbstractCd0 holder = this.f۱۱۷۰۲a.get(i);
                if (holder.m۱۴۳۹۱g() == id && !holder.m۱۴۴۱۰z()) {
                    if (type == holder.m۱۴۳۹۲h()) {
                        holder.m۱۴۳۷۶a(32);
                        if (holder.m۱۴۴۰۰p() && !RecyclerView.this.f۱۱۵۷۶j0.m۱۴۳۵۸d()) {
                            holder.m۱۴۳۷۷a(2, 14);
                        }
                        return holder;
                    } else if (!dryRun) {
                        this.f۱۱۷۰۲a.remove(i);
                        RecyclerView.this.removeDetachedView(holder.f۱۱۶۳۷c, false);
                        m۱۴۶۸۲a(holder.f۱۱۶۳۷c);
                    }
                }
            }
            for (int i2 = this.f۱۱۷۰۴c.size() - 1; i2 >= 0; i2--) {
                AbstractCd0 holder2 = this.f۱۱۷۰۴c.get(i2);
                if (holder2.m۱۴۳۹۱g() == id) {
                    if (type == holder2.m۱۴۳۹۲h()) {
                        if (!dryRun) {
                            this.f۱۱۷۰۴c.remove(i2);
                        }
                        return holder2;
                    } else if (!dryRun) {
                        m۱۴۶۹۸e(i2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۷۸a(AbstractCd0 holder) {
            AbstractCw wVar = RecyclerView.this.f۱۱۵۸۷p;
            if (wVar != null) {
                wVar.m۱۴۷۰۵a(holder);
            }
            AbstractCg gVar = RecyclerView.this.f۱۱۵۸۳n;
            if (gVar != null) {
                gVar.m۱۴۴۵۱d(holder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f۱۱۵۷۶j0 != null) {
                recyclerView.f۱۱۵۷۱h.m۱۵۵۴۶h(holder);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۸۰a(AbstractCg oldAdapter, AbstractCg newAdapter, boolean compatibleWithPrevious) {
            m۱۴۶۷۴a();
            m۱۴۶۹۴d().m۱۴۶۶۰a(oldAdapter, newAdapter, compatibleWithPrevious);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۶۸۶b(int from, int to) {
            int inBetweenOffset;
            int end;
            int start;
            int i;
            if (from < to) {
                start = from;
                end = to;
                inBetweenOffset = -1;
            } else {
                start = to;
                end = from;
                inBetweenOffset = 1;
            }
            int cachedCount = this.f۱۱۷۰۴c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                AbstractCd0 holder = this.f۱۱۷۰۴c.get(i2);
                if (holder != null && (i = holder.f۱۱۶۳۹e) >= start && i <= end) {
                    if (i == from) {
                        holder.m۱۴۳۷۹a(to - from, false);
                    } else {
                        holder.m۱۴۳۷۹a(inBetweenOffset, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۷۵a(int insertedAt, int count) {
            int cachedCount = this.f۱۱۷۰۴c.size();
            for (int i = 0; i < cachedCount; i++) {
                AbstractCd0 holder = this.f۱۱۷۰۴c.get(i);
                if (holder != null && holder.f۱۱۶۳۹e >= insertedAt) {
                    holder.m۱۴۳۷۹a(count, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۷۶a(int removedFrom, int count, boolean applyToPreLayout) {
            int removedEnd = removedFrom + count;
            for (int i = this.f۱۱۷۰۴c.size() - 1; i >= 0; i--) {
                AbstractCd0 holder = this.f۱۱۷۰۴c.get(i);
                if (holder != null) {
                    int i2 = holder.f۱۱۶۳۹e;
                    if (i2 >= removedEnd) {
                        holder.m۱۴۳۷۹a(-count, applyToPreLayout);
                    } else if (i2 >= removedFrom) {
                        holder.m۱۴۳۷۶a(8);
                        m۱۴۶۹۸e(i);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۷۷a(AbstractCb0 extension) {
            this.f۱۱۷۰۹h = extension;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۸۱a(Cu pool) {
            Cu uVar = this.f۱۱۷۰۸g;
            if (uVar != null) {
                uVar.m۱۴۶۶۵c();
            }
            this.f۱۱۷۰۸g = pool;
            if (this.f۱۱۷۰۸g != null && RecyclerView.this.getAdapter() != null) {
                this.f۱۱۷۰۸g.m۱۴۶۵۷a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public Cu m۱۴۶۹۴d() {
            if (this.f۱۱۷۰۸g == null) {
                this.f۱۱۷۰۸g = new Cu();
            }
            return this.f۱۱۷۰۸g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۶۹۱c(int positionStart, int itemCount) {
            int pos;
            int positionEnd = positionStart + itemCount;
            for (int i = this.f۱۱۷۰۴c.size() - 1; i >= 0; i--) {
                AbstractCd0 holder = this.f۱۱۷۰۴c.get(i);
                if (holder != null && (pos = holder.f۱۱۶۳۹e) >= positionStart && pos < positionEnd) {
                    holder.m۱۴۳۷۶a(2);
                    m۱۴۶۹۸e(i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h  reason: contains not printable characters */
        public void m۱۴۷۰۲h() {
            int cachedCount = this.f۱۱۷۰۴c.size();
            for (int i = 0; i < cachedCount; i++) {
                AbstractCd0 holder = this.f۱۱۷۰۴c.get(i);
                if (holder != null) {
                    holder.m۱۴۳۷۶a(6);
                    holder.m۱۴۳۸۲a((Object) null);
                }
            }
            AbstractCg gVar = RecyclerView.this.f۱۱۵۸۳n;
            if (gVar == null || !gVar.m۱۴۴۴۹c()) {
                m۱۴۷۰۳i();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۶۸۵b() {
            int cachedCount = this.f۱۱۷۰۴c.size();
            for (int i = 0; i < cachedCount; i++) {
                this.f۱۱۷۰۴c.get(i).m۱۴۳۷۵a();
            }
            int scrapCount = this.f۱۱۷۰۲a.size();
            for (int i2 = 0; i2 < scrapCount; i2++) {
                this.f۱۱۷۰۲a.get(i2).m۱۴۳۷۵a();
            }
            ArrayList<AbstractCd0> arrayList = this.f۱۱۷۰۳b;
            if (arrayList != null) {
                int changedScrapCount = arrayList.size();
                for (int i3 = 0; i3 < changedScrapCount; i3++) {
                    this.f۱۱۷۰۳b.get(i3).m۱۴۳۷۵a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g  reason: contains not printable characters */
        public void m۱۴۷۰۱g() {
            int cachedCount = this.f۱۱۷۰۴c.size();
            for (int i = 0; i < cachedCount; i++) {
                Cp layoutParams = (Cp) this.f۱۱۷۰۴c.get(i).f۱۱۶۳۷c.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f۱۱۶۹۴c = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g  reason: invalid class name */
    public static abstract class AbstractCg<VH extends AbstractCd0> {

        /* renamed from: a  reason: contains not printable characters */
        private final Ch f۱۱۶۵۷a = new Ch();

        /* renamed from: b  reason: contains not printable characters */
        private boolean f۱۱۶۵۸b = false;

        /* renamed from: a  reason: contains not printable characters */
        public abstract int m۱۴۴۳۱a();

        /* renamed from: b  reason: contains not printable characters */
        public abstract VH m۱۴۴۴۱b(ViewGroup viewGroup, int i);

        /* renamed from: b  reason: contains not printable characters */
        public abstract void m۱۴۴۴۳b(VH vh, int i);

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۳۵a(VH holder, int position, List<Object> list) {
            m۱۴۴۴۳b(holder, position);
        }

        /* renamed from: a  reason: contains not printable characters */
        public final VH m۱۴۴۳۳a(ViewGroup parent, int viewType) {
            try {
                Ca.m۱۰۴۹۷a("RV CreateView");
                VH holder = m۱۴۴۴۱b(parent, viewType);
                if (holder.f۱۱۶۳۷c.getParent() == null) {
                    holder.f۱۱۶۴۲h = viewType;
                    return holder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                Ca.m۱۰۴۹۶a();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۴۴۳۴a(VH holder, int position) {
            holder.f۱۱۶۳۹e = position;
            if (m۱۴۴۴۹c()) {
                holder.f۱۱۶۴۱g = m۱۴۴۳۲a(position);
            }
            holder.m۱۴۳۷۷a(1, 519);
            Ca.m۱۰۴۹۷a("RV OnBindView");
            m۱۴۴۳۵a(holder, position, holder.m۱۴۳۹۵k());
            holder.m۱۴۳۸۴b();
            ViewGroup.LayoutParams layoutParams = holder.f۱۱۶۳۷c.getLayoutParams();
            if (layoutParams instanceof Cp) {
                ((Cp) layoutParams).f۱۱۶۹۴c = true;
            }
            Ca.m۱۰۴۹۶a();
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۴۴۰b(int position) {
            return 0;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۳۸a(boolean hasStableIds) {
            if (!m۱۴۴۴۶b()) {
                this.f۱۱۶۵۸b = hasStableIds;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: a  reason: contains not printable characters */
        public long m۱۴۴۳۲a(int position) {
            return -1;
        }

        /* renamed from: c  reason: contains not printable characters */
        public final boolean m۱۴۴۴۹c() {
            return this.f۱۱۶۵۸b;
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۴۵۱d(VH vh) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۴۳۹a(VH vh) {
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۴۲b(VH vh) {
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۴۴۸c(VH vh) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public final boolean m۱۴۴۴۶b() {
            return this.f۱۱۶۵۷a.m۱۴۴۵۴a();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۳۶a(AbstractCi observer) {
            this.f۱۱۶۵۷a.registerObserver(observer);
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۴۴b(AbstractCi observer) {
            this.f۱۱۶۵۷a.unregisterObserver(observer);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۳۷a(RecyclerView recyclerView) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۴۵b(RecyclerView recyclerView) {
        }

        /* renamed from: d  reason: contains not printable characters */
        public final void m۱۴۴۵۰d() {
            this.f۱۱۶۵۷a.m۱۴۴۵۵b();
        }

        /* renamed from: c  reason: contains not printable characters */
        public final void m۱۴۴۴۷c(int position) {
            this.f۱۱۶۵۷a.m۱۴۴۵۲a(position, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۳۰۶b(View child) {
        AbstractCd0 viewHolder = m۱۴۲۶۷k(child);
        m۱۴۳۳۳h(child);
        AbstractCg gVar = this.f۱۱۵۸۳n;
        if (!(gVar == null || viewHolder == null)) {
            gVar.m۱۴۴۴۸c(viewHolder);
        }
        List<AbstractCq> list = this.f۱۱۵۴۰E;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.f۱۱۵۴۰E.get(i).m۱۴۶۴۷b(child);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۹a(View child) {
        AbstractCd0 viewHolder = m۱۴۲۶۷k(child);
        m۱۴۳۲۹g(child);
        AbstractCg gVar = this.f۱۱۵۸۳n;
        if (!(gVar == null || viewHolder == null)) {
            gVar.m۱۴۴۴۲b(viewHolder);
        }
        List<AbstractCq> list = this.f۱۱۵۴۰E;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.f۱۱۵۴۰E.get(i).m۱۴۶۴۶a(child);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o  reason: invalid class name */
    public static abstract class AbstractCo {

        /* renamed from: a  reason: contains not printable characters */
        Cd0 f۱۱۶۶۸a;

        /* renamed from: b  reason: contains not printable characters */
        RecyclerView f۱۱۶۶۹b;

        /* renamed from: c  reason: contains not printable characters */
        private final Cp1.AbstractCb f۱۱۶۷۰c = new Ca();

        /* renamed from: d  reason: contains not printable characters */
        private final Cp1.AbstractCb f۱۱۶۷۱d = new Cb();

        /* renamed from: e  reason: contains not printable characters */
        Cp1 f۱۱۶۷۲e = new Cp1(this.f۱۱۶۷۰c);

        /* renamed from: f  reason: contains not printable characters */
        Cp1 f۱۱۶۷۳f = new Cp1(this.f۱۱۶۷۱d);

        /* renamed from: g  reason: contains not printable characters */
        AbstractCz f۱۱۶۷۴g;

        /* renamed from: h  reason: contains not printable characters */
        boolean f۱۱۶۷۵h = false;

        /* renamed from: i  reason: contains not printable characters */
        boolean f۱۱۶۷۶i = false;

        /* renamed from: j  reason: contains not printable characters */
        boolean f۱۱۶۷۷j = false;

        /* renamed from: k  reason: contains not printable characters */
        private boolean f۱۱۶۷۸k = true;

        /* renamed from: l  reason: contains not printable characters */
        private boolean f۱۱۶۷۹l = true;

        /* renamed from: m  reason: contains not printable characters */
        int f۱۱۶۸۰m;

        /* renamed from: n  reason: contains not printable characters */
        boolean f۱۱۶۸۱n;

        /* renamed from: o  reason: contains not printable characters */
        private int f۱۱۶۸۲o;

        /* renamed from: p  reason: contains not printable characters */
        private int f۱۱۶۸۳p;

        /* renamed from: q  reason: contains not printable characters */
        private int f۱۱۶۸۴q;

        /* renamed from: r  reason: contains not printable characters */
        private int f۱۱۶۸۵r;

        /* renamed from: android.support.v7.widget.RecyclerView$o$c  reason: invalid class name */
        public interface AbstractCc {
            /* renamed from: a  reason: contains not printable characters */
            void m۱۴۶۴۱a(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$o$d  reason: invalid class name */
        public static class Cd {

            /* renamed from: a  reason: contains not printable characters */
            public int f۱۱۶۸۸a;

            /* renamed from: b  reason: contains not printable characters */
            public int f۱۱۶۸۹b;

            /* renamed from: c  reason: contains not printable characters */
            public boolean f۱۱۶۹۰c;

            /* renamed from: d  reason: contains not printable characters */
            public boolean f۱۱۶۹۱d;
        }

        /* renamed from: c  reason: contains not printable characters */
        public abstract Cp m۱۴۵۷۲c();

        /* renamed from: android.support.v7.widget.RecyclerView$o$a  reason: invalid class name */
        class Ca implements Cp1.AbstractCb {
            Ca() {
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: a  reason: contains not printable characters */
            public View m۱۴۶۳۳a(int index) {
                return AbstractCo.this.m۱۴۵۷۳c(index);
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: b  reason: contains not printable characters */
            public int m۱۴۶۳۴b() {
                return AbstractCo.this.m۱۴۶۱۶n();
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: a  reason: contains not printable characters */
            public int m۱۴۶۳۱a() {
                return AbstractCo.this.m۱۴۶۲۱q() - AbstractCo.this.m۱۴۶۱۸o();
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: b  reason: contains not printable characters */
            public int m۱۴۶۳۵b(View view) {
                return AbstractCo.this.m۱۴۵۹۵f(view) - ((ViewGroup.MarginLayoutParams) ((Cp) view.getLayoutParams())).leftMargin;
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: a  reason: contains not printable characters */
            public int m۱۴۶۳۲a(View view) {
                return AbstractCo.this.m۱۴۶۰۷i(view) + ((ViewGroup.MarginLayoutParams) ((Cp) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$o$b  reason: invalid class name */
        class Cb implements Cp1.AbstractCb {
            Cb() {
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: a  reason: contains not printable characters */
            public View m۱۴۶۳۸a(int index) {
                return AbstractCo.this.m۱۴۵۷۳c(index);
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: b  reason: contains not printable characters */
            public int m۱۴۶۳۹b() {
                return AbstractCo.this.m۱۴۶۲۰p();
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: a  reason: contains not printable characters */
            public int m۱۴۶۳۶a() {
                return AbstractCo.this.m۱۴۶۰۳h() - AbstractCo.this.m۱۴۶۱۴m();
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: b  reason: contains not printable characters */
            public int m۱۴۶۴۰b(View view) {
                return AbstractCo.this.m۱۴۶۰۹j(view) - ((ViewGroup.MarginLayoutParams) ((Cp) view.getLayoutParams())).topMargin;
            }

            @Override // android.support.p۰۴۷v7.widget.Cp1.AbstractCb
            /* renamed from: a  reason: contains not printable characters */
            public int m۱۴۶۳۷a(View view) {
                return AbstractCo.this.m۱۴۵۹۰e(view) + ((ViewGroup.MarginLayoutParams) ((Cp) view.getLayoutParams())).bottomMargin;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f  reason: contains not printable characters */
        public void m۱۴۵۹۷f(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f۱۱۶۶۹b = null;
                this.f۱۱۶۶۸a = null;
                this.f۱۱۶۸۴q = 0;
                this.f۱۱۶۸۵r = 0;
            } else {
                this.f۱۱۶۶۹b = recyclerView;
                this.f۱۱۶۶۸a = recyclerView.f۱۱۵۶۹g;
                this.f۱۱۶۸۴q = recyclerView.getWidth();
                this.f۱۱۶۸۵r = recyclerView.getHeight();
            }
            this.f۱۱۶۸۲o = 1073741824;
            this.f۱۱۶۸۳p = 1073741824;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۰b(int wSpec, int hSpec) {
            this.f۱۱۶۸۴q = View.MeasureSpec.getSize(wSpec);
            this.f۱۱۶۸۲o = View.MeasureSpec.getMode(wSpec);
            if (this.f۱۱۶۸۲o == 0 && !RecyclerView.f۱۱۵۲۸E0) {
                this.f۱۱۶۸۴q = 0;
            }
            this.f۱۱۶۸۵r = View.MeasureSpec.getSize(hSpec);
            this.f۱۱۶۸۳p = View.MeasureSpec.getMode(hSpec);
            if (this.f۱۱۶۸۳p == 0 && !RecyclerView.f۱۱۵۲۸E0) {
                this.f۱۱۶۸۵r = 0;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۵۸۵d(int widthSpec, int heightSpec) {
            int count = m۱۴۵۸۸e();
            if (count == 0) {
                this.f۱۱۶۶۹b.m۱۴۳۱۲c(widthSpec, heightSpec);
                return;
            }
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for (int i = 0; i < count; i++) {
                View child = m۱۴۵۷۳c(i);
                Rect bounds = this.f۱۱۶۶۹b.f۱۱۵۷۷k;
                m۱۴۵۶۷b(child, bounds);
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
            this.f۱۱۶۶۹b.f۱۱۵۷۷k.set(minX, minY, maxX, maxY);
            m۱۴۵۱۷a(this.f۱۱۶۶۹b.f۱۱۵۷۷k, widthSpec, heightSpec);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۷a(Rect childrenBounds, int wSpec, int hSpec) {
            m۱۴۵۷۵c(m۱۴۴۹۴a(wSpec, childrenBounds.width() + m۱۴۶۱۶n() + m۱۴۶۱۸o(), m۱۴۶۱۲l()), m۱۴۴۹۴a(hSpec, childrenBounds.height() + m۱۴۶۲۰p() + m۱۴۶۱۴m(), m۱۴۶۱۰k()));
        }

        /* renamed from: y  reason: contains not printable characters */
        public void m۱۴۶۲۹y() {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public static int m۱۴۴۹۴a(int spec, int desired, int min) {
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

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۴۱a(String message) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                recyclerView.m۱۴۲۹۰a(message);
            }
        }

        /* renamed from: u  reason: contains not printable characters */
        public boolean m۱۴۶۲۵u() {
            return this.f۱۱۶۷۷j;
        }

        /* renamed from: C  reason: contains not printable characters */
        public boolean m۱۴۵۰۵C() {
            return false;
        }

        /* renamed from: v  reason: contains not printable characters */
        public final boolean m۱۴۶۲۶v() {
            return this.f۱۱۶۷۹l;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۴a(int dx, int dy, Ca0 state, AbstractCc layoutPrefetchRegistry) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۵a(int adapterItemCount, AbstractCc layoutPrefetchRegistry) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۶a(RecyclerView view) {
            this.f۱۱۶۷۶i = true;
            m۱۴۵۶۲b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۰a(RecyclerView view, Cv recycler) {
            this.f۱۱۶۷۶i = false;
            m۱۴۵۶۴b(view, recycler);
        }

        /* renamed from: t  reason: contains not printable characters */
        public boolean m۱۴۶۲۴t() {
            return this.f۱۱۶۷۶i;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۵۵a(Runnable action) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(action);
            }
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۲b(RecyclerView view) {
        }

        @Deprecated
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۵۷۷c(RecyclerView view) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۴b(RecyclerView view, Cv recycler) {
            m۱۴۵۷۷c(view);
        }

        /* renamed from: f  reason: contains not printable characters */
        public boolean m۱۴۵۹۸f() {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            return recyclerView != null && recyclerView.f۱۱۵۷۳i;
        }

        /* renamed from: e  reason: contains not printable characters */
        public void m۱۴۵۹۲e(Cv recycler, Ca0 state) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: g  reason: contains not printable characters */
        public void m۱۴۶۰۲g(Ca0 state) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۴a(Cp lp) {
            return lp != null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cp m۱۴۵۱۰a(ViewGroup.LayoutParams lp) {
            if (lp instanceof Cp) {
                return new Cp((Cp) lp);
            }
            if (lp instanceof ViewGroup.MarginLayoutParams) {
                return new Cp((ViewGroup.MarginLayoutParams) lp);
            }
            return new Cp(lp);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cp m۱۴۵۰۹a(Context c, AttributeSet attrs) {
            return new Cp(c, attrs);
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۵۰۶a(int dx, Cv recycler, Ca0 state) {
            return 0;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۵۵۶b(int dy, Cv recycler, Ca0 state) {
            return 0;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۲a() {
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۵۶۸b() {
            return false;
        }

        /* renamed from: h  reason: contains not printable characters */
        public void m۱۴۶۰۵h(int position) {
        }

        /* renamed from: w  reason: contains not printable characters */
        public boolean m۱۴۶۲۷w() {
            AbstractCz zVar = this.f۱۱۶۷۴g;
            return zVar != null && zVar.m۱۴۷۱۵c();
        }

        /* renamed from: j  reason: contains not printable characters */
        public int m۱۴۶۰۸j() {
            return android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۴k(this.f۱۱۶۶۹b);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۱a(View child) {
            m۱۴۵۳۲a(child, -1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۲a(View child, int index) {
            m۱۴۴۹۹a(child, index, true);
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۵b(View child) {
            m۱۴۵۶۶b(child, -1);
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۶b(View child, int index) {
            m۱۴۴۹۹a(child, index, false);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۴۴۹۹a(View child, int index, boolean disappearing) {
            AbstractCd0 holder = RecyclerView.m۱۴۲۶۷k(child);
            if (disappearing || holder.m۱۴۴۰۰p()) {
                this.f۱۱۶۶۹b.f۱۱۵۷۱h.m۱۵۵۳۴a(holder);
            } else {
                this.f۱۱۶۶۹b.f۱۱۵۷۱h.m۱۵۵۴۵g(holder);
            }
            Cp lp = (Cp) child.getLayoutParams();
            if (holder.m۱۴۴۱۰z() || holder.m۱۴۴۰۱q()) {
                if (holder.m۱۴۴۰۱q()) {
                    holder.m۱۴۴۰۹y();
                } else {
                    holder.m۱۴۳۸۷c();
                }
                this.f۱۱۶۶۸a.m۱۵۱۲۵a(child, index, child.getLayoutParams(), false);
            } else if (child.getParent() == this.f۱۱۶۶۹b) {
                int currentIndex = this.f۱۱۶۶۸a.m۱۵۱۲۹b(child);
                if (index == -1) {
                    index = this.f۱۱۶۶۸a.m۱۵۱۲۲a();
                }
                if (currentIndex == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f۱۱۶۶۹b.indexOfChild(child) + this.f۱۱۶۶۹b.m۱۴۳۳۴i());
                } else if (currentIndex != index) {
                    this.f۱۱۶۶۹b.f۱۱۵۸۵o.m۱۴۵۱۳a(currentIndex, index);
                }
            } else {
                this.f۱۱۶۶۸a.m۱۵۱۲۶a(child, index, false);
                lp.f۱۱۶۹۴c = true;
                AbstractCz zVar = this.f۱۱۶۷۴g;
                if (zVar != null && zVar.m۱۴۷۱۵c()) {
                    this.f۱۱۶۷۴g.m۱۴۷۱۳a(child);
                }
            }
            if (lp.f۱۱۶۹۵d) {
                holder.f۱۱۶۳۷c.invalidate();
                lp.f۱۱۶۹۵d = false;
            }
        }

        /* renamed from: o  reason: contains not printable characters */
        public void m۱۴۶۱۹o(View child) {
            this.f۱۱۶۶۸a.m۱۵۱۳۵d(child);
        }

        /* renamed from: g  reason: contains not printable characters */
        public void m۱۴۶۰۱g(int index) {
            if (m۱۴۵۷۳c(index) != null) {
                this.f۱۱۶۶۸a.m۱۵۱۳۶e(index);
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        public int m۱۴۵۸۰d() {
            return -1;
        }

        /* renamed from: l  reason: contains not printable characters */
        public int m۱۴۶۱۳l(View view) {
            return ((Cp) view.getLayoutParams()).m۱۴۶۴۲a();
        }

        /* renamed from: c  reason: contains not printable characters */
        public View m۱۴۵۷۴c(View view) {
            View found;
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView == null || (found = recyclerView.m۱۴۳۱۰c(view)) == null || this.f۱۱۶۶۸a.m۱۵۱۳۳c(found)) {
                return null;
            }
            return found;
        }

        /* renamed from: b  reason: contains not printable characters */
        public View m۱۴۵۵۹b(int position) {
            int childCount = m۱۴۵۸۸e();
            for (int i = 0; i < childCount; i++) {
                View child = m۱۴۵۷۳c(i);
                AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(child);
                if (vh != null && vh.m۱۴۳۹۳i() == position && !vh.m۱۴۴۰۸x() && (this.f۱۱۶۶۹b.f۱۱۵۷۶j0.m۱۴۳۵۸d() || !vh.m۱۴۴۰۰p())) {
                    return child;
                }
            }
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۲a(int index) {
            m۱۴۴۹۷a(index, m۱۴۵۷۳c(index));
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۴۴۹۷a(int index, View view) {
            this.f۱۱۶۶۸a.m۱۵۱۲۳a(index);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۵a(View child, int index, Cp lp) {
            AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(child);
            if (vh.m۱۴۴۰۰p()) {
                this.f۱۱۶۶۹b.f۱۱۵۷۱h.m۱۵۵۳۴a(vh);
            } else {
                this.f۱۱۶۶۹b.f۱۱۵۷۱h.m۱۵۵۴۵g(vh);
            }
            this.f۱۱۶۶۸a.m۱۵۱۲۵a(child, index, lp, vh.m۱۴۴۰۰p());
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۵۷۹c(View child, int index) {
            m۱۴۵۳۵a(child, index, (Cp) child.getLayoutParams());
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۳a(int fromIndex, int toIndex) {
            View view = m۱۴۵۷۳c(fromIndex);
            if (view != null) {
                m۱۴۵۱۲a(fromIndex);
                m۱۴۵۷۹c(view, toIndex);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + fromIndex + this.f۱۱۶۶۹b.toString());
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۸a(View child, Cv recycler) {
            m۱۴۶۱۹o(child);
            recycler.m۱۴۶۸۸b(child);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۶a(int index, Cv recycler) {
            View view = m۱۴۵۷۳c(index);
            m۱۴۶۰۱g(index);
            recycler.m۱۴۶۸۸b(view);
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۵۸۸e() {
            Cd0 d0Var = this.f۱۱۶۶۸a;
            if (d0Var != null) {
                return d0Var.m۱۵۱۲۲a();
            }
            return 0;
        }

        /* renamed from: c  reason: contains not printable characters */
        public View m۱۴۵۷۳c(int index) {
            Cd0 d0Var = this.f۱۱۶۶۸a;
            if (d0Var != null) {
                return d0Var.m۱۵۱۳۱c(index);
            }
            return null;
        }

        /* renamed from: r  reason: contains not printable characters */
        public int m۱۴۶۲۲r() {
            return this.f۱۱۶۸۲o;
        }

        /* renamed from: i  reason: contains not printable characters */
        public int m۱۴۶۰۶i() {
            return this.f۱۱۶۸۳p;
        }

        /* renamed from: q  reason: contains not printable characters */
        public int m۱۴۶۲۱q() {
            return this.f۱۱۶۸۴q;
        }

        /* renamed from: h  reason: contains not printable characters */
        public int m۱۴۶۰۳h() {
            return this.f۱۱۶۸۵r;
        }

        /* renamed from: n  reason: contains not printable characters */
        public int m۱۴۶۱۶n() {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: p  reason: contains not printable characters */
        public int m۱۴۶۲۰p() {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: o  reason: contains not printable characters */
        public int m۱۴۶۱۸o() {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: m  reason: contains not printable characters */
        public int m۱۴۶۱۴m() {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: g  reason: contains not printable characters */
        public View m۱۴۶۰۰g() {
            View focused;
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView == null || (focused = recyclerView.getFocusedChild()) == null || this.f۱۱۶۶۸a.m۱۵۱۳۳c(focused)) {
                return null;
            }
            return focused;
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۵۸۴d(int dx) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                recyclerView.m۱۴۳۲۰e(dx);
            }
        }

        /* renamed from: e  reason: contains not printable characters */
        public void m۱۴۵۹۱e(int dy) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null) {
                recyclerView.m۱۴۳۲۴f(dy);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۱a(Cv recycler) {
            for (int i = m۱۴۵۸۸e() - 1; i >= 0; i--) {
                m۱۴۴۹۸a(recycler, i, m۱۴۵۷۳c(i));
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۴۴۹۸a(Cv recycler, int index, View view) {
            AbstractCd0 viewHolder = RecyclerView.m۱۴۲۶۷k(view);
            if (!viewHolder.m۱۴۴۰۸x()) {
                if (!viewHolder.m۱۴۳۹۸n() || viewHolder.m۱۴۴۰۰p() || this.f۱۱۶۶۹b.f۱۱۵۸۳n.m۱۴۴۴۹c()) {
                    m۱۴۵۱۲a(index);
                    recycler.m۱۴۶۹۳c(view);
                    this.f۱۱۶۶۹b.f۱۱۵۷۱h.m۱۵۵۴۲d(viewHolder);
                    return;
                }
                m۱۴۶۰۱g(index);
                recycler.m۱۴۶۸۷b(viewHolder);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۵۷۶c(Cv recycler) {
            int scrapCount = recycler.m۱۴۶۹۷e();
            for (int i = scrapCount - 1; i >= 0; i--) {
                View scrap = recycler.m۱۴۶۸۹c(i);
                AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(scrap);
                if (!vh.m۱۴۴۰۸x()) {
                    vh.m۱۴۳۸۳a(false);
                    if (vh.m۱۴۴۰۲r()) {
                        this.f۱۱۶۶۹b.removeDetachedView(scrap, false);
                    }
                    AbstractCl lVar = this.f۱۱۶۶۹b.f۱۱۵۵۰O;
                    if (lVar != null) {
                        lVar.m۱۴۴۷۴c(vh);
                    }
                    vh.m۱۴۳۸۳a(true);
                    recycler.m۱۴۶۸۲a(scrap);
                }
            }
            recycler.m۱۴۶۹۰c();
            if (scrapCount > 0) {
                this.f۱۱۶۶۹b.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۵۶۹b(View child, int widthSpec, int heightSpec, Cp lp) {
            return !this.f۱۱۶۷۸k || !m۱۴۵۰۰b(child.getMeasuredWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !m۱۴۵۰۰b(child.getMeasuredHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۵۲a(View child, int widthSpec, int heightSpec, Cp lp) {
            return child.isLayoutRequested() || !this.f۱۱۶۷۸k || !m۱۴۵۰۰b(child.getWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !m۱۴۵۰۰b(child.getHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
        }

        /* renamed from: b  reason: contains not printable characters */
        private static boolean m۱۴۵۰۰b(int childSize, int spec, int dimension) {
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

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۳a(View child, int widthUsed, int heightUsed) {
            Cp lp = (Cp) child.getLayoutParams();
            Rect insets = this.f۱۱۶۶۹b.m۱۴۳۲۲f(child);
            int widthUsed2 = widthUsed + insets.left + insets.right;
            int heightUsed2 = heightUsed + insets.top + insets.bottom;
            int widthSpec = m۱۴۴۹۵a(m۱۴۶۲۱q(), m۱۴۶۲۲r(), m۱۴۶۱۶n() + m۱۴۶۱۸o() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin + widthUsed2, ((ViewGroup.MarginLayoutParams) lp).width, m۱۴۵۴۲a());
            int heightSpec = m۱۴۴۹۵a(m۱۴۶۰۳h(), m۱۴۶۰۶i(), m۱۴۶۲۰p() + m۱۴۶۱۴m() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + heightUsed2, ((ViewGroup.MarginLayoutParams) lp).height, m۱۴۵۶۸b());
            if (m۱۴۵۵۲a(child, widthSpec, heightSpec, lp)) {
                child.measure(widthSpec, heightSpec);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r8 != 1073741824) goto L_0x0043;
         */
        /* renamed from: a  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m۱۴۴۹۵a(int r7, int r8, int r9, int r10, boolean r11) {
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
            throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo.m۱۴۴۹۵a(int, int, int, int, boolean):int");
        }

        /* renamed from: h  reason: contains not printable characters */
        public int m۱۴۶۰۴h(View child) {
            Rect insets = ((Cp) child.getLayoutParams()).f۱۱۶۹۳b;
            return child.getMeasuredWidth() + insets.left + insets.right;
        }

        /* renamed from: g  reason: contains not printable characters */
        public int m۱۴۵۹۹g(View child) {
            Rect insets = ((Cp) child.getLayoutParams()).f۱۱۶۹۳b;
            return child.getMeasuredHeight() + insets.top + insets.bottom;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۴a(View child, int left, int top, int right, int bottom) {
            Cp lp = (Cp) child.getLayoutParams();
            Rect insets = lp.f۱۱۶۹۳b;
            child.layout(insets.left + left + ((ViewGroup.MarginLayoutParams) lp).leftMargin, insets.top + top + ((ViewGroup.MarginLayoutParams) lp).topMargin, (right - insets.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (bottom - insets.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۹a(View child, boolean includeDecorInsets, Rect out) {
            Matrix childMatrix;
            if (includeDecorInsets) {
                Rect insets = ((Cp) child.getLayoutParams()).f۱۱۶۹۳b;
                out.set(-insets.left, -insets.top, child.getWidth() + insets.right, child.getHeight() + insets.bottom);
            } else {
                out.set(0, 0, child.getWidth(), child.getHeight());
            }
            if (!(this.f۱۱۶۶۹b == null || (childMatrix = child.getMatrix()) == null || childMatrix.isIdentity())) {
                RectF tempRectF = this.f۱۱۶۶۹b.f۱۱۵۸۱m;
                tempRectF.set(out);
                childMatrix.mapRect(tempRectF);
                out.set((int) Math.floor((double) tempRectF.left), (int) Math.floor((double) tempRectF.top), (int) Math.ceil((double) tempRectF.right), (int) Math.ceil((double) tempRectF.bottom));
            }
            out.offset(child.getLeft(), child.getTop());
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۷b(View view, Rect outBounds) {
            RecyclerView.m۱۴۲۵۶a(view, outBounds);
        }

        /* renamed from: f  reason: contains not printable characters */
        public int m۱۴۵۹۵f(View child) {
            return child.getLeft() - m۱۴۶۱۱k(child);
        }

        /* renamed from: j  reason: contains not printable characters */
        public int m۱۴۶۰۹j(View child) {
            return child.getTop() - m۱۴۶۱۷n(child);
        }

        /* renamed from: i  reason: contains not printable characters */
        public int m۱۴۶۰۷i(View child) {
            return child.getRight() + m۱۴۶۱۵m(child);
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۵۹۰e(View child) {
            return child.getBottom() + m۱۴۵۸۲d(child);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۶a(View child, Rect outRect) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView == null) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(recyclerView.m۱۴۳۲۲f(child));
            }
        }

        /* renamed from: n  reason: contains not printable characters */
        public int m۱۴۶۱۷n(View child) {
            return ((Cp) child.getLayoutParams()).f۱۱۶۹۳b.top;
        }

        /* renamed from: d  reason: contains not printable characters */
        public int m۱۴۵۸۲d(View child) {
            return ((Cp) child.getLayoutParams()).f۱۱۶۹۳b.bottom;
        }

        /* renamed from: k  reason: contains not printable characters */
        public int m۱۴۶۱۱k(View child) {
            return ((Cp) child.getLayoutParams()).f۱۱۶۹۳b.left;
        }

        /* renamed from: m  reason: contains not printable characters */
        public int m۱۴۶۱۵m(View child) {
            return ((Cp) child.getLayoutParams()).f۱۱۶۹۳b.right;
        }

        /* renamed from: a  reason: contains not printable characters */
        public View m۱۴۵۱۱a(View focused, int direction, Cv recycler, Ca0 state) {
            return null;
        }

        /* renamed from: d  reason: contains not printable characters */
        public View m۱۴۵۸۳d(View focused, int direction) {
            return null;
        }

        /* renamed from: b  reason: contains not printable characters */
        private int[] m۱۴۵۰۱b(RecyclerView parent, View child, Rect rect, boolean immediate) {
            int dx;
            int dy;
            int[] out = new int[2];
            int parentLeft = m۱۴۶۱۶n();
            int parentTop = m۱۴۶۲۰p();
            int parentRight = m۱۴۶۲۱q() - m۱۴۶۱۸o();
            int parentBottom = m۱۴۶۰۳h() - m۱۴۶۱۴m();
            int childLeft = (child.getLeft() + rect.left) - child.getScrollX();
            int childTop = (child.getTop() + rect.top) - child.getScrollY();
            int childRight = rect.width() + childLeft;
            int offScreenLeft = Math.min(0, childLeft - parentLeft);
            int offScreenTop = Math.min(0, childTop - parentTop);
            int offScreenRight = Math.max(0, childRight - parentRight);
            int offScreenBottom = Math.max(0, (rect.height() + childTop) - parentBottom);
            if (m۱۴۶۰۸j() == 1) {
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

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۸a(RecyclerView parent, View child, Rect rect, boolean immediate) {
            return m۱۴۵۴۹a(parent, child, rect, immediate, false);
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۹a(RecyclerView parent, View child, Rect rect, boolean immediate, boolean focusedChildVisible) {
            int[] scrollAmount = m۱۴۵۰۱b(parent, child, rect, immediate);
            int dx = scrollAmount[0];
            int dy = scrollAmount[1];
            if ((focusedChildVisible && !m۱۴۵۰۲d(parent, dx, dy)) || (dx == 0 && dy == 0)) {
                return false;
            }
            if (immediate) {
                parent.scrollBy(dx, dy);
            } else {
                parent.m۱۴۳۳۵i(dx, dy);
            }
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۵۴a(View child, boolean completelyVisible, boolean acceptEndPointInclusion) {
            boolean isViewFullyVisible = this.f۱۱۶۷۲e.m۱۵۵۱۵a(child, 24579) && this.f۱۱۶۷۳f.m۱۵۵۱۵a(child, 24579);
            if (completelyVisible) {
                return isViewFullyVisible;
            }
            if (!isViewFullyVisible) {
                return true;
            }
            return false;
        }

        /* renamed from: d  reason: contains not printable characters */
        private boolean m۱۴۵۰۲d(RecyclerView parent, int dx, int dy) {
            View focusedChild = parent.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int parentLeft = m۱۴۶۱۶n();
            int parentTop = m۱۴۶۲۰p();
            int parentRight = m۱۴۶۲۱q() - m۱۴۶۱۸o();
            int parentBottom = m۱۴۶۰۳h() - m۱۴۶۱۴m();
            Rect bounds = this.f۱۱۶۶۹b.f۱۱۵۷۷k;
            m۱۴۵۶۷b(focusedChild, bounds);
            if (bounds.left - dx >= parentRight || bounds.right - dx <= parentLeft || bounds.top - dy >= parentBottom || bounds.bottom - dy <= parentTop) {
                return false;
            }
            return true;
        }

        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۵۰a(RecyclerView parent, View child, View focused) {
            return m۱۴۶۲۷w() || parent.m۱۴۳۴۲n();
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۷a(RecyclerView parent, Ca0 state, View child, View focused) {
            return m۱۴۵۵۰a(parent, child, focused);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۰a(AbstractCg oldAdapter, AbstractCg newAdapter) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۵۱a(RecyclerView recyclerView, ArrayList<View> arrayList, int direction, int focusableMode) {
            return false;
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۵۸۶d(RecyclerView recyclerView) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۷a(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۳b(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۵۷۸c(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۹a(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
            m۱۴۵۷۸c(recyclerView, positionStart, itemCount);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۸a(RecyclerView recyclerView, int from, int to, int itemCount) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۵۰۷a(Ca0 state) {
            return 0;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۵۵۷b(Ca0 state) {
            return 0;
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۴۵۷۰c(Ca0 state) {
            return 0;
        }

        /* renamed from: d  reason: contains not printable characters */
        public int m۱۴۵۸۱d(Ca0 state) {
            return 0;
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۵۸۹e(Ca0 state) {
            return 0;
        }

        /* renamed from: f  reason: contains not printable characters */
        public int m۱۴۵۹۴f(Ca0 state) {
            return 0;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۲a(Cv recycler, Ca0 state, int widthSpec, int heightSpec) {
            this.f۱۱۶۶۹b.m۱۴۳۱۲c(widthSpec, heightSpec);
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۵۷۵c(int widthSize, int heightSize) {
            this.f۱۱۶۶۹b.setMeasuredDimension(widthSize, heightSize);
        }

        /* renamed from: l  reason: contains not printable characters */
        public int m۱۴۶۱۲l() {
            return android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۶m(this.f۱۱۶۶۹b);
        }

        /* renamed from: k  reason: contains not printable characters */
        public int m۱۴۶۱۰k() {
            return android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۵l(this.f۱۱۶۶۹b);
        }

        /* renamed from: x  reason: contains not printable characters */
        public Parcelable m۱۴۶۲۸x() {
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۸a(Parcelable state) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B  reason: contains not printable characters */
        public void m۱۴۵۰۴B() {
            AbstractCz zVar = this.f۱۱۶۷۴g;
            if (zVar != null) {
                zVar.m۱۴۷۱۶d();
            }
        }

        /* renamed from: f  reason: contains not printable characters */
        public void m۱۴۵۹۶f(int state) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۵۶۱b(Cv recycler) {
            for (int i = m۱۴۵۸۸e() - 1; i >= 0; i--) {
                if (!RecyclerView.m۱۴۲۶۷k(m۱۴۵۷۳c(i)).m۱۴۴۰۸x()) {
                    m۱۴۵۱۶a(i, recycler);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۱۹a(Cc info2) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            m۱۴۵۲۳a(recyclerView.f۱۱۵۶۳d, recyclerView.f۱۱۵۷۶j0, info2);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۳a(Cv recycler, Ca0 state, Cc info2) {
            if (this.f۱۱۶۶۹b.canScrollVertically(-1) || this.f۱۱۶۶۹b.canScrollHorizontally(-1)) {
                info2.m۱۲۸۳۸a(8192);
                info2.m۱۲۸۷۷k(true);
            }
            if (this.f۱۱۶۶۹b.canScrollVertically(1) || this.f۱۱۶۶۹b.canScrollHorizontally(1)) {
                info2.m۱۲۸۳۸a(4096);
                info2.m۱۲۸۷۷k(true);
            }
            info2.m۱۲۸۴۳a(Cc.Cb.m۱۲۸۹۳a(m۱۴۵۵۸b(recycler, state), m۱۴۵۰۸a(recycler, state), m۱۴۵۸۷d(recycler, state), m۱۴۵۷۱c(recycler, state)));
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۴۰a(AccessibilityEvent event) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            m۱۴۵۲۵a(recyclerView.f۱۱۵۶۳d, recyclerView.f۱۱۵۷۶j0, event);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۵a(Cv recycler, Ca0 state, AccessibilityEvent event) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView != null && event != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f۱۱۶۶۹b.canScrollVertically(-1) && !this.f۱۱۶۶۹b.canScrollHorizontally(-1) && !this.f۱۱۶۶۹b.canScrollHorizontally(1)) {
                    z = false;
                }
                event.setScrollable(z);
                AbstractCg gVar = this.f۱۱۶۶۹b.f۱۱۵۸۳n;
                if (gVar != null) {
                    event.setItemCount(gVar.m۱۴۴۳۱a());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۳۷a(View host, Cc info2) {
            AbstractCd0 vh = RecyclerView.m۱۴۲۶۷k(host);
            if (vh != null && !vh.m۱۴۴۰۰p() && !this.f۱۱۶۶۸a.m۱۵۱۳۳c(vh.f۱۱۶۳۷c)) {
                RecyclerView recyclerView = this.f۱۱۶۶۹b;
                m۱۴۵۲۴a(recyclerView.f۱۱۵۶۳d, recyclerView.f۱۱۵۷۶j0, host, info2);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۵۲۴a(Cv recycler, Ca0 state, View host, Cc info2) {
            info2.m۱۲۸۵۱b(Cc.Cc.m۱۲۸۹۴a(m۱۴۵۶۸b() ? m۱۴۶۱۳l(host) : 0, 1, m۱۴۵۴۲a() ? m۱۴۶۱۳l(host) : 0, 1, false, false));
        }

        /* renamed from: z  reason: contains not printable characters */
        public void m۱۴۶۳۰z() {
            this.f۱۱۶۷۵h = true;
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۴۵۷۱c(Cv recycler, Ca0 state) {
            return 0;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۵۵۸b(Cv recycler, Ca0 state) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView == null || recyclerView.f۱۱۵۸۳n == null || !m۱۴۵۶۸b()) {
                return 1;
            }
            return this.f۱۱۶۶۹b.f۱۱۵۸۳n.m۱۴۴۳۱a();
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۵۰۸a(Cv recycler, Ca0 state) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView == null || recyclerView.f۱۱۵۸۳n == null || !m۱۴۵۴۲a()) {
                return 1;
            }
            return this.f۱۱۶۶۹b.f۱۱۵۸۳n.m۱۴۴۳۱a();
        }

        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۴۵۸۷d(Cv recycler, Ca0 state) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۳a(int action, Bundle args) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            return m۱۴۵۴۵a(recyclerView.f۱۱۵۶۳d, recyclerView.f۱۱۵۷۶j0, action, args);
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۵a(Cv recycler, Ca0 state, int action, Bundle args) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            if (recyclerView == null) {
                return false;
            }
            int vScroll = 0;
            int hScroll = 0;
            if (action == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    vScroll = (m۱۴۶۰۳h() - m۱۴۶۲۰p()) - m۱۴۶۱۴m();
                }
                if (this.f۱۱۶۶۹b.canScrollHorizontally(1)) {
                    hScroll = (m۱۴۶۲۱q() - m۱۴۶۱۶n()) - m۱۴۶۱۸o();
                }
            } else if (action == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    vScroll = -((m۱۴۶۰۳h() - m۱۴۶۲۰p()) - m۱۴۶۱۴m());
                }
                if (this.f۱۱۶۶۹b.canScrollHorizontally(-1)) {
                    hScroll = -((m۱۴۶۲۱q() - m۱۴۶۱۶n()) - m۱۴۶۱۸o());
                }
            }
            if (vScroll == 0 && hScroll == 0) {
                return false;
            }
            this.f۱۱۶۶۹b.m۱۴۳۳۵i(hScroll, vScroll);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۵۳a(View view, int action, Bundle args) {
            RecyclerView recyclerView = this.f۱۱۶۶۹b;
            return m۱۴۵۴۶a(recyclerView.f۱۱۵۶۳d, recyclerView.f۱۱۵۷۶j0, view, action, args);
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۵۴۶a(Cv recycler, Ca0 state, View view, int action, Bundle args) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public static Cd m۱۴۴۹۶a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            Cd properties = new Cd();
            TypedArray a = context.obtainStyledAttributes(attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Cb.RecyclerView, defStyleAttr, defStyleRes);
            properties.f۱۱۶۸۸a = a.getInt(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Cb.RecyclerView_android_orientation, 1);
            properties.f۱۱۶۸۹b = a.getInt(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Cb.RecyclerView_spanCount, 1);
            properties.f۱۱۶۹۰c = a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Cb.RecyclerView_reverseLayout, false);
            properties.f۱۱۶۹۱d = a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Cb.RecyclerView_stackFromEnd, false);
            a.recycle();
            return properties;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public void m۱۴۵۹۳e(RecyclerView recyclerView) {
            m۱۴۵۶۰b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A  reason: contains not printable characters */
        public boolean m۱۴۵۰۳A() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s  reason: contains not printable characters */
        public boolean m۱۴۶۲۳s() {
            int childCount = m۱۴۵۸۸e();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams lp = m۱۴۵۷۳c(i).getLayoutParams();
                if (lp.width < 0 && lp.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n  reason: invalid class name */
    public static abstract class AbstractCn {
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۸۹a(Canvas c, RecyclerView parent, Ca0 state) {
            m۱۴۴۸۸a(c, parent);
        }

        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۸۸a(Canvas c, RecyclerView parent) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۹۳b(Canvas c, RecyclerView parent, Ca0 state) {
            m۱۴۴۹۲b(c, parent);
        }

        @Deprecated
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۹۲b(Canvas c, RecyclerView parent) {
        }

        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۹۰a(Rect outRect, int itemPosition, RecyclerView parent) {
            outRect.set(0, 0, 0, 0);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۹۱a(Rect outRect, View view, RecyclerView parent, Ca0 state) {
            m۱۴۴۹۰a(outRect, ((Cp) view.getLayoutParams()).m۱۴۶۴۲a(), parent);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t  reason: invalid class name */
    public static abstract class AbstractCt {
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۵۲a(RecyclerView recyclerView, int newState) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۶۵۳a(RecyclerView recyclerView, int dx, int dy) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d0  reason: invalid class name */
    public static abstract class AbstractCd0 {

        /* renamed from: u  reason: contains not printable characters */
        private static final List<Object> f۱۱۶۳۶u = Collections.emptyList();

        /* renamed from: c  reason: contains not printable characters */
        public final View f۱۱۶۳۷c;

        /* renamed from: d  reason: contains not printable characters */
        WeakReference<RecyclerView> f۱۱۶۳۸d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۶۳۹e = -1;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۱۶۴۰f = -1;

        /* renamed from: g  reason: contains not printable characters */
        long f۱۱۶۴۱g = -1;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۱۶۴۲h = -1;

        /* renamed from: i  reason: contains not printable characters */
        int f۱۱۶۴۳i = -1;

        /* renamed from: j  reason: contains not printable characters */
        AbstractCd0 f۱۱۶۴۴j = null;

        /* renamed from: k  reason: contains not printable characters */
        AbstractCd0 f۱۱۶۴۵k = null;

        /* renamed from: l  reason: contains not printable characters */
        int f۱۱۶۴۶l;

        /* renamed from: m  reason: contains not printable characters */
        List<Object> f۱۱۶۴۷m = null;

        /* renamed from: n  reason: contains not printable characters */
        List<Object> f۱۱۶۴۸n = null;

        /* renamed from: o  reason: contains not printable characters */
        private int f۱۱۶۴۹o = 0;

        /* renamed from: p  reason: contains not printable characters */
        Cv f۱۱۶۵۰p = null;

        /* renamed from: q  reason: contains not printable characters */
        boolean f۱۱۶۵۱q = false;

        /* renamed from: r  reason: contains not printable characters */
        private int f۱۱۶۵۲r = 0;

        /* renamed from: s  reason: contains not printable characters */
        int f۱۱۶۵۳s = -1;

        /* renamed from: t  reason: contains not printable characters */
        RecyclerView f۱۱۶۵۴t;

        public AbstractCd0(View itemView) {
            if (itemView != null) {
                this.f۱۱۶۳۷c = itemView;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۸a(int mNewPosition, int offset, boolean applyToPreLayout) {
            m۱۴۳۷۶a(8);
            m۱۴۳۷۹a(offset, applyToPreLayout);
            this.f۱۱۶۳۹e = mNewPosition;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۹a(int offset, boolean applyToPreLayout) {
            if (this.f۱۱۶۴۰f == -1) {
                this.f۱۱۶۴۰f = this.f۱۱۶۳۹e;
            }
            if (this.f۱۱۶۴۳i == -1) {
                this.f۱۱۶۴۳i = this.f۱۱۶۳۹e;
            }
            if (applyToPreLayout) {
                this.f۱۱۶۴۳i += offset;
            }
            this.f۱۱۶۳۹e += offset;
            if (this.f۱۱۶۳۷c.getLayoutParams() != null) {
                ((Cp) this.f۱۱۶۳۷c.getLayoutParams()).f۱۱۶۹۴c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۵a() {
            this.f۱۱۶۴۰f = -1;
            this.f۱۱۶۴۳i = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v  reason: contains not printable characters */
        public void m۱۴۴۰۶v() {
            if (this.f۱۱۶۴۰f == -1) {
                this.f۱۱۶۴۰f = this.f۱۱۶۳۹e;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x  reason: contains not printable characters */
        public boolean m۱۴۴۰۸x() {
            return (this.f۱۱۶۴۶l & 128) != 0;
        }

        /* renamed from: i  reason: contains not printable characters */
        public final int m۱۴۳۹۳i() {
            int i = this.f۱۱۶۴۳i;
            return i == -1 ? this.f۱۱۶۳۹e : i;
        }

        /* renamed from: f  reason: contains not printable characters */
        public final int m۱۴۳۹۰f() {
            RecyclerView recyclerView = this.f۱۱۶۵۴t;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m۱۴۲۹۸b(this);
        }

        /* renamed from: j  reason: contains not printable characters */
        public final int m۱۴۳۹۴j() {
            return this.f۱۱۶۴۰f;
        }

        /* renamed from: g  reason: contains not printable characters */
        public final long m۱۴۳۹۱g() {
            return this.f۱۱۶۴۱g;
        }

        /* renamed from: h  reason: contains not printable characters */
        public final int m۱۴۳۹۲h() {
            return this.f۱۱۶۴۲h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q  reason: contains not printable characters */
        public boolean m۱۴۴۰۱q() {
            return this.f۱۱۶۵۰p != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y  reason: contains not printable characters */
        public void m۱۴۴۰۹y() {
            this.f۱۱۶۵۰p.m۱۴۶۹۲c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z  reason: contains not printable characters */
        public boolean m۱۴۴۱۰z() {
            return (this.f۱۱۶۴۶l & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۳۸۷c() {
            this.f۱۱۶۴۶l &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۳۸۸d() {
            this.f۱۱۶۴۶l &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۸۰a(Cv recycler, boolean isChangeScrap) {
            this.f۱۱۶۵۰p = recycler;
            this.f۱۱۶۵۱q = isChangeScrap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n  reason: contains not printable characters */
        public boolean m۱۴۳۹۸n() {
            return (this.f۱۱۶۴۶l & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t  reason: contains not printable characters */
        public boolean m۱۴۴۰۴t() {
            return (this.f۱۱۶۴۶l & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m  reason: contains not printable characters */
        public boolean m۱۴۳۹۷m() {
            return (this.f۱۱۶۴۶l & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p  reason: contains not printable characters */
        public boolean m۱۴۴۰۰p() {
            return (this.f۱۱۶۴۶l & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۳۸۶b(int flags) {
            return (this.f۱۱۶۴۶l & flags) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r  reason: contains not printable characters */
        public boolean m۱۴۴۰۲r() {
            return (this.f۱۱۶۴۶l & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l  reason: contains not printable characters */
        public boolean m۱۴۳۹۶l() {
            return (this.f۱۱۶۴۶l & 512) != 0 || m۱۴۳۹۸n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۷a(int flags, int mask) {
            this.f۱۱۶۴۶l = (this.f۱۱۶۴۶l & (mask ^ -1)) | (flags & mask);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۷۶a(int flags) {
            this.f۱۱۶۴۶l |= flags;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۸۲a(Object payload) {
            if (payload == null) {
                m۱۴۳۷۶a(1024);
            } else if ((1024 & this.f۱۱۶۴۶l) == 0) {
                m۱۴۳۷۴A();
                this.f۱۱۶۴۷m.add(payload);
            }
        }

        /* renamed from: A  reason: contains not printable characters */
        private void m۱۴۳۷۴A() {
            if (this.f۱۱۶۴۷m == null) {
                this.f۱۱۶۴۷m = new ArrayList();
                this.f۱۱۶۴۸n = Collections.unmodifiableList(this.f۱۱۶۴۷m);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۳۸۴b() {
            List<Object> list = this.f۱۱۶۴۷m;
            if (list != null) {
                list.clear();
            }
            this.f۱۱۶۴۶l &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k  reason: contains not printable characters */
        public List<Object> m۱۴۳۹۵k() {
            if ((this.f۱۱۶۴۶l & 1024) != 0) {
                return f۱۱۶۳۶u;
            }
            List<Object> list = this.f۱۱۶۴۷m;
            if (list == null || list.size() == 0) {
                return f۱۱۶۳۶u;
            }
            return this.f۱۱۶۴۸n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u  reason: contains not printable characters */
        public void m۱۴۴۰۵u() {
            this.f۱۱۶۴۶l = 0;
            this.f۱۱۶۳۹e = -1;
            this.f۱۱۶۴۰f = -1;
            this.f۱۱۶۴۱g = -1;
            this.f۱۱۶۴۳i = -1;
            this.f۱۱۶۴۹o = 0;
            this.f۱۱۶۴۴j = null;
            this.f۱۱۶۴۵k = null;
            m۱۴۳۸۴b();
            this.f۱۱۶۵۲r = 0;
            this.f۱۱۶۵۳s = -1;
            RecyclerView.m۱۴۲۶۵e(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۸۱a(RecyclerView parent) {
            int i = this.f۱۱۶۵۳s;
            if (i != -1) {
                this.f۱۱۶۵۲r = i;
            } else {
                this.f۱۱۶۵۲r = android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۲i(this.f۱۱۶۳۷c);
            }
            parent.m۱۴۲۹۶a(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۳۸۵b(RecyclerView parent) {
            parent.m۱۴۲۹۶a(this, this.f۱۱۶۵۲r);
            this.f۱۱۶۵۲r = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f۱۱۶۳۹e + " id=" + this.f۱۱۶۴۱g + ", oldPos=" + this.f۱۱۶۴۰f + ", pLpos:" + this.f۱۱۶۴۳i);
            if (m۱۴۴۰۱q()) {
                sb.append(" scrap ");
                sb.append(this.f۱۱۶۵۱q ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m۱۴۳۹۸n()) {
                sb.append(" invalid");
            }
            if (!m۱۴۳۹۷m()) {
                sb.append(" unbound");
            }
            if (m۱۴۴۰۴t()) {
                sb.append(" update");
            }
            if (m۱۴۴۰۰p()) {
                sb.append(" removed");
            }
            if (m۱۴۴۰۸x()) {
                sb.append(" ignored");
            }
            if (m۱۴۴۰۲r()) {
                sb.append(" tmpDetached");
            }
            if (!m۱۴۳۹۹o()) {
                sb.append(" not recyclable(" + this.f۱۱۶۴۹o + ")");
            }
            if (m۱۴۳۹۶l()) {
                sb.append(" undefined adapter position");
            }
            if (this.f۱۱۶۳۷c.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۴۳۸۳a(boolean recyclable) {
            int i = this.f۱۱۶۴۹o;
            this.f۱۱۶۴۹o = recyclable ? i - 1 : i + 1;
            int i2 = this.f۱۱۶۴۹o;
            if (i2 < 0) {
                this.f۱۱۶۴۹o = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!recyclable && i2 == 1) {
                this.f۱۱۶۴۶l |= 16;
            } else if (recyclable && this.f۱۱۶۴۹o == 0) {
                this.f۱۱۶۴۶l &= -17;
            }
        }

        /* renamed from: o  reason: contains not printable characters */
        public final boolean m۱۴۳۹۹o() {
            return (this.f۱۱۶۴۶l & 16) == 0 && !android.support.p۰۴۳v4.view.Cu.m۱۳۰۲۶w(this.f۱۱۶۳۷c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w  reason: contains not printable characters */
        public boolean m۱۴۴۰۷w() {
            return (this.f۱۱۶۴۶l & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۴۳۸۹e() {
            return (this.f۱۱۶۴۶l & 16) == 0 && android.support.p۰۴۳v4.view.Cu.m۱۳۰۲۶w(this.f۱۱۶۳۷c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s  reason: contains not printable characters */
        public boolean m۱۴۴۰۳s() {
            return (this.f۱۱۶۴۶l & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۲۹۶a(AbstractCd0 viewHolder, int importantForAccessibility) {
        if (m۱۴۳۴۲n()) {
            viewHolder.f۱۱۶۵۳s = importantForAccessibility;
            this.f۱۱۶۰۶y0.add(viewHolder);
            return false;
        }
        android.support.p۰۴۳v4.view.Cu.m۱۳۰۰۷f(viewHolder.f۱۱۶۳۷c, importantForAccessibility);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۳۱۵d() {
        int state;
        for (int i = this.f۱۱۶۰۶y0.size() - 1; i >= 0; i--) {
            AbstractCd0 viewHolder = this.f۱۱۶۰۶y0.get(i);
            if (viewHolder.f۱۱۶۳۷c.getParent() == this && !viewHolder.m۱۴۴۰۸x() && (state = viewHolder.f۱۱۶۵۳s) != -1) {
                android.support.p۰۴۳v4.view.Cu.m۱۳۰۰۷f(viewHolder.f۱۱۶۳۷c, state);
                viewHolder.f۱۱۶۵۳s = -1;
            }
        }
        this.f۱۱۶۰۶y0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۲۹۸b(AbstractCd0 viewHolder) {
        if (viewHolder.m۱۴۳۸۶b(524) || !viewHolder.m۱۴۳۹۷m()) {
            return -1;
        }
        return this.f۱۱۵۶۷f.m۱۵۰۹۵a(viewHolder.f۱۱۶۳۹e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۸۱a(StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable) {
        if (verticalThumbDrawable == null || verticalTrackDrawable == null || horizontalThumbDrawable == null || horizontalTrackDrawable == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m۱۴۳۳۴i());
        }
        Resources resources = getContext().getResources();
        new Cj0(this, verticalThumbDrawable, verticalTrackDrawable, horizontalThumbDrawable, horizontalTrackDrawable, resources.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Ca.fastscroll_default_thickness), resources.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Ca.fastscroll_minimum_range), resources.getDimensionPixelOffset(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۹e.Ca.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        getScrollingChildHelper().m۱۲۹۲۷a(enabled);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCk
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m۱۲۹۳۷b();
    }

    public boolean startNestedScroll(int axes) {
        return getScrollingChildHelper().m۱۲۹۳۸b(axes);
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۴۳۳۸j(int axes, int type) {
        return getScrollingChildHelper().m۱۲۹۳۲a(axes, type);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCk
    public void stopNestedScroll() {
        getScrollingChildHelper().m۱۲۹۳۹c();
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۲۷۵a(int type) {
        getScrollingChildHelper().m۱۲۹۴۰c(type);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m۱۲۹۲۸a();
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۴۳۱۷d(int type) {
        return getScrollingChildHelper().m۱۲۹۳۱a(type);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return getScrollingChildHelper().m۱۲۹۳۳a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۲۹۲a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().m۱۲۹۳۴a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return getScrollingChildHelper().m۱۲۹۳۵a(dx, dy, consumed, offsetInWindow);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۲۹۴a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().m۱۲۹۳۶a(dx, dy, consumed, offsetInWindow, type);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return getScrollingChildHelper().m۱۲۹۳۰a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return getScrollingChildHelper().m۱۲۹۲۹a(velocityX, velocityY);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p  reason: invalid class name */
    public static class Cp extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        AbstractCd0 f۱۱۶۹۲a;

        /* renamed from: b  reason: contains not printable characters */
        final Rect f۱۱۶۹۳b = new Rect();

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۱۶۹۴c = true;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۱۶۹۵d = false;

        public Cp(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public Cp(int width, int height) {
            super(width, height);
        }

        public Cp(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public Cp(ViewGroup.LayoutParams source) {
            super(source);
        }

        public Cp(Cp source) {
            super((ViewGroup.LayoutParams) source);
        }

        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۴۶۴۵d() {
            return this.f۱۱۶۹۲a.m۱۴۳۹۸n();
        }

        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۴۶۴۴c() {
            return this.f۱۱۶۹۲a.m۱۴۴۰۰p();
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۶۴۳b() {
            return this.f۱۱۶۹۲a.m۱۴۴۰۳s();
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۶۴۲a() {
            return this.f۱۱۶۹۲a.m۱۴۳۹۳i();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i  reason: invalid class name */
    public static abstract class AbstractCi {
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۵۶a() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۵۷a(int positionStart, int itemCount) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۵۸a(int positionStart, int itemCount, Object payload) {
            m۱۴۴۵۷a(positionStart, itemCount);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.RecyclerView$h  reason: invalid class name */
    public static class Ch extends Observable<AbstractCi> {
        Ch() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۴۵۴a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۴۵۵b() {
            for (int i = ((Observable) this).mObservers.size() - 1; i >= 0; i--) {
                ((AbstractCi) ((Observable) this).mObservers.get(i)).m۱۴۴۵۶a();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۵۲a(int positionStart, int itemCount) {
            m۱۴۴۵۳a(positionStart, itemCount, null);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۵۳a(int positionStart, int itemCount, Object payload) {
            for (int i = ((Observable) this).mObservers.size() - 1; i >= 0; i--) {
                ((AbstractCi) ((Observable) this).mObservers.get(i)).m۱۴۴۵۸a(positionStart, itemCount, payload);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$y  reason: invalid class name */
    public static class Cy extends AbstractCa {
        public static final Parcelable.Creator<Cy> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        Parcelable f۱۱۷۱۲e;

        Cy(Parcel in, ClassLoader loader) {
            super(in, loader);
            ClassLoader classLoader;
            if (loader != null) {
                classLoader = loader;
            } else {
                classLoader = AbstractCo.class.getClassLoader();
            }
            this.f۱۱۷۱۲e = in.readParcelable(classLoader);
        }

        Cy(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeParcelable(this.f۱۱۷۱۲e, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۷۰۹a(Cy other) {
            this.f۱۱۷۱۲e = other.f۱۱۷۱۲e;
        }

        /* renamed from: android.support.v7.widget.RecyclerView$y$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cy> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cy createFromParcel(Parcel in, ClassLoader loader) {
                return new Cy(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cy createFromParcel(Parcel in) {
                return new Cy(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Cy[] newArray(int size) {
                return new Cy[size];
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a0  reason: invalid class name */
    public static class Ca0 {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۱۶۱۰a = -1;

        /* renamed from: b  reason: contains not printable characters */
        private SparseArray<Object> f۱۱۶۱۱b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۶۱۲c = 0;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۶۱۳d = 0;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۶۱۴e = 1;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۱۶۱۵f = 0;

        /* renamed from: g  reason: contains not printable characters */
        boolean f۱۱۶۱۶g = false;

        /* renamed from: h  reason: contains not printable characters */
        boolean f۱۱۶۱۷h = false;

        /* renamed from: i  reason: contains not printable characters */
        boolean f۱۱۶۱۸i = false;

        /* renamed from: j  reason: contains not printable characters */
        boolean f۱۱۶۱۹j = false;

        /* renamed from: k  reason: contains not printable characters */
        boolean f۱۱۶۲۰k = false;

        /* renamed from: l  reason: contains not printable characters */
        boolean f۱۱۶۲۱l = false;

        /* renamed from: m  reason: contains not printable characters */
        int f۱۱۶۲۲m;

        /* renamed from: n  reason: contains not printable characters */
        long f۱۱۶۲۳n;

        /* renamed from: o  reason: contains not printable characters */
        int f۱۱۶۲۴o;

        /* renamed from: p  reason: contains not printable characters */
        int f۱۱۶۲۵p;

        /* renamed from: q  reason: contains not printable characters */
        int f۱۱۶۲۶q;

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۵۴a(int accepted) {
            if ((this.f۱۱۶۱۴e & accepted) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(accepted) + " but it is " + Integer.toBinaryString(this.f۱۱۶۱۴e));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۳۵۵a(AbstractCg adapter) {
            this.f۱۱۶۱۴e = 1;
            this.f۱۱۶۱۵f = adapter.m۱۴۴۳۱a();
            this.f۱۱۶۱۷h = false;
            this.f۱۱۶۱۸i = false;
            this.f۱۱۶۱۹j = false;
        }

        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۴۳۵۸d() {
            return this.f۱۱۶۱۷h;
        }

        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۴۳۵۹e() {
            return this.f۱۱۶۲۱l;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۳۵۶b() {
            return this.f۱۱۶۱۰a;
        }

        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۴۳۵۷c() {
            return this.f۱۱۶۱۰a != -1;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۳۵۳a() {
            return this.f۱۱۶۱۷h ? this.f۱۱۶۱۲c - this.f۱۱۶۱۳d : this.f۱۱۶۱۵f;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f۱۱۶۱۰a + ", mData=" + this.f۱۱۶۱۱b + ", mItemCount=" + this.f۱۱۶۱۵f + ", mIsMeasuring=" + this.f۱۱۶۱۹j + ", mPreviousLayoutItemCount=" + this.f۱۱۶۱۲c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f۱۱۶۱۳d + ", mStructureChanged=" + this.f۱۱۶۱۶g + ", mInPreLayout=" + this.f۱۱۶۱۷h + ", mRunSimpleAnimations=" + this.f۱۱۶۲۰k + ", mRunPredictiveAnimations=" + this.f۱۱۶۲۱l + '}';
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m  reason: invalid class name */
    private class Cm implements AbstractCl.AbstractCb {
        Cm() {
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۸۷a(AbstractCd0 item) {
            item.m۱۴۳۸۳a(true);
            if (item.f۱۱۶۴۴j != null && item.f۱۱۶۴۵k == null) {
                item.f۱۱۶۴۴j = null;
            }
            item.f۱۱۶۴۵k = null;
            if (!item.m۱۴۴۰۷w() && !RecyclerView.this.m۱۴۳۳۶i(item.f۱۱۶۳۷c) && item.m۱۴۴۰۲r()) {
                RecyclerView.this.removeDetachedView(item.f۱۱۶۳۷c, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l  reason: invalid class name */
    public static abstract class AbstractCl {

        /* renamed from: a  reason: contains not printable characters */
        private AbstractCb f۱۱۶۵۹a = null;

        /* renamed from: b  reason: contains not printable characters */
        private ArrayList<AbstractCa> f۱۱۶۶۰b = new ArrayList<>();

        /* renamed from: c  reason: contains not printable characters */
        private long f۱۱۶۶۱c = 120;

        /* renamed from: d  reason: contains not printable characters */
        private long f۱۱۶۶۲d = 120;

        /* renamed from: e  reason: contains not printable characters */
        private long f۱۱۶۶۳e = 250;

        /* renamed from: f  reason: contains not printable characters */
        private long f۱۱۶۶۴f = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$l$a  reason: invalid class name */
        public interface AbstractCa {
            /* renamed from: a  reason: contains not printable characters */
            void m۱۴۴۸۳a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.RecyclerView$l$b  reason: invalid class name */
        public interface AbstractCb {
            /* renamed from: a  reason: contains not printable characters */
            void m۱۴۴۸۴a(AbstractCd0 d0Var);
        }

        /* renamed from: a  reason: contains not printable characters */
        public abstract boolean m۱۴۴۶۶a(AbstractCd0 d0Var);

        /* renamed from: a  reason: contains not printable characters */
        public abstract boolean m۱۴۴۶۷a(AbstractCd0 d0Var, AbstractCd0 d0Var2, Cc cVar, Cc cVar2);

        /* renamed from: a  reason: contains not printable characters */
        public abstract boolean m۱۴۴۶۸a(AbstractCd0 d0Var, Cc cVar, Cc cVar2);

        /* renamed from: b  reason: contains not printable characters */
        public abstract void m۱۴۴۷۰b();

        /* renamed from: b  reason: contains not printable characters */
        public abstract boolean m۱۴۴۷۲b(AbstractCd0 d0Var, Cc cVar, Cc cVar2);

        /* renamed from: c  reason: contains not printable characters */
        public abstract void m۱۴۴۷۴c(AbstractCd0 d0Var);

        /* renamed from: c  reason: contains not printable characters */
        public abstract boolean m۱۴۴۷۵c(AbstractCd0 d0Var, Cc cVar, Cc cVar2);

        /* renamed from: g  reason: contains not printable characters */
        public abstract boolean m۱۴۴۸۰g();

        /* renamed from: i  reason: contains not printable characters */
        public abstract void m۱۴۴۸۲i();

        /* renamed from: e  reason: contains not printable characters */
        public long m۱۴۴۷۸e() {
            return this.f۱۱۶۶۳e;
        }

        /* renamed from: c  reason: contains not printable characters */
        public long m۱۴۴۷۳c() {
            return this.f۱۱۶۶۱c;
        }

        /* renamed from: f  reason: contains not printable characters */
        public long m۱۴۴۷۹f() {
            return this.f۱۱۶۶۲d;
        }

        /* renamed from: d  reason: contains not printable characters */
        public long m۱۴۴۷۶d() {
            return this.f۱۱۶۶۴f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۴۶۵a(AbstractCb listener) {
            this.f۱۱۶۵۹a = listener;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۴۴۶۳a(Ca0 state, AbstractCd0 viewHolder, int changeFlags, List<Object> list) {
            Cc h = m۱۴۴۸۱h();
            h.m۱۴۴۸۵a(viewHolder);
            return h;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۴۴۶۲a(Ca0 state, AbstractCd0 viewHolder) {
            Cc h = m۱۴۴۸۱h();
            h.m۱۴۴۸۵a(viewHolder);
            return h;
        }

        /* renamed from: e  reason: contains not printable characters */
        static int m۱۴۴۶۱e(AbstractCd0 viewHolder) {
            int flags = viewHolder.f۱۱۶۴۶l & 14;
            if (viewHolder.m۱۴۳۹۸n()) {
                return 4;
            }
            if ((flags & 4) != 0) {
                return flags;
            }
            int oldPos = viewHolder.m۱۴۳۹۴j();
            int pos = viewHolder.m۱۴۳۹۰f();
            if (oldPos == -1 || pos == -1 || oldPos == pos) {
                return flags;
            }
            return flags | 2048;
        }

        /* renamed from: b  reason: contains not printable characters */
        public final void m۱۴۴۷۱b(AbstractCd0 viewHolder) {
            m۱۴۴۷۷d(viewHolder);
            AbstractCb bVar = this.f۱۱۶۵۹a;
            if (bVar != null) {
                bVar.m۱۴۴۸۴a(viewHolder);
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۴۷۷d(AbstractCd0 viewHolder) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۴۶۹a(AbstractCd0 viewHolder, List<Object> list) {
            return m۱۴۴۶۶a(viewHolder);
        }

        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۴۴۶۴a() {
            int count = this.f۱۱۶۶۰b.size();
            for (int i = 0; i < count; i++) {
                this.f۱۱۶۶۰b.get(i).m۱۴۴۸۳a();
            }
            this.f۱۱۶۶۰b.clear();
        }

        /* renamed from: h  reason: contains not printable characters */
        public Cc m۱۴۴۸۱h() {
            return new Cc();
        }

        /* renamed from: android.support.v7.widget.RecyclerView$l$c  reason: invalid class name */
        public static class Cc {

            /* renamed from: a  reason: contains not printable characters */
            public int f۱۱۶۶۵a;

            /* renamed from: b  reason: contains not printable characters */
            public int f۱۱۶۶۶b;

            /* renamed from: a  reason: contains not printable characters */
            public Cc m۱۴۴۸۵a(AbstractCd0 holder) {
                m۱۴۴۸۶a(holder, 0);
                return this;
            }

            /* renamed from: a  reason: contains not printable characters */
            public Cc m۱۴۴۸۶a(AbstractCd0 holder, int flags) {
                View view = holder.f۱۱۶۳۷c;
                this.f۱۱۶۶۵a = view.getLeft();
                this.f۱۱۶۶۶b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int childCount, int i) {
        AbstractCj jVar = this.f۱۱۵۹۲r0;
        if (jVar == null) {
            return super.getChildDrawingOrder(childCount, i);
        }
        return jVar.m۱۴۴۵۹a(childCount, i);
    }

    private Cl getScrollingChildHelper() {
        if (this.f۱۱۵۹۶t0 == null) {
            this.f۱۱۵۹۶t0 = new Cl(this);
        }
        return this.f۱۱۵۹۶t0;
    }
}
