package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۳۹d;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.d.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCa {

    /* renamed from: c, reason: contains not printable characters */
    private float f۱۲۸۱۰c;

    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        float t2 = t / (d2 / 2.0f);
        if (t2 < 1.0f) {
            double d3 = this.f۱۲۸۱۰c;
            Double.isNaN(d3);
            float f2 = (float) (d3 * 1.525d);
            this.f۱۲۸۱۰c = f2;
            return Float.valueOf(((c2 / 2.0f) * t2 * t2 * (((f2 + 1.0f) * t2) - this.f۱۲۸۱۰c)) + b2);
        }
        float t3 = t2 - 2.0f;
        double d4 = this.f۱۲۸۱۰c;
        Double.isNaN(d4);
        float f3 = (float) (d4 * 1.525d);
        this.f۱۲۸۱۰c = f3;
        return Float.valueOf(((c2 / 2.0f) * ((t3 * t3 * (((f3 + 1.0f) * t3) + this.f۱۲۸۱۰c)) + 2.0f)) + b2);
    }
}
