package android.support.v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.l1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cl1 {
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۳۴۷a(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            ViewOnLongClickListenerCm1.m۱۳۳۶۶a(view, tooltipText);
        }
    }
}
