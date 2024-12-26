package com.lawyer_smartCalendar.activity;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;

public class SearchActivity_ViewBinding implements Unbinder {
    public SearchActivity_ViewBinding(SearchActivity target, View source) {
        target.mRecyclerView = (RecyclerView) Ca.m۱۶۵۹۲b(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
        target.txt_recycle_no_data = (TextView) Ca.m۱۶۵۹۲b(source, R.id.txt_recycle_no_data, "field 'txt_recycle_no_data'", TextView.class);
    }
}
