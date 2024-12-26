package a.b.g.g;

import android.support.v4.util.SimpleArrayMap;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class n<K, V> {

    /* renamed from: f  reason: collision with root package name */
    static Object[] f۴۱۲f;

    /* renamed from: g  reason: collision with root package name */
    static int f۴۱۳g;

    /* renamed from: h  reason: collision with root package name */
    static Object[] f۴۱۴h;
    static int i;

    /* renamed from: c  reason: collision with root package name */
    int[] f۴۱۵c;

    /* renamed from: d  reason: collision with root package name */
    Object[] f۴۱۶d;

    /* renamed from: e  reason: collision with root package name */
    int f۴۱۷e;

    private static int a(int[] hashes, int N, int hash) {
        try {
            return c.a(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public int a(Object key, int hash) {
        int N = this.f۴۱۷e;
        if (N == 0) {
            return -1;
        }
        int index = a(this.f۴۱۵c, N, hash);
        if (index < 0 || key.equals(this.f۴۱۶d[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۴۱۵c[end] == hash) {
            if (key.equals(this.f۴۱۶d[end << 1])) {
                return end;
            }
            end++;
        }
        int i2 = index - 1;
        while (i2 >= 0 && this.f۴۱۵c[i2] == hash) {
            if (key.equals(this.f۴۱۶d[i2 << 1])) {
                return i2;
            }
            i2--;
        }
        return end ^ -1;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int N = this.f۴۱۷e;
        if (N == 0) {
            return -1;
        }
        int index = a(this.f۴۱۵c, N, 0);
        if (index < 0 || this.f۴۱۶d[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۴۱۵c[end] == 0) {
            if (this.f۴۱۶d[end << 1] == null) {
                return end;
            }
            end++;
        }
        int i2 = index - 1;
        while (i2 >= 0 && this.f۴۱۵c[i2] == 0) {
            if (this.f۴۱۶d[i2 << 1] == null) {
                return i2;
            }
            i2--;
        }
        return end ^ -1;
    }

    private void e(int size) {
        if (size == 8) {
            synchronized (a.class) {
                if (f۴۱۴h != null) {
                    Object[] array = f۴۱۴h;
                    this.f۴۱۶d = array;
                    f۴۱۴h = (Object[]) array[0];
                    this.f۴۱۵c = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    i--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (a.class) {
                if (f۴۱۲f != null) {
                    Object[] array2 = f۴۱۲f;
                    this.f۴۱۶d = array2;
                    f۴۱۲f = (Object[]) array2[0];
                    this.f۴۱۵c = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f۴۱۳g--;
                    return;
                }
            }
        }
        this.f۴۱۵c = new int[size];
        this.f۴۱۶d = new Object[(size << 1)];
    }

    private static void a(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (a.class) {
                if (i < 10) {
                    array[0] = f۴۱۴h;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f۴۱۴h = array;
                    i++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (a.class) {
                if (f۴۱۳g < 10) {
                    array[0] = f۴۱۲f;
                    array[1] = hashes;
                    for (int i3 = (size << 1) - 1; i3 >= 2; i3--) {
                        array[i3] = null;
                    }
                    f۴۱۲f = array;
                    f۴۱۳g++;
                }
            }
        }
    }

    public n() {
        this.f۴۱۵c = c.f۳۷۶a;
        this.f۴۱۶d = c.f۳۷۸c;
        this.f۴۱۷e = 0;
    }

    public n(int capacity) {
        if (capacity == 0) {
            this.f۴۱۵c = c.f۳۷۶a;
            this.f۴۱۶d = c.f۳۷۸c;
        } else {
            e(capacity);
        }
        this.f۴۱۷e = 0;
    }

    public n(n<K, V> nVar) {
        this();
        if (nVar != null) {
            a((n) nVar);
        }
    }

    public void clear() {
        if (this.f۴۱۷e > 0) {
            int[] ohashes = this.f۴۱۵c;
            Object[] oarray = this.f۴۱۶d;
            int osize = this.f۴۱۷e;
            this.f۴۱۵c = c.f۳۷۶a;
            this.f۴۱۶d = c.f۳۷۸c;
            this.f۴۱۷e = 0;
            a(ohashes, oarray, osize);
        }
        if (this.f۴۱۷e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void a(int minimumCapacity) {
        int osize = this.f۴۱۷e;
        if (this.f۴۱۵c.length < minimumCapacity) {
            int[] ohashes = this.f۴۱۵c;
            Object[] oarray = this.f۴۱۶d;
            e(minimumCapacity);
            if (this.f۴۱۷e > 0) {
                System.arraycopy(ohashes, 0, this.f۴۱۵c, 0, osize);
                System.arraycopy(oarray, 0, this.f۴۱۶d, 0, osize << 1);
            }
            a(ohashes, oarray, osize);
        }
        if (this.f۴۱۷e != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object key) {
        return a(key) >= 0;
    }

    public int a(Object key) {
        return key == null ? a() : a(key, key.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int b(Object value) {
        int N = this.f۴۱۷e * 2;
        Object[] array = this.f۴۱۶d;
        if (value == null) {
            for (int i2 = 1; i2 < N; i2 += 2) {
                if (array[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < N; i3 += 2) {
            if (value.equals(array[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object value) {
        return b(value) >= 0;
    }

    public V get(Object key) {
        int index = a(key);
        if (index >= 0) {
            return (V) this.f۴۱۶d[(index << 1) + 1];
        }
        return null;
    }

    public K b(int index) {
        return (K) this.f۴۱۶d[index << 1];
    }

    public V d(int index) {
        return (V) this.f۴۱۶d[(index << 1) + 1];
    }

    public V a(int index, V value) {
        int index2 = (index << 1) + 1;
        Object[] objArr = this.f۴۱۶d;
        V old = (V) objArr[index2];
        objArr[index2] = value;
        return old;
    }

    public boolean isEmpty() {
        return this.f۴۱۷e <= 0;
    }

    public V put(K key, V value) {
        int index;
        int hash;
        int osize = this.f۴۱۷e;
        if (key == null) {
            hash = 0;
            index = a();
        } else {
            hash = key.hashCode();
            index = a(key, hash);
        }
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            Object[] objArr = this.f۴۱۶d;
            V old = (V) objArr[index2];
            objArr[index2] = value;
            return old;
        }
        int index3 = index ^ -1;
        if (osize >= this.f۴۱۵c.length) {
            int n = 4;
            if (osize >= 8) {
                n = (osize >> 1) + osize;
            } else if (osize >= 4) {
                n = 8;
            }
            int[] ohashes = this.f۴۱۵c;
            Object[] oarray = this.f۴۱۶d;
            e(n);
            if (osize == this.f۴۱۷e) {
                int[] iArr = this.f۴۱۵c;
                if (iArr.length > 0) {
                    System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                    System.arraycopy(oarray, 0, this.f۴۱۶d, 0, oarray.length);
                }
                a(ohashes, oarray, osize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            int[] iArr2 = this.f۴۱۵c;
            System.arraycopy(iArr2, index3, iArr2, index3 + 1, osize - index3);
            Object[] objArr2 = this.f۴۱۶d;
            System.arraycopy(objArr2, index3 << 1, objArr2, (index3 + 1) << 1, (this.f۴۱۷e - index3) << 1);
        }
        int i2 = this.f۴۱۷e;
        if (osize == i2) {
            int[] iArr3 = this.f۴۱۵c;
            if (index3 < iArr3.length) {
                iArr3[index3] = hash;
                Object[] objArr3 = this.f۴۱۶d;
                objArr3[index3 << 1] = key;
                objArr3[(index3 << 1) + 1] = value;
                this.f۴۱۷e = i2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.b.g.g.n<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(n<? extends K, ? extends V> nVar) {
        int N = nVar.f۴۱۷e;
        a(this.f۴۱۷e + N);
        if (this.f۴۱۷e != 0) {
            for (int i2 = 0; i2 < N; i2++) {
                put(nVar.b(i2), nVar.d(i2));
            }
        } else if (N > 0) {
            System.arraycopy(nVar.f۴۱۵c, 0, this.f۴۱۵c, 0, N);
            System.arraycopy(nVar.f۴۱۶d, 0, this.f۴۱۶d, 0, N << 1);
            this.f۴۱۷e = N;
        }
    }

    public V remove(Object key) {
        int index = a(key);
        if (index >= 0) {
            return c(index);
        }
        return null;
    }

    public V c(int index) {
        int nsize;
        Object[] objArr = this.f۴۱۶d;
        V v = (V) objArr[(index << 1) + 1];
        int osize = this.f۴۱۷e;
        if (osize <= 1) {
            a(this.f۴۱۵c, objArr, osize);
            this.f۴۱۵c = c.f۳۷۶a;
            this.f۴۱۶d = c.f۳۷۸c;
            nsize = 0;
        } else {
            nsize = osize - 1;
            int[] iArr = this.f۴۱۵c;
            int n = 8;
            if (iArr.length <= 8 || this.f۴۱۷e >= iArr.length / 3) {
                if (index < nsize) {
                    int[] iArr2 = this.f۴۱۵c;
                    System.arraycopy(iArr2, index + 1, iArr2, index, nsize - index);
                    Object[] objArr2 = this.f۴۱۶d;
                    System.arraycopy(objArr2, (index + 1) << 1, objArr2, index << 1, (nsize - index) << 1);
                }
                Object[] objArr3 = this.f۴۱۶d;
                objArr3[nsize << 1] = null;
                objArr3[(nsize << 1) + 1] = null;
            } else {
                if (osize > 8) {
                    n = osize + (osize >> 1);
                }
                int[] ohashes = this.f۴۱۵c;
                Object[] oarray = this.f۴۱۶d;
                e(n);
                if (osize == this.f۴۱۷e) {
                    if (index > 0) {
                        System.arraycopy(ohashes, 0, this.f۴۱۵c, 0, index);
                        System.arraycopy(oarray, 0, this.f۴۱۶d, 0, index << 1);
                    }
                    if (index < nsize) {
                        System.arraycopy(ohashes, index + 1, this.f۴۱۵c, index, nsize - index);
                        System.arraycopy(oarray, (index + 1) << 1, this.f۴۱۶d, index << 1, (nsize - index) << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (osize == this.f۴۱۷e) {
            this.f۴۱۷e = nsize;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.f۴۱۷e;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof n) {
            SimpleArrayMap<?, ?> map = (n) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f۴۱۷e; i2++) {
                try {
                    K key = b(i2);
                    V mine = d(i2);
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                } catch (NullPointerException e2) {
                    return false;
                } catch (ClassCastException e3) {
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
            for (int i3 = 0; i3 < this.f۴۱۷e; i3++) {
                try {
                    K key2 = b(i3);
                    V mine2 = d(i3);
                    Object theirs2 = map2.get(key2);
                    if (mine2 == null) {
                        if (theirs2 != null || !map2.containsKey(key2)) {
                            return false;
                        }
                    } else if (!mine2.equals(theirs2)) {
                        return false;
                    }
                } catch (NullPointerException e4) {
                    return false;
                } catch (ClassCastException e5) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] hashes = this.f۴۱۵c;
        Object[] array = this.f۴۱۶d;
        int result = 0;
        int i2 = 0;
        int v = 1;
        int s = this.f۴۱۷e;
        while (i2 < s) {
            Object value = array[v];
            result += hashes[i2] ^ (value == null ? 0 : value.hashCode());
            i2++;
            v += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۴۱۷e * 28);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f۴۱۷e; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            Object key = b(i2);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = d(i2);
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
