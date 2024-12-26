package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.andexert.library.RippleView;
import com.lawyer_smartCalendar.R;

/* renamed from: com.lawyer_smartCalendar.a.v  reason: invalid class name */
public class Cv extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۹۹c;

    /* renamed from: d  reason: contains not printable characters */
    private String[][] f۱۴۰۰۰d;

    /* renamed from: e  reason: contains not printable characters */
    private RippleView f۱۴۰۰۱e;

    /* renamed from: com.lawyer_smartCalendar.a.v$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۴۰۰۲v;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۴۰۰۲v = (TextView) convertView.findViewById(R.id.txt_link_title);
            Cv.this.f۱۴۰۰۱e = (RippleView) convertView.findViewById(R.id.rippleView);
            Cv.this.f۱۴۰۰۱e.setOnRippleCompleteListener(new Ca(Cv.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.v$a$a  reason: invalid class name */
        class Ca implements RippleView.AbstractCc {
            Ca(Cv vVar) {
            }

            @Override // com.andexert.library.RippleView.AbstractCc
            /* renamed from: a  reason: contains not printable characters */
            public void m۱۷۲۷۱a(RippleView rippleView) {
                Cv.this.f۱۳۹۹۹c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Cv.this.f۱۴۰۰۰d[Ca.this.m۱۴۳۹۰f()][2])));
            }
        }
    }

    public Cv(Context Activity, String[][] linkList) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۹۹c = Activity;
        this.f۱۴۰۰۰d = linkList;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۶۸b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.link_list_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۷۰b(Ca holder, int pos) {
        holder.f۱۴۰۰۲v.setText(this.f۱۴۰۰۰d[pos][1]);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۶۴a() {
        return this.f۱۴۰۰۰d.length;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۲۶۵a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۶۷b(int position) {
        return position;
    }
}
