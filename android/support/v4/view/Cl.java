package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cl {

    /* renamed from: a, reason: contains not printable characters */
    private ViewParent f۱۰۶۱۴a;

    /* renamed from: b, reason: contains not printable characters */
    private ViewParent f۱۰۶۱۵b;

    /* renamed from: c, reason: contains not printable characters */
    private final View f۱۰۶۱۶c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۰۶۱۷d;

    /* renamed from: e, reason: contains not printable characters */
    private int[] f۱۰۶۱۸e;

    public Cl(View view) {
        this.f۱۰۶۱۶c = view;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۸۵۷a(boolean enabled) {
        if (this.f۱۰۶۱۷d) {
            Cu.m۱۰۹۰۲D(this.f۱۰۶۱۶c);
        }
        this.f۱۰۶۱۷d = enabled;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۸۶۷b() {
        return this.f۱۰۶۱۷d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۵۸a() {
        return m۱۰۸۶۱a(0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۱a(int type) {
        return m۱۰۸۵۶d(type) != null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۸۶۸b(int axes) {
        return m۱۰۸۶۲a(axes, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۲a(int axes, int type) {
        if (m۱۰۸۶۱a(type)) {
            return true;
        }
        if (m۱۰۸۶۷b()) {
            View child = this.f۱۰۶۱۶c;
            for (ViewParent p = this.f۱۰۶۱۶c.getParent(); p != null; p = p.getParent()) {
                if (Cx.m۱۰۹۸۱b(p, child, this.f۱۰۶۱۶c, axes, type)) {
                    m۱۰۸۵۵a(type, p);
                    Cx.m۱۰۹۷۷a(p, child, this.f۱۰۶۱۶c, axes, type);
                    return true;
                }
                if (p instanceof View) {
                    child = (View) p;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۸۶۹c() {
        m۱۰۸۷۰c(0);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۸۷۰c(int type) {
        ViewParent parent = m۱۰۸۵۶d(type);
        if (parent != null) {
            Cx.m۱۰۹۷۴a(parent, this.f۱۰۶۱۶c, type);
            m۱۰۸۵۵a(type, (ViewParent) null);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۳a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return m۱۰۸۶۴a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۴a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        ViewParent parent;
        int startX;
        int startY;
        if (!m۱۰۸۶۷b() || (parent = m۱۰۸۵۶d(type)) == null) {
            return false;
        }
        if (dxConsumed != 0 || dyConsumed != 0 || dxUnconsumed != 0 || dyUnconsumed != 0) {
            if (offsetInWindow == null) {
                startX = 0;
                startY = 0;
            } else {
                this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
                int startX2 = offsetInWindow[0];
                int startY2 = offsetInWindow[1];
                startX = startX2;
                startY = startY2;
            }
            Cx.m۱۰۹۷۵a(parent, this.f۱۰۶۱۶c, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
            if (offsetInWindow != null) {
                this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
                offsetInWindow[0] = offsetInWindow[0] - startX;
                offsetInWindow[1] = offsetInWindow[1] - startY;
            }
            return true;
        }
        if (offsetInWindow != null) {
            offsetInWindow[0] = 0;
            offsetInWindow[1] = 0;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۵a(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return m۱۰۸۶۶a(dx, dy, consumed, offsetInWindow, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۶a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        ViewParent parent;
        int startX;
        int startY;
        int[] consumed2;
        if (!m۱۰۸۶۷b() || (parent = m۱۰۸۵۶d(type)) == null) {
            return false;
        }
        if (dx != 0 || dy != 0) {
            if (offsetInWindow == null) {
                startX = 0;
                startY = 0;
            } else {
                this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
                int startX2 = offsetInWindow[0];
                int startY2 = offsetInWindow[1];
                startX = startX2;
                startY = startY2;
            }
            if (consumed != null) {
                consumed2 = consumed;
            } else {
                if (this.f۱۰۶۱۸e == null) {
                    this.f۱۰۶۱۸e = new int[2];
                }
                consumed2 = this.f۱۰۶۱۸e;
            }
            consumed2[0] = 0;
            consumed2[1] = 0;
            Cx.m۱۰۹۷۶a(parent, this.f۱۰۶۱۶c, dx, dy, consumed2, type);
            if (offsetInWindow != null) {
                this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
                offsetInWindow[0] = offsetInWindow[0] - startX;
                offsetInWindow[1] = offsetInWindow[1] - startY;
            }
            return (consumed2[0] == 0 && consumed2[1] == 0) ? false : true;
        }
        if (offsetInWindow != null) {
            offsetInWindow[0] = 0;
            offsetInWindow[1] = 0;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۶۰a(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!m۱۰۸۶۷b() || (parent = m۱۰۸۵۶d(0)) == null) {
            return false;
        }
        return Cx.m۱۰۹۷۹a(parent, this.f۱۰۶۱۶c, velocityX, velocityY, consumed);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۸۵۹a(float velocityX, float velocityY) {
        ViewParent parent;
        if (!m۱۰۸۶۷b() || (parent = m۱۰۸۵۶d(0)) == null) {
            return false;
        }
        return Cx.m۱۰۹۷۸a(parent, this.f۱۰۶۱۶c, velocityX, velocityY);
    }

    /* renamed from: d, reason: contains not printable characters */
    private ViewParent m۱۰۸۵۶d(int type) {
        if (type == 0) {
            return this.f۱۰۶۱۴a;
        }
        if (type == 1) {
            return this.f۱۰۶۱۵b;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۸۵۵a(int type, ViewParent p) {
        if (type == 0) {
            this.f۱۰۶۱۴a = p;
        } else if (type == 1) {
            this.f۱۰۶۱۵b = p;
        }
    }
}
