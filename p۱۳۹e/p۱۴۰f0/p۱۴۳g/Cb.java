package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

import java.net.ProtocolException;
import p۱۳۹e.AbstractCt;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۲f.Cg;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCg;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.Cl;

/* renamed from: e.f0.g.b  reason: invalid class name */
public final class Cb implements AbstractCt {

    /* renamed from: a  reason: contains not printable characters */
    private final boolean f۱۵۸۲۰a;

    public Cb(boolean forWebSocket) {
        this.f۱۵۸۲۰a = forWebSocket;
    }

    @Override // p۱۳۹e.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۷۵۳a(AbstractCt.AbstractCa chain) {
        Ca0 response;
        Cg realChain = (Cg) chain;
        AbstractCc httpCodec = realChain.m۱۸۷۹۲h();
        Cg streamAllocation = realChain.m۱۸۷۹۳i();
        Cc connection = (Cc) realChain.m۱۸۷۹۰f();
        Cy request = realChain.m۱۸۷۸۶b();
        long sentRequestMillis = System.currentTimeMillis();
        realChain.m۱۸۷۹۱g().m۱۹۱۸۶d(realChain.m۱۸۷۸۹e());
        httpCodec.m۱۸۷۵۹a(request);
        realChain.m۱۸۷۹۱g().m۱۹۱۷۵a(realChain.m۱۸۷۸۹e(), request);
        Ca0.Ca responseBuilder = null;
        if (Cf.m۱۸۷۷۹b(request.m۱۹۳۲۷e()) && request.m۱۹۳۲۱a() != null) {
            if ("100-continue".equalsIgnoreCase(request.m۱۹۳۲۲a("Expect"))) {
                httpCodec.m۱۸۷۶۰b();
                realChain.m۱۸۷۹۱g().m۱۹۱۸۸f(realChain.m۱۸۷۸۹e());
                responseBuilder = httpCodec.m۱۸۷۵۵a(true);
            }
            if (responseBuilder == null) {
                realChain.m۱۸۷۹۱g().m۱۹۱۸۵c(realChain.m۱۸۷۸۹e());
                Ca requestBodyOut = new Ca(httpCodec.m۱۸۷۵۷a(request, request.m۱۹۳۲۱a().m۱۹۳۴۰a()));
                AbstractCd bufferedRequestBody = Cl.m۱۹۴۷۹a(requestBodyOut);
                request.m۱۹۳۲۱a().m۱۹۳۴۱a(bufferedRequestBody);
                bufferedRequestBody.close();
                realChain.m۱۸۷۹۱g().m۱۹۱۷۱a(realChain.m۱۸۷۸۹e(), requestBodyOut.f۱۵۸۲۱d);
            } else if (!connection.m۱۸۷۱۴b()) {
                streamAllocation.m۱۸۷۴۸d();
            }
        }
        httpCodec.m۱۸۷۵۸a();
        if (responseBuilder == null) {
            realChain.m۱۸۷۹۱g().m۱۹۱۸۸f(realChain.m۱۸۷۸۹e());
            responseBuilder = httpCodec.m۱۸۷۵۵a(false);
        }
        responseBuilder.m۱۸۵۲۸a(request);
        responseBuilder.m۱۸۵۲۵a(streamAllocation.m۱۸۷۴۶b().m۱۸۷۰۷a());
        responseBuilder.m۱۸۵۳۲b(sentRequestMillis);
        responseBuilder.m۱۸۵۲۲a(System.currentTimeMillis());
        Ca0 response2 = responseBuilder.m۱۸۵۳۱a();
        int code = response2.m۱۸۵۰۷o();
        if (code == 100) {
            Ca0.Ca responseBuilder2 = httpCodec.m۱۸۷۵۵a(false);
            responseBuilder2.m۱۸۵۲۸a(request);
            responseBuilder2.m۱۸۵۲۵a(streamAllocation.m۱۸۷۴۶b().m۱۸۷۰۷a());
            responseBuilder2.m۱۸۵۳۲b(sentRequestMillis);
            responseBuilder2.m۱۸۵۲۲a(System.currentTimeMillis());
            response2 = responseBuilder2.m۱۸۵۳۱a();
            code = response2.m۱۸۵۰۷o();
        }
        realChain.m۱۸۷۹۱g().m۱۹۱۷۲a(realChain.m۱۸۷۸۹e(), response2);
        if (!this.f۱۵۸۲۰a || code != 101) {
            Ca0.Ca u = response2.m۱۸۵۱۳u();
            u.m۱۸۵۲۴a(httpCodec.m۱۸۷۵۶a(response2));
            response = u.m۱۸۵۳۱a();
        } else {
            Ca0.Ca u2 = response2.m۱۸۵۱۳u();
            u2.m۱۸۵۲۴a(p۱۳۹e.p۱۴۰f0.Cc.f۱۵۷۰۵c);
            response = u2.m۱۸۵۳۱a();
        }
        if ("close".equalsIgnoreCase(response.m۱۸۵۱۷y().m۱۹۳۲۲a("Connection")) || "close".equalsIgnoreCase(response.m۱۸۵۰۳b("Connection"))) {
            streamAllocation.m۱۸۷۴۸d();
        }
        if ((code != 204 && code != 205) || response.m۱۸۵۰۴l().m۱۸۵۳۹l() <= 0) {
            return response;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + response.m۱۸۵۰۴l().m۱۸۵۳۹l());
    }

    /* renamed from: e.f0.g.b$a  reason: invalid class name */
    static final class Ca extends AbstractCg {

        /* renamed from: d  reason: contains not printable characters */
        long f۱۵۸۲۱d;

        Ca(AbstractCr delegate) {
            super(delegate);
        }

        @Override // p۱۴۹f.AbstractCr, p۱۴۹f.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۷۵۴a(p۱۴۹f.Cc source, long byteCount) {
            super.m۱۹۴۵۵a(source, byteCount);
            this.f۱۵۸۲۱d += byteCount;
        }
    }
}
