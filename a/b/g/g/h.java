package a.b.g.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* access modifiers changed from: package-private */
public abstract class h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    h<K, V>.b f۳۹۴a;

    /* renamed from: b  reason: collision with root package name */
    h<K, V>.c f۳۹۵b;

    /* renamed from: c  reason: collision with root package name */
    h<K, V>.e f۳۹۶c;

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract V a(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(K k, V v);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    /* access modifiers changed from: protected */
    public abstract int c();

    h() {
    }

    final class a<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        final int f۳۹۷c;

        /* renamed from: d  reason: collision with root package name */
        int f۳۹۸d;

        /* renamed from: e  reason: collision with root package name */
        int f۳۹۹e;

        /* renamed from: f  reason: collision with root package name */
        boolean f۴۰۰f = false;

        a(int offset) {
            this.f۳۹۷c = offset;
            this.f۳۹۸d = h.this.c();
        }

        public boolean hasNext() {
            return this.f۳۹۹e < this.f۳۹۸d;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) h.this.a(this.f۳۹۹e, this.f۳۹۷c);
                this.f۳۹۹e++;
                this.f۴۰۰f = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f۴۰۰f) {
                this.f۳۹۹e--;
                this.f۳۹۸d--;
                this.f۴۰۰f = false;
                h.this.a(this.f۳۹۹e);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        int f۴۰۴c;

        /* renamed from: d  reason: collision with root package name */
        int f۴۰۵d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۴۰۶e = false;

        d() {
            this.f۴۰۴c = h.this.c() - 1;
            this.f۴۰۵d = -1;
        }

        public boolean hasNext() {
            return this.f۴۰۵d < this.f۴۰۴c;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f۴۰۵d++;
                this.f۴۰۶e = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f۴۰۶e) {
                h.this.a(this.f۴۰۵d);
                this.f۴۰۵d--;
                this.f۴۰۴c--;
                this.f۴۰۶e = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f۴۰۶e) {
                return (K) h.this.a(this.f۴۰۵d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f۴۰۶e) {
                return (V) h.this.a(this.f۴۰۵d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V setValue(V object) {
            if (this.f۴۰۶e) {
                return (V) h.this.a(this.f۴۰۵d, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object o) {
            if (!this.f۴۰۶e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(o instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry<?, ?> e2 = (Map.Entry) o;
                if (!c.a(e2.getKey(), h.this.a(this.f۴۰۵d, 0)) || !c.a(e2.getValue(), h.this.a(this.f۴۰۵d, 1))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            if (this.f۴۰۶e) {
                int i = 0;
                Object key = h.this.a(this.f۴۰۵d, 0);
                Object value = h.this.a(this.f۴۰۵d, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i = value.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.b.g.g.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int oldSize = h.this.c();
            for (Map.Entry<K, V> entry : collection) {
                h.this.a((Object) entry.getKey(), (Object) entry.getValue());
            }
            return oldSize != h.this.c();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e2 = (Map.Entry) o;
            int index = h.this.a(e2.getKey());
            if (index < 0) {
                return false;
            }
            return c.a(h.this.a(index, 1), e2.getValue());
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

        public boolean isEmpty() {
            return h.this.c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return h.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object object) {
            return h.a((Set) this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = h.this.c() - 1; i >= 0; i--) {
                int i2 = 0;
                Object key = h.this.a(i, 0);
                Object value = h.this.a(i, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i2 = value.hashCode();
                }
                result += i2 ^ hashCode;
            }
            return result;
        }
    }

    /* access modifiers changed from: package-private */
    public final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object object) {
            return h.this.a(object) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return h.a((Map) h.this.b(), collection);
        }

        public boolean isEmpty() {
            return h.this.c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object object) {
            int index = h.this.a(object);
            if (index < 0) {
                return false;
            }
            h.this.a(index);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return h.b(h.this.b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return h.c(h.this.b(), collection);
        }

        public int size() {
            return h.this.c();
        }

        public Object[] toArray() {
            return h.this.b(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] array) {
            return (T[]) h.this.a(array, 0);
        }

        public boolean equals(Object object) {
            return h.a((Set) this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = h.this.c() - 1; i >= 0; i--) {
                int i2 = 0;
                Object obj = h.this.a(i, 0);
                if (obj != null) {
                    i2 = obj.hashCode();
                }
                result += i2;
            }
            return result;
        }
    }

    /* access modifiers changed from: package-private */
    public final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object object) {
            return h.this.b(object) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return h.this.c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object object) {
            int index = h.this.b(object);
            if (index < 0) {
                return false;
            }
            h.this.a(index);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int N = h.this.c();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (collection.contains(h.this.a(i, 1))) {
                    h.this.a(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int N = h.this.c();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (!collection.contains(h.this.a(i, 1))) {
                    h.this.a(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public int size() {
            return h.this.c();
        }

        public Object[] toArray() {
            return h.this.b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            return (T[]) h.this.a(array, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return oldSize != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    public Object[] b(int offset) {
        int N = c();
        Object[] result = new Object[N];
        for (int i = 0; i < N; i++) {
            result[i] = a(i, offset);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] a(T[] r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.c()
            int r1 = r4.length
            if (r1 >= r0) goto L_0x0017
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4 = r1
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0023
            java.lang.Object r2 = r3.a(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0023:
            int r1 = r4.length
            if (r1 <= r0) goto L_0x0029
            r1 = 0
            r4[r0] = r1
        L_0x0029:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.g.h.a(java.lang.Object[], int):java.lang.Object[]");
    }

    public static <T> boolean a(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s = (Set) object;
        try {
            if (set.size() != s.size() || !set.containsAll(s)) {
                return false;
            }
            return true;
        } catch (NullPointerException e2) {
            return false;
        } catch (ClassCastException e3) {
            return false;
        }
    }

    public Set<Map.Entry<K, V>> d() {
        if (this.f۳۹۴a == null) {
            this.f۳۹۴a = new b();
        }
        return this.f۳۹۴a;
    }

    public Set<K> e() {
        if (this.f۳۹۵b == null) {
            this.f۳۹۵b = new c();
        }
        return this.f۳۹۵b;
    }

    public Collection<V> f() {
        if (this.f۳۹۶c == null) {
            this.f۳۹۶c = new e();
        }
        return this.f۳۹۶c;
    }
}
