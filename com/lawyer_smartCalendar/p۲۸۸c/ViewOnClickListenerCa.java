package com.lawyer_smartCalendar.p۲۸۸c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Cd0;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ci;
import com.rey.material.widget.ImageView;
import ir.mirrajabi.persiancalendar.PersianCalendarView;
import ir.mirrajabi.persiancalendar.p۳۱۰f.Cb;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCa;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCd;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cf;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCa extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private String f۱۴۴۷۸a0 = "";

    /* renamed from: b0, reason: contains not printable characters */
    private Cf f۱۴۴۷۹b0;

    /* renamed from: c0, reason: contains not printable characters */
    private ImageView f۱۴۴۸۰c0;

    /* renamed from: d0, reason: contains not printable characters */
    private ImageView f۱۴۴۸۱d0;

    /* renamed from: e0, reason: contains not printable characters */
    FloatingActionMenu f۱۴۴۸۲e0;

    /* renamed from: f0, reason: contains not printable characters */
    FloatingActionButton f۱۴۴۸۳f0;

    /* renamed from: g0, reason: contains not printable characters */
    FloatingActionButton f۱۴۴۸۴g0;

    /* renamed from: h0, reason: contains not printable characters */
    private RecyclerView f۱۴۴۸۵h0;

    /* renamed from: i0, reason: contains not printable characters */
    private PersianCalendarView f۱۴۴۸۶i0;

    /* renamed from: j0, reason: contains not printable characters */
    private TextView f۱۴۴۸۷j0;

    /* renamed from: k0, reason: contains not printable characters */
    private Cf f۱۴۴۸۸k0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492982, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۴۸۷j0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۴۸۰c0 = (ImageView) view.findViewById(2131296482);
        this.f۱۴۴۸۱d0 = (ImageView) view.findViewById(2131296480);
        this.f۱۴۴۸۲e0 = (FloatingActionMenu) view.findViewById(2131296259);
        this.f۱۴۴۸۳f0 = (FloatingActionButton) view.findViewById(2131296757);
        this.f۱۴۴۸۴g0 = (FloatingActionButton) view.findViewById(2131296758);
        this.f۱۴۴۸۱d0.setOnClickListener(this);
        this.f۱۴۴۸۰c0.setOnClickListener(this);
        this.f۱۴۴۸۳f0.setOnClickListener(this);
        this.f۱۴۴۸۴g0.setOnClickListener(this);
        this.f۱۴۴۸۵h0 = (RecyclerView) view.findViewById(2131296684);
        this.f۱۴۴۸۵h0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        this.f۱۴۴۸۶i0 = (PersianCalendarView) view.findViewById(2131296666);
        Cb calendar = this.f۱۴۴۸۶i0.getCalendar();
        this.f۱۴۴۸۸k0 = calendar.m۱۷۶۴۴o();
        TextView txtDayMonth = (TextView) view.findViewById(2131296860);
        calendar.m۱۷۶۱۲a(new ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cb(this.f۱۴۴۸۸k0, "Custom event", false));
        calendar.m۱۷۶۰۳a(new a(txtDayMonth, calendar));
        this.f۱۴۴۸۶i0.setOnDayClickedListener(new b(calendar, txtDayMonth));
        calendar.m۱۷۶۰۴a(false);
        String dayAndMonth = calendar.m۱۷۶۰۶a((AbstractCa) this.f۱۴۴۸۸k0) + " ماه ";
        txtDayMonth.setText(dayAndMonth + " " + calendar.m۱۷۶۰۵a(this.f۱۴۴۸۸k0.m۱۷۷۲۴d()));
        calendar.m۱۷۶۲۲c(m۱۰۱۶۳v().getColor(2131099707));
        txtDayMonth.setTextColor(Cc.m۱۵۶۶۲c());
        m۱۵۴۱۰b(this.f۱۴۴۸۸k0.m۱۷۷۲۴d(), this.f۱۴۴۸۸k0.mo۱۷۷۲۰b());
    }

    /* renamed from: com.lawyer_smartCalendar.c.a$a */
    class a implements InterfaceCd {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ TextView f۱۴۴۸۹a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ Cb f۱۴۴۹۰b;

        a(TextView textView, Cb cb) {
            this.f۱۴۴۸۹a = textView;
            this.f۱۴۴۹۰b = cb;
        }

        @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCd
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۶۸۱a(Cf date) {
            ViewOnClickListenerCa.this.f۱۴۴۷۹b0 = date;
            ViewOnClickListenerCa.this.f۱۴۴۸۸k0 = date;
            this.f۱۴۴۸۹a.setText(this.f۱۴۴۹۰b.m۱۷۶۰۶a((AbstractCa) date) + " ماه " + this.f۱۴۴۹۰b.m۱۷۶۰۵a(date.m۱۷۷۲۴d()));
            ViewOnClickListenerCa.this.m۱۵۴۱۰b(date.m۱۷۷۲۴d(), date.mo۱۷۷۲۰b());
            ViewOnClickListenerCa.this.f۱۴۴۸۲e0.m۱۴۸۵۰a(false);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.a$b */
    class b implements InterfaceCa {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Cb f۱۴۴۹۲a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ TextView f۱۴۴۹۳b;

        b(Cb cb, TextView textView) {
            this.f۱۴۴۹۲a = cb;
            this.f۱۴۴۹۳b = textView;
        }

        @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۴f.InterfaceCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۶۷۹a(Cf date) {
            String dayAndMonth = this.f۱۴۴۹۲a.m۱۷۶۱۶b((AbstractCa) date) + " " + this.f۱۴۴۹۲a.m۱۷۶۰۵a(date.m۱۷۷۲۲c()) + " " + this.f۱۴۴۹۲a.m۱۷۶۰۶a((AbstractCa) date);
            this.f۱۴۴۹۳b.setText(dayAndMonth + " ماه " + this.f۱۴۴۹۲a.m۱۷۶۰۵a(date.m۱۷۷۲۴d()));
            ViewOnClickListenerCa.this.f۱۴۴۸۲e0.m۱۴۸۵۲b(true);
            com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb Pdate = new com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb();
            Pdate.m۱۵۹۲۸a(date.m۱۷۷۲۴d(), date.mo۱۷۷۲۰b() - 1, date.m۱۷۷۲۲c());
            ViewOnClickListenerCa.this.f۱۴۴۷۸a0 = Pdate.getTimeInMillis() + "";
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131296480:
                this.f۱۴۴۸۶i0.m۱۷۵۸۸a();
                break;
            case 2131296482:
                this.f۱۴۴۸۶i0.m۱۷۵۹۰b();
                break;
            case 2131296757:
                this.f۱۴۴۸۲e0.m۱۴۸۵۰a(false);
                Intent frm_add = new Intent(m۱۰۱۲۷d(), (Class<?>) AddProceedingsTimesActivity.class);
                frm_add.putExtra("frmMode", "add");
                if (!this.f۱۴۴۷۸a0.equals("")) {
                    frm_add.putExtra("date", this.f۱۴۴۷۸a0);
                }
                this.f۱۴۴۷۸a0 = "";
                m۱۵۴۱۱b(frm_add);
                break;
            case 2131296758:
                this.f۱۴۴۸۲e0.m۱۴۸۵۰a(false);
                Intent frm_add_meeting = new Intent(m۱۰۱۲۷d(), (Class<?>) AddMeetingActivity.class);
                frm_add_meeting.putExtra("frmMode", "add");
                if (!this.f۱۴۴۷۸a0.equals("")) {
                    frm_add_meeting.putExtra("date", this.f۱۴۴۷۸a0);
                }
                this.f۱۴۴۷۸a0 = "";
                m۱۵۴۱۱b(frm_add_meeting);
                break;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۱۰b(int year, int month) {
        com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb DateFirst = new com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb();
        com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb DateLast = new com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j.Cb();
        DateFirst.m۱۵۹۲۸a(year, month - 1, 1);
        DateLast.m۱۵۹۲۸a(year, month - 1, 1);
        DateLast.m۱۵۹۲۷a(5, com.lawyer_smartCalendar.p۲۸۷b.Cb.m۱۵۴۰۴a(month));
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<com.lawyer_smartCalendar.p۲۸۹d.Ci> list = db.m۱۵۶۸۵a(DateFirst.getTimeInMillis(), DateLast.getTimeInMillis());
        db.close();
        this.f۱۴۴۸۵h0.setAdapter(new Cd0(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۴۸۵h0.setVisibility(8);
            this.f۱۴۴۸۷j0.setVisibility(0);
        } else {
            this.f۱۴۴۸۵h0.setVisibility(0);
            this.f۱۴۴۸۷j0.setVisibility(8);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۱۲d0() {
        m۱۵۴۱۰b(this.f۱۴۴۸۸k0.m۱۷۷۲۴d(), this.f۱۴۴۸۸k0.mo۱۷۷۲۰b());
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۱۱b(Intent intent) {
        m۱۰۰۹۵a(intent);
    }
}
