package p۰۵۲b.p۱۰۳h.p۱۰۴a;

/* renamed from: b.h.a.d  reason: invalid class name */
public class Cd implements AbstractCl<Number> {
    /* renamed from: a  reason: contains not printable characters */
    public Float evaluate(float fraction, Number startValue, Number endValue) {
        float startFloat = startValue.floatValue();
        return Float.valueOf(((endValue.floatValue() - startFloat) * fraction) + startFloat);
    }
}
