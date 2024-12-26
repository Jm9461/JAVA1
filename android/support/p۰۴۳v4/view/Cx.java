package android.support.p۰۴۳v4.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.x  reason: invalid class name */
public final class Cx {
    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۳۰۵۰a(ViewParent parent, View child, AccessibilityEvent event) {
        return parent.requestSendAccessibilityEvent(child, event);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۳۰۵۱b(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof AbstractCm) {
            return ((AbstractCm) parent).m۱۲۹۴۵b(child, target, nestedScrollAxes, type);
        }
        if (type != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onStartNestedScroll(child, target, nestedScrollAxes);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onStartNestedScroll", e);
                return false;
            }
        } else if (parent instanceof AbstractCn) {
            return ((AbstractCn) parent).onStartNestedScroll(child, target, nestedScrollAxes);
        } else {
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۰۴۷a(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof AbstractCm) {
            ((AbstractCm) parent).m۱۲۹۴۴a(child, target, nestedScrollAxes, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedScrollAccepted", e);
                }
            } else if (parent instanceof AbstractCn) {
                ((AbstractCn) parent).onNestedScrollAccepted(child, target, nestedScrollAxes);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۰۴۴a(ViewParent parent, View target, int type) {
        if (parent instanceof AbstractCm) {
            ((AbstractCm) parent).m۱۲۹۴۱a(target, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onStopNestedScroll(target);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onStopNestedScroll", e);
                }
            } else if (parent instanceof AbstractCn) {
                ((AbstractCn) parent).onStopNestedScroll(target);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۰۴۵a(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (parent instanceof AbstractCm) {
            ((AbstractCm) parent).m۱۲۹۴۲a(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedScroll", e);
                }
            } else if (parent instanceof AbstractCn) {
                ((AbstractCn) parent).onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۰۴۶a(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof AbstractCm) {
            ((AbstractCm) parent).m۱۲۹۴۳a(target, dx, dy, consumed, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedPreScroll(target, dx, dy, consumed);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedPreScroll", e);
                }
            } else if (parent instanceof AbstractCn) {
                ((AbstractCn) parent).onNestedPreScroll(target, dx, dy, consumed);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۳۰۴۹a(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedFling(target, velocityX, velocityY, consumed);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedFling", e);
                return false;
            }
        } else if (parent instanceof AbstractCn) {
            return ((AbstractCn) parent).onNestedFling(target, velocityX, velocityY, consumed);
        } else {
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۳۰۴۸a(ViewParent parent, View target, float velocityX, float velocityY) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedPreFling(target, velocityX, velocityY);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedPreFling", e);
                return false;
            }
        } else if (parent instanceof AbstractCn) {
            return ((AbstractCn) parent).onNestedPreFling(target, velocityX, velocityY);
        } else {
            return false;
        }
    }
}
