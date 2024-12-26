package com.rey.material.widget;

import android.content.Context;
import android.support.v7.widget.ListViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import b.j.a.d.a;

public class c extends ListViewCompat implements a.c {

    /* renamed from: c  reason: collision with root package name */
    private AbsListView.RecyclerListener f۳۴۶۳c;

    public c(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: package-private */
    public class a implements AbsListView.RecyclerListener {
        a() {
        }

        public void onMovedToScrapHeap(View view) {
            e.a(view);
            if (c.this.f۳۴۶۳c != null) {
                c.this.f۳۴۶۳c.onMovedToScrapHeap(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        c.super.setRecyclerListener(new a());
        if (!isInEditMode()) {
            b.j.a.d.a.a(context, attrs, defStyleAttr, defStyleRes);
        }
    }
}
