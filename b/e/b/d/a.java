package b.e.b.d;

public class a extends b.e.b.a {

    /* renamed from: c  reason: collision with root package name */
    private float f۲۴۸۴c;

    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = t / d2;
        float f2 = this.f۲۴۸۴c;
        return Float.valueOf((t2 * c2 * t2 * (((1.0f + f2) * t2) - f2)) + b2);
    }
}
