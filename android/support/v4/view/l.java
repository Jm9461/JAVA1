package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f۱۳۶۰a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f۱۳۶۱b;

    /* renamed from: c  reason: collision with root package name */
    private final View f۱۳۶۲c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۱۳۶۳d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f۱۳۶۴e;

    public l(View view) {
        this.f۱۳۶۲c = view;
    }

    public void a(boolean enabled) {
        if (this.f۱۳۶۳d) {
            u.D(this.f۱۳۶۲c);
        }
        this.f۱۳۶۳d = enabled;
    }

    public boolean b() {
        return this.f۱۳۶۳d;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(int type) {
        return d(type) != null;
    }

    public boolean b(int axes) {
        return a(axes, 0);
    }

    public boolean a(int axes, int type) {
        if (a(type)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        View child = this.f۱۳۶۲c;
        for (ViewParent p = this.f۱۳۶۲c.getParent(); p != null; p = p.getParent()) {
            if (x.b(p, child, this.f۱۳۶۲c, axes, type)) {
                a(type, p);
                x.a(p, child, this.f۱۳۶۲c, axes, type);
                return true;
            }
            if (p instanceof View) {
                child = (View) p;
            }
        }
        return false;
    }

    public void c() {
        c(0);
    }

    public void c(int type) {
        ViewParent parent = d(type);
        if (parent != null) {
            x.a(parent, this.f۱۳۶۲c, type);
            a(type, (ViewParent) null);
        }
    }

    public boolean a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0);
    }

    public boolean a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        if (b()) {
            ViewParent parent = d(type);
            if (parent == null) {
                return false;
            }
            if (dxConsumed != 0 || dyConsumed != 0 || dxUnconsumed != 0 || dyUnconsumed != 0) {
                if (offsetInWindow != null) {
                    this.f۱۳۶۲c.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                x.a(parent, this.f۱۳۶۲c, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
                if (offsetInWindow != null) {
                    this.f۱۳۶۲c.getLocationInWindow(offsetInWindow);
                    offsetInWindow[0] = offsetInWindow[0] - startX;
                    offsetInWindow[1] = offsetInWindow[1] - startY;
                }
                return true;
            } else if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
        }
        return false;
    }

    public boolean a(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return a(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        int[] consumed2;
        if (b()) {
            ViewParent parent = d(type);
            if (parent == null) {
                return false;
            }
            if (dx != 0 || dy != 0) {
                if (offsetInWindow != null) {
                    this.f۱۳۶۲c.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    if (this.f۱۳۶۴e == null) {
                        this.f۱۳۶۴e = new int[2];
                    }
                    consumed2 = this.f۱۳۶۴e;
                } else {
                    consumed2 = consumed;
                }
                consumed2[0] = 0;
                consumed2[1] = 0;
                x.a(parent, this.f۱۳۶۲c, dx, dy, consumed2, type);
                if (offsetInWindow != null) {
                    this.f۱۳۶۲c.getLocationInWindow(offsetInWindow);
                    offsetInWindow[0] = offsetInWindow[0] - startX;
                    offsetInWindow[1] = offsetInWindow[1] - startY;
                }
                if (consumed2[0] == 0 && consumed2[1] == 0) {
                    return false;
                }
                return true;
            } else if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
        }
        return false;
    }

    public boolean a(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!b() || (parent = d(0)) == null) {
            return false;
        }
        return x.a(parent, this.f۱۳۶۲c, velocityX, velocityY, consumed);
    }

    public boolean a(float velocityX, float velocityY) {
        ViewParent parent;
        if (!b() || (parent = d(0)) == null) {
            return false;
        }
        return x.a(parent, this.f۱۳۶۲c, velocityX, velocityY);
    }

    private ViewParent d(int type) {
        if (type == 0) {
            return this.f۱۳۶۰a;
        }
        if (type != 1) {
            return null;
        }
        return this.f۱۳۶۱b;
    }

    private void a(int type, ViewParent p) {
        if (type == 0) {
            this.f۱۳۶۰a = p;
        } else if (type == 1) {
            this.f۱۳۶۱b = p;
        }
    }
}
