package e.f0.i;

import e.a0;
import e.b0;
import e.f0.f.g;
import e.f0.g.c;
import e.f0.g.e;
import e.f0.g.h;
import e.f0.g.i;
import e.f0.g.k;
import e.r;
import e.t;
import e.v;
import e.w;
import e.y;
import f.l;
import f.r;
import f.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;

public final class f implements c {

    /* renamed from: e  reason: collision with root package name */
    private static final f.f f۳۹۰۶e = f.f.d("connection");

    /* renamed from: f  reason: collision with root package name */
    private static final f.f f۳۹۰۷f = f.f.d("host");

    /* renamed from: g  reason: collision with root package name */
    private static final f.f f۳۹۰۸g = f.f.d("keep-alive");

    /* renamed from: h  reason: collision with root package name */
    private static final f.f f۳۹۰۹h = f.f.d("proxy-connection");
    private static final f.f i = f.f.d("transfer-encoding");
    private static final f.f j = f.f.d("te");
    private static final f.f k = f.f.d("encoding");
    private static final f.f l = f.f.d("upgrade");
    private static final List<f.f> m = e.f0.c.a(f۳۹۰۶e, f۳۹۰۷f, f۳۹۰۸g, f۳۹۰۹h, j, i, k, l, c.f۳۸۷۸f, c.f۳۸۷۹g, c.f۳۸۸۰h, c.i);
    private static final List<f.f> n = e.f0.c.a(f۳۹۰۶e, f۳۹۰۷f, f۳۹۰۸g, f۳۹۰۹h, j, i, k, l);

    /* renamed from: a  reason: collision with root package name */
    private final t.a f۳۹۱۰a;

    /* renamed from: b  reason: collision with root package name */
    final g f۳۹۱۱b;

    /* renamed from: c  reason: collision with root package name */
    private final g f۳۹۱۲c;

    /* renamed from: d  reason: collision with root package name */
    private i f۳۹۱۳d;

    public f(v client, t.a chain, g streamAllocation, g connection) {
        this.f۳۹۱۰a = chain;
        this.f۳۹۱۱b = streamAllocation;
        this.f۳۹۱۲c = connection;
    }

    @Override // e.f0.g.c
    public r a(y request, long contentLength) {
        return this.f۳۹۱۳d.d();
    }

    @Override // e.f0.g.c
    public void a(y request) {
        if (this.f۳۹۱۳d == null) {
            this.f۳۹۱۳d = this.f۳۹۱۲c.a((List<c>) b(request), request.a() != null);
            this.f۳۹۱۳d.h().a((long) this.f۳۹۱۰a.d(), TimeUnit.MILLISECONDS);
            this.f۳۹۱۳d.l().a((long) this.f۳۹۱۰a.a(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // e.f0.g.c
    public void b() {
        this.f۳۹۱۲c.flush();
    }

    @Override // e.f0.g.c
    public void a() {
        this.f۳۹۱۳d.d().close();
    }

    @Override // e.f0.g.c
    public a0.a a(boolean expectContinue) {
        a0.a responseBuilder = a((List<c>) this.f۳۹۱۳d.j());
        if (!expectContinue || e.f0.a.f۳۷۴۰a.a(responseBuilder) != 100) {
            return responseBuilder;
        }
        return null;
    }

    public static List<c> b(y request) {
        e.r headers = request.c();
        List<Header> result = new ArrayList<>(headers.b() + 4);
        result.add(new c(c.f۳۸۷۸f, request.e()));
        result.add(new c(c.f۳۸۷۹g, i.a(request.g())));
        String host = request.a("Host");
        if (host != null) {
            result.add(new c(c.i, host));
        }
        result.add(new c(c.f۳۸۸۰h, request.g().m()));
        int size = headers.b();
        for (int i2 = 0; i2 < size; i2++) {
            f.f name = f.f.d(headers.a(i2).toLowerCase(Locale.US));
            if (!m.contains(name)) {
                result.add(new c(name, headers.b(i2)));
            }
        }
        return result;
    }

    public static a0.a a(List<c> list) {
        k statusLine = null;
        r.a headersBuilder = new r.a();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c header = list.get(i2);
            if (header != null) {
                f.f name = header.f۳۸۸۱a;
                String value = header.f۳۸۸۲b.i();
                if (name.equals(c.f۳۸۷۷e)) {
                    statusLine = k.a("HTTP/1.1 " + value);
                } else if (!n.contains(name)) {
                    e.f0.a.f۳۷۴۰a.a(headersBuilder, name.i(), value);
                }
            } else if (statusLine != null && statusLine.f۳۸۴۷b == 100) {
                statusLine = null;
                headersBuilder = new r.a();
            }
        }
        if (statusLine != null) {
            a0.a aVar = new a0.a();
            aVar.a(w.HTTP_2);
            aVar.a(statusLine.f۳۸۴۷b);
            aVar.a(statusLine.f۳۸۴۸c);
            aVar.a(headersBuilder.a());
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // e.f0.g.c
    public b0 a(a0 response) {
        g gVar = this.f۳۹۱۱b;
        gVar.f۳۸۲۲f.e(gVar.f۳۸۲۱e);
        return new h(response.b("Content-Type"), e.a(response), l.a(new a(this.f۳۹۱۳d.e())));
    }

    class a extends f.h {

        /* renamed from: d  reason: collision with root package name */
        boolean f۳۹۱۴d = false;

        /* renamed from: e  reason: collision with root package name */
        long f۳۹۱۵e = 0;

        a(s delegate) {
            super(delegate);
        }

        @Override // f.h, f.s
        public long b(f.c sink, long byteCount) {
            try {
                long read = d().b(sink, byteCount);
                if (read > 0) {
                    this.f۳۹۱۵e += read;
                }
                return read;
            } catch (IOException e2) {
                a(e2);
                throw e2;
            }
        }

        @Override // f.h, java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            super.close();
            a(null);
        }

        private void a(IOException e2) {
            if (!this.f۳۹۱۴d) {
                this.f۳۹۱۴d = true;
                f fVar = f.this;
                fVar.f۳۹۱۱b.a(false, fVar, this.f۳۹۱۵e, e2);
            }
        }
    }
}
