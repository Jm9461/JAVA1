package android.support.p۰۴۳v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p۰۴۳v4.view.Cu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a  reason: invalid class name */
public abstract class AbstractView$OnTouchListenerCa implements View.OnTouchListener {

    /* renamed from: t  reason: contains not printable characters */
    private static final int f۱۰۷۳۳t = ViewConfiguration.getTapTimeout();

    /* renamed from: c  reason: contains not printable characters */
    final Ca f۱۰۷۳۴c = new Ca();

    /* renamed from: d  reason: contains not printable characters */
    private final Interpolator f۱۰۷۳۵d = new AccelerateInterpolator();

    /* renamed from: e  reason: contains not printable characters */
    final View f۱۰۷۳۶e;

    /* renamed from: f  reason: contains not printable characters */
    private Runnable f۱۰۷۳۷f;

    /* renamed from: g  reason: contains not printable characters */
    private float[] f۱۰۷۳۸g = {0.0f, 0.0f};

    /* renamed from: h  reason: contains not printable characters */
    private float[] f۱۰۷۳۹h = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۰۷۴۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۰۷۴۱j;

    /* renamed from: k  reason: contains not printable characters */
    private float[] f۱۰۷۴۲k = {0.0f, 0.0f};

    /* renamed from: l  reason: contains not printable characters */
    private float[] f۱۰۷۴۳l = {0.0f, 0.0f};

    /* renamed from: m  reason: contains not printable characters */
    private float[] f۱۰۷۴۴m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۰۷۴۵n;

    /* renamed from: o  reason: contains not printable characters */
    boolean f۱۰۷۴۶o;

    /* renamed from: p  reason: contains not printable characters */
    boolean f۱۰۷۴۷p;

    /* renamed from: q  reason: contains not printable characters */
    boolean f۱۰۷۴۸q;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۰۷۴۹r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۰۷۵۰s;

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۱۹۷a(int i, int i2);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۳۱۹۸a(int i);

    /* renamed from: b  reason: contains not printable characters */
    public abstract boolean m۱۳۲۰۱b(int i);

