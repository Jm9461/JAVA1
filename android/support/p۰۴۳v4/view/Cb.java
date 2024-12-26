package android.support.p۰۴۳v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cd;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.b  reason: invalid class name */
public class Cb {

    /* renamed from: b  reason: contains not printable characters */
    private static final View.AccessibilityDelegate f۱۰۵۸۶b = new View.AccessibilityDelegate();

    /* renamed from: a  reason: contains not printable characters */
    private final View.AccessibilityDelegate f۱۰۵۸۷a = new Ca(this);

    /* renamed from: android.support.v4.view.b$a  reason: invalid class name */
    private static final class Ca extends View.AccessibilityDelegate {

        /* renamed from: a  reason: contains not printable characters */
        private final Cb f۱۰۵۸۸a;

        Ca(Cb compat) {
            this.f۱۰۵۸۸a = compat;
        }

        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            return this.f۱۰۵۸۸a.m۱۲۷۹۹a(host, event);
        }

        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f۱۰۵۸۸a.m۱۲۸۰۱b(host, event);
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info2) {
            this.f۱۰۵۸۸a.m۱۲۷۹۷a(host, Cc.m۱۲۸۳۲a(info2));
        }

        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f۱۰۵۸۸a.m۱۲۸۰۲c(host, event);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            return this.f۱۰۵۸۸a.m۱۲۸۰۰a(host, child, event);
        }

        public void sendAccessibilityEvent(View host, int eventType) {
            this.f۱۰۵۸۸a.m۱۲۷۹۶a(host, eventType);
        }

        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            this.f۱۰۵۸۸a.m۱۲۸۰۳d(host, event);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
            Cd provider = this.f۱۰۵۸۸a.m۱۲۷۹۴a(host);
            if (provider != null) {
                return (AccessibilityNodeProvider) provider.m۱۲۸۹۶a();
            }
            return null;
        }

        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            return this.f۱۰۵۸۸a.m۱۲۷۹۸a(host, action, args);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View.AccessibilityDelegate m۱۲۷۹۵a() {
        return this.f۱۰۵۸۷a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۹۶a(View host, int eventType) {
        f۱۰۵۸۶b.sendAccessibilityEvent(host, eventType);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۸۰۳d(View host, AccessibilityEvent event) {
        f۱۰۵۸۶b.sendAccessibilityEventUnchecked(host, event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۷۹۹a(View host, AccessibilityEvent event) {
        return f۱۰۵۸۶b.dispatchPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۸۰۲c(View host, AccessibilityEvent event) {
        f۱۰۵۸۶b.onPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۰۱b(View host, AccessibilityEvent event) {
        f۱۰۵۸۶b.onInitializeAccessibilityEvent(host, event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۷۹۷a(View host, Cc info2) {
        f۱۰۵۸۶b.onInitializeAccessibilityNodeInfo(host, info2.m۱۲۸۹۲v());
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۸۰۰a(ViewGroup host, View child, AccessibilityEvent event) {
        return f۱۰۵۸۶b.onRequestSendAccessibilityEvent(host, child, event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cd m۱۲۷۹۴a(View host) {
        Object provider;
        if (Build.VERSION.SDK_INT < 16 || (provider = f۱۰۵۸۶b.getAccessibilityNodeProvider(host)) == null) {
            return null;
        }
        return new Cd(provider);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۷۹۸a(View host, int action, Bundle args) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f۱۰۵۸۶b.performAccessibilityAction(host, action, args);
        }
        return false;
    }
}
