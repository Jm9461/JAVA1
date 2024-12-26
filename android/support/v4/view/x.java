package android.support.v4.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class x {
    @Deprecated
    public static boolean a(ViewParent parent, View child, AccessibilityEvent event) {
        return parent.requestSendAccessibilityEvent(child, event);
    }

    public static boolean b(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof m) {
            return ((m) parent).b(child, target, nestedScrollAxes, type);
        }
        if (type != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onStartNestedScroll(child, target, nestedScrollAxes);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onStartNestedScroll", e2);
                return false;
            }
        } else if (parent instanceof n) {
            return ((n) parent).onStartNestedScroll(child, target, nestedScrollAxes);
        } else {
            return false;
        }
    }

    public static void a(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof m) {
            ((m) parent).a(child, target, nestedScrollAxes, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedScrollAccepted", e2);
                }
            } else if (parent instanceof n) {
                ((n) parent).onNestedScrollAccepted(child, target, nestedScrollAxes);
            }
        }
    }

    public static void a(ViewParent parent, View target, int type) {
        if (parent instanceof m) {
            ((m) parent).a(target, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onStopNestedScroll(target);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onStopNestedScroll", e2);
                }
            } else if (parent instanceof n) {
                ((n) parent).onStopNestedScroll(target);
            }
        }
    }

    public static void a(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (parent instanceof m) {
            ((m) parent).a(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedScroll", e2);
                }
            } else if (parent instanceof n) {
                ((n) parent).onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }
    }

    public static void a(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof m) {
            ((m) parent).a(target, dx, dy, consumed, type);
        } else if (type != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedPreScroll(target, dx, dy, consumed);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedPreScroll", e2);
                }
            } else if (parent instanceof n) {
                ((n) parent).onNestedPreScroll(target, dx, dy, consumed);
            }
        }
    }

    public static boolean a(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedFling(target, velocityX, velocityY, consumed);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedFling", e2);
                return false;
            }
        } else if (parent instanceof n) {
            return ((n) parent).onNestedFling(target, velocityX, velocityY, consumed);
        } else {
            return false;
        }
    }

    public static boolean a(ViewParent parent, View target, float velocityX, float velocityY) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedPreFling(target, velocityX, velocityY);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedPreFling", e2);
                return false;
            }
        } else if (parent instanceof n) {
            return ((n) parent).onNestedPreFling(target, velocityX, velocityY);
        } else {
            return false;
        }
    }
}
