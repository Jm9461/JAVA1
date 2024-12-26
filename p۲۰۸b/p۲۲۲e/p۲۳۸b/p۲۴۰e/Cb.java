package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۰e;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.e.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCa {

    /* renamed from: c, reason: contains not printable characters */
    private Cc f۱۲۸۱۳c;

    /* renamed from: d, reason: contains not printable characters */
    private Ca f۱۲۸۱۴d;

    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        return t < d2 / 2.0f ? Float.valueOf((this.f۱۲۸۱۴d.mo۱۴۰۷۰a(2.0f * t, 0.0f, c2, d2).floatValue() * 0.5f) + b2) : Float.valueOf((this.f۱۲۸۱۳c.mo۱۴۰۷۰a((2.0f * t) - d2, 0.0f, c2, d2).floatValue() * 0.5f) + (0.5f * c2) + b2);
    }
}
