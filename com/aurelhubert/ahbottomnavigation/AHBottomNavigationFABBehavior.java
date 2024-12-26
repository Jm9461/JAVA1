package com.aurelhubert.ahbottomnavigation;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar$SnackbarLayout;
import android.view.View;
import android.view.ViewGroup;

public class AHBottomNavigationFABBehavior extends CoordinatorLayout.AbstractCc<FloatingActionButton> {

    /* renamed from: a  reason: contains not printable characters */
    private long f۱۳۴۵۷a;

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۸۲۸a(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        if (dependency != null && (dependency instanceof Snackbar$SnackbarLayout)) {
            return true;
        }
        if (dependency == null || !(dependency instanceof AHBottomNavigation)) {
            return super.m۱۱۵۷۶a(parent, (View) child, dependency);
        }
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۶۸۳۰b(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        m۱۶۸۲۶a(child, dependency);
        return super.m۱۱۵۸۱b(parent, (View) child, dependency);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۲۶a(FloatingActionButton child, View dependency) {
        if (child != null && dependency != null && (dependency instanceof Snackbar$SnackbarLayout)) {
            this.f۱۳۴۵۷a = System.currentTimeMillis();
            child.setY(dependency.getY() - ((float) ((ViewGroup.MarginLayoutParams) child.getLayoutParams()).bottomMargin));
        } else if (child != null && dependency != null && (dependency instanceof AHBottomNavigation) && System.currentTimeMillis() - this.f۱۳۴۵۷a >= 30) {
            child.setY(dependency.getY() - ((float) ((ViewGroup.MarginLayoutParams) child.getLayoutParams()).bottomMargin));
        }
    }
}
