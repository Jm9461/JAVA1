package p۱۳۹e;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.k  reason: invalid class name */
public final class Ck {

    /* renamed from: e  reason: contains not printable characters */
    private static final Ch[] f۱۶۱۰۷e = {Ch.f۱۶۰۹۲k, Ch.f۱۶۰۹۴m, Ch.f۱۶۰۹۳l, Ch.f۱۶۰۹۵n, Ch.f۱۶۰۹۷p, Ch.f۱۶۰۹۶o, Ch.f۱۶۰۹۰i, Ch.f۱۶۰۹۱j, Ch.f۱۶۰۸۸g, Ch.f۱۶۰۸۹h, Ch.f۱۶۰۸۶e, Ch.f۱۶۰۸۷f, Ch.f۱۶۰۸۵d};

    /* renamed from: f  reason: contains not printable characters */
    public static final Ck f۱۶۱۰۸f;

    /* renamed from: g  reason: contains not printable characters */
    public static final Ck f۱۶۱۰۹g = new Ca(false).m۱۹۱۴۲a();

    /* renamed from: a  reason: contains not printable characters */
    final boolean f۱۶۱۱۰a;

    /* renamed from: b  reason: contains not printable characters */
    final boolean f۱۶۱۱۱b;

    /* renamed from: c  reason: contains not printable characters */
    final String[] f۱۶۱۱۲c;

    /* renamed from: d  reason: contains not printable characters */
    final String[] f۱۶۱۱۳d;

    static {
        Ca aVar = new Ca(true);
        aVar.m۱۹۱۴۰a(f۱۶۱۰۷e);
        aVar.m۱۹۱۳۹a(EnumCd0.TLS_1_3, EnumCd0.TLS_1_2, EnumCd0.TLS_1_1, EnumCd0.TLS_1_0);
        aVar.m۱۹۱۳۸a(true);
        f۱۶۱۰۸f = aVar.m۱۹۱۴۲a();
        Ca aVar2 = new Ca(f۱۶۱۰۸f);
        aVar2.m۱۹۱۳۹a(EnumCd0.TLS_1_0);
        aVar2.m۱۹۱۳۸a(true);
        aVar2.m۱۹۱۴۲a();
    }

