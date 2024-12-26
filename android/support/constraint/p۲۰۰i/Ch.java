package android.support.constraint.p۲۰۰i;

/* renamed from: android.support.constraint.i.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ch<T> implements InterfaceCg<T> {

    /* renamed from: a, reason: contains not printable characters */
    private final Object[] f۹۲۶۵a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۹۲۶۶b;

    /* JADX WARN: Generic types in debug info not equals: android.support.constraint.i.h != android.support.constraint.solver.Pools$SimplePool<T> */
    Ch(int maxPoolSize) {
        if (maxPoolSize <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f۹۲۶۵a = new Object[maxPoolSize];
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.constraint.i.h != android.support.constraint.solver.Pools$SimplePool<T> */
    @Override // android.support.constraint.p۲۰۰i.InterfaceCg
    /* renamed from: a, reason: contains not printable characters */
    public T mo۸۹۹۰a() {
        int i = this.f۹۲۶۶b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f۹۲۶۵a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f۹۲۶۶b = i - 1;
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.constraint.i.h != android.support.constraint.solver.Pools$SimplePool<T> */
    @Override // android.support.constraint.p۲۰۰i.InterfaceCg
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۸۹۹۲a(T instance) {
        int i = this.f۹۲۶۶b;
        Object[] objArr = this.f۹۲۶۵a;
        if (i < objArr.length) {
            objArr[i] = instance;
            this.f۹۲۶۶b = i + 1;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.constraint.i.h != android.support.constraint.solver.Pools$SimplePool<T> */
    @Override // android.support.constraint.p۲۰۰i.InterfaceCg
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۹۹۱a(T[] variables, int count) {
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
