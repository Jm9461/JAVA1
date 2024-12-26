package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

class n0 {

    /* renamed from: a  reason: collision with root package name */
    boolean f۲۱۸۲a = true;

    /* renamed from: b  reason: collision with root package name */
    int f۲۱۸۳b;

    /* renamed from: c  reason: collision with root package name */
    int f۲۱۸۴c;

    /* renamed from: d  reason: collision with root package name */
    int f۲۱۸۵d;

    /* renamed from: e  reason: collision with root package name */
    int f۲۱۸۶e;

    /* renamed from: f  reason: collision with root package name */
    int f۲۱۸۷f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f۲۱۸۸g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f۲۱۸۹h;
    boolean i;

    n0() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 state) {
        int i2 = this.f۲۱۸۴c;
        return i2 >= 0 && i2 < state.a();
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.v recycler) {
        View view = recycler.d(this.f۲۱۸۴c);
        this.f۲۱۸۴c += this.f۲۱۸۵d;
        return view;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f۲۱۸۳b + ", mCurrentPosition=" + this.f۲۱۸۴c + ", mItemDirection=" + this.f۲۱۸۵d + ", mLayoutDirection=" + this.f۲۱۸۶e + ", mStartLine=" + this.f۲۱۸۷f + ", mEndLine=" + this.f۲۱۸۸g + '}';
    }
}
