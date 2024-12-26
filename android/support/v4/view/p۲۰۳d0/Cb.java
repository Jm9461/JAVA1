package android.support.v4.view.p۲۰۳d0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v4.view.d0.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cb {

    /* renamed from: android.support.v4.view.d0.b$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۷۵۹a(AccessibilityManager manager, a listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return false;
        }
        return manager.addTouchExplorationStateChangeListener(new b(listener));
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۰۷۶۰b(AccessibilityManager manager, a listener) {
        if (Build.VERSION.SDK_INT < 19 || listener == null) {
            return false;
        }
        return manager.removeTouchExplorationStateChangeListener(new b(listener));
    }

    /* renamed from: android.support.v4.view.d0.b$b */
    private static class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: contains not printable characters */
        final a f۱۰۵۹۱a;

        b(a listener) {
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
            b other = (b) o;
            return this.f۱۰۵۹۱a.equals(other.f۱۰۵۹۱a);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean enabled) {
            this.f۱۰۵۹۱a.onTouchExplorationStateChanged(enabled);
        }
    }
}
