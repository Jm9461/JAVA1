package e;

import e.f0.c;
import e.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final s f۳۶۶۴a;

    /* renamed from: b  reason: collision with root package name */
    final o f۳۶۶۵b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f۳۶۶۶c;

    /* renamed from: d  reason: collision with root package name */
    final b f۳۶۶۷d;

    /* renamed from: e  reason: collision with root package name */
    final List<w> f۳۶۶۸e;

    /* renamed from: f  reason: collision with root package name */
    final List<k> f۳۶۶۹f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f۳۶۷۰g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f۳۶۷۱h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final g k;

    public a(String uriHost, int uriPort, o dns, SocketFactory socketFactory, SSLSocketFactory sslSocketFactory, HostnameVerifier hostnameVerifier, g certificatePinner, b proxyAuthenticator, Proxy proxy, List<w> list, List<k> list2, ProxySelector proxySelector) {
        s.a aVar = new s.a();
        aVar.d(sslSocketFactory != null ? "https" : "http");
        aVar.b(uriHost);
        aVar.a(uriPort);
        this.f۳۶۶۴a = aVar.a();
        if (dns != null) {
            this.f۳۶۶۵b = dns;
            if (socketFactory != null) {
                this.f۳۶۶۶c = socketFactory;
                if (proxyAuthenticator != null) {
                    this.f۳۶۶۷d = proxyAuthenticator;
                    if (list != null) {
                        this.f۳۶۶۸e = c.a(list);
                        if (list2 != null) {
                            this.f۳۶۶۹f = c.a(list2);
                            if (proxySelector != null) {
                                this.f۳۶۷۰g = proxySelector;
                                this.f۳۶۷۱h = proxy;
                                this.i = sslSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = certificatePinner;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public s k() {
        return this.f۳۶۶۴a;
    }

    public o c() {
        return this.f۳۶۶۵b;
    }

    public SocketFactory i() {
        return this.f۳۶۶۶c;
    }

    public b g() {
        return this.f۳۶۶۷d;
    }

    public List<w> e() {
        return this.f۳۶۶۸e;
    }

    public List<k> b() {
        return this.f۳۶۶۹f;
    }

    public ProxySelector h() {
        return this.f۳۶۷۰g;
    }

    public Proxy f() {
        return this.f۳۶۷۱h;
    }

    public SSLSocketFactory j() {
        return this.i;
    }

    public HostnameVerifier d() {
        return this.j;
    }

    public g a() {
        return this.k;
    }

    public boolean equals(Object other) {
        return (other instanceof a) && this.f۳۶۶۴a.equals(((a) other).f۳۶۶۴a) && a((a) other);
    }

    public int hashCode() {
        int result = ((((((((((((17 * 31) + this.f۳۶۶۴a.hashCode()) * 31) + this.f۳۶۶۵b.hashCode()) * 31) + this.f۳۶۶۷d.hashCode()) * 31) + this.f۳۶۶۸e.hashCode()) * 31) + this.f۳۶۶۹f.hashCode()) * 31) + this.f۳۶۷۰g.hashCode()) * 31;
        Proxy proxy = this.f۳۶۷۱h;
        int i2 = 0;
        int result2 = (result + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int result3 = (result2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int result4 = (result3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        g gVar = this.k;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return result4 + i2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(a that) {
        return this.f۳۶۶۵b.equals(that.f۳۶۶۵b) && this.f۳۶۶۷d.equals(that.f۳۶۶۷d) && this.f۳۶۶۸e.equals(that.f۳۶۶۸e) && this.f۳۶۶۹f.equals(that.f۳۶۶۹f) && this.f۳۶۷۰g.equals(that.f۳۶۷۰g) && c.a(this.f۳۶۷۱h, that.f۳۶۷۱h) && c.a(this.i, that.i) && c.a(this.j, that.j) && c.a(this.k, that.k) && k().j() == that.k().j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f۳۶۶۴a.g());
        sb.append(":");
        StringBuilder result = sb.append(this.f۳۶۶۴a.j());
        if (this.f۳۶۷۱h != null) {
            result.append(", proxy=");
            result.append(this.f۳۶۷۱h);
        } else {
            result.append(", proxySelector=");
            result.append(this.f۳۶۷۰g);
        }
        result.append("}");
        return result.toString();
    }
}
