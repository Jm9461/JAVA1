package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.a1  reason: invalid class name */
public class Ca1 {
    /* renamed from: a  reason: contains not printable characters */
    static int m۱۴۹۸۹a(RecyclerView.Ca0 state, AbstractCt0 orientation, View startChild, View endChild, RecyclerView.AbstractCo lm, boolean smoothScrollbarEnabled, boolean reverseLayout) {
        int itemsBefore;
        if (lm.m۱۴۵۸۸e() == 0 || state.m۱۴۳۵۳a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        int minPosition = Math.min(lm.m۱۴۶۱۳l(startChild), lm.m۱۴۶۱۳l(endChild));
        int maxPosition = Math.max(lm.m۱۴۶۱۳l(startChild), lm.m۱۴۶۱۳l(endChild));
        if (reverseLayout) {
            itemsBefore = Math.max(0, (state.m۱۴۳۵۳a() - maxPosition) - 1);
        } else {
            itemsBefore = Math.max(0, minPosition);
        }
        if (!smoothScrollbarEnabled) {
            return itemsBefore;
        }
        return Math.round((((float) itemsBefore) * (((float) Math.abs(orientation.m۱۵۵۸۲a(endChild) - orientation.m۱۵۵۸۹d(startChild))) / ((float) (Math.abs(lm.m۱۴۶۱۳l(startChild) - lm.m۱۴۶۱۳l(endChild)) + 1)))) + ((float) (orientation.m۱۵۵۹۲f() - orientation.m۱۵۵۸۹d(startChild))));
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۴۹۸۸a(RecyclerView.Ca0 state, AbstractCt0 orientation, View startChild, View endChild, RecyclerView.AbstractCo lm, boolean smoothScrollbarEnabled) {
        if (lm.m۱۴۵۸۸e() == 0 || state.m۱۴۳۵۳a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return Math.abs(lm.m۱۴۶۱۳l(startChild) - lm.m۱۴۶۱۳l(endChild)) + 1;
        }
        return Math.min(orientation.m۱۵۵۹۴g(), orientation.m۱۵۵۸۲a(endChild) - orientation.m۱۵۵۸۹d(startChild));
    }

    /* renamed from: b  reason: contains not printable characters */
    static int m۱۴۹۹۰b(RecyclerView.Ca0 state, AbstractCt0 orientation, View startChild, View endChild, RecyclerView.AbstractCo lm, boolean smoothScrollbarEnabled) {
        if (lm.m۱۴۵۸۸e() == 0 || state.m۱۴۳۵۳a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return state.m۱۴۳۵۳a();
        }
        return (int) ((((float) (orientation.m۱۵۵۸۲a(endChild) - orientation.m۱۵۵۸۹d(startChild))) / ((float) (Math.abs(lm.m۱۴۶۱۳l(startChild) - lm.m۱۴۶۱۳l(endChild)) + 1))) * ((float) state.m۱۴۳۵۳a()));
    }
}
