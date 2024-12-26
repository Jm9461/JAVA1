package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;
import com.lawyer_smartCalendar.d.i;
import com.lawyer_smartCalendar.utils.f;
import java.util.Calendar;
import java.util.List;

public class d0 extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۴۴c;

    /* renamed from: d  reason: collision with root package name */
    private List<i> f۲۹۴۵d;

    /* renamed from: e  reason: collision with root package name */
    private f f۲۹۴۶e = new f(this.f۲۹۴۴c);

    /* renamed from: f  reason: collision with root package name */
    private Calendar f۲۹۴۷f = Calendar.getInstance();

    /* renamed from: g  reason: collision with root package name */
    private com.lawyer_smartCalendar.c.a f۲۹۴۸g;

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_schedule_title);
            this.w = (TextView) convertView.findViewById(R.id.textView_schedule_type);
            this.x = (TextView) convertView.findViewById(R.id.textView_schedule_date);
            this.y = (TextView) convertView.findViewById(R.id.textView_schedule_hour);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۷۵a(d0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.d0$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۵a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۵a(d0 d0Var) {
            }

            public void onClick(View view) {
                Intent frmSchedule = new Intent(d0.this.f۲۹۴۴c, ScheduleDetailActivity.class);
                frmSchedule.putExtra("id", ((i) d0.this.f۲۹۴۵d.get(a.this.f())).e() + "");
                d0.this.f۲۹۴۸g.b(frmSchedule);
            }
        }
    }

    public d0(Context Activity, com.lawyer_smartCalendar.c.a fragmentTab1, List<i> list) {
        a(true);
        this.f۲۹۴۴c = Activity;
        this.f۲۹۴۵d = list;
        this.f۲۹۴۸g = fragmentTab1;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r3.equals("ProceedingsTimes") == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.lawyer_smartCalendar.a.d0.a r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.d0.b(com.lawyer_smartCalendar.a.d0$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۴۵d.size();
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public long a(int position) {
        return (long) position;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int b(int position) {
        return position;
    }
}
