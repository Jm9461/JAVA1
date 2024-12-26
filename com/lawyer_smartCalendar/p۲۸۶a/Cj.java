package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.AddCaseActivity;
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;

/* renamed from: com.lawyer_smartCalendar.a.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cj extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۸۸۹c;

    /* renamed from: d, reason: contains not printable characters */
    private String[][] f۱۳۸۹۰d;

    /* renamed from: e, reason: contains not printable characters */
    private String f۱۳۸۹۱e;

    /* renamed from: com.lawyer_smartCalendar.a.j$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۸۹۲v;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۹۲v = (TextView) convertView.findViewById(2131296789);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۴۹a(Cj.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.j$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۴۹a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۴۹a(Cj cj) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                char c2;
                String city = Cj.this.f۱۳۸۹۰d[a.this.m۱۲۳۲۰f()][1];
                String str = Cj.this.f۱۳۸۹۱e;
                int hashCode = str.hashCode();
                if (hashCode != -2116993664) {
                    if (hashCode == 1457345876 && str.equals("AddCityBankAccountActivity")) {
                        c2 = 0;
                    }
                    c2 = 65535;
                } else {
                    if (str.equals("AddCaseActivity")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                }
                if (c2 == 0) {
                    ((AddCityBankAccountActivity) Cj.this.f۱۳۸۸۹c).input_select_city.setText(city);
                    ((AddCityBankAccountActivity) Cj.this.f۱۳۸۸۹c).f۱۴۰۵۷v = Cj.this.f۱۳۸۹۰d[a.this.m۱۲۳۲۰f()][0];
                    ((AddCityBankAccountActivity) Cj.this.f۱۳۸۸۹c).m۱۵۲۳۴a("city");
                    return;
                }
                if (c2 == 1) {
                    ((AddCaseActivity) Cj.this.f۱۳۸۸۹c).input_court_city.setText(city);
                    ((AddCaseActivity) Cj.this.f۱۳۸۸۹c).f۱۴۰۳۴F = Cj.this.f۱۳۸۹۰d[a.this.m۱۲۳۲۰f()][0];
                    ((AddCaseActivity) Cj.this.f۱۳۸۸۹c).m۱۵۲۲۳a("city");
                }
            }
        }
    }

    public Cj(Context Activity, String activityName, String[][] city_list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۸۸۹c = Activity;
        this.f۱۳۸۹۰d = city_list;
        this.f۱۳۸۹۱e = activityName;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492943, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        holder.f۱۳۸۹۲v.setText(this.f۱۳۸۹۰d[pos][1]);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۹۰d.length;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public long mo۱۵۲۰۷a(int position) {
        return position;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۶۵۸b(int position) {
        return position;
    }
}
