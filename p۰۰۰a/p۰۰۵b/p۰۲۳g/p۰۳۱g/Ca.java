package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: a.b.g.g.a  reason: invalid class name */
public class Ca<K, V> extends Cn<K, V> implements Map<K, V> {

    /* renamed from: j  reason: contains not printable characters */
    AbstractCh<K, V> f۸۷۳۱j;

    public Ca() {
    }

    public Ca(int capacity) {
        super(capacity);
    }

    public Ca(Cn map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.g.a$a  reason: invalid class name */
    public class Ca extends AbstractCh<K, V> {
        Ca() {
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۰۵۶۷c() {
            return Ca.this.f۸۷۸۶e;
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public Object m۱۰۵۶۰a(int index, int offset) {
            return Ca.this.f۸۷۸۵d[(index << 1) + offset];
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۵۵۹a(Object key) {
            return Ca.this.m۱۰۶۴۸a(key);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۵۶۵b(Object value) {
            return Ca.this.m۱۰۶۵۳b(value);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: b  reason: contains not printable characters */
        public Map<K, V> m۱۰۵۶۶b() {
            return Ca.this;
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۶۴a(K key, V value) {
            Ca.this.put(key, value);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public V m۱۰۵۶۱a(int index, V value) {
            return (V) Ca.this.m۱۰۶۵۰a(index, value);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۶۳a(int index) {
            Ca.this.m۱۰۶۵۵c(index);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۵۶۲a() {
            Ca.this.clear();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private AbstractCh<K, V> m۱۰۵۵۷b() {
        if (this.f۸۷۳۱j == null) {
            this.f۸۷۳۱j = new Ca();
        }
        return this.f۸۷۳۱j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.b.g.g.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m۱۰۶۵۱a(this.f۸۷۸۶e + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۵۵۸a(Collection<?> collection) {
        return AbstractCh.m۱۰۶۱۶c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m۱۰۵۵۷b().m۱۰۶۲۸d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m۱۰۵۵۷b().m۱۰۶۲۹e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m۱۰۵۵۷b().m۱۰۶۳۰f();
    }
}
