package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g;

import java.util.Calendar;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Ca;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Cb;

/* renamed from: ir.mirrajabi.persiancalendar.f.g.c  reason: invalid class name */
public class Cc extends AbstractCa {

    /* renamed from: d  reason: contains not printable characters */
    private static final int[] f۱۶۴۲۸d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۶۴۲۹a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۶۴۳۰b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۶۴۳۱c;

    public Cc() {
        this(Calendar.getInstance());
    }

    public Cc(Calendar calendar) {
        this.f۱۶۴۲۹a = calendar.get(1);
        this.f۱۶۴۳۰b = calendar.get(2) + 1;
        this.f۱۶۴۳۱c = calendar.get(5);
    }

    public Cc(int year, int month, int day) {
        this();
        m۱۹۷۶۹c(year);
        this.f۱۶۴۳۱c = 1;
        m۱۹۷۶۷b(month);
        m۱۹۷۶۵a(day);
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۹۷۶۸c() {
        return this.f۱۶۴۳۱c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۶۵a(int day) {
        if (day >= 1) {
            int i = this.f۱۶۴۳۰b;
            if (i != 2 && day > f۱۶۴۲۸d[i]) {
                throw new Ca("day " + day + " " + "is out of range!");
            } else if (this.f۱۶۴۳۰b == 2 && m۱۹۷۷۱e() && day > 29) {
                throw new Ca("day " + day + " " + "is out of range!");
            } else if (this.f۱۶۴۳۰b != 2 || m۱۹۷۷۱e() || day <= 28) {
                this.f۱۶۴۳۱c = day;
            } else {
                throw new Ca("day " + day + " " + "is out of range!");
            }
        } else {
            throw new Ca("day " + day + " " + "is out of range!");
        }
    }

    @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۷۶۴a() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, this.f۱۶۴۲۹a);
        cal.set(2, this.f۱۶۴۳۰b - 1);
        cal.set(5, this.f۱۶۴۳۱c);
        return cal.get(7);
    }

    @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۷۶۶b() {
        return this.f۱۶۴۳۰b;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۷۶۷b(int month) {
        if (month < 1 || month > 12) {
            throw new Cb("month " + month + " " + "is out of range!");
        }
        m۱۹۷۶۵a(m۱۹۷۶۸c());
        this.f۱۶۴۳۰b = month;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۹۷۷۰d() {
        return this.f۱۶۴۲۹a;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۹۷۶۹c(int year) {
        if (year != 0) {
            this.f۱۶۴۲۹a = year;
            return;
        }
        throw new p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Cc("Year 0 is invalid!");
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۹۷۷۱e() {
        int i = this.f۱۶۴۲۹a;
        if (i % 400 == 0) {
            return true;
        }
        if (i % 100 != 0 && i % 4 == 0) {
            return true;
        }
        return false;
    }

    public Cc clone() {
        return new Cc(m۱۹۷۷۰d(), m۱۹۷۶۶b(), m۱۹۷۶۸c());
    }
}
