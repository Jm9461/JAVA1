package a.b.g.g;

import android.support.v4.util.LongSparseArray;

public class f<E> implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f۳۸۱g = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f۳۸۲c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f۳۸۳d;

    /* renamed from: e  reason: collision with root package name */
    private Object[] f۳۸۴e;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۸۵f;

    public f() {
        this(10);
    }

    public f(int initialCapacity) {
        this.f۳۸۲c = false;
        if (initialCapacity == 0) {
            this.f۳۸۳d = c.f۳۷۷b;
            this.f۳۸۴e = c.f۳۷۸c;
        } else {
            int initialCapacity2 = c.c(initialCapacity);
            this.f۳۸۳d = new long[initialCapacity2];
            this.f۳۸۴e = new Object[initialCapacity2];
        }
        this.f۳۸۵f = 0;
    }

    @Override // java.lang.Object
    public f<E> clone() {
        try {
            LongSparseArray<E> clone = (f) super.clone();
            clone.f۳۸۳d = (long[]) this.f۳۸۳d.clone();
            clone.f۳۸۴e = (Object[]) this.f۳۸۴e.clone();
            return clone;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E b(long key) {
        return b(key, null);
    }

    public E b(long key, E valueIfKeyNotFound) {
        int i = c.a(this.f۳۸۳d, this.f۳۸۵f, key);
        if (i >= 0) {
            Object[] objArr = this.f۳۸۴e;
            if (objArr[i] != f۳۸۱g) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    public void a(long key) {
        Object[] objArr;
        Object obj;
        int i = c.a(this.f۳۸۳d, this.f۳۸۵f, key);
        if (i >= 0 && (objArr = this.f۳۸۴e)[i] != (obj = f۳۸۱g)) {
            objArr[i] = obj;
            this.f۳۸۲c = true;
        }
    }

    public void b(int index) {
        Object[] objArr = this.f۳۸۴e;
        Object obj = objArr[index];
        Object obj2 = f۳۸۱g;
        if (obj != obj2) {
            objArr[index] = obj2;
            this.f۳۸۲c = true;
        }
    }

    private void c() {
        int n = this.f۳۸۵f;
        int o = 0;
        long[] keys = this.f۳۸۳d;
        Object[] values = this.f۳۸۴e;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f۳۸۱g) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f۳۸۲c = false;
        this.f۳۸۵f = o;
    }

    public void c(long key, E value) {
        int i = c.a(this.f۳۸۳d, this.f۳۸۵f, key);
        if (i >= 0) {
            this.f۳۸۴e[i] = value;
            return;
        }
        int i2 = i ^ -1;
        if (i2 < this.f۳۸۵f) {
            Object[] objArr = this.f۳۸۴e;
            if (objArr[i2] == f۳۸۱g) {
                this.f۳۸۳d[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f۳۸۲c && this.f۳۸۵f >= this.f۳۸۳d.length) {
            c();
            i2 = c.a(this.f۳۸۳d, this.f۳۸۵f, key) ^ -1;
        }
        int i3 = this.f۳۸۵f;
        if (i3 >= this.f۳۸۳d.length) {
            int n = c.c(i3 + 1);
            long[] nkeys = new long[n];
            Object[] nvalues = new Object[n];
            long[] jArr = this.f۳۸۳d;
            System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
            Object[] objArr2 = this.f۳۸۴e;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f۳۸۳d = nkeys;
            this.f۳۸۴e = nvalues;
        }
        int n2 = this.f۳۸۵f;
        if (n2 - i2 != 0) {
            long[] jArr2 = this.f۳۸۳d;
            System.arraycopy(jArr2, i2, jArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f۳۸۴e;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f۳۸۵f - i2);
        }
        this.f۳۸۳d[i2] = key;
        this.f۳۸۴e[i2] = value;
        this.f۳۸۵f++;
    }

    public int b() {
        if (this.f۳۸۲c) {
            c();
        }
        return this.f۳۸۵f;
    }

    public long a(int index) {
        if (this.f۳۸۲c) {
            c();
        }
        return this.f۳۸۳d[index];
    }

    public E c(int index) {
        if (this.f۳۸۲c) {
            c();
        }
        return (E) this.f۳۸۴e[index];
    }

    public int c(long key) {
        if (this.f۳۸۲c) {
            c();
        }
        return c.a(this.f۳۸۳d, this.f۳۸۵f, key);
    }

    public void a() {
        int n = this.f۳۸۵f;
        Object[] values = this.f۳۸۴e;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f۳۸۵f = 0;
        this.f۳۸۲c = false;
    }

    public void a(long key, E value) {
        int i = this.f۳۸۵f;
        if (i == 0 || key > this.f۳۸۳d[i - 1]) {
            if (this.f۳۸۲c && this.f۳۸۵f >= this.f۳۸۳d.length) {
                c();
            }
            int pos = this.f۳۸۵f;
            if (pos >= this.f۳۸۳d.length) {
                int n = c.c(pos + 1);
                long[] nkeys = new long[n];
                Object[] nvalues = new Object[n];
                long[] jArr = this.f۳۸۳d;
                System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
                Object[] objArr = this.f۳۸۴e;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f۳۸۳d = nkeys;
                this.f۳۸۴e = nvalues;
            }
            this.f۳۸۳d[pos] = key;
            this.f۳۸۴e[pos] = value;
            this.f۳۸۵f = pos + 1;
            return;
        }
        c(key, value);
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۳۸۵f * 28);
        buffer.append('{');
        for (int i = 0; i < this.f۳۸۵f; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(a(i));
            buffer.append('=');
            Object value = c(i);
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
