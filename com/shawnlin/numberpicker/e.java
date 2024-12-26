package com.shawnlin.numberpicker;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class e {
    private static final float[] A = new float[101];
    private static float B = 8.0f;
    private static float C;
    private static float w = ((float) (Math.log(0.75d) / Math.log(0.9d)));
    private static float x = 800.0f;
    private static float y = 0.4f;
    private static float z = (1.0f - y);

    /* renamed from: a  reason: collision with root package name */
    private int f۳۴۸۴a;

    /* renamed from: b  reason: collision with root package name */
    private int f۳۴۸۵b;

    /* renamed from: c  reason: collision with root package name */
    private int f۳۴۸۶c;

    /* renamed from: d  reason: collision with root package name */
    private int f۳۴۸۷d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۴۸۸e;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۴۸۹f;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۴۹۰g;

    /* renamed from: h  reason: collision with root package name */
    private int f۳۴۹۱h;
    private int i;
    private int j;
    private int k;
    private long l;
    private int m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private Interpolator r;
    private boolean s;
    private float t;
    private float u;
    private final float v;

    static {
        float x2;
        float coef;
        float x_min = 0.0f;
        for (int i2 = 0; i2 <= 100; i2++) {
            float t2 = ((float) i2) / 100.0f;
            float x_max = 1.0f;
            while (true) {
                x2 = ((x_max - x_min) / 2.0f) + x_min;
                coef = 3.0f * x2 * (1.0f - x2);
                float tx = ((((1.0f - x2) * y) + (z * x2)) * coef) + (x2 * x2 * x2);
                if (((double) Math.abs(tx - t2)) < 1.0E-5d) {
                    break;
                } else if (tx > t2) {
                    x_max = x2;
                } else {
                    x_min = x2;
                }
            }
            A[i2] = (x2 * x2 * x2) + coef;
        }
        A[100] = 1.0f;
        C = 1.0f;
        C = 1.0f / b(1.0f);
    }

    public e(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public e(Context context, Interpolator interpolator, boolean flywheel) {
        this.q = true;
        this.r = interpolator;
        this.v = context.getResources().getDisplayMetrics().density * 160.0f;
        this.u = a(ViewConfiguration.getScrollFriction());
        this.s = flywheel;
    }

    private float a(float friction) {
        return this.v * 386.0878f * friction;
    }

    public final boolean i() {
        return this.q;
    }

    public final void a(boolean finished) {
        this.q = finished;
    }

    public final int c() {
        return this.j;
    }

    public final int d() {
        return this.k;
    }

    public float b() {
        return this.t - ((this.u * ((float) j())) / 2000.0f);
    }

    public final int g() {
        return this.f۳۴۸۵b;
    }

    public final int h() {
        return this.f۳۴۸۶c;
    }

    public final int e() {
        return this.f۳۴۸۷d;
    }

    public final int f() {
        return this.f۳۴۸۸e;
    }

    public boolean a() {
        float x2;
        if (this.q) {
            return false;
        }
        int timePassed = (int) (AnimationUtils.currentAnimationTimeMillis() - this.l);
        int i2 = this.m;
        if (timePassed < i2) {
            int i3 = this.f۳۴۸۴a;
            if (i3 == 0) {
                float x3 = ((float) timePassed) * this.n;
                Interpolator interpolator = this.r;
                if (interpolator == null) {
                    x2 = b(x3);
                } else {
                    x2 = interpolator.getInterpolation(x3);
                }
                this.j = this.f۳۴۸۵b + Math.round(this.o * x2);
                this.k = this.f۳۴۸۶c + Math.round(this.p * x2);
            } else if (i3 == 1) {
                float t2 = ((float) timePassed) / ((float) i2);
                int index = (int) (t2 * 100.0f);
                float t_inf = ((float) index) / 100.0f;
                float[] fArr = A;
                float d_inf = fArr[index];
                float distanceCoef = (((t2 - t_inf) / ((((float) (index + 1)) / 100.0f) - t_inf)) * (fArr[index + 1] - d_inf)) + d_inf;
                int i4 = this.f۳۴۸۵b;
                this.j = i4 + Math.round(((float) (this.f۳۴۸۷d - i4)) * distanceCoef);
                this.j = Math.min(this.j, this.f۳۴۹۰g);
                this.j = Math.max(this.j, this.f۳۴۸۹f);
                int i5 = this.f۳۴۸۶c;
                this.k = i5 + Math.round(((float) (this.f۳۴۸۸e - i5)) * distanceCoef);
                this.k = Math.min(this.k, this.i);
                this.k = Math.max(this.k, this.f۳۴۹۱h);
                if (this.j == this.f۳۴۸۷d && this.k == this.f۳۴۸۸e) {
                    this.q = true;
                }
            }
        } else {
            this.j = this.f۳۴۸۷d;
            this.k = this.f۳۴۸۸e;
            this.q = true;
        }
        return true;
    }

    public void a(int startX, int startY, int dx, int dy, int duration) {
        this.f۳۴۸۴a = 0;
        this.q = false;
        this.m = duration;
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.f۳۴۸۵b = startX;
        this.f۳۴۸۶c = startY;
        this.f۳۴۸۷d = startX + dx;
        this.f۳۴۸۸e = startY + dy;
        this.o = (float) dx;
        this.p = (float) dy;
        this.n = 1.0f / ((float) this.m);
    }

    public void a(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) {
        int velocityX2 = velocityX;
        int velocityY2 = velocityY;
        if (this.s && !this.q) {
            float oldVel = b();
            float dx = (float) (this.f۳۴۸۷d - this.f۳۴۸۵b);
            float dy = (float) (this.f۳۴۸۸e - this.f۳۴۸۶c);
            float hyp = (float) Math.sqrt((double) ((dx * dx) + (dy * dy)));
            float oldVelocityX = (dx / hyp) * oldVel;
            float oldVelocityY = (dy / hyp) * oldVel;
            if (Math.signum((float) velocityX2) == Math.signum(oldVelocityX) && Math.signum((float) velocityY2) == Math.signum(oldVelocityY)) {
                velocityX2 = (int) (((float) velocityX2) + oldVelocityX);
                velocityY2 = (int) (((float) velocityY2) + oldVelocityY);
            }
        }
        this.f۳۴۸۴a = 1;
        this.q = false;
        float velocity = (float) Math.sqrt((double) ((velocityX2 * velocityX2) + (velocityY2 * velocityY2)));
        this.t = velocity;
        double l2 = Math.log((double) ((y * velocity) / x));
        double d2 = (double) w;
        Double.isNaN(d2);
        this.m = (int) (Math.exp(l2 / (d2 - 1.0d)) * 1000.0d);
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.f۳۴۸۵b = startX;
        this.f۳۴۸۶c = startY;
        float coeffY = 1.0f;
        float coeffX = velocity == 0.0f ? 1.0f : ((float) velocityX2) / velocity;
        if (velocity != 0.0f) {
            coeffY = ((float) velocityY2) / velocity;
        }
        double d3 = (double) x;
        float f2 = w;
        double d4 = (double) f2;
        double d5 = (double) f2;
        Double.isNaN(d5);
        Double.isNaN(d4);
        double exp = Math.exp((d4 / (d5 - 1.0d)) * l2);
        Double.isNaN(d3);
        int totalDistance = (int) (d3 * exp);
        this.f۳۴۸۹f = minX;
        this.f۳۴۹۰g = maxX;
        this.f۳۴۹۱h = minY;
        this.i = maxY;
        this.f۳۴۸۷d = Math.round(((float) totalDistance) * coeffX) + startX;
        this.f۳۴۸۷d = Math.min(this.f۳۴۸۷d, this.f۳۴۹۰g);
        this.f۳۴۸۷d = Math.max(this.f۳۴۸۷d, this.f۳۴۸۹f);
        this.f۳۴۸۸e = Math.round(((float) totalDistance) * coeffY) + startY;
        this.f۳۴۸۸e = Math.min(this.f۳۴۸۸e, this.i);
        this.f۳۴۸۸e = Math.max(this.f۳۴۸۸e, this.f۳۴۹۱h);
    }

    static float b(float x2) {
        float x3;
        float x4 = x2 * B;
        if (x4 < 1.0f) {
            x3 = x4 - (1.0f - ((float) Math.exp((double) (-x4))));
        } else {
            x3 = 0.36787945f + ((1.0f - 0.36787945f) * (1.0f - ((float) Math.exp((double) (1.0f - x4)))));
        }
        return x3 * C;
    }

    public int j() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.l);
    }
}
