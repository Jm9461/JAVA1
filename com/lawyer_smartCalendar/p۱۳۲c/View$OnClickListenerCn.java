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
import com.lawyer_smartCalendar.model.ClientDocument;
import com.lawyer_smartCalendar.p۱۳۰a.Co;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.n  reason: invalid class name */
public class View$OnClickListenerCn extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private RecyclerView f۱۴۶۱۰a0;

    /* renamed from: b0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۱۱b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۶۱۲c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۶۱۳d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۵۵a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۵۸d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۵۴a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_document, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۵۶a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۶۱۳d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۶۱۱b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_document);
        this.f۱۴۶۱۱b0.setOnClickListener(this);
        this.f۱۴۶۱۰a0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۶۱۰a0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۵۸d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_document) {
            Intent frm_add_note = new Intent(m۱۲۱۹۷d(), AddClientDocumentsActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۷۵۵۷b(frm_add_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۵۸d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<ClientDocument> clientDocuments = db.m۱۷۷۹۹h();
        db.close();
        this.f۱۴۶۱۰a0.setAdapter(new Co(m۱۲۱۹۷d(), this, clientDocuments));
        if (clientDocuments.isEmpty()) {
            this.f۱۴۶۱۰a0.setVisibility(8);
            this.f۱۴۶۱۳d0.setVisibility(0);
            return;
        }
        this.f۱۴۶۱۰a0.setVisibility(0);
        this.f۱۴۶۱۳d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۵۷b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۶۱۲c0);
    }
}
