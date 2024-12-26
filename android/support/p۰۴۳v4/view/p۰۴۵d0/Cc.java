package android.support.p۰۴۳v4.view.p۰۴۵d0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.d0.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private final AccessibilityNodeInfo f۱۰۵۹۲a;

    /* renamed from: b  reason: contains not printable characters */
    public int f۱۰۵۹۳b = -1;

    /* renamed from: android.support.v4.view.d0.c$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: b  reason: contains not printable characters */
        public static final Ca f۱۰۵۹۴b = new Ca(1, null);

        /* renamed from: c  reason: contains not printable characters */
        public static final Ca f۱۰۵۹۵c = new Ca(2, null);

        /* renamed from: a  reason: contains not printable characters */
        final Object f۱۰۵۹۶a;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new Ca(4, null);
            new Ca(8, null);
            new Ca(16, null);
            new Ca(32, null);
            new Ca(64, null);
            new Ca(128, null);
            new Ca(256, null);
            new Ca(512, null);
            new Ca(1024, null);
            new Ca(2048, null);
            new Ca(4096, null);
            new Ca(8192, null);
            new Ca(16384, null);
            new Ca(32768, null);
            new Ca(65536, null);
            new Ca(131072, null);
            new Ca(262144, null);
            new Ca(524288, null);
            new Ca(1048576, null);
            new Ca(2097152, null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
            new Ca(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
            new Ca(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null);
            new Ca(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null);
            new Ca(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new Ca(accessibilityAction);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Ca(int actionId, CharSequence label) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(actionId, label) : null);
        }

        Ca(Object action) {
            this.f۱۰۵۹۶a = action;
        }
    }

    /* renamed from: android.support.v4.view.d0.c$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        final Object f۱۰۵۹۷a;

        /* renamed from: a  reason: contains not printable characters */
        public static Cb m۱۲۸۹۳a(int rowCount, int columnCount, boolean hierarchical, int selectionMode) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new Cb(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical, selectionMode));
            }
            if (i >= 19) {
                return new Cb(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical));
            }
            return new Cb(null);
        }

        Cb(Object info2) {
            this.f۱۰۵۹۷a = info2;
        }
    }

    /* renamed from: android.support.v4.view.d0.c$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        final Object f۱۰۵۹۸a;

        /* renamed from: a  reason: contains not printable characters */
        public static Cc m۱۲۸۹۴a(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new Cc(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading, selected));
            }
            if (i >= 19) {
                return new Cc(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading));
            }
            return new Cc(null);
        }

        Cc(Object info2) {
            this.f۱۰۵۹۸a = info2;
        }
    }

    private Cc(AccessibilityNodeInfo info2) {
        this.f۱۰۵۹۲a = info2;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۲۸۳۲a(AccessibilityNodeInfo info2) {
        return new Cc(info2);
    }

    /* renamed from: v  reason: contains not printable characters */
    public AccessibilityNodeInfo m۱۲۸۹۲v() {
        return this.f۱۰۵۹۲a;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static Cc m۱۲۸۳۵d(View source) {
        return m۱۲۸۳۲a(AccessibilityNodeInfo.obtain(source));
    }

    /* renamed from: w  reason: contains not printable characters */
    public static Cc m۱۲۸۳۶w() {
        return m۱۲۸۳۲a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc m۱۲۸۳۱a(Cc info2) {
        return m۱۲۸۳۲a(AccessibilityNodeInfo.obtain(info2.f۱۰۵۹۲a));
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۸۵۵c(View source) {
        this.f۱۰۵۹۲a.setSource(source);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۸۵۶c(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setSource(root, virtualDescendantId);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۲۸۴۶b() {
        return this.f۱۰۵۹۲a.getChildCount();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۴۰a(View child) {
        this.f۱۰۵۹۲a.addChild(child);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۴۱a(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.addChild(root, virtualDescendantId);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۸۳۷a() {
        return this.f۱۰۵۹۲a.getActions();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۳۸a(int action) {
        this.f۱۰۵۹۲a.addAction(action);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۸۴۵a(Ca action) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f۱۰۵۹۲a.removeAction((AccessibilityNodeInfo.AccessibilityAction) action.f۱۰۵۹۶a);
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۴۸b(View parent) {
        this.f۱۰۵۹۲a.setParent(parent);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۴۹b(View root, int virtualDescendantId) {
        this.f۱۰۵۹۳b = virtualDescendantId;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setParent(root, virtualDescendantId);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۳۹a(Rect outBounds) {
        this.f۱۰۵۹۲a.getBoundsInParent(outBounds);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۸۵۴c(Rect bounds) {
        this.f۱۰۵۹۲a.setBoundsInParent(bounds);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۴۷b(Rect outBounds) {
        this.f۱۰۵۹۲a.getBoundsInScreen(outBounds);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۸۶۰d(Rect bounds) {
        this.f۱۰۵۹۲a.setBoundsInScreen(bounds);
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۲۸۷۶j() {
        return this.f۱۰۵۹۲a.isCheckable();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۵۲b(boolean checkable) {
        this.f۱۰۵۹۲a.setCheckable(checkable);
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۲۸۷۸k() {
        return this.f۱۰۵۹۲a.isChecked();
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۸۵۸c(boolean checked) {
        this.f۱۰۵۹۲a.setChecked(checked);
    }

    /* renamed from: n  reason: contains not printable characters */
    public boolean m۱۲۸۸۴n() {
        return this.f۱۰۵۹۲a.isFocusable();
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۸۷۲h(boolean focusable) {
        this.f۱۰۵۹۲a.setFocusable(focusable);
    }

    /* renamed from: o  reason: contains not printable characters */
    public boolean m۱۲۸۸۵o() {
        return this.f۱۰۵۹۲a.isFocused();
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۲۸۷۳i(boolean focused) {
        this.f۱۰۵۹۲a.setFocused(focused);
    }

    /* renamed from: t  reason: contains not printable characters */
    public boolean m۱۲۸۹۰t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f۱۰۵۹۲a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۲۸۸۳n(boolean visibleToUser) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setVisibleToUser(visibleToUser);
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۲۸۷۴i() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f۱۰۵۹۲a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۴۴a(boolean focused) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۰۵۹۲a.setAccessibilityFocused(focused);
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    public boolean m۱۲۸۸۹s() {
        return this.f۱۰۵۹۲a.isSelected();
    }

    /* renamed from: l  reason: contains not printable characters */
    public void m۱۲۸۷۹l(boolean selected) {
        this.f۱۰۵۹۲a.setSelected(selected);
    }

    /* renamed from: l  reason: contains not printable characters */
    public boolean m۱۲۸۸۰l() {
        return this.f۱۰۵۹۲a.isClickable();
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۸۶۲d(boolean clickable) {
        this.f۱۰۵۹۲a.setClickable(clickable);
    }

    /* renamed from: p  reason: contains not printable characters */
    public boolean m۱۲۸۸۶p() {
        return this.f۱۰۵۹۲a.isLongClickable();
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۲۸۷۵j(boolean longClickable) {
        this.f۱۰۵۹۲a.setLongClickable(longClickable);
    }

    /* renamed from: m  reason: contains not printable characters */
    public boolean m۱۲۸۸۲m() {
        return this.f۱۰۵۹۲a.isEnabled();
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۸۷۰g(boolean enabled) {
        this.f۱۰۵۹۲a.setEnabled(enabled);
    }

    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۲۸۸۷q() {
        return this.f۱۰۵۹۲a.isPassword();
    }

    /* renamed from: r  reason: contains not printable characters */
    public boolean m۱۲۸۸۸r() {
        return this.f۱۰۵۹۲a.isScrollable();
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۲۸۷۷k(boolean scrollable) {
        this.f۱۰۵۹۲a.setScrollable(scrollable);
    }

    /* renamed from: f  reason: contains not printable characters */
    public CharSequence m۱۲۸۶۶f() {
        return this.f۱۰۵۹۲a.getPackageName();
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۸۶۴e(CharSequence packageName) {
        this.f۱۰۵۹۲a.setPackageName(packageName);
    }

    /* renamed from: c  reason: contains not printable characters */
    public CharSequence m۱۲۸۵۳c() {
        return this.f۱۰۵۹۲a.getClassName();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۴۲a(CharSequence className) {
        this.f۱۰۵۹۲a.setClassName(className);
    }

    /* renamed from: g  reason: contains not printable characters */
    public CharSequence m۱۲۸۶۹g() {
        return this.f۱۰۵۹۲a.getText();
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۸۶۷f(CharSequence text) {
        this.f۱۰۵۹۲a.setText(text);
    }

    /* renamed from: d  reason: contains not printable characters */
    public CharSequence m۱۲۸۵۹d() {
        return this.f۱۰۵۹۲a.getContentDescription();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۵۰b(CharSequence contentDescription) {
        this.f۱۰۵۹۲a.setContentDescription(contentDescription);
    }

    /* renamed from: u  reason: contains not printable characters */
    public void m۱۲۸۹۱u() {
        this.f۱۰۵۹۲a.recycle();
    }

    /* renamed from: h  reason: contains not printable characters */
    public String m۱۲۸۷۱h() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f۱۰۵۹۲a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۴۳a(Object collectionInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setCollectionInfo(collectionInfo == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((Cb) collectionInfo).f۱۰۵۹۷a);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۸۵۱b(Object collectionItemInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setCollectionItemInfo(collectionItemInfo == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((Cc) collectionItemInfo).f۱۰۵۹۸a);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۸۶۵e(boolean contentInvalid) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setContentInvalid(contentInvalid);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۸۶۱d(CharSequence hintText) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f۱۰۵۹۲a.setHintText(hintText);
        } else if (i >= 19) {
            this.f۱۰۵۹۲a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hintText);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۸۵۷c(CharSequence error) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۱۰۵۹۲a.setError(error);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public Bundle m۱۲۸۶۳e() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f۱۰۵۹۲a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۸۶۸f(boolean dismissable) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۰۵۹۲a.setDismissable(dismissable);
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۲۸۸۱m(boolean showingHintText) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۰۵۹۲a.setShowingHintText(showingHintText);
        } else {
            m۱۲۸۳۳a(4, showingHintText);
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
        m۱۲۸۳۹a(bounds);
        builder.append("; boundsInParent: " + bounds);
        m۱۲۸۴۷b(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(m۱۲۸۶۶f());
        builder.append("; className: ");
        builder.append(m۱۲۸۵۳c());
        builder.append("; text: ");
        builder.append(m۱۲۸۶۹g());
        builder.append("; contentDescription: ");
        builder.append(m۱۲۸۵۹d());
        builder.append("; viewId: ");
        builder.append(m۱۲۸۷۱h());
        builder.append("; checkable: ");
        builder.append(m۱۲۸۷۶j());
        builder.append("; checked: ");
        builder.append(m۱۲۸۷۸k());
        builder.append("; focusable: ");
        builder.append(m۱۲۸۸۴n());
        builder.append("; focused: ");
        builder.append(m۱۲۸۸۵o());
        builder.append("; selected: ");
        builder.append(m۱۲۸۸۹s());
        builder.append("; clickable: ");
        builder.append(m۱۲۸۸۰l());
        builder.append("; longClickable: ");
        builder.append(m۱۲۸۸۶p());
        builder.append("; enabled: ");
        builder.append(m۱۲۸۸۲m());
        builder.append("; password: ");
        builder.append(m۱۲۸۸۷q());
        builder.append("; scrollable: " + m۱۲۸۸۸r());
        builder.append("; [");
        int actionBits = m۱۲۸۳۷a();
        while (actionBits != 0) {
            int action = 1 << Integer.numberOfTrailingZeros(actionBits);
            actionBits &= action ^ -1;
            builder.append(m۱۲۸۳۴b(action));
            if (actionBits != 0) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۸۳۳a(int property, boolean value) {
        Bundle extras = m۱۲۸۶۳e();
        if (extras != null) {
            int i = 0;
            int booleanProperties = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (property ^ -1);
            if (value) {
                i = property;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | booleanProperties);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static String m۱۲۸۳۴b(int action) {
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
