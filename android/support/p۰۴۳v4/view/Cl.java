package android.support.p۰۴۳v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.l  reason: invalid class name */
public class Cl {

    /* renamed from: a  reason: contains not printable characters */
    private ViewParent f۱۰۶۱۴a;

    /* renamed from: b  reason: contains not printable characters */
    private ViewParent f۱۰۶۱۵b;

    /* renamed from: c  reason: contains not printable characters */
    private final View f۱۰۶۱۶c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۰۶۱۷d;

    /* renamed from: e  reason: contains not printable characters */
    private int[] f۱۰۶۱۸e;

    public Cl(View view) {
        this.f۱۰۶۱۶c = view;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۹۲۷a(boolean enabled) {
        if (this.f۱۰۶۱۷d) {
            Cu.m۱۲۹۷۲D(this.f۱۰۶۱۶c);
        }
        this.f۱۰۶۱۷d = enabled;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۹۳۷b() {
        return this.f۱۰۶۱۷d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۲۸a() {
        return m۱۲۹۳۱a(0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۱a(int type) {
        return m۱۲۹۲۶d(type) != null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۹۳۸b(int axes) {
        return m۱۲۹۳۲a(axes, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۲a(int axes, int type) {
        if (m۱۲۹۳۱a(type)) {
            return true;
        }
        if (!m۱۲۹۳۷b()) {
            return false;
        }
        View child = this.f۱۰۶۱۶c;
        for (ViewParent p = this.f۱۰۶۱۶c.getParent(); p != null; p = p.getParent()) {
            if (Cx.m۱۳۰۵۱b(p, child, this.f۱۰۶۱۶c, axes, type)) {
                m۱۲۹۲۵a(type, p);
                Cx.m۱۳۰۴۷a(p, child, this.f۱۰۶۱۶c, axes, type);
                return true;
            }
            if (p instanceof View) {
                child = (View) p;
            }
        }
        return false;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۹۳۹c() {
        m۱۲۹۴۰c(0);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۹۴۰c(int type) {
        ViewParent parent = m۱۲۹۲۶d(type);
        if (parent != null) {
            Cx.m۱۳۰۴۴a(parent, this.f۱۰۶۱۶c, type);
            m۱۲۹۲۵a(type, (ViewParent) null);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۳a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return m۱۲۹۳۴a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۴a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        if (m۱۲۹۳۷b()) {
            ViewParent parent = m۱۲۹۲۶d(type);
            if (parent == null) {
                return false;
            }
            if (dxConsumed != 0 || dyConsumed != 0 || dxUnconsumed != 0 || dyUnconsumed != 0) {
                if (offsetInWindow != null) {
                    this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                Cx.m۱۳۰۴۵a(parent, this.f۱۰۶۱۶c, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
                if (offsetInWindow != null) {
                    this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
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

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۵a(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return m۱۲۹۳۶a(dx, dy, consumed, offsetInWindow, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۶a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        int[] consumed2;
        if (m۱۲۹۳۷b()) {
            ViewParent parent = m۱۲۹۲۶d(type);
            if (parent == null) {
                return false;
            }
            if (dx != 0 || dy != 0) {
                if (offsetInWindow != null) {
                    this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    if (this.f۱۰۶۱۸e == null) {
                        this.f۱۰۶۱۸e = new int[2];
                    }
                    consumed2 = this.f۱۰۶۱۸e;
                } else {
                    consumed2 = consumed;
                }
                consumed2[0] = 0;
                consumed2[1] = 0;
                Cx.m۱۳۰۴۶a(parent, this.f۱۰۶۱۶c, dx, dy, consumed2, type);
                if (offsetInWindow != null) {
                    this.f۱۰۶۱۶c.getLocationInWindow(offsetInWindow);
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

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۳۰a(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!m۱۲۹۳۷b() || (parent = m۱۲۹۲۶d(0)) == null) {
            return false;
        }
        return Cx.m۱۳۰۴۹a(parent, this.f۱۰۶۱۶c, velocityX, velocityY, consumed);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۹۲۹a(float velocityX, float velocityY) {
        ViewParent parent;
        if (!m۱۲۹۳۷b() || (parent = m۱۲۹۲۶d(0)) == null) {
            return false;
        }
        return Cx.m۱۳۰۴۸a(parent, this.f۱۰۶۱۶c, velocityX, velocityY);
    }

    /* renamed from: d  reason: contains not printable characters */
    private ViewParent m۱۲۹۲۶d(int type) {
        if (type == 0) {
            return this.f۱۰۶۱۴a;
        }
        if (type != 1) {
            return null;
        }
        return this.f۱۰۶۱۵b;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۹۲۵a(int type, ViewParent p) {
        if (type == 0) {
            this.f۱۰۶۱۴a = p;
        } else if (type == 1) {
            this.f۱۰۶۱۵b = p;
        }
    }
}
