package com.lawyer_smartCalendar.activity;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;

public class LinkActivity_ViewBinding implements Unbinder {
    public LinkActivity_ViewBinding(LinkActivity target, View source) {
        target.mRecyclerView = (RecyclerView) Ca.m۱۶۵۹۲b(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }
}
