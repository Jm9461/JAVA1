package a.a.a.b;

import a.a.a.b.b;
import android.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private HashMap<K, b.d<K, V>> f۶g = new HashMap<>();

    /* access modifiers changed from: protected */
    @Override // a.a.a.b.b
    public b.d<K, V> a(K k) {
        return this.f۶g.get(k);
    }

    @Override // a.a.a.b.b
    public V b(K key, V v) {
        SafeIterableMap.Entry<K, V> current = a((Object) key);
        if (current != null) {
            return current.f۱۲d;
        }
        this.f۶g.put(key, a(key, v));
        return null;
    }

    @Override // a.a.a.b.b
    public V remove(K key) {
        V removed = (V) super.remove(key);
        this.f۶g.remove(key);
        return removed;
    }

    public boolean contains(K key) {
        return this.f۶g.containsKey(key);
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.f۶g.get(k).f۱۴f;
        }
        return null;
    }
}
