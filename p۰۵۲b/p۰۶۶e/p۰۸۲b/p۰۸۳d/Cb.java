package p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۳d;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;

/* renamed from: b.e.b.d.b  reason: invalid class name */
public class Cb extends AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    private float f۱۲۸۱۰c;

    @Override // p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Float m۱۶۱۱۶a(float t, float b, float c, float d) {
        float t2 = t / (d / 2.0f);
        if (t2 < 1.0f) {
            double d2 = (double) this.f۱۲۸۱۰c;
            Double.isNaN(d2);
            float f = (float) (d2 * 1.525d);
            this.f۱۲۸۱۰c = f;
            return Float.valueOf(((c / 2.0f) * t2 * t2 * (((f + 1.0f) * t2) - this.f۱۲۸۱۰c)) + b);
        }
        float t3 = t2 - 2.0f;
        double d3 = (double) this.f۱۲۸۱۰c;
        Double.isNaN(d3);
        float f2 = (float) (d3 * 1.525d);
        this.f۱۲۸۱۰c = f2;
        return Float.valueOf(((c / 2.0f) * ((t3 * t3 * (((f2 + 1.0f) * t3) + this.f۱۲۸۱۰c)) + 2.0f)) + b);
    }
}
