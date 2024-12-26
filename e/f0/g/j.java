package e.f0.g;

import e.a;
import e.a0;
import e.c0;
import e.g;
import e.s;
import e.t;
import e.v;
import e.y;
import e.z;
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

public final class j implements t {

    /* renamed from: a  reason: collision with root package name */
    private final v f۳۸۴۲a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f۳۸۴۳b;

    /* renamed from: c  reason: collision with root package name */
    private Object f۳۸۴۴c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f۳۸۴۵d;

    public j(v client, boolean forWebSocket) {
        this.f۳۸۴۲a = client;
        this.f۳۸۴۳b = forWebSocket;
    }

    public boolean a() {
        return this.f۳۸۴۵d;
    }

    public void a(Object callStackTrace) {
        this.f۳۸۴۴c = callStackTrace;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013a  */
    @Override // e.t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a0 a(e.t.a r20) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.g.j.a(e.t$a):e.a0");
    }

    private a a(s url) {
        SSLSocketFactory sslSocketFactory = null;
        HostnameVerifier hostnameVerifier = null;
        g certificatePinner = null;
        if (url.h()) {
            sslSocketFactory = this.f۳۸۴۲a.z();
            hostnameVerifier = this.f۳۸۴۲a.n();
            certificatePinner = this.f۳۸۴۲a.c();
        }
        return new a(url.g(), url.j(), this.f۳۸۴۲a.i(), this.f۳۸۴۲a.y(), sslSocketFactory, hostnameVerifier, certificatePinner, this.f۳۸۴۲a.u(), this.f۳۸۴۲a.t(), this.f۳۸۴۲a.s(), this.f۳۸۴۲a.f(), this.f۳۸۴۲a.v());
    }

    private boolean a(IOException e2, e.f0.f.g streamAllocation, boolean requestSendStarted, y userRequest) {
        streamAllocation.a(e2);
        if (!this.f۳۸۴۲a.x()) {
            return false;
        }
        if (requestSendStarted) {
            userRequest.a();
        }
        if (a(e2, requestSendStarted) && streamAllocation.c()) {
            return true;
        }
        return false;
    }

    private boolean a(IOException e2, boolean requestSendStarted) {
        if (e2 instanceof ProtocolException) {
            return false;
        }
        if (e2 instanceof InterruptedIOException) {
            if (!(e2 instanceof SocketTimeoutException) || requestSendStarted) {
                return false;
            }
            return true;
        } else if ((!(e2 instanceof SSLHandshakeException) || !(e2.getCause() instanceof CertificateException)) && !(e2 instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private y a(a0 userResponse, c0 route) {
        String location;
        s url;
        Proxy selectedProxy;
        if (userResponse != null) {
            int responseCode = userResponse.o();
            String method = userResponse.y().e();
            z requestBody = null;
            if (responseCode == 307 || responseCode == 308) {
                if (!method.equals("GET") && !method.equals("HEAD")) {
                    return null;
                }
            } else if (responseCode == 401) {
                return this.f۳۸۴۲a.a().a(route, userResponse);
            } else {
                if (responseCode != 503) {
                    if (responseCode == 407) {
                        if (route != null) {
                            selectedProxy = route.b();
                        } else {
                            selectedProxy = this.f۳۸۴۲a.t();
                        }
                        if (selectedProxy.type() == Proxy.Type.HTTP) {
                            return this.f۳۸۴۲a.u().a(route, userResponse);
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
                    } else if (!this.f۳۸۴۲a.x()) {
                        return null;
                    } else {
                        userResponse.y().a();
                        if ((userResponse.v() == null || userResponse.v().o() != 408) && a(userResponse, 0) <= 0) {
                            return userResponse.y();
                        }
                        return null;
                    }
                } else if ((userResponse.v() == null || userResponse.v().o() != 503) && a(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.y();
                } else {
                    return null;
                }
            }
            if (!this.f۳۸۴۲a.k() || (location = userResponse.b("Location")) == null || (url = userResponse.y().g().b(location)) == null) {
                return null;
            }
            if (!url.m().equals(userResponse.y().g().m()) && !this.f۳۸۴۲a.m()) {
                return null;
            }
            y.a requestBuilder = userResponse.y().f();
            if (f.b(method)) {
                boolean maintainBody = f.d(method);
                if (f.c(method)) {
                    requestBuilder.a("GET", (z) null);
                } else {
                    if (maintainBody) {
                        requestBody = userResponse.y().a();
                    }
                    requestBuilder.a(method, requestBody);
                }
                if (!maintainBody) {
                    requestBuilder.a("Transfer-Encoding");
                    requestBuilder.a("Content-Length");
                    requestBuilder.a("Content-Type");
                }
            }
            if (!a(userResponse, url)) {
                requestBuilder.a("Authorization");
            }
            requestBuilder.a(url);
            return requestBuilder.a();
        }
        throw new IllegalStateException();
    }

    private int a(a0 userResponse, int defaultDelay) {
        String header = userResponse.b("Retry-After");
        if (header == null) {
            return defaultDelay;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean a(a0 response, s followUp) {
        s url = response.y().g();
        return url.g().equals(followUp.g()) && url.j() == followUp.j() && url.m().equals(followUp.m());
    }
}
