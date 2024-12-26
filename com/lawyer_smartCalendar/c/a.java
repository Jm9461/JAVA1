package com.lawyer_smartCalendar.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.a.d0;
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.utils.c;
import com.lawyer_smartCalendar.utils.i;
import com.rey.material.widget.ImageView;
import ir.mirrajabi.persiancalendar.PersianCalendarView;
import ir.mirrajabi.persiancalendar.f.f.d;
import java.util.List;

public class a extends f implements View.OnClickListener {
    private String a0 = "";
    private ir.mirrajabi.persiancalendar.f.g.f b0;
    private ImageView c0;
    private ImageView d0;
    FloatingActionMenu e0;
    FloatingActionButton f0;
    FloatingActionButton g0;
    private RecyclerView h0;
    private PersianCalendarView i0;
    private TextView j0;
    private ir.mirrajabi.persiancalendar.f.g.f k0;

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab1, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        new i(d());
        this.j0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.c0 = (ImageView) view.findViewById(R.id.img_prev);
        this.d0 = (ImageView) view.findViewById(R.id.img_next);
        this.e0 = (FloatingActionMenu) view.findViewById(R.id.FloatingActionMenu1);
        this.f0 = (FloatingActionButton) view.findViewById(R.id.subFloatingMenu1);
        this.g0 = (FloatingActionButton) view.findViewById(R.id.subFloatingMenu2);
        this.d0.setOnClickListener(this);
        this.c0.setOnClickListener(this);
        this.f0.setOnClickListener(this);
        this.g0.setOnClickListener(this);
        this.h0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.h0.setLayoutManager(new LinearLayoutManager(d()));
        this.i0 = (PersianCalendarView) view.findViewById(R.id.persian_calendar);
        ir.mirrajabi.persiancalendar.f.b calendar = this.i0.getCalendar();
        this.k0 = calendar.o();
        TextView txtDayMonth = (TextView) view.findViewById(R.id.txt_day_month);
        calendar.a(new ir.mirrajabi.persiancalendar.f.g.b(this.k0, "Custom event", false));
        calendar.a(new C۰۱۰۴a(txtDayMonth, calendar));
        this.i0.setOnDayClickedListener(new b(calendar, txtDayMonth));
        calendar.a(false);
        txtDayMonth.setText((calendar.a((ir.mirrajabi.persiancalendar.f.g.a) this.k0) + " ماه ") + " " + calendar.a(this.k0.d()));
        calendar.c(v().getColor(R.color.colorPrimary));
        txtDayMonth.setTextColor(c.c());
        b(this.k0.d(), this.k0.b());
    }

    /* renamed from: com.lawyer_smartCalendar.c.a$a  reason: collision with other inner class name */
    class C۰۱۰۴a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f۳۱۶۶a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ir.mirrajabi.persiancalendar.f.b f۳۱۶۷b;

        C۰۱۰۴a(TextView textView, ir.mirrajabi.persiancalendar.f.b bVar) {
            this.f۳۱۶۶a = textView;
            this.f۳۱۶۷b = bVar;
        }

        @Override // ir.mirrajabi.persiancalendar.f.f.d
        public void a(ir.mirrajabi.persiancalendar.f.g.f date) {
            a.this.b0 = date;
            a.this.k0 = date;
            TextView textView = this.f۳۱۶۶a;
            textView.setText(this.f۳۱۶۷b.a((ir.mirrajabi.persiancalendar.f.g.a) date) + " ماه " + this.f۳۱۶۷b.a(date.d()));
            a.this.b(date.d(), date.b());
            a.this.e0.a(false);
        }
    }

    class b implements ir.mirrajabi.persiancalendar.f.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ir.mirrajabi.persiancalendar.f.b f۳۱۶۹a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f۳۱۷۰b;

        b(ir.mirrajabi.persiancalendar.f.b bVar, TextView textView) {
            this.f۳۱۶۹a = bVar;
            this.f۳۱۷۰b = textView;
        }

        @Override // ir.mirrajabi.persiancalendar.f.f.a
        public void a(ir.mirrajabi.persiancalendar.f.g.f date) {
            TextView textView = this.f۳۱۷۰b;
            textView.setText((this.f۳۱۶۹a.b((ir.mirrajabi.persiancalendar.f.g.a) date) + " " + this.f۳۱۶۹a.a(date.c()) + " " + this.f۳۱۶۹a.a((ir.mirrajabi.persiancalendar.f.g.a) date)) + " ماه " + this.f۳۱۶۹a.a(date.d()));
            a.this.e0.b(true);
            com.mohamadamin.persianmaterialdatetimepicker.j.b Pdate = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
            Pdate.a(date.d(), date.b() - 1, date.c());
            a.this.a0 = Pdate.getTimeInMillis() + "";
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_next /*{ENCODED_INT: 2131296480}*/:
                this.i0.a();
                return;
            case R.id.img_prev /*{ENCODED_INT: 2131296482}*/:
                this.i0.b();
                return;
            case R.id.subFloatingMenu1 /*{ENCODED_INT: 2131296757}*/:
                this.e0.a(false);
                Intent frm_add = new Intent(d(), AddProceedingsTimesActivity.class);
                frm_add.putExtra("frmMode", "add");
                if (!this.a0.equals("")) {
                    frm_add.putExtra("date", this.a0);
                }
                this.a0 = "";
                b(frm_add);
                return;
            case R.id.subFloatingMenu2 /*{ENCODED_INT: 2131296758}*/:
                this.e0.a(false);
                Intent frm_add_meeting = new Intent(d(), AddMeetingActivity.class);
                frm_add_meeting.putExtra("frmMode", "add");
                if (!this.a0.equals("")) {
                    frm_add_meeting.putExtra("date", this.a0);
                }
                this.a0 = "";
                b(frm_add_meeting);
                return;
            default:
                return;
        }
    }

    public void b(int year, int month) {
        com.mohamadamin.persianmaterialdatetimepicker.j.b DateFirst = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
        com.mohamadamin.persianmaterialdatetimepicker.j.b DateLast = new com.mohamadamin.persianmaterialdatetimepicker.j.b();
        DateFirst.a(year, month - 1, 1);
        DateLast.a(year, month - 1, 1);
        DateLast.a(5, com.lawyer_smartCalendar.b.b.a(month));
        i db = new i(d());
        db.n();
        List<Schedule> ScheduleList = db.a(DateFirst.getTimeInMillis(), DateLast.getTimeInMillis());
        db.close();
        this.h0.setAdapter(new d0(d(), this, ScheduleList));
        if (ScheduleList.isEmpty()) {
            this.h0.setVisibility(8);
            this.j0.setVisibility(0);
            return;
        }
        this.h0.setVisibility(0);
        this.j0.setVisibility(8);
    }

    public void d0() {
        b(this.k0.d(), this.k0.b());
    }

    public void b(Intent intent) {
        a(intent);
    }
}
