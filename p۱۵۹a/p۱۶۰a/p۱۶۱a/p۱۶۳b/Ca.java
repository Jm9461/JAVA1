package p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b;

import java.util.HashMap;
import java.util.Map;
import p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb;

/* renamed from: a.a.a.b.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca<K, V> extends Cb<K, V> {

    /* renamed from: g, reason: contains not printable characters */
    private HashMap<K, Cb.d<K, V>> f۸۲۳۴g = new HashMap<>();

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.a != android.arch.core.internal.FastSafeIterableMap<K, V> */
    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb
    /* renamed from: a, reason: contains not printable characters */
    protected Cb.d<K, V> mo۷۸۵۹a(K k) {
        return this.f۸۲۳۴g.get(k);
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.a != android.arch.core.internal.FastSafeIterableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.b$d != android.arch.core.internal.SafeIterableMap$Entry<K, V> */
    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb
    /* renamed from: b, reason: contains not printable characters */
    public V mo۷۸۶۲b(K key, V v) {
        Cb.d<K, V> dVar = mo۷۸۵۹a((Ca<K, V>) key);
        if (dVar != null) {
            return dVar.f۸۲۴۰d;
        }
        this.f۸۲۳۴g.put(key, m۷۸۶۰a(key, v));
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.a != android.arch.core.internal.FastSafeIterableMap<K, V> */
    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۳b.Cb
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f۸۲۳۴g.remove(k);
        return v;
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.a != android.arch.core.internal.FastSafeIterableMap<K, V> */
    public boolean contains(K key) {
        return this.f۸۲۳۴g.containsKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: a.a.a.b.a != android.arch.core.internal.FastSafeIterableMap<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    public Map.Entry<K, V> m۷۸۵۷b(K k) {
        if (contains(k)) {
            return this.f۸۲۳۴g.get(k).f۸۲۴۲f;
        }
        return null;
    }
}
