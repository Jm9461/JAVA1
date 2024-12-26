package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCm;
import com.lawyer_smartCalendar.p۲۸۹d.Ci;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cn extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۳۳c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Ci> f۱۳۹۳۴d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۹۳۵e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۳۹۳۶f;

    /* renamed from: g, reason: contains not printable characters */
    private ViewOnClickListenerCm f۱۳۹۳۷g;

    /* renamed from: com.lawyer_smartCalendar.a.n$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۳۸v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۹۳۹w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۹۴۰x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۹۴۱y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۳۸v = (TextView) convertView.findViewById(2131296808);
            this.f۱۳۹۳۹w = (TextView) convertView.findViewById(2131296809);
            this.f۱۳۹۴۰x = (TextView) convertView.findViewById(2131296806);
            this.f۱۳۹۴۱y = (TextView) convertView.findViewById(2131296807);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۵۷a(Cn.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.n$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۵۷a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۵۷a(Cn cn) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmSchedule = new Intent(Cn.this.f۱۳۹۳۳c, (Class<?>) ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((Ci) Cn.this.f۱۳۹۳۴d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۴۳e() + "");
                Cn.this.f۱۳۹۳۷g.m۱۵۴۷۴b(frmSchedule);
            }
        }
    }

    public Cn(Context Activity, ViewOnClickListenerCm fragmentTab1, List<Ci> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۹۳۳c = Activity;
        this.f۱۳۹۳۴d = list;
        this.f۱۳۹۳۷g = fragmentTab1;
        this.f۱۳۹۳۵e = new Cf(this.f۱۳۹۳۳c);
        this.f۱۳۹۳۶f = Calendar.getInstance();
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
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Cn.a r9, int r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cn.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.n$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۳۴d.size();
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
