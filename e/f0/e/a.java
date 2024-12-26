package e.f0.e;

import e.a0;
import e.b0;
import e.f0.e.c;
import e.f0.g.e;
import e.f0.g.f;
import e.f0.g.h;
import e.r;
import e.t;
import e.w;
import e.y;
import f.d;
import f.l;
import f.r;
import f.s;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    final f f۳۷۵۱a;

    public a(f cache) {
        this.f۳۷۵۱a = cache;
    }

    @Override // e.t
    public a0 a(t.a chain) {
        a0 cacheCandidate;
        f fVar = this.f۳۷۵۱a;
        if (fVar != null) {
            cacheCandidate = fVar.a(chain.b());
        } else {
            cacheCandidate = null;
        }
        c strategy = new c.a(System.currentTimeMillis(), chain.b(), cacheCandidate).a();
        y networkRequest = strategy.f۳۷۵۶a;
        a0 cacheResponse = strategy.f۳۷۵۷b;
        f fVar2 = this.f۳۷۵۱a;
        if (fVar2 != null) {
            fVar2.a(strategy);
        }
        if (cacheCandidate != null && cacheResponse == null) {
            e.f0.c.a(cacheCandidate.l());
        }
        if (networkRequest == null && cacheResponse == null) {
            a0.a aVar = new a0.a();
            aVar.a(chain.b());
            aVar.a(w.HTTP_1_1);
            aVar.a(504);
            aVar.a("Unsatisfiable Request (only-if-cached)");
            aVar.a(e.f0.c.f۳۷۴۴c);
            aVar.b(-1);
            aVar.a(System.currentTimeMillis());
            return aVar.a();
        } else if (networkRequest == null) {
            a0.a u = cacheResponse.u();
            u.a(a(cacheResponse));
            return u.a();
        } else {
            a0 networkResponse = null;
            try {
                networkResponse = chain.a(networkRequest);
                if (cacheResponse != null) {
                    if (networkResponse.o() == 304) {
                        a0.a u2 = cacheResponse.u();
                        u2.a(a(cacheResponse.q(), networkResponse.q()));
                        u2.b(networkResponse.z());
                        u2.a(networkResponse.x());
                        u2.a(a(cacheResponse));
                        u2.b(a(networkResponse));
                        a0 response = u2.a();
                        networkResponse.l().close();
                        this.f۳۷۵۱a.a();
                        this.f۳۷۵۱a.a(cacheResponse, response);
                        return response;
                    }
                    e.f0.c.a(cacheResponse.l());
                }
                a0.a u3 = networkResponse.u();
                u3.a(a(cacheResponse));
                u3.b(a(networkResponse));
                a0 response2 = u3.a();
                if (this.f۳۷۵۱a != null) {
                    if (e.b(response2) && c.a(response2, networkRequest)) {
                        return a(this.f۳۷۵۱a.a(response2), response2);
                    }
                    if (f.a(networkRequest.e())) {
                        try {
                            this.f۳۷۵۱a.b(networkRequest);
                        } catch (IOException e2) {
                        }
                    }
                }
                return response2;
            } finally {
                if (networkResponse == null && cacheCandidate != null) {
                    e.f0.c.a(cacheCandidate.l());
                }
            }
        }
    }

    private static a0 a(a0 response) {
        if (response == null || response.l() == null) {
            return response;
        }
        a0.a u = response.u();
        u.a((b0) null);
        return u.a();
    }

    private a0 a(b cacheRequest, a0 response) {
        r cacheBodyUnbuffered;
        if (cacheRequest == null || (cacheBodyUnbuffered = cacheRequest.b()) == null) {
            return response;
        }
        s cacheWritingSource = new C۰۱۱۷a(this, response.l().m(), cacheRequest, l.a(cacheBodyUnbuffered));
        String contentType = response.b("Content-Type");
        long contentLength = response.l().l();
        a0.a u = response.u();
        u.a(new h(contentType, contentLength, l.a(cacheWritingSource)));
        return u.a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.e.a$a  reason: collision with other inner class name */
    public class C۰۱۱۷a implements s {

        /* renamed from: c  reason: collision with root package name */
        boolean f۳۷۵۲c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f.e f۳۷۵۳d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f۳۷۵۴e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f۳۷۵۵f;

        C۰۱۱۷a(a this$0, f.e eVar, b bVar, d dVar) {
            this.f۳۷۵۳d = eVar;
            this.f۳۷۵۴e = bVar;
            this.f۳۷۵۵f = dVar;
        }

        @Override // f.s
        public long b(f.c sink, long byteCount) {
            try {
                long bytesRead = this.f۳۷۵۳d.b(sink, byteCount);
                if (bytesRead == -1) {
                    if (!this.f۳۷۵۲c) {
                        this.f۳۷۵۲c = true;
                        this.f۳۷۵۵f.close();
                    }
                    return -1;
                }
                sink.a(this.f۳۷۵۵f.a(), sink.q() - bytesRead, bytesRead);
                this.f۳۷۵۵f.d();
                return bytesRead;
            } catch (IOException e2) {
                if (!this.f۳۷۵۲c) {
                    this.f۳۷۵۲c = true;
                    this.f۳۷۵۴e.a();
                }
                throw e2;
            }
        }

        @Override // f.s
        public f.t b() {
            return this.f۳۷۵۳d.b();
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            if (!this.f۳۷۵۲c && !e.f0.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f۳۷۵۲c = true;
                this.f۳۷۵۴e.a();
            }
            this.f۳۷۵۳d.close();
        }
    }

    private static e.r a(e.r cachedHeaders, e.r networkHeaders) {
        r.a result = new r.a();
        int size = cachedHeaders.b();
        for (int i = 0; i < size; i++) {
            String fieldName = cachedHeaders.a(i);
            String value = cachedHeaders.b(i);
            if ((!"Warning".equalsIgnoreCase(fieldName) || !value.startsWith("1")) && (a(fieldName) || !b(fieldName) || networkHeaders.a(fieldName) == null)) {
                e.f0.a.f۳۷۴۰a.a(result, fieldName, value);
            }
        }
        int size2 = networkHeaders.b();
        for (int i2 = 0; i2 < size2; i2++) {
            String fieldName2 = networkHeaders.a(i2);
            if (!a(fieldName2) && b(fieldName2)) {
                e.f0.a.f۳۷۴۰a.a(result, fieldName2, networkHeaders.b(i2));
            }
        }
        return result.a();
    }

    static boolean b(String fieldName) {
        return !"Connection".equalsIgnoreCase(fieldName) && !"Keep-Alive".equalsIgnoreCase(fieldName) && !"Proxy-Authenticate".equalsIgnoreCase(fieldName) && !"Proxy-Authorization".equalsIgnoreCase(fieldName) && !"TE".equalsIgnoreCase(fieldName) && !"Trailers".equalsIgnoreCase(fieldName) && !"Transfer-Encoding".equalsIgnoreCase(fieldName) && !"Upgrade".equalsIgnoreCase(fieldName);
    }

    static boolean a(String fieldName) {
        return "Content-Length".equalsIgnoreCase(fieldName) || "Content-Encoding".equalsIgnoreCase(fieldName) || "Content-Type".equalsIgnoreCase(fieldName);
    }
}
