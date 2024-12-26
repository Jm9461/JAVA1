package p۱۳۹e.p۱۴۰f0.p۱۴۱e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p۱۳۹e.AbstractCb0;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cr;
import p۱۳۹e.Cy;
import p۱۳۹e.EnumCw;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cf;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ch;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;
import p۱۴۹f.Ct;

/* renamed from: e.f0.e.a  reason: invalid class name */
public final class Ca implements AbstractCt {

    /* renamed from: a  reason: contains not printable characters */
    final AbstractCf f۱۵۷۱۲a;

    public Ca(AbstractCf cache) {
        this.f۱۵۷۱۲a = cache;
    }

    @Override // p۱۳۹e.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۶۴۴a(AbstractCt.AbstractCa chain) {
        Ca0 cacheCandidate;
        AbstractCf fVar = this.f۱۵۷۱۲a;
        if (fVar != null) {
            cacheCandidate = fVar.m۱۸۶۸۹a(chain.m۱۹۲۶۵b());
        } else {
            cacheCandidate = null;
        }
        Cc strategy = new Cc.Ca(System.currentTimeMillis(), chain.m۱۹۲۶۵b(), cacheCandidate).m۱۸۶۵۵a();
        Cy networkRequest = strategy.f۱۵۷۱۷a;
        Ca0 cacheResponse = strategy.f۱۵۷۱۸b;
        AbstractCf fVar2 = this.f۱۵۷۱۲a;
        if (fVar2 != null) {
            fVar2.m۱۸۶۹۳a(strategy);
        }
        if (cacheCandidate != null && cacheResponse == null) {
            p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(cacheCandidate.m۱۸۵۰۴l());
        }
        if (networkRequest == null && cacheResponse == null) {
            Ca0.Ca aVar = new Ca0.Ca();
            aVar.m۱۸۵۲۸a(chain.m۱۹۲۶۵b());
            aVar.m۱۸۵۲۷a(EnumCw.HTTP_1_1);
            aVar.m۱۸۵۲۱a(504);
            aVar.m۱۸۵۲۹a("Unsatisfiable Request (only-if-cached)");
            aVar.m۱۸۵۲۴a(p۱۳۹e.p۱۴۰f0.Cc.f۱۵۷۰۵c);
            aVar.m۱۸۵۳۲b(-1);
            aVar.m۱۸۵۲۲a(System.currentTimeMillis());
            return aVar.m۱۸۵۳۱a();
        } else if (networkRequest == null) {
            Ca0.Ca u = cacheResponse.m۱۸۵۱۳u();
            u.m۱۸۵۲۳a(m۱۸۶۳۹a(cacheResponse));
            return u.m۱۸۵۳۱a();
        } else {
            Ca0 networkResponse = null;
            try {
                networkResponse = chain.m۱۹۲۶۴a(networkRequest);
                if (cacheResponse != null) {
                    if (networkResponse.m۱۸۵۰۷o() == 304) {
                        Ca0.Ca u2 = cacheResponse.m۱۸۵۱۳u();
                        u2.m۱۸۵۲۶a(m۱۸۶۴۱a(cacheResponse.m۱۸۵۰۹q(), networkResponse.m۱۸۵۰۹q()));
                        u2.m۱۸۵۳۲b(networkResponse.m۱۸۵۱۸z());
                        u2.m۱۸۵۲۲a(networkResponse.m۱۸۵۱۶x());
                        u2.m۱۸۵۲۳a(m۱۸۶۳۹a(cacheResponse));
                        u2.m۱۸۵۳۳b(m۱۸۶۳۹a(networkResponse));
                        Ca0 response = u2.m۱۸۵۳۱a();
                        networkResponse.m۱۸۵۰۴l().close();
                        this.f۱۵۷۱۲a.m۱۸۶۹۱a();
                        this.f۱۵۷۱۲a.m۱۸۶۹۲a(cacheResponse, response);
                        return response;
                    }
                    p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(cacheResponse.m۱۸۵۰۴l());
                }
                Ca0.Ca u3 = networkResponse.m۱۸۵۱۳u();
                u3.m۱۸۵۲۳a(m۱۸۶۳۹a(cacheResponse));
                u3.m۱۸۵۳۳b(m۱۸۶۳۹a(networkResponse));
                Ca0 response2 = u3.m۱۸۵۳۱a();
                if (this.f۱۵۷۱۲a != null) {
                    if (Ce.m۱۸۷۷۲b(response2) && Cc.m۱۸۶۴۹a(response2, networkRequest)) {
                        return m۱۸۶۴۰a(this.f۱۵۷۱۲a.m۱۸۶۹۰a(response2), response2);
                    }
                    if (Cf.m۱۸۷۷۸a(networkRequest.m۱۹۳۲۷e())) {
                        try {
                            this.f۱۵۷۱۲a.m۱۸۶۹۴b(networkRequest);
                        } catch (IOException e) {
                        }
                    }
                }
                return response2;
            } finally {
                if (networkResponse == null && cacheCandidate != null) {
                    p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(cacheCandidate.m۱۸۵۰۴l());
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ca0 m۱۸۶۳۹a(Ca0 response) {
        if (response == null || response.m۱۸۵۰۴l() == null) {
            return response;
        }
        Ca0.Ca u = response.m۱۸۵۱۳u();
        u.m۱۸۵۲۴a((AbstractCb0) null);
        return u.m۱۸۵۳۱a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private Ca0 m۱۸۶۴۰a(AbstractCb cacheRequest, Ca0 response) {
        AbstractCr cacheBodyUnbuffered;
        if (cacheRequest == null || (cacheBodyUnbuffered = cacheRequest.m۱۸۶۴۸b()) == null) {
            return response;
        }
        AbstractCs cacheWritingSource = new Ca(this, response.m۱۸۵۰۴l().m۱۸۵۴۰m(), cacheRequest, Cl.m۱۹۴۷۹a(cacheBodyUnbuffered));
        String contentType = response.m۱۸۵۰۳b("Content-Type");
        long contentLength = response.m۱۸۵۰۴l().m۱۸۵۳۹l();
        Ca0.Ca u = response.m۱۸۵۱۳u();
        u.m۱۸۵۲۴a(new Ch(contentType, contentLength, Cl.m۱۹۴۸۰a(cacheWritingSource)));
        return u.m۱۸۵۳۱a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.e.a$a  reason: invalid class name */
    public class Ca implements AbstractCs {

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۵۷۱۳c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ AbstractCe f۱۵۷۱۴d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ AbstractCb f۱۵۷۱۵e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ AbstractCd f۱۵۷۱۶f;

        Ca(Ca this$0, AbstractCe eVar, AbstractCb bVar, AbstractCd dVar) {
            this.f۱۵۷۱۴d = eVar;
            this.f۱۵۷۱۵e = bVar;
            this.f۱۵۷۱۶f = dVar;
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۶۴۵b(p۱۴۹f.Cc sink, long byteCount) {
            try {
                long bytesRead = this.f۱۵۷۱۴d.m۱۹۵۵۴b(sink, byteCount);
                if (bytesRead == -1) {
                    if (!this.f۱۵۷۱۳c) {
                        this.f۱۵۷۱۳c = true;
                        this.f۱۵۷۱۶f.close();
                    }
                    return -1;
                }
                sink.m۱۹۳۷۱a(this.f۱۵۷۱۶f.m۱۹۴۱۲a(), sink.m۱۹۴۱۰q() - bytesRead, bytesRead);
                this.f۱۵۷۱۶f.m۱۹۴۱۵d();
                return bytesRead;
            } catch (IOException e) {
                if (!this.f۱۵۷۱۳c) {
                    this.f۱۵۷۱۳c = true;
                    this.f۱۵۷۱۵e.m۱۸۶۴۷a();
                }
                throw e;
            }
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۶۴۶b() {
            return this.f۱۵۷۱۴d.m۱۹۵۵۵b();
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            if (!this.f۱۵۷۱۳c && !p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۳a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f۱۵۷۱۳c = true;
                this.f۱۵۷۱۵e.m۱۸۶۴۷a();
            }
            this.f۱۵۷۱۴d.close();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Cr m۱۸۶۴۱a(Cr cachedHeaders, Cr networkHeaders) {
        Cr.Ca result = new Cr.Ca();
        int size = cachedHeaders.m۱۹۲۰۲b();
        for (int i = 0; i < size; i++) {
            String fieldName = cachedHeaders.m۱۹۲۰۰a(i);
            String value = cachedHeaders.m۱۹۲۰۳b(i);
            if ((!"Warning".equalsIgnoreCase(fieldName) || !value.startsWith("1")) && (m۱۸۶۴۲a(fieldName) || !m۱۸۶۴۳b(fieldName) || networkHeaders.m۱۹۲۰۱a(fieldName) == null)) {
                AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۲a(result, fieldName, value);
            }
        }
        int size2 = networkHeaders.m۱۹۲۰۲b();
        for (int i2 = 0; i2 < size2; i2++) {
            String fieldName2 = networkHeaders.m۱۹۲۰۰a(i2);
            if (!m۱۸۶۴۲a(fieldName2) && m۱۸۶۴۳b(fieldName2)) {
                AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۲a(result, fieldName2, networkHeaders.m۱۹۲۰۳b(i2));
            }
        }
        return result.m۱۹۲۰۸a();
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۸۶۴۳b(String fieldName) {
        return !"Connection".equalsIgnoreCase(fieldName) && !"Keep-Alive".equalsIgnoreCase(fieldName) && !"Proxy-Authenticate".equalsIgnoreCase(fieldName) && !"Proxy-Authorization".equalsIgnoreCase(fieldName) && !"TE".equalsIgnoreCase(fieldName) && !"Trailers".equalsIgnoreCase(fieldName) && !"Transfer-Encoding".equalsIgnoreCase(fieldName) && !"Upgrade".equalsIgnoreCase(fieldName);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۸۶۴۲a(String fieldName) {
        return "Content-Length".equalsIgnoreCase(fieldName) || "Content-Encoding".equalsIgnoreCase(fieldName) || "Content-Type".equalsIgnoreCase(fieldName);
    }
}
