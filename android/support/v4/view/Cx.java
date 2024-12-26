package android.support.v4.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.x, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cx {
    @Deprecated
    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۹۸۰a(ViewParent parent, View child, AccessibilityEvent event) {
        return parent.requestSendAccessibilityEvent(child, event);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۰۹۸۱b(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof InterfaceCm) {
            return ((InterfaceCm) parent).mo۱۱۱۰۶b(child, target, nestedScrollAxes, type);
        }
        if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return parent.onStartNestedScroll(child, target, nestedScrollAxes);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                    return false;
                }
            }
            if (parent instanceof InterfaceCn) {
                return ((InterfaceCn) parent).onStartNestedScroll(child, target, nestedScrollAxes);
            }
            return false;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۷۷a(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof InterfaceCm) {
            ((InterfaceCm) parent).mo۱۱۰۹۹a(child, target, nestedScrollAxes, type);
            return;
        }
        if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                    return;
                }
            }
            if (parent instanceof InterfaceCn) {
                ((InterfaceCn) parent).onNestedScrollAccepted(child, target, nestedScrollAxes);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۷۴a(ViewParent parent, View target, int type) {
        if (parent instanceof InterfaceCm) {
            ((InterfaceCm) parent).mo۱۱۰۹۶a(target, type);
            return;
        }
        if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onStopNestedScroll(target);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStopNestedScroll", e2);
                    return;
                }
            }
            if (parent instanceof InterfaceCn) {
                ((InterfaceCn) parent).onStopNestedScroll(target);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۷۵a(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (parent instanceof InterfaceCm) {
            ((InterfaceCm) parent).mo۱۱۰۹۷a(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
            return;
        }
        if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScroll", e2);
                    return;
                }
            }
            if (parent instanceof InterfaceCn) {
                ((InterfaceCn) parent).onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۷۶a(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof InterfaceCm) {
            ((InterfaceCm) parent).mo۱۱۰۹۸a(target, dx, dy, consumed, type);
            return;
        }
        if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedPreScroll(target, dx, dy, consumed);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreScroll", e2);
                    return;
                }
            }
            if (parent instanceof InterfaceCn) {
                ((InterfaceCn) parent).onNestedPreScroll(target, dx, dy, consumed);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۹۷۹a(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedFling(target, velocityX, velocityY, consumed);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedFling", e2);
                return false;
            }
        }
        if (parent instanceof InterfaceCn) {
            return ((InterfaceCn) parent).onNestedFling(target, velocityX, velocityY, consumed);
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۹۷۸a(ViewParent parent, View target, float velocityX, float velocityY) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedPreFling(target, velocityX, velocityY);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreFling", e2);
                return false;
            }
        }
        if (parent instanceof InterfaceCn) {
            return ((InterfaceCn) parent).onNestedPreFling(target, velocityX, velocityY);
        }
        return false;
    }
}
