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
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.p۱۳۰a.Ce;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.j  reason: invalid class name */
public class View$OnClickListenerCj extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    FloatingActionButton f۱۴۵۸۱a0;

    /* renamed from: b0  reason: contains not printable characters */
    private RecyclerView f۱۴۵۸۲b0;

    /* renamed from: c0  reason: contains not printable characters */
    private TextView f۱۴۵۸۳c0;

    /* renamed from: d0  reason: contains not printable characters */
    private int f۱۴۵۸۴d0 = 110;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۳۸a(int requestCode, int resultCode, Intent data) {
        super.m۱۲۱۵۷a(requestCode, resultCode, data);
        if (requestCode == this.f۱۴۵۸۴d0 && resultCode == -1) {
            m۱۷۵۴۱d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۳۷a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.client_detail_case_list_fragment, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۳۹a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        this.f۱۴۵۸۲b0 = (RecyclerView) view.findViewById(R.id.recyclerView_case);
        this.f۱۴۵۸۱a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_case);
        this.f۱۴۵۸۱a0.setOnClickListener(this);
        this.f۱۴۵۸۲b0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        this.f۱۴۵۸۳c0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        m۱۷۵۴۱d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_case) {
            Intent frm_note = new Intent(m۱۲۱۹۷d(), AddCaseActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) m۱۲۱۹۷d()).f۱۴۲۲۳s + "");
            m۱۷۵۴۰b(frm_note);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.c.j$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Ci db = new Ci(View$OnClickListenerCj.this.m۱۲۱۹۷d());
            db.m۱۷۸۱۱n();
            List<Case> caseList = db.m۱۷۷۶۲a(Integer.parseInt(((ClientDetailActivity) View$OnClickListenerCj.this.m۱۲۱۹۷d()).f۱۴۲۲۳s));
            db.close();
            View$OnClickListenerCj.this.f۱۴۵۸۲b0.setAdapter(new Ce(View$OnClickListenerCj.this.m۱۲۱۹۷d(), caseList));
            if (caseList.isEmpty()) {
                View$OnClickListenerCj.this.f۱۴۵۸۲b0.setVisibility(8);
                View$OnClickListenerCj.this.f۱۴۵۸۳c0.setVisibility(0);
                return;
            }
            View$OnClickListenerCj.this.f۱۴۵۸۲b0.setVisibility(0);
            View$OnClickListenerCj.this.f۱۴۵۸۳c0.setVisibility(8);
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۴۱d0() {
        m۱۲۱۹۷d().runOnUiThread(new RunnableCa());
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۵۴۰b(Intent intent) {
        m۱۲۱۶۶a(intent, 102);
    }
}
