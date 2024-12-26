package a.b.g.g;

public class k<T> implements j<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f۴۰۹a;

    /* renamed from: b  reason: collision with root package name */
    private int f۴۱۰b;

    public k(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f۴۰۹a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // a.b.g.g.j
    public T a() {
        int i = this.f۴۱۰b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f۴۰۹a;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f۴۱۰b = i - 1;
        return instance;
    }

    @Override // a.b.g.g.j
    public boolean a(T instance) {
        if (!b(instance)) {
            int i = this.f۴۱۰b;
            Object[] objArr = this.f۴۰۹a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = instance;
            this.f۴۱۰b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    private boolean b(T instance) {
        for (int i = 0; i < this.f۴۱۰b; i++) {
            if (this.f۴۰۹a[i] == instance) {
                return true;
            }
        }
        return false;
    }
}
