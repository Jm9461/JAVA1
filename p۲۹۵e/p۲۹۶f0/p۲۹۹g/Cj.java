package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p۲۹۵e.AbstractCz;
import p۲۹۵e.Ca;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cc0;
import p۲۹۵e.Cg;
import p۲۹۵e.Cs;
import p۲۹۵e.Cv;
import p۲۹۵e.Cy;
import p۲۹۵e.InterfaceCt;

/* renamed from: e.f0.g.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cj implements InterfaceCt {

    /* renamed from: a, reason: contains not printable characters */
    private final Cv f۱۵۸۳۹a;

    /* renamed from: b, reason: contains not printable characters */
    private final boolean f۱۵۸۴۰b;

    /* renamed from: c, reason: contains not printable characters */
    private Object f۱۵۸۴۱c;

    /* renamed from: d, reason: contains not printable characters */
    private volatile boolean f۱۵۸۴۲d;

    public Cj(Cv client, boolean forWebSocket) {
        this.f۱۵۸۳۹a = client;
        this.f۱۵۸۴۰b = forWebSocket;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۷۲۸a() {
        return this.f۱۵۸۴۲d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۷۲۷a(Object callStackTrace) {
        this.f۱۵۸۴۱c = callStackTrace;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    @Override // p۲۹۵e.InterfaceCt
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p۲۹۵e.Ca0 mo۱۷۱۸۳a(p۲۹۵e.InterfaceCt.a r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cj.mo۱۷۱۸۳a(e.t$a):e.a0");
    }

    /* renamed from: a, reason: contains not printable characters */
    private Ca m۱۶۷۲۱a(Cs url) {
        SSLSocketFactory sslSocketFactory = null;
        HostnameVerifier hostnameVerifier = null;
        Cg certificatePinner = null;
        if (url.m۱۷۱۵۶h()) {
            sslSocketFactory = this.f۱۵۸۳۹a.m۱۷۲۱۷z();
            hostnameVerifier = this.f۱۵۸۳۹a.m۱۷۲۰۵n();
            certificatePinner = this.f۱۵۸۳۹a.m۱۷۱۹۵c();
        }
        return new Ca(url.m۱۷۱۵۵g(), url.m۱۷۱۵۸j(), this.f۱۵۸۳۹a.m۱۷۲۰۱i(), this.f۱۵۸۳۹a.m۱۷۲۱۶y(), sslSocketFactory, hostnameVerifier, certificatePinner, this.f۱۵۸۳۹a.m۱۷۲۱۲u(), this.f۱۵۸۳۹a.m۱۷۲۱۱t(), this.f۱۵۸۳۹a.m۱۷۲۱۰s(), this.f۱۵۸۳۹a.m۱۷۱۹۸f(), this.f۱۵۸۳۹a.m۱۷۲۱۳v());
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۶۷۲۴a(IOException e2, p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg streamAllocation, boolean requestSendStarted, Cy userRequest) {
        streamAllocation.m۱۶۶۶۵a(e2);
        if (!this.f۱۵۸۳۹a.m۱۷۲۱۵x()) {
            return false;
        }
        if (requestSendStarted) {
            userRequest.m۱۷۲۴۳a();
        }
        return m۱۶۷۲۵a(e2, requestSendStarted) && streamAllocation.m۱۶۶۶۸c();
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۶۷۲۵a(IOException e2, boolean requestSendStarted) {
        if (e2 instanceof ProtocolException) {
            return false;
        }
        return e2 instanceof InterruptedIOException ? (e2 instanceof SocketTimeoutException) && !requestSendStarted : (((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cy m۱۶۷۲۲a(Ca0 userResponse, Cc0 route) {
        String location;
        Cs url;
        Proxy selectedProxy;
        if (userResponse == null) {
            throw new IllegalStateException();
        }
        int responseCode = userResponse.m۱۶۴۲۸o();
        String method = userResponse.m۱۶۴۳۸y().m۱۷۲۴۹e();
        if (responseCode == 307 || responseCode == 308) {
            if (!method.equals("GET") && !method.equals("HEAD")) {
                return null;
            }
        } else {
            if (responseCode == 401) {
                return this.f۱۵۸۳۹a.m۱۷۱۹۲a().mo۱۶۴۵۷a(route, userResponse);
            }
            if (responseCode == 503) {
                if ((userResponse.m۱۶۴۳۵v() == null || userResponse.m۱۶۴۳۵v().m۱۶۴۲۸o() != 503) && m۱۶۷۲۰a(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.m۱۶۴۳۸y();
                }
                return null;
            }
            if (responseCode == 407) {
                if (route != null) {
                    selectedProxy = route.m۱۶۴۹۰b();
                } else {
                    selectedProxy = this.f۱۵۸۳۹a.m۱۷۲۱۱t();
                }
                if (selectedProxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.f۱۵۸۳۹a.m۱۷۲۱۲u().mo۱۶۴۵۷a(route, userResponse);
            }
            if (responseCode == 408) {
                if (!this.f۱۵۸۳۹a.m۱۷۲۱۵x()) {
                    return null;
                }
                userResponse.m۱۶۴۳۸y().m۱۷۲۴۳a();
                if ((userResponse.m۱۶۴۳۵v() == null || userResponse.m۱۶۴۳۵v().m۱۶۴۲۸o() != 408) && m۱۶۷۲۰a(userResponse, 0) <= 0) {
                    return userResponse.m۱۶۴۳۸y();
                }
                return null;
            }
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f۱۵۸۳۹a.m۱۷۲۰۳k() || (location = userResponse.m۱۶۴۲۴b("Location")) == null || (url = userResponse.m۱۶۴۳۸y().m۱۷۲۵۱g().m۱۷۱۴۹b(location)) == null) {
            return null;
        }
        boolean sameScheme = url.m۱۷۱۶۱m().equals(userResponse.m۱۶۴۳۸y().m۱۷۲۵۱g().m۱۷۱۶۱m());
        if (!sameScheme && !this.f۱۵۸۳۹a.m۱۷۲۰۴m()) {
            return null;
        }
        Cy.a requestBuilder = userResponse.m۱۶۴۳۸y().m۱۷۲۵۰f();
        if (Cf.m۱۶۷۰۰b(method)) {
            boolean maintainBody = Cf.m۱۶۷۰۲d(method);
            if (Cf.m۱۶۷۰۱c(method)) {
                requestBuilder.m۱۷۲۵۶a("GET", (AbstractCz) null);
            } else {
                AbstractCz requestBody = maintainBody ? userResponse.m۱۶۴۳۸y().m۱۷۲۴۳a() : null;
                requestBuilder.m۱۷۲۵۶a(method, requestBody);
            }
            if (!maintainBody) {
                requestBuilder.m۱۷۲۵۵a("Transfer-Encoding");
                requestBuilder.m۱۷۲۵۵a("Content-Length");
                requestBuilder.m۱۷۲۵۵a("Content-Type");
            }
        }
        if (!m۱۶۷۲۳a(userResponse, url)) {
            requestBuilder.m۱۷۲۵۵a("Authorization");
        }
        requestBuilder.m۱۷۲۵۴a(url);
        return requestBuilder.m۱۷۲۵۸a();
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۶۷۲۰a(Ca0 userResponse, int defaultDelay) {
        String header = userResponse.m۱۶۴۲۴b("Retry-After");
        if (header == null) {
            return defaultDelay;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۶۷۲۳a(Ca0 response, Cs followUp) {
        Cs url = response.m۱۶۴۳۸y().m۱۷۲۵۱g();
        return url.m۱۷۱۵۵g().equals(followUp.m۱۷۱۵۵g()) && url.m۱۷۱۵۸j() == followUp.m۱۷۱۵۸j() && url.m۱۷۱۶۱m().equals(followUp.m۱۷۱۶۱m());
    }
}
