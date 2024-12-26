package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.widget.ActionMenuView;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.AbstractCb {

    /* renamed from: R  reason: contains not printable characters */
    private final int f۹۴۴۷R;

    /* renamed from: S  reason: contains not printable characters */
    private final p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۶r.Cb f۹۴۴۸S;

    /* renamed from: T  reason: contains not printable characters */
    private final Ca f۹۴۴۹T;

    /* renamed from: U  reason: contains not printable characters */
    private Animator f۹۴۵۰U;

    /* renamed from: V  reason: contains not printable characters */
    private Animator f۹۴۵۱V;

    /* renamed from: W  reason: contains not printable characters */
    private Animator f۹۴۵۲W;

    /* renamed from: a0  reason: contains not printable characters */
    private int f۹۴۵۳a0;

    /* renamed from: b0  reason: contains not printable characters */
    private boolean f۹۴۵۴b0;

    /* renamed from: c0  reason: contains not printable characters */
    private boolean f۹۴۵۵c0;

    /* renamed from: d0  reason: contains not printable characters */
    AnimatorListenerAdapter f۹۴۵۶d0;

    /* renamed from: c  reason: contains not printable characters */
    static /* synthetic */ void m۱۱۲۶۷c(BottomAppBar x0) {
        x0.m۱۱۲۷۳p();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f۹۴۵۳a0;
    }

    public void setFabAlignmentMode(int fabAlignmentMode) {
        m۱۱۲۶۳b(fabAlignmentMode);
        m۱۱۲۵۶a(fabAlignmentMode, this.f۹۴۵۵c0);
        this.f۹۴۵۳a0 = fabAlignmentMode;
    }

    public void setBackgroundTint(ColorStateList backgroundTint) {
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۹۴۴۸S, backgroundTint);
    }

    public ColorStateList getBackgroundTint() {
        this.f۹۴۴۸S.m۱۰۰۳۵a();
        throw null;
    }

    public float getFabCradleMargin() {
        this.f۹۴۴۹T.m۱۱۲۸۵b();
        throw null;
    }

    public void setFabCradleMargin(float cradleMargin) {
        if (cradleMargin != getFabCradleMargin()) {
            this.f۹۴۴۹T.m۱۱۲۸۶b(cradleMargin);
            throw null;
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        this.f۹۴۴۹T.m۱۱۲۸۷c();
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float roundedCornerRadius) {
        if (roundedCornerRadius != getFabCradleRoundedCornerRadius()) {
            this.f۹۴۴۹T.m۱۱۲۸۸c(roundedCornerRadius);
            throw null;
        }
    }

    public float getCradleVerticalOffset() {
        this.f۹۴۴۹T.m۱۱۲۸۳a();
        throw null;
    }

    public void setCradleVerticalOffset(float verticalOffset) {
        if (verticalOffset != getCradleVerticalOffset()) {
            this.f۹۴۴۹T.m۱۱۲۸۴a(verticalOffset);
            throw null;
        }
    }

    public boolean getHideOnScroll() {
        return this.f۹۴۵۴b0;
    }

    public void setHideOnScroll(boolean hide) {
        this.f۹۴۵۴b0 = hide;
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(int diameter) {
        this.f۹۴۴۹T.m۱۱۲۸۹d();
        throw null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۲۶۳b(int targetMode) {
        if (this.f۹۴۵۳a0 != targetMode && Cu.m۱۳۰۲۸y(this)) {
            Animator animator = this.f۹۴۵۱V;
            if (animator != null) {
                animator.cancel();
            }
            List<Animator> animators = new ArrayList<>();
            m۱۱۲۵۵a(targetMode, animators);
            m۱۱۲۶۴b(targetMode, animators);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(animators);
            this.f۹۴۵۱V = set;
            this.f۹۴۵۱V.addListener(new Ca());
            this.f۹۴۵۱V.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.bottomappbar.BottomAppBar$a  reason: invalid class name */
    public class Ca extends AnimatorListenerAdapter {
        Ca() {
        }

        public void onAnimationEnd(Animator animation) {
            BottomAppBar.this.f۹۴۵۱V = null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۲۵۵a(int targetMode, List<Animator> list) {
        if (this.f۹۴۵۵c0) {
            this.f۹۴۴۹T.m۱۱۲۹۱e();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m  reason: contains not printable characters */
    private FloatingActionButton m۱۱۲۷۰m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View v : ((CoordinatorLayout) getParent()).m۱۱۵۵۳c(this)) {
            if (v instanceof FloatingActionButton) {
                return (FloatingActionButton) v;
            }
        }
        return null;
    }

    /* renamed from: o  reason: contains not printable characters */
    private boolean m۱۱۲۷۲o() {
        FloatingActionButton fab = m۱۱۲۷۰m();
        return fab != null && fab.m۱۱۶۲۴b();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۲۶۴b(int targetMode, List<Animator> animators) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(m۱۱۲۷۰m(), "translationX", (float) m۱۱۲۵۲a(targetMode));
        animator.setDuration(300L);
        animators.add(animator);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۲۵۶a(int targetMode, boolean newFabAttached) {
        if (Cu.m۱۳۰۲۸y(this)) {
            Animator animator = this.f۹۴۵۲W;
            if (animator != null) {
                animator.cancel();
            }
            List<Animator> animators = new ArrayList<>();
            if (!m۱۱۲۷۲o()) {
                targetMode = 0;
                newFabAttached = false;
            }
            m۱۱۲۵۷a(targetMode, newFabAttached, animators);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(animators);
            this.f۹۴۵۲W = set;
            this.f۹۴۵۲W.addListener(new Cb());
            this.f۹۴۵۲W.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.bottomappbar.BottomAppBar$b  reason: invalid class name */
    public class Cb extends AnimatorListenerAdapter {
        Cb() {
        }

        public void onAnimationEnd(Animator animation) {
            BottomAppBar.this.f۹۴۵۲W = null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۲۵۷a(int targetMode, boolean targetAttached, List<Animator> animators) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator fadeIn = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if ((this.f۹۴۵۵c0 || (targetAttached && m۱۱۲۷۲o())) && (this.f۹۴۵۳a0 == 1 || targetMode == 1)) {
                Animator fadeOut = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                fadeOut.addListener(new Cc(actionMenuView, targetMode, targetAttached));
                AnimatorSet set = new AnimatorSet();
                set.setDuration(150L);
                set.playSequentially(fadeOut, fadeIn);
                animators.add(set);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                animators.add(fadeIn);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.bottomappbar.BottomAppBar$c  reason: invalid class name */
    public class Cc extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        public boolean f۹۴۶۰a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ActionMenuView f۹۴۶۱b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۹۴۶۲c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ boolean f۹۴۶۳d;

        Cc(ActionMenuView actionMenuView, int i, boolean z) {
            this.f۹۴۶۱b = actionMenuView;
            this.f۹۴۶۲c = i;
            this.f۹۴۶۳d = z;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۹۴۶۰a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f۹۴۶۰a) {
                BottomAppBar.this.m۱۱۲۶۱a((BottomAppBar) this.f۹۴۶۱b, (ActionMenuView) this.f۹۴۶۲c, (int) this.f۹۴۶۳d);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۱۲۵۱a(boolean targetAttached) {
        FloatingActionButton fab = m۱۱۲۷۰m();
        if (fab == null) {
            return 0.0f;
        }
        Rect fabContentRect = new Rect();
        fab.m۱۱۶۲۰a(fabContentRect);
        float fabHeight = (float) fabContentRect.height();
        if (fabHeight == 0.0f) {
            fabHeight = (float) fab.getMeasuredHeight();
        }
        return ((float) (-getMeasuredHeight())) + (targetAttached ? (-getCradleVerticalOffset()) + (fabHeight / 2.0f) + ((float) (fab.getHeight() - fabContentRect.bottom)) : ((float) (fab.getHeight() - fabContentRect.height())) - ((float) fab.getPaddingBottom()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationY() {
        return m۱۱۲۵۱a(this.f۹۴۵۵c0);
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۱۲۵۲a(int fabAlignmentMode) {
        int i = 1;
        boolean isRtl = Cu.m۱۳۰۱۴k(this) == 1;
        if (fabAlignmentMode != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f۹۴۴۷R;
        if (isRtl) {
            i = -1;
        }
        return measuredWidth * i;
    }

    private float getFabTranslationX() {
        return (float) m۱۱۲۵۲a(this.f۹۴۵۳a0);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            if (view instanceof ActionMenuView) {
                return (ActionMenuView) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۲۶۱a(ActionMenuView actionMenuView, int fabAlignmentMode, boolean fabAttached) {
        int i;
        int toolbarLeftContentEnd = 0;
        boolean isRtl = Cu.m۱۳۰۱۴k(this) == 1;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View view = getChildAt(i2);
            if ((view.getLayoutParams() instanceof Toolbar.Ce) && (((Toolbar.Ce) view.getLayoutParams()).f۱۰۹۵۳a & 8388615) == 8388611) {
                if (isRtl) {
                    i = view.getLeft();
                } else {
                    i = view.getRight();
                }
                toolbarLeftContentEnd = Math.max(toolbarLeftContentEnd, i);
            }
        }
        actionMenuView.setTranslationX((fabAlignmentMode != 1 || !fabAttached) ? 0.0f : (float) (toolbarLeftContentEnd - (isRtl ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۱۲۶۹l() {
        Animator animator = this.f۹۴۵۰U;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f۹۴۵۲W;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f۹۴۵۱V;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n  reason: contains not printable characters */
    private boolean m۱۱۲۷۱n() {
        Animator animator;
        Animator animator2;
        Animator animator3 = this.f۹۴۵۰U;
        return (animator3 != null && animator3.isRunning()) || ((animator = this.f۹۴۵۲W) != null && animator.isRunning()) || ((animator2 = this.f۹۴۵۱V) != null && animator2.isRunning());
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Toolbar
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        m۱۱۲۶۹l();
        m۱۱۲۷۳p();
        throw null;
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۱۲۷۳p() {
        this.f۹۴۴۹T.m۱۱۲۹۰d(getFabTranslationX());
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۲۶۰a(FloatingActionButton fab) {
        m۱۱۲۶۵b(fab);
        fab.m۱۱۶۱۷a(this.f۹۴۵۶d0);
        fab.m۱۱۶۲۱b(this.f۹۴۵۶d0);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۲۶۵b(FloatingActionButton fab) {
        fab.m۱۱۶۲۵c(this.f۹۴۵۶d0);
        fab.m۱۱۶۲۶d(this.f۹۴۵۶d0);
    }

    @Override // android.support.p۰۴۷v7.widget.Toolbar
    public void setTitle(CharSequence title) {
    }

    @Override // android.support.p۰۴۷v7.widget.Toolbar
    public void setSubtitle(CharSequence subtitle) {
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCb
    public CoordinatorLayout.AbstractCc<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d  reason: contains not printable characters */
        private final Rect f۹۴۵۷d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۱۲۷۴a(FloatingActionButton fab, BottomAppBar child) {
            ((CoordinatorLayout.Cf) fab.getLayoutParams()).f۹۶۳۹d = 17;
            child.m۱۱۲۶۰a((BottomAppBar) fab);
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۲۷۹a(CoordinatorLayout parent, BottomAppBar child, int layoutDirection) {
            FloatingActionButton fab = child.m۱۱۲۷۰m();
            if (fab != null) {
                m۱۱۲۷۴a(fab, child);
                fab.m۱۱۶۲۲b(this.f۹۴۵۷d);
                child.setFabDiameter(this.f۹۴۵۷d.height());
            }
            if (child.m۱۱۲۷۱n()) {
                parent.m۱۱۵۵۵c(child, layoutDirection);
                return super.m۱۱۲۴۸a(parent, (View) child, layoutDirection);
            }
            BottomAppBar.m۱۱۲۶۷c(child);
            throw null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۲۸۲b(CoordinatorLayout coordinatorLayout, BottomAppBar child, View directTargetChild, View target, int axes, int type) {
            return child.getHideOnScroll() && super.m۱۱۵۸۳b(coordinatorLayout, child, directTargetChild, target, axes, type);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۲۸۱b(BottomAppBar child) {
            super.m۱۱۲۴۹b((View) child);
            FloatingActionButton fab = child.m۱۱۲۷۰m();
            if (fab != null) {
                fab.clearAnimation();
                fab.animate().translationY(child.getFabTranslationY()).setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۴d).setDuration(225);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۲۷۶a(BottomAppBar child) {
            super.m۱۱۲۴۷a((View) child);
            FloatingActionButton fab = child.m۱۱۲۷۰m();
            if (fab != null) {
                fab.m۱۱۶۲۰a(this.f۹۴۵۷d);
                fab.clearAnimation();
                fab.animate().translationY(((float) (-fab.getPaddingBottom())) + ((float) (fab.getMeasuredHeight() - this.f۹۴۵۷d.height()))).setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۳c).setDuration(175);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        Cd savedState = new Cd(super.onSaveInstanceState());
        savedState.f۹۴۶۵e = this.f۹۴۵۳a0;
        savedState.f۹۴۶۶f = this.f۹۴۵۵c0;
        return savedState;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Toolbar
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Cd)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Cd savedState = (Cd) state;
        super.onRestoreInstanceState(savedState.m۱۲۷۹۱a());
        this.f۹۴۵۳a0 = savedState.f۹۴۶۵e;
        this.f۹۴۵۵c0 = savedState.f۹۴۶۶f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.bottomappbar.BottomAppBar$d  reason: invalid class name */
    public static class Cd extends AbstractCa {
        public static final Parcelable.Creator<Cd> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        int f۹۴۶۵e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۹۴۶۶f;

        public Cd(Parcelable superState) {
            super(superState);
        }

        public Cd(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.f۹۴۶۵e = in.readInt();
            this.f۹۴۶۶f = in.readInt() != 0;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۹۴۶۵e);
            out.writeInt(this.f۹۴۶۶f ? 1 : 0);
        }

        /* renamed from: android.support.design.bottomappbar.BottomAppBar$d$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cd> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cd createFromParcel(Parcel in, ClassLoader loader) {
                return new Cd(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cd createFromParcel(Parcel in) {
                return new Cd(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Cd[] newArray(int size) {
                return new Cd[size];
            }
        }
    }
}
