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
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.model.AccountNumber;
import com.lawyer_smartCalendar.p۱۳۰a.Ca;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.e  reason: invalid class name */
public class View$OnClickListenerCe extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۱۰a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۵۱۱b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۵۱۲c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۵۱۳d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۱۴a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۱۷d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۱۳a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_acount_number, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۱۵a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۵۱۳d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۵۱۰a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_account);
        this.f۱۴۵۱۰a0.setOnClickListener(this);
        this.f۱۴۵۱۱b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۵۱۱b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۱۷d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_account) {
            Intent frm_add_note = new Intent(m۱۲۱۹۷d(), AddCityBankAccountActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۷۵۱۶b(frm_add_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۱۷d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<AccountNumber> accountNumberList = db.m۱۷۷۹۰d();
        db.close();
        this.f۱۴۵۱۱b0.setAdapter(new Ca(m۱۲۱۹۷d(), this, accountNumberList));
        if (accountNumberList.isEmpty()) {
            this.f۱۴۵۱۱b0.setVisibility(8);
            this.f۱۴۵۱۳d0.setVisibility(0);
            return;
        }
        this.f۱۴۵۱۱b0.setVisibility(0);
        this.f۱۴۵۱۳d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۱۶b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۵۱۲c0);
    }
}
