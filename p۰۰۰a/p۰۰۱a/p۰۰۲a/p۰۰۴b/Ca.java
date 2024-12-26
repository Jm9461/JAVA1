package p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b;

import android.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;
import p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb;

/* renamed from: a.a.a.b.a  reason: invalid class name */
public class Ca<K, V> extends Cb<K, V> {

    /* renamed from: g  reason: contains not printable characters */
    private HashMap<K, Cb.Cd<K, V>> f۸۲۳۴g = new HashMap<>();

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb
    /* renamed from: a  reason: contains not printable characters */
    public Cb.Cd<K, V> m۹۹۲۲a(K k) {
        return this.f۸۲۳۴g.get(k);
    }

    @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb
    /* renamed from: b  reason: contains not printable characters */
    public V m۹۹۲۳b(K key, V v) {
        SafeIterableMap.Entry<K, V> current = m۹۹۲۲a((Object) key);
        if (current != null) {
            return current.f۸۲۴۰d;
        }
        this.f۸۲۳۴g.put(key, m۹۹۲۷a(key, v));
        return null;
    }

    @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb
    public V remove(K key) {
        V removed = (V) super.remove(key);
        this.f۸۲۳۴g.remove(key);
        return removed;
    }

    public boolean contains(K key) {
        return this.f۸۲۳۴g.containsKey(key);
    }

    /* renamed from: b  reason: contains not printable characters */
    public Map.Entry<K, V> m۹۹۲۴b(K k) {
        if (contains(k)) {
            return this.f۸۲۳۴g.get(k).f۸۲۴۲f;
        }
        return null;
    }
}
