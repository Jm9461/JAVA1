package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.DocumentDetailActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCg;
import com.lawyer_smartCalendar.p۱۳۳d.Cd;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.g  reason: invalid class name */
public class Cg extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۵۷c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cd> f۱۳۸۵۸d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۸۵۹e = new Cf(this.f۱۳۸۵۷c);

    /* renamed from: f  reason: contains not printable characters */
    private View$OnClickListenerCg f۱۳۸۶۰f;

    /* renamed from: com.lawyer_smartCalendar.a.g$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۶۱v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۶۲w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۶۳x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۶۴y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۶۱v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.f۱۳۸۶۲w = (TextView) convertView.findViewById(R.id.textView_document_type);
            this.f۱۳۸۶۳x = (TextView) convertView.findViewById(R.id.textView_date);
            this.f۱۳۸۶۴y = (TextView) convertView.findViewById(R.id.textView_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cg.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.g$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cg gVar) {
            }

            public void onClick(View view) {
                Intent frmDocument = new Intent(Cg.this.f۱۳۸۵۷c, DocumentDetailActivity.class);
                frmDocument.putExtra("id", ((Cd) Cg.this.f۱۳۸۵۸d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۶۲e() + "");
                Cg.this.f۱۳۸۶۰f.m۱۷۵۲۳b(frmDocument);
            }
        }
    }

    public Cg(Context Activity, View$OnClickListenerCg fragmentTab1, List<Cd> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۵۷c = Activity;
        this.f۱۳۸۵۸d = list;
        this.f۱۳۸۶۰f = fragmentTab1;
        new Ci(this.f۱۳۸۵۷c);
        Calendar.getInstance();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۲۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.document_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۱۳۱b(Ca holder, int pos) {
        char c;
        String date_in;
        String date_out;
        String type = "";
        String d = this.f۱۳۸۵۸d.get(pos).m۱۷۶۶۰d();
        switch (d.hashCode()) {
            case -37847475:
                if (d.equals("MarriageCertificate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 65074408:
                if (d.equals("Check")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 76517104:
                if (d.equals("Other")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 445109232:
                if (d.equals("SejliDocument")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            holder.f۱۳۸۶۲w.setBackgroundResource(R.drawable.document_state_one);
            type = "چک";
        } else if (c == 1) {
            holder.f۱۳۸۶۲w.setBackgroundResource(R.drawable.document_state_two);
            type = "سند ازدواج";
        } else if (c == 2) {
            holder.f۱۳۸۶۲w.setBackgroundResource(R.drawable.document_state_three);
            type = "اسناد سجلی";
        } else if (c == 3) {
            holder.f۱۳۸۶۲w.setBackgroundResource(R.drawable.document_state_four);
            type = "سایر مدارک";
        }
        holder.f۱۳۸۶۲w.setText(type);
        if (!this.f۱۳۸۵۸d.get(pos).m۱۷۶۶۴g().equals("")) {
            date_in = com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(this.f۱۳۸۵۸d.get(pos).m۱۷۶۶۴g())));
        } else {
            date_in = "-";
        }
        if (!this.f۱۳۸۵۸d.get(pos).m۱۷۶۵۷c().equals("")) {
            date_out = com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(this.f۱۳۸۵۸d.get(pos).m۱۷۶۵۷c())));
        } else {
            date_out = "-";
        }
        TextView textView = holder.f۱۳۸۶۱v;
        textView.setText("تاریخ دریافت: " + date_in);
        holder.f۱۳۸۶۳x.setText("تاریخ تحویل");
        holder.f۱۳۸۶۴y.setText(date_out);
        holder.f۱۳۸۶۱v.setTypeface(this.f۱۳۸۵۹e.m۱۷۷۴۶a());
        holder.f۱۳۸۶۲w.setTypeface(this.f۱۳۸۵۹e.m۱۷۷۴۶a());
        holder.f۱۳۸۶۳x.setTypeface(this.f۱۳۸۵۹e.m۱۷۷۴۶a());
        holder.f۱۳۸۶۴y.setTypeface(this.f۱۳۸۵۹e.m۱۷۷۴۸b());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۲۵a() {
        return this.f۱۳۸۵۸d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۲۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۲۸b(int position) {
        return position;
    }
}
