package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g;

import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Ca;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Cb;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۸d.Cc;

/* renamed from: ir.mirrajabi.persiancalendar.f.g.e  reason: invalid class name */
public class Ce extends AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۶۴۳۹a = 1;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۶۴۴۰b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۶۴۴۱c;

    public Ce(int year, int month, int day) {
        m۱۹۷۹۰c(year);
        m۱۹۷۸۸b(month);
        m۱۹۷۸۶a(day);
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۹۷۸۹c() {
        return this.f۱۶۴۳۹a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۸۶a(int day) {
        if (day < 1 || day > 30) {
            throw new Ca("day " + day + " " + "is out of range!");
        }
        this.f۱۶۴۳۹a = day;
    }

    @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۷۸۵a() {
        throw new RuntimeException("not implemented yet!");
    }

    @Override // p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۷۸۷b() {
        return this.f۱۶۴۴۰b;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۷۸۸b(int month) {
        if (month < 1 || month > 12) {
            throw new Cb("month " + month + " " + "is out of range!");
        }
        m۱۹۷۸۶a(this.f۱۶۴۳۹a);
        this.f۱۶۴۴۰b = month;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۹۷۹۱d() {
        return this.f۱۶۴۴۱c;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۹۷۹۰c(int year) {
        if (year != 0) {
            this.f۱۶۴۴۱c = year;
            return;
        }
        throw new Cc("Year 0 is invalid!");
    }

    public Ce clone() {
        return new Ce(m۱۹۷۹۱d(), m۱۹۷۸۷b(), m۱۹۷۸۹c());
    }
}
