package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.c1  reason: invalid class name */
public abstract class AbstractCc1 extends RecyclerView.AbstractCl {

    /* renamed from: g  reason: contains not printable characters */
    boolean f۱۱۹۶۳g = true;

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۵۰۶۴a(RecyclerView.AbstractCd0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۵۰۶۵a(RecyclerView.AbstractCd0 d0Var, RecyclerView.AbstractCd0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: f  reason: contains not printable characters */
    public abstract boolean m۱۵۰۷۳f(RecyclerView.AbstractCd0 d0Var);

    /* renamed from: g  reason: contains not printable characters */
    public abstract boolean m۱۵۰۷۴g(RecyclerView.AbstractCd0 d0Var);

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۰۶۳a(RecyclerView.AbstractCd0 viewHolder) {
        return !this.f۱۱۹۶۳g || viewHolder.m۱۴۳۹۸n();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۰۶۹b(RecyclerView.AbstractCd0 viewHolder, RecyclerView.AbstractCl.Cc preLayoutInfo, RecyclerView.AbstractCl.Cc postLayoutInfo) {
        int oldLeft = preLayoutInfo.f۱۱۶۶۵a;
        int oldTop = preLayoutInfo.f۱۱۶۶۶b;
        View disappearingItemView = viewHolder.f۱۱۶۳۷c;
        int newLeft = postLayoutInfo == null ? disappearingItemView.getLeft() : postLayoutInfo.f۱۱۶۶۵a;
        int newTop = postLayoutInfo == null ? disappearingItemView.getTop() : postLayoutInfo.f۱۱۶۶۶b;
        if (viewHolder.m۱۴۴۰۰p() || (oldLeft == newLeft && oldTop == newTop)) {
            return m۱۵۰۷۴g(viewHolder);
        }
        disappearingItemView.layout(newLeft, newTop, disappearingItemView.getWidth() + newLeft, disappearingItemView.getHeight() + newTop);
        return m۱۵۰۶۴a(viewHolder, oldLeft, oldTop, newLeft, newTop);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۰۶۷a(RecyclerView.AbstractCd0 viewHolder, RecyclerView.AbstractCl.Cc preLayoutInfo, RecyclerView.AbstractCl.Cc postLayoutInfo) {
        if (preLayoutInfo == null || (preLayoutInfo.f۱۱۶۶۵a == postLayoutInfo.f۱۱۶۶۵a && preLayoutInfo.f۱۱۶۶۶b == postLayoutInfo.f۱۱۶۶۶b)) {
            return m۱۵۰۷۳f(viewHolder);
        }
        return m۱۵۰۶۴a(viewHolder, preLayoutInfo.f۱۱۶۶۵a, preLayoutInfo.f۱۱۶۶۶b, postLayoutInfo.f۱۱۶۶۵a, postLayoutInfo.f۱۱۶۶۶b);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۰۷۱c(RecyclerView.AbstractCd0 viewHolder, RecyclerView.AbstractCl.Cc preInfo, RecyclerView.AbstractCl.Cc postInfo) {
        if (preInfo.f۱۱۶۶۵a != postInfo.f۱۱۶۶۵a || preInfo.f۱۱۶۶۶b != postInfo.f۱۱۶۶۶b) {
            return m۱۵۰۶۴a(viewHolder, preInfo.f۱۱۶۶۵a, preInfo.f۱۱۶۶۶b, postInfo.f۱۱۶۶۵a, postInfo.f۱۱۶۶۶b);
        }
        m۱۵۰۷۷j(viewHolder);
        return false;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCl
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۰۶۶a(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder, RecyclerView.AbstractCl.Cc preInfo, RecyclerView.AbstractCl.Cc postInfo) {
        int toTop;
        int toLeft;
        int fromLeft = preInfo.f۱۱۶۶۵a;
        int fromTop = preInfo.f۱۱۶۶۶b;
        if (newHolder.m۱۴۴۰۸x()) {
            toLeft = preInfo.f۱۱۶۶۵a;
            toTop = preInfo.f۱۱۶۶۶b;
        } else {
            toLeft = postInfo.f۱۱۶۶۵a;
            toTop = postInfo.f۱۱۶۶۶b;
        }
        return m۱۵۰۶۵a(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    /* renamed from: l  reason: contains not printable characters */
    public final void m۱۵۰۷۹l(RecyclerView.AbstractCd0 item) {
        m۱۵۰۸۵r(item);
        m۱۴۴۷۱b(item);
    }

    /* renamed from: j  reason: contains not printable characters */
    public final void m۱۵۰۷۷j(RecyclerView.AbstractCd0 item) {
        m۱۵۰۸۳p(item);
        m۱۴۴۷۱b(item);
    }

    /* renamed from: h  reason: contains not printable characters */
    public final void m۱۵۰۷۵h(RecyclerView.AbstractCd0 item) {
        m۱۵۰۸۱n(item);
        m۱۴۴۷۱b(item);
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۰۶۲a(RecyclerView.AbstractCd0 item, boolean oldItem) {
        m۱۵۰۷۰c(item, oldItem);
        m۱۴۴۷۱b(item);
    }

    /* renamed from: m  reason: contains not printable characters */
    public final void m۱۵۰۸۰m(RecyclerView.AbstractCd0 item) {
        m۱۵۰۸۶s(item);
    }

    /* renamed from: k  reason: contains not printable characters */
    public final void m۱۵۰۷۸k(RecyclerView.AbstractCd0 item) {
        m۱۵۰۸۴q(item);
    }

    /* renamed from: i  reason: contains not printable characters */
    public final void m۱۵۰۷۶i(RecyclerView.AbstractCd0 item) {
        m۱۵۰۸۲o(item);
    }

    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۵۰۶۸b(RecyclerView.AbstractCd0 item, boolean oldItem) {
        m۱۵۰۷۲d(item, oldItem);
    }

    /* renamed from: s  reason: contains not printable characters */
    public void m۱۵۰۸۶s(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: r  reason: contains not printable characters */
    public void m۱۵۰۸۵r(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: o  reason: contains not printable characters */
    public void m۱۵۰۸۲o(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۵۰۸۱n(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: q  reason: contains not printable characters */
    public void m۱۵۰۸۴q(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: p  reason: contains not printable characters */
    public void m۱۵۰۸۳p(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۰۷۲d(RecyclerView.AbstractCd0 item, boolean oldItem) {
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۰۷۰c(RecyclerView.AbstractCd0 item, boolean oldItem) {
    }
}
