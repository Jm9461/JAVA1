package p۱۳۹e;

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
import p۱۳۹e.AbstractCe;
import p۱۳۹e.AbstractCp;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cr;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cd;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg;
import p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCc;

/* renamed from: e.v  reason: invalid class name */
public class Cv implements Cloneable, AbstractCe.AbstractCa, AbstractCe0 {

    /* renamed from: D  reason: contains not printable characters */
    static final List<EnumCw> f۱۶۱۷۱D = Cc.m۱۸۶۱۸a(EnumCw.HTTP_2, EnumCw.HTTP_1_1);

    /* renamed from: E  reason: contains not printable characters */
    static final List<Ck> f۱۶۱۷۲E = Cc.m۱۸۶۱۸a(Ck.f۱۶۱۰۸f, Ck.f۱۶۱۰۹g);

    /* renamed from: A  reason: contains not printable characters */
    final int f۱۶۱۷۳A;

    /* renamed from: B  reason: contains not printable characters */
    final int f۱۶۱۷۴B;

    /* renamed from: C  reason: contains not printable characters */
    final int f۱۶۱۷۵C;

    /* renamed from: c  reason: contains not printable characters */
    final Cn f۱۶۱۷۶c;

    /* renamed from: d  reason: contains not printable characters */
    final Proxy f۱۶۱۷۷d;

    /* renamed from: e  reason: contains not printable characters */
    final List<EnumCw> f۱۶۱۷۸e;

    /* renamed from: f  reason: contains not printable characters */
    final List<Ck> f۱۶۱۷۹f;

    /* renamed from: g  reason: contains not printable characters */
    final List<AbstractCt> f۱۶۱۸۰g;

    /* renamed from: h  reason: contains not printable characters */
    final List<AbstractCt> f۱۶۱۸۱h;

    /* renamed from: i  reason: contains not printable characters */
    final AbstractCp.AbstractCc f۱۶۱۸۲i;

    /* renamed from: j  reason: contains not printable characters */
    final ProxySelector f۱۶۱۸۳j;

    /* renamed from: k  reason: contains not printable characters */
    final AbstractCm f۱۶۱۸۴k;

    /* renamed from: l  reason: contains not printable characters */
    final Cc f۱۶۱۸۵l;

    /* renamed from: m  reason: contains not printable characters */
    final AbstractCf f۱۶۱۸۶m;

    /* renamed from: n  reason: contains not printable characters */
    final SocketFactory f۱۶۱۸۷n;

    /* renamed from: o  reason: contains not printable characters */
    final SSLSocketFactory f۱۶۱۸۸o;

    /* renamed from: p  reason: contains not printable characters */
    final AbstractCc f۱۶۱۸۹p;

    /* renamed from: q  reason: contains not printable characters */
    final HostnameVerifier f۱۶۱۹۰q;

    /* renamed from: r  reason: contains not printable characters */
    final Cg f۱۶۱۹۱r;

    /* renamed from: s  reason: contains not printable characters */
    final AbstractCb f۱۶۱۹۲s;

    /* renamed from: t  reason: contains not printable characters */
    final AbstractCb f۱۶۱۹۳t;

    /* renamed from: u  reason: contains not printable characters */
    final Cj f۱۶۱۹۴u;

    /* renamed from: v  reason: contains not printable characters */
    final AbstractCo f۱۶۱۹۵v;

    /* renamed from: w  reason: contains not printable characters */
    final boolean f۱۶۱۹۶w;

    /* renamed from: x  reason: contains not printable characters */
    final boolean f۱۶۱۹۷x;

    /* renamed from: y  reason: contains not printable characters */
    final boolean f۱۶۱۹۸y;

    /* renamed from: z  reason: contains not printable characters */
    final int f۱۶۱۹۹z;

    static {
        AbstractCa.f۱۵۷۰۱a = new Ca();
    }

