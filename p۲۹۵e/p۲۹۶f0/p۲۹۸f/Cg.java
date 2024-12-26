package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import p۲۹۵e.AbstractCp;
import p۲۹۵e.Ca;
import p۲۹۵e.Cc0;
import p۲۹۵e.Cj;
import p۲۹۵e.Cv;
import p۲۹۵e.InterfaceCe;
import p۲۹۵e.InterfaceCi;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.AbstractCa;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cf;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cn;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.EnumCb;

/* renamed from: e.f0.f.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cg {

    /* renamed from: a, reason: contains not printable characters */
    public final Ca f۱۵۸۰۴a;

    /* renamed from: b, reason: contains not printable characters */
    private Cf.a f۱۵۸۰۵b;

    /* renamed from: c, reason: contains not printable characters */
    private Cc0 f۱۵۸۰۶c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cj f۱۵۸۰۷d;

    /* renamed from: e, reason: contains not printable characters */
    public final InterfaceCe f۱۵۸۰۸e;

    /* renamed from: f, reason: contains not printable characters */
    public final AbstractCp f۱۵۸۰۹f;

    /* renamed from: g, reason: contains not printable characters */
    private final Object f۱۵۸۱۰g;

    /* renamed from: h, reason: contains not printable characters */
    private final Cf f۱۵۸۱۱h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۵۸۱۲i;

    /* renamed from: j, reason: contains not printable characters */
    private Cc f۱۵۸۱۳j;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۵۸۱۴k;

    /* renamed from: l, reason: contains not printable characters */
    private boolean f۱۵۸۱۵l;

    /* renamed from: m, reason: contains not printable characters */
    private boolean f۱۵۸۱۶m;

    /* renamed from: n, reason: contains not printable characters */
    private InterfaceCc f۱۵۸۱۷n;

    public Cg(Cj connectionPool, Ca address, InterfaceCe call, AbstractCp eventListener, Object callStackTrace) {
        this.f۱۵۸۰۷d = connectionPool;
        this.f۱۵۸۰۴a = address;
        this.f۱۵۸۰۸e = call;
        this.f۱۵۸۰۹f = eventListener;
        this.f۱۵۸۱۱h = new Cf(address, m۱۶۶۶۰h(), call, eventListener);
        this.f۱۵۸۱۰g = callStackTrace;
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCc m۱۶۶۶۲a(Cv client, InterfaceCt.a chain, boolean doExtensiveHealthChecks) {
        int connectTimeout = chain.mo۱۷۱۸۷c();
        int readTimeout = chain.mo۱۷۱۸۸d();
        int writeTimeout = chain.mo۱۷۱۸۴a();
        int pingIntervalMillis = client.m۱۷۲۰۹r();
        boolean connectionRetryEnabled = client.m۱۷۲۱۵x();
        try {
            Cc resultConnection = m۱۶۶۵۶a(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, doExtensiveHealthChecks);
            InterfaceCc resultCodec = resultConnection.m۱۶۶۲۷a(client, chain, this);
            synchronized (this.f۱۵۸۰۷d) {
                this.f۱۵۸۱۷n = resultCodec;
            }
            return resultCodec;
        } catch (IOException e2) {
            throw new Ce(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cc m۱۶۶۵۶a(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) {
        while (true) {
            Cc candidate = m۱۶۶۵۵a(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            synchronized (this.f۱۵۸۰۷d) {
                if (candidate.f۱۵۷۸۷l == 0) {
                    return candidate;
                }
                if (!candidate.m۱۶۶۳۴a(doExtensiveHealthChecks)) {
                    m۱۶۶۶۹d();
                } else {
                    return candidate;
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cc m۱۶۶۵۵a(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) {
        Socket toClose;
        InterfaceCi releasedConnection;
        boolean newRouteSelection;
        Cf.a aVar;
        boolean foundPooledConnection = false;
        Cc result = null;
        Cc0 selectedRoute = null;
        synchronized (this.f۱۵۸۰۷d) {
            if (this.f۱۵۸۱۵l) {
                throw new IllegalStateException("released");
            }
            if (this.f۱۵۸۱۷n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f۱۵۸۱۶m) {
                throw new IOException("Canceled");
            }
            InterfaceCi releasedConnection2 = this.f۱۵۸۱۳j;
            toClose = m۱۶۶۵۹g();
            if (this.f۱۵۸۱۳j != null) {
                result = this.f۱۵۸۱۳j;
                releasedConnection2 = null;
            }
            if (this.f۱۵۸۱۴k) {
                releasedConnection = releasedConnection2;
            } else {
                releasedConnection = null;
            }
            if (result == null) {
                AbstractCa.f۱۵۷۰۱a.mo۱۷۲۱۹a(this.f۱۵۸۰۷d, this.f۱۵۸۰۴a, this, null);
                if (this.f۱۵۸۱۳j != null) {
                    foundPooledConnection = true;
                    result = this.f۱۵۸۱۳j;
                } else {
                    selectedRoute = this.f۱۵۸۰۶c;
                }
            }
        }
        Cc.m۱۶۵۴۳a(toClose);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۷۱۰۵b(this.f۱۵۸۰۸e, releasedConnection);
        }
        if (foundPooledConnection) {
            this.f۱۵۸۰۹f.m۱۷۰۹۴a(this.f۱۵۸۰۸e, result);
        }
        if (result != null) {
            return result;
        }
        if (selectedRoute == null && ((aVar = this.f۱۵۸۰۵b) == null || !aVar.m۱۶۶۵۳b())) {
            this.f۱۵۸۰۵b = this.f۱۵۸۱۱h.m۱۶۶۵۱b();
            newRouteSelection = true;
        } else {
            newRouteSelection = false;
        }
        synchronized (this.f۱۵۸۰۷d) {
            if (this.f۱۵۸۱۶m) {
                throw new IOException("Canceled");
            }
            if (newRouteSelection) {
                List<Cc0> list = this.f۱۵۸۰۵b.m۱۶۶۵۲a();
                int i = 0;
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Cc0 route = list.get(i);
                    AbstractCa.f۱۵۷۰۱a.mo۱۷۲۱۹a(this.f۱۵۸۰۷d, this.f۱۵۸۰۴a, this, route);
                    if (this.f۱۵۸۱۳j == null) {
                        i++;
                    } else {
                        foundPooledConnection = true;
                        result = this.f۱۵۸۱۳j;
                        this.f۱۵۸۰۶c = route;
                        break;
                    }
                }
            }
            if (!foundPooledConnection) {
                if (selectedRoute == null) {
                    selectedRoute = this.f۱۵۸۰۵b.m۱۶۶۵۴c();
                }
                this.f۱۵۸۰۶c = selectedRoute;
                this.f۱۵۸۱۲i = 0;
                result = new Cc(this.f۱۵۸۰۷d, selectedRoute);
                m۱۶۶۶۴a(result, false);
            }
        }
        if (foundPooledConnection) {
            this.f۱۵۸۰۹f.m۱۷۰۹۴a(this.f۱۵۸۰۸e, result);
            return result;
        }
        result.m۱۶۶۲۹a(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.f۱۵۸۰۸e, this.f۱۵۸۰۹f);
        m۱۶۶۶۰h().m۱۶۶۳۸a(result.m۱۶۶۳۶c());
        Socket socket = null;
        synchronized (this.f۱۵۸۰۷d) {
            this.f۱۵۸۱۴k = true;
            AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۷b(this.f۱۵۸۰۷d, result);
            if (result.m۱۶۶۳۵b()) {
                socket = AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۱a(this.f۱۵۸۰۷d, this.f۱۵۸۰۴a, this);
                result = this.f۱۵۸۱۳j;
            }
        }
        Cc.m۱۶۵۴۳a(socket);
        this.f۱۵۸۰۹f.m۱۷۰۹۴a(this.f۱۵۸۰۸e, result);
        return result;
    }

    /* renamed from: g, reason: contains not printable characters */
    private Socket m۱۶۶۵۹g() {
        Cc allocatedConnection = this.f۱۵۸۱۳j;
        if (allocatedConnection != null && allocatedConnection.f۱۵۷۸۶k) {
            return m۱۶۶۵۷a(false, false, true);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۶۶۶a(boolean noNewStreams, InterfaceCc codec, long bytesRead, IOException e2) {
        InterfaceCi releasedConnection;
        Socket socket;
        boolean callEnd;
        this.f۱۵۸۰۹f.m۱۷۱۰۴b(this.f۱۵۸۰۸e, bytesRead);
        synchronized (this.f۱۵۸۰۷d) {
            if (codec != null) {
                if (codec == this.f۱۵۸۱۷n) {
                    if (!noNewStreams) {
                        this.f۱۵۸۱۳j.f۱۵۷۸۷l++;
                    }
                    releasedConnection = this.f۱۵۸۱۳j;
                    socket = m۱۶۶۵۷a(noNewStreams, false, true);
                    if (this.f۱۵۸۱۳j != null) {
                        releasedConnection = null;
                    }
                    callEnd = this.f۱۵۸۱۵l;
                }
            }
            throw new IllegalStateException("expected " + this.f۱۵۸۱۷n + " but was " + codec);
        }
        Cc.m۱۶۵۴۳a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۷۱۰۵b(this.f۱۵۸۰۸e, releasedConnection);
        }
        if (e2 != null) {
            this.f۱۵۸۰۹f.m۱۷۰۹۷a(this.f۱۵۸۰۸e, e2);
        } else if (callEnd) {
            this.f۱۵۸۰۹f.m۱۷۰۹۱a(this.f۱۵۸۰۸e);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCc m۱۶۶۶۱a() {
        InterfaceCc interfaceCc;
        synchronized (this.f۱۵۸۰۷d) {
            interfaceCc = this.f۱۵۸۱۷n;
        }
        return interfaceCc;
    }

    /* renamed from: h, reason: contains not printable characters */
    private Cd m۱۶۶۶۰h() {
        return AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۰a(this.f۱۵۸۰۷d);
    }

    /* renamed from: f, reason: contains not printable characters */
    public Cc0 m۱۶۶۷۱f() {
        return this.f۱۵۸۰۶c;
    }

    /* renamed from: b, reason: contains not printable characters */
    public synchronized Cc m۱۶۶۶۷b() {
        return this.f۱۵۸۱۳j;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۶۶۷۰e() {
        InterfaceCi releasedConnection;
        Socket socket;
        synchronized (this.f۱۵۸۰۷d) {
            releasedConnection = this.f۱۵۸۱۳j;
            socket = m۱۶۶۵۷a(false, true, false);
            if (this.f۱۵۸۱۳j != null) {
                releasedConnection = null;
            }
        }
        Cc.m۱۶۵۴۳a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۷۱۰۵b(this.f۱۵۸۰۸e, releasedConnection);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۶۶۶۹d() {
        InterfaceCi releasedConnection;
        Socket socket;
        synchronized (this.f۱۵۸۰۷d) {
            releasedConnection = this.f۱۵۸۱۳j;
            socket = m۱۶۶۵۷a(true, false, false);
            if (this.f۱۵۸۱۳j != null) {
                releasedConnection = null;
            }
        }
        Cc.m۱۶۵۴۳a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۷۱۰۵b(this.f۱۵۸۰۸e, releasedConnection);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private Socket m۱۶۶۵۷a(boolean noNewStreams, boolean released, boolean streamFinished) {
        if (streamFinished) {
            this.f۱۵۸۱۷n = null;
        }
        if (released) {
            this.f۱۵۸۱۵l = true;
        }
        Socket socket = null;
        Cc cc = this.f۱۵۸۱۳j;
        if (cc != null) {
            if (noNewStreams) {
                cc.f۱۵۷۸۶k = true;
            }
            if (this.f۱۵۸۱۷n == null && (this.f۱۵۸۱۵l || this.f۱۵۸۱۳j.f۱۵۷۸۶k)) {
                m۱۶۶۵۸b(this.f۱۵۸۱۳j);
                if (this.f۱۵۸۱۳j.f۱۵۷۸۹n.isEmpty()) {
                    this.f۱۵۸۱۳j.f۱۵۷۹۰o = System.nanoTime();
                    if (AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۶a(this.f۱۵۸۰۷d, this.f۱۵۸۱۳j)) {
                        socket = this.f۱۵۸۱۳j.m۱۶۶۳۷d();
                    }
                }
                this.f۱۵۸۱۳j = null;
            }
        }
        return socket;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۶۶۵a(IOException e2) {
        InterfaceCi releasedConnection;
        Socket socket;
        boolean noNewStreams = false;
        synchronized (this.f۱۵۸۰۷d) {
            if (e2 instanceof Cn) {
                Cn streamResetException = (Cn) e2;
                if (streamResetException.f۱۶۰۴۳c == EnumCb.REFUSED_STREAM) {
                    this.f۱۵۸۱۲i++;
                }
                if (streamResetException.f۱۶۰۴۳c != EnumCb.REFUSED_STREAM || this.f۱۵۸۱۲i > 1) {
                    noNewStreams = true;
                    this.f۱۵۸۰۶c = null;
                }
            } else if (this.f۱۵۸۱۳j != null) {
                if (!this.f۱۵۸۱۳j.m۱۶۶۳۵b() || (e2 instanceof p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ca)) {
                    noNewStreams = true;
                    if (this.f۱۵۸۱۳j.f۱۵۷۸۷l == 0) {
                        if (this.f۱۵۸۰۶c != null && e2 != null) {
                            this.f۱۵۸۱۱h.m۱۶۶۴۹a(this.f۱۵۸۰۶c, e2);
                        }
                        this.f۱۵۸۰۶c = null;
                    }
                }
                releasedConnection = this.f۱۵۸۱۳j;
                socket = m۱۶۶۵۷a(noNewStreams, false, true);
                if (this.f۱۵۸۱۳j == null || !this.f۱۵۸۱۴k) {
                    releasedConnection = null;
                }
            }
            releasedConnection = this.f۱۵۸۱۳j;
            socket = m۱۶۶۵۷a(noNewStreams, false, true);
            if (this.f۱۵۸۱۳j == null) {
            }
            releasedConnection = null;
        }
        Cc.m۱۶۵۴۳a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۷۱۰۵b(this.f۱۵۸۰۸e, releasedConnection);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۶۶۴a(Cc connection, boolean reportedAcquired) {
        if (this.f۱۵۸۱۳j != null) {
            throw new IllegalStateException();
        }
        this.f۱۵۸۱۳j = connection;
        this.f۱۵۸۱۴k = reportedAcquired;
        connection.f۱۵۷۸۹n.add(new a(this, this.f۱۵۸۱۰g));
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۶۶۵۸b(Cc connection) {
        int size = connection.f۱۵۷۸۹n.size();
        for (int i = 0; i < size; i++) {
            if (connection.f۱۵۷۸۹n.get(i).get() == this) {
                connection.f۱۵۷۸۹n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a, reason: contains not printable characters */
    public Socket m۱۶۶۶۳a(Cc newConnection) {
        if (this.f۱۵۸۱۷n != null || this.f۱۵۸۱۳j.f۱۵۷۸۹n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<Cg> reference = this.f۱۵۸۱۳j.f۱۵۷۸۹n.get(0);
        Socket socket = m۱۶۶۵۷a(true, false, false);
        this.f۱۵۸۱۳j = newConnection;
        newConnection.f۱۵۷۸۹n.add(reference);
        return socket;
    }

    /* renamed from: c, reason: contains not printable characters */
    public boolean m۱۶۶۶۸c() {
        Cf.a aVar;
        return this.f۱۵۸۰۶c != null || ((aVar = this.f۱۵۸۰۵b) != null && aVar.m۱۶۶۵۳b()) || this.f۱۵۸۱۱h.m۱۶۶۵۰a();
    }

    public String toString() {
        Cc connection = m۱۶۶۶۷b();
        return connection != null ? connection.toString() : this.f۱۵۸۰۴a.toString();
    }

    /* renamed from: e.f0.f.g$a */
    public static final class a extends WeakReference<Cg> {

        /* renamed from: a, reason: contains not printable characters */
        public final Object f۱۵۸۱۸a;

        a(Cg referent, Object callStackTrace) {
            super(referent);
            this.f۱۵۸۱۸a = callStackTrace;
        }
    }
}
