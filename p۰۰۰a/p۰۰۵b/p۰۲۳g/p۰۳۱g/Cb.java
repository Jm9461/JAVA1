package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a.b.g.g.b  reason: invalid class name */
public final class Cb<E> implements Collection<E>, Set<E> {

    /* renamed from: g  reason: contains not printable characters */
    private static final int[] f۸۷۳۳g = new int[0];

    /* renamed from: h  reason: contains not printable characters */
    private static final Object[] f۸۷۳۴h = new Object[0];

    /* renamed from: i  reason: contains not printable characters */
    private static Object[] f۸۷۳۵i;

    /* renamed from: j  reason: contains not printable characters */
    private static int f۸۷۳۶j;

    /* renamed from: k  reason: contains not printable characters */
    private static Object[] f۸۷۳۷k;

    /* renamed from: l  reason: contains not printable characters */
    private static int f۸۷۳۸l;

    /* renamed from: c  reason: contains not printable characters */
    private int[] f۸۷۳۹c;

    /* renamed from: d  reason: contains not printable characters */
    Object[] f۸۷۴۰d;

    /* renamed from: e  reason: contains not printable characters */
    int f۸۷۴۱e;

    /* renamed from: f  reason: contains not printable characters */
    private AbstractCh<E, E> f۸۷۴۲f;

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۰۵۶۸a(Object key, int hash) {
        int N = this.f۸۷۴۱e;
        if (N == 0) {
            return -1;
        }
        int index = Cc.m۱۰۵۸۷a(this.f۸۷۳۹c, N, hash);
        if (index < 0 || key.equals(this.f۸۷۴۰d[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۳۹c[end] == hash) {
            if (key.equals(this.f۸۷۴۰d[end])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f۸۷۳۹c[i] == hash) {
            if (key.equals(this.f۸۷۴۰d[i])) {
                return i;
            }
            i--;
        }
        return end ^ -1;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۰۵۷۱b() {
        int N = this.f۸۷۴۱e;
        if (N == 0) {
            return -1;
        }
        int index = Cc.m۱۰۵۸۷a(this.f۸۷۳۹c, N, 0);
        if (index < 0 || this.f۸۷۴۰d[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f۸۷۳۹c[end] == 0) {
            if (this.f۸۷۴۰d[end] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f۸۷۳۹c[i] == 0) {
            if (this.f۸۷۴۰d[i] == null) {
                return i;
            }
            i--;
        }
        return end ^ -1;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۵۷۲d(int size) {
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

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۵۷۰a(int[] hashes, Object[] array, int size) {
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
        } else if (hashes.length == 4) {
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

    public Cb() {
        this(0);
    }

    public Cb(int capacity) {
        if (capacity == 0) {
            this.f۸۷۳۹c = f۸۷۳۳g;
            this.f۸۷۴۰d = f۸۷۳۴h;
        } else {
            m۱۰۵۷۲d(capacity);
        }
        this.f۸۷۴۱e = 0;
    }

    public void clear() {
        int i = this.f۸۷۴۱e;
        if (i != 0) {
            m۱۰۵۷۰a(this.f۸۷۳۹c, this.f۸۷۴۰d, i);
            this.f۸۷۳۹c = f۸۷۳۳g;
            this.f۸۷۴۰d = f۸۷۳۴h;
            this.f۸۷۴۱e = 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۵۷۴a(int minimumCapacity) {
        if (this.f۸۷۳۹c.length < minimumCapacity) {
            int[] ohashes = this.f۸۷۳۹c;
            Object[] oarray = this.f۸۷۴۰d;
            m۱۰۵۷۲d(minimumCapacity);
            int i = this.f۸۷۴۱e;
            if (i > 0) {
                System.arraycopy(ohashes, 0, this.f۸۷۳۹c, 0, i);
                System.arraycopy(oarray, 0, this.f۸۷۴۰d, 0, this.f۸۷۴۱e);
            }
            m۱۰۵۷۰a(ohashes, oarray, this.f۸۷۴۱e);
        }
    }

    public boolean contains(Object key) {
        return m۱۰۵۷۳a(key) >= 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۰۵۷۳a(Object key) {
        return key == null ? m۱۰۵۷۱b() : m۱۰۵۶۸a(key, key.hashCode());
    }

    /* renamed from: c  reason: contains not printable characters */
    public E m۱۰۵۷۶c(int index) {
        return (E) this.f۸۷۴۰d[index];
    }

    public boolean isEmpty() {
        return this.f۸۷۴۱e <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E value) {
        int index;
        int hash;
        if (value == null) {
            hash = 0;
            index = m۱۰۵۷۱b();
        } else {
            hash = value.hashCode();
            index = m۱۰۵۶۸a(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = index ^ -1;
        int i = this.f۸۷۴۱e;
        if (i >= this.f۸۷۳۹c.length) {
            int n = 4;
            if (i >= 8) {
                n = (i >> 1) + i;
            } else if (i >= 4) {
                n = 8;
            }
            int[] ohashes = this.f۸۷۳۹c;
            Object[] oarray = this.f۸۷۴۰d;
            m۱۰۵۷۲d(n);
            int[] iArr = this.f۸۷۳۹c;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f۸۷۴۰d, 0, oarray.length);
            }
            m۱۰۵۷۰a(ohashes, oarray, this.f۸۷۴۱e);
        }
        int i2 = this.f۸۷۴۱e;
        if (index2 < i2) {
            int[] iArr2 = this.f۸۷۳۹c;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i2 - index2);
            Object[] objArr = this.f۸۷۴۰d;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f۸۷۴۱e - index2);
        }
        this.f۸۷۳۹c[index2] = hash;
        this.f۸۷۴۰d[index2] = value;
        this.f۸۷۴۱e++;
        return true;
    }

    public boolean remove(Object object) {
        int index = m۱۰۵۷۳a(object);
        if (index < 0) {
            return false;
        }
        m۱۰۵۷۵b(index);
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public E m۱۰۵۷۵b(int index) {
        Object[] objArr = this.f۸۷۴۰d;
        E e = (E) objArr[index];
        int i = this.f۸۷۴۱e;
        if (i <= 1) {
            m۱۰۵۷۰a(this.f۸۷۳۹c, objArr, i);
            this.f۸۷۳۹c = f۸۷۳۳g;
            this.f۸۷۴۰d = f۸۷۳۴h;
            this.f۸۷۴۱e = 0;
        } else {
            int[] iArr = this.f۸۷۳۹c;
            int n = 8;
            if (iArr.length <= 8 || i >= iArr.length / 3) {
                this.f۸۷۴۱e--;
                int i2 = this.f۸۷۴۱e;
                if (index < i2) {
                    int[] iArr2 = this.f۸۷۳۹c;
                    System.arraycopy(iArr2, index + 1, iArr2, index, i2 - index);
                    Object[] objArr2 = this.f۸۷۴۰d;
                    System.arraycopy(objArr2, index + 1, objArr2, index, this.f۸۷۴۱e - index);
                }
                this.f۸۷۴۰d[this.f۸۷۴۱e] = null;
            } else {
                if (i > 8) {
                    n = i + (i >> 1);
                }
                int[] ohashes = this.f۸۷۳۹c;
                Object[] oarray = this.f۸۷۴۰d;
                m۱۰۵۷۲d(n);
                this.f۸۷۴۱e--;
                if (index > 0) {
                    System.arraycopy(ohashes, 0, this.f۸۷۳۹c, 0, index);
                    System.arraycopy(oarray, 0, this.f۸۷۴۰d, 0, index);
                }
                int i3 = this.f۸۷۴۱e;
                if (index < i3) {
                    System.arraycopy(ohashes, index + 1, this.f۸۷۳۹c, index, i3 - index);
                    System.arraycopy(oarray, index + 1, this.f۸۷۴۰d, index, this.f۸۷۴۱e - index);
                }
            }
        }
        return e;
    }

    public int size() {
        return this.f۸۷۴۱e;
    }

    public Object[] toArray() {
        int i = this.f۸۷۴۱e;
        Object[] result = new Object[i];
        System.arraycopy(this.f۸۷۴۰d, 0, result, 0, i);
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
            int r1 = r3.f۸۷۴۱e
            if (r0 >= r1) goto L_0x0017
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r3.f۸۷۴۱e
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0
        L_0x0017:
            java.lang.Object[] r0 = r3.f۸۷۴۰d
            int r1 = r3.f۸۷۴۱e
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.f۸۷۴۱e
            if (r0 <= r1) goto L_0x0027
            r0 = 0
            r4[r1] = r0
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cb.toArray(java.lang.Object[]):java.lang.Object[]");
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
        for (int i = 0; i < this.f۸۷۴۱e; i++) {
            try {
                if (!set.contains(m۱۰۵۷۶c(i))) {
                    return false;
                }
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] hashes = this.f۸۷۳۹c;
        int result = 0;
        int s = this.f۸۷۴۱e;
        for (int i = 0; i < s; i++) {
            result += hashes[i];
        }
        return result;
    }

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
            Object value = m۱۰۵۷۶c(i);
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
    /* renamed from: a.b.g.g.b$a  reason: invalid class name */
    public class Ca extends AbstractCh<E, E> {
        Ca() {
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۰۵۸۵c() {
            return Cb.this.f۸۷۴۱e;
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public Object m۱۰۵۷۸a(int index, int offset) {
            return Cb.this.f۸۷۴۰d[index];
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۵۷۷a(Object key) {
            return Cb.this.m۱۰۵۷۳a(key);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۵۸۳b(Object value) {
            return Cb.this.m۱۰۵۷۳a(value);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: b  reason: contains not printable characters */
        public Map<E, E> m۱۰۵۸۴b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۸۲a(E key, E e) {
            Cb.this.add(key);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public E m۱۰۵۷۹a(int index, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۸۱a(int index) {
            Cb.this.m۱۰۵۷۵b(index);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۸۰a() {
            Cb.this.clear();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCh<E, E> m۱۰۵۶۹a() {
        if (this.f۸۷۴۲f == null) {
            this.f۸۷۴۲f = new Ca();
        }
        return this.f۸۷۴۲f;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return m۱۰۵۶۹a().m۱۰۶۲۹e().iterator();
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
        m۱۰۵۷۴a(this.f۸۷۴۱e + collection.size());
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
        for (int i = this.f۸۷۴۱e - 1; i >= 0; i--) {
            if (!collection.contains(this.f۸۷۴۰d[i])) {
                m۱۰۵۷۵b(i);
                removed = true;
            }
        }
        return removed;
    }
}
