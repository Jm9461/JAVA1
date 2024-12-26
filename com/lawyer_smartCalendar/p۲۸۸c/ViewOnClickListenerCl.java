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
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Cm;
import com.lawyer_smartCalendar.p۲۸۹d.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCl extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۰۲a0;

    /* renamed from: b0, reason: contains not printable characters */
    private RecyclerView f۱۴۶۰۳b0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۶۰۴c0 = 102;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۶۰۵d0;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۷۰d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492947, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۶۰۵d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۶۰۲a0 = (FloatingActionButton) view.findViewById(2131296276);
        this.f۱۴۶۰۲a0.setOnClickListener(this);
        this.f۱۴۶۰۳b0 = (RecyclerView) view.findViewById(2131296683);
        this.f۱۴۶۰۳b0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۷۰d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296276) {
            Intent frm_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddNoteActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) m۱۰۱۲۷d()).f۱۴۲۲۳s + "");
            m۱۵۴۶۹b(frm_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۷۰d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<Cf> list = db.m۱۵۷۳۷r(((ClientDetailActivity) m۱۰۱۲۷d()).f۱۴۲۲۳s);
        db.close();
        this.f۱۴۶۰۳b0.setAdapter(new Cm(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۶۰۳b0.setVisibility(8);
            this.f۱۴۶۰۵d0.setVisibility(0);
        } else {
            this.f۱۴۶۰۳b0.setVisibility(0);
            this.f۱۴۶۰۵d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۶۹b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۶۰۴c0);
    }
}
