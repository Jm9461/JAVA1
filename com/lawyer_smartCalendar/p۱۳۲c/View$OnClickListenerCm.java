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
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.p۱۳۰a.Cn;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.m  reason: invalid class name */
public class View$OnClickListenerCm extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    FloatingActionButton f۱۴۶۰۶a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۶۰۷b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۶۰۸c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۶۰۹d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۵۰a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۵۳d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۴۹a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.client_detail_schedule_list_fragment, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۵۱a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۶۰۹d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۶۰۶a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_meeting);
        this.f۱۴۶۰۶a0.setOnClickListener(this);
        this.f۱۴۶۰۷b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۶۰۷b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۵۳d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_meeting) {
            Intent frm_note = new Intent(m۱۲۱۹۷d(), AddMeetingActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) m۱۲۱۹۷d()).f۱۴۲۲۳s + "");
            m۱۷۵۵۲b(frm_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۵۳d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Schedule> ScheduleList = db.m۱۷۸۲۳z(((ClientDetailActivity) m۱۲۱۹۷d()).f۱۴۲۲۳s);
        db.close();
        this.f۱۴۶۰۷b0.setAdapter(new Cn(m۱۲۱۹۷d(), this, ScheduleList));
        if (ScheduleList.isEmpty()) {
            this.f۱۴۶۰۷b0.setVisibility(8);
            this.f۱۴۶۰۹d0.setVisibility(0);
            return;
        }
        this.f۱۴۶۰۷b0.setVisibility(0);
        this.f۱۴۶۰۹d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۵۲b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۶۰۸c0);
    }
}
