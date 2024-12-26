package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.utils.Cf;

/* renamed from: com.lawyer_smartCalendar.a.b  reason: invalid class name */
public class Cb extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۷۶۰c;

    /* renamed from: d  reason: contains not printable characters */
    private String[][] f۱۳۷۶۱d;

    /* renamed from: e  reason: contains not printable characters */
    private Typeface f۱۳۷۶۲e = new Cf(this.f۱۳۷۶۰c).m۱۷۷۴۶a();

    /* renamed from: com.lawyer_smartCalendar.a.b$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۷۶۳v;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۷۶۳v = (TextView) convertView.findViewById(R.id.textView_type_name);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cb.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.b$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cb bVar) {
            }

            public void onClick(View view) {
                ((AddCityBankAccountActivity) Cb.this.f۱۳۷۶۰c).input_select_type.setText(Cb.this.f۱۳۷۶۱d[Ca.this.m۱۴۳۹۰f()][1]);
                ((AddCityBankAccountActivity) Cb.this.f۱۳۷۶۰c).f۱۴۰۵۸w = Cb.this.f۱۳۷۶۱d[Ca.this.m۱۴۳۹۰f()][0];
                ((AddCityBankAccountActivity) Cb.this.f۱۳۷۶۰c).m۱۷۳۱۲a("type");
            }
        }
    }

    public Cb(Context Activity, String[][] type_list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۷۶۰c = Activity;
        this.f۱۳۷۶۱d = type_list;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۴۳b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.type_list_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۴۵b(Ca holder, int pos) {
        holder.f۱۳۷۶۳v.setText(this.f۱۳۷۶۱d[pos][1]);
        holder.f۱۳۷۶۳v.setTypeface(this.f۱۳۷۶۲e);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۳۹a() {
        return this.f۱۳۷۶۱d.length;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۰۴۰a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۰۴۲b(int position) {
        return position;
    }
}
