package p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b;

import android.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.a.a.b.b  reason: invalid class name */
public class Cb<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c  reason: contains not printable characters */
    private Cd<K, V> f۸۲۳۵c;

    /* renamed from: d  reason: contains not printable characters */
    private Cd<K, V> f۸۲۳۶d;

    /* renamed from: e  reason: contains not printable characters */
    private WeakHashMap<AbstractCg<K, V>, Boolean> f۸۲۳۷e = new WeakHashMap<>();

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۲۳۸f = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.b$g  reason: invalid class name */
    public interface AbstractCg<K, V> {
        /* renamed from: a  reason: contains not printable characters */
        void m۹۹۴۲a(Cd<K, V> dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Cd<K, V> m۹۹۲۶a(K k) {
        SafeIterableMap.Entry<K, V> currentNode = this.f۸۲۳۵c;
        while (currentNode != null && !currentNode.f۸۲۳۹c.equals(k)) {
            currentNode = currentNode.f۸۲۴۱e;
        }
        return currentNode;
    }

    /* renamed from: b  reason: contains not printable characters */
    public V m۹۹۲۹b(K key, V v) {
        SafeIterableMap.Entry<K, V> entry = m۹۹۲۶a((Object) key);
        if (entry != null) {
            return entry.f۸۲۴۰d;
        }
        m۹۹۲۷a(key, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Cd<K, V> m۹۹۲۷a(K key, V v) {
        SafeIterableMap.Entry<K, V> newEntry = new Cd<>(key, v);
        this.f۸۲۳۸f++;
        Cd<K, V> dVar = this.f۸۲۳۶d;
        if (dVar == null) {
            this.f۸۲۳۵c = newEntry;
            this.f۸۲۳۶d = this.f۸۲۳۵c;
            return newEntry;
        }
        dVar.f۸۲۴۱e = newEntry;
        newEntry.f۸۲۴۲f = dVar;
        this.f۸۲۳۶d = newEntry;
        return newEntry;
    }

    public V remove(K key) {
        Cd<K, V> toRemove = m۹۹۲۶a((Object) key);
        if (toRemove == null) {
            return null;
        }
        this.f۸۲۳۸f--;
        if (!this.f۸۲۳۷e.isEmpty()) {
            Iterator<AbstractCg<K, V>> it = this.f۸۲۳۷e.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractCg) it.next()).m۹۹۴۲a(toRemove);
            }
        }
        Cd<K, V> dVar = toRemove.f۸۲۴۲f;
        if (dVar != null) {
            dVar.f۸۲۴۱e = toRemove.f۸۲۴۱e;
        } else {
            this.f۸۲۳۵c = toRemove.f۸۲۴۱e;
        }
        Cd<K, V> dVar2 = toRemove.f۸۲۴۱e;
        if (dVar2 != null) {
            dVar2.f۸۲۴۲f = toRemove.f۸۲۴۲f;
        } else {
            this.f۸۲۳۶d = toRemove.f۸۲۴۲f;
        }
        toRemove.f۸۲۴۱e = null;
        toRemove.f۸۲۴۲f = null;
        return toRemove.f۸۲۴۰d;
    }

    public int size() {
        return this.f۸۲۳۸f;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        SafeIterableMap.ListIterator<K, V> iterator = new Cb<>(this.f۸۲۳۵c, this.f۸۲۳۶d);
        this.f۸۲۳۷e.put(iterator, false);
        return iterator;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Iterator<Map.Entry<K, V>> m۹۹۲۸a() {
        SafeIterableMap.DescendingIterator<K, V> iterator = new Cc<>(this.f۸۲۳۶d, this.f۸۲۳۵c);
        this.f۸۲۳۷e.put(iterator, false);
        return iterator;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cb<K, V>.Ce m۹۹۳۱c() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new Ce();
        this.f۸۲۳۷e.put(iterator, false);
        return iterator;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Map.Entry<K, V> m۹۹۳۰b() {
        return this.f۸۲۳۵c;
    }

    /* renamed from: d  reason: contains not printable characters */
    public Map.Entry<K, V> m۹۹۳۲d() {
        return this.f۸۲۳۶d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cb)) {
            return false;
        }
        Cb map = (Cb) obj;
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

    /* renamed from: a.a.a.b.b$f  reason: invalid class name */
    private static abstract class AbstractCf<K, V> implements Iterator<Map.Entry<K, V>>, AbstractCg<K, V> {

        /* renamed from: c  reason: contains not printable characters */
        Cd<K, V> f۸۲۴۶c;

        /* renamed from: d  reason: contains not printable characters */
        Cd<K, V> f۸۲۴۷d;

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public abstract Cd<K, V> m۹۹۴۰b(Cd<K, V> dVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public abstract Cd<K, V> m۹۹۴۱c(Cd<K, V> dVar);

        AbstractCf(Cd<K, V> dVar, Cd<K, V> dVar2) {
            this.f۸۲۴۶c = dVar2;
            this.f۸۲۴۷d = dVar;
        }

        public boolean hasNext() {
            return this.f۸۲۴۷d != null;
        }

        @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public void m۹۹۳۹a(Cd<K, V> dVar) {
            if (this.f۸۲۴۶c == dVar && dVar == this.f۸۲۴۷d) {
                this.f۸۲۴۷d = null;
                this.f۸۲۴۶c = null;
            }
            Cd<K, V> dVar2 = this.f۸۲۴۶c;
            if (dVar2 == dVar) {
                this.f۸۲۴۶c = m۹۹۴۰b(dVar2);
            }
            if (this.f۸۲۴۷d == dVar) {
                this.f۸۲۴۷d = m۹۹۳۸a();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private Cd<K, V> m۹۹۳۸a() {
            Cd<K, V> dVar = this.f۸۲۴۷d;
            Cd<K, V> dVar2 = this.f۸۲۴۶c;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return m۹۹۴۱c(dVar);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.f۸۲۴۷d;
            this.f۸۲۴۷d = m۹۹۳۸a();
            return result;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.b$b  reason: invalid class name */
    public static class Cb<K, V> extends AbstractCf<K, V> {
        Cb(Cd<K, V> dVar, Cd<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb.AbstractCf
        /* renamed from: c  reason: contains not printable characters */
        public Cd<K, V> m۹۹۳۴c(Cd<K, V> dVar) {
            return dVar.f۸۲۴۱e;
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public Cd<K, V> m۹۹۳۳b(Cd<K, V> dVar) {
            return dVar.f۸۲۴۲f;
        }
    }

    /* renamed from: a.a.a.b.b$c  reason: invalid class name */
    private static class Cc<K, V> extends AbstractCf<K, V> {
        Cc(Cd<K, V> dVar, Cd<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb.AbstractCf
        /* renamed from: c  reason: contains not printable characters */
        public Cd<K, V> m۹۹۳۶c(Cd<K, V> dVar) {
            return dVar.f۸۲۴۲f;
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public Cd<K, V> m۹۹۳۵b(Cd<K, V> dVar) {
            return dVar.f۸۲۴۱e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.a.a.b.b$e  reason: invalid class name */
    public class Ce implements Iterator<Map.Entry<K, V>>, AbstractCg<K, V> {

        /* renamed from: c  reason: contains not printable characters */
        private Cd<K, V> f۸۲۴۳c;

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۸۲۴۴d;

        private Ce() {
            this.f۸۲۴۴d = true;
        }

        @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public void m۹۹۳۷a(Cd<K, V> dVar) {
            Cd<K, V> dVar2 = this.f۸۲۴۳c;
            if (dVar == dVar2) {
                this.f۸۲۴۳c = dVar2.f۸۲۴۲f;
                this.f۸۲۴۴d = this.f۸۲۴۳c == null;
            }
        }

        public boolean hasNext() {
            if (!this.f۸۲۴۴d) {
                Cd<K, V> dVar = this.f۸۲۴۳c;
                if (dVar == null || dVar.f۸۲۴۱e == null) {
                    return false;
                }
                return true;
            } else if (Cb.this.f۸۲۳۵c != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f۸۲۴۴d) {
                this.f۸۲۴۴d = false;
                this.f۸۲۴۳c = Cb.this.f۸۲۳۵c;
            } else {
                Cd<K, V> dVar = this.f۸۲۴۳c;
                this.f۸۲۴۳c = dVar != null ? dVar.f۸۲۴۱e : null;
            }
            return this.f۸۲۴۳c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.b$d  reason: invalid class name */
    public static class Cd<K, V> implements Map.Entry<K, V> {

        /* renamed from: c  reason: contains not printable characters */
        final K f۸۲۳۹c;

        /* renamed from: d  reason: contains not printable characters */
        final V f۸۲۴۰d;

        /* renamed from: e  reason: contains not printable characters */
        Cd<K, V> f۸۲۴۱e;

        /* renamed from: f  reason: contains not printable characters */
        Cd<K, V> f۸۲۴۲f;

        Cd(K key, V value) {
            this.f۸۲۳۹c = key;
            this.f۸۲۴۰d = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f۸۲۳۹c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f۸۲۴۰d;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f۸۲۳۹c) + "=" + ((Object) this.f۸۲۴۰d);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Cd)) {
                return false;
            }
            Cd entry = (Cd) obj;
            if (!this.f۸۲۳۹c.equals(entry.f۸۲۳۹c) || !this.f۸۲۴۰d.equals(entry.f۸۲۴۰d)) {
                return false;
            }
            return true;
        }
    }
}
