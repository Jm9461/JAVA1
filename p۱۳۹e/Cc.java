package p۱۳۹e;

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
import p۱۳۹e.Ca0;
import p۱۳۹e.Cr;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCb;
import p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf;
import p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cd;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ck;
import p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCg;
import p۱۴۹f.AbstractCh;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cf;
import p۱۴۹f.Cl;

/* renamed from: e.c  reason: invalid class name */
public final class Cc implements Closeable, Flushable {

    /* renamed from: c  reason: contains not printable characters */
    final AbstractCf f۱۵۶۳۸c;

    /* renamed from: d  reason: contains not printable characters */
    final p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cd f۱۵۶۳۹d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۵۶۴۰e;

    /* renamed from: f  reason: contains not printable characters */
    int f۱۵۶۴۱f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۶۴۲g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۵۶۴۳h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۶۴۴i;

    /* renamed from: e.c$a  reason: invalid class name */
    class Ca implements AbstractCf {
        Ca() {
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public Ca0 m۱۸۵۵۲a(Cy request) {
            return Cc.this.m۱۸۵۴۶a(request);
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCb m۱۸۵۵۳a(Ca0 response) {
            return Cc.this.m۱۸۵۴۷a(response);
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۵۵۷b(Cy request) {
            Cc.this.m۱۸۵۵۰b(request);
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۵۵۵a(Ca0 cached, Ca0 network) {
            Cc.this.m۱۸۵۴۸a(cached, network);
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۵۵۴a() {
            Cc.this.m۱۸۵۵۱l();
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۵۵۶a(p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cc cacheStrategy) {
            Cc.this.m۱۸۵۴۹a(cacheStrategy);
        }
    }

    public Cc(File directory, long maxSize) {
        this(directory, maxSize, AbstractCa.f۱۶۰۴۴a);
    }

    Cc(File directory, long maxSize, AbstractCa fileSystem) {
        this.f۱۵۶۳۸c = new Ca();
        this.f۱۵۶۳۹d = p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cd.m۱۸۶۵۶a(fileSystem, directory, 201105, 2, maxSize);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۸۵۴۴a(Cs url) {
        return Cf.m۱۹۴۳۸d(url.toString()).m۱۹۴۴۸c().m۱۹۴۴۶b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۵۴۶a(Cy request) {
        try {
            Cd.Ce snapshot = this.f۱۵۶۳۹d.m۱۸۶۶۷c(m۱۸۵۴۴a(request.m۱۹۳۲۹g()));
            if (snapshot == null) {
                return null;
            }
            try {
                Cd entry = new Cd(snapshot.m۱۸۶۸۵a(0));
                Ca0 response = entry.m۱۸۵۶۵a(snapshot);
                if (entry.m۱۸۵۶۷a(request, response)) {
                    return response;
                }
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(response.m۱۸۵۰۴l());
                return null;
            } catch (IOException e) {
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(snapshot);
                return null;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb m۱۸۵۴۷a(Ca0 response) {
        String requestMethod = response.m۱۸۵۱۷y().m۱۹۳۲۷e();
        if (p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cf.m۱۸۷۷۸a(response.m۱۸۵۱۷y().m۱۹۳۲۷e())) {
            try {
                m۱۸۵۵۰b(response.m۱۸۵۱۷y());
            } catch (IOException e) {
            }
            return null;
        } else if (!requestMethod.equals("GET") || Ce.m۱۸۷۷۵c(response)) {
            return null;
        } else {
            Cd entry = new Cd(response);
            try {
                Cd.Cc editor = this.f۱۵۶۳۹d.m۱۸۶۶۶b(m۱۸۵۴۴a(response.m۱۸۵۱۷y().m۱۹۳۲۹g()));
                if (editor == null) {
                    return null;
                }
                entry.m۱۸۵۶۶a(editor);
                return new Cb(editor);
            } catch (IOException e2) {
                m۱۸۵۴۵a((Cd.Cc) null);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۵۵۰b(Cy request) {
        this.f۱۵۶۳۹d.m۱۸۶۶۸d(m۱۸۵۴۴a(request.m۱۹۳۲۹g()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۵۴۸a(Ca0 cached, Ca0 network) {
        Cd entry = new Cd(network);
        try {
            Cd.Cc editor = ((Cc) cached.m۱۸۵۰۴l()).f۱۵۶۵۳c.m۱۸۶۸۶l();
            if (editor != null) {
                entry.m۱۸۵۶۶a(editor);
                editor.m۱۸۶۷۸b();
            }
        } catch (IOException e) {
            m۱۸۵۴۵a((Cd.Cc) null);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۵۴۵a(Cd.Cc editor) {
        if (editor != null) {
            try {
                editor.m۱۸۶۷۷a();
            } catch (IOException e) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۵۴۹a(p۱۳۹e.p۱۴۰f0.p۱۴۱e.Cc cacheStrategy) {
        this.f۱۵۶۴۴i++;
        if (cacheStrategy.f۱۵۷۱۷a != null) {
            this.f۱۵۶۴۲g++;
        } else if (cacheStrategy.f۱۵۷۱۸b != null) {
            this.f۱۵۶۴۳h++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public synchronized void m۱۸۵۵۱l() {
        this.f۱۵۶۴۳h++;
    }

    /* access modifiers changed from: private */
    /* renamed from: e.c$b  reason: invalid class name */
    public final class Cb implements AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        private final Cd.Cc f۱۵۶۴۶a;

        /* renamed from: b  reason: contains not printable characters */
        private AbstractCr f۱۵۶۴۷b;

        /* renamed from: c  reason: contains not printable characters */
        private AbstractCr f۱۵۶۴۸c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۵۶۴۹d;

        Cb(Cd.Cc editor) {
            this.f۱۵۶۴۶a = editor;
            this.f۱۵۶۴۷b = editor.m۱۸۶۷۶a(1);
            this.f۱۵۶۴۸c = new Ca(this.f۱۵۶۴۷b, Cc.this, editor);
        }

        /* renamed from: e.c$b$a  reason: invalid class name */
        class Ca extends AbstractCg {

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ Cd.Cc f۱۵۶۵۱d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Ca(AbstractCr x0, Cc cVar, Cd.Cc cVar2) {
                super(x0);
                this.f۱۵۶۵۱d = cVar2;
            }

            @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable, p۱۴۹f.AbstractCg
            public void close() {
                synchronized (Cc.this) {
                    if (!Cb.this.f۱۵۶۴۹d) {
                        Cb.this.f۱۵۶۴۹d = true;
                        Cc.this.f۱۵۶۴۰e++;
                        super.close();
                        this.f۱۵۶۵۱d.m۱۸۶۷۸b();
                    }
                }
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۵۵۸a() {
            synchronized (Cc.this) {
                if (!this.f۱۵۶۴۹d) {
                    this.f۱۵۶۴۹d = true;
                    Cc.this.f۱۵۶۴۱f++;
                    p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(this.f۱۵۶۴۷b);
                    try {
                        this.f۱۵۶۴۶a.m۱۸۶۷۷a();
                    } catch (IOException e) {
                    }
                }
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public AbstractCr m۱۸۵۵۹b() {
            return this.f۱۵۶۴۸c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.c$d  reason: invalid class name */
    public static final class Cd {

        /* renamed from: k  reason: contains not printable characters */
        private static final String f۱۵۶۵۷k = (p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf.m۱۹۰۸۶d().m۱۹۰۹۰a() + "-Sent-Millis");

        /* renamed from: l  reason: contains not printable characters */
        private static final String f۱۵۶۵۸l = (p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf.m۱۹۰۸۶d().m۱۹۰۹۰a() + "-Received-Millis");

        /* renamed from: a  reason: contains not printable characters */
        private final String f۱۵۶۵۹a;

        /* renamed from: b  reason: contains not printable characters */
        private final Cr f۱۵۶۶۰b;

        /* renamed from: c  reason: contains not printable characters */
        private final String f۱۵۶۶۱c;

        /* renamed from: d  reason: contains not printable characters */
        private final EnumCw f۱۵۶۶۲d;

        /* renamed from: e  reason: contains not printable characters */
        private final int f۱۵۶۶۳e;

        /* renamed from: f  reason: contains not printable characters */
        private final String f۱۵۶۶۴f;

        /* renamed from: g  reason: contains not printable characters */
        private final Cr f۱۵۶۶۵g;

        /* renamed from: h  reason: contains not printable characters */
        private final Cq f۱۵۶۶۶h;

        /* renamed from: i  reason: contains not printable characters */
        private final long f۱۵۶۶۷i;

        /* renamed from: j  reason: contains not printable characters */
        private final long f۱۵۶۶۸j;

        Cd(AbstractCs in) {
            EnumCd0 tlsVersion;
            try {
                AbstractCe source = Cl.m۱۹۴۸۰a(in);
                this.f۱۵۶۵۹a = source.m۱۹۴۲۵f();
                this.f۱۵۶۶۱c = source.m۱۹۴۲۵f();
                Cr.Ca varyHeadersBuilder = new Cr.Ca();
                int varyRequestHeaderLineCount = Cc.m۱۸۵۴۳a(source);
                for (int i = 0; i < varyRequestHeaderLineCount; i++) {
                    varyHeadersBuilder.m۱۹۲۰۶a(source.m۱۹۴۲۵f());
                }
                this.f۱۵۶۶۰b = varyHeadersBuilder.m۱۹۲۰۸a();
                Ck statusLine = Ck.m۱۸۸۰۸a(source.m۱۹۴۲۵f());
                this.f۱۵۶۶۲d = statusLine.f۱۵۸۴۳a;
                this.f۱۵۶۶۳e = statusLine.f۱۵۸۴۴b;
                this.f۱۵۶۶۴f = statusLine.f۱۵۸۴۵c;
                Cr.Ca responseHeadersBuilder = new Cr.Ca();
                int responseHeaderLineCount = Cc.m۱۸۵۴۳a(source);
                for (int i2 = 0; i2 < responseHeaderLineCount; i2++) {
                    responseHeadersBuilder.m۱۹۲۰۶a(source.m۱۹۴۲۵f());
                }
                String sendRequestMillisString = responseHeadersBuilder.m۱۹۲۱۰b(f۱۵۶۵۷k);
                String receivedResponseMillisString = responseHeadersBuilder.m۱۹۲۱۰b(f۱۵۶۵۸l);
                responseHeadersBuilder.m۱۹۲۱۱c(f۱۵۶۵۷k);
                responseHeadersBuilder.m۱۹۲۱۱c(f۱۵۶۵۸l);
                long j = 0;
                this.f۱۵۶۶۷i = sendRequestMillisString != null ? Long.parseLong(sendRequestMillisString) : 0;
                this.f۱۵۶۶۸j = receivedResponseMillisString != null ? Long.parseLong(receivedResponseMillisString) : j;
                this.f۱۵۶۶۵g = responseHeadersBuilder.m۱۹۲۰۸a();
                if (m۱۸۵۶۴a()) {
                    String blank = source.m۱۹۴۲۵f();
                    if (blank.length() <= 0) {
                        Ch cipherSuite = Ch.m۱۹۱۲۰a(source.m۱۹۴۲۵f());
                        List<Certificate> peerCertificates = m۱۸۵۶۲a(source);
                        List<Certificate> localCertificates = m۱۸۵۶۲a(source);
                        if (!source.m۱۹۴۲۹i()) {
                            tlsVersion = EnumCd0.m۱۸۵۸۹a(source.m۱۹۴۲۵f());
                        } else {
                            tlsVersion = EnumCd0.SSL_3_0;
                        }
                        this.f۱۵۶۶۶h = Cq.m۱۹۱۹۲a(tlsVersion, cipherSuite, peerCertificates, localCertificates);
                    } else {
                        throw new IOException("expected \"\" but was \"" + blank + "\"");
                    }
                } else {
                    this.f۱۵۶۶۶h = null;
                }
            } finally {
                in.close();
            }
        }

        Cd(Ca0 response) {
            this.f۱۵۶۵۹a = response.m۱۸۵۱۷y().m۱۹۳۲۹g().toString();
            this.f۱۵۶۶۰b = Ce.m۱۸۷۷۷e(response);
            this.f۱۵۶۶۱c = response.m۱۸۵۱۷y().m۱۹۳۲۷e();
            this.f۱۵۶۶۲d = response.m۱۸۵۱۵w();
            this.f۱۵۶۶۳e = response.m۱۸۵۰۷o();
            this.f۱۵۶۶۴f = response.m۱۸۵۱۱s();
            this.f۱۵۶۶۵g = response.m۱۸۵۰۹q();
            this.f۱۵۶۶۶h = response.m۱۸۵۰۸p();
            this.f۱۵۶۶۷i = response.m۱۸۵۱۸z();
            this.f۱۵۶۶۸j = response.m۱۸۵۱۶x();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۵۶۶a(Cd.Cc editor) {
            AbstractCd sink = Cl.m۱۹۴۷۹a(editor.m۱۸۶۷۶a(0));
            sink.m۱۹۴۱۴a(this.f۱۵۶۵۹a).writeByte(10);
            sink.m۱۹۴۱۴a(this.f۱۵۶۶۱c).writeByte(10);
            sink.m۱۹۴۱۶e((long) this.f۱۵۶۶۰b.m۱۹۲۰۲b()).writeByte(10);
            int size = this.f۱۵۶۶۰b.m۱۹۲۰۲b();
            for (int i = 0; i < size; i++) {
                sink.m۱۹۴۱۴a(this.f۱۵۶۶۰b.m۱۹۲۰۰a(i)).m۱۹۴۱۴a(": ").m۱۹۴۱۴a(this.f۱۵۶۶۰b.m۱۹۲۰۳b(i)).writeByte(10);
            }
            sink.m۱۹۴۱۴a(new Ck(this.f۱۵۶۶۲d, this.f۱۵۶۶۳e, this.f۱۵۶۶۴f).toString()).writeByte(10);
            sink.m۱۹۴۱۶e((long) (this.f۱۵۶۶۵g.m۱۹۲۰۲b() + 2)).writeByte(10);
            int size2 = this.f۱۵۶۶۵g.m۱۹۲۰۲b();
            for (int i2 = 0; i2 < size2; i2++) {
                sink.m۱۹۴۱۴a(this.f۱۵۶۶۵g.m۱۹۲۰۰a(i2)).m۱۹۴۱۴a(": ").m۱۹۴۱۴a(this.f۱۵۶۶۵g.m۱۹۲۰۳b(i2)).writeByte(10);
            }
            sink.m۱۹۴۱۴a(f۱۵۶۵۷k).m۱۹۴۱۴a(": ").m۱۹۴۱۶e(this.f۱۵۶۶۷i).writeByte(10);
            sink.m۱۹۴۱۴a(f۱۵۶۵۸l).m۱۹۴۱۴a(": ").m۱۹۴۱۶e(this.f۱۵۶۶۸j).writeByte(10);
            if (m۱۸۵۶۴a()) {
                sink.writeByte(10);
                sink.m۱۹۴۱۴a(this.f۱۵۶۶۶h.m۱۹۱۹۴a().m۱۹۱۲۳a()).writeByte(10);
                m۱۸۵۶۳a(sink, this.f۱۵۶۶۶h.m۱۹۱۹۶c());
                m۱۸۵۶۳a(sink, this.f۱۵۶۶۶h.m۱۹۱۹۵b());
                sink.m۱۹۴۱۴a(this.f۱۵۶۶۶h.m۱۹۱۹۷d().m۱۸۵۹۱a()).writeByte(10);
            }
            sink.close();
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۸۵۶۴a() {
            return this.f۱۵۶۵۹a.startsWith("https://");
        }

        /* renamed from: a  reason: contains not printable characters */
        private List<Certificate> m۱۸۵۶۲a(AbstractCe source) {
            int length = Cc.m۱۸۵۴۳a(source);
            if (length == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                List<Certificate> result = new ArrayList<>(length);
                for (int i = 0; i < length; i++) {
                    String line = source.m۱۹۴۲۵f();
                    p۱۴۹f.Cc bytes = new p۱۴۹f.Cc();
                    bytes.m۱۹۳۷۲a(Cf.m۱۹۴۳۴a(line));
                    result.add(certificateFactory.generateCertificate(bytes.m۱۹۴۰۵k()));
                }
                return result;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۵۶۳a(AbstractCd sink, List<Certificate> certificates) {
            try {
                sink.m۱۹۴۱۶e((long) certificates.size()).writeByte(10);
                int size = certificates.size();
                for (int i = 0; i < size; i++) {
                    sink.m۱۹۴۱۴a(Cf.m۱۹۴۳۵a(certificates.get(i).getEncoded()).m۱۹۴۴۲a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۸۵۶۷a(Cy request, Ca0 response) {
            return this.f۱۵۶۵۹a.equals(request.m۱۹۳۲۹g().toString()) && this.f۱۵۶۶۱c.equals(request.m۱۹۳۲۷e()) && Ce.m۱۸۷۷۰a(response, this.f۱۵۶۶۰b, request);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca0 m۱۸۵۶۵a(Cd.Ce snapshot) {
            String contentType = this.f۱۵۶۶۵g.m۱۹۲۰۱a("Content-Type");
            String contentLength = this.f۱۵۶۶۵g.m۱۹۲۰۱a("Content-Length");
            Cy.Ca aVar = new Cy.Ca();
            aVar.m۱۹۳۳۷b(this.f۱۵۶۵۹a);
            aVar.m۱۹۳۳۴a(this.f۱۵۶۶۱c, (AbstractCz) null);
            aVar.m۱۹۳۳۱a(this.f۱۵۶۶۰b);
            Cy cacheRequest = aVar.m۱۹۳۳۶a();
            Ca0.Ca aVar2 = new Ca0.Ca();
            aVar2.m۱۸۵۲۸a(cacheRequest);
            aVar2.m۱۸۵۲۷a(this.f۱۵۶۶۲d);
            aVar2.m۱۸۵۲۱a(this.f۱۵۶۶۳e);
            aVar2.m۱۸۵۲۹a(this.f۱۵۶۶۴f);
            aVar2.m۱۸۵۲۶a(this.f۱۵۶۶۵g);
            aVar2.m۱۸۵۲۴a(new Cc(snapshot, contentType, contentLength));
            aVar2.m۱۸۵۲۵a(this.f۱۵۶۶۶h);
            aVar2.m۱۸۵۳۲b(this.f۱۵۶۶۷i);
            aVar2.m۱۸۵۲۲a(this.f۱۵۶۶۸j);
            return aVar2.m۱۸۵۳۱a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۵۴۳a(AbstractCe source) {
        try {
            long result = source.m۱۹۴۲۴e();
            String line = source.m۱۹۴۲۵f();
            if (result >= 0 && result <= 2147483647L && line.isEmpty()) {
                return (int) result;
            }
            throw new IOException("expected an int but was \"" + result + line + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.c$c  reason: invalid class name */
    public static class Cc extends AbstractCb0 {

        /* renamed from: c  reason: contains not printable characters */
        final Cd.Ce f۱۵۶۵۳c;

        /* renamed from: d  reason: contains not printable characters */
        private final AbstractCe f۱۵۶۵۴d;

        /* renamed from: e  reason: contains not printable characters */
        private final String f۱۵۶۵۵e;

        Cc(Cd.Ce snapshot, String contentType, String contentLength) {
            this.f۱۵۶۵۳c = snapshot;
            this.f۱۵۶۵۵e = contentLength;
            this.f۱۵۶۵۴d = Cl.m۱۹۴۸۰a(new Ca(this, snapshot.m۱۸۶۸۵a(1), snapshot));
        }

        /* renamed from: e.c$c$a  reason: invalid class name */
        class Ca extends AbstractCh {

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ Cd.Ce f۱۵۶۵۶d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Ca(Cc this$0, AbstractCs x0, Cd.Ce eVar) {
                super(x0);
                this.f۱۵۶۵۶d = eVar;
            }

            @Override // p۱۴۹f.AbstractCh, java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
            public void close() {
                this.f۱۵۶۵۶d.close();
                super.close();
            }
        }

        @Override // p۱۳۹e.AbstractCb0
        /* renamed from: l  reason: contains not printable characters */
        public long m۱۸۵۶۰l() {
            try {
                if (this.f۱۵۶۵۵e != null) {
                    return Long.parseLong(this.f۱۵۶۵۵e);
                }
                return -1;
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        @Override // p۱۳۹e.AbstractCb0
        /* renamed from: m  reason: contains not printable characters */
        public AbstractCe m۱۸۵۶۱m() {
            return this.f۱۵۶۵۴d;
        }
    }
}
