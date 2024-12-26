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
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCi;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.i  reason: invalid class name */
public class Ci extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۷۸c;

    /* renamed from: d  reason: contains not printable characters */
    private List<com.lawyer_smartCalendar.p۱۳۳d.Ci> f۱۳۸۷۹d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۸۸۰e = new Cf(this.f۱۳۸۷۸c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۳۸۸۱f = Calendar.getInstance();

    /* renamed from: g  reason: contains not printable characters */
    private View$OnClickListenerCi f۱۳۸۸۲g;

    /* renamed from: com.lawyer_smartCalendar.a.i$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۸۳v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۸۴w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۸۵x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۸۶y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۸۳v = (TextView) convertView.findViewById(R.id.textView_schedule_title);
            this.f۱۳۸۸۴w = (TextView) convertView.findViewById(R.id.textView_schedule_type);
            this.f۱۳۸۸۵x = (TextView) convertView.findViewById(R.id.textView_schedule_date);
            this.f۱۳۸۸۶y = (TextView) convertView.findViewById(R.id.textView_schedule_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Ci.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.i$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ci iVar) {
            }

            public void onClick(View view) {
                Intent frmSchedule = new Intent(Ci.this.f۱۳۸۷۸c, ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((com.lawyer_smartCalendar.p۱۳۳d.Ci) Ci.this.f۱۳۸۷۹d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۷۲۱e() + "");
                Ci.this.f۱۳۸۸۲g.m۱۷۵۳۳b(frmSchedule);
            }
        }
    }

    public Ci(Context Activity, View$OnClickListenerCi fragmentTab1, List<com.lawyer_smartCalendar.p۱۳۳d.Ci> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۷۸c = Activity;
        this.f۱۳۸۷۹d = list;
        this.f۱۳۸۸۲g = fragmentTab1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۴۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r3.equals("ProceedingsTimes") == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۱۵۱b(com.lawyer_smartCalendar.p۱۳۰a.Ci.Ca r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Ci.m۱۷۱۵۱b(com.lawyer_smartCalendar.a.i$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۴۵a() {
        return this.f۱۳۸۷۹d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۴۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۴۸b(int position) {
        return position;
    }
}
