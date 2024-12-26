package com.lawyer_smartCalendar.utils;

import android.graphics.Color;
import b.i.a.a.a;
import com.lawyer_smartCalendar.R;

public class c {

    /* renamed from: a  reason: collision with root package name */
    static int[] f۳۲۴۹a = {Color.parseColor("#303F9F"), Color.parseColor("#1976D2"), Color.parseColor("#00796B"), Color.parseColor("#F57C00"), Color.parseColor("#455A64"), Color.parseColor("#C2185B"), Color.parseColor("#c62828"), Color.parseColor("#00838F"), Color.parseColor("#6A1B9A"), Color.parseColor("#5D4037")};

    /* renamed from: b  reason: collision with root package name */
    static int[] f۳۲۵۰b = {Color.parseColor("#3F51B5"), Color.parseColor("#2196F3"), Color.parseColor("#009688"), Color.parseColor("#FF9800"), Color.parseColor("#607D8B"), Color.parseColor("#E91E63"), Color.parseColor("#d32f2f"), Color.parseColor("#00ACC1"), Color.parseColor("#8E24AA"), Color.parseColor("#795548")};

    /* renamed from: c  reason: collision with root package name */
    static String[] f۳۲۵۱c = {"#3F51B5", "#2196F3", "#009688", "#FF9800", "#607D8B", "#E91E63", "#d32f2f", "#00ACC1", "#8E24AA", "#795548"};

    public static boolean a(int color) {
        int i = 0;
        while (true) {
            int[] iArr = f۳۲۴۹a;
            if (i >= iArr.length) {
                return false;
            }
            if (color == iArr[i]) {
                return true;
            }
            i++;
        }
    }

    public int[] a() {
        return f۳۲۴۹a;
    }

    public static int b() {
        int i = f۳۲۴۹a[0];
        switch (a.a("themeColor", -13615201)) {
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

    public static int c() {
        int color = f۳۲۵۰b[0];
        switch (a.a("themeColor", -13615201)) {
            case -16746133:
                return f۳۲۵۰b[2];
            case -16743537:
                return f۳۲۵۰b[7];
            case -15108398:
                return f۳۲۵۰b[1];
            case -13615201:
                return f۳۲۵۰b[0];
            case -12232092:
                return f۳۲۵۰b[4];
            case -10665929:
                return f۳۲۵۰b[9];
            case -9823334:
                return f۳۲۵۰b[8];
            case -4056997:
                return f۳۲۵۰b[5];
            case -3790808:
                return f۳۲۵۰b[6];
            case -689152:
                return f۳۲۵۰b[3];
            default:
                return color;
        }
    }

    public static String d() {
        String color = f۳۲۵۱c[0];
        switch (a.a("themeColor", -13615201)) {
            case -16746133:
                return f۳۲۵۱c[2];
            case -16743537:
                return f۳۲۵۱c[7];
            case -15108398:
                return f۳۲۵۱c[1];
            case -13615201:
                return f۳۲۵۱c[0];
            case -12232092:
                return f۳۲۵۱c[4];
            case -10665929:
                return f۳۲۵۱c[9];
            case -9823334:
                return f۳۲۵۱c[8];
            case -4056997:
                return f۳۲۵۱c[5];
            case -3790808:
                return f۳۲۵۱c[6];
            case -689152:
                return f۳۲۵۱c[3];
            default:
                return color;
        }
    }

    public static int e() {
        int color = f۳۲۴۹a[0];
        switch (a.a("themeColor", -13615201)) {
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
