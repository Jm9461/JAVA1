package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

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
import javax.net.ssl.SSLSocketFactory;
import p۲۹۵e.AbstractCp;
import p۲۹۵e.Ca;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cc0;
import p۲۹۵e.Cj;
import p۲۹۵e.Ck;
import p۲۹۵e.Cq;
import p۲۹۵e.Cs;
import p۲۹۵e.Cv;
import p۲۹۵e.Cy;
import p۲۹۵e.EnumCw;
import p۲۹۵e.InterfaceCi;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.AbstractCa;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ce;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cg;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ci;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.EnumCb;
import p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.Cd;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.f.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc extends Cg.h implements InterfaceCi {

    /* renamed from: b, reason: contains not printable characters */
    private final Cj f۱۵۷۷۷b;

    /* renamed from: c, reason: contains not printable characters */
    private final Cc0 f۱۵۷۷۸c;

    /* renamed from: d, reason: contains not printable characters */
    private Socket f۱۵۷۷۹d;

    /* renamed from: e, reason: contains not printable characters */
    private Socket f۱۵۷۸۰e;

    /* renamed from: f, reason: contains not printable characters */
    private Cq f۱۵۷۸۱f;

    /* renamed from: g, reason: contains not printable characters */
    private EnumCw f۱۵۷۸۲g;

    /* renamed from: h, reason: contains not printable characters */
    private Cg f۱۵۷۸۳h;

    /* renamed from: i, reason: contains not printable characters */
    private InterfaceCe f۱۵۷۸۴i;

    /* renamed from: j, reason: contains not printable characters */
    private InterfaceCd f۱۵۷۸۵j;

    /* renamed from: k, reason: contains not printable characters */
    public boolean f۱۵۷۸۶k;

    /* renamed from: l, reason: contains not printable characters */
    public int f۱۵۷۸۷l;

    /* renamed from: m, reason: contains not printable characters */
    public int f۱۵۷۸۸m = 1;

    /* renamed from: n, reason: contains not printable characters */
    public final List<Reference<Cg>> f۱۵۷۸۹n = new ArrayList();

    /* renamed from: o, reason: contains not printable characters */
    public long f۱۵۷۹۰o = Long.MAX_VALUE;

    public Cc(Cj connectionPool, Cc0 route) {
        this.f۱۵۷۷۷b = connectionPool;
        this.f۱۵۷۷۸c = route;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m۱۶۶۲۹a(int r17, int r18, int r19, int r20, boolean r21, p۲۹۵e.InterfaceCe r22, p۲۹۵e.AbstractCp r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc.m۱۶۶۲۹a(int, int, int, int, boolean, e.e, e.p):void");
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۲۱a(int connectTimeout, int readTimeout, int writeTimeout, p۲۹۵e.InterfaceCe call, AbstractCp eventListener) {
        Cy tunnelRequest = m۱۶۶۲۶e();
        Cs url = tunnelRequest.m۱۷۲۵۱g();
        for (int i = 0; i < 21; i++) {
            m۱۶۶۲۲a(connectTimeout, readTimeout, call, eventListener);
            tunnelRequest = m۱۶۶۲۰a(readTimeout, writeTimeout, tunnelRequest, url);
            if (tunnelRequest != null) {
                p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۳a(this.f۱۵۷۷۹d);
                this.f۱۵۷۷۹d = null;
                this.f۱۵۷۸۵j = null;
                this.f۱۵۷۸۴i = null;
                eventListener.m۱۷۱۰۱a(call, this.f۱۵۷۷۸c.m۱۶۴۹۲d(), this.f۱۵۷۷۸c.m۱۶۴۹۰b(), null);
            } else {
                return;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۲۲a(int connectTimeout, int readTimeout, p۲۹۵e.InterfaceCe call, AbstractCp eventListener) {
        Socket createSocket;
        Proxy proxy = this.f۱۵۷۷۸c.m۱۶۴۹۰b();
        Ca address = this.f۱۵۷۷۸c.m۱۶۴۸۹a();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            createSocket = address.m۱۶۴۲۰i().createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        this.f۱۵۷۷۹d = createSocket;
        eventListener.m۱۷۱۰۰a(call, this.f۱۵۷۷۸c.m۱۶۴۹۲d(), proxy);
        this.f۱۵۷۷۹d.setSoTimeout(readTimeout);
        try {
            Cf.m۱۷۰۰۷d().mo۱۷۰۱۴a(this.f۱۵۷۷۹d, this.f۱۵۷۷۸c.m۱۶۴۹۲d(), connectTimeout);
            try {
                this.f۱۵۷۸۴i = Cl.m۱۷۴۰۳a(Cl.m۱۷۴۱۳b(this.f۱۵۷۷۹d));
                this.f۱۵۷۸۵j = Cl.m۱۷۴۰۲a(Cl.m۱۷۴۰۸a(this.f۱۵۷۷۹d));
            } catch (NullPointerException npe) {
                if ("throw with null exception".equals(npe.getMessage())) {
                    throw new IOException(npe);
                }
            }
        } catch (ConnectException e2) {
            ConnectException ce = new ConnectException("Failed to connect to " + this.f۱۵۷۷۸c.m۱۶۴۹۲d());
            ce.initCause(e2);
            throw ce;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۲۴a(Cb connectionSpecSelector, int pingIntervalMillis, p۲۹۵e.InterfaceCe call, AbstractCp eventListener) {
        if (this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۱j() == null) {
            this.f۱۵۷۸۲g = EnumCw.HTTP_1_1;
            this.f۱۵۷۸۰e = this.f۱۵۷۷۹d;
            return;
        }
        eventListener.m۱۷۱۱۰g(call);
        m۱۶۶۲۳a(connectionSpecSelector);
        eventListener.m۱۷۰۹۵a(call, this.f۱۵۷۸۱f);
        if (this.f۱۵۷۸۲g == EnumCw.HTTP_2) {
            this.f۱۵۷۸۰e.setSoTimeout(0);
            Cg.g gVar = new Cg.g(true);
            gVar.m۱۶۸۳۲a(this.f۱۵۷۸۰e, this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k().m۱۷۱۵۵g(), this.f۱۵۷۸۴i, this.f۱۵۷۸۵j);
            gVar.m۱۶۸۳۱a(this);
            gVar.m۱۶۸۳۰a(pingIntervalMillis);
            this.f۱۵۷۸۳h = gVar.m۱۶۸۳۳a();
            this.f۱۵۷۸۳h.m۱۶۸۲۳n();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۲۳a(Cb connectionSpecSelector) {
        String maybeProtocol;
        EnumCw enumCw;
        Ca address = this.f۱۵۷۷۸c.m۱۶۴۸۹a();
        SSLSocketFactory sslSocketFactory = address.m۱۶۴۲۱j();
        boolean success = false;
        SSLSocket sslSocket = null;
        try {
            try {
                sslSocket = (SSLSocket) sslSocketFactory.createSocket(this.f۱۵۷۷۹d, address.m۱۶۴۲۲k().m۱۷۱۵۵g(), address.m۱۶۴۲۲k().m۱۷۱۵۸j(), true);
                Ck connectionSpec = connectionSpecSelector.m۱۶۶۱۸a(sslSocket);
                if (connectionSpec.m۱۷۰۵۷c()) {
                    Cf.m۱۷۰۰۷d().mo۱۷۰۱۶a(sslSocket, address.m۱۶۴۲۲k().m۱۷۱۵۵g(), address.m۱۶۴۱۶e());
                }
                sslSocket.startHandshake();
                SSLSession sslSocketSession = sslSocket.getSession();
                if (!m۱۶۶۲۵a(sslSocketSession)) {
                    throw new IOException("a valid ssl session was not established");
                }
                Cq unverifiedHandshake = Cq.m۱۷۱۱۴a(sslSocketSession);
                if (!address.m۱۶۴۱۵d().verify(address.m۱۶۴۲۲k().m۱۷۱۵۵g(), sslSocketSession)) {
                    X509Certificate cert = (X509Certificate) unverifiedHandshake.m۱۷۱۱۷c().get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + address.m۱۶۴۲۲k().m۱۷۱۵۵g() + " not verified:\n    certificate: " + p۲۹۵e.Cg.m۱۷۰۳۴a((Certificate) cert) + "\n    DN: " + cert.getSubjectDN().getName() + "\n    subjectAltNames: " + Cd.m۱۷۰۲۶a(cert));
                }
                address.m۱۶۴۱۱a().m۱۷۰۳۸a(address.m۱۶۴۲۲k().m۱۷۱۵۵g(), unverifiedHandshake.m۱۷۱۱۷c());
                if (connectionSpec.m۱۷۰۵۷c()) {
                    maybeProtocol = Cf.m۱۷۰۰۷d().mo۱۷۰۱۸b(sslSocket);
                } else {
                    maybeProtocol = null;
                }
                this.f۱۵۷۸۰e = sslSocket;
                this.f۱۵۷۸۴i = Cl.m۱۷۴۰۳a(Cl.m۱۷۴۱۳b(this.f۱۵۷۸۰e));
                this.f۱۵۷۸۵j = Cl.m۱۷۴۰۲a(Cl.m۱۷۴۰۸a(this.f۱۵۷۸۰e));
                this.f۱۵۷۸۱f = unverifiedHandshake;
                if (maybeProtocol != null) {
                    enumCw = EnumCw.m۱۷۲۳۰a(maybeProtocol);
                } else {
                    enumCw = EnumCw.HTTP_1_1;
                }
                this.f۱۵۷۸۲g = enumCw;
                success = true;
            } catch (AssertionError e2) {
                if (!p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۵a(e2)) {
                    throw e2;
                }
                throw new IOException(e2);
            }
        } finally {
            if (sslSocket != null) {
                Cf.m۱۷۰۰۷d().mo۱۷۰۱۵a(sslSocket);
            }
            if (!success) {
                p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۳a((Socket) sslSocket);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۶۶۲۵a(SSLSession sslSocketSession) {
        return ("NONE".equals(sslSocketSession.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(sslSocketSession.getCipherSuite())) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cy m۱۶۶۲۰a(int readTimeout, int writeTimeout, Cy tunnelRequest, Cs url) {
        Ca0 response;
        String requestLine = "CONNECT " + p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۳a(url, true) + " HTTP/1.1";
        do {
            p۲۹۵e.p۲۹۶f0.p۳۰۰h.Ca tunnelConnection = new p۲۹۵e.p۲۹۶f0.p۳۰۰h.Ca(null, null, this.f۱۵۷۸۴i, this.f۱۵۷۸۵j);
            this.f۱۵۷۸۴i.mo۱۷۴۷۸b().mo۱۷۴۸۸a(readTimeout, TimeUnit.MILLISECONDS);
            this.f۱۵۷۸۵j.mo۱۷۴۷۶b().mo۱۷۴۸۸a(writeTimeout, TimeUnit.MILLISECONDS);
            tunnelConnection.m۱۶۷۳۷a(tunnelRequest.m۱۷۲۴۷c(), requestLine);
            tunnelConnection.mo۱۶۷۹۳a();
            Ca0.a aVar = tunnelConnection.mo۱۶۷۹۰a(false);
            aVar.m۱۶۴۴۹a(tunnelRequest);
            response = aVar.m۱۶۴۵۲a();
            long contentLength = Ce.m۱۶۶۸۶a(response);
            if (contentLength == -1) {
                contentLength = 0;
            }
            InterfaceCs body = tunnelConnection.m۱۶۷۴۰b(contentLength);
            p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۵۱b(body, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            body.close();
            int i = response.m۱۶۴۲۸o();
            if (i == 200) {
                if (this.f۱۵۷۸۴i.mo۱۷۴۳۳a().mo۱۷۴۴۸i() && this.f۱۵۷۸۵j.mo۱۷۴۳۳a().mo۱۷۴۴۸i()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (i == 407) {
                tunnelRequest = this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۱۸g().mo۱۶۴۵۷a(this.f۱۵۷۷۸c, response);
                if (tunnelRequest == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + response.m۱۶۴۲۸o());
            }
        } while (!"close".equalsIgnoreCase(response.m۱۶۴۲۴b("Connection")));
        return tunnelRequest;
    }

    /* renamed from: e, reason: contains not printable characters */
    private Cy m۱۶۶۲۶e() {
        Cy.a aVar = new Cy.a();
        aVar.m۱۷۲۵۴a(this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k());
        aVar.m۱۷۲۵۷a("Host", p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۳a(this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k(), true));
        aVar.m۱۷۲۵۷a("Proxy-Connection", "Keep-Alive");
        aVar.m۱۷۲۵۷a("User-Agent", p۲۹۵e.p۲۹۶f0.Cd.m۱۶۵۵۹a());
        return aVar.m۱۷۲۵۸a();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۶۳۲a(Ca address, Cc0 route) {
        if (this.f۱۵۷۸۹n.size() >= this.f۱۵۷۸۸m || this.f۱۵۷۸۶k || !AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۵a(this.f۱۵۷۷۸c.m۱۶۴۸۹a(), address)) {
            return false;
        }
        if (address.m۱۶۴۲۲k().m۱۷۱۵۵g().equals(m۱۶۶۳۶c().m۱۶۴۸۹a().m۱۶۴۲۲k().m۱۷۱۵۵g())) {
            return true;
        }
        if (this.f۱۵۷۸۳h == null || route == null || route.m۱۶۴۹۰b().type() != Proxy.Type.DIRECT || this.f۱۵۷۷۸c.m۱۶۴۹۰b().type() != Proxy.Type.DIRECT || !this.f۱۵۷۷۸c.m۱۶۴۹۲d().equals(route.m۱۶۴۹۲d()) || route.m۱۶۴۸۹a().m۱۶۴۱۵d() != Cd.f۱۶۰۷۴a || !m۱۶۶۳۳a(address.m۱۶۴۲۲k())) {
            return false;
        }
        try {
            address.m۱۶۴۱۱a().m۱۷۰۳۸a(address.m۱۶۴۲۲k().m۱۷۱۵۵g(), m۱۶۶۲۸a().m۱۷۱۱۷c());
            return true;
        } catch (SSLPeerUnverifiedException e2) {
            return false;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۶۳۳a(Cs url) {
        if (url.m۱۷۱۵۸j() != this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k().m۱۷۱۵۸j()) {
            return false;
        }
        if (url.m۱۷۱۵۵g().equals(this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k().m۱۷۱۵۵g())) {
            return true;
        }
        return this.f۱۵۷۸۱f != null && Cd.f۱۶۰۷۴a.m۱۷۰۳۱a(url.m۱۷۱۵۵g(), (X509Certificate) this.f۱۵۷۸۱f.m۱۷۱۱۷c().get(0));
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCc m۱۶۶۲۷a(Cv client, InterfaceCt.a chain, Cg streamAllocation) {
        Cg cg = this.f۱۵۷۸۳h;
        if (cg != null) {
            return new p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cf(client, chain, streamAllocation, cg);
        }
        this.f۱۵۷۸۰e.setSoTimeout(chain.mo۱۷۱۸۸d());
        this.f۱۵۷۸۴i.mo۱۷۴۷۸b().mo۱۷۴۸۸a(chain.mo۱۷۱۸۸d(), TimeUnit.MILLISECONDS);
        this.f۱۵۷۸۵j.mo۱۷۴۷۶b().mo۱۷۴۸۸a(chain.mo۱۷۱۸۴a(), TimeUnit.MILLISECONDS);
        return new p۲۹۵e.p۲۹۶f0.p۳۰۰h.Ca(client, streamAllocation, this.f۱۵۷۸۴i, this.f۱۵۷۸۵j);
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cc0 m۱۶۶۳۶c() {
        return this.f۱۵۷۷۸c;
    }

    /* renamed from: d, reason: contains not printable characters */
    public Socket m۱۶۶۳۷d() {
        return this.f۱۵۷۸۰e;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۶۳۴a(boolean doExtensiveChecks) {
        if (this.f۱۵۷۸۰e.isClosed() || this.f۱۵۷۸۰e.isInputShutdown() || this.f۱۵۷۸۰e.isOutputShutdown()) {
            return false;
        }
        if (this.f۱۵۷۸۳h != null) {
            return !r0.m۱۶۸۲۱l();
        }
        if (doExtensiveChecks) {
            try {
                int readTimeout = this.f۱۵۷۸۰e.getSoTimeout();
                try {
                    this.f۱۵۷۸۰e.setSoTimeout(1);
                    return !this.f۱۵۷۸۴i.mo۱۷۴۴۸i();
                } finally {
                    this.f۱۵۷۸۰e.setSoTimeout(readTimeout);
                }
            } catch (SocketTimeoutException e2) {
            } catch (IOException e3) {
                return false;
            }
        }
        return true;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cg.h
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۸۳۶a(Ci stream) {
        stream.m۱۶۸۸۴a(EnumCb.REFUSED_STREAM);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cg.h
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۸۳۴a(Cg connection) {
        synchronized (this.f۱۵۷۷۷b) {
            this.f۱۵۷۸۸m = connection.m۱۶۸۲۲m();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cq m۱۶۶۲۸a() {
        return this.f۱۵۷۸۱f;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۶۶۳۵b() {
        return this.f۱۵۷۸۳h != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k().m۱۷۱۵۵g());
        sb.append(":");
        sb.append(this.f۱۵۷۷۸c.m۱۶۴۸۹a().m۱۶۴۲۲k().m۱۷۱۵۸j());
        sb.append(", proxy=");
        sb.append(this.f۱۵۷۷۸c.m۱۶۴۹۰b());
        sb.append(" hostAddress=");
        sb.append(this.f۱۵۷۷۸c.m۱۶۴۹۲d());
        sb.append(" cipherSuite=");
        Cq cq = this.f۱۵۷۸۱f;
        sb.append(cq != null ? cq.m۱۷۱۱۵a() : "none");
        sb.append(" protocol=");
        sb.append(this.f۱۵۷۸۲g);
        sb.append('}');
        return sb.toString();
    }
}
