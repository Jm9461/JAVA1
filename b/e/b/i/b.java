package b.e.b.i;

import b.e.b.a;

public class b extends a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        if (t == 0.0f) {
            return Float.valueOf(b2);
        }
        if (t == d2) {
            return Float.valueOf(b2 + c2);
        }
        float t2 = t / (d2 / 2.0f);
        if (t2 < 1.0f) {
            return Float.valueOf(((c2 / 2.0f) * ((float) Math.pow(2.0d, (double) ((t2 - 1.0f) * 10.0f)))) + b2);
        }
        return Float.valueOf(((c2 / 2.0f) * ((-((float) Math.pow(2.0d, (double) ((t2 - 1.0f) * -10.0f)))) + 2.0f)) + b2);
    }
}
