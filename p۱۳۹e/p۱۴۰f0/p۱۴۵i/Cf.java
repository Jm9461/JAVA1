package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;
import p۱۳۹e.AbstractCb0;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cr;
import p۱۳۹e.Cv;
import p۱۳۹e.Cy;
import p۱۳۹e.EnumCw;
import p۱۳۹e.p۱۴۰f0.AbstractCa;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ce;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ch;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ci;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Ck;
import p۱۴۹f.AbstractCh;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;

/* renamed from: e.f0.i.f  reason: invalid class name */
public final class Cf implements AbstractCc {

    /* renamed from: e  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۱۴e = p۱۴۹f.Cf.m۱۹۴۳۸d("connection");

    /* renamed from: f  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۱۵f = p۱۴۹f.Cf.m۱۹۴۳۸d("host");

    /* renamed from: g  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۱۶g = p۱۴۹f.Cf.m۱۹۴۳۸d("keep-alive");

    /* renamed from: h  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۱۷h = p۱۴۹f.Cf.m۱۹۴۳۸d("proxy-connection");

    /* renamed from: i  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۱۸i = p۱۴۹f.Cf.m۱۹۴۳۸d("transfer-encoding");

    /* renamed from: j  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۱۹j = p۱۴۹f.Cf.m۱۹۴۳۸d("te");

    /* renamed from: k  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۲۰k = p۱۴۹f.Cf.m۱۹۴۳۸d("encoding");

    /* renamed from: l  reason: contains not printable characters */
    private static final p۱۴۹f.Cf f۱۵۹۲۱l = p۱۴۹f.Cf.m۱۹۴۳۸d("upgrade");

    /* renamed from: m  reason: contains not printable characters */
    private static final List<p۱۴۹f.Cf> f۱۵۹۲۲m = Cc.m۱۸۶۱۸a(f۱۵۹۱۴e, f۱۵۹۱۵f, f۱۵۹۱۶g, f۱۵۹۱۷h, f۱۵۹۱۹j, f۱۵۹۱۸i, f۱۵۹۲۰k, f۱۵۹۲۱l, Cc.f۱۵۸۸۴f, Cc.f۱۵۸۸۵g, Cc.f۱۵۸۸۶h, Cc.f۱۵۸۸۷i);

    /* renamed from: n  reason: contains not printable characters */
    private static final List<p۱۴۹f.Cf> f۱۵۹۲۳n = Cc.m۱۸۶۱۸a(f۱۵۹۱۴e, f۱۵۹۱۵f, f۱۵۹۱۶g, f۱۵۹۱۷h, f۱۵۹۱۹j, f۱۵۹۱۸i, f۱۵۹۲۰k, f۱۵۹۲۱l);

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCt.AbstractCa f۱۵۹۲۴a;

    /* renamed from: b  reason: contains not printable characters */
    final Cg f۱۵۹۲۵b;

    /* renamed from: c  reason: contains not printable characters */
    private final Cg f۱۵۹۲۶c;

    /* renamed from: d  reason: contains not printable characters */
    private Ci f۱۵۹۲۷d;

