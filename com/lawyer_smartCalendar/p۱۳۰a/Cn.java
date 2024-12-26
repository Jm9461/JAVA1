package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCm;
import com.lawyer_smartCalendar.p۱۳۳d.Ci;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.n  reason: invalid class name */
public class Cn extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۳۳c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Ci> f۱۳۹۳۴d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۹۳۵e = new Cf(this.f۱۳۹۳۳c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۳۹۳۶f = Calendar.getInstance();

    /* renamed from: g  reason: contains not printable characters */
    private View$OnClickListenerCm f۱۳۹۳۷g;

    /* renamed from: com.lawyer_smartCalendar.a.n$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۳۸v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۹۳۹w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۹۴۰x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۹۴۱y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۳۸v = (TextView) convertView.findViewById(R.id.textView_schedule_title);
            this.f۱۳۹۳۹w = (TextView) convertView.findViewById(R.id.textView_schedule_type);
            this.f۱۳۹۴۰x = (TextView) convertView.findViewById(R.id.textView_schedule_date);
            this.f۱۳۹۴۱y = (TextView) convertView.findViewById(R.id.textView_schedule_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cn.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.n$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cn nVar) {
            }

            public void onClick(View view) {
                Intent frmSchedule = new Intent(Cn.this.f۱۳۹۳۳c, ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((Ci) Cn.this.f۱۳۹۳۴d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۷۲۱e() + "");
                Cn.this.f۱۳۹۳۷g.m۱۷۵۵۲b(frmSchedule);
            }
        }
    }

    public Cn(Context Activity, View$OnClickListenerCm fragmentTab1, List<Ci> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۳۳c = Activity;
        this.f۱۳۹۳۴d = list;
        this.f۱۳۹۳۷g = fragmentTab1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۰۱b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r3.equals("ProceedingsTimes") == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۲۰۳b(com.lawyer_smartCalendar.p۱۳۰a.Cn.Ca r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cn.m۱۷۲۰۳b(com.lawyer_smartCalendar.a.n$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۹۷a() {
        return this.f۱۳۹۳۴d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۹۸a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۰۰b(int position) {
        return position;
    }
}
