package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۳d.Cb;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.r  reason: invalid class name */
public class Cr extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۶۶c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cb> f۱۳۹۶۷d;

    /* renamed from: e  reason: contains not printable characters */
    private String f۱۳۹۶۸e;

    /* renamed from: f  reason: contains not printable characters */
    private Cf f۱۳۹۶۹f = new Cf(this.f۱۳۹۶۶c);

    /* renamed from: com.lawyer_smartCalendar.a.r$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۷۰v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۹۷۱w;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۷۰v = (TextView) convertView.findViewById(R.id.textView_case_title);
            this.f۱۳۹۷۱w = (TextView) convertView.findViewById(R.id.textView_case_date);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cr.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.r$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cr rVar) {
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
                if (r2.equals("AddClientDocumentsActivity") != false) goto L_0x00de;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r12) {
                /*
                // Method dump skipped, instructions count: 792
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cr.Ca.View$OnClickListenerCa.onClick(android.view.View):void");
            }
        }
    }

    public Cr(Context Activity, String activityName, List<Cb> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۶۶c = Activity;
        this.f۱۳۹۶۷d = list;
        this.f۱۳۹۶۸e = activityName;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۳۵b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.case_list_item_input, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۲۳۷b(Ca holder, int pos) {
        char c;
        String title = "";
        String o = this.f۱۳۹۶۷d.get(pos).m۱۷۶۳۲o();
        switch (o.hashCode()) {
            case -1955878649:
                if (o.equals("Normal")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -888366013:
                if (o.equals("Challenge")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2062940:
                if (o.equals("Bank")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 912993224:
                if (o.equals("Executive")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            title = "عادی";
        } else if (c == 1) {
            title = "اجرایی";
        } else if (c == 2) {
            title = "معاضدتی/تسخیری";
        } else if (c == 3) {
            title = "بانکی";
        }
        holder.f۱۳۹۷۰v.setText(title);
        TextView textView = holder.f۱۳۹۷۱w;
        textView.setText("تاریخ تشکیل پرونده: " + com.lawyer_smartCalendar.p۱۳۱b.Ca.m۱۷۴۸۱a(Long.valueOf(Long.parseLong(this.f۱۳۹۶۷d.get(pos).m۱۷۶۲۴j()))));
        holder.f۱۳۹۷۰v.setTypeface(this.f۱۳۹۶۹f.m۱۷۷۴۶a());
        holder.f۱۳۹۷۱w.setTypeface(this.f۱۳۹۶۹f.m۱۷۷۴۹c());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۳۱a() {
        return this.f۱۳۹۶۷d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۲۳۲a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۳۴b(int position) {
        return position;
    }
}
