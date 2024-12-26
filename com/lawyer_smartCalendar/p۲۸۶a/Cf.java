package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۲۸۹d.Cb;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۸۲۷c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cb> f۱۳۸۲۸d;

    /* renamed from: e, reason: contains not printable characters */
    private Ci f۱۳۸۲۹e;

    /* renamed from: f, reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۳۸۳۰f;

    /* renamed from: com.lawyer_smartCalendar.a.f$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۸۳۲v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۸۳۳w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۸۳۴x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۸۳۵y;

        /* renamed from: z, reason: contains not printable characters */
        LinearLayout f۱۳۸۳۶z;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۳۳w = (TextView) convertView.findViewById(2131296858);
            this.f۱۳۸۳۴x = (TextView) convertView.findViewById(2131296859);
            this.f۱۳۸۳۵y = (TextView) convertView.findViewById(2131296871);
            this.f۱۳۸۳۲v = (TextView) convertView.findViewById(2131296873);
            this.f۱۳۸۳۶z = (LinearLayout) convertView.findViewById(2131296560);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۴۲a(Cf.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.f$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۴۲a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۴۲a(Cf cf) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frm_case_detail = new Intent(Cf.this.f۱۳۸۲۷c, (Class<?>) CaseDetailActivity.class);
                frm_case_detail.putExtra("id", ((Cb) Cf.this.f۱۳۸۲۸d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۴۸k() + "");
                ((SearchActivity) Cf.this.f۱۳۸۲۷c).m۱۵۳۹۰c(frm_case_detail);
            }
        }
    }

    public Cf(Context Activity, List<Cb> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۸۲۷c = Activity;
        this.f۱۳۸۲۸d = list;
        this.f۱۳۸۳۰f = new com.lawyer_smartCalendar.utils.Cf(this.f۱۳۸۲۷c);
        this.f۱۳۸۲۹e = new Ci(this.f۱۳۸۲۷c);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492941, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        if (r4.equals("Stream") != false) goto L۳۹;
     */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Cf.a r10, int r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cf.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.f$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۲۸d.size();
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
