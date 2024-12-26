package e.f0.i;

import f.e;
import f.r;
import f.s;
import f.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Header;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    long f۳۹۷۵a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f۳۹۷۶b;

    /* renamed from: c  reason: collision with root package name */
    final int f۳۹۷۷c;

    /* renamed from: d  reason: collision with root package name */
    final g f۳۹۷۸d;

    /* renamed from: e  reason: collision with root package name */
    private List<c> f۳۹۷۹e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۳۹۸۰f;

    /* renamed from: g  reason: collision with root package name */
    private final b f۳۹۸۱g;

    /* renamed from: h  reason: collision with root package name */
    final a f۳۹۸۲h;
    final c i = new c();
    final c j = new c();
    b k = null;

    i(int id, g connection, boolean outFinished, boolean inFinished, List<c> list) {
        if (connection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f۳۹۷۷c = id;
            this.f۳۹۷۸d = connection;
            this.f۳۹۷۶b = (long) connection.q.c();
            this.f۳۹۸۱g = new b((long) connection.p.c());
            this.f۳۹۸۲h = new a();
            this.f۳۹۸۱g.f۳۹۹۱g = inFinished;
            this.f۳۹۸۲h.f۳۹۸۵e = outFinished;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    public int c() {
        return this.f۳۹۷۷c;
    }

    public synchronized boolean g() {
        if (this.k != null) {
            return false;
        }
        if ((this.f۳۹۸۱g.f۳۹۹۱g || this.f۳۹۸۱g.f۳۹۹۰f) && ((this.f۳۹۸۲h.f۳۹۸۵e || this.f۳۹۸۲h.f۳۹۸۴d) && this.f۳۹۸۰f)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f۳۹۷۸d.f۳۹۱۷c == ((this.f۳۹۷۷c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized List<c> j() {
        Throwable th;
        List<Header> result;
        if (f()) {
            this.i.g();
            while (this.f۳۹۷۹e == null) {
                try {
                    try {
                        if (this.k != null) {
                            break;
                        }
                        k();
                    } catch (Throwable th2) {
                        th = th2;
                        this.i.k();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.i.k();
                    throw th;
                }
            }
            this.i.k();
            result = this.f۳۹۷۹e;
            if (result != null) {
                this.f۳۹۷۹e = null;
            } else {
                throw new n(this.k);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return result;
    }

    public t h() {
        return this.i;
    }

    public t l() {
        return this.j;
    }

    public s e() {
        return this.f۳۹۸۱g;
    }

    public r d() {
        synchronized (this) {
            if (!this.f۳۹۸۰f) {
                if (!f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f۳۹۸۲h;
    }

    public void a(b rstStatusCode) {
        if (d(rstStatusCode)) {
            this.f۳۹۷۸d.b(this.f۳۹۷۷c, rstStatusCode);
        }
    }

    public void b(b errorCode) {
        if (d(errorCode)) {
            this.f۳۹۷۸d.c(this.f۳۹۷۷c, errorCode);
        }
    }

    private boolean d(b errorCode) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.f۳۹۸۱g.f۳۹۹۱g && this.f۳۹۸۲h.f۳۹۸۵e) {
                return false;
            }
            this.k = errorCode;
            notifyAll();
            this.f۳۹۷۸d.c(this.f۳۹۷۷c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<c> list) {
        boolean open = true;
        synchronized (this) {
            this.f۳۹۸۰f = true;
            if (this.f۳۹۷۹e == null) {
                this.f۳۹۷۹e = list;
                open = g();
                notifyAll();
            } else {
                List<Header> newHeaders = new ArrayList<>();
                newHeaders.addAll(this.f۳۹۷۹e);
                newHeaders.add(null);
                newHeaders.addAll(list);
                this.f۳۹۷۹e = newHeaders;
            }
        }
        if (!open) {
            this.f۳۹۷۸d.c(this.f۳۹۷۷c);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e in, int length) {
        this.f۳۹۸۱g.a(in, (long) length);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        boolean open;
        synchronized (this) {
            this.f۳۹۸۱g.f۳۹۹۱g = true;
            open = g();
            notifyAll();
        }
        if (!open) {
            this.f۳۹۷۸d.c(this.f۳۹۷۷c);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(b errorCode) {
        if (this.k == null) {
            this.k = errorCode;
            notifyAll();
        }
    }

    /* access modifiers changed from: private */
    public final class b implements s {

        /* renamed from: c  reason: collision with root package name */
        private final f.c f۳۹۸۷c = new f.c();

        /* renamed from: d  reason: collision with root package name */
        private final f.c f۳۹۸۸d = new f.c();

        /* renamed from: e  reason: collision with root package name */
        private final long f۳۹۸۹e;

        /* renamed from: f  reason: collision with root package name */
        boolean f۳۹۹۰f;

        /* renamed from: g  reason: collision with root package name */
        boolean f۳۹۹۱g;

        b(long maxByteCount) {
            this.f۳۹۸۹e = maxByteCount;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r5 = r10.f۳۹۹۲h.f۳۹۷۸d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r10.f۳۹۹۲h.f۳۹۷۸d.n += r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r10.f۳۹۹۲h.f۳۹۷۸d.n < ((long) (r10.f۳۹۹۲h.f۳۹۷۸d.p.c() / 2))) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
            r10.f۳۹۹۲h.f۳۹۷۸d.a(0, r10.f۳۹۹۲h.f۳۹۷۸d.n);
            r10.f۳۹۹۲h.f۳۹۷۸d.n = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
            return r3;
         */
        @Override // f.s
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long b(f.c r11, long r12) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f0.i.i.b.b(f.c, long):long");
        }

        private void l() {
            i.this.i.g();
            while (this.f۳۹۸۸d.q() == 0 && !this.f۳۹۹۱g && !this.f۳۹۹۰f && i.this.k == null) {
                try {
                    i.this.k();
                } finally {
                    i.this.i.k();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(e in, long byteCount) {
            boolean finished;
            boolean wasEmpty;
            boolean flowControlError;
            while (byteCount > 0) {
                synchronized (i.this) {
                    finished = this.f۳۹۹۱g;
                    wasEmpty = true;
                    flowControlError = this.f۳۹۸۸d.q() + byteCount > this.f۳۹۸۹e;
                }
                if (flowControlError) {
                    in.skip(byteCount);
                    i.this.b(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (finished) {
                    in.skip(byteCount);
                    return;
                } else {
                    long read = in.b(this.f۳۹۸۷c, byteCount);
                    if (read != -1) {
                        long byteCount2 = byteCount - read;
                        synchronized (i.this) {
                            if (this.f۳۹۸۸d.q() != 0) {
                                wasEmpty = false;
                            }
                            this.f۳۹۸۸d.a(this.f۳۹۸۷c);
                            if (wasEmpty) {
                                i.this.notifyAll();
                            }
                        }
                        byteCount = byteCount2;
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // f.s
        public t b() {
            return i.this.i;
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                this.f۳۹۹۰f = true;
                this.f۳۹۸۸d.m();
                i.this.notifyAll();
            }
            i.this.a();
        }

        private void d() {
            if (!this.f۳۹۹۰f) {
                b bVar = i.this.k;
                if (bVar != null) {
                    throw new n(bVar);
                }
                return;
            }
            throw new IOException("stream closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean cancel;
        boolean open;
        synchronized (this) {
            cancel = !this.f۳۹۸۱g.f۳۹۹۱g && this.f۳۹۸۱g.f۳۹۹۰f && (this.f۳۹۸۲h.f۳۹۸۵e || this.f۳۹۸۲h.f۳۹۸۴d);
            open = g();
        }
        if (cancel) {
            a(b.CANCEL);
        } else if (!open) {
            this.f۳۹۷۸d.c(this.f۳۹۷۷c);
        }
    }

    /* access modifiers changed from: package-private */
    public final class a implements r {

        /* renamed from: c  reason: collision with root package name */
        private final f.c f۳۹۸۳c = new f.c();

        /* renamed from: d  reason: collision with root package name */
        boolean f۳۹۸۴d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۳۹۸۵e;

        a() {
        }

        @Override // f.r
        public void a(f.c source, long byteCount) {
            this.f۳۹۸۳c.a(source, byteCount);
            while (this.f۳۹۸۳c.q() >= 16384) {
                a(false);
            }
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean outFinished) {
            long toWrite;
            synchronized (i.this) {
                i.this.j.g();
                while (i.this.f۳۹۷۶b <= 0 && !this.f۳۹۸۵e && !this.f۳۹۸۴d && i.this.k == null) {
                    try {
                        i.this.k();
                    } catch (Throwable th) {
                        i.this.j.k();
                        throw th;
                    }
                }
                i.this.j.k();
                i.this.b();
                toWrite = Math.min(i.this.f۳۹۷۶b, this.f۳۹۸۳c.q());
                i.this.f۳۹۷۶b -= toWrite;
            }
            i.this.j.g();
            try {
                i.this.f۳۹۷۸d.a(i.this.f۳۹۷۷c, outFinished && toWrite == this.f۳۹۸۳c.q(), this.f۳۹۸۳c, toWrite);
            } finally {
                i.this.j.k();
            }
        }

        @Override // f.r, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f۳۹۸۳c.q() > 0) {
                a(false);
                i.this.f۳۹۷۸d.flush();
            }
        }

        @Override // f.r
        public t b() {
            return i.this.j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f۳۹۸۳c.q() <= 0) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
            if (r8.f۳۹۸۳c.q() <= 0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
            r0 = r8.f۳۹۸۶f;
            r0.f۳۹۷۸d.a(r0.f۳۹۷۷c, true, (f.c) null, 0L);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
            r2 = r8.f۳۹۸۶f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f۳۹۸۴d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            r8.f۳۹۸۶f.f۳۹۷۸d.flush();
            r8.f۳۹۸۶f.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r8.f۳۹۸۶f.f۳۹۸۲h.f۳۹۸۵e != false) goto L_0x003b;
         */
        @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                e.f0.i.i r0 = e.f0.i.i.this
                monitor-enter(r0)
                boolean r1 = r8.f۳۹۸۴d     // Catch:{ all -> 0x0051 }
                if (r1 == 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0051 }
                return
            L_0x000a:
                monitor-exit(r0)     // Catch:{ all -> 0x0051 }
                e.f0.i.i r0 = e.f0.i.i.this
                e.f0.i.i$a r0 = r0.f۳۹۸۲h
                boolean r0 = r0.f۳۹۸۵e
                r1 = 1
                if (r0 != 0) goto L_0x003b
                f.c r0 = r8.f۳۹۸۳c
                long r2 = r0.q()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002e
            L_0x0020:
                f.c r0 = r8.f۳۹۸۳c
                long r2 = r0.q()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003b
                r8.a(r1)
                goto L_0x0020
            L_0x002e:
                e.f0.i.i r0 = e.f0.i.i.this
                e.f0.i.g r2 = r0.f۳۹۷۸d
                int r3 = r0.f۳۹۷۷c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a(r3, r4, r5, r6)
            L_0x003b:
                e.f0.i.i r2 = e.f0.i.i.this
                monitor-enter(r2)
                r8.f۳۹۸۴d = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r2)     // Catch:{ all -> 0x004e }
                e.f0.i.i r0 = e.f0.i.i.this
                e.f0.i.g r0 = r0.f۳۹۷۸d
                r0.flush()
                e.f0.i.i r0 = e.f0.i.i.this
                r0.a()
                return
            L_0x004e:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0051:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x0055
            L_0x0054:
                throw r1
            L_0x0055:
                goto L_0x0054
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f0.i.i.a.close():void");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long delta) {
        this.f۳۹۷۶b += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a aVar = this.f۳۹۸۲h;
        if (aVar.f۳۹۸۴d) {
            throw new IOException("stream closed");
        } else if (!aVar.f۳۹۸۵e) {
            b bVar = this.k;
            if (bVar != null) {
                throw new n(bVar);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        try {
            wait();
        } catch (InterruptedException e2) {
            throw new InterruptedIOException();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends f.a {
        c() {
        }

        /* access modifiers changed from: protected */
        @Override // f.a
        public void i() {
            i.this.b(b.CANCEL);
        }

        /* access modifiers changed from: protected */
        @Override // f.a
        public IOException b(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        public void k() {
            if (h()) {
                throw b((IOException) null);
            }
        }
    }
}
