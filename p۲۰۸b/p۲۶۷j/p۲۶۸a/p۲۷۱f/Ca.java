package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f;

import android.graphics.Color;

/* renamed from: b.j.a.f.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۴۴۲۴a(int baseColor, float alphaPercent) {
        int alpha = Math.round(Color.alpha(baseColor) * alphaPercent);
        return (16777215 & baseColor) | (alpha << 24);
    }
}
