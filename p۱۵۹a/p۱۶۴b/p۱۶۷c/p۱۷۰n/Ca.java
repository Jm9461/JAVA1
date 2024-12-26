package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd;

/* renamed from: a.b.c.n.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static Animator m۷۹۳۳a(InterfaceCd interfaceCd, float centerX, float centerY, float endRadius) {
        Animator revealInfoAnimator = ObjectAnimator.ofObject(interfaceCd, (Property<InterfaceCd, V>) InterfaceCd.c.f۸۳۰۹a, (TypeEvaluator) InterfaceCd.b.f۸۳۰۷b, (Object[]) new InterfaceCd.e[]{new InterfaceCd.e(centerX, centerY, endRadius)});
        if (Build.VERSION.SDK_INT >= 21) {
            InterfaceCd.e revealInfo = interfaceCd.getRevealInfo();
            if (revealInfo == null) {
                throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
            }
            float startRadius = revealInfo.f۸۳۱۳c;
            Animator circularRevealAnimator = ViewAnimationUtils.createCircularReveal((View) interfaceCd, (int) centerX, (int) centerY, startRadius, endRadius);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(revealInfoAnimator, circularRevealAnimator);
            return set;
        }
        return revealInfoAnimator;
    }

    /* renamed from: a.b.c.n.a$a */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ InterfaceCd f۸۳۰۴a;

        a(InterfaceCd interfaceCd) {
            this.f۸۳۰۴a = interfaceCd;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.f۸۳۰۴a.mo۷۹۵۴a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۸۳۰۴a.mo۷۹۵۵b();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Animator.AnimatorListener m۷۹۳۲a(InterfaceCd view) {
        return new a(view);
    }
}
