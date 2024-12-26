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
import com.lawyer_smartCalendar.a.e;
import com.lawyer_smartCalendar.activity.AddCaseActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class j extends f implements View.OnClickListener {
    FloatingActionButton a0;
    private RecyclerView b0;
    private TextView c0;
    private int d0 = 110;

    @Override // android.support.v4.app.f
    public void a(int requestCode, int resultCode, Intent data) {
        super.a(requestCode, resultCode, data);
        if (requestCode == this.d0 && resultCode == -1) {
            d0();
        }
    }

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.client_detail_case_list_fragment, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        this.b0 = (RecyclerView) view.findViewById(R.id.recyclerView_case);
        this.a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_case);
        this.a0.setOnClickListener(this);
        this.b0.setLayoutManager(new LinearLayoutManager(d()));
        this.c0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_case) {
            Intent frm_note = new Intent(d(), AddCaseActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) d()).s + "");
            b(frm_note);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            i db = new i(j.this.d());
            db.n();
            List<Case> caseList = db.a(Integer.parseInt(((ClientDetailActivity) j.this.d()).s));
            db.close();
            j.this.b0.setAdapter(new e(j.this.d(), caseList));
            if (caseList.isEmpty()) {
                j.this.b0.setVisibility(8);
                j.this.c0.setVisibility(0);
                return;
            }
            j.this.b0.setVisibility(0);
            j.this.c0.setVisibility(8);
        }
    }

    public void d0() {
        d().runOnUiThread(new a());
    }

    public void b(Intent intent) {
        a(intent, 102);
    }
}
