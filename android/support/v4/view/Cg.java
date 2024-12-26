package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cg {
    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۰۸۴۵b(ViewGroup.MarginLayoutParams lp) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp.getMarginStart();
        }
        return lp.leftMargin;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۰۸۴۳a(ViewGroup.MarginLayoutParams lp) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp.getMarginEnd();
        }
        return lp.rightMargin;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۸۴۴a(ViewGroup.MarginLayoutParams lp, int marginEnd) {
        if (Build.VERSION.SDK_INT >= 17) {
            lp.setMarginEnd(marginEnd);
        } else {
            lp.rightMargin = marginEnd;
        }
    }
}
