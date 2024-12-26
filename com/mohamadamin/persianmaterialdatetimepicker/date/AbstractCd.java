package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCe;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import java.util.HashMap;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.d  reason: invalid class name */
public abstract class AbstractCd extends BaseAdapter implements AbstractCe.AbstractCb {

    /* renamed from: c  reason: contains not printable characters */
    private final Context f۱۴۹۱۲c;

    /* renamed from: d  reason: contains not printable characters */
    protected final AbstractCa f۱۴۹۱۳d;

    /* renamed from: e  reason: contains not printable characters */
    private Ca f۱۴۹۱۴e;

    /* renamed from: a  reason: contains not printable characters */
    public abstract AbstractCe m۱۷۹۴۴a(Context context);

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.d$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private Cb f۱۴۹۱۵a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۴۹۱۶b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۴۹۱۷c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۴۹۱۸d;

        public Ca() {
            m۱۷۹۴۹a(System.currentTimeMillis());
        }

        public Ca(long timeInMillis) {
            m۱۷۹۴۹a(timeInMillis);
        }

        public Ca(Cb calendar) {
            this.f۱۴۹۱۶b = calendar.m۱۸۰۱۳h();
            this.f۱۴۹۱۷c = calendar.m۱۸۰۰۹d();
            this.f۱۴۹۱۸d = calendar.m۱۸۰۰۷b();
        }

        public Ca(int year, int month, int day) {
            m۱۷۹۵۰a(year, month, day);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۵۱a(Ca date) {
            this.f۱۴۹۱۶b = date.f۱۴۹۱۶b;
            this.f۱۴۹۱۷c = date.f۱۴۹۱۷c;
            this.f۱۴۹۱۸d = date.f۱۴۹۱۸d;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۹۵۰a(int year, int month, int day) {
            this.f۱۴۹۱۶b = year;
            this.f۱۴۹۱۷c = month;
            this.f۱۴۹۱۸d = day;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۷۹۴۹a(long timeInMillis) {
            if (this.f۱۴۹۱۵a == null) {
                this.f۱۴۹۱۵a = new Cb();
            }
            this.f۱۴۹۱۵a.setTimeInMillis(timeInMillis);
            this.f۱۴۹۱۷c = this.f۱۴۹۱۵a.m۱۸۰۰۹d();
            this.f۱۴۹۱۶b = this.f۱۴۹۱۵a.m۱۸۰۱۳h();
            this.f۱۴۹۱۸d = this.f۱۴۹۱۵a.m۱۸۰۰۷b();
        }
    }

    public AbstractCd(Context context, AbstractCa controller) {
        this.f۱۴۹۱۲c = context;
        this.f۱۴۹۱۳d = controller;
        m۱۷۹۴۵a();
        m۱۷۹۴۸b(this.f۱۴۹۱۳d.m۱۷۹۰۳e());
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۹۴۸b(Ca day) {
        this.f۱۴۹۱۴e = day;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۴۵a() {
        this.f۱۴۹۱۴e = new Ca(System.currentTimeMillis());
    }

    public int getCount() {
        return ((this.f۱۴۹۱۳d.m۱۷۹۰۷i() - this.f۱۴۹۱۳d.m۱۷۸۹۶a()) + 1) * 12;
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
        AbstractCe v;
        HashMap<String, Integer> drawingParams = null;
        if (convertView != null) {
            v = (AbstractCe) convertView;
            drawingParams = (HashMap) v.getTag();
        } else {
            v = m۱۷۹۴۴a(this.f۱۴۹۱۲c);
            v.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            v.setClickable(true);
            v.setOnDayClickListener(this);
        }
        if (drawingParams == null) {
            drawingParams = new HashMap<>();
        }
        drawingParams.clear();
        int month = position % 12;
        int year = (position / 12) + this.f۱۴۹۱۳d.m۱۷۸۹۶a();
        int selectedDay = -1;
        if (m۱۷۹۴۳a(year, month)) {
            selectedDay = this.f۱۴۹۱۴e.f۱۴۹۱۸d;
        }
        v.m۱۷۹۷۱d();
        drawingParams.put("selected_day", Integer.valueOf(selectedDay));
        drawingParams.put("year", Integer.valueOf(year));
        drawingParams.put("month", Integer.valueOf(month));
        drawingParams.put("week_start", Integer.valueOf(this.f۱۴۹۱۳d.m۱۷۹۰۰b()));
        v.setMonthParams(drawingParams);
        v.invalidate();
        return v;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۷۹۴۳a(int year, int month) {
        Ca aVar = this.f۱۴۹۱۴e;
        return aVar.f۱۴۹۱۶b == year && aVar.f۱۴۹۱۷c == month;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCe.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۴۷a(AbstractCe view, Ca day) {
        if (day != null) {
            m۱۷۹۴۶a(day);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۴۶a(Ca day) {
        this.f۱۴۹۱۳d.m۱۷۹۰۶h();
        this.f۱۴۹۱۳d.m۱۷۸۹۸a(day.f۱۴۹۱۶b, day.f۱۴۹۱۷c, day.f۱۴۹۱۸d);
        m۱۷۹۴۸b(day);
    }
}
