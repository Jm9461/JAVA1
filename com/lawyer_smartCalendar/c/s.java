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
import com.lawyer_smartCalendar.a.f0;
import com.lawyer_smartCalendar.activity.AddTaxActivity;
import com.lawyer_smartCalendar.model.Tax;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class s extends f implements View.OnClickListener {
    private FloatingActionButton a0;
    private RecyclerView b0;
    private int c0 = 102;
    private TextView d0;

    @Override // android.support.v4.app.f
    public void a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            d0();
        }
    }

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_tax, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        new i(d());
        this.d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_tax);
        this.a0.setOnClickListener(this);
        this.b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.b0.setLayoutManager(new LinearLayoutManager(d()));
        d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_tax) {
            Intent frm_add_note = new Intent(d(), AddTaxActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            b(frm_add_note);
        }
    }

    public void d0() {
        i db = new i(d());
        db.n();
        List<Tax> taxList = db.m();
        db.close();
        this.b0.setAdapter(new f0(d(), this, taxList));
        if (taxList.isEmpty()) {
            this.b0.setVisibility(8);
            this.d0.setVisibility(0);
            return;
        }
        this.b0.setVisibility(0);
        this.d0.setVisibility(8);
    }

    public void b(Intent intent) {
        a(intent, this.c0);
    }
}
