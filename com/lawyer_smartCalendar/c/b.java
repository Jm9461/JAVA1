package com.lawyer_smartCalendar.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.a.k;
import com.lawyer_smartCalendar.activity.AddClientActivity;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class b extends f implements View.OnClickListener {
    private TextView a0;
    private FloatingActionButton b0;
    private RecyclerView c0;
    private int d0 = 103;
    private int e0 = 104;
    private boolean f0 = false;

    @Override // android.support.v4.app.f
    public void a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            d0();
        }
    }

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_tab2, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        this.a0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_client);
        this.b0.setOnClickListener(this);
        this.c0 = (RecyclerView) view.findViewById(R.id.recyclerView_client);
        this.c0.setLayoutManager(new LinearLayoutManager(d()));
        d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_client) {
            Intent frm_add_client = new Intent(d(), AddClientActivity.class);
            frm_add_client.putExtra("frmMode", "add");
            a(frm_add_client, this.d0);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            i db = new i(b.this.d());
            db.n();
            List<Client> clientList = db.i();
            db.close();
            b.this.c0.setAdapter(new k(b.this.d(), b.this, clientList));
            if (clientList.isEmpty()) {
                b.this.c0.setVisibility(8);
                b.this.a0.setVisibility(0);
            } else {
                b.this.c0.setVisibility(0);
                b.this.a0.setVisibility(8);
            }
            if (b.this.f0) {
                com.lawyer_smartCalendar.utils.b.f۳۲۴۸a.n();
            }
        }
    }

    public void d0() {
        d().runOnUiThread(new a());
    }

    public void b(Intent intent) {
        a(intent, this.e0);
    }
}
