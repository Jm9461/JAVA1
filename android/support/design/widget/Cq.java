package android.support.design.widget;

/* renamed from: android.support.design.widget.q  reason: invalid class name */
public final class Cq {
    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۱۹۹۹a(float x1, float y1, float x2, float y2) {
        return (float) Math.hypot((double) (x2 - x1), (double) (y2 - y1));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۱۹۹۸a(float start, float stop, float amount) {
        return ((1.0f - amount) * start) + (amount * stop);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۲۰۰۰a(float pointX, float pointY, float rectLeft, float rectTop, float rectRight, float rectBottom) {
        return m۱۲۰۰۱b(m۱۱۹۹۹a(pointX, pointY, rectLeft, rectTop), m۱۱۹۹۹a(pointX, pointY, rectRight, rectTop), m۱۱۹۹۹a(pointX, pointY, rectRight, rectBottom), m۱۱۹۹۹a(pointX, pointY, rectLeft, rectBottom));
    }

    /* renamed from: b  reason: contains not printable characters */
    private static float m۱۲۰۰۱b(float a, float b, float c, float d) {
        if (a > b && a > c && a > d) {
            return a;
        }
        if (b <= c || b <= d) {
            return c > d ? c : d;
        }
        return b;
    }
}
