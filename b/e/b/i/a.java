package b.e.b.i;

public class a extends b.e.b.a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        return Float.valueOf(t == 0.0f ? b2 : (((float) Math.pow(2.0d, (double) (((t / d2) - 1.0f) * 10.0f))) * c2) + b2);
    }
}
