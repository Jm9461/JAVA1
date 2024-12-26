package p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۴i;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;

/* renamed from: b.e.b.i.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Float mo۱۴۰۷۰a(float t, float b2, float c2, float d2) {
        if (t == 0.0f) {
            return Float.valueOf(b2);
        }
        if (t == d2) {
            return Float.valueOf(b2 + c2);
        }
        return t / (d2 / 2.0f) < 1.0f ? Float.valueOf(((c2 / 2.0f) * ((float) Math.pow(2.0d, (r1 - 1.0f) * 10.0f))) + b2) : Float.valueOf(((c2 / 2.0f) * ((-((float) Math.pow(2.0d, (r1 - 1.0f) * (-10.0f)))) + 2.0f)) + b2);
    }
}
