package ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g;

import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Ca;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Cb;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۲d.Cc;

/* renamed from: ir.mirrajabi.persiancalendar.f.g.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends AbstractCa {

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۶۴۳۹a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۶۴۴۰b;

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۶۴۴۱c;

    public Ce(int year, int month, int day) {
        m۱۷۷۱۴c(year);
        this.f۱۶۴۳۹a = 1;
        m۱۷۷۱۲b(month);
        m۱۷۷۱۰a(day);
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۷۷۱۳c() {
        return this.f۱۶۴۳۹a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۷۱۰a(int day) {
        if (day < 1 || day > 30) {
            throw new Ca("day " + day + " is out of range!");
        }
        this.f۱۶۴۳۹a = day;
    }

    @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۷۱۷a() {
        throw new RuntimeException("not implemented yet!");
    }

    @Override // ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۷۲۰b() {
        return this.f۱۶۴۴۰b;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۷۷۱۲b(int month) {
        if (month < 1 || month > 12) {
            throw new Cb("month " + month + " is out of range!");
        }
        m۱۷۷۱۰a(this.f۱۶۴۳۹a);
        this.f۱۶۴۴۰b = month;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۷۷۱۵d() {
        return this.f۱۶۴۴۱c;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۷۷۱۴c(int year) {
        if (year == 0) {
            throw new Cc("Year 0 is invalid!");
        }
        this.f۱۶۴۴۱c = year;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Ce m۱۷۷۱۶clone() {
        return new Ce(m۱۷۷۱۵d(), mo۱۷۷۲۰b(), m۱۷۷۱۳c());
    }
}
