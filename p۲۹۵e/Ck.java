package p۲۹۵e;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ck {

    /* renamed from: e, reason: contains not printable characters */
    private static final Ch[] f۱۶۱۰۷e = {Ch.f۱۶۰۹۲k, Ch.f۱۶۰۹۴m, Ch.f۱۶۰۹۳l, Ch.f۱۶۰۹۵n, Ch.f۱۶۰۹۷p, Ch.f۱۶۰۹۶o, Ch.f۱۶۰۹۰i, Ch.f۱۶۰۹۱j, Ch.f۱۶۰۸۸g, Ch.f۱۶۰۸۹h, Ch.f۱۶۰۸۶e, Ch.f۱۶۰۸۷f, Ch.f۱۶۰۸۵d};

    /* renamed from: f, reason: contains not printable characters */
    public static final Ck f۱۶۱۰۸f;

    /* renamed from: g, reason: contains not printable characters */
    public static final Ck f۱۶۱۰۹g;

    /* renamed from: a, reason: contains not printable characters */
    final boolean f۱۶۱۱۰a;

    /* renamed from: b, reason: contains not printable characters */
    final boolean f۱۶۱۱۱b;

    /* renamed from: c, reason: contains not printable characters */
    final String[] f۱۶۱۱۲c;

    /* renamed from: d, reason: contains not printable characters */
    final String[] f۱۶۱۱۳d;

    static {
        a aVar = new a(true);
        aVar.m۱۷۰۶۱a(f۱۶۱۰۷e);
        aVar.m۱۷۰۶۰a(EnumCd0.TLS_1_3, EnumCd0.TLS_1_2, EnumCd0.TLS_1_1, EnumCd0.TLS_1_0);
        aVar.m۱۷۰۵۹a(true);
        f۱۶۱۰۸f = aVar.m۱۷۰۶۳a();
        a aVar2 = new a(f۱۶۱۰۸f);
        aVar2.m۱۷۰۶۰a(EnumCd0.TLS_1_0);
        aVar2.m۱۷۰۵۹a(true);
        aVar2.m۱۷۰۶۳a();
        f۱۶۱۰۹g = new a(false).m۱۷۰۶۳a();
    }

    Ck(a builder) {
        this.f۱۶۱۱۰a = builder.f۱۶۱۱۴a;
        this.f۱۶۱۱۲c = builder.f۱۶۱۱۵b;
        this.f۱۶۱۱۳d = builder.f۱۶۱۱۶c;
        this.f۱۶۱۱۱b = builder.f۱۶۱۱۷d;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۷۰۵۶b() {
        return this.f۱۶۱۱۰a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public List<Ch> m۱۷۰۵۳a() {
        String[] strArr = this.f۱۶۱۱۲c;
        if (strArr != null) {
            return Ch.m۱۷۰۴۳a(strArr);
        }
        return null;
    }

    /* renamed from: d, reason: contains not printable characters */
    public List<EnumCd0> m۱۷۰۵۸d() {
        String[] strArr = this.f۱۶۱۱۳d;
        if (strArr != null) {
            return EnumCd0.m۱۶۵۱۱a(strArr);
        }
        return null;
    }

    /* renamed from: c, reason: contains not printable characters */
    public boolean m۱۷۰۵۷c() {
        return this.f۱۶۱۱۱b;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۷۰۵۴a(SSLSocket sslSocket, boolean isFallback) {
        Ck specToApply = m۱۷۰۵۲b(sslSocket, isFallback);
        String[] strArr = specToApply.f۱۶۱۱۳d;
        if (strArr != null) {
            sslSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = specToApply.f۱۶۱۱۲c;
        if (strArr2 != null) {
            sslSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private Ck m۱۷۰۵۲b(SSLSocket sslSocket, boolean isFallback) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f۱۶۱۱۲c != null) {
            cipherSuitesIntersection = Cc.m۱۶۵۴۸a(Ch.f۱۶۰۸۳b, sslSocket.getEnabledCipherSuites(), this.f۱۶۱۱۲c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.f۱۶۱۱۳d != null) {
            tlsVersionsIntersection = Cc.m۱۶۵۴۸a(Cc.f۱۵۷۰۸f, sslSocket.getEnabledProtocols(), this.f۱۶۱۱۳d);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        int indexOfFallbackScsv = Cc.m۱۶۵۳۱a(Ch.f۱۶۰۸۳b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (isFallback && indexOfFallbackScsv != -1) {
            cipherSuitesIntersection = Cc.m۱۶۵۴۹a(cipherSuitesIntersection, supportedCipherSuites[indexOfFallbackScsv]);
        }
        a aVar = new a(this);
        aVar.m۱۷۰۶۲a(cipherSuitesIntersection);
        aVar.m۱۷۰۶۴b(tlsVersionsIntersection);
        return aVar.m۱۷۰۶۳a();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۰۵۵a(SSLSocket socket) {
        if (!this.f۱۶۱۱۰a) {
            return false;
        }
        String[] strArr = this.f۱۶۱۱۳d;
        if (strArr != null && !Cc.m۱۶۵۵۳b(Cc.f۱۵۷۰۸f, strArr, socket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f۱۶۱۱۲c;
        return strArr2 == null || Cc.m۱۶۵۵۳b(Ch.f۱۶۰۸۳b, strArr2, socket.getEnabledCipherSuites());
    }

    public boolean equals(Object other) {
        if (!(other instanceof Ck)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        Ck that = (Ck) other;
        boolean z = this.f۱۶۱۱۰a;
        if (z != that.f۱۶۱۱۰a) {
            return false;
        }
        return !z || (Arrays.equals(this.f۱۶۱۱۲c, that.f۱۶۱۱۲c) && Arrays.equals(this.f۱۶۱۱۳d, that.f۱۶۱۱۳d) && this.f۱۶۱۱۱b == that.f۱۶۱۱۱b);
    }

    public int hashCode() {
        if (!this.f۱۶۱۱۰a) {
            return 17;
        }
        return (((((17 * 31) + Arrays.hashCode(this.f۱۶۱۱۲c)) * 31) + Arrays.hashCode(this.f۱۶۱۱۳d)) * 31) + (!this.f۱۶۱۱۱b ? 1 : 0);
    }

    public String toString() {
        if (!this.f۱۶۱۱۰a) {
            return "ConnectionSpec()";
        }
        String cipherSuitesString = this.f۱۶۱۱۲c != null ? m۱۷۰۵۳a().toString() : "[all enabled]";
        String tlsVersionsString = this.f۱۶۱۱۳d != null ? m۱۷۰۵۸d().toString() : "[all enabled]";
        return "ConnectionSpec(cipherSuites=" + cipherSuitesString + ", tlsVersions=" + tlsVersionsString + ", supportsTlsExtensions=" + this.f۱۶۱۱۱b + ")";
    }

    /* renamed from: e.k$a */
    public static final class a {

        /* renamed from: a, reason: contains not printable characters */
        boolean f۱۶۱۱۴a;

        /* renamed from: b, reason: contains not printable characters */
        String[] f۱۶۱۱۵b;

        /* renamed from: c, reason: contains not printable characters */
        String[] f۱۶۱۱۶c;

        /* renamed from: d, reason: contains not printable characters */
        boolean f۱۶۱۱۷d;

        a(boolean tls) {
            this.f۱۶۱۱۴a = tls;
        }

        public a(Ck connectionSpec) {
            this.f۱۶۱۱۴a = connectionSpec.f۱۶۱۱۰a;
            this.f۱۶۱۱۵b = connectionSpec.f۱۶۱۱۲c;
            this.f۱۶۱۱۶c = connectionSpec.f۱۶۱۱۳d;
            this.f۱۶۱۱۷d = connectionSpec.f۱۶۱۱۱b;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۰۶۱a(Ch... cipherSuites) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strings = new String[cipherSuites.length];
            for (int i = 0; i < cipherSuites.length; i++) {
                strings[i] = cipherSuites[i].f۱۶۰۹۸a;
            }
            m۱۷۰۶۲a(strings);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۰۶۲a(String... cipherSuites) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f۱۶۱۱۵b = (String[]) cipherSuites.clone();
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۰۶۰a(EnumCd0... tlsVersions) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strings = new String[tlsVersions.length];
            for (int i = 0; i < tlsVersions.length; i++) {
                strings[i] = tlsVersions[i].f۱۵۷۰۰c;
            }
            m۱۷۰۶۴b(strings);
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public a m۱۷۰۶۴b(String... tlsVersions) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f۱۶۱۱۶c = (String[]) tlsVersions.clone();
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۰۵۹a(boolean supportsTlsExtensions) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f۱۶۱۱۷d = supportsTlsExtensions;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Ck m۱۷۰۶۳a() {
            return new Ck(this);
        }
    }
}
