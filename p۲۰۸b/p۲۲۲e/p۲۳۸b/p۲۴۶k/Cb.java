package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۶k;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.k.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        float t2 = t / (d2 / 2.0f);
        if (t2 < 1.0f) {
            return Float.valueOf(((c2 / 2.0f) * t2 * t2) + b2);
        }
        float t3 = t2 - 1.0f;
        return Float.valueOf((((-c2) / 2.0f) * ((t3 * (t3 - 2.0f)) - 1.0f)) + b2);
    }
}
