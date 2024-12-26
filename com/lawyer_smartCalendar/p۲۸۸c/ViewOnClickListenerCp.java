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
import com.lawyer_smartCalendar.activity.AddPaymentActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Cc0;
import com.lawyer_smartCalendar.p۲۸۹d.Cg;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.p, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCp extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۲۰a0;

    /* renamed from: b0, reason: contains not printable characters */
    private RecyclerView f۱۴۶۲۱b0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۶۲۲c0 = 102;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۶۲۳d0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۹۰d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492976, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۶۲۳d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۶۲۰a0 = (FloatingActionButton) view.findViewById(2131296274);
        this.f۱۴۶۲۰a0.setOnClickListener(this);
        this.f۱۴۶۲۱b0 = (RecyclerView) view.findViewById(2131296684);
        this.f۱۴۶۲۱b0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۹۰d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296274) {
            Intent frm_add_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddPaymentActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۵۴۸۹b(frm_add_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۹۰d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<Cg> list = db.m۱۵۷۲۷k();
        db.close();
        this.f۱۴۶۲۱b0.setAdapter(new Cc0(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۶۲۱b0.setVisibility(8);
            this.f۱۴۶۲۳d0.setVisibility(0);
        } else {
            this.f۱۴۶۲۱b0.setVisibility(0);
            this.f۱۴۶۲۳d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۸۹b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۶۲۲c0);
    }
}
