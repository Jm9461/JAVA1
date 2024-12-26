package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f۱۰۱۸a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f۱۰۱۹b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f۱۰۲۰c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f۱۰۲۱d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            u uVar = u.this;
            if (uVar.f۱۰۲۰c == animator) {
                uVar.f۱۰۲۰c = null;
            }
        }
    }

    public void a(int[] specs, ValueAnimator animator) {
        b tuple = new b(specs, animator);
        animator.addListener(this.f۱۰۲۱d);
        this.f۱۰۱۸a.add(tuple);
    }

    public void a(int[] state) {
        b match = null;
        int count = this.f۱۰۱۸a.size();
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            b tuple = this.f۱۰۱۸a.get(i);
            if (StateSet.stateSetMatches(tuple.f۱۰۲۳a, state)) {
                match = tuple;
                break;
            }
            i++;
        }
        b bVar = this.f۱۰۱۹b;
        if (match != bVar) {
            if (bVar != null) {
                b();
            }
            this.f۱۰۱۹b = match;
            if (match != null) {
                a(match);
            }
        }
    }

    private void a(b match) {
        this.f۱۰۲۰c = match.f۱۰۲۴b;
        this.f۱۰۲۰c.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f۱۰۲۰c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f۱۰۲۰c = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f۱۰۲۰c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f۱۰۲۰c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f۱۰۲۳a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f۱۰۲۴b;

        b(int[] specs, ValueAnimator animator) {
            this.f۱۰۲۳a = specs;
            this.f۱۰۲۴b = animator;
        }
    }
}
