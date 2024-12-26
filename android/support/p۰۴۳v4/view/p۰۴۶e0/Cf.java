package android.support.p۰۴۳v4.view.p۰۴۶e0;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.e0.f  reason: invalid class name */
public final class Cf {
    /* renamed from: a  reason: contains not printable characters */
    public static Interpolator m۱۲۹۱۰a(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new animationInterpolatorCe(path);
    }
}
