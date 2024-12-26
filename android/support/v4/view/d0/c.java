package android.support.v4.view.d0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f۱۳۳۸a;

    /* renamed from: b  reason: collision with root package name */
    public int f۱۳۳۹b = -1;

    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f۱۳۴۰b = new a(1, null);

        /* renamed from: c  reason: collision with root package name */
        public static final a f۱۳۴۱c = new a(2, null);

        /* renamed from: a  reason: collision with root package name */
        final Object f۱۳۴۲a;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
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
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int actionId, CharSequence label) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(actionId, label) : null);
        }

        a(Object action) {
            this.f۱۳۴۲a = action;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f۱۳۴۳a;

        public static b a(int rowCount, int columnCount, boolean hierarchical, int selectionMode) {
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
            this.f۱۳۴۳a = info2;
        }
    }

    /* renamed from: android.support.v4.view.d0.c$c  reason: collision with other inner class name */
    public static class C۰۰۳۲c {

        /* renamed from: a  reason: collision with root package name */
        final Object f۱۳۴۴a;

        public static C۰۰۳۲c a(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                return new C۰۰۳۲c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading, selected));
            }
            if (i >= 19) {
                return new C۰۰۳۲c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading));
            }
            return new C۰۰۳۲c(null);
        }

        C۰۰۳۲c(Object info2) {
            this.f۱۳۴۴a = info2;
        }
    }

    private c(AccessibilityNodeInfo info2) {
        this.f۱۳۳۸a = info2;
    }

    public static c a(AccessibilityNodeInfo info2) {
        return new c(info2);
    }

    public AccessibilityNodeInfo v() {
        return this.f۱۳۳۸a;
    }

    public static c d(View source) {
        return a(AccessibilityNodeInfo.obtain(source));
    }

    public static c w() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public static c a(c info2) {
        return a(AccessibilityNodeInfo.obtain(info2.f۱۳۳۸a));
    }

    public void c(View source) {
        this.f۱۳۳۸a.setSource(source);
    }

    public void c(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۳۳۸a.setSource(root, virtualDescendantId);
        }
    }

    public int b() {
        return this.f۱۳۳۸a.getChildCount();
    }

    public void a(View child) {
        this.f۱۳۳۸a.addChild(child);
    }

    public void a(View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۳۳۸a.addChild(root, virtualDescendantId);
        }
    }

    public int a() {
        return this.f۱۳۳۸a.getActions();
    }

    public void a(int action) {
        this.f۱۳۳۸a.addAction(action);
    }

    public boolean a(a action) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f۱۳۳۸a.removeAction((AccessibilityNodeInfo.AccessibilityAction) action.f۱۳۴۲a);
        }
        return false;
    }

    public void b(View parent) {
        this.f۱۳۳۸a.setParent(parent);
    }

    public void b(View root, int virtualDescendantId) {
        this.f۱۳۳۹b = virtualDescendantId;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۳۳۸a.setParent(root, virtualDescendantId);
        }
    }

    public void a(Rect outBounds) {
        this.f۱۳۳۸a.getBoundsInParent(outBounds);
    }

    public void c(Rect bounds) {
        this.f۱۳۳۸a.setBoundsInParent(bounds);
    }

    public void b(Rect outBounds) {
        this.f۱۳۳۸a.getBoundsInScreen(outBounds);
    }

    public void d(Rect bounds) {
        this.f۱۳۳۸a.setBoundsInScreen(bounds);
    }

    public boolean j() {
        return this.f۱۳۳۸a.isCheckable();
    }

    public void b(boolean checkable) {
        this.f۱۳۳۸a.setCheckable(checkable);
    }

    public boolean k() {
        return this.f۱۳۳۸a.isChecked();
    }

    public void c(boolean checked) {
        this.f۱۳۳۸a.setChecked(checked);
    }

    public boolean n() {
        return this.f۱۳۳۸a.isFocusable();
    }

    public void h(boolean focusable) {
        this.f۱۳۳۸a.setFocusable(focusable);
    }

    public boolean o() {
        return this.f۱۳۳۸a.isFocused();
    }

    public void i(boolean focused) {
        this.f۱۳۳۸a.setFocused(focused);
    }

    public boolean t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f۱۳۳۸a.isVisibleToUser();
        }
        return false;
    }

    public void n(boolean visibleToUser) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۳۳۸a.setVisibleToUser(visibleToUser);
        }
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f۱۳۳۸a.isAccessibilityFocused();
        }
        return false;
    }

    public void a(boolean focused) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۳۳۸a.setAccessibilityFocused(focused);
        }
    }

    public boolean s() {
        return this.f۱۳۳۸a.isSelected();
    }

    public void l(boolean selected) {
        this.f۱۳۳۸a.setSelected(selected);
    }

    public boolean l() {
        return this.f۱۳۳۸a.isClickable();
    }

    public void d(boolean clickable) {
        this.f۱۳۳۸a.setClickable(clickable);
    }

    public boolean p() {
        return this.f۱۳۳۸a.isLongClickable();
    }

    public void j(boolean longClickable) {
        this.f۱۳۳۸a.setLongClickable(longClickable);
    }

    public boolean m() {
        return this.f۱۳۳۸a.isEnabled();
    }

    public void g(boolean enabled) {
        this.f۱۳۳۸a.setEnabled(enabled);
    }

    public boolean q() {
        return this.f۱۳۳۸a.isPassword();
    }

    public boolean r() {
        return this.f۱۳۳۸a.isScrollable();
    }

    public void k(boolean scrollable) {
        this.f۱۳۳۸a.setScrollable(scrollable);
    }

    public CharSequence f() {
        return this.f۱۳۳۸a.getPackageName();
    }

    public void e(CharSequence packageName) {
        this.f۱۳۳۸a.setPackageName(packageName);
    }

    public CharSequence c() {
        return this.f۱۳۳۸a.getClassName();
    }

    public void a(CharSequence className) {
        this.f۱۳۳۸a.setClassName(className);
    }

    public CharSequence g() {
        return this.f۱۳۳۸a.getText();
    }

    public void f(CharSequence text) {
        this.f۱۳۳۸a.setText(text);
    }

    public CharSequence d() {
        return this.f۱۳۳۸a.getContentDescription();
    }

    public void b(CharSequence contentDescription) {
        this.f۱۳۳۸a.setContentDescription(contentDescription);
    }

    public void u() {
        this.f۱۳۳۸a.recycle();
    }

    public String h() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f۱۳۳۸a.getViewIdResourceName();
        }
        return null;
    }

    public void a(Object collectionInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۳۳۸a.setCollectionInfo(collectionInfo == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) collectionInfo).f۱۳۴۳a);
        }
    }

    public void b(Object collectionItemInfo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۳۳۸a.setCollectionItemInfo(collectionItemInfo == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C۰۰۳۲c) collectionItemInfo).f۱۳۴۴a);
        }
    }

    public void e(boolean contentInvalid) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۳۳۸a.setContentInvalid(contentInvalid);
        }
    }

    public void d(CharSequence hintText) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f۱۳۳۸a.setHintText(hintText);
        } else if (i >= 19) {
            this.f۱۳۳۸a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hintText);
        }
    }

    public void c(CharSequence error) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۱۳۳۸a.setError(error);
        }
    }

    public Bundle e() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f۱۳۳۸a.getExtras();
        }
        return new Bundle();
    }

    public void f(boolean dismissable) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f۱۳۳۸a.setDismissable(dismissable);
        }
    }

    public void m(boolean showingHintText) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f۱۳۳۸a.setShowingHintText(showingHintText);
        } else {
            a(4, showingHintText);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f۱۳۳۸a;
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
        c other = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f۱۳۳۸a;
        if (accessibilityNodeInfo == null) {
            if (other.f۱۳۳۸a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(other.f۱۳۳۸a)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        Rect bounds = new Rect();
        a(bounds);
        builder.append("; boundsInParent: " + bounds);
        b(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(f());
        builder.append("; className: ");
        builder.append(c());
        builder.append("; text: ");
        builder.append(g());
        builder.append("; contentDescription: ");
        builder.append(d());
        builder.append("; viewId: ");
        builder.append(h());
        builder.append("; checkable: ");
        builder.append(j());
        builder.append("; checked: ");
        builder.append(k());
        builder.append("; focusable: ");
        builder.append(n());
        builder.append("; focused: ");
        builder.append(o());
        builder.append("; selected: ");
        builder.append(s());
        builder.append("; clickable: ");
        builder.append(l());
        builder.append("; longClickable: ");
        builder.append(p());
        builder.append("; enabled: ");
        builder.append(m());
        builder.append("; password: ");
        builder.append(q());
        builder.append("; scrollable: " + r());
        builder.append("; [");
        int actionBits = a();
        while (actionBits != 0) {
            int action = 1 << Integer.numberOfTrailingZeros(actionBits);
            actionBits &= action ^ -1;
            builder.append(b(action));
            if (actionBits != 0) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private void a(int property, boolean value) {
        Bundle extras = e();
        if (extras != null) {
            int i = 0;
            int booleanProperties = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (property ^ -1);
            if (value) {
                i = property;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | booleanProperties);
        }
    }

    private static String b(int action) {
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
