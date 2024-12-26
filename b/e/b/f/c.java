package b.e.b.f;

import b.e.b.a;

public class c extends a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = (t / d2) - 1.0f;
        return Float.valueOf((((float) Math.sqrt((double) (1.0f - (t2 * t2)))) * c2) + b2);
    }
}
