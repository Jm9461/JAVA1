package e;

import e.f0.c;
import e.f0.f.d;
import e.f0.f.g;
import e.f0.k.f;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.StreamAllocation;

public final class j {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f۴۰۵۷g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.a("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    private final int f۴۰۵۸a;

    /* renamed from: b  reason: collision with root package name */
    private final long f۴۰۵۹b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f۴۰۶۰c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<e.f0.f.c> f۴۰۶۱d;

    /* renamed from: e  reason: collision with root package name */
    final d f۴۰۶۲e;

    /* renamed from: f  reason: collision with root package name */
    boolean f۴۰۶۳f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            while (true) {
                long waitNanos = j.this.a(System.nanoTime());
                if (waitNanos != -1) {
                    if (waitNanos > 0) {
                        long waitMillis = waitNanos / 1000000;
                        long waitNanos2 = waitNanos - (1000000 * waitMillis);
                        synchronized (j.this) {
                            try {
                                j.this.wait(waitMillis, (int) waitNanos2);
                            } catch (InterruptedException e2) {
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public j(int maxIdleConnections, long keepAliveDuration, TimeUnit timeUnit) {
        this.f۴۰۶۰c = new a();
        this.f۴۰۶۱d = new ArrayDeque();
        this.f۴۰۶۲e = new d();
        this.f۴۰۵۸a = maxIdleConnections;
        this.f۴۰۵۹b = timeUnit.toNanos(keepAliveDuration);
        if (keepAliveDuration <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + keepAliveDuration);
        }
    }

    /* access modifiers changed from: package-private */
    public e.f0.f.c a(a address, g streamAllocation, c0 route) {
        for (e.f0.f.c connection : this.f۴۰۶۱d) {
            if (connection.a(address, route)) {
                streamAllocation.a(connection, true);
                return connection;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Socket a(a address, g streamAllocation) {
        for (e.f0.f.c connection : this.f۴۰۶۱d) {
            if (connection.a(address, null) && connection.b() && connection != streamAllocation.b()) {
                return streamAllocation.a(connection);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(e.f0.f.c connection) {
        if (!this.f۴۰۶۳f) {
            this.f۴۰۶۳f = true;
            f۴۰۵۷g.execute(this.f۴۰۶۰c);
        }
        this.f۴۰۶۱d.add(connection);
    }

    /* access modifiers changed from: package-private */
    public boolean a(e.f0.f.c connection) {
        if (connection.k || this.f۴۰۵۸a == 0) {
            this.f۴۰۶۱d.remove(connection);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public long a(long now) {
        int inUseConnectionCount = 0;
        int idleConnectionCount = 0;
        e.f0.f.c longestIdleConnection = null;
        long longestIdleDurationNs = Long.MIN_VALUE;
        synchronized (this) {
            for (e.f0.f.c connection : this.f۴۰۶۱d) {
                if (a(connection, now) > 0) {
                    inUseConnectionCount++;
                } else {
                    idleConnectionCount++;
                    long idleDurationNs = now - connection.o;
                    if (idleDurationNs > longestIdleDurationNs) {
                        longestIdleDurationNs = idleDurationNs;
                        longestIdleConnection = connection;
                    }
                }
            }
            if (longestIdleDurationNs < this.f۴۰۵۹b) {
                if (idleConnectionCount <= this.f۴۰۵۸a) {
                    if (idleConnectionCount > 0) {
                        return this.f۴۰۵۹b - longestIdleDurationNs;
                    } else if (inUseConnectionCount > 0) {
                        return this.f۴۰۵۹b;
                    } else {
                        this.f۴۰۶۳f = false;
                        return -1;
                    }
                }
            }
            this.f۴۰۶۱d.remove(longestIdleConnection);
            c.a(longestIdleConnection.d());
            return 0;
        }
    }

    private int a(e.f0.f.c connection, long now) {
        List<Reference<StreamAllocation>> references = connection.n;
        int i = 0;
        while (i < references.size()) {
            Reference<StreamAllocation> reference = references.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                f.d().a("A connection to " + connection.c().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f۳۸۲۵a);
                references.remove(i);
                connection.k = true;
                if (references.isEmpty()) {
                    connection.o = now - this.f۴۰۵۹b;
                    return 0;
                }
            }
        }
        return references.size();
    }
}
