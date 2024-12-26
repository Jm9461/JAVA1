package com.shawnlin.numberpicker;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: com.shawnlin.numberpicker.e  reason: invalid class name */
public class Ce {

    /* renamed from: A  reason: contains not printable characters */
    private static final float[] f۱۵۳۱۶A = new float[101];

    /* renamed from: B  reason: contains not printable characters */
    private static float f۱۵۳۱۷B = 8.0f;

    /* renamed from: C  reason: contains not printable characters */
    private static float f۱۵۳۱۸C;

    /* renamed from: w  reason: contains not printable characters */
    private static float f۱۵۳۱۹w = ((float) (Math.log(0.75d) / Math.log(0.9d)));

    /* renamed from: x  reason: contains not printable characters */
    private static float f۱۵۳۲۰x = 800.0f;

    /* renamed from: y  reason: contains not printable characters */
    private static float f۱۵۳۲۱y = 0.4f;

    /* renamed from: z  reason: contains not printable characters */
    private static float f۱۵۳۲۲z = (1.0f - f۱۵۳۲۱y);

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۵۳۲۳a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۵۳۲۴b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۵۳۲۵c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۵۳۲۶d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۵۳۲۷e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۳۲۸f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۳۲۹g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۵۳۳۰h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۳۳۱i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۵۳۳۲j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۵۳۳۳k;

    /* renamed from: l  reason: contains not printable characters */
    private long f۱۵۳۳۴l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۵۳۳۵m;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۵۳۳۶n;

    /* renamed from: o  reason: contains not printable characters */
    private float f۱۵۳۳۷o;

    /* renamed from: p  reason: contains not printable characters */
    private float f۱۵۳۳۸p;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۱۵۳۳۹q;

    /* renamed from: r  reason: contains not printable characters */
    private Interpolator f۱۵۳۴۰r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۵۳۴۱s;

    /* renamed from: t  reason: contains not printable characters */
    private float f۱۵۳۴۲t;

    /* renamed from: u  reason: contains not printable characters */
    private float f۱۵۳۴۳u;

    /* renamed from: v  reason: contains not printable characters */
    private final float f۱۵۳۴۴v;

