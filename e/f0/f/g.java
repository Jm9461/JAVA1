package e.f0.f;

import e.c0;
import e.e;
import e.f0.f.f;
import e.f0.g.c;
import e.f0.i.b;
import e.f0.i.n;
import e.i;
import e.j;
import e.p;
import e.t;
import e.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Route;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e.a f۳۸۱۷a;

    /* renamed from: b  reason: collision with root package name */
    private f.a f۳۸۱۸b;

    /* renamed from: c  reason: collision with root package name */
    private c0 f۳۸۱۹c;

    /* renamed from: d  reason: collision with root package name */
    private final j f۳۸۲۰d;

    /* renamed from: e  reason: collision with root package name */
    public final e f۳۸۲۱e;

    /* renamed from: f  reason: collision with root package name */
    public final p f۳۸۲۲f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f۳۸۲۳g;

    /* renamed from: h  reason: collision with root package name */
    private final f f۳۸۲۴h;
    private int i;
    private c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private c n;

    public g(j connectionPool, e.a address, e call, p eventListener, Object callStackTrace) {
        this.f۳۸۲۰d = connectionPool;
        this.f۳۸۱۷a = address;
        this.f۳۸۲۱e = call;
        this.f۳۸۲۲f = eventListener;
        this.f۳۸۲۴h = new f(address, h(), call, eventListener);
        this.f۳۸۲۳g = callStackTrace;
    }

    public c a(v client, t.a chain, boolean doExtensiveHealthChecks) {
        try {
            c resultCodec = a(chain.c(), chain.d(), chain.a(), client.r(), client.x(), doExtensiveHealthChecks).a(client, chain, this);
            synchronized (this.f۳۸۲۰d) {
                this.n = resultCodec;
            }
            return resultCodec;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.a(r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e.f0.f.c a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            e.f0.f.c r0 = r3.a(r4, r5, r6, r7, r8)
            e.j r1 = r3.f۳۸۲۰d
            monitor-enter(r1)
            int r2 = r0.l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.a(r9)
            if (r1 != 0) goto L_0x0018
            r3.d()
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
        throw new UnsupportedOperationException("Method not decompiled: e.f0.f.g.a(int, int, int, int, boolean, boolean):e.f0.f.c");
    }

    private c a(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) {
        Socket toClose;
        i releasedConnection;
        boolean newRouteSelection;
        f.a aVar;
        boolean foundPooledConnection = false;
        c result = null;
        c0 selectedRoute = null;
        synchronized (this.f۳۸۲۰d) {
            if (this.l) {
                throw new IllegalStateException("released");
            } else if (this.n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.m) {
                i releasedConnection2 = this.j;
                toClose = g();
                if (this.j != null) {
                    result = this.j;
                    releasedConnection2 = null;
                }
                if (!this.k) {
                    releasedConnection = null;
                } else {
                    releasedConnection = releasedConnection2;
                }
                if (result == null) {
                    e.f0.a.f۳۷۴۰a.a(this.f۳۸۲۰d, this.f۳۸۱۷a, this, null);
                    if (this.j != null) {
                        foundPooledConnection = true;
                        result = this.j;
                    } else {
                        selectedRoute = this.f۳۸۱۹c;
                    }
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        e.f0.c.a(toClose);
        if (releasedConnection != null) {
            this.f۳۸۲۲f.b(this.f۳۸۲۱e, releasedConnection);
        }
        if (foundPooledConnection) {
            this.f۳۸۲۲f.a(this.f۳۸۲۱e, result);
        }
        if (result != null) {
            return result;
        }
        if (selectedRoute != null || ((aVar = this.f۳۸۱۸b) != null && aVar.b())) {
            newRouteSelection = false;
        } else {
            this.f۳۸۱۸b = this.f۳۸۲۴h.b();
            newRouteSelection = true;
        }
        synchronized (this.f۳۸۲۰d) {
            if (!this.m) {
                if (newRouteSelection) {
                    List<Route> routes = this.f۳۸۱۸b.a();
                    int i2 = 0;
                    int size = routes.size();
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        c0 route = (c0) routes.get(i2);
                        e.f0.a.f۳۷۴۰a.a(this.f۳۸۲۰d, this.f۳۸۱۷a, this, route);
                        if (this.j != null) {
                            foundPooledConnection = true;
                            result = this.j;
                            this.f۳۸۱۹c = route;
                            break;
                        }
                        i2++;
                    }
                }
                if (!foundPooledConnection) {
                    if (selectedRoute == null) {
                        selectedRoute = this.f۳۸۱۸b.c();
                    }
                    this.f۳۸۱۹c = selectedRoute;
                    this.i = 0;
                    result = new c(this.f۳۸۲۰d, selectedRoute);
                    a(result, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (foundPooledConnection) {
            this.f۳۸۲۲f.a(this.f۳۸۲۱e, result);
            return result;
        }
        result.a(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.f۳۸۲۱e, this.f۳۸۲۲f);
        h().a(result.c());
        Socket socket = null;
        synchronized (this.f۳۸۲۰d) {
            this.k = true;
            e.f0.a.f۳۷۴۰a.b(this.f۳۸۲۰d, result);
            if (result.b()) {
                socket = e.f0.a.f۳۷۴۰a.a(this.f۳۸۲۰d, this.f۳۸۱۷a, this);
                result = this.j;
            }
        }
        e.f0.c.a(socket);
        this.f۳۸۲۲f.a(this.f۳۸۲۱e, result);
        return result;
    }

    private Socket g() {
        c allocatedConnection = this.j;
        if (allocatedConnection == null || !allocatedConnection.k) {
            return null;
        }
        return a(false, false, true);
    }

    public void a(boolean noNewStreams, c codec, long bytesRead, IOException e2) {
        i releasedConnection;
        Socket socket;
        boolean callEnd;
        this.f۳۸۲۲f.b(this.f۳۸۲۱e, bytesRead);
        synchronized (this.f۳۸۲۰d) {
            if (codec != null) {
                if (codec == this.n) {
                    if (!noNewStreams) {
                        this.j.l++;
                    }
                    releasedConnection = this.j;
                    socket = a(noNewStreams, false, true);
                    if (this.j != null) {
                        releasedConnection = null;
                    }
                    callEnd = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + codec);
        }
        e.f0.c.a(socket);
        if (releasedConnection != null) {
            this.f۳۸۲۲f.b(this.f۳۸۲۱e, releasedConnection);
        }
        if (e2 != null) {
            this.f۳۸۲۲f.a(this.f۳۸۲۱e, e2);
        } else if (callEnd) {
            this.f۳۸۲۲f.a(this.f۳۸۲۱e);
        }
    }

    public c a() {
        c cVar;
        synchronized (this.f۳۸۲۰d) {
            cVar = this.n;
        }
        return cVar;
    }

    private d h() {
        return e.f0.a.f۳۷۴۰a.a(this.f۳۸۲۰d);
    }

    public c0 f() {
        return this.f۳۸۱۹c;
    }

    public synchronized c b() {
        return this.j;
    }

    public void e() {
        i releasedConnection;
        Socket socket;
        synchronized (this.f۳۸۲۰d) {
            releasedConnection = this.j;
            socket = a(false, true, false);
            if (this.j != null) {
                releasedConnection = null;
            }
        }
        e.f0.c.a(socket);
        if (releasedConnection != null) {
            this.f۳۸۲۲f.b(this.f۳۸۲۱e, releasedConnection);
        }
    }

    public void d() {
        i releasedConnection;
        Socket socket;
        synchronized (this.f۳۸۲۰d) {
            releasedConnection = this.j;
            socket = a(true, false, false);
            if (this.j != null) {
                releasedConnection = null;
            }
        }
        e.f0.c.a(socket);
        if (releasedConnection != null) {
            this.f۳۸۲۲f.b(this.f۳۸۲۱e, releasedConnection);
        }
    }

    private Socket a(boolean noNewStreams, boolean released, boolean streamFinished) {
        if (streamFinished) {
            this.n = null;
        }
        if (released) {
            this.l = true;
        }
        Socket socket = null;
        c cVar = this.j;
        if (cVar != null) {
            if (noNewStreams) {
                cVar.k = true;
            }
            if (this.n == null && (this.l || this.j.k)) {
                b(this.j);
                if (this.j.n.isEmpty()) {
                    this.j.o = System.nanoTime();
                    if (e.f0.a.f۳۷۴۰a.a(this.f۳۸۲۰d, this.j)) {
                        socket = this.j.d();
                    }
                }
                this.j = null;
            }
        }
        return socket;
    }

    public void a(IOException e2) {
        i releasedConnection;
        Socket socket;
        boolean noNewStreams = false;
        synchronized (this.f۳۸۲۰d) {
            if (e2 instanceof n) {
                n streamResetException = (n) e2;
                if (streamResetException.f۴۰۰۹c == b.REFUSED_STREAM) {
                    this.i++;
                }
                if (streamResetException.f۴۰۰۹c != b.REFUSED_STREAM || this.i > 1) {
                    noNewStreams = true;
                    this.f۳۸۱۹c = null;
                }
            } else if (this.j != null) {
                if (!this.j.b() || (e2 instanceof e.f0.i.a)) {
                    noNewStreams = true;
                    if (this.j.l == 0) {
                        if (!(this.f۳۸۱۹c == null || e2 == null)) {
                            this.f۳۸۲۴h.a(this.f۳۸۱۹c, e2);
                        }
                        this.f۳۸۱۹c = null;
                    }
                }
                releasedConnection = this.j;
                socket = a(noNewStreams, false, true);
                if (this.j != null || !this.k) {
                    releasedConnection = null;
                }
            }
            releasedConnection = this.j;
            socket = a(noNewStreams, false, true);
            releasedConnection = null;
        }
        e.f0.c.a(socket);
        if (releasedConnection != null) {
            this.f۳۸۲۲f.b(this.f۳۸۲۱e, releasedConnection);
        }
    }

    public void a(c connection, boolean reportedAcquired) {
        if (this.j == null) {
            this.j = connection;
            this.k = reportedAcquired;
            connection.n.add(new a(this, this.f۳۸۲۳g));
            return;
        }
        throw new IllegalStateException();
    }

    private void b(c connection) {
        int size = connection.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (connection.n.get(i2).get() == this) {
                connection.n.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public Socket a(c newConnection) {
        if (this.n == null && this.j.n.size() == 1) {
            Socket socket = a(true, false, false);
            this.j = newConnection;
            newConnection.n.add(this.j.n.get(0));
            return socket;
        }
        throw new IllegalStateException();
    }

    public boolean c() {
        f.a aVar;
        return this.f۳۸۱۹c != null || ((aVar = this.f۳۸۱۸b) != null && aVar.b()) || this.f۳۸۲۴h.a();
    }

    public String toString() {
        c connection = b();
        return connection != null ? connection.toString() : this.f۳۸۱۷a.toString();
    }

    public static final class a extends WeakReference<g> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f۳۸۲۵a;

        a(g referent, Object callStackTrace) {
            super(referent);
            this.f۳۸۲۵a = callStackTrace;
        }
    }
}
