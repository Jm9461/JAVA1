package p۱۵۵ir.mirrajabi.persiancalendar.p۱۶۲g;

import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cc;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Ce;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cf;

/* renamed from: ir.mirrajabi.persiancalendar.g.b  reason: invalid class name */
public final class Cb {
    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۹۸۰۸a(Cc civil) {
        long lYear = (long) civil.m۱۹۷۷۰d();
        long lMonth = (long) civil.m۱۹۷۶۶b();
        long lDay = (long) civil.m۱۹۷۶۸c();
        return (lYear > 1582 || (lYear == 1582 && lMonth > 10) || (lYear == 1582 && lMonth == 10 && lDay > 14)) ? (((((((4800 + lYear) + ((lMonth - 14) / 12)) * 1461) / 4) + ((((lMonth - 2) - (((lMonth - 14) / 12) * 12)) * 367) / 12)) - (((((lYear + 4900) + ((lMonth - 14) / 12)) / 100) * 3) / 4)) + lDay) - 32075 : m۱۹۸۰۷a(lYear, lMonth, lDay);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cf m۱۹۸۱۵b(Cc civil) {
        return m۱۹۸۱۶c(m۱۹۸۰۸a(civil));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static long m۱۹۸۰۵a(double d) {
        return (long) Math.floor(d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۹۸۱۰a(Ce islamic) {
        return m۱۹۸۰۹a(m۱۹۸۱۲b(islamic));
    }

    /* renamed from: b  reason: contains not printable characters */
    public static long m۱۹۸۱۲b(Ce islamic) {
        int year = islamic.m۱۹۷۹۱d();
        int month = islamic.m۱۹۷۸۷b();
        int day = islamic.m۱۹۷۸۹c();
        if (year < 0) {
            year++;
        }
        double d = m۱۹۸۱۷d(1048 + ((long) (((year * 12) + month) - 16861)));
        double d2 = (double) day;
        Double.isNaN(d2);
        return m۱۹۸۰۵a(d + d2 + 0.5d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۹۸۰۹a(long jdn) {
        if (jdn <= 2299160) {
            return m۱۹۸۱۴b(jdn);
        }
        long l = 68569 + jdn;
        long n = (l * 4) / 146097;
        long l2 = l - (((146097 * n) + 3) / 4);
        long i = ((1 + l2) * 4000) / 1461001;
        long l3 = (l2 - ((1461 * i) / 4)) + 31;
        long j = (l3 * 80) / 2447;
        int day = (int) (l3 - ((2447 * j) / 80));
        long l4 = j / 11;
        return new Cc((int) (((n - 49) * 100) + i + l4), (int) ((2 + j) - (12 * l4)), day);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cc m۱۹۸۱۴b(long jdn) {
        long j = jdn + 1402;
        long k = (j - 1) / 1461;
        long l = j - (k * 1461);
        long n = ((l - 1) / 365) - (l / 1461);
        long i = (l - (365 * n)) + 30;
        long j2 = (i * 80) / 2447;
        int day = (int) (i - ((2447 * j2) / 80));
        long i2 = j2 / 11;
        return new Cc((int) ((((4 * k) + n) + i2) - 4716), (int) ((2 + j2) - (12 * i2)), day);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Cf m۱۹۸۱۶c(long jdn) {
        long aux2;
        int month;
        long depoch = jdn - m۱۹۸۰۶a(475, 1, 1);
        long cycle = depoch / 1029983;
        long cyear = depoch % 1029983;
        if (cyear == 1029982) {
            aux2 = 2820;
        } else {
            long aux1 = cyear / 366;
            double d = (double) ((2134 * aux1) + (2816 * (cyear % 366)) + 2815);
            Double.isNaN(d);
            aux2 = m۱۹۸۰۵a(d / 1028522.0d) + aux1 + 1;
        }
        int year = (int) ((2820 * cycle) + aux2 + 474);
        if (year <= 0) {
            year--;
        }
        long yday = (jdn - m۱۹۸۰۶a(year, 1, 1)) + 1;
        if (yday <= 186) {
            double d2 = (double) yday;
            Double.isNaN(d2);
            month = (int) Math.ceil(d2 / 31.0d);
        } else {
            double d3 = (double) (yday - 6);
            Double.isNaN(d3);
            month = (int) Math.ceil(d3 / 30.0d);
        }
        return new Cf(year, month, ((int) (jdn - m۱۹۸۰۶a(year, month, 1))) + 1);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۹۸۰۷a(long lYear, long lMonth, long lDay) {
        return ((367 * lYear) - ((((5001 + lYear) + ((lMonth - 9) / 7)) * 7) / 4)) + ((275 * lMonth) / 9) + lDay + 1729777;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۹۸۱۱a(Cf persian) {
        return m۱۹۸۰۹a(m۱۹۸۱۳b(persian));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۹۸۰۶a(int year, int month, int day) {
        long epbase;
        long mdays;
        if (year >= 0) {
            epbase = (long) (year - 474);
        } else {
            epbase = (long) (year - 473);
        }
        long epyear = (epbase % 2820) + 474;
        if (month <= 7) {
            mdays = (long) ((month - 1) * 31);
        } else {
            mdays = (long) (((month - 1) * 30) + 6);
        }
        return ((long) day) + mdays + (((682 * epyear) - 110) / 2816) + ((epyear - 1) * 365) + ((epbase / 2820) * 1029983) + 1948320;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static long m۱۹۸۱۳b(Cf persian) {
        long epbase;
        long mdays;
        int year = persian.m۱۹۷۹۹d();
        int month = persian.m۱۹۷۹۵b();
        int day = persian.m۱۹۷۹۷c();
        if (year >= 0) {
            epbase = (long) (year - 474);
        } else {
            epbase = (long) (year - 473);
        }
        long epyear = (epbase % 2820) + 474;
        if (month <= 7) {
            mdays = (long) ((month - 1) * 31);
        } else {
            mdays = (long) (((month - 1) * 30) + 6);
        }
        return ((long) day) + mdays + (((682 * epyear) - 110) / 2816) + ((epyear - 1) * 365) + ((epbase / 2820) * 1029983) + 1948320;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static double m۱۹۸۰۴a(long n, int nph) {
        double xtra;
        double d = (double) n;
        double d2 = (double) nph;
        Double.isNaN(d2);
        Double.isNaN(d);
        double k = d + (d2 / 4.0d);
        double T = k / 1236.85d;
        double t2 = T * T;
        double t3 = t2 * T;
        double jd = ((((29.53058868d * k) + 2415020.75933d) - (1.178E-4d * t2)) - (1.55E-7d * t3)) + (Math.sin((((132.87d * T) + 166.56d) - (0.009173d * t2)) * 0.0174532925199433d) * 3.3E-4d);
        double sa = ((((29.10535608d * k) + 359.2242d) - (3.33E-5d * t2)) - (3.47E-6d * t3)) * 0.0174532925199433d;
        double ma = ((385.81691806d * k) + 306.0253d + (0.0107306d * t2) + (1.236E-5d * t3)) * 0.0174532925199433d;
        double tf = ((((390.67050646d * k) + 21.2964d) - (0.0016528d * t2)) - (2.39E-6d * t3)) * 0.0349065850398866d;
        if (nph != 0) {
            if (nph != 1) {
                if (nph != 2) {
                    if (nph != 3) {
                        return 0.0d;
                    }
                }
            }
            double xtra2 = (((((((((((((((0.1721d - (T * 4.0E-4d)) * Math.sin(sa)) + (Math.sin(sa * 2.0d) * 0.0021d)) - (Math.sin(ma) * 0.628d)) + (Math.sin(ma * 2.0d) * 0.0089d)) - (Math.sin(3.0d * ma) * 4.0E-4d)) + (Math.sin(tf) * 0.0079d)) - (Math.sin(sa + ma) * 0.0119d)) - (Math.sin(sa - ma) * 0.0047d)) + (Math.sin(tf + sa) * 3.0E-4d)) - (Math.sin(tf - sa) * 4.0E-4d)) - (Math.sin(tf + ma) * 6.0E-4d)) + (Math.sin(tf - ma) * 0.0021d)) + (Math.sin(sa + (ma * 2.0d)) * 3.0E-4d)) + (Math.sin(sa - (ma * 2.0d)) * 4.0E-4d)) - (Math.sin((2.0d * sa) + ma) * 3.0E-4d);
            if (nph == 1) {
                xtra = ((xtra2 + 0.0028d) - (Math.cos(sa) * 4.0E-4d)) + (Math.cos(ma) * 3.0E-4d);
            } else {
                xtra = ((xtra2 - 0.0028d) + (Math.cos(sa) * 4.0E-4d)) - (Math.cos(ma) * 3.0E-4d);
            }
            return (jd + xtra) - ((((1.2053d * T) + 0.41d) + (0.4992d * t2)) / 1440.0d);
        }
        xtra = ((((((((((((0.1734d - (3.93E-4d * T)) * Math.sin(sa)) + (Math.sin(sa * 2.0d) * 0.0021d)) - (Math.sin(ma) * 0.4068d)) + (Math.sin(ma * 2.0d) * 0.0161d)) - (Math.sin(3.0d * ma) * 4.0E-4d)) + (Math.sin(tf) * 0.0104d)) - (Math.sin(sa + ma) * 0.0051d)) - (Math.sin(sa - ma) * 0.0074d)) + (Math.sin(tf + sa) * 4.0E-4d)) - (Math.sin(tf - sa) * 4.0E-4d)) - (Math.sin(tf + ma) * 6.0E-4d)) + (Math.sin(tf - ma) * 0.001d) + (Math.sin(sa + (2.0d * ma)) * 5.0E-4d);
        return (jd + xtra) - ((((1.2053d * T) + 0.41d) + (0.4992d * t2)) / 1440.0d);
    }

    /* renamed from: d  reason: contains not printable characters */
    private static double m۱۹۸۱۷d(long n) {
        double jd = m۱۹۸۰۴a(n, 0);
        double a = (double) m۱۹۸۰۵a(jd);
        Double.isNaN(a);
        double tf = jd - a;
        if (tf <= 0.5d) {
            return 1.0d + jd;
        }
        if (((tf - 0.5d) * 24.0d) + 3.0d > 6.0d) {
            return 1.0d + jd;
        }
        return jd;
    }
}
