package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: contains not printable characters */
    private AnimatorSet f۹۵۲۳b;

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract AnimatorSet m۱۱۳۷۲b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.transformation.ExpandableBehavior
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۳۷۱a(View dependency, View child, boolean expanded, boolean animated) {
        boolean currentlyAnimating = this.f۹۵۲۳b != null;
        if (currentlyAnimating) {
            this.f۹۵۲۳b.cancel();
        }
        this.f۹۵۲۳b = m۱۱۳۷۲b(dependency, child, expanded, currentlyAnimating);
        this.f۹۵۲۳b.addListener(new Ca());
        this.f۹۵۲۳b.start();
        if (!animated) {
            this.f۹۵۲۳b.end();
        }
        return true;
    }

    /* renamed from: android.support.design.transformation.ExpandableTransformationBehavior$a  reason: invalid class name */
    class Ca extends AnimatorListenerAdapter {
        Ca() {
        }

        public void onAnimationEnd(Animator animation) {
            ExpandableTransformationBehavior.this.f۹۵۲۳b = null;
        }
    }
}
