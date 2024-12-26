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
import com.lawyer_smartCalendar.activity.AddClientDocumentsActivity;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.model.ClientDocument;
import com.lawyer_smartCalendar.p۱۳۰a.Cg;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.g  reason: invalid class name */
public class View$OnClickListenerCg extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private RecyclerView f۱۴۵۶۹a0;

    /* renamed from: b0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۷۰b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۵۷۱c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۵۷۲d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۲۱a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۲۴d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۲۰a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.case_detail_document_list_fragment, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۲۲a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۵۷۲d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۵۷۰b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_document);
        this.f۱۴۵۷۰b0.setOnClickListener(this);
        this.f۱۴۵۶۹a0 = (RecyclerView) view.findViewById(R.id.recyclerView_view);
        this.f۱۴۵۶۹a0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۲۴d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_document) {
            Intent frm_note = new Intent(m۱۲۱۹۷d(), AddClientDocumentsActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "case");
            frm_note.putExtra("id", ((CaseDetailActivity) m۱۲۱۹۷d()).f۱۴۲۱۴r + "");
            m۱۷۵۲۳b(frm_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۲۴d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<ClientDocument> clientDocuments = db.m۱۷۸۰۹m(((CaseDetailActivity) m۱۲۱۹۷d()).f۱۴۲۱۴r);
        db.close();
        this.f۱۴۵۶۹a0.setAdapter(new Cg(m۱۲۱۹۷d(), this, clientDocuments));
        if (clientDocuments.isEmpty()) {
            this.f۱۴۵۶۹a0.setVisibility(8);
            this.f۱۴۵۷۲d0.setVisibility(0);
            return;
        }
        this.f۱۴۵۶۹a0.setVisibility(0);
        this.f۱۴۵۷۲d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۲۳b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۵۷۱c0);
    }
}
