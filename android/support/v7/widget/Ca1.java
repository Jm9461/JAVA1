package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.a1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ca1 {
    /* renamed from: a, reason: contains not printable characters */
    static int m۱۲۹۱۹a(RecyclerView.Ca0 state, AbstractCt0 orientation, View startChild, View endChild, RecyclerView.AbstractCo lm, boolean smoothScrollbarEnabled, boolean reverseLayout) {
        int itemsBefore;
        if (lm.m۱۲۵۱۸e() == 0 || state.m۱۲۲۸۳a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        int minPosition = Math.min(lm.m۱۲۵۴۳l(startChild), lm.m۱۲۵۴۳l(endChild));
        int maxPosition = Math.max(lm.m۱۲۵۴۳l(startChild), lm.m۱۲۵۴۳l(endChild));
        if (reverseLayout) {
            itemsBefore = Math.max(0, (state.m۱۲۲۸۳a() - maxPosition) - 1);
        } else {
            itemsBefore = Math.max(0, minPosition);
        }
        if (!smoothScrollbarEnabled) {
            return itemsBefore;
        }
        int laidOutArea = Math.abs(orientation.mo۱۳۵۴۲a(endChild) - orientation.mo۱۳۵۴۹d(startChild));
        int itemRange = Math.abs(lm.m۱۲۵۴۳l(startChild) - lm.m۱۲۵۴۳l(endChild)) + 1;
        float avgSizePerRow = laidOutArea / itemRange;
        return Math.round((itemsBefore * avgSizePerRow) + (orientation.mo۱۳۵۵۲f() - orientation.mo۱۳۵۴۹d(startChild)));
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۲۹۱۸a(RecyclerView.Ca0 state, AbstractCt0 orientation, View startChild, View endChild, RecyclerView.AbstractCo lm, boolean smoothScrollbarEnabled) {
        if (lm.m۱۲۵۱۸e() == 0 || state.m۱۲۲۸۳a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return Math.abs(lm.m۱۲۵۴۳l(startChild) - lm.m۱۲۵۴۳l(endChild)) + 1;
        }
        int extend = orientation.mo۱۳۵۴۲a(endChild) - orientation.mo۱۳۵۴۹d(startChild);
        return Math.min(orientation.mo۱۳۵۵۴g(), extend);
    }

    /* renamed from: b, reason: contains not printable characters */
    static int m۱۲۹۲۰b(RecyclerView.Ca0 state, AbstractCt0 orientation, View startChild, View endChild, RecyclerView.AbstractCo lm, boolean smoothScrollbarEnabled) {
        if (lm.m۱۲۵۱۸e() == 0 || state.m۱۲۲۸۳a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return state.m۱۲۲۸۳a();
        }
        int laidOutArea = orientation.mo۱۳۵۴۲a(endChild) - orientation.mo۱۳۵۴۹d(startChild);
        int laidOutRange = Math.abs(lm.m۱۲۵۴۳l(startChild) - lm.m۱۲۵۴۳l(endChild)) + 1;
        return (int) ((laidOutArea / laidOutRange) * state.m۱۲۲۸۳a());
    }
}
