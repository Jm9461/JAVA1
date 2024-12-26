package b.g.a.b;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.e0.b;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Interpolator f۲۵۱۸a;

    public static Interpolator a(Context context) {
        if (f۲۵۱۸a == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                f۲۵۱۸a = AnimationUtils.loadInterpolator(context, 17563661);
            } else {
                f۲۵۱۸a = new b();
            }
        }
        return f۲۵۱۸a;
    }
}
