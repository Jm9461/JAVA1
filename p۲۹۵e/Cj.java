package p۲۹۵e;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cd;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg;
import p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf;

/* renamed from: e.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cj {

    /* renamed from: g, reason: contains not printable characters */
    private static final Executor f۱۶۰۹۹g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Cc.m۱۶۵۴۰a("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: contains not printable characters */
    private final int f۱۶۱۰۰a;

    /* renamed from: b, reason: contains not printable characters */
    private final long f۱۶۱۰۱b;

    /* renamed from: c, reason: contains not printable characters */
    private final Runnable f۱۶۱۰۲c;

    /* renamed from: d, reason: contains not printable characters */
    private final Deque<p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc> f۱۶۱۰۳d;

    /* renamed from: e, reason: contains not printable characters */
    final Cd f۱۶۱۰۴e;

    /* renamed from: f, reason: contains not printable characters */
    boolean f۱۶۱۰۵f;

    /* renamed from: e.j$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long waitNanos = Cj.this.m۱۷۰۴۷a(System.nanoTime());
                if (waitNanos == -1) {
                    return;
                }
                if (waitNanos > 0) {
                    long waitMillis = waitNanos / 1000000;
                    long waitNanos2 = waitNanos - (1000000 * waitMillis);
                    synchronized (Cj.this) {
                        try {
                            Cj.this.wait(waitMillis, (int) waitNanos2);
                        } catch (InterruptedException e2) {
                        }
                    }
                }
            }
        }
    }

    public Cj() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public Cj(int maxIdleConnections, long keepAliveDuration, TimeUnit timeUnit) {
        this.f۱۶۱۰۲c = new a();
        this.f۱۶۱۰۳d = new ArrayDeque();
        this.f۱۶۱۰۴e = new Cd();
        this.f۱۶۱۰۰a = maxIdleConnections;
        this.f۱۶۱۰۱b = timeUnit.toNanos(keepAliveDuration);
        if (keepAliveDuration <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + keepAliveDuration);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc m۱۷۰۴۸a(Ca address, Cg streamAllocation, Cc0 route) {
        for (p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection : this.f۱۶۱۰۳d) {
            if (connection.m۱۶۶۳۲a(address, route)) {
                streamAllocation.m۱۶۶۶۴a(connection, true);
                return connection;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    Socket m۱۷۰۴۹a(Ca address, Cg streamAllocation) {
        for (p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection : this.f۱۶۱۰۳d) {
            if (connection.m۱۶۶۳۲a(address, null) && connection.m۱۶۶۳۵b() && connection != streamAllocation.m۱۶۶۶۷b()) {
                return streamAllocation.m۱۶۶۶۳a(connection);
            }
        }
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۷۰۵۱b(p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection) {
        if (!this.f۱۶۱۰۵f) {
            this.f۱۶۱۰۵f = true;
            f۱۶۰۹۹g.execute(this.f۱۶۱۰۲c);
        }
        this.f۱۶۱۰۳d.add(connection);
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۷۰۵۰a(p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection) {
        if (connection.f۱۵۷۸۶k || this.f۱۶۱۰۰a == 0) {
            this.f۱۶۱۰۳d.remove(connection);
            return true;
        }
        notifyAll();
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    long m۱۷۰۴۷a(long now) {
        int inUseConnectionCount = 0;
        int idleConnectionCount = 0;
        p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc longestIdleConnection = null;
        long longestIdleDurationNs = Long.MIN_VALUE;
        synchronized (this) {
            for (p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection : this.f۱۶۱۰۳d) {
                if (m۱۷۰۴۶a(connection, now) > 0) {
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
            if (longestIdleDurationNs < this.f۱۶۱۰۱b && idleConnectionCount <= this.f۱۶۱۰۰a) {
                if (idleConnectionCount > 0) {
                    return this.f۱۶۱۰۱b - longestIdleDurationNs;
                }
                if (inUseConnectionCount > 0) {
                    return this.f۱۶۱۰۱b;
                }
                this.f۱۶۱۰۵f = false;
                return -1L;
            }
            this.f۱۶۱۰۳d.remove(longestIdleConnection);
            Cc.m۱۶۵۴۳a(longestIdleConnection.m۱۶۶۳۷d());
            return 0L;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۷۰۴۶a(p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cc connection, long now) {
        List<Reference<Cg>> list = connection.f۱۵۷۸۹n;
        int i = 0;
        while (i < list.size()) {
            Reference<Cg> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Cg.a streamAllocRef = (Cg.a) reference;
                String message = "A connection to " + connection.m۱۶۶۳۶c().m۱۶۴۸۹a().m۱۶۴۲۲k() + " was leaked. Did you forget to close a response body?";
                Cf.m۱۷۰۰۷d().mo۱۷۰۱۳a(message, streamAllocRef.f۱۵۸۱۸a);
                list.remove(i);
                connection.f۱۵۷۸۶k = true;
                if (list.isEmpty()) {
                    connection.f۱۵۷۹۰o = now - this.f۱۶۱۰۱b;
                    return 0;
                }
            }
        }
        int i2 = list.size();
        return i2;
    }
}
