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
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCn;
import com.lawyer_smartCalendar.p۱۳۳d.Cd;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.o  reason: invalid class name */
public class Co extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۴۴c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cd> f۱۳۹۴۵d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۹۴۶e = new Cf(this.f۱۳۹۴۴c);

    /* renamed from: f  reason: contains not printable characters */
    private View$OnClickListenerCn f۱۳۹۴۷f;

    /* renamed from: com.lawyer_smartCalendar.a.o$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۴۸v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۹۴۹w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۹۵۰x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۹۵۱y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۴۸v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.f۱۳۹۴۹w = (TextView) convertView.findViewById(R.id.textView_document_type);
            this.f۱۳۹۵۰x = (TextView) convertView.findViewById(R.id.textView_date);
            this.f۱۳۹۵۱y = (TextView) convertView.findViewById(R.id.textView_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Co.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.o$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Co oVar) {
            }

            public void onClick(View view) {
                Intent frmDocument = new Intent(Co.this.f۱۳۹۴۴c, DocumentDetailActivity.class);
                frmDocument.putExtra("id", ((Cd) Co.this.f۱۳۹۴۵d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۶۲e() + "");
                Co.this.f۱۳۹۴۷f.m۱۷۵۵۷b(frmDocument);
            }
        }
    }

    public Co(Context Activity, View$OnClickListenerCn fragmentTab1, List<Cd> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۴۴c = Activity;
        this.f۱۳۹۴۵d = list;
        this.f۱۳۹۴۷f = fragmentTab1;
        new Ci(this.f۱۳۹۴۴c);
        Calendar.getInstance();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۱۱b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.document_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۱۳b(Ca holder, int pos) {
        char c;
        String date_in;
        String type = "";
        String d = this.f۱۳۹۴۵d.get(pos).m۱۷۶۶۰d();
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
            holder.f۱۳۹۴۹w.setBackgroundResource(R.drawable.document_state_one);
            type = "چک";
        } else if (c == 1) {
            holder.f۱۳۹۴۹w.setBackgroundResource(R.drawable.document_state_two);
            type = "سند ازدواج";
        } else if (c == 2) {
            holder.f۱۳۹۴۹w.setBackgroundResource(R.drawable.document_state_three);
            type = "اسناد سجلی";
        } else if (c == 3) {
            holder.f۱۳۹۴۹w.setBackgroundResource(R.drawable.document_state_four);
            type = "سایر مدارک";
        }
        holder.f۱۳۹۴۹w.setText(type);
        if (!this.f۱۳۹۴۵d.get(pos).m۱۷۶۶۴g().equals("")) {
            date_in = com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(this.f۱۳۹۴۵d.get(pos).m۱۷۶۶۴g())));
        } else {
            date_in = "-";
        }
        TextView textView = holder.f۱۳۹۴۸v;
        textView.setText("تاریخ دریافت: " + date_in);
        holder.f۱۳۹۵۰x.setText("تاریخ تحویل");
        String date_out = "-";
        try {
            if (!this.f۱۳۹۴۵d.get(pos).m۱۷۶۵۷c().equals("")) {
                date_out = com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(this.f۱۳۹۴۵d.get(pos).m۱۷۶۵۷c())));
            } else {
                date_out = "-";
            }
        } catch (Exception e) {
        }
        holder.f۱۳۹۵۱y.setText(date_out);
        holder.f۱۳۹۴۸v.setTypeface(this.f۱۳۹۴۶e.m۱۷۷۴۶a());
        holder.f۱۳۹۴۹w.setTypeface(this.f۱۳۹۴۶e.m۱۷۷۴۶a());
        holder.f۱۳۹۵۰x.setTypeface(this.f۱۳۹۴۶e.m۱۷۷۴۶a());
        holder.f۱۳۹۵۱y.setTypeface(this.f۱۳۹۴۶e.m۱۷۷۴۸b());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۰۷a() {
        return this.f۱۳۹۴۵d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۲۰۸a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۱۰b(int position) {
        return position;
    }
}
