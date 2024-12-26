package android.support.v4.view;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.c0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc0 {

    /* renamed from: a, reason: contains not printable characters */
    private final Object f۱۰۵۹۰a;

    private Cc0(Object insets) {
        this.f۱۰۵۹۰a = insets;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۰۷۵۰c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۰۵۹۰a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: e, reason: contains not printable characters */
    public int m۱۰۷۵۲e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۰۵۹۰a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۰۷۵۱d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۰۵۹۰a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۰۷۴۹b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۰۵۹۰a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: f, reason: contains not printable characters */
    public boolean m۱۰۷۵۳f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۰۵۹۰a).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: g, reason: contains not printable characters */
    public boolean m۱۰۷۵۴g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f۱۰۵۹۰a).isConsumed();
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc0 m۱۰۷۴۷a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new Cc0(((WindowInsets) this.f۱۰۵۹۰a).consumeSystemWindowInsets());
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc0 m۱۰۷۴۸a(int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new Cc0(((WindowInsets) this.f۱۰۵۹۰a).replaceSystemWindowInsets(left, top, right, bottom));
        }
        return null;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cc0 other = (Cc0) o;
        Object obj = this.f۱۰۵۹۰a;
        return obj == null ? other.f۱۰۵۹۰a == null : obj.equals(other.f۱۰۵۹۰a);
    }

    public int hashCode() {
        Object obj = this.f۱۰۵۹۰a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cc0 m۱۰۷۴۵a(Object insets) {
        if (insets == null) {
            return null;
        }
        return new Cc0(insets);
    }

    /* renamed from: a, reason: contains not printable characters */
    static Object m۱۰۷۴۶a(Cc0 insets) {
        if (insets == null) {
            return null;
        }
        return insets.f۱۰۵۹۰a;
    }
}
