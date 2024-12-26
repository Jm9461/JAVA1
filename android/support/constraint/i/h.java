package android.support.constraint.i;

/* access modifiers changed from: package-private */
public class h<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f۶۳۶a;

    /* renamed from: b  reason: collision with root package name */
    private int f۶۳۷b;

    h(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f۶۳۶a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // android.support.constraint.i.g
    public T a() {
        int i = this.f۶۳۷b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f۶۳۶a;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f۶۳۷b = i - 1;
        return instance;
    }

    @Override // android.support.constraint.i.g
    public boolean a(T instance) {
        int i = this.f۶۳۷b;
        Object[] objArr = this.f۶۳۶a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.f۶۳۷b = i + 1;
        return true;
    }

    @Override // android.support.constraint.i.g
    public void a(T[] variables, int count) {
        if (count > variables.length) {
            count = variables.length;
        }
        for (int i = 0; i < count; i++) {
            T instance = variables[i];
            int i2 = this.f۶۳۷b;
            Object[] objArr = this.f۶۳۶a;
            if (i2 < objArr.length) {
                objArr[i2] = instance;
                this.f۶۳۷b = i2 + 1;
            }
        }
    }
}
