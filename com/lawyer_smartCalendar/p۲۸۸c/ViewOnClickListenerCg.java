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
import com.lawyer_smartCalendar.activity.AddClientDocumentsActivity;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Cg;
import com.lawyer_smartCalendar.p۲۸۹d.Cd;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCg extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private RecyclerView f۱۴۵۶۹a0;

    /* renamed from: b0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۷۰b0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۵۷۱c0 = 102;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۵۷۲d0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۴۶d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492937, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۵۷۲d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۵۷۰b0 = (FloatingActionButton) view.findViewById(2131296273);
        this.f۱۴۵۷۰b0.setOnClickListener(this);
        this.f۱۴۵۶۹a0 = (RecyclerView) view.findViewById(2131296683);
        this.f۱۴۵۶۹a0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۴۶d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296273) {
            Intent frm_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddClientDocumentsActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "case");
            frm_note.putExtra("id", ((CaseDetailActivity) m۱۰۱۲۷d()).f۱۴۲۱۴r + "");
            m۱۵۴۴۵b(frm_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۴۶d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<Cd> list = db.m۱۵۷۳۱m(((CaseDetailActivity) m۱۰۱۲۷d()).f۱۴۲۱۴r);
        db.close();
        this.f۱۴۵۶۹a0.setAdapter(new Cg(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۵۶۹a0.setVisibility(8);
            this.f۱۴۵۷۲d0.setVisibility(0);
        } else {
            this.f۱۴۵۶۹a0.setVisibility(0);
            this.f۱۴۵۷۲d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۴۵b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۵۷۱c0);
    }
}
