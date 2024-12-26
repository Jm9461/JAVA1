package android.support.p۰۴۳v4.view.p۰۴۵d0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.d0.e  reason: invalid class name */
public class Ce {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۰۱a(AccessibilityRecord record, View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            record.setSource(root, virtualDescendantId);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۰۰a(AccessibilityRecord record, int maxScrollX) {
        if (Build.VERSION.SDK_INT >= 15) {
            record.setMaxScrollX(maxScrollX);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۹۰۲b(AccessibilityRecord record, int maxScrollY) {
        if (Build.VERSION.SDK_INT >= 15) {
            record.setMaxScrollY(maxScrollY);
        }
    }
}
