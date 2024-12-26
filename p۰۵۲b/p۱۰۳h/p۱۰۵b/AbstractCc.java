package p۰۵۲b.p۱۰۳h.p۱۰۵b;

/* renamed from: b.h.b.c  reason: invalid class name */
public abstract class AbstractCc<T, V> {

    /* renamed from: a  reason: contains not printable characters */
    private final String f۱۲۹۶۵a;

    /* renamed from: a  reason: contains not printable characters */
    public abstract V m۱۶۳۵۷a(T t);

    public AbstractCc(Class<V> cls, String name) {
        this.f۱۲۹۶۵a = name;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۵۹a(T t, V v) {
        throw new UnsupportedOperationException("Property " + m۱۶۳۵۸a() + " is read-only");
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۶۳۵۸a() {
        return this.f۱۲۹۶۵a;
    }
}
