package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;

/* renamed from: com.lawyer_smartCalendar.a.j  reason: invalid class name */
public class Cj extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۸۹c;

    /* renamed from: d  reason: contains not printable characters */
    private String[][] f۱۳۸۹۰d;

    /* renamed from: e  reason: contains not printable characters */
    private String f۱۳۸۹۱e;

    /* renamed from: com.lawyer_smartCalendar.a.j$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۹۲v;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۹۲v = (TextView) convertView.findViewById(R.id.textView_city_name);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cj.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.j$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cj jVar) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0082  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r7) {
                /*
                // Method dump skipped, instructions count: 190
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cj.Ca.View$OnClickListenerCa.onClick(android.view.View):void");
            }
        }
    }

    public Cj(Context Activity, String activityName, String[][] city_list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۸۹c = Activity;
        this.f۱۳۸۹۰d = city_list;
        this.f۱۳۸۹۱e = activityName;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۵۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.city_list_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۱۶۱b(Ca holder, int pos) {
        holder.f۱۳۸۹۲v.setText(this.f۱۳۸۹۰d[pos][1]);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۵۵a() {
        return this.f۱۳۸۹۰d.length;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۵۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۵۸b(int position) {
        return position;
    }
}
