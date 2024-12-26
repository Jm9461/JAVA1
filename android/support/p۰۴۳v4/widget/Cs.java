package android.support.p۰۴۳v4.widget;

import android.content.Context;
import android.support.p۰۴۳v4.view.Cu;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.s  reason: invalid class name */
public class Cs {

    /* renamed from: w  reason: contains not printable characters */
    private static final Interpolator f۱۰۸۱۱w = new animationInterpolatorCa();

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۰۸۱۲a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۰۸۱۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۰۸۱۴c = -1;

    /* renamed from: d  reason: contains not printable characters */
    private float[] f۱۰۸۱۵d;

    /* renamed from: e  reason: contains not printable characters */
    private float[] f۱۰۸۱۶e;

    /* renamed from: f  reason: contains not printable characters */
    private float[] f۱۰۸۱۷f;

    /* renamed from: g  reason: contains not printable characters */
    private float[] f۱۰۸۱۸g;

    /* renamed from: h  reason: contains not printable characters */
    private int[] f۱۰۸۱۹h;

    /* renamed from: i  reason: contains not printable characters */
    private int[] f۱۰۸۲۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int[] f۱۰۸۲۱j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۰۸۲۲k;

    /* renamed from: l  reason: contains not printable characters */
    private VelocityTracker f۱۰۸۲۳l;

    /* renamed from: m  reason: contains not printable characters */
    private float f۱۰۸۲۴m;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۰۸۲۵n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۰۸۲۶o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۰۸۲۷p;

    /* renamed from: q  reason: contains not printable characters */
    private OverScroller f۱۰۸۲۸q;

    /* renamed from: r  reason: contains not printable characters */
    private final AbstractCc f۱۰۸۲۹r;

    /* renamed from: s  reason: contains not printable characters */
    private View f۱۰۸۳۰s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۰۸۳۱t;

    /* renamed from: u  reason: contains not printable characters */
    private final ViewGroup f۱۰۸۳۲u;

    /* renamed from: v  reason: contains not printable characters */
    private final Runnable f۱۰۸۳۳v = new RunnableCb();

    /* renamed from: android.support.v4.widget.s$c  reason: invalid class name */
    public static abstract class AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        public abstract int m۱۳۳۶۵a(View view, int i, int i2);

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۳۳۶۷a(View view, float f, float f2);

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۳۳۶۹a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b  reason: contains not printable characters */
        public abstract int m۱۳۳۷۱b(View view, int i, int i2);

        /* renamed from: b  reason: contains not printable characters */
        public abstract boolean m۱۳۳۷۴b(View view, int i);

