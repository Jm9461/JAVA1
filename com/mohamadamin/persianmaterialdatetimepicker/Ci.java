package com.mohamadamin.persianmaterialdatetimepicker;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cd;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.i  reason: invalid class name */
public class Ci {
    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۷۹۹۷a() {
        return Build.VERSION.SDK_INT >= 16;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۷۹۹۶a(View view, CharSequence text) {
        if (m۱۷۹۹۷a() && view != null && text != null) {
            view.announceForAccessibility(text);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۷۹۹۴a(int month, int year) {
        if (month < 6) {
            return 31;
        }
        if (month >= 11 && !Cd.m۱۸۰۱۷a(year)) {
            return 29;
        }
        return 30;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ObjectAnimator m۱۷۹۹۵a(View labelToAnimate, float decreaseRatio, float increaseRatio) {
        Keyframe k0 = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe k1 = Keyframe.ofFloat(0.275f, decreaseRatio);
        Keyframe k2 = Keyframe.ofFloat(0.69f, increaseRatio);
        Keyframe k3 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator pulseAnimator = ObjectAnimator.ofPropertyValuesHolder(labelToAnimate, PropertyValuesHolder.ofKeyframe("scaleX", k0, k1, k2, k3), PropertyValuesHolder.ofKeyframe("scaleY", k0, k1, k2, k3));
        pulseAnimator.setDuration(544L);
        return pulseAnimator;
    }
}
