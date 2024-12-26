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
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.i  reason: invalid class name */
public class View$OnClickListenerCi extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۷۷a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۵۷۸b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۵۷۹c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۵۸۰d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۳۱a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۳۴d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۳۰a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.case_detail_schedule_list_fragment, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۳۲a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۵۸۰d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۵۷۷a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_note);
        this.f۱۴۵۷۷a0.setOnClickListener(this);
        this.f۱۴۵۷۸b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۵۷۸b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۳۴d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_note) {
            Intent frm_note = new Intent(m۱۲۱۹۷d(), AddProceedingsTimesActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "case");
            frm_note.putExtra("id", ((CaseDetailActivity) m۱۲۱۹۷d()).f۱۴۲۱۴r + "");
            m۱۷۵۳۳b(frm_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۳۴d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Schedule> ScheduleList = db.m۱۷۸۲۲y(((CaseDetailActivity) m۱۲۱۹۷d()).f۱۴۲۱۴r);
        db.close();
        this.f۱۴۵۷۸b0.setAdapter(new com.lawyer_smartCalendar.p۱۳۰a.Ci(m۱۲۱۹۷d(), this, ScheduleList));
        if (ScheduleList.isEmpty()) {
            this.f۱۴۵۷۸b0.setVisibility(8);
            this.f۱۴۵۸۰d0.setVisibility(0);
            return;
        }
        this.f۱۴۵۷۸b0.setVisibility(0);
        this.f۱۴۵۸۰d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۳۳b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۵۷۹c0);
    }
}
