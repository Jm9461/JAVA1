package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.b.g.g.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cn<K, V> {

    /* renamed from: f, reason: contains not printable characters */
    static Object[] f۸۷۸۰f;

    /* renamed from: g, reason: contains not printable characters */
    static int f۸۷۸۱g;

    /* renamed from: h, reason: contains not printable characters */
    static Object[] f۸۷۸۲h;

    /* renamed from: i, reason: contains not printable characters */
    static int f۸۷۸۳i;

    /* renamed from: c, reason: contains not printable characters */
    int[] f۸۷۸۴c;

    /* renamed from: d, reason: contains not printable characters */
    Object[] f۸۷۸۵d;

    /* renamed from: e, reason: contains not printable characters */
    int f۸۷۸۶e;

    /* renamed from: a, reason: contains not printable characters */
    private static int m۸۵۷۴a(int[] hashes, int N, int hash) {
        try {
            return Cc.m۸۵۱۶a(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    int m۸۵۷۹a(Object key, int hash) {
        int N = this.f۸۷۸۶e;
        if (N == 0) {
            return -1;
        }
        int index = m۸۵۷۴a(this.f۸۷۸۴c, N, hash);
        if (index < 0) {
            return index;
        }
        if (key.equals(this.f۸۷۸۵d[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۸۴c[end] == hash) {
            if (key.equals(this.f۸۷۸۵d[end << 1])) {
                return end;
            }
            end++;
        }
        for (int i = index - 1; i >= 0 && this.f۸۷۸۴c[i] == hash; i--) {
            if (key.equals(this.f۸۷۸۵d[i << 1])) {
                return i;
            }
        }
        int i2 = end ^ (-1);
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    int m۸۵۷۷a() {
        int N = this.f۸۷۸۶e;
        if (N == 0) {
            return -1;
        }
        int index = m۸۵۷۴a(this.f۸۷۸۴c, N, 0);
        if (index < 0) {
            return index;
        }
        if (this.f۸۷۸۵d[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۸۴c[end] == 0) {
            if (this.f۸۷۸۵d[end << 1] == null) {
                return end;
            }
            end++;
        }
        for (int i = index - 1; i >= 0 && this.f۸۷۸۴c[i] == 0; i--) {
            if (this.f۸۷۸۵d[i << 1] == null) {
                return i;
            }
        }
        int i2 = end ^ (-1);
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: e, reason: contains not printable characters */
    private void m۸۵۷۶e(int size) {
        if (size == 8) {
            synchronized (Ca.class) {
                if (f۸۷۸۲h != null) {
                    Object[] array = f۸۷۸۲h;
                    this.f۸۷۸۵d = array;
                    f۸۷۸۲h = (Object[]) array[0];
                    this.f۸۷۸۴c = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f۸۷۸۳i--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (Ca.class) {
                if (f۸۷۸۰f != null) {
                    Object[] array2 = f۸۷۸۰f;
                    this.f۸۷۸۵d = array2;
                    f۸۷۸۰f = (Object[]) array2[0];
                    this.f۸۷۸۴c = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f۸۷۸۱g--;
                    return;
                }
            }
        }
        this.f۸۷۸۴c = new int[size];
        this.f۸۷۸۵d = new Object[size << 1];
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۵۷۵a(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (Ca.class) {
                if (f۸۷۸۳i < 10) {
                    array[0] = f۸۷۸۲h;
                    array[1] = hashes;
                    for (int i = (size << 1) - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f۸۷۸۲h = array;
                    f۸۷۸۳i++;
                }
            }
            return;
        }
        if (hashes.length == 4) {
            synchronized (Ca.class) {
                if (f۸۷۸۱g < 10) {
                    array[0] = f۸۷۸۰f;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f۸۷۸۰f = array;
                    f۸۷۸۱g++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public Cn() {
        this.f۸۷۸۴c = Cc.f۸۷۴۴a;
        this.f۸۷۸۵d = Cc.f۸۷۴۶c;
        this.f۸۷۸۶e = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public Cn(int capacity) {
        if (capacity == 0) {
            this.f۸۷۸۴c = Cc.f۸۷۴۴a;
            this.f۸۷۸۵d = Cc.f۸۷۴۶c;
        } else {
            m۸۵۷۶e(capacity);
        }
        this.f۸۷۸۶e = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public Cn(Cn<K, V> cn) {
        this();
        if (cn != 0) {
            m۸۵۸۲a((Cn) cn);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public void clear() {
        if (this.f۸۷۸۶e > 0) {
            int[] ohashes = this.f۸۷۸۴c;
            Object[] oarray = this.f۸۷۸۵d;
            int osize = this.f۸۷۸۶e;
            this.f۸۷۸۴c = Cc.f۸۷۴۴a;
            this.f۸۷۸۵d = Cc.f۸۷۴۶c;
            this.f۸۷۸۶e = 0;
            m۸۵۷۵a(ohashes, oarray, osize);
        }
        if (this.f۸۷۸۶e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۸۱a(int minimumCapacity) {
        int osize = this.f۸۷۸۶e;
        if (this.f۸۷۸۴c.length < minimumCapacity) {
            int[] ohashes = this.f۸۷۸۴c;
            Object[] oarray = this.f۸۷۸۵d;
            m۸۵۷۶e(minimumCapacity);
            if (this.f۸۷۸۶e > 0) {
                System.arraycopy(ohashes, 0, this.f۸۷۸۴c, 0, osize);
                System.arraycopy(oarray, 0, this.f۸۷۸۵d, 0, osize << 1);
            }
            m۸۵۷۵a(ohashes, oarray, osize);
        }
        if (this.f۸۷۸۶e != osize) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public boolean containsKey(Object key) {
        return m۸۵۷۸a(key) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public int m۸۵۷۸a(Object key) {
        return key == null ? m۸۵۷۷a() : m۸۵۷۹a(key, key.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    int m۸۵۸۳b(Object value) {
        int N = this.f۸۷۸۶e * 2;
        Object[] array = this.f۸۷۸۵d;
        if (value == null) {
            for (int i = 1; i < N; i += 2) {
                if (array[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < N; i2 += 2) {
            if (value.equals(array[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public boolean containsValue(Object value) {
        return m۸۵۸۳b(value) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public V get(Object obj) {
        int i = m۸۵۷۸a(obj);
        if (i >= 0) {
            return (V) this.f۸۷۸۵d[(i << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    public K m۸۵۸۴b(int i) {
        return (K) this.f۸۷۸۵d[i << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: d, reason: contains not printable characters */
    public V m۸۵۸۶d(int i) {
        return (V) this.f۸۷۸۵d[(i << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public V m۸۵۸۰a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f۸۷۸۵d;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public boolean isEmpty() {
        return this.f۸۷۸۶e <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public V put(K k, V v) {
        int hashCode;
        int i;
        int i2 = this.f۸۷۸۶e;
        if (k == null) {
            hashCode = 0;
            i = m۸۵۷۷a();
        } else {
            hashCode = k.hashCode();
            i = m۸۵۷۹a(k, hashCode);
        }
        if (i >= 0) {
            int i3 = (i << 1) + 1;
            Object[] objArr = this.f۸۷۸۵d;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = i ^ (-1);
        if (i2 >= this.f۸۷۸۴c.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f۸۷۸۴c;
            Object[] objArr2 = this.f۸۷۸۵d;
            m۸۵۷۶e(i5);
            if (i2 != this.f۸۷۸۶e) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f۸۷۸۴c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f۸۷۸۵d, 0, objArr2.length);
            }
            m۸۵۷۵a(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f۸۷۸۴c;
            System.arraycopy(iArr3, i4, iArr3, i4 + 1, i2 - i4);
            Object[] objArr3 = this.f۸۷۸۵d;
            System.arraycopy(objArr3, i4 << 1, objArr3, (i4 + 1) << 1, (this.f۸۷۸۶e - i4) << 1);
        }
        int i6 = this.f۸۷۸۶e;
        if (i2 == i6) {
            int[] iArr4 = this.f۸۷۸۴c;
            if (i4 < iArr4.length) {
                iArr4[i4] = hashCode;
                Object[] objArr4 = this.f۸۷۸۵d;
                objArr4[i4 << 1] = k;
                objArr4[(i4 << 1) + 1] = v;
                this.f۸۷۸۶e = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<? extends K, ? extends V> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۸۲a(Cn<? extends K, ? extends V> cn) {
        int N = cn.f۸۷۸۶e;
        m۸۵۸۱a(this.f۸۷۸۶e + N);
        if (this.f۸۷۸۶e == 0) {
            if (N > 0) {
                System.arraycopy(cn.f۸۷۸۴c, 0, this.f۸۷۸۴c, 0, N);
                System.arraycopy(cn.f۸۷۸۵d, 0, this.f۸۷۸۵d, 0, N << 1);
                this.f۸۷۸۶e = N;
                return;
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            put(cn.m۸۵۸۴b(i), cn.m۸۵۸۶d(i));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public V remove(Object key) {
        int index = m۸۵۷۸a(key);
        if (index >= 0) {
            return m۸۵۸۵c(index);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    /* renamed from: c, reason: contains not printable characters */
    public V m۸۵۸۵c(int i) {
        int i2;
        Object[] objArr = this.f۸۷۸۵d;
        V v = (V) objArr[(i << 1) + 1];
        int i3 = this.f۸۷۸۶e;
        if (i3 <= 1) {
            m۸۵۷۵a(this.f۸۷۸۴c, objArr, i3);
            this.f۸۷۸۴c = Cc.f۸۷۴۴a;
            this.f۸۷۸۵d = Cc.f۸۷۴۶c;
            i2 = 0;
        } else {
            i2 = i3 - 1;
            int[] iArr = this.f۸۷۸۴c;
            if (iArr.length > 8 && this.f۸۷۸۶e < iArr.length / 3) {
                int i4 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr2 = this.f۸۷۸۴c;
                Object[] objArr2 = this.f۸۷۸۵d;
                m۸۵۷۶e(i4);
                if (i3 != this.f۸۷۸۶e) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr2, 0, this.f۸۷۸۴c, 0, i);
                    System.arraycopy(objArr2, 0, this.f۸۷۸۵d, 0, i << 1);
                }
                if (i < i2) {
                    System.arraycopy(iArr2, i + 1, this.f۸۷۸۴c, i, i2 - i);
                    System.arraycopy(objArr2, (i + 1) << 1, this.f۸۷۸۵d, i << 1, (i2 - i) << 1);
                }
            } else {
                if (i < i2) {
                    int[] iArr3 = this.f۸۷۸۴c;
                    System.arraycopy(iArr3, i + 1, iArr3, i, i2 - i);
                    Object[] objArr3 = this.f۸۷۸۵d;
                    System.arraycopy(objArr3, (i + 1) << 1, objArr3, i << 1, (i2 - i) << 1);
                }
                Object[] objArr4 = this.f۸۷۸۵d;
                objArr4[i2 << 1] = null;
                objArr4[(i2 << 1) + 1] = null;
            }
        }
        if (i3 != this.f۸۷۸۶e) {
            throw new ConcurrentModificationException();
        }
        this.f۸۷۸۶e = i2;
        return v;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public int size() {
        return this.f۸۷۸۶e;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<?, ?> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Cn) {
            Cn cn = (Cn) object;
            if (size() != cn.size()) {
                return false;
            }
            for (int i = 0; i < this.f۸۷۸۶e; i++) {
                try {
                    K key = m۸۵۸۴b(i);
                    V mine = m۸۵۸۶d(i);
                    Object theirs = cn.get(key);
                    if (mine == null) {
                        if (theirs != null || !cn.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                } catch (ClassCastException e2) {
                    return false;
                } catch (NullPointerException e3) {
                    return false;
                }
            }
            return true;
        }
        if (!(object instanceof Map)) {
            return false;
        }
        Map<?, ?> map = (Map) object;
        if (size() != map.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f۸۷۸۶e; i2++) {
            try {
                K key2 = m۸۵۸۴b(i2);
                V mine2 = m۸۵۸۶d(i2);
                Object theirs2 = map.get(key2);
                if (mine2 == null) {
                    if (theirs2 != null || !map.containsKey(key2)) {
                        return false;
                    }
                } else if (!mine2.equals(theirs2)) {
                    return false;
                }
            } catch (ClassCastException e4) {
                return false;
            } catch (NullPointerException e5) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public int hashCode() {
        int[] hashes = this.f۸۷۸۴c;
        Object[] array = this.f۸۷۸۵d;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.f۸۷۸۶e;
        while (i < s) {
            Object value = array[v];
            result += hashes[i] ^ (value == null ? 0 : value.hashCode());
            i++;
            v += 2;
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.n != android.support.v4.util.SimpleArrayMap<K, V> */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۸۷۸۶e * 28);
        buffer.append('{');
        for (int i = 0; i < this.f۸۷۸۶e; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object key = m۸۵۸۴b(i);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = m۸۵۸۶d(i);
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
