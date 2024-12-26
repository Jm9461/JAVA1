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
import com.lawyer_smartCalendar.activity.AddClientActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Ck;
import com.lawyer_smartCalendar.p۲۸۹d.Cc;
import com.lawyer_smartCalendar.utils.Cb;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCb extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private TextView f۱۴۴۹۵a0;

    /* renamed from: b0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۴۹۶b0;

    /* renamed from: c0, reason: contains not printable characters */
    private RecyclerView f۱۴۴۹۷c0;

    /* renamed from: d0, reason: contains not printable characters */
    private int f۱۴۴۹۸d0 = 103;

    /* renamed from: e0, reason: contains not printable characters */
    private int f۱۴۴۹۹e0 = 104;

    /* renamed from: f0, reason: contains not printable characters */
    private boolean f۱۴۵۰۰f0 = false;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۲۲d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492983, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        this.f۱۴۴۹۵a0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۴۹۶b0 = (FloatingActionButton) view.findViewById(2131296272);
        this.f۱۴۴۹۶b0.setOnClickListener(this);
        this.f۱۴۴۹۷c0 = (RecyclerView) view.findViewById(2131296682);
        this.f۱۴۴۹۷c0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۲۲d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296272) {
            Intent frm_add_client = new Intent(m۱۰۱۲۷d(), (Class<?>) AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            m۱۰۰۹۶a(frm_add_client, this.f۱۴۴۹۸d0);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ci db = new Ci(ViewOnClickListenerCb.this.m۱۰۱۲۷d());
            db.m۱۵۷۳۳n();
            List<Cc> list = db.m۱۵۷۲۳i();
            db.close();
            ViewOnClickListenerCb.this.f۱۴۴۹۷c0.setAdapter(new Ck(ViewOnClickListenerCb.this.m۱۰۱۲۷d(), ViewOnClickListenerCb.this, list));
            if (list.isEmpty()) {
                ViewOnClickListenerCb.this.f۱۴۴۹۷c0.setVisibility(8);
                ViewOnClickListenerCb.this.f۱۴۴۹۵a0.setVisibility(0);
            } else {
                ViewOnClickListenerCb.this.f۱۴۴۹۷c0.setVisibility(0);
                ViewOnClickListenerCb.this.f۱۴۴۹۵a0.setVisibility(8);
            }
            if (ViewOnClickListenerCb.this.f۱۴۵۰۰f0) {
                Cb.f۱۴۷۷۴a.m۱۵۳۵۶n();
            }
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۲۲d0() {
        m۱۰۱۲۷d().runOnUiThread(new a());
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۲۱b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۴۹۹e0);
    }
}
