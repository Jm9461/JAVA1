package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ci;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: contains not printable characters */
    private final Ci f۹۵۳۸c = new Ci(75, 150);

    /* renamed from: d  reason: contains not printable characters */
    private final Ci f۹۵۳۹d = new Ci(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۳۹۶a(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof FloatingActionButton;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۳۹۸b(CoordinatorLayout parent, View child, MotionEvent ev) {
        return super.m۱۱۵۸۰b(parent, child, ev);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.transformation.ExpandableTransformationBehavior
    /* renamed from: b  reason: contains not printable characters */
    public AnimatorSet m۱۱۳۹۷b(View dependency, View child, boolean expanded, boolean isAnimating) {
        List<Animator> animations = new ArrayList<>();
        m۱۱۳۹۵a(child, expanded, isAnimating, animations, new ArrayList<>());
        AnimatorSet set = new AnimatorSet();
        Cb.m۹۹۴۵a(set, animations);
        set.addListener(new Ca(this, expanded, child));
        return set;
    }

    /* renamed from: android.support.design.transformation.FabTransformationScrimBehavior$a  reason: invalid class name */
    class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ boolean f۹۵۴۰a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۹۵۴۱b;

        Ca(FabTransformationScrimBehavior this$0, boolean z, View view) {
            this.f۹۵۴۰a = z;
            this.f۹۵۴۱b = view;
        }

        public void onAnimationStart(Animator animation) {
            if (this.f۹۵۴۰a) {
                this.f۹۵۴۱b.setVisibility(0);
            }
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f۹۵۴۰a) {
                this.f۹۵۴۱b.setVisibility(4);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۹۵a(View child, boolean expanded, boolean currentlyAnimating, List<Animator> animations, List<Animator.AnimatorListener> list) {
        Animator animator;
        Ci timing = expanded ? this.f۹۵۳۸c : this.f۹۵۳۹d;
        if (expanded) {
            if (!currentlyAnimating) {
                child.setAlpha(0.0f);
            }
            animator = ObjectAnimator.ofFloat(child, View.ALPHA, 1.0f);
        } else {
            animator = ObjectAnimator.ofFloat(child, View.ALPHA, 0.0f);
        }
        timing.m۹۹۶۶a(animator);
        animations.add(animator);
    }
}
