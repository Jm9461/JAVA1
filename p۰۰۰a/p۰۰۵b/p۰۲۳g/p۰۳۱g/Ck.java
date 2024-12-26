package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

/* renamed from: a.b.g.g.k  reason: invalid class name */
public class Ck<T> implements AbstractCj<T> {

    /* renamed from: a  reason: contains not printable characters */
    private final Object[] f۸۷۷۷a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۸۷۷۸b;

    public Ck(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f۸۷۷۷a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public T m۱۰۶۳۷a() {
        int i = this.f۸۷۷۸b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f۸۷۷۷a;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f۸۷۷۸b = i - 1;
        return instance;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۶۳۸a(T instance) {
        if (!m۱۰۶۳۶b(instance)) {
            int i = this.f۸۷۷۸b;
            Object[] objArr = this.f۸۷۷۷a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = instance;
            this.f۸۷۷۸b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۰۶۳۶b(T instance) {
        for (int i = 0; i < this.f۸۷۷۸b; i++) {
            if (this.f۸۷۷۷a[i] == instance) {
                return true;
            }
        }
        return false;
    }
}
