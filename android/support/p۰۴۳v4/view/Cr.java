package android.support.p۰۴۳v4.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: android.support.v4.view.r  reason: invalid class name */
public final class Cr {

    /* renamed from: a  reason: contains not printable characters */
    private Object f۱۰۶۲۲a;

    private Cr(Object pointerIcon) {
        this.f۱۰۶۲۲a = pointerIcon;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۲۹۶۸a() {
        return this.f۱۰۶۲۲a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cr m۱۲۹۶۷a(Context context, int style) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Cr(PointerIcon.getSystemIcon(context, style));
        }
        return new Cr(null);
    }
}
