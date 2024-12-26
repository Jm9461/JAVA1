package p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.a.a.b.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c, reason: contains not printable characters */
    private d<K, V> f۸۲۳۵c;

    /* renamed from: d, reason: contains not printable characters */
    private d<K, V> f۸۲۳۶d;

    /* renamed from: e, reason: contains not printable characters */
    private WeakHashMap<g<K, V>, Boolean> f۸۲۳۷e = new WeakHashMap<>();

    /* renamed from: f, reason: contains not printable characters */
    private int f۸۲۳۸f = 0;

    /* renamed from: a.a.a.b.b$g */
    interface g<K, V> {
        /* renamed from: a, reason: contains not printable characters */
        void mo۷۸۷۵a(d<K, V> dVar);
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    protected d<K, V> mo۷۸۵۹a(K k) {
        d<K, V> dVar = this.f۸۲۳۵c;
        while (dVar != null && !dVar.f۸۲۳۹c.equals(k)) {
            dVar = dVar.f۸۲۴۱e;
        }
        return dVar;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    public V mo۷۸۶۲b(K key, V v) {
        d<K, V> dVar = mo۷۸۵۹a((Cb<K, V>) key);
        if (dVar != null) {
            return dVar.f۸۲۴۰d;
        }
        m۷۸۶۰a(key, v);
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    protected d<K, V> m۷۸۶۰a(K key, V v) {
        d<K, V> dVar = new d<>(key, v);
        this.f۸۲۳۸f++;
        d<K, V> dVar2 = this.f۸۲۳۶d;
        if (dVar2 == null) {
            this.f۸۲۳۵c = dVar;
            this.f۸۲۳۶d = this.f۸۲۳۵c;
            return dVar;
        }
        dVar2.f۸۲۴۱e = dVar;
        dVar.f۸۲۴۲f = dVar2;
        this.f۸۲۳۶d = dVar;
        return dVar;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$g != android.arch.core.internal.SafeIterableMap$SupportRemove<K, V> */
    public V remove(K key) {
        d<K, V> dVar = mo۷۸۵۹a((Cb<K, V>) key);
        if (dVar == null) {
            return null;
        }
        this.f۸۲۳۸f--;
        if (!this.f۸۲۳۷e.isEmpty()) {
            Iterator<g<K, V>> it = this.f۸۲۳۷e.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo۷۸۷۵a(dVar);
            }
        }
        d<K, V> dVar2 = dVar.f۸۲۴۲f;
        if (dVar2 != null) {
            dVar2.f۸۲۴۱e = dVar.f۸۲۴۱e;
        } else {
            this.f۸۲۳۵c = dVar.f۸۲۴۱e;
        }
        d<K, V> dVar3 = dVar.f۸۲۴۱e;
        if (dVar3 != null) {
            dVar3.f۸۲۴۲f = dVar.f۸۲۴۲f;
        } else {
            this.f۸۲۳۶d = dVar.f۸۲۴۲f;
        }
        dVar.f۸۲۴۱e = null;
        dVar.f۸۲۴۲f = null;
        return dVar.f۸۲۴۰d;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    public int size() {
        return this.f۸۲۳۸f;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$f != android.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        b bVar = new b(this.f۸۲۳۵c, this.f۸۲۳۶d);
        this.f۸۲۳۷e.put(bVar, false);
        return bVar;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$c != android.arch.core.internal.SafeIterableMap$DescendingIterator<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public Iterator<Map.Entry<K, V>> m۷۸۶۱a() {
        c cVar = new c(this.f۸۲۳۶d, this.f۸۲۳۵c);
        this.f۸۲۳۷e.put(cVar, false);
        return cVar;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$e != android.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
    /* renamed from: c, reason: contains not printable characters */
    public Cb<K, V>.e m۷۸۶۴c() {
        Cb<K, V>.e eVar = new e();
        this.f۸۲۳۷e.put(eVar, false);
        return eVar;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    public Map.Entry<K, V> m۷۸۶۳b() {
        return this.f۸۲۳۵c;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
    /* renamed from: d, reason: contains not printable characters */
    public Map.Entry<K, V> m۷۸۶۵d() {
        return this.f۸۲۳۶d;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
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
        return (iterator1.hasNext() || iterator2.hasNext()) ? false : true;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b != android.arch.core.internal.SafeIterableMap<K, V> */
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

    /* renamed from: a.a.a.b.b$f */
    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: c, reason: contains not printable characters */
        d<K, V> f۸۲۴۶c;

        /* renamed from: d, reason: contains not printable characters */
        d<K, V> f۸۲۴۷d;

        /* renamed from: b, reason: contains not printable characters */
        abstract d<K, V> mo۷۸۷۳b(d<K, V> dVar);

        /* renamed from: c, reason: contains not printable characters */
        abstract d<K, V> mo۷۸۷۴c(d<K, V> dVar);

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$f != android.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
        f(d<K, V> dVar, d<K, V> dVar2) {
            this.f۸۲۴۶c = dVar2;
            this.f۸۲۴۷d = dVar;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$f != android.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f۸۲۴۷d != null;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$f != android.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
        @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb.g
        /* renamed from: a, reason: contains not printable characters */
        public void mo۷۸۷۵a(d<K, V> dVar) {
            if (this.f۸۲۴۶c == dVar && dVar == this.f۸۲۴۷d) {
                this.f۸۲۴۷d = null;
                this.f۸۲۴۶c = null;
            }
            d<K, V> dVar2 = this.f۸۲۴۶c;
            if (dVar2 == dVar) {
                this.f۸۲۴۶c = mo۷۸۷۳b(dVar2);
            }
            if (this.f۸۲۴۷d == dVar) {
                this.f۸۲۴۷d = m۷۸۷۱a();
            }
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$f != android.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
        /* renamed from: a, reason: contains not printable characters */
        private d<K, V> m۷۸۷۱a() {
            d<K, V> dVar = this.f۸۲۴۷d;
            d<K, V> dVar2 = this.f۸۲۴۶c;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return mo۷۸۷۴c(dVar);
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$f != android.arch.core.internal.SafeIterableMap$ListIterator<K, V> */
        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.f۸۲۴۷d;
            this.f۸۲۴۷d = m۷۸۷۱a();
            return result;
        }
    }

    /* renamed from: a.a.a.b.b$b */
    static class b<K, V> extends f<K, V> {
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$b != android.arch.core.internal.SafeIterableMap$AscendingIterator<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$b != android.arch.core.internal.SafeIterableMap$AscendingIterator<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb.f
        /* renamed from: c, reason: contains not printable characters */
        d<K, V> mo۷۸۷۴c(d<K, V> dVar) {
            return dVar.f۸۲۴۱e;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$b != android.arch.core.internal.SafeIterableMap$AscendingIterator<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb.f
        /* renamed from: b, reason: contains not printable characters */
        d<K, V> mo۷۸۷۳b(d<K, V> dVar) {
            return dVar.f۸۲۴۲f;
        }
    }

    /* renamed from: a.a.a.b.b$c */
    private static class c<K, V> extends f<K, V> {
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$c != android.arch.core.internal.SafeIterableMap$DescendingIterator<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$c != android.arch.core.internal.SafeIterableMap$DescendingIterator<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb.f
        /* renamed from: c, reason: contains not printable characters */
        d<K, V> mo۷۸۷۴c(d<K, V> dVar) {
            return dVar.f۸۲۴۲f;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$c != android.arch.core.internal.SafeIterableMap$DescendingIterator<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb.f
        /* renamed from: b, reason: contains not printable characters */
        d<K, V> mo۷۸۷۳b(d<K, V> dVar) {
            return dVar.f۸۲۴۱e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.a.b.b$e */
    public class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: c, reason: contains not printable characters */
        private d<K, V> f۸۲۴۳c;

        /* renamed from: d, reason: contains not printable characters */
        private boolean f۸۲۴۴d;

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$e != android.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
        private e() {
            this.f۸۲۴۴d = true;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$e != android.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
        @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb.g
        /* renamed from: a, reason: contains not printable characters */
        public void mo۷۸۷۵a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f۸۲۴۳c;
            if (dVar == dVar2) {
                this.f۸۲۴۳c = dVar2.f۸۲۴۲f;
                this.f۸۲۴۴d = this.f۸۲۴۳c == null;
            }
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$e != android.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f۸۲۴۴d) {
                return Cb.this.f۸۲۳۵c != null;
            }
            d<K, V> dVar = this.f۸۲۴۳c;
            return (dVar == null || dVar.f۸۲۴۱e == null) ? false : true;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$e != android.arch.core.internal.SafeIterableMap<K, V>$IteratorWithAdditions */
        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f۸۲۴۴d) {
                this.f۸۲۴۴d = false;
                this.f۸۲۴۳c = Cb.this.f۸۲۳۵c;
            } else {
                d<K, V> dVar = this.f۸۲۴۳c;
                this.f۸۲۴۳c = dVar != null ? dVar.f۸۲۴۱e : null;
            }
            return this.f۸۲۴۳c;
        }
    }

    /* renamed from: a.a.a.b.b$d */
    static class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: c, reason: contains not printable characters */
        final K f۸۲۳۹c;

        /* renamed from: d, reason: contains not printable characters */
        final V f۸۲۴۰d;

        /* renamed from: e, reason: contains not printable characters */
        d<K, V> f۸۲۴۱e;

        /* renamed from: f, reason: contains not printable characters */
        d<K, V> f۸۲۴۲f;

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        d(K key, V value) {
            this.f۸۲۳۹c = key;
            this.f۸۲۴۰d = value;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f۸۲۳۹c;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f۸۲۴۰d;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // java.util.Map.Entry
        public V setValue(V value) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        public String toString() {
            return this.f۸۲۳۹c + "=" + this.f۸۲۴۰d;
        }

        /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d entry = (d) obj;
            return this.f۸۲۳۹c.equals(entry.f۸۲۳۹c) && this.f۸۲۴۰d.equals(entry.f۸۲۴۰d);
        }
    }
}
