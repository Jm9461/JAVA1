package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.d0.c;
import android.support.v4.view.d0.d;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final View.AccessibilityDelegate f۱۳۳۲b = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f۱۳۳۳a = new a(this);

    private static final class a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final b f۱۳۳۴a;

        a(b compat) {
            this.f۱۳۳۴a = compat;
        }

        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            return this.f۱۳۳۴a.a(host, event);
        }

        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f۱۳۳۴a.b(host, event);
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info2) {
            this.f۱۳۳۴a.a(host, c.a(info2));
        }

        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f۱۳۳۴a.c(host, event);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            return this.f۱۳۳۴a.a(host, child, event);
        }

        public void sendAccessibilityEvent(View host, int eventType) {
            this.f۱۳۳۴a.a(host, eventType);
        }

        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            this.f۱۳۳۴a.d(host, event);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
            d provider = this.f۱۳۳۴a.a(host);
            if (provider != null) {
                return (AccessibilityNodeProvider) provider.a();
            }
            return null;
        }

        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            return this.f۱۳۳۴a.a(host, action, args);
        }
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate a() {
        return this.f۱۳۳۳a;
    }

    public void a(View host, int eventType) {
        f۱۳۳۲b.sendAccessibilityEvent(host, eventType);
    }

    public void d(View host, AccessibilityEvent event) {
        f۱۳۳۲b.sendAccessibilityEventUnchecked(host, event);
    }

    public boolean a(View host, AccessibilityEvent event) {
        return f۱۳۳۲b.dispatchPopulateAccessibilityEvent(host, event);
    }

    public void c(View host, AccessibilityEvent event) {
        f۱۳۳۲b.onPopulateAccessibilityEvent(host, event);
    }

    public void b(View host, AccessibilityEvent event) {
        f۱۳۳۲b.onInitializeAccessibilityEvent(host, event);
    }

    public void a(View host, c info2) {
        f۱۳۳۲b.onInitializeAccessibilityNodeInfo(host, info2.v());
    }

    public boolean a(ViewGroup host, View child, AccessibilityEvent event) {
        return f۱۳۳۲b.onRequestSendAccessibilityEvent(host, child, event);
    }

    public d a(View host) {
        Object provider;
        if (Build.VERSION.SDK_INT < 16 || (provider = f۱۳۳۲b.getAccessibilityNodeProvider(host)) == null) {
            return null;
        }
        return new d(provider);
    }

    public boolean a(View host, int action, Bundle args) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f۱۳۳۲b.performAccessibilityAction(host, action, args);
        }
        return false;
    }
}
