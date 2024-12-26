package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۸i;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.i.b  reason: invalid class name */
public class Cb extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۳۰a(float t, float b, float c, float d) {
        if (t == 0.0f) {
            return Float.valueOf(b);
        }
        if (t == d) {
            return Float.valueOf(b + c);
        }
        float t2 = t / (d / 2.0f);
        if (t2 < 1.0f) {
            return Float.valueOf(((c / 2.0f) * ((float) Math.pow(2.0d, (double) ((t2 - 1.0f) * 10.0f)))) + b);
        }
        return Float.valueOf(((c / 2.0f) * ((-((float) Math.pow(2.0d, (double) ((t2 - 1.0f) * -10.0f)))) + 2.0f)) + b);
    }
}
