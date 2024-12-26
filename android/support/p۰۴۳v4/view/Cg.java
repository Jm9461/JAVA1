package android.support.p۰۴۳v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.g  reason: invalid class name */
public final class Cg {
    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۲۹۱۵b(ViewGroup.MarginLayoutParams lp) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp.getMarginStart();
        }
        return lp.leftMargin;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۹۱۳a(ViewGroup.MarginLayoutParams lp) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp.getMarginEnd();
        }
        return lp.rightMargin;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۱۴a(ViewGroup.MarginLayoutParams lp, int marginEnd) {
        if (Build.VERSION.SDK_INT >= 17) {
            lp.setMarginEnd(marginEnd);
        } else {
            lp.rightMargin = marginEnd;
        }
    }
}
