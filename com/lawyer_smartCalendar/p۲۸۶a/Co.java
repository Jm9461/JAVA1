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
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCn;
import com.lawyer_smartCalendar.p۲۸۹d.Cd;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۴۴c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cd> f۱۳۹۴۵d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۹۴۶e;

    /* renamed from: f, reason: contains not printable characters */
    private ViewOnClickListenerCn f۱۳۹۴۷f;

    /* renamed from: com.lawyer_smartCalendar.a.o$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۴۸v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۹۴۹w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۹۵۰x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۹۵۱y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۴۸v = (TextView) convertView.findViewById(2131296790);
            this.f۱۳۹۴۹w = (TextView) convertView.findViewById(2131296793);
            this.f۱۳۹۵۰x = (TextView) convertView.findViewById(2131296792);
            this.f۱۳۹۵۱y = (TextView) convertView.findViewById(2131296794);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۵۸a(Co.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.o$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۵۸a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۵۸a(Co co) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmDocument = new Intent(Co.this.f۱۳۹۴۴c, (Class<?>) DocumentDetailActivity.class);
                frmDocument.putExtra("id", ((Cd) Co.this.f۱۳۹۴۵d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۸۴e() + "");
                Co.this.f۱۳۹۴۷f.m۱۵۴۷۹b(frmDocument);
            }
        }
    }

    public Co(Context Activity, ViewOnClickListenerCn fragmentTab1, List<Cd> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۹۴۴c = Activity;
        this.f۱۳۹۴۵d = list;
        this.f۱۳۹۴۷f = fragmentTab1;
        this.f۱۳۹۴۶e = new Cf(this.f۱۳۹۴۴c);
        new Ci(this.f۱۳۹۴۴c);
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
        String type = "";
        String str = this.f۱۳۹۴۵d.get(pos).m۱۵۵۸۲d();
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
            holder.f۱۳۹۴۹w.setBackgroundResource(2131230847);
            type = "چک";
        } else if (c2 == 1) {
            holder.f۱۳۹۴۹w.setBackgroundResource(2131230849);
            type = "سند ازدواج";
        } else if (c2 == 2) {
            holder.f۱۳۹۴۹w.setBackgroundResource(2131230848);
            type = "اسناد سجلی";
        } else if (c2 == 3) {
            holder.f۱۳۹۴۹w.setBackgroundResource(2131230846);
            type = "سایر مدارک";
        }
        holder.f۱۳۹۴۹w.setText(type);
        if (!this.f۱۳۹۴۵d.get(pos).m۱۵۵۸۶g().equals("")) {
            date_in = Ca.m۱۵۴۰۳a(Long.valueOf(Long.parseLong(this.f۱۳۹۴۵d.get(pos).m۱۵۵۸۶g())));
        } else {
            date_in = "-";
        }
        holder.f۱۳۹۴۸v.setText("تاریخ دریافت: " + date_in);
        holder.f۱۳۹۵۰x.setText("تاریخ تحویل");
        String date_out = "-";
        try {
            if (!this.f۱۳۹۴۵d.get(pos).m۱۵۵۷۹c().equals("")) {
                date_out = Ca.m۱۵۴۰۳a(Long.valueOf(Long.parseLong(this.f۱۳۹۴۵d.get(pos).m۱۵۵۷۹c())));
            } else {
                date_out = "-";
            }
        } catch (Exception e2) {
        }
        holder.f۱۳۹۵۱y.setText(date_out);
        holder.f۱۳۹۴۸v.setTypeface(this.f۱۳۹۴۶e.m۱۵۶۶۸a());
        holder.f۱۳۹۴۹w.setTypeface(this.f۱۳۹۴۶e.m۱۵۶۶۸a());
        holder.f۱۳۹۵۰x.setTypeface(this.f۱۳۹۴۶e.m۱۵۶۶۸a());
        holder.f۱۳۹۵۱y.setTypeface(this.f۱۳۹۴۶e.m۱۵۶۷۰b());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۴۵d.size();
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
