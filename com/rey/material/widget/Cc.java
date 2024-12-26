package com.rey.material.widget;

import android.content.Context;
import android.support.v7.widget.ListViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca;

/* renamed from: com.rey.material.widget.c  reason: invalid class name */
public class Cc extends ListViewCompat implements Ca.AbstractCc {

    /* renamed from: c  reason: contains not printable characters */
    private AbsListView.RecyclerListener f۱۵۲۳۵c;

    public Cc(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۸۱۷۱a(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.rey.material.widget.c$a  reason: invalid class name */
    public class Ca implements AbsListView.RecyclerListener {
        Ca() {
        }

        public void onMovedToScrapHeap(View view) {
            View$OnClickListenerCe.m۱۸۱۷۲a(view);
            if (Cc.this.f۱۵۲۳۵c != null) {
                Cc.this.f۱۵۲۳۵c.onMovedToScrapHeap(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۷۱a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Cc.super.setRecyclerListener(new Ca());
        if (!isInEditMode()) {
            p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca.m۱۶۴۲۵a(context, attrs, defStyleAttr, defStyleRes);
        }
    }
}
