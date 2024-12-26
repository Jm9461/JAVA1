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
import com.lawyer_smartCalendar.activity.AddPaymentActivity;
import com.lawyer_smartCalendar.model.Payment;
import com.lawyer_smartCalendar.p۱۳۰a.Cc0;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.p  reason: invalid class name */
public class View$OnClickListenerCp extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۲۰a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۶۲۱b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۶۲۲c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۶۲۳d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۶۵a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۶۸d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۶۴a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_honorarium, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۶۶a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۶۲۳d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۶۲۰a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_honorarium);
        this.f۱۴۶۲۰a0.setOnClickListener(this);
        this.f۱۴۶۲۱b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۶۲۱b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۶۸d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_honorarium) {
            Intent frm_add_note = new Intent(m۱۲۱۹۷d(), AddPaymentActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۷۵۶۷b(frm_add_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۶۸d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Payment> paymentList = db.m۱۷۸۰۵k();
        db.close();
        this.f۱۴۶۲۱b0.setAdapter(new Cc0(m۱۲۱۹۷d(), this, paymentList));
        if (paymentList.isEmpty()) {
            this.f۱۴۶۲۱b0.setVisibility(8);
            this.f۱۴۶۲۳d0.setVisibility(0);
            return;
        }
        this.f۱۴۶۲۱b0.setVisibility(0);
        this.f۱۴۶۲۳d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۶۷b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۶۲۲c0);
    }
}
