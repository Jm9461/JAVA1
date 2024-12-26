package p۱۳۹e;

import java.util.concurrent.TimeUnit;

/* renamed from: e.d  reason: invalid class name */
public final class Cd {

    /* renamed from: n  reason: contains not printable characters */
    public static final Cd f۱۵۶۷۲n;

    /* renamed from: a  reason: contains not printable characters */
    private final boolean f۱۵۶۷۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final boolean f۱۵۶۷۴b;

    /* renamed from: c  reason: contains not printable characters */
    private final int f۱۵۶۷۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۵۶۷۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final boolean f۱۵۶۷۷e;

    /* renamed from: f  reason: contains not printable characters */
    private final boolean f۱۵۶۷۸f;

    /* renamed from: g  reason: contains not printable characters */
    private final boolean f۱۵۶۷۹g;

    /* renamed from: h  reason: contains not printable characters */
    private final int f۱۵۶۸۰h;

    /* renamed from: i  reason: contains not printable characters */
    private final int f۱۵۶۸۱i;

    /* renamed from: j  reason: contains not printable characters */
    private final boolean f۱۵۶۸۲j;

    /* renamed from: k  reason: contains not printable characters */
    private final boolean f۱۵۶۸۳k;

    /* renamed from: l  reason: contains not printable characters */
    private final boolean f۱۵۶۸۴l;

    /* renamed from: m  reason: contains not printable characters */
    String f۱۵۶۸۵m;

    static {
        Ca aVar = new Ca();
        aVar.m۱۸۵۸۶b();
        aVar.m۱۸۵۸۵a();
        Ca aVar2 = new Ca();
        aVar2.m۱۸۵۸۸d();
        aVar2.m۱۸۵۸۴a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        f۱۵۶۷۲n = aVar2.m۱۸۵۸۵a();
    }

    private Cd(boolean noCache, boolean noStore, int maxAgeSeconds, int sMaxAgeSeconds, boolean isPrivate, boolean isPublic, boolean mustRevalidate, int maxStaleSeconds, int minFreshSeconds, boolean onlyIfCached, boolean noTransform, boolean immutable, String headerValue) {
        this.f۱۵۶۷۳a = noCache;
        this.f۱۵۶۷۴b = noStore;
        this.f۱۵۶۷۵c = maxAgeSeconds;
        this.f۱۵۶۷۶d = sMaxAgeSeconds;
        this.f۱۵۶۷۷e = isPrivate;
        this.f۱۵۶۷۸f = isPublic;
        this.f۱۵۶۷۹g = mustRevalidate;
        this.f۱۵۶۸۰h = maxStaleSeconds;
        this.f۱۵۶۸۱i = minFreshSeconds;
        this.f۱۵۶۸۲j = onlyIfCached;
        this.f۱۵۶۸۳k = noTransform;
        this.f۱۵۶۸۴l = immutable;
        this.f۱۵۶۸۵m = headerValue;
    }

