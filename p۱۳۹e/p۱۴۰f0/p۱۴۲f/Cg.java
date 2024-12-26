package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Route;
import p۱۳۹e.AbstractCe;
import p۱۳۹e.AbstractCi;
import p۱۳۹e.AbstractCp;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.Cc0;
import p۱۳۹e.Cj;
import p۱۳۹e.Cv;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cf;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cn;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.EnumCb;

/* renamed from: e.f0.f.g  reason: invalid class name */
public final class Cg {

    /* renamed from: a  reason: contains not printable characters */
    public final p۱۳۹e.Ca f۱۵۸۰۴a;

    /* renamed from: b  reason: contains not printable characters */
    private Cf.Ca f۱۵۸۰۵b;

    /* renamed from: c  reason: contains not printable characters */
    private Cc0 f۱۵۸۰۶c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cj f۱۵۸۰۷d;

    /* renamed from: e  reason: contains not printable characters */
    public final AbstractCe f۱۵۸۰۸e;

    /* renamed from: f  reason: contains not printable characters */
    public final AbstractCp f۱۵۸۰۹f;

    /* renamed from: g  reason: contains not printable characters */
    private final Object f۱۵۸۱۰g;

    /* renamed from: h  reason: contains not printable characters */
    private final Cf f۱۵۸۱۱h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۸۱۲i;

    /* renamed from: j  reason: contains not printable characters */
    private Cc f۱۵۸۱۳j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۵۸۱۴k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۵۸۱۵l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۵۸۱۶m;

    /* renamed from: n  reason: contains not printable characters */
    private AbstractCc f۱۵۸۱۷n;

