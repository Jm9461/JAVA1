package android.support.constraint.p۰۴۱i;

/* access modifiers changed from: package-private */
/* renamed from: android.support.constraint.i.h  reason: invalid class name */
public class Ch<T> implements AbstractCg<T> {

    /* renamed from: a  reason: contains not printable characters */
    private final Object[] f۹۲۶۵a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۹۲۶۶b;

    Ch(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f۹۲۶۵a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // android.support.constraint.p۰۴۱i.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public T m۱۱۰۵۸a() {
        int i = this.f۹۲۶۶b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f۹۲۶۵a;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f۹۲۶۶b = i - 1;
        return instance;
    }

    @Override // android.support.constraint.p۰۴۱i.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۰۶۰a(T instance) {
        int i = this.f۹۲۶۶b;
        Object[] objArr = this.f۹۲۶۵a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.f۹۲۶۶b = i + 1;
        return true;
    }

    @Override // android.support.constraint.p۰۴۱i.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۵۹a(T[] variables, int count) {
        if (count > variables.length) {
            count = variables.length;
        }
        for (int i = 0; i < count; i++) {
            T instance = variables[i];
            int i2 = this.f۹۲۶۶b;
            Object[] objArr = this.f۹۲۶۵a;
            if (i2 < objArr.length) {
                objArr[i2] = instance;
                this.f۹۲۶۶b = i2 + 1;
            }
        }
    }
}
