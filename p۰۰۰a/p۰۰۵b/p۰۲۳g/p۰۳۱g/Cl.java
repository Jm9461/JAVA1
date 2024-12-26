package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

/* renamed from: a.b.g.g.l  reason: invalid class name */
public class Cl<T> extends Ck<T> {

    /* renamed from: c  reason: contains not printable characters */
    private final Object f۸۷۷۹c = new Object();

    public Cl(int maxPoolSize) {
        super(maxPoolSize);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ck, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public T m۱۰۶۳۹a() {
        T t;
        synchronized (this.f۸۷۷۹c) {
            t = (T) super.m۱۰۶۳۷a();
        }
        return t;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ck, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۶۴۰a(T element) {
        boolean a;
        synchronized (this.f۸۷۷۹c) {
            a = super.m۱۰۶۳۸a(element);
        }
        return a;
    }
}
