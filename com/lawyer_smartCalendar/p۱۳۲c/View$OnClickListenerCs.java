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
import com.lawyer_smartCalendar.activity.AddTaxActivity;
import com.lawyer_smartCalendar.model.Tax;
import com.lawyer_smartCalendar.p۱۳۰a.Cf0;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.s  reason: invalid class name */
public class View$OnClickListenerCs extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۷۶a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۶۷۷b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۶۷۸c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۶۷۹d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۷۴a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۷۷d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۷۳a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_tax, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۷۵a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۶۷۹d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۶۷۶a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_tax);
        this.f۱۴۶۷۶a0.setOnClickListener(this);
        this.f۱۴۶۷۷b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۶۷۷b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۷۷d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_tax) {
            Intent frm_add_note = new Intent(m۱۲۱۹۷d(), AddTaxActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۷۵۷۶b(frm_add_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۷۷d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Tax> taxList = db.m۱۷۸۰۸m();
        db.close();
        this.f۱۴۶۷۷b0.setAdapter(new Cf0(m۱۲۱۹۷d(), this, taxList));
        if (taxList.isEmpty()) {
            this.f۱۴۶۷۷b0.setVisibility(8);
            this.f۱۴۶۷۹d0.setVisibility(0);
            return;
        }
        this.f۱۴۶۷۷b0.setVisibility(0);
        this.f۱۴۶۷۹d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۷۶b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۶۷۸c0);
    }
}
