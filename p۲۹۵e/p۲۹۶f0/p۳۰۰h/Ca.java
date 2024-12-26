package p۲۹۵e.p۲۹۶f0.p۳۰۰h;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p۲۹۵e.AbstractCb0;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cr;
import p۲۹۵e.Cs;
import p۲۹۵e.Cv;
import p۲۹۵e.Cy;
import p۲۹۵e.p۲۹۶f0.AbstractCa;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ce;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ch;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ci;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ck;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc;
import p۳۰۵f.Cc;
import p۳۰۵f.Cl;
import p۳۰۵f.Ct;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.h.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca implements InterfaceCc {

    /* renamed from: a, reason: contains not printable characters */
    final Cv f۱۵۸۴۶a;

    /* renamed from: b, reason: contains not printable characters */
    final Cg f۱۵۸۴۷b;

    /* renamed from: c, reason: contains not printable characters */
    final InterfaceCe f۱۵۸۴۸c;

    /* renamed from: d, reason: contains not printable characters */
    final InterfaceCd f۱۵۸۴۹d;

    /* renamed from: e, reason: contains not printable characters */
    int f۱۵۸۵۰e = 0;

    /* renamed from: f, reason: contains not printable characters */
    private long f۱۵۸۵۱f = 262144;

    public Ca(Cv client, Cg streamAllocation, InterfaceCe source, InterfaceCd sink) {
        this.f۱۵۸۴۶a = client;
        this.f۱۵۸۴۷b = streamAllocation;
        this.f۱۵۸۴۸c = source;
        this.f۱۵۸۴۹d = sink;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCr mo۱۶۷۹۲a(Cy request, long contentLength) {
        if ("chunked".equalsIgnoreCase(request.m۱۷۲۴۴a("Transfer-Encoding"))) {
            return m۱۶۷۴۲c();
        }
        if (contentLength != -1) {
            return m۱۶۷۳۳a(contentLength);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۷۹۴a(Cy request) {
        String requestLine = Ci.m۱۶۷۱۸a(request, this.f۱۵۸۴۷b.m۱۶۶۶۷b().m۱۶۶۳۶c().m۱۶۴۹۰b().type());
        m۱۶۷۳۷a(request.m۱۷۲۴۷c(), requestLine);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb0 mo۱۶۷۹۱a(Ca0 response) {
        Cg cg = this.f۱۵۸۴۷b;
        cg.f۱۵۸۰۹f.m۱۷۱۰۸e(cg.f۱۵۸۰۸e);
        String contentType = response.m۱۶۴۲۴b("Content-Type");
        if (!Ce.m۱۶۶۹۳b(response)) {
            InterfaceCs source = m۱۶۷۴۰b(0L);
            return new Ch(contentType, 0L, Cl.m۱۷۴۰۳a(source));
        }
        if ("chunked".equalsIgnoreCase(response.m۱۶۴۲۴b("Transfer-Encoding"))) {
            InterfaceCs source2 = m۱۶۷۳۵a(response.m۱۶۴۳۸y().m۱۷۲۵۱g());
            return new Ch(contentType, -1L, Cl.m۱۷۴۰۳a(source2));
        }
        long contentLength = Ce.m۱۶۶۸۶a(response);
        if (contentLength != -1) {
            InterfaceCs source3 = m۱۶۷۴۰b(contentLength);
            return new Ch(contentType, contentLength, Cl.m۱۷۴۰۳a(source3));
        }
        return new Ch(contentType, -1L, Cl.m۱۷۴۰۳a(m۱۶۷۴۳d()));
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۶۷۹۵b() {
        this.f۱۵۸۴۹d.flush();
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۷۹۳a() {
        this.f۱۵۸۴۹d.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۷۳۷a(Cr headers, String requestLine) {
        if (this.f۱۵۸۵۰e != 0) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        this.f۱۵۸۴۹d.mo۱۷۴۲۶a(requestLine).mo۱۷۴۲۶a("\r\n");
        int size = headers.m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            this.f۱۵۸۴۹d.mo۱۷۴۲۶a(headers.m۱۷۱۲۱a(i)).mo۱۷۴۲۶a(": ").mo۱۷۴۲۶a(headers.m۱۷۱۲۴b(i)).mo۱۷۴۲۶a("\r\n");
        }
        this.f۱۵۸۴۹d.mo۱۷۴۲۶a("\r\n");
        this.f۱۵۸۵۰e = 1;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public Ca0.a mo۱۶۷۹۰a(boolean expectContinue) {
        int i = this.f۱۵۸۵۰e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        try {
            Ck statusLine = Ck.m۱۶۷۲۹a(m۱۶۷۳۰f());
            Ca0.a responseBuilder = new Ca0.a();
            responseBuilder.m۱۶۴۴۸a(statusLine.f۱۵۸۴۳a);
            responseBuilder.m۱۶۴۴۲a(statusLine.f۱۵۸۴۴b);
            responseBuilder.m۱۶۴۵۰a(statusLine.f۱۵۸۴۵c);
            responseBuilder.m۱۶۴۴۷a(m۱۶۷۴۴e());
            if (!expectContinue || statusLine.f۱۵۸۴۴b != 100) {
                if (statusLine.f۱۵۸۴۴b == 100) {
                    this.f۱۵۸۵۰e = 3;
                    return responseBuilder;
                }
                this.f۱۵۸۵۰e = 4;
                return responseBuilder;
            }
            return null;
        } catch (EOFException e2) {
            IOException exception = new IOException("unexpected end of stream on " + this.f۱۵۸۴۷b);
            exception.initCause(e2);
            throw exception;
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    private String m۱۶۷۳۰f() {
        String line = this.f۱۵۸۴۸c.mo۱۷۴۴۰c(this.f۱۵۸۵۱f);
        this.f۱۵۸۵۱f -= line.length();
        return line;
    }

    /* renamed from: e, reason: contains not printable characters */
    public Cr m۱۶۷۴۴e() {
        Cr.a headers = new Cr.a();
        while (true) {
            String line = m۱۶۷۳۰f();
            if (line.length() != 0) {
                AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۳a(headers, line);
            } else {
                return headers.m۱۷۱۲۹a();
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public InterfaceCr m۱۶۷۴۲c() {
        if (this.f۱۵۸۵۰e != 1) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        this.f۱۵۸۵۰e = 2;
        return new c();
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCr m۱۶۷۳۳a(long contentLength) {
        if (this.f۱۵۸۵۰e != 1) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        this.f۱۵۸۵۰e = 2;
        return new e(contentLength);
    }

    /* renamed from: b, reason: contains not printable characters */
    public InterfaceCs m۱۶۷۴۰b(long length) {
        if (this.f۱۵۸۵۰e != 4) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        this.f۱۵۸۵۰e = 5;
        return new f(this, length);
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCs m۱۶۷۳۵a(Cs url) {
        if (this.f۱۵۸۵۰e != 4) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        this.f۱۵۸۵۰e = 5;
        return new d(url);
    }

    /* renamed from: d, reason: contains not printable characters */
    public InterfaceCs m۱۶۷۴۳d() {
        if (this.f۱۵۸۵۰e != 4) {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
        Cg cg = this.f۱۵۸۴۷b;
        if (cg == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f۱۵۸۵۰e = 5;
        cg.m۱۶۶۶۹d();
        return new g(this);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۷۳۹a(p۳۰۵f.Ci timeout) {
        Ct oldDelegate = timeout.m۱۷۳۹۱g();
        timeout.m۱۷۳۸۳a(Ct.f۱۶۳۱۳d);
        oldDelegate.mo۱۷۴۷۹a();
        oldDelegate.mo۱۷۴۸۲b();
    }

    /* renamed from: e.f0.h.a$e */
    private final class e implements InterfaceCr {

        /* renamed from: c, reason: contains not printable characters */
        private final p۳۰۵f.Ci f۱۵۸۶۳c;

        /* renamed from: d, reason: contains not printable characters */
        private boolean f۱۵۸۶۴d;

        /* renamed from: e, reason: contains not printable characters */
        private long f۱۵۸۶۵e;

        e(long bytesRemaining) {
            this.f۱۵۸۶۳c = new p۳۰۵f.Ci(Ca.this.f۱۵۸۴۹d.mo۱۷۴۷۶b());
            this.f۱۵۸۶۵e = bytesRemaining;
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۶b() {
            return this.f۱۵۸۶۳c;
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(Cc source, long byteCount) {
            if (this.f۱۵۸۶۴d) {
                throw new IllegalStateException("closed");
            }
            p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۱a(source.m۱۷۳۳۲q(), 0L, byteCount);
            if (byteCount > this.f۱۵۸۶۵e) {
                throw new ProtocolException("expected " + this.f۱۵۸۶۵e + " bytes but received " + byteCount);
            }
            Ca.this.f۱۵۸۴۹d.mo۱۷۴۷۵a(source, byteCount);
            this.f۱۵۸۶۵e -= byteCount;
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
        public void flush() {
            if (this.f۱۵۸۶۴d) {
                return;
            }
            Ca.this.f۱۵۸۴۹d.flush();
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f۱۵۸۶۴d) {
                return;
            }
            this.f۱۵۸۶۴d = true;
            if (this.f۱۵۸۶۵e > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Ca.this.m۱۶۷۳۹a(this.f۱۵۸۶۳c);
            Ca.this.f۱۵۸۵۰e = 3;
        }
    }

    /* renamed from: e.f0.h.a$c */
    private final class c implements InterfaceCr {

        /* renamed from: c, reason: contains not printable characters */
        private final p۳۰۵f.Ci f۱۵۸۵۶c;

        /* renamed from: d, reason: contains not printable characters */
        private boolean f۱۵۸۵۷d;

        c() {
            this.f۱۵۸۵۶c = new p۳۰۵f.Ci(Ca.this.f۱۵۸۴۹d.mo۱۷۴۷۶b());
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۶b() {
            return this.f۱۵۸۵۶c;
        }

        @Override // p۳۰۵f.InterfaceCr
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۴۷۵a(Cc source, long byteCount) {
            if (this.f۱۵۸۵۷d) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            Ca.this.f۱۵۸۴۹d.mo۱۷۴۲۵a(byteCount);
            Ca.this.f۱۵۸۴۹d.mo۱۷۴۲۶a("\r\n");
            Ca.this.f۱۵۸۴۹d.mo۱۷۴۷۵a(source, byteCount);
            Ca.this.f۱۵۸۴۹d.mo۱۷۴۲۶a("\r\n");
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
        public synchronized void flush() {
            if (this.f۱۵۸۵۷d) {
                return;
            }
            Ca.this.f۱۵۸۴۹d.flush();
        }

        @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f۱۵۸۵۷d) {
                return;
            }
            this.f۱۵۸۵۷d = true;
            Ca.this.f۱۵۸۴۹d.mo۱۷۴۲۶a("0\r\n\r\n");
            Ca.this.m۱۶۷۳۹a(this.f۱۵۸۵۶c);
            Ca.this.f۱۵۸۵۰e = 3;
        }
    }

    /* renamed from: e.f0.h.a$b */
    private abstract class b implements InterfaceCs {

        /* renamed from: c, reason: contains not printable characters */
        protected final p۳۰۵f.Ci f۱۵۸۵۲c;

        /* renamed from: d, reason: contains not printable characters */
        protected boolean f۱۵۸۵۳d;

        /* renamed from: e, reason: contains not printable characters */
        protected long f۱۵۸۵۴e;

        private b() {
            this.f۱۵۸۵۲c = new p۳۰۵f.Ci(Ca.this.f۱۵۸۴۸c.mo۱۷۴۷۸b());
            this.f۱۵۸۵۴e = 0L;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public Ct mo۱۷۴۷۸b() {
            return this.f۱۵۸۵۲c;
        }

        @Override // p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            try {
                long read = Ca.this.f۱۵۸۴۸c.mo۱۷۴۷۷b(sink, byteCount);
                if (read > 0) {
                    this.f۱۵۸۵۴e += read;
                }
                return read;
            } catch (IOException e2) {
                m۱۶۷۴۵a(false, e2);
                throw e2;
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        protected final void m۱۶۷۴۵a(boolean reuseConnection, IOException e2) {
            Ca ca = Ca.this;
            int i = ca.f۱۵۸۵۰e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + Ca.this.f۱۵۸۵۰e);
            }
            ca.m۱۶۷۳۹a(this.f۱۵۸۵۲c);
            Ca ca2 = Ca.this;
            ca2.f۱۵۸۵۰e = 6;
            Cg cg = ca2.f۱۵۸۴۷b;
            if (cg != null) {
                cg.m۱۶۶۶۶a(!reuseConnection, ca2, this.f۱۵۸۵۴e, e2);
            }
        }
    }

    /* renamed from: e.f0.h.a$f */
    private class f extends b {

        /* renamed from: g, reason: contains not printable characters */
        private long f۱۵۸۶۷g;

        f(Ca ca, long length) {
            super();
            this.f۱۵۸۶۷g = length;
            if (this.f۱۵۸۶۷g == 0) {
                m۱۶۷۴۵a(true, null);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۰h.Ca.b, p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            if (this.f۱۵۸۵۳d) {
                throw new IllegalStateException("closed");
            }
            long j = this.f۱۵۸۶۷g;
            if (j == 0) {
                return -1L;
            }
            long read = super.mo۱۷۴۷۷b(sink, Math.min(j, byteCount));
            if (read == -1) {
                ProtocolException e2 = new ProtocolException("unexpected end of stream");
                m۱۶۷۴۵a(false, e2);
                throw e2;
            }
            this.f۱۵۸۶۷g -= read;
            if (this.f۱۵۸۶۷g == 0) {
                m۱۶۷۴۵a(true, null);
            }
            return read;
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f۱۵۸۵۳d) {
                return;
            }
            if (this.f۱۵۸۶۷g != 0 && !p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۴a(this, 100, TimeUnit.MILLISECONDS)) {
                m۱۶۷۴۵a(false, null);
            }
            this.f۱۵۸۵۳d = true;
        }
    }

    /* renamed from: e.f0.h.a$d */
    private class d extends b {

        /* renamed from: g, reason: contains not printable characters */
        private final Cs f۱۵۸۵۹g;

        /* renamed from: h, reason: contains not printable characters */
        private long f۱۵۸۶۰h;

        /* renamed from: i, reason: contains not printable characters */
        private boolean f۱۵۸۶۱i;

        d(Cs url) {
            super();
            this.f۱۵۸۶۰h = -1L;
            this.f۱۵۸۶۱i = true;
            this.f۱۵۸۵۹g = url;
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۰h.Ca.b, p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            if (this.f۱۵۸۵۳d) {
                throw new IllegalStateException("closed");
            }
            if (!this.f۱۵۸۶۱i) {
                return -1L;
            }
            long j = this.f۱۵۸۶۰h;
            if (j == 0 || j == -1) {
                m۱۶۷۵۰d();
                if (!this.f۱۵۸۶۱i) {
                    return -1L;
                }
            }
            long read = super.mo۱۷۴۷۷b(sink, Math.min(byteCount, this.f۱۵۸۶۰h));
            if (read == -1) {
                ProtocolException e2 = new ProtocolException("unexpected end of stream");
                m۱۶۷۴۵a(false, e2);
                throw e2;
            }
            this.f۱۵۸۶۰h -= read;
            return read;
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۶۷۵۰d() {
            if (this.f۱۵۸۶۰h != -1) {
                Ca.this.f۱۵۸۴۸c.mo۱۷۴۴۴f();
            }
            try {
                this.f۱۵۸۶۰h = Ca.this.f۱۵۸۴۸c.mo۱۷۴۴۹j();
                String extensions = Ca.this.f۱۵۸۴۸c.mo۱۷۴۴۴f().trim();
                if (this.f۱۵۸۶۰h < 0 || !(extensions.isEmpty() || extensions.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f۱۵۸۶۰h + extensions + "\"");
                }
                if (this.f۱۵۸۶۰h == 0) {
                    this.f۱۵۸۶۱i = false;
                    Ce.m۱۶۶۹۰a(Ca.this.f۱۵۸۴۶a.m۱۷۱۹۹g(), this.f۱۵۸۵۹g, Ca.this.m۱۶۷۴۴e());
                    m۱۶۷۴۵a(true, null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f۱۵۸۵۳d) {
                return;
            }
            if (this.f۱۵۸۶۱i && !p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۴a(this, 100, TimeUnit.MILLISECONDS)) {
                m۱۶۷۴۵a(false, null);
            }
            this.f۱۵۸۵۳d = true;
        }
    }

    /* renamed from: e.f0.h.a$g */
    private class g extends b {

        /* renamed from: g, reason: contains not printable characters */
        private boolean f۱۵۸۶۸g;

        g(Ca ca) {
            super();
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۰h.Ca.b, p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            if (this.f۱۵۸۵۳d) {
                throw new IllegalStateException("closed");
            }
            if (this.f۱۵۸۶۸g) {
                return -1L;
            }
            long read = super.mo۱۷۴۷۷b(sink, byteCount);
            if (read == -1) {
                this.f۱۵۸۶۸g = true;
                m۱۶۷۴۵a(true, null);
                return -1L;
            }
            return read;
        }

        @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f۱۵۸۵۳d) {
                return;
            }
            if (!this.f۱۵۸۶۸g) {
                m۱۶۷۴۵a(false, null);
            }
            this.f۱۵۸۵۳d = true;
        }
    }
}
