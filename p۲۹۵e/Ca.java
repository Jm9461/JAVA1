package p۲۹۵e;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p۲۹۵e.Cs;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {

    /* renamed from: a, reason: contains not printable characters */
    final Cs f۱۵۵۹۹a;

    /* renamed from: b, reason: contains not printable characters */
    final InterfaceCo f۱۵۶۰۰b;

    /* renamed from: c, reason: contains not printable characters */
    final SocketFactory f۱۵۶۰۱c;

    /* renamed from: d, reason: contains not printable characters */
    final InterfaceCb f۱۵۶۰۲d;

    /* renamed from: e, reason: contains not printable characters */
    final List<EnumCw> f۱۵۶۰۳e;

    /* renamed from: f, reason: contains not printable characters */
    final List<Ck> f۱۵۶۰۴f;

    /* renamed from: g, reason: contains not printable characters */
    final ProxySelector f۱۵۶۰۵g;

    /* renamed from: h, reason: contains not printable characters */
    final Proxy f۱۵۶۰۶h;

    /* renamed from: i, reason: contains not printable characters */
    final SSLSocketFactory f۱۵۶۰۷i;

    /* renamed from: j, reason: contains not printable characters */
    final HostnameVerifier f۱۵۶۰۸j;

    /* renamed from: k, reason: contains not printable characters */
    final Cg f۱۵۶۰۹k;

    public Ca(String uriHost, int uriPort, InterfaceCo dns, SocketFactory socketFactory, SSLSocketFactory sslSocketFactory, HostnameVerifier hostnameVerifier, Cg certificatePinner, InterfaceCb proxyAuthenticator, Proxy proxy, List<EnumCw> list, List<Ck> list2, ProxySelector proxySelector) {
        Cs.a aVar = new Cs.a();
        aVar.m۱۷۱۸۱d(sslSocketFactory != null ? "https" : "http");
        aVar.m۱۷۱۷۸b(uriHost);
        aVar.m۱۷۱۷۴a(uriPort);
        this.f۱۵۵۹۹a = aVar.m۱۷۱۷۶a();
        if (dns == null) {
            throw new NullPointerException("dns == null");
        }
        this.f۱۵۶۰۰b = dns;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f۱۵۶۰۱c = socketFactory;
        if (proxyAuthenticator == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f۱۵۶۰۲d = proxyAuthenticator;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f۱۵۶۰۳e = Cc.m۱۶۵۳۸a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f۱۵۶۰۴f = Cc.m۱۶۵۳۸a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f۱۵۶۰۵g = proxySelector;
        this.f۱۵۶۰۶h = proxy;
        this.f۱۵۶۰۷i = sslSocketFactory;
        this.f۱۵۶۰۸j = hostnameVerifier;
        this.f۱۵۶۰۹k = certificatePinner;
    }

    /* renamed from: k, reason: contains not printable characters */
    public Cs m۱۶۴۲۲k() {
        return this.f۱۵۵۹۹a;
    }

    /* renamed from: c, reason: contains not printable characters */
    public InterfaceCo m۱۶۴۱۴c() {
        return this.f۱۵۶۰۰b;
    }

    /* renamed from: i, reason: contains not printable characters */
    public SocketFactory m۱۶۴۲۰i() {
        return this.f۱۵۶۰۱c;
    }

    /* renamed from: g, reason: contains not printable characters */
    public InterfaceCb m۱۶۴۱۸g() {
        return this.f۱۵۶۰۲d;
    }

    /* renamed from: e, reason: contains not printable characters */
    public List<EnumCw> m۱۶۴۱۶e() {
        return this.f۱۵۶۰۳e;
    }

    /* renamed from: b, reason: contains not printable characters */
    public List<Ck> m۱۶۴۱۳b() {
        return this.f۱۵۶۰۴f;
    }

    /* renamed from: h, reason: contains not printable characters */
    public ProxySelector m۱۶۴۱۹h() {
        return this.f۱۵۶۰۵g;
    }

    /* renamed from: f, reason: contains not printable characters */
    public Proxy m۱۶۴۱۷f() {
        return this.f۱۵۶۰۶h;
    }

    /* renamed from: j, reason: contains not printable characters */
    public SSLSocketFactory m۱۶۴۲۱j() {
        return this.f۱۵۶۰۷i;
    }

    /* renamed from: d, reason: contains not printable characters */
    public HostnameVerifier m۱۶۴۱۵d() {
        return this.f۱۵۶۰۸j;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cg m۱۶۴۱۱a() {
        return this.f۱۵۶۰۹k;
    }

    public boolean equals(Object other) {
        return (other instanceof Ca) && this.f۱۵۵۹۹a.equals(((Ca) other).f۱۵۵۹۹a) && m۱۶۴۱۲a((Ca) other);
    }

    public int hashCode() {
        int result = (17 * 31) + this.f۱۵۵۹۹a.hashCode();
        int result2 = ((((((((((result * 31) + this.f۱۵۶۰۰b.hashCode()) * 31) + this.f۱۵۶۰۲d.hashCode()) * 31) + this.f۱۵۶۰۳e.hashCode()) * 31) + this.f۱۵۶۰۴f.hashCode()) * 31) + this.f۱۵۶۰۵g.hashCode()) * 31;
        Proxy proxy = this.f۱۵۶۰۶h;
        int result3 = (result2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f۱۵۶۰۷i;
        int result4 = (result3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f۱۵۶۰۸j;
        int result5 = (result4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        Cg cg = this.f۱۵۶۰۹k;
        return result5 + (cg != null ? cg.hashCode() : 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۶۴۱۲a(Ca that) {
        return this.f۱۵۶۰۰b.equals(that.f۱۵۶۰۰b) && this.f۱۵۶۰۲d.equals(that.f۱۵۶۰۲d) && this.f۱۵۶۰۳e.equals(that.f۱۵۶۰۳e) && this.f۱۵۶۰۴f.equals(that.f۱۵۶۰۴f) && this.f۱۵۶۰۵g.equals(that.f۱۵۶۰۵g) && Cc.m۱۶۵۴۶a(this.f۱۵۶۰۶h, that.f۱۵۶۰۶h) && Cc.m۱۶۵۴۶a(this.f۱۵۶۰۷i, that.f۱۵۶۰۷i) && Cc.m۱۶۵۴۶a(this.f۱۵۶۰۸j, that.f۱۵۶۰۸j) && Cc.m۱۶۵۴۶a(this.f۱۵۶۰۹k, that.f۱۵۶۰۹k) && m۱۶۴۲۲k().m۱۷۱۵۸j() == that.m۱۶۴۲۲k().m۱۷۱۵۸j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f۱۵۵۹۹a.m۱۷۱۵۵g());
        sb.append(":");
        StringBuilder result = sb.append(this.f۱۵۵۹۹a.m۱۷۱۵۸j());
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
