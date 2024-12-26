package p۱۳۹e;

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
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cd;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg;
import p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf;

/* renamed from: e.j  reason: invalid class name */
public final class Cj {

    /* renamed from: g  reason: contains not printable characters */
    private static final Executor f۱۶۰۹۹g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Cc.m۱۸۶۱۹a("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: contains not printable characters */
    private final int f۱۶۱۰۰a;

    /* renamed from: b  reason: contains not printable characters */
    private final long f۱۶۱۰۱b;

    /* renamed from: c  reason: contains not printable characters */
    private final Runnable f۱۶۱۰۲c;

    /* renamed from: d  reason: contains not printable characters */
    private final Deque<p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc> f۱۶۱۰۳d;

    /* renamed from: e  reason: contains not printable characters */
    final Cd f۱۶۱۰۴e;

    /* renamed from: f  reason: contains not printable characters */
    boolean f۱۶۱۰۵f;

    /* renamed from: e.j$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            while (true) {
                long waitNanos = Cj.this.m۱۹۱۲۶a(System.nanoTime());
                if (waitNanos != -1) {
                    if (waitNanos > 0) {
                        long waitMillis = waitNanos / 1000000;
                        long waitNanos2 = waitNanos - (1000000 * waitMillis);
                        synchronized (Cj.this) {
                            try {
                                Cj.this.wait(waitMillis, (int) waitNanos2);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public Cj() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public Cj(int maxIdleConnections, long keepAliveDuration, TimeUnit timeUnit) {
        this.f۱۶۱۰۲c = new RunnableCa();
        this.f۱۶۱۰۳d = new ArrayDeque();
        this.f۱۶۱۰۴e = new Cd();
        this.f۱۶۱۰۰a = maxIdleConnections;
        this.f۱۶۱۰۱b = timeUnit.toNanos(keepAliveDuration);
        if (keepAliveDuration <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + keepAliveDuration);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc m۱۹۱۲۷a(Ca address, Cg streamAllocation, Cc0 route) {
        for (p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection : this.f۱۶۱۰۳d) {
            if (connection.m۱۸۷۱۱a(address, route)) {
                streamAllocation.m۱۸۷۴۳a(connection, true);
                return connection;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Socket m۱۹۱۲۸a(Ca address, Cg streamAllocation) {
        for (p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection : this.f۱۶۱۰۳d) {
            if (connection.m۱۸۷۱۱a(address, null) && connection.m۱۸۷۱۴b() && connection != streamAllocation.m۱۸۷۴۶b()) {
                return streamAllocation.m۱۸۷۴۲a(connection);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۱۳۰b(p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection) {
        if (!this.f۱۶۱۰۵f) {
            this.f۱۶۱۰۵f = true;
            f۱۶۰۹۹g.execute(this.f۱۶۱۰۲c);
        }
        this.f۱۶۱۰۳d.add(connection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۱۲۹a(p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection) {
        if (connection.f۱۵۷۸۶k || this.f۱۶۱۰۰a == 0) {
            this.f۱۶۱۰۳d.remove(connection);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۹۱۲۶a(long now) {
        int inUseConnectionCount = 0;
        int idleConnectionCount = 0;
        p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc longestIdleConnection = null;
        long longestIdleDurationNs = Long.MIN_VALUE;
        synchronized (this) {
            for (p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection : this.f۱۶۱۰۳d) {
                if (m۱۹۱۲۵a(connection, now) > 0) {
                    inUseConnectionCount++;
                } else {
                    idleConnectionCount++;
                    long idleDurationNs = now - connection.f۱۵۷۹۰o;
                    if (idleDurationNs > longestIdleDurationNs) {
                        longestIdleDurationNs = idleDurationNs;
                        longestIdleConnection = connection;
                    }
                }
            }
            if (longestIdleDurationNs < this.f۱۶۱۰۱b) {
                if (idleConnectionCount <= this.f۱۶۱۰۰a) {
                    if (idleConnectionCount > 0) {
                        return this.f۱۶۱۰۱b - longestIdleDurationNs;
                    } else if (inUseConnectionCount > 0) {
                        return this.f۱۶۱۰۱b;
                    } else {
                        this.f۱۶۱۰۵f = false;
                        return -1;
                    }
                }
            }
            this.f۱۶۱۰۳d.remove(longestIdleConnection);
            Cc.m۱۸۶۲۲a(longestIdleConnection.m۱۸۷۱۶d());
            return 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۹۱۲۵a(p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc connection, long now) {
        List<Reference<StreamAllocation>> references = connection.f۱۵۷۸۹n;
        int i = 0;
        while (i < references.size()) {
            Reference<StreamAllocation> reference = references.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Cf.m۱۹۰۸۶d().m۱۹۰۹۲a("A connection to " + connection.m۱۸۷۱۵c().m۱۸۵۶۸a().m۱۸۵۰۱k() + " was leaked. Did you forget to close a response body?", ((Cg.Ca) reference).f۱۵۸۱۸a);
                references.remove(i);
                connection.f۱۵۷۸۶k = true;
                if (references.isEmpty()) {
                    connection.f۱۵۷۹۰o = now - this.f۱۶۱۰۱b;
                    return 0;
                }
            }
        }
        return references.size();
    }
}
