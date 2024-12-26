package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a.b.g.g.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cb<E> implements Collection<E>, Set<E> {

    /* renamed from: g, reason: contains not printable characters */
    private static final int[] f۸۷۳۳g = new int[0];

    /* renamed from: h, reason: contains not printable characters */
    private static final Object[] f۸۷۳۴h = new Object[0];

    /* renamed from: i, reason: contains not printable characters */
    private static Object[] f۸۷۳۵i;

    /* renamed from: j, reason: contains not printable characters */
    private static int f۸۷۳۶j;

    /* renamed from: k, reason: contains not printable characters */
    private static Object[] f۸۷۳۷k;

    /* renamed from: l, reason: contains not printable characters */
    private static int f۸۷۳۸l;

    /* renamed from: c, reason: contains not printable characters */
    private int[] f۸۷۳۹c;

    /* renamed from: d, reason: contains not printable characters */
    Object[] f۸۷۴۰d;

    /* renamed from: e, reason: contains not printable characters */
    int f۸۷۴۱e;

    /* renamed from: f, reason: contains not printable characters */
    private AbstractCh<E, E> f۸۷۴۲f;

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: a, reason: contains not printable characters */
    private int m۸۴۹۷a(Object key, int hash) {
        int N = this.f۸۷۴۱e;
        if (N == 0) {
            return -1;
        }
        int index = Cc.m۸۵۱۶a(this.f۸۷۳۹c, N, hash);
        if (index < 0) {
            return index;
        }
        if (key.equals(this.f۸۷۴۰d[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۳۹c[end] == hash) {
            if (key.equals(this.f۸۷۴۰d[end])) {
                return end;
            }
            end++;
        }
        for (int i = index - 1; i >= 0 && this.f۸۷۳۹c[i] == hash; i--) {
            if (key.equals(this.f۸۷۴۰d[i])) {
                return i;
            }
        }
        int i2 = end ^ (-1);
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: b, reason: contains not printable characters */
    private int m۸۵۰۰b() {
        int N = this.f۸۷۴۱e;
        if (N == 0) {
            return -1;
        }
        int index = Cc.m۸۵۱۶a(this.f۸۷۳۹c, N, 0);
        if (index < 0) {
            return index;
        }
        if (this.f۸۷۴۰d[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۳۹c[end] == 0) {
            if (this.f۸۷۴۰d[end] == null) {
                return end;
            }
            end++;
        }
        for (int i = index - 1; i >= 0 && this.f۸۷۳۹c[i] == 0; i--) {
            if (this.f۸۷۴۰d[i] == null) {
                return i;
            }
        }
        int i2 = end ^ (-1);
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: d, reason: contains not printable characters */
    private void m۸۵۰۱d(int size) {
        if (size == 8) {
            synchronized (Cb.class) {
                if (f۸۷۳۷k != null) {
                    Object[] array = f۸۷۳۷k;
                    this.f۸۷۴۰d = array;
                    f۸۷۳۷k = (Object[]) array[0];
                    this.f۸۷۳۹c = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f۸۷۳۸l--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (Cb.class) {
                if (f۸۷۳۵i != null) {
                    Object[] array2 = f۸۷۳۵i;
                    this.f۸۷۴۰d = array2;
                    f۸۷۳۵i = (Object[]) array2[0];
                    this.f۸۷۳۹c = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f۸۷۳۶j--;
                    return;
                }
            }
        }
        this.f۸۷۳۹c = new int[size];
        this.f۸۷۴۰d = new Object[size];
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۴۹۹a(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (Cb.class) {
                if (f۸۷۳۸l < 10) {
                    array[0] = f۸۷۳۷k;
                    array[1] = hashes;
                    for (int i = size - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f۸۷۳۷k = array;
                    f۸۷۳۸l++;
                }
            }
            return;
        }
        if (hashes.length == 4) {
            synchronized (Cb.class) {
                if (f۸۷۳۶j < 10) {
                    array[0] = f۸۷۳۵i;
                    array[1] = hashes;
                    for (int i2 = size - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f۸۷۳۵i = array;
                    f۸۷۳۶j++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    public Cb() {
        this(0);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    public Cb(int capacity) {
        if (capacity == 0) {
            this.f۸۷۳۹c = f۸۷۳۳g;
            this.f۸۷۴۰d = f۸۷۳۴h;
        } else {
            m۸۵۰۱d(capacity);
        }
        this.f۸۷۴۱e = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f۸۷۴۱e;
        if (i != 0) {
            m۸۴۹۹a(this.f۸۷۳۹c, this.f۸۷۴۰d, i);
            this.f۸۷۳۹c = f۸۷۳۳g;
            this.f۸۷۴۰d = f۸۷۳۴h;
            this.f۸۷۴۱e = 0;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۰۳a(int minimumCapacity) {
        if (this.f۸۷۳۹c.length < minimumCapacity) {
            int[] ohashes = this.f۸۷۳۹c;
            Object[] oarray = this.f۸۷۴۰d;
            m۸۵۰۱d(minimumCapacity);
            int i = this.f۸۷۴۱e;
            if (i > 0) {
                System.arraycopy(ohashes, 0, this.f۸۷۳۹c, 0, i);
                System.arraycopy(oarray, 0, this.f۸۷۴۰d, 0, this.f۸۷۴۱e);
            }
            m۸۴۹۹a(ohashes, oarray, this.f۸۷۴۱e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object key) {
        return m۸۵۰۲a(key) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: a, reason: contains not printable characters */
    public int m۸۵۰۲a(Object key) {
        return key == null ? m۸۵۰۰b() : m۸۴۹۷a(key, key.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: c, reason: contains not printable characters */
    public E m۸۵۰۵c(int i) {
        return (E) this.f۸۷۴۰d[i];
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f۸۷۴۱e <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean add(E value) {
        int hash;
        int index;
        if (value == null) {
            hash = 0;
            index = m۸۵۰۰b();
        } else {
            hash = value.hashCode();
            index = m۸۴۹۷a(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = index ^ (-1);
        int i = this.f۸۷۴۱e;
        if (i >= this.f۸۷۳۹c.length) {
            int i2 = 4;
            if (i >= 8) {
                i2 = (i >> 1) + i;
            } else if (i >= 4) {
                i2 = 8;
            }
            int n = i2;
            int[] ohashes = this.f۸۷۳۹c;
            Object[] oarray = this.f۸۷۴۰d;
            m۸۵۰۱d(n);
            int[] iArr = this.f۸۷۳۹c;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f۸۷۴۰d, 0, oarray.length);
            }
            m۸۴۹۹a(ohashes, oarray, this.f۸۷۴۱e);
        }
        int i3 = this.f۸۷۴۱e;
        if (index2 < i3) {
            int[] iArr2 = this.f۸۷۳۹c;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i3 - index2);
            Object[] objArr = this.f۸۷۴۰d;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f۸۷۴۱e - index2);
        }
        this.f۸۷۳۹c[index2] = hash;
        this.f۸۷۴۰d[index2] = value;
        this.f۸۷۴۱e++;
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object object) {
        int index = m۸۵۰۲a(object);
        if (index >= 0) {
            m۸۵۰۴b(index);
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: b, reason: contains not printable characters */
    public E m۸۵۰۴b(int i) {
        Object[] objArr = this.f۸۷۴۰d;
        E e2 = (E) objArr[i];
        int i2 = this.f۸۷۴۱e;
        if (i2 <= 1) {
            m۸۴۹۹a(this.f۸۷۳۹c, objArr, i2);
            this.f۸۷۳۹c = f۸۷۳۳g;
            this.f۸۷۴۰d = f۸۷۳۴h;
            this.f۸۷۴۱e = 0;
        } else {
            int[] iArr = this.f۸۷۳۹c;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                int i3 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr2 = this.f۸۷۳۹c;
                Object[] objArr2 = this.f۸۷۴۰d;
                m۸۵۰۱d(i3);
                this.f۸۷۴۱e--;
                if (i > 0) {
                    System.arraycopy(iArr2, 0, this.f۸۷۳۹c, 0, i);
                    System.arraycopy(objArr2, 0, this.f۸۷۴۰d, 0, i);
                }
                int i4 = this.f۸۷۴۱e;
                if (i < i4) {
                    System.arraycopy(iArr2, i + 1, this.f۸۷۳۹c, i, i4 - i);
                    System.arraycopy(objArr2, i + 1, this.f۸۷۴۰d, i, this.f۸۷۴۱e - i);
                }
            } else {
                this.f۸۷۴۱e--;
                int i5 = this.f۸۷۴۱e;
                if (i < i5) {
                    int[] iArr3 = this.f۸۷۳۹c;
                    System.arraycopy(iArr3, i + 1, iArr3, i, i5 - i);
                    Object[] objArr3 = this.f۸۷۴۰d;
                    System.arraycopy(objArr3, i + 1, objArr3, i, this.f۸۷۴۱e - i);
                }
                this.f۸۷۴۰d[this.f۸۷۴۱e] = null;
            }
        }
        return e2;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f۸۷۴۱e;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f۸۷۴۱e;
        Object[] result = new Object[i];
        System.arraycopy(this.f۸۷۴۰d, 0, result, 0, i);
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] array) {
        if (array.length < this.f۸۷۴۱e) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), this.f۸۷۴۱e);
        }
        System.arraycopy(this.f۸۷۴۰d, 0, array, 0, this.f۸۷۴۱e);
        int length = array.length;
        int i = this.f۸۷۴۱e;
        if (length > i) {
            array[i] = null;
        }
        return array;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
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
        for (int i = 0; i < this.f۸۷۴۱e; i++) {
            try {
                E mine = m۸۵۰۵c(i);
                if (!set.contains(mine)) {
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

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = this.f۸۷۳۹c;
        int result = 0;
        int s = this.f۸۷۴۱e;
        for (int i = 0; i < s; i++) {
            result += hashes[i];
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f۸۷۴۱e * 14);
        buffer.append('{');
        for (int i = 0; i < this.f۸۷۴۱e; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object value = m۸۵۰۵c(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    /* renamed from: a.b.g.g.b$a */
    class a extends AbstractCh<E, E> {
        a() {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: c, reason: contains not printable characters */
        protected int mo۸۵۵۷c() {
            return Cb.this.f۸۷۴۱e;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected Object mo۸۵۴۸a(int index, int offset) {
            return Cb.this.f۸۷۴۰d[index];
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected int mo۸۵۴۷a(Object key) {
            return Cb.this.m۸۵۰۲a(key);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: b, reason: contains not printable characters */
        protected int mo۸۵۵۴b(Object value) {
            return Cb.this.m۸۵۰۲a(value);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: b, reason: contains not printable characters */
        protected Map<E, E> mo۸۵۵۵b() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۸۵۵۲a(E key, E value) {
            Cb.this.add(key);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected E mo۸۵۴۹a(int index, E value) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۸۵۵۱a(int index) {
            Cb.this.m۸۵۰۴b(index);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۸۵۵۰a() {
            Cb.this.clear();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    /* renamed from: a, reason: contains not printable characters */
    private AbstractCh<E, E> m۸۴۹۸a() {
        if (this.f۸۷۴۲f == null) {
            this.f۸۷۴۲f = new a();
        }
        return this.f۸۷۴۲f;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m۸۴۹۸a().m۸۵۵۹e().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
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

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m۸۵۰۳a(this.f۸۷۴۱e + collection.size());
        boolean added = false;
        for (E value : collection) {
            added |= add(value);
        }
        return added;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean removed = false;
        for (Object value : collection) {
            removed |= remove(value);
        }
        return removed;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.b != android.support.v4.util.ArraySet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean removed = false;
        for (int i = this.f۸۷۴۱e - 1; i >= 0; i--) {
            if (!collection.contains(this.f۸۷۴۰d[i])) {
                m۸۵۰۴b(i);
                removed = true;
            }
        }
        return removed;
    }
}
