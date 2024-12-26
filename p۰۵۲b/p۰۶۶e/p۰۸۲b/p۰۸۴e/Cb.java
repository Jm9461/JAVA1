package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۴e;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.e.b  reason: invalid class name */
public class Cb extends AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    private Cc f۱۲۸۱۳c;

    /* renamed from: d  reason: contains not printable characters */
    private Ca f۱۲۸۱۴d;

    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۱۹a(float t, float b, float c, float d) {
        if (t < d / 2.0f) {
            return Float.valueOf((this.f۱۲۸۱۴d.m۱۶۱۱۸a(2.0f * t, 0.0f, c, d).floatValue() * 0.5f) + b);
        }
        return Float.valueOf((this.f۱۲۸۱۳c.m۱۶۱۲۰a((2.0f * t) - d, 0.0f, c, d).floatValue() * 0.5f) + (0.5f * c) + b);
    }
}
