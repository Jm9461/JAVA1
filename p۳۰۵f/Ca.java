package p۳۰۵f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends Ct {

    /* renamed from: h, reason: contains not printable characters */
    private static final long f۱۶۲۵۷h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i, reason: contains not printable characters */
    private static final long f۱۶۲۵۸i = TimeUnit.MILLISECONDS.toNanos(f۱۶۲۵۷h);

    /* renamed from: j, reason: contains not printable characters */
    static Ca f۱۶۲۵۹j;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۱۶۲۶۰e;

    /* renamed from: f, reason: contains not printable characters */
    private Ca f۱۶۲۶۱f;

    /* renamed from: g, reason: contains not printable characters */
    private long f۱۶۲۶۲g;

    /* renamed from: g, reason: contains not printable characters */
    public final void m۱۷۲۷۷g() {
        if (this.f۱۶۲۶۰e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = m۱۷۴۸۶f();
        boolean hasDeadline = mo۱۷۴۸۴d();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        this.f۱۶۲۶۰e = true;
        m۱۷۲۶۸a(this, timeoutNanos, hasDeadline);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static synchronized void m۱۷۲۶۸a(Ca node, long timeoutNanos, boolean hasDeadline) {
        synchronized (Ca.class) {
            if (f۱۶۲۵۹j == null) {
                f۱۶۲۵۹j = new Ca();
                new c().start();
            }
            long now = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.f۱۶۲۶۲g = Math.min(timeoutNanos, node.mo۱۷۴۸۳c() - now) + now;
            } else if (timeoutNanos != 0) {
                node.f۱۶۲۶۲g = now + timeoutNanos;
            } else if (hasDeadline) {
                node.f۱۶۲۶۲g = node.mo۱۷۴۸۳c();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = node.m۱۷۲۷۰b(now);
            Ca prev = f۱۶۲۵۹j;
            while (prev.f۱۶۲۶۱f != null && remainingNanos >= prev.f۱۶۲۶۱f.m۱۷۲۷۰b(now)) {
                prev = prev.f۱۶۲۶۱f;
            }
            node.f۱۶۲۶۱f = prev.f۱۶۲۶۱f;
            prev.f۱۶۲۶۱f = node;
            if (prev == f۱۶۲۵۹j) {
                Ca.class.notify();
            }
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public final boolean m۱۷۲۷۸h() {
        if (!this.f۱۶۲۶۰e) {
            return false;
        }
        this.f۱۶۲۶۰e = false;
        return m۱۷۲۶۹a(this);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static synchronized boolean m۱۷۲۶۹a(Ca node) {
        synchronized (Ca.class) {
            for (Ca prev = f۱۶۲۵۹j; prev != null; prev = prev.f۱۶۲۶۱f) {
                if (prev.f۱۶۲۶۱f == node) {
                    prev.f۱۶۲۶۱f = node.f۱۶۲۶۱f;
                    node.f۱۶۲۶۱f = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private long m۱۷۲۷۰b(long now) {
        return this.f۱۶۲۶۲g - now;
    }

    /* renamed from: i, reason: contains not printable characters */
    protected void mo۱۷۴۲۳i() {
    }

    /* renamed from: f.a$a */
    class a implements InterfaceCr {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ InterfaceCr f۱۶۲۶۳c;

        a(InterfaceCr interfaceCr) {
            this.f۱۶۲۶۳c = interfaceCr;
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(Cc source, long byteCount) {
            Cu.m۱۷۴۹۲a(source.f۱۶۲۷۰d, 0L, byteCount);
            while (byteCount > 0) {
                long toWrite = 0;
                Co s = source.f۱۶۲۶۹c;
                while (true) {
                    if (toWrite >= 65536) {
                        break;
                    }
                    int segmentSize = s.f۱۶۳۰۴c - s.f۱۶۳۰۳b;
                    toWrite += segmentSize;
                    if (toWrite < byteCount) {
                        s = s.f۱۶۳۰۷f;
                    } else {
                        toWrite = byteCount;
                        break;
                    }
                }
                boolean throwOnTimeout = false;
                Ca.this.m۱۷۲۷۷g();
                try {
                    try {
                        this.f۱۶۲۶۳c.mo۱۷۴۷۵a(source, toWrite);
                        byteCount -= toWrite;
                        throwOnTimeout = true;
                    } catch (IOException e2) {
                        throw Ca.this.m۱۷۲۷۴a(e2);
                    }
                } finally {
                    Ca.this.m۱۷۲۷۵a(throwOnTimeout);
                }
            }
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
        public void flush() {
            boolean throwOnTimeout = false;
            Ca.this.m۱۷۲۷۷g();
            try {
                try {
                    this.f۱۶۲۶۳c.flush();
                    throwOnTimeout = true;
                } catch (IOException e2) {
                    throw Ca.this.m۱۷۲۷۴a(e2);
                }
            } finally {
                Ca.this.m۱۷۲۷۵a(throwOnTimeout);
            }
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean throwOnTimeout = false;
            Ca.this.m۱۷۲۷۷g();
            try {
                try {
                    this.f۱۶۲۶۳c.close();
                    throwOnTimeout = true;
                } catch (IOException e2) {
                    throw Ca.this.m۱۷۲۷۴a(e2);
                }
            } finally {
                Ca.this.m۱۷۲۷۵a(throwOnTimeout);
            }
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۶b() {
            return Ca.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f۱۶۲۶۳c + ")";
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public final InterfaceCr m۱۷۲۷۲a(InterfaceCr sink) {
        return new a(sink);
    }

    /* renamed from: f.a$b */
    class b implements InterfaceCs {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ InterfaceCs f۱۶۲۶۵c;

        b(InterfaceCs interfaceCs) {
            this.f۱۶۲۶۵c = interfaceCs;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            boolean throwOnTimeout = false;
            Ca.this.m۱۷۲۷۷g();
            try {
                try {
                    long result = this.f۱۶۲۶۵c.mo۱۷۴۷۷b(sink, byteCount);
                    throwOnTimeout = true;
                    return result;
                } catch (IOException e2) {
                    throw Ca.this.m۱۷۲۷۴a(e2);
                }
            } finally {
                Ca.this.m۱۷۲۷۵a(throwOnTimeout);
            }
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean throwOnTimeout = false;
            try {
                try {
                    this.f۱۶۲۶۵c.close();
                    throwOnTimeout = true;
                } catch (IOException e2) {
                    throw Ca.this.m۱۷۲۷۴a(e2);
                }
            } finally {
                Ca.this.m۱۷۲۷۵a(throwOnTimeout);
            }
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۸b() {
            return Ca.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f۱۶۲۶۵c + ")";
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public final InterfaceCs m۱۷۲۷۳a(InterfaceCs source) {
        return new b(source);
    }

    /* renamed from: a, reason: contains not printable characters */
    final void m۱۷۲۷۵a(boolean throwOnTimeout) {
        boolean timedOut = m۱۷۲۷۸h();
        if (timedOut && throwOnTimeout) {
            throw mo۱۷۴۲۲b((IOException) null);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    final IOException m۱۷۲۷۴a(IOException cause) {
        return !m۱۷۲۷۸h() ? cause : mo۱۷۴۲۲b(cause);
    }

    /* renamed from: b, reason: contains not printable characters */
    protected IOException mo۱۷۴۲۲b(IOException cause) {
        InterruptedIOException e2 = new InterruptedIOException("timeout");
        if (cause != null) {
            e2.initCause(cause);
        }
        return e2;
    }

    /* renamed from: f.a$c */
    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.mo۱۷۴۲۳i();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<f.a> r0 = p۳۰۵f.Ca.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L1c
                f.a r1 = p۳۰۵f.Ca.m۱۷۲۷۱j()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                f.a r2 = p۳۰۵f.Ca.f۱۶۲۵۹j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r2 = 0
                p۳۰۵f.Ca.f۱۶۲۵۹j = r2     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo۱۷۴۲۳i()     // Catch: java.lang.InterruptedException -> L1c
                goto L1d
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L1c
            L1c:
                r0 = move-exception
            L1d:
                goto L0
            */
            throw new UnsupportedOperationException("Method not decompiled: p۳۰۵f.Ca.c.run():void");
        }
    }

    /* renamed from: j, reason: contains not printable characters */
    static Ca m۱۷۲۷۱j() {
        Ca node = f۱۶۲۵۹j.f۱۶۲۶۱f;
        if (node == null) {
            long startNanos = System.nanoTime();
            Ca.class.wait(f۱۶۲۵۷h);
            if (f۱۶۲۵۹j.f۱۶۲۶۱f != null || System.nanoTime() - startNanos < f۱۶۲۵۸i) {
                return null;
            }
            return f۱۶۲۵۹j;
        }
        long startNanos2 = System.nanoTime();
        long waitNanos = node.m۱۷۲۷۰b(startNanos2);
        if (waitNanos > 0) {
            long waitMillis = waitNanos / 1000000;
            Ca.class.wait(waitMillis, (int) (waitNanos - (1000000 * waitMillis)));
            return null;
        }
        f۱۶۲۵۹j.f۱۶۲۶۱f = node.f۱۶۲۶۱f;
        node.f۱۶۲۶۱f = null;
        return node;
    }
}
