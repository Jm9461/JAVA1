package android.support.v4.view.d0;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f۱۳۴۵a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f۱۳۴۶a;

        a(d compat) {
            this.f۱۳۴۶a = compat;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            c compatInfo = this.f۱۳۴۶a.a(virtualViewId);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.v();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) {
            List<AccessibilityNodeInfoCompat> compatInfos = this.f۱۳۴۶a.a(text, virtualViewId);
            if (compatInfos == null) {
                return null;
            }
            List<AccessibilityNodeInfo> infoList = new ArrayList<>();
            int infoCount = compatInfos.size();
            for (int i = 0; i < infoCount; i++) {
                infoList.add(((c) compatInfos.get(i)).v());
            }
            return infoList;
        }

        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return this.f۱۳۴۶a.a(virtualViewId, action, arguments);
        }
    }

    static class b extends a {
        b(d compat) {
            super(compat);
        }

        public AccessibilityNodeInfo findFocus(int focus) {
            c compatInfo = this.f۱۳۴۶a.b(focus);
            if (compatInfo == null) {
                return null;
            }
            return compatInfo.v();
        }
    }

    public d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f۱۳۴۵a = new b(this);
        } else if (i >= 16) {
            this.f۱۳۴۵a = new a(this);
        } else {
            this.f۱۳۴۵a = null;
        }
    }

    public d(Object provider) {
        this.f۱۳۴۵a = provider;
    }

    public Object a() {
        return this.f۱۳۴۵a;
    }

    public c a(int virtualViewId) {
        return null;
    }

    public boolean a(int virtualViewId, int action, Bundle arguments) {
        return false;
    }

    public List<c> a(String text, int virtualViewId) {
        return null;
    }

    public c b(int focus) {
        return null;
    }
}
