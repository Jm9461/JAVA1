package android.support.v4.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private Object f۱۳۶۸a;

    private r(Object pointerIcon) {
        this.f۱۳۶۸a = pointerIcon;
    }

    public Object a() {
        return this.f۱۳۶۸a;
    }

    public static r a(Context context, int style) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new r(PointerIcon.getSystemIcon(context, style));
        }
        return new r(null);
    }
}
