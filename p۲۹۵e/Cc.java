package p۲۹۵e;

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
import p۲۹۵e.Ca0;
import p۲۹۵e.Cr;
import p۲۹۵e.Cy;
import p۲۹۵e.p۲۹۶f0.p۲۹۷e.Cd;
import p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCb;
import p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ce;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ck;
import p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa;
import p۳۰۵f.AbstractCg;
import p۳۰۵f.AbstractCh;
import p۳۰۵f.Cf;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc implements Closeable, Flushable {

    /* renamed from: c, reason: contains not printable characters */
    final InterfaceCf f۱۵۶۳۸c;

    /* renamed from: d, reason: contains not printable characters */
    final Cd f۱۵۶۳۹d;

    /* renamed from: e, reason: contains not printable characters */
    int f۱۵۶۴۰e;

    /* renamed from: f, reason: contains not printable characters */
    int f۱۵۶۴۱f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۵۶۴۲g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۵۶۴۳h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۵۶۴۴i;

    /* renamed from: e.c$a */
    class a implements InterfaceCf {
        a() {
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf
        /* renamed from: a, reason: contains not printable characters */
        public Ca0 mo۱۶۶۱۰a(Cy request) {
            return Cc.this.m۱۶۴۶۷a(request);
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf
        /* renamed from: a, reason: contains not printable characters */
        public InterfaceCb mo۱۶۶۱۱a(Ca0 response) {
            return Cc.this.m۱۶۴۶۸a(response);
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۶۱۵b(Cy request) {
            Cc.this.m۱۶۴۷۱b(request);
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۶۱۳a(Ca0 cached, Ca0 network) {
            Cc.this.m۱۶۴۶۹a(cached, network);
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۶۱۲a() {
            Cc.this.m۱۶۴۷۲l();
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCf
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۶۱۴a(p۲۹۵e.p۲۹۶f0.p۲۹۷e.Cc cacheStrategy) {
            Cc.this.m۱۶۴۷۰a(cacheStrategy);
        }
    }

    public Cc(File directory, long maxSize) {
        this(directory, maxSize, InterfaceCa.f۱۶۰۴۴a);
    }

    Cc(File directory, long maxSize, InterfaceCa fileSystem) {
        this.f۱۵۶۳۸c = new a();
        this.f۱۵۶۳۹d = Cd.m۱۶۵۷۷a(fileSystem, directory, 201105, 2, maxSize);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۴۶۵a(Cs url) {
        return Cf.m۱۷۳۶۱d(url.toString()).mo۱۷۴۶۸c().mo۱۷۴۶۷b();
    }

    /* renamed from: a, reason: contains not printable characters */
    Ca0 m۱۶۴۶۷a(Cy request) {
        String key = m۱۶۴۶۵a(request.m۱۷۲۵۱g());
        try {
            Cd.e snapshot = this.f۱۵۶۳۹d.m۱۶۵۸۸c(key);
            if (snapshot == null) {
                return null;
            }
            try {
                d entry = new d(snapshot.m۱۶۶۰۶a(0));
                Ca0 response = entry.m۱۶۴۸۶a(snapshot);
                if (!entry.m۱۶۴۸۸a(request, response)) {
                    p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۲a(response.m۱۶۴۲۵l());
                    return null;
                }
                return response;
            } catch (IOException e2) {
                p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۲a(snapshot);
                return null;
            }
        } catch (IOException e3) {
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    InterfaceCb m۱۶۴۶۸a(Ca0 response) {
        String requestMethod = response.m۱۶۴۳۸y().m۱۷۲۴۹e();
        if (p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cf.m۱۶۶۹۹a(response.m۱۶۴۳۸y().m۱۷۲۴۹e())) {
            try {
                m۱۶۴۷۱b(response.m۱۶۴۳۸y());
            } catch (IOException e2) {
            }
            return null;
        }
        if (!requestMethod.equals("GET") || Ce.m۱۶۶۹۶c(response)) {
            return null;
        }
        d entry = new d(response);
        Cd.c editor = null;
        try {
            editor = this.f۱۵۶۳۹d.m۱۶۵۸۷b(m۱۶۴۶۵a(response.m۱۶۴۳۸y().m۱۷۲۵۱g()));
            if (editor == null) {
                return null;
            }
            entry.m۱۶۴۸۷a(editor);
            return new b(editor);
        } catch (IOException e3) {
            m۱۶۴۶۶a(editor);
            return null;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۶۴۷۱b(Cy request) {
        this.f۱۵۶۳۹d.m۱۶۵۸۹d(m۱۶۴۶۵a(request.m۱۷۲۵۱g()));
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۴۶۹a(Ca0 cached, Ca0 network) {
        d entry = new d(network);
        Cd.e snapshot = ((c) cached.m۱۶۴۲۵l()).f۱۵۶۵۳c;
        Cd.c editor = null;
        try {
            editor = snapshot.m۱۶۶۰۷l();
            if (editor != null) {
                entry.m۱۶۴۸۷a(editor);
                editor.m۱۶۵۹۹b();
            }
        } catch (IOException e2) {
            m۱۶۴۶۶a(editor);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۴۶۶a(Cd.c editor) {
        if (editor != null) {
            try {
                editor.m۱۶۵۹۸a();
            } catch (IOException e2) {
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f۱۵۶۳۹d.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۱۵۶۳۹d.close();
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized void m۱۶۴۷۰a(p۲۹۵e.p۲۹۶f0.p۲۹۷e.Cc cacheStrategy) {
        this.f۱۵۶۴۴i++;
        if (cacheStrategy.f۱۵۷۱۷a != null) {
            this.f۱۵۶۴۲g++;
        } else if (cacheStrategy.f۱۵۷۱۸b != null) {
            this.f۱۵۶۴۳h++;
        }
    }

    /* renamed from: l, reason: contains not printable characters */
    synchronized void m۱۶۴۷۲l() {
        this.f۱۵۶۴۳h++;
    }

    /* renamed from: e.c$b */
    private final class b implements InterfaceCb {

        /* renamed from: a, reason: contains not printable characters */
        private final Cd.c f۱۵۶۴۶a;

        /* renamed from: b, reason: contains not printable characters */
        private InterfaceCr f۱۵۶۴۷b;

        /* renamed from: c, reason: contains not printable characters */
        private InterfaceCr f۱۵۶۴۸c;

        /* renamed from: d, reason: contains not printable characters */
        boolean f۱۵۶۴۹d;

        b(Cd.c editor) {
            this.f۱۵۶۴۶a = editor;
            this.f۱۵۶۴۷b = editor.m۱۶۵۹۷a(1);
            this.f۱۵۶۴۸c = new a(this.f۱۵۶۴۷b, Cc.this, editor);
        }

        /* renamed from: e.c$b$a */
        class a extends AbstractCg {

            /* renamed from: d, reason: contains not printable characters */
            final /* synthetic */ Cd.c f۱۵۶۵۱d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceCr x0, Cc cc, Cd.c cVar) {
                super(x0);
                this.f۱۵۶۵۱d = cVar;
            }

            @Override // p۳۰۵f.AbstractCg, p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (Cc.this) {
                    if (b.this.f۱۵۶۴۹d) {
                        return;
                    }
                    b.this.f۱۵۶۴۹d = true;
                    Cc.this.f۱۵۶۴۰e++;
                    super.close();
                    this.f۱۵۶۵۱d.m۱۶۵۹۹b();
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۵۶۸a() {
            synchronized (Cc.this) {
                if (this.f۱۵۶۴۹d) {
                    return;
                }
                this.f۱۵۶۴۹d = true;
                Cc.this.f۱۵۶۴۱f++;
                p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۲a(this.f۱۵۶۴۷b);
                try {
                    this.f۱۵۶۴۶a.m۱۶۵۹۸a();
                } catch (IOException e2) {
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.InterfaceCb
        /* renamed from: b, reason: contains not printable characters */
        public InterfaceCr mo۱۶۵۶۹b() {
            return this.f۱۵۶۴۸c;
        }
    }

    /* renamed from: e.c$d */
    private static final class d {

        /* renamed from: k, reason: contains not printable characters */
        private static final String f۱۵۶۵۷k = p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf.m۱۷۰۰۷d().m۱۷۰۱۱a() + "-Sent-Millis";

        /* renamed from: l, reason: contains not printable characters */
        private static final String f۱۵۶۵۸l = p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf.m۱۷۰۰۷d().m۱۷۰۱۱a() + "-Received-Millis";

        /* renamed from: a, reason: contains not printable characters */
        private final String f۱۵۶۵۹a;

        /* renamed from: b, reason: contains not printable characters */
        private final Cr f۱۵۶۶۰b;

        /* renamed from: c, reason: contains not printable characters */
        private final String f۱۵۶۶۱c;

        /* renamed from: d, reason: contains not printable characters */
        private final EnumCw f۱۵۶۶۲d;

        /* renamed from: e, reason: contains not printable characters */
        private final int f۱۵۶۶۳e;

        /* renamed from: f, reason: contains not printable characters */
        private final String f۱۵۶۶۴f;

        /* renamed from: g, reason: contains not printable characters */
        private final Cr f۱۵۶۶۵g;

        /* renamed from: h, reason: contains not printable characters */
        private final Cq f۱۵۶۶۶h;

        /* renamed from: i, reason: contains not printable characters */
        private final long f۱۵۶۶۷i;

        /* renamed from: j, reason: contains not printable characters */
        private final long f۱۵۶۶۸j;

        d(InterfaceCs in) {
            long j;
            EnumCd0 tlsVersion;
            try {
                InterfaceCe source = Cl.m۱۷۴۰۳a(in);
                this.f۱۵۶۵۹a = source.mo۱۷۴۴۴f();
                this.f۱۵۶۶۱c = source.mo۱۷۴۴۴f();
                Cr.a varyHeadersBuilder = new Cr.a();
                int varyRequestHeaderLineCount = Cc.m۱۶۴۶۴a(source);
                for (int i = 0; i < varyRequestHeaderLineCount; i++) {
                    varyHeadersBuilder.m۱۷۱۲۷a(source.mo۱۷۴۴۴f());
                }
                this.f۱۵۶۶۰b = varyHeadersBuilder.m۱۷۱۲۹a();
                Ck statusLine = Ck.m۱۶۷۲۹a(source.mo۱۷۴۴۴f());
                this.f۱۵۶۶۲d = statusLine.f۱۵۸۴۳a;
                this.f۱۵۶۶۳e = statusLine.f۱۵۸۴۴b;
                this.f۱۵۶۶۴f = statusLine.f۱۵۸۴۵c;
                Cr.a responseHeadersBuilder = new Cr.a();
                int responseHeaderLineCount = Cc.m۱۶۴۶۴a(source);
                for (int i2 = 0; i2 < responseHeaderLineCount; i2++) {
                    responseHeadersBuilder.m۱۷۱۲۷a(source.mo۱۷۴۴۴f());
                }
                String sendRequestMillisString = responseHeadersBuilder.m۱۷۱۳۱b(f۱۵۶۵۷k);
                String receivedResponseMillisString = responseHeadersBuilder.m۱۷۱۳۱b(f۱۵۶۵۸l);
                responseHeadersBuilder.m۱۷۱۳۲c(f۱۵۶۵۷k);
                responseHeadersBuilder.m۱۷۱۳۲c(f۱۵۶۵۸l);
                if (sendRequestMillisString != null) {
                    j = Long.parseLong(sendRequestMillisString);
                } else {
                    j = 0;
                }
                this.f۱۵۶۶۷i = j;
                this.f۱۵۶۶۸j = receivedResponseMillisString != null ? Long.parseLong(receivedResponseMillisString) : 0L;
                this.f۱۵۶۶۵g = responseHeadersBuilder.m۱۷۱۲۹a();
                if (!m۱۶۴۸۵a()) {
                    this.f۱۵۶۶۶h = null;
                } else {
                    String blank = source.mo۱۷۴۴۴f();
                    if (blank.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + blank + "\"");
                    }
                    String cipherSuiteString = source.mo۱۷۴۴۴f();
                    Ch cipherSuite = Ch.m۱۷۰۴۱a(cipherSuiteString);
                    List<Certificate> peerCertificates = m۱۶۴۸۳a(source);
                    List<Certificate> localCertificates = m۱۶۴۸۳a(source);
                    if (!source.mo۱۷۴۴۸i()) {
                        tlsVersion = EnumCd0.m۱۶۵۱۰a(source.mo۱۷۴۴۴f());
                    } else {
                        tlsVersion = EnumCd0.SSL_3_0;
                    }
                    this.f۱۵۶۶۶h = Cq.m۱۷۱۱۳a(tlsVersion, cipherSuite, peerCertificates, localCertificates);
                }
            } finally {
                in.close();
            }
        }

        d(Ca0 response) {
            this.f۱۵۶۵۹a = response.m۱۶۴۳۸y().m۱۷۲۵۱g().toString();
            this.f۱۵۶۶۰b = Ce.m۱۶۶۹۸e(response);
            this.f۱۵۶۶۱c = response.m۱۶۴۳۸y().m۱۷۲۴۹e();
            this.f۱۵۶۶۲d = response.m۱۶۴۳۶w();
            this.f۱۵۶۶۳e = response.m۱۶۴۲۸o();
            this.f۱۵۶۶۴f = response.m۱۶۴۳۲s();
            this.f۱۵۶۶۵g = response.m۱۶۴۳۰q();
            this.f۱۵۶۶۶h = response.m۱۶۴۲۹p();
            this.f۱۵۶۶۷i = response.m۱۶۴۳۹z();
            this.f۱۵۶۶۸j = response.m۱۶۴۳۷x();
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۶۴۸۷a(Cd.c editor) {
            InterfaceCd sink = Cl.m۱۷۴۰۲a(editor.m۱۶۵۹۷a(0));
            sink.mo۱۷۴۲۶a(this.f۱۵۶۵۹a).writeByte(10);
            sink.mo۱۷۴۲۶a(this.f۱۵۶۶۱c).writeByte(10);
            sink.mo۱۷۴۳۰e(this.f۱۵۶۶۰b.m۱۷۱۲۳b()).writeByte(10);
            int size = this.f۱۵۶۶۰b.m۱۷۱۲۳b();
            for (int i = 0; i < size; i++) {
                sink.mo۱۷۴۲۶a(this.f۱۵۶۶۰b.m۱۷۱۲۱a(i)).mo۱۷۴۲۶a(": ").mo۱۷۴۲۶a(this.f۱۵۶۶۰b.m۱۷۱۲۴b(i)).writeByte(10);
            }
            sink.mo۱۷۴۲۶a(new Ck(this.f۱۵۶۶۲d, this.f۱۵۶۶۳e, this.f۱۵۶۶۴f).toString()).writeByte(10);
            sink.mo۱۷۴۳۰e(this.f۱۵۶۶۵g.m۱۷۱۲۳b() + 2).writeByte(10);
            int size2 = this.f۱۵۶۶۵g.m۱۷۱۲۳b();
            for (int i2 = 0; i2 < size2; i2++) {
                sink.mo۱۷۴۲۶a(this.f۱۵۶۶۵g.m۱۷۱۲۱a(i2)).mo۱۷۴۲۶a(": ").mo۱۷۴۲۶a(this.f۱۵۶۶۵g.m۱۷۱۲۴b(i2)).writeByte(10);
            }
            sink.mo۱۷۴۲۶a(f۱۵۶۵۷k).mo۱۷۴۲۶a(": ").mo۱۷۴۳۰e(this.f۱۵۶۶۷i).writeByte(10);
            sink.mo۱۷۴۲۶a(f۱۵۶۵۸l).mo۱۷۴۲۶a(": ").mo۱۷۴۳۰e(this.f۱۵۶۶۸j).writeByte(10);
            if (m۱۶۴۸۵a()) {
                sink.writeByte(10);
                sink.mo۱۷۴۲۶a(this.f۱۵۶۶۶h.m۱۷۱۱۵a().m۱۷۰۴۴a()).writeByte(10);
                m۱۶۴۸۴a(sink, this.f۱۵۶۶۶h.m۱۷۱۱۷c());
                m۱۶۴۸۴a(sink, this.f۱۵۶۶۶h.m۱۷۱۱۶b());
                sink.mo۱۷۴۲۶a(this.f۱۵۶۶۶h.m۱۷۱۱۸d().m۱۶۵۱۲a()).writeByte(10);
            }
            sink.close();
        }

        /* renamed from: a, reason: contains not printable characters */
        private boolean m۱۶۴۸۵a() {
            return this.f۱۵۶۵۹a.startsWith("https://");
        }

        /* renamed from: a, reason: contains not printable characters */
        private List<Certificate> m۱۶۴۸۳a(InterfaceCe source) {
            int length = Cc.m۱۶۴۶۴a(source);
            if (length == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                List<Certificate> result = new ArrayList<>(length);
                for (int i = 0; i < length; i++) {
                    String line = source.mo۱۷۴۴۴f();
                    p۳۰۵f.Cc bytes = new p۳۰۵f.Cc();
                    bytes.m۱۷۲۹۴a(Cf.m۱۷۳۵۷a(line));
                    result.add(certificateFactory.generateCertificate(bytes.mo۱۷۴۵۰k()));
                }
                return result;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۴۸۴a(InterfaceCd sink, List<Certificate> certificates) {
            try {
                sink.mo۱۷۴۳۰e(certificates.size()).writeByte(10);
                int size = certificates.size();
                for (int i = 0; i < size; i++) {
                    byte[] bytes = certificates.get(i).getEncoded();
                    String line = Cf.m۱۷۳۵۸a(bytes).mo۱۷۴۶۳a();
                    sink.mo۱۷۴۲۶a(line).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public boolean m۱۶۴۸۸a(Cy request, Ca0 response) {
            return this.f۱۵۶۵۹a.equals(request.m۱۷۲۵۱g().toString()) && this.f۱۵۶۶۱c.equals(request.m۱۷۲۴۹e()) && Ce.m۱۶۶۹۱a(response, this.f۱۵۶۶۰b, request);
        }

        /* renamed from: a, reason: contains not printable characters */
        public Ca0 m۱۶۴۸۶a(Cd.e snapshot) {
            String contentType = this.f۱۵۶۶۵g.m۱۷۱۲۲a("Content-Type");
            String contentLength = this.f۱۵۶۶۵g.m۱۷۱۲۲a("Content-Length");
            Cy.a aVar = new Cy.a();
            aVar.m۱۷۲۵۹b(this.f۱۵۶۵۹a);
            aVar.m۱۷۲۵۶a(this.f۱۵۶۶۱c, (AbstractCz) null);
            aVar.m۱۷۲۵۳a(this.f۱۵۶۶۰b);
            Cy cacheRequest = aVar.m۱۷۲۵۸a();
            Ca0.a aVar2 = new Ca0.a();
            aVar2.m۱۶۴۴۹a(cacheRequest);
            aVar2.m۱۶۴۴۸a(this.f۱۵۶۶۲d);
            aVar2.m۱۶۴۴۲a(this.f۱۵۶۶۳e);
            aVar2.m۱۶۴۵۰a(this.f۱۵۶۶۴f);
            aVar2.m۱۶۴۴۷a(this.f۱۵۶۶۵g);
            aVar2.m۱۶۴۴۵a(new c(snapshot, contentType, contentLength));
            aVar2.m۱۶۴۴۶a(this.f۱۵۶۶۶h);
            aVar2.m۱۶۴۵۳b(this.f۱۵۶۶۷i);
            aVar2.m۱۶۴۴۳a(this.f۱۵۶۶۸j);
            return aVar2.m۱۶۴۵۲a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۶۴۶۴a(InterfaceCe source) {
        try {
            long result = source.mo۱۷۴۴۳e();
            String line = source.mo۱۷۴۴۴f();
            if (result < 0 || result > 2147483647L || !line.isEmpty()) {
                throw new IOException("expected an int but was \"" + result + line + "\"");
            }
            return (int) result;
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* renamed from: e.c$c */
    private static class c extends AbstractCb0 {

        /* renamed from: c, reason: contains not printable characters */
        final Cd.e f۱۵۶۵۳c;

        /* renamed from: d, reason: contains not printable characters */
        private final InterfaceCe f۱۵۶۵۴d;

        /* renamed from: e, reason: contains not printable characters */
        private final String f۱۵۶۵۵e;

        c(Cd.e snapshot, String contentType, String contentLength) {
            this.f۱۵۶۵۳c = snapshot;
            this.f۱۵۶۵۵e = contentLength;
            InterfaceCs source = snapshot.m۱۶۶۰۶a(1);
            this.f۱۵۶۵۴d = Cl.m۱۷۴۰۳a(new a(this, source, snapshot));
        }

        /* renamed from: e.c$c$a */
        class a extends AbstractCh {

            /* renamed from: d, reason: contains not printable characters */
            final /* synthetic */ Cd.e f۱۵۶۵۶d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c this$0, InterfaceCs x0, Cd.e eVar) {
                super(x0);
                this.f۱۵۶۵۶d = eVar;
            }

            @Override // p۳۰۵f.AbstractCh, p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f۱۵۶۵۶d.close();
                super.close();
            }
        }

        @Override // p۲۹۵e.AbstractCb0
        /* renamed from: l, reason: contains not printable characters */
        public long mo۱۶۷۱۵l() {
            try {
                if (this.f۱۵۶۵۵e != null) {
                    return Long.parseLong(this.f۱۵۶۵۵e);
                }
                return -1L;
            } catch (NumberFormatException e2) {
                return -1L;
            }
        }

        @Override // p۲۹۵e.AbstractCb0
        /* renamed from: m, reason: contains not printable characters */
        public InterfaceCe mo۱۶۷۱۶m() {
            return this.f۱۵۶۵۴d;
        }
    }
}
