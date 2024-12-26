package android.support.v4.view.d0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class e {
    public static void a(AccessibilityRecord record, View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            record.setSource(root, virtualDescendantId);
        }
    }

    public static void a(AccessibilityRecord record, int maxScrollX) {
        if (Build.VERSION.SDK_INT >= 15) {
            record.setMaxScrollX(maxScrollX);
        }
    }

    public static void b(AccessibilityRecord record, int maxScrollY) {
        if (Build.VERSION.SDK_INT >= 15) {
            record.setMaxScrollY(maxScrollY);
        }
    }
}
