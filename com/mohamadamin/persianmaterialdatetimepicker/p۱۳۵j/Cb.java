package com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.j.b  reason: invalid class name */
public class Cb extends GregorianCalendar {

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۴۹۷۲c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۴۹۷۳d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۴۹۷۴e;

    /* renamed from: f  reason: contains not printable characters */
    private String f۱۴۹۷۵f = "/";

    /* renamed from: a  reason: contains not printable characters */
    private long m۱۸۰۰۲a(long julianDate) {
        return ((86400000 * julianDate) - 210866803200000L) + Cd.m۱۸۰۱۴a((double) (getTimeInMillis() - -210866803200000L), 8.64E7d);
    }

    public Cb() {
        setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۰۴a() {
        long PersianRowDate = Cd.m۱۸۰۱۵a(((long) Math.floor((double) (getTimeInMillis() - -210866803200000L))) / 86400000);
        long year = PersianRowDate >> 16;
        int month = ((int) (65280 & PersianRowDate)) >> 8;
        int day = (int) (255 & PersianRowDate);
        this.f۱۴۹۷۲c = (int) (year > 0 ? year : year - 1);
        this.f۱۴۹۷۳d = month;
        this.f۱۴۹۷۴e = day;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۰۶a(int persianYear, int persianMonth, int persianDay) {
        this.f۱۴۹۷۲c = persianYear;
        this.f۱۴۹۷۳d = persianMonth + 1;
        this.f۱۴۹۷۴e = persianDay;
        int i = this.f۱۴۹۷۲c;
        if (i <= 0) {
            i++;
        }
        setTimeInMillis(m۱۸۰۰۲a(Cd.m۱۸۰۱۶a((long) i, this.f۱۴۹۷۳d - 1, this.f۱۴۹۷۴e)));
    }

    /* renamed from: h  reason: contains not printable characters */
    public int m۱۸۰۱۳h() {
        return this.f۱۴۹۷۲c;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۸۰۰۹d() {
        return this.f۱۴۹۷۳d;
    }

    /* renamed from: e  reason: contains not printable characters */
    public String m۱۸۰۱۰e() {
        return Cc.f۱۴۹۷۶a[this.f۱۴۹۷۳d];
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۸۰۰۷b() {
        return this.f۱۴۹۷۴e;
    }

    /* renamed from: g  reason: contains not printable characters */
    public String m۱۸۰۱۲g() {
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
            return i != 7 ? Cc.f۱۴۹۷۷b[6] : Cc.f۱۴۹۷۷b[0];
        }
        return Cc.f۱۴۹۷۷b[5];
    }

    /* renamed from: c  reason: contains not printable characters */
    public String m۱۸۰۰۸c() {
        return m۱۸۰۱۲g() + "  " + this.f۱۴۹۷۴e + "  " + m۱۸۰۱۰e() + "  " + this.f۱۴۹۷۲c;
    }

    /* renamed from: f  reason: contains not printable characters */
    public String m۱۸۰۱۱f() {
        return "" + m۱۸۰۰۳a(this.f۱۴۹۷۲c) + this.f۱۴۹۷۵f + m۱۸۰۰۳a(m۱۸۰۰۹d() + 1) + this.f۱۴۹۷۵f + m۱۸۰۰۳a(this.f۱۴۹۷۴e);
    }

    /* renamed from: a  reason: contains not printable characters */
    private String m۱۸۰۰۳a(int i) {
        if (i >= 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۰۵a(int field, int amount) {
        if (amount != 0) {
            if (field < 0 || field >= 15) {
                throw new IllegalArgumentException();
            } else if (field == 1) {
                m۱۸۰۰۶a(this.f۱۴۹۷۲c + amount, m۱۸۰۰۹d() + 1, this.f۱۴۹۷۴e);
            } else if (field == 2) {
                m۱۸۰۰۶a(this.f۱۴۹۷۲c + (((m۱۸۰۰۹d() + 1) + amount) / 12), ((m۱۸۰۰۹d() + 1) + amount) % 12, this.f۱۴۹۷۴e);
            } else {
                add(field, amount);
                m۱۸۰۰۴a();
            }
        }
    }

    public String toString() {
        String str = super.toString();
        return str.substring(0, str.length() - 1) + ",PersianDate=" + m۱۸۰۱۱f() + "]";
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void set(int field, int value) {
        super.set(field, value);
        m۱۸۰۰۴a();
    }

    public void setTimeInMillis(long millis) {
        super.setTimeInMillis(millis);
        m۱۸۰۰۴a();
    }

    public void setTimeZone(TimeZone zone) {
        super.setTimeZone(zone);
        m۱۸۰۰۴a();
    }
}
