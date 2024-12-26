package ir.mirrajabi.persiancalendar.f.g;

import ir.mirrajabi.persiancalendar.f.d.a;
import ir.mirrajabi.persiancalendar.f.d.b;
import java.util.Calendar;

public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f۴۲۹۳d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: a  reason: collision with root package name */
    private int f۴۲۹۴a;

    /* renamed from: b  reason: collision with root package name */
    private int f۴۲۹۵b;

    /* renamed from: c  reason: collision with root package name */
    private int f۴۲۹۶c;

    public c() {
        this(Calendar.getInstance());
    }

    public c(Calendar calendar) {
        this.f۴۲۹۴a = calendar.get(1);
        this.f۴۲۹۵b = calendar.get(2) + 1;
        this.f۴۲۹۶c = calendar.get(5);
    }

    public c(int year, int month, int day) {
        this();
        c(year);
        this.f۴۲۹۶c = 1;
        b(month);
        a(day);
    }

    public int c() {
        return this.f۴۲۹۶c;
    }

    public void a(int day) {
        if (day >= 1) {
            int i = this.f۴۲۹۵b;
            if (i != 2 && day > f۴۲۹۳d[i]) {
                throw new a("day " + day + " " + "is out of range!");
            } else if (this.f۴۲۹۵b == 2 && e() && day > 29) {
                throw new a("day " + day + " " + "is out of range!");
            } else if (this.f۴۲۹۵b != 2 || e() || day <= 28) {
                this.f۴۲۹۶c = day;
            } else {
                throw new a("day " + day + " " + "is out of range!");
            }
        } else {
            throw new a("day " + day + " " + "is out of range!");
        }
    }

    @Override // ir.mirrajabi.persiancalendar.f.g.a
    public int a() {
        Calendar cal = Calendar.getInstance();
        cal.set(1, this.f۴۲۹۴a);
        cal.set(2, this.f۴۲۹۵b - 1);
        cal.set(5, this.f۴۲۹۶c);
        return cal.get(7);
    }

    @Override // ir.mirrajabi.persiancalendar.f.g.a
    public int b() {
        return this.f۴۲۹۵b;
    }

    public void b(int month) {
        if (month < 1 || month > 12) {
            throw new b("month " + month + " " + "is out of range!");
        }
        a(c());
        this.f۴۲۹۵b = month;
    }

    public int d() {
        return this.f۴۲۹۴a;
    }

    public void c(int year) {
        if (year != 0) {
            this.f۴۲۹۴a = year;
            return;
        }
        throw new ir.mirrajabi.persiancalendar.f.d.c("Year 0 is invalid!");
    }

    public boolean e() {
        int i = this.f۴۲۹۴a;
        if (i % 400 == 0) {
            return true;
        }
        if (i % 100 != 0 && i % 4 == 0) {
            return true;
        }
        return false;
    }

    public c clone() {
        return new c(d(), b(), c());
    }
}
