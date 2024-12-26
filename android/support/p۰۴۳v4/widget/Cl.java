package android.support.p۰۴۳v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.l  reason: invalid class name */
public class Cl extends AbstractView$OnTouchListenerCa {

    /* renamed from: u  reason: contains not printable characters */
    private final ListView f۱۰۷۹۳u;

    public Cl(ListView target) {
        super(target);
        this.f۱۰۷۹۳u = target;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractView$OnTouchListenerCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۸۹a(int deltaX, int deltaY) {
        Cm.m۱۳۲۹۲a(this.f۱۰۷۹۳u, deltaY);
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractView$OnTouchListenerCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۲۹۰a(int direction) {
        return false;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractView$OnTouchListenerCa
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۲۹۱b(int direction) {
        ListView target = this.f۱۰۷۹۳u;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition < itemCount || target.getChildAt(childCount - 1).getBottom() > target.getHeight()) {
                return true;
            }
            return false;
        } else if (direction >= 0) {
            return false;
        } else {
            if (firstPosition > 0 || target.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
    }
}
