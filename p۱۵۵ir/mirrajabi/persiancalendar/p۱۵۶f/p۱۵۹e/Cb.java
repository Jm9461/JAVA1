package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۹e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۷v7.widget.GridLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ir.mirrajabi.persiancalendar.core.models.Day;
import java.util.List;
import p۱۵۵ir.mirrajabi.persiancalendar.Cc;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cf;

/* renamed from: ir.mirrajabi.persiancalendar.f.e.b  reason: invalid class name */
public class Cb extends ComponentCallbacksCf {

    /* renamed from: a0  reason: contains not printable characters */
    private p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb f۱۶۴۱۸a0;

    /* renamed from: b0  reason: contains not printable characters */
    private Ca f۱۶۴۱۹b0;

    /* renamed from: c0  reason: contains not printable characters */
    private Cf f۱۶۴۲۰c0;

    /* renamed from: d0  reason: contains not printable characters */
    private int f۱۶۴۲۱d0;

    /* renamed from: e0  reason: contains not printable characters */
    private p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۷c.Cb f۱۶۴۲۲e0;

    /* renamed from: f0  reason: contains not printable characters */
    private BroadcastReceiver f۱۶۴۲۳f0 = new Ca();

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۹۷۵۳a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.f۱۶۴۱۸a0 = p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb.m۱۹۶۶۸a(m۱۲۲۱۹k());
        View view = inflater.inflate(Cc.fragment_month, container, false);
        this.f۱۶۴۲۱d0 = m۱۲۲۱۵i().getInt("OFFSET_ARGUMENT");
        List<Day> days = this.f۱۶۴۱۸a0.m۱۹۶۹۵b(this.f۱۶۴۲۱d0);
        this.f۱۶۴۲۰c0 = this.f۱۶۴۱۸a0.m۱۹۷۲۱o();
        int month = (this.f۱۶۴۲۰c0.m۱۹۷۹۵b() - this.f۱۶۴۲۱d0) - 1;
        int year = this.f۱۶۴۲۰c0.m۱۹۷۹۹d() + (month / 12);
        int month2 = month % 12;
        if (month2 < 0) {
            year--;
            month2 += 12;
        }
        this.f۱۶۴۲۰c0.m۱۹۷۹۶b(month2 + 1);
        this.f۱۶۴۲۰c0.m۱۹۷۹۸c(year);
        this.f۱۶۴۲۰c0.m۱۹۷۹۳a(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(p۱۵۵ir.mirrajabi.persiancalendar.Cb.month_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(m۱۲۲۱۹k(), 7));
        this.f۱۶۴۲۲e0 = new p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۷c.Cb(m۱۲۲۱۹k(), this, days);
        recyclerView.setAdapter(this.f۱۶۴۲۲e0);
        this.f۱۶۴۱۹b0 = (Ca) m۱۲۱۹۷d().m۱۲۲۶۲e().m۱۲۳۱۹a(Ca.class.getName());
        if (this.f۱۶۴۲۱d0 == 0) {
            this.f۱۶۴۱۹b0.m۱۹۷۴۶d0();
        }
        android.support.p۰۴۳v4.content.Cc.m۱۲۶۳۲a(m۱۲۲۱۹k()).m۱۲۶۳۵a(this.f۱۶۴۲۳f0, new IntentFilter("BROADCAST_INTENT_TO_MONTH_FRAGMENT"));
        return view;
    }

    /* renamed from: ir.mirrajabi.persiancalendar.f.e.b$a  reason: invalid class name */
    class Ca extends BroadcastReceiver {
        Ca() {
        }

        public void onReceive(Context context, Intent intent) {
            int value = intent.getExtras().getInt("BROADCAST_FIELD_TO_MONTH_FRAGMENT");
            if (value == Cb.this.f۱۶۴۲۱d0) {
                if (Cb.this.f۱۶۴۱۸a0.m۱۹۷۱۹m() != null) {
                    Cb.this.f۱۶۴۱۸a0.m۱۹۷۱۹m().m۱۹۷۵۸a(Cb.this.f۱۶۴۲۰c0);
                }
                int day = intent.getExtras().getInt("BROADCAST_FIELD_SELECT_DAY");
                if (day != -1) {
                    Cb.this.f۱۶۴۲۲e0.m۱۹۷۳۹d(day);
                }
            } else if (value == Integer.MAX_VALUE) {
                Cb.this.f۱۶۴۲۲e0.m۱۹۷۴۰e();
            }
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: K  reason: contains not printable characters */
    public void m۱۹۷۵۲K() {
        android.support.p۰۴۳v4.content.Cc.m۱۲۶۳۲a(m۱۲۲۱۹k()).m۱۲۶۳۴a(this.f۱۶۴۲۳f0);
        super.m۱۲۱۳۵K();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۵۴a(Cf day) {
        if (this.f۱۶۴۱۸a0.m۱۹۷۱۷k() != null) {
            this.f۱۶۴۱۸a0.m۱۹۷۱۷k().m۱۹۷۵۶a(day);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۷۵۵b(Cf day) {
        if (this.f۱۶۴۱۸a0.m۱۹۷۱۸l() != null) {
            this.f۱۶۴۱۸a0.m۱۹۷۱۸l().m۱۹۷۵۷a(day);
        }
    }
}
