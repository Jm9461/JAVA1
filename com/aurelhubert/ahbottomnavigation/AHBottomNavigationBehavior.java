package com.aurelhubert.ahbottomnavigation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar$SnackbarLayout;
import android.support.design.widget.TabLayout;
import android.support.p۰۴۳v4.view.AbstractCb0;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cy;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Cc;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;

public class AHBottomNavigationBehavior<V extends View> extends VerticalScrollingBehavior<V> {

    /* renamed from: p  reason: contains not printable characters */
    private static final Interpolator f۱۳۴۴۲p = new Cc();

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۳۴۴۳e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۳۴۴۴f = false;

    /* renamed from: g  reason: contains not printable characters */
    private Cy f۱۳۴۴۵g;

    /* renamed from: h  reason: contains not printable characters */
    private ObjectAnimator f۱۳۴۴۶h;

    /* renamed from: i  reason: contains not printable characters */
    private TabLayout f۱۳۴۴۷i;

    /* renamed from: j  reason: contains not printable characters */
    private Snackbar$SnackbarLayout f۱۳۴۴۸j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۴۴۹k = -1;

    /* renamed from: l  reason: contains not printable characters */
    private float f۱۳۴۵۰l = 0.0f;

    /* renamed from: m  reason: contains not printable characters */
    private float f۱۳۴۵۱m = 0.0f;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۳۴۵۲n = true;

    /* renamed from: o  reason: contains not printable characters */
    private AHBottomNavigation.AbstractCf f۱۳۴۵۳o;

    public AHBottomNavigationBehavior() {
    }

    public AHBottomNavigationBehavior(boolean behaviorTranslationEnabled, int navigationBarHeight) {
        this.f۱۳۴۵۲n = behaviorTranslationEnabled;
    }

