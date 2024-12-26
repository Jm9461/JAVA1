package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: a.b.c.l.i  reason: invalid class name */
public class Ci {

    /* renamed from: a  reason: contains not printable characters */
    private long f۸۲۶۵a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private long f۸۲۶۶b = 300;

    /* renamed from: c  reason: contains not printable characters */
    private TimeInterpolator f۸۲۶۷c = null;

    /* renamed from: d  reason: contains not printable characters */
    private int f۸۲۶۸d = 0;

    /* renamed from: e  reason: contains not printable characters */
    private int f۸۲۶۹e = 1;

    public Ci(long delay, long duration) {
        this.f۸۲۶۵a = delay;
        this.f۸۲۶۶b = duration;
    }

    public Ci(long delay, long duration, TimeInterpolator interpolator) {
        this.f۸۲۶۵a = delay;
        this.f۸۲۶۶b = duration;
        this.f۸۲۶۷c = interpolator;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۶۶a(Animator animator) {
        animator.setStartDelay(m۹۹۶۵a());
        animator.setDuration(m۹۹۶۷b());
        animator.setInterpolator(m۹۹۶۸c());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(m۹۹۶۹d());
            ((ValueAnimator) animator).setRepeatMode(m۹۹۷۰e());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۹۹۶۵a() {
        return this.f۸۲۶۵a;
    }

    /* renamed from: b  reason: contains not printable characters */
    public long m۹۹۶۷b() {
        return this.f۸۲۶۶b;
    }

    /* renamed from: c  reason: contains not printable characters */
    public TimeInterpolator m۹۹۶۸c() {
        TimeInterpolator timeInterpolator = this.f۸۲۶۷c;
        return timeInterpolator != null ? timeInterpolator : Ca.f۸۲۵۲b;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۹۹۶۹d() {
        return this.f۸۲۶۸d;
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۹۹۷۰e() {
        return this.f۸۲۶۹e;
    }

    /* renamed from: a  reason: contains not printable characters */
    static Ci m۹۹۶۳a(ValueAnimator animator) {
        Ci timing = new Ci(animator.getStartDelay(), animator.getDuration(), m۹۹۶۴b(animator));
        timing.f۸۲۶۸d = animator.getRepeatCount();
        timing.f۸۲۶۹e = animator.getRepeatMode();
        return timing;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static TimeInterpolator m۹۹۶۴b(ValueAnimator animator) {
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
        if (m۹۹۶۵a() == that.m۹۹۶۵a() && m۹۹۶۷b() == that.m۹۹۶۷b() && m۹۹۶۹d() == that.m۹۹۶۹d() && m۹۹۷۰e() == that.m۹۹۷۰e()) {
            return m۹۹۶۸c().getClass().equals(that.m۹۹۶۸c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (m۹۹۶۵a() ^ (m۹۹۶۵a() >>> 32))) * 31) + ((int) (m۹۹۶۷b() ^ (m۹۹۶۷b() >>> 32)))) * 31) + m۹۹۶۸c().getClass().hashCode()) * 31) + m۹۹۶۹d()) * 31) + m۹۹۷۰e();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m۹۹۶۵a() + " duration: " + m۹۹۶۷b() + " interpolator: " + m۹۹۶۸c().getClass() + " repeatCount: " + m۹۹۶۹d() + " repeatMode: " + m۹۹۷۰e() + "}\n";
    }
}
