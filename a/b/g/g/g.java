package a.b.g.g;

import java.util.LinkedHashMap;
import java.util.Locale;

public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f۳۸۶a;

    /* renamed from: b  reason: collision with root package name */
    private int f۳۸۷b;

    /* renamed from: c  reason: collision with root package name */
    private int f۳۸۸c;

    /* renamed from: d  reason: collision with root package name */
    private int f۳۸۹d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۹۰e;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۹۱f;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۹۲g;

    /* renamed from: h  reason: collision with root package name */
    private int f۳۹۳h;

    public g(int maxSize) {
        if (maxSize > 0) {
            this.f۳۸۸c = maxSize;
            this.f۳۸۶a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r2 = a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r2 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.f۳۹۰e++;
        r0 = r5.f۳۸۶a.put(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r5.f۳۸۶a.put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r5.f۳۸۷b += c(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        a(false, r6, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        a(r5.f۳۸۸c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x005a
            monitor-enter(r5)
            r0 = 0
            java.util.LinkedHashMap<K, V> r1 = r5.f۳۸۶a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0014
            int r0 = r5.f۳۹۲g     // Catch:{ all -> 0x0058 }
            int r0 = r0 + 1
            r5.f۳۹۲g = r0     // Catch:{ all -> 0x0058 }
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            return r1
        L_0x0014:
            int r2 = r5.f۳۹۳h     // Catch:{ all -> 0x0058 }
            int r2 = r2 + 1
            r5.f۳۹۳h = r2     // Catch:{ all -> 0x0058 }
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r5.a(r6)
            if (r2 != 0) goto L_0x0022
            return r0
        L_0x0022:
            monitor-enter(r5)
            int r0 = r5.f۳۹۰e     // Catch:{ all -> 0x004f }
            int r0 = r0 + 1
            r5.f۳۹۰e = r0     // Catch:{ all -> 0x004f }
            java.util.LinkedHashMap<K, V> r0 = r5.f۳۸۶a     // Catch:{ all -> 0x004f }
            java.lang.Object r0 = r0.put(r6, r2)     // Catch:{ all -> 0x004f }
            r1 = r0
            if (r1 == 0) goto L_0x0038
            java.util.LinkedHashMap<K, V> r0 = r5.f۳۸۶a     // Catch:{ all -> 0x004f }
            r0.put(r6, r1)     // Catch:{ all -> 0x004f }
            goto L_0x0041
        L_0x0038:
            int r0 = r5.f۳۸۷b     // Catch:{ all -> 0x004f }
            int r3 = r5.c(r6, r2)     // Catch:{ all -> 0x004f }
            int r0 = r0 + r3
            r5.f۳۸۷b = r0     // Catch:{ all -> 0x004f }
        L_0x0041:
            monitor-exit(r5)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0049
            r0 = 0
            r5.a(r0, r6, r2, r1)
            return r1
        L_0x0049:
            int r0 = r5.f۳۸۸c
            r5.a(r0)
            return r2
        L_0x004f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0052:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0056:
            monitor-exit(r5)
            throw r0
        L_0x0058:
            r0 = move-exception
            goto L_0x0056
        L_0x005a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            goto L_0x0063
        L_0x0062:
            throw r0
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.g.g.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        a(false, r4, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        a(r3.f۳۸۸c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(K r4, V r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0038
            if (r5 == 0) goto L_0x0038
            monitor-enter(r3)
            r0 = 0
            int r1 = r3.f۳۸۹d     // Catch:{ all -> 0x0033 }
            int r1 = r1 + 1
            r3.f۳۸۹d = r1     // Catch:{ all -> 0x0033 }
            int r1 = r3.f۳۸۷b     // Catch:{ all -> 0x0033 }
            int r2 = r3.c(r4, r5)     // Catch:{ all -> 0x0033 }
            int r1 = r1 + r2
            r3.f۳۸۷b = r1     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<K, V> r1 = r3.f۳۸۶a     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = r1.put(r4, r5)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0026
            int r1 = r3.f۳۸۷b     // Catch:{ all -> 0x0036 }
            int r2 = r3.c(r4, r0)     // Catch:{ all -> 0x0036 }
            int r1 = r1 - r2
            r3.f۳۸۷b = r1     // Catch:{ all -> 0x0036 }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002d
            r1 = 0
            r3.a(r1, r4, r0, r5)
        L_0x002d:
            int r1 = r3.f۳۸۸c
            r3.a(r1)
            return r0
        L_0x0033:
            r1 = move-exception
        L_0x0034:
            monitor-exit(r3)
            throw r1
        L_0x0036:
            r1 = move-exception
            goto L_0x0034
        L_0x0038:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null || value == null"
            r0.<init>(r1)
            goto L_0x0041
        L_0x0040:
            throw r0
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.g.g.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r7) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g.g.g.a(int):void");
    }

    /* access modifiers changed from: protected */
    public void a(boolean evicted, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    public V a(K k) {
        return null;
    }

    private int c(K key, V value) {
        int result = b(key, value);
        if (result >= 0) {
            return result;
        }
        throw new IllegalStateException("Negative size: " + ((Object) key) + "=" + ((Object) value));
    }

    /* access modifiers changed from: protected */
    public int b(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int accesses;
        accesses = this.f۳۹۲g + this.f۳۹۳h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f۳۸۸c), Integer.valueOf(this.f۳۹۲g), Integer.valueOf(this.f۳۹۳h), Integer.valueOf(accesses != 0 ? (this.f۳۹۲g * 100) / accesses : 0));
    }
}
