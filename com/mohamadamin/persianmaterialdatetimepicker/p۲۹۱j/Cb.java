package com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.j.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends GregorianCalendar {

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۴۹۷۲c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۴۹۷۳d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۴۹۷۴e;

    /* renamed from: f, reason: contains not printable characters */
    private String f۱۴۹۷۵f = "/";

    /* renamed from: a, reason: contains not printable characters */
    private long m۱۵۹۲۴a(long julianDate) {
        return ((86400000 * julianDate) - 210866803200000L) + Cd.m۱۵۹۳۶a(getTimeInMillis() - (-210866803200000L), 8.64E7d);
    }

    public Cb() {
        setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۱۵۹۲۶a() {
        long julianDate = ((long) Math.floor(getTimeInMillis() - (-210866803200000L))) / 86400000;
        long PersianRowDate = Cd.m۱۵۹۳۷a(julianDate);
        long year = PersianRowDate >> 16;
        int month = ((int) (65280 & PersianRowDate)) >> 8;
        int day = (int) (255 & PersianRowDate);
        this.f۱۴۹۷۲c = (int) (year > 0 ? year : year - 1);
        this.f۱۴۹۷۳d = month;
        this.f۱۴۹۷۴e = day;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۵۹۲۸a(int persianYear, int persianMonth, int persianDay) {
        this.f۱۴۹۷۲c = persianYear;
        this.f۱۴۹۷۳d = persianMonth + 1;
        this.f۱۴۹۷۴e = persianDay;
        int i = this.f۱۴۹۷۲c;
        if (i <= 0) {
            i++;
        }
        setTimeInMillis(m۱۵۹۲۴a(Cd.m۱۵۹۳۸a(i, this.f۱۴۹۷۳d - 1, this.f۱۴۹۷۴e)));
    }

    /* renamed from: h, reason: contains not printable characters */
    public int m۱۵۹۳۵h() {
        return this.f۱۴۹۷۲c;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۵۹۳۱d() {
        return this.f۱۴۹۷۳d;
    }

    /* renamed from: e, reason: contains not printable characters */
    public String m۱۵۹۳۲e() {
        return Cc.f۱۴۹۷۶a[this.f۱۴۹۷۳d];
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۵۹۲۹b() {
        return this.f۱۴۹۷۴e;
    }

    /* renamed from: g, reason: contains not printable characters */
    public String m۱۵۹۳۴g() {
        int i = get(7);
        if (i == 1) {
            return Cc.f۱۴۹۷۷b[1];
        }
        if (i == 2) {
            return Cc.f۱۴۹۷۷b[2];
        }
        if (i == 3) {
            return Cc.f۱۴۹۷۷b[3];
        }
        if (i == 4) {
            return Cc.f۱۴۹۷۷b[4];
        }
        if (i != 5) {
            if (i == 7) {
                return Cc.f۱۴۹۷۷b[0];
            }
            return Cc.f۱۴۹۷۷b[6];
        }
        return Cc.f۱۴۹۷۷b[5];
    }

    /* renamed from: c, reason: contains not printable characters */
    public String m۱۵۹۳۰c() {
        return m۱۵۹۳۴g() + "  " + this.f۱۴۹۷۴e + "  " + m۱۵۹۳۲e() + "  " + this.f۱۴۹۷۲c;
    }

    /* renamed from: f, reason: contains not printable characters */
    public String m۱۵۹۳۳f() {
        return "" + m۱۵۹۲۵a(this.f۱۴۹۷۲c) + this.f۱۴۹۷۵f + m۱۵۹۲۵a(m۱۵۹۳۱d() + 1) + this.f۱۴۹۷۵f + m۱۵۹۲۵a(this.f۱۴۹۷۴e);
    }

    /* renamed from: a, reason: contains not printable characters */
    private String m۱۵۹۲۵a(int i) {
        if (i >= 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۵۹۲۷a(int field, int amount) {
        if (amount == 0) {
            return;
        }
        if (field < 0 || field >= 15) {
            throw new IllegalArgumentException();
        }
        if (field == 1) {
            m۱۵۹۲۸a(this.f۱۴۹۷۲c + amount, m۱۵۹۳۱d() + 1, this.f۱۴۹۷۴e);
        } else if (field == 2) {
            m۱۵۹۲۸a(this.f۱۴۹۷۲c + (((m۱۵۹۳۱d() + 1) + amount) / 12), ((m۱۵۹۳۱d() + 1) + amount) % 12, this.f۱۴۹۷۴e);
        } else {
            add(field, amount);
            m۱۵۹۲۶a();
        }
    }

    @Override // java.util.Calendar
    public String toString() {
        String str = super.toString();
        return str.substring(0, str.length() - 1) + ",PersianDate=" + m۱۵۹۳۳f() + "]";
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Calendar
    public void set(int field, int value) {
        super.set(field, value);
        m۱۵۹۲۶a();
    }

    @Override // java.util.Calendar
    public void setTimeInMillis(long millis) {
        super.setTimeInMillis(millis);
        m۱۵۹۲۶a();
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public void setTimeZone(TimeZone zone) {
        super.setTimeZone(zone);
        m۱۵۹۲۶a();
    }
}
