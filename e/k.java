package e;

import e.f0.c;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    private static final h[] f۴۰۶۵e = {h.k, h.m, h.l, h.n, h.p, h.o, h.i, h.j, h.f۴۰۵۴g, h.f۴۰۵۵h, h.f۴۰۵۲e, h.f۴۰۵۳f, h.f۴۰۵۱d};

    /* renamed from: f  reason: collision with root package name */
    public static final k f۴۰۶۶f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f۴۰۶۷g = new a(false).a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f۴۰۶۸a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f۴۰۶۹b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f۴۰۷۰c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f۴۰۷۱d;

    static {
        a aVar = new a(true);
        aVar.a(f۴۰۶۵e);
        aVar.a(d0.TLS_1_3, d0.TLS_1_2, d0.TLS_1_1, d0.TLS_1_0);
        aVar.a(true);
        f۴۰۶۶f = aVar.a();
        a aVar2 = new a(f۴۰۶۶f);
        aVar2.a(d0.TLS_1_0);
        aVar2.a(true);
        aVar2.a();
    }

    k(a builder) {
        this.f۴۰۶۸a = builder.f۴۰۷۲a;
        this.f۴۰۷۰c = builder.f۴۰۷۳b;
        this.f۴۰۷۱d = builder.f۴۰۷۴c;
        this.f۴۰۶۹b = builder.f۴۰۷۵d;
    }

    public boolean b() {
        return this.f۴۰۶۸a;
    }

    public List<h> a() {
        String[] strArr = this.f۴۰۷۰c;
        if (strArr != null) {
            return h.a(strArr);
        }
        return null;
    }

    public List<d0> d() {
        String[] strArr = this.f۴۰۷۱d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean c() {
        return this.f۴۰۶۹b;
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sslSocket, boolean isFallback) {
        k specToApply = b(sslSocket, isFallback);
        String[] strArr = specToApply.f۴۰۷۱d;
        if (strArr != null) {
            sslSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = specToApply.f۴۰۷۰c;
        if (strArr2 != null) {
            sslSocket.setEnabledCipherSuites(strArr2);
        }
    }

    private k b(SSLSocket sslSocket, boolean isFallback) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f۴۰۷۰c != null) {
            cipherSuitesIntersection = c.a(h.f۴۰۴۹b, sslSocket.getEnabledCipherSuites(), this.f۴۰۷۰c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.f۴۰۷۱d != null) {
            tlsVersionsIntersection = c.a(c.f۳۷۴۷f, sslSocket.getEnabledProtocols(), this.f۴۰۷۱d);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        int indexOfFallbackScsv = c.a(h.f۴۰۴۹b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (isFallback && indexOfFallbackScsv != -1) {
            cipherSuitesIntersection = c.a(cipherSuitesIntersection, supportedCipherSuites[indexOfFallbackScsv]);
        }
        a aVar = new a(this);
        aVar.a(cipherSuitesIntersection);
        aVar.b(tlsVersionsIntersection);
        return aVar.a();
    }

    public boolean a(SSLSocket socket) {
        if (!this.f۴۰۶۸a) {
            return false;
        }
        String[] strArr = this.f۴۰۷۱d;
        if (strArr != null && !c.b(c.f۳۷۴۷f, strArr, socket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f۴۰۷۰c;
        if (strArr2 == null || c.b(h.f۴۰۴۹b, strArr2, socket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object other) {
        if (!(other instanceof k)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        k that = (k) other;
        boolean z = this.f۴۰۶۸a;
        if (z != that.f۴۰۶۸a) {
            return false;
        }
        if (!z || (Arrays.equals(this.f۴۰۷۰c, that.f۴۰۷۰c) && Arrays.equals(this.f۴۰۷۱d, that.f۴۰۷۱d) && this.f۴۰۶۹b == that.f۴۰۶۹b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f۴۰۶۸a) {
            return (((((17 * 31) + Arrays.hashCode(this.f۴۰۷۰c)) * 31) + Arrays.hashCode(this.f۴۰۷۱d)) * 31) + (!this.f۴۰۶۹b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f۴۰۶۸a) {
            return "ConnectionSpec()";
        }
        String tlsVersionsString = "[all enabled]";
        String cipherSuitesString = this.f۴۰۷۰c != null ? a().toString() : tlsVersionsString;
        if (this.f۴۰۷۱d != null) {
            tlsVersionsString = d().toString();
        }
        return "ConnectionSpec(cipherSuites=" + cipherSuitesString + ", tlsVersions=" + tlsVersionsString + ", supportsTlsExtensions=" + this.f۴۰۶۹b + ")";
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f۴۰۷۲a;

        /* renamed from: b  reason: collision with root package name */
        String[] f۴۰۷۳b;

        /* renamed from: c  reason: collision with root package name */
        String[] f۴۰۷۴c;

        /* renamed from: d  reason: collision with root package name */
        boolean f۴۰۷۵d;

        a(boolean tls) {
            this.f۴۰۷۲a = tls;
        }

        public a(k connectionSpec) {
            this.f۴۰۷۲a = connectionSpec.f۴۰۶۸a;
            this.f۴۰۷۳b = connectionSpec.f۴۰۷۰c;
            this.f۴۰۷۴c = connectionSpec.f۴۰۷۱d;
            this.f۴۰۷۵d = connectionSpec.f۴۰۶۹b;
        }

        public a a(h... cipherSuites) {
            if (this.f۴۰۷۲a) {
                String[] strings = new String[cipherSuites.length];
                for (int i = 0; i < cipherSuites.length; i++) {
                    strings[i] = cipherSuites[i].f۴۰۵۶a;
                }
                a(strings);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(String... cipherSuites) {
            if (!this.f۴۰۷۲a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (cipherSuites.length != 0) {
                this.f۴۰۷۳b = (String[]) cipherSuites.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a a(d0... tlsVersions) {
            if (this.f۴۰۷۲a) {
                String[] strings = new String[tlsVersions.length];
                for (int i = 0; i < tlsVersions.length; i++) {
                    strings[i] = tlsVersions[i].f۳۷۳۹c;
                }
                b(strings);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a b(String... tlsVersions) {
            if (!this.f۴۰۷۲a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (tlsVersions.length != 0) {
                this.f۴۰۷۴c = (String[]) tlsVersions.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a a(boolean supportsTlsExtensions) {
            if (this.f۴۰۷۲a) {
                this.f۴۰۷۵d = supportsTlsExtensions;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public k a() {
            return new k(this);
        }
    }
}
