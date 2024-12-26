package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Header;
import p۳۰۵f.Ca;
import p۳۰۵f.Cc;
import p۳۰۵f.Ct;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.i.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ci {

    /* renamed from: b, reason: contains not printable characters */
    long f۱۶۰۰۵b;

    /* renamed from: c, reason: contains not printable characters */
    final int f۱۶۰۰۶c;

    /* renamed from: d, reason: contains not printable characters */
    final Cg f۱۶۰۰۷d;

    /* renamed from: e, reason: contains not printable characters */
    private List<Cc> f۱۶۰۰۸e;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۱۶۰۰۹f;

    /* renamed from: g, reason: contains not printable characters */
    private final b f۱۶۰۱۰g;

    /* renamed from: h, reason: contains not printable characters */
    final a f۱۶۰۱۱h;

    /* renamed from: a, reason: contains not printable characters */
    long f۱۶۰۰۴a = 0;

    /* renamed from: i, reason: contains not printable characters */
    final c f۱۶۰۱۲i = new c();

    /* renamed from: j, reason: contains not printable characters */
    final c f۱۶۰۱۳j = new c();

    /* renamed from: k, reason: contains not printable characters */
    EnumCb f۱۶۰۱۴k = null;

    Ci(int id, Cg connection, boolean outFinished, boolean inFinished, List<Cc> list) {
        if (connection == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f۱۶۰۰۶c = id;
        this.f۱۶۰۰۷d = connection;
        this.f۱۶۰۰۵b = connection.f۱۵۹۴۶q.m۱۶۹۴۷c();
        this.f۱۶۰۱۰g = new b(connection.f۱۵۹۴۵p.m۱۶۹۴۷c());
        this.f۱۶۰۱۱h = new a();
        this.f۱۶۰۱۰g.f۱۶۰۲۳g = inFinished;
        this.f۱۶۰۱۱h.f۱۶۰۱۷e = outFinished;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۶۸۸۹c() {
        return this.f۱۶۰۰۶c;
    }

    /* renamed from: g, reason: contains not printable characters */
    public synchronized boolean m۱۶۸۹۴g() {
        if (this.f۱۶۰۱۴k != null) {
            return false;
        }
        if ((this.f۱۶۰۱۰g.f۱۶۰۲۳g || this.f۱۶۰۱۰g.f۱۶۰۲۲f) && (this.f۱۶۰۱۱h.f۱۶۰۱۷e || this.f۱۶۰۱۱h.f۱۶۰۱۶d)) {
            if (this.f۱۶۰۰۹f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f, reason: contains not printable characters */
    public boolean m۱۶۸۹۳f() {
        boolean streamIsClient = (this.f۱۶۰۰۶c & 1) == 1;
        return this.f۱۶۰۰۷d.f۱۵۹۳۲c == streamIsClient;
    }

    /* renamed from: j, reason: contains not printable characters */
    public synchronized List<Cc> m۱۶۸۹۷j() {
        List<Cc> list;
        if (!m۱۶۸۹۳f()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.f۱۶۰۱۲i.m۱۷۲۷۷g();
        while (this.f۱۶۰۰۸e == null) {
            try {
                try {
                    if (this.f۱۶۰۱۴k != null) {
                        break;
                    }
                    m۱۶۸۹۸k();
                } catch (Throwable th) {
                    th = th;
                    this.f۱۶۰۱۲i.m۱۶۹۱۰k();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.f۱۶۰۱۲i.m۱۶۹۱۰k();
        list = this.f۱۶۰۰۸e;
        if (list != null) {
            this.f۱۶۰۰۸e = null;
        } else {
            throw new Cn(this.f۱۶۰۱۴k);
        }
        return list;
    }

    /* renamed from: h, reason: contains not printable characters */
    public Ct m۱۶۸۹۵h() {
        return this.f۱۶۰۱۲i;
    }

    /* renamed from: l, reason: contains not printable characters */
    public Ct m۱۶۸۹۹l() {
        return this.f۱۶۰۱۳j;
    }

    /* renamed from: e, reason: contains not printable characters */
    public InterfaceCs m۱۶۸۹۲e() {
        return this.f۱۶۰۱۰g;
    }

    /* renamed from: d, reason: contains not printable characters */
    public InterfaceCr m۱۶۸۹۱d() {
        synchronized (this) {
            if (!this.f۱۶۰۰۹f && !m۱۶۸۹۳f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f۱۶۰۱۱h;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۸۸۴a(EnumCb rstStatusCode) {
        if (!m۱۶۸۸۱d(rstStatusCode)) {
            return;
        }
        this.f۱۶۰۰۷d.m۱۶۸۱۶b(this.f۱۶۰۰۶c, rstStatusCode);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۶۸۸۸b(EnumCb errorCode) {
        if (!m۱۶۸۸۱d(errorCode)) {
            return;
        }
        this.f۱۶۰۰۷d.m۱۶۸۱۹c(this.f۱۶۰۰۶c, errorCode);
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۱۶۸۸۱d(EnumCb errorCode) {
        synchronized (this) {
            if (this.f۱۶۰۱۴k != null) {
                return false;
            }
            if (this.f۱۶۰۱۰g.f۱۶۰۲۳g && this.f۱۶۰۱۱h.f۱۶۰۱۷e) {
                return false;
            }
            this.f۱۶۰۱۴k = errorCode;
            notifyAll();
            this.f۱۶۰۰۷d.m۱۶۸۱۸c(this.f۱۶۰۰۶c);
            return true;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۸۶a(List<Cc> list) {
        boolean open = true;
        synchronized (this) {
            this.f۱۶۰۰۹f = true;
            if (this.f۱۶۰۰۸e == null) {
                this.f۱۶۰۰۸e = list;
                open = m۱۶۸۹۴g();
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
            this.f۱۶۰۰۷d.m۱۶۸۱۸c(this.f۱۶۰۰۶c);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۸۵a(InterfaceCe in, int length) {
        this.f۱۶۰۱۰g.m۱۶۹۰۵a(in, length);
    }

    /* renamed from: i, reason: contains not printable characters */
    void m۱۶۸۹۶i() {
        boolean open;
        synchronized (this) {
            this.f۱۶۰۱۰g.f۱۶۰۲۳g = true;
            open = m۱۶۸۹۴g();
            notifyAll();
        }
        if (!open) {
            this.f۱۶۰۰۷d.m۱۶۸۱۸c(this.f۱۶۰۰۶c);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    synchronized void m۱۶۸۹۰c(EnumCb errorCode) {
        if (this.f۱۶۰۱۴k == null) {
            this.f۱۶۰۱۴k = errorCode;
            notifyAll();
        }
    }

    /* renamed from: e.f0.i.i$b */
    private final class b implements InterfaceCs {

        /* renamed from: c, reason: contains not printable characters */
        private final Cc f۱۶۰۱۹c = new Cc();

        /* renamed from: d, reason: contains not printable characters */
        private final Cc f۱۶۰۲۰d = new Cc();

        /* renamed from: e, reason: contains not printable characters */
        private final long f۱۶۰۲۱e;

        /* renamed from: f, reason: contains not printable characters */
        boolean f۱۶۰۲۲f;

        /* renamed from: g, reason: contains not printable characters */
        boolean f۱۶۰۲۳g;

        b(long maxByteCount) {
            this.f۱۶۰۲۱e = maxByteCount;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            synchronized (Ci.this) {
                m۱۶۹۰۴l();
                m۱۶۹۰۳d();
                if (this.f۱۶۰۲۰d.m۱۷۳۳۲q() == 0) {
                    return -1L;
                }
                long read = this.f۱۶۰۲۰d.mo۱۷۴۷۷b(sink, Math.min(byteCount, this.f۱۶۰۲۰d.m۱۷۳۳۲q()));
                Ci.this.f۱۶۰۰۴a += read;
                if (Ci.this.f۱۶۰۰۴a >= Ci.this.f۱۶۰۰۷d.f۱۵۹۴۵p.m۱۶۹۴۷c() / 2) {
                    Ci.this.f۱۶۰۰۷d.m۱۶۸۰۶a(Ci.this.f۱۶۰۰۶c, Ci.this.f۱۶۰۰۴a);
                    Ci.this.f۱۶۰۰۴a = 0L;
                }
                synchronized (Ci.this.f۱۶۰۰۷d) {
                    Ci.this.f۱۶۰۰۷d.f۱۵۹۴۳n += read;
                    if (Ci.this.f۱۶۰۰۷d.f۱۵۹۴۳n >= Ci.this.f۱۶۰۰۷d.f۱۵۹۴۵p.m۱۶۹۴۷c() / 2) {
                        Ci.this.f۱۶۰۰۷d.m۱۶۸۰۶a(0, Ci.this.f۱۶۰۰۷d.f۱۵۹۴۳n);
                        Ci.this.f۱۶۰۰۷d.f۱۵۹۴۳n = 0L;
                    }
                }
                return read;
            }
        }

        /* renamed from: l, reason: contains not printable characters */
        private void m۱۶۹۰۴l() {
            Ci.this.f۱۶۰۱۲i.m۱۷۲۷۷g();
            while (this.f۱۶۰۲۰d.m۱۷۳۳۲q() == 0 && !this.f۱۶۰۲۳g && !this.f۱۶۰۲۲f && Ci.this.f۱۶۰۱۴k == null) {
                try {
                    Ci.this.m۱۶۸۹۸k();
                } finally {
                    Ci.this.f۱۶۰۱۲i.m۱۶۹۱۰k();
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۹۰۵a(InterfaceCe in, long byteCount) {
            boolean finished;
            boolean z;
            boolean flowControlError;
            while (byteCount > 0) {
                synchronized (Ci.this) {
                    finished = this.f۱۶۰۲۳g;
                    z = true;
                    flowControlError = this.f۱۶۰۲۰d.m۱۷۳۳۲q() + byteCount > this.f۱۶۰۲۱e;
                }
                if (flowControlError) {
                    in.skip(byteCount);
                    Ci.this.m۱۶۸۸۸b(EnumCb.FLOW_CONTROL_ERROR);
                    return;
                }
                if (finished) {
                    in.skip(byteCount);
                    return;
                }
                long read = in.mo۱۷۴۷۷b(this.f۱۶۰۱۹c, byteCount);
                if (read == -1) {
                    throw new EOFException();
                }
                long byteCount2 = byteCount - read;
                synchronized (Ci.this) {
                    if (this.f۱۶۰۲۰d.m۱۷۳۳۲q() != 0) {
                        z = false;
                    }
                    boolean wasEmpty = z;
                    this.f۱۶۰۲۰d.m۱۷۲۹۰a(this.f۱۶۰۱۹c);
                    if (wasEmpty) {
                        Ci.this.notifyAll();
                    }
                }
                byteCount = byteCount2;
            }
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۸b() {
            return Ci.this.f۱۶۰۱۲i;
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (Ci.this) {
                this.f۱۶۰۲۲f = true;
                this.f۱۶۰۲۰d.m۱۷۳۲۸m();
                Ci.this.notifyAll();
            }
            Ci.this.m۱۶۸۸۲a();
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۶۹۰۳d() {
            if (this.f۱۶۰۲۲f) {
                throw new IOException("stream closed");
            }
            EnumCb enumCb = Ci.this.f۱۶۰۱۴k;
            if (enumCb != null) {
                throw new Cn(enumCb);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۸۲a() {
        boolean cancel;
        boolean open;
        synchronized (this) {
            cancel = !this.f۱۶۰۱۰g.f۱۶۰۲۳g && this.f۱۶۰۱۰g.f۱۶۰۲۲f && (this.f۱۶۰۱۱h.f۱۶۰۱۷e || this.f۱۶۰۱۱h.f۱۶۰۱۶d);
            open = m۱۶۸۹۴g();
        }
        if (cancel) {
            m۱۶۸۸۴a(EnumCb.CANCEL);
        } else if (!open) {
            this.f۱۶۰۰۷d.m۱۶۸۱۸c(this.f۱۶۰۰۶c);
        }
    }

    /* renamed from: e.f0.i.i$a */
    final class a implements InterfaceCr {

        /* renamed from: c, reason: contains not printable characters */
        private final Cc f۱۶۰۱۵c = new Cc();

        /* renamed from: d, reason: contains not printable characters */
        boolean f۱۶۰۱۶d;

        /* renamed from: e, reason: contains not printable characters */
        boolean f۱۶۰۱۷e;

        a() {
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(Cc source, long byteCount) {
            this.f۱۶۰۱۵c.mo۱۷۴۷۵a(source, byteCount);
            while (this.f۱۶۰۱۵c.m۱۷۳۳۲q() >= 16384) {
                m۱۶۹۰۰a(false);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۹۰۰a(boolean outFinished) {
            long toWrite;
            synchronized (Ci.this) {
                Ci.this.f۱۶۰۱۳j.m۱۷۲۷۷g();
                while (Ci.this.f۱۶۰۰۵b <= 0 && !this.f۱۶۰۱۷e && !this.f۱۶۰۱۶d && Ci.this.f۱۶۰۱۴k == null) {
                    try {
                        Ci.this.m۱۶۸۹۸k();
                    } finally {
                    }
                }
                Ci.this.f۱۶۰۱۳j.m۱۶۹۱۰k();
                Ci.this.m۱۶۸۸۷b();
                toWrite = Math.min(Ci.this.f۱۶۰۰۵b, this.f۱۶۰۱۵c.m۱۷۳۳۲q());
                Ci.this.f۱۶۰۰۵b -= toWrite;
            }
            Ci.this.f۱۶۰۱۳j.m۱۷۲۷۷g();
            try {
                Ci.this.f۱۶۰۰۷d.m۱۶۸۱۱a(Ci.this.f۱۶۰۰۶c, outFinished && toWrite == this.f۱۶۰۱۵c.m۱۷۳۳۲q(), this.f۱۶۰۱۵c, toWrite);
            } finally {
            }
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
        public void flush() {
            synchronized (Ci.this) {
                Ci.this.m۱۶۸۸۷b();
            }
            while (this.f۱۶۰۱۵c.m۱۷۳۳۲q() > 0) {
                m۱۶۹۰۰a(false);
                Ci.this.f۱۶۰۰۷d.flush();
            }
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۶b() {
            return Ci.this.f۱۶۰۱۳j;
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (Ci.this) {
                if (this.f۱۶۰۱۶d) {
                    return;
                }
                if (!Ci.this.f۱۶۰۱۱h.f۱۶۰۱۷e) {
                    if (this.f۱۶۰۱۵c.m۱۷۳۳۲q() > 0) {
                        while (this.f۱۶۰۱۵c.m۱۷۳۳۲q() > 0) {
                            m۱۶۹۰۰a(true);
                        }
                    } else {
                        Ci ci = Ci.this;
                        ci.f۱۶۰۰۷d.m۱۶۸۱۱a(ci.f۱۶۰۰۶c, true, (Cc) null, 0L);
                    }
                }
                synchronized (Ci.this) {
                    this.f۱۶۰۱۶d = true;
                }
                Ci.this.f۱۶۰۰۷d.flush();
                Ci.this.m۱۶۸۸۲a();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۸۳a(long delta) {
        this.f۱۶۰۰۵b += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۶۸۸۷b() {
        a aVar = this.f۱۶۰۱۱h;
        if (aVar.f۱۶۰۱۶d) {
            throw new IOException("stream closed");
        }
        if (aVar.f۱۶۰۱۷e) {
            throw new IOException("stream finished");
        }
        EnumCb enumCb = this.f۱۶۰۱۴k;
        if (enumCb != null) {
            throw new Cn(enumCb);
        }
    }

    /* renamed from: k, reason: contains not printable characters */
    void m۱۶۸۹۸k() {
        try {
            wait();
        } catch (InterruptedException e2) {
            throw new InterruptedIOException();
        }
    }

    /* renamed from: e.f0.i.i$c */
    class c extends Ca {
        c() {
        }

        @Override // p۳۰۵f.Ca
        /* renamed from: i, reason: contains not printable characters */
        protected void mo۱۷۴۲۳i() {
            Ci.this.m۱۶۸۸۸b(EnumCb.CANCEL);
        }

        @Override // p۳۰۵f.Ca
        /* renamed from: b, reason: contains not printable characters */
        protected IOException mo۱۷۴۲۲b(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        /* renamed from: k, reason: contains not printable characters */
        public void m۱۶۹۱۰k() {
            if (m۱۷۲۷۸h()) {
                throw mo۱۷۴۲۲b((IOException) null);
            }
        }
    }
}
