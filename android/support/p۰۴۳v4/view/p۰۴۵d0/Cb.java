package android.support.p۰۴۳v4.view.p۰۴۵d0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v4.view.d0.b  reason: invalid class name */
public final class Cb {

    /* renamed from: android.support.v4.view.d0.b$a  reason: invalid class name */
    public interface AbstractCa {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۸۲۹a(AccessibilityManager manager, AbstractCa listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return false;
        }
        return manager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerCb(listener));
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۲۸۳۰b(AccessibilityManager manager, AbstractCa listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return false;
        }
        return manager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerCb(listener));
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.view.d0.b$b  reason: invalid class name */
    public static class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerCb implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: contains not printable characters */
        final AbstractCa f۱۰۵۹۱a;

        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerCb(AbstractCa listener) {
            this.f۱۰۵۹۱a = listener;
        }

        public int hashCode() {
            return this.f۱۰۵۹۱a.hashCode();
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            return this.f۱۰۵۹۱a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerCb) o).f۱۰۵۹۱a);
        }

        public void onTouchExplorationStateChanged(boolean enabled) {
            this.f۱۰۵۹۱a.onTouchExplorationStateChanged(enabled);
        }
    }
}
