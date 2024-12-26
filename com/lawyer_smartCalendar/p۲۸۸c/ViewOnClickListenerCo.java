package com.lawyer_smartCalendar.p۲۸۸c;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.p۲۸۶a.Cw;
import com.lawyer_smartCalendar.p۲۸۹d.Cf;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Ci;
import info.hoang8f.android.segmented.SegmentedGroup;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCo extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0, reason: contains not printable characters */
    private FloatingActionButton f۱۴۶۱۴a0;

    /* renamed from: b0, reason: contains not printable characters */
    private RecyclerView f۱۴۶۱۵b0;

    /* renamed from: d0, reason: contains not printable characters */
    private TextView f۱۴۶۱۷d0;

    /* renamed from: c0, reason: contains not printable characters */
    private int f۱۴۶۱۶c0 = 102;

    /* renamed from: e0, reason: contains not printable characters */
    public String f۱۴۶۱۸e0 = "DailyActivity";

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۴۹۶a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۵۴۸۵d0();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(2131492977, container, false);
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۵۵۰۱a(View view, Bundle savedInstanceState) {
        super.mo۱۵۵۰۱a(view, savedInstanceState);
        new Ci(m۱۰۱۲۷d());
        this.f۱۴۶۱۷d0 = (TextView) view.findViewById(2131296870);
        this.f۱۴۶۱۴a0 = (FloatingActionButton) view.findViewById(2131296276);
        this.f۱۴۶۱۴a0.setOnClickListener(this);
        this.f۱۴۶۱۵b0 = (RecyclerView) view.findViewById(2131296684);
        this.f۱۴۶۱۵b0.setLayoutManager(new LinearLayoutManager(m۱۰۱۲۷d()));
        SegmentedGroup segmented3 = (SegmentedGroup) view.findViewById(2131296724);
        segmented3.setTintColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
        segmented3.setOnCheckedChangeListener(new a());
        m۱۵۴۸۵d0();
    }

    /* renamed from: com.lawyer_smartCalendar.c.o$a */
    class a implements RadioGroup.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            switch (checkedId) {
                case 2131296360:
                    ViewOnClickListenerCo.this.f۱۴۶۱۸e0 = "Other";
                    break;
                case 2131296361:
                    ViewOnClickListenerCo.this.f۱۴۶۱۸e0 = "ClientCase";
                    break;
                case 2131296362:
                    ViewOnClickListenerCo.this.f۱۴۶۱۸e0 = "DailyActivity";
                    break;
            }
            ViewOnClickListenerCo.this.m۱۵۴۸۵d0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == 2131296276) {
            Intent frm_add_note = new Intent(m۱۰۱۲۷d(), (Class<?>) AddNoteActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            m۱۵۴۸۴b(frm_add_note);
        }
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۵۴۸۵d0() {
        Ci db = new Ci(m۱۰۱۲۷d());
        db.m۱۵۷۳۳n();
        List<Cf> list = db.m۱۵۷۳۸s(this.f۱۴۶۱۸e0);
        db.close();
        this.f۱۴۶۱۵b0.setAdapter(new Cw(m۱۰۱۲۷d(), this, list));
        if (list.isEmpty()) {
            this.f۱۴۶۱۵b0.setVisibility(8);
            this.f۱۴۶۱۷d0.setVisibility(0);
        } else {
            this.f۱۴۶۱۵b0.setVisibility(0);
            this.f۱۴۶۱۷d0.setVisibility(8);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۵۴۸۴b(Intent intent) {
        m۱۰۰۹۶a(intent, this.f۱۴۶۱۶c0);
    }
}
