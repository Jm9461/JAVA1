package p۲۰۸b.p۲۵۹h.p۲۶۰a;

/* renamed from: b.h.a.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd implements InterfaceCl<Number> {
    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.InterfaceCl
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float evaluate(float fraction, Number startValue, Number endValue) {
        float startFloat = startValue.floatValue();
        return Float.valueOf(((endValue.floatValue() - startFloat) * fraction) + startFloat);
    }
}
