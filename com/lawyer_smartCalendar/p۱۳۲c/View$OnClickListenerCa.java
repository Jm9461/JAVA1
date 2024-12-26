package com.lawyer_smartCalendar.p۱۳۲c;

import android.content.Intent;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.p۱۳۰a.Cd0;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ci;
import com.rey.material.widget.ImageView;
import java.util.List;
import p۱۵۵ir.mirrajabi.persiancalendar.PersianCalendarView;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCd;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cf;

/* renamed from: com.lawyer_smartCalendar.c.a  reason: invalid class name */
public class View$OnClickListenerCa extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private String f۱۴۴۷۸a0 = "";

    /* renamed from: b0  reason: contains not printable characters */
    private Cf f۱۴۴۷۹b0;

    /* renamed from: c0  reason: contains not printable characters */
    private ImageView f۱۴۴۸۰c0;

    /* renamed from: d0  reason: contains not printable characters */
    private ImageView f۱۴۴۸۱d0;

    /* renamed from: e0  reason: contains not printable characters */
    FloatingActionMenu f۱۴۴۸۲e0;

    /* renamed from: f0  reason: contains not printable characters */
    FloatingActionButton f۱۴۴۸۳f0;

    /* renamed from: g0  reason: contains not printable characters */
    FloatingActionButton f۱۴۴۸۴g0;

    /* renamed from: h0  reason: contains not printable characters */
    private RecyclerView f۱۴۴۸۵h0;

    /* renamed from: i0  reason: contains not printable characters */
    private PersianCalendarView f۱۴۴۸۶i0;

    /* renamed from: j0  reason: contains not printable characters */
    private TextView f۱۴۴۸۷j0;

    /* renamed from: k0  reason: contains not printable characters */
    private Cf f۱۴۴۸۸k0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۴۸۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab1, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۸۷a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۴۸۷j0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۴۸۰c0 = (ImageView) view.findViewById(R.id.img_prev);
        this.f۱۴۴۸۱d0 = (ImageView) view.findViewById(R.id.img_next);
        this.f۱۴۴۸۲e0 = (FloatingActionMenu) view.findViewById(R.id.FloatingActionMenu1);
        this.f۱۴۴۸۳f0 = (FloatingActionButton) view.findViewById(R.id.subFloatingMenu1);
        this.f۱۴۴۸۴g0 = (FloatingActionButton) view.findViewById(R.id.subFloatingMenu2);
        this.f۱۴۴۸۱d0.setOnClickListener(this);
        this.f۱۴۴۸۰c0.setOnClickListener(this);
        this.f۱۴۴۸۳f0.setOnClickListener(this);
        this.f۱۴۴۸۴g0.setOnClickListener(this);
        this.f۱۴۴۸۵h0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۴۸۵h0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        this.f۱۴۴۸۶i0 = (PersianCalendarView) view.findViewById(R.id.persian_calendar);
        p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb calendar = this.f۱۴۴۸۶i0.getCalendar();
        this.f۱۴۴۸۸k0 = calendar.m۱۹۷۲۱o();
        TextView txtDayMonth = (TextView) view.findViewById(R.id.txt_day_month);
        calendar.m۱۹۶۸۹a(new p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cb(this.f۱۴۴۸۸k0, "Custom event", false));
        calendar.m۱۹۶۸۰a(new Ca(txtDayMonth, calendar));
        this.f۱۴۴۸۶i0.setOnDayClickedListener(new Cb(calendar, txtDayMonth));
        calendar.m۱۹۶۸۱a(false);
        txtDayMonth.setText((calendar.m۱۹۶۸۳a((AbstractCa) this.f۱۴۴۸۸k0) + " ماه ") + " " + calendar.m۱۹۶۸۲a(this.f۱۴۴۸۸k0.m۱۹۷۹۹d()));
        calendar.m۱۹۶۹۹c(m۱۲۲۳۳v().getColor(R.color.colorPrimary));
        txtDayMonth.setTextColor(Cc.m۱۷۷۴۰c());
        m۱۷۴۸۸b(this.f۱۴۴۸۸k0.m۱۹۷۹۹d(), this.f۱۴۴۸۸k0.m۱۹۷۹۵b());
    }

    /* renamed from: com.lawyer_smartCalendar.c.a$a  reason: invalid class name */
    class Ca implements AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ TextView f۱۴۴۸۹a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb f۱۴۴۹۰b;

        Ca(TextView textView, p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb bVar) {
            this.f۱۴۴۸۹a = textView;
            this.f۱۴۴۹۰b = bVar;
        }

        @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۹۱a(Cf date) {
            View$OnClickListenerCa.this.f۱۴۴۷۹b0 = date;
            View$OnClickListenerCa.this.f۱۴۴۸۸k0 = date;
            TextView textView = this.f۱۴۴۸۹a;
            textView.setText(this.f۱۴۴۹۰b.m۱۹۶۸۳a((AbstractCa) date) + " ماه " + this.f۱۴۴۹۰b.m۱۹۶۸۲a(date.m۱۹۷۹۹d()));
            View$OnClickListenerCa.this.m۱۷۴۸۸b(date.m۱۹۷۹۹d(), date.m۱۹۷۹۵b());
            View$OnClickListenerCa.this.f۱۴۴۸۲e0.m۱۶۹۲۸a(false);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.a$b  reason: invalid class name */
    class Cb implements p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb f۱۴۴۹۲a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ TextView f۱۴۴۹۳b;

        Cb(p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb bVar, TextView textView) {
            this.f۱۴۴۹۲a = bVar;
            this.f۱۴۴۹۳b = textView;
        }

        @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۹۲a(Cf date) {
            TextView textView = this.f۱۴۴۹۳b;
            textView.setText((this.f۱۴۴۹۲a.m۱۹۶۹۳b((AbstractCa) date) + " " + this.f۱۴۴۹۲a.m۱۹۶۸۲a(date.m۱۹۷۹۷c()) + " " + this.f۱۴۴۹۲a.m۱۹۶۸۳a((AbstractCa) date)) + " ماه " + this.f۱۴۴۹۲a.m۱۹۶۸۲a(date.m۱۹۷۹۹d()));
            View$OnClickListenerCa.this.f۱۴۴۸۲e0.m۱۶۹۳۰b(true);
            com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb Pdate = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
            Pdate.m۱۸۰۰۶a(date.m۱۹۷۹۹d(), date.m۱۹۷۹۵b() - 1, date.m۱۹۷۹۷c());
            View$OnClickListenerCa.this.f۱۴۴۷۸a0 = Pdate.getTimeInMillis() + "";
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_next /*{ENCODED_INT: 2131296480}*/:
                this.f۱۴۴۸۶i0.m۱۹۶۶۵a();
                return;
            case R.id.img_prev /*{ENCODED_INT: 2131296482}*/:
                this.f۱۴۴۸۶i0.m۱۹۶۶۷b();
                return;
            case R.id.subFloatingMenu1 /*{ENCODED_INT: 2131296757}*/:
                this.f۱۴۴۸۲e0.m۱۶۹۲۸a(false);
                Intent frm_add = new Intent(m۱۲۱۹۷d(), AddProceedingsTimesActivity.class);
                frm_add.putExtra("frmMode", "add");
                if (!this.f۱۴۴۷۸a0.equals("")) {
                    frm_add.putExtra("date", this.f۱۴۴۷۸a0);
                }
                this.f۱۴۴۷۸a0 = "";
                m۱۷۴۸۹b(frm_add);
                return;
            case R.id.subFloatingMenu2 /*{ENCODED_INT: 2131296758}*/:
                this.f۱۴۴۸۲e0.m۱۶۹۲۸a(false);
                Intent frm_add_meeting = new Intent(m۱۲۱۹۷d(), AddMeetingActivity.class);
                frm_add_meeting.putExtra("frmMode", "add");
                if (!this.f۱۴۴۷۸a0.equals("")) {
                    frm_add_meeting.putExtra("date", this.f۱۴۴۷۸a0);
                }
                this.f۱۴۴۷۸a0 = "";
                m۱۷۴۸۹b(frm_add_meeting);
                return;
            default:
                return;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۴۸۸b(int year, int month) {
        com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb DateFirst = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
        com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb DateLast = new com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb();
        DateFirst.m۱۸۰۰۶a(year, month - 1, 1);
        DateLast.m۱۸۰۰۶a(year, month - 1, 1);
        DateLast.m۱۸۰۰۵a(5, com.lawyer_smartCalendar.p۱۳۱b.Cb.m۱۷۴۸۲a(month));
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Schedule> ScheduleList = db.m۱۷۷۶۳a(DateFirst.getTimeInMillis(), DateLast.getTimeInMillis());
        db.close();
        this.f۱۴۴۸۵h0.setAdapter(new Cd0(m۱۲۱۹۷d(), this, ScheduleList));
        if (ScheduleList.isEmpty()) {
            this.f۱۴۴۸۵h0.setVisibility(8);
            this.f۱۴۴۸۷j0.setVisibility(0);
            return;
        }
        this.f۱۴۴۸۵h0.setVisibility(0);
        this.f۱۴۴۸۷j0.setVisibility(8);
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۴۹۰d0() {
        m۱۷۴۸۸b(this.f۱۴۴۸۸k0.m۱۹۷۹۹d(), this.f۱۴۴۸۸k0.m۱۹۷۹۵b());
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۴۸۹b(Intent intent) {
        m۱۲۱۶۵a(intent);
    }
}
