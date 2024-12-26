package a.b.g.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f۳۶۹g = new int[0];

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f۳۷۰h = new Object[0];
    private static Object[] i;
    private static int j;
    private static Object[] k;
    private static int l;

    /* renamed from: c  reason: collision with root package name */
    private int[] f۳۷۱c;

    /* renamed from: d  reason: collision with root package name */
    Object[] f۳۷۲d;

    /* renamed from: e  reason: collision with root package name */
    int f۳۷۳e;

    /* renamed from: f  reason: collision with root package name */
    private h<E, E> f۳۷۴f;

    private int a(Object key, int hash) {
        int N = this.f۳۷۳e;
        if (N == 0) {
            return -1;
        }
        int index = c.a(this.f۳۷۱c, N, hash);
        if (index < 0 || key.equals(this.f۳۷۲d[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۳۷۱c[end] == hash) {
            if (key.equals(this.f۳۷۲d[end])) {
                return end;
            }
            end++;
        }
        int i2 = index - 1;
        while (i2 >= 0 && this.f۳۷۱c[i2] == hash) {
            if (key.equals(this.f۳۷۲d[i2])) {
                return i2;
            }
            i2--;
        }
        return end ^ -1;
    }

    private int b() {
        int N = this.f۳۷۳e;
        if (N == 0) {
            return -1;
        }
        int index = c.a(this.f۳۷۱c, N, 0);
        if (index < 0 || this.f۳۷۲d[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۳۷۱c[end] == 0) {
            if (this.f۳۷۲d[end] == null) {
                return end;
            }
            end++;
        }
        int i2 = index - 1;
        while (i2 >= 0 && this.f۳۷۱c[i2] == 0) {
            if (this.f۳۷۲d[i2] == null) {
                return i2;
            }
            i2--;
        }
        return end ^ -1;
    }

    private void d(int size) {
        if (size == 8) {
            synchronized (b.class) {
                if (k != null) {
                    Object[] array = k;
                    this.f۳۷۲d = array;
                    k = (Object[]) array[0];
                    this.f۳۷۱c = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    l--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (b.class) {
                if (i != null) {
                    Object[] array2 = i;
                    this.f۳۷۲d = array2;
                    i = (Object[]) array2[0];
                    this.f۳۷۱c = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    j--;
                    return;
                }
            }
        }
        this.f۳۷۱c = new int[size];
        this.f۳۷۲d = new Object[size];
    }

    private static void a(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (b.class) {
                if (l < 10) {
                    array[0] = k;
                    array[1] = hashes;
                    for (int i2 = size - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    k = array;
                    l++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (b.class) {
                if (j < 10) {
                    array[0] = i;
                    array[1] = hashes;
                    for (int i3 = size - 1; i3 >= 2; i3--) {
                        array[i3] = null;
                    }
                    i = array;
                    j++;
                }
            }
        }
    }

    public b() {
        this(0);
    }

    public b(int capacity) {
        if (capacity == 0) {
            this.f۳۷۱c = f۳۶۹g;
            this.f۳۷۲d = f۳۷۰h;
        } else {
            d(capacity);
        }
        this.f۳۷۳e = 0;
    }

    public void clear() {
        int i2 = this.f۳۷۳e;
        if (i2 != 0) {
            a(this.f۳۷۱c, this.f۳۷۲d, i2);
            this.f۳۷۱c = f۳۶۹g;
            this.f۳۷۲d = f۳۷۰h;
            this.f۳۷۳e = 0;
        }
    }

    public void a(int minimumCapacity) {
        if (this.f۳۷۱c.length < minimumCapacity) {
            int[] ohashes = this.f۳۷۱c;
            Object[] oarray = this.f۳۷۲d;
            d(minimumCapacity);
            int i2 = this.f۳۷۳e;
            if (i2 > 0) {
                System.arraycopy(ohashes, 0, this.f۳۷۱c, 0, i2);
                System.arraycopy(oarray, 0, this.f۳۷۲d, 0, this.f۳۷۳e);
            }
            a(ohashes, oarray, this.f۳۷۳e);
        }
    }

    public boolean contains(Object key) {
        return a(key) >= 0;
    }

    public int a(Object key) {
        return key == null ? b() : a(key, key.hashCode());
    }

    public E c(int index) {
        return (E) this.f۳۷۲d[index];
    }

    public boolean isEmpty() {
        return this.f۳۷۳e <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E value) {
        int index;
        int hash;
        if (value == null) {
            hash = 0;
            index = b();
        } else {
            hash = value.hashCode();
            index = a(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = index ^ -1;
        int i2 = this.f۳۷۳e;
        if (i2 >= this.f۳۷۱c.length) {
            int n = 4;
            if (i2 >= 8) {
                n = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                n = 8;
            }
            int[] ohashes = this.f۳۷۱c;
            Object[] oarray = this.f۳۷۲d;
            d(n);
            int[] iArr = this.f۳۷۱c;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f۳۷۲d, 0, oarray.length);
            }
            a(ohashes, oarray, this.f۳۷۳e);
        }
        int i3 = this.f۳۷۳e;
        if (index2 < i3) {
            int[] iArr2 = this.f۳۷۱c;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i3 - index2);
            Object[] objArr = this.f۳۷۲d;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f۳۷۳e - index2);
        }
        this.f۳۷۱c[index2] = hash;
        this.f۳۷۲d[index2] = value;
        this.f۳۷۳e++;
        return true;
    }

    public boolean remove(Object object) {
        int index = a(object);
        if (index < 0) {
            return false;
        }
        b(index);
        return true;
    }

    public E b(int index) {
        Object[] objArr = this.f۳۷۲d;
        E e2 = (E) objArr[index];
        int i2 = this.f۳۷۳e;
        if (i2 <= 1) {
            a(this.f۳۷۱c, objArr, i2);
            this.f۳۷۱c = f۳۶۹g;
            this.f۳۷۲d = f۳۷۰h;
            this.f۳۷۳e = 0;
        } else {
            int[] iArr = this.f۳۷۱c;
            int n = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f۳۷۳e--;
                int i3 = this.f۳۷۳e;
                if (index < i3) {
                    int[] iArr2 = this.f۳۷۱c;
                    System.arraycopy(iArr2, index + 1, iArr2, index, i3 - index);
                    Object[] objArr2 = this.f۳۷۲d;
                    System.arraycopy(objArr2, index + 1, objArr2, index, this.f۳۷۳e - index);
                }
                this.f۳۷۲d[this.f۳۷۳e] = null;
            } else {
                if (i2 > 8) {
                    n = i2 + (i2 >> 1);
                }
                int[] ohashes = this.f۳۷۱c;
                Object[] oarray = this.f۳۷۲d;
                d(n);
                this.f۳۷۳e--;
                if (index > 0) {
                    System.arraycopy(ohashes, 0, this.f۳۷۱c, 0, index);
                    System.arraycopy(oarray, 0, this.f۳۷۲d, 0, index);
                }
                int i4 = this.f۳۷۳e;
                if (index < i4) {
                    System.arraycopy(ohashes, index + 1, this.f۳۷۱c, index, i4 - index);
                    System.arraycopy(oarray, index + 1, this.f۳۷۲d, index, this.f۳۷۳e - index);
                }
            }
        }
        return e2;
    }

    public int size() {
        return this.f۳۷۳e;
    }

    public Object[] toArray() {
        int i2 = this.f۳۷۳e;
        Object[] result = new Object[i2];
        System.arraycopy(this.f۳۷۲d, 0, result, 0, i2);
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.Collection, java.util.Set
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] toArray(T[] r4) {
        /*
            r3 = this;
            int r0 = r4.length
            int r1 = r3.f۳۷۳e
            if (r0 >= r1) goto L_0x0017
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r3.f۳۷۳e
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0
        L_0x0017:
            java.lang.Object[] r0 = r3.f۳۷۲d
            int r1 = r3.f۳۷۳e
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.f۳۷۳e
            if (r0 <= r1) goto L_0x0027
            r0 = 0
            r4[r1] = r0
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.g.b.toArray(java.lang.Object[]):java.lang.Object[]");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f۳۷۳e; i2++) {
            try {
                if (!set.contains(c(i2))) {
                    return false;
                }
            } catch (NullPointerException e2) {
                return false;
            } catch (ClassCastException e3) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] hashes = this.f۳۷۱c;
        int result = 0;
        int s = this.f۳۷۳e;
        for (int i2 = 0; i2 < s; i2++) {
            result += hashes[i2];
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۳۷۳e * 14);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f۳۷۳e; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            Object value = c(i2);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    /* access modifiers changed from: package-private */
    public class a extends h<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public int c() {
            return b.this.f۳۷۳e;
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public Object a(int index, int offset) {
            return b.this.f۳۷۲d[index];
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public int a(Object key) {
            return b.this.a(key);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public int b(Object value) {
            return b.this.a(value);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public Map<E, E> b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public void a(E key, E e2) {
            b.this.add(key);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public E a(int index, E e2) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public void a(int index) {
            b.this.b(index);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public void a() {
            b.this.clear();
        }
    }

    private h<E, E> a() {
        if (this.f۳۷۴f == null) {
            this.f۳۷۴f = new a();
        }
        return this.f۳۷۴f;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return a().e().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.b.g.g.b<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        a(this.f۳۷۳e + collection.size());
        boolean added = false;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            added |= add(it.next());
        }
        return added;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean removed = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            removed |= remove(it.next());
        }
        return removed;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean removed = false;
        for (int i2 = this.f۳۷۳e - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f۳۷۲d[i2])) {
                b(i2);
                removed = true;
            }
        }
        return removed;
    }
}
