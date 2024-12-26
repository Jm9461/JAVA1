package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.mohamadamin.persianmaterialdatetimepicker.date.e;
import com.mohamadamin.persianmaterialdatetimepicker.j.b;
import java.util.HashMap;

public abstract class d extends BaseAdapter implements e.b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f۳۳۳۸c;

    /* renamed from: d  reason: collision with root package name */
    protected final a f۳۳۳۹d;

    /* renamed from: e  reason: collision with root package name */
    private a f۳۳۴۰e;

    public abstract e a(Context context);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private b f۳۳۴۱a;

        /* renamed from: b  reason: collision with root package name */
        int f۳۳۴۲b;

        /* renamed from: c  reason: collision with root package name */
        int f۳۳۴۳c;

        /* renamed from: d  reason: collision with root package name */
        int f۳۳۴۴d;

        public a() {
            a(System.currentTimeMillis());
        }

        public a(long timeInMillis) {
            a(timeInMillis);
        }

        public a(b calendar) {
            this.f۳۳۴۲b = calendar.h();
            this.f۳۳۴۳c = calendar.d();
            this.f۳۳۴۴d = calendar.b();
        }

        public a(int year, int month, int day) {
            a(year, month, day);
        }

        public void a(a date) {
            this.f۳۳۴۲b = date.f۳۳۴۲b;
            this.f۳۳۴۳c = date.f۳۳۴۳c;
            this.f۳۳۴۴d = date.f۳۳۴۴d;
        }

        public void a(int year, int month, int day) {
            this.f۳۳۴۲b = year;
            this.f۳۳۴۳c = month;
            this.f۳۳۴۴d = day;
        }

        private void a(long timeInMillis) {
            if (this.f۳۳۴۱a == null) {
                this.f۳۳۴۱a = new b();
            }
            this.f۳۳۴۱a.setTimeInMillis(timeInMillis);
            this.f۳۳۴۳c = this.f۳۳۴۱a.d();
            this.f۳۳۴۲b = this.f۳۳۴۱a.h();
            this.f۳۳۴۴d = this.f۳۳۴۱a.b();
        }
    }

    public d(Context context, a controller) {
        this.f۳۳۳۸c = context;
        this.f۳۳۳۹d = controller;
        a();
        b(this.f۳۳۳۹d.e());
    }

    public void b(a day) {
        this.f۳۳۴۰e = day;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f۳۳۴۰e = new a(System.currentTimeMillis());
    }

    public int getCount() {
        return ((this.f۳۳۳۹d.i() - this.f۳۳۳۹d.a()) + 1) * 12;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public boolean hasStableIds() {
        return true;
    }

    @SuppressLint({"NewApi"})
    public View getView(int position, View convertView, ViewGroup parent) {
        e v;
        HashMap<String, Integer> drawingParams = null;
        if (convertView != null) {
            v = (e) convertView;
            drawingParams = (HashMap) v.getTag();
        } else {
            v = a(this.f۳۳۳۸c);
            v.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            v.setClickable(true);
            v.setOnDayClickListener(this);
        }
        if (drawingParams == null) {
            drawingParams = new HashMap<>();
        }
        drawingParams.clear();
        int month = position % 12;
        int year = (position / 12) + this.f۳۳۳۹d.a();
        int selectedDay = -1;
        if (a(year, month)) {
            selectedDay = this.f۳۳۴۰e.f۳۳۴۴d;
        }
        v.d();
        drawingParams.put("selected_day", Integer.valueOf(selectedDay));
        drawingParams.put("year", Integer.valueOf(year));
        drawingParams.put("month", Integer.valueOf(month));
        drawingParams.put("week_start", Integer.valueOf(this.f۳۳۳۹d.b()));
        v.setMonthParams(drawingParams);
        v.invalidate();
        return v;
    }

    private boolean a(int year, int month) {
        a aVar = this.f۳۳۴۰e;
        return aVar.f۳۳۴۲b == year && aVar.f۳۳۴۳c == month;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.e.b
    public void a(e view, a day) {
        if (day != null) {
            a(day);
        }
    }

    /* access modifiers changed from: protected */
    public void a(a day) {
        this.f۳۳۳۹d.h();
        this.f۳۳۳۹d.a(day.f۳۳۴۲b, day.f۳۳۴۳c, day.f۳۳۴۴d);
        b(day);
    }
}
