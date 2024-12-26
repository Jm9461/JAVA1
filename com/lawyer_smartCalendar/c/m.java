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
import com.lawyer_smartCalendar.a.n;
import com.lawyer_smartCalendar.activity.AddMeetingActivity;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class m extends f implements View.OnClickListener {
    FloatingActionButton a0;
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
        return inflater.inflate(R.layout.client_detail_schedule_list_fragment, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        new i(d());
        this.d0 = (TextView) view.findViewById(R.id.txt_recycle_no_data);
        this.a0 = (FloatingActionButton) view.findViewById(R.id.actionButton_add_meeting);
        this.a0.setOnClickListener(this);
        this.b0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.b0.setLayoutManager(new LinearLayoutManager(d()));
        d0();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.actionButton_add_meeting) {
            Intent frm_note = new Intent(d(), AddMeetingActivity.class);
            frm_note.putExtra("frmMode", "add");
            frm_note.putExtra("frmStarter", "client");
            frm_note.putExtra("id", ((ClientDetailActivity) d()).s + "");
            b(frm_note);
        }
    }

    public void d0() {
        i db = new i(d());
        db.n();
        List<Schedule> ScheduleList = db.z(((ClientDetailActivity) d()).s);
        db.close();
        this.b0.setAdapter(new n(d(), this, ScheduleList));
        if (ScheduleList.isEmpty()) {
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
