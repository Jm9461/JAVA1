package e;

import java.util.concurrent.TimeUnit;

public final class d {
    public static final d n;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f۳۷۱۸a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f۳۷۱۹b;

    /* renamed from: c  reason: collision with root package name */
    private final int f۳۷۲۰c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۳۷۲۱d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f۳۷۲۲e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f۳۷۲۳f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f۳۷۲۴g;

    /* renamed from: h  reason: collision with root package name */
    private final int f۳۷۲۵h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    String m;

    static {
        a aVar = new a();
        aVar.b();
        aVar.a();
        a aVar2 = new a();
        aVar2.d();
        aVar2.a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        n = aVar2.a();
    }

    private d(boolean noCache, boolean noStore, int maxAgeSeconds, int sMaxAgeSeconds, boolean isPrivate, boolean isPublic, boolean mustRevalidate, int maxStaleSeconds, int minFreshSeconds, boolean onlyIfCached, boolean noTransform, boolean immutable, String headerValue) {
        this.f۳۷۱۸a = noCache;
        this.f۳۷۱۹b = noStore;
        this.f۳۷۲۰c = maxAgeSeconds;
        this.f۳۷۲۱d = sMaxAgeSeconds;
        this.f۳۷۲۲e = isPrivate;
        this.f۳۷۲۳f = isPublic;
        this.f۳۷۲۴g = mustRevalidate;
        this.f۳۷۲۵h = maxStaleSeconds;
        this.i = minFreshSeconds;
        this.j = onlyIfCached;
        this.k = noTransform;
        this.l = immutable;
        this.m = headerValue;
    }

    d(a builder) {
        this.f۳۷۱۸a = builder.f۳۷۲۶a;
        this.f۳۷۱۹b = builder.f۳۷۲۷b;
        this.f۳۷۲۰c = builder.f۳۷۲۸c;
        this.f۳۷۲۱d = -1;
        this.f۳۷۲۲e = false;
        this.f۳۷۲۳f = false;
        this.f۳۷۲۴g = false;
        this.f۳۷۲۵h = builder.f۳۷۲۹d;
        this.i = builder.f۳۷۳۰e;
        this.j = builder.f۳۷۳۱f;
        this.k = builder.f۳۷۳۲g;
        this.l = builder.f۳۷۳۳h;
    }

    public boolean h() {
        return this.f۳۷۱۸a;
    }

    public boolean i() {
        return this.f۳۷۱۹b;
    }

    public int d() {
        return this.f۳۷۲۰c;
    }

    public boolean b() {
        return this.f۳۷۲۲e;
    }

    public boolean c() {
        return this.f۳۷۲۳f;
    }

    public boolean g() {
        return this.f۳۷۲۴g;
    }

    public int e() {
        return this.f۳۷۲۵h;
    }

    public int f() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public boolean a() {
        return this.l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.d a(e.r r32) {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a(e.r):e.d");
    }

    public String toString() {
        String result = this.m;
        if (result != null) {
            return result;
        }
        String k2 = k();
        this.m = k2;
        return k2;
    }

    private String k() {
        StringBuilder result = new StringBuilder();
        if (this.f۳۷۱۸a) {
            result.append("no-cache, ");
        }
        if (this.f۳۷۱۹b) {
            result.append("no-store, ");
        }
        if (this.f۳۷۲۰c != -1) {
            result.append("max-age=");
            result.append(this.f۳۷۲۰c);
            result.append(", ");
        }
        if (this.f۳۷۲۱d != -1) {
            result.append("s-maxage=");
            result.append(this.f۳۷۲۱d);
            result.append(", ");
        }
        if (this.f۳۷۲۲e) {
            result.append("private, ");
        }
        if (this.f۳۷۲۳f) {
            result.append("public, ");
        }
        if (this.f۳۷۲۴g) {
            result.append("must-revalidate, ");
        }
        if (this.f۳۷۲۵h != -1) {
            result.append("max-stale=");
            result.append(this.f۳۷۲۵h);
            result.append(", ");
        }
        if (this.i != -1) {
            result.append("min-fresh=");
            result.append(this.i);
            result.append(", ");
        }
        if (this.j) {
            result.append("only-if-cached, ");
        }
        if (this.k) {
            result.append("no-transform, ");
        }
        if (this.l) {
            result.append("immutable, ");
        }
        if (result.length() == 0) {
            return "";
        }
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f۳۷۲۶a;

        /* renamed from: b  reason: collision with root package name */
        boolean f۳۷۲۷b;

        /* renamed from: c  reason: collision with root package name */
        int f۳۷۲۸c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f۳۷۲۹d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f۳۷۳۰e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f۳۷۳۱f;

        /* renamed from: g  reason: collision with root package name */
        boolean f۳۷۳۲g;

        /* renamed from: h  reason: collision with root package name */
        boolean f۳۷۳۳h;

        public a b() {
            this.f۳۷۲۶a = true;
            return this;
        }

        public a c() {
            this.f۳۷۲۷b = true;
            return this;
        }

        public a a(int maxStale, TimeUnit timeUnit) {
            int i;
            if (maxStale >= 0) {
                long maxStaleSecondsLong = timeUnit.toSeconds((long) maxStale);
                if (maxStaleSecondsLong > 2147483647L) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = (int) maxStaleSecondsLong;
                }
                this.f۳۷۲۹d = i;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + maxStale);
        }

        public a d() {
            this.f۳۷۳۱f = true;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }
}
