package android.support.design.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractCc<V> {

    /* renamed from: a  reason: contains not printable characters */
    private int f۹۴۴۳a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private int f۹۴۴۴b = 2;

    /* renamed from: c  reason: contains not printable characters */
    private ViewPropertyAnimator f۹۴۴۵c;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۲۴۸a(CoordinatorLayout parent, V child, int layoutDirection) {
        this.f۹۴۴۳a = child.getMeasuredHeight();
        return super.m۱۱۵۷۱a(parent, child, layoutDirection);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۲۵۰b(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۴۶a(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        if (this.f۹۴۴۴b != 1 && dyConsumed > 0) {
            m۱۱۲۴۷a(child);
        } else if (this.f۹۴۴۴b != 2 && dyConsumed < 0) {
            m۱۱۲۴۹b(child);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۴۹b(V child) {
        ViewPropertyAnimator viewPropertyAnimator = this.f۹۴۴۵c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            child.clearAnimation();
        }
        this.f۹۴۴۴b = 2;
        m۱۱۲۴۵a(child, 0, 225, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۴d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۴۷a(V child) {
        ViewPropertyAnimator viewPropertyAnimator = this.f۹۴۴۵c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            child.clearAnimation();
        }
        this.f۹۴۴۴b = 1;
        m۱۱۲۴۵a(child, this.f۹۴۴۳a, 175, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۳c);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۲۴۵a(V child, int targetY, long duration, TimeInterpolator interpolator) {
        this.f۹۴۴۵c = child.animate().translationY((float) targetY).setInterpolator(interpolator).setDuration(duration).setListener(new Ca());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.behavior.HideBottomViewOnScrollBehavior$a  reason: invalid class name */
    public class Ca extends AnimatorListenerAdapter {
        Ca() {
        }

        public void onAnimationEnd(Animator animation) {
            HideBottomViewOnScrollBehavior.this.f۹۴۴۵c = null;
        }
    }
}
