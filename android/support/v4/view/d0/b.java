package android.support.v4.view.d0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

public final class b {

    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    public static boolean a(AccessibilityManager manager, a listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return false;
        }
        return manager.addTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC۰۰۳۱b(listener));
    }

    public static boolean b(AccessibilityManager manager, a listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return false;
        }
        return manager.removeTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC۰۰۳۱b(listener));
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.view.d0.b$b  reason: collision with other inner class name */
    public static class accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC۰۰۳۱b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final a f۱۳۳۷a;

        accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC۰۰۳۱b(a listener) {
            this.f۱۳۳۷a = listener;
        }

        public int hashCode() {
            return this.f۱۳۳۷a.hashCode();
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            return this.f۱۳۳۷a.equals(((accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC۰۰۳۱b) o).f۱۳۳۷a);
        }

        public void onTouchExplorationStateChanged(boolean enabled) {
            this.f۱۳۳۷a.onTouchExplorationStateChanged(enabled);
        }
    }
}
