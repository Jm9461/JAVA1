package ir.mirrajabi.persiancalendar.f.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ir.mirrajabi.persiancalendar.c;
import ir.mirrajabi.persiancalendar.core.models.Day;
import java.util.List;

public class b extends f {
    private ir.mirrajabi.persiancalendar.f.b a0;
    private a b0;
    private ir.mirrajabi.persiancalendar.f.g.f c0;
    private int d0;
    private ir.mirrajabi.persiancalendar.f.c.b e0;
    private BroadcastReceiver f0 = new a();

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.a0 = ir.mirrajabi.persiancalendar.f.b.a(k());
        View view = inflater.inflate(c.fragment_month, container, false);
        this.d0 = i().getInt("OFFSET_ARGUMENT");
        List<Day> days = this.a0.b(this.d0);
        this.c0 = this.a0.o();
        int month = (this.c0.b() - this.d0) - 1;
        int year = this.c0.d() + (month / 12);
        int month2 = month % 12;
        if (month2 < 0) {
            year--;
            month2 += 12;
        }
        this.c0.b(month2 + 1);
        this.c0.c(year);
        this.c0.a(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(ir.mirrajabi.persiancalendar.b.month_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(k(), 7));
        this.e0 = new ir.mirrajabi.persiancalendar.f.c.b(k(), this, days);
        recyclerView.setAdapter(this.e0);
        this.b0 = (a) d().e().a(a.class.getName());
        if (this.d0 == 0) {
            this.b0.d0();
        }
        android.support.v4.content.c.a(k()).a(this.f0, new IntentFilter("BROADCAST_INTENT_TO_MONTH_FRAGMENT"));
        return view;
    }

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            int value = intent.getExtras().getInt("BROADCAST_FIELD_TO_MONTH_FRAGMENT");
            if (value == b.this.d0) {
                if (b.this.a0.m() != null) {
                    b.this.a0.m().a(b.this.c0);
                }
                int day = intent.getExtras().getInt("BROADCAST_FIELD_SELECT_DAY");
                if (day != -1) {
                    b.this.e0.d(day);
                }
            } else if (value == Integer.MAX_VALUE) {
                b.this.e0.e();
            }
        }
    }

    @Override // android.support.v4.app.f
    public void K() {
        android.support.v4.content.c.a(k()).a(this.f0);
        super.K();
    }

    public void a(ir.mirrajabi.persiancalendar.f.g.f day) {
        if (this.a0.k() != null) {
            this.a0.k().a(day);
        }
    }

    public void b(ir.mirrajabi.persiancalendar.f.g.f day) {
        if (this.a0.l() != null) {
            this.a0.l().a(day);
        }
    }
}
