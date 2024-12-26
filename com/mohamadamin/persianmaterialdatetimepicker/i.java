package com.mohamadamin.persianmaterialdatetimepicker;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.j.d;

public class i {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 16;
    }

    @SuppressLint({"NewApi"})
    public static void a(View view, CharSequence text) {
        if (a() && view != null && text != null) {
            view.announceForAccessibility(text);
        }
    }

    public static int a(int month, int year) {
        if (month < 6) {
            return 31;
        }
        if (month >= 11 && !d.a(year)) {
            return 29;
        }
        return 30;
    }

    public static ObjectAnimator a(View labelToAnimate, float decreaseRatio, float increaseRatio) {
        Keyframe k0 = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe k1 = Keyframe.ofFloat(0.275f, decreaseRatio);
        Keyframe k2 = Keyframe.ofFloat(0.69f, increaseRatio);
        Keyframe k3 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator pulseAnimator = ObjectAnimator.ofPropertyValuesHolder(labelToAnimate, PropertyValuesHolder.ofKeyframe("scaleX", k0, k1, k2, k3), PropertyValuesHolder.ofKeyframe("scaleY", k0, k1, k2, k3));
        pulseAnimator.setDuration(544L);
        return pulseAnimator;
    }
}
