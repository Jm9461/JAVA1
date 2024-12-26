package a.b.c.n;

import a.b.c.n.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class a {
    public static Animator a(d view, float centerX, float centerY, float endRadius) {
        Animator revealInfoAnimator = ObjectAnimator.ofObject(view, d.c.f۶۱a, d.b.f۵۹b, new d.e(centerX, centerY, endRadius));
        if (Build.VERSION.SDK_INT < 21) {
            return revealInfoAnimator;
        }
        d.e revealInfo = view.getRevealInfo();
        if (revealInfo != null) {
            Animator circularRevealAnimator = ViewAnimationUtils.createCircularReveal((View) view, (int) centerX, (int) centerY, revealInfo.f۶۵c, endRadius);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(revealInfoAnimator, circularRevealAnimator);
            return set;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a.b.c.n.a$a  reason: collision with other inner class name */
    static class C۰۰۰۲a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f۵۶a;

        C۰۰۰۲a(d dVar) {
            this.f۵۶a = dVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f۵۶a.a();
        }

        public void onAnimationEnd(Animator animation) {
            this.f۵۶a.b();
        }
    }

    public static Animator.AnimatorListener a(d view) {
        return new C۰۰۰۲a(view);
    }
}
