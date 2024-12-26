package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g;

import java.util.Calendar;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Ca;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Cb;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Cc;

/* renamed from: ir.mirrajabi.persiancalendar.f.g.f  reason: invalid class name */
public class Cf extends AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۶۴۴۲a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۶۴۴۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۶۴۴۴c = 1;

    public Cf(int year, int month, int day) {
        m۱۹۷۹۸c(year);
        m۱۹۷۹۶b(month);
        m۱۹۷۹۳a(day);
    }

    public Cf clone() {
        return new Cf(m۱۹۷۹۹d(), m۱۹۷۹۵b(), m۱۹۷۹۷c());
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۹۷۹۷c() {
        return this.f۱۶۴۴۴c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۹۳a(int day) {
        if (day < 1) {
            throw new Ca("day " + day + " " + "is out of range!");
        } else if (this.f۱۶۴۴۳b > 6 || day <= 31) {
            int i = this.f۱۶۴۴۳b;
            if (i > 6 && i <= 12 && day > 30) {
                throw new Ca("day " + day + " " + "is out of range!");
            } else if (m۱۹۸۰۰e() && this.f۱۶۴۴۳b == 12 && day > 30) {
                throw new Ca("day " + day + " " + "is out of range!");
            } else if (m۱۹۸۰۰e() || this.f۱۶۴۴۳b != 12 || day <= 29) {
                this.f۱۶۴۴۴c = day;
            } else {
                throw new Ca("day " + day + " " + "is out of range!");
            }
        } else {
            throw new Ca("day " + day + " " + "is out of range!");
        }
    }

    @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۷۹۵b() {
        return this.f۱۶۴۴۳b;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۷۹۶b(int month) {
        if (month < 1 || month > 12) {
            throw new Cb("month " + month + " " + "is out of range!");
        }
        m۱۹۷۹۳a(this.f۱۶۴۴۴c);
        this.f۱۶۴۴۳b = month;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۹۷۹۹d() {
        return this.f۱۶۴۴۲a;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۹۷۹۸c(int year) {
        if (year != 0) {
            this.f۱۶۴۴۲a = year;
            return;
        }
        throw new Cc("Year 0 is invalid!");
    }

    @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۷۹۲a() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, this.f۱۶۴۴۲a);
        cal.set(2, this.f۱۶۴۴۳b - 1);
        cal.set(5, this.f۱۶۴۴۴c);
        return cal.get(7);
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۹۸۰۰e() {
        int y;
        int i = this.f۱۶۴۴۲a;
        if (i > 0) {
            y = i - 474;
        } else {
            y = 473;
        }
        return ((((y % 2820) + 474) + 38) * 682) % 2816 < 682;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۷۹۴a(Cf persianDate) {
        return m۱۹۷۹۷c() == persianDate.m۱۹۷۹۷c() && m۱۹۷۹۵b() == persianDate.m۱۹۷۹۵b() && (m۱۹۷۹۹d() == persianDate.m۱۹۷۹۹d() || m۱۹۷۹۹d() == -1);
    }
}