    Cd(Ca builder) {
        this.f۱۵۶۷۳a = builder.f۱۵۶۸۶a;
        this.f۱۵۶۷۴b = builder.f۱۵۶۸۷b;
        this.f۱۵۶۷۵c = builder.f۱۵۶۸۸c;
        this.f۱۵۶۷۶d = -1;
        this.f۱۵۶۷۷e = false;
        this.f۱۵۶۷۸f = false;
        this.f۱۵۶۷۹g = false;
        this.f۱۵۶۸۰h = builder.f۱۵۶۸۹d;
        this.f۱۵۶۸۱i = builder.f۱۵۶۹۰e;
        this.f۱۵۶۸۲j = builder.f۱۵۶۹۱f;
        this.f۱۵۶۸۳k = builder.f۱۵۶۹۲g;
        this.f۱۵۶۸۴l = builder.f۱۵۶۹۳h;
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۸۵۸۱h() {
        return this.f۱۵۶۷۳a;
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۸۵۸۲i() {
        return this.f۱۵۶۷۴b;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۸۵۷۷d() {
        return this.f۱۵۶۷۵c;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۵۷۵b() {
        return this.f۱۵۶۷۷e;
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۸۵۷۶c() {
        return this.f۱۵۶۷۸f;
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۸۵۸۰g() {
        return this.f۱۵۶۷۹g;
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۸۵۷۸e() {
        return this.f۱۵۶۸۰h;
    }

    /* renamed from: f  reason: contains not printable characters */
    public int m۱۸۵۷۹f() {
        return this.f۱۵۶۸۱i;
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۸۵۸۳j() {
        return this.f۱۵۶۸۲j;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۵۷۴a() {
        return this.f۱۵۶۸۴l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p۱۳۹e.Cd m۱۸۵۷۲a(p۱۳۹e.Cr r32) {
        /*
        // Method dump skipped, instructions count: 457
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.Cd.m۱۸۵۷۲a(e.r):e.d");
    }

    public String toString() {
        String result = this.f۱۵۶۸۵m;
        if (result != null) {
            return result;
        }
        String k = m۱۸۵۷۳k();
        this.f۱۵۶۸۵m = k;
        return k;
    }

    /* renamed from: k  reason: contains not printable characters */
    private String m۱۸۵۷۳k() {
        StringBuilder result = new StringBuilder();
        if (this.f۱۵۶۷۳a) {
            result.append("no-cache, ");
        }
        if (this.f۱۵۶۷۴b) {
            result.append("no-store, ");
        }
        if (this.f۱۵۶۷۵c != -1) {
            result.append("max-age=");
            result.append(this.f۱۵۶۷۵c);
            result.append(", ");
        }
        if (this.f۱۵۶۷۶d != -1) {
            result.append("s-maxage=");
            result.append(this.f۱۵۶۷۶d);
            result.append(", ");
        }
        if (this.f۱۵۶۷۷e) {
            result.append("private, ");
        }
        if (this.f۱۵۶۷۸f) {
            result.append("public, ");
        }
        if (this.f۱۵۶۷۹g) {
            result.append("must-revalidate, ");
        }
        if (this.f۱۵۶۸۰h != -1) {
            result.append("max-stale=");
            result.append(this.f۱۵۶۸۰h);
            result.append(", ");
        }
        if (this.f۱۵۶۸۱i != -1) {
            result.append("min-fresh=");
            result.append(this.f۱۵۶۸۱i);
            result.append(", ");
        }
        if (this.f۱۵۶۸۲j) {
            result.append("only-if-cached, ");
        }
        if (this.f۱۵۶۸۳k) {
            result.append("no-transform, ");
        }
        if (this.f۱۵۶۸۴l) {
            result.append("immutable, ");
        }
        if (result.length() == 0) {
            return "";
        }
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }

    /* renamed from: e.d$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۱۵۶۸۶a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۱۵۶۸۷b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۵۶۸۸c = -1;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۵۶۸۹d = -1;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۵۶۹۰e = -1;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۱۵۶۹۱f;

        /* renamed from: g  reason: contains not printable characters */
        boolean f۱۵۶۹۲g;

        /* renamed from: h  reason: contains not printable characters */
        boolean f۱۵۶۹۳h;

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۸۵۸۶b() {
            this.f۱۵۶۸۶a = true;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۸۵۸۷c() {
            this.f۱۵۶۸۷b = true;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۸۴a(int maxStale, TimeUnit timeUnit) {
            int i;
            if (maxStale >= 0) {
                long maxStaleSecondsLong = timeUnit.toSeconds((long) maxStale);
                if (maxStaleSecondsLong > 2147483647L) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = (int) maxStaleSecondsLong;
                }
                this.f۱۵۶۸۹d = i;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + maxStale);
        }

        /* renamed from: d  reason: contains not printable characters */
        public Ca m۱۸۵۸۸d() {
            this.f۱۵۶۹۱f = true;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۸۵۸۵a() {
            return new Cd(this);
        }
    }
}
