package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۳h;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.h.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        if (t == 0.0f) {
            return Float.valueOf(b2);
        }
        float t2 = t / d2;
        if (t2 == 1.0f) {
            return Float.valueOf(b2 + c2);
        }
        float p = 0.3f * d2;
        float s = p / 4.0f;
        float t3 = t2 - 1.0f;
        return Float.valueOf((-(((float) Math.pow(2.0d, t3 * 10.0f)) * c2 * ((float) Math.sin((((t3 * d2) - s) * 6.2831855f) / p)))) + b2);
    }
}
