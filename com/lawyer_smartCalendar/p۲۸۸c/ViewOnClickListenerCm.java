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
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Cn;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCm extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    FloatingActionButton f۱۴۶۰۶a0;

    /* renamed from: b0, reason: contains not printable characters */
    private RecyclerView f۱۴۶۰۷b0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۶۰۸c0 = 102;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۶۰۹d0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۷۵d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492948, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۶۰۹d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۶۰۶a0 = (FloatingActionButton) view.findViewById(2131296275);
        this.f۱۴۶۰۶a0.setOnClickListener(this);
        this.f۱۴۶۰۷b0 = (RecyclerView) view.findViewById(2131296684);
        this.f۱۴۶۰۷b0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۷۵d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296275) {
            Intent frm_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddMeetingActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) m۱۰۱۲۷d()).f۱۴۲۲۳s + "");
            m۱۵۴۷۴b(frm_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۷۵d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<com.lawyer_smartCalendar.p۲۸۹d.Ci> list = db.m۱۵۷۴۵z(((ClientDetailActivity) m۱۰۱۲۷d()).f۱۴۲۲۳s);
        db.close();
        this.f۱۴۶۰۷b0.setAdapter(new Cn(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۶۰۷b0.setVisibility(8);
            this.f۱۴۶۰۹d0.setVisibility(0);
        } else {
            this.f۱۴۶۰۷b0.setVisibility(0);
            this.f۱۴۶۰۹d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۷۴b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۶۰۸c0);
    }
}
