package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import android.support.v4.util.LongSparseArray;

/* renamed from: a.b.g.g.f  reason: invalid class name */
public class Cf<E> implements Cloneable {

    /* renamed from: g  reason: contains not printable characters */
    private static final Object f۸۷۴۹g = new Object();

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۸۷۵۰c;

    /* renamed from: d  reason: contains not printable characters */
    private long[] f۸۷۵۱d;

    /* renamed from: e  reason: contains not printable characters */
    private Object[] f۸۷۵۲e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۷۵۳f;

    public Cf() {
        this(10);
    }

    public Cf(int initialCapacity) {
        this.f۸۷۵۰c = false;
        if (initialCapacity == 0) {
            this.f۸۷۵۱d = Cc.f۸۷۴۵b;
            this.f۸۷۵۲e = Cc.f۸۷۴۶c;
        } else {
            int initialCapacity2 = Cc.m۱۰۵۹۱c(initialCapacity);
            this.f۸۷۵۱d = new long[initialCapacity2];
            this.f۸۷۵۲e = new Object[initialCapacity2];
        }
        this.f۸۷۵۳f = 0;
    }

    @Override // java.lang.Object
    public Cf<E> clone() {
        try {
            LongSparseArray<E> clone = (Cf) super.clone();
            clone.f۸۷۵۱d = (long[]) this.f۸۷۵۱d.clone();
            clone.f۸۷۵۲e = (Object[]) this.f۸۷۵۲e.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public E m۱۰۶۰۰b(long key) {
        return m۱۰۶۰۱b(key, null);
    }

    /* renamed from: b  reason: contains not printable characters */
    public E m۱۰۶۰۱b(long key, E valueIfKeyNotFound) {
        int i = Cc.m۱۰۵۸۸a(this.f۸۷۵۱d, this.f۸۷۵۳f, key);
        if (i >= 0) {
            Object[] objArr = this.f۸۷۵۲e;
            if (objArr[i] != f۸۷۴۹g) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۵۹۷a(long key) {
        Object[] objArr;
        Object obj;
        int i = Cc.m۱۰۵۸۸a(this.f۸۷۵۱d, this.f۸۷۵۳f, key);
        if (i >= 0 && (objArr = this.f۸۷۵۲e)[i] != (obj = f۸۷۴۹g)) {
            objArr[i] = obj;
            this.f۸۷۵۰c = true;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۶۰۲b(int index) {
        Object[] objArr = this.f۸۷۵۲e;
        Object obj = objArr[index];
        Object obj2 = f۸۷۴۹g;
        if (obj != obj2) {
            objArr[index] = obj2;
            this.f۸۷۵۰c = true;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۵۹۴c() {
        int n = this.f۸۷۵۳f;
        int o = 0;
        long[] keys = this.f۸۷۵۱d;
        Object[] values = this.f۸۷۵۲e;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f۸۷۴۹g) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f۸۷۵۰c = false;
        this.f۸۷۵۳f = o;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۶۰۵c(long key, E value) {
        int i = Cc.m۱۰۵۸۸a(this.f۸۷۵۱d, this.f۸۷۵۳f, key);
        if (i >= 0) {
            this.f۸۷۵۲e[i] = value;
            return;
        }
        int i2 = i ^ -1;
        if (i2 < this.f۸۷۵۳f) {
            Object[] objArr = this.f۸۷۵۲e;
            if (objArr[i2] == f۸۷۴۹g) {
                this.f۸۷۵۱d[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f۸۷۵۰c && this.f۸۷۵۳f >= this.f۸۷۵۱d.length) {
            m۱۰۵۹۴c();
            i2 = Cc.m۱۰۵۸۸a(this.f۸۷۵۱d, this.f۸۷۵۳f, key) ^ -1;
        }
        int i3 = this.f۸۷۵۳f;
        if (i3 >= this.f۸۷۵۱d.length) {
            int n = Cc.m۱۰۵۹۱c(i3 + 1);
            long[] nkeys = new long[n];
            Object[] nvalues = new Object[n];
            long[] jArr = this.f۸۷۵۱d;
            System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
            Object[] objArr2 = this.f۸۷۵۲e;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f۸۷۵۱d = nkeys;
            this.f۸۷۵۲e = nvalues;
        }
        int n2 = this.f۸۷۵۳f;
        if (n2 - i2 != 0) {
            long[] jArr2 = this.f۸۷۵۱d;
            System.arraycopy(jArr2, i2, jArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f۸۷۵۲e;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f۸۷۵۳f - i2);
        }
        this.f۸۷۵۱d[i2] = key;
        this.f۸۷۵۲e[i2] = value;
        this.f۸۷۵۳f++;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۰۵۹۹b() {
        if (this.f۸۷۵۰c) {
            m۱۰۵۹۴c();
        }
        return this.f۸۷۵۳f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۰۵۹۵a(int index) {
        if (this.f۸۷۵۰c) {
            m۱۰۵۹۴c();
        }
        return this.f۸۷۵۱d[index];
    }

    /* renamed from: c  reason: contains not printable characters */
    public E m۱۰۶۰۴c(int index) {
        if (this.f۸۷۵۰c) {
            m۱۰۵۹۴c();
        }
        return (E) this.f۸۷۵۲e[index];
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۰۶۰۳c(long key) {
        if (this.f۸۷۵۰c) {
            m۱۰۵۹۴c();
        }
        return Cc.m۱۰۵۸۸a(this.f۸۷۵۱d, this.f۸۷۵۳f, key);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۵۹۶a() {
        int n = this.f۸۷۵۳f;
        Object[] values = this.f۸۷۵۲e;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f۸۷۵۳f = 0;
        this.f۸۷۵۰c = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۵۹۸a(long key, E value) {
        int i = this.f۸۷۵۳f;
        if (i == 0 || key > this.f۸۷۵۱d[i - 1]) {
            if (this.f۸۷۵۰c && this.f۸۷۵۳f >= this.f۸۷۵۱d.length) {
                m۱۰۵۹۴c();
            }
            int pos = this.f۸۷۵۳f;
            if (pos >= this.f۸۷۵۱d.length) {
                int n = Cc.m۱۰۵۹۱c(pos + 1);
                long[] nkeys = new long[n];
                Object[] nvalues = new Object[n];
                long[] jArr = this.f۸۷۵۱d;
                System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
                Object[] objArr = this.f۸۷۵۲e;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f۸۷۵۱d = nkeys;
                this.f۸۷۵۲e = nvalues;
            }
            this.f۸۷۵۱d[pos] = key;
            this.f۸۷۵۲e[pos] = value;
            this.f۸۷۵۳f = pos + 1;
            return;
        }
        m۱۰۶۰۵c(key, value);
    }

    public String toString() {
        if (m۱۰۵۹۹b() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۸۷۵۳f * 28);
        buffer.append('{');
        for (int i = 0; i < this.f۸۷۵۳f; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(m۱۰۵۹۵a(i));
            buffer.append('=');
            Object value = m۱۰۶۰۴c(i);
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
