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
import com.lawyer_smartCalendar.p۲۸۶a.Ce;
import com.lawyer_smartCalendar.p۲۸۹d.Cb;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCc extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private TextView f۱۴۵۰۲a0;

    /* renamed from: b0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۰۳b0;

    /* renamed from: c0, reason: contains not printable characters */
    private RecyclerView f۱۴۵۰۴c0;

    /* renamed from: d0, reason: contains not printable characters */
    private int f۱۴۵۰۵d0 = 110;

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        super.mo۱۵۴۹۶a(requestCode, resultCode, data);
        if (requestCode == this.f۱۴۵۰۵d0 && resultCode == -1) {
            m۱۵۴۲۸d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492984, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        this.f۱۴۵۰۲a0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۵۰۳b0 = (FloatingActionButton) view.findViewById(2131296271);
        this.f۱۴۵۰۳b0.setOnClickListener(this);
        this.f۱۴۵۰۴c0 = (RecyclerView) view.findViewById(2131296680);
        this.f۱۴۵۰۴c0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        m۱۵۴۲۸d0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296271) {
            Intent frm_add_case = new Intent(m۱۰۱۲۷d(), (Class<?>) AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            m۱۰۰۹۵a(frm_add_case);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.c.c$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ci db = new Ci(ViewOnClickListenerCc.this.m۱۰۱۲۷d());
            db.m۱۵۷۳۳n();
            List<Cb> list = db.m۱۵۷۱۶f();
            db.close();
            ViewOnClickListenerCc.this.f۱۴۵۰۴c0.setAdapter(new Ce(ViewOnClickListenerCc.this.m۱۰۱۲۷d(), list));
            if (list.isEmpty()) {
                ViewOnClickListenerCc.this.f۱۴۵۰۴c0.setVisibility(8);
                ViewOnClickListenerCc.this.f۱۴۵۰۲a0.setVisibility(0);
            } else {
                ViewOnClickListenerCc.this.f۱۴۵۰۴c0.setVisibility(0);
                ViewOnClickListenerCc.this.f۱۴۵۰۲a0.setVisibility(8);
            }
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۲۸d0() {
        m۱۰۱۲۷d().runOnUiThread(new a());
    }
}
