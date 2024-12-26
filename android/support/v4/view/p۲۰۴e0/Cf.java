package android.support.v4.view.p۲۰۴e0;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.e0.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf {
    /* renamed from: a, reason: contains not printable characters */
    public static Interpolator m۱۰۸۴۰a(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new InterpolatorCe(path);
    }
}
