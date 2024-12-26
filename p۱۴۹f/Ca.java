package p۱۴۹f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a  reason: invalid class name */
public class Ca extends Ct {

    /* renamed from: h  reason: contains not printable characters */
    private static final long f۱۶۲۵۷h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i  reason: contains not printable characters */
    private static final long f۱۶۲۵۸i = TimeUnit.MILLISECONDS.toNanos(f۱۶۲۵۷h);

    /* renamed from: j  reason: contains not printable characters */
    static Ca f۱۶۲۵۹j;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۶۲۶۰e;

    /* renamed from: f  reason: contains not printable characters */
    private Ca f۱۶۲۶۱f;

    /* renamed from: g  reason: contains not printable characters */
    private long f۱۶۲۶۲g;

    /* renamed from: g  reason: contains not printable characters */
    public final void m۱۹۳۵۵g() {
        if (!this.f۱۶۲۶۰e) {
            long timeoutNanos = m۱۹۵۶۳f();
            boolean hasDeadline = m۱۹۵۶۱d();
            if (timeoutNanos != 0 || hasDeadline) {
                this.f۱۶۲۶۰e = true;
                m۱۹۳۴۶a(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static synchronized void m۱۹۳۴۶a(Ca node, long timeoutNanos, boolean hasDeadline) {
        synchronized (Ca.class) {
            if (f۱۶۲۵۹j == null) {
                f۱۶۲۵۹j = new Ca();
                new Cc().start();
            }
            long now = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.f۱۶۲۶۲g = Math.min(timeoutNanos, node.m۱۹۵۶۰c() - now) + now;
            } else if (timeoutNanos != 0) {
                node.f۱۶۲۶۲g = now + timeoutNanos;
            } else if (hasDeadline) {
                node.f۱۶۲۶۲g = node.m۱۹۵۶۰c();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = node.m۱۹۳۴۸b(now);
            Ca prev = f۱۶۲۵۹j;
            while (true) {
                if (prev.f۱۶۲۶۱f == null) {
                    break;
                } else if (remainingNanos < prev.f۱۶۲۶۱f.m۱۹۳۴۸b(now)) {
                    break;
                } else {
                    prev = prev.f۱۶۲۶۱f;
                }
            }
            node.f۱۶۲۶۱f = prev.f۱۶۲۶۱f;
            prev.f۱۶۲۶۱f = node;
            if (prev == f۱۶۲۵۹j) {
                Ca.class.notify();
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public final boolean m۱۹۳۵۶h() {
        if (!this.f۱۶۲۶۰e) {
            return false;
        }
        this.f۱۶۲۶۰e = false;
        return m۱۹۳۴۷a(this);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static synchronized boolean m۱۹۳۴۷a(Ca node) {
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

    /* renamed from: b  reason: contains not printable characters */
    private long m۱۹۳۴۸b(long now) {
        return this.f۱۶۲۶۲g - now;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۹۳۵۷i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a$a  reason: invalid class name */
    public class Ca implements AbstractCr {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCr f۱۶۲۶۳c;

        Ca(AbstractCr rVar) {
            this.f۱۶۲۶۳c = rVar;
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۳۵۸a(Cc source, long byteCount) {
            Cu.m۱۹۵۶۹a(source.f۱۶۲۷۰d, 0, byteCount);
            while (byteCount > 0) {
                long toWrite = 0;
                Co s = source.f۱۶۲۶۹c;
                while (true) {
                    if (toWrite >= 65536) {
                        break;
                    }
                    toWrite += (long) (s.f۱۶۳۰۴c - s.f۱۶۳۰۳b);
                    if (toWrite >= byteCount) {
                        toWrite = byteCount;
                        break;
                    }
                    s = s.f۱۶۳۰۷f;
                }
                Ca.this.m۱۹۳۵۵g();
                try {
                    this.f۱۶۲۶۳c.m۱۹۵۵۲a(source, toWrite);
                    byteCount -= toWrite;
                    Ca.this.m۱۹۳۵۳a(true);
                } catch (IOException e) {
                    throw Ca.this.m۱۹۳۵۲a(e);
                } catch (Throwable th) {
                    Ca.this.m۱۹۳۵۳a(false);
                    throw th;
                }
            }
        }

        @Override // p۱۴۹f.AbstractCr, java.io.Flushable
        public void flush() {
            Ca.this.m۱۹۳۵۵g();
            try {
                this.f۱۶۲۶۳c.flush();
                Ca.this.m۱۹۳۵۳a(true);
            } catch (IOException e) {
                throw Ca.this.m۱۹۳۵۲a(e);
            } catch (Throwable th) {
                Ca.this.m۱۹۳۵۳a(false);
                throw th;
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
        public void close() {
            Ca.this.m۱۹۳۵۵g();
            try {
                this.f۱۶۲۶۳c.close();
                Ca.this.m۱۹۳۵۳a(true);
            } catch (IOException e) {
                throw Ca.this.m۱۹۳۵۲a(e);
            } catch (Throwable th) {
                Ca.this.m۱۹۳۵۳a(false);
                throw th;
            }
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۹۳۵۹b() {
            return Ca.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f۱۶۲۶۳c + ")";
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final AbstractCr m۱۹۳۵۰a(AbstractCr sink) {
        return new Ca(sink);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a$b  reason: invalid class name */
    public class Cb implements AbstractCs {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCs f۱۶۲۶۵c;

        Cb(AbstractCs sVar) {
            this.f۱۶۲۶۵c = sVar;
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۹۳۶۰b(Cc sink, long byteCount) {
            Ca.this.m۱۹۳۵۵g();
            try {
                long result = this.f۱۶۲۶۵c.m۱۹۵۵۴b(sink, byteCount);
                Ca.this.m۱۹۳۵۳a(true);
                return result;
            } catch (IOException e) {
                throw Ca.this.m۱۹۳۵۲a(e);
            } catch (Throwable th) {
                Ca.this.m۱۹۳۵۳a(false);
                throw th;
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            try {
                this.f۱۶۲۶۵c.close();
                Ca.this.m۱۹۳۵۳a(true);
            } catch (IOException e) {
                throw Ca.this.m۱۹۳۵۲a(e);
            } catch (Throwable th) {
                Ca.this.m۱۹۳۵۳a(false);
                throw th;
            }
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۹۳۶۱b() {
            return Ca.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f۱۶۲۶۵c + ")";
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final AbstractCs m۱۹۳۵۱a(AbstractCs source) {
        return new Cb(source);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۹۳۵۳a(boolean throwOnTimeout) {
        if (m۱۹۳۵۶h() && throwOnTimeout) {
            throw m۱۹۳۵۴b((IOException) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final IOException m۱۹۳۵۲a(IOException cause) {
        if (!m۱۹۳۵۶h()) {
            return cause;
        }
        return m۱۹۳۵۴b(cause);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public IOException m۱۹۳۵۴b(IOException cause) {
        InterruptedIOException e = new InterruptedIOException("timeout");
        if (cause != null) {
            e.initCause(cause);
        }
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: f.a$c  reason: invalid class name */
    public static final class Cc extends Thread {
        Cc() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.m۱۹۳۵۷i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<f.a> r0 = p۱۴۹f.Ca.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x001c }
                f.a r1 = p۱۴۹f.Ca.m۱۹۳۴۹j()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                f.a r2 = p۱۴۹f.Ca.f۱۶۲۵۹j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r2 = 0
                p۱۴۹f.Ca.f۱۶۲۵۹j = r2     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.m۱۹۳۵۷i()
                goto L_0x001d
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x001c:
                r0 = move-exception
            L_0x001d:
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: p۱۴۹f.Ca.Cc.run():void");
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    static Ca m۱۹۳۴۹j() {
        Ca node = f۱۶۲۵۹j.f۱۶۲۶۱f;
        if (node == null) {
            long startNanos = System.nanoTime();
            Ca.class.wait(f۱۶۲۵۷h);
            if (f۱۶۲۵۹j.f۱۶۲۶۱f != null || System.nanoTime() - startNanos < f۱۶۲۵۸i) {
                return null;
            }
            return f۱۶۲۵۹j;
        }
        long waitNanos = node.m۱۹۳۴۸b(System.nanoTime());
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
