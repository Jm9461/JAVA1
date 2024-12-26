package android.support.p۰۴۳v4.view.p۰۴۵d0;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.d0.d  reason: invalid class name */
public class Cd {

    /* renamed from: a  reason: contains not printable characters */
    private final Object f۱۰۵۹۹a;

    /* renamed from: android.support.v4.view.d0.d$a  reason: invalid class name */
    static class Ca extends AccessibilityNodeProvider {

        /* renamed from: a  reason: contains not printable characters */
        final Cd f۱۰۶۰۰a;

        Ca(Cd compat) {
            this.f۱۰۶۰۰a = compat;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            Cc compatInfo = this.f۱۰۶۰۰a.m۱۲۸۹۵a(virtualViewId);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.m۱۲۸۹۲v();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) {
            List<AccessibilityNodeInfoCompat> compatInfos = this.f۱۰۶۰۰a.m۱۲۸۹۷a(text, virtualViewId);
            if (compatInfos == null) {
                return null;
            }
            List<AccessibilityNodeInfo> infoList = new ArrayList<>();
            int infoCount = compatInfos.size();
            for (int i = 0; i < infoCount; i++) {
                infoList.add(((Cc) compatInfos.get(i)).m۱۲۸۹۲v());
            }
            return infoList;
        }

        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return this.f۱۰۶۰۰a.m۱۲۸۹۸a(virtualViewId, action, arguments);
        }
    }

    /* renamed from: android.support.v4.view.d0.d$b  reason: invalid class name */
    static class Cb extends Ca {
        Cb(Cd compat) {
            super(compat);
        }

        public AccessibilityNodeInfo findFocus(int focus) {
            Cc compatInfo = this.f۱۰۶۰۰a.m۱۲۸۹۹b(focus);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.m۱۲۸۹۲v();
        }
    }

    public Cd() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f۱۰۵۹۹a = new Cb(this);
        } else if (i >= 16) {
            this.f۱۰۵۹۹a = new Ca(this);
        } else {
            this.f۱۰۵۹۹a = null;
        }
    }

    public Cd(Object provider) {
        this.f۱۰۵۹۹a = provider;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۲۸۹۶a() {
        return this.f۱۰۵۹۹a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۲۸۹۵a(int virtualViewId) {
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۸۹۸a(int virtualViewId, int action, Bundle arguments) {
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public List<Cc> m۱۲۸۹۷a(String text, int virtualViewId) {
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cc m۱۲۸۹۹b(int focus) {
        return null;
    }
}
