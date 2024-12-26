package com.mohamadamin.persianmaterialdatetimepicker.j;

import java.util.ArrayList;

public class a {
    public static String b(String string) {
        return string.replace("0", "۰").replace("1", "١").replace("2", "۲").replace("3", "۳").replace("4", "۴").replace("5", "۵").replace("6", "۶").replace("7", "۷").replace("8", "۸").replace("9", "۹");
    }

    public static String[] a(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = b(strings[i]);
        }
        return strings;
    }

    public static ArrayList<String> a(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, b(strings.get(i)));
        }
        return strings;
    }

    public static String a(String string) {
        return string.replace("۰", "0").replace("١", "1").replace("۲", "2").replace("۳", "3").replace("۴", "4").replace("۵", "5").replace("۶", "6").replace("۷", "7").replace("۸", "8").replace("۹", "9");
    }
}
