package p۲۰۸b.p۲۵۹h.p۲۶۰a;

/* renamed from: b.h.a.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf implements InterfaceCl<Integer> {
    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.InterfaceCl
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue.intValue();
        return Integer.valueOf((int) (startInt + ((endValue.intValue() - startInt) * fraction)));
    }
}
