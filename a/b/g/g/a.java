package a.b.g.g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends n<K, V> implements Map<K, V> {
    h<K, V> j;

    public a() {
    }

    public a(int capacity) {
        super(capacity);
    }

    public a(n map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.g.a$a  reason: collision with other inner class name */
    public class C۰۰۱۶a extends h<K, V> {
        C۰۰۱۶a() {
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public int c() {
            return a.this.f۴۱۷e;
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public Object a(int index, int offset) {
            return a.this.f۴۱۶d[(index << 1) + offset];
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public int a(Object key) {
            return a.this.a(key);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public int b(Object value) {
            return a.this.b(value);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public Map<K, V> b() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public void a(K key, V value) {
            a.this.put(key, value);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public V a(int index, V value) {
            return (V) a.this.a(index, value);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public void a(int index) {
            a.this.c(index);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.g.h
        public void a() {
            a.this.clear();
        }
    }

    private h<K, V> b() {
        if (this.j == null) {
            this.j = new C۰۰۱۶a();
        }
        return this.j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.b.g.g.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f۴۱۷e + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(Collection<?> collection) {
        return h.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
