package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۷h;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.h.b  reason: invalid class name */
public class Cb extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۲۸a(float t, float b, float c, float d) {
        if (t == 0.0f) {
            return Float.valueOf(b);
        }
        float t2 = t / d;
        if (t2 == 1.0f) {
            return Float.valueOf(b + c);
        }
        float p = 0.3f * d;
        return Float.valueOf((((float) Math.pow(2.0d, (double) (-10.0f * t2))) * c * ((float) Math.sin((double) ((((t2 * d) - (p / 4.0f)) * 6.2831855f) / p)))) + c + b);
    }
}
