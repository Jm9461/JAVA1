package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

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
import p۱۳۹e.AbstractCi;
import p۱۳۹e.AbstractCp;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.Ca;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cc0;
import p۱۳۹e.Cj;
import p۱۳۹e.Ck;
import p۱۳۹e.Cq;
import p۱۳۹e.Cs;
import p۱۳۹e.Cv;
import p۱۳۹e.Cy;
import p۱۳۹e.EnumCw;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cg;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.EnumCb;
import p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.Cd;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;

/* renamed from: e.f0.f.c  reason: invalid class name */
public final class Cc extends Cg.AbstractCh implements AbstractCi {

    /* renamed from: b  reason: contains not printable characters */
    private final Cj f۱۵۷۷۷b;

    /* renamed from: c  reason: contains not printable characters */
    private final Cc0 f۱۵۷۷۸c;

    /* renamed from: d  reason: contains not printable characters */
    private Socket f۱۵۷۷۹d;

    /* renamed from: e  reason: contains not printable characters */
    private Socket f۱۵۷۸۰e;

    /* renamed from: f  reason: contains not printable characters */
    private Cq f۱۵۷۸۱f;

    /* renamed from: g  reason: contains not printable characters */
    private EnumCw f۱۵۷۸۲g;

    /* renamed from: h  reason: contains not printable characters */
    private Cg f۱۵۷۸۳h;

    /* renamed from: i  reason: contains not printable characters */
    private AbstractCe f۱۵۷۸۴i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCd f۱۵۷۸۵j;

    /* renamed from: k  reason: contains not printable characters */
    public boolean f۱۵۷۸۶k;

    /* renamed from: l  reason: contains not printable characters */
    public int f۱۵۷۸۷l;

    /* renamed from: m  reason: contains not printable characters */
    public int f۱۵۷۸۸m = 1;

    /* renamed from: n  reason: contains not printable characters */
    public final List<Reference<Cg>> f۱۵۷۸۹n = new ArrayList();

    /* renamed from: o  reason: contains not printable characters */
    public long f۱۵۷۹۰o = Long.MAX_VALUE;

