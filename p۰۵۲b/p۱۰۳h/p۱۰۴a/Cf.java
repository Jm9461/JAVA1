package p۰۵۲b.p۱۰۳h.p۱۰۴a;

/* renamed from: b.h.a.f  reason: invalid class name */
public class Cf implements AbstractCl<Integer> {
    /* renamed from: a  reason: contains not printable characters */
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue.intValue();
        return Integer.valueOf((int) (((float) startInt) + (((float) (endValue.intValue() - startInt)) * fraction)));
    }
}
