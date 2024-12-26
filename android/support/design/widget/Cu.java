package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.u  reason: invalid class name */
public final class Cu {

    /* renamed from: a  reason: contains not printable characters */
    private final ArrayList<Cb> f۱۰۰۴۵a = new ArrayList<>();

    /* renamed from: b  reason: contains not printable characters */
    private Cb f۱۰۰۴۶b = null;

    /* renamed from: c  reason: contains not printable characters */
    ValueAnimator f۱۰۰۴۷c = null;

    /* renamed from: d  reason: contains not printable characters */
    private final Animator.AnimatorListener f۱۰۰۴۸d = new Ca();

    /* renamed from: android.support.design.widget.u$a  reason: invalid class name */
    class Ca extends AnimatorListenerAdapter {
        Ca() {
        }

        public void onAnimationEnd(Animator animator) {
            Cu uVar = Cu.this;
            if (uVar.f۱۰۰۴۷c == animator) {
                uVar.f۱۰۰۴۷c = null;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۳۰a(int[] specs, ValueAnimator animator) {
        Cb tuple = new Cb(specs, animator);
        animator.addListener(this.f۱۰۰۴۸d);
        this.f۱۰۰۴۵a.add(tuple);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۲۹a(int[] state) {
        Cb match = null;
        int count = this.f۱۰۰۴۵a.size();
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            Cb tuple = this.f۱۰۰۴۵a.get(i);
            if (StateSet.stateSetMatches(tuple.f۱۰۰۵۰a, state)) {
                match = tuple;
                break;
            }
            i++;
        }
        Cb bVar = this.f۱۰۰۴۶b;
        if (match != bVar) {
            if (bVar != null) {
                m۱۲۰۲۷b();
            }
            this.f۱۰۰۴۶b = match;
            if (match != null) {
                m۱۲۰۲۶a(match);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۰۲۶a(Cb match) {
        this.f۱۰۰۴۷c = match.f۱۰۰۵۱b;
        this.f۱۰۰۴۷c.start();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۲۰۲۷b() {
        ValueAnimator valueAnimator = this.f۱۰۰۴۷c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f۱۰۰۴۷c = null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۲۸a() {
        ValueAnimator valueAnimator = this.f۱۰۰۴۷c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f۱۰۰۴۷c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.u$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        final int[] f۱۰۰۵۰a;

        /* renamed from: b  reason: contains not printable characters */
        final ValueAnimator f۱۰۰۵۱b;

        Cb(int[] specs, ValueAnimator animator) {
            this.f۱۰۰۵۰a = specs;
            this.f۱۰۰۵۱b = animator;
        }
    }
}
