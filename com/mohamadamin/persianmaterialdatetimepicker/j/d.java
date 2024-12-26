package com.mohamadamin.persianmaterialdatetimepicker.j;

public class d {
    public static long a(long year, int month, int day) {
        double a2 = (double) (((a((double) (year - 474), 2820.0d) + 474) * 682) - 110);
        Double.isNaN(a2);
        double d2 = (double) (year - 474);
        Double.isNaN(d2);
        return (((a((double) (year - 474), 2820.0d) + 474) - 1) * 365) + ((long) Math.floor(a2 / 2816.0d)) + 1948320 + (((long) Math.floor(d2 / 2820.0d)) * 1029983) + ((long) (month < 7 ? month * 31 : (month * 30) + 6)) + ((long) day);
    }

    public static boolean a(int persianYear) {
        double a2 = (double) (a((double) (((long) persianYear) - 474), 2820.0d) + 474);
        Double.isNaN(a2);
        return a((a2 + 38.0d) * 682.0d, 2816.0d) < 682;
    }

    public static long a(long julianDate) {
        long ycycle;
        double d2;
        double d3;
        long persianEpochInJulian = julianDate - a(475, 0, 1);
        long cyear = a((double) persianEpochInJulian, 1029983.0d);
        if (cyear != 1029982) {
            double d4 = (double) cyear;
            Double.isNaN(d4);
            ycycle = (long) Math.floor(((d4 * 2816.0d) + 1031337.0d) / 1028522.0d);
        } else {
            ycycle = 2820;
        }
        double d5 = (double) persianEpochInJulian;
        Double.isNaN(d5);
        long year = (((long) Math.floor(d5 / 1029983.0d)) * 2820) + 474 + ycycle;
        long aux = (julianDate + 1) - a(year, 0, 1);
        if (aux > 186) {
            d3 = (double) (aux - 6);
            d2 = 30.0d;
        } else {
            d3 = (double) aux;
            d2 = 31.0d;
        }
        Double.isNaN(d3);
        int month = (int) (Math.ceil(d3 / d2) - 1.0d);
        return (year << 16) | ((long) (month << 8)) | ((long) ((int) (julianDate - (a(year, month, 1) - 1))));
    }

    public static long a(double double1, double double2) {
        return (long) (double1 - (Math.floor(double1 / double2) * double2));
    }
}
