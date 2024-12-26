package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

import android.animation.TimeInterpolator;
import android.support.v4.view.p۲۰۴e0.Cb;
import android.support.v4.view.p۲۰۴e0.Cc;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: a.b.c.l.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: a, reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۱a = new LinearInterpolator();

    /* renamed from: b, reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۲b = new Cb();

    /* renamed from: c, reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۳c = new android.support.v4.view.p۲۰۴e0.Ca();

    /* renamed from: d, reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۴d = new Cc();

    /* renamed from: e, reason: contains not printable characters */
    public static final TimeInterpolator f۸۲۵۵e = new DecelerateInterpolator();

    /* renamed from: a, reason: contains not printable characters */
    public static float m۷۸۷۶a(float startValue, float endValue, float fraction) {
        return ((endValue - startValue) * fraction) + startValue;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۷۸۷۷a(int startValue, int endValue, float fraction) {
        return Math.round((endValue - startValue) * fraction) + startValue;
    }
}
