package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: a.b.g.g.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca<K, V> extends Cn<K, V> implements Map<K, V> {

    /* renamed from: j, reason: contains not printable characters */
    AbstractCh<K, V> f۸۷۳۱j;

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    public Ca() {
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    public Ca(int capacity) {
        super(capacity);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    public Ca(Cn map) {
        super(map);
    }

    /* renamed from: a.b.g.g.a$a */
    class a extends AbstractCh<K, V> {
        a() {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: c, reason: contains not printable characters */
        protected int mo۸۵۵۷c() {
            return Ca.this.f۸۷۸۶e;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected Object mo۸۵۴۸a(int index, int offset) {
            return Ca.this.f۸۷۸۵d[(index << 1) + offset];
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected int mo۸۵۴۷a(Object key) {
            return Ca.this.m۸۵۷۸a(key);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: b, reason: contains not printable characters */
        protected int mo۸۵۵۴b(Object value) {
            return Ca.this.m۸۵۸۳b(value);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: b, reason: contains not printable characters */
        protected Map<K, V> mo۸۵۵۵b() {
            return Ca.this;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۸۵۵۲a(K key, V value) {
            Ca.this.put(key, value);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected V mo۸۵۴۹a(int index, V value) {
            return Ca.this.m۸۵۸۰a(index, (int) value);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۸۵۵۱a(int index) {
            Ca.this.m۸۵۸۵c(index);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۸۵۵۰a() {
            Ca.this.clear();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    private AbstractCh<K, V> m۸۴۸۶b() {
        if (this.f۸۷۳۱j == null) {
            this.f۸۷۳۱j = new a();
        }
        return this.f۸۷۳۱j;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m۸۵۸۱a(this.f۸۷۸۶e + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public boolean m۸۴۸۷a(Collection<?> collection) {
        return AbstractCh.m۸۵۴۶c(this, collection);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m۸۴۸۶b().m۸۵۵۸d();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public Set<K> keySet() {
        return m۸۴۸۶b().m۸۵۵۹e();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public Collection<V> values() {
        return m۸۴۸۶b().m۸۵۶۰f();
    }
}
