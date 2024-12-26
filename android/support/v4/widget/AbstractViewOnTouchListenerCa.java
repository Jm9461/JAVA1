package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.Cu;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractViewOnTouchListenerCa implements View.OnTouchListener {

    /* renamed from: t, reason: contains not printable characters */
    private static final int f۱۰۷۳۳t = ViewConfiguration.getTapTimeout();

    /* renamed from: e, reason: contains not printable characters */
    final View f۱۰۷۳۶e;

    /* renamed from: f, reason: contains not printable characters */
    private Runnable f۱۰۷۳۷f;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۰۷۴۰i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۰۷۴۱j;

    /* renamed from: n, reason: contains not printable characters */
    private boolean f۱۰۷۴۵n;

    /* renamed from: o, reason: contains not printable characters */
    boolean f۱۰۷۴۶o;

    /* renamed from: p, reason: contains not printable characters */
    boolean f۱۰۷۴۷p;

    /* renamed from: q, reason: contains not printable characters */
    boolean f۱۰۷۴۸q;

    /* renamed from: r, reason: contains not printable characters */
    private boolean f۱۰۷۴۹r;

    /* renamed from: s, reason: contains not printable characters */
    private boolean f۱۰۷۵۰s;

    /* renamed from: c, reason: contains not printable characters */
    final a f۱۰۷۳۴c = new a();

    /* renamed from: d, reason: contains not printable characters */
    private final Interpolator f۱۰۷۳۵d = new AccelerateInterpolator();

    /* renamed from: g, reason: contains not printable characters */
    private float[] f۱۰۷۳۸g = {0.0f, 0.0f};

    /* renamed from: h, reason: contains not printable characters */
    private float[] f۱۰۷۳۹h = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k, reason: contains not printable characters */
    private float[] f۱۰۷۴۲k = {0.0f, 0.0f};

    /* renamed from: l, reason: contains not printable characters */
    private float[] f۱۰۷۴۳l = {0.0f, 0.0f};

    /* renamed from: m, reason: contains not printable characters */
    private float[] f۱۰۷۴۴m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۲۱۹a(int i, int i2);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۱۲۲۰a(int i);

    /* renamed from: b, reason: contains not printable characters */
    public abstract boolean mo۱۱۲۲۱b(int i);

    public AbstractViewOnTouchListenerCa(View target) {
        this.f۱۰۷۳۶e = target;
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float f2 = metrics.density;
        int maxVelocity = (int) ((1575.0f * f2) + 0.5f);
        int minVelocity = (int) ((f2 * 315.0f) + 0.5f);
        m۱۱۱۲۹b(maxVelocity, maxVelocity);
        m۱۱۱۳۲c(minVelocity, minVelocity);
        m۱۱۱۳۵d(1);
        m۱۱۱۲۴a(Float.MAX_VALUE, Float.MAX_VALUE);
        m۱۱۱۳۴d(0.2f, 0.2f);
        m۱۱۱۳۶e(1.0f, 1.0f);
        m۱۱۱۳۳c(f۱۰۷۳۳t);
        m۱۱۱۳۸f(500);
        m۱۱۱۳۷e(500);
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۲۵a(boolean enabled) {
        if (this.f۱۰۷۴۹r && !enabled) {
            m۱۱۱۲۱c();
        }
        this.f۱۰۷۴۹r = enabled;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۲۹b(float horizontalMax, float verticalMax) {
        float[] fArr = this.f۱۰۷۴۴m;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۲c(float horizontalMin, float verticalMin) {
        float[] fArr = this.f۱۰۷۴۳l;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    /* renamed from: e, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۶e(float horizontal, float vertical) {
        float[] fArr = this.f۱۰۷۴۲k;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۵d(int type) {
        this.f۱۰۷۴۰i = type;
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۴d(float horizontal, float vertical) {
        float[] fArr = this.f۱۰۷۳۸g;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۲۴a(float horizontalMax, float verticalMax) {
        float[] fArr = this.f۱۰۷۳۹h;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۳c(int delayMillis) {
        this.f۱۰۷۴۱j = delayMillis;
        return this;
    }

    /* renamed from: f, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۸f(int durationMillis) {
        this.f۱۰۷۳۴c.m۱۱۱۴۵b(durationMillis);
        return this;
    }

    /* renamed from: e, reason: contains not printable characters */
    public AbstractViewOnTouchListenerCa m۱۱۱۳۷e(int durationMillis) {
        this.f۱۰۷۳۴c.m۱۱۱۴۳a(durationMillis);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L۲۰;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f۱۰۷۴۹r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r3 = 3
            if (r0 == r3) goto L16
            goto L5a
        L16:
            r7.m۱۱۱۲۱c()
            goto L5a
        L1a:
            r7.f۱۰۷۴۷p = r2
            r7.f۱۰۷۴۵n = r1
        L1e:
            float r3 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.f۱۰۷۳۶e
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r7.m۱۱۱۱۹a(r1, r3, r4, r5)
            float r4 = r9.getY()
            int r5 = r8.getHeight()
            float r5 = (float) r5
            android.view.View r6 = r7.f۱۰۷۳۶e
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r4 = r7.m۱۱۱۱۹a(r2, r4, r5, r6)
            android.support.v4.widget.a$a r5 = r7.f۱۰۷۳۴c
            r5.m۱۱۱۴۲a(r3, r4)
            boolean r5 = r7.f۱۰۷۴۸q
            if (r5 != 0) goto L5a
            boolean r5 = r7.m۱۱۱۳۰b()
            if (r5 == 0) goto L5a
            r7.m۱۱۱۲۲d()
        L5a:
            boolean r3 = r7.f۱۰۷۵۰s
            if (r3 == 0) goto L63
            boolean r3 = r7.f۱۰۷۴۸q
            if (r3 == 0) goto L63
            r1 = 1
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.AbstractViewOnTouchListenerCa.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۱۱۳۰b() {
        a scroller = this.f۱۰۷۳۴c;
        int verticalDirection = scroller.m۱۱۱۴۸e();
        int horizontalDirection = scroller.m۱۱۱۴۷d();
        return (verticalDirection != 0 && mo۱۱۲۲۱b(verticalDirection)) || (horizontalDirection != 0 && mo۱۱۲۲۰a(horizontalDirection));
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۱۱۲۲d() {
        int i;
        if (this.f۱۰۷۳۷f == null) {
            this.f۱۰۷۳۷f = new b();
        }
        this.f۱۰۷۴۸q = true;
        this.f۱۰۷۴۶o = true;
        if (!this.f۱۰۷۴۵n && (i = this.f۱۰۷۴۱j) > 0) {
            Cu.m۱۰۹۲۰a(this.f۱۰۷۳۶e, this.f۱۰۷۳۷f, i);
        } else {
            this.f۱۰۷۳۷f.run();
        }
        this.f۱۰۷۴۵n = true;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۱۱۲۱c() {
        if (this.f۱۰۷۴۶o) {
            this.f۱۰۷۴۸q = false;
        } else {
            this.f۱۰۷۳۴c.m۱۱۱۵۰g();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private float m۱۱۱۱۹a(int direction, float coordinate, float srcSize, float dstSize) {
        float relativeEdge = this.f۱۰۷۳۸g[direction];
        float maximumEdge = this.f۱۰۷۳۹h[direction];
        float value = m۱۱۱۱۸a(relativeEdge, srcSize, maximumEdge, coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.f۱۰۷۴۲k[direction];
        float minimumVelocity = this.f۱۰۷۴۳l[direction];
        float maximumVelocity = this.f۱۰۷۴۴m[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return m۱۱۱۱۷a(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -m۱۱۱۱۷a((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    /* renamed from: a, reason: contains not printable characters */
    private float m۱۱۱۱۸a(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = m۱۱۱۱۷a(relativeValue * size, 0.0f, maxValue);
        float valueLeading = m۱۱۱۲۳f(current, edgeSize);
        float valueTrailing = m۱۱۱۲۳f(size - current, edgeSize);
        float value = valueTrailing - valueLeading;
        if (value < 0.0f) {
            interpolated = -this.f۱۰۷۳۵d.getInterpolation(-value);
        } else {
            if (value <= 0.0f) {
                return 0.0f;
            }
            interpolated = this.f۱۰۷۳۵d.getInterpolation(value);
        }
        return m۱۱۱۱۷a(interpolated, -1.0f, 1.0f);
    }

    /* renamed from: f, reason: contains not printable characters */
    private float m۱۱۱۲۳f(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i = this.f۱۰۷۴۰i;
        if (i == 0 || i == 1) {
            if (current < leading) {
                if (current >= 0.0f) {
                    return 1.0f - (current / leading);
                }
                if (this.f۱۰۷۴۸q && this.f۱۰۷۴۰i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && current < 0.0f) {
            return current / (-leading);
        }
        return 0.0f;
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۱۱۲۰a(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: a, reason: contains not printable characters */
    static float m۱۱۱۱۷a(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۱۲۶a() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f۱۰۷۳۶e.onTouchEvent(cancel);
        cancel.recycle();
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerCa abstractViewOnTouchListenerCa = AbstractViewOnTouchListenerCa.this;
            if (!abstractViewOnTouchListenerCa.f۱۰۷۴۸q) {
                return;
            }
            if (abstractViewOnTouchListenerCa.f۱۰۷۴۶o) {
                abstractViewOnTouchListenerCa.f۱۰۷۴۶o = false;
                abstractViewOnTouchListenerCa.f۱۰۷۳۴c.m۱۱۱۵۱h();
            }
            a scroller = AbstractViewOnTouchListenerCa.this.f۱۰۷۳۴c;
            if (scroller.m۱۱۱۴۹f() || !AbstractViewOnTouchListenerCa.this.m۱۱۱۳۰b()) {
                AbstractViewOnTouchListenerCa.this.f۱۰۷۴۸q = false;
                return;
            }
            AbstractViewOnTouchListenerCa abstractViewOnTouchListenerCa2 = AbstractViewOnTouchListenerCa.this;
            if (abstractViewOnTouchListenerCa2.f۱۰۷۴۷p) {
                abstractViewOnTouchListenerCa2.f۱۰۷۴۷p = false;
                abstractViewOnTouchListenerCa2.m۱۱۱۲۶a();
            }
            scroller.m۱۱۱۴۱a();
            int deltaX = scroller.m۱۱۱۴۴b();
            int deltaY = scroller.m۱۱۱۴۶c();
            AbstractViewOnTouchListenerCa.this.mo۱۱۲۱۹a(deltaX, deltaY);
            Cu.m۱۰۹۱۹a(AbstractViewOnTouchListenerCa.this.f۱۰۷۳۶e, this);
        }
    }

    /* renamed from: android.support.v4.widget.a$a */
    private static class a {

        /* renamed from: a, reason: contains not printable characters */
        private int f۱۰۷۵۱a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۱۰۷۵۲b;

        /* renamed from: c, reason: contains not printable characters */
        private float f۱۰۷۵۳c;

        /* renamed from: d, reason: contains not printable characters */
        private float f۱۰۷۵۴d;

        /* renamed from: j, reason: contains not printable characters */
        private float f۱۰۷۶۰j;

        /* renamed from: k, reason: contains not printable characters */
        private int f۱۰۷۶۱k;

        /* renamed from: e, reason: contains not printable characters */
        private long f۱۰۷۵۵e = Long.MIN_VALUE;

        /* renamed from: i, reason: contains not printable characters */
        private long f۱۰۷۵۹i = -1;

        /* renamed from: f, reason: contains not printable characters */
        private long f۱۰۷۵۶f = 0;

        /* renamed from: g, reason: contains not printable characters */
        private int f۱۰۷۵۷g = 0;

        /* renamed from: h, reason: contains not printable characters */
        private int f۱۰۷۵۸h = 0;

        a() {
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۱۱۱۴۵b(int durationMillis) {
            this.f۱۰۷۵۱a = durationMillis;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۱۱۴۳a(int durationMillis) {
            this.f۱۰۷۵۲b = durationMillis;
        }

        /* renamed from: h, reason: contains not printable characters */
        public void m۱۱۱۵۱h() {
            this.f۱۰۷۵۵e = AnimationUtils.currentAnimationTimeMillis();
            this.f۱۰۷۵۹i = -1L;
            this.f۱۰۷۵۶f = this.f۱۰۷۵۵e;
            this.f۱۰۷۶۰j = 0.5f;
            this.f۱۰۷۵۷g = 0;
            this.f۱۰۷۵۸h = 0;
        }

        /* renamed from: g, reason: contains not printable characters */
        public void m۱۱۱۵۰g() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.f۱۰۷۶۱k = AbstractViewOnTouchListenerCa.m۱۱۱۲۰a((int) (currentTime - this.f۱۰۷۵۵e), 0, this.f۱۰۷۵۲b);
            this.f۱۰۷۶۰j = m۱۱۱۴۰a(currentTime);
            this.f۱۰۷۵۹i = currentTime;
        }

        /* renamed from: f, reason: contains not printable characters */
        public boolean m۱۱۱۴۹f() {
            return this.f۱۰۷۵۹i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f۱۰۷۵۹i + ((long) this.f۱۰۷۶۱k);
        }

        /* renamed from: a, reason: contains not printable characters */
        private float m۱۱۱۴۰a(long currentTime) {
            if (currentTime < this.f۱۰۷۵۵e) {
                return 0.0f;
            }
            long j = this.f۱۰۷۵۹i;
            if (j < 0 || currentTime < j) {
                long elapsedSinceEnd = this.f۱۰۷۵۵e;
                long elapsedSinceStart = currentTime - elapsedSinceEnd;
                return AbstractViewOnTouchListenerCa.m۱۱۱۱۷a(elapsedSinceStart / this.f۱۰۷۵۱a, 0.0f, 1.0f) * 0.5f;
            }
            long elapsedSinceEnd2 = currentTime - j;
            float f2 = this.f۱۰۷۶۰j;
            return (1.0f - f2) + (f2 * AbstractViewOnTouchListenerCa.m۱۱۱۱۷a(elapsedSinceEnd2 / this.f۱۰۷۶۱k, 0.0f, 1.0f));
        }

        /* renamed from: a, reason: contains not printable characters */
        private float m۱۱۱۳۹a(float value) {
            return ((-4.0f) * value * value) + (4.0f * value);
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۱۱۴۱a() {
            if (this.f۱۰۷۵۶f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            float value = m۱۱۱۴۰a(currentTime);
            float scale = m۱۱۱۳۹a(value);
            long elapsedSinceDelta = currentTime - this.f۱۰۷۵۶f;
            this.f۱۰۷۵۶f = currentTime;
            this.f۱۰۷۵۷g = (int) (elapsedSinceDelta * scale * this.f۱۰۷۵۳c);
            this.f۱۰۷۵۸h = (int) (elapsedSinceDelta * scale * this.f۱۰۷۵۴d);
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۱۱۴۲a(float x, float y) {
            this.f۱۰۷۵۳c = x;
            this.f۱۰۷۵۴d = y;
        }

        /* renamed from: d, reason: contains not printable characters */
        public int m۱۱۱۴۷d() {
            float f2 = this.f۱۰۷۵۳c;
            return (int) (f2 / Math.abs(f2));
        }

        /* renamed from: e, reason: contains not printable characters */
        public int m۱۱۱۴۸e() {
            float f2 = this.f۱۰۷۵۴d;
            return (int) (f2 / Math.abs(f2));
        }

        /* renamed from: b, reason: contains not printable characters */
        public int m۱۱۱۴۴b() {
            return this.f۱۰۷۵۷g;
        }

        /* renamed from: c, reason: contains not printable characters */
        public int m۱۱۱۴۶c() {
            return this.f۱۰۷۵۸h;
        }
    }
}
