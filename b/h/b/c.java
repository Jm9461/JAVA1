package b.h.b;

public abstract class c<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final String f۲۵۷۴a;

    public abstract V a(T t);

    public c(Class<V> cls, String name) {
        this.f۲۵۷۴a = name;
    }

    public void a(T t, V v) {
        throw new UnsupportedOperationException("Property " + a() + " is read-only");
    }

    public String a() {
        return this.f۲۵۷۴a;
    }
}
