package b.e.b.k;

import b.e.b.a;

public class b extends a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = t / (d2 / 2.0f);
        if (t2 < 1.0f) {
            return Float.valueOf(((c2 / 2.0f) * t2 * t2) + b2);
        }
        float t3 = t2 - 1.0f;
        return Float.valueOf((((-c2) / 2.0f) * ((t3 * (t3 - 2.0f)) - 1.0f)) + b2);
    }
}
