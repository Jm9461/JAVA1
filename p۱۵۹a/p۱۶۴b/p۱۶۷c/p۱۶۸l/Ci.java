package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: a.b.c.l.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci {

    /* renamed from: a, reason: contains not printable characters */
    private long f۸۲۶۵a;

    /* renamed from: b, reason: contains not printable characters */
    private long f۸۲۶۶b;

    /* renamed from: c, reason: contains not printable characters */
    private TimeInterpolator f۸۲۶۷c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۸۲۶۸d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۸۲۶۹e;

    public Ci(long delay, long duration) {
        this.f۸۲۶۵a = 0L;
        this.f۸۲۶۶b = 300L;
        this.f۸۲۶۷c = null;
        this.f۸۲۶۸d = 0;
        this.f۸۲۶۹e = 1;
        this.f۸۲۶۵a = delay;
        this.f۸۲۶۶b = duration;
    }

    public Ci(long delay, long duration, TimeInterpolator interpolator) {
        this.f۸۲۶۵a = 0L;
        this.f۸۲۶۶b = 300L;
        this.f۸۲۶۷c = null;
        this.f۸۲۶۸d = 0;
        this.f۸۲۶۹e = 1;
        this.f۸۲۶۵a = delay;
        this.f۸۲۶۶b = duration;
        this.f۸۲۶۷c = interpolator;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۷۸۹۹a(Animator animator) {
        animator.setStartDelay(m۷۸۹۸a());
        animator.setDuration(m۷۹۰۰b());
        animator.setInterpolator(m۷۹۰۱c());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(m۷۹۰۲d());
            ((ValueAnimator) animator).setRepeatMode(m۷۹۰۳e());
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public long m۷۸۹۸a() {
        return this.f۸۲۶۵a;
    }

    /* renamed from: b, reason: contains not printable characters */
    public long m۷۹۰۰b() {
        return this.f۸۲۶۶b;
    }

    /* renamed from: c, reason: contains not printable characters */
    public TimeInterpolator m۷۹۰۱c() {
        TimeInterpolator timeInterpolator = this.f۸۲۶۷c;
        return timeInterpolator != null ? timeInterpolator : Ca.f۸۲۵۲b;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۷۹۰۲d() {
        return this.f۸۲۶۸d;
    }

    /* renamed from: e, reason: contains not printable characters */
    public int m۷۹۰۳e() {
        return this.f۸۲۶۹e;
    }

    /* renamed from: a, reason: contains not printable characters */
    static Ci m۷۸۹۶a(ValueAnimator animator) {
        Ci timing = new Ci(animator.getStartDelay(), animator.getDuration(), m۷۸۹۷b(animator));
        timing.f۸۲۶۸d = animator.getRepeatCount();
        timing.f۸۲۶۹e = animator.getRepeatMode();
        return timing;
    }

    /* renamed from: b, reason: contains not printable characters */
    private static TimeInterpolator m۷۸۹۷b(ValueAnimator animator) {
        TimeInterpolator interpolator = animator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return Ca.f۸۲۵۲b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return Ca.f۸۲۵۳c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return Ca.f۸۲۵۴d;
        }
        return interpolator;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ci that = (Ci) o;
        if (m۷۸۹۸a() != that.m۷۸۹۸a() || m۷۹۰۰b() != that.m۷۹۰۰b() || m۷۹۰۲d() != that.m۷۹۰۲d() || m۷۹۰۳e() != that.m۷۹۰۳e()) {
            return false;
        }
        return m۷۹۰۱c().getClass().equals(that.m۷۹۰۱c().getClass());
    }

    public int hashCode() {
        int result = (int) (m۷۸۹۸a() ^ (m۷۸۹۸a() >>> 32));
        return (((((((result * 31) + ((int) (m۷۹۰۰b() ^ (m۷۹۰۰b() >>> 32)))) * 31) + m۷۹۰۱c().getClass().hashCode()) * 31) + m۷۹۰۲d()) * 31) + m۷۹۰۳e();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m۷۸۹۸a() + " duration: " + m۷۹۰۰b() + " interpolator: " + m۷۹۰۱c().getClass() + " repeatCount: " + m۷۹۰۲d() + " repeatMode: " + m۷۹۰۳e() + "}\n";
    }
}
