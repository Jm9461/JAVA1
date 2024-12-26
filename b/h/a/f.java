package b.h.a;

public class f implements l<Integer> {
    /* renamed from: a */
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue.intValue();
        return Integer.valueOf((int) (((float) startInt) + (((float) (endValue.intValue() - startInt)) * fraction)));
    }
}
