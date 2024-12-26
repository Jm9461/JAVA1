package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {
    private static final int t = ViewConfiguration.getTapTimeout();

    /* renamed from: c  reason: collision with root package name */
    final C۰۰۳۳a f۱۴۲۱c = new C۰۰۳۳a();

    /* renamed from: d  reason: collision with root package name */
    private final Interpolator f۱۴۲۲d = new AccelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    final View f۱۴۲۳e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f۱۴۲۴f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f۱۴۲۵g = {0.0f, 0.0f};

    /* renamed from: h  reason: collision with root package name */
    private float[] f۱۴۲۶h = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int i;
    private int j;
    private float[] k = {0.0f, 0.0f};
    private float[] l = {0.0f, 0.0f};
    private float[] m = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean n;
    boolean o;
    boolean p;
    boolean q;
    private boolean r;
    private boolean s;

    public abstract void a(int i2, int i3);

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    public a(View target) {
        this.f۱۴۲۳e = target;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        int maxVelocity = (int) ((1575.0f * f2) + 0.5f);
        int minVelocity = (int) ((f2 * 315.0f) + 0.5f);
        b((float) maxVelocity, (float) maxVelocity);
        c((float) minVelocity, (float) minVelocity);
        d(1);
        a(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        e(1.0f, 1.0f);
        c(t);
        f(500);
        e(500);
    }

    public a a(boolean enabled) {
        if (this.r && !enabled) {
            c();
        }
        this.r = enabled;
        return this;
    }

    public a b(float horizontalMax, float verticalMax) {
        float[] fArr = this.m;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    public a c(float horizontalMin, float verticalMin) {
        float[] fArr = this.l;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    public a e(float horizontal, float vertical) {
        float[] fArr = this.k;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    public a d(int type) {
        this.i = type;
        return this;
    }

    public a d(float horizontal, float vertical) {
        float[] fArr = this.f۱۴۲۵g;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    public a a(float horizontalMax, float verticalMax) {
        float[] fArr = this.f۱۴۲۶h;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    public a c(int delayMillis) {
        this.j = delayMillis;
        return this;
    }

    public a f(int durationMillis) {
        this.f۱۴۲۱c.b(durationMillis);
        return this;
    }

    public a e(int durationMillis) {
        this.f۱۴۲۱c.a(durationMillis);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.r
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
            r7.c()
            goto L_0x005a
        L_0x001a:
            r7.p = r2
            r7.n = r1
        L_0x001e:
            float r3 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.f۱۴۲۳e
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r7.a(r1, r3, r4, r5)
            float r4 = r9.getY()
            int r5 = r8.getHeight()
            float r5 = (float) r5
            android.view.View r6 = r7.f۱۴۲۳e
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r4 = r7.a(r2, r4, r5, r6)
            android.support.v4.widget.a$a r5 = r7.f۱۴۲۱c
            r5.a(r3, r4)
            boolean r5 = r7.q
            if (r5 != 0) goto L_0x005a
            boolean r5 = r7.b()
            if (r5 == 0) goto L_0x005a
            r7.d()
        L_0x005a:
            boolean r3 = r7.s
            if (r3 == 0) goto L_0x0063
            boolean r3 = r7.q
            if (r3 == 0) goto L_0x0063
            r1 = 1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        C۰۰۳۳a scroller = this.f۱۴۲۱c;
        int verticalDirection = scroller.e();
        int horizontalDirection = scroller.d();
        return (verticalDirection != 0 && b(verticalDirection)) || (horizontalDirection != 0 && a(horizontalDirection));
    }

    private void d() {
        int i2;
        if (this.f۱۴۲۴f == null) {
            this.f۱۴۲۴f = new b();
        }
        this.q = true;
        this.o = true;
        if (this.n || (i2 = this.j) <= 0) {
            this.f۱۴۲۴f.run();
        } else {
            u.a(this.f۱۴۲۳e, this.f۱۴۲۴f, (long) i2);
        }
        this.n = true;
    }

    private void c() {
        if (this.o) {
            this.q = false;
        } else {
            this.f۱۴۲۱c.g();
        }
    }

    private float a(int direction, float coordinate, float srcSize, float dstSize) {
        float value = a(this.f۱۴۲۵g[direction], srcSize, this.f۱۴۲۶h[direction], coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.k[direction];
        float minimumVelocity = this.l[direction];
        float maximumVelocity = this.m[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return a(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -a((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    private float a(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = a(relativeValue * size, 0.0f, maxValue);
        float value = f(size - current, edgeSize) - f(current, edgeSize);
        if (value < 0.0f) {
            interpolated = -this.f۱۴۲۲d.getInterpolation(-value);
        } else if (value <= 0.0f) {
            return 0.0f;
        } else {
            interpolated = this.f۱۴۲۲d.getInterpolation(value);
        }
        return a(interpolated, -1.0f, 1.0f);
    }

    private float f(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i2 = this.i;
        if (i2 == 0 || i2 == 1) {
            if (current < leading) {
                if (current >= 0.0f) {
                    return 1.0f - (current / leading);
                }
                if (!this.q || this.i != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i2 == 2 && current < 0.0f) {
            return current / (-leading);
        }
        return 0.0f;
    }

    static int a(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    static float a(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f۱۴۲۳e.onTouchEvent(cancel);
        cancel.recycle();
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.q) {
                if (aVar.o) {
                    aVar.o = false;
                    aVar.f۱۴۲۱c.h();
                }
                C۰۰۳۳a scroller = a.this.f۱۴۲۱c;
                if (scroller.f() || !a.this.b()) {
                    a.this.q = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.p) {
                    aVar2.p = false;
                    aVar2.a();
                }
                scroller.a();
                a.this.a(scroller.b(), scroller.c());
                u.a(a.this.f۱۴۲۳e, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$a  reason: collision with other inner class name */
    public static class C۰۰۳۳a {

        /* renamed from: a  reason: collision with root package name */
        private int f۱۴۲۷a;

        /* renamed from: b  reason: collision with root package name */
        private int f۱۴۲۸b;

        /* renamed from: c  reason: collision with root package name */
        private float f۱۴۲۹c;

        /* renamed from: d  reason: collision with root package name */
        private float f۱۴۳۰d;

        /* renamed from: e  reason: collision with root package name */
        private long f۱۴۳۱e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f۱۴۳۲f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f۱۴۳۳g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f۱۴۳۴h = 0;
        private long i = -1;
        private float j;
        private int k;

        C۰۰۳۳a() {
        }

        public void b(int durationMillis) {
            this.f۱۴۲۷a = durationMillis;
        }

        public void a(int durationMillis) {
            this.f۱۴۲۸b = durationMillis;
        }

        public void h() {
            this.f۱۴۳۱e = AnimationUtils.currentAnimationTimeMillis();
            this.i = -1;
            this.f۱۴۳۲f = this.f۱۴۳۱e;
            this.j = 0.5f;
            this.f۱۴۳۳g = 0;
            this.f۱۴۳۴h = 0;
        }

        public void g() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.a((int) (currentTime - this.f۱۴۳۱e), 0, this.f۱۴۲۸b);
            this.j = a(currentTime);
            this.i = currentTime;
        }

        public boolean f() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        private float a(long currentTime) {
            if (currentTime < this.f۱۴۳۱e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || currentTime < j2) {
                return a.a(((float) (currentTime - this.f۱۴۳۱e)) / ((float) this.f۱۴۲۷a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.a(((float) (currentTime - j2)) / ((float) this.k), 0.0f, 1.0f));
        }

        private float a(float value) {
            return (-4.0f * value * value) + (4.0f * value);
        }

        public void a() {
            if (this.f۱۴۳۲f != 0) {
                long currentTime = AnimationUtils.currentAnimationTimeMillis();
                float scale = a(a(currentTime));
                long elapsedSinceDelta = currentTime - this.f۱۴۳۲f;
                this.f۱۴۳۲f = currentTime;
                this.f۱۴۳۳g = (int) (((float) elapsedSinceDelta) * scale * this.f۱۴۲۹c);
                this.f۱۴۳۴h = (int) (((float) elapsedSinceDelta) * scale * this.f۱۴۳۰d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void a(float x, float y) {
            this.f۱۴۲۹c = x;
            this.f۱۴۳۰d = y;
        }

        public int d() {
            float f2 = this.f۱۴۲۹c;
            return (int) (f2 / Math.abs(f2));
        }

        public int e() {
            float f2 = this.f۱۴۳۰d;
            return (int) (f2 / Math.abs(f2));
        }

        public int b() {
            return this.f۱۴۳۳g;
        }

        public int c() {
            return this.f۱۴۳۴h;
        }
    }
}
