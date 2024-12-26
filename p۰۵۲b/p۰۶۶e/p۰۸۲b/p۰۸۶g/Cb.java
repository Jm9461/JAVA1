package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۶g;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.g.b  reason: invalid class name */
public class Cb extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۲۵a(float t, float b, float c, float d) {
        float t2 = t / (d / 2.0f);
        if (t2 < 1.0f) {
            return Float.valueOf(((c / 2.0f) * t2 * t2 * t2) + b);
        }
        float t3 = t2 - 2.0f;
        return Float.valueOf(((c / 2.0f) * ((t3 * t3 * t3) + 2.0f)) + b);
    }
}
