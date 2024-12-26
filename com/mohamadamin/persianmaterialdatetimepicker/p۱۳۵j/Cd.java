package com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.j.d  reason: invalid class name */
public class Cd {
    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۸۰۱۶a(long year, int month, int day) {
        double a = (double) (((m۱۸۰۱۴a((double) (year - 474), 2820.0d) + 474) * 682) - 110);
        Double.isNaN(a);
        double d = (double) (year - 474);
        Double.isNaN(d);
        return (((m۱۸۰۱۴a((double) (year - 474), 2820.0d) + 474) - 1) * 365) + ((long) Math.floor(a / 2816.0d)) + 1948320 + (((long) Math.floor(d / 2820.0d)) * 1029983) + ((long) (month < 7 ? month * 31 : (month * 30) + 6)) + ((long) day);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۰۱۷a(int persianYear) {
        double a = (double) (m۱۸۰۱۴a((double) (((long) persianYear) - 474), 2820.0d) + 474);
        Double.isNaN(a);
        return m۱۸۰۱۴a((a + 38.0d) * 682.0d, 2816.0d) < 682;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۸۰۱۵a(long julianDate) {
        long ycycle;
        double d;
        double d2;
        long persianEpochInJulian = julianDate - m۱۸۰۱۶a(475, 0, 1);
        long cyear = m۱۸۰۱۴a((double) persianEpochInJulian, 1029983.0d);
        if (cyear != 1029982) {
            double d3 = (double) cyear;
            Double.isNaN(d3);
            ycycle = (long) Math.floor(((d3 * 2816.0d) + 1031337.0d) / 1028522.0d);
        } else {
            ycycle = 2820;
        }
        double d4 = (double) persianEpochInJulian;
        Double.isNaN(d4);
        long year = (((long) Math.floor(d4 / 1029983.0d)) * 2820) + 474 + ycycle;
        long aux = (julianDate + 1) - m۱۸۰۱۶a(year, 0, 1);
        if (aux > 186) {
            d2 = (double) (aux - 6);
            d = 30.0d;
        } else {
            d2 = (double) aux;
            d = 31.0d;
        }
        Double.isNaN(d2);
        int month = (int) (Math.ceil(d2 / d) - 1.0d);
        return (year << 16) | ((long) (month << 8)) | ((long) ((int) (julianDate - (m۱۸۰۱۶a(year, month, 1) - 1))));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۸۰۱۴a(double double1, double double2) {
        return (long) (double1 - (Math.floor(double1 / double2) * double2));
    }
}
