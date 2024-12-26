package p۱۳۹e;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p۱۳۹e.Cs;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.a  reason: invalid class name */
public final class Ca {

    /* renamed from: a  reason: contains not printable characters */
    final Cs f۱۵۵۹۹a;

    /* renamed from: b  reason: contains not printable characters */
    final AbstractCo f۱۵۶۰۰b;

    /* renamed from: c  reason: contains not printable characters */
    final SocketFactory f۱۵۶۰۱c;

    /* renamed from: d  reason: contains not printable characters */
    final AbstractCb f۱۵۶۰۲d;

    /* renamed from: e  reason: contains not printable characters */
    final List<EnumCw> f۱۵۶۰۳e;

    /* renamed from: f  reason: contains not printable characters */
    final List<Ck> f۱۵۶۰۴f;

    /* renamed from: g  reason: contains not printable characters */
    final ProxySelector f۱۵۶۰۵g;

    /* renamed from: h  reason: contains not printable characters */
    final Proxy f۱۵۶۰۶h;

    /* renamed from: i  reason: contains not printable characters */
    final SSLSocketFactory f۱۵۶۰۷i;

    /* renamed from: j  reason: contains not printable characters */
    final HostnameVerifier f۱۵۶۰۸j;

    /* renamed from: k  reason: contains not printable characters */
    final Cg f۱۵۶۰۹k;

    public Ca(String uriHost, int uriPort, AbstractCo dns, SocketFactory socketFactory, SSLSocketFactory sslSocketFactory, HostnameVerifier hostnameVerifier, Cg certificatePinner, AbstractCb proxyAuthenticator, Proxy proxy, List<EnumCw> list, List<Ck> list2, ProxySelector proxySelector) {
        Cs.Ca aVar = new Cs.Ca();
        aVar.m۱۹۲۶۰d(sslSocketFactory != null ? "https" : "http");
        aVar.m۱۹۲۵۷b(uriHost);
        aVar.m۱۹۲۵۳a(uriPort);
        this.f۱۵۵۹۹a = aVar.m۱۹۲۵۵a();
        if (dns != null) {
            this.f۱۵۶۰۰b = dns;
            if (socketFactory != null) {
                this.f۱۵۶۰۱c = socketFactory;
                if (proxyAuthenticator != null) {
                    this.f۱۵۶۰۲d = proxyAuthenticator;
                    if (list != null) {
                        this.f۱۵۶۰۳e = Cc.m۱۸۶۱۷a(list);
                        if (list2 != null) {
                            this.f۱۵۶۰۴f = Cc.m۱۸۶۱۷a(list2);
                            if (proxySelector != null) {
                                this.f۱۵۶۰۵g = proxySelector;
                                this.f۱۵۶۰۶h = proxy;
                                this.f۱۵۶۰۷i = sslSocketFactory;
                                this.f۱۵۶۰۸j = hostnameVerifier;
                                this.f۱۵۶۰۹k = certificatePinner;
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

    /* renamed from: k  reason: contains not printable characters */
    public Cs m۱۸۵۰۱k() {
        return this.f۱۵۵۹۹a;
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractCo m۱۸۴۹۳c() {
        return this.f۱۵۶۰۰b;
    }

    /* renamed from: i  reason: contains not printable characters */
    public SocketFactory m۱۸۴۹۹i() {
        return this.f۱۵۶۰۱c;
    }

    /* renamed from: g  reason: contains not printable characters */
    public AbstractCb m۱۸۴۹۷g() {
        return this.f۱۵۶۰۲d;
    }

    /* renamed from: e  reason: contains not printable characters */
    public List<EnumCw> m۱۸۴۹۵e() {
        return this.f۱۵۶۰۳e;
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<Ck> m۱۸۴۹۲b() {
        return this.f۱۵۶۰۴f;
    }

    /* renamed from: h  reason: contains not printable characters */
    public ProxySelector m۱۸۴۹۸h() {
        return this.f۱۵۶۰۵g;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Proxy m۱۸۴۹۶f() {
        return this.f۱۵۶۰۶h;
    }

    /* renamed from: j  reason: contains not printable characters */
    public SSLSocketFactory m۱۸۵۰۰j() {
        return this.f۱۵۶۰۷i;
    }

    /* renamed from: d  reason: contains not printable characters */
    public HostnameVerifier m۱۸۴۹۴d() {
        return this.f۱۵۶۰۸j;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cg m۱۸۴۹۰a() {
        return this.f۱۵۶۰۹k;
    }

    public boolean equals(Object other) {
        return (other instanceof Ca) && this.f۱۵۵۹۹a.equals(((Ca) other).f۱۵۵۹۹a) && m۱۸۴۹۱a((Ca) other);
    }

    public int hashCode() {
        int result = ((((((((((((17 * 31) + this.f۱۵۵۹۹a.hashCode()) * 31) + this.f۱۵۶۰۰b.hashCode()) * 31) + this.f۱۵۶۰۲d.hashCode()) * 31) + this.f۱۵۶۰۳e.hashCode()) * 31) + this.f۱۵۶۰۴f.hashCode()) * 31) + this.f۱۵۶۰۵g.hashCode()) * 31;
        Proxy proxy = this.f۱۵۶۰۶h;
        int i = 0;
        int result2 = (result + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f۱۵۶۰۷i;
        int result3 = (result2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f۱۵۶۰۸j;
        int result4 = (result3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        Cg gVar = this.f۱۵۶۰۹k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return result4 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۴۹۱a(Ca that) {
        return this.f۱۵۶۰۰b.equals(that.f۱۵۶۰۰b) && this.f۱۵۶۰۲d.equals(that.f۱۵۶۰۲d) && this.f۱۵۶۰۳e.equals(that.f۱۵۶۰۳e) && this.f۱۵۶۰۴f.equals(that.f۱۵۶۰۴f) && this.f۱۵۶۰۵g.equals(that.f۱۵۶۰۵g) && Cc.m۱۸۶۲۵a(this.f۱۵۶۰۶h, that.f۱۵۶۰۶h) && Cc.m۱۸۶۲۵a(this.f۱۵۶۰۷i, that.f۱۵۶۰۷i) && Cc.m۱۸۶۲۵a(this.f۱۵۶۰۸j, that.f۱۵۶۰۸j) && Cc.m۱۸۶۲۵a(this.f۱۵۶۰۹k, that.f۱۵۶۰۹k) && m۱۸۵۰۱k().m۱۹۲۳۷j() == that.m۱۸۵۰۱k().m۱۹۲۳۷j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f۱۵۵۹۹a.m۱۹۲۳۴g());
        sb.append(":");
        StringBuilder result = sb.append(this.f۱۵۵۹۹a.m۱۹۲۳۷j());
        if (this.f۱۵۶۰۶h != null) {
            result.append(", proxy=");
            result.append(this.f۱۵۶۰۶h);
        } else {
            result.append(", proxySelector=");
            result.append(this.f۱۵۶۰۵g);
        }
        result.append("}");
        return result.toString();
    }
}
