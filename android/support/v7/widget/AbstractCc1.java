package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.c1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCc1 extends RecyclerView.AbstractCl {

    /* renamed from: g, reason: contains not printable characters */
    boolean f۱۱۹۶۳g = true;

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۳۱۷۰a(RecyclerView.AbstractCd0 abstractCd0, int i, int i2, int i3, int i4);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۳۱۷۱a(RecyclerView.AbstractCd0 abstractCd0, RecyclerView.AbstractCd0 abstractCd02, int i, int i2, int i3, int i4);

    /* renamed from: f, reason: contains not printable characters */
    public abstract boolean mo۱۳۱۷۶f(RecyclerView.AbstractCd0 abstractCd0);

    /* renamed from: g, reason: contains not printable characters */
    public abstract boolean mo۱۳۱۷۸g(RecyclerView.AbstractCd0 abstractCd0);

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۹۳a(RecyclerView.AbstractCd0 viewHolder) {
        return !this.f۱۱۹۶۳g || viewHolder.m۱۲۳۲۸n();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۲۹۹۹b(RecyclerView.AbstractCd0 viewHolder, RecyclerView.AbstractCl.c preLayoutInfo, RecyclerView.AbstractCl.c postLayoutInfo) {
        int oldLeft = preLayoutInfo.f۱۱۶۶۵a;
        int oldTop = preLayoutInfo.f۱۱۶۶۶b;
        View disappearingItemView = viewHolder.f۱۱۶۳۷c;
        int newLeft = postLayoutInfo == null ? disappearingItemView.getLeft() : postLayoutInfo.f۱۱۶۶۵a;
        int newTop = postLayoutInfo == null ? disappearingItemView.getTop() : postLayoutInfo.f۱۱۶۶۶b;
        if (!viewHolder.m۱۲۳۳۰p() && (oldLeft != newLeft || oldTop != newTop)) {
            disappearingItemView.layout(newLeft, newTop, disappearingItemView.getWidth() + newLeft, disappearingItemView.getHeight() + newTop);
            return mo۱۳۱۷۰a(viewHolder, oldLeft, oldTop, newLeft, newTop);
        }
        return mo۱۳۱۷۸g(viewHolder);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۹۷a(RecyclerView.AbstractCd0 viewHolder, RecyclerView.AbstractCl.c preLayoutInfo, RecyclerView.AbstractCl.c postLayoutInfo) {
        if (preLayoutInfo != null && (preLayoutInfo.f۱۱۶۶۵a != postLayoutInfo.f۱۱۶۶۵a || preLayoutInfo.f۱۱۶۶۶b != postLayoutInfo.f۱۱۶۶۶b)) {
            return mo۱۳۱۷۰a(viewHolder, preLayoutInfo.f۱۱۶۶۵a, preLayoutInfo.f۱۱۶۶۶b, postLayoutInfo.f۱۱۶۶۵a, postLayoutInfo.f۱۱۶۶۶b);
        }
        return mo۱۳۱۷۶f(viewHolder);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: c, reason: contains not printable characters */
    public boolean mo۱۳۰۰۱c(RecyclerView.AbstractCd0 viewHolder, RecyclerView.AbstractCl.c preInfo, RecyclerView.AbstractCl.c postInfo) {
        if (preInfo.f۱۱۶۶۵a != postInfo.f۱۱۶۶۵a || preInfo.f۱۱۶۶۶b != postInfo.f۱۱۶۶۶b) {
            return mo۱۳۱۷۰a(viewHolder, preInfo.f۱۱۶۶۵a, preInfo.f۱۱۶۶۶b, postInfo.f۱۱۶۶۵a, postInfo.f۱۱۶۶۶b);
        }
        m۱۳۰۰۷j(viewHolder);
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCl
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۹۶a(RecyclerView.AbstractCd0 oldHolder, RecyclerView.AbstractCd0 newHolder, RecyclerView.AbstractCl.c preInfo, RecyclerView.AbstractCl.c postInfo) {
        int toLeft;
        int toTop;
        int fromLeft = preInfo.f۱۱۶۶۵a;
        int fromTop = preInfo.f۱۱۶۶۶b;
        if (newHolder.m۱۲۳۳۸x()) {
            int toLeft2 = preInfo.f۱۱۶۶۵a;
            toLeft = toLeft2;
            toTop = preInfo.f۱۱۶۶۶b;
        } else {
            int toLeft3 = postInfo.f۱۱۶۶۵a;
            toLeft = toLeft3;
            toTop = postInfo.f۱۱۶۶۶b;
        }
        return mo۱۳۱۷۱a(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    /* renamed from: l, reason: contains not printable characters */
    public final void m۱۳۰۰۹l(RecyclerView.AbstractCd0 item) {
        m۱۳۰۱۵r(item);
        m۱۲۴۰۱b(item);
    }

    /* renamed from: j, reason: contains not printable characters */
    public final void m۱۳۰۰۷j(RecyclerView.AbstractCd0 item) {
        m۱۳۰۱۳p(item);
        m۱۲۴۰۱b(item);
    }

    /* renamed from: h, reason: contains not printable characters */
    public final void m۱۳۰۰۵h(RecyclerView.AbstractCd0 item) {
        m۱۳۰۱۱n(item);
        m۱۲۴۰۱b(item);
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۲۹۹۲a(RecyclerView.AbstractCd0 item, boolean oldItem) {
        m۱۳۰۰۰c(item, oldItem);
        m۱۲۴۰۱b(item);
    }

    /* renamed from: m, reason: contains not printable characters */
    public final void m۱۳۰۱۰m(RecyclerView.AbstractCd0 item) {
        m۱۳۰۱۶s(item);
    }

    /* renamed from: k, reason: contains not printable characters */
    public final void m۱۳۰۰۸k(RecyclerView.AbstractCd0 item) {
        m۱۳۰۱۴q(item);
    }

    /* renamed from: i, reason: contains not printable characters */
    public final void m۱۳۰۰۶i(RecyclerView.AbstractCd0 item) {
        m۱۳۰۱۲o(item);
    }

    /* renamed from: b, reason: contains not printable characters */
    public final void m۱۲۹۹۸b(RecyclerView.AbstractCd0 item, boolean oldItem) {
        m۱۳۰۰۲d(item, oldItem);
    }

    /* renamed from: s, reason: contains not printable characters */
    public void m۱۳۰۱۶s(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: r, reason: contains not printable characters */
    public void m۱۳۰۱۵r(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: o, reason: contains not printable characters */
    public void m۱۳۰۱۲o(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: n, reason: contains not printable characters */
    public void m۱۳۰۱۱n(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: q, reason: contains not printable characters */
    public void m۱۳۰۱۴q(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: p, reason: contains not printable characters */
    public void m۱۳۰۱۳p(RecyclerView.AbstractCd0 item) {
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۳۰۰۲d(RecyclerView.AbstractCd0 item, boolean oldItem) {
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۰۰۰c(RecyclerView.AbstractCd0 item, boolean oldItem) {
    }
}
