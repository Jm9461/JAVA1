package e.f0.f;

import e.a;
import e.a0;
import e.c0;
import e.f0.i.b;
import e.f0.i.g;
import e.f0.k.f;
import e.i;
import e.j;
import e.k;
import e.p;
import e.q;
import e.s;
import e.t;
import e.v;
import e.w;
import e.y;
import f.d;
import f.e;
import f.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public final class c extends g.h implements i {

    /* renamed from: b  reason: collision with root package name */
    private final j f۳۷۹۷b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f۳۷۹۸c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f۳۷۹۹d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f۳۸۰۰e;

    /* renamed from: f  reason: collision with root package name */
    private q f۳۸۰۱f;

    /* renamed from: g  reason: collision with root package name */
    private w f۳۸۰۲g;

    /* renamed from: h  reason: collision with root package name */
    private g f۳۸۰۳h;
    private e i;
    private d j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<g>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(j connectionPool, c0 route) {
        this.f۳۷۹۷b = connectionPool;
        this.f۳۷۹۸c = route;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f A[Catch:{ IOException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r17, int r18, int r19, int r20, boolean r21, e.e r22, e.p r23) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.f.c.a(int, int, int, int, boolean, e.e, e.p):void");
    }

    private void a(int connectTimeout, int readTimeout, int writeTimeout, e.e call, p eventListener) {
        y tunnelRequest = e();
        s url = tunnelRequest.g();
        for (int i2 = 0; i2 < 21; i2++) {
            a(connectTimeout, readTimeout, call, eventListener);
            tunnelRequest = a(readTimeout, writeTimeout, tunnelRequest, url);
            if (tunnelRequest != null) {
                e.f0.c.a(this.f۳۷۹۹d);
                this.f۳۷۹۹d = null;
                this.j = null;
                this.i = null;
                eventListener.a(call, this.f۳۷۹۸c.d(), this.f۳۷۹۸c.b(), null);
            } else {
                return;
            }
        }
    }

    private void a(int connectTimeout, int readTimeout, e.e call, p eventListener) {
        Socket socket;
        Proxy proxy = this.f۳۷۹۸c.b();
        a address = this.f۳۷۹۸c.a();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = address.i().createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f۳۷۹۹d = socket;
        eventListener.a(call, this.f۳۷۹۸c.d(), proxy);
        this.f۳۷۹۹d.setSoTimeout(readTimeout);
        try {
            f.d().a(this.f۳۷۹۹d, this.f۳۷۹۸c.d(), connectTimeout);
            try {
                this.i = l.a(l.b(this.f۳۷۹۹d));
                this.j = l.a(l.a(this.f۳۷۹۹d));
            } catch (NullPointerException npe) {
                if ("throw with null exception".equals(npe.getMessage())) {
                    throw new IOException(npe);
                }
            }
        } catch (ConnectException e2) {
            ConnectException ce = new ConnectException("Failed to connect to " + this.f۳۷۹۸c.d());
            ce.initCause(e2);
            throw ce;
        }
    }

    private void a(b connectionSpecSelector, int pingIntervalMillis, e.e call, p eventListener) {
        if (this.f۳۷۹۸c.a().j() == null) {
            this.f۳۸۰۲g = w.HTTP_1_1;
            this.f۳۸۰۰e = this.f۳۷۹۹d;
            return;
        }
        eventListener.g(call);
        a(connectionSpecSelector);
        eventListener.a(call, this.f۳۸۰۱f);
        if (this.f۳۸۰۲g == w.HTTP_2) {
            this.f۳۸۰۰e.setSoTimeout(0);
            g.C۰۱۲۰g gVar = new g.C۰۱۲۰g(true);
            gVar.a(this.f۳۸۰۰e, this.f۳۷۹۸c.a().k().g(), this.i, this.j);
            gVar.a(this);
            gVar.a(pingIntervalMillis);
            this.f۳۸۰۳h = gVar.a();
            this.f۳۸۰۳h.n();
        }
    }

    private void a(b connectionSpecSelector) {
        String maybeProtocol;
        w wVar;
        a address = this.f۳۷۹۸c.a();
        try {
            SSLSocket sslSocket = (SSLSocket) address.j().createSocket(this.f۳۷۹۹d, address.k().g(), address.k().j(), true);
            k connectionSpec = connectionSpecSelector.a(sslSocket);
            if (connectionSpec.c()) {
                f.d().a(sslSocket, address.k().g(), address.e());
            }
            sslSocket.startHandshake();
            SSLSession sslSocketSession = sslSocket.getSession();
            if (a(sslSocketSession)) {
                q unverifiedHandshake = q.a(sslSocketSession);
                if (address.d().verify(address.k().g(), sslSocketSession)) {
                    address.a().a(address.k().g(), unverifiedHandshake.c());
                    if (connectionSpec.c()) {
                        maybeProtocol = f.d().b(sslSocket);
                    } else {
                        maybeProtocol = null;
                    }
                    this.f۳۸۰۰e = sslSocket;
                    this.i = l.a(l.b(this.f۳۸۰۰e));
                    this.j = l.a(l.a(this.f۳۸۰۰e));
                    this.f۳۸۰۱f = unverifiedHandshake;
                    if (maybeProtocol != null) {
                        wVar = w.a(maybeProtocol);
                    } else {
                        wVar = w.HTTP_1_1;
                    }
                    this.f۳۸۰۲g = wVar;
                    if (sslSocket != null) {
                        f.d().a(sslSocket);
                    }
                    if (1 == 0) {
                        e.f0.c.a((Socket) sslSocket);
                        return;
                    }
                    return;
                }
                X509Certificate cert = (X509Certificate) unverifiedHandshake.c().get(0);
                throw new SSLPeerUnverifiedException("Hostname " + address.k().g() + " not verified:\n    certificate: " + e.g.a((Certificate) cert) + "\n    DN: " + cert.getSubjectDN().getName() + "\n    subjectAltNames: " + e.f0.l.d.a(cert));
            }
            throw new IOException("a valid ssl session was not established");
        } catch (AssertionError e2) {
            if (e.f0.c.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                f.d().a((SSLSocket) null);
            }
            if (0 == 0) {
                e.f0.c.a((Socket) null);
            }
            throw th;
        }
    }

    private boolean a(SSLSession sslSocketSession) {
        return !"NONE".equals(sslSocketSession.getProtocol()) && !"SSL_NULL_WITH_NULL_NULL".equals(sslSocketSession.getCipherSuite());
    }

    private y a(int readTimeout, int writeTimeout, y tunnelRequest, s url) {
        a0 response;
        String requestLine = "CONNECT " + e.f0.c.a(url, true) + " HTTP/1.1";
        do {
            e.f0.h.a tunnelConnection = new e.f0.h.a(null, null, this.i, this.j);
            this.i.b().a((long) readTimeout, TimeUnit.MILLISECONDS);
            this.j.b().a((long) writeTimeout, TimeUnit.MILLISECONDS);
            tunnelConnection.a(tunnelRequest.c(), requestLine);
            tunnelConnection.a();
            a0.a a2 = tunnelConnection.a(false);
            a2.a(tunnelRequest);
            response = a2.a();
            long contentLength = e.f0.g.e.a(response);
            if (contentLength == -1) {
                contentLength = 0;
            }
            f.s body = tunnelConnection.b(contentLength);
            e.f0.c.b(body, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            body.close();
            int o2 = response.o();
            if (o2 != 200) {
                if (o2 == 407) {
                    tunnelRequest = this.f۳۷۹۸c.a().g().a(this.f۳۷۹۸c, response);
                    if (tunnelRequest == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + response.o());
                }
            } else if (this.i.a().i() && this.j.a().i()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } while (!"close".equalsIgnoreCase(response.b("Connection")));
        return tunnelRequest;
    }

    private y e() {
        y.a aVar = new y.a();
        aVar.a(this.f۳۷۹۸c.a().k());
        aVar.a("Host", e.f0.c.a(this.f۳۷۹۸c.a().k(), true));
        aVar.a("Proxy-Connection", "Keep-Alive");
        aVar.a("User-Agent", e.f0.d.a());
        return aVar.a();
    }

    public boolean a(a address, c0 route) {
        if (this.n.size() >= this.m || this.k || !e.f0.a.f۳۷۴۰a.a(this.f۳۷۹۸c.a(), address)) {
            return false;
        }
        if (address.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f۳۸۰۳h == null || route == null || route.b().type() != Proxy.Type.DIRECT || this.f۳۷۹۸c.b().type() != Proxy.Type.DIRECT || !this.f۳۷۹۸c.d().equals(route.d()) || route.a().d() != e.f0.l.d.f۴۰۴۰a || !a(address.k())) {
            return false;
        }
        try {
            address.a().a(address.k().g(), a().c());
            return true;
        } catch (SSLPeerUnverifiedException e2) {
            return false;
        }
    }

    public boolean a(s url) {
        if (url.j() != this.f۳۷۹۸c.a().k().j()) {
            return false;
        }
        if (url.g().equals(this.f۳۷۹۸c.a().k().g())) {
            return true;
        }
        if (this.f۳۸۰۱f == null || !e.f0.l.d.f۴۰۴۰a.a(url.g(), (X509Certificate) this.f۳۸۰۱f.c().get(0))) {
            return false;
        }
        return true;
    }

    public e.f0.g.c a(v client, t.a chain, g streamAllocation) {
        g gVar = this.f۳۸۰۳h;
        if (gVar != null) {
            return new e.f0.i.f(client, chain, streamAllocation, gVar);
        }
        this.f۳۸۰۰e.setSoTimeout(chain.d());
        this.i.b().a((long) chain.d(), TimeUnit.MILLISECONDS);
        this.j.b().a((long) chain.a(), TimeUnit.MILLISECONDS);
        return new e.f0.h.a(client, streamAllocation, this.i, this.j);
    }

    public c0 c() {
        return this.f۳۷۹۸c;
    }

    public Socket d() {
        return this.f۳۸۰۰e;
    }

    /* JADX INFO: finally extract failed */
    public boolean a(boolean doExtensiveChecks) {
        if (this.f۳۸۰۰e.isClosed() || this.f۳۸۰۰e.isInputShutdown() || this.f۳۸۰۰e.isOutputShutdown()) {
            return false;
        }
        g gVar = this.f۳۸۰۳h;
        if (gVar != null) {
            return !gVar.l();
        }
        if (doExtensiveChecks) {
            try {
                int readTimeout = this.f۳۸۰۰e.getSoTimeout();
                try {
                    this.f۳۸۰۰e.setSoTimeout(1);
                    if (this.i.i()) {
                        this.f۳۸۰۰e.setSoTimeout(readTimeout);
                        return false;
                    }
                    this.f۳۸۰۰e.setSoTimeout(readTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f۳۸۰۰e.setSoTimeout(readTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException e2) {
            } catch (IOException e3) {
                return false;
            }
        }
        return true;
    }

    @Override // e.f0.i.g.h
    public void a(e.f0.i.i stream) {
        stream.a(b.REFUSED_STREAM);
    }

    @Override // e.f0.i.g.h
    public void a(g connection) {
        synchronized (this.f۳۷۹۷b) {
            this.m = connection.m();
        }
    }

    public q a() {
        return this.f۳۸۰۱f;
    }

    public boolean b() {
        return this.f۳۸۰۳h != null;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f۳۷۹۸c.a().k().g());
        sb.append(":");
        sb.append(this.f۳۷۹۸c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.f۳۷۹۸c.b());
        sb.append(" hostAddress=");
        sb.append(this.f۳۷۹۸c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f۳۸۰۱f;
        if (qVar != null) {
            obj = qVar.a();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f۳۸۰۲g);
        sb.append('}');
        return sb.toString();
    }
}
