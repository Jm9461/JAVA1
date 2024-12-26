package com.lawyer_smartCalendar.utils;

import android.graphics.Color;
import com.lawyer_smartCalendar.R;
import p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca;

/* renamed from: com.lawyer_smartCalendar.utils.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    static int[] f۱۴۷۷۵a = {Color.parseColor("#303F9F"), Color.parseColor("#1976D2"), Color.parseColor("#00796B"), Color.parseColor("#F57C00"), Color.parseColor("#455A64"), Color.parseColor("#C2185B"), Color.parseColor("#c62828"), Color.parseColor("#00838F"), Color.parseColor("#6A1B9A"), Color.parseColor("#5D4037")};

    /* renamed from: b  reason: contains not printable characters */
    static int[] f۱۴۷۷۶b = {Color.parseColor("#3F51B5"), Color.parseColor("#2196F3"), Color.parseColor("#009688"), Color.parseColor("#FF9800"), Color.parseColor("#607D8B"), Color.parseColor("#E91E63"), Color.parseColor("#d32f2f"), Color.parseColor("#00ACC1"), Color.parseColor("#8E24AA"), Color.parseColor("#795548")};

    /* renamed from: c  reason: contains not printable characters */
    static String[] f۱۴۷۷۷c = {"#3F51B5", "#2196F3", "#009688", "#FF9800", "#607D8B", "#E91E63", "#d32f2f", "#00ACC1", "#8E24AA", "#795548"};

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۷۷۳۸a(int color) {
        int i = 0;
        while (true) {
            int[] iArr = f۱۴۷۷۵a;
            if (i >= iArr.length) {
                return false;
            }
            if (color == iArr[i]) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int[] m۱۷۷۴۳a() {
        return f۱۴۷۷۵a;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۷۷۳۹b() {
        int i = f۱۴۷۷۵a[0];
        switch (Ca.m۱۶۴۱۱a("themeColor", -13615201)) {
            case -16746133:
                return R.style.CustomTheme3;
            case -16743537:
                return R.style.CustomTheme8;
            case -15108398:
                return R.style.CustomTheme2;
            case -13615201:
                return R.style.CustomTheme;
            case -12232092:
                return R.style.CustomTheme5;
            case -10665929:
                return R.style.CustomTheme10;
            case -9823334:
                return R.style.CustomTheme9;
            case -4056997:
                return R.style.CustomTheme6;
            case -3790808:
                return R.style.CustomTheme7;
            case -689152:
                return R.style.CustomTheme4;
            default:
                return R.style.AppTheme;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۷۷۴۰c() {
        int color = f۱۴۷۷۶b[0];
        switch (Ca.m۱۶۴۱۱a("themeColor", -13615201)) {
            case -16746133:
                return f۱۴۷۷۶b[2];
            case -16743537:
                return f۱۴۷۷۶b[7];
            case -15108398:
                return f۱۴۷۷۶b[1];
            case -13615201:
                return f۱۴۷۷۶b[0];
            case -12232092:
                return f۱۴۷۷۶b[4];
            case -10665929:
                return f۱۴۷۷۶b[9];
            case -9823334:
                return f۱۴۷۷۶b[8];
            case -4056997:
                return f۱۴۷۷۶b[5];
            case -3790808:
                return f۱۴۷۷۶b[6];
            case -689152:
                return f۱۴۷۷۶b[3];
            default:
                return color;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public static String m۱۷۷۴۱d() {
        String color = f۱۴۷۷۷c[0];
        switch (Ca.m۱۶۴۱۱a("themeColor", -13615201)) {
            case -16746133:
                return f۱۴۷۷۷c[2];
            case -16743537:
                return f۱۴۷۷۷c[7];
            case -15108398:
                return f۱۴۷۷۷c[1];
            case -13615201:
                return f۱۴۷۷۷c[0];
            case -12232092:
                return f۱۴۷۷۷c[4];
            case -10665929:
                return f۱۴۷۷۷c[9];
            case -9823334:
                return f۱۴۷۷۷c[8];
            case -4056997:
                return f۱۴۷۷۷c[5];
            case -3790808:
                return f۱۴۷۷۷c[6];
            case -689152:
                return f۱۴۷۷۷c[3];
            default:
                return color;
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public static int m۱۷۷۴۲e() {
        int color = f۱۴۷۷۵a[0];
        switch (Ca.m۱۶۴۱۱a("themeColor", -13615201)) {
            case -16746133:
                return R.color.theme3SplashBgColor;
            case -16743537:
                return R.color.theme8SplashBgColor;
            case -15108398:
                return R.color.theme2SplashBgColor;
            case -13615201:
                return R.color.theme1SplashBgColor;
            case -12232092:
                return R.color.theme5SplashBgColor;
            case -10665929:
                return R.color.theme10SplashBgColor;
            case -9823334:
                return R.color.theme9SplashBgColor;
            case -4056997:
                return R.color.theme6SplashBgColor;
            case -3790808:
                return R.color.theme7SplashBgColor;
            case -689152:
                return R.color.theme4SplashBgColor;
            default:
                return color;
        }
    }
}
