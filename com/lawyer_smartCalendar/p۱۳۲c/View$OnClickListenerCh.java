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
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.model.Note;
import com.lawyer_smartCalendar.p۱۳۰a.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.h  reason: invalid class name */
public class View$OnClickListenerCh extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۷۳a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۵۷۴b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۵۷۵c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۵۷۶d0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۲۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۲۹d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۲۵a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_case_note_list, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۲۷a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۵۷۶d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۵۷۳a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_note);
        this.f۱۴۵۷۳a0.setOnClickListener(this);
        this.f۱۴۵۷۴b0 = (RecyclerView) view.findViewById(R.id.recyclerView_case_note_list);
        this.f۱۴۵۷۴b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۲۹d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_note) {
            Intent frm_note = new Intent(m۱۲۱۹۷d(), AddNoteActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "case");
            frm_note.putExtra("id", ((CaseDetailActivity) m۱۲۱۹۷d()).f۱۴۲۱۴r + "");
            m۱۷۵۲۸b(frm_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۲۹d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Note> noteList = db.m۱۷۸۱۴q(((CaseDetailActivity) m۱۲۱۹۷d()).f۱۴۲۱۴r);
        db.close();
        this.f۱۴۵۷۴b0.setAdapter(new Ch(m۱۲۱۹۷d(), this, noteList));
        if (noteList.isEmpty()) {
            this.f۱۴۵۷۴b0.setVisibility(8);
            this.f۱۴۵۷۶d0.setVisibility(0);
            return;
        }
        this.f۱۴۵۷۴b0.setVisibility(0);
        this.f۱۴۵۷۶d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۲۸b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۵۷۵c0);
    }
}
