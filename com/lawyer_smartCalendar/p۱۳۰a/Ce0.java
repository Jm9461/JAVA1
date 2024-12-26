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
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۱۳۳d.Ci;
import com.lawyer_smartCalendar.utils.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.e0  reason: invalid class name */
public class Ce0 extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۱۷c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Ci> f۱۳۸۱۸d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۸۱۹e = new Cf(this.f۱۳۸۱۷c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۳۸۲۰f = Calendar.getInstance();

    /* renamed from: com.lawyer_smartCalendar.a.e0$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۸۲۱v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۲۲w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۲۳x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۲۴y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۲۱v = (TextView) convertView.findViewById(R.id.textView_schedule_title);
            this.f۱۳۸۲۲w = (TextView) convertView.findViewById(R.id.textView_schedule_type);
            this.f۱۳۸۲۳x = (TextView) convertView.findViewById(R.id.textView_schedule_date);
            this.f۱۳۸۲۴y = (TextView) convertView.findViewById(R.id.textView_schedule_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Ce0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.e0$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ce0 e0Var) {
            }

            public void onClick(View view) {
                Intent frmSchedule = new Intent(Ce0.this.f۱۳۸۱۷c, ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((Ci) Ce0.this.f۱۳۸۱۸d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۷۲۱e() + "");
                ((SearchActivity) Ce0.this.f۱۳۸۱۷c).m۱۷۴۶۸c(frmSchedule);
            }
        }
    }

    public Ce0(Context Activity, List<Ci> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۸۱۷c = Activity;
        this.f۱۳۸۱۸d = list;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۹۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r3.equals("ProceedingsTimes") == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۱۰۱b(com.lawyer_smartCalendar.p۱۳۰a.Ce0.Ca r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Ce0.m۱۷۱۰۱b(com.lawyer_smartCalendar.a.e0$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۹۵a() {
        return this.f۱۳۸۱۸d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۰۹۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۰۹۸b(int position) {
        return position;
    }
}
