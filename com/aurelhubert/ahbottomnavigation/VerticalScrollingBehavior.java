package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.Cc0;
import android.util.AttributeSet;
import android.view.View;

public abstract class VerticalScrollingBehavior<V extends View> extends CoordinatorLayout.AbstractCc<V> {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۳۴۵۸a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۳۴۵۹b = 0;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۳۴۶۰c = 0;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۴۶۱d = 0;

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۶۸۳۲a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۶۸۳۷a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۶۸۳۹b(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    public VerticalScrollingBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VerticalScrollingBehavior() {
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۶۸۴۰b(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & 2) != 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۳۵a(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes) {
        super.m۱۱۵۶۸a(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۶۸۴۲d(CoordinatorLayout coordinatorLayout, V child, View target) {
        super.m۱۱۵۸۷d(coordinatorLayout, child, target);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۳۳a(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.m۱۱۵۶۴a(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        if (dyUnconsumed > 0 && this.f۱۳۴۵۸a < 0) {
            this.f۱۳۴۵۸a = 0;
            this.f۱۳۴۶۰c = 1;
        } else if (dyUnconsumed < 0 && this.f۱۳۴۵۸a > 0) {
            this.f۱۳۴۵۸a = 0;
            this.f۱۳۴۶۰c = -1;
        }
        this.f۱۳۴۵۸a += dyUnconsumed;
        m۱۶۸۳۲a(coordinatorLayout, child, this.f۱۳۴۶۰c, dyConsumed, this.f۱۳۴۵۸a);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۸۳۴a(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed) {
        super.m۱۱۵۶۶a(coordinatorLayout, child, target, dx, dy, consumed);
        if (dy > 0 && this.f۱۳۴۵۹b < 0) {
            this.f۱۳۴۵۹b = 0;
            this.f۱۳۴۶۱d = 1;
        } else if (dy < 0 && this.f۱۳۴۵۹b > 0) {
            this.f۱۳۴۵۹b = 0;
            this.f۱۳۴۶۱d = -1;
        }
        this.f۱۳۴۵۹b += dy;
        m۱۶۸۳۹b(coordinatorLayout, child, target, dx, dy, consumed, this.f۱۳۴۶۱d);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۸۳۸a(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY, boolean consumed) {
        super.m۱۱۵۷۸a(coordinatorLayout, child, target, velocityX, velocityY, consumed);
        this.f۱۳۴۶۱d = velocityY > 0.0f ? 1 : -1;
        return m۱۶۸۳۷a(coordinatorLayout, child, target, velocityX, velocityY, this.f۱۳۴۶۱d);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۸۳۶a(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        return super.m۱۱۵۷۷a(coordinatorLayout, child, target, velocityX, velocityY);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public Cc0 m۱۶۸۳۱a(CoordinatorLayout coordinatorLayout, V child, Cc0 insets) {
        super.m۱۱۵۵۹a(coordinatorLayout, child, insets);
        return insets;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: d  reason: contains not printable characters */
    public Parcelable m۱۶۸۴۱d(CoordinatorLayout parent, V child) {
        return super.m۱۱۵۸۶d(parent, child);
    }
}
