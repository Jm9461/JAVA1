package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۳h;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.h.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        if (t == 0.0f) {
            return Float.valueOf(b2);
        }
        if (t / d2 == 1.0f) {
            return Float.valueOf(b2 + c2);
        }
        float p = 0.3f * d2;
        float s = p / 4.0f;
        return Float.valueOf((((float) Math.pow(2.0d, (-10.0f) * r0)) * c2 * ((float) Math.sin((((r0 * d2) - s) * 6.2831855f) / p))) + c2 + b2);
    }
}