    public Cg(Cj connectionPool, p۱۳۹e.Ca address, AbstractCe call, AbstractCp eventListener, Object callStackTrace) {
        this.f۱۵۸۰۷d = connectionPool;
        this.f۱۵۸۰۴a = address;
        this.f۱۵۸۰۸e = call;
        this.f۱۵۸۰۹f = eventListener;
        this.f۱۵۸۱۱h = new Cf(address, m۱۸۷۳۹h(), call, eventListener);
        this.f۱۵۸۱۰g = callStackTrace;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۸۷۴۱a(Cv client, AbstractCt.AbstractCa chain, boolean doExtensiveHealthChecks) {
        try {
            AbstractCc resultCodec = m۱۸۷۳۵a(chain.m۱۹۲۶۶c(), chain.m۱۹۲۶۷d(), chain.m۱۹۲۶۳a(), client.m۱۹۲۸۸r(), client.m۱۹۲۹۴x(), doExtensiveHealthChecks).m۱۸۷۰۶a(client, chain, this);
            synchronized (this.f۱۵۸۰۷d) {
                this.f۱۵۸۱۷n = resultCodec;
            }
            return resultCodec;
        } catch (IOException e) {
            throw new Ce(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.m۱۸۷۱۳a(r9) != false) goto L_0x0018;
     */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc m۱۸۷۳۵a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            e.f0.f.c r0 = r3.m۱۸۷۳۴a(r4, r5, r6, r7, r8)
            e.j r1 = r3.f۱۵۸۰۷d
            monitor-enter(r1)
            int r2 = r0.f۱۵۷۸۷l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.m۱۸۷۱۳a(r9)
            if (r1 != 0) goto L_0x0018
            r3.m۱۸۷۴۸d()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x001d
        L_0x001c:
            throw r2
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg.m۱۸۷۳۵a(int, int, int, int, boolean, boolean):e.f0.f.c");
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cc m۱۸۷۳۴a(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) {
        Socket toClose;
        AbstractCi releasedConnection;
        boolean newRouteSelection;
        Cf.Ca aVar;
        boolean foundPooledConnection = false;
        Cc result = null;
        Cc0 selectedRoute = null;
        synchronized (this.f۱۵۸۰۷d) {
            if (this.f۱۵۸۱۵l) {
                throw new IllegalStateException("released");
            } else if (this.f۱۵۸۱۷n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f۱۵۸۱۶m) {
                AbstractCi releasedConnection2 = this.f۱۵۸۱۳j;
                toClose = m۱۸۷۳۸g();
                if (this.f۱۵۸۱۳j != null) {
                    result = this.f۱۵۸۱۳j;
                    releasedConnection2 = null;
                }
                if (!this.f۱۵۸۱۴k) {
                    releasedConnection = null;
                } else {
                    releasedConnection = releasedConnection2;
                }
                if (result == null) {
                    AbstractCa.f۱۵۷۰۱a.m۱۸۵۹۷a(this.f۱۵۸۰۷d, this.f۱۵۸۰۴a, this, null);
                    if (this.f۱۵۸۱۳j != null) {
                        foundPooledConnection = true;
                        result = this.f۱۵۸۱۳j;
                    } else {
                        selectedRoute = this.f۱۵۸۰۶c;
                    }
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        Cc.m۱۸۶۲۲a(toClose);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۹۱۸۴b(this.f۱۵۸۰۸e, releasedConnection);
        }
        if (foundPooledConnection) {
            this.f۱۵۸۰۹f.m۱۹۱۷۳a(this.f۱۵۸۰۸e, result);
        }
        if (result != null) {
            return result;
        }
        if (selectedRoute != null || ((aVar = this.f۱۵۸۰۵b) != null && aVar.m۱۸۷۳۲b())) {
            newRouteSelection = false;
        } else {
            this.f۱۵۸۰۵b = this.f۱۵۸۱۱h.m۱۸۷۳۰b();
            newRouteSelection = true;
        }
        synchronized (this.f۱۵۸۰۷d) {
            if (!this.f۱۵۸۱۶m) {
                if (newRouteSelection) {
                    List<Route> routes = this.f۱۵۸۰۵b.m۱۸۷۳۱a();
                    int i = 0;
                    int size = routes.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Cc0 route = (Cc0) routes.get(i);
                        AbstractCa.f۱۵۷۰۱a.m۱۸۵۹۷a(this.f۱۵۸۰۷d, this.f۱۵۸۰۴a, this, route);
                        if (this.f۱۵۸۱۳j != null) {
                            foundPooledConnection = true;
                            result = this.f۱۵۸۱۳j;
                            this.f۱۵۸۰۶c = route;
                            break;
                        }
                        i++;
                    }
                }
                if (!foundPooledConnection) {
                    if (selectedRoute == null) {
                        selectedRoute = this.f۱۵۸۰۵b.m۱۸۷۳۳c();
                    }
                    this.f۱۵۸۰۶c = selectedRoute;
                    this.f۱۵۸۱۲i = 0;
                    result = new Cc(this.f۱۵۸۰۷d, selectedRoute);
                    m۱۸۷۴۳a(result, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (foundPooledConnection) {
            this.f۱۵۸۰۹f.m۱۹۱۷۳a(this.f۱۵۸۰۸e, result);
            return result;
        }
        result.m۱۸۷۰۸a(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.f۱۵۸۰۸e, this.f۱۵۸۰۹f);
        m۱۸۷۳۹h().m۱۸۷۱۷a(result.m۱۸۷۱۵c());
        Socket socket = null;
        synchronized (this.f۱۵۸۰۷d) {
            this.f۱۵۸۱۴k = true;
            AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۵b(this.f۱۵۸۰۷d, result);
            if (result.m۱۸۷۱۴b()) {
                socket = AbstractCa.f۱۵۷۰۱a.m۱۸۵۹۹a(this.f۱۵۸۰۷d, this.f۱۵۸۰۴a, this);
                result = this.f۱۵۸۱۳j;
            }
        }
        Cc.m۱۸۶۲۲a(socket);
        this.f۱۵۸۰۹f.m۱۹۱۷۳a(this.f۱۵۸۰۸e, result);
        return result;
    }

    /* renamed from: g  reason: contains not printable characters */
    private Socket m۱۸۷۳۸g() {
        Cc allocatedConnection = this.f۱۵۸۱۳j;
        if (allocatedConnection == null || !allocatedConnection.f۱۵۷۸۶k) {
            return null;
        }
        return m۱۸۷۳۶a(false, false, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۴۵a(boolean noNewStreams, AbstractCc codec, long bytesRead, IOException e) {
        AbstractCi releasedConnection;
        Socket socket;
        boolean callEnd;
        this.f۱۵۸۰۹f.m۱۹۱۸۳b(this.f۱۵۸۰۸e, bytesRead);
        synchronized (this.f۱۵۸۰۷d) {
            if (codec != null) {
                if (codec == this.f۱۵۸۱۷n) {
                    if (!noNewStreams) {
                        this.f۱۵۸۱۳j.f۱۵۷۸۷l++;
                    }
                    releasedConnection = this.f۱۵۸۱۳j;
                    socket = m۱۸۷۳۶a(noNewStreams, false, true);
                    if (this.f۱۵۸۱۳j != null) {
                        releasedConnection = null;
                    }
                    callEnd = this.f۱۵۸۱۵l;
                }
            }
            throw new IllegalStateException("expected " + this.f۱۵۸۱۷n + " but was " + codec);
        }
        Cc.m۱۸۶۲۲a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۹۱۸۴b(this.f۱۵۸۰۸e, releasedConnection);
        }
        if (e != null) {
            this.f۱۵۸۰۹f.m۱۹۱۷۶a(this.f۱۵۸۰۸e, e);
        } else if (callEnd) {
            this.f۱۵۸۰۹f.m۱۹۱۷۰a(this.f۱۵۸۰۸e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۸۷۴۰a() {
        AbstractCc cVar;
        synchronized (this.f۱۵۸۰۷d) {
            cVar = this.f۱۵۸۱۷n;
        }
        return cVar;
    }

    /* renamed from: h  reason: contains not printable characters */
    private Cd m۱۸۷۳۹h() {
        return AbstractCa.f۱۵۷۰۱a.m۱۸۵۹۸a(this.f۱۵۸۰۷d);
    }

    /* renamed from: f  reason: contains not printable characters */
    public Cc0 m۱۸۷۵۰f() {
        return this.f۱۵۸۰۶c;
    }

    /* renamed from: b  reason: contains not printable characters */
    public synchronized Cc m۱۸۷۴۶b() {
        return this.f۱۵۸۱۳j;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۸۷۴۹e() {
        AbstractCi releasedConnection;
        Socket socket;
        synchronized (this.f۱۵۸۰۷d) {
            releasedConnection = this.f۱۵۸۱۳j;
            socket = m۱۸۷۳۶a(false, true, false);
            if (this.f۱۵۸۱۳j != null) {
                releasedConnection = null;
            }
        }
        Cc.m۱۸۶۲۲a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۹۱۸۴b(this.f۱۵۸۰۸e, releasedConnection);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۸۷۴۸d() {
        AbstractCi releasedConnection;
        Socket socket;
        synchronized (this.f۱۵۸۰۷d) {
            releasedConnection = this.f۱۵۸۱۳j;
            socket = m۱۸۷۳۶a(true, false, false);
            if (this.f۱۵۸۱۳j != null) {
                releasedConnection = null;
            }
        }
        Cc.m۱۸۶۲۲a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۹۱۸۴b(this.f۱۵۸۰۸e, releasedConnection);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Socket m۱۸۷۳۶a(boolean noNewStreams, boolean released, boolean streamFinished) {
        if (streamFinished) {
            this.f۱۵۸۱۷n = null;
        }
        if (released) {
            this.f۱۵۸۱۵l = true;
        }
        Socket socket = null;
        Cc cVar = this.f۱۵۸۱۳j;
        if (cVar != null) {
            if (noNewStreams) {
                cVar.f۱۵۷۸۶k = true;
            }
            if (this.f۱۵۸۱۷n == null && (this.f۱۵۸۱۵l || this.f۱۵۸۱۳j.f۱۵۷۸۶k)) {
                m۱۸۷۳۷b(this.f۱۵۸۱۳j);
                if (this.f۱۵۸۱۳j.f۱۵۷۸۹n.isEmpty()) {
                    this.f۱۵۸۱۳j.f۱۵۷۹۰o = System.nanoTime();
                    if (AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۴a(this.f۱۵۸۰۷d, this.f۱۵۸۱۳j)) {
                        socket = this.f۱۵۸۱۳j.m۱۸۷۱۶d();
                    }
                }
                this.f۱۵۸۱۳j = null;
            }
        }
        return socket;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۴۴a(IOException e) {
        AbstractCi releasedConnection;
        Socket socket;
        boolean noNewStreams = false;
        synchronized (this.f۱۵۸۰۷d) {
            if (e instanceof Cn) {
                Cn streamResetException = (Cn) e;
                if (streamResetException.f۱۶۰۴۳c == EnumCb.REFUSED_STREAM) {
                    this.f۱۵۸۱۲i++;
                }
                if (streamResetException.f۱۶۰۴۳c != EnumCb.REFUSED_STREAM || this.f۱۵۸۱۲i > 1) {
                    noNewStreams = true;
                    this.f۱۵۸۰۶c = null;
                }
            } else if (this.f۱۵۸۱۳j != null) {
                if (!this.f۱۵۸۱۳j.m۱۸۷۱۴b() || (e instanceof p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ca)) {
                    noNewStreams = true;
                    if (this.f۱۵۸۱۳j.f۱۵۷۸۷l == 0) {
                        if (!(this.f۱۵۸۰۶c == null || e == null)) {
                            this.f۱۵۸۱۱h.m۱۸۷۲۸a(this.f۱۵۸۰۶c, e);
                        }
                        this.f۱۵۸۰۶c = null;
                    }
                }
                releasedConnection = this.f۱۵۸۱۳j;
                socket = m۱۸۷۳۶a(noNewStreams, false, true);
                if (this.f۱۵۸۱۳j != null || !this.f۱۵۸۱۴k) {
                    releasedConnection = null;
                }
            }
            releasedConnection = this.f۱۵۸۱۳j;
            socket = m۱۸۷۳۶a(noNewStreams, false, true);
            releasedConnection = null;
        }
        Cc.m۱۸۶۲۲a(socket);
        if (releasedConnection != null) {
            this.f۱۵۸۰۹f.m۱۹۱۸۴b(this.f۱۵۸۰۸e, releasedConnection);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۴۳a(Cc connection, boolean reportedAcquired) {
        if (this.f۱۵۸۱۳j == null) {
            this.f۱۵۸۱۳j = connection;
            this.f۱۵۸۱۴k = reportedAcquired;
            connection.f۱۵۷۸۹n.add(new Ca(this, this.f۱۵۸۱۰g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۷۳۷b(Cc connection) {
        int size = connection.f۱۵۷۸۹n.size();
        for (int i = 0; i < size; i++) {
            if (connection.f۱۵۷۸۹n.get(i).get() == this) {
                connection.f۱۵۷۸۹n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a  reason: contains not printable characters */
    public Socket m۱۸۷۴۲a(Cc newConnection) {
        if (this.f۱۵۸۱۷n == null && this.f۱۵۸۱۳j.f۱۵۷۸۹n.size() == 1) {
            Socket socket = m۱۸۷۳۶a(true, false, false);
            this.f۱۵۸۱۳j = newConnection;
            newConnection.f۱۵۷۸۹n.add(this.f۱۵۸۱۳j.f۱۵۷۸۹n.get(0));
            return socket;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۸۷۴۷c() {
        Cf.Ca aVar;
        return this.f۱۵۸۰۶c != null || ((aVar = this.f۱۵۸۰۵b) != null && aVar.m۱۸۷۳۲b()) || this.f۱۵۸۱۱h.m۱۸۷۲۹a();
    }

    public String toString() {
        Cc connection = m۱۸۷۴۶b();
        return connection != null ? connection.toString() : this.f۱۵۸۰۴a.toString();
    }

    /* renamed from: e.f0.f.g$a  reason: invalid class name */
    public static final class Ca extends WeakReference<Cg> {

        /* renamed from: a  reason: contains not printable characters */
        public final Object f۱۵۸۱۸a;

        Ca(Cg referent, Object callStackTrace) {
            super(referent);
            this.f۱۵۸۱۸a = callStackTrace;
        }
    }
}