    public Cf(Cv client, AbstractCt.AbstractCa chain, Cg streamAllocation, Cg connection) {
        this.f۱۵۹۲۴a = chain;
        this.f۱۵۹۲۵b = streamAllocation;
        this.f۱۵۹۲۶c = connection;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCr m۱۸۸۷۱a(Cy request, long contentLength) {
        return this.f۱۵۹۲۷d.m۱۸۹۷۰d();
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۷۳a(Cy request) {
        if (this.f۱۵۹۲۷d == null) {
            this.f۱۵۹۲۷d = this.f۱۵۹۲۶c.m۱۸۸۸۴a((List<Cc>) m۱۸۸۶۸b(request), request.m۱۹۳۲۱a() != null);
            this.f۱۵۹۲۷d.m۱۸۹۷۴h().m۱۹۵۵۸a((long) this.f۱۵۹۲۴a.m۱۹۲۶۷d(), TimeUnit.MILLISECONDS);
            this.f۱۵۹۲۷d.m۱۸۹۷۸l().m۱۹۵۵۸a((long) this.f۱۵۹۲۴a.m۱۹۲۶۳a(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۸۷۴b() {
        this.f۱۵۹۲۶c.flush();
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۷۲a() {
        this.f۱۵۹۲۷d.m۱۸۹۷۰d().close();
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public Ca0.Ca m۱۸۸۶۹a(boolean expectContinue) {
        Ca0.Ca responseBuilder = m۱۸۸۶۷a((List<Cc>) this.f۱۵۹۲۷d.m۱۸۹۷۶j());
        if (!expectContinue || AbstractCa.f۱۵۷۰۱a.m۱۸۵۹۶a(responseBuilder) != 100) {
            return responseBuilder;
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static List<Cc> m۱۸۸۶۸b(Cy request) {
        Cr headers = request.m۱۹۳۲۵c();
        List<Header> result = new ArrayList<>(headers.m۱۹۲۰۲b() + 4);
        result.add(new Cc(Cc.f۱۵۸۸۴f, request.m۱۹۳۲۷e()));
        result.add(new Cc(Cc.f۱۵۸۸۵g, Ci.m۱۸۷۹۶a(request.m۱۹۳۲۹g())));
        String host = request.m۱۹۳۲۲a("Host");
        if (host != null) {
            result.add(new Cc(Cc.f۱۵۸۸۷i, host));
        }
        result.add(new Cc(Cc.f۱۵۸۸۶h, request.m۱۹۳۲۹g().m۱۹۲۴۰m()));
        int size = headers.m۱۹۲۰۲b();
        for (int i = 0; i < size; i++) {
            p۱۴۹f.Cf name = p۱۴۹f.Cf.m۱۹۴۳۸d(headers.m۱۹۲۰۰a(i).toLowerCase(Locale.US));
            if (!f۱۵۹۲۲m.contains(name)) {
                result.add(new Cc(name, headers.m۱۹۲۰۳b(i)));
            }
        }
        return result;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ca0.Ca m۱۸۸۶۷a(List<Cc> list) {
        Ck statusLine = null;
        Cr.Ca headersBuilder = new Cr.Ca();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Cc header = list.get(i);
            if (header != null) {
                p۱۴۹f.Cf name = header.f۱۵۸۸۸a;
                String value = header.f۱۵۸۸۹b.m۱۹۴۵۴i();
                if (name.equals(Cc.f۱۵۸۸۳e)) {
                    statusLine = Ck.m۱۸۸۰۸a("HTTP/1.1 " + value);
                } else if (!f۱۵۹۲۳n.contains(name)) {
                    AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۲a(headersBuilder, name.m۱۹۴۵۴i(), value);
                }
            } else if (statusLine != null && statusLine.f۱۵۸۴۴b == 100) {
                statusLine = null;
                headersBuilder = new Cr.Ca();
            }
        }
        if (statusLine != null) {
            Ca0.Ca aVar = new Ca0.Ca();
            aVar.m۱۸۵۲۷a(EnumCw.HTTP_2);
            aVar.m۱۸۵۲۱a(statusLine.f۱۵۸۴۴b);
            aVar.m۱۸۵۲۹a(statusLine.f۱۵۸۴۵c);
            aVar.m۱۸۵۲۶a(headersBuilder.m۱۹۲۰۸a());
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۳g.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb0 m۱۸۸۷۰a(Ca0 response) {
        Cg gVar = this.f۱۵۹۲۵b;
        gVar.f۱۵۸۰۹f.m۱۹۱۸۷e(gVar.f۱۵۸۰۸e);
        return new Ch(response.m۱۸۵۰۳b("Content-Type"), Ce.m۱۸۷۶۵a(response), Cl.m۱۹۴۸۰a(new Ca(this.f۱۵۹۲۷d.m۱۸۹۷۱e())));
    }

    /* renamed from: e.f0.i.f$a  reason: invalid class name */
    class Ca extends AbstractCh {

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۵۹۲۸d = false;

        /* renamed from: e  reason: contains not printable characters */
        long f۱۵۹۲۹e = 0;

        Ca(AbstractCs delegate) {
            super(delegate);
        }

        @Override // p۱۴۹f.AbstractCh, p۱۴۹f.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public long m۱۸۸۷۶b(p۱۴۹f.Cc sink, long byteCount) {
            try {
                long read = m۱۹۴۵۹d().m۱۹۵۵۴b(sink, byteCount);
                if (read > 0) {
                    this.f۱۵۹۲۹e += read;
                }
                return read;
            } catch (IOException e) {
                m۱۸۸۷۵a(e);
                throw e;
            }
        }

        @Override // p۱۴۹f.AbstractCh, java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
        public void close() {
            super.close();
            m۱۸۸۷۵a(null);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۸۷۵a(IOException e) {
            if (!this.f۱۵۹۲۸d) {
                this.f۱۵۹۲۸d = true;
                Cf fVar = Cf.this;
                fVar.f۱۵۹۲۵b.m۱۸۷۴۵a(false, fVar, this.f۱۵۹۲۹e, e);
            }
        }
    }
}
