package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۹e;

import android.content.Intent;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۳v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p۱۵۵ir.mirrajabi.persiancalendar.Cc;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۰f.AbstractCc;

/* renamed from: ir.mirrajabi.persiancalendar.f.e.a  reason: invalid class name */
public class Ca extends ComponentCallbacksCf implements ViewPager.AbstractCj {

    /* renamed from: a0  reason: contains not printable characters */
    private ViewPager f۱۶۴۱۵a0;

    /* renamed from: b0  reason: contains not printable characters */
    private Cb f۱۶۴۱۶b0;

    /* renamed from: c0  reason: contains not printable characters */
    private int f۱۶۴۱۷c0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۹۷۴۲a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(Cc.fragment_calendar, container, false);
        this.f۱۶۴۱۶b0 = Cb.m۱۹۶۶۸a(m۱۲۲۱۹k());
        this.f۱۶۴۱۷c0 = 0;
        this.f۱۶۴۱۵a0 = (ViewPager) view.findViewById(p۱۵۵ir.mirrajabi.persiancalendar.Cb.calendar_pager);
        this.f۱۶۴۱۶b0.m۱۹۶۷۹a(new Ca(this));
        m۱۹۷۴۱e0();
        return view;
    }

    /* renamed from: ir.mirrajabi.persiancalendar.f.e.a$a  reason: invalid class name */
    class Ca implements AbstractCc {
        Ca(Ca this$0) {
        }
    }

    /* renamed from: e0  reason: contains not printable characters */
    private void m۱۹۷۴۱e0() {
        this.f۱۶۴۱۵a0.setAdapter(new p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۷c.Ca(m۱۲۲۱۷j()));
        this.f۱۶۴۱۵a0.setCurrentItem(2500);
        this.f۱۶۴۱۵a0.m۱۲۷۶۶a(this);
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۹۷۴۷e(int position) {
        ViewPager viewPager = this.f۱۶۴۱۵a0;
        viewPager.m۱۲۷۶۲a(viewPager.getCurrentItem() + position, true);
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۴۴a(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۷۴۵b(int position) {
        this.f۱۶۴۱۷c0 = position - 2500;
        Intent intent = new Intent("BROADCAST_INTENT_TO_MONTH_FRAGMENT");
        intent.putExtra("BROADCAST_FIELD_TO_MONTH_FRAGMENT", this.f۱۶۴۱۷c0);
        intent.putExtra("BROADCAST_FIELD_SELECT_DAY", -1);
        android.support.p۰۴۳v4.content.Cc.m۱۲۶۳۲a(m۱۲۲۱۹k()).m۱۲۶۳۶a(intent);
    }

    @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۴۳a(int state) {
    }

    /* renamed from: d0  reason: contains not printable characters */
    public int m۱۹۷۴۶d0() {
        return this.f۱۶۴۱۷c0;
    }
}
