package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.Cu;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cs {

    /* renamed from: w, reason: contains not printable characters */
    private static final Interpolator f۱۰۸۱۱w = new a();

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۰۸۱۲a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۰۸۱۳b;

    /* renamed from: d, reason: contains not printable characters */
    private float[] f۱۰۸۱۵d;

    /* renamed from: e, reason: contains not printable characters */
    private float[] f۱۰۸۱۶e;

    /* renamed from: f, reason: contains not printable characters */
    private float[] f۱۰۸۱۷f;

    /* renamed from: g, reason: contains not printable characters */
    private float[] f۱۰۸۱۸g;

    /* renamed from: h, reason: contains not printable characters */
    private int[] f۱۰۸۱۹h;

    /* renamed from: i, reason: contains not printable characters */
    private int[] f۱۰۸۲۰i;

    /* renamed from: j, reason: contains not printable characters */
    private int[] f۱۰۸۲۱j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۰۸۲۲k;

    /* renamed from: l, reason: contains not printable characters */
    private VelocityTracker f۱۰۸۲۳l;

    /* renamed from: m, reason: contains not printable characters */
    private float f۱۰۸۲۴m;

    /* renamed from: n, reason: contains not printable characters */
    private float f۱۰۸۲۵n;

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۰۸۲۶o;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۰۸۲۷p;

    /* renamed from: q, reason: contains not printable characters */
    private OverScroller f۱۰۸۲۸q;

    /* renamed from: r, reason: contains not printable characters */
    private final c f۱۰۸۲۹r;

    /* renamed from: s, reason: contains not printable characters */
    private View f۱۰۸۳۰s;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۰۸۳۱t;

    /* renamed from: u, reason: contains not printable characters */
    private final ViewGroup f۱۰۸۳۲u;

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۰۸۱۴c = -1;

    /* renamed from: v, reason: contains not printable characters */
    private final Runnable f۱۰۸۳۳v = new b();

    /* renamed from: android.support.v4.widget.s$c */
    public static abstract class c {
        /* renamed from: a, reason: contains not printable characters */
        public abstract int mo۱۱۲۹۵a(View view, int i, int i2);

        /* renamed from: a, reason: contains not printable characters */
        public abstract void mo۱۱۲۹۷a(View view, float f2, float f3);

        /* renamed from: a, reason: contains not printable characters */
        public abstract void mo۱۱۲۹۹a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b, reason: contains not printable characters */
        public abstract int mo۱۱۳۰۱b(View view, int i, int i2);

        /* renamed from: b, reason: contains not printable characters */
        public abstract boolean mo۱۱۳۰۴b(View view, int i);

        /* renamed from: c, reason: contains not printable characters */
        public abstract void mo۱۱۳۰۵c(int i);

        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۲۹۸a(View capturedChild, int activePointerId) {
        }

        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۱۳۰۲b(int edgeFlags, int pointerId) {
        }

        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۳۰۳b(int edgeFlags) {
            return false;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۲۹۶a(int edgeFlags, int pointerId) {
        }

        /* renamed from: a, reason: contains not printable characters */
        public int m۱۱۲۹۳a(int index) {
            return index;
        }

        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۱۲۹۴a(View child) {
            return 0;
        }

        /* renamed from: b, reason: contains not printable characters */
        public int mo۱۱۳۰۰b(View child) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.widget.s$a */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    /* renamed from: android.support.v4.widget.s$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Cs.this.m۱۱۲۸۷c(0);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cs m۱۱۲۵۵a(ViewGroup forParent, c cb) {
        return new Cs(forParent.getContext(), forParent, cb);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cs m۱۱۲۵۴a(ViewGroup forParent, float sensitivity, c cb) {
        Cs helper = m۱۱۲۵۵a(forParent, cb);
        helper.f۱۰۸۱۳b = (int) (helper.f۱۰۸۱۳b * (1.0f / sensitivity));
        return helper;
    }

    private Cs(Context context, ViewGroup forParent, c cb) {
        if (forParent == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cb == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f۱۰۸۳۲u = forParent;
        this.f۱۰۸۲۹r = cb;
        ViewConfiguration vc = ViewConfiguration.get(context);
        float density = context.getResources().getDisplayMetrics().density;
        this.f۱۰۸۲۶o = (int) ((20.0f * density) + 0.5f);
        this.f۱۰۸۱۳b = vc.getScaledTouchSlop();
        this.f۱۰۸۲۴m = vc.getScaledMaximumFlingVelocity();
        this.f۱۰۸۲۵n = vc.getScaledMinimumFlingVelocity();
        this.f۱۰۸۲۸q = new OverScroller(context, f۱۰۸۱۱w);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۲۷۳a(float minVel) {
        this.f۱۰۸۲۵n = minVel;
    }

    /* renamed from: e, reason: contains not printable characters */
    public int m۱۱۲۹۲e() {
        return this.f۱۰۸۱۲a;
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۱۲۹۰d(int edgeFlags) {
        this.f۱۰۸۲۷p = edgeFlags;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۱۲۸۶c() {
        return this.f۱۰۸۲۶o;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۲۷۵a(View childView, int activePointerId) {
        if (childView.getParent() != this.f۱۰۸۳۲u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f۱۰۸۳۲u + ")");
        }
        this.f۱۰۸۳۰s = childView;
        this.f۱۰۸۱۴c = activePointerId;
        this.f۱۰۸۲۹r.mo۱۱۲۹۸a(childView, activePointerId);
        m۱۱۲۸۷c(1);
    }

    /* renamed from: b, reason: contains not printable characters */
    public View m۱۱۲۸۰b() {
        return this.f۱۰۸۳۰s;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۱۲۸۹d() {
        return this.f۱۰۸۱۳b;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۲۷۲a() {
        this.f۱۰۸۱۴c = -1;
        m۱۱۲۶۸f();
        VelocityTracker velocityTracker = this.f۱۰۸۲۳l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f۱۰۸۲۳l = null;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۱۲۸۵b(View child, int finalLeft, int finalTop) {
        this.f۱۰۸۳۰s = child;
        this.f۱۰۸۱۴c = -1;
        boolean continueSliding = m۱۱۲۶۴b(finalLeft, finalTop, 0, 0);
        if (!continueSliding && this.f۱۰۸۱۲a == 0 && this.f۱۰۸۳۰s != null) {
            this.f۱۰۸۳۰s = null;
        }
        return continueSliding;
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean m۱۱۲۹۱d(int finalLeft, int finalTop) {
        if (!this.f۱۰۸۳۱t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m۱۱۲۶۴b(finalLeft, finalTop, (int) this.f۱۰۸۲۳l.getXVelocity(this.f۱۰۸۱۴c), (int) this.f۱۰۸۲۳l.getYVelocity(this.f۱۰۸۱۴c));
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۱۲۶۴b(int finalLeft, int finalTop, int xvel, int yvel) {
        int startLeft = this.f۱۰۸۳۰s.getLeft();
        int startTop = this.f۱۰۸۳۰s.getTop();
        int dx = finalLeft - startLeft;
        int dy = finalTop - startTop;
        if (dx == 0 && dy == 0) {
            this.f۱۰۸۲۸q.abortAnimation();
            m۱۱۲۸۷c(0);
            return false;
        }
        int duration = m۱۱۲۵۳a(this.f۱۰۸۳۰s, dx, dy, xvel, yvel);
        this.f۱۰۸۲۸q.startScroll(startLeft, startTop, dx, dy, duration);
        m۱۱۲۸۷c(2);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۱۲۵۳a(View child, int dx, int dy, int xvel, int yvel) {
        float f2;
        float f3;
        float f4;
        float f5;
        int xvel2 = m۱۱۲۵۲a(xvel, (int) this.f۱۰۸۲۵n, (int) this.f۱۰۸۲۴m);
        int yvel2 = m۱۱۲۵۲a(yvel, (int) this.f۱۰۸۲۵n, (int) this.f۱۰۸۲۴m);
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        int absXVel = Math.abs(xvel2);
        int absYVel = Math.abs(yvel2);
        int addedVel = absXVel + absYVel;
        int addedDistance = absDx + absDy;
        if (xvel2 != 0) {
            f2 = absXVel;
            f3 = addedVel;
        } else {
            f2 = absDx;
            f3 = addedDistance;
        }
        float xweight = f2 / f3;
        if (yvel2 != 0) {
            f4 = absYVel;
            f5 = addedVel;
        } else {
            f4 = absDy;
            f5 = addedDistance;
        }
        float yweight = f4 / f5;
        int xduration = m۱۱۲۶۲b(dx, xvel2, this.f۱۰۸۲۹r.mo۱۱۲۹۴a(child));
        int yduration = m۱۱۲۶۲b(dy, yvel2, this.f۱۰۸۲۹r.mo۱۱۳۰۰b(child));
        return (int) ((xduration * xweight) + (yduration * yweight));
    }

    /* renamed from: b, reason: contains not printable characters */
    private int m۱۱۲۶۲b(int delta, int velocity, int motionRange) {
        int duration;
        if (delta == 0) {
            return 0;
        }
        int width = this.f۱۰۸۳۲u.getWidth();
        int halfWidth = width / 2;
        float distanceRatio = Math.min(1.0f, Math.abs(delta) / width);
        float distance = halfWidth + (halfWidth * m۱۱۲۶۱b(distanceRatio));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / velocity2) * 1000.0f) * 4;
        } else {
            float range = Math.abs(delta) / motionRange;
            duration = (int) ((1.0f + range) * 256.0f);
        }
        return Math.min(duration, 600);
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۱۲۵۲a(int value, int absMin, int absMax) {
        int absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0;
        }
        if (absValue > absMax) {
            return value > 0 ? absMax : -absMax;
        }
        return value;
    }

    /* renamed from: a, reason: contains not printable characters */
    private float m۱۱۲۵۱a(float value, float absMin, float absMax) {
        float absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0.0f;
        }
        if (absValue > absMax) {
            return value > 0.0f ? absMax : -absMax;
        }
        return value;
    }

    /* renamed from: b, reason: contains not printable characters */
    private float m۱۱۲۶۱b(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۲۷۹a(boolean deferCallbacks) {
        if (this.f۱۰۸۱۲a == 2) {
            boolean keepGoing = this.f۱۰۸۲۸q.computeScrollOffset();
            int x = this.f۱۰۸۲۸q.getCurrX();
            int y = this.f۱۰۸۲۸q.getCurrY();
            int dx = x - this.f۱۰۸۳۰s.getLeft();
            int dy = y - this.f۱۰۸۳۰s.getTop();
            if (dx != 0) {
                Cu.m۱۰۹۳۱c(this.f۱۰۸۳۰s, dx);
            }
            if (dy != 0) {
                Cu.m۱۰۹۳۳d(this.f۱۰۸۳۰s, dy);
            }
            if (dx != 0 || dy != 0) {
                this.f۱۰۸۲۹r.mo۱۱۲۹۹a(this.f۱۰۸۳۰s, x, y, dx, dy);
            }
            if (keepGoing && x == this.f۱۰۸۲۸q.getFinalX() && y == this.f۱۰۸۲۸q.getFinalY()) {
                this.f۱۰۸۲۸q.abortAnimation();
                keepGoing = false;
            }
            if (!keepGoing) {
                if (deferCallbacks) {
                    this.f۱۰۸۳۲u.post(this.f۱۰۸۳۳v);
                } else {
                    m۱۱۲۸۷c(0);
                }
            }
        }
        return this.f۱۰۸۱۲a == 2;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۲۵۶a(float xvel, float yvel) {
        this.f۱۰۸۳۱t = true;
        this.f۱۰۸۲۹r.mo۱۱۲۹۷a(this.f۱۰۸۳۰s, xvel, yvel);
        this.f۱۰۸۳۱t = false;
        if (this.f۱۰۸۱۲a == 1) {
            m۱۱۲۸۷c(0);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۱۲۶۸f() {
        float[] fArr = this.f۱۰۸۱۵d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f۱۰۸۱۶e, 0.0f);
        Arrays.fill(this.f۱۰۸۱۷f, 0.0f);
        Arrays.fill(this.f۱۰۸۱۸g, 0.0f);
        Arrays.fill(this.f۱۰۸۱۹h, 0);
        Arrays.fill(this.f۱۰۸۲۰i, 0);
        Arrays.fill(this.f۱۰۸۲۱j, 0);
        this.f۱۰۸۲۲k = 0;
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۱۲۶۷e(int pointerId) {
        if (this.f۱۰۸۱۵d == null || !m۱۱۲۸۲b(pointerId)) {
            return;
        }
        this.f۱۰۸۱۵d[pointerId] = 0.0f;
        this.f۱۰۸۱۶e[pointerId] = 0.0f;
        this.f۱۰۸۱۷f[pointerId] = 0.0f;
        this.f۱۰۸۱۸g[pointerId] = 0.0f;
        this.f۱۰۸۱۹h[pointerId] = 0;
        this.f۱۰۸۲۰i[pointerId] = 0;
        this.f۱۰۸۲۱j[pointerId] = 0;
        this.f۱۰۸۲۲k &= (1 << pointerId) ^ (-1);
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۱۲۶۹f(int pointerId) {
        float[] fArr = this.f۱۰۸۱۵d;
        if (fArr == null || fArr.length <= pointerId) {
            float[] imx = new float[pointerId + 1];
            float[] imy = new float[pointerId + 1];
            float[] lmx = new float[pointerId + 1];
            float[] lmy = new float[pointerId + 1];
            int[] iit = new int[pointerId + 1];
            int[] edip = new int[pointerId + 1];
            int[] edl = new int[pointerId + 1];
            float[] fArr2 = this.f۱۰۸۱۵d;
            if (fArr2 != null) {
                System.arraycopy(fArr2, 0, imx, 0, fArr2.length);
                float[] fArr3 = this.f۱۰۸۱۶e;
                System.arraycopy(fArr3, 0, imy, 0, fArr3.length);
                float[] fArr4 = this.f۱۰۸۱۷f;
                System.arraycopy(fArr4, 0, lmx, 0, fArr4.length);
                float[] fArr5 = this.f۱۰۸۱۸g;
                System.arraycopy(fArr5, 0, lmy, 0, fArr5.length);
                int[] iArr = this.f۱۰۸۱۹h;
                System.arraycopy(iArr, 0, iit, 0, iArr.length);
                int[] iArr2 = this.f۱۰۸۲۰i;
                System.arraycopy(iArr2, 0, edip, 0, iArr2.length);
                int[] iArr3 = this.f۱۰۸۲۱j;
                System.arraycopy(iArr3, 0, edl, 0, iArr3.length);
            }
            this.f۱۰۸۱۵d = imx;
            this.f۱۰۸۱۶e = imy;
            this.f۱۰۸۱۷f = lmx;
            this.f۱۰۸۱۸g = lmy;
            this.f۱۰۸۱۹h = iit;
            this.f۱۰۸۲۰i = edip;
            this.f۱۰۸۲۱j = edl;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۱۲۶۳b(float x, float y, int pointerId) {
        m۱۱۲۶۹f(pointerId);
        float[] fArr = this.f۱۰۸۱۵d;
        this.f۱۰۸۱۷f[pointerId] = x;
        fArr[pointerId] = x;
        float[] fArr2 = this.f۱۰۸۱۶e;
        this.f۱۰۸۱۸g[pointerId] = y;
        fArr2[pointerId] = y;
        this.f۱۰۸۱۹h[pointerId] = m۱۱۲۶۶e((int) x, (int) y);
        this.f۱۰۸۲۲k |= 1 << pointerId;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۱۲۶۵c(MotionEvent ev) {
        int pointerCount = ev.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = ev.getPointerId(i);
            if (m۱۱۲۷۱g(pointerId)) {
                float x = ev.getX(i);
                float y = ev.getY(i);
                this.f۱۰۸۱۷f[pointerId] = x;
                this.f۱۰۸۱۸g[pointerId] = y;
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۱۲۸۲b(int pointerId) {
        return (this.f۱۰۸۲۲k & (1 << pointerId)) != 0;
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۱۲۸۷c(int state) {
        this.f۱۰۸۳۲u.removeCallbacks(this.f۱۰۸۳۳v);
        if (this.f۱۰۸۱۲a != state) {
            this.f۱۰۸۱۲a = state;
            this.f۱۰۸۲۹r.mo۱۱۳۰۵c(state);
            if (this.f۱۰۸۱۲a == 0) {
                this.f۱۰۸۳۰s = null;
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۱۲۸۴b(View toCapture, int pointerId) {
        if (toCapture == this.f۱۰۸۳۰s && this.f۱۰۸۱۴c == pointerId) {
            return true;
        }
        if (toCapture != null && this.f۱۰۸۲۹r.mo۱۱۳۰۴b(toCapture, pointerId)) {
            this.f۱۰۸۱۴c = pointerId;
            m۱۱۲۷۵a(toCapture, pointerId);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if (r2 != r15) goto L۵۸;
     */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m۱۱۲۸۳b(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.Cs.m۱۱۲۸۳b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۲۷۴a(MotionEvent ev) {
        int action = ev.getActionMasked();
        int actionIndex = ev.getActionIndex();
        if (action == 0) {
            m۱۱۲۷۲a();
        }
        if (this.f۱۰۸۲۳l == null) {
            this.f۱۰۸۲۳l = VelocityTracker.obtain();
        }
        this.f۱۰۸۲۳l.addMovement(ev);
        if (action == 0) {
            float x = ev.getX();
            float y = ev.getY();
            int pointerId = ev.getPointerId(0);
            View toCapture = m۱۱۲۸۱b((int) x, (int) y);
            m۱۱۲۶۳b(x, y, pointerId);
            m۱۱۲۸۴b(toCapture, pointerId);
            int edgesTouched = this.f۱۰۸۱۹h[pointerId];
            int i = this.f۱۰۸۲۷p;
            if ((edgesTouched & i) != 0) {
                this.f۱۰۸۲۹r.mo۱۱۳۰۲b(i & edgesTouched, pointerId);
                return;
            }
            return;
        }
        if (action == 1) {
            if (this.f۱۰۸۱۲a == 1) {
                m۱۱۲۷۰g();
            }
            m۱۱۲۷۲a();
            return;
        }
        if (action == 2) {
            if (this.f۱۰۸۱۲a == 1) {
                if (m۱۱۲۷۱g(this.f۱۰۸۱۴c)) {
                    int index = ev.findPointerIndex(this.f۱۰۸۱۴c);
                    float x2 = ev.getX(index);
                    float y2 = ev.getY(index);
                    float[] fArr = this.f۱۰۸۱۷f;
                    int i2 = this.f۱۰۸۱۴c;
                    int idx = (int) (x2 - fArr[i2]);
                    int idy = (int) (y2 - this.f۱۰۸۱۸g[i2]);
                    m۱۱۲۵۸a(this.f۱۰۸۳۰s.getLeft() + idx, this.f۱۰۸۳۰s.getTop() + idy, idx, idy);
                    m۱۱۲۶۵c(ev);
                    return;
                }
                return;
            }
            int pointerCount = ev.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                int pointerId2 = ev.getPointerId(i3);
                if (m۱۱۲۷۱g(pointerId2)) {
                    float x3 = ev.getX(i3);
                    float y3 = ev.getY(i3);
                    float dx = x3 - this.f۱۰۸۱۵d[pointerId2];
                    float dy = y3 - this.f۱۰۸۱۶e[pointerId2];
                    m۱۱۲۵۷a(dx, dy, pointerId2);
                    if (this.f۱۰۸۱۲a == 1) {
                        break;
                    }
                    View toCapture2 = m۱۱۲۸۱b((int) x3, (int) y3);
                    if (m۱۱۲۶۰a(toCapture2, dx, dy) && m۱۱۲۸۴b(toCapture2, pointerId2)) {
                        break;
                    }
                }
            }
            m۱۱۲۶۵c(ev);
            return;
        }
        if (action == 3) {
            if (this.f۱۰۸۱۲a == 1) {
                m۱۱۲۵۶a(0.0f, 0.0f);
            }
            m۱۱۲۷۲a();
            return;
        }
        if (action == 5) {
            int pointerId3 = ev.getPointerId(actionIndex);
            float x4 = ev.getX(actionIndex);
            float y4 = ev.getY(actionIndex);
            m۱۱۲۶۳b(x4, y4, pointerId3);
            if (this.f۱۰۸۱۲a == 0) {
                View toCapture3 = m۱۱۲۸۱b((int) x4, (int) y4);
                m۱۱۲۸۴b(toCapture3, pointerId3);
                int edgesTouched2 = this.f۱۰۸۱۹h[pointerId3];
                int i4 = this.f۱۰۸۲۷p;
                if ((edgesTouched2 & i4) != 0) {
                    this.f۱۰۸۲۹r.mo۱۱۳۰۲b(i4 & edgesTouched2, pointerId3);
                    return;
                }
                return;
            }
            if (m۱۱۲۸۸c((int) x4, (int) y4)) {
                m۱۱۲۸۴b(this.f۱۰۸۳۰s, pointerId3);
                return;
            }
            return;
        }
        if (action == 6) {
            int pointerId4 = ev.getPointerId(actionIndex);
            if (this.f۱۰۸۱۲a == 1 && pointerId4 == this.f۱۰۸۱۴c) {
                int newActivePointer = -1;
                int pointerCount2 = ev.getPointerCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= pointerCount2) {
                        break;
                    }
                    int id = ev.getPointerId(i5);
                    if (id != this.f۱۰۸۱۴c) {
                        View view = m۱۱۲۸۱b((int) ev.getX(i5), (int) ev.getY(i5));
                        View view2 = this.f۱۰۸۳۰s;
                        if (view == view2 && m۱۱۲۸۴b(view2, id)) {
                            newActivePointer = this.f۱۰۸۱۴c;
                            break;
                        }
                    }
                    i5++;
                }
                if (newActivePointer == -1) {
                    m۱۱۲۷۰g();
                }
            }
            m۱۱۲۶۷e(pointerId4);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۲۵۷a(float dx, float dy, int pointerId) {
        int dragsStarted = 0;
        if (m۱۱۲۵۹a(dx, dy, pointerId, 1)) {
            dragsStarted = 0 | 1;
        }
        if (m۱۱۲۵۹a(dy, dx, pointerId, 4)) {
            dragsStarted |= 4;
        }
        if (m۱۱۲۵۹a(dx, dy, pointerId, 2)) {
            dragsStarted |= 2;
        }
        if (m۱۱۲۵۹a(dy, dx, pointerId, 8)) {
            dragsStarted |= 8;
        }
        if (dragsStarted != 0) {
            int[] iArr = this.f۱۰۸۲۰i;
            iArr[pointerId] = iArr[pointerId] | dragsStarted;
            this.f۱۰۸۲۹r.mo۱۱۲۹۶a(dragsStarted, pointerId);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۲۵۹a(float delta, float odelta, int pointerId, int edge) {
        float absDelta = Math.abs(delta);
        float absODelta = Math.abs(odelta);
        if ((this.f۱۰۸۱۹h[pointerId] & edge) == edge && (this.f۱۰۸۲۷p & edge) != 0 && (this.f۱۰۸۲۱j[pointerId] & edge) != edge && (this.f۱۰۸۲۰i[pointerId] & edge) != edge) {
            int i = this.f۱۰۸۱۳b;
            if (absDelta > i || absODelta > i) {
                if (absDelta >= 0.5f * absODelta || !this.f۱۰۸۲۹r.mo۱۱۳۰۳b(edge)) {
                    return (this.f۱۰۸۲۰i[pointerId] & edge) == 0 && absDelta > ((float) this.f۱۰۸۱۳b);
                }
                int[] iArr = this.f۱۰۸۲۱j;
                iArr[pointerId] = iArr[pointerId] | edge;
                return false;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۲۶۰a(View child, float dx, float dy) {
        if (child == null) {
            return false;
        }
        boolean checkHorizontal = this.f۱۰۸۲۹r.mo۱۱۲۹۴a(child) > 0;
        boolean checkVertical = this.f۱۰۸۲۹r.mo۱۱۳۰۰b(child) > 0;
        if (!checkHorizontal || !checkVertical) {
            return checkHorizontal ? Math.abs(dx) > ((float) this.f۱۰۸۱۳b) : checkVertical && Math.abs(dy) > ((float) this.f۱۰۸۱۳b);
        }
        float f2 = (dx * dx) + (dy * dy);
        int i = this.f۱۰۸۱۳b;
        return f2 > ((float) (i * i));
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۲۷۶a(int directions) {
        int count = this.f۱۰۸۱۵d.length;
        for (int i = 0; i < count; i++) {
            if (m۱۱۲۷۷a(directions, i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۲۷۷a(int directions, int pointerId) {
        if (!m۱۱۲۸۲b(pointerId)) {
            return false;
        }
        boolean checkHorizontal = (directions & 1) == 1;
        boolean checkVertical = (directions & 2) == 2;
        float dx = this.f۱۰۸۱۷f[pointerId] - this.f۱۰۸۱۵d[pointerId];
        float dy = this.f۱۰۸۱۸g[pointerId] - this.f۱۰۸۱۶e[pointerId];
        if (!checkHorizontal || !checkVertical) {
            return checkHorizontal ? Math.abs(dx) > ((float) this.f۱۰۸۱۳b) : checkVertical && Math.abs(dy) > ((float) this.f۱۰۸۱۳b);
        }
        float f2 = (dx * dx) + (dy * dy);
        int i = this.f۱۰۸۱۳b;
        return f2 > ((float) (i * i));
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۱۲۷۰g() {
        this.f۱۰۸۲۳l.computeCurrentVelocity(1000, this.f۱۰۸۲۴m);
        float xvel = m۱۱۲۵۱a(this.f۱۰۸۲۳l.getXVelocity(this.f۱۰۸۱۴c), this.f۱۰۸۲۵n, this.f۱۰۸۲۴m);
        float yvel = m۱۱۲۵۱a(this.f۱۰۸۲۳l.getYVelocity(this.f۱۰۸۱۴c), this.f۱۰۸۲۵n, this.f۱۰۸۲۴m);
        m۱۱۲۵۶a(xvel, yvel);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۲۵۸a(int left, int top, int dx, int dy) {
        int clampedX = left;
        int clampedY = top;
        int oldLeft = this.f۱۰۸۳۰s.getLeft();
        int oldTop = this.f۱۰۸۳۰s.getTop();
        if (dx != 0) {
            clampedX = this.f۱۰۸۲۹r.mo۱۱۲۹۵a(this.f۱۰۸۳۰s, left, dx);
            Cu.m۱۰۹۳۱c(this.f۱۰۸۳۰s, clampedX - oldLeft);
        }
        if (dy != 0) {
            clampedY = this.f۱۰۸۲۹r.mo۱۱۳۰۱b(this.f۱۰۸۳۰s, top, dy);
            Cu.m۱۰۹۳۳d(this.f۱۰۸۳۰s, clampedY - oldTop);
        }
        if (dx != 0 || dy != 0) {
            int clampedDx = clampedX - oldLeft;
            int clampedDy = clampedY - oldTop;
            this.f۱۰۸۲۹r.mo۱۱۲۹۹a(this.f۱۰۸۳۰s, clampedX, clampedY, clampedDx, clampedDy);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public boolean m۱۱۲۸۸c(int x, int y) {
        return m۱۱۲۷۸a(this.f۱۰۸۳۰s, x, y);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۲۷۸a(View view, int x, int y) {
        return view != null && x >= view.getLeft() && x < view.getRight() && y >= view.getTop() && y < view.getBottom();
    }

    /* renamed from: b, reason: contains not printable characters */
    public View m۱۱۲۸۱b(int x, int y) {
        int childCount = this.f۱۰۸۳۲u.getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            ViewGroup viewGroup = this.f۱۰۸۳۲u;
            this.f۱۰۸۲۹r.m۱۱۲۹۳a(i);
            View child = viewGroup.getChildAt(i);
            if (x >= child.getLeft() && x < child.getRight() && y >= child.getTop() && y < child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: e, reason: contains not printable characters */
    private int m۱۱۲۶۶e(int x, int y) {
        int result = x < this.f۱۰۸۳۲u.getLeft() + this.f۱۰۸۲۶o ? 0 | 1 : 0;
        if (y < this.f۱۰۸۳۲u.getTop() + this.f۱۰۸۲۶o) {
            result |= 4;
        }
        if (x > this.f۱۰۸۳۲u.getRight() - this.f۱۰۸۲۶o) {
            result |= 2;
        }
        return y > this.f۱۰۸۳۲u.getBottom() - this.f۱۰۸۲۶o ? result | 8 : result;
    }

    /* renamed from: g, reason: contains not printable characters */
    private boolean m۱۱۲۷۱g(int pointerId) {
        if (!m۱۱۲۸۲b(pointerId)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }
}
