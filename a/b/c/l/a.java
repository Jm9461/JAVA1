package a.b.c.l;

import android.animation.TimeInterpolator;
import android.support.v4.view.e0.b;
import android.support.v4.view.e0.c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f۲۲a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f۲۳b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f۲۴c = new android.support.v4.view.e0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f۲۵d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f۲۶e = new DecelerateInterpolator();

    public static float a(float startValue, float endValue, float fraction) {
        return ((endValue - startValue) * fraction) + startValue;
    }

    public static int a(int startValue, int endValue, float fraction) {
        return Math.round(((float) (endValue - startValue)) * fraction) + startValue;
    }
}
