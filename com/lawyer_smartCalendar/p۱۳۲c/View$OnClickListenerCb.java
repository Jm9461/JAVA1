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
import com.lawyer_smartCalendar.activity.AddClientActivity;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.p۱۳۰a.Ck;
import com.lawyer_smartCalendar.utils.Cb;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.c.b  reason: invalid class name */
public class View$OnClickListenerCb extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private TextView f۱۴۴۹۵a0;

    /* renamed from: b0  reason: contains not printable characters */
    private FloatingActionButton f۱۴۴۹۶b0;

    /* renamed from: c0  reason: contains not printable characters */
    private RecyclerView f۱۴۴۹۷c0;

    /* renamed from: d0  reason: contains not printable characters */
    private int f۱۴۴۹۸d0 = 103;

    /* renamed from: e0  reason: contains not printable characters */
    private int f۱۴۴۹۹e0 = 104;

    /* renamed from: f0  reason: contains not printable characters */
    private boolean f۱۴۵۰۰f0 = false;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۹۷a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۵۰۰d0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۴۹۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab2, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۹۸a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        this.f۱۴۴۹۵a0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.f۱۴۴۹۶b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_client);
        this.f۱۴۴۹۶b0.setOnClickListener(this);
        this.f۱۴۴۹۷c0 = (RecyclerView) view.findViewById(R.id.recyclerView_client);
        this.f۱۴۴۹۷c0.setLayoutManager(new LinearLayoutManager(m۱۲۱۹۷d()));
        m۱۷۵۰۰d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_client) {
            Intent frm_add_client = new Intent(m۱۲۱۹۷d(), AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            m۱۲۱۶۶a(frm_add_client, this.f۱۴۴۹۸d0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lawyer_smartCalendar.c.b$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Ci db = new Ci(View$OnClickListenerCb.this.m۱۲۱۹۷d());
            db.m۱۷۸۱۱n();
            List<Client> clientList = db.m۱۷۸۰۱i();
            db.close();
            View$OnClickListenerCb.this.f۱۴۴۹۷c0.setAdapter(new Ck(View$OnClickListenerCb.this.m۱۲۱۹۷d(), View$OnClickListenerCb.this, clientList));
            if (clientList.isEmpty()) {
                View$OnClickListenerCb.this.f۱۴۴۹۷c0.setVisibility(8);
                View$OnClickListenerCb.this.f۱۴۴۹۵a0.setVisibility(0);
            } else {
                View$OnClickListenerCb.this.f۱۴۴۹۷c0.setVisibility(0);
                View$OnClickListenerCb.this.f۱۴۴۹۵a0.setVisibility(8);
            }
            if (View$OnClickListenerCb.this.f۱۴۵۰۰f0) {
                Cb.f۱۴۷۷۴a.m۱۷۴۳۴n();
            }
        }
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۷۵۰۰d0() {
        m۱۲۱۹۷d().runOnUiThread(new RunnableCa());
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۴۹۹b(Intent intent) {
        m۱۲۱۶۶a(intent, this.f۱۴۴۹۹e0);
    }
}
