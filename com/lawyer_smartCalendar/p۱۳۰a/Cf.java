package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۱۳۳d.Cb;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.f  reason: invalid class name */
public class Cf extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۲۷c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cb> f۱۳۸۲۸d;

    /* renamed from: e  reason: contains not printable characters */
    private Ci f۱۳۸۲۹e = new Ci(this.f۱۳۸۲۷c);

    /* renamed from: f  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۳۸۳۰f = new com.lawyer_smartCalendar.utils.Cf(this.f۱۳۸۲۷c);

    /* renamed from: com.lawyer_smartCalendar.a.f$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۳۲v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۳۳w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۳۴x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۳۵y;

        /* renamed from: z  reason: contains not printable characters */
        LinearLayout f۱۳۸۳۶z;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۳۳w = (TextView) convertView.findViewById(R.id.txt_client);
            this.f۱۳۸۳۴x = (TextView) convertView.findViewById(R.id.txt_date);
            this.f۱۳۸۳۵y = (TextView) convertView.findViewById(R.id.txt_state);
            this.f۱۳۸۳۲v = (TextView) convertView.findViewById(R.id.txt_title);
            this.f۱۳۸۳۶z = (LinearLayout) convertView.findViewById(R.id.layout_state);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cf.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.f$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cf fVar) {
            }

            public void onClick(View view) {
                Intent frm_case_detail = new Intent(Cf.this.f۱۳۸۲۷c, CaseDetailActivity.class);
                frm_case_detail.putExtra("id", ((Cb) Cf.this.f۱۳۸۲۸d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۲۶k() + "");
                ((SearchActivity) Cf.this.f۱۳۸۲۷c).m۱۷۴۶۸c(frm_case_detail);
            }
        }
    }

    public Cf(Context Activity, List<Cb> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۲۷c = Activity;
        this.f۱۳۸۲۸d = list;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۰۸b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.case_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        if (r4.equals("Stream") != false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۱۱۰b(com.lawyer_smartCalendar.p۱۳۰a.Cf.Ca r10, int r11) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cf.m۱۷۱۱۰b(com.lawyer_smartCalendar.a.f$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۰۴a() {
        return this.f۱۳۸۲۸d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۰۵a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۰۷b(int position) {
        return position;
    }
}
