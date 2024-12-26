package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCa;
import com.lawyer_smartCalendar.p۲۸۹d.Ci;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.d0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd0 extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۷۹۵c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Ci> f۱۳۷۹۶d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۷۹۷e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۳۷۹۸f;

    /* renamed from: g, reason: contains not printable characters */
    private ViewOnClickListenerCa f۱۳۷۹۹g;

    /* renamed from: com.lawyer_smartCalendar.a.d0$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۸۰۰v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۸۰۱w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۸۰۲x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۸۰۳y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۰۰v = (TextView) convertView.findViewById(2131296808);
            this.f۱۳۸۰۱w = (TextView) convertView.findViewById(2131296809);
            this.f۱۳۸۰۲x = (TextView) convertView.findViewById(2131296806);
            this.f۱۳۸۰۳y = (TextView) convertView.findViewById(2131296807);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۳۹a(Cd0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.d0$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۳۹a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۳۹a(Cd0 cd0) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmSchedule = new Intent(Cd0.this.f۱۳۷۹۵c, (Class<?>) ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((Ci) Cd0.this.f۱۳۷۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۴۳e() + "");
                Cd0.this.f۱۳۷۹۹g.m۱۵۴۱۱b(frmSchedule);
            }
        }
    }

    public Cd0(Context Activity, ViewOnClickListenerCa fragmentTab1, List<Ci> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۷۹۵c = Activity;
        this.f۱۳۷۹۶d = list;
        this.f۱۳۷۹۹g = fragmentTab1;
        this.f۱۳۷۹۷e = new Cf(this.f۱۳۷۹۵c);
        this.f۱۳۷۹۸f = Calendar.getInstance();
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
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Cd0.a r9, int r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cd0.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.d0$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۷۹۶d.size();
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
