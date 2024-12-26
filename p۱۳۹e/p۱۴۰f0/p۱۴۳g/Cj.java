package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

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
import p۱۳۹e.AbstractCt;
import p۱۳۹e.AbstractCz;
import p۱۳۹e.Ca;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cc0;
import p۱۳۹e.Cg;
import p۱۳۹e.Cs;
import p۱۳۹e.Cv;
import p۱۳۹e.Cy;

/* renamed from: e.f0.g.j  reason: invalid class name */
public final class Cj implements AbstractCt {

    /* renamed from: a  reason: contains not printable characters */
    private final Cv f۱۵۸۳۹a;

    /* renamed from: b  reason: contains not printable characters */
    private final boolean f۱۵۸۴۰b;

    /* renamed from: c  reason: contains not printable characters */
    private Object f۱۵۸۴۱c;

    /* renamed from: d  reason: contains not printable characters */
    private volatile boolean f۱۵۸۴۲d;

    public Cj(Cv client, boolean forWebSocket) {
        this.f۱۵۸۳۹a = client;
        this.f۱۵۸۴۰b = forWebSocket;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۸۰۷a() {
        return this.f۱۵۸۴۲d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۰۶a(Object callStackTrace) {
        this.f۱۵۸۴۱c = callStackTrace;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013a  */
    @Override // p۱۳۹e.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p۱۳۹e.Ca0 m۱۸۸۰۵a(p۱۳۹e.AbstractCt.AbstractCa r20) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cj.m۱۸۸۰۵a(e.t$a):e.a0");
    }

    /* renamed from: a  reason: contains not printable characters */
    private Ca m۱۸۸۰۰a(Cs url) {
        SSLSocketFactory sslSocketFactory = null;
        HostnameVerifier hostnameVerifier = null;
        Cg certificatePinner = null;
        if (url.m۱۹۲۳۵h()) {
            sslSocketFactory = this.f۱۵۸۳۹a.m۱۹۲۹۶z();
            hostnameVerifier = this.f۱۵۸۳۹a.m۱۹۲۸۴n();
            certificatePinner = this.f۱۵۸۳۹a.m۱۹۲۷۴c();
        }
        return new Ca(url.m۱۹۲۳۴g(), url.m۱۹۲۳۷j(), this.f۱۵۸۳۹a.m۱۹۲۸۰i(), this.f۱۵۸۳۹a.m۱۹۲۹۵y(), sslSocketFactory, hostnameVerifier, certificatePinner, this.f۱۵۸۳۹a.m۱۹۲۹۱u(), this.f۱۵۸۳۹a.m۱۹۲۹۰t(), this.f۱۵۸۳۹a.m۱۹۲۸۹s(), this.f۱۵۸۳۹a.m۱۹۲۷۷f(), this.f۱۵۸۳۹a.m۱۹۲۹۲v());
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۸۰۳a(IOException e, p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg streamAllocation, boolean requestSendStarted, Cy userRequest) {
        streamAllocation.m۱۸۷۴۴a(e);
        if (!this.f۱۵۸۳۹a.m۱۹۲۹۴x()) {
            return false;
        }
        if (requestSendStarted) {
            userRequest.m۱۹۳۲۱a();
        }
        if (m۱۸۸۰۴a(e, requestSendStarted) && streamAllocation.m۱۸۷۴۷c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۸۰۴a(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            if (!(e instanceof SocketTimeoutException) || requestSendStarted) {
                return false;
            }
            return true;
        } else if ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cy m۱۸۸۰۱a(Ca0 userResponse, Cc0 route) {
        String location;
        Cs url;
        Proxy selectedProxy;
        if (userResponse != null) {
            int responseCode = userResponse.m۱۸۵۰۷o();
            String method = userResponse.m۱۸۵۱۷y().m۱۹۳۲۷e();
            AbstractCz requestBody = null;
            if (responseCode == 307 || responseCode == 308) {
                if (!method.equals("GET") && !method.equals("HEAD")) {
                    return null;
                }
            } else if (responseCode == 401) {
                return this.f۱۵۸۳۹a.m۱۹۲۷۱a().m۱۸۵۳۵a(route, userResponse);
            } else {
                if (responseCode != 503) {
                    if (responseCode == 407) {
                        if (route != null) {
                            selectedProxy = route.m۱۸۵۶۹b();
                        } else {
                            selectedProxy = this.f۱۵۸۳۹a.m۱۹۲۹۰t();
                        }
                        if (selectedProxy.type() == Proxy.Type.HTTP) {
                            return this.f۱۵۸۳۹a.m۱۹۲۹۱u().m۱۸۵۳۵a(route, userResponse);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (responseCode != 408) {
                        switch (responseCode) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f۱۵۸۳۹a.m۱۹۲۹۴x()) {
                        return null;
                    } else {
                        userResponse.m۱۸۵۱۷y().m۱۹۳۲۱a();
                        if ((userResponse.m۱۸۵۱۴v() == null || userResponse.m۱۸۵۱۴v().m۱۸۵۰۷o() != 408) && m۱۸۷۹۹a(userResponse, 0) <= 0) {
                            return userResponse.m۱۸۵۱۷y();
                        }
                        return null;
                    }
                } else if ((userResponse.m۱۸۵۱۴v() == null || userResponse.m۱۸۵۱۴v().m۱۸۵۰۷o() != 503) && m۱۸۷۹۹a(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.m۱۸۵۱۷y();
                } else {
                    return null;
                }
            }
            if (!this.f۱۵۸۳۹a.m۱۹۲۸۲k() || (location = userResponse.m۱۸۵۰۳b("Location")) == null || (url = userResponse.m۱۸۵۱۷y().m۱۹۳۲۹g().m۱۹۲۲۸b(location)) == null) {
                return null;
            }
            if (!url.m۱۹۲۴۰m().equals(userResponse.m۱۸۵۱۷y().m۱۹۳۲۹g().m۱۹۲۴۰m()) && !this.f۱۵۸۳۹a.m۱۹۲۸۳m()) {
                return null;
            }
            Cy.Ca requestBuilder = userResponse.m۱۸۵۱۷y().m۱۹۳۲۸f();
            if (Cf.m۱۸۷۷۹b(method)) {
                boolean maintainBody = Cf.m۱۸۷۸۱d(method);
                if (Cf.m۱۸۷۸۰c(method)) {
                    requestBuilder.m۱۹۳۳۴a("GET", (AbstractCz) null);
                } else {
                    if (maintainBody) {
                        requestBody = userResponse.m۱۸۵۱۷y().m۱۹۳۲۱a();
                    }
                    requestBuilder.m۱۹۳۳۴a(method, requestBody);
                }
                if (!maintainBody) {
                    requestBuilder.m۱۹۳۳۳a("Transfer-Encoding");
                    requestBuilder.m۱۹۳۳۳a("Content-Length");
                    requestBuilder.m۱۹۳۳۳a("Content-Type");
                }
            }
            if (!m۱۸۸۰۲a(userResponse, url)) {
                requestBuilder.m۱۹۳۳۳a("Authorization");
            }
            requestBuilder.m۱۹۳۳۲a(url);
            return requestBuilder.m۱۹۳۳۶a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۸۷۹۹a(Ca0 userResponse, int defaultDelay) {
        String header = userResponse.m۱۸۵۰۳b("Retry-After");
        if (header == null) {
            return defaultDelay;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۸۰۲a(Ca0 response, Cs followUp) {
        Cs url = response.m۱۸۵۱۷y().m۱۹۳۲۹g();
        return url.m۱۹۲۳۴g().equals(followUp.m۱۹۲۳۴g()) && url.m۱۹۲۳۷j() == followUp.m۱۹۲۳۷j() && url.m۱۹۲۴۰m().equals(followUp.m۱۹۲۴۰m());
    }
}
