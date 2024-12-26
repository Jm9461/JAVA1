package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.b.g.g.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
abstract class AbstractCh<K, V> {

    /* renamed from: a, reason: contains not printable characters */
    AbstractCh<K, V>.b f۸۷۶۲a;

    /* renamed from: b, reason: contains not printable characters */
    AbstractCh<K, V>.c f۸۷۶۳b;

    /* renamed from: c, reason: contains not printable characters */
    AbstractCh<K, V>.e f۸۷۶۴c;

    /* renamed from: a, reason: contains not printable characters */
    protected abstract int mo۸۵۴۷a(Object obj);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract Object mo۸۵۴۸a(int i, int i2);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract V mo۸۵۴۹a(int i, V v);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۸۵۵۰a();

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۸۵۵۱a(int i);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۸۵۵۲a(K k, V v);

    /* renamed from: b, reason: contains not printable characters */
    protected abstract int mo۸۵۵۴b(Object obj);

    /* renamed from: b, reason: contains not printable characters */
    protected abstract Map<K, V> mo۸۵۵۵b();

    /* renamed from: c, reason: contains not printable characters */
    protected abstract int mo۸۵۵۷c();

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h != android.support.v4.util.MapCollections<K, V> */
    AbstractCh() {
    }

    /* renamed from: a.b.g.g.h$a */
    final class a<T> implements Iterator<T> {

        /* renamed from: c, reason: contains not printable characters */
        final int f۸۷۶۵c;

        /* renamed from: d, reason: contains not printable characters */
        int f۸۷۶۶d;

        /* renamed from: e, reason: contains not printable characters */
        int f۸۷۶۷e;

        /* renamed from: f, reason: contains not printable characters */
        boolean f۸۷۶۸f = false;

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$a != android.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
        a(int offset) {
            this.f۸۷۶۵c = offset;
            this.f۸۷۶۶d = AbstractCh.this.mo۸۵۵۷c();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$a != android.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f۸۷۶۷e < this.f۸۷۶۶d;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$a != android.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractCh.this.mo۸۵۴۸a(this.f۸۷۶۷e, this.f۸۷۶۵c);
            this.f۸۷۶۷e++;
            this.f۸۷۶۸f = true;
            return t;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$a != android.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
        @Override // java.util.Iterator
        public void remove() {
            if (!this.f۸۷۶۸f) {
                throw new IllegalStateException();
            }
            this.f۸۷۶۷e--;
            this.f۸۷۶۶d--;
            this.f۸۷۶۸f = false;
            AbstractCh.this.mo۸۵۵۱a(this.f۸۷۶۷e);
        }
    }

    /* renamed from: a.b.g.g.h$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: c, reason: contains not printable characters */
        int f۸۷۷۲c;

        /* renamed from: e, reason: contains not printable characters */
        boolean f۸۷۷۴e = false;

