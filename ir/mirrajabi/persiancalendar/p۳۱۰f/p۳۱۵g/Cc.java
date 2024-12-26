package ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g;

import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Ca;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Cb;
import java.util.Calendar;

/* renamed from: ir.mirrajabi.persiancalendar.f.g.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends AbstractCa {

    /* renamed from: d, reason: contains not printable characters */
    private static final int[] f۱۶۴۲۸d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۶۴۲۹a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۶۴۳۰b;

    /* renamed from: c, reason: contains not printable characters */
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
        m۱۷۶۹۲c(year);
        this.f۱۶۴۳۱c = 1;
        m۱۷۶۹۰b(month);
        m۱۷۶۸۸a(day);
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۷۶۹۱c() {
        return this.f۱۶۴۳۱c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۶۸۸a(int day) {
        if (day < 1) {
            throw new Ca("day " + day + " is out of range!");
        }
        int i = this.f۱۶۴۳۰b;
        if (i != 2 && day > f۱۶۴۲۸d[i]) {
            throw new Ca("day " + day + " is out of range!");
        }
        if (this.f۱۶۴۳۰b == 2 && m۱۷۶۹۴e() && day > 29) {
            throw new Ca("day " + day + " is out of range!");
        }
        if (this.f۱۶۴۳۰b == 2 && !m۱۷۶۹۴e() && day > 28) {
            throw new Ca("day " + day + " is out of range!");
        }
        this.f۱۶۴۳۱c = day;
    }

    @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۷۱۷a() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, this.f۱۶۴۲۹a);
        cal.set(2, this.f۱۶۴۳۰b - 1);
        cal.set(5, this.f۱۶۴۳۱c);
        return cal.get(7);
    }

    @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۷۲۰b() {
        return this.f۱۶۴۳۰b;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۷۶۹۰b(int month) {
        if (month < 1 || month > 12) {
            throw new Cb("month " + month + " is out of range!");
        }
        m۱۷۶۸۸a(m۱۷۶۹۱c());
        this.f۱۶۴۳۰b = month;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۷۶۹۳d() {
        return this.f۱۶۴۲۹a;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۷۶۹۲c(int year) {
        if (year == 0) {
            throw new ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Cc("Year 0 is invalid!");
        }
        this.f۱۶۴۲۹a = year;
    }

    /* renamed from: e, reason: contains not printable characters */
    public boolean m۱۷۶۹۴e() {
        int i = this.f۱۶۴۲۹a;
        if (i % 400 == 0) {
            return true;
        }
        return i % 100 != 0 && i % 4 == 0;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Cc m۱۷۶۹۵clone() {
        return new Cc(m۱۷۶۹۳d(), mo۱۷۷۲۰b(), m۱۷۶۹۱c());
    }
}