    public AbstractView$OnTouchListenerCa(View target) {
        this.f۱۰۷۳۶e = target;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int maxVelocity = (int) ((1575.0f * f) + 0.5f);
        int minVelocity = (int) ((f * 315.0f) + 0.5f);
        m۱۳۱۹۹b((float) maxVelocity, (float) maxVelocity);
        m۱۳۲۰۲c((float) minVelocity, (float) minVelocity);
        m۱۳۲۰۵d(1);
        m۱۳۱۹۴a(Float.MAX_VALUE, Float.MAX_VALUE);
        m۱۳۲۰۴d(0.2f, 0.2f);
        m۱۳۲۰۶e(1.0f, 1.0f);
        m۱۳۲۰۳c(f۱۰۷۳۳t);
        m۱۳۲۰۸f(500);
        m۱۳۲۰۷e(500);
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۱۹۵a(boolean enabled) {
        if (this.f۱۰۷۴۹r && !enabled) {
            m۱۳۱۹۱c();
        }
        this.f۱۰۷۴۹r = enabled;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۱۹۹b(float horizontalMax, float verticalMax) {
        float[] fArr = this.f۱۰۷۴۴m;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۲c(float horizontalMin, float verticalMin) {
        float[] fArr = this.f۱۰۷۴۳l;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    /* renamed from: e  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۶e(float horizontal, float vertical) {
        float[] fArr = this.f۱۰۷۴۲k;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۵d(int type) {
        this.f۱۰۷۴۰i = type;
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۴d(float horizontal, float vertical) {
        float[] fArr = this.f۱۰۷۳۸g;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۱۹۴a(float horizontalMax, float verticalMax) {
        float[] fArr = this.f۱۰۷۳۹h;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۳c(int delayMillis) {
        this.f۱۰۷۴۱j = delayMillis;
        return this;
    }

    /* renamed from: f  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۸f(int durationMillis) {
        this.f۱۰۷۳۴c.m۱۳۲۱۵b(durationMillis);
        return this;
    }

    /* renamed from: e  reason: contains not printable characters */
    public AbstractView$OnTouchListenerCa m۱۳۲۰۷e(int durationMillis) {
        this.f۱۰۷۳۴c.m۱۳۲۱۳a(durationMillis);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f۱۰۷۴۹r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r3 = 3
            if (r0 == r3) goto L_0x0016
            goto L_0x005a
        L_0x0016:
            r7.m۱۳۱۹۱c()
            goto L_0x005a
        L_0x001a:
            r7.f۱۰۷۴۷p = r2
            r7.f۱۰۷۴۵n = r1
        L_0x001e:
            float r3 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.f۱۰۷۳۶e
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r7.m۱۳۱۸۹a(r1, r3, r4, r5)
            float r4 = r9.getY()
            int r5 = r8.getHeight()
            float r5 = (float) r5
            android.view.View r6 = r7.f۱۰۷۳۶e
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r4 = r7.m۱۳۱۸۹a(r2, r4, r5, r6)
            android.support.v4.widget.a$a r5 = r7.f۱۰۷۳۴c
            r5.m۱۳۲۱۲a(r3, r4)
            boolean r5 = r7.f۱۰۷۴۸q
            if (r5 != 0) goto L_0x005a
            boolean r5 = r7.m۱۳۲۰۰b()
            if (r5 == 0) goto L_0x005a
            r7.m۱۳۱۹۲d()
        L_0x005a:
            boolean r3 = r7.f۱۰۷۵۰s
            if (r3 == 0) goto L_0x0063
            boolean r3 = r7.f۱۰۷۴۸q
            if (r3 == 0) goto L_0x0063
            r1 = 1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.widget.AbstractView$OnTouchListenerCa.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۲۰۰b() {
        Ca scroller = this.f۱۰۷۳۴c;
        int verticalDirection = scroller.m۱۳۲۱۸e();
        int horizontalDirection = scroller.m۱۳۲۱۷d();
        return (verticalDirection != 0 && m۱۳۲۰۱b(verticalDirection)) || (horizontalDirection != 0 && m۱۳۱۹۸a(horizontalDirection));
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۳۱۹۲d() {
        int i;
        if (this.f۱۰۷۳۷f == null) {
            this.f۱۰۷۳۷f = new RunnableCb();
        }
        this.f۱۰۷۴۸q = true;
        this.f۱۰۷۴۶o = true;
        if (this.f۱۰۷۴۵n || (i = this.f۱۰۷۴۱j) <= 0) {
            this.f۱۰۷۳۷f.run();
        } else {
            Cu.m۱۲۹۹۰a(this.f۱۰۷۳۶e, this.f۱۰۷۳۷f, (long) i);
        }
        this.f۱۰۷۴۵n = true;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۱۹۱c() {
        if (this.f۱۰۷۴۶o) {
            this.f۱۰۷۴۸q = false;
        } else {
            this.f۱۰۷۳۴c.m۱۳۲۲۰g();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۳۱۸۹a(int direction, float coordinate, float srcSize, float dstSize) {
        float value = m۱۳۱۸۸a(this.f۱۰۷۳۸g[direction], srcSize, this.f۱۰۷۳۹h[direction], coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.f۱۰۷۴۲k[direction];
        float minimumVelocity = this.f۱۰۷۴۳l[direction];
        float maximumVelocity = this.f۱۰۷۴۴m[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return m۱۳۱۸۷a(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -m۱۳۱۸۷a((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۳۱۸۸a(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = m۱۳۱۸۷a(relativeValue * size, 0.0f, maxValue);
        float value = m۱۳۱۹۳f(size - current, edgeSize) - m۱۳۱۹۳f(current, edgeSize);
        if (value < 0.0f) {
            interpolated = -this.f۱۰۷۳۵d.getInterpolation(-value);
        } else if (value <= 0.0f) {
            return 0.0f;
        } else {
            interpolated = this.f۱۰۷۳۵d.getInterpolation(value);
        }
        return m۱۳۱۸۷a(interpolated, -1.0f, 1.0f);
    }

    /* renamed from: f  reason: contains not printable characters */
    private float m۱۳۱۹۳f(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i = this.f۱۰۷۴۰i;
        if (i == 0 || i == 1) {
            if (current < leading) {
                if (current >= 0.0f) {
                    return 1.0f - (current / leading);
                }
                if (!this.f۱۰۷۴۸q || this.f۱۰۷۴۰i != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i == 2 && current < 0.0f) {
            return current / (-leading);
        }
        return 0.0f;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۳۱۹۰a(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: a  reason: contains not printable characters */
    static float m۱۳۱۸۷a(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۱۹۶a() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f۱۰۷۳۶e.onTouchEvent(cancel);
        cancel.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$b  reason: invalid class name */
    public class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            AbstractView$OnTouchListenerCa aVar = AbstractView$OnTouchListenerCa.this;
            if (aVar.f۱۰۷۴۸q) {
                if (aVar.f۱۰۷۴۶o) {
                    aVar.f۱۰۷۴۶o = false;
                    aVar.f۱۰۷۳۴c.m۱۳۲۲۱h();
                }
                Ca scroller = AbstractView$OnTouchListenerCa.this.f۱۰۷۳۴c;
                if (scroller.m۱۳۲۱۹f() || !AbstractView$OnTouchListenerCa.this.m۱۳۲۰۰b()) {
                    AbstractView$OnTouchListenerCa.this.f۱۰۷۴۸q = false;
                    return;
                }
                AbstractView$OnTouchListenerCa aVar2 = AbstractView$OnTouchListenerCa.this;
                if (aVar2.f۱۰۷۴۷p) {
                    aVar2.f۱۰۷۴۷p = false;
                    aVar2.m۱۳۱۹۶a();
                }
                scroller.m۱۳۲۱۱a();
                AbstractView$OnTouchListenerCa.this.m۱۳۱۹۷a(scroller.m۱۳۲۱۴b(), scroller.m۱۳۲۱۶c());
                Cu.m۱۲۹۸۹a(AbstractView$OnTouchListenerCa.this.f۱۰۷۳۶e, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private int f۱۰۷۵۱a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۰۷۵۲b;

        /* renamed from: c  reason: contains not printable characters */
        private float f۱۰۷۵۳c;

        /* renamed from: d  reason: contains not printable characters */
        private float f۱۰۷۵۴d;

        /* renamed from: e  reason: contains not printable characters */
        private long f۱۰۷۵۵e = Long.MIN_VALUE;

        /* renamed from: f  reason: contains not printable characters */
        private long f۱۰۷۵۶f = 0;

        /* renamed from: g  reason: contains not printable characters */
        private int f۱۰۷۵۷g = 0;

        /* renamed from: h  reason: contains not printable characters */
        private int f۱۰۷۵۸h = 0;

        /* renamed from: i  reason: contains not printable characters */
        private long f۱۰۷۵۹i = -1;

        /* renamed from: j  reason: contains not printable characters */
        private float f۱۰۷۶۰j;

        /* renamed from: k  reason: contains not printable characters */
        private int f۱۰۷۶۱k;

        Ca() {
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۲۱۵b(int durationMillis) {
            this.f۱۰۷۵۱a = durationMillis;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۲۱۳a(int durationMillis) {
            this.f۱۰۷۵۲b = durationMillis;
        }

        /* renamed from: h  reason: contains not printable characters */
        public void m۱۳۲۲۱h() {
            this.f۱۰۷۵۵e = AnimationUtils.currentAnimationTimeMillis();
            this.f۱۰۷۵۹i = -1;
            this.f۱۰۷۵۶f = this.f۱۰۷۵۵e;
            this.f۱۰۷۶۰j = 0.5f;
            this.f۱۰۷۵۷g = 0;
            this.f۱۰۷۵۸h = 0;
        }

        /* renamed from: g  reason: contains not printable characters */
        public void m۱۳۲۲۰g() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.f۱۰۷۶۱k = AbstractView$OnTouchListenerCa.m۱۳۱۹۰a((int) (currentTime - this.f۱۰۷۵۵e), 0, this.f۱۰۷۵۲b);
            this.f۱۰۷۶۰j = m۱۳۲۱۰a(currentTime);
            this.f۱۰۷۵۹i = currentTime;
        }

        /* renamed from: f  reason: contains not printable characters */
        public boolean m۱۳۲۱۹f() {
            return this.f۱۰۷۵۹i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f۱۰۷۵۹i + ((long) this.f۱۰۷۶۱k);
        }

        /* renamed from: a  reason: contains not printable characters */
        private float m۱۳۲۱۰a(long currentTime) {
            if (currentTime < this.f۱۰۷۵۵e) {
                return 0.0f;
            }
            long j = this.f۱۰۷۵۹i;
            if (j < 0 || currentTime < j) {
                return AbstractView$OnTouchListenerCa.m۱۳۱۸۷a(((float) (currentTime - this.f۱۰۷۵۵e)) / ((float) this.f۱۰۷۵۱a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f۱۰۷۶۰j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerCa.m۱۳۱۸۷a(((float) (currentTime - j)) / ((float) this.f۱۰۷۶۱k), 0.0f, 1.0f));
        }

        /* renamed from: a  reason: contains not printable characters */
        private float m۱۳۲۰۹a(float value) {
            return (-4.0f * value * value) + (4.0f * value);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۲۱۱a() {
            if (this.f۱۰۷۵۶f != 0) {
                long currentTime = AnimationUtils.currentAnimationTimeMillis();
                float scale = m۱۳۲۰۹a(m۱۳۲۱۰a(currentTime));
                long elapsedSinceDelta = currentTime - this.f۱۰۷۵۶f;
                this.f۱۰۷۵۶f = currentTime;
                this.f۱۰۷۵۷g = (int) (((float) elapsedSinceDelta) * scale * this.f۱۰۷۵۳c);
                this.f۱۰۷۵۸h = (int) (((float) elapsedSinceDelta) * scale * this.f۱۰۷۵۴d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۲۱۲a(float x, float y) {
            this.f۱۰۷۵۳c = x;
            this.f۱۰۷۵۴d = y;
        }

        /* renamed from: d  reason: contains not printable characters */
        public int m۱۳۲۱۷d() {
            float f = this.f۱۰۷۵۳c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۳۲۱۸e() {
            float f = this.f۱۰۷۵۴d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۳۲۱۴b() {
            return this.f۱۰۷۵۷g;
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۳۲۱۶c() {
            return this.f۱۰۷۵۸h;
        }
    }
}
