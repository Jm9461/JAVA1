package b.e.b.f;

public class a extends b.e.b.a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = t / d2;
        return Float.valueOf(((-c2) * (((float) Math.sqrt((double) (1.0f - (t2 * t2)))) - 1.0f)) + b2);
    }
}
