package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;

public class j extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۹۰c;

    /* renamed from: d  reason: collision with root package name */
    private String[][] f۲۹۹۱d;

    /* renamed from: e  reason: collision with root package name */
    private String f۲۹۹۲e;

    public class a extends RecyclerView.d0 {
        TextView v;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_city_name);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۸۵a(j.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.j$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۸۵a implements View.OnClickListener {
            View$OnClickListenerC۰۰۸۵a(j jVar) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0082  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r7) {
                /*
                // Method dump skipped, instructions count: 190
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.j.a.View$OnClickListenerC۰۰۸۵a.onClick(android.view.View):void");
            }
        }
    }

    public j(Context Activity, String activityName, String[][] city_list) {
        a(true);
        this.f۲۹۹۰c = Activity;
        this.f۲۹۹۱d = city_list;
        this.f۲۹۹۲e = activityName;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.city_list_item, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int pos) {
        holder.v.setText(this.f۲۹۹۱d[pos][1]);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۹۱d.length;
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
