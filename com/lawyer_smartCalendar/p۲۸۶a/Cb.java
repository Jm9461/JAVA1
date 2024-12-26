package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.utils.Cf;

/* renamed from: com.lawyer_smartCalendar.a.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۷۶۰c;

    /* renamed from: d, reason: contains not printable characters */
    private String[][] f۱۳۷۶۱d;

    /* renamed from: e, reason: contains not printable characters */
    private Typeface f۱۳۷۶۲e;

    /* renamed from: com.lawyer_smartCalendar.a.b$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۷۶۳v;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۷۶۳v = (TextView) convertView.findViewById(2131296815);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۳۵a(Cb.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.b$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۳۵a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۳۵a(Cb cb) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String type = Cb.this.f۱۳۷۶۱d[a.this.m۱۲۳۲۰f()][1];
                ((AddCityBankAccountActivity) Cb.this.f۱۳۷۶۰c).input_select_type.setText(type);
                ((AddCityBankAccountActivity) Cb.this.f۱۳۷۶۰c).f۱۴۰۵۸w = Cb.this.f۱۳۷۶۱d[a.this.m۱۲۳۲۰f()][0];
                ((AddCityBankAccountActivity) Cb.this.f۱۳۷۶۰c).m۱۵۲۳۴a("type");
            }
        }
    }

    public Cb(Context Activity, String[][] type_list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۷۶۰c = Activity;
        this.f۱۳۷۶۱d = type_list;
        this.f۱۳۷۶۲e = new Cf(this.f۱۳۷۶۰c).m۱۵۶۶۸a();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493049, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        holder.f۱۳۷۶۳v.setText(this.f۱۳۷۶۱d[pos][1]);
        holder.f۱۳۷۶۳v.setTypeface(this.f۱۳۷۶۲e);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۷۶۱d.length;
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
