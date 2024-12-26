package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

/* renamed from: a.b.g.g.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co<E> implements Cloneable {

    /* renamed from: g, reason: contains not printable characters */
    private static final Object f۸۷۸۷g = new Object();

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۸۷۸۸c;

    /* renamed from: d, reason: contains not printable characters */
    private int[] f۸۷۸۹d;

    /* renamed from: e, reason: contains not printable characters */
    private Object[] f۸۷۹۰e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۸۷۹۱f;

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    public Co() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    public Co(int initialCapacity) {
        this.f۸۷۸۸c = false;
        if (initialCapacity == 0) {
            this.f۸۷۸۹d = Cc.f۸۷۴۴a;
            this.f۸۷۹۰e = Cc.f۸۷۴۶c;
        } else {
            int initialCapacity2 = Cc.m۸۵۱۹b(initialCapacity);
            this.f۸۷۸۹d = new int[initialCapacity2];
            this.f۸۷۹۰e = new Object[initialCapacity2];
        }
        this.f۸۷۹۱f = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Co<E> m۸۵۹۹clone() {
        try {
            Co<E> co = (Co) super.clone();
            co.f۸۷۸۹d = (int[]) this.f۸۷۸۹d.clone();
            co.f۸۷۹۰e = (Object[]) this.f۸۷۹۰e.clone();
            return co;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: b, reason: contains not printable characters */
    public E m۸۵۹۲b(int key) {
        return m۸۵۹۳b(key, null);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: b, reason: contains not printable characters */
    public E m۸۵۹۳b(int i, E e2) {
        int i2 = Cc.m۸۵۱۶a(this.f۸۷۸۹d, this.f۸۷۹۱f, i);
        if (i2 >= 0) {
            Object[] objArr = this.f۸۷۹۰e;
            if (objArr[i2] != f۸۷۸۷g) {
                return (E) objArr[i2];
            }
        }
        return e2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۸۹a(int key) {
        int i = Cc.m۸۵۱۶a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
        if (i >= 0) {
            Object[] objArr = this.f۸۷۹۰e;
            Object obj = objArr[i];
            Object obj2 = f۸۷۸۷g;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.f۸۷۸۸c = true;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: e, reason: contains not printable characters */
    public void m۸۵۹۷e(int key) {
        m۸۵۸۹a(key);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: c, reason: contains not printable characters */
    private void m۸۵۸۷c() {
        int n = this.f۸۷۹۱f;
        int o = 0;
        int[] keys = this.f۸۷۸۹d;
        Object[] values = this.f۸۷۹۰e;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f۸۷۸۷g) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f۸۷۸۸c = false;
        this.f۸۷۹۱f = o;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: c, reason: contains not printable characters */
    public void m۸۵۹۵c(int key, E value) {
        int i = Cc.m۸۵۱۶a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
        if (i >= 0) {
            this.f۸۷۹۰e[i] = value;
            return;
        }
        int i2 = i ^ (-1);
        if (i2 < this.f۸۷۹۱f) {
            Object[] objArr = this.f۸۷۹۰e;
            if (objArr[i2] == f۸۷۸۷g) {
                this.f۸۷۸۹d[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f۸۷۸۸c && this.f۸۷۹۱f >= this.f۸۷۸۹d.length) {
            m۸۵۸۷c();
            i2 = Cc.m۸۵۱۶a(this.f۸۷۸۹d, this.f۸۷۹۱f, key) ^ (-1);
        }
        int i3 = this.f۸۷۹۱f;
        if (i3 >= this.f۸۷۸۹d.length) {
            int n = Cc.m۸۵۱۹b(i3 + 1);
            int[] nkeys = new int[n];
            Object[] nvalues = new Object[n];
            int[] iArr = this.f۸۷۸۹d;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.f۸۷۹۰e;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f۸۷۸۹d = nkeys;
            this.f۸۷۹۰e = nvalues;
        }
        int n2 = this.f۸۷۹۱f;
        if (n2 - i2 != 0) {
            int[] iArr2 = this.f۸۷۸۹d;
            System.arraycopy(iArr2, i2, iArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f۸۷۹۰e;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f۸۷۹۱f - i2);
        }
        this.f۸۷۸۹d[i2] = key;
        this.f۸۷۹۰e[i2] = value;
        this.f۸۷۹۱f++;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: b, reason: contains not printable characters */
    public int m۸۵۹۱b() {
        if (this.f۸۷۸۸c) {
            m۸۵۸۷c();
        }
        return this.f۸۷۹۱f;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: d, reason: contains not printable characters */
    public int m۸۵۹۶d(int index) {
        if (this.f۸۷۸۸c) {
            m۸۵۸۷c();
        }
        return this.f۸۷۸۹d[index];
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: f, reason: contains not printable characters */
    public E m۸۵۹۸f(int i) {
        if (this.f۸۷۸۸c) {
            m۸۵۸۷c();
        }
        return (E) this.f۸۷۹۰e[i];
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: c, reason: contains not printable characters */
    public int m۸۵۹۴c(int key) {
        if (this.f۸۷۸۸c) {
            m۸۵۸۷c();
        }
        return Cc.m۸۵۱۶a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۸۸a() {
        int n = this.f۸۷۹۱f;
        Object[] values = this.f۸۷۹۰e;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f۸۷۹۱f = 0;
        this.f۸۷۸۸c = false;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۹۰a(int key, E value) {
        int i = this.f۸۷۹۱f;
        if (i != 0 && key <= this.f۸۷۸۹d[i - 1]) {
            m۸۵۹۵c(key, value);
            return;
        }
        if (this.f۸۷۸۸c && this.f۸۷۹۱f >= this.f۸۷۸۹d.length) {
            m۸۵۸۷c();
        }
        int pos = this.f۸۷۹۱f;
        if (pos >= this.f۸۷۸۹d.length) {
            int n = Cc.m۸۵۱۹b(pos + 1);
            int[] nkeys = new int[n];
            Object[] nvalues = new Object[n];
            int[] iArr = this.f۸۷۸۹d;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr = this.f۸۷۹۰e;
            System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
            this.f۸۷۸۹d = nkeys;
            this.f۸۷۹۰e = nvalues;
        }
        this.f۸۷۸۹d[pos] = key;
        this.f۸۷۹۰e[pos] = value;
        this.f۸۷۹۱f = pos + 1;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<E> */
    public String toString() {
        if (m۸۵۹۱b() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۸۷۹۱f * 28);
        buffer.append('{');
        for (int i = 0; i < this.f۸۷۹۱f; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            int key = m۸۵۹۶d(i);
            buffer.append(key);
            buffer.append('=');
            Object value = m۸۵۹۸f(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
