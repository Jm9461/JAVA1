package com.mohamadamin.persianmaterialdatetimepicker.j;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class b extends GregorianCalendar {

    /* renamed from: c  reason: collision with root package name */
    private int f۳۳۶۱c;

    /* renamed from: d  reason: collision with root package name */
    private int f۳۳۶۲d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۳۶۳e;

    /* renamed from: f  reason: collision with root package name */
    private String f۳۳۶۴f = "/";

    private long a(long julianDate) {
        return ((86400000 * julianDate) - 210866803200000L) + d.a((double) (getTimeInMillis() - -210866803200000L), 8.64E7d);
    }

    public b() {
        setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* access modifiers changed from: protected */
    public void a() {
        long PersianRowDate = d.a(((long) Math.floor((double) (getTimeInMillis() - -210866803200000L))) / 86400000);
        long year = PersianRowDate >> 16;
        int month = ((int) (65280 & PersianRowDate)) >> 8;
        int day = (int) (255 & PersianRowDate);
        this.f۳۳۶۱c = (int) (year > 0 ? year : year - 1);
        this.f۳۳۶۲d = month;
        this.f۳۳۶۳e = day;
    }

    public void a(int persianYear, int persianMonth, int persianDay) {
        this.f۳۳۶۱c = persianYear;
        this.f۳۳۶۲d = persianMonth + 1;
        this.f۳۳۶۳e = persianDay;
        int i = this.f۳۳۶۱c;
        if (i <= 0) {
            i++;
        }
        setTimeInMillis(a(d.a((long) i, this.f۳۳۶۲d - 1, this.f۳۳۶۳e)));
    }

    public int h() {
        return this.f۳۳۶۱c;
    }

    public int d() {
        return this.f۳۳۶۲d;
    }

    public String e() {
        return c.f۳۳۶۵a[this.f۳۳۶۲d];
    }

    public int b() {
        return this.f۳۳۶۳e;
    }

    public String g() {
        int i = get(7);
        if (i == 1) {
            return c.f۳۳۶۶b[1];
        }
        if (i == 2) {
            return c.f۳۳۶۶b[2];
        }
        if (i == 3) {
            return c.f۳۳۶۶b[3];
        }
        if (i == 4) {
            return c.f۳۳۶۶b[4];
        }
        if (i != 5) {
            return i != 7 ? c.f۳۳۶۶b[6] : c.f۳۳۶۶b[0];
        }
        return c.f۳۳۶۶b[5];
    }

    public String c() {
        return g() + "  " + this.f۳۳۶۳e + "  " + e() + "  " + this.f۳۳۶۱c;
    }

    public String f() {
        return "" + a(this.f۳۳۶۱c) + this.f۳۳۶۴f + a(d() + 1) + this.f۳۳۶۴f + a(this.f۳۳۶۳e);
    }

    private String a(int i) {
        if (i >= 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public void a(int field, int amount) {
        if (amount != 0) {
            if (field < 0 || field >= 15) {
                throw new IllegalArgumentException();
            } else if (field == 1) {
                a(this.f۳۳۶۱c + amount, d() + 1, this.f۳۳۶۳e);
            } else if (field == 2) {
                a(this.f۳۳۶۱c + (((d() + 1) + amount) / 12), ((d() + 1) + amount) % 12, this.f۳۳۶۳e);
            } else {
                add(field, amount);
                a();
            }
        }
    }

    public String toString() {
        String str = super.toString();
        return str.substring(0, str.length() - 1) + ",PersianDate=" + f() + "]";
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void set(int field, int value) {
        super.set(field, value);
        a();
    }

    public void setTimeInMillis(long millis) {
        super.setTimeInMillis(millis);
        a();
    }

    public void setTimeZone(TimeZone zone) {
        super.setTimeZone(zone);
        a();
    }
}
