package a.b.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;

public class d extends i0 {
    public d(int fadingMode) {
        a(fadingMode);
    }

    @Override // a.b.f.i0, a.b.f.m
    public void c(s transitionValues) {
        super.c(transitionValues);
        transitionValues.f۲۶۷a.put("android:fade:transitionAlpha", Float.valueOf(d0.c(transitionValues.f۲۶۸b)));
    }

    private Animator a(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        d0.a(view, startAlpha);
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, d0.f۱۹۷d, endAlpha);
        anim.addListener(new b(view));
        a(new a(this, view));
        return anim;
    }

    /* access modifiers changed from: package-private */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۱۹۱a;

        a(d this$0, View view) {
            this.f۱۹۱a = view;
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
            d0.a(this.f۱۹۱a, 1.0f);
            d0.a(this.f۱۹۱a);
            transition.b(this);
        }
    }

    @Override // a.b.f.i0
    public Animator a(ViewGroup sceneRoot, View view, s startValues, s endValues) {
        float startAlpha = a(startValues, 0.0f);
        if (startAlpha == 1.0f) {
            startAlpha = 0.0f;
        }
        return a(view, startAlpha, 1.0f);
    }

    @Override // a.b.f.i0
    public Animator b(ViewGroup sceneRoot, View view, s startValues, s endValues) {
        d0.e(view);
        return a(view, a(startValues, 1.0f), 0.0f);
    }

    private static float a(s startValues, float fallbackValue) {
        Float startAlphaFloat;
        if (startValues == null || (startAlphaFloat = (Float) startValues.f۲۶۷a.get("android:fade:transitionAlpha")) == null) {
            return fallbackValue;
        }
        return startAlphaFloat.floatValue();
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f۱۹۲a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f۱۹۳b = false;

        b(View view) {
            this.f۱۹۲a = view;
        }

        public void onAnimationStart(Animator animation) {
            if (u.v(this.f۱۹۲a) && this.f۱۹۲a.getLayerType() == 0) {
                this.f۱۹۳b = true;
                this.f۱۹۲a.setLayerType(2, null);
            }
        }

        public void onAnimationEnd(Animator animation) {
            d0.a(this.f۱۹۲a, 1.0f);
            if (this.f۱۹۳b) {
                this.f۱۹۲a.setLayerType(0, null);
            }
        }
    }
}
