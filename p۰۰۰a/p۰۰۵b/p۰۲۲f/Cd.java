package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.p۰۴۳v4.view.Cu;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.f.d  reason: invalid class name */
public class Cd extends AbstractCi0 {
    public Cd(int fadingMode) {
        m۱۰۲۸۰a(fadingMode);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCi0, p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۲۱۰c(Cs transitionValues) {
        super.m۱۰۲۸۵c(transitionValues);
        transitionValues.f۸۶۳۰a.put("android:fade:transitionAlpha", Float.valueOf(Cd0.m۱۰۲۲۰c(transitionValues.f۸۶۳۱b)));
    }

    /* renamed from: a  reason: contains not printable characters */
    private Animator m۱۰۲۰۷a(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        Cd0.m۱۰۲۱۴a(view, startAlpha);
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, Cd0.f۸۵۲۳d, endAlpha);
        anim.addListener(new Cb(view));
        m۱۰۳۰۹a(new Ca(this, view));
        return anim;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.f.d$a  reason: invalid class name */
    public class Ca extends Cn {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۸۵۱۷a;

        Ca(Cd this$0, View view) {
            this.f۸۵۱۷a = view;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۲۱۱b(AbstractCm transition) {
            Cd0.m۱۰۲۱۴a(this.f۸۵۱۷a, 1.0f);
            Cd0.m۱۰۲۱۳a(this.f۸۵۱۷a);
            transition.m۱۰۳۲۸b(this);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCi0
    /* renamed from: a  reason: contains not printable characters */
    public Animator m۱۰۲۰۸a(ViewGroup sceneRoot, View view, Cs startValues, Cs endValues) {
        float startAlpha = m۱۰۲۰۶a(startValues, 0.0f);
        if (startAlpha == 1.0f) {
            startAlpha = 0.0f;
        }
        return m۱۰۲۰۷a(view, startAlpha, 1.0f);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCi0
    /* renamed from: b  reason: contains not printable characters */
    public Animator m۱۰۲۰۹b(ViewGroup sceneRoot, View view, Cs startValues, Cs endValues) {
        Cd0.m۱۰۲۲۲e(view);
        return m۱۰۲۰۷a(view, m۱۰۲۰۶a(startValues, 1.0f), 0.0f);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static float m۱۰۲۰۶a(Cs startValues, float fallbackValue) {
        Float startAlphaFloat;
        if (startValues == null || (startAlphaFloat = (Float) startValues.f۸۶۳۰a.get("android:fade:transitionAlpha")) == null) {
            return fallbackValue;
        }
        return startAlphaFloat.floatValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.f.d$b  reason: invalid class name */
    public static class Cb extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        private final View f۸۵۱۸a;

        /* renamed from: b  reason: contains not printable characters */
        private boolean f۸۵۱۹b = false;

        Cb(View view) {
            this.f۸۵۱۸a = view;
        }

        public void onAnimationStart(Animator animation) {
            if (Cu.m۱۳۰۲۵v(this.f۸۵۱۸a) && this.f۸۵۱۸a.getLayerType() == 0) {
                this.f۸۵۱۹b = true;
                this.f۸۵۱۸a.setLayerType(2, null);
            }
        }

        public void onAnimationEnd(Animator animation) {
            Cd0.m۱۰۲۱۴a(this.f۸۵۱۸a, 1.0f);
            if (this.f۸۵۱۹b) {
                this.f۸۵۱۸a.setLayerType(0, null);
            }
        }
    }
}
