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
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCa;
import com.lawyer_smartCalendar.p۱۳۳d.Ci;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.d0  reason: invalid class name */
public class Cd0 extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۷۹۵c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Ci> f۱۳۷۹۶d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۷۹۷e = new Cf(this.f۱۳۷۹۵c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۳۷۹۸f = Calendar.getInstance();

    /* renamed from: g  reason: contains not printable characters */
    private View$OnClickListenerCa f۱۳۷۹۹g;

    /* renamed from: com.lawyer_smartCalendar.a.d0$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۰۰v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۰۱w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۰۲x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۰۳y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۰۰v = (TextView) convertView.findViewById(R.id.textView_schedule_title);
            this.f۱۳۸۰۱w = (TextView) convertView.findViewById(R.id.textView_schedule_type);
            this.f۱۳۸۰۲x = (TextView) convertView.findViewById(R.id.textView_schedule_date);
            this.f۱۳۸۰۳y = (TextView) convertView.findViewById(R.id.textView_schedule_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cd0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.d0$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cd0 d0Var) {
            }

            public void onClick(View view) {
                Intent frmSchedule = new Intent(Cd0.this.f۱۳۷۹۵c, ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((Ci) Cd0.this.f۱۳۷۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۷۲۱e() + "");
                Cd0.this.f۱۳۷۹۹g.m۱۷۴۸۹b(frmSchedule);
            }
        }
    }

    public Cd0(Context Activity, View$OnClickListenerCa fragmentTab1, List<Ci> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۷۹۵c = Activity;
        this.f۱۳۷۹۶d = list;
        this.f۱۳۷۹۹g = fragmentTab1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۸۱b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r3.equals("ProceedingsTimes") == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۰۸۳b(com.lawyer_smartCalendar.p۱۳۰a.Cd0.Ca r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cd0.m۱۷۰۸۳b(com.lawyer_smartCalendar.a.d0$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۷۷a() {
        return this.f۱۳۷۹۶d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۰۷۸a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۰۸۰b(int position) {
        return position;
    }
}