    Ck(Ca builder) {
        this.f۱۶۱۱۰a = builder.f۱۶۱۱۴a;
        this.f۱۶۱۱۲c = builder.f۱۶۱۱۵b;
        this.f۱۶۱۱۳d = builder.f۱۶۱۱۶c;
        this.f۱۶۱۱۱b = builder.f۱۶۱۱۷d;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۹۱۳۵b() {
        return this.f۱۶۱۱۰a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public List<Ch> m۱۹۱۳۲a() {
        String[] strArr = this.f۱۶۱۱۲c;
        if (strArr != null) {
            return Ch.m۱۹۱۲۲a(strArr);
        }
        return null;
    }

    /* renamed from: d  reason: contains not printable characters */
    public List<EnumCd0> m۱۹۱۳۷d() {
        String[] strArr = this.f۱۶۱۱۳d;
        if (strArr != null) {
            return EnumCd0.m۱۸۵۹۰a(strArr);
        }
        return null;
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۹۱۳۶c() {
        return this.f۱۶۱۱۱b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۱۳۳a(SSLSocket sslSocket, boolean isFallback) {
        Ck specToApply = m۱۹۱۳۱b(sslSocket, isFallback);
        String[] strArr = specToApply.f۱۶۱۱۳d;
        if (strArr != null) {
            sslSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = specToApply.f۱۶۱۱۲c;
        if (strArr2 != null) {
            sslSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private Ck m۱۹۱۳۱b(SSLSocket sslSocket, boolean isFallback) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f۱۶۱۱۲c != null) {
            cipherSuitesIntersection = Cc.m۱۸۶۲۷a(Ch.f۱۶۰۸۳b, sslSocket.getEnabledCipherSuites(), this.f۱۶۱۱۲c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.f۱۶۱۱۳d != null) {
            tlsVersionsIntersection = Cc.m۱۸۶۲۷a(Cc.f۱۵۷۰۸f, sslSocket.getEnabledProtocols(), this.f۱۶۱۱۳d);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        int indexOfFallbackScsv = Cc.m۱۸۶۱۰a(Ch.f۱۶۰۸۳b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (isFallback && indexOfFallbackScsv != -1) {
            cipherSuitesIntersection = Cc.m۱۸۶۲۸a(cipherSuitesIntersection, supportedCipherSuites[indexOfFallbackScsv]);
        }
        Ca aVar = new Ca(this);
        aVar.m۱۹۱۴۱a(cipherSuitesIntersection);
        aVar.m۱۹۱۴۳b(tlsVersionsIntersection);
        return aVar.m۱۹۱۴۲a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۱۳۴a(SSLSocket socket) {
        if (!this.f۱۶۱۱۰a) {
            return false;
        }
        String[] strArr = this.f۱۶۱۱۳d;
        if (strArr != null && !Cc.m۱۸۶۳۲b(Cc.f۱۵۷۰۸f, strArr, socket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f۱۶۱۱۲c;
        if (strArr2 == null || Cc.m۱۸۶۳۲b(Ch.f۱۶۰۸۳b, strArr2, socket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
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
        if (!z || (Arrays.equals(this.f۱۶۱۱۲c, that.f۱۶۱۱۲c) && Arrays.equals(this.f۱۶۱۱۳d, that.f۱۶۱۱۳d) && this.f۱۶۱۱۱b == that.f۱۶۱۱۱b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f۱۶۱۱۰a) {
            return (((((17 * 31) + Arrays.hashCode(this.f۱۶۱۱۲c)) * 31) + Arrays.hashCode(this.f۱۶۱۱۳d)) * 31) + (!this.f۱۶۱۱۱b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f۱۶۱۱۰a) {
            return "ConnectionSpec()";
        }
        String tlsVersionsString = "[all enabled]";
        String cipherSuitesString = this.f۱۶۱۱۲c != null ? m۱۹۱۳۲a().toString() : tlsVersionsString;
        if (this.f۱۶۱۱۳d != null) {
            tlsVersionsString = m۱۹۱۳۷d().toString();
        }
        return "ConnectionSpec(cipherSuites=" + cipherSuitesString + ", tlsVersions=" + tlsVersionsString + ", supportsTlsExtensions=" + this.f۱۶۱۱۱b + ")";
    }

    /* renamed from: e.k$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۱۶۱۱۴a;

        /* renamed from: b  reason: contains not printable characters */
        String[] f۱۶۱۱۵b;

        /* renamed from: c  reason: contains not printable characters */
        String[] f۱۶۱۱۶c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۶۱۱۷d;

        Ca(boolean tls) {
            this.f۱۶۱۱۴a = tls;
        }

        public Ca(Ck connectionSpec) {
            this.f۱۶۱۱۴a = connectionSpec.f۱۶۱۱۰a;
            this.f۱۶۱۱۵b = connectionSpec.f۱۶۱۱۲c;
            this.f۱۶۱۱۶c = connectionSpec.f۱۶۱۱۳d;
            this.f۱۶۱۱۷d = connectionSpec.f۱۶۱۱۱b;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۱۴۰a(Ch... cipherSuites) {
            if (this.f۱۶۱۱۴a) {
                String[] strings = new String[cipherSuites.length];
                for (int i = 0; i < cipherSuites.length; i++) {
                    strings[i] = cipherSuites[i].f۱۶۰۹۸a;
                }
                m۱۹۱۴۱a(strings);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۱۴۱a(String... cipherSuites) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (cipherSuites.length != 0) {
                this.f۱۶۱۱۵b = (String[]) cipherSuites.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۱۳۹a(EnumCd0... tlsVersions) {
            if (this.f۱۶۱۱۴a) {
                String[] strings = new String[tlsVersions.length];
                for (int i = 0; i < tlsVersions.length; i++) {
                    strings[i] = tlsVersions[i].f۱۵۷۰۰c;
                }
                m۱۹۱۴۳b(strings);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۹۱۴۳b(String... tlsVersions) {
            if (!this.f۱۶۱۱۴a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (tlsVersions.length != 0) {
                this.f۱۶۱۱۶c = (String[]) tlsVersions.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۱۳۸a(boolean supportsTlsExtensions) {
            if (this.f۱۶۱۱۴a) {
                this.f۱۶۱۱۷d = supportsTlsExtensions;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ck m۱۹۱۴۲a() {
            return new Ck(this);
        }
    }
}
