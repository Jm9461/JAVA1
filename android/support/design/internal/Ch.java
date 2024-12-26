package android.support.design.internal;

import android.graphics.PorterDuff;
import android.support.p۰۴۳v4.view.Cu;
import android.view.View;

/* renamed from: android.support.design.internal.h  reason: invalid class name */
public class Ch {
    /* renamed from: a  reason: contains not printable characters */
    public static PorterDuff.Mode m۱۱۳۶۲a(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۱۳۶۳a(View view) {
        return Cu.m۱۳۰۱۴k(view) == 1;
    }
}
