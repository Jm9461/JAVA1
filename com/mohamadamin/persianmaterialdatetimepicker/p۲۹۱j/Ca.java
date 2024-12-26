package com.mohamadamin.persianmaterialdatetimepicker.p۲۹۱j;

import java.util.ArrayList;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.j.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    /* renamed from: b, reason: contains not printable characters */
    public static String m۱۵۹۲۳b(String string) {
        return string.replace("0", "۰").replace("1", "١").replace("2", "۲").replace("3", "۳").replace("4", "۴").replace("5", "۵").replace("6", "۶").replace("7", "۷").replace("8", "۸").replace("9", "۹");
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String[] m۱۵۹۲۲a(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = m۱۵۹۲۳b(strings[i]);
        }
        return strings;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ArrayList<String> m۱۵۹۲۱a(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, m۱۵۹۲۳b(strings.get(i)));
        }
        return strings;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۵۹۲۰a(String string) {
        return string.replace("۰", "0").replace("١", "1").replace("۲", "2").replace("۳", "3").replace("۴", "4").replace("۵", "5").replace("۶", "6").replace("۷", "7").replace("۸", "8").replace("۹", "9");
    }
}
