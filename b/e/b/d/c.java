package b.e.b.d;

import b.e.b.a;

public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private float f۲۴۸۶c;

    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = (t / d2) - 1.0f;
        float f2 = this.f۲۴۸۶c;
        return Float.valueOf((((t2 * t2 * (((f2 + 1.0f) * t2) + f2)) + 1.0f) * c2) + b2);
    }
}
