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
import com.lawyer_smartCalendar.p۲۸۶a.Co;
import com.lawyer_smartCalendar.p۲۸۹d.Cd;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCn extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private RecyclerView f۱۴۶۱۰a0;

    /* renamed from: b0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۱۱b0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۶۱۲c0 = 102;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۶۱۳d0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۸۰d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492975, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۶۱۳d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۶۱۱b0 = (FloatingActionButton) view.findViewById(2131296273);
        this.f۱۴۶۱۱b0.setOnClickListener(this);
        this.f۱۴۶۱۰a0 = (RecyclerView) view.findViewById(2131296684);
        this.f۱۴۶۱۰a0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۸۰d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296273) {
            Intent frm_add_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddClientDocumentsActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۵۴۷۹b(frm_add_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۸۰d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<Cd> list = db.m۱۵۷۲۱h();
        db.close();
        this.f۱۴۶۱۰a0.setAdapter(new Co(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۶۱۰a0.setVisibility(8);
            this.f۱۴۶۱۳d0.setVisibility(0);
        } else {
            this.f۱۴۶۱۰a0.setVisibility(0);
            this.f۱۴۶۱۳d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۷۹b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۶۱۲c0);
    }
}
