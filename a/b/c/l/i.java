package a.b.c.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f۳۶a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f۳۷b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f۳۸c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f۳۹d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f۴۰e = 1;

    public i(long delay, long duration) {
        this.f۳۶a = delay;
        this.f۳۷b = duration;
    }

    public i(long delay, long duration, TimeInterpolator interpolator) {
        this.f۳۶a = delay;
        this.f۳۷b = duration;
        this.f۳۸c = interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(d());
            ((ValueAnimator) animator).setRepeatMode(e());
        }
    }

    public long a() {
        return this.f۳۶a;
    }

    public long b() {
        return this.f۳۷b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.f۳۸c;
        return timeInterpolator != null ? timeInterpolator : a.f۲۳b;
    }

    public int d() {
        return this.f۳۹d;
    }

    public int e() {
        return this.f۴۰e;
    }

    static i a(ValueAnimator animator) {
        i timing = new i(animator.getStartDelay(), animator.getDuration(), b(animator));
        timing.f۳۹d = animator.getRepeatCount();
        timing.f۴۰e = animator.getRepeatMode();
        return timing;
    }

    private static TimeInterpolator b(ValueAnimator animator) {
        TimeInterpolator interpolator = animator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f۲۳b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f۲۴c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return a.f۲۵d;
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
        i that = (i) o;
        if (a() == that.a() && b() == that.b() && d() == that.d() && e() == that.e()) {
            return c().getClass().equals(that.c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
