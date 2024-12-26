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
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class c extends f implements View.OnClickListener {
    private TextView a0;
    private FloatingActionButton b0;
    private RecyclerView c0;
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
        return inflater.inflate(R.layout.main_fragment_tab3, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        this.a0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_case);
        this.b0.setOnClickListener(this);
        this.c0 = (RecyclerView) view.findViewById(R.id.recyclerView_case);
        this.c0.setLayoutManager(new LinearLayoutManager(d()));
        d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_case) {
            Intent frm_add_case = new Intent(d(), AddCaseActivity.class);
            frm_add_case.putExtra("frmMode", "add");
            a(frm_add_case);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            i db = new i(c.this.d());
            db.n();
            List<Case> caseList = db.f();
            db.close();
            c.this.c0.setAdapter(new e(c.this.d(), caseList));
            if (caseList.isEmpty()) {
                c.this.c0.setVisibility(8);
                c.this.a0.setVisibility(0);
                return;
            }
            c.this.c0.setVisibility(0);
            c.this.a0.setVisibility(8);
        }
    }

    public void d0() {
        d().runOnUiThread(new a());
    }
}
