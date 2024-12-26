package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: a.b.g.g.h  reason: invalid class name */
public abstract class AbstractCh<K, V> {

    /* renamed from: a  reason: contains not printable characters */
    AbstractCh<K, V>.Cb f۸۷۶۲a;

    /* renamed from: b  reason: contains not printable characters */
    AbstractCh<K, V>.Cc f۸۷۶۳b;

    /* renamed from: c  reason: contains not printable characters */
    AbstractCh<K, V>.Ce f۸۷۶۴c;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract int m۱۰۶۱۷a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract Object m۱۰۶۱۸a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract V m۱۰۶۱۹a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۰۶۲۰a();

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۰۶۲۱a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۰۶۲۲a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract int m۱۰۶۲۴b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract Map<K, V> m۱۰۶۲۵b();

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public abstract int m۱۰۶۲۷c();

    AbstractCh() {
    }

    /* renamed from: a.b.g.g.h$a  reason: invalid class name */
    final class Ca<T> implements Iterator<T> {

        /* renamed from: c  reason: contains not printable characters */
        final int f۸۷۶۵c;

        /* renamed from: d  reason: contains not printable characters */
        int f۸۷۶۶d;

        /* renamed from: e  reason: contains not printable characters */
        int f۸۷۶۷e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۸۷۶۸f = false;

        Ca(int offset) {
            this.f۸۷۶۵c = offset;
            this.f۸۷۶۶d = AbstractCh.this.m۱۰۶۲۷c();
        }

