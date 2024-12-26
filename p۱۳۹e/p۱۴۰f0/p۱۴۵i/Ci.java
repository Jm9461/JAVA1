package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Header;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Ct;

/* renamed from: e.f0.i.i  reason: invalid class name */
public final class Ci {

    /* renamed from: a  reason: contains not printable characters */
    long f۱۶۰۰۴a = 0;

    /* renamed from: b  reason: contains not printable characters */
    long f۱۶۰۰۵b;

    /* renamed from: c  reason: contains not printable characters */
    final int f۱۶۰۰۶c;

    /* renamed from: d  reason: contains not printable characters */
    final Cg f۱۶۰۰۷d;

    /* renamed from: e  reason: contains not printable characters */
    private List<Cc> f۱۶۰۰۸e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۶۰۰۹f;

    /* renamed from: g  reason: contains not printable characters */
    private final Cb f۱۶۰۱۰g;

    /* renamed from: h  reason: contains not printable characters */
    final Ca f۱۶۰۱۱h;

    /* renamed from: i  reason: contains not printable characters */
    final Cc f۱۶۰۱۲i = new Cc();

    /* renamed from: j  reason: contains not printable characters */
    final Cc f۱۶۰۱۳j = new Cc();

    /* renamed from: k  reason: contains not printable characters */
    EnumCb f۱۶۰۱۴k = null;