    public Cc(Cj connectionPool, Cc0 route) {
        this.f۱۵۷۷۷b = connectionPool;
        this.f۱۵۷۷۸c = route;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f A[Catch:{ IOException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۸۷۰۸a(int r17, int r18, int r19, int r20, boolean r21, p۱۳۹e.AbstractCe r22, p۱۳۹e.AbstractCp r23) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc.m۱۸۷۰۸a(int, int, int, int, boolean, e.e, e.p):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۰۰a(int connectTimeout, int readTimeout, int writeTimeout, p۱۳۹e.AbstractCe call, AbstractCp eventListener) {
        Cy tunnelRequest = m۱۸۷۰۵e();
        Cs url = tunnelRequest.m۱۹۳۲۹g();
        for (int i = 0; i < 21; i++) {
            m۱۸۷۰۱a(connectTimeout, readTimeout, call, eventListener);
            tunnelRequest = m۱۸۶۹۹a(readTimeout, writeTimeout, tunnelRequest, url);
            if (tunnelRequest != null) {
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۲a(this.f۱۵۷۷۹d);
                this.f۱۵۷۷۹d = null;
                this.f۱۵۷۸۵j = null;
                this.f۱۵۷۸۴i = null;
                eventListener.m۱۹۱۸۰a(call, this.f۱۵۷۷۸c.m۱۸۵۷۱d(), this.f۱۵۷۷۸c.m۱۸۵۶۹b(), null);
            } else {
                return;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۰۱a(int connectTimeout, int readTimeout, p۱۳۹e.AbstractCe call, AbstractCp eventListener) {
        Socket socket;
        Proxy proxy = this.f۱۵۷۷۸c.m۱۸۵۶۹b();
        Ca address = this.f۱۵۷۷۸c.m۱۸۵۶۸a();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = address.m۱۸۴۹۹i().createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f۱۵۷۷۹d = socket;
        eventListener.m۱۹۱۷۹a(call, this.f۱۵۷۷۸c.m۱۸۵۷۱d(), proxy);
        this.f۱۵۷۷۹d.setSoTimeout(readTimeout);
        try {
            Cf.m۱۹۰۸۶d().m۱۹۰۹۳a(this.f۱۵۷۷۹d, this.f۱۵۷۷۸c.m۱۸۵۷۱d(), connectTimeout);
            try {
                this.f۱۵۷۸۴i = Cl.m۱۹۴۸۰a(Cl.m۱۹۴۹۰b(this.f۱۵۷۷۹d));
                this.f۱۵۷۸۵j = Cl.m۱۹۴۷۹a(Cl.m۱۹۴۸۵a(this.f۱۵۷۷۹d));
            } catch (NullPointerException npe) {
                if ("throw with null exception".equals(npe.getMessage())) {
                    throw new IOException(npe);
                }
            }
        } catch (ConnectException e) {
            ConnectException ce = new ConnectException("Failed to connect to " + this.f۱۵۷۷۸c.m۱۸۵۷۱d());
            ce.initCause(e);
            throw ce;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۰۳a(Cb connectionSpecSelector, int pingIntervalMillis, p۱۳۹e.AbstractCe call, AbstractCp eventListener) {
        if (this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۰j() == null) {
            this.f۱۵۷۸۲g = EnumCw.HTTP_1_1;
            this.f۱۵۷۸۰e = this.f۱۵۷۷۹d;
            return;
        }
        eventListener.m۱۹۱۸۹g(call);
        m۱۸۷۰۲a(connectionSpecSelector);
        eventListener.m۱۹۱۷۴a(call, this.f۱۵۷۸۱f);
        if (this.f۱۵۷۸۲g == EnumCw.HTTP_2) {
            this.f۱۵۷۸۰e.setSoTimeout(0);
            Cg.Cg gVar = new Cg.Cg(true);
            gVar.m۱۸۹۱۱a(this.f۱۵۷۸۰e, this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k().m۱۹۲۳۴g(), this.f۱۵۷۸۴i, this.f۱۵۷۸۵j);
            gVar.m۱۸۹۱۰a(this);
            gVar.m۱۸۹۰۹a(pingIntervalMillis);
            this.f۱۵۷۸۳h = gVar.m۱۸۹۱۲a();
            this.f۱۵۷۸۳h.m۱۸۹۰۲n();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۰۲a(Cb connectionSpecSelector) {
        String maybeProtocol;
        EnumCw wVar;
        Ca address = this.f۱۵۷۷۸c.m۱۸۵۶۸a();
        try {
            SSLSocket sslSocket = (SSLSocket) address.m۱۸۵۰۰j().createSocket(this.f۱۵۷۷۹d, address.m۱۸۵۰۱k().m۱۹۲۳۴g(), address.m۱۸۵۰۱k().m۱۹۲۳۷j(), true);
            Ck connectionSpec = connectionSpecSelector.m۱۸۶۹۷a(sslSocket);
            if (connectionSpec.m۱۹۱۳۶c()) {
                Cf.m۱۹۰۸۶d().m۱۹۰۹۵a(sslSocket, address.m۱۸۵۰۱k().m۱۹۲۳۴g(), address.m۱۸۴۹۵e());
            }
            sslSocket.startHandshake();
            SSLSession sslSocketSession = sslSocket.getSession();
            if (m۱۸۷۰۴a(sslSocketSession)) {
                Cq unverifiedHandshake = Cq.m۱۹۱۹۳a(sslSocketSession);
                if (address.m۱۸۴۹۴d().verify(address.m۱۸۵۰۱k().m۱۹۲۳۴g(), sslSocketSession)) {
                    address.m۱۸۴۹۰a().m۱۹۱۱۷a(address.m۱۸۵۰۱k().m۱۹۲۳۴g(), unverifiedHandshake.m۱۹۱۹۶c());
                    if (connectionSpec.m۱۹۱۳۶c()) {
                        maybeProtocol = Cf.m۱۹۰۸۶d().m۱۹۰۹۷b(sslSocket);
                    } else {
                        maybeProtocol = null;
                    }
                    this.f۱۵۷۸۰e = sslSocket;
                    this.f۱۵۷۸۴i = Cl.m۱۹۴۸۰a(Cl.m۱۹۴۹۰b(this.f۱۵۷۸۰e));
                    this.f۱۵۷۸۵j = Cl.m۱۹۴۷۹a(Cl.m۱۹۴۸۵a(this.f۱۵۷۸۰e));
                    this.f۱۵۷۸۱f = unverifiedHandshake;
                    if (maybeProtocol != null) {
                        wVar = EnumCw.m۱۹۳۰۹a(maybeProtocol);
                    } else {
                        wVar = EnumCw.HTTP_1_1;
                    }
                    this.f۱۵۷۸۲g = wVar;
                    if (sslSocket != null) {
                        Cf.m۱۹۰۸۶d().m۱۹۰۹۴a(sslSocket);
                    }
                    if (1 == 0) {
                        p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۲a((Socket) sslSocket);
                        return;
                    }
                    return;
                }
                X509Certificate cert = (X509Certificate) unverifiedHandshake.m۱۹۱۹۶c().get(0);
                throw new SSLPeerUnverifiedException("Hostname " + address.m۱۸۵۰۱k().m۱۹۲۳۴g() + " not verified:\n    certificate: " + p۱۳۹e.Cg.m۱۹۱۱۳a((Certificate) cert) + "\n    DN: " + cert.getSubjectDN().getName() + "\n    subjectAltNames: " + Cd.m۱۹۱۰۵a(cert));
            }
            throw new IOException("a valid ssl session was not established");
        } catch (AssertionError e) {
            if (p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۴a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th) {
            if (0 != 0) {
                Cf.m۱۹۰۸۶d().m۱۹۰۹۴a((SSLSocket) null);
            }
            if (0 == 0) {
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۲a((Socket) null);
            }
            throw th;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۷۰۴a(SSLSession sslSocketSession) {
        return !"NONE".equals(sslSocketSession.getProtocol()) && !"SSL_NULL_WITH_NULL_NULL".equals(sslSocketSession.getCipherSuite());
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cy m۱۸۶۹۹a(int readTimeout, int writeTimeout, Cy tunnelRequest, Cs url) {
        Ca0 response;
        String requestLine = "CONNECT " + p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۲a(url, true) + " HTTP/1.1";
        do {
            p۱۳۹e.p۱۴۰f0.p۱۴۴h.Ca tunnelConnection = new p۱۳۹e.p۱۴۰f0.p۱۴۴h.Ca(null, null, this.f۱۵۷۸۴i, this.f۱۵۷۸۵j);
            this.f۱۵۷۸۴i.m۱۹۵۵۵b().m۱۹۵۵۸a((long) readTimeout, TimeUnit.MILLISECONDS);
            this.f۱۵۷۸۵j.m۱۹۵۵۳b().m۱۹۵۵۸a((long) writeTimeout, TimeUnit.MILLISECONDS);
            tunnelConnection.m۱۸۸۱۶a(tunnelRequest.m۱۹۳۲۵c(), requestLine);
            tunnelConnection.m۱۸۸۱۵a();
            Ca0.Ca a = tunnelConnection.m۱۸۸۱۰a(false);
            a.m۱۸۵۲۸a(tunnelRequest);
            response = a.m۱۸۵۳۱a();
            long contentLength = Ce.m۱۸۷۶۵a(response);
            if (contentLength == -1) {
                contentLength = 0;
            }
            AbstractCs body = tunnelConnection.m۱۸۸۱۹b(contentLength);
            p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۳۰b(body, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            body.close();
            int o = response.m۱۸۵۰۷o();
            if (o != 200) {
                if (o == 407) {
                    tunnelRequest = this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۴۹۷g().m۱۸۵۳۵a(this.f۱۵۷۷۸c, response);
                    if (tunnelRequest == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + response.m۱۸۵۰۷o());
                }
            } else if (this.f۱۵۷۸۴i.m۱۹۴۱۸a().m۱۹۴۰۳i() && this.f۱۵۷۸۵j.m۱۹۴۱۲a().m۱۹۴۰۳i()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } while (!"close".equalsIgnoreCase(response.m۱۸۵۰۳b("Connection")));
        return tunnelRequest;
    }

    /* renamed from: e  reason: contains not printable characters */
    private Cy m۱۸۷۰۵e() {
        Cy.Ca aVar = new Cy.Ca();
        aVar.m۱۹۳۳۲a(this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k());
        aVar.m۱۹۳۳۵a("Host", p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۲a(this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k(), true));
        aVar.m۱۹۳۳۵a("Proxy-Connection", "Keep-Alive");
        aVar.m۱۹۳۳۵a("User-Agent", p۱۳۹e.p۱۴۰f0.Cd.m۱۸۶۳۸a());
        return aVar.m۱۹۳۳۶a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۷۱۱a(Ca address, Cc0 route) {
        if (this.f۱۵۷۸۹n.size() >= this.f۱۵۷۸۸m || this.f۱۵۷۸۶k || !AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۳a(this.f۱۵۷۷۸c.m۱۸۵۶۸a(), address)) {
            return false;
        }
        if (address.m۱۸۵۰۱k().m۱۹۲۳۴g().equals(m۱۸۷۱۵c().m۱۸۵۶۸a().m۱۸۵۰۱k().m۱۹۲۳۴g())) {
            return true;
        }
        if (this.f۱۵۷۸۳h == null || route == null || route.m۱۸۵۶۹b().type() != Proxy.Type.DIRECT || this.f۱۵۷۷۸c.m۱۸۵۶۹b().type() != Proxy.Type.DIRECT || !this.f۱۵۷۷۸c.m۱۸۵۷۱d().equals(route.m۱۸۵۷۱d()) || route.m۱۸۵۶۸a().m۱۸۴۹۴d() != Cd.f۱۶۰۷۴a || !m۱۸۷۱۲a(address.m۱۸۵۰۱k())) {
            return false;
        }
        try {
            address.m۱۸۴۹۰a().m۱۹۱۱۷a(address.m۱۸۵۰۱k().m۱۹۲۳۴g(), m۱۸۷۰۷a().m۱۹۱۹۶c());
            return true;
        } catch (SSLPeerUnverifiedException e) {
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۷۱۲a(Cs url) {
        if (url.m۱۹۲۳۷j() != this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k().m۱۹۲۳۷j()) {
            return false;
        }
        if (url.m۱۹۲۳۴g().equals(this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k().m۱۹۲۳۴g())) {
            return true;
        }
        if (this.f۱۵۷۸۱f == null || !Cd.f۱۶۰۷۴a.m۱۹۱۱۰a(url.m۱۹۲۳۴g(), (X509Certificate) this.f۱۵۷۸۱f.m۱۹۱۹۶c().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۸۷۰۶a(Cv client, AbstractCt.AbstractCa chain, Cg streamAllocation) {
        Cg gVar = this.f۱۵۷۸۳h;
        if (gVar != null) {
            return new p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cf(client, chain, streamAllocation, gVar);
        }
        this.f۱۵۷۸۰e.setSoTimeout(chain.m۱۹۲۶۷d());
        this.f۱۵۷۸۴i.m۱۹۵۵۵b().m۱۹۵۵۸a((long) chain.m۱۹۲۶۷d(), TimeUnit.MILLISECONDS);
        this.f۱۵۷۸۵j.m۱۹۵۵۳b().m۱۹۵۵۸a((long) chain.m۱۹۲۶۳a(), TimeUnit.MILLISECONDS);
        return new p۱۳۹e.p۱۴۰f0.p۱۴۴h.Ca(client, streamAllocation, this.f۱۵۷۸۴i, this.f۱۵۷۸۵j);
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cc0 m۱۸۷۱۵c() {
        return this.f۱۵۷۷۸c;
    }

    /* renamed from: d  reason: contains not printable characters */
    public Socket m۱۸۷۱۶d() {
        return this.f۱۵۷۸۰e;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۷۱۳a(boolean doExtensiveChecks) {
        if (this.f۱۵۷۸۰e.isClosed() || this.f۱۵۷۸۰e.isInputShutdown() || this.f۱۵۷۸۰e.isOutputShutdown()) {
            return false;
        }
        Cg gVar = this.f۱۵۷۸۳h;
        if (gVar != null) {
            return !gVar.m۱۸۹۰۰l();
        }
        if (doExtensiveChecks) {
            try {
                int readTimeout = this.f۱۵۷۸۰e.getSoTimeout();
                try {
                    this.f۱۵۷۸۰e.setSoTimeout(1);
                    if (this.f۱۵۷۸۴i.m۱۹۴۲۹i()) {
                        this.f۱۵۷۸۰e.setSoTimeout(readTimeout);
                        return false;
                    }
                    this.f۱۵۷۸۰e.setSoTimeout(readTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f۱۵۷۸۰e.setSoTimeout(readTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException e) {
            } catch (IOException e2) {
                return false;
            }
        }
        return true;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cg.AbstractCh
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۱۰a(Ci stream) {
        stream.m۱۸۹۶۳a(EnumCb.REFUSED_STREAM);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cg.AbstractCh
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۰۹a(Cg connection) {
        synchronized (this.f۱۵۷۷۷b) {
            this.f۱۵۷۸۸m = connection.m۱۸۹۰۱m();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cq m۱۸۷۰۷a() {
        return this.f۱۵۷۸۱f;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۷۱۴b() {
        return this.f۱۵۷۸۳h != null;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k().m۱۹۲۳۴g());
        sb.append(":");
        sb.append(this.f۱۵۷۷۸c.m۱۸۵۶۸a().m۱۸۵۰۱k().m۱۹۲۳۷j());
        sb.append(", proxy=");
        sb.append(this.f۱۵۷۷۸c.m۱۸۵۶۹b());
        sb.append(" hostAddress=");
        sb.append(this.f۱۵۷۷۸c.m۱۸۵۷۱d());
        sb.append(" cipherSuite=");
        Cq qVar = this.f۱۵۷۸۱f;
        if (qVar != null) {
            obj = qVar.m۱۹۱۹۴a();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f۱۵۷۸۲g);
        sb.append('}');
        return sb.toString();
    }
}
