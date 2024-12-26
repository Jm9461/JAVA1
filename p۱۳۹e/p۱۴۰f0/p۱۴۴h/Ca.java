package p۱۳۹e.p۱۴۰f0.p۱۴۴h;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p۱۳۹e.AbstractCb0;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cr;
import p۱۳۹e.Cs;
import p۱۳۹e.Cv;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ch;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ci;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ck;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;
import p۱۴۹f.Ct;

/* renamed from: e.f0.h.a  reason: invalid class name */
public final class Ca implements AbstractCc {

    /* renamed from: a  reason: contains not printable characters */
    final Cv f۱۵۸۴۶a;

    /* renamed from: b  reason: contains not printable characters */
    final p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg f۱۵۸۴۷b;

    /* renamed from: c  reason: contains not printable characters */
    final AbstractCe f۱۵۸۴۸c;

    /* renamed from: d  reason: contains not printable characters */
    final AbstractCd f۱۵۸۴۹d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۵۸۵۰e = 0;

    /* renamed from: f  reason: contains not printable characters */
    private long f۱۵۸۵۱f = 262144;

    public Ca(Cv client, p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg streamAllocation, AbstractCe source, AbstractCd sink) {
        this.f۱۵۸۴۶a = client;
        this.f۱۵۸۴۷b = streamAllocation;
        this.f۱۵۸۴۸c = source;
        this.f۱۵۸۴۹d = sink;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCr m۱۸۸۱۳a(Cy request, long contentLength) {
        if ("chunked".equalsIgnoreCase(request.m۱۹۳۲۲a("Transfer-Encoding"))) {
            return m۱۸۸۲۱c();
        }
        if (contentLength != -1) {
            return m۱۸۸۱۲a(contentLength);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۱۷a(Cy request) {
        m۱۸۸۱۶a(request.m۱۹۳۲۵c(), Ci.m۱۸۷۹۷a(request, this.f۱۵۸۴۷b.m۱۸۷۴۶b().m۱۸۷۱۵c().m۱۸۵۶۹b().type()));
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb0 m۱۸۸۱۱a(Ca0 response) {
        p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg gVar = this.f۱۵۸۴۷b;
        gVar.f۱۵۸۰۹f.m۱۹۱۸۷e(gVar.f۱۵۸۰۸e);
        String contentType = response.m۱۸۵۰۳b("Content-Type");
        if (!p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce.m۱۸۷۷۲b(response)) {
            return new Ch(contentType, 0, Cl.m۱۹۴۸۰a(m۱۸۸۱۹b(0)));
        }
        if ("chunked".equalsIgnoreCase(response.m۱۸۵۰۳b("Transfer-Encoding"))) {
            return new Ch(contentType, -1, Cl.m۱۹۴۸۰a(m۱۸۸۱۴a(response.m۱۸۵۱۷y().m۱۹۳۲۹g())));
        }
        long contentLength = p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce.m۱۸۷۶۵a(response);
        if (contentLength != -1) {
            return new Ch(contentType, contentLength, Cl.m۱۹۴۸۰a(m۱۸۸۱۹b(contentLength)));
        }
        return new Ch(contentType, -1, Cl.m۱۹۴۸۰a(m۱۸۸۲۲d()));
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۸۲۰b() {
        this.f۱۵۸۴۹d.flush();
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۱۵a() {
        this.f۱۵۸۴۹d.flush();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۱۶a(Cr headers, String requestLine) {
        if (this.f۱۵۸۵۰e == 0) {
            this.f۱۵۸۴۹d.m۱۹۴۱۴a(requestLine).m۱۹۴۱۴a("\r\n");
            int size = headers.m۱۹۲۰۲b();
            for (int i = 0; i < size; i++) {
                this.f۱۵۸۴۹d.m۱۹۴۱۴a(headers.m۱۹۲۰۰a(i)).m۱۹۴۱۴a(": ").m۱۹۴۱۴a(headers.m۱۹۲۰۳b(i)).m۱۹۴۱۴a("\r\n");
            }
            this.f۱۵۸۴۹d.m۱۹۴۱۴a("\r\n");
            this.f۱۵۸۵۰e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public Ca0.Ca m۱۸۸۱۰a(boolean expectContinue) {
        int i = this.f۱۵۸۵۰e;
        if (i == 1 || i == 3) {
            try {
                Ck statusLine = Ck.m۱۸۸۰۸a(m۱۸۸۰۹f());
                Ca0.Ca responseBuilder = new Ca0.Ca();
                responseBuilder.m۱۸۵۲۷a(statusLine.f۱۵۸۴۳a);
                responseBuilder.m۱۸۵۲۱a(statusLine.f۱۵۸۴۴b);
                responseBuilder.m۱۸۵۲۹a(statusLine.f۱۵۸۴۵c);
                responseBuilder.m۱۸۵۲۶a(m۱۸۸۲۳e());
                if (expectContinue && statusLine.f۱۵۸۴۴b == 100) {
                    return null;
                }
                if (statusLine.f۱۵۸۴۴b == 100) {
                    this.f۱۵۸۵۰e = 3;
                    return responseBuilder;
                }
                this.f۱۵۸۵۰e = 4;
                return responseBuilder;
            } catch (EOFException e) {
                IOException exception = new IOException("unexpected end of stream on " + this.f۱۵۸۴۷b);
                exception.initCause(e);
                throw exception;
            }
        } else {
            throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private String m۱۸۸۰۹f() {
        String line = this.f۱۵۸۴۸c.m۱۹۴۲۱c(this.f۱۵۸۵۱f);
        this.f۱۵۸۵۱f -= (long) line.length();
        return line;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Cr m۱۸۸۲۳e() {
        Cr.Ca headers = new Cr.Ca();
        while (true) {
            String line = m۱۸۸۰۹f();
            if (line.length() == 0) {
                return headers.m۱۹۲۰۸a();
            }
            AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۱a(headers, line);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractCr m۱۸۸۲۱c() {
        if (this.f۱۵۸۵۰e == 1) {
            this.f۱۵۸۵۰e = 2;
            return new Cc();
        }
        throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCr m۱۸۸۱۲a(long contentLength) {
        if (this.f۱۵۸۵۰e == 1) {
            this.f۱۵۸۵۰e = 2;
            return new Ce(contentLength);
        }
        throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCs m۱۸۸۱۹b(long length) {
        if (this.f۱۵۸۵۰e == 4) {
            this.f۱۵۸۵۰e = 5;
            return new Cf(this, length);
        }
        throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCs m۱۸۸۱۴a(Cs url) {
        if (this.f۱۵۸۵۰e == 4) {
            this.f۱۵۸۵۰e = 5;
            return new Cd(url);
        }
        throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractCs m۱۸۸۲۲d() {
        if (this.f۱۵۸۵۰e == 4) {
            p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg gVar = this.f۱۵۸۴۷b;
            if (gVar != null) {
                this.f۱۵۸۵۰e = 5;
                gVar.m۱۸۷۴۸d();
                return new Cg(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f۱۵۸۵۰e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۱۸a(p۱۴۹f.Ci timeout) {
        Ct oldDelegate = timeout.m۱۹۴۶۸g();
        timeout.m۱۹۴۶۰a(Ct.f۱۶۳۱۳d);
        oldDelegate.m۱۹۵۵۶a();
        oldDelegate.m۱۹۵۵۹b();
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.h.a$e  reason: invalid class name */
    public final class Ce implements AbstractCr {

        /* renamed from: c  reason: contains not printable characters */
        private final p۱۴۹f.Ci f۱۵۸۶۳c = new p۱۴۹f.Ci(Ca.this.f۱۵۸۴۹d.m۱۹۵۵۳b());

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۵۸۶۴d;

        /* renamed from: e  reason: contains not printable characters */
        private long f۱۵۸۶۵e;

        Ce(long bytesRemaining) {
            this.f۱۵۸۶۵e = bytesRemaining;
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۸۳۲b() {
            return this.f۱۵۸۶۳c;
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۸۳۱a(p۱۴۹f.Cc source, long byteCount) {
            if (!this.f۱۵۸۶۴d) {
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۰a(source.m۱۹۴۱۰q(), 0, byteCount);
                if (byteCount <= this.f۱۵۸۶۵e) {
                    Ca.this.f۱۵۸۴۹d.m۱۹۵۵۲a(source, byteCount);
                    this.f۱۵۸۶۵e -= byteCount;
                    return;
                }
                throw new ProtocolException("expected " + this.f۱۵۸۶۵e + " bytes but received " + byteCount);
            }
            throw new IllegalStateException("closed");
        }

        @Override // p۱۴۹f.AbstractCr, java.io.Flushable
        public void flush() {
            if (!this.f۱۵۸۶۴d) {
                Ca.this.f۱۵۸۴۹d.flush();
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
        public void close() {
            if (!this.f۱۵۸۶۴d) {
                this.f۱۵۸۶۴d = true;
                if (this.f۱۵۸۶۵e <= 0) {
                    Ca.this.m۱۸۸۱۸a(this.f۱۵۸۶۳c);
                    Ca.this.f۱۵۸۵۰e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.h.a$c  reason: invalid class name */
    public final class Cc implements AbstractCr {

        /* renamed from: c  reason: contains not printable characters */
        private final p۱۴۹f.Ci f۱۵۸۵۶c = new p۱۴۹f.Ci(Ca.this.f۱۵۸۴۹d.m۱۹۵۵۳b());

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۵۸۵۷d;

        Cc() {
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۸۲۸b() {
            return this.f۱۵۸۵۶c;
        }

        @Override // p۱۴۹f.AbstractCr
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۸۲۷a(p۱۴۹f.Cc source, long byteCount) {
            if (this.f۱۵۸۵۷d) {
                throw new IllegalStateException("closed");
            } else if (byteCount != 0) {
                Ca.this.f۱۵۸۴۹d.m۱۹۴۱۳a(byteCount);
                Ca.this.f۱۵۸۴۹d.m۱۹۴۱۴a("\r\n");
                Ca.this.f۱۵۸۴۹d.m۱۹۵۵۲a(source, byteCount);
                Ca.this.f۱۵۸۴۹d.m۱۹۴۱۴a("\r\n");
            }
        }

        @Override // p۱۴۹f.AbstractCr, java.io.Flushable
        public synchronized void flush() {
            if (!this.f۱۵۸۵۷d) {
                Ca.this.f۱۵۸۴۹d.flush();
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
        public synchronized void close() {
            if (!this.f۱۵۸۵۷d) {
                this.f۱۵۸۵۷d = true;
                Ca.this.f۱۵۸۴۹d.m۱۹۴۱۴a("0\r\n\r\n");
                Ca.this.m۱۸۸۱۸a(this.f۱۵۸۵۶c);
                Ca.this.f۱۵۸۵۰e = 3;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.h.a$b  reason: invalid class name */
    public abstract class AbstractCb implements AbstractCs {

        /* renamed from: c  reason: contains not printable characters */
        protected final p۱۴۹f.Ci f۱۵۸۵۲c;

        /* renamed from: d  reason: contains not printable characters */
        protected boolean f۱۵۸۵۳d;

        /* renamed from: e  reason: contains not printable characters */
        protected long f۱۵۸۵۴e;

        private AbstractCb() {
            this.f۱۵۸۵۲c = new p۱۴۹f.Ci(Ca.this.f۱۵۸۴۸c.m۱۹۵۵۵b());
            this.f۱۵۸۵۴e = 0;
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public Ct m۱۸۸۲۶b() {
            return this.f۱۵۸۵۲c;
        }

        @Override // p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۸۲۵b(p۱۴۹f.Cc sink, long byteCount) {
            try {
                long read = Ca.this.f۱۵۸۴۸c.m۱۹۵۵۴b(sink, byteCount);
                if (read > 0) {
                    this.f۱۵۸۵۴e += read;
                }
                return read;
            } catch (IOException e) {
                m۱۸۸۲۴a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۸۸۲۴a(boolean reuseConnection, IOException e) {
            Ca aVar = Ca.this;
            int i = aVar.f۱۵۸۵۰e;
            if (i != 6) {
                if (i == 5) {
                    aVar.m۱۸۸۱۸a(this.f۱۵۸۵۲c);
                    Ca aVar2 = Ca.this;
                    aVar2.f۱۵۸۵۰e = 6;
                    p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg gVar = aVar2.f۱۵۸۴۷b;
                    if (gVar != null) {
                        gVar.m۱۸۷۴۵a(!reuseConnection, aVar2, this.f۱۵۸۵۴e, e);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + Ca.this.f۱۵۸۵۰e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.h.a$f  reason: invalid class name */
    public class Cf extends AbstractCb {

        /* renamed from: g  reason: contains not printable characters */
        private long f۱۵۸۶۷g;

        Cf(Ca aVar, long length) {
            super();
            this.f۱۵۸۶۷g = length;
            if (this.f۱۵۸۶۷g == 0) {
                m۱۸۸۲۴a(true, null);
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۴h.Ca.AbstractCb, p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۸۳۳b(p۱۴۹f.Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (!this.f۱۵۸۵۳d) {
                long j = this.f۱۵۸۶۷g;
                if (j == 0) {
                    return -1;
                }
                long read = super.m۱۸۸۲۵b(sink, Math.min(j, byteCount));
                if (read != -1) {
                    this.f۱۵۸۶۷g -= read;
                    if (this.f۱۵۸۶۷g == 0) {
                        m۱۸۸۲۴a(true, null);
                    }
                    return read;
                }
                ProtocolException e = new ProtocolException("unexpected end of stream");
                m۱۸۸۲۴a(false, e);
                throw e;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            if (!this.f۱۵۸۵۳d) {
                if (this.f۱۵۸۶۷g != 0 && !p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۳a(this, 100, TimeUnit.MILLISECONDS)) {
                    m۱۸۸۲۴a(false, null);
                }
                this.f۱۵۸۵۳d = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.h.a$d  reason: invalid class name */
    public class Cd extends AbstractCb {

        /* renamed from: g  reason: contains not printable characters */
        private final Cs f۱۵۸۵۹g;

        /* renamed from: h  reason: contains not printable characters */
        private long f۱۵۸۶۰h = -1;

        /* renamed from: i  reason: contains not printable characters */
        private boolean f۱۵۸۶۱i = true;

        Cd(Cs url) {
            super();
            this.f۱۵۸۵۹g = url;
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۴h.Ca.AbstractCb, p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۸۳۰b(p۱۴۹f.Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (this.f۱۵۸۵۳d) {
                throw new IllegalStateException("closed");
            } else if (!this.f۱۵۸۶۱i) {
                return -1;
            } else {
                long j = this.f۱۵۸۶۰h;
                if (j == 0 || j == -1) {
                    m۱۸۸۲۹d();
                    if (!this.f۱۵۸۶۱i) {
                        return -1;
                    }
                }
                long read = super.m۱۸۸۲۵b(sink, Math.min(byteCount, this.f۱۵۸۶۰h));
                if (read != -1) {
                    this.f۱۵۸۶۰h -= read;
                    return read;
                }
                ProtocolException e = new ProtocolException("unexpected end of stream");
                m۱۸۸۲۴a(false, e);
                throw e;
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۸۸۲۹d() {
            if (this.f۱۵۸۶۰h != -1) {
                Ca.this.f۱۵۸۴۸c.m۱۹۴۲۵f();
            }
            try {
                this.f۱۵۸۶۰h = Ca.this.f۱۵۸۴۸c.m۱۹۴۳۰j();
                String extensions = Ca.this.f۱۵۸۴۸c.m۱۹۴۲۵f().trim();
                if (this.f۱۵۸۶۰h < 0 || (!extensions.isEmpty() && !extensions.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f۱۵۸۶۰h + extensions + "\"");
                } else if (this.f۱۵۸۶۰h == 0) {
                    this.f۱۵۸۶۱i = false;
                    p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce.m۱۸۷۶۹a(Ca.this.f۱۵۸۴۶a.m۱۹۲۷۸g(), this.f۱۵۸۵۹g, Ca.this.m۱۸۸۲۳e());
                    m۱۸۸۲۴a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            if (!this.f۱۵۸۵۳d) {
                if (this.f۱۵۸۶۱i && !p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۳a(this, 100, TimeUnit.MILLISECONDS)) {
                    m۱۸۸۲۴a(false, null);
                }
                this.f۱۵۸۵۳d = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.h.a$g  reason: invalid class name */
    public class Cg extends AbstractCb {

        /* renamed from: g  reason: contains not printable characters */
        private boolean f۱۵۸۶۸g;

        Cg(Ca aVar) {
            super();
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۴h.Ca.AbstractCb, p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۸۳۴b(p۱۴۹f.Cc sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (this.f۱۵۸۵۳d) {
                throw new IllegalStateException("closed");
            } else if (this.f۱۵۸۶۸g) {
                return -1;
            } else {
                long read = super.m۱۸۸۲۵b(sink, byteCount);
                if (read != -1) {
                    return read;
                }
                this.f۱۵۸۶۸g = true;
                m۱۸۸۲۴a(true, null);
                return -1;
            }
        }

        @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            if (!this.f۱۵۸۵۳d) {
                if (!this.f۱۵۸۶۸g) {
                    m۱۸۸۲۴a(false, null);
                }
                this.f۱۵۸۵۳d = true;
            }
        }
    }
}
