package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.p۲۰۳d0.Cc;
import android.support.v4.view.p۲۰۳d0.Cd;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {

    /* renamed from: b, reason: contains not printable characters */
    private static final View.AccessibilityDelegate f۱۰۵۸۶b = new View.AccessibilityDelegate();

    /* renamed from: a, reason: contains not printable characters */
    private final View.AccessibilityDelegate f۱۰۵۸۷a = new a(this);

    /* renamed from: android.support.v4.view.b$a */
    private static final class a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: contains not printable characters */
        private final Cb f۱۰۵۸۸a;

        a(Cb compat) {
            this.f۱۰۵۸۸a = compat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            return this.f۱۰۵۸۸a.mo۱۱۰۵۱a(host, event);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f۱۰۵۸۸a.mo۱۳۵۸۱b(host, event);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info2) {
            this.f۱۰۵۸۸a.mo۱۳۵۸۳a(host, Cc.m۱۰۷۶۲a(info2));
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f۱۰۵۸۸a.mo۱۰۷۳۲c(host, event);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            return this.f۱۰۵۸۸a.mo۱۱۰۵۲a(host, child, event);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View host, int eventType) {
            this.f۱۰۵۸۸a.m۱۰۷۲۶a(host, eventType);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            this.f۱۰۵۸۸a.m۱۰۷۳۳d(host, event);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
            Cd provider = this.f۱۰۵۸۸a.mo۱۱۱۹۲a(host);
            if (provider != null) {
                return (AccessibilityNodeProvider) provider.m۱۰۸۲۶a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            return this.f۱۰۵۸۸a.mo۱۳۵۸۴a(host, action, args);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    View.AccessibilityDelegate m۱۰۷۲۵a() {
        return this.f۱۰۵۸۷a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۲۶a(View host, int eventType) {
        f۱۰۵۸۶b.sendAccessibilityEvent(host, eventType);
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۰۷۳۳d(View host, AccessibilityEvent event) {
        f۱۰۵۸۶b.sendAccessibilityEventUnchecked(host, event);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۰۵۱a(View host, AccessibilityEvent event) {
        return f۱۰۵۸۶b.dispatchPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۰۷۳۲c(View host, AccessibilityEvent event) {
        f۱۰۵۸۶b.onPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۵۸۱b(View host, AccessibilityEvent event) {
        f۱۰۵۸۶b.onInitializeAccessibilityEvent(host, event);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۸۳a(View host, Cc info2) {
        f۱۰۵۸۶b.onInitializeAccessibilityNodeInfo(host, info2.m۱۰۸۲۲v());
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۰۵۲a(ViewGroup host, View child, AccessibilityEvent event) {
        return f۱۰۵۸۶b.onRequestSendAccessibilityEvent(host, child, event);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cd mo۱۱۱۹۲a(View host) {
        Object provider;
        if (Build.VERSION.SDK_INT >= 16 && (provider = f۱۰۵۸۶b.getAccessibilityNodeProvider(host)) != null) {
            return new Cd(provider);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۵۸۴a(View host, int action, Bundle args) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f۱۰۵۸۶b.performAccessibilityAction(host, action, args);
        }
        return false;
    }
}
