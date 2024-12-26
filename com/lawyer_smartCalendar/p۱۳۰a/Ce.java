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
import com.lawyer_smartCalendar.p۱۳۳d.Cb;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.e  reason: invalid class name */
public class Ce extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۰۶c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cb> f۱۳۸۰۷d;

    /* renamed from: e  reason: contains not printable characters */
    private Ci f۱۳۸۰۸e = new Ci(this.f۱۳۸۰۶c);

    /* renamed from: f  reason: contains not printable characters */
    private Cf f۱۳۸۰۹f = new Cf(this.f۱۳۸۰۶c);

    /* renamed from: com.lawyer_smartCalendar.a.e$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۱۱v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۱۲w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۱۳x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۱۴y;

        /* renamed from: z  reason: contains not printable characters */
        LinearLayout f۱۳۸۱۵z;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۱۲w = (TextView) convertView.findViewById(R.id.txt_client);
            this.f۱۳۸۱۳x = (TextView) convertView.findViewById(R.id.txt_date);
            this.f۱۳۸۱۴y = (TextView) convertView.findViewById(R.id.txt_state);
            this.f۱۳۸۱۱v = (TextView) convertView.findViewById(R.id.txt_title);
            this.f۱۳۸۱۵z = (LinearLayout) convertView.findViewById(R.id.layout_state);
            convertView.setOnClickListener(new View$OnClickListenerCa(Ce.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.e$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ce eVar) {
            }

            public void onClick(View view) {
                Intent frm_case_detail = new Intent(Ce.this.f۱۳۸۰۶c, CaseDetailActivity.class);
                frm_case_detail.putExtra("id", ((Cb) Ce.this.f۱۳۸۰۷d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۲۶k() + "");
                Ce.this.f۱۳۸۰۶c.startActivity(frm_case_detail);
            }
        }
    }

    public Ce(Context Activity, List<Cb> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۰۶c = Activity;
        this.f۱۳۸۰۷d = list;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۹۰b(ViewGroup parent, int viewType) {
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
    public void m۱۷۰۹۲b(com.lawyer_smartCalendar.p۱۳۰a.Ce.Ca r10, int r11) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Ce.m۱۷۰۹۲b(com.lawyer_smartCalendar.a.e$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۸۶a() {
        return this.f۱۳۸۰۷d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۰۸۷a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۰۸۹b(int position) {
        return position;
    }
}
