package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۰e;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.e.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        float t2 = t / d2;
        if (t2 < 0.36363637f) {
            return Float.valueOf((7.5625f * t2 * t2 * c2) + b2);
        }
        if (t2 < 0.72727275f) {
            float t3 = t2 - 0.54545456f;
            return Float.valueOf((((t3 * 7.5625f * t3) + 0.75f) * c2) + b2);
        }
        if (t2 < 0.9090909090909091d) {
            float t4 = t2 - 0.8181818f;
            return Float.valueOf((((t4 * 7.5625f * t4) + 0.9375f) * c2) + b2);
        }
        float t5 = t2 - 0.95454544f;
        return Float.valueOf((((t5 * 7.5625f * t5) + 0.984375f) * c2) + b2);
    }
}
