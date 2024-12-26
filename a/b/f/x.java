package a.b.f;

import android.os.Build;
import android.view.ViewGroup;

class x {
    static w a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new v(group);
        }
        return u.a(group);
    }

    static void a(ViewGroup group, boolean suppress) {
        if (Build.VERSION.SDK_INT >= 18) {
            z.a(group, suppress);
        } else {
            y.a(group, suppress);
        }
    }
}
