package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f;

import android.graphics.Color;

/* renamed from: b.j.a.f.a  reason: invalid class name */
public class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۴۹۹a(int baseColor, float alphaPercent) {
        return (16777215 & baseColor) | (Math.round(((float) Color.alpha(baseColor)) * alphaPercent) << 24);
    }
}
