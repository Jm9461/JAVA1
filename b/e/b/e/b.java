package b.e.b.e;

import b.e.b.a;

public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private c f۲۴۸۸c;

    /* renamed from: d  reason: collision with root package name */
    private a f۲۴۸۹d;

    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        if (t < d2 / 2.0f) {
            return Float.valueOf((this.f۲۴۸۹d.a(2.0f * t, 0.0f, c2, d2).floatValue() * 0.5f) + b2);
        }
        return Float.valueOf((this.f۲۴۸۸c.a((2.0f * t) - d2, 0.0f, c2, d2).floatValue() * 0.5f) + (0.5f * c2) + b2);
    }
}
