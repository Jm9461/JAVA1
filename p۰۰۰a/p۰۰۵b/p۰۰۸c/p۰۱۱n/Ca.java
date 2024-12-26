package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd;

/* renamed from: a.b.c.n.a  reason: invalid class name */
public final class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static Animator m۱۰۰۰۰a(AbstractCd view, float centerX, float centerY, float endRadius) {
        Animator revealInfoAnimator = ObjectAnimator.ofObject(view, AbstractCd.Cc.f۸۳۰۹a, AbstractCd.Cb.f۸۳۰۷b, new AbstractCd.Ce(centerX, centerY, endRadius));
        if (Build.VERSION.SDK_INT < 21) {
            return revealInfoAnimator;
        }
        AbstractCd.Ce revealInfo = view.getRevealInfo();
        if (revealInfo != null) {
            Animator circularRevealAnimator = ViewAnimationUtils.createCircularReveal((View) view, (int) centerX, (int) centerY, revealInfo.f۸۳۱۳c, endRadius);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(revealInfoAnimator, circularRevealAnimator);
            return set;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a.b.c.n.a$a  reason: invalid class name */
    static class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCd f۸۳۰۴a;

        Ca(AbstractCd dVar) {
            this.f۸۳۰۴a = dVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f۸۳۰۴a.m۱۰۰۱۳a();
        }

        public void onAnimationEnd(Animator animation) {
            this.f۸۳۰۴a.m۱۰۰۱۴b();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Animator.AnimatorListener m۹۹۹۹a(AbstractCd view) {
        return new Ca(view);
    }
}
