package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import android.support.v4.util.SparseArrayCompat;

/* renamed from: a.b.g.g.o  reason: invalid class name */
public class Co<E> implements Cloneable {

    /* renamed from: g  reason: contains not printable characters */
    private static final Object f۸۷۸۷g = new Object();

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۸۷۸۸c;

    /* renamed from: d  reason: contains not printable characters */
    private int[] f۸۷۸۹d;

    /* renamed from: e  reason: contains not printable characters */
    private Object[] f۸۷۹۰e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۷۹۱f;

    public Co() {
        this(10);
    }

    public Co(int initialCapacity) {
        this.f۸۷۸۸c = false;
        if (initialCapacity == 0) {
            this.f۸۷۸۹d = Cc.f۸۷۴۴a;
            this.f۸۷۹۰e = Cc.f۸۷۴۶c;
        } else {
            int initialCapacity2 = Cc.m۱۰۵۹۰b(initialCapacity);
            this.f۸۷۸۹d = new int[initialCapacity2];
            this.f۸۷۹۰e = new Object[initialCapacity2];
        }
        this.f۸۷۹۱f = 0;
    }

    @Override // java.lang.Object
    public Co<E> clone() {
        try {
            SparseArrayCompat<E> clone = (Co) super.clone();
            clone.f۸۷۸۹d = (int[]) this.f۸۷۸۹d.clone();
            clone.f۸۷۹۰e = (Object[]) this.f۸۷۹۰e.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public E m۱۰۶۶۲b(int key) {
        return m۱۰۶۶۳b(key, null);
    }

    /* renamed from: b  reason: contains not printable characters */
    public E m۱۰۶۶۳b(int key, E valueIfKeyNotFound) {
        int i = Cc.m۱۰۵۸۷a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
        if (i >= 0) {
            Object[] objArr = this.f۸۷۹۰e;
            if (objArr[i] != f۸۷۸۷g) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۵۹a(int key) {
        Object[] objArr;
        Object obj;
        int i = Cc.m۱۰۵۸۷a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
        if (i >= 0 && (objArr = this.f۸۷۹۰e)[i] != (obj = f۸۷۸۷g)) {
            objArr[i] = obj;
            this.f۸۷۸۸c = true;
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۰۶۶۷e(int key) {
        m۱۰۶۵۹a(key);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۶۵۷c() {
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

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۶۶۵c(int key, E value) {
        int i = Cc.m۱۰۵۸۷a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
        if (i >= 0) {
            this.f۸۷۹۰e[i] = value;
            return;
        }
        int i2 = i ^ -1;
        if (i2 < this.f۸۷۹۱f) {
            Object[] objArr = this.f۸۷۹۰e;
            if (objArr[i2] == f۸۷۸۷g) {
                this.f۸۷۸۹d[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f۸۷۸۸c && this.f۸۷۹۱f >= this.f۸۷۸۹d.length) {
            m۱۰۶۵۷c();
            i2 = Cc.m۱۰۵۸۷a(this.f۸۷۸۹d, this.f۸۷۹۱f, key) ^ -1;
        }
        int i3 = this.f۸۷۹۱f;
        if (i3 >= this.f۸۷۸۹d.length) {
            int n = Cc.m۱۰۵۹۰b(i3 + 1);
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

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۰۶۶۱b() {
        if (this.f۸۷۸۸c) {
            m۱۰۶۵۷c();
        }
        return this.f۸۷۹۱f;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۰۶۶۶d(int index) {
        if (this.f۸۷۸۸c) {
            m۱۰۶۵۷c();
        }
        return this.f۸۷۸۹d[index];
    }

    /* renamed from: f  reason: contains not printable characters */
    public E m۱۰۶۶۸f(int index) {
        if (this.f۸۷۸۸c) {
            m۱۰۶۵۷c();
        }
        return (E) this.f۸۷۹۰e[index];
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۰۶۶۴c(int key) {
        if (this.f۸۷۸۸c) {
            m۱۰۶۵۷c();
        }
        return Cc.m۱۰۵۸۷a(this.f۸۷۸۹d, this.f۸۷۹۱f, key);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۵۸a() {
        int n = this.f۸۷۹۱f;
        Object[] values = this.f۸۷۹۰e;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f۸۷۹۱f = 0;
        this.f۸۷۸۸c = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۶۰a(int key, E value) {
        int i = this.f۸۷۹۱f;
        if (i == 0 || key > this.f۸۷۸۹d[i - 1]) {
            if (this.f۸۷۸۸c && this.f۸۷۹۱f >= this.f۸۷۸۹d.length) {
                m۱۰۶۵۷c();
            }
            int pos = this.f۸۷۹۱f;
            if (pos >= this.f۸۷۸۹d.length) {
                int n = Cc.m۱۰۵۹۰b(pos + 1);
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
            return;
        }
        m۱۰۶۶۵c(key, value);
    }

    public String toString() {
        if (m۱۰۶۶۱b() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۸۷۹۱f * 28);
        buffer.append('{');
        for (int i = 0; i < this.f۸۷۹۱f; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(m۱۰۶۶۶d(i));
            buffer.append('=');
            Object value = m۱۰۶۶۸f(i);
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
