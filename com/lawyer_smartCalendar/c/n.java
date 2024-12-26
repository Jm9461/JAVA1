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
import com.lawyer_smartCalendar.a.o;
import com.lawyer_smartCalendar.activity.AddClientDocumentsActivity;
import com.lawyer_smartCalendar.model.ClientDocument;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class n extends f implements View.OnClickListener {
    private RecyclerView a0;
    private FloatingActionButton b0;
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
        return inflater.inflate(R.layout.fragment_tab_document, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        new i(d());
        this.d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.b0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_document);
        this.b0.setOnClickListener(this);
        this.a0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.a0.setLayoutManager(new LinearLayoutManager(d()));
        d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_document) {
            Intent frm_add_note = new Intent(d(), AddClientDocumentsActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            b(frm_add_note);
        }
    }

    public void d0() {
        i db = new i(d());
        db.n();
        List<ClientDocument> clientDocuments = db.h();
        db.close();
        this.a0.setAdapter(new o(d(), this, clientDocuments));
        if (clientDocuments.isEmpty()) {
            this.a0.setVisibility(8);
            this.d0.setVisibility(0);
            return;
        }
        this.a0.setVisibility(0);
        this.d0.setVisibility(8);
    }

    public void b(Intent intent) {
        a(intent, this.c0);
    }
}
