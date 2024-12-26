package e;

import e.a0;
import e.e;
import e.f0.c;
import e.f0.e.f;
import e.f0.f.d;
import e.f0.f.g;
import e.p;
import e.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class v implements Cloneable, e.a, e0 {
    static final List<w> D = c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<k> E = c.a(k.f۴۰۶۶f, k.f۴۰۶۷g);
    final int A;
    final int B;
    final int C;

    /* renamed from: c  reason: collision with root package name */
    final n f۴۱۲۳c;

    /* renamed from: d  reason: collision with root package name */
    final Proxy f۴۱۲۴d;

    /* renamed from: e  reason: collision with root package name */
    final List<w> f۴۱۲۵e;

    /* renamed from: f  reason: collision with root package name */
    final List<k> f۴۱۲۶f;

    /* renamed from: g  reason: collision with root package name */
    final List<t> f۴۱۲۷g;

    /* renamed from: h  reason: collision with root package name */
    final List<t> f۴۱۲۸h;
    final p.c i;
    final ProxySelector j;
    final m k;
    final c l;
    final f m;
    final SocketFactory n;
    final SSLSocketFactory o;
    final e.f0.l.c p;
    final HostnameVerifier q;
    final g r;
    final b s;
    final b t;
    final j u;
    final o v;
    final boolean w;
    final boolean x;
    final boolean y;
    final int z;

    static {
        e.f0.a.f۳۷۴۰a = new a();
    }

    class a extends e.f0.a {
        a() {
        }

        @Override // e.f0.a
        public void a(r.a builder, String line) {
            builder.a(line);
        }

        @Override // e.f0.a
        public void a(r.a builder, String name, String value) {
            builder.b(name, value);
        }

        @Override // e.f0.a
        public boolean a(j pool, e.f0.f.c connection) {
            return pool.a(connection);
        }

        @Override // e.f0.a
        public e.f0.f.c a(j pool, a address, g streamAllocation, c0 route) {
            return pool.a(address, streamAllocation, route);
        }

        @Override // e.f0.a
        public boolean a(a a2, a b2) {
            return a2.a(b2);
        }

        @Override // e.f0.a
        public Socket a(j pool, a address, g streamAllocation) {
            return pool.a(address, streamAllocation);
        }

        @Override // e.f0.a
        public void b(j pool, e.f0.f.c connection) {
            pool.b(connection);
        }

        @Override // e.f0.a
        public d a(j connectionPool) {
            return connectionPool.f۴۰۶۲e;
        }

        @Override // e.f0.a
        public int a(a0.a responseBuilder) {
            return responseBuilder.f۳۶۸۰c;
        }

        @Override // e.f0.a
        public void a(k tlsConfiguration, SSLSocket sslSocket, boolean isFallback) {
            tlsConfiguration.a(sslSocket, isFallback);
        }
    }

    public v() {
        this(new b());
    }

    v(b builder) {
        this.f۴۱۲۳c = builder.f۴۱۲۹a;
        this.f۴۱۲۴d = builder.f۴۱۳۰b;
        this.f۴۱۲۵e = builder.f۴۱۳۱c;
        this.f۴۱۲۶f = builder.f۴۱۳۲d;
        this.f۴۱۲۷g = c.a(builder.f۴۱۳۳e);
        this.f۴۱۲۸h = c.a(builder.f۴۱۳۴f);
        this.i = builder.f۴۱۳۵g;
        this.j = builder.f۴۱۳۶h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
        this.n = builder.l;
        boolean isTLS = false;
        for (k spec : this.f۴۱۲۶f) {
            isTLS = isTLS || spec.b();
        }
        if (builder.m != null || !isTLS) {
            this.o = builder.m;
            this.p = builder.n;
        } else {
            X509TrustManager trustManager = B();
            this.o = a(trustManager);
            this.p = e.f0.l.c.a(trustManager);
        }
        this.q = builder.o;
        this.r = builder.p.a(this.p);
        this.s = builder.q;
        this.t = builder.r;
        this.u = builder.s;
        this.v = builder.t;
        this.w = builder.u;
        this.x = builder.v;
        this.y = builder.w;
        this.z = builder.x;
        this.A = builder.y;
        this.B = builder.z;
        this.C = builder.A;
        if (this.f۴۱۲۷g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f۴۱۲۷g);
        } else if (this.f۴۱۲۸h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f۴۱۲۸h);
        }
    }

    private X509TrustManager B() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw c.a("No System TLS", (Exception) e2);
        }
    }

    private SSLSocketFactory a(X509TrustManager trustManager) {
        try {
            SSLContext sslContext = e.f0.k.f.d().b();
            sslContext.init(null, new TrustManager[]{trustManager}, null);
            return sslContext.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw c.a("No System TLS", (Exception) e2);
        }
    }

    public int d() {
        return this.z;
    }

    public int w() {
        return this.A;
    }

    public int A() {
        return this.B;
    }

    public int r() {
        return this.C;
    }

    public Proxy t() {
        return this.f۴۱۲۴d;
    }

    public ProxySelector v() {
        return this.j;
    }

    public m g() {
        return this.k;
    }

    public c b() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public f p() {
        c cVar = this.l;
        return cVar != null ? cVar.f۳۶۸۹c : this.m;
    }

    public o i() {
        return this.v;
    }

    public SocketFactory y() {
        return this.n;
    }

    public SSLSocketFactory z() {
        return this.o;
    }

    public HostnameVerifier n() {
        return this.q;
    }

    public g c() {
        return this.r;
    }

    public b a() {
        return this.t;
    }

    public b u() {
        return this.s;
    }

    public j e() {
        return this.u;
    }

    public boolean m() {
        return this.w;
    }

    public boolean k() {
        return this.x;
    }

    public boolean x() {
        return this.y;
    }

    public n h() {
        return this.f۴۱۲۳c;
    }

    public List<w> s() {
        return this.f۴۱۲۵e;
    }

    public List<k> f() {
        return this.f۴۱۲۶f;
    }

    public List<t> o() {
        return this.f۴۱۲۷g;
    }

    public List<t> q() {
        return this.f۴۱۲۸h;
    }

    public p.c j() {
        return this.i;
    }

    @Override // e.e.a
    public e a(y request) {
        return x.a(this, request, false);
    }

    public static final class b {
        int A;

        /* renamed from: a  reason: collision with root package name */
        n f۴۱۲۹a = new n();

        /* renamed from: b  reason: collision with root package name */
        Proxy f۴۱۳۰b;

        /* renamed from: c  reason: collision with root package name */
        List<w> f۴۱۳۱c = v.D;

        /* renamed from: d  reason: collision with root package name */
        List<k> f۴۱۳۲d = v.E;

        /* renamed from: e  reason: collision with root package name */
        final List<t> f۴۱۳۳e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<t> f۴۱۳۴f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        p.c f۴۱۳۵g = p.a(p.f۴۰۹۳a);

        /* renamed from: h  reason: collision with root package name */
        ProxySelector f۴۱۳۶h = ProxySelector.getDefault();
        m i = m.f۴۰۸۴a;
        c j;
        f k;
        SocketFactory l = SocketFactory.getDefault();
        SSLSocketFactory m;
        e.f0.l.c n;
        HostnameVerifier o = e.f0.l.d.f۴۰۴۰a;
        g p = g.f۴۰۴۱c;
        b q;
        b r;
        j s;
        o t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            b bVar = b.f۳۶۸۶a;
            this.q = bVar;
            this.r = bVar;
            this.s = new j();
            this.t = o.f۴۰۹۲a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 10000;
            this.y = 10000;
            this.z = 10000;
            this.A = 0;
        }

        public b a(c cache) {
            this.j = cache;
            this.k = null;
            return this;
        }

        public v a() {
            return new v(this);
        }
    }
}
