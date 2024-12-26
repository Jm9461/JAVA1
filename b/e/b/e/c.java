package b.e.b.e;

import b.e.b.a;

public class c extends a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        float t2 = t / d2;
        if (t2 < 0.36363637f) {
            return Float.valueOf((7.5625f * t2 * t2 * c2) + b2);
        }
        if (t2 < 0.72727275f) {
            float t3 = t2 - 0.54545456f;
            return Float.valueOf((((t3 * 7.5625f * t3) + 0.75f) * c2) + b2);
        } else if (((double) t2) < 0.9090909090909091d) {
            float t4 = t2 - 0.8181818f;
            return Float.valueOf((((t4 * 7.5625f * t4) + 0.9375f) * c2) + b2);
        } else {
            float t5 = t2 - 0.95454544f;
            return Float.valueOf((((t5 * 7.5625f * t5) + 0.984375f) * c2) + b2);
        }
    }
}