    static {
        float x;
        float coef;
        float x_min = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float t = ((float) i) / 100.0f;
            float x_max = 1.0f;
            while (true) {
                x = ((x_max - x_min) / 2.0f) + x_min;
                coef = 3.0f * x * (1.0f - x);
                float tx = ((((1.0f - x) * f۱۵۳۲۱y) + (f۱۵۳۲۲z * x)) * coef) + (x * x * x);
                if (((double) Math.abs(tx - t)) < 1.0E-5d) {
                    break;
                } else if (tx > t) {
                    x_max = x;
                } else {
                    x_min = x;
                }
            }
            f۱۵۳۱۶A[i] = (x * x * x) + coef;
        }
        f۱۵۳۱۶A[100] = 1.0f;
        f۱۵۳۱۸C = 1.0f;
        f۱۵۳۱۸C = 1.0f / m۱۸۲۲۹b(1.0f);
    }

    public Ce(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public Ce(Context context, Interpolator interpolator, boolean flywheel) {
        this.f۱۵۳۳۹q = true;
        this.f۱۵۳۴۰r = interpolator;
        this.f۱۵۳۴۴v = context.getResources().getDisplayMetrics().density * 160.0f;
        this.f۱۵۳۴۳u = m۱۸۲۲۸a(ViewConfiguration.getScrollFriction());
        this.f۱۵۳۴۱s = flywheel;
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۸۲۲۸a(float friction) {
        return this.f۱۵۳۴۴v * 386.0878f * friction;
    }

    /* renamed from: i  reason: contains not printable characters */
    public final boolean m۱۸۲۴۱i() {
        return this.f۱۵۳۳۹q;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۸۲۳۲a(boolean finished) {
        this.f۱۵۳۳۹q = finished;
    }

    /* renamed from: c  reason: contains not printable characters */
    public final int m۱۸۲۳۵c() {
        return this.f۱۵۳۳۲j;
    }

    /* renamed from: d  reason: contains not printable characters */
    public final int m۱۸۲۳۶d() {
        return this.f۱۵۳۳۳k;
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۸۲۳۴b() {
        return this.f۱۵۳۴۲t - ((this.f۱۵۳۴۳u * ((float) m۱۸۲۴۲j())) / 2000.0f);
    }

    /* renamed from: g  reason: contains not printable characters */
    public final int m۱۸۲۳۹g() {
        return this.f۱۵۳۲۴b;
    }

    /* renamed from: h  reason: contains not printable characters */
    public final int m۱۸۲۴۰h() {
        return this.f۱۵۳۲۵c;
    }

    /* renamed from: e  reason: contains not printable characters */
    public final int m۱۸۲۳۷e() {
        return this.f۱۵۳۲۶d;
    }

    /* renamed from: f  reason: contains not printable characters */
    public final int m۱۸۲۳۸f() {
        return this.f۱۵۳۲۷e;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۲۳۳a() {
        float x;
        if (this.f۱۵۳۳۹q) {
            return false;
        }
        int timePassed = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f۱۵۳۳۴l);
        int i = this.f۱۵۳۳۵m;
        if (timePassed < i) {
            int i2 = this.f۱۵۳۲۳a;
            if (i2 == 0) {
                float x2 = ((float) timePassed) * this.f۱۵۳۳۶n;
                Interpolator interpolator = this.f۱۵۳۴۰r;
                if (interpolator == null) {
                    x = m۱۸۲۲۹b(x2);
                } else {
                    x = interpolator.getInterpolation(x2);
                }
                this.f۱۵۳۳۲j = this.f۱۵۳۲۴b + Math.round(this.f۱۵۳۳۷o * x);
                this.f۱۵۳۳۳k = this.f۱۵۳۲۵c + Math.round(this.f۱۵۳۳۸p * x);
            } else if (i2 == 1) {
                float t = ((float) timePassed) / ((float) i);
                int index = (int) (t * 100.0f);
                float t_inf = ((float) index) / 100.0f;
                float[] fArr = f۱۵۳۱۶A;
                float d_inf = fArr[index];
                float distanceCoef = (((t - t_inf) / ((((float) (index + 1)) / 100.0f) - t_inf)) * (fArr[index + 1] - d_inf)) + d_inf;
                int i3 = this.f۱۵۳۲۴b;
                this.f۱۵۳۳۲j = i3 + Math.round(((float) (this.f۱۵۳۲۶d - i3)) * distanceCoef);
                this.f۱۵۳۳۲j = Math.min(this.f۱۵۳۳۲j, this.f۱۵۳۲۹g);
                this.f۱۵۳۳۲j = Math.max(this.f۱۵۳۳۲j, this.f۱۵۳۲۸f);
                int i4 = this.f۱۵۳۲۵c;
                this.f۱۵۳۳۳k = i4 + Math.round(((float) (this.f۱۵۳۲۷e - i4)) * distanceCoef);
                this.f۱۵۳۳۳k = Math.min(this.f۱۵۳۳۳k, this.f۱۵۳۳۱i);
                this.f۱۵۳۳۳k = Math.max(this.f۱۵۳۳۳k, this.f۱۵۳۳۰h);
                if (this.f۱۵۳۳۲j == this.f۱۵۳۲۶d && this.f۱۵۳۳۳k == this.f۱۵۳۲۷e) {
                    this.f۱۵۳۳۹q = true;
                }
            }
        } else {
            this.f۱۵۳۳۲j = this.f۱۵۳۲۶d;
            this.f۱۵۳۳۳k = this.f۱۵۳۲۷e;
            this.f۱۵۳۳۹q = true;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۳۰a(int startX, int startY, int dx, int dy, int duration) {
        this.f۱۵۳۲۳a = 0;
        this.f۱۵۳۳۹q = false;
        this.f۱۵۳۳۵m = duration;
        this.f۱۵۳۳۴l = AnimationUtils.currentAnimationTimeMillis();
        this.f۱۵۳۲۴b = startX;
        this.f۱۵۳۲۵c = startY;
        this.f۱۵۳۲۶d = startX + dx;
        this.f۱۵۳۲۷e = startY + dy;
        this.f۱۵۳۳۷o = (float) dx;
        this.f۱۵۳۳۸p = (float) dy;
        this.f۱۵۳۳۶n = 1.0f / ((float) this.f۱۵۳۳۵m);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۳۱a(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) {
        int velocityX2 = velocityX;
        int velocityY2 = velocityY;
        if (this.f۱۵۳۴۱s && !this.f۱۵۳۳۹q) {
            float oldVel = m۱۸۲۳۴b();
            float dx = (float) (this.f۱۵۳۲۶d - this.f۱۵۳۲۴b);
            float dy = (float) (this.f۱۵۳۲۷e - this.f۱۵۳۲۵c);
            float hyp = (float) Math.sqrt((double) ((dx * dx) + (dy * dy)));
            float oldVelocityX = (dx / hyp) * oldVel;
            float oldVelocityY = (dy / hyp) * oldVel;
            if (Math.signum((float) velocityX2) == Math.signum(oldVelocityX) && Math.signum((float) velocityY2) == Math.signum(oldVelocityY)) {
                velocityX2 = (int) (((float) velocityX2) + oldVelocityX);
                velocityY2 = (int) (((float) velocityY2) + oldVelocityY);
            }
        }
        this.f۱۵۳۲۳a = 1;
        this.f۱۵۳۳۹q = false;
        float velocity = (float) Math.sqrt((double) ((velocityX2 * velocityX2) + (velocityY2 * velocityY2)));
        this.f۱۵۳۴۲t = velocity;
        double l = Math.log((double) ((f۱۵۳۲۱y * velocity) / f۱۵۳۲۰x));
        double d = (double) f۱۵۳۱۹w;
        Double.isNaN(d);
        this.f۱۵۳۳۵m = (int) (Math.exp(l / (d - 1.0d)) * 1000.0d);
        this.f۱۵۳۳۴l = AnimationUtils.currentAnimationTimeMillis();
        this.f۱۵۳۲۴b = startX;
        this.f۱۵۳۲۵c = startY;
        float coeffY = 1.0f;
        float coeffX = velocity == 0.0f ? 1.0f : ((float) velocityX2) / velocity;
        if (velocity != 0.0f) {
            coeffY = ((float) velocityY2) / velocity;
        }
        double d2 = (double) f۱۵۳۲۰x;
        float f = f۱۵۳۱۹w;
        double d3 = (double) f;
        double d4 = (double) f;
        Double.isNaN(d4);
        Double.isNaN(d3);
        double exp = Math.exp((d3 / (d4 - 1.0d)) * l);
        Double.isNaN(d2);
        int totalDistance = (int) (d2 * exp);
        this.f۱۵۳۲۸f = minX;
        this.f۱۵۳۲۹g = maxX;
        this.f۱۵۳۳۰h = minY;
        this.f۱۵۳۳۱i = maxY;
        this.f۱۵۳۲۶d = Math.round(((float) totalDistance) * coeffX) + startX;
        this.f۱۵۳۲۶d = Math.min(this.f۱۵۳۲۶d, this.f۱۵۳۲۹g);
        this.f۱۵۳۲۶d = Math.max(this.f۱۵۳۲۶d, this.f۱۵۳۲۸f);
        this.f۱۵۳۲۷e = Math.round(((float) totalDistance) * coeffY) + startY;
        this.f۱۵۳۲۷e = Math.min(this.f۱۵۳۲۷e, this.f۱۵۳۳۱i);
        this.f۱۵۳۲۷e = Math.max(this.f۱۵۳۲۷e, this.f۱۵۳۳۰h);
    }

    /* renamed from: b  reason: contains not printable characters */
    static float m۱۸۲۲۹b(float x) {
        float x2;
        float x3 = x * f۱۵۳۱۷B;
        if (x3 < 1.0f) {
            x2 = x3 - (1.0f - ((float) Math.exp((double) (-x3))));
        } else {
            x2 = 0.36787945f + ((1.0f - 0.36787945f) * (1.0f - ((float) Math.exp((double) (1.0f - x3)))));
        }
        return x2 * f۱۵۳۱۸C;
    }

    /* renamed from: j  reason: contains not printable characters */
    public int m۱۸۲۴۲j() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.f۱۵۳۳۴l);
    }
}
