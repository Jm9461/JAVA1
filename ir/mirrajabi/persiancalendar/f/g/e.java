package ir.mirrajabi.persiancalendar.f.g;

import ir.mirrajabi.persiancalendar.f.d.a;
import ir.mirrajabi.persiancalendar.f.d.b;
import ir.mirrajabi.persiancalendar.f.d.c;

public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f۴۳۰۴a = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f۴۳۰۵b;

    /* renamed from: c  reason: collision with root package name */
    private int f۴۳۰۶c;

    public e(int year, int month, int day) {
        c(year);
        b(month);
        a(day);
    }

    public int c() {
        return this.f۴۳۰۴a;
    }

    public void a(int day) {
        if (day < 1 || day > 30) {
            throw new a("day " + day + " " + "is out of range!");
        }
        this.f۴۳۰۴a = day;
    }

    @Override // ir.mirrajabi.persiancalendar.f.g.a
    public int a() {
        throw new RuntimeException("not implemented yet!");
    }

    @Override // ir.mirrajabi.persiancalendar.f.g.a
    public int b() {
        return this.f۴۳۰۵b;
    }

    public void b(int month) {
        if (month < 1 || month > 12) {
            throw new b("month " + month + " " + "is out of range!");
        }
        a(this.f۴۳۰۴a);
        this.f۴۳۰۵b = month;
    }

    public int d() {
        return this.f۴۳۰۶c;
    }

    public void c(int year) {
        if (year != 0) {
            this.f۴۳۰۶c = year;
            return;
        }
        throw new c("Year 0 is invalid!");
    }

    public e clone() {
        return new e(d(), b(), c());
    }
}
