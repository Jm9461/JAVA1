package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import android.support.v4.util.SimpleArrayMap;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.b.g.g.n  reason: invalid class name */
public class Cn<K, V> {

    /* renamed from: f  reason: contains not printable characters */
    static Object[] f۸۷۸۰f;

    /* renamed from: g  reason: contains not printable characters */
    static int f۸۷۸۱g;

    /* renamed from: h  reason: contains not printable characters */
    static Object[] f۸۷۸۲h;

    /* renamed from: i  reason: contains not printable characters */
    static int f۸۷۸۳i;

    /* renamed from: c  reason: contains not printable characters */
    int[] f۸۷۸۴c;

    /* renamed from: d  reason: contains not printable characters */
    Object[] f۸۷۸۵d;

    /* renamed from: e  reason: contains not printable characters */
    int f۸۷۸۶e;

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۰۶۴۴a(int[] hashes, int N, int hash) {
        try {
            return Cc.m۱۰۵۸۷a(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۶۴۹a(Object key, int hash) {
        int N = this.f۸۷۸۶e;
        if (N == 0) {
            return -1;
        }
        int index = m۱۰۶۴۴a(this.f۸۷۸۴c, N, hash);
        if (index < 0 || key.equals(this.f۸۷۸۵d[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۸۴c[end] == hash) {
            if (key.equals(this.f۸۷۸۵d[end << 1])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f۸۷۸۴c[i] == hash) {
            if (key.equals(this.f۸۷۸۵d[i << 1])) {
                return i;
            }
            i--;
        }
        return end ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۶۴۷a() {
        int N = this.f۸۷۸۶e;
        if (N == 0) {
            return -1;
        }
        int index = m۱۰۶۴۴a(this.f۸۷۸۴c, N, 0);
        if (index < 0 || this.f۸۷۸۵d[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۸۴c[end] == 0) {
            if (this.f۸۷۸۵d[end << 1] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f۸۷۸۴c[i] == 0) {
            if (this.f۸۷۸۵d[i << 1] == null) {
                return i;
            }
            i--;
        }
        return end ^ -1;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۰۶۴۶e(int size) {
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
        this.f۸۷۸۵d = new Object[(size << 1)];
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۶۴۵a(int[] hashes, Object[] array, int size) {
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
        } else if (hashes.length == 4) {
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

    public Cn() {
        this.f۸۷۸۴c = Cc.f۸۷۴۴a;
        this.f۸۷۸۵d = Cc.f۸۷۴۶c;
        this.f۸۷۸۶e = 0;
    }

    public Cn(int capacity) {
        if (capacity == 0) {
            this.f۸۷۸۴c = Cc.f۸۷۴۴a;
            this.f۸۷۸۵d = Cc.f۸۷۴۶c;
        } else {
            m۱۰۶۴۶e(capacity);
        }
        this.f۸۷۸۶e = 0;
    }

    public Cn(Cn<K, V> nVar) {
        this();
        if (nVar != null) {
            m۱۰۶۵۲a((Cn) nVar);
        }
    }

    public void clear() {
        if (this.f۸۷۸۶e > 0) {
            int[] ohashes = this.f۸۷۸۴c;
            Object[] oarray = this.f۸۷۸۵d;
            int osize = this.f۸۷۸۶e;
            this.f۸۷۸۴c = Cc.f۸۷۴۴a;
            this.f۸۷۸۵d = Cc.f۸۷۴۶c;
            this.f۸۷۸۶e = 0;
            m۱۰۶۴۵a(ohashes, oarray, osize);
        }
        if (this.f۸۷۸۶e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۵۱a(int minimumCapacity) {
        int osize = this.f۸۷۸۶e;
        if (this.f۸۷۸۴c.length < minimumCapacity) {
            int[] ohashes = this.f۸۷۸۴c;
            Object[] oarray = this.f۸۷۸۵d;
            m۱۰۶۴۶e(minimumCapacity);
            if (this.f۸۷۸۶e > 0) {
                System.arraycopy(ohashes, 0, this.f۸۷۸۴c, 0, osize);
                System.arraycopy(oarray, 0, this.f۸۷۸۵d, 0, osize << 1);
            }
            m۱۰۶۴۵a(ohashes, oarray, osize);
        }
        if (this.f۸۷۸۶e != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object key) {
        return m۱۰۶۴۸a(key) >= 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۶۴۸a(Object key) {
        return key == null ? m۱۰۶۴۷a() : m۱۰۶۴۹a(key, key.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۰۶۵۳b(Object value) {
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

    public boolean containsValue(Object value) {
        return m۱۰۶۵۳b(value) >= 0;
    }

    public V get(Object key) {
        int index = m۱۰۶۴۸a(key);
        if (index >= 0) {
            return (V) this.f۸۷۸۵d[(index << 1) + 1];
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public K m۱۰۶۵۴b(int index) {
        return (K) this.f۸۷۸۵d[index << 1];
    }

    /* renamed from: d  reason: contains not printable characters */
    public V m۱۰۶۵۶d(int index) {
        return (V) this.f۸۷۸۵d[(index << 1) + 1];
    }

    /* renamed from: a  reason: contains not printable characters */
    public V m۱۰۶۵۰a(int index, V value) {
        int index2 = (index << 1) + 1;
        Object[] objArr = this.f۸۷۸۵d;
        V old = (V) objArr[index2];
        objArr[index2] = value;
        return old;
    }

    public boolean isEmpty() {
        return this.f۸۷۸۶e <= 0;
    }

    public V put(K key, V value) {
        int index;
        int hash;
        int osize = this.f۸۷۸۶e;
        if (key == null) {
            hash = 0;
            index = m۱۰۶۴۷a();
        } else {
            hash = key.hashCode();
            index = m۱۰۶۴۹a(key, hash);
        }
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            Object[] objArr = this.f۸۷۸۵d;
            V old = (V) objArr[index2];
            objArr[index2] = value;
            return old;
        }
        int index3 = index ^ -1;
        if (osize >= this.f۸۷۸۴c.length) {
            int n = 4;
            if (osize >= 8) {
                n = (osize >> 1) + osize;
            } else if (osize >= 4) {
                n = 8;
            }
            int[] ohashes = this.f۸۷۸۴c;
            Object[] oarray = this.f۸۷۸۵d;
            m۱۰۶۴۶e(n);
            if (osize == this.f۸۷۸۶e) {
                int[] iArr = this.f۸۷۸۴c;
                if (iArr.length > 0) {
                    System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                    System.arraycopy(oarray, 0, this.f۸۷۸۵d, 0, oarray.length);
                }
                m۱۰۶۴۵a(ohashes, oarray, osize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            int[] iArr2 = this.f۸۷۸۴c;
            System.arraycopy(iArr2, index3, iArr2, index3 + 1, osize - index3);
            Object[] objArr2 = this.f۸۷۸۵d;
            System.arraycopy(objArr2, index3 << 1, objArr2, (index3 + 1) << 1, (this.f۸۷۸۶e - index3) << 1);
        }
        int i = this.f۸۷۸۶e;
        if (osize == i) {
            int[] iArr3 = this.f۸۷۸۴c;
            if (index3 < iArr3.length) {
                iArr3[index3] = hash;
                Object[] objArr3 = this.f۸۷۸۵d;
                objArr3[index3 << 1] = key;
                objArr3[(index3 << 1) + 1] = value;
                this.f۸۷۸۶e = i + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.b.g.g.n<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۶۵۲a(Cn<? extends K, ? extends V> nVar) {
        int N = nVar.f۸۷۸۶e;
        m۱۰۶۵۱a(this.f۸۷۸۶e + N);
        if (this.f۸۷۸۶e != 0) {
            for (int i = 0; i < N; i++) {
                put(nVar.m۱۰۶۵۴b(i), nVar.m۱۰۶۵۶d(i));
            }
        } else if (N > 0) {
            System.arraycopy(nVar.f۸۷۸۴c, 0, this.f۸۷۸۴c, 0, N);
            System.arraycopy(nVar.f۸۷۸۵d, 0, this.f۸۷۸۵d, 0, N << 1);
            this.f۸۷۸۶e = N;
        }
    }

    public V remove(Object key) {
        int index = m۱۰۶۴۸a(key);
        if (index >= 0) {
            return m۱۰۶۵۵c(index);
        }
        return null;
    }

    /* renamed from: c  reason: contains not printable characters */
    public V m۱۰۶۵۵c(int index) {
        int nsize;
        Object[] objArr = this.f۸۷۸۵d;
        V v = (V) objArr[(index << 1) + 1];
        int osize = this.f۸۷۸۶e;
        if (osize <= 1) {
            m۱۰۶۴۵a(this.f۸۷۸۴c, objArr, osize);
            this.f۸۷۸۴c = Cc.f۸۷۴۴a;
            this.f۸۷۸۵d = Cc.f۸۷۴۶c;
            nsize = 0;
        } else {
            nsize = osize - 1;
            int[] iArr = this.f۸۷۸۴c;
            int n = 8;
            if (iArr.length <= 8 || this.f۸۷۸۶e >= iArr.length / 3) {
                if (index < nsize) {
                    int[] iArr2 = this.f۸۷۸۴c;
                    System.arraycopy(iArr2, index + 1, iArr2, index, nsize - index);
                    Object[] objArr2 = this.f۸۷۸۵d;
                    System.arraycopy(objArr2, (index + 1) << 1, objArr2, index << 1, (nsize - index) << 1);
                }
                Object[] objArr3 = this.f۸۷۸۵d;
                objArr3[nsize << 1] = null;
                objArr3[(nsize << 1) + 1] = null;
            } else {
                if (osize > 8) {
                    n = osize + (osize >> 1);
                }
                int[] ohashes = this.f۸۷۸۴c;
                Object[] oarray = this.f۸۷۸۵d;
                m۱۰۶۴۶e(n);
                if (osize == this.f۸۷۸۶e) {
                    if (index > 0) {
                        System.arraycopy(ohashes, 0, this.f۸۷۸۴c, 0, index);
                        System.arraycopy(oarray, 0, this.f۸۷۸۵d, 0, index << 1);
                    }
                    if (index < nsize) {
                        System.arraycopy(ohashes, index + 1, this.f۸۷۸۴c, index, nsize - index);
                        System.arraycopy(oarray, (index + 1) << 1, this.f۸۷۸۵d, index << 1, (nsize - index) << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (osize == this.f۸۷۸۶e) {
            this.f۸۷۸۶e = nsize;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.f۸۷۸۶e;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Cn) {
            SimpleArrayMap<?, ?> map = (Cn) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.f۸۷۸۶e; i++) {
                try {
                    K key = m۱۰۶۵۴b(i);
                    V mine = m۱۰۶۵۶d(i);
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        } else if (!(object instanceof Map)) {
            return false;
        } else {
            Map<?, ?> map2 = (Map) object;
            if (size() != map2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f۸۷۸۶e; i2++) {
                try {
                    K key2 = m۱۰۶۵۴b(i2);
                    V mine2 = m۱۰۶۵۶d(i2);
                    Object theirs2 = map2.get(key2);
                    if (mine2 == null) {
                        if (theirs2 != null || !map2.containsKey(key2)) {
                            return false;
                        }
                    } else if (!mine2.equals(theirs2)) {
                        return false;
                    }
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

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
            Object key = m۱۰۶۵۴b(i);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = m۱۰۶۵۶d(i);
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