    Ci(int id, Cg connection, boolean outFinished, boolean inFinished, List<Cc> list) {
        if (connection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f۱۶۰۰۶c = id;
            this.f۱۶۰۰۷d = connection;
            this.f۱۶۰۰۵b = (long) connection.f۱۵۹۴۶q.m۱۹۰۲۶c();
            this.f۱۶۰۱۰g = new Cb((long) connection.f۱۵۹۴۵p.m۱۹۰۲۶c());
            this.f۱۶۰۱۱h = new Ca();
            this.f۱۶۰۱۰g.f۱۶۰۲۳g = inFinished;
            this.f۱۶۰۱۱h.f۱۶۰۱۷e = outFinished;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۸۹۶۸c() {
        return this.f۱۶۰۰۶c;
    }

    /* renamed from: g  reason: contains not printable characters */
    public synchronized boolean m۱۸۹۷۳g() {
        if (this.f۱۶۰۱۴k != null) {
            return false;
        }
        if ((this.f۱۶۰۱۰g.f۱۶۰۲۳g || this.f۱۶۰۱۰g.f۱۶۰۲۲f) && ((this.f۱۶۰۱۱h.f۱۶۰۱۷e || this.f۱۶۰۱۱h.f۱۶۰۱۶d) && this.f۱۶۰۰۹f)) {
            return false;
        }
        return true;
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۸۹۷۲f() {
        if (this.f۱۶۰۰۷d.f۱۵۹۳۲c == ((this.f۱۶۰۰۶c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: j  reason: contains not printable characters */
    public synchronized List<Cc> m۱۸۹۷۶j() {
        Throwable th;
        List<Header> result;
        if (m۱۸۹۷۲f()) {
            this.f۱۶۰۱۲i.m۱۹۳۵۵g();
            while (this.f۱۶۰۰۸e == null) {
                try {
                    try {
                        if (this.f۱۶۰۱۴k != null) {
                            break;
                        }
                        m۱۸۹۷۷k();
                    } catch (Throwable th2) {
                        th = th2;
                        this.f۱۶۰۱۲i.m۱۸۹۸۹k();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.f۱۶۰۱۲i.m۱۸۹۸۹k();
                    throw th;
                }
            }
            this.f۱۶۰۱۲i.m۱۸۹۸۹k();
            result = this.f۱۶۰۰۸e;
            if (result != null) {
                this.f۱۶۰۰۸e = null;
            } else {
                throw new Cn(this.f۱۶۰۱۴k);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return result;
    }

    /* renamed from: h  reason: contains not printable characters */
    public Ct m۱۸۹۷۴h() {
        return this.f۱۶۰۱۲i;
    }

    /* renamed from: l  reason: contains not printable characters */
    public Ct m۱۸۹۷۸l() {
        return this.f۱۶۰۱۳j;
    }

    /* renamed from: e  reason: contains not printable characters */
    public AbstractCs m۱۸۹۷۱e() {
        return this.f۱۶۰۱۰g;
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractCr m۱۸۹۷۰d() {
        synchronized (this) {
            if (!this.f۱۶۰۰۹f) {
                if (!m۱۸۹۷۲f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f۱۶۰۱۱h;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۶۳a(EnumCb rstStatusCode) {
        if (m۱۸۹۶۰d(rstStatusCode)) {
            this.f۱۶۰۰۷d.m۱۸۸۹۵b(this.f۱۶۰۰۶c, rstStatusCode);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۹۶۷b(EnumCb errorCode) {
        if (m۱۸۹۶۰d(errorCode)) {
            this.f۱۶۰۰۷d.m۱۸۸۹۸c(this.f۱۶۰۰۶c, errorCode);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۸۹۶۰d(EnumCb errorCode) {
        synchronized (this) {
            if (this.f۱۶۰۱۴k != null) {
                return false;
            }
            if (this.f۱۶۰۱۰g.f۱۶۰۲۳g && this.f۱۶۰۱۱h.f۱۶۰۱۷e) {
                return false;
            }
            this.f۱۶۰۱۴k = errorCode;
            notifyAll();
            this.f۱۶۰۰۷d.m۱۸۸۹۷c(this.f۱۶۰۰۶c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۶۵a(List<Cc> list) {
        boolean open = true;
        synchronized (this) {
            this.f۱۶۰۰۹f = true;
            if (this.f۱۶۰۰۸e == null) {
                this.f۱۶۰۰۸e = list;
                open = m۱۸۹۷۳g();
                notifyAll();
            } else {
                List<Header> newHeaders = new ArrayList<>();
                newHeaders.addAll(this.f۱۶۰۰۸e);
                newHeaders.add(null);
                newHeaders.addAll(list);
                this.f۱۶۰۰۸e = newHeaders;
            }
        }
        if (!open) {
            this.f۱۶۰۰۷d.m۱۸۸۹۷c(this.f۱۶۰۰۶c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۶۴a(AbstractCe in, int length) {
        this.f۱۶۰۱۰g.m۱۸۹۸۴a(in, (long) length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۸۹۷۵i() {
        boolean open;
        synchronized (this) {
            this.f۱۶۰۱۰g.f۱۶۰۲۳g = true;
            open = m۱۸۹۷۳g();
            notifyAll();
        }
        if (!open) {
            this.f۱۶۰۰۷d.m۱۸۸۹۷c(this.f۱۶۰۰۶c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public synchronized void m۱۸۹۶۹c(EnumCb errorCode) {
        if (this.f۱۶۰۱۴k == null) {
            this.f۱۶۰۱۴k = errorCode;
            notifyAll();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.i.i$b  reason: invalid class name */
    public final class Cb implements AbstractCs {

        /* renamed from: c  reason: contains not printable characters */
        private final p۱۴۹f.Cc f۱۶۰۱۹c = new p۱۴۹f.Cc();

        /* renamed from: d  reason: contains not printable characters */
        private final p۱۴۹f.Cc f۱۶۰۲۰d = new p۱۴۹f.Cc();

        /* renamed from: e  reason: contains not printable characters */
        private final long f۱۶۰۲۱e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۱۶۰۲۲f;

        /* renamed from: g  reason: contains not printable characters */
        boolean f۱۶۰۲۳g;

        Cb(long maxByteCount) {
            this.f۱۶۰۲۱e = maxByteCount;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r5 = r10.f۱۶۰۲۴h.f۱۶۰۰۷d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r10.f۱۶۰۲۴h.f۱۶۰۰۷d.f۱۵۹۴۳n += r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r10.f۱۶۰۲۴h.f۱۶۰۰۷d.f۱۵۹۴۳n < ((long) (r10.f۱۶۰۲۴h.f۱۶۰۰۷d.f۱۵۹۴۵p.m۱۹۰۲۶c() / 2))) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
            r10.f۱۶۰۲۴h.f۱۶۰۰۷d.m۱۸۸۸۵a(0, r10.f۱۶۰۲۴h.f۱۶۰۰۷d.f۱۵۹۴۳n);
            r10.f۱۶۰۲۴h.f۱۶۰۰۷d.f۱۵۹۴۳n = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
            return r3;
         */
        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long m۱۸۹۸۵b(p۱۴۹f.Cc r11, long r12) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.Cb.m۱۸۹۸۵b(f.c, long):long");
        }

        /* renamed from: l  reason: contains not printable characters */
        private void m۱۸۹۸۳l() {
            Ci.this.f۱۶۰۱۲i.m۱۹۳۵۵g();
            while (this.f۱۶۰۲۰d.m۱۹۴۱۰q() == 0 && !this.f۱۶۰۲۳g && !this.f۱۶۰۲۲f && Ci.this.f۱۶۰۱۴k == null) {
                try {
                    Ci.this.m۱۸۹۷۷k();
                } finally {
                    Ci.this.f۱۶۰۱۲i.m۱۸۹۸۹k();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۸۴a(AbstractCe in, long byteCount) {
            boolean finished;
            boolean wasEmpty;
            boolean flowControlError;
            while (byteCount > 0) {
                synchronized (Ci.this) {
                    finished = this.f۱۶۰۲۳g;
                    wasEmpty = true;
                    flowControlError = this.f۱۶۰۲۰d.m۱۹۴۱۰q() + byteCount > this.f۱۶۰۲۱e;
                }
                if (flowControlError) {
                    in.skip(byteCount);
                    Ci.this.m۱۸۹۶۷b(EnumCb.FLOW_CONTROL_ERROR);
                    return;
                } else if (finished) {
                    in.skip(byteCount);
                    return;
                } else {
                    long read = in.m۱۹۵۵۴b(this.f۱۶۰۱۹c, byteCount);
                    if (read != -1) {
                        long byteCount2 = byteCount - read;
                        synchronized (Ci.this) {
                            if (this.f۱۶۰۲۰d.m۱۹۴۱۰q() != 0) {
                                wasEmpty = false;
                            }
                            this.f۱۶۰۲۰d.m۱۹۳۶۸a(this.f۱۶۰۱۹c);
                            if (wasEmpty) {
                                Ci.this.notifyAll();
                            }
                        }
                        byteCount = byteCount2;
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۹۸۶b() {
            return Ci.this.f۱۶۰۱۲i;
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            synchronized (Ci.this) {
                this.f۱۶۰۲۲f = true;
                this.f۱۶۰۲۰d.m۱۹۴۰۶m();
                Ci.this.notifyAll();
            }
            Ci.this.m۱۸۹۶۱a();
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۸۹۸۲d() {
            if (!this.f۱۶۰۲۲f) {
                EnumCb bVar = Ci.this.f۱۶۰۱۴k;
                if (bVar != null) {
                    throw new Cn(bVar);
                }
                return;
            }
            throw new IOException("stream closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۶۱a() {
        boolean cancel;
        boolean open;
        synchronized (this) {
            cancel = !this.f۱۶۰۱۰g.f۱۶۰۲۳g && this.f۱۶۰۱۰g.f۱۶۰۲۲f && (this.f۱۶۰۱۱h.f۱۶۰۱۷e || this.f۱۶۰۱۱h.f۱۶۰۱۶d);
            open = m۱۸۹۷۳g();
        }
        if (cancel) {
            m۱۸۹۶۳a(EnumCb.CANCEL);
        } else if (!open) {
            this.f۱۶۰۰۷d.m۱۸۸۹۷c(this.f۱۶۰۰۶c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.i$a  reason: invalid class name */
    public final class Ca implements AbstractCr {

        /* renamed from: c  reason: contains not printable characters */
        private final p۱۴۹f.Cc f۱۶۰۱۵c = new p۱۴۹f.Cc();

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۶۰۱۶d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۶۰۱۷e;

        Ca() {
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۸۰a(p۱۴۹f.Cc source, long byteCount) {
            this.f۱۶۰۱۵c.m۱۹۳۸۰a(source, byteCount);
            while (this.f۱۶۰۱۵c.m۱۹۴۱۰q() >= 16384) {
                m۱۸۹۷۹a(false);
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۹۷۹a(boolean outFinished) {
            long toWrite;
            synchronized (Ci.this) {
                Ci.this.f۱۶۰۱۳j.m۱۹۳۵۵g();
                while (Ci.this.f۱۶۰۰۵b <= 0 && !this.f۱۶۰۱۷e && !this.f۱۶۰۱۶d && Ci.this.f۱۶۰۱۴k == null) {
                    try {
                        Ci.this.m۱۸۹۷۷k();
                    } catch (Throwable th) {
                        Ci.this.f۱۶۰۱۳j.m۱۸۹۸۹k();
                        throw th;
                    }
                }
                Ci.this.f۱۶۰۱۳j.m۱۸۹۸۹k();
                Ci.this.m۱۸۹۶۶b();
                toWrite = Math.min(Ci.this.f۱۶۰۰۵b, this.f۱۶۰۱۵c.m۱۹۴۱۰q());
                Ci.this.f۱۶۰۰۵b -= toWrite;
            }
            Ci.this.f۱۶۰۱۳j.m۱۹۳۵۵g();
            try {
                Ci.this.f۱۶۰۰۷d.m۱۸۸۹۰a(Ci.this.f۱۶۰۰۶c, outFinished && toWrite == this.f۱۶۰۱۵c.m۱۹۴۱۰q(), this.f۱۶۰۱۵c, toWrite);
            } finally {
                Ci.this.f۱۶۰۱۳j.m۱۸۹۸۹k();
            }
        }

        @Override // p۱۴۹f.AbstractCr, java.io.Flushable
        public void flush() {
            synchronized (Ci.this) {
                Ci.this.m۱۸۹۶۶b();
            }
            while (this.f۱۶۰۱۵c.m۱۹۴۱۰q() > 0) {
                m۱۸۹۷۹a(false);
                Ci.this.f۱۶۰۰۷d.flush();
            }
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۹۸۱b() {
            return Ci.this.f۱۶۰۱۳j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f۱۶۰۱۵c.m۱۹۴۱۰q() <= 0) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
            if (r8.f۱۶۰۱۵c.m۱۹۴۱۰q() <= 0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
            m۱۸۹۷۹a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
            r0 = r8.f۱۶۰۱۸f;
            r0.f۱۶۰۰۷d.m۱۸۸۹۰a(r0.f۱۶۰۰۶c, true, (p۱۴۹f.Cc) null, 0L);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
            r2 = r8.f۱۶۰۱۸f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f۱۶۰۱۶d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            r8.f۱۶۰۱۸f.f۱۶۰۰۷d.flush();
            r8.f۱۶۰۱۸f.m۱۸۹۶۱a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r8.f۱۶۰۱۸f.f۱۶۰۱۱h.f۱۶۰۱۷e != false) goto L_0x003b;
         */
        @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                e.f0.i.i r0 = p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.this
                monitor-enter(r0)
                boolean r1 = r8.f۱۶۰۱۶d     // Catch:{ all -> 0x0051 }
                if (r1 == 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0051 }
                return
            L_0x000a:
                monitor-exit(r0)     // Catch:{ all -> 0x0051 }
                e.f0.i.i r0 = p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.this
                e.f0.i.i$a r0 = r0.f۱۶۰۱۱h
                boolean r0 = r0.f۱۶۰۱۷e
                r1 = 1
                if (r0 != 0) goto L_0x003b
                f.c r0 = r8.f۱۶۰۱۵c
                long r2 = r0.m۱۹۴۱۰q()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002e
            L_0x0020:
                f.c r0 = r8.f۱۶۰۱۵c
                long r2 = r0.m۱۹۴۱۰q()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003b
                r8.m۱۸۹۷۹a(r1)
                goto L_0x0020
            L_0x002e:
                e.f0.i.i r0 = p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.this
                e.f0.i.g r2 = r0.f۱۶۰۰۷d
                int r3 = r0.f۱۶۰۰۶c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.m۱۸۸۹۰a(r3, r4, r5, r6)
            L_0x003b:
                e.f0.i.i r2 = p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.this
                monitor-enter(r2)
                r8.f۱۶۰۱۶d = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r2)     // Catch:{ all -> 0x004e }
                e.f0.i.i r0 = p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.this
                e.f0.i.g r0 = r0.f۱۶۰۰۷d
                r0.flush()
                e.f0.i.i r0 = p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.this
                r0.m۱۸۹۶۱a()
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
            throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci.Ca.close():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۹۶۲a(long delta) {
        this.f۱۶۰۰۵b += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۹۶۶b() {
        Ca aVar = this.f۱۶۰۱۱h;
        if (aVar.f۱۶۰۱۶d) {
            throw new IOException("stream closed");
        } else if (!aVar.f۱۶۰۱۷e) {
            EnumCb bVar = this.f۱۶۰۱۴k;
            if (bVar != null) {
                throw new Cn(bVar);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public void m۱۸۹۷۷k() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.i$c  reason: invalid class name */
    public class Cc extends p۱۴۹f.Ca {
        Cc() {
        }

        /* access modifiers changed from: protected */
        @Override // p۱۴۹f.Ca
        /* renamed from: i  reason: contains not printable characters */
        public void m۱۸۹۸۸i() {
            Ci.this.m۱۸۹۶۷b(EnumCb.CANCEL);
        }

        /* access modifiers changed from: protected */
        @Override // p۱۴۹f.Ca
        /* renamed from: b  reason: contains not printable characters */
        public IOException m۱۸۹۸۷b(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        /* renamed from: k  reason: contains not printable characters */
        public void m۱۸۹۸۹k() {
            if (m۱۹۳۵۶h()) {
                throw m۱۸۹۸۷b((IOException) null);
            }
        }
    }
}
