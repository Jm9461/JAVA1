package com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.j.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd {
    /* renamed from: a, reason: contains not printable characters */
    public static long m۱۵۹۳۸a(long year, int month, int day) {
        long j = ((m۱۵۹۳۶a(year - 474, 2820.0d) + 474) - 1) * 365;
        double d2 = ((m۱۵۹۳۶a(year - 474, 2820.0d) + 474) * 682) - 110;
        Double.isNaN(d2);
        long floor = j + ((long) Math.floor(d2 / 2816.0d)) + 1948320;
        double d3 = year - 474;
        Double.isNaN(d3);
        return floor + (((long) Math.floor(d3 / 2820.0d)) * 1029983) + (month < 7 ? month * 31 : (month * 30) + 6) + day;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۵۹۳۹a(int persianYear) {
        double d2 = m۱۵۹۳۶a(persianYear - 474, 2820.0d) + 474;
        Double.isNaN(d2);
        return m۱۵۹۳۶a((d2 + 38.0d) * 682.0d, 2816.0d) < 682;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static long m۱۵۹۳۷a(long julianDate) {
        long ycycle;
        double d2;
        double d3;
        long persianEpochInJulian = julianDate - m۱۵۹۳۸a(475L, 0, 1);
        long cyear = m۱۵۹۳۶a(persianEpochInJulian, 1029983.0d);
        if (cyear != 1029982) {
            double d4 = cyear;
            Double.isNaN(d4);
            ycycle = (long) Math.floor(((d4 * 2816.0d) + 1031337.0d) / 1028522.0d);
        } else {
            ycycle = 2820;
        }
        double d5 = persianEpochInJulian;
        Double.isNaN(d5);
        long year = (((long) Math.floor(d5 / 1029983.0d)) * 2820) + 474 + ycycle;
        long aux = (julianDate + 1) - m۱۵۹۳۸a(year, 0, 1);
        if (aux > 186) {
            d2 = aux - 6;
            d3 = 30.0d;
        } else {
            d2 = aux;
            d3 = 31.0d;
        }
        Double.isNaN(d2);
        int month = (int) (Math.ceil(d2 / d3) - 1.0d);
        int day = (int) (julianDate - (m۱۵۹۳۸a(year, month, 1) - 1));
        return (year << 16) | (month << 8) | day;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static long m۱۵۹۳۶a(double double1, double double2) {
        return (long) (double1 - (Math.floor(double1 / double2) * double2));
    }
}
