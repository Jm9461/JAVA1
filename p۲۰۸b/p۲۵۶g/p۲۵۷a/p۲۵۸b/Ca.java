package p۲۰۸b.p۲۵۶g.p۲۵۷a.p۲۵۸b;

import android.R;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.p۲۰۴e0.Cb;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: b.g.a.b.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: a, reason: contains not printable characters */
    private static Interpolator f۱۲۸۵۹a;

    /* renamed from: a, reason: contains not printable characters */
    public static Interpolator m۱۴۱۱۴a(Context context) {
        if (f۱۲۸۵۹a == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                f۱۲۸۵۹a = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
            } else {
                f۱۲۸۵۹a = new Cb();
            }
        }
        return f۱۲۸۵۹a;
    }
}
