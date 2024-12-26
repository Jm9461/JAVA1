package p۱۳۹e.p۱۴۰f0.p۱۴۱e;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cr;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cd;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce;

/* renamed from: e.f0.e.c  reason: invalid class name */
public final class Cc {

    /* renamed from: a  reason: contains not printable characters */
    public final Cy f۱۵۷۱۷a;

    /* renamed from: b  reason: contains not printable characters */
    public final Ca0 f۱۵۷۱۸b;

    Cc(Cy networkRequest, Ca0 cacheResponse) {
        this.f۱۵۷۱۷a = networkRequest;
        this.f۱۵۷۱۸b = cacheResponse;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.m۱۸۵۰۵m().m۱۸۵۷۵b() == false) goto L_0x0059;
     */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m۱۸۶۴۹a(p۱۳۹e.Ca0 r3, p۱۳۹e.Cy r4) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cc.m۱۸۶۴۹a(e.a0, e.y):boolean");
    }

    /* renamed from: e.f0.e.c$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        final long f۱۵۷۱۹a;

        /* renamed from: b  reason: contains not printable characters */
        final Cy f۱۵۷۲۰b;

        /* renamed from: c  reason: contains not printable characters */
        final Ca0 f۱۵۷۲۱c;

        /* renamed from: d  reason: contains not printable characters */
        private Date f۱۵۷۲۲d;

        /* renamed from: e  reason: contains not printable characters */
        private String f۱۵۷۲۳e;

        /* renamed from: f  reason: contains not printable characters */
        private Date f۱۵۷۲۴f;

        /* renamed from: g  reason: contains not printable characters */
        private String f۱۵۷۲۵g;

        /* renamed from: h  reason: contains not printable characters */
        private Date f۱۵۷۲۶h;

        /* renamed from: i  reason: contains not printable characters */
        private long f۱۵۷۲۷i;

        /* renamed from: j  reason: contains not printable characters */
        private long f۱۵۷۲۸j;

        /* renamed from: k  reason: contains not printable characters */
        private String f۱۵۷۲۹k;

        /* renamed from: l  reason: contains not printable characters */
        private int f۱۵۷۳۰l = -1;

        public Ca(long nowMillis, Cy request, Ca0 cacheResponse) {
            this.f۱۵۷۱۹a = nowMillis;
            this.f۱۵۷۲۰b = request;
            this.f۱۵۷۲۱c = cacheResponse;
            if (cacheResponse != null) {
                this.f۱۵۷۲۷i = cacheResponse.m۱۸۵۱۸z();
                this.f۱۵۷۲۸j = cacheResponse.m۱۸۵۱۶x();
                Cr headers = cacheResponse.m۱۸۵۰۹q();
                int size = headers.m۱۹۲۰۲b();
                for (int i = 0; i < size; i++) {
                    String fieldName = headers.m۱۹۲۰۰a(i);
                    String value = headers.m۱۹۲۰۳b(i);
                    if ("Date".equalsIgnoreCase(fieldName)) {
                        this.f۱۵۷۲۲d = Cd.m۱۸۷۶۲a(value);
                        this.f۱۵۷۲۳e = value;
                    } else if ("Expires".equalsIgnoreCase(fieldName)) {
                        this.f۱۵۷۲۶h = Cd.m۱۸۷۶۲a(value);
                    } else if ("Last-Modified".equalsIgnoreCase(fieldName)) {
                        this.f۱۵۷۲۴f = Cd.m۱۸۷۶۲a(value);
                        this.f۱۵۷۲۵g = value;
                    } else if ("ETag".equalsIgnoreCase(fieldName)) {
                        this.f۱۵۷۲۹k = value;
                    } else if ("Age".equalsIgnoreCase(fieldName)) {
                        this.f۱۵۷۳۰l = Ce.m۱۸۷۶۳a(value, -1);
                    }
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۸۶۵۵a() {
            Cc candidate = m۱۸۶۵۳d();
            if (candidate.f۱۵۷۱۷a == null || !this.f۱۵۷۲۰b.m۱۹۳۲۳b().m۱۸۵۸۳j()) {
                return candidate;
            }
            return new Cc(null, null);
        }

        /* renamed from: d  reason: contains not printable characters */
        private Cc m۱۸۶۵۳d() {
            Ca0 a0Var;
            String conditionValue;
            String conditionName;
            if (this.f۱۵۷۲۱c == null) {
                return new Cc(this.f۱۵۷۲۰b, null);
            }
            if (this.f۱۵۷۲۰b.m۱۹۳۲۶d() && this.f۱۵۷۲۱c.m۱۸۵۰۸p() == null) {
                return new Cc(this.f۱۵۷۲۰b, null);
            }
            if (!Cc.m۱۸۶۴۹a(this.f۱۵۷۲۱c, this.f۱۵۷۲۰b)) {
                return new Cc(this.f۱۵۷۲۰b, null);
            }
            p۱۳۹e.Cd requestCaching = this.f۱۵۷۲۰b.m۱۹۳۲۳b();
            if (requestCaching.m۱۸۵۸۱h()) {
                a0Var = null;
            } else if (m۱۸۶۵۰a(this.f۱۵۷۲۰b)) {
                a0Var = null;
            } else {
                p۱۳۹e.Cd responseCaching = this.f۱۵۷۲۱c.m۱۸۵۰۵m();
                if (responseCaching.m۱۸۵۷۴a()) {
                    return new Cc(null, this.f۱۵۷۲۱c);
                }
                long ageMillis = m۱۸۶۵۱b();
                long freshMillis = m۱۸۶۵۲c();
                if (requestCaching.m۱۸۵۷۷d() != -1) {
                    freshMillis = Math.min(freshMillis, TimeUnit.SECONDS.toMillis((long) requestCaching.m۱۸۵۷۷d()));
                }
                long minFreshMillis = 0;
                if (requestCaching.m۱۸۵۷۹f() != -1) {
                    minFreshMillis = TimeUnit.SECONDS.toMillis((long) requestCaching.m۱۸۵۷۹f());
                }
                long maxStaleMillis = 0;
                if (!responseCaching.m۱۸۵۸۰g() && requestCaching.m۱۸۵۷۸e() != -1) {
                    maxStaleMillis = TimeUnit.SECONDS.toMillis((long) requestCaching.m۱۸۵۷۸e());
                }
                if (responseCaching.m۱۸۵۸۱h() || ageMillis + minFreshMillis >= freshMillis + maxStaleMillis) {
                    if (this.f۱۵۷۲۹k != null) {
                        conditionName = "If-None-Match";
                        conditionValue = this.f۱۵۷۲۹k;
                    } else if (this.f۱۵۷۲۴f != null) {
                        conditionName = "If-Modified-Since";
                        conditionValue = this.f۱۵۷۲۵g;
                    } else if (this.f۱۵۷۲۲d == null) {
                        return new Cc(this.f۱۵۷۲۰b, null);
                    } else {
                        conditionName = "If-Modified-Since";
                        conditionValue = this.f۱۵۷۲۳e;
                    }
                    Cr.Ca conditionalRequestHeaders = this.f۱۵۷۲۰b.m۱۹۳۲۵c().m۱۹۱۹۹a();
                    AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۲a(conditionalRequestHeaders, conditionName, conditionValue);
                    Cy.Ca f = this.f۱۵۷۲۰b.m۱۹۳۲۸f();
                    f.m۱۹۳۳۱a(conditionalRequestHeaders.m۱۹۲۰۸a());
                    return new Cc(f.m۱۹۳۳۶a(), this.f۱۵۷۲۱c);
                }
                Ca0.Ca builder = this.f۱۵۷۲۱c.m۱۸۵۱۳u();
                if (ageMillis + minFreshMillis >= freshMillis) {
                    builder.m۱۸۵۳۰a("Warning", "110 HttpURLConnection \"Response is stale\"");
                }
                if (ageMillis > 86400000 && m۱۸۶۵۴e()) {
                    builder.m۱۸۵۳۰a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
                return new Cc(null, builder.m۱۸۵۳۱a());
            }
            return new Cc(this.f۱۵۷۲۰b, a0Var);
        }

        /* renamed from: c  reason: contains not printable characters */
        private long m۱۸۶۵۲c() {
            long servedMillis;
            long servedMillis2;
            p۱۳۹e.Cd responseCaching = this.f۱۵۷۲۱c.m۱۸۵۰۵m();
            if (responseCaching.m۱۸۵۷۷d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) responseCaching.m۱۸۵۷۷d());
            }
            if (this.f۱۵۷۲۶h != null) {
                Date date = this.f۱۵۷۲۲d;
                if (date != null) {
                    servedMillis2 = date.getTime();
                } else {
                    servedMillis2 = this.f۱۵۷۲۸j;
                }
                long delta = this.f۱۵۷۲۶h.getTime() - servedMillis2;
                if (delta > 0) {
                    return delta;
                }
                return 0;
            } else if (this.f۱۵۷۲۴f == null || this.f۱۵۷۲۱c.m۱۸۵۱۷y().m۱۹۳۲۹g().m۱۹۲۳۸k() != null) {
                return 0;
            } else {
                Date date2 = this.f۱۵۷۲۲d;
                if (date2 != null) {
                    servedMillis = date2.getTime();
                } else {
                    servedMillis = this.f۱۵۷۲۷i;
                }
                long delta2 = servedMillis - this.f۱۵۷۲۴f.getTime();
                if (delta2 > 0) {
                    return delta2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private long m۱۸۶۵۱b() {
            long receivedAge;
            Date date = this.f۱۵۷۲۲d;
            long apparentReceivedAge = 0;
            if (date != null) {
                apparentReceivedAge = Math.max(0L, this.f۱۵۷۲۸j - date.getTime());
            }
            int i = this.f۱۵۷۳۰l;
            if (i != -1) {
                receivedAge = Math.max(apparentReceivedAge, TimeUnit.SECONDS.toMillis((long) i));
            } else {
                receivedAge = apparentReceivedAge;
            }
            long j = this.f۱۵۷۲۸j;
            return receivedAge + (j - this.f۱۵۷۲۷i) + (this.f۱۵۷۱۹a - j);
        }

        /* renamed from: e  reason: contains not printable characters */
        private boolean m۱۸۶۵۴e() {
            return this.f۱۵۷۲۱c.m۱۸۵۰۵m().m۱۸۵۷۷d() == -1 && this.f۱۵۷۲۶h == null;
        }

        /* renamed from: a  reason: contains not printable characters */
        private static boolean m۱۸۶۵۰a(Cy request) {
            return (request.m۱۹۳۲۲a("If-Modified-Since") == null && request.m۱۹۳۲۲a("If-None-Match") == null) ? false : true;
        }
    }
}
