package b.e.b.g;

import b.e.b.a;

public class c extends a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = (t / d2) - 1.0f;
        return Float.valueOf((((t2 * t2 * t2) + 1.0f) * c2) + b2);
    }
}
