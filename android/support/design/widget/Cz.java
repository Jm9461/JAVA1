package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.internal.Cg;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb;

/* renamed from: android.support.design.widget.z  reason: invalid class name */
class Cz {

    /* renamed from: a  reason: contains not printable characters */
    private static final int[] f۱۰۰۶۳a = {16843848};

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۲۰۴۰a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۲۰۴۲a(View view, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Context context = view.getContext();
        TypedArray a = Cg.m۱۱۳۶۰c(context, attrs, f۱۰۰۶۳a, defStyleAttr, defStyleRes, new int[0]);
        try {
            if (a.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, a.getResourceId(0, 0)));
            }
        } finally {
            a.recycle();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۲۰۴۱a(View view, float elevation) {
        int dur = view.getResources().getInteger(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cg.app_bar_elevation_anim_duration);
        StateListAnimator sla = new StateListAnimator();
        sla.addState(new int[]{16842766, Cb.state_liftable, -Cb.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration((long) dur));
        sla.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", elevation).setDuration((long) dur));
        sla.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(sla);
    }
}
