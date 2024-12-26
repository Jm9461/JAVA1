package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: a.b.g.g.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg<K, V> {

    /* renamed from: a, reason: contains not printable characters */
    private final LinkedHashMap<K, V> f۸۷۵۴a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۸۷۵۵b;

    /* renamed from: c, reason: contains not printable characters */
    private int f۸۷۵۶c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۸۷۵۷d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۸۷۵۸e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۸۷۵۹f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۸۷۶۰g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۸۷۶۱h;

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    public Cg(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f۸۷۵۶c = maxSize;
        this.f۸۷۵۴a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    public final V m۸۵۴۲b(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                V v2 = this.f۸۷۵۴a.get(k);
                if (v2 != null) {
                    this.f۸۷۶۰g++;
                    return v2;
                }
                this.f۸۷۶۱h++;
                V v3 = m۸۵۳۷a((Cg<K, V>) k);
                if (v3 == null) {
                    return null;
                }
                synchronized (this) {
                    this.f۸۷۵۸e++;
                    v = (V) this.f۸۷۵۴a.put(k, v3);
                    if (v != null) {
                        this.f۸۷۵۴a.put(k, v);
                    } else {
                        this.f۸۷۵۵b += m۸۵۳۶c(k, v3);
                    }
                }
                if (v != null) {
                    m۸۵۴۰a(false, k, v3, v);
                    return v;
                }
                m۸۵۳۹a(this.f۸۷۵۶c);
                return v3;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public final V m۸۵۳۸a(K key, V value) {
        if (key == null || value == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f۸۷۵۷d++;
                this.f۸۷۵۵b += m۸۵۳۶c(key, value);
                V previous = this.f۸۷۵۴a.put(key, value);
                if (previous != null) {
                    this.f۸۷۵۵b -= m۸۵۳۶c(key, previous);
                }
                if (previous != null) {
                    m۸۵۴۰a(false, key, previous, value);
                }
                m۸۵۳۹a(this.f۸۷۵۶c);
                return previous;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0078
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۸۵۳۹a(int r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            monitor-enter(r6)
            int r3 = r6.f۸۷۵۵b     // Catch: java.lang.Throwable -> L75
            if (r3 < 0) goto L56
            java.util.LinkedHashMap<K, V> r3 = r6.f۸۷۵۴a     // Catch: java.lang.Throwable -> L75
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L14
            int r3 = r6.f۸۷۵۵b     // Catch: java.lang.Throwable -> L75
            if (r3 != 0) goto L56
        L14:
            int r3 = r6.f۸۷۵۵b     // Catch: java.lang.Throwable -> L75
            if (r3 <= r7) goto L54
            java.util.LinkedHashMap<K, V> r3 = r6.f۸۷۵۴a     // Catch: java.lang.Throwable -> L75
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L21
            goto L54
        L21:
            java.util.LinkedHashMap<K, V> r3 = r6.f۸۷۵۴a     // Catch: java.lang.Throwable -> L75
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L75
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap<K, V> r4 = r6.f۸۷۵۴a     // Catch: java.lang.Throwable -> L78
            r4.remove(r1)     // Catch: java.lang.Throwable -> L78
            int r4 = r6.f۸۷۵۵b     // Catch: java.lang.Throwable -> L78
            int r5 = r6.m۸۵۳۶c(r1, r2)     // Catch: java.lang.Throwable -> L78
            int r4 = r4 - r5
            r6.f۸۷۵۵b = r4     // Catch: java.lang.Throwable -> L78
            int r4 = r6.f۸۷۵۹f     // Catch: java.lang.Throwable -> L78
            r5 = 1
            int r4 = r4 + r5
            r6.f۸۷۵۹f = r4     // Catch: java.lang.Throwable -> L78
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            r6.m۸۵۴۰a(r5, r1, r2, r0)
            goto L3
        L52:
            r0 = move-exception
            goto L76
        L54:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L75
            return
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L75
            r3.append(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = ".sizeOf() is reporting inconsistent results!"
            r3.append(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
        L76:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            throw r0
        L78:
            r0 = move-exception
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cg.m۸۵۳۹a(int):void");
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    protected void m۸۵۴۰a(boolean evicted, K key, V oldValue, V newValue) {
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: a, reason: contains not printable characters */
    protected V m۸۵۳۷a(K key) {
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: c, reason: contains not printable characters */
    private int m۸۵۳۶c(K key, V value) {
        int result = m۸۵۴۱b(key, value);
        if (result < 0) {
            throw new IllegalStateException("Negative size: " + key + "=" + value);
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    /* renamed from: b, reason: contains not printable characters */
    protected int m۸۵۴۱b(K key, V value) {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.g != android.support.v4.util.LruCache<K, V> */
    public final synchronized String toString() {
        int hitPercent;
        int accesses = this.f۸۷۶۰g + this.f۸۷۶۱h;
        hitPercent = accesses != 0 ? (this.f۸۷۶۰g * 100) / accesses : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f۸۷۵۶c), Integer.valueOf(this.f۸۷۶۰g), Integer.valueOf(this.f۸۷۶۱h), Integer.valueOf(hitPercent));
    }
}
