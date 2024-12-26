package android.support.v4.view;

import android.os.Build;
import android.view.WindowInsets;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f۱۳۳۶a;

    private c0(Object insets) {
        this.f۱۳۳۶a = insets;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۳۳۶a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۳۳۶a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۳۳۶a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۳۳۶a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public boolean f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f۱۳۳۶a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f۱۳۳۶a).isConsumed();
        }
        return false;
    }

    public c0 a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f۱۳۳۶a).consumeSystemWindowInsets());
        }
        return null;
    }

    public c0 a(int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f۱۳۳۶a).replaceSystemWindowInsets(left, top, right, bottom));
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
        c0 other = (c0) o;
        Object obj = this.f۱۳۳۶a;
        if (obj != null) {
            return obj.equals(other.f۱۳۳۶a);
        }
        if (other.f۱۳۳۶a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f۱۳۳۶a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    static c0 a(Object insets) {
        if (insets == null) {
            return null;
        }
        return new c0(insets);
    }

    static Object a(c0 insets) {
        if (insets == null) {
            return null;
        }
        return insets.f۱۳۳۶a;
    }
}
