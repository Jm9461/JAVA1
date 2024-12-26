package b.e.b.h;

public class a extends b.e.b.a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        if (t == 0.0f) {
            return Float.valueOf(b2);
        }
        float t2 = t / d2;
        if (t2 == 1.0f) {
            return Float.valueOf(b2 + c2);
        }
        float p = 0.3f * d2;
        float t3 = t2 - 1.0f;
        return Float.valueOf((-(((float) Math.pow(2.0d, (double) (t3 * 10.0f))) * c2 * ((float) Math.sin((double) ((((t3 * d2) - (p / 4.0f)) * 6.2831855f) / p))))) + b2);
    }
}
