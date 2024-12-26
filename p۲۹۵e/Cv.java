package p۲۹۵e;

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
import p۲۹۵e.AbstractCp;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cr;
import p۲۹۵e.InterfaceCe;
import p۲۹۵e.p۲۹۶f0.AbstractCa;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cd;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg;
import p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.AbstractCc;

/* renamed from: e.v, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cv implements Cloneable, InterfaceCe.a, InterfaceCe0 {

    /* renamed from: D, reason: contains not printable characters */
    static final List<EnumCw> f۱۶۱۷۱D = Cc.m۱۶۵۳۹a(EnumCw.HTTP_2, EnumCw.HTTP_1_1);

    /* renamed from: E, reason: contains not printable characters */
    static final List<Ck> f۱۶۱۷۲E = Cc.m۱۶۵۳۹a(Ck.f۱۶۱۰۸f, Ck.f۱۶۱۰۹g);

    /* renamed from: A, reason: contains not printable characters */
    final int f۱۶۱۷۳A;

    /* renamed from: B, reason: contains not printable characters */
    final int f۱۶۱۷۴B;

    /* renamed from: C, reason: contains not printable characters */
    final int f۱۶۱۷۵C;

    /* renamed from: c, reason: contains not printable characters */
    final Cn f۱۶۱۷۶c;

    /* renamed from: d, reason: contains not printable characters */
    final Proxy f۱۶۱۷۷d;

    /* renamed from: e, reason: contains not printable characters */
    final List<EnumCw> f۱۶۱۷۸e;

    /* renamed from: f, reason: contains not printable characters */
    final List<Ck> f۱۶۱۷۹f;

    /* renamed from: g, reason: contains not printable characters */
    final List<InterfaceCt> f۱۶۱۸۰g;

    /* renamed from: h, reason: contains not printable characters */
    final List<InterfaceCt> f۱۶۱۸۱h;

    /* renamed from: i, reason: contains not printable characters */
    final AbstractCp.c f۱۶۱۸۲i;

    /* renamed from: j, reason: contains not printable characters */
    final ProxySelector f۱۶۱۸۳j;

    /* renamed from: k, reason: contains not printable characters */
    final InterfaceCm f۱۶۱۸۴k;

    /* renamed from: l, reason: contains not printable characters */
    final Cc f۱۶۱۸۵l;

    /* renamed from: m, reason: contains not printable characters */
    final InterfaceCf f۱۶۱۸۶m;

    /* renamed from: n, reason: contains not printable characters */
    final SocketFactory f۱۶۱۸۷n;

    /* renamed from: o, reason: contains not printable characters */
    final SSLSocketFactory f۱۶۱۸۸o;

    /* renamed from: p, reason: contains not printable characters */
    final AbstractCc f۱۶۱۸۹p;

    /* renamed from: q, reason: contains not printable characters */
    final HostnameVerifier f۱۶۱۹۰q;

    /* renamed from: r, reason: contains not printable characters */
    final Cg f۱۶۱۹۱r;

    /* renamed from: s, reason: contains not printable characters */
    final InterfaceCb f۱۶۱۹۲s;

    /* renamed from: t, reason: contains not printable characters */
    final InterfaceCb f۱۶۱۹۳t;

    /* renamed from: u, reason: contains not printable characters */
    final Cj f۱۶۱۹۴u;

    /* renamed from: v, reason: contains not printable characters */
    final InterfaceCo f۱۶۱۹۵v;

    /* renamed from: w, reason: contains not printable characters */
    final boolean f۱۶۱۹۶w;

    /* renamed from: x, reason: contains not printable characters */
    final boolean f۱۶۱۹۷x;

    /* renamed from: y, reason: contains not printable characters */
    final boolean f۱۶۱۹۸y;

    /* renamed from: z, reason: contains not printable characters */
    final int f۱۶۱۹۹z;

    static {
        AbstractCa.f۱۵۷۰۱a = new a();
    }

    /* renamed from: e.v$a */
    final class a extends AbstractCa {
        a() {
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۲۲۳a(Cr.a builder, String line) {
            builder.m۱۷۱۲۷a(line);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۲۲۴a(Cr.a builder, String name, String value) {
            builder.m۱۷۱۳۰b(name, value);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۷۲۲۶a(Cj pool, p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection) {
            return pool.m۱۷۰۵۰a(connection);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc mo۱۷۲۱۹a(Cj pool, Ca address, Cg streamAllocation, Cc0 route) {
            return pool.m۱۷۰۴۸a(address, streamAllocation, route);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۷۲۲۵a(Ca a2, Ca b2) {
            return a2.m۱۶۴۱۲a(b2);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public Socket mo۱۷۲۲۱a(Cj pool, Ca address, Cg streamAllocation) {
            return pool.m۱۷۰۴۹a(address, streamAllocation);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۲۷b(Cj pool, p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection) {
            pool.m۱۷۰۵۱b(connection);
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public Cd mo۱۷۲۲۰a(Cj connectionPool) {
            return connectionPool.f۱۶۱۰۴e;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۷۲۱۸a(Ca0.a responseBuilder) {
            return responseBuilder.f۱۵۶۲۵c;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۲۲۲a(Ck tlsConfiguration, SSLSocket sslSocket, boolean isFallback) {
            tlsConfiguration.m۱۷۰۵۴a(sslSocket, isFallback);
        }
    }

    public Cv() {
        this(new b());
    }

    Cv(b builder) {
        this.f۱۶۱۷۶c = builder.f۱۶۲۰۱a;
        this.f۱۶۱۷۷d = builder.f۱۶۲۰۲b;
        this.f۱۶۱۷۸e = builder.f۱۶۲۰۳c;
        this.f۱۶۱۷۹f = builder.f۱۶۲۰۴d;
        this.f۱۶۱۸۰g = Cc.m۱۶۵۳۸a(builder.f۱۶۲۰۵e);
        this.f۱۶۱۸۱h = Cc.m۱۶۵۳۸a(builder.f۱۶۲۰۶f);
        this.f۱۶۱۸۲i = builder.f۱۶۲۰۷g;
        this.f۱۶۱۸۳j = builder.f۱۶۲۰۸h;
        this.f۱۶۱۸۴k = builder.f۱۶۲۰۹i;
        this.f۱۶۱۸۵l = builder.f۱۶۲۱۰j;
        this.f۱۶۱۸۶m = builder.f۱۶۲۱۱k;
        this.f۱۶۱۸۷n = builder.f۱۶۲۱۲l;
        boolean isTLS = false;
        for (Ck spec : this.f۱۶۱۷۹f) {
            isTLS = isTLS || spec.m۱۷۰۵۶b();
        }
        if (builder.f۱۶۲۱۳m != null || !isTLS) {
            this.f۱۶۱۸۸o = builder.f۱۶۲۱۳m;
            this.f۱۶۱۸۹p = builder.f۱۶۲۱۴n;
        } else {
            X509TrustManager trustManager = m۱۷۱۸۹B();
            this.f۱۶۱۸۸o = m۱۷۱۹۰a(trustManager);
            this.f۱۶۱۸۹p = AbstractCc.m۱۷۰۲۴a(trustManager);
        }
        this.f۱۶۱۹۰q = builder.f۱۶۲۱۵o;
        this.f۱۶۱۹۱r = builder.f۱۶۲۱۶p.m۱۷۰۳۶a(this.f۱۶۱۸۹p);
        this.f۱۶۱۹۲s = builder.f۱۶۲۱۷q;
        this.f۱۶۱۹۳t = builder.f۱۶۲۱۸r;
        this.f۱۶۱۹۴u = builder.f۱۶۲۱۹s;
        this.f۱۶۱۹۵v = builder.f۱۶۲۲۰t;
        this.f۱۶۱۹۶w = builder.f۱۶۲۲۱u;
        this.f۱۶۱۹۷x = builder.f۱۶۲۲۲v;
        this.f۱۶۱۹۸y = builder.f۱۶۲۲۳w;
        this.f۱۶۱۹۹z = builder.f۱۶۲۲۴x;
        this.f۱۶۱۷۳A = builder.f۱۶۲۲۵y;
        this.f۱۶۱۷۴B = builder.f۱۶۲۲۶z;
        this.f۱۶۱۷۵C = builder.f۱۶۲۰۰A;
        if (this.f۱۶۱۸۰g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f۱۶۱۸۰g);
        }
        if (this.f۱۶۱۸۱h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f۱۶۱۸۱h);
        }
    }

    /* renamed from: B, reason: contains not printable characters */
    private X509TrustManager m۱۷۱۸۹B() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException e2) {
            throw Cc.m۱۶۵۳۲a("No System TLS", (Exception) e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private SSLSocketFactory m۱۷۱۹۰a(X509TrustManager trustManager) {
        try {
            SSLContext sslContext = Cf.m۱۷۰۰۷d().mo۱۷۰۱۹b();
            sslContext.init(null, new TrustManager[]{trustManager}, null);
            return sslContext.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw Cc.m۱۶۵۳۲a("No System TLS", (Exception) e2);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۷۱۹۶d() {
        return this.f۱۶۱۹۹z;
    }

    /* renamed from: w, reason: contains not printable characters */
    public int m۱۷۲۱۴w() {
        return this.f۱۶۱۷۳A;
    }

    /* renamed from: A, reason: contains not printable characters */
    public int m۱۷۱۹۱A() {
        return this.f۱۶۱۷۴B;
    }

    /* renamed from: r, reason: contains not printable characters */
    public int m۱۷۲۰۹r() {
        return this.f۱۶۱۷۵C;
    }

    /* renamed from: t, reason: contains not printable characters */
    public Proxy m۱۷۲۱۱t() {
        return this.f۱۶۱۷۷d;
    }

    /* renamed from: v, reason: contains not printable characters */
    public ProxySelector m۱۷۲۱۳v() {
        return this.f۱۶۱۸۳j;
    }

    /* renamed from: g, reason: contains not printable characters */
    public InterfaceCm m۱۷۱۹۹g() {
        return this.f۱۶۱۸۴k;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cc m۱۷۱۹۴b() {
        return this.f۱۶۱۸۵l;
    }

    /* renamed from: p, reason: contains not printable characters */
    InterfaceCf m۱۷۲۰۷p() {
        Cc cc = this.f۱۶۱۸۵l;
        return cc != null ? cc.f۱۵۶۳۸c : this.f۱۶۱۸۶m;
    }

    /* renamed from: i, reason: contains not printable characters */
    public InterfaceCo m۱۷۲۰۱i() {
        return this.f۱۶۱۹۵v;
    }

    /* renamed from: y, reason: contains not printable characters */
    public SocketFactory m۱۷۲۱۶y() {
        return this.f۱۶۱۸۷n;
    }

    /* renamed from: z, reason: contains not printable characters */
    public SSLSocketFactory m۱۷۲۱۷z() {
        return this.f۱۶۱۸۸o;
    }

    /* renamed from: n, reason: contains not printable characters */
    public HostnameVerifier m۱۷۲۰۵n() {
        return this.f۱۶۱۹۰q;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cg m۱۷۱۹۵c() {
        return this.f۱۶۱۹۱r;
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCb m۱۷۱۹۲a() {
        return this.f۱۶۱۹۳t;
    }

    /* renamed from: u, reason: contains not printable characters */
    public InterfaceCb m۱۷۲۱۲u() {
        return this.f۱۶۱۹۲s;
    }

    /* renamed from: e, reason: contains not printable characters */
    public Cj m۱۷۱۹۷e() {
        return this.f۱۶۱۹۴u;
    }

    /* renamed from: m, reason: contains not printable characters */
    public boolean m۱۷۲۰۴m() {
        return this.f۱۶۱۹۶w;
    }

    /* renamed from: k, reason: contains not printable characters */
    public boolean m۱۷۲۰۳k() {
        return this.f۱۶۱۹۷x;
    }

    /* renamed from: x, reason: contains not printable characters */
    public boolean m۱۷۲۱۵x() {
        return this.f۱۶۱۹۸y;
    }

    /* renamed from: h, reason: contains not printable characters */
    public Cn m۱۷۲۰۰h() {
        return this.f۱۶۱۷۶c;
    }

    /* renamed from: s, reason: contains not printable characters */
    public List<EnumCw> m۱۷۲۱۰s() {
        return this.f۱۶۱۷۸e;
    }

    /* renamed from: f, reason: contains not printable characters */
    public List<Ck> m۱۷۱۹۸f() {
        return this.f۱۶۱۷۹f;
    }

    /* renamed from: o, reason: contains not printable characters */
    public List<InterfaceCt> m۱۷۲۰۶o() {
        return this.f۱۶۱۸۰g;
    }

    /* renamed from: q, reason: contains not printable characters */
    public List<InterfaceCt> m۱۷۲۰۸q() {
        return this.f۱۶۱۸۱h;
    }

    /* renamed from: j, reason: contains not printable characters */
    public AbstractCp.c m۱۷۲۰۲j() {
        return this.f۱۶۱۸۲i;
    }

    @Override // p۲۹۵e.InterfaceCe.a
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCe mo۱۷۱۹۳a(Cy request) {
        return Cx.m۱۷۲۳۲a(this, request, false);
    }

    /* renamed from: e.v$b */
    public static final class b {

        /* renamed from: A, reason: contains not printable characters */
        int f۱۶۲۰۰A;

        /* renamed from: b, reason: contains not printable characters */
        Proxy f۱۶۲۰۲b;

        /* renamed from: j, reason: contains not printable characters */
        Cc f۱۶۲۱۰j;

        /* renamed from: k, reason: contains not printable characters */
        InterfaceCf f۱۶۲۱۱k;

        /* renamed from: m, reason: contains not printable characters */
        SSLSocketFactory f۱۶۲۱۳m;

        /* renamed from: n, reason: contains not printable characters */
        AbstractCc f۱۶۲۱۴n;

        /* renamed from: q, reason: contains not printable characters */
        InterfaceCb f۱۶۲۱۷q;

        /* renamed from: r, reason: contains not printable characters */
        InterfaceCb f۱۶۲۱۸r;

        /* renamed from: s, reason: contains not printable characters */
        Cj f۱۶۲۱۹s;

        /* renamed from: t, reason: contains not printable characters */
        InterfaceCo f۱۶۲۲۰t;

        /* renamed from: u, reason: contains not printable characters */
        boolean f۱۶۲۲۱u;

        /* renamed from: v, reason: contains not printable characters */
        boolean f۱۶۲۲۲v;

        /* renamed from: w, reason: contains not printable characters */
        boolean f۱۶۲۲۳w;

        /* renamed from: x, reason: contains not printable characters */
        int f۱۶۲۲۴x;

        /* renamed from: y, reason: contains not printable characters */
        int f۱۶۲۲۵y;

        /* renamed from: z, reason: contains not printable characters */
        int f۱۶۲۲۶z;

        /* renamed from: e, reason: contains not printable characters */
        final List<InterfaceCt> f۱۶۲۰۵e = new ArrayList();

        /* renamed from: f, reason: contains not printable characters */
        final List<InterfaceCt> f۱۶۲۰۶f = new ArrayList();

        /* renamed from: a, reason: contains not printable characters */
        Cn f۱۶۲۰۱a = new Cn();

        /* renamed from: c, reason: contains not printable characters */
        List<EnumCw> f۱۶۲۰۳c = Cv.f۱۶۱۷۱D;

        /* renamed from: d, reason: contains not printable characters */
        List<Ck> f۱۶۲۰۴d = Cv.f۱۶۱۷۲E;

        /* renamed from: g, reason: contains not printable characters */
        AbstractCp.c f۱۶۲۰۷g = AbstractCp.m۱۷۰۹۰a(AbstractCp.f۱۶۱۴۰a);

        /* renamed from: h, reason: contains not printable characters */
        ProxySelector f۱۶۲۰۸h = ProxySelector.getDefault();

        /* renamed from: i, reason: contains not printable characters */
        InterfaceCm f۱۶۲۰۹i = InterfaceCm.f۱۶۱۳۱a;

        /* renamed from: l, reason: contains not printable characters */
        SocketFactory f۱۶۲۱۲l = SocketFactory.getDefault();

        /* renamed from: o, reason: contains not printable characters */
        HostnameVerifier f۱۶۲۱۵o = p۲۹۵e.p۲۹۶f0.p۳۰۴l.Cd.f۱۶۰۷۴a;

        /* renamed from: p, reason: contains not printable characters */
        Cg f۱۶۲۱۶p = Cg.f۱۶۰۷۵c;

        public b() {
            InterfaceCb interfaceCb = InterfaceCb.f۱۵۶۳۵a;
            this.f۱۶۲۱۷q = interfaceCb;
            this.f۱۶۲۱۸r = interfaceCb;
            this.f۱۶۲۱۹s = new Cj();
            this.f۱۶۲۲۰t = InterfaceCo.f۱۶۱۳۹a;
            this.f۱۶۲۲۱u = true;
            this.f۱۶۲۲۲v = true;
            this.f۱۶۲۲۳w = true;
            this.f۱۶۲۲۴x = 10000;
            this.f۱۶۲۲۵y = 10000;
            this.f۱۶۲۲۶z = 10000;
            this.f۱۶۲۰۰A = 0;
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۷۲۲۸a(Cc cache) {
            this.f۱۶۲۱۰j = cache;
            this.f۱۶۲۱۱k = null;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Cv m۱۷۲۲۹a() {
            return new Cv(this);
        }
    }
}
