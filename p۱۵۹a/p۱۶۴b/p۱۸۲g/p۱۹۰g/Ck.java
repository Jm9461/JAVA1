package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

/* renamed from: a.b.g.g.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck<T> implements InterfaceCj<T> {

    /* renamed from: a, reason: contains not printable characters */
    private final Object[] f۸۷۷۷a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۸۷۷۸b;

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.k != android.support.v4.util.Pools$SimplePool<T> */
    public Ck(int maxPoolSize) {
        if (maxPoolSize <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f۸۷۷۷a = new Object[maxPoolSize];
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.k != android.support.v4.util.Pools$SimplePool<T> */
    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public T mo۸۵۶۹a() {
        int i = this.f۸۷۷۸b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f۸۷۷۷a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f۸۷۷۸b = i - 1;
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.k != android.support.v4.util.Pools$SimplePool<T> */
    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۸۵۷۰a(T instance) {
        if (m۸۵۶۶b(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f۸۷۷۸b;
        Object[] objArr = this.f۸۷۷۷a;
        if (i < objArr.length) {
            objArr[i] = instance;
            this.f۸۷۷۸b = i + 1;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.k != android.support.v4.util.Pools$SimplePool<T> */
    /* renamed from: b, reason: contains not printable characters */
    private boolean m۸۵۶۶b(T instance) {
        for (int i = 0; i < this.f۸۷۷۸b; i++) {
            if (this.f۸۷۷۷a[i] == instance) {
                return true;
            }
        }
        return false;
    }
}
