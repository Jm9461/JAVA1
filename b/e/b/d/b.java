package b.e.b.d;

import b.e.b.a;

public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private float f۲۴۸۵c;

    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = t / (d2 / 2.0f);
        if (t2 < 1.0f) {
            double d3 = (double) this.f۲۴۸۵c;
            Double.isNaN(d3);
            float f2 = (float) (d3 * 1.525d);
            this.f۲۴۸۵c = f2;
            return Float.valueOf(((c2 / 2.0f) * t2 * t2 * (((f2 + 1.0f) * t2) - this.f۲۴۸۵c)) + b2);
        }
        float t3 = t2 - 2.0f;
        double d4 = (double) this.f۲۴۸۵c;
        Double.isNaN(d4);
        float f3 = (float) (d4 * 1.525d);
        this.f۲۴۸۵c = f3;
        return Float.valueOf(((c2 / 2.0f) * ((t3 * t3 * (((f3 + 1.0f) * t3) + this.f۲۴۸۵c)) + 2.0f)) + b2);
    }
}
