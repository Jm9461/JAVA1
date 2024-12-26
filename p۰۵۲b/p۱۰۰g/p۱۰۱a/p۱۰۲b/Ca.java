package p۰۵۲b.p۱۰۰g.p۱۰۱a.p۱۰۲b;

import android.content.Context;
import android.os.Build;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Cb;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: b.g.a.b.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private static Interpolator f۱۲۸۵۹a;

    /* renamed from: a  reason: contains not printable characters */
    public static Interpolator m۱۶۱۸۵a(Context context) {
        if (f۱۲۸۵۹a == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                f۱۲۸۵۹a = AnimationUtils.loadInterpolator(context, 17563661);
            } else {
                f۱۲۸۵۹a = new Cb();
            }
        }
        return f۱۲۸۵۹a;
    }
}
