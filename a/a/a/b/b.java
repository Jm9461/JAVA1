package a.a.a.b;

import android.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private d<K, V> f۷c;

    /* renamed from: d  reason: collision with root package name */
    private d<K, V> f۸d;

    /* renamed from: e  reason: collision with root package name */
    private WeakHashMap<g<K, V>, Boolean> f۹e = new WeakHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private int f۱۰f = 0;

    /* access modifiers changed from: package-private */
    public interface g<K, V> {
        void a(d<K, V> dVar);
    }

    /* access modifiers changed from: protected */
    public d<K, V> a(K k) {
        SafeIterableMap.Entry<K, V> currentNode = this.f۷c;
        while (currentNode != null && !currentNode.f۱۱c.equals(k)) {
            currentNode = currentNode.f۱۳e;
        }
        return currentNode;
    }

    public V b(K key, V v) {
        SafeIterableMap.Entry<K, V> entry = a((Object) key);
        if (entry != null) {
            return entry.f۱۲d;
        }
        a(key, v);
        return null;
    }

    /* access modifiers changed from: protected */
    public d<K, V> a(K key, V v) {
        SafeIterableMap.Entry<K, V> newEntry = new d<>(key, v);
        this.f۱۰f++;
        d<K, V> dVar = this.f۸d;
        if (dVar == null) {
            this.f۷c = newEntry;
            this.f۸d = this.f۷c;
            return newEntry;
        }
        dVar.f۱۳e = newEntry;
        newEntry.f۱۴f = dVar;
        this.f۸d = newEntry;
        return newEntry;
    }

    public V remove(K key) {
        d<K, V> toRemove = a((Object) key);
        if (toRemove == null) {
            return null;
        }
        this.f۱۰f--;
        if (!this.f۹e.isEmpty()) {
            Iterator<g<K, V>> it = this.f۹e.keySet().iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(toRemove);
            }
        }
        d<K, V> dVar = toRemove.f۱۴f;
        if (dVar != null) {
            dVar.f۱۳e = toRemove.f۱۳e;
        } else {
            this.f۷c = toRemove.f۱۳e;
        }
        d<K, V> dVar2 = toRemove.f۱۳e;
        if (dVar2 != null) {
            dVar2.f۱۴f = toRemove.f۱۴f;
        } else {
            this.f۸d = toRemove.f۱۴f;
        }
        toRemove.f۱۳e = null;
        toRemove.f۱۴f = null;
        return toRemove.f۱۲d;
    }

    public int size() {
        return this.f۱۰f;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        SafeIterableMap.ListIterator<K, V> iterator = new C۰۰۰۱b<>(this.f۷c, this.f۸d);
        this.f۹e.put(iterator, false);
        return iterator;
    }

    public Iterator<Map.Entry<K, V>> a() {
        SafeIterableMap.DescendingIterator<K, V> iterator = new c<>(this.f۸d, this.f۷c);
        this.f۹e.put(iterator, false);
        return iterator;
    }

    public b<K, V>.e c() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new e();
        this.f۹e.put(iterator, false);
        return iterator;
    }

    public Map.Entry<K, V> b() {
        return this.f۷c;
    }

    public Map.Entry<K, V> d() {
        return this.f۸d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b map = (b) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator1 = iterator();
        Iterator iterator2 = map.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            Map.Entry<K, V> next1 = iterator1.next();
            Object next2 = iterator2.next();
            if ((next1 == null && next2 != null) || (next1 != null && !next1.equals(next2))) {
                return false;
            }
        }
        if (iterator1.hasNext() || iterator2.hasNext()) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator<Map.Entry<K, V>> iterator = iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next().toString());
            if (iterator.hasNext()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f۱۸c;

        /* renamed from: d  reason: collision with root package name */
        d<K, V> f۱۹d;

        /* access modifiers changed from: package-private */
        public abstract d<K, V> b(d<K, V> dVar);

        /* access modifiers changed from: package-private */
        public abstract d<K, V> c(d<K, V> dVar);

        f(d<K, V> dVar, d<K, V> dVar2) {
            this.f۱۸c = dVar2;
            this.f۱۹d = dVar;
        }

        public boolean hasNext() {
            return this.f۱۹d != null;
        }

        @Override // a.a.a.b.b.g
        public void a(d<K, V> dVar) {
            if (this.f۱۸c == dVar && dVar == this.f۱۹d) {
                this.f۱۹d = null;
                this.f۱۸c = null;
            }
            d<K, V> dVar2 = this.f۱۸c;
            if (dVar2 == dVar) {
                this.f۱۸c = b(dVar2);
            }
            if (this.f۱۹d == dVar) {
                this.f۱۹d = a();
            }
        }

        private d<K, V> a() {
            d<K, V> dVar = this.f۱۹d;
            d<K, V> dVar2 = this.f۱۸c;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return c(dVar);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.f۱۹d;
            this.f۱۹d = a();
            return result;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.b$b  reason: collision with other inner class name */
    public static class C۰۰۰۱b<K, V> extends f<K, V> {
        C۰۰۰۱b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.f
        public d<K, V> c(d<K, V> dVar) {
            return dVar.f۱۳e;
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.f
        public d<K, V> b(d<K, V> dVar) {
            return dVar.f۱۴f;
        }
    }

    private static class c<K, V> extends f<K, V> {
        c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.f
        public d<K, V> c(d<K, V> dVar) {
            return dVar.f۱۴f;
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.a.b.b.f
        public d<K, V> b(d<K, V> dVar) {
            return dVar.f۱۳e;
        }
    }

    /* access modifiers changed from: private */
    public class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: c  reason: collision with root package name */
        private d<K, V> f۱۵c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f۱۶d;

        private e() {
            this.f۱۶d = true;
        }

        @Override // a.a.a.b.b.g
        public void a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f۱۵c;
            if (dVar == dVar2) {
                this.f۱۵c = dVar2.f۱۴f;
                this.f۱۶d = this.f۱۵c == null;
            }
        }

        public boolean hasNext() {
            if (!this.f۱۶d) {
                d<K, V> dVar = this.f۱۵c;
                if (dVar == null || dVar.f۱۳e == null) {
                    return false;
                }
                return true;
            } else if (b.this.f۷c != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f۱۶d) {
                this.f۱۶d = false;
                this.f۱۵c = b.this.f۷c;
            } else {
                d<K, V> dVar = this.f۱۵c;
                this.f۱۵c = dVar != null ? dVar.f۱۳e : null;
            }
            return this.f۱۵c;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        final K f۱۱c;

        /* renamed from: d  reason: collision with root package name */
        final V f۱۲d;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f۱۳e;

        /* renamed from: f  reason: collision with root package name */
        d<K, V> f۱۴f;

        d(K key, V value) {
            this.f۱۱c = key;
            this.f۱۲d = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f۱۱c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f۱۲d;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f۱۱c) + "=" + ((Object) this.f۱۲d);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d entry = (d) obj;
            if (!this.f۱۱c.equals(entry.f۱۱c) || !this.f۱۲d.equals(entry.f۱۲d)) {
                return false;
            }
            return true;
        }
    }
}
