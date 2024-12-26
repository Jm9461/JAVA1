package b.e.b.m;

import b.e.b.a;

public class c extends a {
    @Override // b.e.b.a
    public Float a(float t, float b2, float c2, float d2) {
        double d3 = (double) (t / d2);
        Double.isNaN(d3);
        return Float.valueOf((((float) Math.sin(d3 * 1.5707963267948966d)) * c2) + b2);
    }
}
