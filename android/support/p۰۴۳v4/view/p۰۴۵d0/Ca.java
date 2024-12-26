package android.support.p۰۴۳v4.view.p۰۴۵d0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.d0.a  reason: invalid class name */
public final class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۸۲۸a(AccessibilityEvent event, int changeTypes) {
        if (Build.VERSION.SDK_INT >= 19) {
            event.setContentChangeTypes(changeTypes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۸۲۷a(AccessibilityEvent event) {
        if (Build.VERSION.SDK_INT >= 19) {
            return event.getContentChangeTypes();
        }
        return 0;
    }
}
