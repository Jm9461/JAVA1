package com.lawyer_smartCalendar.c;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.a.w;
import com.lawyer_smartCalendar.activity.AddNoteActivity;
import com.lawyer_smartCalendar.model.Note;
import com.lawyer_smartCalendar.utils.c;
import com.lawyer_smartCalendar.utils.i;
import info.hoang8f.android.segmented.SegmentedGroup;
import java.util.List;

public class o extends f implements View.OnClickListener {
    private FloatingActionButton a0;
    private RecyclerView b0;
    private int c0 = 102;
    private TextView d0;
    public String e0 = "DailyActivity";

    @Override // android.support.v4.app.f
    public void a(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            d0();
        }
    }

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_note, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        new i(d());
        this.d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_note);
        this.a0.setOnClickListener(this);
        this.b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.b0.setLayoutManager(new LinearLayoutManager(d()));
        SegmentedGroup segmented3 = (SegmentedGroup) view.findViewById(R.id.segmented2);
        segmented3.setTintColor(Color.parseColor(c.d()));
        segmented3.setOnCheckedChangeListener(new a());
        d0();
    }

    class a implements RadioGroup.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            switch (checkedId) {
                case R.id.button21 /*{ENCODED_INT: 2131296360}*/:
                    o.this.e0 = "Other";
                    break;
                case R.id.button22 /*{ENCODED_INT: 2131296361}*/:
                    o.this.e0 = "ClientCase";
                    break;
                case R.id.button23 /*{ENCODED_INT: 2131296362}*/:
                    o.this.e0 = "DailyActivity";
                    break;
            }
            o.this.d0();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_note) {
            Intent frm_add_note = new Intent(d(), AddNoteActivity.class);
            frm_add_note.putExtra("frmMode", "add");
            b(frm_add_note);
        }
    }

    public void d0() {
        i db = new i(d());
        db.n();
        List<Note> noteList = db.s(this.e0);
        db.close();
        this.b0.setAdapter(new w(d(), this, noteList));
        if (noteList.isEmpty()) {
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
