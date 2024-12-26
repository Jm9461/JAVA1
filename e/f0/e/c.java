package e.f0.e;

import e.a0;
import e.f0.g.d;
import e.f0.g.e;
import e.r;
import e.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final y f۳۷۵۶a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f۳۷۵۷b;

    c(y networkRequest, a0 cacheResponse) {
        this.f۳۷۵۶a = networkRequest;
        this.f۳۷۵۷b = cacheResponse;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.m().b() == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(e.a0 r3, e.y r4) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.e.c.a(e.a0, e.y):boolean");
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long f۳۷۵۸a;

        /* renamed from: b  reason: collision with root package name */
        final y f۳۷۵۹b;

        /* renamed from: c  reason: collision with root package name */
        final a0 f۳۷۶۰c;

        /* renamed from: d  reason: collision with root package name */
        private Date f۳۷۶۱d;

        /* renamed from: e  reason: collision with root package name */
        private String f۳۷۶۲e;

        /* renamed from: f  reason: collision with root package name */
        private Date f۳۷۶۳f;

        /* renamed from: g  reason: collision with root package name */
        private String f۳۷۶۴g;

        /* renamed from: h  reason: collision with root package name */
        private Date f۳۷۶۵h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long nowMillis, y request, a0 cacheResponse) {
            this.f۳۷۵۸a = nowMillis;
            this.f۳۷۵۹b = request;
            this.f۳۷۶۰c = cacheResponse;
            if (cacheResponse != null) {
                this.i = cacheResponse.z();
                this.j = cacheResponse.x();
                r headers = cacheResponse.q();
                int size = headers.b();
                for (int i2 = 0; i2 < size; i2++) {
                    String fieldName = headers.a(i2);
                    String value = headers.b(i2);
                    if ("Date".equalsIgnoreCase(fieldName)) {
                        this.f۳۷۶۱d = d.a(value);
                        this.f۳۷۶۲e = value;
                    } else if ("Expires".equalsIgnoreCase(fieldName)) {
                        this.f۳۷۶۵h = d.a(value);
                    } else if ("Last-Modified".equalsIgnoreCase(fieldName)) {
                        this.f۳۷۶۳f = d.a(value);
                        this.f۳۷۶۴g = value;
                    } else if ("ETag".equalsIgnoreCase(fieldName)) {
                        this.k = value;
                    } else if ("Age".equalsIgnoreCase(fieldName)) {
                        this.l = e.a(value, -1);
                    }
                }
            }
        }

        public c a() {
            c candidate = d();
            if (candidate.f۳۷۵۶a == null || !this.f۳۷۵۹b.b().j()) {
                return candidate;
            }
            return new c(null, null);
        }

        private c d() {
            a0 a0Var;
            String conditionValue;
            String conditionName;
            if (this.f۳۷۶۰c == null) {
                return new c(this.f۳۷۵۹b, null);
            }
            if (this.f۳۷۵۹b.d() && this.f۳۷۶۰c.p() == null) {
                return new c(this.f۳۷۵۹b, null);
            }
            if (!c.a(this.f۳۷۶۰c, this.f۳۷۵۹b)) {
                return new c(this.f۳۷۵۹b, null);
            }
            e.d requestCaching = this.f۳۷۵۹b.b();
            if (requestCaching.h()) {
                a0Var = null;
            } else if (a(this.f۳۷۵۹b)) {
                a0Var = null;
            } else {
                e.d responseCaching = this.f۳۷۶۰c.m();
                if (responseCaching.a()) {
                    return new c(null, this.f۳۷۶۰c);
                }
                long ageMillis = b();
                long freshMillis = c();
                if (requestCaching.d() != -1) {
                    freshMillis = Math.min(freshMillis, TimeUnit.SECONDS.toMillis((long) requestCaching.d()));
                }
                long minFreshMillis = 0;
                if (requestCaching.f() != -1) {
                    minFreshMillis = TimeUnit.SECONDS.toMillis((long) requestCaching.f());
                }
                long maxStaleMillis = 0;
                if (!responseCaching.g() && requestCaching.e() != -1) {
                    maxStaleMillis = TimeUnit.SECONDS.toMillis((long) requestCaching.e());
                }
                if (responseCaching.h() || ageMillis + minFreshMillis >= freshMillis + maxStaleMillis) {
                    if (this.k != null) {
                        conditionName = "If-None-Match";
                        conditionValue = this.k;
                    } else if (this.f۳۷۶۳f != null) {
                        conditionName = "If-Modified-Since";
                        conditionValue = this.f۳۷۶۴g;
                    } else if (this.f۳۷۶۱d == null) {
                        return new c(this.f۳۷۵۹b, null);
                    } else {
                        conditionName = "If-Modified-Since";
                        conditionValue = this.f۳۷۶۲e;
                    }
                    r.a conditionalRequestHeaders = this.f۳۷۵۹b.c().a();
                    e.f0.a.f۳۷۴۰a.a(conditionalRequestHeaders, conditionName, conditionValue);
                    y.a f2 = this.f۳۷۵۹b.f();
                    f2.a(conditionalRequestHeaders.a());
                    return new c(f2.a(), this.f۳۷۶۰c);
                }
                a0.a builder = this.f۳۷۶۰c.u();
                if (ageMillis + minFreshMillis >= freshMillis) {
                    builder.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                }
                if (ageMillis > 86400000 && e()) {
                    builder.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
                return new c(null, builder.a());
            }
            return new c(this.f۳۷۵۹b, a0Var);
        }

        private long c() {
            long servedMillis;
            long servedMillis2;
            e.d responseCaching = this.f۳۷۶۰c.m();
            if (responseCaching.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) responseCaching.d());
            }
            if (this.f۳۷۶۵h != null) {
                Date date = this.f۳۷۶۱d;
                if (date != null) {
                    servedMillis2 = date.getTime();
                } else {
                    servedMillis2 = this.j;
                }
                long delta = this.f۳۷۶۵h.getTime() - servedMillis2;
                if (delta > 0) {
                    return delta;
                }
                return 0;
            } else if (this.f۳۷۶۳f == null || this.f۳۷۶۰c.y().g().k() != null) {
                return 0;
            } else {
                Date date2 = this.f۳۷۶۱d;
                if (date2 != null) {
                    servedMillis = date2.getTime();
                } else {
                    servedMillis = this.i;
                }
                long delta2 = servedMillis - this.f۳۷۶۳f.getTime();
                if (delta2 > 0) {
                    return delta2 / 10;
                }
                return 0;
            }
        }

        private long b() {
            long receivedAge;
            Date date = this.f۳۷۶۱d;
            long apparentReceivedAge = 0;
            if (date != null) {
                apparentReceivedAge = Math.max(0L, this.j - date.getTime());
            }
            int i2 = this.l;
            if (i2 != -1) {
                receivedAge = Math.max(apparentReceivedAge, TimeUnit.SECONDS.toMillis((long) i2));
            } else {
                receivedAge = apparentReceivedAge;
            }
            long j2 = this.j;
            return receivedAge + (j2 - this.i) + (this.f۳۷۵۸a - j2);
        }

        private boolean e() {
            return this.f۳۷۶۰c.m().d() == -1 && this.f۳۷۶۵h == null;
        }

        private static boolean a(y request) {
            return (request.a("If-Modified-Since") == null && request.a("If-None-Match") == null) ? false : true;
        }
    }
}
