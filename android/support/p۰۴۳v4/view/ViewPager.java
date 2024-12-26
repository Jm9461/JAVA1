package android.support.p۰۴۳v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {

    /* renamed from: h0  reason: contains not printable characters */
    static final int[] f۱۰۵۰۷h0 = {16842931};

    /* renamed from: i0  reason: contains not printable characters */
    private static final Comparator<Cf> f۱۰۵۰۸i0 = new Ca();

    /* renamed from: j0  reason: contains not printable characters */
    private static final Interpolator f۱۰۵۰۹j0 = new animationInterpolatorCb();

    /* renamed from: k0  reason: contains not printable characters */
    private static final Cn f۱۰۵۱۰k0 = new Cn();

    /* renamed from: A  reason: contains not printable characters */
    private boolean f۱۰۵۱۱A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۰۵۱۲B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۰۵۱۳C;

    /* renamed from: D  reason: contains not printable characters */
    private int f۱۰۵۱۴D;

    /* renamed from: E  reason: contains not printable characters */
    private float f۱۰۵۱۵E;

    /* renamed from: F  reason: contains not printable characters */
    private float f۱۰۵۱۶F;

    /* renamed from: G  reason: contains not printable characters */
    private float f۱۰۵۱۷G;

    /* renamed from: H  reason: contains not printable characters */
    private float f۱۰۵۱۸H;

    /* renamed from: I  reason: contains not printable characters */
    private int f۱۰۵۱۹I = -1;

    /* renamed from: J  reason: contains not printable characters */
    private VelocityTracker f۱۰۵۲۰J;

    /* renamed from: K  reason: contains not printable characters */
    private int f۱۰۵۲۱K;

    /* renamed from: L  reason: contains not printable characters */
    private int f۱۰۵۲۲L;

    /* renamed from: M  reason: contains not printable characters */
    private int f۱۰۵۲۳M;

    /* renamed from: N  reason: contains not printable characters */
    private int f۱۰۵۲۴N;

    /* renamed from: O  reason: contains not printable characters */
    private boolean f۱۰۵۲۵O;

    /* renamed from: P  reason: contains not printable characters */
    private EdgeEffect f۱۰۵۲۶P;

    /* renamed from: Q  reason: contains not printable characters */
    private EdgeEffect f۱۰۵۲۷Q;

    /* renamed from: R  reason: contains not printable characters */
    private boolean f۱۰۵۲۸R = true;

    /* renamed from: S  reason: contains not printable characters */
    private boolean f۱۰۵۲۹S;

    /* renamed from: T  reason: contains not printable characters */
    private int f۱۰۵۳۰T;

    /* renamed from: U  reason: contains not printable characters */
    private List<AbstractCj> f۱۰۵۳۱U;

    /* renamed from: V  reason: contains not printable characters */
    private AbstractCj f۱۰۵۳۲V;

    /* renamed from: W  reason: contains not printable characters */
    private AbstractCj f۱۰۵۳۳W;

    /* renamed from: a0  reason: contains not printable characters */
    private List<AbstractCi> f۱۰۵۳۴a0;

    /* renamed from: b0  reason: contains not printable characters */
    private AbstractCk f۱۰۵۳۵b0;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۰۵۳۶c;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۰۵۳۷c0;

    /* renamed from: d  reason: contains not printable characters */
    private final ArrayList<Cf> f۱۰۵۳۸d = new ArrayList<>();

    /* renamed from: d0  reason: contains not printable characters */
    private int f۱۰۵۳۹d0;

    /* renamed from: e  reason: contains not printable characters */
    private final Cf f۱۰۵۴۰e = new Cf();

    /* renamed from: e0  reason: contains not printable characters */
    private ArrayList<View> f۱۰۵۴۱e0;

    /* renamed from: f  reason: contains not printable characters */
    private final Rect f۱۰۵۴۲f = new Rect();

    /* renamed from: f0  reason: contains not printable characters */
    private final Runnable f۱۰۵۴۳f0 = new RunnableCc();

    /* renamed from: g  reason: contains not printable characters */
    AbstractCq f۱۰۵۴۴g;

    /* renamed from: g0  reason: contains not printable characters */
    private int f۱۰۵۴۵g0 = 0;

    /* renamed from: h  reason: contains not printable characters */
    int f۱۰۵۴۶h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۰۵۴۷i = -1;

    /* renamed from: j  reason: contains not printable characters */
    private Parcelable f۱۰۵۴۸j = null;

    /* renamed from: k  reason: contains not printable characters */
    private ClassLoader f۱۰۵۴۹k = null;

    /* renamed from: l  reason: contains not printable characters */
    private Scroller f۱۰۵۵۰l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۰۵۵۱m;

    /* renamed from: n  reason: contains not printable characters */
    private Cl f۱۰۵۵۲n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۰۵۵۳o;

    /* renamed from: p  reason: contains not printable characters */
    private Drawable f۱۰۵۵۴p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۰۵۵۵q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۰۵۵۶r;

    /* renamed from: s  reason: contains not printable characters */
    private float f۱۰۵۵۷s = -3.4028235E38f;

    /* renamed from: t  reason: contains not printable characters */
    private float f۱۰۵۵۸t = Float.MAX_VALUE;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۰۵۵۹u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۰۵۶۰v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۰۵۶۱w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۰۵۶۲x;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۰۵۶۳y = 1;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۰۵۶۴z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$e  reason: invalid class name */
    public @interface AbstractCe {
    }

    /* renamed from: android.support.v4.view.ViewPager$i  reason: invalid class name */
    public interface AbstractCi {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۷۸۵a(ViewPager viewPager, AbstractCq qVar, AbstractCq qVar2);
    }

    /* renamed from: android.support.v4.view.ViewPager$j  reason: invalid class name */
    public interface AbstractCj {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۷۸۶a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۷۸۷a(int i, float f, int i2);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۲۷۸۸b(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$k  reason: invalid class name */
    public interface AbstractCk {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۷۸۹a(View view, float f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$f  reason: invalid class name */
    public static class Cf {

        /* renamed from: a  reason: contains not printable characters */
        Object f۱۰۵۶۸a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۰۵۶۹b;

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۰۵۷۰c;

        /* renamed from: d  reason: contains not printable characters */
        float f۱۰۵۷۱d;

        /* renamed from: e  reason: contains not printable characters */
        float f۱۰۵۷۲e;

        Cf() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$a  reason: invalid class name */
    static class Ca implements Comparator<Cf> {
        Ca() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(Cf lhs, Cf rhs) {
            return lhs.f۱۰۵۶۹b - rhs.f۱۰۵۶۹b;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$b  reason: invalid class name */
    static class animationInterpolatorCb implements Interpolator {
        animationInterpolatorCb() {
        }

        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c  reason: invalid class name */
    class RunnableCc implements Runnable {
        RunnableCc() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m۱۲۷۷۸e();
        }
    }

    public ViewPager(Context context) {
        super(context);
        m۱۲۷۷۲b();
    }

    public ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۲۷۷۲b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۷۷۲b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f۱۰۵۵۰l = new Scroller(context, f۱۰۵۰۹j0);
        ViewConfiguration configuration = ViewConfiguration.get(context);
        float density = context.getResources().getDisplayMetrics().density;
        this.f۱۰۵۱۴D = configuration.getScaledPagingTouchSlop();
        this.f۱۰۵۲۱K = (int) (400.0f * density);
        this.f۱۰۵۲۲L = configuration.getScaledMaximumFlingVelocity();
        this.f۱۰۵۲۶P = new EdgeEffect(context);
        this.f۱۰۵۲۷Q = new EdgeEffect(context);
        this.f۱۰۵۲۳M = (int) (25.0f * density);
        this.f۱۰۵۲۴N = (int) (2.0f * density);
        this.f۱۰۵۱۲B = (int) (16.0f * density);
        Cu.m۱۲۹۸۵a(this, new Ch());
        if (Cu.m۱۳۰۱۲i(this) == 0) {
            Cu.m۱۳۰۰۷f(this, 1);
        }
        Cu.m۱۲۹۸۷a(this, new Cd());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$d  reason: invalid class name */
    public class Cd implements AbstractCp {

        /* renamed from: a  reason: contains not printable characters */
        private final Rect f۱۰۵۶۶a = new Rect();

        Cd() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public Cc0 m۱۲۷۸۰a(View v, Cc0 originalInsets) {
            Cc0 applied = Cu.m۱۲۹۹۶b(v, originalInsets);
            if (applied.m۱۲۸۲۴g()) {
                return applied;
            }
            Rect res = this.f۱۰۵۶۶a;
            res.left = applied.m۱۲۸۲۰c();
            res.top = applied.m۱۲۸۲۲e();
            res.right = applied.m۱۲۸۲۱d();
            res.bottom = applied.m۱۲۸۱۹b();
            int count = ViewPager.this.getChildCount();
            for (int i = 0; i < count; i++) {
                Cc0 childInsets = Cu.m۱۲۹۷۵a(ViewPager.this.getChildAt(i), applied);
                res.left = Math.min(childInsets.m۱۲۸۲۰c(), res.left);
                res.top = Math.min(childInsets.m۱۲۸۲۲e(), res.top);
                res.right = Math.min(childInsets.m۱۲۸۲۱d(), res.right);
                res.bottom = Math.min(childInsets.m۱۲۸۱۹b(), res.bottom);
            }
            return applied.m۱۲۸۱۸a(res.left, res.top, res.right, res.bottom);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f۱۰۵۴۳f0);
        Scroller scroller = this.f۱۰۵۵۰l;
        if (scroller != null && !scroller.isFinished()) {
            this.f۱۰۵۵۰l.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int newState) {
        if (this.f۱۰۵۴۵g0 != newState) {
            this.f۱۰۵۴۵g0 = newState;
            if (this.f۱۰۵۳۵b0 != null) {
                m۱۲۷۴۴b(newState != 0);
            }
            m۱۲۷۴۹e(newState);
        }
    }

    public void setAdapter(AbstractCq adapter) {
        AbstractCq qVar = this.f۱۰۵۴۴g;
        if (qVar != null) {
            qVar.m۱۲۹۶۲b((DataSetObserver) null);
            this.f۱۰۵۴۴g.m۱۲۹۶۳b(this);
            for (int i = 0; i < this.f۱۰۵۳۸d.size(); i++) {
                Cf ii = this.f۱۰۵۳۸d.get(i);
                this.f۱۰۵۴۴g.m۱۲۹۵۸a(this, ii.f۱۰۵۶۹b, ii.f۱۰۵۶۸a);
            }
            this.f۱۰۵۴۴g.m۱۲۹۵۷a((ViewGroup) this);
            this.f۱۰۵۳۸d.clear();
            m۱۲۷۵۳h();
            this.f۱۰۵۴۶h = 0;
            scrollTo(0, 0);
        }
        AbstractCq oldAdapter = this.f۱۰۵۴۴g;
        this.f۱۰۵۴۴g = adapter;
        this.f۱۰۵۳۶c = 0;
        if (this.f۱۰۵۴۴g != null) {
            if (this.f۱۰۵۵۲n == null) {
                this.f۱۰۵۵۲n = new Cl();
            }
            this.f۱۰۵۴۴g.m۱۲۹۶۲b(this.f۱۰۵۵۲n);
            this.f۱۰۵۶۲x = false;
            boolean wasFirstLayout = this.f۱۰۵۲۸R;
            this.f۱۰۵۲۸R = true;
            this.f۱۰۵۳۶c = this.f۱۰۵۴۴g.m۱۲۹۵۱a();
            if (this.f۱۰۵۴۷i >= 0) {
                this.f۱۰۵۴۴g.m۱۲۹۵۶a(this.f۱۰۵۴۸j, this.f۱۰۵۴۹k);
                m۱۲۷۶۳a(this.f۱۰۵۴۷i, false, true);
                this.f۱۰۵۴۷i = -1;
                this.f۱۰۵۴۸j = null;
                this.f۱۰۵۴۹k = null;
            } else if (!wasFirstLayout) {
                m۱۲۷۷۸e();
            } else {
                requestLayout();
            }
        }
        List<AbstractCi> list = this.f۱۰۵۳۴a0;
        if (!(list == null || list.isEmpty())) {
            int count = this.f۱۰۵۳۴a0.size();
            for (int i2 = 0; i2 < count; i2++) {
                this.f۱۰۵۳۴a0.get(i2).m۱۲۷۸۵a(this, oldAdapter, adapter);
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۲۷۵۳h() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((Cg) getChildAt(i).getLayoutParams()).f۱۰۵۷۳a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public AbstractCq getAdapter() {
        return this.f۱۰۵۴۴g;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۵a(AbstractCi listener) {
        if (this.f۱۰۵۳۴a0 == null) {
            this.f۱۰۵۳۴a0 = new ArrayList();
        }
        this.f۱۰۵۳۴a0.add(listener);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۷۷۳b(AbstractCi listener) {
        List<AbstractCi> list = this.f۱۰۵۳۴a0;
        if (list != null) {
            list.remove(listener);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int item) {
        this.f۱۰۵۶۲x = false;
        m۱۲۷۶۳a(item, !this.f۱۰۵۲۸R, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۲a(int item, boolean smoothScroll) {
        this.f۱۰۵۶۲x = false;
        m۱۲۷۶۳a(item, smoothScroll, false);
    }

    public int getCurrentItem() {
        return this.f۱۰۵۴۶h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۳a(int item, boolean smoothScroll, boolean always) {
        m۱۲۷۶۴a(item, smoothScroll, always, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۴a(int item, boolean smoothScroll, boolean always, int velocity) {
        AbstractCq qVar = this.f۱۰۵۴۴g;
        if (qVar == null || qVar.m۱۲۹۵۱a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (always || this.f۱۰۵۴۶h != item || this.f۱۰۵۳۸d.size() == 0) {
            boolean dispatchSelected = true;
            if (item < 0) {
                item = 0;
            } else if (item >= this.f۱۰۵۴۴g.m۱۲۹۵۱a()) {
                item = this.f۱۰۵۴۴g.m۱۲۹۵۱a() - 1;
            }
            int pageLimit = this.f۱۰۵۶۳y;
            int i = this.f۱۰۵۴۶h;
            if (item > i + pageLimit || item < i - pageLimit) {
                for (int i2 = 0; i2 < this.f۱۰۵۳۸d.size(); i2++) {
                    this.f۱۰۵۳۸d.get(i2).f۱۰۵۷۰c = true;
                }
            }
            if (this.f۱۰۵۴۶h == item) {
                dispatchSelected = false;
            }
            if (this.f۱۰۵۲۸R) {
                this.f۱۰۵۴۶h = item;
                if (dispatchSelected) {
                    m۱۲۷۴۸d(item);
                }
                requestLayout();
                return;
            }
            m۱۲۷۷۵c(item);
            m۱۲۷۳۸a(item, smoothScroll, velocity, dispatchSelected);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۷۳۸a(int item, boolean smoothScroll, int velocity, boolean dispatchSelected) {
        Cf curInfo = m۱۲۷۷۰b(item);
        int destX = 0;
        if (curInfo != null) {
            destX = (int) (((float) getClientWidth()) * Math.max(this.f۱۰۵۵۷s, Math.min(curInfo.f۱۰۵۷۲e, this.f۱۰۵۵۸t)));
        }
        if (smoothScroll) {
            m۱۲۷۶۱a(destX, 0, velocity);
            if (dispatchSelected) {
                m۱۲۷۴۸d(item);
                return;
            }
            return;
        }
        if (dispatchSelected) {
            m۱۲۷۴۸d(item);
        }
        m۱۲۷۴۱a(false);
        scrollTo(destX, 0);
        m۱۲۷۵۱f(destX);
    }

    @Deprecated
    public void setOnPageChangeListener(AbstractCj listener) {
        this.f۱۰۵۳۲V = listener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۶a(AbstractCj listener) {
        if (this.f۱۰۵۳۱U == null) {
            this.f۱۰۵۳۱U = new ArrayList();
        }
        this.f۱۰۵۳۱U.add(listener);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۷۷۴b(AbstractCj listener) {
        List<AbstractCj> list = this.f۱۰۵۳۱U;
        if (list != null) {
            list.remove(listener);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int childCount, int i) {
        return ((Cg) this.f۱۰۵۴۱e0.get(this.f۱۰۵۳۹d0 == 2 ? (childCount - 1) - i : i).getLayoutParams()).f۱۰۵۷۸f;
    }

    public int getOffscreenPageLimit() {
        return this.f۱۰۵۶۳y;
    }

    public void setOffscreenPageLimit(int limit) {
        if (limit < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + limit + " too small; defaulting to " + 1);
            limit = 1;
        }
        if (limit != this.f۱۰۵۶۳y) {
            this.f۱۰۵۶۳y = limit;
            m۱۲۷۷۸e();
        }
    }

    public void setPageMargin(int marginPixels) {
        int oldMargin = this.f۱۰۵۵۳o;
        this.f۱۰۵۵۳o = marginPixels;
        int width = getWidth();
        m۱۲۷۳۷a(width, width, marginPixels, oldMargin);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f۱۰۵۵۳o;
    }

    public void setPageMarginDrawable(Drawable d) {
        this.f۱۰۵۵۴p = d;
        if (d != null) {
            refreshDrawableState();
        }
        setWillNotDraw(d == null);
        invalidate();
    }

    public void setPageMarginDrawable(int resId) {
        setPageMarginDrawable(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(getContext(), resId));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f۱۰۵۵۴p;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable d = this.f۱۰۵۵۴p;
        if (d != null && d.isStateful()) {
            d.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public float m۱۲۷۵۶a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۱a(int x, int y, int velocity) {
        int sx;
        int duration;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f۱۰۵۵۰l;
        if (scroller != null && !scroller.isFinished()) {
            sx = this.f۱۰۵۵۱m ? this.f۱۰۵۵۰l.getCurrX() : this.f۱۰۵۵۰l.getStartX();
            this.f۱۰۵۵۰l.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            sx = getScrollX();
        }
        int sy = getScrollY();
        int dx = x - sx;
        int dy = y - sy;
        if (dx == 0 && dy == 0) {
            m۱۲۷۴۱a(false);
            m۱۲۷۷۸e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int width = getClientWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * m۱۲۷۵۶a(Math.min(1.0f, (((float) Math.abs(dx)) * 1.0f) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(dx)) / (((float) this.f۱۰۵۵۳o) + (((float) width) * this.f۱۰۵۴۴g.m۱۲۹۶۰b(this.f۱۰۵۴۶h))))) * 100.0f);
        }
        int duration2 = Math.min(duration, 600);
        this.f۱۰۵۵۱m = false;
        this.f۱۰۵۵۰l.startScroll(sx, sy, dx, dy, duration2);
        Cu.m۱۲۹۷۰B(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۲۷۵۷a(int position, int index) {
        Cf ii = new Cf();
        ii.f۱۰۵۶۹b = position;
        ii.f۱۰۵۶۸a = this.f۱۰۵۴۴g.m۱۲۹۵۴a(this, position);
        ii.f۱۰۵۷۱d = this.f۱۰۵۴۴g.m۱۲۹۶۰b(position);
        if (index < 0 || index >= this.f۱۰۵۳۸d.size()) {
            this.f۱۰۵۳۸d.add(ii);
        } else {
            this.f۱۰۵۳۸d.add(index, ii);
        }
        return ii;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۵۹a() {
        int adapterCount = this.f۱۰۵۴۴g.m۱۲۹۵۱a();
        this.f۱۰۵۳۶c = adapterCount;
        boolean needPopulate = this.f۱۰۵۳۸d.size() < (this.f۱۰۵۶۳y * 2) + 1 && this.f۱۰۵۳۸d.size() < adapterCount;
        int newCurrItem = this.f۱۰۵۴۶h;
        boolean isUpdating = false;
        int i = 0;
        while (i < this.f۱۰۵۳۸d.size()) {
            Cf ii = this.f۱۰۵۳۸d.get(i);
            int newPos = this.f۱۰۵۴۴g.m۱۲۹۵۲a(ii.f۱۰۵۶۸a);
            if (newPos != -1) {
                if (newPos == -2) {
                    this.f۱۰۵۳۸d.remove(i);
                    i--;
                    if (!isUpdating) {
                        this.f۱۰۵۴۴g.m۱۲۹۶۳b(this);
                        isUpdating = true;
                    }
                    this.f۱۰۵۴۴g.m۱۲۹۵۸a(this, ii.f۱۰۵۶۹b, ii.f۱۰۵۶۸a);
                    needPopulate = true;
                    int i2 = this.f۱۰۵۴۶h;
                    if (i2 == ii.f۱۰۵۶۹b) {
                        newCurrItem = Math.max(0, Math.min(i2, adapterCount - 1));
                        needPopulate = true;
                    }
                } else {
                    int i3 = ii.f۱۰۵۶۹b;
                    if (i3 != newPos) {
                        if (i3 == this.f۱۰۵۴۶h) {
                            newCurrItem = newPos;
                        }
                        ii.f۱۰۵۶۹b = newPos;
                        needPopulate = true;
                    }
                }
            }
            i++;
        }
        if (isUpdating) {
            this.f۱۰۵۴۴g.m۱۲۹۵۷a((ViewGroup) this);
        }
        Collections.sort(this.f۱۰۵۳۸d, f۱۰۵۰۸i0);
        if (needPopulate) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                Cg lp = (Cg) getChildAt(i4).getLayoutParams();
                if (!lp.f۱۰۵۷۳a) {
                    lp.f۱۰۵۷۵c = 0.0f;
                }
            }
            m۱۲۷۶۳a(newCurrItem, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۷۷۸e() {
        m۱۲۷۷۵c(this.f۱۰۵۴۶h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۷۷۵c(int newCurrentItem) {
        Cf oldCurInfo;
        String resName;
        Cf ii;
        float leftWidthNeeded;
        float rightWidthNeeded;
        int startPos;
        int pageLimit;
        int i = this.f۱۰۵۴۶h;
        if (i != newCurrentItem) {
            Cf oldCurInfo2 = m۱۲۷۷۰b(i);
            this.f۱۰۵۴۶h = newCurrentItem;
            oldCurInfo = oldCurInfo2;
        } else {
            oldCurInfo = null;
        }
        if (this.f۱۰۵۴۴g == null) {
            m۱۲۷۵۵j();
        } else if (this.f۱۰۵۶۲x) {
            m۱۲۷۵۵j();
        } else if (getWindowToken() != null) {
            this.f۱۰۵۴۴g.m۱۲۹۶۳b(this);
            int pageLimit2 = this.f۱۰۵۶۳y;
            int startPos2 = Math.max(0, this.f۱۰۵۴۶h - pageLimit2);
            int N = this.f۱۰۵۴۴g.m۱۲۹۵۱a();
            int endPos = Math.min(N - 1, this.f۱۰۵۴۶h + pageLimit2);
            if (N == this.f۱۰۵۳۶c) {
                Cf curItem = null;
                int curIndex = 0;
                while (true) {
                    if (curIndex >= this.f۱۰۵۳۸d.size()) {
                        break;
                    }
                    Cf ii2 = this.f۱۰۵۳۸d.get(curIndex);
                    int i2 = ii2.f۱۰۵۶۹b;
                    int i3 = this.f۱۰۵۴۶h;
                    if (i2 < i3) {
                        curIndex++;
                    } else if (i2 == i3) {
                        curItem = ii2;
                    }
                }
                if (curItem == null && N > 0) {
                    curItem = m۱۲۷۵۷a(this.f۱۰۵۴۶h, curIndex);
                }
                if (curItem != null) {
                    float extraWidthLeft = 0.0f;
                    int itemIndex = curIndex - 1;
                    Cf ii3 = itemIndex >= 0 ? this.f۱۰۵۳۸d.get(itemIndex) : null;
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        leftWidthNeeded = 0.0f;
                    } else {
                        leftWidthNeeded = (((float) getPaddingLeft()) / ((float) clientWidth)) + (2.0f - curItem.f۱۰۵۷۱d);
                    }
                    for (int pos = this.f۱۰۵۴۶h - 1; pos >= 0; pos--) {
                        if (extraWidthLeft < leftWidthNeeded || pos >= startPos2) {
                            if (ii3 == null || pos != ii3.f۱۰۵۶۹b) {
                                extraWidthLeft += m۱۲۷۵۷a(pos, itemIndex + 1).f۱۰۵۷۱d;
                                curIndex++;
                                ii3 = itemIndex >= 0 ? this.f۱۰۵۳۸d.get(itemIndex) : null;
                            } else {
                                extraWidthLeft += ii3.f۱۰۵۷۱d;
                                itemIndex--;
                                ii3 = itemIndex >= 0 ? this.f۱۰۵۳۸d.get(itemIndex) : null;
                            }
                        } else if (ii3 == null) {
                            break;
                        } else if (pos == ii3.f۱۰۵۶۹b && !ii3.f۱۰۵۷۰c) {
                            this.f۱۰۵۳۸d.remove(itemIndex);
                            this.f۱۰۵۴۴g.m۱۲۹۵۸a(this, pos, ii3.f۱۰۵۶۸a);
                            itemIndex--;
                            curIndex--;
                            ii3 = itemIndex >= 0 ? this.f۱۰۵۳۸d.get(itemIndex) : null;
                        }
                    }
                    float extraWidthRight = curItem.f۱۰۵۷۱d;
                    int itemIndex2 = curIndex + 1;
                    if (extraWidthRight < 2.0f) {
                        Cf ii4 = itemIndex2 < this.f۱۰۵۳۸d.size() ? this.f۱۰۵۳۸d.get(itemIndex2) : null;
                        if (clientWidth <= 0) {
                            rightWidthNeeded = 0.0f;
                        } else {
                            rightWidthNeeded = (((float) getPaddingRight()) / ((float) clientWidth)) + 2.0f;
                        }
                        int pos2 = this.f۱۰۵۴۶h + 1;
                        while (true) {
                            if (pos2 >= N) {
                                break;
                            }
                            if (extraWidthRight < rightWidthNeeded || pos2 <= endPos) {
                                pageLimit = pageLimit2;
                                startPos = startPos2;
                                if (ii4 == null || pos2 != ii4.f۱۰۵۶۹b) {
                                    Cf ii5 = m۱۲۷۵۷a(pos2, itemIndex2);
                                    itemIndex2++;
                                    extraWidthRight += ii5.f۱۰۵۷۱d;
                                    ii4 = itemIndex2 < this.f۱۰۵۳۸d.size() ? this.f۱۰۵۳۸d.get(itemIndex2) : null;
                                } else {
                                    extraWidthRight += ii4.f۱۰۵۷۱d;
                                    itemIndex2++;
                                    ii4 = itemIndex2 < this.f۱۰۵۳۸d.size() ? this.f۱۰۵۳۸d.get(itemIndex2) : null;
                                }
                            } else if (ii4 == null) {
                                break;
                            } else {
                                pageLimit = pageLimit2;
                                if (pos2 != ii4.f۱۰۵۶۹b || ii4.f۱۰۵۷۰c) {
                                    startPos = startPos2;
                                } else {
                                    this.f۱۰۵۳۸d.remove(itemIndex2);
                                    startPos = startPos2;
                                    this.f۱۰۵۴۴g.m۱۲۹۵۸a(this, pos2, ii4.f۱۰۵۶۸a);
                                    ii4 = itemIndex2 < this.f۱۰۵۳۸d.size() ? this.f۱۰۵۳۸d.get(itemIndex2) : null;
                                }
                            }
                            pos2++;
                            pageLimit2 = pageLimit;
                            startPos2 = startPos;
                        }
                    }
                    m۱۲۷۳۹a(curItem, curIndex, oldCurInfo);
                    this.f۱۰۵۴۴g.m۱۲۹۶۴b(this, this.f۱۰۵۴۶h, curItem.f۱۰۵۶۸a);
                }
                this.f۱۰۵۴۴g.m۱۲۹۵۷a((ViewGroup) this);
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View child = getChildAt(i4);
                    Cg lp = (Cg) child.getLayoutParams();
                    lp.f۱۰۵۷۸f = i4;
                    if (!lp.f۱۰۵۷۳a) {
                        if (lp.f۱۰۵۷۵c == 0.0f && (ii = m۱۲۷۷۱b(child)) != null) {
                            lp.f۱۰۵۷۵c = ii.f۱۰۵۷۱d;
                            lp.f۱۰۵۷۷e = ii.f۱۰۵۶۹b;
                        }
                    }
                }
                m۱۲۷۵۵j();
                if (hasFocus()) {
                    View currentFocused = findFocus();
                    Cf ii6 = currentFocused != null ? m۱۲۷۵۸a(currentFocused) : null;
                    if (ii6 == null || ii6.f۱۰۵۶۹b != this.f۱۰۵۴۶h) {
                        for (int i5 = 0; i5 < getChildCount(); i5++) {
                            View child2 = getChildAt(i5);
                            Cf ii7 = m۱۲۷۷۱b(child2);
                            if (ii7 != null && ii7.f۱۰۵۶۹b == this.f۱۰۵۴۶h && child2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                resName = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException e) {
                resName = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f۱۰۵۳۶c + ", found: " + N + " Pager id: " + resName + " Pager class: " + getClass() + " Problematic adapter: " + this.f۱۰۵۴۴g.getClass());
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    private void m۱۲۷۵۵j() {
        if (this.f۱۰۵۳۹d0 != 0) {
            ArrayList<View> arrayList = this.f۱۰۵۴۱e0;
            if (arrayList == null) {
                this.f۱۰۵۴۱e0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f۱۰۵۴۱e0.add(getChildAt(i));
            }
            Collections.sort(this.f۱۰۵۴۱e0, f۱۰۵۱۰k0);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۷۳۹a(Cf curItem, int curIndex, Cf oldCurInfo) {
        int i;
        int i2;
        Cf ii;
        Cf ii2;
        int N = this.f۱۰۵۴۴g.m۱۲۹۵۱a();
        int width = getClientWidth();
        float marginOffset = width > 0 ? ((float) this.f۱۰۵۵۳o) / ((float) width) : 0.0f;
        if (oldCurInfo != null) {
            int oldCurPosition = oldCurInfo.f۱۰۵۶۹b;
            int itemIndex = curItem.f۱۰۵۶۹b;
            if (oldCurPosition < itemIndex) {
                int itemIndex2 = 0;
                float offset = oldCurInfo.f۱۰۵۷۲e + oldCurInfo.f۱۰۵۷۱d + marginOffset;
                int pos = oldCurPosition + 1;
                while (pos <= curItem.f۱۰۵۶۹b && itemIndex2 < this.f۱۰۵۳۸d.size()) {
                    Cf ii3 = this.f۱۰۵۳۸d.get(itemIndex2);
                    while (true) {
                        ii2 = ii3;
                        if (pos > ii2.f۱۰۵۶۹b && itemIndex2 < this.f۱۰۵۳۸d.size() - 1) {
                            itemIndex2++;
                            ii3 = this.f۱۰۵۳۸d.get(itemIndex2);
                        }
                    }
                    while (pos < ii2.f۱۰۵۶۹b) {
                        offset += this.f۱۰۵۴۴g.m۱۲۹۶۰b(pos) + marginOffset;
                        pos++;
                    }
                    ii2.f۱۰۵۷۲e = offset;
                    offset += ii2.f۱۰۵۷۱d + marginOffset;
                    pos++;
                }
            } else if (oldCurPosition > itemIndex) {
                int itemIndex3 = this.f۱۰۵۳۸d.size() - 1;
                float offset2 = oldCurInfo.f۱۰۵۷۲e;
                int pos2 = oldCurPosition - 1;
                while (pos2 >= curItem.f۱۰۵۶۹b && itemIndex3 >= 0) {
                    Cf ii4 = this.f۱۰۵۳۸d.get(itemIndex3);
                    while (true) {
                        ii = ii4;
                        if (pos2 < ii.f۱۰۵۶۹b && itemIndex3 > 0) {
                            itemIndex3--;
                            ii4 = this.f۱۰۵۳۸d.get(itemIndex3);
                        }
                    }
                    while (pos2 > ii.f۱۰۵۶۹b) {
                        offset2 -= this.f۱۰۵۴۴g.m۱۲۹۶۰b(pos2) + marginOffset;
                        pos2--;
                    }
                    offset2 -= ii.f۱۰۵۷۱d + marginOffset;
                    ii.f۱۰۵۷۲e = offset2;
                    pos2--;
                }
            }
        }
        int itemCount = this.f۱۰۵۳۸d.size();
        float offset3 = curItem.f۱۰۵۷۲e;
        int i3 = curItem.f۱۰۵۶۹b;
        int pos3 = i3 - 1;
        this.f۱۰۵۵۷s = i3 == 0 ? curItem.f۱۰۵۷۲e : -3.4028235E38f;
        this.f۱۰۵۵۸t = curItem.f۱۰۵۶۹b == N + -1 ? (curItem.f۱۰۵۷۲e + curItem.f۱۰۵۷۱d) - 1.0f : Float.MAX_VALUE;
        int i4 = curIndex - 1;
        while (i4 >= 0) {
            Cf ii5 = this.f۱۰۵۳۸d.get(i4);
            while (true) {
                i2 = ii5.f۱۰۵۶۹b;
                if (pos3 <= i2) {
                    break;
                }
                offset3 -= this.f۱۰۵۴۴g.m۱۲۹۶۰b(pos3) + marginOffset;
                pos3--;
            }
            offset3 -= ii5.f۱۰۵۷۱d + marginOffset;
            ii5.f۱۰۵۷۲e = offset3;
            if (i2 == 0) {
                this.f۱۰۵۵۷s = offset3;
            }
            i4--;
            pos3--;
        }
        float offset4 = curItem.f۱۰۵۷۲e + curItem.f۱۰۵۷۱d + marginOffset;
        int pos4 = curItem.f۱۰۵۶۹b + 1;
        int i5 = curIndex + 1;
        while (i5 < itemCount) {
            Cf ii6 = this.f۱۰۵۳۸d.get(i5);
            while (true) {
                i = ii6.f۱۰۵۶۹b;
                if (pos4 >= i) {
                    break;
                }
                offset4 += this.f۱۰۵۴۴g.m۱۲۹۶۰b(pos4) + marginOffset;
                pos4++;
            }
            if (i == N - 1) {
                this.f۱۰۵۵۸t = (ii6.f۱۰۵۷۱d + offset4) - 1.0f;
            }
            ii6.f۱۰۵۷۲e = offset4;
            offset4 += ii6.f۱۰۵۷۱d + marginOffset;
            i5++;
            pos4++;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$m  reason: invalid class name */
    public static class Cm extends AbstractCa {
        public static final Parcelable.Creator<Cm> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        int f۱۰۵۸۱e;

        /* renamed from: f  reason: contains not printable characters */
        Parcelable f۱۰۵۸۲f;

        /* renamed from: g  reason: contains not printable characters */
        ClassLoader f۱۰۵۸۳g;

        public Cm(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۱۰۵۸۱e);
            out.writeParcelable(this.f۱۰۵۸۲f, flags);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f۱۰۵۸۱e + "}";
        }

        /* renamed from: android.support.v4.view.ViewPager$m$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cm> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cm createFromParcel(Parcel in, ClassLoader loader) {
                return new Cm(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cm createFromParcel(Parcel in) {
                return new Cm(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Cm[] newArray(int size) {
                return new Cm[size];
            }
        }

        Cm(Parcel in, ClassLoader loader) {
            super(in, loader);
            loader = loader == null ? getClass().getClassLoader() : loader;
            this.f۱۰۵۸۱e = in.readInt();
            this.f۱۰۵۸۲f = in.readParcelable(loader);
            this.f۱۰۵۸۳g = loader;
        }
    }

    public Parcelable onSaveInstanceState() {
        Cm ss = new Cm(super.onSaveInstanceState());
        ss.f۱۰۵۸۱e = this.f۱۰۵۴۶h;
        AbstractCq qVar = this.f۱۰۵۴۴g;
        if (qVar != null) {
            ss.f۱۰۵۸۲f = qVar.m۱۲۹۶۵c();
        }
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Cm)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Cm ss = (Cm) state;
        super.onRestoreInstanceState(ss.m۱۲۷۹۱a());
        AbstractCq qVar = this.f۱۰۵۴۴g;
        if (qVar != null) {
            qVar.m۱۲۹۵۶a(ss.f۱۰۵۸۲f, ss.f۱۰۵۸۳g);
            m۱۲۷۶۳a(ss.f۱۰۵۸۱e, false, true);
            return;
        }
        this.f۱۰۵۴۷i = ss.f۱۰۵۸۱e;
        this.f۱۰۵۴۸j = ss.f۱۰۵۸۲f;
        this.f۱۰۵۴۹k = ss.f۱۰۵۸۳g;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!checkLayoutParams(params)) {
            params = generateLayoutParams(params);
        }
        Cg lp = (Cg) params;
        lp.f۱۰۵۷۳a |= m۱۲۷۴۷c(child);
        if (!this.f۱۰۵۶۰v) {
            super.addView(child, index, params);
        } else if (lp == null || !lp.f۱۰۵۷۳a) {
            lp.f۱۰۵۷۶d = true;
            addViewInLayout(child, index, params);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static boolean m۱۲۷۴۷c(View view) {
        return view.getClass().getAnnotation(AbstractCe.class) != null;
    }

    public void removeView(View view) {
        if (this.f۱۰۵۶۰v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public Cf m۱۲۷۷۱b(View child) {
        for (int i = 0; i < this.f۱۰۵۳۸d.size(); i++) {
            Cf ii = this.f۱۰۵۳۸d.get(i);
            if (this.f۱۰۵۴۴g.m۱۲۹۵۹a(child, ii.f۱۰۵۶۸a)) {
                return ii;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۲۷۵۸a(View child) {
        while (true) {
            ViewParent parent = child.getParent();
            if (parent == this) {
                return m۱۲۷۷۱b(child);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            child = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public Cf m۱۲۷۷۰b(int position) {
        for (int i = 0; i < this.f۱۰۵۳۸d.size(); i++) {
            Cf ii = this.f۱۰۵۳۸d.get(i);
            if (ii.f۱۰۵۶۹b == position) {
                return ii;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f۱۰۵۲۸R = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Cg lp;
        int measuredWidth;
        int heightMode;
        int widthSize;
        int heightMode2;
        int heightSize;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, widthMeasureSpec), ViewGroup.getDefaultSize(0, heightMeasureSpec));
        int measuredWidth2 = getMeasuredWidth();
        int maxGutterSize = measuredWidth2 / 10;
        this.f۱۰۵۱۳C = Math.min(maxGutterSize, this.f۱۰۵۱۲B);
        int childWidthSize = (measuredWidth2 - getPaddingLeft()) - getPaddingRight();
        int childHeightSize = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int size = getChildCount();
        int i = 0;
        while (i < size) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                Cg lp2 = (Cg) child.getLayoutParams();
                if (lp2 == null || !lp2.f۱۰۵۷۳a) {
                    measuredWidth = measuredWidth2;
                    heightMode = maxGutterSize;
                } else {
                    int i2 = lp2.f۱۰۵۷۴b;
                    int hgrav = i2 & 7;
                    int vgrav = i2 & 112;
                    int widthMode = Integer.MIN_VALUE;
                    int heightMode3 = Integer.MIN_VALUE;
                    boolean consumeVertical = vgrav == 48 || vgrav == 80;
                    boolean consumeHorizontal = hgrav == 3 || hgrav == 5;
                    if (consumeVertical) {
                        widthMode = 1073741824;
                    } else if (consumeHorizontal) {
                        heightMode3 = 1073741824;
                    }
                    int i3 = ((ViewGroup.LayoutParams) lp2).width;
                    measuredWidth = measuredWidth2;
                    if (i3 != -2) {
                        widthMode = 1073741824;
                        if (i3 != -1) {
                            widthSize = ((ViewGroup.LayoutParams) lp2).width;
                        } else {
                            widthSize = childWidthSize;
                        }
                    } else {
                        widthSize = childWidthSize;
                    }
                    int i4 = ((ViewGroup.LayoutParams) lp2).height;
                    if (i4 == -2) {
                        heightMode2 = heightMode3;
                        heightSize = childHeightSize;
                    } else if (i4 != -1) {
                        heightSize = ((ViewGroup.LayoutParams) lp2).height;
                        heightMode2 = 1073741824;
                    } else {
                        heightMode2 = 1073741824;
                        heightSize = childHeightSize;
                    }
                    heightMode = maxGutterSize;
                    child.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode), View.MeasureSpec.makeMeasureSpec(heightSize, heightMode2));
                    if (consumeVertical) {
                        childHeightSize -= child.getMeasuredHeight();
                    } else if (consumeHorizontal) {
                        childWidthSize -= child.getMeasuredWidth();
                    }
                }
            } else {
                measuredWidth = measuredWidth2;
                heightMode = maxGutterSize;
            }
            i++;
            maxGutterSize = heightMode;
            measuredWidth2 = measuredWidth;
        }
        View.MeasureSpec.makeMeasureSpec(childWidthSize, 1073741824);
        this.f۱۰۵۵۹u = View.MeasureSpec.makeMeasureSpec(childHeightSize, 1073741824);
        this.f۱۰۵۶۰v = true;
        m۱۲۷۷۸e();
        this.f۱۰۵۶۰v = false;
        int size2 = getChildCount();
        for (int i5 = 0; i5 < size2; i5++) {
            View child2 = getChildAt(i5);
            if (child2.getVisibility() != 8 && ((lp = (Cg) child2.getLayoutParams()) == null || !lp.f۱۰۵۷۳a)) {
                child2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) childWidthSize) * lp.f۱۰۵۷۵c), 1073741824), this.f۱۰۵۵۹u);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w != oldw) {
            int i = this.f۱۰۵۵۳o;
            m۱۲۷۳۷a(w, oldw, i, i);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۷۳۷a(int width, int oldWidth, int margin, int oldMargin) {
        if (oldWidth <= 0 || this.f۱۰۵۳۸d.isEmpty()) {
            Cf ii = m۱۲۷۷۰b(this.f۱۰۵۴۶h);
            int scrollPos = (int) (((float) ((width - getPaddingLeft()) - getPaddingRight())) * (ii != null ? Math.min(ii.f۱۰۵۷۲e, this.f۱۰۵۵۸t) : 0.0f));
            if (scrollPos != getScrollX()) {
                m۱۲۷۴۱a(false);
                scrollTo(scrollPos, getScrollY());
            }
        } else if (!this.f۱۰۵۵۰l.isFinished()) {
            this.f۱۰۵۵۰l.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) (((float) (((width - getPaddingLeft()) - getPaddingRight()) + margin)) * (((float) getScrollX()) / ((float) (((oldWidth - getPaddingLeft()) - getPaddingRight()) + oldMargin)))), getScrollY());
        }
    }

    /* JADX INFO: Multiple debug info for r11v10 int: [D('lp' android.support.v4.view.ViewPager$g), D('hgrav' int)] */
    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int i;
        boolean z;
        int paddingLeft;
        int width;
        int count;
        int childLeft;
        int childTop;
        int count2 = getChildCount();
        int width2 = r - l;
        int height = b - t;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int decorCount = 0;
        int i2 = 0;
        while (true) {
            i = 8;
            if (i2 >= count2) {
                break;
            }
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                Cg lp = (Cg) child.getLayoutParams();
                if (lp.f۱۰۵۷۳a) {
                    int i3 = lp.f۱۰۵۷۴b;
                    int hgrav = i3 & 7;
                    int vgrav = i3 & 112;
                    if (hgrav == 1) {
                        childLeft = Math.max((width2 - child.getMeasuredWidth()) / 2, paddingLeft2);
                    } else if (hgrav == 3) {
                        childLeft = paddingLeft2;
                        paddingLeft2 += child.getMeasuredWidth();
                    } else if (hgrav != 5) {
                        childLeft = paddingLeft2;
                    } else {
                        childLeft = (width2 - paddingRight) - child.getMeasuredWidth();
                        paddingRight += child.getMeasuredWidth();
                    }
                    if (vgrav == 16) {
                        childTop = Math.max((height - child.getMeasuredHeight()) / 2, paddingTop);
                    } else if (vgrav == 48) {
                        childTop = paddingTop;
                        paddingTop += child.getMeasuredHeight();
                    } else if (vgrav != 80) {
                        childTop = paddingTop;
                    } else {
                        childTop = (height - paddingBottom) - child.getMeasuredHeight();
                        paddingBottom += child.getMeasuredHeight();
                    }
                    int childLeft2 = childLeft + scrollX;
                    child.layout(childLeft2, childTop, child.getMeasuredWidth() + childLeft2, childTop + child.getMeasuredHeight());
                    decorCount++;
                    paddingLeft2 = paddingLeft2;
                    paddingTop = paddingTop;
                }
            }
            i2++;
        }
        int childWidth = (width2 - paddingLeft2) - paddingRight;
        int i4 = 0;
        while (i4 < count2) {
            View child2 = getChildAt(i4);
            if (child2.getVisibility() != i) {
                Cg lp2 = (Cg) child2.getLayoutParams();
                if (!lp2.f۱۰۵۷۳a) {
                    Cf ii = m۱۲۷۷۱b(child2);
                    if (ii != null) {
                        count = count2;
                        int childLeft3 = paddingLeft2 + ((int) (((float) childWidth) * ii.f۱۰۵۷۲e));
                        if (lp2.f۱۰۵۷۶d) {
                            lp2.f۱۰۵۷۶d = false;
                            width = width2;
                            paddingLeft = paddingLeft2;
                            child2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) childWidth) * lp2.f۱۰۵۷۵c), 1073741824), View.MeasureSpec.makeMeasureSpec((height - paddingTop) - paddingBottom, 1073741824));
                        } else {
                            width = width2;
                            paddingLeft = paddingLeft2;
                        }
                        child2.layout(childLeft3, paddingTop, child2.getMeasuredWidth() + childLeft3, child2.getMeasuredHeight() + paddingTop);
                    } else {
                        width = width2;
                        paddingLeft = paddingLeft2;
                        count = count2;
                    }
                } else {
                    count = count2;
                    width = width2;
                    paddingLeft = paddingLeft2;
                }
            } else {
                count = count2;
                width = width2;
                paddingLeft = paddingLeft2;
            }
            i4++;
            count2 = count;
            width2 = width;
            paddingLeft2 = paddingLeft;
            i = 8;
        }
        this.f۱۰۵۵۵q = paddingTop;
        this.f۱۰۵۵۶r = height - paddingBottom;
        this.f۱۰۵۳۰T = decorCount;
        if (this.f۱۰۵۲۸R) {
            z = false;
            m۱۲۷۳۸a(this.f۱۰۵۴۶h, false, 0, false);
        } else {
            z = false;
        }
        this.f۱۰۵۲۸R = z;
    }

    public void computeScroll() {
        this.f۱۰۵۵۱m = true;
        if (this.f۱۰۵۵۰l.isFinished() || !this.f۱۰۵۵۰l.computeScrollOffset()) {
            m۱۲۷۴۱a(true);
            return;
        }
        int oldX = getScrollX();
        int oldY = getScrollY();
        int x = this.f۱۰۵۵۰l.getCurrX();
        int y = this.f۱۰۵۵۰l.getCurrY();
        if (!(oldX == x && oldY == y)) {
            scrollTo(x, y);
            if (!m۱۲۷۵۱f(x)) {
                this.f۱۰۵۵۰l.abortAnimation();
                scrollTo(0, y);
            }
        }
        Cu.m۱۲۹۷۰B(this);
    }

    /* renamed from: f  reason: contains not printable characters */
    private boolean m۱۲۷۵۱f(int xpos) {
        if (this.f۱۰۵۳۸d.size() != 0) {
            Cf ii = m۱۲۷۵۲g();
            int width = getClientWidth();
            int i = this.f۱۰۵۵۳o;
            int widthWithMargin = width + i;
            int currentPage = ii.f۱۰۵۶۹b;
            float pageOffset = ((((float) xpos) / ((float) width)) - ii.f۱۰۵۷۲e) / (ii.f۱۰۵۷۱d + (((float) i) / ((float) width)));
            this.f۱۰۵۲۹S = false;
            m۱۲۷۶۰a(currentPage, pageOffset, (int) (((float) widthWithMargin) * pageOffset));
            if (this.f۱۰۵۲۹S) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f۱۰۵۲۸R) {
            return false;
        } else {
            this.f۱۰۵۲۹S = false;
            m۱۲۷۶۰a(0, 0.0f, 0);
            if (this.f۱۰۵۲۹S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۶۰a(int position, float offset, int offsetPixels) {
        int childLeft;
        if (this.f۱۰۵۳۰T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = getChildAt(i);
                Cg lp = (Cg) child.getLayoutParams();
                if (lp.f۱۰۵۷۳a) {
                    int hgrav = lp.f۱۰۵۷۴b & 7;
                    if (hgrav == 1) {
                        childLeft = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (hgrav == 3) {
                        childLeft = paddingLeft;
                        paddingLeft += child.getWidth();
                    } else if (hgrav != 5) {
                        childLeft = paddingLeft;
                    } else {
                        childLeft = (width - paddingRight) - child.getMeasuredWidth();
                        paddingRight += child.getMeasuredWidth();
                    }
                    int childOffset = (childLeft + scrollX) - child.getLeft();
                    if (childOffset != 0) {
                        child.offsetLeftAndRight(childOffset);
                    }
                }
            }
        }
        m۱۲۷۴۳b(position, offset, offsetPixels);
        if (this.f۱۰۵۳۵b0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View child2 = getChildAt(i2);
                if (!((Cg) child2.getLayoutParams()).f۱۰۵۷۳a) {
                    this.f۱۰۵۳۵b0.m۱۲۷۸۹a(child2, ((float) (child2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.f۱۰۵۲۹S = true;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۲۷۴۳b(int position, float offset, int offsetPixels) {
        AbstractCj jVar = this.f۱۰۵۳۲V;
        if (jVar != null) {
            jVar.m۱۲۷۸۷a(position, offset, offsetPixels);
        }
        List<AbstractCj> list = this.f۱۰۵۳۱U;
        if (list != null) {
            int z = list.size();
            for (int i = 0; i < z; i++) {
                AbstractCj listener = this.f۱۰۵۳۱U.get(i);
                if (listener != null) {
                    listener.m۱۲۷۸۷a(position, offset, offsetPixels);
                }
            }
        }
        AbstractCj jVar2 = this.f۱۰۵۳۳W;
        if (jVar2 != null) {
            jVar2.m۱۲۷۸۷a(position, offset, offsetPixels);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۲۷۴۸d(int position) {
        AbstractCj jVar = this.f۱۰۵۳۲V;
        if (jVar != null) {
            jVar.m۱۲۷۸۸b(position);
        }
        List<AbstractCj> list = this.f۱۰۵۳۱U;
        if (list != null) {
            int z = list.size();
            for (int i = 0; i < z; i++) {
                AbstractCj listener = this.f۱۰۵۳۱U.get(i);
                if (listener != null) {
                    listener.m۱۲۷۸۸b(position);
                }
            }
        }
        AbstractCj jVar2 = this.f۱۰۵۳۳W;
        if (jVar2 != null) {
            jVar2.m۱۲۷۸۸b(position);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۲۷۴۹e(int state) {
        AbstractCj jVar = this.f۱۰۵۳۲V;
        if (jVar != null) {
            jVar.m۱۲۷۸۶a(state);
        }
        List<AbstractCj> list = this.f۱۰۵۳۱U;
        if (list != null) {
            int z = list.size();
            for (int i = 0; i < z; i++) {
                AbstractCj listener = this.f۱۰۵۳۱U.get(i);
                if (listener != null) {
                    listener.m۱۲۷۸۶a(state);
                }
            }
        }
        AbstractCj jVar2 = this.f۱۰۵۳۳W;
        if (jVar2 != null) {
            jVar2.m۱۲۷۸۶a(state);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۷۴۱a(boolean postEvents) {
        boolean needPopulate = this.f۱۰۵۴۵g0 == 2;
        if (needPopulate) {
            setScrollingCacheEnabled(false);
            if (true ^ this.f۱۰۵۵۰l.isFinished()) {
                this.f۱۰۵۵۰l.abortAnimation();
                int oldX = getScrollX();
                int oldY = getScrollY();
                int x = this.f۱۰۵۵۰l.getCurrX();
                int y = this.f۱۰۵۵۰l.getCurrY();
                if (!(oldX == x && oldY == y)) {
                    scrollTo(x, y);
                    if (x != oldX) {
                        m۱۲۷۵۱f(x);
                    }
                }
            }
        }
        this.f۱۰۵۶۲x = false;
        for (int i = 0; i < this.f۱۰۵۳۸d.size(); i++) {
            Cf ii = this.f۱۰۵۳۸d.get(i);
            if (ii.f۱۰۵۷۰c) {
                needPopulate = true;
                ii.f۱۰۵۷۰c = false;
            }
        }
        if (!needPopulate) {
            return;
        }
        if (postEvents) {
            Cu.m۱۲۹۸۹a(this, this.f۱۰۵۴۳f0);
        } else {
            this.f۱۰۵۴۳f0.run();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۲۷۴۲a(float x, float dx) {
        return (x < ((float) this.f۱۰۵۱۳C) && dx > 0.0f) || (x > ((float) (getWidth() - this.f۱۰۵۱۳C)) && dx < 0.0f);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۲۷۴۴b(boolean enable) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(enable ? this.f۱۰۵۳۷c0 : 0, null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float y;
        int action = ev.getAction() & 255;
        if (action == 3 || action == 1) {
            m۱۲۷۵۴i();
            return false;
        }
        if (action != 0) {
            if (this.f۱۰۵۶۴z) {
                return true;
            }
            if (this.f۱۰۵۱۱A) {
                return false;
            }
        }
        if (action == 0) {
            float x = ev.getX();
            this.f۱۰۵۱۷G = x;
            this.f۱۰۵۱۵E = x;
            float y2 = ev.getY();
            this.f۱۰۵۱۸H = y2;
            this.f۱۰۵۱۶F = y2;
            this.f۱۰۵۱۹I = ev.getPointerId(0);
            this.f۱۰۵۱۱A = false;
            this.f۱۰۵۵۱m = true;
            this.f۱۰۵۵۰l.computeScrollOffset();
            if (this.f۱۰۵۴۵g0 != 2 || Math.abs(this.f۱۰۵۵۰l.getFinalX() - this.f۱۰۵۵۰l.getCurrX()) <= this.f۱۰۵۲۴N) {
                m۱۲۷۴۱a(false);
                this.f۱۰۵۶۴z = false;
            } else {
                this.f۱۰۵۵۰l.abortAnimation();
                this.f۱۰۵۶۲x = false;
                m۱۲۷۷۸e();
                this.f۱۰۵۶۴z = true;
                m۱۲۷۴۶c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int activePointerId = this.f۱۰۵۱۹I;
            if (activePointerId != -1) {
                int pointerIndex = ev.findPointerIndex(activePointerId);
                float x2 = ev.getX(pointerIndex);
                float dx = x2 - this.f۱۰۵۱۵E;
                float xDiff = Math.abs(dx);
                float y3 = ev.getY(pointerIndex);
                float yDiff = Math.abs(y3 - this.f۱۰۵۱۸H);
                if (dx == 0.0f || m۱۲۷۴۲a(this.f۱۰۵۱۵E, dx)) {
                    y = y3;
                } else {
                    y = y3;
                    if (m۱۲۷۶۹a(this, false, (int) dx, (int) x2, (int) y3)) {
                        this.f۱۰۵۱۵E = x2;
                        this.f۱۰۵۱۶F = y;
                        this.f۱۰۵۱۱A = true;
                        return false;
                    }
                }
                if (xDiff > ((float) this.f۱۰۵۱۴D) && 0.5f * xDiff > yDiff) {
                    this.f۱۰۵۶۴z = true;
                    m۱۲۷۴۶c(true);
                    setScrollState(1);
                    this.f۱۰۵۱۵E = dx > 0.0f ? this.f۱۰۵۱۷G + ((float) this.f۱۰۵۱۴D) : this.f۱۰۵۱۷G - ((float) this.f۱۰۵۱۴D);
                    this.f۱۰۵۱۶F = y;
                    setScrollingCacheEnabled(true);
                } else if (yDiff > ((float) this.f۱۰۵۱۴D)) {
                    this.f۱۰۵۱۱A = true;
                }
                if (this.f۱۰۵۶۴z && m۱۲۷۴۵b(x2)) {
                    Cu.m۱۲۹۷۰B(this);
                }
            }
        } else if (action == 6) {
            m۱۲۷۴۰a(ev);
        }
        if (this.f۱۰۵۲۰J == null) {
            this.f۱۰۵۲۰J = VelocityTracker.obtain();
        }
        this.f۱۰۵۲۰J.addMovement(ev);
        return this.f۱۰۵۶۴z;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        AbstractCq qVar;
        if (this.f۱۰۵۲۵O) {
            return true;
        }
        if ((ev.getAction() == 0 && ev.getEdgeFlags() != 0) || (qVar = this.f۱۰۵۴۴g) == null || qVar.m۱۲۹۵۱a() == 0) {
            return false;
        }
        if (this.f۱۰۵۲۰J == null) {
            this.f۱۰۵۲۰J = VelocityTracker.obtain();
        }
        this.f۱۰۵۲۰J.addMovement(ev);
        boolean needsInvalidate = false;
        int action = ev.getAction() & 255;
        if (action == 0) {
            this.f۱۰۵۵۰l.abortAnimation();
            this.f۱۰۵۶۲x = false;
            m۱۲۷۷۸e();
            float x = ev.getX();
            this.f۱۰۵۱۷G = x;
            this.f۱۰۵۱۵E = x;
            float y = ev.getY();
            this.f۱۰۵۱۸H = y;
            this.f۱۰۵۱۶F = y;
            this.f۱۰۵۱۹I = ev.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f۱۰۵۶۴z) {
                    int pointerIndex = ev.findPointerIndex(this.f۱۰۵۱۹I);
                    if (pointerIndex == -1) {
                        needsInvalidate = m۱۲۷۵۴i();
                    } else {
                        float x2 = ev.getX(pointerIndex);
                        float xDiff = Math.abs(x2 - this.f۱۰۵۱۵E);
                        float y2 = ev.getY(pointerIndex);
                        float yDiff = Math.abs(y2 - this.f۱۰۵۱۶F);
                        if (xDiff > ((float) this.f۱۰۵۱۴D) && xDiff > yDiff) {
                            this.f۱۰۵۶۴z = true;
                            m۱۲۷۴۶c(true);
                            float f = this.f۱۰۵۱۷G;
                            this.f۱۰۵۱۵E = x2 - f > 0.0f ? f + ((float) this.f۱۰۵۱۴D) : f - ((float) this.f۱۰۵۱۴D);
                            this.f۱۰۵۱۶F = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f۱۰۵۶۴z) {
                    needsInvalidate = false | m۱۲۷۴۵b(ev.getX(ev.findPointerIndex(this.f۱۰۵۱۹I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int index = ev.getActionIndex();
                    this.f۱۰۵۱۵E = ev.getX(index);
                    this.f۱۰۵۱۹I = ev.getPointerId(index);
                } else if (action == 6) {
                    m۱۲۷۴۰a(ev);
                    this.f۱۰۵۱۵E = ev.getX(ev.findPointerIndex(this.f۱۰۵۱۹I));
                }
            } else if (this.f۱۰۵۶۴z) {
                m۱۲۷۳۸a(this.f۱۰۵۴۶h, true, 0, false);
                needsInvalidate = m۱۲۷۵۴i();
            }
        } else if (this.f۱۰۵۶۴z) {
            VelocityTracker velocityTracker = this.f۱۰۵۲۰J;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f۱۰۵۲۲L);
            int initialVelocity = (int) velocityTracker.getXVelocity(this.f۱۰۵۱۹I);
            this.f۱۰۵۶۲x = true;
            int width = getClientWidth();
            int scrollX = getScrollX();
            Cf ii = m۱۲۷۵۲g();
            m۱۲۷۶۴a(m۱۲۷۳۵a(ii.f۱۰۵۶۹b, ((((float) scrollX) / ((float) width)) - ii.f۱۰۵۷۲e) / (ii.f۱۰۵۷۱d + (((float) this.f۱۰۵۵۳o) / ((float) width))), initialVelocity, (int) (ev.getX(ev.findPointerIndex(this.f۱۰۵۱۹I)) - this.f۱۰۵۱۷G)), true, true, initialVelocity);
            needsInvalidate = m۱۲۷۵۴i();
        }
        if (needsInvalidate) {
            Cu.m۱۲۹۷۰B(this);
        }
        return true;
    }

    /* renamed from: i  reason: contains not printable characters */
    private boolean m۱۲۷۵۴i() {
        this.f۱۰۵۱۹I = -1;
        m۱۲۷۵۰f();
        this.f۱۰۵۲۶P.onRelease();
        this.f۱۰۵۲۷Q.onRelease();
        return this.f۱۰۵۲۶P.isFinished() || this.f۱۰۵۲۷Q.isFinished();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۲۷۴۶c(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۲۷۴۵b(float x) {
        boolean needsInvalidate = false;
        this.f۱۰۵۱۵E = x;
        float scrollX = ((float) getScrollX()) + (this.f۱۰۵۱۵E - x);
        int width = getClientWidth();
        float leftBound = ((float) width) * this.f۱۰۵۵۷s;
        float rightBound = ((float) width) * this.f۱۰۵۵۸t;
        boolean leftAbsolute = true;
        boolean rightAbsolute = true;
        Cf firstItem = this.f۱۰۵۳۸d.get(0);
        ArrayList<Cf> arrayList = this.f۱۰۵۳۸d;
        Cf lastItem = arrayList.get(arrayList.size() - 1);
        if (firstItem.f۱۰۵۶۹b != 0) {
            leftAbsolute = false;
            leftBound = firstItem.f۱۰۵۷۲e * ((float) width);
        }
        if (lastItem.f۱۰۵۶۹b != this.f۱۰۵۴۴g.m۱۲۹۵۱a() - 1) {
            rightAbsolute = false;
            rightBound = lastItem.f۱۰۵۷۲e * ((float) width);
        }
        if (scrollX < leftBound) {
            if (leftAbsolute) {
                this.f۱۰۵۲۶P.onPull(Math.abs(leftBound - scrollX) / ((float) width));
                needsInvalidate = true;
            }
            scrollX = leftBound;
        } else if (scrollX > rightBound) {
            if (rightAbsolute) {
                this.f۱۰۵۲۷Q.onPull(Math.abs(scrollX - rightBound) / ((float) width));
                needsInvalidate = true;
            }
            scrollX = rightBound;
        }
        this.f۱۰۵۱۵E += scrollX - ((float) ((int) scrollX));
        scrollTo((int) scrollX, getScrollY());
        m۱۲۷۵۱f((int) scrollX);
        return needsInvalidate;
    }

    /* renamed from: g  reason: contains not printable characters */
    private Cf m۱۲۷۵۲g() {
        int width = getClientWidth();
        float marginOffset = 0.0f;
        float scrollOffset = width > 0 ? ((float) getScrollX()) / ((float) width) : 0.0f;
        if (width > 0) {
            marginOffset = ((float) this.f۱۰۵۵۳o) / ((float) width);
        }
        int lastPos = -1;
        float lastOffset = 0.0f;
        float lastWidth = 0.0f;
        boolean first = true;
        Cf lastItem = null;
        int i = 0;
        while (i < this.f۱۰۵۳۸d.size()) {
            Cf ii = this.f۱۰۵۳۸d.get(i);
            if (!first && ii.f۱۰۵۶۹b != lastPos + 1) {
                ii = this.f۱۰۵۴۰e;
                ii.f۱۰۵۷۲e = lastOffset + lastWidth + marginOffset;
                ii.f۱۰۵۶۹b = lastPos + 1;
                ii.f۱۰۵۷۱d = this.f۱۰۵۴۴g.m۱۲۹۶۰b(ii.f۱۰۵۶۹b);
                i--;
            }
            float offset = ii.f۱۰۵۷۲e;
            float rightBound = ii.f۱۰۵۷۱d + offset + marginOffset;
            if (!first && scrollOffset < offset) {
                return lastItem;
            }
            if (scrollOffset < rightBound || i == this.f۱۰۵۳۸d.size() - 1) {
                return ii;
            }
            first = false;
            lastPos = ii.f۱۰۵۶۹b;
            lastOffset = offset;
            lastWidth = ii.f۱۰۵۷۱d;
            lastItem = ii;
            i++;
        }
        return lastItem;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۲۷۳۵a(int currentPage, float pageOffset, int velocity, int deltaX) {
        int targetPage;
        if (Math.abs(deltaX) <= this.f۱۰۵۲۳M || Math.abs(velocity) <= this.f۱۰۵۲۱K) {
            targetPage = currentPage + ((int) (pageOffset + (currentPage >= this.f۱۰۵۴۶h ? 0.4f : 0.6f)));
        } else {
            targetPage = velocity > 0 ? currentPage : currentPage + 1;
        }
        if (this.f۱۰۵۳۸d.size() <= 0) {
            return targetPage;
        }
        ArrayList<Cf> arrayList = this.f۱۰۵۳۸d;
        return Math.max(this.f۱۰۵۳۸d.get(0).f۱۰۵۶۹b, Math.min(targetPage, arrayList.get(arrayList.size() - 1).f۱۰۵۶۹b));
    }

    public void draw(Canvas canvas) {
        AbstractCq qVar;
        super.draw(canvas);
        boolean needsInvalidate = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (qVar = this.f۱۰۵۴۴g) != null && qVar.m۱۲۹۵۱a() > 1)) {
            if (!this.f۱۰۵۲۶P.isFinished()) {
                int restoreCount = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f۱۰۵۵۷s * ((float) width));
                this.f۱۰۵۲۶P.setSize(height, width);
                needsInvalidate = false | this.f۱۰۵۲۶P.draw(canvas);
                canvas.restoreToCount(restoreCount);
            }
            if (!this.f۱۰۵۲۷Q.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f۱۰۵۵۸t + 1.0f)) * ((float) width2));
                this.f۱۰۵۲۷Q.setSize(height2, width2);
                needsInvalidate |= this.f۱۰۵۲۷Q.draw(canvas);
                canvas.restoreToCount(restoreCount2);
            }
        } else {
            this.f۱۰۵۲۶P.finish();
            this.f۱۰۵۲۷Q.finish();
        }
        if (needsInvalidate) {
            Cu.m۱۲۹۷۰B(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float drawAt;
        float marginOffset;
        super.onDraw(canvas);
        if (this.f۱۰۵۵۳o > 0 && this.f۱۰۵۵۴p != null && this.f۱۰۵۳۸d.size() > 0 && this.f۱۰۵۴۴g != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float marginOffset2 = ((float) this.f۱۰۵۵۳o) / ((float) width);
            int itemIndex = 0;
            Cf ii = this.f۱۰۵۳۸d.get(0);
            float offset = ii.f۱۰۵۷۲e;
            int itemCount = this.f۱۰۵۳۸d.size();
            int firstPos = ii.f۱۰۵۶۹b;
            int lastPos = this.f۱۰۵۳۸d.get(itemCount - 1).f۱۰۵۶۹b;
            int pos = firstPos;
            while (pos < lastPos) {
                while (pos > ii.f۱۰۵۶۹b && itemIndex < itemCount) {
                    itemIndex++;
                    ii = this.f۱۰۵۳۸d.get(itemIndex);
                }
                if (pos == ii.f۱۰۵۶۹b) {
                    float f = ii.f۱۰۵۷۲e;
                    float f2 = ii.f۱۰۵۷۱d;
                    drawAt = (f + f2) * ((float) width);
                    offset = f + f2 + marginOffset2;
                } else {
                    float widthFactor = this.f۱۰۵۴۴g.m۱۲۹۶۰b(pos);
                    drawAt = ((float) width) * (offset + widthFactor);
                    offset += widthFactor + marginOffset2;
                }
                if (((float) this.f۱۰۵۵۳o) + drawAt > ((float) scrollX)) {
                    marginOffset = marginOffset2;
                    this.f۱۰۵۵۴p.setBounds(Math.round(drawAt), this.f۱۰۵۵۵q, Math.round(((float) this.f۱۰۵۵۳o) + drawAt), this.f۱۰۵۵۶r);
                    this.f۱۰۵۵۴p.draw(canvas);
                } else {
                    marginOffset = marginOffset2;
                }
                if (drawAt <= ((float) (scrollX + width))) {
                    pos++;
                    marginOffset2 = marginOffset;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۷۴۰a(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.f۱۰۵۱۹I) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f۱۰۵۱۵E = ev.getX(newPointerIndex);
            this.f۱۰۵۱۹I = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.f۱۰۵۲۰J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۲۷۵۰f() {
        this.f۱۰۵۶۴z = false;
        this.f۱۰۵۱۱A = false;
        VelocityTracker velocityTracker = this.f۱۰۵۲۰J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f۱۰۵۲۰J = null;
        }
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.f۱۰۵۶۱w != enabled) {
            this.f۱۰۵۶۱w = enabled;
        }
    }

    public boolean canScrollHorizontally(int direction) {
        if (this.f۱۰۵۴۴g == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (direction < 0) {
            if (scrollX > ((int) (((float) width) * this.f۱۰۵۵۷s))) {
                return true;
            }
            return false;
        } else if (direction <= 0 || scrollX >= ((int) (((float) width) * this.f۱۰۵۵۸t))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۷۶۹a(View v, boolean checkV, int dx, int x, int y) {
        if (v instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) v;
            int scrollX = v.getScrollX();
            int scrollY = v.getScrollY();
            for (int i = group.getChildCount() - 1; i >= 0; i--) {
                View child = group.getChildAt(i);
                if (x + scrollX >= child.getLeft() && x + scrollX < child.getRight() && y + scrollY >= child.getTop() && y + scrollY < child.getBottom() && m۱۲۷۶۹a(child, true, dx, (x + scrollX) - child.getLeft(), (y + scrollY) - child.getTop())) {
                    return true;
                }
            }
        }
        if (checkV) {
            if (v.canScrollHorizontally(-dx)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || m۱۲۷۶۸a(event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۷۶۸a(KeyEvent event) {
        if (event.getAction() != 0) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (event.hasNoModifiers()) {
                    return m۱۲۷۶۷a(2);
                }
                if (event.hasModifiers(1)) {
                    return m۱۲۷۶۷a(1);
                }
                return false;
            } else if (event.hasModifiers(2)) {
                return m۱۲۷۷۷d();
            } else {
                return m۱۲۷۶۷a(66);
            }
        } else if (event.hasModifiers(2)) {
            return m۱۲۷۷۶c();
        } else {
            return m۱۲۷۶۷a(17);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۷۶۷a(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        } else if (currentFocused != null) {
            boolean isChild = false;
            ViewParent parent = currentFocused.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (parent == this) {
                    isChild = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!isChild) {
                StringBuilder sb = new StringBuilder();
                sb.append(currentFocused.getClass().getSimpleName());
                for (ViewParent parent2 = currentFocused.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                currentFocused = null;
            }
        }
        boolean handled = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        if (nextFocused == null || nextFocused == currentFocused) {
            if (direction == 17 || direction == 1) {
                handled = m۱۲۷۷۶c();
            } else if (direction == 66 || direction == 2) {
                handled = m۱۲۷۷۷d();
            }
        } else if (direction == 17) {
            handled = (currentFocused == null || m۱۲۷۳۶a(this.f۱۰۵۴۲f, nextFocused).left < m۱۲۷۳۶a(this.f۱۰۵۴۲f, currentFocused).left) ? nextFocused.requestFocus() : m۱۲۷۷۶c();
        } else if (direction == 66) {
            handled = (currentFocused == null || m۱۲۷۳۶a(this.f۱۰۵۴۲f, nextFocused).left > m۱۲۷۳۶a(this.f۱۰۵۴۲f, currentFocused).left) ? nextFocused.requestFocus() : m۱۲۷۷۷d();
        }
        if (handled) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
        }
        return handled;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Rect m۱۲۷۳۶a(Rect outRect, View child) {
        if (outRect == null) {
            outRect = new Rect();
        }
        if (child == null) {
            outRect.set(0, 0, 0, 0);
            return outRect;
        }
        outRect.left = child.getLeft();
        outRect.right = child.getRight();
        outRect.top = child.getTop();
        outRect.bottom = child.getBottom();
        ViewParent parent = child.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup group = (ViewGroup) parent;
            outRect.left += group.getLeft();
            outRect.right += group.getRight();
            outRect.top += group.getTop();
            outRect.bottom += group.getBottom();
            parent = group.getParent();
        }
        return outRect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۲۷۷۶c() {
        int i = this.f۱۰۵۴۶h;
        if (i <= 0) {
            return false;
        }
        m۱۲۷۶۲a(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۲۷۷۷d() {
        AbstractCq qVar = this.f۱۰۵۴۴g;
        if (qVar == null || this.f۱۰۵۴۶h >= qVar.m۱۲۹۵۱a() - 1) {
            return false;
        }
        m۱۲۷۶۲a(this.f۱۰۵۴۶h + 1, true);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        Cf ii;
        int focusableCount = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);
                if (child.getVisibility() == 0 && (ii = m۱۲۷۷۱b(child)) != null && ii.f۱۰۵۶۹b == this.f۱۰۵۴۶h) {
                    child.addFocusables(views, direction, focusableMode);
                }
            }
        }
        if ((descendantFocusability == 262144 && focusableCount != views.size()) || !isFocusable()) {
            return;
        }
        if (((focusableMode & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && views != null) {
            views.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> views) {
        Cf ii;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (child.getVisibility() == 0 && (ii = m۱۲۷۷۱b(child)) != null && ii.f۱۰۵۶۹b == this.f۱۰۵۴۶h) {
                child.addTouchables(views);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        int end;
        int increment;
        int index;
        Cf ii;
        int count = getChildCount();
        if ((direction & 2) != 0) {
            index = 0;
            increment = 1;
            end = count;
        } else {
            index = count - 1;
            increment = -1;
            end = -1;
        }
        for (int i = index; i != end; i += increment) {
            View child = getChildAt(i);
            if (child.getVisibility() == 0 && (ii = m۱۲۷۷۱b(child)) != null && ii.f۱۰۵۶۹b == this.f۱۰۵۴۶h && child.requestFocus(direction, previouslyFocusedRect)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        Cf ii;
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() == 0 && (ii = m۱۲۷۷۱b(child)) != null && ii.f۱۰۵۶۹b == this.f۱۰۵۴۶h && child.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Cg();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof Cg) && super.checkLayoutParams(p);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new Cg(getContext(), attrs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$h  reason: invalid class name */
    public class Ch extends Cb {
        Ch() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۲۷۸۴b(View host, AccessibilityEvent event) {
            AbstractCq qVar;
            super.m۱۲۸۰۱b(host, event);
            event.setClassName(ViewPager.class.getName());
            event.setScrollable(m۱۲۷۸۱b());
            if (event.getEventType() == 4096 && (qVar = ViewPager.this.f۱۰۵۴۴g) != null) {
                event.setItemCount(qVar.m۱۲۹۵۱a());
                event.setFromIndex(ViewPager.this.f۱۰۵۴۶h);
                event.setToIndex(ViewPager.this.f۱۰۵۴۶h);
            }
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۷۸۲a(View host, Cc info2) {
            super.m۱۲۷۹۷a(host, info2);
            info2.m۱۲۸۴۲a((CharSequence) ViewPager.class.getName());
            info2.m۱۲۸۷۷k(m۱۲۷۸۱b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                info2.m۱۲۸۳۸a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                info2.m۱۲۸۳۸a(8192);
            }
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۲۷۸۳a(View host, int action, Bundle args) {
            if (super.m۱۲۷۹۸a(host, action, args)) {
                return true;
            }
            if (action != 4096) {
                if (action != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f۱۰۵۴۶h - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f۱۰۵۴۶h + 1);
                return true;
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private boolean m۱۲۷۸۱b() {
            AbstractCq qVar = ViewPager.this.f۱۰۵۴۴g;
            return qVar != null && qVar.m۱۲۹۵۱a() > 1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$l  reason: invalid class name */
    private class Cl extends DataSetObserver {
        Cl() {
        }

        public void onChanged() {
            ViewPager.this.m۱۲۷۵۹a();
        }

        public void onInvalidated() {
            ViewPager.this.m۱۲۷۵۹a();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$g  reason: invalid class name */
    public static class Cg extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        public boolean f۱۰۵۷۳a;

        /* renamed from: b  reason: contains not printable characters */
        public int f۱۰۵۷۴b;

        /* renamed from: c  reason: contains not printable characters */
        float f۱۰۵۷۵c = 0.0f;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۰۵۷۶d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۰۵۷۷e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۰۵۷۸f;

        public Cg() {
            super(-1, -1);
        }

        public Cg(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, ViewPager.f۱۰۵۰۷h0);
            this.f۱۰۵۷۴b = a.getInteger(0, 48);
            a.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ViewPager$n  reason: invalid class name */
    public static class Cn implements Comparator<View> {
        Cn() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(View lhs, View rhs) {
            Cg llp = (Cg) lhs.getLayoutParams();
            Cg rlp = (Cg) rhs.getLayoutParams();
            boolean z = llp.f۱۰۵۷۳a;
            if (z != rlp.f۱۰۵۷۳a) {
                return z ? 1 : -1;
            }
            return llp.f۱۰۵۷۷e - rlp.f۱۰۵۷۷e;
        }
    }
}