        /* renamed from: d, reason: contains not printable characters */
        int f۸۷۷۳d = -1;

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            next();
            return this;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        d() {
            this.f۸۷۷۲c = AbstractCh.this.mo۸۵۵۷c() - 1;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f۸۷۷۳d < this.f۸۷۷۲c;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f۸۷۷۳d++;
            this.f۸۷۷۴e = true;
            return this;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Iterator
        public void remove() {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException();
            }
            AbstractCh.this.mo۸۵۵۱a(this.f۸۷۷۳d);
            this.f۸۷۷۳d--;
            this.f۸۷۷۲c--;
            this.f۸۷۷۴e = false;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) AbstractCh.this.mo۸۵۴۸a(this.f۸۷۷۳d, 0);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractCh.this.mo۸۵۴۸a(this.f۸۷۷۳d, 1);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractCh.this.mo۸۵۴۹a(this.f۸۷۷۳d, (int) v);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Map.Entry
        public boolean equals(Object o) {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e2 = (Map.Entry) o;
            return Cc.m۸۵۱۸a(e2.getKey(), AbstractCh.this.mo۸۵۴۸a(this.f۸۷۷۳d, 0)) && Cc.m۸۵۱۸a(e2.getValue(), AbstractCh.this.mo۸۵۴۸a(this.f۸۷۷۳d, 1));
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f۸۷۷۴e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object key = AbstractCh.this.mo۸۵۴۸a(this.f۸۷۷۳d, 0);
            Object value = AbstractCh.this.mo۸۵۴۸a(this.f۸۷۷۳d, 1);
            return (value != null ? value.hashCode() : 0) ^ (key == null ? 0 : key.hashCode());
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$d != android.support.v4.util.MapCollections<K, V>$MapIterator */
        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: a.b.g.g.h$b */
    final class b implements Set<Map.Entry<K, V>> {
        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        b() {
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m۸۵۶۱a((Map.Entry) obj);
            throw null;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        /* renamed from: a, reason: contains not printable characters */
        public boolean m۸۵۶۱a(Map.Entry<K, V> object) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int oldSize = AbstractCh.this.mo۸۵۵۷c();
            for (Map.Entry<K, V> entry : collection) {
                AbstractCh.this.mo۸۵۵۲a((AbstractCh) entry.getKey(), (K) entry.getValue());
            }
            return oldSize != AbstractCh.this.mo۸۵۵۷c();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractCh.this.mo۸۵۵۰a();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e2 = (Map.Entry) o;
            int index = AbstractCh.this.mo۸۵۴۷a(e2.getKey());
            if (index < 0) {
                return false;
            }
            Object foundVal = AbstractCh.this.mo۸۵۴۸a(index, 1);
            return Cc.m۸۵۱۸a(foundVal, e2.getValue());
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractCh.this.mo۸۵۵۷c() == 0;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractCh.this.mo۸۵۵۷c();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object object) {
            return AbstractCh.m۸۵۴۴a((Set) this, object);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$b != android.support.v4.util.MapCollections<K, V>$EntrySet */
        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int result = 0;
            for (int i = AbstractCh.this.mo۸۵۵۷c() - 1; i >= 0; i--) {
                int i2 = 0;
                Object key = AbstractCh.this.mo۸۵۴۸a(i, 0);
                Object value = AbstractCh.this.mo۸۵۴۸a(i, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i2 = value.hashCode();
                }
                result += i2 ^ hashCode;
            }
            return result;
        }
    }

    /* renamed from: a.b.g.g.h$c */
    final class c implements Set<K> {
        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        c() {
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean add(K object) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractCh.this.mo۸۵۵۰a();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object object) {
            return AbstractCh.this.mo۸۵۴۷a(object) >= 0;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractCh.m۸۵۴۳a((Map) AbstractCh.this.mo۸۵۵۵b(), collection);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractCh.this.mo۸۵۵۷c() == 0;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object object) {
            int index = AbstractCh.this.mo۸۵۴۷a(object);
            if (index >= 0) {
                AbstractCh.this.mo۸۵۵۱a(index);
                return true;
            }
            return false;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractCh.m۸۵۴۵b(AbstractCh.this.mo۸۵۵۵b(), collection);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractCh.m۸۵۴۶c(AbstractCh.this.mo۸۵۵۵b(), collection);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractCh.this.mo۸۵۵۷c();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractCh.this.m۸۵۵۶b(0);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractCh.this.m۸۵۵۳a(tArr, 0);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object object) {
            return AbstractCh.m۸۵۴۴a((Set) this, object);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$c != android.support.v4.util.MapCollections<K, V>$KeySet */
        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int result = 0;
            for (int i = AbstractCh.this.mo۸۵۵۷c() - 1; i >= 0; i--) {
                int i2 = 0;
                Object obj = AbstractCh.this.mo۸۵۴۸a(i, 0);
                if (obj != null) {
                    i2 = obj.hashCode();
                }
                result += i2;
            }
            return result;
        }
    }

    /* renamed from: a.b.g.g.h$e */
    final class e implements Collection<V> {
        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        e() {
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean add(V object) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public void clear() {
            AbstractCh.this.mo۸۵۵۰a();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean contains(Object object) {
            return AbstractCh.this.mo۸۵۵۴b(object) >= 0;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
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

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractCh.this.mo۸۵۵۷c() == 0;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean remove(Object object) {
            int index = AbstractCh.this.mo۸۵۵۴b(object);
            if (index >= 0) {
                AbstractCh.this.mo۸۵۵۱a(index);
                return true;
            }
            return false;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int N = AbstractCh.this.mo۸۵۵۷c();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                Object cur = AbstractCh.this.mo۸۵۴۸a(i, 1);
                if (collection.contains(cur)) {
                    AbstractCh.this.mo۸۵۵۱a(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int N = AbstractCh.this.mo۸۵۵۷c();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                Object cur = AbstractCh.this.mo۸۵۴۸a(i, 1);
                if (!collection.contains(cur)) {
                    AbstractCh.this.mo۸۵۵۱a(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public int size() {
            return AbstractCh.this.mo۸۵۵۷c();
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractCh.this.m۸۵۵۶b(1);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h$e != android.support.v4.util.MapCollections<K, V>$ValuesCollection */
        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractCh.this.m۸۵۵۳a(tArr, 1);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static <K, V> boolean m۸۵۴۳a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static <K, V> boolean m۸۵۴۵b(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return oldSize != map.size();
    }

    /* renamed from: c, reason: contains not printable characters */
    public static <K, V> boolean m۸۵۴۶c(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h != android.support.v4.util.MapCollections<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    public Object[] m۸۵۵۶b(int offset) {
        int N = mo۸۵۵۷c();
        Object[] result = new Object[N];
        for (int i = 0; i < N; i++) {
            result[i] = mo۸۵۴۸a(i, offset);
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h != android.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* renamed from: a, reason: contains not printable characters */
    public <T> T[] m۸۵۵۳a(T[] tArr, int i) {
        int i2 = mo۸۵۵۷c();
        if (tArr.length < i2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = mo۸۵۴۸a(i3, i);
        }
        if (tArr.length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static <T> boolean m۸۵۴۴a(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s = (Set) object;
        try {
            if (set.size() == s.size()) {
                if (set.containsAll(s)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException e2) {
            return false;
        } catch (NullPointerException e3) {
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h != android.support.v4.util.MapCollections<K, V> */
    /* renamed from: d, reason: contains not printable characters */
    public Set<Map.Entry<K, V>> m۸۵۵۸d() {
        if (this.f۸۷۶۲a == null) {
            this.f۸۷۶۲a = new b();
        }
        return this.f۸۷۶۲a;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h != android.support.v4.util.MapCollections<K, V> */
    /* renamed from: e, reason: contains not printable characters */
    public Set<K> m۸۵۵۹e() {
        if (this.f۸۷۶۳b == null) {
            this.f۸۷۶۳b = new c();
        }
        return this.f۸۷۶۳b;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.h != android.support.v4.util.MapCollections<K, V> */
    /* renamed from: f, reason: contains not printable characters */
    public Collection<V> m۸۵۶۰f() {
        if (this.f۸۷۶۴c == null) {
            this.f۸۷۶۴c = new e();
        }
        return this.f۸۷۶۴c;
    }
}
