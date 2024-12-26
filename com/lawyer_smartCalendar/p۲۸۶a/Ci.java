package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCi;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۸۷۸c;

    /* renamed from: d, reason: contains not printable characters */
    private List<com.lawyer_smartCalendar.p۲۸۹d.Ci> f۱۳۸۷۹d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۸۸۰e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۳۸۸۱f;

    /* renamed from: g, reason: contains not printable characters */
    private ViewOnClickListenerCi f۱۳۸۸۲g;

    /* renamed from: com.lawyer_smartCalendar.a.i$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۸۸۳v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۸۸۴w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۸۸۵x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۸۸۶y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۸۳v = (TextView) convertView.findViewById(2131296808);
            this.f۱۳۸۸۴w = (TextView) convertView.findViewById(2131296809);
            this.f۱۳۸۸۵x = (TextView) convertView.findViewById(2131296806);
            this.f۱۳۸۸۶y = (TextView) convertView.findViewById(2131296807);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۴۸a(Ci.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.i$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۴۸a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۴۸a(Ci ci) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmSchedule = new Intent(Ci.this.f۱۳۸۷۸c, (Class<?>) ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((com.lawyer_smartCalendar.p۲۸۹d.Ci) Ci.this.f۱۳۸۷۹d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۴۳e() + "");
                Ci.this.f۱۳۸۸۲g.m۱۵۴۵۵b(frmSchedule);
            }
        }
    }

    public Ci(Context Activity, ViewOnClickListenerCi fragmentTab1, List<com.lawyer_smartCalendar.p۲۸۹d.Ci> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۸۷۸c = Activity;
        this.f۱۳۸۷۹d = list;
        this.f۱۳۸۸۲g = fragmentTab1;
        this.f۱۳۸۸۰e = new Cf(this.f۱۳۸۷۸c);
        this.f۱۳۸۸۱f = Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493037, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        if (r3.equals("ProceedingsTimes") == false) goto L۱۷;
     */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Ci.a r9, int r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Ci.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.i$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۷۹d.size();
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
