package android.support.v4.view.p۲۰۳d0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.d0.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd {

    /* renamed from: a, reason: contains not printable characters */
    private final Object f۱۰۵۹۹a;

    /* renamed from: android.support.v4.view.d0.d$a */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: contains not printable characters */
        final Cd f۱۰۶۰۰a;

        a(Cd compat) {
            this.f۱۰۶۰۰a = compat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            Cc compatInfo = this.f۱۰۶۰۰a.mo۱۱۲۱۲a(virtualViewId);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.m۱۰۸۲۲v();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) {
            List<Cc> list = this.f۱۰۶۰۰a.m۱۰۸۲۷a(text, virtualViewId);
            if (list == null) {
                return null;
            }
            List<AccessibilityNodeInfo> infoList = new ArrayList<>();
            int infoCount = list.size();
            for (int i = 0; i < infoCount; i++) {
                Cc infoCompat = list.get(i);
                infoList.add(infoCompat.m۱۰۸۲۲v());
            }
            return infoList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return this.f۱۰۶۰۰a.mo۱۱۲۱۳a(virtualViewId, action, arguments);
        }
    }

    /* renamed from: android.support.v4.view.d0.d$b */
    static class b extends a {
        b(Cd compat) {
            super(compat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int focus) {
            Cc compatInfo = this.f۱۰۶۰۰a.mo۱۱۲۱۴b(focus);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.m۱۰۸۲۲v();
        }
    }

    public Cd() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f۱۰۵۹۹a = new b(this);
        } else if (i >= 16) {
            this.f۱۰۵۹۹a = new a(this);
        } else {
            this.f۱۰۵۹۹a = null;
        }
    }

    public Cd(Object provider) {
        this.f۱۰۵۹۹a = provider;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Object m۱۰۸۲۶a() {
        return this.f۱۰۵۹۹a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۱۲۱۲a(int virtualViewId) {
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۲۱۳a(int virtualViewId, int action, Bundle arguments) {
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public List<Cc> m۱۰۸۲۷a(String text, int virtualViewId) {
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cc mo۱۱۲۱۴b(int focus) {
        return null;
    }
}
