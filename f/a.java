package f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a extends t {

    /* renamed from: h  reason: collision with root package name */
    private static final long f۴۱۶۶h = TimeUnit.SECONDS.toMillis(60);
    private static final long i = TimeUnit.MILLISECONDS.toNanos(f۴۱۶۶h);
    static a j;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۴۱۶۷e;

    /* renamed from: f  reason: collision with root package name */
    private a f۴۱۶۸f;

    /* renamed from: g  reason: collision with root package name */
    private long f۴۱۶۹g;

    public final void g() {
        if (!this.f۴۱۶۷e) {
            long timeoutNanos = f();
            boolean hasDeadline = d();
            if (timeoutNanos != 0 || hasDeadline) {
                this.f۴۱۶۷e = true;
                a(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    private static synchronized void a(a node, long timeoutNanos, boolean hasDeadline) {
        synchronized (a.class) {
            if (j == null) {
                j = new a();
                new c().start();
            }
            long now = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.f۴۱۶۹g = Math.min(timeoutNanos, node.c() - now) + now;
            } else if (timeoutNanos != 0) {
                node.f۴۱۶۹g = now + timeoutNanos;
            } else if (hasDeadline) {
                node.f۴۱۶۹g = node.c();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = node.b(now);
            a prev = j;
            while (true) {
                if (prev.f۴۱۶۸f == null) {
                    break;
                } else if (remainingNanos < prev.f۴۱۶۸f.b(now)) {
                    break;
                } else {
                    prev = prev.f۴۱۶۸f;
                }
            }
            node.f۴۱۶۸f = prev.f۴۱۶۸f;
            prev.f۴۱۶۸f = node;
            if (prev == j) {
                a.class.notify();
            }
        }
    }

    public final boolean h() {
        if (!this.f۴۱۶۷e) {
            return false;
        }
        this.f۴۱۶۷e = false;
        return a(this);
    }

    private static synchronized boolean a(a node) {
        synchronized (a.class) {
            for (a prev = j; prev != null; prev = prev.f۴۱۶۸f) {
                if (prev.f۴۱۶۸f == node) {
                    prev.f۴۱۶۸f = node.f۴۱۶۸f;
                    node.f۴۱۶۸f = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long b(long now) {
        return this.f۴۱۶۹g - now;
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a$a  reason: collision with other inner class name */
    public class C۰۱۲۴a implements r {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f۴۱۷۰c;

        C۰۱۲۴a(r rVar) {
            this.f۴۱۷۰c = rVar;
        }

        @Override // f.r
        public void a(c source, long byteCount) {
            u.a(source.f۴۱۷۷d, 0, byteCount);
            while (byteCount > 0) {
                long toWrite = 0;
                o s = source.f۴۱۷۶c;
                while (true) {
                    if (toWrite >= 65536) {
                        break;
                    }
                    toWrite += (long) (s.f۴۲۱۰c - s.f۴۲۰۹b);
                    if (toWrite >= byteCount) {
                        toWrite = byteCount;
                        break;
                    }
                    s = s.f۴۲۱۳f;
                }
                a.this.g();
                try {
                    this.f۴۱۷۰c.a(source, toWrite);
                    byteCount -= toWrite;
                    a.this.a(true);
                } catch (IOException e2) {
                    throw a.this.a(e2);
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }
        }

        @Override // f.r, java.io.Flushable
        public void flush() {
            a.this.g();
            try {
                this.f۴۱۷۰c.flush();
                a.this.a(true);
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
        public void close() {
            a.this.g();
            try {
                this.f۴۱۷۰c.close();
                a.this.a(true);
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // f.r
        public t b() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f۴۱۷۰c + ")";
        }
    }

    public final r a(r sink) {
        return new C۰۱۲۴a(sink);
    }

    /* access modifiers changed from: package-private */
    public class b implements s {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f۴۱۷۲c;

        b(s sVar) {
            this.f۴۱۷۲c = sVar;
        }

        @Override // f.s
        public long b(c sink, long byteCount) {
            a.this.g();
            try {
                long result = this.f۴۱۷۲c.b(sink, byteCount);
                a.this.a(true);
                return result;
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            try {
                this.f۴۱۷۲c.close();
                a.this.a(true);
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // f.s
        public t b() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f۴۱۷۲c + ")";
        }
    }

    public final s a(s source) {
        return new b(source);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean throwOnTimeout) {
        if (h() && throwOnTimeout) {
            throw b((IOException) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final IOException a(IOException cause) {
        if (!h()) {
            return cause;
        }
        return b(cause);
    }

    /* access modifiers changed from: protected */
    public IOException b(IOException cause) {
        InterruptedIOException e2 = new InterruptedIOException("timeout");
        if (cause != null) {
            e2.initCause(cause);
        }
        return e2;
    }

    /* access modifiers changed from: private */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<f.a> r0 = f.a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x001c }
                f.a r1 = f.a.j()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                f.a r2 = f.a.j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r2 = 0
                f.a.j = r2     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.i()
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
            throw new UnsupportedOperationException("Method not decompiled: f.a.c.run():void");
        }
    }

    static a j() {
        a node = j.f۴۱۶۸f;
        if (node == null) {
            long startNanos = System.nanoTime();
            a.class.wait(f۴۱۶۶h);
            if (j.f۴۱۶۸f != null || System.nanoTime() - startNanos < i) {
                return null;
            }
            return j;
        }
        long waitNanos = node.b(System.nanoTime());
        if (waitNanos > 0) {
            long waitMillis = waitNanos / 1000000;
            a.class.wait(waitMillis, (int) (waitNanos - (1000000 * waitMillis)));
            return null;
        }
        j.f۴۱۶۸f = node.f۴۱۶۸f;
        node.f۴۱۶۸f = null;
        return node;
    }
}
