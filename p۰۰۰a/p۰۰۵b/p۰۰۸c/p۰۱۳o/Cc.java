package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۳o;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.o.c  reason: invalid class name */
public final class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private final View f۸۳۱۵a;

    /* renamed from: b  reason: contains not printable characters */
    private boolean f۸۳۱۶b = false;

    /* renamed from: c  reason: contains not printable characters */
    private int f۸۳۱۷c = 0;

    public Cc(AbstractCb widget) {
        this.f۸۳۱۵a = (View) widget;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۰۰۲۸b() {
        return this.f۸۳۱۶b;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Bundle m۱۰۰۲۹c() {
        Bundle state = new Bundle();
        state.putBoolean("expanded", this.f۸۳۱۶b);
        state.putInt("expandedComponentIdHint", this.f۸۳۱۷c);
        return state;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۰۲۷a(Bundle state) {
        this.f۸۳۱۶b = state.getBoolean("expanded", false);
        this.f۸۳۱۷c = state.getInt("expandedComponentIdHint", 0);
        if (this.f۸۳۱۶b) {
            m۱۰۰۲۴d();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۰۲۶a(int expandedComponentIdHint) {
        this.f۸۳۱۷c = expandedComponentIdHint;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۰۲۵a() {
        return this.f۸۳۱۷c;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۰۲۴d() {
        ViewParent parent = this.f۸۳۱۵a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m۱۱۵۳۸a(this.f۸۳۱۵a);
        }
    }
}