        /* renamed from: c  reason: contains not printable characters */
        public abstract void m۱۳۳۷۵c(int i);

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۳۶۸a(View capturedChild, int activePointerId) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۳۷۲b(int edgeFlags, int pointerId) {
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۳۷۳b(int edgeFlags) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۳۶۶a(int edgeFlags, int pointerId) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۳۳۶۳a(int index) {
            return index;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۳۳۶۴a(View child) {
            return 0;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۳۳۷۰b(View child) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.widget.s$a  reason: invalid class name */
    static class animationInterpolatorCa implements Interpolator {
        animationInterpolatorCa() {
        }

        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    /* renamed from: android.support.v4.widget.s$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            Cs.this.m۱۳۳۵۷c(0);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cs m۱۳۳۲۵a(ViewGroup forParent, AbstractCc cb) {
        return new Cs(forParent.getContext(), forParent, cb);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cs m۱۳۳۲۴a(ViewGroup forParent, float sensitivity, AbstractCc cb) {
        Cs helper = m۱۳۳۲۵a(forParent, cb);
        helper.f۱۰۸۱۳b = (int) (((float) helper.f۱۰۸۱۳b) * (1.0f / sensitivity));
        return helper;
    }

    private Cs(Context context, ViewGroup forParent, AbstractCc cb) {
        if (forParent == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cb != null) {
            this.f۱۰۸۳۲u = forParent;
            this.f۱۰۸۲۹r = cb;
            ViewConfiguration vc = ViewConfiguration.get(context);
            this.f۱۰۸۲۶o = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f۱۰۸۱۳b = vc.getScaledTouchSlop();
            this.f۱۰۸۲۴m = (float) vc.getScaledMaximumFlingVelocity();
            this.f۱۰۸۲۵n = (float) vc.getScaledMinimumFlingVelocity();
            this.f۱۰۸۲۸q = new OverScroller(context, f۱۰۸۱۱w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۴۳a(float minVel) {
        this.f۱۰۸۲۵n = minVel;
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۳۳۶۲e() {
        return this.f۱۰۸۱۲a;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۳۶۰d(int edgeFlags) {
        this.f۱۰۸۲۷p = edgeFlags;
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۳۳۵۶c() {
        return this.f۱۰۸۲۶o;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۴۵a(View childView, int activePointerId) {
        if (childView.getParent() == this.f۱۰۸۳۲u) {
            this.f۱۰۸۳۰s = childView;
            this.f۱۰۸۱۴c = activePointerId;
            this.f۱۰۸۲۹r.m۱۳۳۶۸a(childView, activePointerId);
            m۱۳۳۵۷c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f۱۰۸۳۲u + ")");
    }

    /* renamed from: b  reason: contains not printable characters */
    public View m۱۳۳۵۰b() {
        return this.f۱۰۸۳۰s;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۳۳۵۹d() {
        return this.f۱۰۸۱۳b;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۴۲a() {
        this.f۱۰۸۱۴c = -1;
        m۱۳۳۳۸f();
        VelocityTracker velocityTracker = this.f۱۰۸۲۳l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f۱۰۸۲۳l = null;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۳۵۵b(View child, int finalLeft, int finalTop) {
        this.f۱۰۸۳۰s = child;
        this.f۱۰۸۱۴c = -1;
        boolean continueSliding = m۱۳۳۳۴b(finalLeft, finalTop, 0, 0);
        if (!continueSliding && this.f۱۰۸۱۲a == 0 && this.f۱۰۸۳۰s != null) {
            this.f۱۰۸۳۰s = null;
        }
        return continueSliding;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۳۳۶۱d(int finalLeft, int finalTop) {
        if (this.f۱۰۸۳۱t) {
            return m۱۳۳۳۴b(finalLeft, finalTop, (int) this.f۱۰۸۲۳l.getXVelocity(this.f۱۰۸۱۴c), (int) this.f۱۰۸۲۳l.getYVelocity(this.f۱۰۸۱۴c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۳۳۳۴b(int finalLeft, int finalTop, int xvel, int yvel) {
        int startLeft = this.f۱۰۸۳۰s.getLeft();
        int startTop = this.f۱۰۸۳۰s.getTop();
        int dx = finalLeft - startLeft;
        int dy = finalTop - startTop;
        if (dx == 0 && dy == 0) {
            this.f۱۰۸۲۸q.abortAnimation();
            m۱۳۳۵۷c(0);
            return false;
        }
        this.f۱۰۸۲۸q.startScroll(startLeft, startTop, dx, dy, m۱۳۳۲۳a(this.f۱۰۸۳۰s, dx, dy, xvel, yvel));
        m۱۳۳۵۷c(2);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۳۳۲۳a(View child, int dx, int dy, int xvel, int yvel) {
        float f;
        float f2;
        float f3;
        float f4;
        int xvel2 = m۱۳۳۲۲a(xvel, (int) this.f۱۰۸۲۵n, (int) this.f۱۰۸۲۴m);
        int yvel2 = m۱۳۳۲۲a(yvel, (int) this.f۱۰۸۲۵n, (int) this.f۱۰۸۲۴m);
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        int absXVel = Math.abs(xvel2);
        int absYVel = Math.abs(yvel2);
        int addedVel = absXVel + absYVel;
        int addedDistance = absDx + absDy;
        if (xvel2 != 0) {
            f2 = (float) absXVel;
            f = (float) addedVel;
        } else {
            f2 = (float) absDx;
            f = (float) addedDistance;
        }
        float xweight = f2 / f;
        if (yvel2 != 0) {
            f4 = (float) absYVel;
            f3 = (float) addedVel;
        } else {
            f4 = (float) absDy;
            f3 = (float) addedDistance;
        }
        float yweight = f4 / f3;
        return (int) ((((float) m۱۳۳۳۲b(dx, xvel2, this.f۱۰۸۲۹r.m۱۳۳۶۴a(child))) * xweight) + (((float) m۱۳۳۳۲b(dy, yvel2, this.f۱۰۸۲۹r.m۱۳۳۷۰b(child))) * yweight));
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۳۳۳۲b(int delta, int velocity, int motionRange) {
        int duration;
        if (delta == 0) {
            return 0;
        }
        int width = this.f۱۰۸۳۲u.getWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * m۱۳۳۳۱b(Math.min(1.0f, ((float) Math.abs(delta)) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(delta)) / ((float) motionRange))) * 256.0f);
        }
        return Math.min(duration, 600);
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۳۳۲۲a(int value, int absMin, int absMax) {
        int absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0;
        }
        if (absValue > absMax) {
            return value > 0 ? absMax : -absMax;
        }
        return value;
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۳۳۲۱a(float value, float absMin, float absMax) {
        float absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0.0f;
        }
        if (absValue > absMax) {
            return value > 0.0f ? absMax : -absMax;
        }
        return value;
    }

    /* renamed from: b  reason: contains not printable characters */
    private float m۱۳۳۳۱b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۳۴۹a(boolean deferCallbacks) {
        if (this.f۱۰۸۱۲a == 2) {
            boolean keepGoing = this.f۱۰۸۲۸q.computeScrollOffset();
            int x = this.f۱۰۸۲۸q.getCurrX();
            int y = this.f۱۰۸۲۸q.getCurrY();
            int dx = x - this.f۱۰۸۳۰s.getLeft();
            int dy = y - this.f۱۰۸۳۰s.getTop();
            if (dx != 0) {
                Cu.m۱۳۰۰۱c(this.f۱۰۸۳۰s, dx);
            }
            if (dy != 0) {
                Cu.m۱۳۰۰۳d(this.f۱۰۸۳۰s, dy);
            }
            if (!(dx == 0 && dy == 0)) {
                this.f۱۰۸۲۹r.m۱۳۳۶۹a(this.f۱۰۸۳۰s, x, y, dx, dy);
            }
            if (keepGoing && x == this.f۱۰۸۲۸q.getFinalX() && y == this.f۱۰۸۲۸q.getFinalY()) {
                this.f۱۰۸۲۸q.abortAnimation();
                keepGoing = false;
            }
            if (!keepGoing) {
                if (deferCallbacks) {
                    this.f۱۰۸۳۲u.post(this.f۱۰۸۳۳v);
                } else {
                    m۱۳۳۵۷c(0);
                }
            }
        }
        if (this.f۱۰۸۱۲a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۳۲۶a(float xvel, float yvel) {
        this.f۱۰۸۳۱t = true;
        this.f۱۰۸۲۹r.m۱۳۳۶۷a(this.f۱۰۸۳۰s, xvel, yvel);
        this.f۱۰۸۳۱t = false;
        if (this.f۱۰۸۱۲a == 1) {
            m۱۳۳۵۷c(0);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۳۳۳۸f() {
        float[] fArr = this.f۱۰۸۱۵d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f۱۰۸۱۶e, 0.0f);
            Arrays.fill(this.f۱۰۸۱۷f, 0.0f);
            Arrays.fill(this.f۱۰۸۱۸g, 0.0f);
            Arrays.fill(this.f۱۰۸۱۹h, 0);
            Arrays.fill(this.f۱۰۸۲۰i, 0);
            Arrays.fill(this.f۱۰۸۲۱j, 0);
            this.f۱۰۸۲۲k = 0;
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۳۳۳۷e(int pointerId) {
        if (this.f۱۰۸۱۵d != null && m۱۳۳۵۲b(pointerId)) {
            this.f۱۰۸۱۵d[pointerId] = 0.0f;
            this.f۱۰۸۱۶e[pointerId] = 0.0f;
            this.f۱۰۸۱۷f[pointerId] = 0.0f;
            this.f۱۰۸۱۸g[pointerId] = 0.0f;
            this.f۱۰۸۱۹h[pointerId] = 0;
            this.f۱۰۸۲۰i[pointerId] = 0;
            this.f۱۰۸۲۱j[pointerId] = 0;
            this.f۱۰۸۲۲k &= (1 << pointerId) ^ -1;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۳۳۳۹f(int pointerId) {
        float[] fArr = this.f۱۰۸۱۵d;
        if (fArr == null || fArr.length <= pointerId) {
            float[] imx = new float[(pointerId + 1)];
            float[] imy = new float[(pointerId + 1)];
            float[] lmx = new float[(pointerId + 1)];
            float[] lmy = new float[(pointerId + 1)];
            int[] iit = new int[(pointerId + 1)];
            int[] edip = new int[(pointerId + 1)];
            int[] edl = new int[(pointerId + 1)];
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

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۳۳۳b(float x, float y, int pointerId) {
        m۱۳۳۳۹f(pointerId);
        float[] fArr = this.f۱۰۸۱۵d;
        this.f۱۰۸۱۷f[pointerId] = x;
        fArr[pointerId] = x;
        float[] fArr2 = this.f۱۰۸۱۶e;
        this.f۱۰۸۱۸g[pointerId] = y;
        fArr2[pointerId] = y;
        this.f۱۰۸۱۹h[pointerId] = m۱۳۳۳۶e((int) x, (int) y);
        this.f۱۰۸۲۲k |= 1 << pointerId;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۳۳۵c(MotionEvent ev) {
        int pointerCount = ev.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = ev.getPointerId(i);
            if (m۱۳۳۴۱g(pointerId)) {
                float x = ev.getX(i);
                float y = ev.getY(i);
                this.f۱۰۸۱۷f[pointerId] = x;
                this.f۱۰۸۱۸g[pointerId] = y;
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۳۵۲b(int pointerId) {
        return (this.f۱۰۸۲۲k & (1 << pointerId)) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۳۵۷c(int state) {
        this.f۱۰۸۳۲u.removeCallbacks(this.f۱۰۸۳۳v);
        if (this.f۱۰۸۱۲a != state) {
            this.f۱۰۸۱۲a = state;
            this.f۱۰۸۲۹r.m۱۳۳۷۵c(state);
            if (this.f۱۰۸۱۲a == 0) {
                this.f۱۰۸۳۰s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۳۵۴b(View toCapture, int pointerId) {
        if (toCapture == this.f۱۰۸۳۰s && this.f۱۰۸۱۴c == pointerId) {
            return true;
        }
        if (toCapture == null || !this.f۱۰۸۲۹r.m۱۳۳۷۴b(toCapture, pointerId)) {
            return false;
        }
        this.f۱۰۸۱۴c = pointerId;
        m۱۳۳۴۵a(toCapture, pointerId);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r2 != r15) goto L_0x011f;
     */
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۳۳۵۳b(android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.widget.Cs.m۱۳۳۵۳b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۴۴a(MotionEvent ev) {
        int action = ev.getActionMasked();
        int actionIndex = ev.getActionIndex();
        if (action == 0) {
            m۱۳۳۴۲a();
        }
        if (this.f۱۰۸۲۳l == null) {
            this.f۱۰۸۲۳l = VelocityTracker.obtain();
        }
        this.f۱۰۸۲۳l.addMovement(ev);
        if (action == 0) {
            float x = ev.getX();
            float y = ev.getY();
            int pointerId = ev.getPointerId(0);
            View toCapture = m۱۳۳۵۱b((int) x, (int) y);
            m۱۳۳۳۳b(x, y, pointerId);
            m۱۳۳۵۴b(toCapture, pointerId);
            int edgesTouched = this.f۱۰۸۱۹h[pointerId];
            int i = this.f۱۰۸۲۷p;
            if ((edgesTouched & i) != 0) {
                this.f۱۰۸۲۹r.m۱۳۳۷۲b(i & edgesTouched, pointerId);
            }
        } else if (action == 1) {
            if (this.f۱۰۸۱۲a == 1) {
                m۱۳۳۴۰g();
            }
            m۱۳۳۴۲a();
        } else if (action != 2) {
            if (action == 3) {
                if (this.f۱۰۸۱۲a == 1) {
                    m۱۳۳۲۶a(0.0f, 0.0f);
                }
                m۱۳۳۴۲a();
            } else if (action == 5) {
                int pointerId2 = ev.getPointerId(actionIndex);
                float x2 = ev.getX(actionIndex);
                float y2 = ev.getY(actionIndex);
                m۱۳۳۳۳b(x2, y2, pointerId2);
                if (this.f۱۰۸۱۲a == 0) {
                    m۱۳۳۵۴b(m۱۳۳۵۱b((int) x2, (int) y2), pointerId2);
                    int edgesTouched2 = this.f۱۰۸۱۹h[pointerId2];
                    int i2 = this.f۱۰۸۲۷p;
                    if ((edgesTouched2 & i2) != 0) {
                        this.f۱۰۸۲۹r.m۱۳۳۷۲b(i2 & edgesTouched2, pointerId2);
                    }
                } else if (m۱۳۳۵۸c((int) x2, (int) y2)) {
                    m۱۳۳۵۴b(this.f۱۰۸۳۰s, pointerId2);
                }
            } else if (action == 6) {
                int pointerId3 = ev.getPointerId(actionIndex);
                if (this.f۱۰۸۱۲a == 1 && pointerId3 == this.f۱۰۸۱۴c) {
                    int newActivePointer = -1;
                    int pointerCount = ev.getPointerCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= pointerCount) {
                            break;
                        }
                        int id = ev.getPointerId(i3);
                        if (id != this.f۱۰۸۱۴c) {
                            View b = m۱۳۳۵۱b((int) ev.getX(i3), (int) ev.getY(i3));
                            View view = this.f۱۰۸۳۰s;
                            if (b == view && m۱۳۳۵۴b(view, id)) {
                                newActivePointer = this.f۱۰۸۱۴c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (newActivePointer == -1) {
                        m۱۳۳۴۰g();
                    }
                }
                m۱۳۳۳۷e(pointerId3);
            }
        } else if (this.f۱۰۸۱۲a != 1) {
            int pointerCount2 = ev.getPointerCount();
            for (int i4 = 0; i4 < pointerCount2; i4++) {
                int pointerId4 = ev.getPointerId(i4);
                if (m۱۳۳۴۱g(pointerId4)) {
                    float x3 = ev.getX(i4);
                    float y3 = ev.getY(i4);
                    float dx = x3 - this.f۱۰۸۱۵d[pointerId4];
                    float dy = y3 - this.f۱۰۸۱۶e[pointerId4];
                    m۱۳۳۲۷a(dx, dy, pointerId4);
                    if (this.f۱۰۸۱۲a == 1) {
                        break;
                    }
                    View toCapture2 = m۱۳۳۵۱b((int) x3, (int) y3);
                    if (m۱۳۳۳۰a(toCapture2, dx, dy) && m۱۳۳۵۴b(toCapture2, pointerId4)) {
                        break;
                    }
                }
            }
            m۱۳۳۳۵c(ev);
        } else if (m۱۳۳۴۱g(this.f۱۰۸۱۴c)) {
            int index = ev.findPointerIndex(this.f۱۰۸۱۴c);
            float x4 = ev.getX(index);
            float y4 = ev.getY(index);
            float[] fArr = this.f۱۰۸۱۷f;
            int i5 = this.f۱۰۸۱۴c;
            int idx = (int) (x4 - fArr[i5]);
            int idy = (int) (y4 - this.f۱۰۸۱۸g[i5]);
            m۱۳۳۲۸a(this.f۱۰۸۳۰s.getLeft() + idx, this.f۱۰۸۳۰s.getTop() + idy, idx, idy);
            m۱۳۳۳۵c(ev);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۳۲۷a(float dx, float dy, int pointerId) {
        int dragsStarted = 0;
        if (m۱۳۳۲۹a(dx, dy, pointerId, 1)) {
            dragsStarted = 0 | 1;
        }
        if (m۱۳۳۲۹a(dy, dx, pointerId, 4)) {
            dragsStarted |= 4;
        }
        if (m۱۳۳۲۹a(dx, dy, pointerId, 2)) {
            dragsStarted |= 2;
        }
        if (m۱۳۳۲۹a(dy, dx, pointerId, 8)) {
            dragsStarted |= 8;
        }
        if (dragsStarted != 0) {
            int[] iArr = this.f۱۰۸۲۰i;
            iArr[pointerId] = iArr[pointerId] | dragsStarted;
            this.f۱۰۸۲۹r.m۱۳۳۶۶a(dragsStarted, pointerId);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۳۲۹a(float delta, float odelta, int pointerId, int edge) {
        float absDelta = Math.abs(delta);
        float absODelta = Math.abs(odelta);
        if (!((this.f۱۰۸۱۹h[pointerId] & edge) != edge || (this.f۱۰۸۲۷p & edge) == 0 || (this.f۱۰۸۲۱j[pointerId] & edge) == edge || (this.f۱۰۸۲۰i[pointerId] & edge) == edge)) {
            int i = this.f۱۰۸۱۳b;
            if (absDelta > ((float) i) || absODelta > ((float) i)) {
                if (absDelta < 0.5f * absODelta && this.f۱۰۸۲۹r.m۱۳۳۷۳b(edge)) {
                    int[] iArr = this.f۱۰۸۲۱j;
                    iArr[pointerId] = iArr[pointerId] | edge;
                    return false;
                } else if ((this.f۱۰۸۲۰i[pointerId] & edge) != 0 || absDelta <= ((float) this.f۱۰۸۱۳b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۳۳۰a(View child, float dx, float dy) {
        if (child == null) {
            return false;
        }
        boolean checkHorizontal = this.f۱۰۸۲۹r.m۱۳۳۶۴a(child) > 0;
        boolean checkVertical = this.f۱۰۸۲۹r.m۱۳۳۷۰b(child) > 0;
        if (checkHorizontal && checkVertical) {
            float f = (dx * dx) + (dy * dy);
            int i = this.f۱۰۸۱۳b;
            if (f > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (checkHorizontal) {
            if (Math.abs(dx) > ((float) this.f۱۰۸۱۳b)) {
                return true;
            }
            return false;
        } else if (!checkVertical || Math.abs(dy) <= ((float) this.f۱۰۸۱۳b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۳۴۶a(int directions) {
        int count = this.f۱۰۸۱۵d.length;
        for (int i = 0; i < count; i++) {
            if (m۱۳۳۴۷a(directions, i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۳۴۷a(int directions, int pointerId) {
        if (!m۱۳۳۵۲b(pointerId)) {
            return false;
        }
        boolean checkHorizontal = (directions & 1) == 1;
        boolean checkVertical = (directions & 2) == 2;
        float dx = this.f۱۰۸۱۷f[pointerId] - this.f۱۰۸۱۵d[pointerId];
        float dy = this.f۱۰۸۱۸g[pointerId] - this.f۱۰۸۱۶e[pointerId];
        if (checkHorizontal && checkVertical) {
            float f = (dx * dx) + (dy * dy);
            int i = this.f۱۰۸۱۳b;
            if (f > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (checkHorizontal) {
            if (Math.abs(dx) > ((float) this.f۱۰۸۱۳b)) {
                return true;
            }
            return false;
        } else if (!checkVertical || Math.abs(dy) <= ((float) this.f۱۰۸۱۳b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۳۳۴۰g() {
        this.f۱۰۸۲۳l.computeCurrentVelocity(1000, this.f۱۰۸۲۴m);
        m۱۳۳۲۶a(m۱۳۳۲۱a(this.f۱۰۸۲۳l.getXVelocity(this.f۱۰۸۱۴c), this.f۱۰۸۲۵n, this.f۱۰۸۲۴m), m۱۳۳۲۱a(this.f۱۰۸۲۳l.getYVelocity(this.f۱۰۸۱۴c), this.f۱۰۸۲۵n, this.f۱۰۸۲۴m));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۳۲۸a(int left, int top, int dx, int dy) {
        int clampedX = left;
        int clampedY = top;
        int oldLeft = this.f۱۰۸۳۰s.getLeft();
        int oldTop = this.f۱۰۸۳۰s.getTop();
        if (dx != 0) {
            clampedX = this.f۱۰۸۲۹r.m۱۳۳۶۵a(this.f۱۰۸۳۰s, left, dx);
            Cu.m۱۳۰۰۱c(this.f۱۰۸۳۰s, clampedX - oldLeft);
        }
        if (dy != 0) {
            clampedY = this.f۱۰۸۲۹r.m۱۳۳۷۱b(this.f۱۰۸۳۰s, top, dy);
            Cu.m۱۳۰۰۳d(this.f۱۰۸۳۰s, clampedY - oldTop);
        }
        if (dx != 0 || dy != 0) {
            this.f۱۰۸۲۹r.m۱۳۳۶۹a(this.f۱۰۸۳۰s, clampedX, clampedY, clampedX - oldLeft, clampedY - oldTop);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۳۳۵۸c(int x, int y) {
        return m۱۳۳۴۸a(this.f۱۰۸۳۰s, x, y);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۳۴۸a(View view, int x, int y) {
        if (view != null && x >= view.getLeft() && x < view.getRight() && y >= view.getTop() && y < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public View m۱۳۳۵۱b(int x, int y) {
        for (int i = this.f۱۰۸۳۲u.getChildCount() - 1; i >= 0; i--) {
            ViewGroup viewGroup = this.f۱۰۸۳۲u;
            this.f۱۰۸۲۹r.m۱۳۳۶۳a(i);
            View child = viewGroup.getChildAt(i);
            if (x >= child.getLeft() && x < child.getRight() && y >= child.getTop() && y < child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: e  reason: contains not printable characters */
    private int m۱۳۳۳۶e(int x, int y) {
        int result = 0;
        if (x < this.f۱۰۸۳۲u.getLeft() + this.f۱۰۸۲۶o) {
            result = 0 | 1;
        }
        if (y < this.f۱۰۸۳۲u.getTop() + this.f۱۰۸۲۶o) {
            result |= 4;
        }
        if (x > this.f۱۰۸۳۲u.getRight() - this.f۱۰۸۲۶o) {
            result |= 2;
        }
        if (y > this.f۱۰۸۳۲u.getBottom() - this.f۱۰۸۲۶o) {
            return result | 8;
        }
        return result;
    }

    /* renamed from: g  reason: contains not printable characters */
    private boolean m۱۳۳۴۱g(int pointerId) {
        if (m۱۳۳۵۲b(pointerId)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
