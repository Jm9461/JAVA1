package a.b.g.g;

import android.support.v4.util.SparseArrayCompat;

public class o<E> implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f۴۱۸g = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f۴۱۹c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f۴۲۰d;

    /* renamed from: e  reason: collision with root package name */
    private Object[] f۴۲۱e;

    /* renamed from: f  reason: collision with root package name */
    private int f۴۲۲f;

    public o() {
        this(10);
    }

    public o(int initialCapacity) {
        this.f۴۱۹c = false;
        if (initialCapacity == 0) {
            this.f۴۲۰d = c.f۳۷۶a;
            this.f۴۲۱e = c.f۳۷۸c;
        } else {
            int initialCapacity2 = c.b(initialCapacity);
            this.f۴۲۰d = new int[initialCapacity2];
            this.f۴۲۱e = new Object[initialCapacity2];
        }
        this.f۴۲۲f = 0;
    }

    @Override // java.lang.Object
    public o<E> clone() {
        try {
            SparseArrayCompat<E> clone = (o) super.clone();
            clone.f۴۲۰d = (int[]) this.f۴۲۰d.clone();
            clone.f۴۲۱e = (Object[]) this.f۴۲۱e.clone();
            return clone;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E b(int key) {
        return b(key, null);
    }

    public E b(int key, E valueIfKeyNotFound) {
        int i = c.a(this.f۴۲۰d, this.f۴۲۲f, key);
        if (i >= 0) {
            Object[] objArr = this.f۴۲۱e;
            if (objArr[i] != f۴۱۸g) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    public void a(int key) {
        Object[] objArr;
        Object obj;
        int i = c.a(this.f۴۲۰d, this.f۴۲۲f, key);
        if (i >= 0 && (objArr = this.f۴۲۱e)[i] != (obj = f۴۱۸g)) {
            objArr[i] = obj;
            this.f۴۱۹c = true;
        }
    }

    public void e(int key) {
        a(key);
    }

    private void c() {
        int n = this.f۴۲۲f;
        int o = 0;
        int[] keys = this.f۴۲۰d;
        Object[] values = this.f۴۲۱e;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f۴۱۸g) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f۴۱۹c = false;
        this.f۴۲۲f = o;
    }

    public void c(int key, E value) {
        int i = c.a(this.f۴۲۰d, this.f۴۲۲f, key);
        if (i >= 0) {
            this.f۴۲۱e[i] = value;
            return;
        }
        int i2 = i ^ -1;
        if (i2 < this.f۴۲۲f) {
            Object[] objArr = this.f۴۲۱e;
            if (objArr[i2] == f۴۱۸g) {
                this.f۴۲۰d[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f۴۱۹c && this.f۴۲۲f >= this.f۴۲۰d.length) {
            c();
            i2 = c.a(this.f۴۲۰d, this.f۴۲۲f, key) ^ -1;
        }
        int i3 = this.f۴۲۲f;
        if (i3 >= this.f۴۲۰d.length) {
            int n = c.b(i3 + 1);
            int[] nkeys = new int[n];
            Object[] nvalues = new Object[n];
            int[] iArr = this.f۴۲۰d;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.f۴۲۱e;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f۴۲۰d = nkeys;
            this.f۴۲۱e = nvalues;
        }
        int n2 = this.f۴۲۲f;
        if (n2 - i2 != 0) {
            int[] iArr2 = this.f۴۲۰d;
            System.arraycopy(iArr2, i2, iArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f۴۲۱e;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f۴۲۲f - i2);
        }
        this.f۴۲۰d[i2] = key;
        this.f۴۲۱e[i2] = value;
        this.f۴۲۲f++;
    }

    public int b() {
        if (this.f۴۱۹c) {
            c();
        }
        return this.f۴۲۲f;
    }

    public int d(int index) {
        if (this.f۴۱۹c) {
            c();
        }
        return this.f۴۲۰d[index];
    }

    public E f(int index) {
        if (this.f۴۱۹c) {
            c();
        }
        return (E) this.f۴۲۱e[index];
    }

    public int c(int key) {
        if (this.f۴۱۹c) {
            c();
        }
        return c.a(this.f۴۲۰d, this.f۴۲۲f, key);
    }

    public void a() {
        int n = this.f۴۲۲f;
        Object[] values = this.f۴۲۱e;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f۴۲۲f = 0;
        this.f۴۱۹c = false;
    }

    public void a(int key, E value) {
        int i = this.f۴۲۲f;
        if (i == 0 || key > this.f۴۲۰d[i - 1]) {
            if (this.f۴۱۹c && this.f۴۲۲f >= this.f۴۲۰d.length) {
                c();
            }
            int pos = this.f۴۲۲f;
            if (pos >= this.f۴۲۰d.length) {
                int n = c.b(pos + 1);
                int[] nkeys = new int[n];
                Object[] nvalues = new Object[n];
                int[] iArr = this.f۴۲۰d;
                System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
                Object[] objArr = this.f۴۲۱e;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f۴۲۰d = nkeys;
                this.f۴۲۱e = nvalues;
            }
            this.f۴۲۰d[pos] = key;
            this.f۴۲۱e[pos] = value;
            this.f۴۲۲f = pos + 1;
            return;
        }
        c(key, value);
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۴۲۲f * 28);
        buffer.append('{');
        for (int i = 0; i < this.f۴۲۲f; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(d(i));
            buffer.append('=');
            Object value = f(i);
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
