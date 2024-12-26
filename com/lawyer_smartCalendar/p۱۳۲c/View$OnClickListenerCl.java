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
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.model.Note;
import com.lawyer_smartCalendar.p۱۳۰a.Cm;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.l  reason: invalid class name */
public class View$OnClickListenerCl extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۰۲a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۶۰۳b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۶۰۴c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۶۰۵d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۴۵a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۴۸d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۴۴a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.client_detail_note_list_fragment, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۴۶a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۶۰۵d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۶۰۲a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_note);
        this.f۱۴۶۰۲a0.setOnClickListener(this);
        this.f۱۴۶۰۳b0 = (RecyclerView) view.findViewById(R.id.recyclerView_view);
        this.f۱۴۶۰۳b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۴۸d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_note) {
            Intent frm_note = new Intent(m۱۲۱۹۷d(), AddNoteActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) m۱۲۱۹۷d()).f۱۴۲۲۳s + "");
            m۱۷۵۴۷b(frm_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۴۸d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Note> noteList = db.m۱۷۸۱۵r(((ClientDetailActivity) m۱۲۱۹۷d()).f۱۴۲۲۳s);
        db.close();
        this.f۱۴۶۰۳b0.setAdapter(new Cm(m۱۲۱۹۷d(), this, noteList));
        if (noteList.isEmpty()) {
            this.f۱۴۶۰۳b0.setVisibility(8);
            this.f۱۴۶۰۵d0.setVisibility(0);
            return;
        }
        this.f۱۴۶۰۳b0.setVisibility(0);
        this.f۱۴۶۰۵d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۴۷b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۶۰۴c0);
    }
}
