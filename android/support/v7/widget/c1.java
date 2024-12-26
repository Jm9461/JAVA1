package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class c1 extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    boolean f۲۰۰۰g = true;

    public abstract boolean a(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);

    public abstract boolean a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    public abstract boolean f(RecyclerView.d0 d0Var);

    public abstract boolean g(RecyclerView.d0 d0Var);

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 viewHolder) {
        return !this.f۲۰۰۰g || viewHolder.n();
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean b(RecyclerView.d0 viewHolder, RecyclerView.l.c preLayoutInfo, RecyclerView.l.c postLayoutInfo) {
        int oldLeft = preLayoutInfo.f۱۸۵۷a;
        int oldTop = preLayoutInfo.f۱۸۵۸b;
        View disappearingItemView = viewHolder.f۱۸۴۱c;
        int newLeft = postLayoutInfo == null ? disappearingItemView.getLeft() : postLayoutInfo.f۱۸۵۷a;
        int newTop = postLayoutInfo == null ? disappearingItemView.getTop() : postLayoutInfo.f۱۸۵۸b;
        if (viewHolder.p() || (oldLeft == newLeft && oldTop == newTop)) {
            return g(viewHolder);
        }
        disappearingItemView.layout(newLeft, newTop, disappearingItemView.getWidth() + newLeft, disappearingItemView.getHeight() + newTop);
        return a(viewHolder, oldLeft, oldTop, newLeft, newTop);
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 viewHolder, RecyclerView.l.c preLayoutInfo, RecyclerView.l.c postLayoutInfo) {
        if (preLayoutInfo == null || (preLayoutInfo.f۱۸۵۷a == postLayoutInfo.f۱۸۵۷a && preLayoutInfo.f۱۸۵۸b == postLayoutInfo.f۱۸۵۸b)) {
            return f(viewHolder);
        }
        return a(viewHolder, preLayoutInfo.f۱۸۵۷a, preLayoutInfo.f۱۸۵۸b, postLayoutInfo.f۱۸۵۷a, postLayoutInfo.f۱۸۵۸b);
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean c(RecyclerView.d0 viewHolder, RecyclerView.l.c preInfo, RecyclerView.l.c postInfo) {
        if (preInfo.f۱۸۵۷a != postInfo.f۱۸۵۷a || preInfo.f۱۸۵۸b != postInfo.f۱۸۵۸b) {
            return a(viewHolder, preInfo.f۱۸۵۷a, preInfo.f۱۸۵۸b, postInfo.f۱۸۵۷a, postInfo.f۱۸۵۸b);
        }
        j(viewHolder);
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 oldHolder, RecyclerView.d0 newHolder, RecyclerView.l.c preInfo, RecyclerView.l.c postInfo) {
        int toTop;
        int toLeft;
        int fromLeft = preInfo.f۱۸۵۷a;
        int fromTop = preInfo.f۱۸۵۸b;
        if (newHolder.x()) {
            toLeft = preInfo.f۱۸۵۷a;
            toTop = preInfo.f۱۸۵۸b;
        } else {
            toLeft = postInfo.f۱۸۵۷a;
            toTop = postInfo.f۱۸۵۸b;
        }
        return a(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    public final void l(RecyclerView.d0 item) {
        r(item);
        b(item);
    }

    public final void j(RecyclerView.d0 item) {
        p(item);
        b(item);
    }

    public final void h(RecyclerView.d0 item) {
        n(item);
        b(item);
    }

    public final void a(RecyclerView.d0 item, boolean oldItem) {
        c(item, oldItem);
        b(item);
    }

    public final void m(RecyclerView.d0 item) {
        s(item);
    }

    public final void k(RecyclerView.d0 item) {
        q(item);
    }

    public final void i(RecyclerView.d0 item) {
        o(item);
    }

    public final void b(RecyclerView.d0 item, boolean oldItem) {
        d(item, oldItem);
    }

    public void s(RecyclerView.d0 item) {
    }

    public void r(RecyclerView.d0 item) {
    }

    public void o(RecyclerView.d0 item) {
    }

    public void n(RecyclerView.d0 item) {
    }

    public void q(RecyclerView.d0 item) {
    }

    public void p(RecyclerView.d0 item) {
    }

    public void d(RecyclerView.d0 item, boolean oldItem) {
    }

    public void c(RecyclerView.d0 item, boolean oldItem) {
    }
}