    public AHBottomNavigationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, Ch.AHBottomNavigationBehavior_Params);
        this.f۱۳۴۴۳e = a.getResourceId(Ch.AHBottomNavigationBehavior_Params_tabLayoutId, -1);
        a.recycle();
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۸۱۸a(CoordinatorLayout parent, V child, int layoutDirection) {
        boolean layoutChild = super.m۱۱۵۷۱a(parent, child, layoutDirection);
        if (this.f۱۳۴۴۷i == null && this.f۱۳۴۴۳e != -1) {
            this.f۱۳۴۴۷i = m۱۶۸۰۳a(child);
        }
        return layoutChild;
    }

    /* renamed from: a  reason: contains not printable characters */
    private TabLayout m۱۶۸۰۳a(View child) {
        int i = this.f۱۳۴۴۳e;
        if (i == 0) {
            return null;
        }
        return (TabLayout) child.findViewById(i);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۶۸۲۲b(CoordinatorLayout parent, V child, View dependency) {
        return super.m۱۱۵۸۱b(parent, child, dependency);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۸۲۴c(CoordinatorLayout parent, V child, View dependency) {
        super.m۱۱۵۸۵c(parent, child, dependency);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۸۱۹a(CoordinatorLayout parent, V child, View dependency) {
        if (dependency == null || !(dependency instanceof Snackbar$SnackbarLayout)) {
            return super.m۱۱۵۷۶a(parent, child, dependency);
        }
        m۱۶۸۱۵a(child, dependency);
        return true;
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۱۲a(CoordinatorLayout coordinatorLayout, V v, int direction, int currentOverScroll, int totalOverScroll) {
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۸۲۱b(CoordinatorLayout coordinatorLayout, V v, View target, int dx, int dy, int[] consumed, int scrollDirection) {
    }

    /* access modifiers changed from: protected */
    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۸۲۰a(CoordinatorLayout coordinatorLayout, V v, View target, float velocityX, float velocityY, int scrollDirection) {
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc, com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۱۳a(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.m۱۶۸۳۳a(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        if (dyConsumed < 0) {
            m۱۶۸۰۵a(child, -1);
        } else if (dyConsumed > 0) {
            m۱۶۸۰۵a(child, 1);
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc, com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۶۸۲۳b(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2 || super.m۱۶۸۴۰b(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۰۵a(V child, int scrollDirection) {
        if (this.f۱۳۴۵۲n) {
            if (scrollDirection == -1 && this.f۱۳۴۴۴f) {
                this.f۱۳۴۴۴f = false;
                m۱۶۸۰۶a((View) child, 0, false, true);
            } else if (scrollDirection == 1 && !this.f۱۳۴۴۴f) {
                this.f۱۳۴۴۴f = true;
                m۱۶۸۰۶a((View) child, child.getHeight(), false, true);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۰۶a(V child, int offset, boolean forceAnimation, boolean withAnimation) {
        if (!this.f۱۳۴۵۲n && !forceAnimation) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            m۱۶۸۰۹b(child, offset, withAnimation);
            this.f۱۳۴۴۶h.start();
            return;
        }
        m۱۶۸۰۷a(child, withAnimation);
        Cy yVar = this.f۱۳۴۴۵g;
        yVar.m۱۳۰۶۰b((float) offset);
        yVar.m۱۳۰۶۲c();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۰۷a(V child, boolean withAnimation) {
        Cy yVar = this.f۱۳۴۴۵g;
        long j = 300;
        if (yVar == null) {
            this.f۱۳۴۴۵g = Cu.m۱۲۹۷۶a(child);
            Cy yVar2 = this.f۱۳۴۴۵g;
            if (!withAnimation) {
                j = 0;
            }
            yVar2.m۱۳۰۵۴a(j);
            this.f۱۳۴۴۵g.m۱۳۰۵۵a(new Ca());
            this.f۱۳۴۴۵g.m۱۳۰۵۷a(f۱۳۴۴۲p);
            return;
        }
        if (!withAnimation) {
            j = 0;
        }
        yVar.m۱۳۰۵۴a(j);
        this.f۱۳۴۴۵g.m۱۳۰۵۸a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigationBehavior$a  reason: invalid class name */
    public class Ca implements AbstractCb0 {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCb0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۸۲۵a(View view) {
            if (AHBottomNavigationBehavior.this.f۱۳۴۵۳o != null) {
                AHBottomNavigationBehavior.this.f۱۳۴۵۳o.m۱۶۸۰۰a((int) ((((float) view.getMeasuredHeight()) - view.getTranslationY()) + AHBottomNavigationBehavior.this.f۱۳۴۵۱m));
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۸۰۹b(V child, int offset, boolean withAnimation) {
        ObjectAnimator objectAnimator = this.f۱۳۴۴۶h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f۱۳۴۴۶h = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, (float) offset);
        this.f۱۳۴۴۶h.setDuration(withAnimation ? 300 : 0);
        this.f۱۳۴۴۶h.setInterpolator(f۱۳۴۴۲p);
        this.f۱۳۴۴۶h.addUpdateListener(new Cb(child));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigationBehavior$b  reason: invalid class name */
    public class Cb implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۴۵۵a;

        Cb(View view) {
            this.f۱۳۴۵۵a = view;
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            if (AHBottomNavigationBehavior.this.f۱۳۴۴۸j != null && (AHBottomNavigationBehavior.this.f۱۳۴۴۸j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                AHBottomNavigationBehavior.this.f۱۳۴۵۰l = ((float) this.f۱۳۴۵۵a.getMeasuredHeight()) - this.f۱۳۴۵۵a.getTranslationY();
                ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) AHBottomNavigationBehavior.this.f۱۳۴۴۸j.getLayoutParams();
                p.setMargins(p.leftMargin, p.topMargin, p.rightMargin, (int) AHBottomNavigationBehavior.this.f۱۳۴۵۰l);
                AHBottomNavigationBehavior.this.f۱۳۴۴۸j.requestLayout();
            }
            if (AHBottomNavigationBehavior.this.f۱۳۴۵۳o != null) {
                AHBottomNavigationBehavior.this.f۱۳۴۵۳o.m۱۶۸۰۰a((int) ((((float) this.f۱۳۴۵۵a.getMeasuredHeight()) - this.f۱۳۴۵۵a.getTranslationY()) + AHBottomNavigationBehavior.this.f۱۳۴۵۱m));
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۱۷a(boolean behaviorTranslationEnabled, int navigationBarHeight) {
        this.f۱۳۴۵۲n = behaviorTranslationEnabled;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۱۶a(AHBottomNavigation.AbstractCf navigationHeightListener) {
        this.f۱۳۴۵۳o = navigationHeightListener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۱۴a(V view, int offset, boolean withAnimation) {
        if (!this.f۱۳۴۴۴f) {
            this.f۱۳۴۴۴f = true;
            m۱۶۸۰۶a((View) view, offset, true, withAnimation);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۱۵a(View child, View dependency) {
        if (dependency != null && (dependency instanceof Snackbar$SnackbarLayout)) {
            this.f۱۳۴۴۸j = (Snackbar$SnackbarLayout) dependency;
            if (this.f۱۳۴۴۹k == -1) {
                this.f۱۳۴۴۹k = dependency.getHeight();
            }
            int targetMargin = (int) (((float) child.getMeasuredHeight()) - child.getTranslationY());
            if (Build.VERSION.SDK_INT < 21) {
                child.bringToFront();
            }
            if (dependency.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) dependency.getLayoutParams();
                p.setMargins(p.leftMargin, p.topMargin, p.rightMargin, targetMargin);
                dependency.requestLayout();
            }
        }
    }
}
