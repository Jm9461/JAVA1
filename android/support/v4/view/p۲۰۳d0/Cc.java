package android.support.v4.view.p۲۰۳d0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.d0.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private final AccessibilityNodeInfo f۱۰۵۹۲a;

    /* renamed from: b, reason: contains not printable characters */
    public int f۱۰۵۹۳b = -1;

    /* renamed from: android.support.v4.view.d0.c$a */
    public static class a {

        /* renamed from: b, reason: contains not printable characters */
        public static final a f۱۰۵۹۴b = new a(1, null);

        /* renamed from: c, reason: contains not printable characters */
        public static final a f۱۰۵۹۵c = new a(2, null);

        /* renamed from: a, reason: contains not printable characters */
        final Object f۱۰۵۹۶a;

        static {
            new a(4, null);
            new a(8, null);
            new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null);
            new a(512, null);
            new a(1024, null);
            new a(2048, null);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null);
        }

        public a(int actionId, CharSequence label) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(actionId, label) : null);
        }

        a(Object action) {
            this.f۱۰۵۹۶a = action;
        }
    }

    /* renamed from: android.support.v4.view.d0.c$b */
    public static class b {

        /* renamed from: a, reason: contains not printable characters */
        final Object f۱۰۵۹۷a;

        /* renamed from: a, reason: contains not printable characters */
        public static b m۱۰۸۲۳a(int rowCount, int columnCount, boolean hierarchical, int selectionMode) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical, selectionMode));
            }
            if (i >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical));
            }
            return new b(null);
        }

        b(Object info2) {
            this.f۱۰۵۹۷a = info2;
        }
    }

    /* renamed from: android.support.v4.view.d0.c$c */
    public static class c {

        /* renamed from: a, reason: contains not printable characters */
        final Object f۱۰۵۹۸a;

        /* renamed from: a, reason: contains not printable characters */
        public static c m۱۰۸۲۴a(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading, selected));
            }
            if (i >= 19) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading));
            }
            return new c(null);
        }

        c(Object info2) {
            this.f۱۰۵۹۸a = info2;
        }
    }

    private Cc(AccessibilityNodeInfo info2) {
        this.f۱۰۵۹۲a = info2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cc m۱۰۷۶۲a(AccessibilityNodeInfo info2) {
        return new Cc(info2);
    }

    /* renamed from: v, reason: contains not printable characters */
    public AccessibilityNodeInfo m۱۰۸۲۲v() {
        return this.f۱۰۵۹۲a;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static Cc m۱۰۷۶۵d(View source) {
        return m۱۰۷۶۲a(AccessibilityNodeInfo.obtain(source));
    }

    /* renamed from: w, reason: contains not printable characters */
    public static Cc m۱۰۷۶۶w() {
        return m۱۰۷۶۲a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cc m۱۰۷۶۱a(Cc info2) {
        return m۱۰۷۶۲a(AccessibilityNodeInfo.obtain(info2.f۱۰۵۹۲a));
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۷۸۵c(View source) {
        this.f۱۰۵۹۲a.setSource(source);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۷۸۶c(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setSource(root, virtualDescendantId);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۰۷۷۶b() {
        return this.f۱۰۵۹۲a.getChildCount();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۷۰a(View child) {
        this.f۱۰۵۹۲a.addChild(child);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۷۱a(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.addChild(root, virtualDescendantId);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۰۷۶۷a() {
        return this.f۱۰۵۹۲a.getActions();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۶۸a(int action) {
        this.f۱۰۵۹۲a.addAction(action);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۷۷۵a(a action) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f۱۰۵۹۲a.removeAction((AccessibilityNodeInfo.AccessibilityAction) action.f۱۰۵۹۶a);
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۷۷۸b(View parent) {
        this.f۱۰۵۹۲a.setParent(parent);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۷۷۹b(View root, int virtualDescendantId) {
        this.f۱۰۵۹۳b = virtualDescendantId;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setParent(root, virtualDescendantId);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۶۹a(Rect outBounds) {
        this.f۱۰۵۹۲a.getBoundsInParent(outBounds);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۷۸۴c(Rect bounds) {
        this.f۱۰۵۹۲a.setBoundsInParent(bounds);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۷۷۷b(Rect outBounds) {
        this.f۱۰۵۹۲a.getBoundsInScreen(outBounds);
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۰۷۹۰d(Rect bounds) {
        this.f۱۰۵۹۲a.setBoundsInScreen(bounds);
    }

    /* renamed from: j, reason: contains not printable characters */
    public boolean m۱۰۸۰۶j() {
        return this.f۱۰۵۹۲a.isCheckable();
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۷۸۲b(boolean checkable) {
        this.f۱۰۵۹۲a.setCheckable(checkable);
    }

    /* renamed from: k, reason: contains not printable characters */
    public boolean m۱۰۸۰۸k() {
        return this.f۱۰۵۹۲a.isChecked();
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۷۸۸c(boolean checked) {
        this.f۱۰۵۹۲a.setChecked(checked);
    }

    /* renamed from: n, reason: contains not printable characters */
    public boolean m۱۰۸۱۴n() {
        return this.f۱۰۵۹۲a.isFocusable();
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۰۸۰۲h(boolean focusable) {
        this.f۱۰۵۹۲a.setFocusable(focusable);
    }

    /* renamed from: o, reason: contains not printable characters */
    public boolean m۱۰۸۱۵o() {
        return this.f۱۰۵۹۲a.isFocused();
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۰۸۰۳i(boolean focused) {
        this.f۱۰۵۹۲a.setFocused(focused);
    }

    /* renamed from: t, reason: contains not printable characters */
    public boolean m۱۰۸۲۰t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f۱۰۵۹۲a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: n, reason: contains not printable characters */
    public void m۱۰۸۱۳n(boolean visibleToUser) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setVisibleToUser(visibleToUser);
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    public boolean m۱۰۸۰۴i() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f۱۰۵۹۲a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۷۴a(boolean focused) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setAccessibilityFocused(focused);
        }
    }

    /* renamed from: s, reason: contains not printable characters */
    public boolean m۱۰۸۱۹s() {
        return this.f۱۰۵۹۲a.isSelected();
    }

    /* renamed from: l, reason: contains not printable characters */
    public void m۱۰۸۰۹l(boolean selected) {
        this.f۱۰۵۹۲a.setSelected(selected);
    }

    /* renamed from: l, reason: contains not printable characters */
    public boolean m۱۰۸۱۰l() {
        return this.f۱۰۵۹۲a.isClickable();
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۰۷۹۲d(boolean clickable) {
        this.f۱۰۵۹۲a.setClickable(clickable);
    }

    /* renamed from: p, reason: contains not printable characters */
    public boolean m۱۰۸۱۶p() {
        return this.f۱۰۵۹۲a.isLongClickable();
    }

    /* renamed from: j, reason: contains not printable characters */
    public void m۱۰۸۰۵j(boolean longClickable) {
        this.f۱۰۵۹۲a.setLongClickable(longClickable);
    }

    /* renamed from: m, reason: contains not printable characters */
    public boolean m۱۰۸۱۲m() {
        return this.f۱۰۵۹۲a.isEnabled();
    }

    /* renamed from: g, reason: contains not printable characters */
    public void m۱۰۸۰۰g(boolean enabled) {
        this.f۱۰۵۹۲a.setEnabled(enabled);
    }

    /* renamed from: q, reason: contains not printable characters */
    public boolean m۱۰۸۱۷q() {
        return this.f۱۰۵۹۲a.isPassword();
    }

    /* renamed from: r, reason: contains not printable characters */
    public boolean m۱۰۸۱۸r() {
        return this.f۱۰۵۹۲a.isScrollable();
    }

    /* renamed from: k, reason: contains not printable characters */
    public void m۱۰۸۰۷k(boolean scrollable) {
        this.f۱۰۵۹۲a.setScrollable(scrollable);
    }

    /* renamed from: f, reason: contains not printable characters */
    public CharSequence m۱۰۷۹۶f() {
        return this.f۱۰۵۹۲a.getPackageName();
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۰۷۹۴e(CharSequence packageName) {
        this.f۱۰۵۹۲a.setPackageName(packageName);
    }

    /* renamed from: c, reason: contains not printable characters */
    public CharSequence m۱۰۷۸۳c() {
        return this.f۱۰۵۹۲a.getClassName();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۷۲a(CharSequence className) {
        this.f۱۰۵۹۲a.setClassName(className);
    }

    /* renamed from: g, reason: contains not printable characters */
    public CharSequence m۱۰۷۹۹g() {
        return this.f۱۰۵۹۲a.getText();
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۷۹۷f(CharSequence text) {
        this.f۱۰۵۹۲a.setText(text);
    }

    /* renamed from: d, reason: contains not printable characters */
    public CharSequence m۱۰۷۸۹d() {
        return this.f۱۰۵۹۲a.getContentDescription();
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۷۸۰b(CharSequence contentDescription) {
        this.f۱۰۵۹۲a.setContentDescription(contentDescription);
    }

    /* renamed from: u, reason: contains not printable characters */
    public void m۱۰۸۲۱u() {
        this.f۱۰۵۹۲a.recycle();
    }

    /* renamed from: h, reason: contains not printable characters */
    public String m۱۰۸۰۱h() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f۱۰۵۹۲a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۷۳a(Object collectionInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setCollectionInfo(collectionInfo == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) collectionInfo).f۱۰۵۹۷a);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۷۸۱b(Object collectionItemInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setCollectionItemInfo(collectionItemInfo == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) collectionItemInfo).f۱۰۵۹۸a);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۰۷۹۵e(boolean contentInvalid) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setContentInvalid(contentInvalid);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۰۷۹۱d(CharSequence hintText) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f۱۰۵۹۲a.setHintText(hintText);
        } else if (i >= 19) {
            this.f۱۰۵۹۲a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hintText);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۷۸۷c(CharSequence error) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۱۰۵۹۲a.setError(error);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public Bundle m۱۰۷۹۳e() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f۱۰۵۹۲a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۷۹۸f(boolean dismissable) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setDismissable(dismissable);
        }
    }

    /* renamed from: m, reason: contains not printable characters */
    public void m۱۰۸۱۱m(boolean showingHintText) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۰۵۹۲a.setShowingHintText(showingHintText);
        } else {
            m۱۰۷۶۳a(4, showingHintText);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f۱۰۵۹۲a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cc other = (Cc) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f۱۰۵۹۲a;
        if (accessibilityNodeInfo == null) {
            if (other.f۱۰۵۹۲a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(other.f۱۰۵۹۲a)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        Rect bounds = new Rect();
        m۱۰۷۶۹a(bounds);
        builder.append("; boundsInParent: " + bounds);
        m۱۰۷۷۷b(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(m۱۰۷۹۶f());
        builder.append("; className: ");
        builder.append(m۱۰۷۸۳c());
        builder.append("; text: ");
        builder.append(m۱۰۷۹۹g());
        builder.append("; contentDescription: ");
        builder.append(m۱۰۷۸۹d());
        builder.append("; viewId: ");
        builder.append(m۱۰۸۰۱h());
        builder.append("; checkable: ");
        builder.append(m۱۰۸۰۶j());
        builder.append("; checked: ");
        builder.append(m۱۰۸۰۸k());
        builder.append("; focusable: ");
        builder.append(m۱۰۸۱۴n());
        builder.append("; focused: ");
        builder.append(m۱۰۸۱۵o());
        builder.append("; selected: ");
        builder.append(m۱۰۸۱۹s());
        builder.append("; clickable: ");
        builder.append(m۱۰۸۱۰l());
        builder.append("; longClickable: ");
        builder.append(m۱۰۸۱۶p());
        builder.append("; enabled: ");
        builder.append(m۱۰۸۱۲m());
        builder.append("; password: ");
        builder.append(m۱۰۸۱۷q());
        builder.append("; scrollable: " + m۱۰۸۱۸r());
        builder.append("; [");
        int actionBits = m۱۰۷۶۷a();
        while (actionBits != 0) {
            int action = 1 << Integer.numberOfTrailingZeros(actionBits);
            actionBits &= action ^ (-1);
            builder.append(m۱۰۷۶۴b(action));
            if (actionBits != 0) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۷۶۳a(int property, boolean value) {
        Bundle extras = m۱۰۷۹۳e();
        if (extras != null) {
            int booleanProperties = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (value ? property : 0) | (booleanProperties & (property ^ (-1))));
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private static String m۱۰۷۶۴b(int action) {
        if (action == 1) {
            return "ACTION_FOCUS";
        }
        if (action == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (action) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