        public boolean hasNext() {
            return this.f۸۷۶۷e < this.f۸۷۶۶d;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۶۷e, this.f۸۷۶۵c);
                this.f۸۷۶۷e++;
                this.f۸۷۶۸f = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f۸۷۶۸f) {
                this.f۸۷۶۷e--;
                this.f۸۷۶۶d--;
                this.f۸۷۶۸f = false;
                AbstractCh.this.m۱۰۶۲۱a(this.f۸۷۶۷e);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a.b.g.g.h$d  reason: invalid class name */
    final class Cd implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: c  reason: contains not printable characters */
        int f۸۷۷۲c;

        /* renamed from: d  reason: contains not printable characters */
        int f۸۷۷۳d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۸۷۷۴e = false;

        Cd() {
            this.f۸۷۷۲c = AbstractCh.this.m۱۰۶۲۷c() - 1;
            this.f۸۷۷۳d = -1;
        }

        public boolean hasNext() {
            return this.f۸۷۷۳d < this.f۸۷۷۲c;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f۸۷۷۳d++;
                this.f۸۷۷۴e = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f۸۷۷۴e) {
                AbstractCh.this.m۱۰۶۲۱a(this.f۸۷۷۳d);
                this.f۸۷۷۳d--;
                this.f۸۷۷۲c--;
                this.f۸۷۷۴e = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f۸۷۷۴e) {
                return (K) AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۷۳d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f۸۷۷۴e) {
                return (V) AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۷۳d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V setValue(V object) {
            if (this.f۸۷۷۴e) {
                return (V) AbstractCh.this.m۱۰۶۱۹a(this.f۸۷۷۳d, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object o) {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(o instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry<?, ?> e = (Map.Entry) o;
                if (!Cc.m۱۰۵۸۹a(e.getKey(), AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۷۳d, 0)) || !Cc.m۱۰۵۸۹a(e.getValue(), AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۷۳d, 1))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            if (this.f۸۷۷۴e) {
                int i = 0;
                Object key = AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۷۳d, 0);
                Object value = AbstractCh.this.m۱۰۶۱۸a(this.f۸۷۷۳d, 1);
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
    /* renamed from: a.b.g.g.h$b  reason: invalid class name */
    public final class Cb implements Set<Map.Entry<K, V>> {
        Cb() {
        }

        @Override // java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m۱۰۶۳۱a((Map.Entry) obj);
            throw null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۶۳۱a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.b.g.g.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int oldSize = AbstractCh.this.m۱۰۶۲۷c();
            for (Map.Entry<K, V> entry : collection) {
                AbstractCh.this.m۱۰۶۲۲a((Object) entry.getKey(), (Object) entry.getValue());
            }
            return oldSize != AbstractCh.this.m۱۰۶۲۷c();
        }

        public void clear() {
            AbstractCh.this.m۱۰۶۲۰a();
        }

        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e = (Map.Entry) o;
            int index = AbstractCh.this.m۱۰۶۱۷a(e.getKey());
            if (index < 0) {
                return false;
            }
            return Cc.m۱۰۵۸۹a(AbstractCh.this.m۱۰۶۱۸a(index, 1), e.getValue());
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
            return AbstractCh.this.m۱۰۶۲۷c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new Cd();
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
            return AbstractCh.this.m۱۰۶۲۷c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object object) {
            return AbstractCh.m۱۰۶۱۴a((Set) this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = AbstractCh.this.m۱۰۶۲۷c() - 1; i >= 0; i--) {
                int i2 = 0;
                Object key = AbstractCh.this.m۱۰۶۱۸a(i, 0);
                Object value = AbstractCh.this.m۱۰۶۱۸a(i, 1);
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
    /* renamed from: a.b.g.g.h$c  reason: invalid class name */
    public final class Cc implements Set<K> {
        Cc() {
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
            AbstractCh.this.m۱۰۶۲۰a();
        }

        public boolean contains(Object object) {
            return AbstractCh.this.m۱۰۶۱۷a(object) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return AbstractCh.m۱۰۶۱۳a((Map) AbstractCh.this.m۱۰۶۲۵b(), collection);
        }

        public boolean isEmpty() {
            return AbstractCh.this.m۱۰۶۲۷c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new Ca(0);
        }

        public boolean remove(Object object) {
            int index = AbstractCh.this.m۱۰۶۱۷a(object);
            if (index < 0) {
                return false;
            }
            AbstractCh.this.m۱۰۶۲۱a(index);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return AbstractCh.m۱۰۶۱۵b(AbstractCh.this.m۱۰۶۲۵b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return AbstractCh.m۱۰۶۱۶c(AbstractCh.this.m۱۰۶۲۵b(), collection);
        }

        public int size() {
            return AbstractCh.this.m۱۰۶۲۷c();
        }

        public Object[] toArray() {
            return AbstractCh.this.m۱۰۶۲۶b(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] array) {
            return (T[]) AbstractCh.this.m۱۰۶۲۳a(array, 0);
        }

        public boolean equals(Object object) {
            return AbstractCh.m۱۰۶۱۴a((Set) this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = AbstractCh.this.m۱۰۶۲۷c() - 1; i >= 0; i--) {
                int i2 = 0;
                Object obj = AbstractCh.this.m۱۰۶۱۸a(i, 0);
                if (obj != null) {
                    i2 = obj.hashCode();
                }
                result += i2;
            }
            return result;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.g.h$e  reason: invalid class name */
    public final class Ce implements Collection<V> {
        Ce() {
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
            AbstractCh.this.m۱۰۶۲۰a();
        }

        public boolean contains(Object object) {
            return AbstractCh.this.m۱۰۶۲۴b(object) >= 0;
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
            return AbstractCh.this.m۱۰۶۲۷c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new Ca(1);
        }

        public boolean remove(Object object) {
            int index = AbstractCh.this.m۱۰۶۲۴b(object);
            if (index < 0) {
                return false;
            }
            AbstractCh.this.m۱۰۶۲۱a(index);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int N = AbstractCh.this.m۱۰۶۲۷c();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (collection.contains(AbstractCh.this.m۱۰۶۱۸a(i, 1))) {
                    AbstractCh.this.m۱۰۶۲۱a(i);
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
            int N = AbstractCh.this.m۱۰۶۲۷c();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (!collection.contains(AbstractCh.this.m۱۰۶۱۸a(i, 1))) {
                    AbstractCh.this.m۱۰۶۲۱a(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public int size() {
            return AbstractCh.this.m۱۰۶۲۷c();
        }

        public Object[] toArray() {
            return AbstractCh.this.m۱۰۶۲۶b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            return (T[]) AbstractCh.this.m۱۰۶۲۳a(array, 1);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <K, V> boolean m۱۰۶۱۳a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static <K, V> boolean m۱۰۶۱۵b(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return oldSize != map.size();
    }

    /* renamed from: c  reason: contains not printable characters */
    public static <K, V> boolean m۱۰۶۱۶c(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    /* renamed from: b  reason: contains not printable characters */
    public Object[] m۱۰۶۲۶b(int offset) {
        int N = m۱۰۶۲۷c();
        Object[] result = new Object[N];
        for (int i = 0; i < N; i++) {
            result[i] = m۱۰۶۱۸a(i, offset);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] m۱۰۶۲۳a(T[] r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.m۱۰۶۲۷c()
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
            java.lang.Object r2 = r3.m۱۰۶۱۸a(r1, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh.m۱۰۶۲۳a(java.lang.Object[], int):java.lang.Object[]");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <T> boolean m۱۰۶۱۴a(Set<T> set, Object object) {
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
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public Set<Map.Entry<K, V>> m۱۰۶۲۸d() {
        if (this.f۸۷۶۲a == null) {
            this.f۸۷۶۲a = new Cb();
        }
        return this.f۸۷۶۲a;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Set<K> m۱۰۶۲۹e() {
        if (this.f۸۷۶۳b == null) {
            this.f۸۷۶۳b = new Cc();
        }
        return this.f۸۷۶۳b;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Collection<V> m۱۰۶۳۰f() {
        if (this.f۸۷۶۴c == null) {
            this.f۸۷۶۴c = new Ce();
        }
        return this.f۸۷۶۴c;
    }
}
