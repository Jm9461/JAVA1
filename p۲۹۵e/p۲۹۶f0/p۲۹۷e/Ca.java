package p۲۹۵e.p۲۹۶f0.p۲۹۷e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p۲۹۵e.AbstractCb0;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cr;
import p۲۹۵e.Cy;
import p۲۹۵e.EnumCw;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.AbstractCa;
import p۲۹۵e.p۲۹۶f0.p۲۹۷e.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ce;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cf;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ch;
import p۳۰۵f.Cl;
import p۳۰۵f.Ct;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca implements InterfaceCt {

    /* renamed from: a, reason: contains not printable characters */
    final InterfaceCf f۱۵۷۱۲a;

    public Ca(InterfaceCf cache) {
        this.f۱۵۷۱۲a = cache;
    }

    @Override // p۲۹۵e.InterfaceCt
    /* renamed from: a, reason: contains not printable characters */
    public Ca0 mo۱۷۱۸۳a(InterfaceCt.a chain) {
        Ca0 cacheCandidate;
        InterfaceCf interfaceCf = this.f۱۵۷۱۲a;
        if (interfaceCf != null) {
            cacheCandidate = interfaceCf.mo۱۶۶۱۰a(chain.mo۱۷۱۸۶b());
        } else {
            cacheCandidate = null;
        }
        long now = System.currentTimeMillis();
        Cc strategy = new Cc.a(now, chain.mo۱۷۱۸۶b(), cacheCandidate).m۱۶۵۷۶a();
        Cy networkRequest = strategy.f۱۵۷۱۷a;
        Ca0 cacheResponse = strategy.f۱۵۷۱۸b;
        InterfaceCf interfaceCf2 = this.f۱۵۷۱۲a;
        if (interfaceCf2 != null) {
            interfaceCf2.mo۱۶۶۱۴a(strategy);
        }
        if (cacheCandidate != null && cacheResponse == null) {
            p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۲a(cacheCandidate.m۱۶۴۲۵l());
        }
        if (networkRequest == null && cacheResponse == null) {
            Ca0.a aVar = new Ca0.a();
            aVar.m۱۶۴۴۹a(chain.mo۱۷۱۸۶b());
            aVar.m۱۶۴۴۸a(EnumCw.HTTP_1_1);
            aVar.m۱۶۴۴۲a(504);
            aVar.m۱۶۴۵۰a("Unsatisfiable Request (only-if-cached)");
            aVar.m۱۶۴۴۵a(p۲۹۵e.p۲۹۶f0.Cc.f۱۵۷۰۵c);
            aVar.m۱۶۴۵۳b(-1L);
            aVar.m۱۶۴۴۳a(System.currentTimeMillis());
            return aVar.m۱۶۴۵۲a();
        }
        if (networkRequest == null) {
            Ca0.a aVar2 = cacheResponse.m۱۶۴۳۴u();
            aVar2.m۱۶۴۴۴a(m۱۶۵۶۰a(cacheResponse));
            return aVar2.m۱۶۴۵۲a();
        }
        Ca0 networkResponse = null;
        try {
            networkResponse = chain.mo۱۷۱۸۵a(networkRequest);
            if (cacheResponse != null) {
                if (networkResponse.m۱۶۴۲۸o() == 304) {
                    Ca0.a aVar3 = cacheResponse.m۱۶۴۳۴u();
                    aVar3.m۱۶۴۴۷a(m۱۶۵۶۲a(cacheResponse.m۱۶۴۳۰q(), networkResponse.m۱۶۴۳۰q()));
                    aVar3.m۱۶۴۵۳b(networkResponse.m۱۶۴۳۹z());
                    aVar3.m۱۶۴۴۳a(networkResponse.m۱۶۴۳۷x());
                    aVar3.m۱۶۴۴۴a(m۱۶۵۶۰a(cacheResponse));
                    aVar3.m۱۶۴۵۴b(m۱۶۵۶۰a(networkResponse));
                    Ca0 response = aVar3.m۱۶۴۵۲a();
                    networkResponse.m۱۶۴۲۵l().close();
                    this.f۱۵۷۱۲a.mo۱۶۶۱۲a();
                    this.f۱۵۷۱۲a.mo۱۶۶۱۳a(cacheResponse, response);
                    return response;
                }
                p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۲a(cacheResponse.m۱۶۴۲۵l());
            }
            Ca0.a aVar4 = networkResponse.m۱۶۴۳۴u();
            aVar4.m۱۶۴۴۴a(m۱۶۵۶۰a(cacheResponse));
            aVar4.m۱۶۴۵۴b(m۱۶۵۶۰a(networkResponse));
            Ca0 response2 = aVar4.m۱۶۴۵۲a();
            if (this.f۱۵۷۱۲a != null) {
                if (Ce.m۱۶۶۹۳b(response2) && Cc.m۱۶۵۷۰a(response2, networkRequest)) {
                    InterfaceCb cacheRequest = this.f۱۵۷۱۲a.mo۱۶۶۱۱a(response2);
                    return m۱۶۵۶۱a(cacheRequest, response2);
                }
                if (Cf.m۱۶۶۹۹a(networkRequest.m۱۷۲۴۹e())) {
                    try {
                        this.f۱۵۷۱۲a.mo۱۶۶۱۵b(networkRequest);
                    } catch (IOException e2) {
                    }
                }
            }
            return response2;
        } finally {
            if (networkResponse == null && cacheCandidate != null) {
                p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۲a(cacheCandidate.m۱۶۴۲۵l());
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Ca0 m۱۶۵۶۰a(Ca0 response) {
        if (response != null && response.m۱۶۴۲۵l() != null) {
            Ca0.a aVar = response.m۱۶۴۳۴u();
            aVar.m۱۶۴۴۵a((AbstractCb0) null);
            return aVar.m۱۶۴۵۲a();
        }
        return response;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Ca0 m۱۶۵۶۱a(InterfaceCb cacheRequest, Ca0 response) {
        InterfaceCr cacheBodyUnbuffered;
        if (cacheRequest == null || (cacheBodyUnbuffered = cacheRequest.mo۱۶۵۶۹b()) == null) {
            return response;
        }
        InterfaceCe source = response.m۱۶۴۲۵l().mo۱۶۷۱۶m();
        InterfaceCd cacheBody = Cl.m۱۷۴۰۲a(cacheBodyUnbuffered);
        InterfaceCs cacheWritingSource = new a(this, source, cacheRequest, cacheBody);
        String contentType = response.m۱۶۴۲۴b("Content-Type");
        long contentLength = response.m۱۶۴۲۵l().mo۱۶۷۱۵l();
        Ca0.a aVar = response.m۱۶۴۳۴u();
        aVar.m۱۶۴۴۵a(new Ch(contentType, contentLength, Cl.m۱۷۴۰۳a(cacheWritingSource)));
        return aVar.m۱۶۴۵۲a();
    }

    /* renamed from: e.f0.e.a$a */
    class a implements InterfaceCs {

        /* renamed from: c, reason: contains not printable characters */
        boolean f۱۵۷۱۳c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ InterfaceCe f۱۵۷۱۴d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ InterfaceCb f۱۵۷۱۵e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ InterfaceCd f۱۵۷۱۶f;

        a(Ca this$0, InterfaceCe interfaceCe, InterfaceCb interfaceCb, InterfaceCd interfaceCd) {
            this.f۱۵۷۱۴d = interfaceCe;
            this.f۱۵۷۱۵e = interfaceCb;
            this.f۱۵۷۱۶f = interfaceCd;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(p۳۰۵f.Cc sink, long byteCount) {
            try {
                long bytesRead = this.f۱۵۷۱۴d.mo۱۷۴۷۷b(sink, byteCount);
                if (bytesRead == -1) {
                    if (!this.f۱۵۷۱۳c) {
                        this.f۱۵۷۱۳c = true;
                        this.f۱۵۷۱۶f.close();
                    }
                    return -1L;
                }
                sink.m۱۷۲۹۳a(this.f۱۵۷۱۶f.mo۱۷۴۳۳a(), sink.m۱۷۳۳۲q() - bytesRead, bytesRead);
                this.f۱۵۷۱۶f.mo۱۷۴۲۹d();
                return bytesRead;
            } catch (IOException e2) {
                if (!this.f۱۵۷۱۳c) {
                    this.f۱۵۷۱۳c = true;
                    this.f۱۵۷۱۵e.mo۱۶۵۶۸a();
                }
                throw e2;
            }
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۸b() {
            return this.f۱۵۷۱۴d.mo۱۷۴۷۸b();
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f۱۵۷۱۳c && !p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۴a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f۱۵۷۱۳c = true;
                this.f۱۵۷۱۵e.mo۱۶۵۶۸a();
            }
            this.f۱۵۷۱۴d.close();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Cr m۱۶۵۶۲a(Cr cachedHeaders, Cr networkHeaders) {
        Cr.a result = new Cr.a();
        int size = cachedHeaders.m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            String fieldName = cachedHeaders.m۱۷۱۲۱a(i);
            String value = cachedHeaders.m۱۷۱۲۴b(i);
            if ((!"Warning".equalsIgnoreCase(fieldName) || !value.startsWith("1")) && (m۱۶۵۶۳a(fieldName) || !m۱۶۵۶۴b(fieldName) || networkHeaders.m۱۷۱۲۲a(fieldName) == null)) {
                AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۴a(result, fieldName, value);
            }
        }
        int size2 = networkHeaders.m۱۷۱۲۳b();
        for (int i2 = 0; i2 < size2; i2++) {
            String fieldName2 = networkHeaders.m۱۷۱۲۱a(i2);
            if (!m۱۶۵۶۳a(fieldName2) && m۱۶۵۶۴b(fieldName2)) {
                AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۴a(result, fieldName2, networkHeaders.m۱۷۱۲۴b(i2));
            }
        }
        return result.m۱۷۱۲۹a();
    }

    /* renamed from: b, reason: contains not printable characters */
    static boolean m۱۶۵۶۴b(String fieldName) {
        return ("Connection".equalsIgnoreCase(fieldName) || "Keep-Alive".equalsIgnoreCase(fieldName) || "Proxy-Authenticate".equalsIgnoreCase(fieldName) || "Proxy-Authorization".equalsIgnoreCase(fieldName) || "TE".equalsIgnoreCase(fieldName) || "Trailers".equalsIgnoreCase(fieldName) || "Transfer-Encoding".equalsIgnoreCase(fieldName) || "Upgrade".equalsIgnoreCase(fieldName)) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۶۵۶۳a(String fieldName) {
        return "Content-Length".equalsIgnoreCase(fieldName) || "Content-Encoding".equalsIgnoreCase(fieldName) || "Content-Type".equalsIgnoreCase(fieldName);
    }
}
