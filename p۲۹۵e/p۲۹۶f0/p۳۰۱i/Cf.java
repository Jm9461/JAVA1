package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;
import p۲۹۵e.AbstractCb0;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cr;
import p۲۹۵e.Cv;
import p۲۹۵e.Cy;
import p۲۹۵e.EnumCw;
import p۲۹۵e.InterfaceCt;
import p۲۹۵e.p۲۹۶f0.AbstractCa;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۸f.Cg;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ce;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ch;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ci;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Ck;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc;
import p۳۰۵f.AbstractCh;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.i.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf implements InterfaceCc {

    /* renamed from: e, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۱۴e = p۳۰۵f.Cf.m۱۷۳۶۱d("connection");

    /* renamed from: f, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۱۵f = p۳۰۵f.Cf.m۱۷۳۶۱d("host");

    /* renamed from: g, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۱۶g = p۳۰۵f.Cf.m۱۷۳۶۱d("keep-alive");

    /* renamed from: h, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۱۷h = p۳۰۵f.Cf.m۱۷۳۶۱d("proxy-connection");

    /* renamed from: i, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۱۸i = p۳۰۵f.Cf.m۱۷۳۶۱d("transfer-encoding");

    /* renamed from: j, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۱۹j = p۳۰۵f.Cf.m۱۷۳۶۱d("te");

    /* renamed from: k, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۲۰k = p۳۰۵f.Cf.m۱۷۳۶۱d("encoding");

    /* renamed from: l, reason: contains not printable characters */
    private static final p۳۰۵f.Cf f۱۵۹۲۱l = p۳۰۵f.Cf.m۱۷۳۶۱d("upgrade");

    /* renamed from: m, reason: contains not printable characters */
    private static final List<p۳۰۵f.Cf> f۱۵۹۲۲m = Cc.m۱۶۵۳۹a(f۱۵۹۱۴e, f۱۵۹۱۵f, f۱۵۹۱۶g, f۱۵۹۱۷h, f۱۵۹۱۹j, f۱۵۹۱۸i, f۱۵۹۲۰k, f۱۵۹۲۱l, Cc.f۱۵۸۸۴f, Cc.f۱۵۸۸۵g, Cc.f۱۵۸۸۶h, Cc.f۱۵۸۸۷i);

    /* renamed from: n, reason: contains not printable characters */
    private static final List<p۳۰۵f.Cf> f۱۵۹۲۳n = Cc.m۱۶۵۳۹a(f۱۵۹۱۴e, f۱۵۹۱۵f, f۱۵۹۱۶g, f۱۵۹۱۷h, f۱۵۹۱۹j, f۱۵۹۱۸i, f۱۵۹۲۰k, f۱۵۹۲۱l);

    /* renamed from: a, reason: contains not printable characters */
    private final InterfaceCt.a f۱۵۹۲۴a;

    /* renamed from: b, reason: contains not printable characters */
    final Cg f۱۵۹۲۵b;

    /* renamed from: c, reason: contains not printable characters */
    private final Cg f۱۵۹۲۶c;

    /* renamed from: d, reason: contains not printable characters */
    private Ci f۱۵۹۲۷d;

    public Cf(Cv client, InterfaceCt.a chain, Cg streamAllocation, Cg connection) {
        this.f۱۵۹۲۴a = chain;
        this.f۱۵۹۲۵b = streamAllocation;
        this.f۱۵۹۲۶c = connection;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCr mo۱۶۷۹۲a(Cy request, long contentLength) {
        return this.f۱۵۹۲۷d.m۱۶۸۹۱d();
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۷۹۴a(Cy request) {
        if (this.f۱۵۹۲۷d != null) {
            return;
        }
        boolean hasRequestBody = request.m۱۷۲۴۳a() != null;
        this.f۱۵۹۲۷d = this.f۱۵۹۲۶c.m۱۶۸۰۵a(m۱۶۷۸۹b(request), hasRequestBody);
        this.f۱۵۹۲۷d.m۱۶۸۹۵h().mo۱۷۴۸۸a(this.f۱۵۹۲۴a.mo۱۷۱۸۸d(), TimeUnit.MILLISECONDS);
        this.f۱۵۹۲۷d.m۱۶۸۹۹l().mo۱۷۴۸۸a(this.f۱۵۹۲۴a.mo۱۷۱۸۴a(), TimeUnit.MILLISECONDS);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۶۷۹۵b() {
        this.f۱۵۹۲۶c.flush();
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۷۹۳a() {
        this.f۱۵۹۲۷d.m۱۶۸۹۱d().close();
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public Ca0.a mo۱۶۷۹۰a(boolean expectContinue) {
        Ca0.a responseBuilder = m۱۶۷۸۸a(this.f۱۵۹۲۷d.m۱۶۸۹۷j());
        if (expectContinue && AbstractCa.f۱۵۷۰۱a.mo۱۷۲۱۸a(responseBuilder) == 100) {
            return null;
        }
        return responseBuilder;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static List<Cc> m۱۶۷۸۹b(Cy request) {
        Cr headers = request.m۱۷۲۴۷c();
        List<Header> result = new ArrayList<>(headers.m۱۷۱۲۳b() + 4);
        result.add(new Cc(Cc.f۱۵۸۸۴f, request.m۱۷۲۴۹e()));
        result.add(new Cc(Cc.f۱۵۸۸۵g, Ci.m۱۶۷۱۷a(request.m۱۷۲۵۱g())));
        String host = request.m۱۷۲۴۴a("Host");
        if (host != null) {
            result.add(new Cc(Cc.f۱۵۸۸۷i, host));
        }
        result.add(new Cc(Cc.f۱۵۸۸۶h, request.m۱۷۲۵۱g().m۱۷۱۶۱m()));
        int size = headers.m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            p۳۰۵f.Cf name = p۳۰۵f.Cf.m۱۷۳۶۱d(headers.m۱۷۱۲۱a(i).toLowerCase(Locale.US));
            if (!f۱۵۹۲۲m.contains(name)) {
                result.add(new Cc(name, headers.m۱۷۱۲۴b(i)));
            }
        }
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ca0.a m۱۶۷۸۸a(List<Cc> list) {
        Ck statusLine = null;
        Cr.a headersBuilder = new Cr.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Cc header = list.get(i);
            if (header == null) {
                if (statusLine != null && statusLine.f۱۵۸۴۴b == 100) {
                    statusLine = null;
                    headersBuilder = new Cr.a();
                }
            } else {
                p۳۰۵f.Cf name = header.f۱۵۸۸۸a;
                String value = header.f۱۵۸۸۹b.mo۱۷۴۷۴i();
                if (name.equals(Cc.f۱۵۸۸۳e)) {
                    statusLine = Ck.m۱۶۷۲۹a("HTTP/1.1 " + value);
                } else if (!f۱۵۹۲۳n.contains(name)) {
                    AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۴a(headersBuilder, name.mo۱۷۴۷۴i(), value);
                }
            }
        }
        if (statusLine == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Ca0.a aVar = new Ca0.a();
        aVar.m۱۶۴۴۸a(EnumCw.HTTP_2);
        aVar.m۱۶۴۴۲a(statusLine.f۱۵۸۴۴b);
        aVar.m۱۶۴۵۰a(statusLine.f۱۵۸۴۵c);
        aVar.m۱۶۴۴۷a(headersBuilder.m۱۷۱۲۹a());
        return aVar;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۲۹۹g.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb0 mo۱۶۷۹۱a(Ca0 response) {
        Cg cg = this.f۱۵۹۲۵b;
        cg.f۱۵۸۰۹f.m۱۷۱۰۸e(cg.f۱۵۸۰۸e);
        String contentType = response.m۱۶۴۲۴b("Content-Type");
        long contentLength = Ce.m۱۶۶۸۶a(response);
        InterfaceCs source = new a(this.f۱۵۹۲۷d.m۱۶۸۹۲e());
        return new Ch(contentType, contentLength, Cl.m۱۷۴۰۳a(source));
    }

    /* renamed from: e.f0.i.f$a */
    class a extends AbstractCh {

        /* renamed from: d, reason: contains not printable characters */
        boolean f۱۵۹۲۸d;

        /* renamed from: e, reason: contains not printable characters */
        long f۱۵۹۲۹e;

        a(InterfaceCs delegate) {
            super(delegate);
            this.f۱۵۹۲۸d = false;
            this.f۱۵۹۲۹e = 0L;
        }

        @Override // p۳۰۵f.AbstractCh, p۳۰۵f.InterfaceCs
        /* renamed from: b, reason: contains not printable characters */
        public long mo۱۷۴۷۷b(p۳۰۵f.Cc sink, long byteCount) {
            try {
                long read = m۱۷۳۸۲d().mo۱۷۴۷۷b(sink, byteCount);
                if (read > 0) {
                    this.f۱۵۹۲۹e += read;
                }
                return read;
            } catch (IOException e2) {
                m۱۶۷۹۶a(e2);
                throw e2;
            }
        }

        @Override // p۳۰۵f.AbstractCh, p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            m۱۶۷۹۶a(null);
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۷۹۶a(IOException e2) {
            if (this.f۱۵۹۲۸d) {
                return;
            }
            this.f۱۵۹۲۸d = true;
            Cf cf = Cf.this;
            cf.f۱۵۹۲۵b.m۱۶۶۶۶a(false, cf, this.f۱۵۹۲۹e, e2);
        }
    }
}
