package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.animation.TimeInterpolator;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Cb;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Cc;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: a.b.c.l.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۱a = new LinearInterpolator();

    /* renamed from: b  reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۲b = new Cb();

    /* renamed from: c  reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۳c = new android.support.p۰۴۳v4.view.p۰۴۶e0.Ca();

    /* renamed from: d  reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۴d = new Cc();

    /* renamed from: e  reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۵e = new DecelerateInterpolator();

    /* renamed from: a  reason: contains not printable characters */
    public static float m۹۹۴۳a(float startValue, float endValue, float fraction) {
        return ((endValue - startValue) * fraction) + startValue;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۹۹۴۴a(int startValue, int endValue, float fraction) {
        return Math.round(((float) (endValue - startValue)) * fraction) + startValue;
    }
}
