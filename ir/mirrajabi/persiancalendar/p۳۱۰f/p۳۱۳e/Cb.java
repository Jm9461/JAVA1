package ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۳e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ir.mirrajabi.persiancalendar.Cc;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cd;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cf;
import java.util.List;

/* renamed from: ir.mirrajabi.persiancalendar.f.e.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends ComponentCallbacksCf {

    /* renamed from: a0, reason: contains not printable characters */
    private ir.mirrajabi.persiancalendar.p۳۱۰f.Cb f۱۶۴۱۸a0;

    /* renamed from: b0, reason: contains not printable characters */
    private Ca f۱۶۴۱۹b0;

    /* renamed from: c0, reason: contains not printable characters */
    private Cf f۱۶۴۲۰c0;

    /* renamed from: d0, reason: contains not printable characters */
    private int f۱۶۴۲۱d0;

    /* renamed from: e0, reason: contains not printable characters */
    private ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۱c.Cb f۱۶۴۲۲e0;

    /* renamed from: f0, reason: contains not printable characters */
    private BroadcastReceiver f۱۶۴۲۳f0 = new a();

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۷۶۷۶a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.f۱۶۴۱۸a0 = ir.mirrajabi.persiancalendar.p۳۱۰f.Cb.m۱۷۵۹۱a(m۱۰۱۴۹k());
        View view = inflater.inflate(Cc.fragment_month, container, false);
        this.f۱۶۴۲۱d0 = m۱۰۱۴۵i().getInt("OFFSET_ARGUMENT");
        List<Cd> list = this.f۱۶۴۱۸a0.m۱۷۶۱۸b(this.f۱۶۴۲۱d0);
        this.f۱۶۴۲۰c0 = this.f۱۶۴۱۸a0.m۱۷۶۴۴o();
        int month = (this.f۱۶۴۲۰c0.mo۱۷۷۲۰b() - this.f۱۶۴۲۱d0) - 1;
        int year = this.f۱۶۴۲۰c0.m۱۷۷۲۴d() + (month / 12);
        int month2 = month % 12;
        if (month2 < 0) {
            year--;
            month2 += 12;
        }
        this.f۱۶۴۲۰c0.m۱۷۷۲۱b(month2 + 1);
        this.f۱۶۴۲۰c0.m۱۷۷۲۳c(year);
        this.f۱۶۴۲۰c0.m۱۷۷۱۸a(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(ir.mirrajabi.persiancalendar.Cb.month_recycler);
        recyclerView.setHasFixedSize(true);
        RecyclerView.AbstractCo layoutManager = new GridLayoutManager(m۱۰۱۴۹k(), 7);
        recyclerView.setLayoutManager(layoutManager);
        this.f۱۶۴۲۲e0 = new ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۱c.Cb(m۱۰۱۴۹k(), this, list);
        recyclerView.setAdapter(this.f۱۶۴۲۲e0);
        this.f۱۶۴۱۹b0 = (Ca) m۱۰۱۲۷d().m۱۰۱۹۲e().mo۱۰۳۰۴a(Ca.class.getName());
        if (this.f۱۶۴۲۱d0 == 0) {
            this.f۱۶۴۱۹b0.m۱۷۶۶۹d0();
        }
        android.support.v4.content.Cc.m۱۰۵۶۲a(m۱۰۱۴۹k()).m۱۰۵۶۵a(this.f۱۶۴۲۳f0, new IntentFilter("BROADCAST_INTENT_TO_MONTH_FRAGMENT"));
        return view;
    }

    /* renamed from: ir.mirrajabi.persiancalendar.f.e.b$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int value = intent.getExtras().getInt("BROADCAST_FIELD_TO_MONTH_FRAGMENT");
            if (value == Cb.this.f۱۶۴۲۱d0) {
                if (Cb.this.f۱۶۴۱۸a0.m۱۷۶۴۲m() != null) {
                    Cb.this.f۱۶۴۱۸a0.m۱۷۶۴۲m().mo۱۷۶۸۱a(Cb.this.f۱۶۴۲۰c0);
                }
                int day = intent.getExtras().getInt("BROADCAST_FIELD_SELECT_DAY");
                if (day != -1) {
                    Cb.this.f۱۶۴۲۲e0.m۱۷۶۶۲d(day);
                    return;
                }
                return;
            }
            if (value == Integer.MAX_VALUE) {
                Cb.this.f۱۶۴۲۲e0.m۱۷۶۶۳e();
            }
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: K, reason: contains not printable characters */
    public void mo۱۷۶۷۵K() {
        android.support.v4.content.Cc.m۱۰۵۶۲a(m۱۰۱۴۹k()).m۱۰۵۶۴a(this.f۱۶۴۲۳f0);
        super.mo۱۷۶۷۵K();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۶۷۷a(Cf day) {
        if (this.f۱۶۴۱۸a0.m۱۷۶۴۰k() != null) {
            this.f۱۶۴۱۸a0.m۱۷۶۴۰k().mo۱۷۶۷۹a(day);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۷۶۷۸b(Cf day) {
        if (this.f۱۶۴۱۸a0.m۱۷۶۴۱l() != null) {
            this.f۱۶۴۱۸a0.m۱۷۶۴۱l().m۱۷۶۸۰a(day);
        }
    }
}
