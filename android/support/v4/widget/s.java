package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.u;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class s {
    private static final Interpolator w = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f۱۴۷۳a;

    /* renamed from: b  reason: collision with root package name */
    private int f۱۴۷۴b;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۴۷۵c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f۱۴۷۶d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f۱۴۷۷e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f۱۴۷۸f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f۱۴۷۹g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f۱۴۸۰h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private OverScroller q;
    private final c r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable v = new b();

    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract void a(View view, float f2, float f3);

        public abstract void a(View view, int i, int i2, int i3, int i4);

        public abstract int b(View view, int i, int i2);

        public abstract boolean b(View view, int i);

        public abstract void c(int i);

        public void a(View capturedChild, int activePointerId) {
        }

        public void b(int edgeFlags, int pointerId) {
        }

        public boolean b(int edgeFlags) {
            return false;
        }

        public void a(int edgeFlags, int pointerId) {
        }

        public int a(int index) {
            return index;
        }

        public int a(View child) {
            return 0;
        }

        public int b(View child) {
            return 0;
        }
    }

    static class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            s.this.c(0);
        }
    }

    public static s a(ViewGroup forParent, c cb) {
        return new s(forParent.getContext(), forParent, cb);
    }

    public static s a(ViewGroup forParent, float sensitivity, c cb) {
        s helper = a(forParent, cb);
        helper.f۱۴۷۴b = (int) (((float) helper.f۱۴۷۴b) * (1.0f / sensitivity));
        return helper;
    }

    private s(Context context, ViewGroup forParent, c cb) {
        if (forParent == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cb != null) {
            this.u = forParent;
            this.r = cb;
            ViewConfiguration vc = ViewConfiguration.get(context);
            this.o = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f۱۴۷۴b = vc.getScaledTouchSlop();
            this.m = (float) vc.getScaledMaximumFlingVelocity();
            this.n = (float) vc.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public void a(float minVel) {
        this.n = minVel;
    }

    public int e() {
        return this.f۱۴۷۳a;
    }

    public void d(int edgeFlags) {
        this.p = edgeFlags;
    }

    public int c() {
        return this.o;
    }

    public void a(View childView, int activePointerId) {
        if (childView.getParent() == this.u) {
            this.s = childView;
            this.f۱۴۷۵c = activePointerId;
            this.r.a(childView, activePointerId);
            c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public View b() {
        return this.s;
    }

    public int d() {
        return this.f۱۴۷۴b;
    }

    public void a() {
        this.f۱۴۷۵c = -1;
        f();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public boolean b(View child, int finalLeft, int finalTop) {
        this.s = child;
        this.f۱۴۷۵c = -1;
        boolean continueSliding = b(finalLeft, finalTop, 0, 0);
        if (!continueSliding && this.f۱۴۷۳a == 0 && this.s != null) {
            this.s = null;
        }
        return continueSliding;
    }

    public boolean d(int finalLeft, int finalTop) {
        if (this.t) {
            return b(finalLeft, finalTop, (int) this.l.getXVelocity(this.f۱۴۷۵c), (int) this.l.getYVelocity(this.f۱۴۷۵c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean b(int finalLeft, int finalTop, int xvel, int yvel) {
        int startLeft = this.s.getLeft();
        int startTop = this.s.getTop();
        int dx = finalLeft - startLeft;
        int dy = finalTop - startTop;
        if (dx == 0 && dy == 0) {
            this.q.abortAnimation();
            c(0);
            return false;
        }
        this.q.startScroll(startLeft, startTop, dx, dy, a(this.s, dx, dy, xvel, yvel));
        c(2);
        return true;
    }

    private int a(View child, int dx, int dy, int xvel, int yvel) {
        float f2;
        float f3;
        float f4;
        float f5;
        int xvel2 = a(xvel, (int) this.n, (int) this.m);
        int yvel2 = a(yvel, (int) this.n, (int) this.m);
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        int absXVel = Math.abs(xvel2);
        int absYVel = Math.abs(yvel2);
        int addedVel = absXVel + absYVel;
        int addedDistance = absDx + absDy;
        if (xvel2 != 0) {
            f3 = (float) absXVel;
            f2 = (float) addedVel;
        } else {
            f3 = (float) absDx;
            f2 = (float) addedDistance;
        }
        float xweight = f3 / f2;
        if (yvel2 != 0) {
            f5 = (float) absYVel;
            f4 = (float) addedVel;
        } else {
            f5 = (float) absDy;
            f4 = (float) addedDistance;
        }
        float yweight = f5 / f4;
        return (int) ((((float) b(dx, xvel2, this.r.a(child))) * xweight) + (((float) b(dy, yvel2, this.r.b(child))) * yweight));
    }

    private int b(int delta, int velocity, int motionRange) {
        int duration;
        if (delta == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * b(Math.min(1.0f, ((float) Math.abs(delta)) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(delta)) / ((float) motionRange))) * 256.0f);
        }
        return Math.min(duration, 600);
    }

    private int a(int value, int absMin, int absMax) {
        int absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0;
        }
        if (absValue > absMax) {
            return value > 0 ? absMax : -absMax;
        }
        return value;
    }

    private float a(float value, float absMin, float absMax) {
        float absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0.0f;
        }
        if (absValue > absMax) {
            return value > 0.0f ? absMax : -absMax;
        }
        return value;
    }

    private float b(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public boolean a(boolean deferCallbacks) {
        if (this.f۱۴۷۳a == 2) {
            boolean keepGoing = this.q.computeScrollOffset();
            int x = this.q.getCurrX();
            int y = this.q.getCurrY();
            int dx = x - this.s.getLeft();
            int dy = y - this.s.getTop();
            if (dx != 0) {
                u.c(this.s, dx);
            }
            if (dy != 0) {
                u.d(this.s, dy);
            }
            if (!(dx == 0 && dy == 0)) {
                this.r.a(this.s, x, y, dx, dy);
            }
            if (keepGoing && x == this.q.getFinalX() && y == this.q.getFinalY()) {
                this.q.abortAnimation();
                keepGoing = false;
            }
            if (!keepGoing) {
                if (deferCallbacks) {
                    this.u.post(this.v);
                } else {
                    c(0);
                }
            }
        }
        if (this.f۱۴۷۳a == 2) {
            return true;
        }
        return false;
    }

    private void a(float xvel, float yvel) {
        this.t = true;
        this.r.a(this.s, xvel, yvel);
        this.t = false;
        if (this.f۱۴۷۳a == 1) {
            c(0);
        }
    }

    private void f() {
        float[] fArr = this.f۱۴۷۶d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f۱۴۷۷e, 0.0f);
            Arrays.fill(this.f۱۴۷۸f, 0.0f);
            Arrays.fill(this.f۱۴۷۹g, 0.0f);
            Arrays.fill(this.f۱۴۸۰h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void e(int pointerId) {
        if (this.f۱۴۷۶d != null && b(pointerId)) {
            this.f۱۴۷۶d[pointerId] = 0.0f;
            this.f۱۴۷۷e[pointerId] = 0.0f;
            this.f۱۴۷۸f[pointerId] = 0.0f;
            this.f۱۴۷۹g[pointerId] = 0.0f;
            this.f۱۴۸۰h[pointerId] = 0;
            this.i[pointerId] = 0;
            this.j[pointerId] = 0;
            this.k &= (1 << pointerId) ^ -1;
        }
    }

    private void f(int pointerId) {
        float[] fArr = this.f۱۴۷۶d;
        if (fArr == null || fArr.length <= pointerId) {
            float[] imx = new float[(pointerId + 1)];
            float[] imy = new float[(pointerId + 1)];
            float[] lmx = new float[(pointerId + 1)];
            float[] lmy = new float[(pointerId + 1)];
            int[] iit = new int[(pointerId + 1)];
            int[] edip = new int[(pointerId + 1)];
            int[] edl = new int[(pointerId + 1)];
            float[] fArr2 = this.f۱۴۷۶d;
            if (fArr2 != null) {
                System.arraycopy(fArr2, 0, imx, 0, fArr2.length);
                float[] fArr3 = this.f۱۴۷۷e;
                System.arraycopy(fArr3, 0, imy, 0, fArr3.length);
                float[] fArr4 = this.f۱۴۷۸f;
                System.arraycopy(fArr4, 0, lmx, 0, fArr4.length);
                float[] fArr5 = this.f۱۴۷۹g;
                System.arraycopy(fArr5, 0, lmy, 0, fArr5.length);
                int[] iArr = this.f۱۴۸۰h;
                System.arraycopy(iArr, 0, iit, 0, iArr.length);
                int[] iArr2 = this.i;
                System.arraycopy(iArr2, 0, edip, 0, iArr2.length);
                int[] iArr3 = this.j;
                System.arraycopy(iArr3, 0, edl, 0, iArr3.length);
            }
            this.f۱۴۷۶d = imx;
            this.f۱۴۷۷e = imy;
            this.f۱۴۷۸f = lmx;
            this.f۱۴۷۹g = lmy;
            this.f۱۴۸۰h = iit;
            this.i = edip;
            this.j = edl;
        }
    }

    private void b(float x, float y, int pointerId) {
        f(pointerId);
        float[] fArr = this.f۱۴۷۶d;
        this.f۱۴۷۸f[pointerId] = x;
        fArr[pointerId] = x;
        float[] fArr2 = this.f۱۴۷۷e;
        this.f۱۴۷۹g[pointerId] = y;
        fArr2[pointerId] = y;
        this.f۱۴۸۰h[pointerId] = e((int) x, (int) y);
        this.k |= 1 << pointerId;
    }

    private void c(MotionEvent ev) {
        int pointerCount = ev.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = ev.getPointerId(i2);
            if (g(pointerId)) {
                float x = ev.getX(i2);
                float y = ev.getY(i2);
                this.f۱۴۷۸f[pointerId] = x;
                this.f۱۴۷۹g[pointerId] = y;
            }
        }
    }

    public boolean b(int pointerId) {
        return (this.k & (1 << pointerId)) != 0;
    }

    /* access modifiers changed from: package-private */
    public void c(int state) {
        this.u.removeCallbacks(this.v);
        if (this.f۱۴۷۳a != state) {
            this.f۱۴۷۳a = state;
            this.r.c(state);
            if (this.f۱۴۷۳a == 0) {
                this.s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(View toCapture, int pointerId) {
        if (toCapture == this.s && this.f۱۴۷۵c == pointerId) {
            return true;
        }
        if (toCapture == null || !this.r.b(toCapture, pointerId)) {
            return false;
        }
        this.f۱۴۷۵c = pointerId;
        a(toCapture, pointerId);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r2 != r15) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.s.b(android.view.MotionEvent):boolean");
    }

    public void a(MotionEvent ev) {
        int action = ev.getActionMasked();
        int actionIndex = ev.getActionIndex();
        if (action == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(ev);
        if (action == 0) {
            float x = ev.getX();
            float y = ev.getY();
            int pointerId = ev.getPointerId(0);
            View toCapture = b((int) x, (int) y);
            b(x, y, pointerId);
            b(toCapture, pointerId);
            int edgesTouched = this.f۱۴۸۰h[pointerId];
            int i2 = this.p;
            if ((edgesTouched & i2) != 0) {
                this.r.b(i2 & edgesTouched, pointerId);
            }
        } else if (action == 1) {
            if (this.f۱۴۷۳a == 1) {
                g();
            }
            a();
        } else if (action != 2) {
            if (action == 3) {
                if (this.f۱۴۷۳a == 1) {
                    a(0.0f, 0.0f);
                }
                a();
            } else if (action == 5) {
                int pointerId2 = ev.getPointerId(actionIndex);
                float x2 = ev.getX(actionIndex);
                float y2 = ev.getY(actionIndex);
                b(x2, y2, pointerId2);
                if (this.f۱۴۷۳a == 0) {
                    b(b((int) x2, (int) y2), pointerId2);
                    int edgesTouched2 = this.f۱۴۸۰h[pointerId2];
                    int i3 = this.p;
                    if ((edgesTouched2 & i3) != 0) {
                        this.r.b(i3 & edgesTouched2, pointerId2);
                    }
                } else if (c((int) x2, (int) y2)) {
                    b(this.s, pointerId2);
                }
            } else if (action == 6) {
                int pointerId3 = ev.getPointerId(actionIndex);
                if (this.f۱۴۷۳a == 1 && pointerId3 == this.f۱۴۷۵c) {
                    int newActivePointer = -1;
                    int pointerCount = ev.getPointerCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= pointerCount) {
                            break;
                        }
                        int id = ev.getPointerId(i4);
                        if (id != this.f۱۴۷۵c) {
                            View b2 = b((int) ev.getX(i4), (int) ev.getY(i4));
                            View view = this.s;
                            if (b2 == view && b(view, id)) {
                                newActivePointer = this.f۱۴۷۵c;
                                break;
                            }
                        }
                        i4++;
                    }
                    if (newActivePointer == -1) {
                        g();
                    }
                }
                e(pointerId3);
            }
        } else if (this.f۱۴۷۳a != 1) {
            int pointerCount2 = ev.getPointerCount();
            for (int i5 = 0; i5 < pointerCount2; i5++) {
                int pointerId4 = ev.getPointerId(i5);
                if (g(pointerId4)) {
                    float x3 = ev.getX(i5);
                    float y3 = ev.getY(i5);
                    float dx = x3 - this.f۱۴۷۶d[pointerId4];
                    float dy = y3 - this.f۱۴۷۷e[pointerId4];
                    a(dx, dy, pointerId4);
                    if (this.f۱۴۷۳a == 1) {
                        break;
                    }
                    View toCapture2 = b((int) x3, (int) y3);
                    if (a(toCapture2, dx, dy) && b(toCapture2, pointerId4)) {
                        break;
                    }
                }
            }
            c(ev);
        } else if (g(this.f۱۴۷۵c)) {
            int index = ev.findPointerIndex(this.f۱۴۷۵c);
            float x4 = ev.getX(index);
            float y4 = ev.getY(index);
            float[] fArr = this.f۱۴۷۸f;
            int i6 = this.f۱۴۷۵c;
            int idx = (int) (x4 - fArr[i6]);
            int idy = (int) (y4 - this.f۱۴۷۹g[i6]);
            a(this.s.getLeft() + idx, this.s.getTop() + idy, idx, idy);
            c(ev);
        }
    }

    private void a(float dx, float dy, int pointerId) {
        int dragsStarted = 0;
        if (a(dx, dy, pointerId, 1)) {
            dragsStarted = 0 | 1;
        }
        if (a(dy, dx, pointerId, 4)) {
            dragsStarted |= 4;
        }
        if (a(dx, dy, pointerId, 2)) {
            dragsStarted |= 2;
        }
        if (a(dy, dx, pointerId, 8)) {
            dragsStarted |= 8;
        }
        if (dragsStarted != 0) {
            int[] iArr = this.i;
            iArr[pointerId] = iArr[pointerId] | dragsStarted;
            this.r.a(dragsStarted, pointerId);
        }
    }

    private boolean a(float delta, float odelta, int pointerId, int edge) {
        float absDelta = Math.abs(delta);
        float absODelta = Math.abs(odelta);
        if (!((this.f۱۴۸۰h[pointerId] & edge) != edge || (this.p & edge) == 0 || (this.j[pointerId] & edge) == edge || (this.i[pointerId] & edge) == edge)) {
            int i2 = this.f۱۴۷۴b;
            if (absDelta > ((float) i2) || absODelta > ((float) i2)) {
                if (absDelta < 0.5f * absODelta && this.r.b(edge)) {
                    int[] iArr = this.j;
                    iArr[pointerId] = iArr[pointerId] | edge;
                    return false;
                } else if ((this.i[pointerId] & edge) != 0 || absDelta <= ((float) this.f۱۴۷۴b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(View child, float dx, float dy) {
        if (child == null) {
            return false;
        }
        boolean checkHorizontal = this.r.a(child) > 0;
        boolean checkVertical = this.r.b(child) > 0;
        if (checkHorizontal && checkVertical) {
            float f2 = (dx * dx) + (dy * dy);
            int i2 = this.f۱۴۷۴b;
            if (f2 > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (checkHorizontal) {
            if (Math.abs(dx) > ((float) this.f۱۴۷۴b)) {
                return true;
            }
            return false;
        } else if (!checkVertical || Math.abs(dy) <= ((float) this.f۱۴۷۴b)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean a(int directions) {
        int count = this.f۱۴۷۶d.length;
        for (int i2 = 0; i2 < count; i2++) {
            if (a(directions, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int directions, int pointerId) {
        if (!b(pointerId)) {
            return false;
        }
        boolean checkHorizontal = (directions & 1) == 1;
        boolean checkVertical = (directions & 2) == 2;
        float dx = this.f۱۴۷۸f[pointerId] - this.f۱۴۷۶d[pointerId];
        float dy = this.f۱۴۷۹g[pointerId] - this.f۱۴۷۷e[pointerId];
        if (checkHorizontal && checkVertical) {
            float f2 = (dx * dx) + (dy * dy);
            int i2 = this.f۱۴۷۴b;
            if (f2 > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (checkHorizontal) {
            if (Math.abs(dx) > ((float) this.f۱۴۷۴b)) {
                return true;
            }
            return false;
        } else if (!checkVertical || Math.abs(dy) <= ((float) this.f۱۴۷۴b)) {
            return false;
        } else {
            return true;
        }
    }

    private void g() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(this.l.getXVelocity(this.f۱۴۷۵c), this.n, this.m), a(this.l.getYVelocity(this.f۱۴۷۵c), this.n, this.m));
    }

    private void a(int left, int top, int dx, int dy) {
        int clampedX = left;
        int clampedY = top;
        int oldLeft = this.s.getLeft();
        int oldTop = this.s.getTop();
        if (dx != 0) {
            clampedX = this.r.a(this.s, left, dx);
            u.c(this.s, clampedX - oldLeft);
        }
        if (dy != 0) {
            clampedY = this.r.b(this.s, top, dy);
            u.d(this.s, clampedY - oldTop);
        }
        if (dx != 0 || dy != 0) {
            this.r.a(this.s, clampedX, clampedY, clampedX - oldLeft, clampedY - oldTop);
        }
    }

    public boolean c(int x, int y) {
        return a(this.s, x, y);
    }

    public boolean a(View view, int x, int y) {
        if (view != null && x >= view.getLeft() && x < view.getRight() && y >= view.getTop() && y < view.getBottom()) {
            return true;
        }
        return false;
    }

    public View b(int x, int y) {
        for (int i2 = this.u.getChildCount() - 1; i2 >= 0; i2--) {
            ViewGroup viewGroup = this.u;
            this.r.a(i2);
            View child = viewGroup.getChildAt(i2);
            if (x >= child.getLeft() && x < child.getRight() && y >= child.getTop() && y < child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    private int e(int x, int y) {
        int result = 0;
        if (x < this.u.getLeft() + this.o) {
            result = 0 | 1;
        }
        if (y < this.u.getTop() + this.o) {
            result |= 4;
        }
        if (x > this.u.getRight() - this.o) {
            result |= 2;
        }
        if (y > this.u.getBottom() - this.o) {
            return result | 8;
        }
        return result;
    }

    private boolean g(int pointerId) {
        if (b(pointerId)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