    /* renamed from: e.v$a  reason: invalid class name */
    class Ca extends AbstractCa {
        Ca() {
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۳۰۲a(Cr.Ca builder, String line) {
            builder.m۱۹۲۰۶a(line);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۳۰۳a(Cr.Ca builder, String name, String value) {
            builder.m۱۹۲۰۹b(name, value);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۳۰۵a(Cj pool, p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection) {
            return pool.m۱۹۱۲۹a(connection);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc m۱۹۲۹۸a(Cj pool, Ca address, Cg streamAllocation, Cc0 route) {
            return pool.m۱۹۱۲۷a(address, streamAllocation, route);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۳۰۴a(Ca a, Ca b) {
            return a.m۱۸۴۹۱a(b);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public Socket m۱۹۳۰۰a(Cj pool, Ca address, Cg streamAllocation) {
            return pool.m۱۹۱۲۸a(address, streamAllocation);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۹۳۰۶b(Cj pool, p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection) {
            pool.m۱۹۱۳۰b(connection);
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۹۲۹۹a(Cj connectionPool) {
            return connectionPool.f۱۶۱۰۴e;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۹۲۹۷a(Ca0.Ca responseBuilder) {
            return responseBuilder.f۱۵۶۲۵c;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۳۰۱a(Ck tlsConfiguration, SSLSocket sslSocket, boolean isFallback) {
            tlsConfiguration.m۱۹۱۳۳a(sslSocket, isFallback);
        }
    }

    public Cv() {
        this(new Cb());
    }

    Cv(Cb builder) {
        this.f۱۶۱۷۶c = builder.f۱۶۲۰۱a;
        this.f۱۶۱۷۷d = builder.f۱۶۲۰۲b;
        this.f۱۶۱۷۸e = builder.f۱۶۲۰۳c;
        this.f۱۶۱۷۹f = builder.f۱۶۲۰۴d;
        this.f۱۶۱۸۰g = Cc.m۱۸۶۱۷a(builder.f۱۶۲۰۵e);
        this.f۱۶۱۸۱h = Cc.m۱۸۶۱۷a(builder.f۱۶۲۰۶f);
        this.f۱۶۱۸۲i = builder.f۱۶۲۰۷g;
        this.f۱۶۱۸۳j = builder.f۱۶۲۰۸h;
        this.f۱۶۱۸۴k = builder.f۱۶۲۰۹i;
        this.f۱۶۱۸۵l = builder.f۱۶۲۱۰j;
        this.f۱۶۱۸۶m = builder.f۱۶۲۱۱k;
        this.f۱۶۱۸۷n = builder.f۱۶۲۱۲l;
        boolean isTLS = false;
        for (Ck spec : this.f۱۶۱۷۹f) {
            isTLS = isTLS || spec.m۱۹۱۳۵b();
        }
        if (builder.f۱۶۲۱۳m != null || !isTLS) {
            this.f۱۶۱۸۸o = builder.f۱۶۲۱۳m;
            this.f۱۶۱۸۹p = builder.f۱۶۲۱۴n;
        } else {
            X509TrustManager trustManager = m۱۹۲۶۸B();
            this.f۱۶۱۸۸o = m۱۹۲۶۹a(trustManager);
            this.f۱۶۱۸۹p = AbstractCc.m۱۹۱۰۳a(trustManager);
        }
        this.f۱۶۱۹۰q = builder.f۱۶۲۱۵o;
        this.f۱۶۱۹۱r = builder.f۱۶۲۱۶p.m۱۹۱۱۵a(this.f۱۶۱۸۹p);
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
        } else if (this.f۱۶۱۸۱h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f۱۶۱۸۱h);
        }
    }

    /* renamed from: B  reason: contains not printable characters */
    private X509TrustManager m۱۹۲۶۸B() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw Cc.m۱۸۶۱۱a("No System TLS", (Exception) e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private SSLSocketFactory m۱۹۲۶۹a(X509TrustManager trustManager) {
        try {
            SSLContext sslContext = Cf.m۱۹۰۸۶d().m۱۹۰۹۸b();
            sslContext.init(null, new TrustManager[]{trustManager}, null);
            return sslContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw Cc.m۱۸۶۱۱a("No System TLS", (Exception) e);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۹۲۷۵d() {
        return this.f۱۶۱۹۹z;
    }

    /* renamed from: w  reason: contains not printable characters */
    public int m۱۹۲۹۳w() {
        return this.f۱۶۱۷۳A;
    }

    /* renamed from: A  reason: contains not printable characters */
    public int m۱۹۲۷۰A() {
        return this.f۱۶۱۷۴B;
    }

    /* renamed from: r  reason: contains not printable characters */
    public int m۱۹۲۸۸r() {
        return this.f۱۶۱۷۵C;
    }

    /* renamed from: t  reason: contains not printable characters */
    public Proxy m۱۹۲۹۰t() {
        return this.f۱۶۱۷۷d;
    }

    /* renamed from: v  reason: contains not printable characters */
    public ProxySelector m۱۹۲۹۲v() {
        return this.f۱۶۱۸۳j;
    }

    /* renamed from: g  reason: contains not printable characters */
    public AbstractCm m۱۹۲۷۸g() {
        return this.f۱۶۱۸۴k;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cc m۱۹۲۷۳b() {
        return this.f۱۶۱۸۵l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public AbstractCf m۱۹۲۸۶p() {
        Cc cVar = this.f۱۶۱۸۵l;
        return cVar != null ? cVar.f۱۵۶۳۸c : this.f۱۶۱۸۶m;
    }

    /* renamed from: i  reason: contains not printable characters */
    public AbstractCo m۱۹۲۸۰i() {
        return this.f۱۶۱۹۵v;
    }

    /* renamed from: y  reason: contains not printable characters */
    public SocketFactory m۱۹۲۹۵y() {
        return this.f۱۶۱۸۷n;
    }

    /* renamed from: z  reason: contains not printable characters */
    public SSLSocketFactory m۱۹۲۹۶z() {
        return this.f۱۶۱۸۸o;
    }

    /* renamed from: n  reason: contains not printable characters */
    public HostnameVerifier m۱۹۲۸۴n() {
        return this.f۱۶۱۹۰q;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cg m۱۹۲۷۴c() {
        return this.f۱۶۱۹۱r;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb m۱۹۲۷۱a() {
        return this.f۱۶۱۹۳t;
    }

    /* renamed from: u  reason: contains not printable characters */
    public AbstractCb m۱۹۲۹۱u() {
        return this.f۱۶۱۹۲s;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Cj m۱۹۲۷۶e() {
        return this.f۱۶۱۹۴u;
    }

    /* renamed from: m  reason: contains not printable characters */
    public boolean m۱۹۲۸۳m() {
        return this.f۱۶۱۹۶w;
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۹۲۸۲k() {
        return this.f۱۶۱۹۷x;
    }

    /* renamed from: x  reason: contains not printable characters */
    public boolean m۱۹۲۹۴x() {
        return this.f۱۶۱۹۸y;
    }

    /* renamed from: h  reason: contains not printable characters */
    public Cn m۱۹۲۷۹h() {
        return this.f۱۶۱۷۶c;
    }

    /* renamed from: s  reason: contains not printable characters */
    public List<EnumCw> m۱۹۲۸۹s() {
        return this.f۱۶۱۷۸e;
    }

    /* renamed from: f  reason: contains not printable characters */
    public List<Ck> m۱۹۲۷۷f() {
        return this.f۱۶۱۷۹f;
    }

    /* renamed from: o  reason: contains not printable characters */
    public List<AbstractCt> m۱۹۲۸۵o() {
        return this.f۱۶۱۸۰g;
    }

    /* renamed from: q  reason: contains not printable characters */
    public List<AbstractCt> m۱۹۲۸۷q() {
        return this.f۱۶۱۸۱h;
    }

    /* renamed from: j  reason: contains not printable characters */
    public AbstractCp.AbstractCc m۱۹۲۸۱j() {
        return this.f۱۶۱۸۲i;
    }

    @Override // p۱۳۹e.AbstractCe.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCe m۱۹۲۷۲a(Cy request) {
        return Cx.m۱۹۳۱۱a(this, request, false);
    }

    /* renamed from: e.v$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: A  reason: contains not printable characters */
        int f۱۶۲۰۰A;

        /* renamed from: a  reason: contains not printable characters */
        Cn f۱۶۲۰۱a = new Cn();

        /* renamed from: b  reason: contains not printable characters */
        Proxy f۱۶۲۰۲b;

        /* renamed from: c  reason: contains not printable characters */
        List<EnumCw> f۱۶۲۰۳c = Cv.f۱۶۱۷۱D;

        /* renamed from: d  reason: contains not printable characters */
        List<Ck> f۱۶۲۰۴d = Cv.f۱۶۱۷۲E;

        /* renamed from: e  reason: contains not printable characters */
        final List<AbstractCt> f۱۶۲۰۵e = new ArrayList();

        /* renamed from: f  reason: contains not printable characters */
        final List<AbstractCt> f۱۶۲۰۶f = new ArrayList();

        /* renamed from: g  reason: contains not printable characters */
        AbstractCp.AbstractCc f۱۶۲۰۷g = AbstractCp.m۱۹۱۶۹a(AbstractCp.f۱۶۱۴۰a);

        /* renamed from: h  reason: contains not printable characters */
        ProxySelector f۱۶۲۰۸h = ProxySelector.getDefault();

        /* renamed from: i  reason: contains not printable characters */
        AbstractCm f۱۶۲۰۹i = AbstractCm.f۱۶۱۳۱a;

        /* renamed from: j  reason: contains not printable characters */
        Cc f۱۶۲۱۰j;

        /* renamed from: k  reason: contains not printable characters */
        AbstractCf f۱۶۲۱۱k;

        /* renamed from: l  reason: contains not printable characters */
        SocketFactory f۱۶۲۱۲l = SocketFactory.getDefault();

        /* renamed from: m  reason: contains not printable characters */
        SSLSocketFactory f۱۶۲۱۳m;

        /* renamed from: n  reason: contains not printable characters */
        AbstractCc f۱۶۲۱۴n;

        /* renamed from: o  reason: contains not printable characters */
        HostnameVerifier f۱۶۲۱۵o = p۱۳۹e.p۱۴۰f0.p۱۴۸l.Cd.f۱۶۰۷۴a;

        /* renamed from: p  reason: contains not printable characters */
        Cg f۱۶۲۱۶p = Cg.f۱۶۰۷۵c;

        /* renamed from: q  reason: contains not printable characters */
        AbstractCb f۱۶۲۱۷q;

        /* renamed from: r  reason: contains not printable characters */
        AbstractCb f۱۶۲۱۸r;

        /* renamed from: s  reason: contains not printable characters */
        Cj f۱۶۲۱۹s;

        /* renamed from: t  reason: contains not printable characters */
        AbstractCo f۱۶۲۲۰t;

        /* renamed from: u  reason: contains not printable characters */
        boolean f۱۶۲۲۱u;

        /* renamed from: v  reason: contains not printable characters */
        boolean f۱۶۲۲۲v;

        /* renamed from: w  reason: contains not printable characters */
        boolean f۱۶۲۲۳w;

        /* renamed from: x  reason: contains not printable characters */
        int f۱۶۲۲۴x;

        /* renamed from: y  reason: contains not printable characters */
        int f۱۶۲۲۵y;

        /* renamed from: z  reason: contains not printable characters */
        int f۱۶۲۲۶z;

        public Cb() {
            AbstractCb bVar = AbstractCb.f۱۵۶۳۵a;
            this.f۱۶۲۱۷q = bVar;
            this.f۱۶۲۱۸r = bVar;
            this.f۱۶۲۱۹s = new Cj();
            this.f۱۶۲۲۰t = AbstractCo.f۱۶۱۳۹a;
            this.f۱۶۲۲۱u = true;
            this.f۱۶۲۲۲v = true;
            this.f۱۶۲۲۳w = true;
            this.f۱۶۲۲۴x = 10000;
            this.f۱۶۲۲۵y = 10000;
            this.f۱۶۲۲۶z = 10000;
            this.f۱۶۲۰۰A = 0;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۹۳۰۷a(Cc cache) {
            this.f۱۶۲۱۰j = cache;
            this.f۱۶۲۱۱k = null;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cv m۱۹۳۰۸a() {
            return new Cv(this);
        }
    }
}
