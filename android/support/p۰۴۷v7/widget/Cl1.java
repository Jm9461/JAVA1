package android.support.p۰۴۷v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.l1  reason: invalid class name */
public class Cl1 {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۴۱۷a(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            View$OnLongClickListenerCm1.m۱۵۴۳۶a(view, tooltipText);
        }
    }
}
