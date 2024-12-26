package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.n0  reason: invalid class name */
class Cn0 {

    /* renamed from: a  reason: contains not printable characters */
    boolean f۱۲۲۲۵a = true;

    /* renamed from: b  reason: contains not printable characters */
    int f۱۲۲۲۶b;

    /* renamed from: c  reason: contains not printable characters */
    int f۱۲۲۲۷c;

    /* renamed from: d  reason: contains not printable characters */
    int f۱۲۲۲۸d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۲۲۲۹e;

    /* renamed from: f  reason: contains not printable characters */
    int f۱۲۲۳۰f = 0;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۲۲۳۱g = 0;

    /* renamed from: h  reason: contains not printable characters */
    boolean f۱۲۲۳۲h;

    /* renamed from: i  reason: contains not printable characters */
    boolean f۱۲۲۳۳i;

    Cn0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۴۵۴a(RecyclerView.Ca0 state) {
        int i = this.f۱۲۲۲۷c;
        return i >= 0 && i < state.m۱۴۳۵۳a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۵۴۵۳a(RecyclerView.Cv recycler) {
        View view = recycler.m۱۴۶۹۵d(this.f۱۲۲۲۷c);
        this.f۱۲۲۲۷c += this.f۱۲۲۲۸d;
        return view;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f۱۲۲۲۶b + ", mCurrentPosition=" + this.f۱۲۲۲۷c + ", mItemDirection=" + this.f۱۲۲۲۸d + ", mLayoutDirection=" + this.f۱۲۲۲۹e + ", mStartLine=" + this.f۱۲۲۳۰f + ", mEndLine=" + this.f۱۲۲۳۱g + '}';
    }
}
