package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۵f;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.f.b  reason: invalid class name */
public class Cb extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۲۲a(float t, float b, float c, float d) {
        float t2 = t / (d / 2.0f);
        if (t2 < 1.0f) {
            return Float.valueOf((((-c) / 2.0f) * (((float) Math.sqrt((double) (1.0f - (t2 * t2)))) - 1.0f)) + b);
        }
        float t3 = t2 - 2.0f;
        return Float.valueOf(((c / 2.0f) * (((float) Math.sqrt((double) (1.0f - (t3 * t3)))) + 1.0f)) + b);
    }
}
