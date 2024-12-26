package com.heinrichreimersoftware.materialintro.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class a extends ViewPager {
    private float l0;
    private boolean m0 = true;
    private boolean n0 = true;
    private boolean o0 = false;

    public a(Context context) {
        super(context);
    }

    public a(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setSwipeRightEnabled(boolean swipeRightEnabled) {
        this.m0 = swipeRightEnabled;
    }

    public void setSwipeLeftEnabled(boolean swipeLeftEnabled) {
        this.n0 = swipeLeftEnabled;
    }

    @Override // android.support.v4.view.ViewPager
    public boolean onTouchEvent(MotionEvent event) {
        return b(event) && super.onTouchEvent(event);
    }

    @Override // android.support.v4.view.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return b(event) && super.onInterceptTouchEvent(event);
    }

    private boolean b(MotionEvent event) {
        if (a(event) == -1 && !this.m0) {
            if (!this.o0) {
                this.o0 = true;
                f();
            }
            return false;
        } else if (a(event) != 1 || this.n0) {
            this.o0 = false;
            return true;
        } else {
            if (!this.o0) {
                this.o0 = true;
                f();
            }
            return false;
        }
    }

    private void f() {
        int currentItem = getCurrentItem();
        scrollTo(getWidth() * currentItem, getScrollY());
        setCurrentItem(currentItem);
    }

    public int a(MotionEvent event) {
        if (event.getAction() == 0) {
            this.l0 = event.getX();
            return 0;
        }
        if (event.getAction() == 2 || event.getAction() == 1) {
            float distanceX = event.getX() - this.l0;
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
