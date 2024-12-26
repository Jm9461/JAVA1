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
import com.lawyer_smartCalendar.activity.AddProceedingsTimesActivity;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCi extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۷۷a0;

    /* renamed from: b0, reason: contains not printable characters */
    private RecyclerView f۱۴۵۷۸b0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۵۷۹c0 = 102;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۵۸۰d0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۵۶d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492940, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۵۸۰d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۵۷۷a0 = (FloatingActionButton) view.findViewById(2131296276);
        this.f۱۴۵۷۷a0.setOnClickListener(this);
        this.f۱۴۵۷۸b0 = (RecyclerView) view.findViewById(2131296684);
        this.f۱۴۵۷۸b0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۵۶d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296276) {
            Intent frm_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddProceedingsTimesActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "case");
            frm_note.putExtra("id", ((CaseDetailActivity) m۱۰۱۲۷d()).f۱۴۲۱۴r + "");
            m۱۵۴۵۵b(frm_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۵۶d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<com.lawyer_smartCalendar.p۲۸۹d.Ci> list = db.m۱۵۷۴۴y(((CaseDetailActivity) m۱۰۱۲۷d()).f۱۴۲۱۴r);
        db.close();
        this.f۱۴۵۷۸b0.setAdapter(new com.lawyer_smartCalendar.p۲۸۶a.Ci(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۵۷۸b0.setVisibility(8);
            this.f۱۴۵۸۰d0.setVisibility(0);
        } else {
            this.f۱۴۵۷۸b0.setVisibility(0);
            this.f۱۴۵۸۰d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۵۵b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۵۷۹c0);
    }
}
