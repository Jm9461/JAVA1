package android.support.design.widget;

import android.support.design.widget.Ct;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.design.widget.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private Ct.AbstractCb f۹۸۴۹a;

    public Ca(SwipeDismissBehavior<?> behavior) {
        behavior.m۱۱۶۶۴b(0.1f);
        behavior.m۱۱۶۶۰a(0.6f);
        behavior.m۱۱۶۶۱a(0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۷۹۹a(View child) {
        return child instanceof Cd;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۹۸a(CoordinatorLayout parent, View child, MotionEvent event) {
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                Ct.m۱۲۰۱۷a().m۱۲۰۲۳b(this.f۹۸۴۹a);
            }
        } else if (parent.m۱۱۵۴۷a(child, (int) event.getX(), (int) event.getY())) {
            Ct.m۱۲۰۱۷a().m۱۲۰۲۱a(this.f۹۸۴۹a);
        }
    }
}
