package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۴e;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.e.c  reason: invalid class name */
public class Cc extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۲۰a(float t, float b, float c, float d) {
        float t2 = t / d;
        if (t2 < 0.36363637f) {
            return Float.valueOf((7.5625f * t2 * t2 * c) + b);
        }
        if (t2 < 0.72727275f) {
            float t3 = t2 - 0.54545456f;
            return Float.valueOf((((t3 * 7.5625f * t3) + 0.75f) * c) + b);
        } else if (((double) t2) < 0.9090909090909091d) {
            float t4 = t2 - 0.8181818f;
            return Float.valueOf((((t4 * 7.5625f * t4) + 0.9375f) * c) + b);
        } else {
            float t5 = t2 - 0.95454544f;
            return Float.valueOf((((t5 * 7.5625f * t5) + 0.984375f) * c) + b);
        }
    }
}
