package e.f0.h;

import e.a0;
import e.b0;
import e.f0.g.h;
import e.f0.g.i;
import e.f0.g.k;
import e.r;
import e.v;
import e.y;
import f.l;
import f.r;
import f.s;
import f.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class a implements e.f0.g.c {

    /* renamed from: a  reason: collision with root package name */
    final v f۳۸۴۹a;

    /* renamed from: b  reason: collision with root package name */
    final e.f0.f.g f۳۸۵۰b;

    /* renamed from: c  reason: collision with root package name */
    final f.e f۳۸۵۱c;

    /* renamed from: d  reason: collision with root package name */
    final f.d f۳۸۵۲d;

    /* renamed from: e  reason: collision with root package name */
    int f۳۸۵۳e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f۳۸۵۴f = 262144;

    public a(v client, e.f0.f.g streamAllocation, f.e source, f.d sink) {
        this.f۳۸۴۹a = client;
        this.f۳۸۵۰b = streamAllocation;
        this.f۳۸۵۱c = source;
        this.f۳۸۵۲d = sink;
    }

    @Override // e.f0.g.c
    public r a(y request, long contentLength) {
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            return c();
        }
        if (contentLength != -1) {
            return a(contentLength);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // e.f0.g.c
    public void a(y request) {
        a(request.c(), i.a(request, this.f۳۸۵۰b.b().c().b().type()));
    }

    @Override // e.f0.g.c
    public b0 a(a0 response) {
        e.f0.f.g gVar = this.f۳۸۵۰b;
        gVar.f۳۸۲۲f.e(gVar.f۳۸۲۱e);
        String contentType = response.b("Content-Type");
        if (!e.f0.g.e.b(response)) {
            return new h(contentType, 0, l.a(b(0)));
        }
        if ("chunked".equalsIgnoreCase(response.b("Transfer-Encoding"))) {
            return new h(contentType, -1, l.a(a(response.y().g())));
        }
        long contentLength = e.f0.g.e.a(response);
        if (contentLength != -1) {
            return new h(contentType, contentLength, l.a(b(contentLength)));
        }
        return new h(contentType, -1, l.a(d()));
    }

    @Override // e.f0.g.c
    public void b() {
        this.f۳۸۵۲d.flush();
    }

    @Override // e.f0.g.c
    public void a() {
        this.f۳۸۵۲d.flush();
    }

    public void a(e.r headers, String requestLine) {
        if (this.f۳۸۵۳e == 0) {
            this.f۳۸۵۲d.a(requestLine).a("\r\n");
            int size = headers.b();
            for (int i = 0; i < size; i++) {
                this.f۳۸۵۲d.a(headers.a(i)).a(": ").a(headers.b(i)).a("\r\n");
            }
            this.f۳۸۵۲d.a("\r\n");
            this.f۳۸۵۳e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f۳۸۵۳e);
    }

    @Override // e.f0.g.c
    public a0.a a(boolean expectContinue) {
        int i = this.f۳۸۵۳e;
        if (i == 1 || i == 3) {
            try {
                k statusLine = k.a(f());
                a0.a responseBuilder = new a0.a();
                responseBuilder.a(statusLine.f۳۸۴۶a);
                responseBuilder.a(statusLine.f۳۸۴۷b);
                responseBuilder.a(statusLine.f۳۸۴۸c);
                responseBuilder.a(e());
                if (expectContinue && statusLine.f۳۸۴۷b == 100) {
                    return null;
                }
                if (statusLine.f۳۸۴۷b == 100) {
                    this.f۳۸۵۳e = 3;
                    return responseBuilder;
                }
                this.f۳۸۵۳e = 4;
                return responseBuilder;
            } catch (EOFException e2) {
                IOException exception = new IOException("unexpected end of stream on " + this.f۳۸۵۰b);
                exception.initCause(e2);
                throw exception;
            }
        } else {
            throw new IllegalStateException("state: " + this.f۳۸۵۳e);
        }
    }

    private String f() {
        String line = this.f۳۸۵۱c.c(this.f۳۸۵۴f);
        this.f۳۸۵۴f -= (long) line.length();
        return line;
    }

    public e.r e() {
        r.a headers = new r.a();
        while (true) {
            String line = f();
            if (line.length() == 0) {
                return headers.a();
            }
            e.f0.a.f۳۷۴۰a.a(headers, line);
        }
    }

    public f.r c() {
        if (this.f۳۸۵۳e == 1) {
            this.f۳۸۵۳e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f۳۸۵۳e);
    }

    public f.r a(long contentLength) {
        if (this.f۳۸۵۳e == 1) {
            this.f۳۸۵۳e = 2;
            return new e(contentLength);
        }
        throw new IllegalStateException("state: " + this.f۳۸۵۳e);
    }

    public s b(long length) {
        if (this.f۳۸۵۳e == 4) {
            this.f۳۸۵۳e = 5;
            return new f(this, length);
        }
        throw new IllegalStateException("state: " + this.f۳۸۵۳e);
    }

    public s a(e.s url) {
        if (this.f۳۸۵۳e == 4) {
            this.f۳۸۵۳e = 5;
            return new d(url);
        }
        throw new IllegalStateException("state: " + this.f۳۸۵۳e);
    }

    public s d() {
        if (this.f۳۸۵۳e == 4) {
            e.f0.f.g gVar = this.f۳۸۵۰b;
            if (gVar != null) {
                this.f۳۸۵۳e = 5;
                gVar.d();
                return new g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f۳۸۵۳e);
    }

    /* access modifiers changed from: package-private */
    public void a(f.i timeout) {
        t oldDelegate = timeout.g();
        timeout.a(t.f۴۲۱۸d);
        oldDelegate.a();
        oldDelegate.b();
    }

    /* access modifiers changed from: private */
    public final class e implements f.r {

        /* renamed from: c  reason: collision with root package name */
        private final f.i f۳۸۶۴c = new f.i(a.this.f۳۸۵۲d.b());

        /* renamed from: d  reason: collision with root package name */
        private boolean f۳۸۶۵d;

        /* renamed from: e  reason: collision with root package name */
        private long f۳۸۶۶e;

        e(long bytesRemaining) {
            this.f۳۸۶۶e = bytesRemaining;
        }

        @Override // f.r
        public t b() {
            return this.f۳۸۶۴c;
        }

        @Override // f.r
        public void a(f.c source, long byteCount) {
            if (!this.f۳۸۶۵d) {
                e.f0.c.a(source.q(), 0, byteCount);
                if (byteCount <= this.f۳۸۶۶e) {
                    a.this.f۳۸۵۲d.a(source, byteCount);
                    this.f۳۸۶۶e -= byteCount;
                    return;
                }
                throw new ProtocolException("expected " + this.f۳۸۶۶e + " bytes but received " + byteCount);
            }
            throw new IllegalStateException("closed");
        }

        @Override // f.r, java.io.Flushable
        public void flush() {
            if (!this.f۳۸۶۵d) {
                a.this.f۳۸۵۲d.flush();
            }
        }

        @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
        public void close() {
            if (!this.f۳۸۶۵d) {
                this.f۳۸۶۵d = true;
                if (this.f۳۸۶۶e <= 0) {
                    a.this.a(this.f۳۸۶۴c);
                    a.this.f۳۸۵۳e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* access modifiers changed from: private */
    public final class c implements f.r {

        /* renamed from: c  reason: collision with root package name */
        private final f.i f۳۸۵۹c = new f.i(a.this.f۳۸۵۲d.b());

        /* renamed from: d  reason: collision with root package name */
        private boolean f۳۸۶۰d;

        c() {
        }

        @Override // f.r
        public t b() {
            return this.f۳۸۵۹c;
        }

        @Override // f.r
        public void a(f.c source, long byteCount) {
            if (this.f۳۸۶۰d) {
                throw new IllegalStateException("closed");
            } else if (byteCount != 0) {
                a.this.f۳۸۵۲d.a(byteCount);
                a.this.f۳۸۵۲d.a("\r\n");
                a.this.f۳۸۵۲d.a(source, byteCount);
                a.this.f۳۸۵۲d.a("\r\n");
            }
        }

        @Override // f.r, java.io.Flushable
        public synchronized void flush() {
            if (!this.f۳۸۶۰d) {
                a.this.f۳۸۵۲d.flush();
            }
        }

        @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
        public synchronized void close() {
            if (!this.f۳۸۶۰d) {
                this.f۳۸۶۰d = true;
                a.this.f۳۸۵۲d.a("0\r\n\r\n");
                a.this.a(this.f۳۸۵۹c);
                a.this.f۳۸۵۳e = 3;
            }
        }
    }

    /* access modifiers changed from: private */
    public abstract class b implements s {

        /* renamed from: c  reason: collision with root package name */
        protected final f.i f۳۸۵۵c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f۳۸۵۶d;

        /* renamed from: e  reason: collision with root package name */
        protected long f۳۸۵۷e;

        private b() {
            this.f۳۸۵۵c = new f.i(a.this.f۳۸۵۱c.b());
            this.f۳۸۵۷e = 0;
        }

        @Override // f.s
        public t b() {
            return this.f۳۸۵۵c;
        }

        @Override // f.s
        public long b(f.c sink, long byteCount) {
            try {
                long read = a.this.f۳۸۵۱c.b(sink, byteCount);
                if (read > 0) {
                    this.f۳۸۵۷e += read;
                }
                return read;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        /* access modifiers changed from: protected */
        public final void a(boolean reuseConnection, IOException e2) {
            a aVar = a.this;
            int i = aVar.f۳۸۵۳e;
            if (i != 6) {
                if (i == 5) {
                    aVar.a(this.f۳۸۵۵c);
                    a aVar2 = a.this;
                    aVar2.f۳۸۵۳e = 6;
                    e.f0.f.g gVar = aVar2.f۳۸۵۰b;
                    if (gVar != null) {
                        gVar.a(!reuseConnection, aVar2, this.f۳۸۵۷e, e2);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + a.this.f۳۸۵۳e);
            }
        }
    }

    /* access modifiers changed from: private */
    public class f extends b {

        /* renamed from: g  reason: collision with root package name */
        private long f۳۸۶۸g;

        f(a aVar, long length) {
            super();
            this.f۳۸۶۸g = length;
            if (this.f۳۸۶۸g == 0) {
                a(true, null);
            }
        }

        @Override // e.f0.h.a.b, f.s
        public long b(f.c sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (!this.f۳۸۵۶d) {
                long j = this.f۳۸۶۸g;
                if (j == 0) {
                    return -1;
                }
                long read = super.b(sink, Math.min(j, byteCount));
                if (read != -1) {
                    this.f۳۸۶۸g -= read;
                    if (this.f۳۸۶۸g == 0) {
                        a(true, null);
                    }
                    return read;
                }
                ProtocolException e2 = new ProtocolException("unexpected end of stream");
                a(false, e2);
                throw e2;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            if (!this.f۳۸۵۶d) {
                if (this.f۳۸۶۸g != 0 && !e.f0.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.f۳۸۵۶d = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public class d extends b {

        /* renamed from: g  reason: collision with root package name */
        private final e.s f۳۸۶۲g;

        /* renamed from: h  reason: collision with root package name */
        private long f۳۸۶۳h = -1;
        private boolean i = true;

        d(e.s url) {
            super();
            this.f۳۸۶۲g = url;
        }

        @Override // e.f0.h.a.b, f.s
        public long b(f.c sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (this.f۳۸۵۶d) {
                throw new IllegalStateException("closed");
            } else if (!this.i) {
                return -1;
            } else {
                long j2 = this.f۳۸۶۳h;
                if (j2 == 0 || j2 == -1) {
                    d();
                    if (!this.i) {
                        return -1;
                    }
                }
                long read = super.b(sink, Math.min(byteCount, this.f۳۸۶۳h));
                if (read != -1) {
                    this.f۳۸۶۳h -= read;
                    return read;
                }
                ProtocolException e2 = new ProtocolException("unexpected end of stream");
                a(false, e2);
                throw e2;
            }
        }

        private void d() {
            if (this.f۳۸۶۳h != -1) {
                a.this.f۳۸۵۱c.f();
            }
            try {
                this.f۳۸۶۳h = a.this.f۳۸۵۱c.j();
                String extensions = a.this.f۳۸۵۱c.f().trim();
                if (this.f۳۸۶۳h < 0 || (!extensions.isEmpty() && !extensions.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f۳۸۶۳h + extensions + "\"");
                } else if (this.f۳۸۶۳h == 0) {
                    this.i = false;
                    e.f0.g.e.a(a.this.f۳۸۴۹a.g(), this.f۳۸۶۲g, a.this.e());
                    a(true, null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            if (!this.f۳۸۵۶d) {
                if (this.i && !e.f0.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.f۳۸۵۶d = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public class g extends b {

        /* renamed from: g  reason: collision with root package name */
        private boolean f۳۸۶۹g;

        g(a aVar) {
            super();
        }

        @Override // e.f0.h.a.b, f.s
        public long b(f.c sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (this.f۳۸۵۶d) {
                throw new IllegalStateException("closed");
            } else if (this.f۳۸۶۹g) {
                return -1;
            } else {
                long read = super.b(sink, byteCount);
                if (read != -1) {
                    return read;
                }
                this.f۳۸۶۹g = true;
                a(true, null);
                return -1;
            }
        }

        @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
        public void close() {
            if (!this.f۳۸۵۶d) {
                if (!this.f۳۸۶۹g) {
                    a(false, null);
                }
                this.f۳۸۵۶d = true;
            }
        }
    }
}
