package e;

import e.a0;
import e.f0.e.d;
import e.f0.e.f;
import e.f0.g.e;
import e.f0.g.k;
import e.r;
import e.y;
import f.g;
import f.h;
import f.l;
import f.r;
import f.s;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c implements Closeable, Flushable {

    /* renamed from: c  reason: collision with root package name */
    final f f۳۶۸۹c;

    /* renamed from: d  reason: collision with root package name */
    final e.f0.e.d f۳۶۹۰d;

    /* renamed from: e  reason: collision with root package name */
    int f۳۶۹۱e;

    /* renamed from: f  reason: collision with root package name */
    int f۳۶۹۲f;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۶۹۳g;

    /* renamed from: h  reason: collision with root package name */
    private int f۳۶۹۴h;
    private int i;

    class a implements f {
        a() {
        }

        @Override // e.f0.e.f
        public a0 a(y request) {
            return c.this.a(request);
        }

        @Override // e.f0.e.f
        public e.f0.e.b a(a0 response) {
            return c.this.a(response);
        }

        @Override // e.f0.e.f
        public void b(y request) {
            c.this.b(request);
        }

        @Override // e.f0.e.f
        public void a(a0 cached, a0 network) {
            c.this.a(cached, network);
        }

        @Override // e.f0.e.f
        public void a() {
            c.this.l();
        }

        @Override // e.f0.e.f
        public void a(e.f0.e.c cacheStrategy) {
            c.this.a(cacheStrategy);
        }
    }

    public c(File directory, long maxSize) {
        this(directory, maxSize, e.f0.j.a.f۴۰۱۰a);
    }

    c(File directory, long maxSize, e.f0.j.a fileSystem) {
        this.f۳۶۸۹c = new a();
        this.f۳۶۹۰d = e.f0.e.d.a(fileSystem, directory, 201105, 2, maxSize);
    }

    public static String a(s url) {
        return f.f.d(url.toString()).c().b();
    }

    /* access modifiers changed from: package-private */
    public a0 a(y request) {
        try {
            d.e snapshot = this.f۳۶۹۰d.c(a(request.g()));
            if (snapshot == null) {
                return null;
            }
            try {
                d entry = new d(snapshot.a(0));
                a0 response = entry.a(snapshot);
                if (entry.a(request, response)) {
                    return response;
                }
                e.f0.c.a(response.l());
                return null;
            } catch (IOException e2) {
                e.f0.c.a(snapshot);
                return null;
            }
        } catch (IOException e3) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public e.f0.e.b a(a0 response) {
        String requestMethod = response.y().e();
        if (e.f0.g.f.a(response.y().e())) {
            try {
                b(response.y());
            } catch (IOException e2) {
            }
            return null;
        } else if (!requestMethod.equals("GET") || e.c(response)) {
            return null;
        } else {
            d entry = new d(response);
            try {
                d.c editor = this.f۳۶۹۰d.b(a(response.y().g()));
                if (editor == null) {
                    return null;
                }
                entry.a(editor);
                return new b(editor);
            } catch (IOException e3) {
                a((d.c) null);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(y request) {
        this.f۳۶۹۰d.d(a(request.g()));
    }

    /* access modifiers changed from: package-private */
    public void a(a0 cached, a0 network) {
        d entry = new d(network);
        try {
            d.c editor = ((C۰۱۱۶c) cached.l()).f۳۷۰۳c.l();
            if (editor != null) {
                entry.a(editor);
                editor.b();
            }
        } catch (IOException e2) {
            a((d.c) null);
        }
    }

    private void a(d.c editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException e2) {
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f۳۶۹۰d.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۳۶۹۰d.close();
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(e.f0.e.c cacheStrategy) {
        this.i++;
        if (cacheStrategy.f۳۷۵۶a != null) {
            this.f۳۶۹۳g++;
        } else if (cacheStrategy.f۳۷۵۷b != null) {
            this.f۳۶۹۴h++;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void l() {
        this.f۳۶۹۴h++;
    }

    /* access modifiers changed from: private */
    public final class b implements e.f0.e.b {

        /* renamed from: a  reason: collision with root package name */
        private final d.c f۳۶۹۶a;

        /* renamed from: b  reason: collision with root package name */
        private r f۳۶۹۷b;

        /* renamed from: c  reason: collision with root package name */
        private r f۳۶۹۸c;

        /* renamed from: d  reason: collision with root package name */
        boolean f۳۶۹۹d;

        b(d.c editor) {
            this.f۳۶۹۶a = editor;
            this.f۳۶۹۷b = editor.a(1);
            this.f۳۶۹۸c = new a(this.f۳۶۹۷b, c.this, editor);
        }

        class a extends g {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d.c f۳۷۰۱d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r x0, c cVar, d.c cVar2) {
                super(x0);
                this.f۳۷۰۱d = cVar2;
            }

            @Override // java.io.Closeable, f.r, java.lang.AutoCloseable, f.g
            public void close() {
                synchronized (c.this) {
                    if (!b.this.f۳۶۹۹d) {
                        b.this.f۳۶۹۹d = true;
                        c.this.f۳۶۹۱e++;
                        super.close();
                        this.f۳۷۰۱d.b();
                    }
                }
            }
        }

        @Override // e.f0.e.b
        public void a() {
            synchronized (c.this) {
                if (!this.f۳۶۹۹d) {
                    this.f۳۶۹۹d = true;
                    c.this.f۳۶۹۲f++;
                    e.f0.c.a(this.f۳۶۹۷b);
                    try {
                        this.f۳۶۹۶a.a();
                    } catch (IOException e2) {
                    }
                }
            }
        }

        @Override // e.f0.e.b
        public r b() {
            return this.f۳۶۹۸c;
        }
    }

    /* access modifiers changed from: private */
    public static final class d {
        private static final String k = (e.f0.k.f.d().a() + "-Sent-Millis");
        private static final String l = (e.f0.k.f.d().a() + "-Received-Millis");

        /* renamed from: a  reason: collision with root package name */
        private final String f۳۷۰۷a;

        /* renamed from: b  reason: collision with root package name */
        private final r f۳۷۰۸b;

        /* renamed from: c  reason: collision with root package name */
        private final String f۳۷۰۹c;

        /* renamed from: d  reason: collision with root package name */
        private final w f۳۷۱۰d;

        /* renamed from: e  reason: collision with root package name */
        private final int f۳۷۱۱e;

        /* renamed from: f  reason: collision with root package name */
        private final String f۳۷۱۲f;

        /* renamed from: g  reason: collision with root package name */
        private final r f۳۷۱۳g;

        /* renamed from: h  reason: collision with root package name */
        private final q f۳۷۱۴h;
        private final long i;
        private final long j;

        d(s in) {
            d0 tlsVersion;
            try {
                f.e source = l.a(in);
                this.f۳۷۰۷a = source.f();
                this.f۳۷۰۹c = source.f();
                r.a varyHeadersBuilder = new r.a();
                int varyRequestHeaderLineCount = c.a(source);
                for (int i2 = 0; i2 < varyRequestHeaderLineCount; i2++) {
                    varyHeadersBuilder.a(source.f());
                }
                this.f۳۷۰۸b = varyHeadersBuilder.a();
                k statusLine = k.a(source.f());
                this.f۳۷۱۰d = statusLine.f۳۸۴۶a;
                this.f۳۷۱۱e = statusLine.f۳۸۴۷b;
                this.f۳۷۱۲f = statusLine.f۳۸۴۸c;
                r.a responseHeadersBuilder = new r.a();
                int responseHeaderLineCount = c.a(source);
                for (int i3 = 0; i3 < responseHeaderLineCount; i3++) {
                    responseHeadersBuilder.a(source.f());
                }
                String sendRequestMillisString = responseHeadersBuilder.b(k);
                String receivedResponseMillisString = responseHeadersBuilder.b(l);
                responseHeadersBuilder.c(k);
                responseHeadersBuilder.c(l);
                long j2 = 0;
                this.i = sendRequestMillisString != null ? Long.parseLong(sendRequestMillisString) : 0;
                this.j = receivedResponseMillisString != null ? Long.parseLong(receivedResponseMillisString) : j2;
                this.f۳۷۱۳g = responseHeadersBuilder.a();
                if (a()) {
                    String blank = source.f();
                    if (blank.length() <= 0) {
                        h cipherSuite = h.a(source.f());
                        List<Certificate> peerCertificates = a(source);
                        List<Certificate> localCertificates = a(source);
                        if (!source.i()) {
                            tlsVersion = d0.a(source.f());
                        } else {
                            tlsVersion = d0.SSL_3_0;
                        }
                        this.f۳۷۱۴h = q.a(tlsVersion, cipherSuite, peerCertificates, localCertificates);
                    } else {
                        throw new IOException("expected \"\" but was \"" + blank + "\"");
                    }
                } else {
                    this.f۳۷۱۴h = null;
                }
            } finally {
                in.close();
            }
        }

        d(a0 response) {
            this.f۳۷۰۷a = response.y().g().toString();
            this.f۳۷۰۸b = e.e(response);
            this.f۳۷۰۹c = response.y().e();
            this.f۳۷۱۰d = response.w();
            this.f۳۷۱۱e = response.o();
            this.f۳۷۱۲f = response.s();
            this.f۳۷۱۳g = response.q();
            this.f۳۷۱۴h = response.p();
            this.i = response.z();
            this.j = response.x();
        }

        public void a(d.c editor) {
            f.d sink = l.a(editor.a(0));
            sink.a(this.f۳۷۰۷a).writeByte(10);
            sink.a(this.f۳۷۰۹c).writeByte(10);
            sink.e((long) this.f۳۷۰۸b.b()).writeByte(10);
            int size = this.f۳۷۰۸b.b();
            for (int i2 = 0; i2 < size; i2++) {
                sink.a(this.f۳۷۰۸b.a(i2)).a(": ").a(this.f۳۷۰۸b.b(i2)).writeByte(10);
            }
            sink.a(new k(this.f۳۷۱۰d, this.f۳۷۱۱e, this.f۳۷۱۲f).toString()).writeByte(10);
            sink.e((long) (this.f۳۷۱۳g.b() + 2)).writeByte(10);
            int size2 = this.f۳۷۱۳g.b();
            for (int i3 = 0; i3 < size2; i3++) {
                sink.a(this.f۳۷۱۳g.a(i3)).a(": ").a(this.f۳۷۱۳g.b(i3)).writeByte(10);
            }
            sink.a(k).a(": ").e(this.i).writeByte(10);
            sink.a(l).a(": ").e(this.j).writeByte(10);
            if (a()) {
                sink.writeByte(10);
                sink.a(this.f۳۷۱۴h.a().a()).writeByte(10);
                a(sink, this.f۳۷۱۴h.c());
                a(sink, this.f۳۷۱۴h.b());
                sink.a(this.f۳۷۱۴h.d().a()).writeByte(10);
            }
            sink.close();
        }

        private boolean a() {
            return this.f۳۷۰۷a.startsWith("https://");
        }

        private List<Certificate> a(f.e source) {
            int length = c.a(source);
            if (length == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                List<Certificate> result = new ArrayList<>(length);
                for (int i2 = 0; i2 < length; i2++) {
                    String line = source.f();
                    f.c bytes = new f.c();
                    bytes.a(f.f.a(line));
                    result.add(certificateFactory.generateCertificate(bytes.k()));
                }
                return result;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private void a(f.d sink, List<Certificate> certificates) {
            try {
                sink.e((long) certificates.size()).writeByte(10);
                int size = certificates.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sink.a(f.f.a(certificates.get(i2).getEncoded()).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public boolean a(y request, a0 response) {
            return this.f۳۷۰۷a.equals(request.g().toString()) && this.f۳۷۰۹c.equals(request.e()) && e.a(response, this.f۳۷۰۸b, request);
        }

        public a0 a(d.e snapshot) {
            String contentType = this.f۳۷۱۳g.a("Content-Type");
            String contentLength = this.f۳۷۱۳g.a("Content-Length");
            y.a aVar = new y.a();
            aVar.b(this.f۳۷۰۷a);
            aVar.a(this.f۳۷۰۹c, (z) null);
            aVar.a(this.f۳۷۰۸b);
            y cacheRequest = aVar.a();
            a0.a aVar2 = new a0.a();
            aVar2.a(cacheRequest);
            aVar2.a(this.f۳۷۱۰d);
            aVar2.a(this.f۳۷۱۱e);
            aVar2.a(this.f۳۷۱۲f);
            aVar2.a(this.f۳۷۱۳g);
            aVar2.a(new C۰۱۱۶c(snapshot, contentType, contentLength));
            aVar2.a(this.f۳۷۱۴h);
            aVar2.b(this.i);
            aVar2.a(this.j);
            return aVar2.a();
        }
    }

    static int a(f.e source) {
        try {
            long result = source.e();
            String line = source.f();
            if (result >= 0 && result <= 2147483647L && line.isEmpty()) {
                return (int) result;
            }
            throw new IOException("expected an int but was \"" + result + line + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.c$c  reason: collision with other inner class name */
    public static class C۰۱۱۶c extends b0 {

        /* renamed from: c  reason: collision with root package name */
        final d.e f۳۷۰۳c;

        /* renamed from: d  reason: collision with root package name */
        private final f.e f۳۷۰۴d;

        /* renamed from: e  reason: collision with root package name */
        private final String f۳۷۰۵e;

        C۰۱۱۶c(d.e snapshot, String contentType, String contentLength) {
            this.f۳۷۰۳c = snapshot;
            this.f۳۷۰۵e = contentLength;
            this.f۳۷۰۴d = l.a(new a(this, snapshot.a(1), snapshot));
        }

        /* renamed from: e.c$c$a */
        class a extends h {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d.e f۳۷۰۶d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C۰۱۱۶c this$0, s x0, d.e eVar) {
                super(x0);
                this.f۳۷۰۶d = eVar;
            }

            @Override // f.h, java.io.Closeable, f.s, java.lang.AutoCloseable
            public void close() {
                this.f۳۷۰۶d.close();
                super.close();
            }
        }

        @Override // e.b0
        public long l() {
            try {
                if (this.f۳۷۰۵e != null) {
                    return Long.parseLong(this.f۳۷۰۵e);
                }
                return -1;
            } catch (NumberFormatException e2) {
                return -1;
            }
        }

        @Override // e.b0
        public f.e m() {
            return this.f۳۷۰۴d;
        }
    }
}
