package a.b.g.g;

public class l<T> extends k<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f۴۱۱c = new Object();

    public l(int maxPoolSize) {
        super(maxPoolSize);
    }

    @Override // a.b.g.g.k, a.b.g.g.j
    public T a() {
        T t;
        synchronized (this.f۴۱۱c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // a.b.g.g.k, a.b.g.g.j
    public boolean a(T element) {
        boolean a2;
        synchronized (this.f۴۱۱c) {
            a2 = super.a(element);
        }
        return a2;
    }
}
