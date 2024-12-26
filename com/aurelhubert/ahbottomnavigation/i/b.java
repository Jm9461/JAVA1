package com.aurelhubert.ahbottomnavigation.i;

public final class b {
    public static int b(a notification, int defaultTextColor) {
        int textColor = notification.c();
        return textColor == 0 ? defaultTextColor : textColor;
    }

    public static int a(a notification, int defaultBackgroundColor) {
        int backgroundColor = notification.a();
        return backgroundColor == 0 ? defaultBackgroundColor : backgroundColor;
    }
}
