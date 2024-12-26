package ir.mirrajabi.persiancalendar.f.e;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ir.mirrajabi.persiancalendar.c;
import ir.mirrajabi.persiancalendar.f.b;

public class a extends f implements ViewPager.j {
    private ViewPager a0;
    private b b0;
    private int c0;

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(c.fragment_calendar, container, false);
        this.b0 = b.a(k());
        this.c0 = 0;
        this.a0 = (ViewPager) view.findViewById(ir.mirrajabi.persiancalendar.b.calendar_pager);
        this.b0.a(new C۰۱۲۸a(this));
        e0();
        return view;
    }

    /* renamed from: ir.mirrajabi.persiancalendar.f.e.a$a  reason: collision with other inner class name */
    class C۰۱۲۸a implements ir.mirrajabi.persiancalendar.f.f.c {
        C۰۱۲۸a(a this$0) {
        }
    }

    private void e0() {
        this.a0.setAdapter(new ir.mirrajabi.persiancalendar.f.c.a(j()));
        this.a0.setCurrentItem(2500);
        this.a0.a(this);
    }

    public void e(int position) {
        ViewPager viewPager = this.a0;
        viewPager.a(viewPager.getCurrentItem() + position, true);
    }

    @Override // android.support.v4.view.ViewPager.j
    public void a(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // android.support.v4.view.ViewPager.j
    public void b(int position) {
        this.c0 = position - 2500;
        Intent intent = new Intent("BROADCAST_INTENT_TO_MONTH_FRAGMENT");
        intent.putExtra("BROADCAST_FIELD_TO_MONTH_FRAGMENT", this.c0);
        intent.putExtra("BROADCAST_FIELD_SELECT_DAY", -1);
        android.support.v4.content.c.a(k()).a(intent);
    }

    @Override // android.support.v4.view.ViewPager.j
    public void a(int state) {
    }

    public int d0() {
        return this.c0;
    }
}
