package ir.mirrajabi.persiancalendar.f.g;

import ir.mirrajabi.persiancalendar.f.d.a;
import ir.mirrajabi.persiancalendar.f.d.b;
import ir.mirrajabi.persiancalendar.f.d.c;
import java.util.Calendar;

public class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f۴۳۰۷a;

    /* renamed from: b  reason: collision with root package name */
    private int f۴۳۰۸b;

    /* renamed from: c  reason: collision with root package name */
    private int f۴۳۰۹c = 1;

    public f(int year, int month, int day) {
        c(year);
        b(month);
        a(day);
    }

    public f clone() {
        return new f(d(), b(), c());
    }

    public int c() {
        return this.f۴۳۰۹c;
    }

    public void a(int day) {
        if (day < 1) {
            throw new a("day " + day + " " + "is out of range!");
        } else if (this.f۴۳۰۸b > 6 || day <= 31) {
            int i = this.f۴۳۰۸b;
            if (i > 6 && i <= 12 && day > 30) {
                throw new a("day " + day + " " + "is out of range!");
            } else if (e() && this.f۴۳۰۸b == 12 && day > 30) {
                throw new a("day " + day + " " + "is out of range!");
            } else if (e() || this.f۴۳۰۸b != 12 || day <= 29) {
                this.f۴۳۰۹c = day;
            } else {
                throw new a("day " + day + " " + "is out of range!");
            }
        } else {
            throw new a("day " + day + " " + "is out of range!");
        }
    }

    @Override // ir.mirrajabi.persiancalendar.f.g.a
    public int b() {
        return this.f۴۳۰۸b;
    }

    public void b(int month) {
        if (month < 1 || month > 12) {
            throw new b("month " + month + " " + "is out of range!");
        }
        a(this.f۴۳۰۹c);
        this.f۴۳۰۸b = month;
    }

    public int d() {
        return this.f۴۳۰۷a;
    }

    public void c(int year) {
        if (year != 0) {
            this.f۴۳۰۷a = year;
            return;
        }
        throw new c("Year 0 is invalid!");
    }

    @Override // ir.mirrajabi.persiancalendar.f.g.a
    public int a() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, this.f۴۳۰۷a);
        cal.set(2, this.f۴۳۰۸b - 1);
        cal.set(5, this.f۴۳۰۹c);
        return cal.get(7);
    }

    public boolean e() {
        int y;
        int i = this.f۴۳۰۷a;
        if (i > 0) {
            y = i - 474;
        } else {
            y = 473;
        }
        return ((((y % 2820) + 474) + 38) * 682) % 2816 < 682;
    }

    public boolean a(f persianDate) {
        return c() == persianDate.c() && b() == persianDate.b() && (d() == persianDate.d() || d() == -1);
    }
}
