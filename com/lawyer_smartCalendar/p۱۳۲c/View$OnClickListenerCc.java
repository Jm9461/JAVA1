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
import com.lawyer_smartCalendar.activity.AddCaseActivity;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.p۱۳۰a.Ce;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.c  reason: invalid class name */
public class View$OnClickListenerCc extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private TextView f۱۴۵۰۲a0;

    /* renamed from: b0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۵۰۳b0;

    /* renamed from: c0  reason: contains not printable characters */
    private RecyclerView f۱۴۵۰۴c0;

    /* renamed from: d0  reason: contains not printable characters */
    private int f۱۴۵۰۵d0 = 110;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۰۴a(int requestCode, int resultCode, Intent data) {
        super.m۱۲۱۵۷a(requestCode, resultCode, data);
        if (requestCode == this.f۱۴۵۰۵d0 && resultCode == -1) {
            m۱۷۵۰۶d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۰۳a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab3, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۰۵a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        this.f۱۴۵۰۲a0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۵۰۳b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_case);
        this.f۱۴۵۰۳b0.setOnClickListener(this);
        this.f۱۴۵۰۴c0 = (RecyclerView) view.findViewById(R.id.recyclerView_case);
        this.f۱۴۵۰۴c0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۰۶d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_case) {
            Intent frm_add_case = new Intent(m۱۲۱۹۷d(), AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            m۱۲۱۶۵a(frm_add_case);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.c.c$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Ci db = new Ci(View$OnClickListenerCc.this.m۱۲۱۹۷d());
            db.m۱۷۸۱۱n();
            List<Case> caseList = db.m۱۷۷۹۴f();
            db.close();
            View$OnClickListenerCc.this.f۱۴۵۰۴c0.setAdapter(new Ce(View$OnClickListenerCc.this.m۱۲۱۹۷d(), caseList));
            if (caseList.isEmpty()) {
                View$OnClickListenerCc.this.f۱۴۵۰۴c0.setVisibility(8);
                View$OnClickListenerCc.this.f۱۴۵۰۲a0.setVisibility(0);
                return;
            }
            View$OnClickListenerCc.this.f۱۴۵۰۴c0.setVisibility(0);
            View$OnClickListenerCc.this.f۱۴۵۰۲a0.setVisibility(8);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۰۶d0() {
        m۱۲۱۹۷d().runOnUiThread(new RunnableCa());
    }
}
