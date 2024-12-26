package com.lawyer_smartCalendar.p۱۳۲c;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.model.Note;
import com.lawyer_smartCalendar.p۱۳۰a.Cw;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ci;
import info.hoang8f.android.segmented.SegmentedGroup;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.o  reason: invalid class name */
public class View$OnClickListenerCo extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۱۴a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۶۱۵b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۴۶۱۶c0 = 102;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۶۱۷d0;

    /* renamed from: e0  reason: contains not printable characters */
    public String f۱۴۶۱۸e0 = "DailyActivity";

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۶۰a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۶۳d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۵۹a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_note, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۶۱a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        new Ci(m۱۲۱۹۷d());
        this.f۱۴۶۱۷d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۶۱۴a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_note);
        this.f۱۴۶۱۴a0.setOnClickListener(this);
        this.f۱۴۶۱۵b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f۱۴۶۱۵b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        SegmentedGroup segmented3 = (SegmentedGroup) view.findViewById(R.id.segmented2);
        segmented3.setTintColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        segmented3.setOnCheckedChangeListener(new Ca());
        m۱۷۵۶۳d0();
    }

    /* renamed from: com.lawyer_smartCalendar.c.o$a  reason: invalid class name */
    class Ca implements RadioGroup.OnCheckedChangeListener {
        Ca() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            switch (checkedId) {
                case R.id.button21 /*{ENCODED_INT: 2131296360}*/:
                    View$OnClickListenerCo.this.f۱۴۶۱۸e0 = "Other";
                    break;
                case R.id.button22 /*{ENCODED_INT: 2131296361}*/:
                    View$OnClickListenerCo.this.f۱۴۶۱۸e0 = "ClientCase";
                    break;
                case R.id.button23 /*{ENCODED_INT: 2131296362}*/:
                    View$OnClickListenerCo.this.f۱۴۶۱۸e0 = "DailyActivity";
                    break;
            }
            View$OnClickListenerCo.this.m۱۷۵۶۳d0();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_note) {
            Intent frm_add_note = new Intent(m۱۲۱۹۷d(), AddNoteActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۷۵۶۲b(frm_add_note);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۶۳d0() {
        Ci db = new Ci(m۱۲۱۹۷d());
        db.m۱۷۸۱۱n();
        List<Note> noteList = db.m۱۷۸۱۶s(this.f۱۴۶۱۸e0);
        db.close();
        this.f۱۴۶۱۵b0.setAdapter(new Cw(m۱۲۱۹۷d(), this, noteList));
        if (noteList.isEmpty()) {
            this.f۱۴۶۱۵b0.setVisibility(8);
            this.f۱۴۶۱۷d0.setVisibility(0);
            return;
        }
        this.f۱۴۶۱۵b0.setVisibility(0);
        this.f۱۴۶۱۷d0.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۶۲b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۶۱۶c0);
    }
}
