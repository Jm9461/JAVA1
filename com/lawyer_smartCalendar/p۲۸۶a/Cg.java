package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.DocumentDetailActivity;
import com.lawyer_smartCalendar.p۲۸۷b.Ca;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCg;
import com.lawyer_smartCalendar.p۲۸۹d.Cd;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۸۵۷c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cd> f۱۳۸۵۸d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۸۵۹e;

    /* renamed from: f, reason: contains not printable characters */
    private ViewOnClickListenerCg f۱۳۸۶۰f;

    /* renamed from: com.lawyer_smartCalendar.a.g$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۸۶۱v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۸۶۲w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۸۶۳x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۸۶۴y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۶۱v = (TextView) convertView.findViewById(2131296790);
            this.f۱۳۸۶۲w = (TextView) convertView.findViewById(2131296793);
            this.f۱۳۸۶۳x = (TextView) convertView.findViewById(2131296792);
            this.f۱۳۸۶۴y = (TextView) convertView.findViewById(2131296794);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۴۶a(Cg.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.g$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۴۶a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۴۶a(Cg cg) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmDocument = new Intent(Cg.this.f۱۳۸۵۷c, (Class<?>) DocumentDetailActivity.class);
                frmDocument.putExtra("id", ((Cd) Cg.this.f۱۳۸۵۸d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۸۴e() + "");
                Cg.this.f۱۳۸۶۰f.m۱۵۴۴۵b(frmDocument);
            }
        }
    }

    public Cg(Context Activity, ViewOnClickListenerCg fragmentTab1, List<Cd> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۸۵۷c = Activity;
        this.f۱۳۸۵۸d = list;
        this.f۱۳۸۶۰f = fragmentTab1;
        this.f۱۳۸۵۹e = new Cf(this.f۱۳۸۵۷c);
        new Ci(this.f۱۳۸۵۷c);
        Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492968, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        char c2;
        String date_in;
        String date_out;
        String type = "";
        String str = this.f۱۳۸۵۸d.get(pos).m۱۵۵۸۲d();
        switch (str.hashCode()) {
            case -37847475:
                if (str.equals("MarriageCertificate")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 65074408:
                if (str.equals("Check")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 76517104:
                if (str.equals("Other")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 445109232:
                if (str.equals("SejliDocument")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            holder.f۱۳۸۶۲w.setBackgroundResource(2131230847);
            type = "چک";
        } else if (c2 == 1) {
            holder.f۱۳۸۶۲w.setBackgroundResource(2131230849);
            type = "سند ازدواج";
        } else if (c2 == 2) {
            holder.f۱۳۸۶۲w.setBackgroundResource(2131230848);
            type = "اسناد سجلی";
        } else if (c2 == 3) {
            holder.f۱۳۸۶۲w.setBackgroundResource(2131230846);
            type = "سایر مدارک";
        }
        holder.f۱۳۸۶۲w.setText(type);
        if (!this.f۱۳۸۵۸d.get(pos).m۱۵۵۸۶g().equals("")) {
            date_in = Ca.m۱۵۴۰۳a(Long.valueOf(Long.parseLong(this.f۱۳۸۵۸d.get(pos).m۱۵۵۸۶g())));
        } else {
            date_in = "-";
        }
        if (!this.f۱۳۸۵۸d.get(pos).m۱۵۵۷۹c().equals("")) {
            date_out = Ca.m۱۵۴۰۳a(Long.valueOf(Long.parseLong(this.f۱۳۸۵۸d.get(pos).m۱۵۵۷۹c())));
        } else {
            date_out = "-";
        }
        holder.f۱۳۸۶۱v.setText("تاریخ دریافت: " + date_in);
        holder.f۱۳۸۶۳x.setText("تاریخ تحویل");
        holder.f۱۳۸۶۴y.setText(date_out);
        holder.f۱۳۸۶۱v.setTypeface(this.f۱۳۸۵۹e.m۱۵۶۶۸a());
        holder.f۱۳۸۶۲w.setTypeface(this.f۱۳۸۵۹e.m۱۵۶۶۸a());
        holder.f۱۳۸۶۳x.setTypeface(this.f۱۳۸۵۹e.m۱۵۶۶۸a());
        holder.f۱۳۸۶۴y.setTypeface(this.f۱۳۸۵۹e.m۱۵۶۷۰b());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۵۸d.size();
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
