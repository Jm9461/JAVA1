package ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g;

import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Ca;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Cb;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Cc;
import java.util.Calendar;

/* renamed from: ir.mirrajabi.persiancalendar.f.g.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf extends AbstractCa {

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۶۴۴۲a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۶۴۴۳b;

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۶۴۴۴c;

    public Cf(int year, int month, int day) {
        m۱۷۷۲۳c(year);
        this.f۱۶۴۴۴c = 1;
        m۱۷۷۲۱b(month);
        m۱۷۷۱۸a(day);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Cf m۱۷۷۲۶clone() {
        return new Cf(m۱۷۷۲۴d(), mo۱۷۷۲۰b(), m۱۷۷۲۲c());
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۷۷۲۲c() {
        return this.f۱۶۴۴۴c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۷۱۸a(int day) {
        if (day < 1) {
            throw new Ca("day " + day + " is out of range!");
        }
        if (this.f۱۶۴۴۳b <= 6 && day > 31) {
            throw new Ca("day " + day + " is out of range!");
        }
        int i = this.f۱۶۴۴۳b;
        if (i > 6 && i <= 12 && day > 30) {
            throw new Ca("day " + day + " is out of range!");
        }
        if (m۱۷۷۲۵e() && this.f۱۶۴۴۳b == 12 && day > 30) {
            throw new Ca("day " + day + " is out of range!");
        }
        if (!m۱۷۷۲۵e() && this.f۱۶۴۴۳b == 12 && day > 29) {
            throw new Ca("day " + day + " is out of range!");
        }
        this.f۱۶۴۴۴c = day;
    }

    @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۷۲۰b() {
        return this.f۱۶۴۴۳b;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۷۷۲۱b(int month) {
        if (month < 1 || month > 12) {
            throw new Cb("month " + month + " is out of range!");
        }
        m۱۷۷۱۸a(this.f۱۶۴۴۴c);
        this.f۱۶۴۴۳b = month;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۷۷۲۴d() {
        return this.f۱۶۴۴۲a;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۷۷۲۳c(int year) {
        if (year == 0) {
            throw new Cc("Year 0 is invalid!");
        }
        this.f۱۶۴۴۲a = year;
    }

    @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۷۱۷a() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, this.f۱۶۴۴۲a);
        cal.set(2, this.f۱۶۴۴۳b - 1);
        cal.set(5, this.f۱۶۴۴۴c);
        return cal.get(7);
    }

    /* renamed from: e, reason: contains not printable characters */
    public boolean m۱۷۷۲۵e() {
        int y;
        int i = this.f۱۶۴۴۲a;
        if (i > 0) {
            y = i - 474;
        } else {
            y = 473;
        }
        return ((((y % 2820) + 474) + 38) * 682) % 2816 < 682;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۷۱۹a(Cf persianDate) {
        return m۱۷۷۲۲c() == persianDate.m۱۷۷۲۲c() && mo۱۷۷۲۰b() == persianDate.mo۱۷۷۲۰b() && (m۱۷۷۲۴d() == persianDate.m۱۷۷۲۴d() || m۱۷۷۲۴d() == -1);
    }
}
