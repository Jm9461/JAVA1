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
import com.lawyer_smartCalendar.activity.AddCaseActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Ce;
import com.lawyer_smartCalendar.p۲۸۹d.Cb;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCj extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    FloatingActionButton f۱۴۵۸۱a0;

    /* renamed from: b0, reason: contains not printable characters */
    private RecyclerView f۱۴۵۸۲b0;

    /* renamed from: c0, reason: contains not printable characters */
    private TextView f۱۴۵۸۳c0;

    /* renamed from: d0, reason: contains not printable characters */
    private int f۱۴۵۸۴d0 = 110;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        super.mo۱۵۴۹۶a(requestCode, resultCode, data);
        if (requestCode == this.f۱۴۵۸۴d0 && resultCode == -1) {
            m۱۵۴۶۳d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492944, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        this.f۱۴۵۸۲b0 = (RecyclerView) view.findViewById(2131296680);
        this.f۱۴۵۸۱a0 = (FloatingActionButton) view.findViewById(2131296271);
        this.f۱۴۵۸۱a0.setOnClickListener(this);
        this.f۱۴۵۸۲b0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        this.f۱۴۵۸۳c0 = (TextView) view.findViewById(2131296870);
        m۱۵۴۶۳d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296271) {
            Intent frm_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddCaseActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) m۱۰۱۲۷d()).f۱۴۲۲۳s + "");
            m۱۵۴۶۲b(frm_note);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.j$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ci db = new Ci(ViewOnClickListenerCj.this.m۱۰۱۲۷d());
            db.m۱۵۷۳۳n();
            List<Cb> list = db.m۱۵۶۸۴a(Integer.parseInt(((ClientDetailActivity) ViewOnClickListenerCj.this.m۱۰۱۲۷d()).f۱۴۲۲۳s));
            db.close();
            ViewOnClickListenerCj.this.f۱۴۵۸۲b0.setAdapter(new Ce(ViewOnClickListenerCj.this.m۱۰۱۲۷d(), list));
            if (list.isEmpty()) {
                ViewOnClickListenerCj.this.f۱۴۵۸۲b0.setVisibility(8);
                ViewOnClickListenerCj.this.f۱۴۵۸۳c0.setVisibility(0);
            } else {
                ViewOnClickListenerCj.this.f۱۴۵۸۲b0.setVisibility(0);
                ViewOnClickListenerCj.this.f۱۴۵۸۳c0.setVisibility(8);
            }
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۶۳d0() {
        m۱۰۱۲۷d().runOnUiThread(new a());
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۶۲b(Intent intent) {
        m۱۰۰۹۶a(intent, 102);
    }
}
