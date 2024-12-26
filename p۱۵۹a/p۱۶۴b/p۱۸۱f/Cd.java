package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v4.view.Cu;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.f.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd extends AbstractCi0 {
    public Cd(int fadingMode) {
        m۸۲۱۳a(fadingMode);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCi0, p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۳۲۳c(Cs transitionValues) {
        super.mo۸۳۲۳c(transitionValues);
        transitionValues.f۸۶۳۰a.put("android:fade:transitionAlpha", Float.valueOf(Cd0.m۸۱۵۳c(transitionValues.f۸۶۳۱b)));
    }

    /* renamed from: a, reason: contains not printable characters */
    private Animator m۸۱۴۰a(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        Cd0.m۸۱۴۷a(view, startAlpha);
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, Cd0.f۸۵۲۳d, endAlpha);
        b listener = new b(view);
        anim.addListener(listener);
        mo۸۳۰۷a(new a(this, view));
        return anim;
    }

    /* renamed from: a.b.f.d$a */
    class a extends Cn {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ View f۸۵۱۷a;

        a(Cd this$0, View view) {
            this.f۸۵۱۷a = view;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
            Cd0.m۸۱۴۷a(this.f۸۵۱۷a, 1.0f);
            Cd0.m۸۱۴۶a(this.f۸۵۱۷a);
            transition.mo۸۳۲۱b(this);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCi0
    /* renamed from: a, reason: contains not printable characters */
    public Animator mo۸۲۱۲a(ViewGroup sceneRoot, View view, Cs startValues, Cs endValues) {
        float startAlpha = m۸۱۳۹a(startValues, 0.0f);
        if (startAlpha == 1.0f) {
            startAlpha = 0.0f;
        }
        return m۸۱۴۰a(view, startAlpha, 1.0f);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCi0
    /* renamed from: b, reason: contains not printable characters */
    public Animator mo۸۲۱۷b(ViewGroup sceneRoot, View view, Cs startValues, Cs endValues) {
        Cd0.m۸۱۵۵e(view);
        float startAlpha = m۸۱۳۹a(startValues, 1.0f);
        return m۸۱۴۰a(view, startAlpha, 0.0f);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static float m۸۱۳۹a(Cs startValues, float fallbackValue) {
        Float startAlphaFloat;
        if (startValues == null || (startAlphaFloat = (Float) startValues.f۸۶۳۰a.get("android:fade:transitionAlpha")) == null) {
            return fallbackValue;
        }
        float startAlpha = startAlphaFloat.floatValue();
        return startAlpha;
    }

    /* renamed from: a.b.f.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        private final View f۸۵۱۸a;

        /* renamed from: b, reason: contains not printable characters */
        private boolean f۸۵۱۹b = false;

        b(View view) {
            this.f۸۵۱۸a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            if (Cu.m۱۰۹۵۵v(this.f۸۵۱۸a) && this.f۸۵۱۸a.getLayerType() == 0) {
                this.f۸۵۱۹b = true;
                this.f۸۵۱۸a.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Cd0.m۸۱۴۷a(this.f۸۵۱۸a, 1.0f);
            if (this.f۸۵۱۹b) {
                this.f۸۵۱۸a.setLayerType(0, null);
            }
        }
    }
}
