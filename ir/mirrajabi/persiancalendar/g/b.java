package ir.mirrajabi.persiancalendar.g;

import ir.mirrajabi.persiancalendar.f.g.c;
import ir.mirrajabi.persiancalendar.f.g.e;
import ir.mirrajabi.persiancalendar.f.g.f;

public final class b {
    public static long a(c civil) {
        long lYear = (long) civil.d();
        long lMonth = (long) civil.b();
        long lDay = (long) civil.c();
        return (lYear > 1582 || (lYear == 1582 && lMonth > 10) || (lYear == 1582 && lMonth == 10 && lDay > 14)) ? (((((((4800 + lYear) + ((lMonth - 14) / 12)) * 1461) / 4) + ((((lMonth - 2) - (((lMonth - 14) / 12) * 12)) * 367) / 12)) - (((((lYear + 4900) + ((lMonth - 14) / 12)) / 100) * 3) / 4)) + lDay) - 32075 : a(lYear, lMonth, lDay);
    }

    public static f b(c civil) {
        return c(a(civil));
    }

    private static long a(double d2) {
        return (long) Math.floor(d2);
    }

    public static c a(e islamic) {
        return a(b(islamic));
    }

    public static long b(e islamic) {
        int year = islamic.d();
        int month = islamic.b();
        int day = islamic.c();
        if (year < 0) {
            year++;
        }
        double d2 = d(1048 + ((long) (((year * 12) + month) - 16861)));
        double d3 = (double) day;
        Double.isNaN(d3);
        return a(d2 + d3 + 0.5d);
    }

    public static c a(long jdn) {
        if (jdn <= 2299160) {
            return b(jdn);
        }
        long l = 68569 + jdn;
        long n = (l * 4) / 146097;
        long l2 = l - (((146097 * n) + 3) / 4);
        long i = ((1 + l2) * 4000) / 1461001;
        long l3 = (l2 - ((1461 * i) / 4)) + 31;
        long j = (l3 * 80) / 2447;
        int day = (int) (l3 - ((2447 * j) / 80));
        long l4 = j / 11;
        return new c((int) (((n - 49) * 100) + i + l4), (int) ((2 + j) - (12 * l4)), day);
    }

    public static c b(long jdn) {
        long j = jdn + 1402;
        long k = (j - 1) / 1461;
        long l = j - (k * 1461);
        long n = ((l - 1) / 365) - (l / 1461);
        long i = (l - (365 * n)) + 30;
        long j2 = (i * 80) / 2447;
        int day = (int) (i - ((2447 * j2) / 80));
        long i2 = j2 / 11;
        return new c((int) ((((4 * k) + n) + i2) - 4716), (int) ((2 + j2) - (12 * i2)), day);
    }

    public static f c(long jdn) {
        long aux2;
        int month;
        long depoch = jdn - a(475, 1, 1);
        long cycle = depoch / 1029983;
        long cyear = depoch % 1029983;
        if (cyear == 1029982) {
            aux2 = 2820;
        } else {
            long aux1 = cyear / 366;
            double d2 = (double) ((2134 * aux1) + (2816 * (cyear % 366)) + 2815);
            Double.isNaN(d2);
            aux2 = a(d2 / 1028522.0d) + aux1 + 1;
        }
        int year = (int) ((2820 * cycle) + aux2 + 474);
        if (year <= 0) {
            year--;
        }
        long yday = (jdn - a(year, 1, 1)) + 1;
        if (yday <= 186) {
            double d3 = (double) yday;
            Double.isNaN(d3);
            month = (int) Math.ceil(d3 / 31.0d);
        } else {
            double d4 = (double) (yday - 6);
            Double.isNaN(d4);
            month = (int) Math.ceil(d4 / 30.0d);
        }
        return new f(year, month, ((int) (jdn - a(year, month, 1))) + 1);
    }

    public static long a(long lYear, long lMonth, long lDay) {
        return ((367 * lYear) - ((((5001 + lYear) + ((lMonth - 9) / 7)) * 7) / 4)) + ((275 * lMonth) / 9) + lDay + 1729777;
    }

    public static c a(f persian) {
        return a(b(persian));
    }

    public static long a(int year, int month, int day) {
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

    public static long b(f persian) {
        long epbase;
        long mdays;
        int year = persian.d();
        int month = persian.b();
        int day = persian.c();
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

    private static double a(long n, int nph) {
        double xtra;
        double d2 = (double) n;
        double d3 = (double) nph;
        Double.isNaN(d3);
        Double.isNaN(d2);
        double k = d2 + (d3 / 4.0d);
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

    private static double d(long n) {
        double jd = a(n, 0);
        double a2 = (double) a(jd);
        Double.isNaN(a2);
        double tf = jd - a2;
        if (tf <= 0.5d) {
            return 1.0d + jd;
        }
        if (((tf - 0.5d) * 24.0d) + 3.0d > 6.0d) {
            return 1.0d + jd;
        }
        return jd;
    }
}
