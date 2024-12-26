package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cl extends AbstractViewOnTouchListenerCa {

    /* renamed from: u, reason: contains not printable characters */
    private final ListView f۱۰۷۹۳u;

    public Cl(ListView target) {
        super(target);
        this.f۱۰۷۹۳u = target;
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۲۱۹a(int deltaX, int deltaY) {
        Cm.m۱۱۲۲۲a(this.f۱۰۷۹۳u, deltaY);
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerCa
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۲۲۰a(int direction) {
        return false;
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerCa
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۱۲۲۱b(int direction) {
        ListView target = this.f۱۰۷۹۳u;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition >= itemCount) {
                View lastView = target.getChildAt(childCount - 1);
                if (lastView.getBottom() <= target.getHeight()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        if (direction >= 0) {
            return false;
        }
        if (firstPosition <= 0) {
            View firstView = target.getChildAt(0);
            if (firstView.getTop() >= 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
