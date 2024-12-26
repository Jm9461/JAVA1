package com.heinrichreimersoftware.materialintro.view;

import android.content.Context;
import android.support.p۰۴۳v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.heinrichreimersoftware.materialintro.view.a  reason: invalid class name */
public class Ca extends ViewPager {

    /* renamed from: l0  reason: contains not printable characters */
    private float f۱۳۷۳۹l0;

    /* renamed from: m0  reason: contains not printable characters */
    private boolean f۱۳۷۴۰m0 = true;

    /* renamed from: n0  reason: contains not printable characters */
    private boolean f۱۳۷۴۱n0 = true;

    /* renamed from: o0  reason: contains not printable characters */
    private boolean f۱۳۷۴۲o0 = false;

    public Ca(Context context) {
        super(context);
    }

    public Ca(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setSwipeRightEnabled(boolean swipeRightEnabled) {
        this.f۱۳۷۴۰m0 = swipeRightEnabled;
    }

    public void setSwipeLeftEnabled(boolean swipeLeftEnabled) {
        this.f۱۳۷۴۱n0 = swipeLeftEnabled;
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    public boolean onTouchEvent(MotionEvent event) {
        return m۱۷۰۲۰b(event) && super.onTouchEvent(event);
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return m۱۷۰۲۰b(event) && super.onInterceptTouchEvent(event);
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۷۰۲۰b(MotionEvent event) {
        if (m۱۷۰۲۲a(event) == -1 && !this.f۱۳۷۴۰m0) {
            if (!this.f۱۳۷۴۲o0) {
                this.f۱۳۷۴۲o0 = true;
                m۱۷۰۲۱f();
            }
            return false;
        } else if (m۱۷۰۲۲a(event) != 1 || this.f۱۳۷۴۱n0) {
            this.f۱۳۷۴۲o0 = false;
            return true;
        } else {
            if (!this.f۱۳۷۴۲o0) {
                this.f۱۳۷۴۲o0 = true;
                m۱۷۰۲۱f();
            }
            return false;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۷۰۲۱f() {
        int currentItem = getCurrentItem();
        scrollTo(getWidth() * currentItem, getScrollY());
        setCurrentItem(currentItem);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۲۲a(MotionEvent event) {
        if (event.getAction() == 0) {
            this.f۱۳۷۳۹l0 = event.getX();
            return 0;
        }
        if (event.getAction() == 2 || event.getAction() == 1) {
            float distanceX = event.getX() - this.f۱۳۷۳۹l0;
            if (0.0f > Math.abs(distanceX)) {
                return 0;
            }
            if (distanceX > 0.0f) {
                return -1;
            }
            if (distanceX < 0.0f) {
                return 1;
            }
        }
        return 0;
    }
}
